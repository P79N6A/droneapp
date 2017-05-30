package com.facebook.imagepipeline.webp;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.soloader.SoLoaderShim;
import com.facebook.imagepipeline.animated.base.AnimatedImage;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class WebPImage
  implements AnimatedImage
{
  private static volatile boolean sInitialized;
  @DoNotStrip
  private long mNativeContext;
  
  @DoNotStrip
  WebPImage(long paramLong)
  {
    this.mNativeContext = paramLong;
  }
  
  public static WebPImage create(long paramLong, int paramInt)
  {
    
    if (paramLong != 0L) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.checkArgument(bool);
      return nativeCreateFromNativeMemory(paramLong, paramInt);
    }
  }
  
  public static WebPImage create(byte[] paramArrayOfByte)
  {
    ensure();
    Preconditions.checkNotNull(paramArrayOfByte);
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramArrayOfByte.length);
    localByteBuffer.put(paramArrayOfByte);
    localByteBuffer.rewind();
    return nativeCreateFromDirectByteBuffer(localByteBuffer);
  }
  
  private static void ensure()
  {
    try
    {
      if (!sInitialized)
      {
        sInitialized = true;
        SoLoaderShim.loadLibrary("webp");
        SoLoaderShim.loadLibrary("webpimage");
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer paramByteBuffer);
  
  private static native WebPImage nativeCreateFromNativeMemory(long paramLong, int paramInt);
  
  private native void nativeDispose();
  
  private native void nativeFinalize();
  
  private native int nativeGetDuration();
  
  private native WebPFrame nativeGetFrame(int paramInt);
  
  private native int nativeGetFrameCount();
  
  private native int[] nativeGetFrameDurations();
  
  private native int nativeGetHeight();
  
  private native int nativeGetLoopCount();
  
  private native int nativeGetSizeInBytes();
  
  private native int nativeGetWidth();
  
  public void dispose()
  {
    nativeDispose();
  }
  
  public boolean doesRenderSupportScaling()
  {
    return true;
  }
  
  protected void finalize()
  {
    nativeFinalize();
  }
  
  public int getDuration()
  {
    return nativeGetDuration();
  }
  
  public WebPFrame getFrame(int paramInt)
  {
    return nativeGetFrame(paramInt);
  }
  
  public int getFrameCount()
  {
    return nativeGetFrameCount();
  }
  
  public int[] getFrameDurations()
  {
    return nativeGetFrameDurations();
  }
  
  /* Error */
  public com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo getFrameInfo(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokevirtual 98	com/facebook/imagepipeline/webp/WebPImage:getFrame	(I)Lcom/facebook/imagepipeline/webp/WebPFrame;
    //   5: astore 8
    //   7: aload 8
    //   9: invokevirtual 113	com/facebook/imagepipeline/webp/WebPFrame:getXOffset	()I
    //   12: istore_2
    //   13: aload 8
    //   15: invokevirtual 116	com/facebook/imagepipeline/webp/WebPFrame:getYOffset	()I
    //   18: istore_3
    //   19: aload 8
    //   21: invokevirtual 119	com/facebook/imagepipeline/webp/WebPFrame:getWidth	()I
    //   24: istore 4
    //   26: aload 8
    //   28: invokevirtual 122	com/facebook/imagepipeline/webp/WebPFrame:getHeight	()I
    //   31: istore 5
    //   33: aload 8
    //   35: invokevirtual 125	com/facebook/imagepipeline/webp/WebPFrame:shouldBlendWithPreviousFrame	()Z
    //   38: istore 6
    //   40: aload 8
    //   42: invokevirtual 128	com/facebook/imagepipeline/webp/WebPFrame:shouldDisposeToBackgroundColor	()Z
    //   45: ifeq +36 -> 81
    //   48: getstatic 134	com/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo$DisposalMethod:DISPOSE_TO_BACKGROUND	Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo$DisposalMethod;
    //   51: astore 7
    //   53: new 136	com/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo
    //   56: dup
    //   57: iload_1
    //   58: iload_2
    //   59: iload_3
    //   60: iload 4
    //   62: iload 5
    //   64: iload 6
    //   66: aload 7
    //   68: invokespecial 139	com/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo:<init>	(IIIIIZLcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo$DisposalMethod;)V
    //   71: astore 7
    //   73: aload 8
    //   75: invokevirtual 141	com/facebook/imagepipeline/webp/WebPFrame:dispose	()V
    //   78: aload 7
    //   80: areturn
    //   81: getstatic 144	com/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo$DisposalMethod:DISPOSE_DO_NOT	Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo$DisposalMethod;
    //   84: astore 7
    //   86: goto -33 -> 53
    //   89: astore 7
    //   91: aload 8
    //   93: invokevirtual 141	com/facebook/imagepipeline/webp/WebPFrame:dispose	()V
    //   96: aload 7
    //   98: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	WebPImage
    //   0	99	1	paramInt	int
    //   12	47	2	i	int
    //   18	42	3	j	int
    //   24	37	4	k	int
    //   31	32	5	m	int
    //   38	27	6	bool	boolean
    //   51	34	7	localObject1	Object
    //   89	8	7	localObject2	Object
    //   5	87	8	localWebPFrame	WebPFrame
    // Exception table:
    //   from	to	target	type
    //   7	53	89	finally
    //   53	73	89	finally
    //   81	86	89	finally
  }
  
  public int getHeight()
  {
    return nativeGetHeight();
  }
  
  public int getLoopCount()
  {
    return nativeGetLoopCount();
  }
  
  public int getSizeInBytes()
  {
    return nativeGetSizeInBytes();
  }
  
  public int getWidth()
  {
    return nativeGetWidth();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/webp/WebPImage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */