package it.a.a;

import java.io.IOException;
import java.net.Socket;

class d
  implements i
{
  private final b c;
  
  d(b paramb, String paramString, int paramInt) {}
  
  public Socket a()
  {
    try
    {
      if (b.b(this.c).a()) {}
      Socket localSocket;
      for (String str = this.a;; str = b.c(this.c))
      {
        localSocket = b.b(this.c).d(str, this.b);
        if (!b.a(this.c)) {
          break;
        }
        return b.a(this.c, localSocket, str, this.b);
      }
      return localSocket;
    }
    catch (IOException localIOException)
    {
      throw new j("Cannot connect to the remote server", localIOException);
    }
  }
  
  public void b() {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */