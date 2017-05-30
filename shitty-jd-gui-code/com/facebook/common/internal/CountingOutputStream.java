package com.facebook.common.internal;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public class CountingOutputStream
  extends FilterOutputStream
{
  private long mCount = 0L;
  
  public CountingOutputStream(OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }
  
  public void close()
  {
    this.out.close();
  }
  
  public long getCount()
  {
    return this.mCount;
  }
  
  public void write(int paramInt)
  {
    this.out.write(paramInt);
    this.mCount += 1L;
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
    this.mCount += paramInt2;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/common/internal/CountingOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */