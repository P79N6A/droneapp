package it.a.a;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;

class l
  implements i, Runnable
{
  private ServerSocket a = null;
  private Socket b;
  private IOException c;
  private Thread d;
  
  public l()
  {
    String str = System.getProperty("ftp4j.activeDataTransfer.portRange");
    Object localObject2;
    Object localObject1;
    if (str != null)
    {
      localObject2 = new StringTokenizer(str, "-");
      if (((StringTokenizer)localObject2).countTokens() == 2)
      {
        localObject1 = ((StringTokenizer)localObject2).nextToken();
        localObject2 = ((StringTokenizer)localObject2).nextToken();
      }
    }
    for (;;)
    {
      try
      {
        i = Integer.parseInt((String)localObject1);
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        try
        {
          k = Integer.parseInt((String)localObject2);
          if ((i > 0) && (k > 0) && (k >= i))
          {
            n = 1;
            j = 1;
            m = i;
            i = k;
            if (n == 0) {
              System.err.println("WARNING: invalid value \"" + str + "\" for the " + "ftp4j.activeDataTransfer.portRange" + " system property. The value should " + "be in the start-stop form, with " + "start > 0, stop > 0 and start <= stop.");
            }
            k = j;
            j = i;
            i = m;
            if (k != 0)
            {
              localObject1 = new ArrayList();
              k = i;
              i = i1;
              if (k <= j)
              {
                ((ArrayList)localObject1).add(new Integer(k));
                k += 1;
                continue;
                localNumberFormatException1 = localNumberFormatException1;
                i = 0;
                continue;
              }
            }
          }
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          k = 0;
          continue;
          if (i == 0)
          {
            j = localNumberFormatException2.size();
            if (j > 0)
            {
              j = ((Integer)localNumberFormatException2.remove((int)Math.floor(Math.random() * j))).intValue();
              try
              {
                this.a = new ServerSocket();
                this.a.setReceiveBufferSize(524288);
                this.a.bind(new InetSocketAddress(j));
                i = 1;
              }
              catch (IOException localIOException2)
              {
                continue;
              }
            }
          }
          if (i == 0) {
            throw new j("Cannot open the ServerSocket. No available port found in range " + str);
          }
          try
          {
            this.a = new ServerSocket();
            this.a.setReceiveBufferSize(524288);
            this.a.bind(new InetSocketAddress(0));
            this.d = new Thread(this);
            this.d.start();
            return;
          }
          catch (IOException localIOException1)
          {
            throw new j("Cannot open the ServerSocket", localIOException1);
          }
        }
      }
      int n = 0;
      int i = 0;
      int m = 0;
      int j = 0;
      continue;
      j = 0;
      i = 0;
      int k = 0;
    }
  }
  
  public Socket a()
  {
    if ((this.b == null) && (this.c == null)) {}
    try
    {
      this.d.join();
      if (this.c != null) {
        throw new j("Cannot receive the incoming connection", this.c);
      }
      if (this.b == null) {
        throw new j("No socket available");
      }
      return this.b;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void b()
  {
    if (this.a != null) {}
    try
    {
      this.a.close();
      return;
    }
    catch (IOException localIOException) {}
  }
  
  public int c()
  {
    return this.a.getLocalPort();
  }
  
  public void run()
  {
    int j = 30000;
    String str = System.getProperty("ftp4j.activeDataTransfer.acceptTimeout");
    int i = j;
    int k;
    if (str != null) {
      k = 0;
    }
    try
    {
      i = Integer.parseInt(str);
      if (i >= 0)
      {
        k = 1;
        j = i;
      }
      i = j;
      if (k == 0)
      {
        System.err.println("WARNING: invalid value \"" + str + "\" for the " + "ftp4j.activeDataTransfer.acceptTimeout" + " system property. The value should " + "be an integer greater or equal to 0.");
        i = j;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        try
        {
          this.a.setSoTimeout(i);
          this.b = this.a.accept();
          this.b.setSendBufferSize(524288);
        }
        catch (IOException localIOException1)
        {
          this.c = localIOException1;
          try
          {
            this.a.close();
            return;
          }
          catch (IOException localIOException2)
          {
            return;
          }
        }
        finally
        {
          try
          {
            this.a.close();
            throw ((Throwable)localObject);
          }
          catch (IOException localIOException4)
          {
            continue;
          }
        }
        try
        {
          this.a.close();
          return;
        }
        catch (IOException localIOException3) {}
        localNumberFormatException = localNumberFormatException;
        i = -1;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */