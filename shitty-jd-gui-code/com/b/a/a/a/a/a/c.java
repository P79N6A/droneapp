package com.b.a.a.a.a.a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class c
  implements Closeable
{
  private static final byte a = 13;
  private static final byte b = 10;
  private final InputStream c;
  private final Charset d;
  private byte[] e;
  private int f;
  private int g;
  
  public c(InputStream paramInputStream, int paramInt, Charset paramCharset)
  {
    if ((paramInputStream == null) || (paramCharset == null)) {
      throw new NullPointerException();
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("capacity <= 0");
    }
    if (!paramCharset.equals(d.a)) {
      throw new IllegalArgumentException("Unsupported encoding");
    }
    this.c = paramInputStream;
    this.d = paramCharset;
    this.e = new byte[paramInt];
  }
  
  public c(InputStream paramInputStream, Charset paramCharset)
  {
    this(paramInputStream, 8192, paramCharset);
  }
  
  private void b()
  {
    int i = this.c.read(this.e, 0, this.e.length);
    if (i == -1) {
      throw new EOFException();
    }
    this.f = 0;
    this.g = i;
  }
  
  public String a()
  {
    synchronized (this.c)
    {
      if (this.e == null) {
        throw new IOException("LineReader is closed");
      }
    }
    if (this.f >= this.g) {
      b();
    }
    int i = this.f;
    for (;;)
    {
      if (i != this.g)
      {
        if (this.e[i] != 10) {
          break label272;
        }
        if ((i == this.f) || (this.e[(i - 1)] != 13)) {
          break label267;
        }
      }
      label267:
      for (int j = i - 1;; j = i)
      {
        Object localObject2 = new String(this.e, this.f, j - this.f, this.d.name());
        this.f = (i + 1);
        return (String)localObject2;
        localObject2 = new ByteArrayOutputStream(this.g - this.f + 80)
        {
          public String toString()
          {
            if ((this.count > 0) && (this.buf[(this.count - 1)] == 13)) {}
            for (int i = this.count - 1;; i = this.count) {
              try
              {
                String str = new String(this.buf, 0, i, c.a(c.this).name());
                return str;
              }
              catch (UnsupportedEncodingException localUnsupportedEncodingException)
              {
                throw new AssertionError(localUnsupportedEncodingException);
              }
            }
          }
        };
        for (;;)
        {
          ((ByteArrayOutputStream)localObject2).write(this.e, this.f, this.g - this.f);
          this.g = -1;
          b();
          i = this.f;
          while (i != this.g)
          {
            if (this.e[i] == 10)
            {
              if (i != this.f) {
                ((ByteArrayOutputStream)localObject2).write(this.e, this.f, i - this.f);
              }
              this.f = (i + 1);
              localObject2 = ((ByteArrayOutputStream)localObject2).toString();
              return (String)localObject2;
            }
            i += 1;
          }
        }
      }
      label272:
      i += 1;
    }
  }
  
  public void close()
  {
    synchronized (this.c)
    {
      if (this.e != null)
      {
        this.e = null;
        this.c.close();
      }
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/a/a/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */