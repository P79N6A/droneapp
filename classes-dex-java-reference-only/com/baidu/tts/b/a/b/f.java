package com.baidu.tts.b.a.b;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.auth.c.a;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.l;
import com.baidu.tts.f.n;
import com.baidu.tts.f.o;
import com.baidu.tts.loopj.SyncHttpClient;
import com.baidu.tts.m.d;
import com.baidu.tts.m.e;
import com.baidu.tts.m.i;
import com.baidu.tts.tools.CommonUtility;
import com.baidu.tts.tools.StringTool;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

public class f
  extends a
{
  private b b;
  
  private com.baidu.tts.m.h a(int paramInt, c paramc, i parami)
  {
    com.baidu.tts.m.h localh = com.baidu.tts.m.h.b(parami);
    Object localObject = (b)this.b.A();
    paramc = new a(paramInt, paramc, parami, (b)localObject, localh);
    parami = new FutureTask(paramc);
    new Thread(parami).start();
    long l = ((b)localObject).o();
    try
    {
      localObject = (com.baidu.tts.m.h)parami.get(l, TimeUnit.MILLISECONDS);
      return (com.baidu.tts.m.h)localObject;
    }
    catch (InterruptedException localInterruptedException)
    {
      Thread.currentThread().interrupt();
      parami.cancel(true);
      paramc.b();
      throw localInterruptedException;
    }
    catch (ExecutionException paramc)
    {
      localInterruptedException.a(com.baidu.tts.h.a.c.a().a(n.n, paramc.getCause()));
      return localInterruptedException;
    }
    catch (TimeoutException localTimeoutException)
    {
      LoggerProxy.d("OnlineSynthesizer", "startOnceHttpRequest timeout");
      parami.cancel(true);
      paramc.b();
      localInterruptedException.a(com.baidu.tts.h.a.c.a().a(n.o, localTimeoutException));
    }
    return localInterruptedException;
  }
  
  private HttpEntity a(int paramInt, String paramString, i parami, b paramb)
  {
    if (paramb == null) {
      return null;
    }
    localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.W.a(), String.valueOf(paramInt)));
    localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.V.a(), paramString));
    localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.B.b(), "Android"));
    Object localObject = com.baidu.tts.h.b.b.a();
    paramString = ((com.baidu.tts.h.b.b)localObject).j();
    localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.aa.a(), paramString));
    String str = paramb.d();
    if (!StringTool.isEmpty(str)) {
      localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.N.a(), str));
    }
    parami.c(paramb.p());
    paramString = parami.d();
    if (paramInt == 1) {}
    for (;;)
    {
      try
      {
        parami = URLEncoder.encode(parami.c(), paramString);
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.X.a(), parami));
        parami = ((com.baidu.tts.h.b.b)localObject).a(com.baidu.tts.f.g.Y.a());
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.Y.a(), parami));
        parami = ((com.baidu.tts.h.b.b)localObject).i();
        if (parami != null) {
          localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.Z.a(), parami));
        }
        if (StringTool.isEmpty(str))
        {
          LoggerProxy.d("OnlineSynthesizer", "before online auth");
          parami = com.baidu.tts.auth.a.a().a(paramb);
          LoggerProxy.d("OnlineSynthesizer", "after online auth");
          if (!parami.g()) {
            continue;
          }
          parami = parami.a();
          localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.ai.a(), parami));
        }
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.G.a(), paramb.q()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.I.a(), paramb.c()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.J.a(), paramb.e()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.K.a(), paramb.f()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.ab.a(), paramb.g()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.ac.a(), paramb.h()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.L.a(), paramb.i()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.M.a(), paramb.j()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.ad.a(), paramb.k()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.ae.a(), paramb.l()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.F.a(), paramb.r()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.C.a(), paramb.u()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.E.a(), paramb.v()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.D.a(), paramb.w()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.S.a(), paramb.s()));
      }
      catch (UnsupportedEncodingException parami)
      {
        parami.printStackTrace();
        continue;
        LoggerProxy.d("OnlineSynthesizer", "request params: " + parami);
        paramString = new UrlEncodedFormEntity(localArrayList, paramString);
        continue;
      }
      try
      {
        parami = new StringBuffer();
        paramb = localArrayList.iterator();
        if (!paramb.hasNext()) {
          continue;
        }
        localObject = (NameValuePair)paramb.next();
        parami.append(((NameValuePair)localObject).getName());
        parami.append("=");
        parami.append(((NameValuePair)localObject).getValue());
        parami.append(",");
        continue;
        return paramString;
      }
      catch (UnsupportedEncodingException paramString)
      {
        paramString.printStackTrace();
        paramString = null;
      }
    }
    throw new com.baidu.tts.q.a();
  }
  
  public int a(e parame)
  {
    return n.k.b();
  }
  
  public int a(com.baidu.tts.m.f paramf)
  {
    return n.k.b();
  }
  
  public int a(com.baidu.tts.m.g paramg)
  {
    return n.k.b();
  }
  
  public TtsError a(i parami)
  {
    try
    {
      parami = new d(parami).a();
      return parami;
    }
    catch (InterruptedException parami)
    {
      throw parami;
    }
    catch (Exception parami) {}
    return com.baidu.tts.h.a.c.a().a(n.j, parami);
  }
  
  public <OnlineSynthesizerParams> void a(OnlineSynthesizerParams paramOnlineSynthesizerParams)
  {
    this.b = ((b)paramOnlineSynthesizerParams);
  }
  
  public int b(e parame)
  {
    return n.k.b();
  }
  
  private class a
    implements Callable<com.baidu.tts.m.h>
  {
    private int b;
    private f.c c;
    private i d;
    private f.b e;
    private com.baidu.tts.m.h f;
    private SyncHttpClient g;
    
    public a(int paramInt, f.c paramc, i parami, f.b paramb, com.baidu.tts.m.h paramh)
    {
      this.b = paramInt;
      this.c = paramc;
      this.d = parami;
      this.e = paramb;
      this.f = paramh;
    }
    
    public com.baidu.tts.m.h a()
    {
      for (;;)
      {
        h localh;
        TtsError localTtsError;
        try
        {
          Object localObject = f.a(f.this, this.b, this.c.a, this.d, this.e);
          this.g = new SyncHttpClient();
          int i = this.e.m();
          int j = this.e.n();
          this.g.setMaxRetriesAndTimeout(i, j);
          i = this.e.o();
          LoggerProxy.d("OnlineSynthesizer", "timeout=" + i);
          this.g.setTimeout(i);
          localh = new h(this.f);
          localh.a(this.e);
          if (this.b == 1)
          {
            this.c.b = o.a.b();
            LoggerProxy.d("OnlineSynthesizer", "serverIp=" + this.c.b);
          }
          if (this.c.b == null)
          {
            localObject = com.baidu.tts.h.a.c.a().b(n.q);
            this.f.a((TtsError)localObject);
            return this.f;
          }
        }
        catch (com.baidu.tts.q.a locala)
        {
          localTtsError = com.baidu.tts.h.a.c.a().b(n.h);
          this.f.a(localTtsError);
          return this.f;
        }
        if (!Thread.currentThread().isInterrupted())
        {
          LoggerProxy.d("OnlineSynthesizer", "before post");
          this.g.post(null, this.c.b, localTtsError, null, localh);
          LoggerProxy.d("OnlineSynthesizer", "after post");
        }
      }
    }
    
    public void b()
    {
      if (this.g != null) {
        this.g.stop();
      }
    }
  }
  
  public static class b
    extends d<b>
  {
    private static Set<String> p = new HashSet();
    private String a;
    private com.baidu.tts.f.b b = com.baidu.tts.f.b.b;
    private com.baidu.tts.f.c c = com.baidu.tts.f.c.f;
    private String d = "0";
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private int m = 5;
    private int n = 1000;
    private int o = l.a.b();
    
    static
    {
      p.add(com.baidu.tts.f.g.C.b());
    }
    
    public int a(com.baidu.tts.f.b paramb)
    {
      if (paramb != null)
      {
        this.b = paramb;
        return 0;
      }
      return n.Y.b();
    }
    
    public String a()
    {
      return this.k;
    }
    
    public void a(int paramInt)
    {
      this.m = paramInt;
    }
    
    public void a(com.baidu.tts.f.c paramc)
    {
      this.c = paramc;
    }
    
    public void a(String paramString)
    {
      this.k = paramString;
    }
    
    public String b()
    {
      return this.l;
    }
    
    public void b(int paramInt)
    {
      this.n = paramInt;
    }
    
    public void b(String paramString)
    {
      this.l = paramString;
    }
    
    public String c()
    {
      return this.b.a();
    }
    
    public void c(int paramInt)
    {
      this.o = paramInt;
    }
    
    public void c(String paramString)
    {
      this.a = paramString;
    }
    
    public String d()
    {
      return this.a;
    }
    
    public void d(String paramString)
    {
      this.d = paramString;
    }
    
    public String e()
    {
      return this.c.a();
    }
    
    public void e(String paramString)
    {
      this.g = paramString;
    }
    
    public String f()
    {
      return this.d;
    }
    
    public void f(String paramString)
    {
      this.h = paramString;
    }
    
    public String g()
    {
      return this.e;
    }
    
    public void g(String paramString)
    {
      this.i = paramString;
    }
    
    public String h()
    {
      return this.f;
    }
    
    public void h(String paramString)
    {
      this.j = paramString;
    }
    
    public String i()
    {
      return this.g;
    }
    
    public String j()
    {
      return this.h;
    }
    
    public String k()
    {
      return this.i;
    }
    
    public String l()
    {
      return this.j;
    }
    
    public int m()
    {
      return this.m;
    }
    
    public int n()
    {
      return this.n;
    }
    
    public int o()
    {
      return this.o;
    }
  }
  
  private class c
  {
    String a = CommonUtility.generateSerialNumber();
    String b;
    
    public c() {}
  }
  
  private class d
    implements Callable<TtsError>
  {
    private i b;
    private f.c c;
    
    public d(i parami)
    {
      this.b = parami;
      this.c = new f.c(f.this);
    }
    
    private boolean a(com.baidu.tts.m.h paramh)
    {
      if (paramh == null) {}
      while ((paramh.f() != null) || (paramh.a() != 0)) {
        return false;
      }
      return true;
    }
    
    private boolean b(com.baidu.tts.m.h paramh)
    {
      return (!a(paramh)) || (paramh.b() < 0);
    }
    
    public TtsError a()
    {
      int i = 0;
      com.baidu.tts.m.h localh;
      do
      {
        i += 1;
        LoggerProxy.d("OnlineSynthesizer", "count=" + i);
        localh = f.a(f.this, i, this.c, this.b);
        if (a(localh)) {
          f.this.a(localh);
        }
      } while (!b(localh));
      if (localh == null) {
        return com.baidu.tts.h.a.c.a().b(n.j);
      }
      return localh.f();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/b/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */