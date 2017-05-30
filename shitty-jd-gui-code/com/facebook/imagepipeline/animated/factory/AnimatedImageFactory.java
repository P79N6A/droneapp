package com.facebook.imagepipeline.animated.factory;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.animated.base.AnimatedImageResult;
import com.facebook.imagepipeline.animated.impl.AnimatedDrawableBackendProvider;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.Callback;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import java.util.ArrayList;
import java.util.List;

public class AnimatedImageFactory
{
  private final AnimatedDrawableBackendProvider mAnimatedDrawableBackendProvider;
  private final PlatformBitmapFactory mBitmapFactory;
  
  public AnimatedImageFactory(AnimatedDrawableBackendProvider paramAnimatedDrawableBackendProvider, PlatformBitmapFactory paramPlatformBitmapFactory)
  {
    this.mAnimatedDrawableBackendProvider = paramAnimatedDrawableBackendProvider;
    this.mBitmapFactory = paramPlatformBitmapFactory;
  }
  
  @SuppressLint({"NewApi"})
  private CloseableReference<Bitmap> createBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    paramConfig = this.mBitmapFactory.createBitmap(paramInt1, paramInt2, paramConfig);
    ((Bitmap)paramConfig.get()).eraseColor(0);
    if (Build.VERSION.SDK_INT >= 12) {
      ((Bitmap)paramConfig.get()).setHasAlpha(true);
    }
    return paramConfig;
  }
  
  private CloseableReference<Bitmap> createPreviewBitmap(AnimatedImage paramAnimatedImage, Bitmap.Config paramConfig, int paramInt)
  {
    paramConfig = createBitmap(paramAnimatedImage.getWidth(), paramAnimatedImage.getHeight(), paramConfig);
    paramAnimatedImage = AnimatedImageResult.forAnimatedImage(paramAnimatedImage);
    new AnimatedImageCompositor(this.mAnimatedDrawableBackendProvider.get(paramAnimatedImage, null), new AnimatedImageCompositor.Callback()
    {
      public CloseableReference<Bitmap> getCachedBitmap(int paramAnonymousInt)
      {
        return null;
      }
      
      public void onIntermediateResult(int paramAnonymousInt, Bitmap paramAnonymousBitmap) {}
    }).renderFrame(paramInt, (Bitmap)paramConfig.get());
    return paramConfig;
  }
  
  private List<CloseableReference<Bitmap>> decodeAllFrames(AnimatedImage paramAnimatedImage, Bitmap.Config paramConfig)
  {
    final ArrayList localArrayList = new ArrayList();
    paramAnimatedImage = AnimatedImageResult.forAnimatedImage(paramAnimatedImage);
    paramAnimatedImage = this.mAnimatedDrawableBackendProvider.get(paramAnimatedImage, null);
    AnimatedImageCompositor localAnimatedImageCompositor = new AnimatedImageCompositor(paramAnimatedImage, new AnimatedImageCompositor.Callback()
    {
      public CloseableReference<Bitmap> getCachedBitmap(int paramAnonymousInt)
      {
        return CloseableReference.cloneOrNull((CloseableReference)localArrayList.get(paramAnonymousInt));
      }
      
      public void onIntermediateResult(int paramAnonymousInt, Bitmap paramAnonymousBitmap) {}
    });
    int i = 0;
    while (i < paramAnimatedImage.getFrameCount())
    {
      CloseableReference localCloseableReference = createBitmap(paramAnimatedImage.getWidth(), paramAnimatedImage.getHeight(), paramConfig);
      localAnimatedImageCompositor.renderFrame(i, (Bitmap)localCloseableReference.get());
      localArrayList.add(localCloseableReference);
      i += 1;
    }
    return localArrayList;
  }
  
  /* Error */
  private com.facebook.imagepipeline.image.CloseableAnimatedImage getCloseableImage(com.facebook.imagepipeline.common.ImageDecodeOptions paramImageDecodeOptions, AnimatedImage paramAnimatedImage, Bitmap.Config paramConfig)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: aconst_null
    //   7: astore 7
    //   9: aload_1
    //   10: getfield 122	com/facebook/imagepipeline/common/ImageDecodeOptions:useLastFrameForPreview	Z
    //   13: ifeq +149 -> 162
    //   16: aload_2
    //   17: invokeinterface 123 1 0
    //   22: iconst_1
    //   23: isub
    //   24: istore 4
    //   26: aload_1
    //   27: getfield 125	com/facebook/imagepipeline/common/ImageDecodeOptions:decodeAllFrames	Z
    //   30: ifeq +158 -> 188
    //   33: aload_0
    //   34: aload_2
    //   35: aload_3
    //   36: invokespecial 127	com/facebook/imagepipeline/animated/factory/AnimatedImageFactory:decodeAllFrames	(Lcom/facebook/imagepipeline/animated/base/AnimatedImage;Landroid/graphics/Bitmap$Config;)Ljava/util/List;
    //   39: astore 8
    //   41: aload 6
    //   43: astore 5
    //   45: aload 8
    //   47: astore 7
    //   49: aload 8
    //   51: iload 4
    //   53: invokeinterface 130 2 0
    //   58: checkcast 33	com/facebook/common/references/CloseableReference
    //   61: invokestatic 134	com/facebook/common/references/CloseableReference:cloneOrNull	(Lcom/facebook/common/references/CloseableReference;)Lcom/facebook/common/references/CloseableReference;
    //   64: astore 6
    //   66: aload 6
    //   68: astore 9
    //   70: aload 6
    //   72: astore 5
    //   74: aload 8
    //   76: astore 7
    //   78: aload_1
    //   79: getfield 137	com/facebook/imagepipeline/common/ImageDecodeOptions:decodePreviewFrame	Z
    //   82: ifeq +30 -> 112
    //   85: aload 6
    //   87: astore 9
    //   89: aload 6
    //   91: ifnonnull +21 -> 112
    //   94: aload 6
    //   96: astore 5
    //   98: aload 8
    //   100: astore 7
    //   102: aload_0
    //   103: aload_2
    //   104: aload_3
    //   105: iload 4
    //   107: invokespecial 139	com/facebook/imagepipeline/animated/factory/AnimatedImageFactory:createPreviewBitmap	(Lcom/facebook/imagepipeline/animated/base/AnimatedImage;Landroid/graphics/Bitmap$Config;I)Lcom/facebook/common/references/CloseableReference;
    //   110: astore 9
    //   112: aload 9
    //   114: astore 5
    //   116: aload 8
    //   118: astore 7
    //   120: new 141	com/facebook/imagepipeline/image/CloseableAnimatedImage
    //   123: dup
    //   124: aload_2
    //   125: invokestatic 145	com/facebook/imagepipeline/animated/base/AnimatedImageResult:newBuilder	(Lcom/facebook/imagepipeline/animated/base/AnimatedImage;)Lcom/facebook/imagepipeline/animated/base/AnimatedImageResultBuilder;
    //   128: aload 9
    //   130: invokevirtual 151	com/facebook/imagepipeline/animated/base/AnimatedImageResultBuilder:setPreviewBitmap	(Lcom/facebook/common/references/CloseableReference;)Lcom/facebook/imagepipeline/animated/base/AnimatedImageResultBuilder;
    //   133: iload 4
    //   135: invokevirtual 155	com/facebook/imagepipeline/animated/base/AnimatedImageResultBuilder:setFrameForPreview	(I)Lcom/facebook/imagepipeline/animated/base/AnimatedImageResultBuilder;
    //   138: aload 8
    //   140: invokevirtual 159	com/facebook/imagepipeline/animated/base/AnimatedImageResultBuilder:setDecodedFrames	(Ljava/util/List;)Lcom/facebook/imagepipeline/animated/base/AnimatedImageResultBuilder;
    //   143: invokevirtual 163	com/facebook/imagepipeline/animated/base/AnimatedImageResultBuilder:build	()Lcom/facebook/imagepipeline/animated/base/AnimatedImageResult;
    //   146: invokespecial 166	com/facebook/imagepipeline/image/CloseableAnimatedImage:<init>	(Lcom/facebook/imagepipeline/animated/base/AnimatedImageResult;)V
    //   149: astore_1
    //   150: aload 9
    //   152: invokestatic 170	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   155: aload 8
    //   157: invokestatic 173	com/facebook/common/references/CloseableReference:closeSafely	(Ljava/lang/Iterable;)V
    //   160: aload_1
    //   161: areturn
    //   162: iconst_0
    //   163: istore 4
    //   165: goto -139 -> 26
    //   168: astore_1
    //   169: aconst_null
    //   170: astore 7
    //   172: aload 5
    //   174: invokestatic 170	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   177: aload 7
    //   179: invokestatic 173	com/facebook/common/references/CloseableReference:closeSafely	(Ljava/lang/Iterable;)V
    //   182: aload_1
    //   183: athrow
    //   184: astore_1
    //   185: goto -13 -> 172
    //   188: aconst_null
    //   189: astore 8
    //   191: aload 7
    //   193: astore 6
    //   195: goto -129 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	this	AnimatedImageFactory
    //   0	198	1	paramImageDecodeOptions	com.facebook.imagepipeline.common.ImageDecodeOptions
    //   0	198	2	paramAnimatedImage	AnimatedImage
    //   0	198	3	paramConfig	Bitmap.Config
    //   24	140	4	i	int
    //   1	172	5	localObject1	Object
    //   4	190	6	localObject2	Object
    //   7	185	7	localObject3	Object
    //   39	151	8	localList	List
    //   68	83	9	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   9	26	168	finally
    //   26	41	168	finally
    //   49	66	184	finally
    //   78	85	184	finally
    //   102	112	184	finally
    //   120	150	184	finally
  }
  
  /* Error */
  public com.facebook.imagepipeline.image.CloseableImage decodeGif(com.facebook.imagepipeline.image.EncodedImage paramEncodedImage, com.facebook.imagepipeline.common.ImageDecodeOptions paramImageDecodeOptions, Bitmap.Config paramConfig)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 181	com/facebook/imagepipeline/image/EncodedImage:getByteBufferRef	()Lcom/facebook/common/references/CloseableReference;
    //   4: astore_1
    //   5: aload_1
    //   6: invokestatic 187	com/facebook/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   9: pop
    //   10: aload_2
    //   11: getfield 190	com/facebook/imagepipeline/common/ImageDecodeOptions:forceOldAnimationCode	Z
    //   14: ifne +50 -> 64
    //   17: iconst_1
    //   18: istore 4
    //   20: iload 4
    //   22: invokestatic 193	com/facebook/common/internal/Preconditions:checkState	(Z)V
    //   25: aload_1
    //   26: invokevirtual 37	com/facebook/common/references/CloseableReference:get	()Ljava/lang/Object;
    //   29: checkcast 195	com/facebook/imagepipeline/memory/PooledByteBuffer
    //   32: astore 5
    //   34: aload_0
    //   35: aload_2
    //   36: aload 5
    //   38: invokeinterface 199 1 0
    //   43: aload 5
    //   45: invokeinterface 202 1 0
    //   50: invokestatic 208	com/facebook/imagepipeline/gif/GifImage:create	(JI)Lcom/facebook/imagepipeline/gif/GifImage;
    //   53: aload_3
    //   54: invokespecial 210	com/facebook/imagepipeline/animated/factory/AnimatedImageFactory:getCloseableImage	(Lcom/facebook/imagepipeline/common/ImageDecodeOptions;Lcom/facebook/imagepipeline/animated/base/AnimatedImage;Landroid/graphics/Bitmap$Config;)Lcom/facebook/imagepipeline/image/CloseableAnimatedImage;
    //   57: astore_2
    //   58: aload_1
    //   59: invokestatic 170	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   62: aload_2
    //   63: areturn
    //   64: iconst_0
    //   65: istore 4
    //   67: goto -47 -> 20
    //   70: astore_2
    //   71: aload_1
    //   72: invokestatic 170	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   75: aload_2
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	AnimatedImageFactory
    //   0	77	1	paramEncodedImage	com.facebook.imagepipeline.image.EncodedImage
    //   0	77	2	paramImageDecodeOptions	com.facebook.imagepipeline.common.ImageDecodeOptions
    //   0	77	3	paramConfig	Bitmap.Config
    //   18	48	4	bool	boolean
    //   32	12	5	localPooledByteBuffer	com.facebook.imagepipeline.memory.PooledByteBuffer
    // Exception table:
    //   from	to	target	type
    //   10	17	70	finally
    //   20	58	70	finally
  }
  
  /* Error */
  public com.facebook.imagepipeline.image.CloseableImage decodeWebP(com.facebook.imagepipeline.image.EncodedImage paramEncodedImage, com.facebook.imagepipeline.common.ImageDecodeOptions paramImageDecodeOptions, Bitmap.Config paramConfig)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 181	com/facebook/imagepipeline/image/EncodedImage:getByteBufferRef	()Lcom/facebook/common/references/CloseableReference;
    //   4: astore_1
    //   5: aload_1
    //   6: invokestatic 187	com/facebook/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   9: pop
    //   10: aload_2
    //   11: getfield 190	com/facebook/imagepipeline/common/ImageDecodeOptions:forceOldAnimationCode	Z
    //   14: ifne +50 -> 64
    //   17: iconst_1
    //   18: istore 4
    //   20: iload 4
    //   22: invokestatic 214	com/facebook/common/internal/Preconditions:checkArgument	(Z)V
    //   25: aload_1
    //   26: invokevirtual 37	com/facebook/common/references/CloseableReference:get	()Ljava/lang/Object;
    //   29: checkcast 195	com/facebook/imagepipeline/memory/PooledByteBuffer
    //   32: astore 5
    //   34: aload_0
    //   35: aload_2
    //   36: aload 5
    //   38: invokeinterface 199 1 0
    //   43: aload 5
    //   45: invokeinterface 202 1 0
    //   50: invokestatic 219	com/facebook/imagepipeline/webp/WebPImage:create	(JI)Lcom/facebook/imagepipeline/webp/WebPImage;
    //   53: aload_3
    //   54: invokespecial 210	com/facebook/imagepipeline/animated/factory/AnimatedImageFactory:getCloseableImage	(Lcom/facebook/imagepipeline/common/ImageDecodeOptions;Lcom/facebook/imagepipeline/animated/base/AnimatedImage;Landroid/graphics/Bitmap$Config;)Lcom/facebook/imagepipeline/image/CloseableAnimatedImage;
    //   57: astore_2
    //   58: aload_1
    //   59: invokestatic 170	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   62: aload_2
    //   63: areturn
    //   64: iconst_0
    //   65: istore 4
    //   67: goto -47 -> 20
    //   70: astore_2
    //   71: aload_1
    //   72: invokestatic 170	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   75: aload_2
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	AnimatedImageFactory
    //   0	77	1	paramEncodedImage	com.facebook.imagepipeline.image.EncodedImage
    //   0	77	2	paramImageDecodeOptions	com.facebook.imagepipeline.common.ImageDecodeOptions
    //   0	77	3	paramConfig	Bitmap.Config
    //   18	48	4	bool	boolean
    //   32	12	5	localPooledByteBuffer	com.facebook.imagepipeline.memory.PooledByteBuffer
    // Exception table:
    //   from	to	target	type
    //   10	17	70	finally
    //   20	58	70	finally
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/animated/factory/AnimatedImageFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */