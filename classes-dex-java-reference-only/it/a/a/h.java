package it.a.a;

import java.net.InetSocketAddress;
import java.net.Socket;

public abstract class h
{
  protected int a = 10;
  protected int b = 10;
  protected int c = 10;
  private boolean d;
  private Socket e;
  
  protected h()
  {
    this(false);
  }
  
  protected h(boolean paramBoolean)
  {
    String str = System.getProperty("ftp4j.passiveDataTransfer.useSuggestedAddress");
    if (("true".equalsIgnoreCase(str)) || ("yes".equalsIgnoreCase(str)) || ("1".equals(str)))
    {
      this.d = true;
      return;
    }
    if (("false".equalsIgnoreCase(str)) || ("no".equalsIgnoreCase(str)) || ("0".equals(str)))
    {
      this.d = false;
      return;
    }
    this.d = paramBoolean;
  }
  
  protected Socket a(String paramString, int paramInt)
  {
    try
    {
      this.e = new Socket();
      this.e.setKeepAlive(true);
      this.e.setSoTimeout(this.b * 1000);
      this.e.setSoLinger(true, this.c);
      this.e.connect(new InetSocketAddress(paramString, paramInt), this.a * 1000);
      paramString = this.e;
      return paramString;
    }
    finally
    {
      this.e = null;
    }
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  boolean a()
  {
    return this.d;
  }
  
  protected Socket b(String paramString, int paramInt)
  {
    Socket localSocket = new Socket();
    localSocket.setSoTimeout(this.b * 1000);
    localSocket.setSoLinger(true, this.c);
    localSocket.setReceiveBufferSize(524288);
    localSocket.setSendBufferSize(524288);
    localSocket.connect(new InetSocketAddress(paramString, paramInt), this.a * 1000);
    return localSocket;
  }
  
  public void b()
  {
    if (this.e != null) {}
    try
    {
      this.e.close();
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public abstract Socket c(String paramString, int paramInt);
  
  public void c(int paramInt)
  {
    this.c = paramInt;
  }
  
  public abstract Socket d(String paramString, int paramInt);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */