package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.decoder.ProgressiveJpegParser;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.memory.ByteArrayPool;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class DecodeProducer
  implements Producer<CloseableReference<CloseableImage>>
{
  private static final String BITMAP_SIZE_KEY = "bitmapSize";
  private static final String HAS_GOOD_QUALITY_KEY = "hasGoodQuality";
  private static final String IS_FINAL_KEY = "isFinal";
  public static final String PRODUCER_NAME = "DecodeProducer";
  private final ByteArrayPool mByteArrayPool;
  private final boolean mDownsampleEnabled;
  private final boolean mDownsampleEnabledForNetwork;
  private final Executor mExecutor;
  private final ImageDecoder mImageDecoder;
  private final Producer<EncodedImage> mInputProducer;
  private final ProgressiveJpegConfig mProgressiveJpegConfig;
  
  public DecodeProducer(ByteArrayPool paramByteArrayPool, Executor paramExecutor, ImageDecoder paramImageDecoder, ProgressiveJpegConfig paramProgressiveJpegConfig, boolean paramBoolean1, boolean paramBoolean2, Producer<EncodedImage> paramProducer)
  {
    this.mByteArrayPool = ((ByteArrayPool)Preconditions.checkNotNull(paramByteArrayPool));
    this.mExecutor = ((Executor)Preconditions.checkNotNull(paramExecutor));
    this.mImageDecoder = ((ImageDecoder)Preconditions.checkNotNull(paramImageDecoder));
    this.mProgressiveJpegConfig = ((ProgressiveJpegConfig)Preconditions.checkNotNull(paramProgressiveJpegConfig));
    this.mDownsampleEnabled = paramBoolean1;
    this.mDownsampleEnabledForNetwork = paramBoolean2;
    this.mInputProducer = ((Producer)Preconditions.checkNotNull(paramProducer));
  }
  
  public void produceResults(Consumer<CloseableReference<CloseableImage>> paramConsumer, ProducerContext paramProducerContext)
  {
    if (!UriUtil.isNetworkUri(paramProducerContext.getImageRequest().getSourceUri())) {}
    for (paramConsumer = new LocalImagesProgressiveDecoder(paramConsumer, paramProducerContext);; paramConsumer = new NetworkImagesProgressiveDecoder(paramConsumer, paramProducerContext, new ProgressiveJpegParser(this.mByteArrayPool), this.mProgressiveJpegConfig))
    {
      this.mInputProducer.produceResults(paramConsumer, paramProducerContext);
      return;
    }
  }
  
  private class LocalImagesProgressiveDecoder
    extends DecodeProducer.ProgressiveDecoder
  {
    public LocalImagesProgressiveDecoder(ProducerContext paramProducerContext)
    {
      super(paramProducerContext, localProducerContext);
    }
    
    protected int getIntermediateImageEndOffset(EncodedImage paramEncodedImage)
    {
      return paramEncodedImage.getSize();
    }
    
    protected QualityInfo getQualityInfo()
    {
      return ImmutableQualityInfo.of(0, false, false);
    }
    
    protected boolean updateDecodeJob(EncodedImage paramEncodedImage, boolean paramBoolean)
    {
      if (!paramBoolean) {
        paramBoolean = false;
      }
      for (;;)
      {
        return paramBoolean;
        try
        {
          paramBoolean = super.updateDecodeJob(paramEncodedImage, paramBoolean);
        }
        finally {}
      }
    }
  }
  
  private class NetworkImagesProgressiveDecoder
    extends DecodeProducer.ProgressiveDecoder
  {
    private int mLastScheduledScanNumber;
    private final ProgressiveJpegConfig mProgressiveJpegConfig;
    private final ProgressiveJpegParser mProgressiveJpegParser;
    
    public NetworkImagesProgressiveDecoder(ProducerContext paramProducerContext, ProgressiveJpegParser paramProgressiveJpegParser, ProgressiveJpegConfig paramProgressiveJpegConfig)
    {
      super(paramProducerContext, paramProgressiveJpegParser);
      this.mProgressiveJpegParser = ((ProgressiveJpegParser)Preconditions.checkNotNull(paramProgressiveJpegConfig));
      Object localObject;
      this.mProgressiveJpegConfig = ((ProgressiveJpegConfig)Preconditions.checkNotNull(localObject));
      this.mLastScheduledScanNumber = 0;
    }
    
    protected int getIntermediateImageEndOffset(EncodedImage paramEncodedImage)
    {
      return this.mProgressiveJpegParser.getBestScanEndOffset();
    }
    
    protected QualityInfo getQualityInfo()
    {
      return this.mProgressiveJpegConfig.getQualityInfo(this.mProgressiveJpegParser.getBestScanNumber());
    }
    
    /* Error */
    protected boolean updateDecodeJob(EncodedImage paramEncodedImage, boolean paramBoolean)
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore 4
      //   3: aload_0
      //   4: monitorenter
      //   5: aload_0
      //   6: aload_1
      //   7: iload_2
      //   8: invokespecial 59	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:updateDecodeJob	(Lcom/facebook/imagepipeline/image/EncodedImage;Z)Z
      //   11: istore 5
      //   13: iload_2
      //   14: ifne +74 -> 88
      //   17: aload_1
      //   18: invokestatic 65	com/facebook/imagepipeline/image/EncodedImage:isValid	(Lcom/facebook/imagepipeline/image/EncodedImage;)Z
      //   21: ifeq +67 -> 88
      //   24: aload_0
      //   25: getfield 32	com/facebook/imagepipeline/producers/DecodeProducer$NetworkImagesProgressiveDecoder:mProgressiveJpegParser	Lcom/facebook/imagepipeline/decoder/ProgressiveJpegParser;
      //   28: aload_1
      //   29: invokevirtual 68	com/facebook/imagepipeline/decoder/ProgressiveJpegParser:parseMoreData	(Lcom/facebook/imagepipeline/image/EncodedImage;)Z
      //   32: istore_2
      //   33: iload_2
      //   34: ifne +10 -> 44
      //   37: iload 4
      //   39: istore_2
      //   40: aload_0
      //   41: monitorexit
      //   42: iload_2
      //   43: ireturn
      //   44: aload_0
      //   45: getfield 32	com/facebook/imagepipeline/producers/DecodeProducer$NetworkImagesProgressiveDecoder:mProgressiveJpegParser	Lcom/facebook/imagepipeline/decoder/ProgressiveJpegParser;
      //   48: invokevirtual 52	com/facebook/imagepipeline/decoder/ProgressiveJpegParser:getBestScanNumber	()I
      //   51: istore_3
      //   52: iload 4
      //   54: istore_2
      //   55: iload_3
      //   56: aload_0
      //   57: getfield 38	com/facebook/imagepipeline/producers/DecodeProducer$NetworkImagesProgressiveDecoder:mLastScheduledScanNumber	I
      //   60: if_icmple -20 -> 40
      //   63: iload 4
      //   65: istore_2
      //   66: iload_3
      //   67: aload_0
      //   68: getfield 36	com/facebook/imagepipeline/producers/DecodeProducer$NetworkImagesProgressiveDecoder:mProgressiveJpegConfig	Lcom/facebook/imagepipeline/decoder/ProgressiveJpegConfig;
      //   71: aload_0
      //   72: getfield 38	com/facebook/imagepipeline/producers/DecodeProducer$NetworkImagesProgressiveDecoder:mLastScheduledScanNumber	I
      //   75: invokeinterface 72 2 0
      //   80: if_icmplt -40 -> 40
      //   83: aload_0
      //   84: iload_3
      //   85: putfield 38	com/facebook/imagepipeline/producers/DecodeProducer$NetworkImagesProgressiveDecoder:mLastScheduledScanNumber	I
      //   88: iload 5
      //   90: istore_2
      //   91: goto -51 -> 40
      //   94: astore_1
      //   95: aload_0
      //   96: monitorexit
      //   97: aload_1
      //   98: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	99	0	this	NetworkImagesProgressiveDecoder
      //   0	99	1	paramEncodedImage	EncodedImage
      //   0	99	2	paramBoolean	boolean
      //   51	34	3	i	int
      //   1	63	4	bool1	boolean
      //   11	78	5	bool2	boolean
      // Exception table:
      //   from	to	target	type
      //   5	13	94	finally
      //   17	33	94	finally
      //   44	52	94	finally
      //   55	63	94	finally
      //   66	88	94	finally
    }
  }
  
  private abstract class ProgressiveDecoder
    extends DelegatingConsumer<EncodedImage, CloseableReference<CloseableImage>>
  {
    private final ImageDecodeOptions mImageDecodeOptions;
    @GuardedBy("this")
    private boolean mIsFinished;
    private final JobScheduler mJobScheduler;
    private final ProducerContext mProducerContext;
    private final ProducerListener mProducerListener;
    
    public ProgressiveDecoder(ProducerContext paramProducerContext)
    {
      super();
      final ProducerContext localProducerContext;
      this.mProducerContext = localProducerContext;
      this.mProducerListener = localProducerContext.getListener();
      this.mImageDecodeOptions = localProducerContext.getImageRequest().getImageDecodeOptions();
      this.mIsFinished = false;
      paramProducerContext = new JobScheduler.JobRunnable()
      {
        public void run(EncodedImage paramAnonymousEncodedImage, boolean paramAnonymousBoolean)
        {
          if (paramAnonymousEncodedImage != null)
          {
            if (DecodeProducer.this.mDownsampleEnabled)
            {
              ImageRequest localImageRequest = localProducerContext.getImageRequest();
              if ((DecodeProducer.this.mDownsampleEnabledForNetwork) || (!UriUtil.isNetworkUri(localImageRequest.getSourceUri()))) {
                paramAnonymousEncodedImage.setSampleSize(DownsampleUtil.determineSampleSize(localImageRequest, paramAnonymousEncodedImage));
              }
            }
            DecodeProducer.ProgressiveDecoder.this.doDecode(paramAnonymousEncodedImage, paramAnonymousBoolean);
          }
        }
      };
      this.mJobScheduler = new JobScheduler(DecodeProducer.this.mExecutor, paramProducerContext, this.mImageDecodeOptions.minDecodeIntervalMs);
      this.mProducerContext.addCallbacks(new BaseProducerContextCallbacks()
      {
        public void onIsIntermediateResultExpectedChanged()
        {
          if (DecodeProducer.ProgressiveDecoder.this.mProducerContext.isIntermediateResultExpected()) {
            DecodeProducer.ProgressiveDecoder.this.mJobScheduler.scheduleJob();
          }
        }
      });
    }
    
    /* Error */
    private void doDecode(EncodedImage paramEncodedImage, boolean paramBoolean)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 104	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:isFinished	()Z
      //   4: ifne +10 -> 14
      //   7: aload_1
      //   8: invokestatic 110	com/facebook/imagepipeline/image/EncodedImage:isValid	(Lcom/facebook/imagepipeline/image/EncodedImage;)Z
      //   11: ifne +4 -> 15
      //   14: return
      //   15: aload_0
      //   16: getfield 78	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:mJobScheduler	Lcom/facebook/imagepipeline/producers/JobScheduler;
      //   19: invokevirtual 114	com/facebook/imagepipeline/producers/JobScheduler:getQueuedTime	()J
      //   22: lstore 4
      //   24: iload_2
      //   25: ifeq +104 -> 129
      //   28: aload_1
      //   29: invokevirtual 118	com/facebook/imagepipeline/image/EncodedImage:getSize	()I
      //   32: istore_3
      //   33: iload_2
      //   34: ifeq +104 -> 138
      //   37: getstatic 124	com/facebook/imagepipeline/image/ImmutableQualityInfo:FULL_QUALITY	Lcom/facebook/imagepipeline/image/QualityInfo;
      //   40: astore 6
      //   42: aload_0
      //   43: getfield 44	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:mProducerListener	Lcom/facebook/imagepipeline/producers/ProducerListener;
      //   46: aload_0
      //   47: getfield 36	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
      //   50: invokeinterface 128 1 0
      //   55: ldc -126
      //   57: invokeinterface 136 3 0
      //   62: aload_0
      //   63: getfield 31	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:this$0	Lcom/facebook/imagepipeline/producers/DecodeProducer;
      //   66: invokestatic 140	com/facebook/imagepipeline/producers/DecodeProducer:access$600	(Lcom/facebook/imagepipeline/producers/DecodeProducer;)Lcom/facebook/imagepipeline/decoder/ImageDecoder;
      //   69: aload_1
      //   70: iload_3
      //   71: aload 6
      //   73: aload_0
      //   74: getfield 56	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:mImageDecodeOptions	Lcom/facebook/imagepipeline/common/ImageDecodeOptions;
      //   77: invokevirtual 146	com/facebook/imagepipeline/decoder/ImageDecoder:decodeImage	(Lcom/facebook/imagepipeline/image/EncodedImage;ILcom/facebook/imagepipeline/image/QualityInfo;Lcom/facebook/imagepipeline/common/ImageDecodeOptions;)Lcom/facebook/imagepipeline/image/CloseableImage;
      //   80: astore 7
      //   82: aload_0
      //   83: aload 7
      //   85: lload 4
      //   87: aload 6
      //   89: iload_2
      //   90: invokespecial 150	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:getExtraMap	(Lcom/facebook/imagepipeline/image/CloseableImage;JLcom/facebook/imagepipeline/image/QualityInfo;Z)Ljava/util/Map;
      //   93: astore 6
      //   95: aload_0
      //   96: getfield 44	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:mProducerListener	Lcom/facebook/imagepipeline/producers/ProducerListener;
      //   99: aload_0
      //   100: getfield 36	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
      //   103: invokeinterface 128 1 0
      //   108: ldc -126
      //   110: aload 6
      //   112: invokeinterface 154 4 0
      //   117: aload_0
      //   118: aload 7
      //   120: iload_2
      //   121: invokespecial 158	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:handleResult	(Lcom/facebook/imagepipeline/image/CloseableImage;Z)V
      //   124: aload_1
      //   125: invokestatic 162	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
      //   128: return
      //   129: aload_0
      //   130: aload_1
      //   131: invokevirtual 166	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:getIntermediateImageEndOffset	(Lcom/facebook/imagepipeline/image/EncodedImage;)I
      //   134: istore_3
      //   135: goto -102 -> 33
      //   138: aload_0
      //   139: invokevirtual 170	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:getQualityInfo	()Lcom/facebook/imagepipeline/image/QualityInfo;
      //   142: astore 6
      //   144: goto -102 -> 42
      //   147: astore 7
      //   149: aload_0
      //   150: aconst_null
      //   151: lload 4
      //   153: aload 6
      //   155: iload_2
      //   156: invokespecial 150	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:getExtraMap	(Lcom/facebook/imagepipeline/image/CloseableImage;JLcom/facebook/imagepipeline/image/QualityInfo;Z)Ljava/util/Map;
      //   159: astore 6
      //   161: aload_0
      //   162: getfield 44	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:mProducerListener	Lcom/facebook/imagepipeline/producers/ProducerListener;
      //   165: aload_0
      //   166: getfield 36	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
      //   169: invokeinterface 128 1 0
      //   174: ldc -126
      //   176: aload 7
      //   178: aload 6
      //   180: invokeinterface 174 5 0
      //   185: aload_0
      //   186: aload 7
      //   188: invokespecial 178	com/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder:handleError	(Ljava/lang/Throwable;)V
      //   191: aload_1
      //   192: invokestatic 162	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
      //   195: return
      //   196: astore 6
      //   198: aload_1
      //   199: invokestatic 162	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
      //   202: aload 6
      //   204: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	205	0	this	ProgressiveDecoder
      //   0	205	1	paramEncodedImage	EncodedImage
      //   0	205	2	paramBoolean	boolean
      //   32	103	3	i	int
      //   22	130	4	l	long
      //   40	139	6	localObject1	Object
      //   196	7	6	localObject2	Object
      //   80	39	7	localCloseableImage	CloseableImage
      //   147	40	7	localException	Exception
      // Exception table:
      //   from	to	target	type
      //   62	82	147	java/lang/Exception
      //   15	24	196	finally
      //   28	33	196	finally
      //   37	42	196	finally
      //   42	62	196	finally
      //   62	82	196	finally
      //   82	124	196	finally
      //   129	135	196	finally
      //   138	144	196	finally
      //   149	191	196	finally
    }
    
    private Map<String, String> getExtraMap(@Nullable CloseableImage paramCloseableImage, long paramLong, QualityInfo paramQualityInfo, boolean paramBoolean)
    {
      if (!this.mProducerListener.requiresExtraMap(this.mProducerContext.getId())) {
        return null;
      }
      String str1 = String.valueOf(paramLong);
      paramQualityInfo = String.valueOf(paramQualityInfo.isOfGoodEnoughQuality());
      String str2 = String.valueOf(paramBoolean);
      if ((paramCloseableImage instanceof CloseableStaticBitmap))
      {
        paramCloseableImage = ((CloseableStaticBitmap)paramCloseableImage).getUnderlyingBitmap();
        return ImmutableMap.of("bitmapSize", paramCloseableImage.getWidth() + "x" + paramCloseableImage.getHeight(), "queueTime", str1, "hasGoodQuality", paramQualityInfo, "isFinal", str2);
      }
      return ImmutableMap.of("queueTime", str1, "hasGoodQuality", paramQualityInfo, "isFinal", str2);
    }
    
    private void handleCancellation()
    {
      maybeFinish(true);
      getConsumer().onCancellation();
    }
    
    private void handleError(Throwable paramThrowable)
    {
      maybeFinish(true);
      getConsumer().onFailure(paramThrowable);
    }
    
    private void handleResult(CloseableImage paramCloseableImage, boolean paramBoolean)
    {
      paramCloseableImage = CloseableReference.of(paramCloseableImage);
      try
      {
        maybeFinish(paramBoolean);
        getConsumer().onNewResult(paramCloseableImage, paramBoolean);
        return;
      }
      finally
      {
        CloseableReference.closeSafely(paramCloseableImage);
      }
    }
    
    private boolean isFinished()
    {
      try
      {
        boolean bool = this.mIsFinished;
        return bool;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    private void maybeFinish(boolean paramBoolean)
    {
      if (paramBoolean) {}
      try
      {
        if (this.mIsFinished) {
          return;
        }
        this.mIsFinished = true;
        this.mJobScheduler.clearJob();
        return;
      }
      finally {}
    }
    
    protected abstract int getIntermediateImageEndOffset(EncodedImage paramEncodedImage);
    
    protected abstract QualityInfo getQualityInfo();
    
    public void onCancellationImpl()
    {
      handleCancellation();
    }
    
    public void onFailureImpl(Throwable paramThrowable)
    {
      handleError(paramThrowable);
    }
    
    public void onNewResultImpl(EncodedImage paramEncodedImage, boolean paramBoolean)
    {
      if ((paramBoolean) && (!EncodedImage.isValid(paramEncodedImage))) {
        handleError(new NullPointerException("Encoded image is not valid."));
      }
      while ((!updateDecodeJob(paramEncodedImage, paramBoolean)) || ((!paramBoolean) && (!this.mProducerContext.isIntermediateResultExpected()))) {
        return;
      }
      this.mJobScheduler.scheduleJob();
    }
    
    protected boolean updateDecodeJob(EncodedImage paramEncodedImage, boolean paramBoolean)
    {
      return this.mJobScheduler.updateJob(paramEncodedImage, paramBoolean);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/producers/DecodeProducer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */