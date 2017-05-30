package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;

public class q
  extends ByteArrayOutputStream
{
  private static final int a = 256;
  private final d b;
  
  public q(d paramd)
  {
    this(paramd, 256);
  }
  
  public q(d paramd, int paramInt)
  {
    this.b = paramd;
    this.buf = this.b.a(Math.max(paramInt, 256));
  }
  
  private void a(int paramInt)
  {
    if (this.count + paramInt <= this.buf.length) {
      return;
    }
    byte[] arrayOfByte = this.b.a((this.count + paramInt) * 2);
    System.arraycopy(this.buf, 0, arrayOfByte, 0, this.count);
    this.b.a(this.buf);
    this.buf = arrayOfByte;
  }
  
  public void close()
  {
    this.b.a(this.buf);
    this.buf = null;
    super.close();
  }
  
  public void finalize()
  {
    this.b.a(this.buf);
  }
  
  public void write(int paramInt)
  {
    try
    {
      a(1);
      super.write(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      a(paramInt2);
      super.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */