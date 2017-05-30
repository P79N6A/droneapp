package it.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLSocketFactory;

public class f
{
  private ArrayList a = new ArrayList();
  private Socket b = null;
  private String c = null;
  private u d = null;
  private v e = null;
  
  public f(Socket paramSocket, String paramString)
  {
    this.b = paramSocket;
    this.c = paramString;
    InputStream localInputStream = paramSocket.getInputStream();
    paramSocket = paramSocket.getOutputStream();
    this.d = new u(localInputStream, paramString);
    this.e = new v(paramSocket, paramString);
  }
  
  private String d()
  {
    String str = this.d.a();
    if (str == null) {
      throw new IOException("FTPConnection closed");
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((g)localIterator.next()).b(str);
    }
    return str;
  }
  
  public void a()
  {
    try
    {
      this.b.close();
      return;
    }
    catch (Exception localException) {}
  }
  
  public void a(g paramg)
  {
    this.a.add(paramg);
  }
  
  public void a(String paramString)
  {
    this.e.b(paramString);
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((g)localIterator.next()).a(paramString);
    }
  }
  
  public void a(SSLSocketFactory paramSSLSocketFactory)
  {
    Object localObject = this.b.getInetAddress().getHostName();
    int i = this.b.getPort();
    this.b = paramSSLSocketFactory.createSocket(this.b, (String)localObject, i, true);
    paramSSLSocketFactory = this.b.getInputStream();
    localObject = this.b.getOutputStream();
    this.d = new u(paramSSLSocketFactory, this.c);
    this.e = new v((OutputStream)localObject, this.c);
  }
  
  public void b(g paramg)
  {
    this.a.remove(paramg);
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
    this.d.a(paramString);
    this.e.a(paramString);
  }
  
  public g[] b()
  {
    int j = this.a.size();
    g[] arrayOfg = new g[j];
    int i = 0;
    while (i < j)
    {
      arrayOfg[i] = ((g)this.a.get(i));
      i += 1;
    }
    return arrayOfg;
  }
  
  public s c()
  {
    int k = 0;
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    Object localObject;
    do
    {
      localObject = d();
    } while (((String)localObject).trim().length() == 0);
    if (((String)localObject).startsWith("\n")) {
      localObject = ((String)localObject).substring(1);
    }
    for (;;)
    {
      int m = ((String)localObject).length();
      if ((i == 0) && (m < 3)) {
        throw new o();
      }
      try
      {
        j = Integer.parseInt(((String)localObject).substring(0, 3));
        if ((i != 0) && (j != 0) && (j != i)) {
          throw new o();
        }
      }
      catch (Exception localException)
      {
        int j;
        for (;;)
        {
          if (i == 0) {
            throw new o();
          }
          j = 0;
        }
        if (i == 0) {
          i = j;
        }
        for (;;)
        {
          if (j > 0)
          {
            if (m > 3)
            {
              j = ((String)localObject).charAt(3);
              localArrayList.add(((String)localObject).substring(4, m));
              if (j != 32) {}
            }
            while (m == 3)
            {
              m = localArrayList.size();
              localObject = new String[m];
              j = k;
              while (j < m)
              {
                localObject[j] = ((String)localArrayList.get(j));
                j += 1;
              }
              if (j == 45) {
                break;
              }
              throw new o();
            }
            localArrayList.add(localObject);
          }
          for (;;)
          {
            break;
            localArrayList.add(localObject);
          }
          return new s(i, (String[])localObject);
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */