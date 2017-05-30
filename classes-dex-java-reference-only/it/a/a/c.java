package it.a.a;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

class c
  extends l
{
  private final b a;
  
  c(b paramb) {}
  
  public Socket a()
  {
    Socket localSocket2 = super.a();
    Socket localSocket1 = localSocket2;
    if (b.a(this.a)) {}
    try
    {
      localSocket1 = b.a(this.a, localSocket2, localSocket2.getInetAddress().getHostName(), localSocket2.getPort());
      return localSocket1;
    }
    catch (IOException localIOException) {}
    try
    {
      localSocket2.close();
      throw new j(localIOException);
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */