package com.facebook.imagepipeline.nativecode;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import java.io.InputStream;
import java.io.OutputStream;

@DoNotStrip
public class JpegTranscoder
{
  public static final int MAX_QUALITY = 100;
  public static final int MAX_SCALE_NUMERATOR = 16;
  public static final int MIN_QUALITY = 0;
  public static final int MIN_SCALE_NUMERATOR = 1;
  public static final int SCALE_DENOMINATOR = 8;
  
  static {}
  
  public static boolean isRotationAngleAllowed(int paramInt)
  {
    return (paramInt >= 0) && (paramInt <= 270) && (paramInt % 90 == 0);
  }
  
  @DoNotStrip
  private static native void nativeTranscodeJpeg(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt1, int paramInt2, int paramInt3);
  
  public static void transcodeJpeg(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool2 = false;
    if (paramInt2 >= 1)
    {
      bool1 = true;
      Preconditions.checkArgument(bool1);
      if (paramInt2 > 16) {
        break label117;
      }
      bool1 = true;
      label25:
      Preconditions.checkArgument(bool1);
      if (paramInt3 < 0) {
        break label123;
      }
      bool1 = true;
      label38:
      Preconditions.checkArgument(bool1);
      if (paramInt3 > 100) {
        break label129;
      }
    }
    label117:
    label123:
    label129:
    for (boolean bool1 = true;; bool1 = false)
    {
      Preconditions.checkArgument(bool1);
      Preconditions.checkArgument(isRotationAngleAllowed(paramInt1));
      if (paramInt2 == 8)
      {
        bool1 = bool2;
        if (paramInt1 == 0) {}
      }
      else
      {
        bool1 = true;
      }
      Preconditions.checkArgument(bool1, "no transformation requested");
      nativeTranscodeJpeg((InputStream)Preconditions.checkNotNull(paramInputStream), (OutputStream)Preconditions.checkNotNull(paramOutputStream), paramInt1, paramInt2, paramInt3);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label25;
      bool1 = false;
      break label38;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/nativecode/JpegTranscoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */