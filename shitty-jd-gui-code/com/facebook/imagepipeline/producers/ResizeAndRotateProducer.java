package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.util.TriState;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class ResizeAndRotateProducer
  implements Producer<EncodedImage>
{
  @VisibleForTesting
  static final int DEFAULT_JPEG_QUALITY = 85;
  private static final String FRACTION_KEY = "Fraction";
  @VisibleForTesting
  static final int MAX_JPEG_SCALE_NUMERATOR = 8;
  @VisibleForTesting
  static final int MIN_TRANSFORM_INTERVAL_MS = 100;
  private static final String ORIGINAL_SIZE_KEY = "Original size";
  private static final String PRODUCER_NAME = "ResizeAndRotateProducer";
  private static final String REQUESTED_SIZE_KEY = "Requested size";
  private static final float ROUNDUP_FRACTION = 0.6666667F;
  private final Executor mExecutor;
  private final Producer<EncodedImage> mInputProducer;
  private final PooledByteBufferFactory mPooledByteBufferFactory;
  
  public ResizeAndRotateProducer(Executor paramExecutor, PooledByteBufferFactory paramPooledByteBufferFactory, Producer<EncodedImage> paramProducer)
  {
    this.mExecutor = ((Executor)Preconditions.checkNotNull(paramExecutor));
    this.mPooledByteBufferFactory = ((PooledByteBufferFactory)Preconditions.checkNotNull(paramPooledByteBufferFactory));
    this.mInputProducer = ((Producer)Preconditions.checkNotNull(paramProducer));
  }
  
  @VisibleForTesting
  static float determineResizeRatio(ResizeOptions paramResizeOptions, int paramInt1, int paramInt2)
  {
    float f2;
    if (paramResizeOptions == null) {
      f2 = 1.0F;
    }
    float f1;
    do
    {
      return f2;
      f2 = Math.max(paramResizeOptions.width / paramInt1, paramResizeOptions.height / paramInt2);
      f1 = f2;
      if (paramInt1 * f2 > 2048.0F) {
        f1 = 2048.0F / paramInt1;
      }
      f2 = f1;
    } while (paramInt2 * f1 <= 2048.0F);
    return 2048.0F / paramInt2;
  }
  
  private static int getRotationAngle(ImageRequest paramImageRequest, EncodedImage paramEncodedImage)
  {
    boolean bool = false;
    if (!paramImageRequest.getAutoRotateEnabled()) {
      return 0;
    }
    int i = paramEncodedImage.getRotationAngle();
    if ((i == 0) || (i == 90) || (i == 180) || (i == 270)) {
      bool = true;
    }
    Preconditions.checkArgument(bool);
    return i;
  }
  
  private static int getScaleNumerator(ImageRequest paramImageRequest, EncodedImage paramEncodedImage)
  {
    ResizeOptions localResizeOptions = paramImageRequest.getResizeOptions();
    int i;
    if (localResizeOptions == null) {
      i = 8;
    }
    int j;
    label46:
    label80:
    label88:
    label96:
    do
    {
      return i;
      i = getRotationAngle(paramImageRequest, paramEncodedImage);
      if ((i == 90) || (i == 270))
      {
        j = 1;
        if (j == 0) {
          break label80;
        }
        i = paramEncodedImage.getHeight();
        if (j == 0) {
          break label88;
        }
      }
      for (j = paramEncodedImage.getWidth();; j = paramEncodedImage.getHeight())
      {
        j = roundNumerator(determineResizeRatio(localResizeOptions, i, j));
        if (j <= 8) {
          break label96;
        }
        return 8;
        j = 0;
        break;
        i = paramEncodedImage.getWidth();
        break label46;
      }
      i = j;
    } while (j >= 1);
    return 1;
  }
  
  @VisibleForTesting
  static int roundNumerator(float paramFloat)
  {
    return (int)(0.6666667F + 8.0F * paramFloat);
  }
  
  private static boolean shouldResize(int paramInt)
  {
    return paramInt < 8;
  }
  
  private static TriState shouldTransform(ImageRequest paramImageRequest, EncodedImage paramEncodedImage)
  {
    if ((paramEncodedImage == null) || (paramEncodedImage.getImageFormat() == ImageFormat.UNKNOWN)) {
      return TriState.UNSET;
    }
    if (paramEncodedImage.getImageFormat() != ImageFormat.JPEG) {
      return TriState.NO;
    }
    if ((getRotationAngle(paramImageRequest, paramEncodedImage) != 0) || (shouldResize(getScaleNumerator(paramImageRequest, paramEncodedImage)))) {}
    for (boolean bool = true;; bool = false) {
      return TriState.valueOf(bool);
    }
  }
  
  public void produceResults(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    this.mInputProducer.produceResults(new TransformingConsumer(paramConsumer, paramProducerContext), paramProducerContext);
  }
  
  private class TransformingConsumer
    extends DelegatingConsumer<EncodedImage, EncodedImage>
  {
    private boolean mIsCancelled = false;
    private final JobScheduler mJobScheduler;
    private final ProducerContext mProducerContext;
    
    public TransformingConsumer(final ProducerContext paramProducerContext)
    {
      super();
      this.mProducerContext = local1;
      JobScheduler.JobRunnable local1 = new JobScheduler.JobRunnable()
      {
        public void run(EncodedImage paramAnonymousEncodedImage, boolean paramAnonymousBoolean)
        {
          ResizeAndRotateProducer.TransformingConsumer.this.doTransform(paramAnonymousEncodedImage, paramAnonymousBoolean);
        }
      };
      this.mJobScheduler = new JobScheduler(ResizeAndRotateProducer.this.mExecutor, local1, 100);
      this.mProducerContext.addCallbacks(new BaseProducerContextCallbacks()
      {
        public void onCancellationRequested()
        {
          ResizeAndRotateProducer.TransformingConsumer.this.mJobScheduler.clearJob();
          ResizeAndRotateProducer.TransformingConsumer.access$402(ResizeAndRotateProducer.TransformingConsumer.this, true);
          paramProducerContext.onCancellation();
        }
        
        public void onIsIntermediateResultExpectedChanged()
        {
          if (ResizeAndRotateProducer.TransformingConsumer.this.mProducerContext.isIntermediateResultExpected()) {
            ResizeAndRotateProducer.TransformingConsumer.this.mJobScheduler.scheduleJob();
          }
        }
      });
    }
    
    /* Error */
    private void doTransform(EncodedImage paramEncodedImage, boolean paramBoolean)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 5
      //   3: aconst_null
      //   4: astore 7
      //   6: aconst_null
      //   7: astore 8
      //   9: aload_0
      //   10: getfield 31	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
      //   13: invokeinterface 75 1 0
      //   18: aload_0
      //   19: getfield 31	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
      //   22: invokeinterface 79 1 0
      //   27: ldc 81
      //   29: invokeinterface 87 3 0
      //   34: aload_0
      //   35: getfield 31	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
      //   38: invokeinterface 91 1 0
      //   43: astore 10
      //   45: aload_0
      //   46: getfield 24	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:this$0	Lcom/facebook/imagepipeline/producers/ResizeAndRotateProducer;
      //   49: invokestatic 95	com/facebook/imagepipeline/producers/ResizeAndRotateProducer:access$600	(Lcom/facebook/imagepipeline/producers/ResizeAndRotateProducer;)Lcom/facebook/imagepipeline/memory/PooledByteBufferFactory;
      //   52: invokeinterface 101 1 0
      //   57: astore 9
      //   59: aload 7
      //   61: astore 4
      //   63: aload 10
      //   65: aload_1
      //   66: invokestatic 105	com/facebook/imagepipeline/producers/ResizeAndRotateProducer:access$700	(Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/image/EncodedImage;)I
      //   69: istore_3
      //   70: aload 7
      //   72: astore 4
      //   74: aload_0
      //   75: aload_1
      //   76: aload 10
      //   78: iload_3
      //   79: invokespecial 109	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:getExtraMap	(Lcom/facebook/imagepipeline/image/EncodedImage;Lcom/facebook/imagepipeline/request/ImageRequest;I)Ljava/util/Map;
      //   82: astore 6
      //   84: aload 8
      //   86: astore 5
      //   88: aload 7
      //   90: astore 4
      //   92: aload_1
      //   93: invokevirtual 115	com/facebook/imagepipeline/image/EncodedImage:getInputStream	()Ljava/io/InputStream;
      //   96: astore 7
      //   98: aload 7
      //   100: astore 5
      //   102: aload 7
      //   104: astore 4
      //   106: aload 7
      //   108: aload 9
      //   110: aload 10
      //   112: aload_1
      //   113: invokestatic 118	com/facebook/imagepipeline/producers/ResizeAndRotateProducer:access$800	(Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/image/EncodedImage;)I
      //   116: iload_3
      //   117: bipush 85
      //   119: invokestatic 124	com/facebook/imagepipeline/nativecode/JpegTranscoder:transcodeJpeg	(Ljava/io/InputStream;Ljava/io/OutputStream;III)V
      //   122: aload 7
      //   124: astore 5
      //   126: aload 7
      //   128: astore 4
      //   130: aload 9
      //   132: invokevirtual 130	com/facebook/imagepipeline/memory/PooledByteBufferOutputStream:toByteBuffer	()Lcom/facebook/imagepipeline/memory/PooledByteBuffer;
      //   135: invokestatic 136	com/facebook/common/references/CloseableReference:of	(Ljava/io/Closeable;)Lcom/facebook/common/references/CloseableReference;
      //   138: astore_1
      //   139: new 111	com/facebook/imagepipeline/image/EncodedImage
      //   142: dup
      //   143: aload_1
      //   144: invokespecial 139	com/facebook/imagepipeline/image/EncodedImage:<init>	(Lcom/facebook/common/references/CloseableReference;)V
      //   147: astore 4
      //   149: aload 4
      //   151: getstatic 145	com/facebook/imageformat/ImageFormat:JPEG	Lcom/facebook/imageformat/ImageFormat;
      //   154: invokevirtual 149	com/facebook/imagepipeline/image/EncodedImage:setImageFormat	(Lcom/facebook/imageformat/ImageFormat;)V
      //   157: aload 4
      //   159: invokevirtual 153	com/facebook/imagepipeline/image/EncodedImage:parseMetaData	()V
      //   162: aload_0
      //   163: getfield 31	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
      //   166: invokeinterface 75 1 0
      //   171: aload_0
      //   172: getfield 31	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
      //   175: invokeinterface 79 1 0
      //   180: ldc 81
      //   182: aload 6
      //   184: invokeinterface 157 4 0
      //   189: aload_0
      //   190: invokevirtual 161	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:getConsumer	()Lcom/facebook/imagepipeline/producers/Consumer;
      //   193: aload 4
      //   195: iload_2
      //   196: invokeinterface 167 3 0
      //   201: aload 4
      //   203: invokestatic 171	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
      //   206: aload 7
      //   208: astore 5
      //   210: aload 7
      //   212: astore 4
      //   214: aload_1
      //   215: invokestatic 173	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
      //   218: aload 7
      //   220: invokestatic 179	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
      //   223: aload 9
      //   225: invokevirtual 182	com/facebook/imagepipeline/memory/PooledByteBufferOutputStream:close	()V
      //   228: return
      //   229: astore 5
      //   231: aload 4
      //   233: invokestatic 171	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
      //   236: aload 5
      //   238: athrow
      //   239: astore 8
      //   241: aload 7
      //   243: astore 5
      //   245: aload 7
      //   247: astore 4
      //   249: aload_1
      //   250: invokestatic 173	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
      //   253: aload 7
      //   255: astore 5
      //   257: aload 7
      //   259: astore 4
      //   261: aload 8
      //   263: athrow
      //   264: astore_1
      //   265: aload 5
      //   267: astore 4
      //   269: aload_0
      //   270: getfield 31	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
      //   273: invokeinterface 75 1 0
      //   278: aload_0
      //   279: getfield 31	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
      //   282: invokeinterface 79 1 0
      //   287: ldc 81
      //   289: aload_1
      //   290: aload 6
      //   292: invokeinterface 186 5 0
      //   297: aload 5
      //   299: astore 4
      //   301: aload_0
      //   302: invokevirtual 161	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:getConsumer	()Lcom/facebook/imagepipeline/producers/Consumer;
      //   305: aload_1
      //   306: invokeinterface 190 2 0
      //   311: aload 5
      //   313: invokestatic 179	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
      //   316: aload 9
      //   318: invokevirtual 182	com/facebook/imagepipeline/memory/PooledByteBufferOutputStream:close	()V
      //   321: return
      //   322: astore_1
      //   323: aload 4
      //   325: invokestatic 179	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
      //   328: aload 9
      //   330: invokevirtual 182	com/facebook/imagepipeline/memory/PooledByteBufferOutputStream:close	()V
      //   333: aload_1
      //   334: athrow
      //   335: astore_1
      //   336: aconst_null
      //   337: astore 6
      //   339: goto -74 -> 265
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	342	0	this	TransformingConsumer
      //   0	342	1	paramEncodedImage	EncodedImage
      //   0	342	2	paramBoolean	boolean
      //   69	48	3	i	int
      //   61	263	4	localObject1	Object
      //   1	208	5	localObject2	Object
      //   229	8	5	localObject3	Object
      //   243	69	5	localObject4	Object
      //   82	256	6	localMap	Map
      //   4	254	7	localInputStream	java.io.InputStream
      //   7	78	8	localObject5	Object
      //   239	23	8	localObject6	Object
      //   57	272	9	localPooledByteBufferOutputStream	com.facebook.imagepipeline.memory.PooledByteBufferOutputStream
      //   43	68	10	localImageRequest	ImageRequest
      // Exception table:
      //   from	to	target	type
      //   157	201	229	finally
      //   139	157	239	finally
      //   201	206	239	finally
      //   231	239	239	finally
      //   92	98	264	java/lang/Exception
      //   106	122	264	java/lang/Exception
      //   130	139	264	java/lang/Exception
      //   214	218	264	java/lang/Exception
      //   249	253	264	java/lang/Exception
      //   261	264	264	java/lang/Exception
      //   63	70	322	finally
      //   74	84	322	finally
      //   92	98	322	finally
      //   106	122	322	finally
      //   130	139	322	finally
      //   214	218	322	finally
      //   249	253	322	finally
      //   261	264	322	finally
      //   269	297	322	finally
      //   301	311	322	finally
      //   63	70	335	java/lang/Exception
      //   74	84	335	java/lang/Exception
    }
    
    private Map<String, String> getExtraMap(EncodedImage paramEncodedImage, ImageRequest paramImageRequest, int paramInt)
    {
      if (!this.mProducerContext.getListener().requiresExtraMap(this.mProducerContext.getId())) {
        return null;
      }
      String str = paramEncodedImage.getWidth() + "x" + paramEncodedImage.getHeight();
      if (paramImageRequest.getResizeOptions() != null)
      {
        paramEncodedImage = paramImageRequest.getResizeOptions().width + "x" + paramImageRequest.getResizeOptions().height;
        if (paramInt <= 0) {
          break label159;
        }
      }
      label159:
      for (paramImageRequest = paramInt + "/8";; paramImageRequest = "")
      {
        return ImmutableMap.of("Original size", str, "Requested size", paramEncodedImage, "Fraction", paramImageRequest, "queueTime", String.valueOf(this.mJobScheduler.getQueuedTime()));
        paramEncodedImage = "Unspecified";
        break;
      }
    }
    
    protected void onNewResultImpl(@Nullable EncodedImage paramEncodedImage, boolean paramBoolean)
    {
      if (this.mIsCancelled) {}
      do
      {
        TriState localTriState;
        do
        {
          do
          {
            return;
            if (paramEncodedImage != null) {
              break;
            }
          } while (!paramBoolean);
          getConsumer().onNewResult(null, true);
          return;
          localTriState = ResizeAndRotateProducer.shouldTransform(this.mProducerContext.getImageRequest(), paramEncodedImage);
        } while ((!paramBoolean) && (localTriState == TriState.UNSET));
        if (localTriState != TriState.YES)
        {
          getConsumer().onNewResult(paramEncodedImage, paramBoolean);
          return;
        }
      } while ((!this.mJobScheduler.updateJob(paramEncodedImage, paramBoolean)) || ((!paramBoolean) && (!this.mProducerContext.isIntermediateResultExpected())));
      this.mJobScheduler.scheduleJob();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/producers/ResizeAndRotateProducer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */