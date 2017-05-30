package org.a.a.i.g;

import java.io.IOException;
import java.io.OutputStream;
import org.a.a.a.c;
import org.apache.http.io.SessionOutputBuffer;

@c
public class d
  extends OutputStream
{
  private final SessionOutputBuffer a;
  private final byte[] b;
  private int c = 0;
  private boolean d = false;
  private boolean e = false;
  
  public d(int paramInt, SessionOutputBuffer paramSessionOutputBuffer)
  {
    this.b = new byte[paramInt];
    this.a = paramSessionOutputBuffer;
  }
  
  @Deprecated
  public d(SessionOutputBuffer paramSessionOutputBuffer)
  {
    this(2048, paramSessionOutputBuffer);
  }
  
  @Deprecated
  public d(SessionOutputBuffer paramSessionOutputBuffer, int paramInt)
  {
    this(paramInt, paramSessionOutputBuffer);
  }
  
  protected void a()
  {
    if (this.c > 0)
    {
      this.a.writeLine(Integer.toHexString(this.c));
      this.a.write(this.b, 0, this.c);
      this.a.writeLine("");
      this.c = 0;
    }
  }
  
  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a.writeLine(Integer.toHexString(this.c + paramInt2));
    this.a.write(this.b, 0, this.c);
    this.a.write(paramArrayOfByte, paramInt1, paramInt2);
    this.a.writeLine("");
    this.c = 0;
  }
  
  protected void b()
  {
    this.a.writeLine("0");
    this.a.writeLine("");
  }
  
  public void c()
  {
    if (!this.d)
    {
      a();
      b();
      this.d = true;
    }
  }
  
  public void close()
  {
    if (!this.e)
    {
      this.e = true;
      c();
      this.a.flush();
    }
  }
  
  public void flush()
  {
    a();
    this.a.flush();
  }
  
  public void write(int paramInt)
  {
    if (this.e) {
      throw new IOException("Attempted write to closed stream.");
    }
    this.b[this.c] = ((byte)paramInt);
    this.c += 1;
    if (this.c == this.b.length) {
      a();
    }
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.e) {
      throw new IOException("Attempted write to closed stream.");
    }
    if (paramInt2 >= this.b.length - this.c)
    {
      a(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    System.arraycopy(paramArrayOfByte, paramInt1, this.b, this.c, paramInt2);
    this.c += paramInt2;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */