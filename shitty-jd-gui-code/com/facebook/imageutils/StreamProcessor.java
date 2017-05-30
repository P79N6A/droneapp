package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;

class StreamProcessor
{
  public static int readPackedInt(InputStream paramInputStream, int paramInt, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (j < paramInt)
    {
      int k = paramInputStream.read();
      if (k == -1) {
        throw new IOException("no more bytes");
      }
      if (paramBoolean) {
        i |= (k & 0xFF) << j * 8;
      }
      for (;;)
      {
        j += 1;
        break;
        i = i << 8 | k & 0xFF;
      }
    }
    return i;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imageutils/StreamProcessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */