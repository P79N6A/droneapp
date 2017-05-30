package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.soloader.SoLoaderShim;
import com.facebook.imageutils.BitmapUtil;

@DoNotStrip
public class Bitmaps
{
  static
  {
    SoLoaderShim.loadLibrary("bitmaps");
  }
  
  public static void copyBitmap(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    boolean bool2 = true;
    if (paramBitmap2.getConfig() == paramBitmap1.getConfig())
    {
      bool1 = true;
      Preconditions.checkArgument(bool1);
      Preconditions.checkArgument(paramBitmap1.isMutable());
      if (paramBitmap1.getWidth() != paramBitmap2.getWidth()) {
        break label83;
      }
      bool1 = true;
      label39:
      Preconditions.checkArgument(bool1);
      if (paramBitmap1.getHeight() != paramBitmap2.getHeight()) {
        break label88;
      }
    }
    label83:
    label88:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Preconditions.checkArgument(bool1);
      nativeCopyBitmap(paramBitmap1, paramBitmap1.getRowBytes(), paramBitmap2, paramBitmap2.getRowBytes(), paramBitmap1.getHeight());
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label39;
    }
  }
  
  @DoNotStrip
  private static native void nativeCopyBitmap(Bitmap paramBitmap1, int paramInt1, Bitmap paramBitmap2, int paramInt2, int paramInt3);
  
  @DoNotStrip
  private static native void nativePinBitmap(Bitmap paramBitmap);
  
  public static void pinBitmap(Bitmap paramBitmap)
  {
    Preconditions.checkNotNull(paramBitmap);
    nativePinBitmap(paramBitmap);
  }
  
  @TargetApi(19)
  public static void reconfigureBitmap(Bitmap paramBitmap, int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    if (paramBitmap.getAllocationByteCount() >= paramInt1 * paramInt2 * BitmapUtil.getPixelSizeForBitmapConfig(paramConfig)) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.checkArgument(bool);
      paramBitmap.reconfigure(paramInt1, paramInt2, paramConfig);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/nativecode/Bitmaps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */