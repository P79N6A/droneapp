package com.fimi.soul.drone.droneconnection.connection.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.fimi.kernel.utils.x;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.utils.NetUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public abstract class b
  extends com.fimi.soul.drone.droneconnection.connection.d
{
  private static final int a = 20000;
  private static final String n = ;
  private static final String o = "client.bks";
  private static final String p = "ca.bks";
  private Socket h;
  private BufferedOutputStream i;
  private BufferedInputStream j;
  private String k;
  private int l;
  private String m = null;
  private SSLContext q = null;
  
  private void k()
  {
    this.l = a();
    this.k = b();
    InetAddress localInetAddress = InetAddress.getByName(this.k);
    this.m = localInetAddress.toString();
    this.h = new Socket();
    this.h.setReuseAddress(true);
    this.h.setSoLinger(true, 0);
    this.h.connect(new InetSocketAddress(localInetAddress, this.l), 20000);
    this.h.setTrafficClass(20);
    if (this.h.isConnected())
    {
      this.i = new BufferedOutputStream(this.h.getOutputStream());
      this.j = new BufferedInputStream(this.h.getInputStream());
    }
  }
  
  protected abstract int a();
  
  public final int b(byte[] paramArrayOfByte)
  {
    int i1 = -1;
    if (this.j != null) {
      i1 = this.j.read(paramArrayOfByte);
    }
    return i1;
  }
  
  protected abstract String b();
  
  public void c()
  {
    this.l = a();
    this.k = b();
    try
    {
      this.m = InetAddress.getByName(this.k).toString();
      this.q = SSLContext.getInstance("SSL");
      Object localObject2 = KeyStore.getInstance("BKS");
      ((KeyStore)localObject2).load(DroidPlannerApp.g().getResources().getAssets().open("client.bks"), n.toCharArray());
      KeyStore localKeyStore = KeyStore.getInstance("BKS");
      localKeyStore.load(DroidPlannerApp.g().getResources().getAssets().open("ca.bks"), n.toCharArray());
      Object localObject1 = KeyManagerFactory.getInstance("X509");
      ((KeyManagerFactory)localObject1).init((KeyStore)localObject2, n.toCharArray());
      TrustManagerFactory.getInstance("X509").init(localKeyStore);
      localObject2 = new a(localKeyStore);
      new b();
      this.q.init(((KeyManagerFactory)localObject1).getKeyManagers(), new TrustManager[] { localObject2 }, null);
      localObject1 = (SSLSocket)this.q.getSocketFactory().createSocket(this.k, this.l);
      ((SSLSocket)localObject1).setTrafficClass(20);
      ((SSLSocket)localObject1).addHandshakeCompletedListener(new HandshakeCompletedListener()
      {
        public void handshakeCompleted(HandshakeCompletedEvent paramAnonymousHandshakeCompletedEvent) {}
      });
      ((SSLSocket)localObject1).startHandshake();
      this.h = ((Socket)localObject1);
      if ((this.h != null) && (this.h.isConnected()))
      {
        this.i = new BufferedOutputStream(this.h.getOutputStream());
        this.j = new BufferedInputStream(this.h.getInputStream());
      }
      return;
    }
    catch (Exception localException)
    {
      h();
    }
  }
  
  public final void d()
  {
    if (!com.fimi.soul.biz.e.d.a().k())
    {
      k();
      return;
    }
    c();
  }
  
  public final void d(final byte[] paramArrayOfByte)
  {
    x.a(new Runnable()
    {
      public void run()
      {
        if ((b.a(b.this) != null) && (b.a(b.this) != null)) {}
        try
        {
          b.a(b.this).write(paramArrayOfByte);
          b.a(b.this).flush();
          return;
        }
        catch (IOException localIOException)
        {
          b.this.h();
        }
      }
    });
  }
  
  public final void e()
  {
    if (this.h != null) {
      new Thread()
      {
        public void run()
        {
          try
          {
            if (b.b(b.this) != null) {
              b.b(b.this).close();
            }
            if (b.a(b.this) != null) {
              b.a(b.this).close();
            }
            if (b.c(b.this) != null) {
              b.c(b.this).close();
            }
            b.a(b.this, null);
            b.a(b.this, null);
            b.a(b.this, null);
            return;
          }
          catch (Exception localException) {}
        }
      }.start();
    }
  }
  
  public final int j()
  {
    return 3;
  }
  
  public class a
    implements X509TrustManager
  {
    private X509TrustManager b = null;
    
    public a(KeyStore paramKeyStore)
    {
      this$1 = TrustManagerFactory.getInstance("X509");
      b.this.init(paramKeyStore);
      this$1 = b.this.getTrustManagers();
      if (b.this.length == 0) {
        throw new NoSuchAlgorithmException("no trust manager found");
      }
      this.b = ((X509TrustManager)b.this[0]);
    }
    
    public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
    {
      this.b.checkClientTrusted(paramArrayOfX509Certificate, paramString);
    }
    
    public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
    {
      if (paramArrayOfX509Certificate != null)
      {
        int i = 0;
        while (i < paramArrayOfX509Certificate.length)
        {
          paramArrayOfX509Certificate[i].checkValidity();
          i += 1;
        }
      }
      this.b.checkServerTrusted(paramArrayOfX509Certificate, paramString);
    }
    
    public X509Certificate[] getAcceptedIssuers()
    {
      return this.b.getAcceptedIssuers();
    }
  }
  
  public class b
    implements X509TrustManager
  {
    public b() {}
    
    public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {}
    
    public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {}
    
    public X509Certificate[] getAcceptedIssuers()
    {
      return null;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/droneconnection/connection/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */