package com.facebook.common.streams;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LimitedInputStream
  extends FilterInputStream
{
  private int mBytesToRead;
  private int mBytesToReadWhenMarked;
  
  public LimitedInputStream(InputStream paramInputStream, int paramInt)
  {
    super(paramInputStream);
    if (paramInputStream == null) {
      throw new NullPointerException();
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("limit must be >= 0");
    }
    this.mBytesToRead = paramInt;
    this.mBytesToReadWhenMarked = -1;
  }
  
  public int available()
  {
    return Math.min(this.in.available(), this.mBytesToRead);
  }
  
  public void mark(int paramInt)
  {
    if (this.in.markSupported())
    {
      this.in.mark(paramInt);
      this.mBytesToReadWhenMarked = this.mBytesToRead;
    }
  }
  
  public int read()
  {
    if (this.mBytesToRead == 0) {
      return -1;
    }
    int i = this.in.read();
    if (i != -1) {
      this.mBytesToRead -= 1;
    }
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.mBytesToRead == 0) {
      paramInt1 = -1;
    }
    do
    {
      return paramInt1;
      paramInt2 = Math.min(paramInt2, this.mBytesToRead);
      paramInt2 = this.in.read(paramArrayOfByte, paramInt1, paramInt2);
      paramInt1 = paramInt2;
    } while (paramInt2 <= 0);
    this.mBytesToRead -= paramInt2;
    return paramInt2;
  }
  
  public void reset()
  {
    if (!this.in.markSupported()) {
      throw new IOException("mark is not supported");
    }
    if (this.mBytesToReadWhenMarked == -1) {
      throw new IOException("mark not set");
    }
    this.in.reset();
    this.mBytesToRead = this.mBytesToReadWhenMarked;
  }
  
  public long skip(long paramLong)
  {
    paramLong = Math.min(paramLong, this.mBytesToRead);
    paramLong = this.in.skip(paramLong);
    this.mBytesToRead = ((int)(this.mBytesToRead - paramLong));
    return paramLong;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/common/streams/LimitedInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */