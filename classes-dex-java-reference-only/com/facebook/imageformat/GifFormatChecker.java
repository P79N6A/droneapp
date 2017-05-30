package com.facebook.imageformat;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;

public final class GifFormatChecker
{
  private static final byte[] FRAME_HEADER_END_1 = { 0, 44 };
  private static final byte[] FRAME_HEADER_END_2 = { 0, 33 };
  private static final int FRAME_HEADER_SIZE = 10;
  private static final byte[] FRAME_HEADER_START = { 0, 33, -7, 4 };
  
  @VisibleForTesting
  static boolean circularBufferMatchesBytePattern(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    Preconditions.checkNotNull(paramArrayOfByte1);
    Preconditions.checkNotNull(paramArrayOfByte2);
    if (paramInt >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.checkArgument(bool);
      if (paramArrayOfByte2.length <= paramArrayOfByte1.length) {
        break;
      }
      return false;
    }
    int i = 0;
    for (;;)
    {
      if (i >= paramArrayOfByte2.length) {
        break label66;
      }
      if (paramArrayOfByte1[((i + paramInt) % paramArrayOfByte1.length)] != paramArrayOfByte2[i]) {
        break;
      }
      i += 1;
    }
    label66:
    return true;
  }
  
  public static boolean isAnimated(InputStream paramInputStream)
  {
    byte[] arrayOfByte = new byte[10];
    int k;
    label107:
    do
    {
      try
      {
        paramInputStream.read(arrayOfByte, 0, 10);
        k = 0;
        int i = 0;
        while (paramInputStream.read(arrayOfByte, i, 1) > 0)
        {
          j = k;
          if (circularBufferMatchesBytePattern(arrayOfByte, i + 1, FRAME_HEADER_START))
          {
            if (circularBufferMatchesBytePattern(arrayOfByte, i + 9, FRAME_HEADER_END_1)) {
              break label107;
            }
            j = k;
            if (circularBufferMatchesBytePattern(arrayOfByte, i + 9, FRAME_HEADER_END_2)) {
              break label107;
            }
          }
          i = (i + 1) % arrayOfByte.length;
          k = j;
        }
        return false;
      }
      catch (IOException paramInputStream)
      {
        throw new RuntimeException(paramInputStream);
      }
      k += 1;
      int j = k;
    } while (k <= 1);
    return true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imageformat/GifFormatChecker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */