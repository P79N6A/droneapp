package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imageutils.BitmapUtil;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class CloseableStaticBitmap
  extends CloseableBitmap
{
  private volatile Bitmap mBitmap;
  @GuardedBy("this")
  private CloseableReference<Bitmap> mBitmapReference;
  private final QualityInfo mQualityInfo;
  private final int mRotationAngle;
  
  public CloseableStaticBitmap(Bitmap paramBitmap, ResourceReleaser<Bitmap> paramResourceReleaser, QualityInfo paramQualityInfo, int paramInt)
  {
    this.mBitmap = ((Bitmap)Preconditions.checkNotNull(paramBitmap));
    this.mBitmapReference = CloseableReference.of(this.mBitmap, (ResourceReleaser)Preconditions.checkNotNull(paramResourceReleaser));
    this.mQualityInfo = paramQualityInfo;
    this.mRotationAngle = paramInt;
  }
  
  public CloseableStaticBitmap(CloseableReference<Bitmap> paramCloseableReference, QualityInfo paramQualityInfo, int paramInt)
  {
    this.mBitmapReference = ((CloseableReference)Preconditions.checkNotNull(paramCloseableReference.cloneOrNull()));
    this.mBitmap = ((Bitmap)this.mBitmapReference.get());
    this.mQualityInfo = paramQualityInfo;
    this.mRotationAngle = paramInt;
  }
  
  private CloseableReference<Bitmap> detachBitmapReference()
  {
    try
    {
      CloseableReference localCloseableReference = this.mBitmapReference;
      this.mBitmapReference = null;
      this.mBitmap = null;
      return localCloseableReference;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void close()
  {
    CloseableReference localCloseableReference = detachBitmapReference();
    if (localCloseableReference != null) {
      localCloseableReference.close();
    }
  }
  
  public CloseableReference<Bitmap> convertToBitmapReference()
  {
    try
    {
      Preconditions.checkNotNull(this.mBitmapReference, "Cannot convert a closed static bitmap");
      CloseableReference localCloseableReference = detachBitmapReference();
      return localCloseableReference;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getHeight()
  {
    Bitmap localBitmap = this.mBitmap;
    if (localBitmap == null) {
      return 0;
    }
    return localBitmap.getHeight();
  }
  
  public QualityInfo getQualityInfo()
  {
    return this.mQualityInfo;
  }
  
  public int getRotationAngle()
  {
    return this.mRotationAngle;
  }
  
  public int getSizeInBytes()
  {
    return BitmapUtil.getSizeInBytes(this.mBitmap);
  }
  
  public Bitmap getUnderlyingBitmap()
  {
    return this.mBitmap;
  }
  
  public int getWidth()
  {
    Bitmap localBitmap = this.mBitmap;
    if (localBitmap == null) {
      return 0;
    }
    return localBitmap.getWidth();
  }
  
  /* Error */
  public boolean isClosed()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 42	com/facebook/imagepipeline/image/CloseableStaticBitmap:mBitmapReference	Lcom/facebook/common/references/CloseableReference;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +9 -> 17
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_1
    //   19: goto -6 -> 13
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	CloseableStaticBitmap
    //   12	7	1	bool	boolean
    //   6	2	2	localCloseableReference	CloseableReference
    //   22	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/image/CloseableStaticBitmap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */