package com.facebook.common.streams;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TailAppendingInputStream
  extends FilterInputStream
{
  private int mMarkedTailOffset;
  private final byte[] mTail;
  private int mTailOffset;
  
  public TailAppendingInputStream(InputStream paramInputStream, byte[] paramArrayOfByte)
  {
    super(paramInputStream);
    if (paramInputStream == null) {
      throw new NullPointerException();
    }
    if (paramArrayOfByte == null) {
      throw new NullPointerException();
    }
    this.mTail = paramArrayOfByte;
  }
  
  private int readNextTailByte()
  {
    if (this.mTailOffset >= this.mTail.length) {
      return -1;
    }
    byte[] arrayOfByte = this.mTail;
    int i = this.mTailOffset;
    this.mTailOffset = (i + 1);
    return arrayOfByte[i] & 0xFF;
  }
  
  public void mark(int paramInt)
  {
    if (this.in.markSupported())
    {
      super.mark(paramInt);
      this.mMarkedTailOffset = this.mTailOffset;
    }
  }
  
  public int read()
  {
    int i = this.in.read();
    if (i != -1) {
      return i;
    }
    return readNextTailByte();
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = this.in.read(paramArrayOfByte, paramInt1, paramInt2);
    if (i != -1)
    {
      paramInt1 = i;
      return paramInt1;
    }
    if (paramInt2 == 0) {
      return 0;
    }
    i = 0;
    for (;;)
    {
      int j;
      if (i < paramInt2)
      {
        j = readNextTailByte();
        if (j != -1) {}
      }
      else
      {
        paramInt1 = i;
        if (i > 0) {
          break;
        }
        return -1;
      }
      paramArrayOfByte[(paramInt1 + i)] = ((byte)j);
      i += 1;
    }
  }
  
  public void reset()
  {
    if (this.in.markSupported())
    {
      this.in.reset();
      this.mTailOffset = this.mMarkedTailOffset;
      return;
    }
    throw new IOException("mark is not supported");
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/common/streams/TailAppendingInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */