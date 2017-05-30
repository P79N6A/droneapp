package org.a.a.i.f;

import java.io.InputStream;
import java.io.OutputStream;
import org.a.a.h.g;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.conn.EofSensorWatcher;

@org.a.a.a.c
class k
  extends g
  implements EofSensorWatcher
{
  private final c b;
  
  k(HttpEntity paramHttpEntity, c paramc)
  {
    super(paramHttpEntity);
    this.b = paramc;
  }
  
  public static void a(HttpResponse paramHttpResponse, c paramc)
  {
    HttpEntity localHttpEntity = paramHttpResponse.getEntity();
    if ((localHttpEntity != null) && (localHttpEntity.isStreaming()) && (paramc != null)) {
      paramHttpResponse.setEntity(new k(localHttpEntity, paramc));
    }
  }
  
  private void b()
  {
    if (this.b != null) {
      this.b.abortConnection();
    }
  }
  
  public void a()
  {
    if (this.b != null) {}
    try
    {
      if (this.b.b()) {
        this.b.releaseConnection();
      }
      return;
    }
    finally
    {
      b();
    }
  }
  
  @Deprecated
  public void consumeContent()
  {
    a();
  }
  
  public boolean eofDetected(InputStream paramInputStream)
  {
    try
    {
      paramInputStream.close();
      a();
      return false;
    }
    finally
    {
      b();
    }
  }
  
  public InputStream getContent()
  {
    return new org.a.a.f.c(this.a.getContent(), this);
  }
  
  public boolean isRepeatable()
  {
    return false;
  }
  
  public boolean streamAbort(InputStream paramInputStream)
  {
    b();
    return false;
  }
  
  /* Error */
  public boolean streamClosed(InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 16	org/a/a/i/f/k:b	Lorg/a/a/i/f/c;
    //   4: ifnull +31 -> 35
    //   7: aload_0
    //   8: getfield 16	org/a/a/i/f/k:b	Lorg/a/a/i/f/c;
    //   11: invokevirtual 81	org/a/a/i/f/c:e	()Z
    //   14: istore_3
    //   15: iload_3
    //   16: ifne +19 -> 35
    //   19: iconst_1
    //   20: istore_2
    //   21: aload_1
    //   22: invokevirtual 61	java/io/InputStream:close	()V
    //   25: aload_0
    //   26: invokevirtual 53	org/a/a/i/f/k:a	()V
    //   29: aload_0
    //   30: invokespecial 49	org/a/a/i/f/k:b	()V
    //   33: iconst_0
    //   34: ireturn
    //   35: iconst_0
    //   36: istore_2
    //   37: goto -16 -> 21
    //   40: astore_1
    //   41: iload_2
    //   42: ifeq -13 -> 29
    //   45: aload_1
    //   46: athrow
    //   47: astore_1
    //   48: aload_0
    //   49: invokespecial 49	org/a/a/i/f/k:b	()V
    //   52: aload_1
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	k
    //   0	54	1	paramInputStream	InputStream
    //   20	22	2	i	int
    //   14	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   21	29	40	java/net/SocketException
    //   0	15	47	finally
    //   21	29	47	finally
    //   45	47	47	finally
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ResponseEntityProxy{");
    localStringBuilder.append(this.a);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    try
    {
      this.a.writeTo(paramOutputStream);
      a();
      return;
    }
    finally
    {
      b();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/f/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */