package com.baidu.tts.auth;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.n;
import com.baidu.tts.k.a;
import com.baidu.tts.k.b;
import com.baidu.tts.tools.StringTool;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class c
  implements b<c, a>
{
  private String a;
  private String b;
  private String c;
  
  private boolean a(String paramString1, String paramString2)
  {
    return (!StringTool.isEmpty(paramString1)) && (!StringTool.isEmpty(paramString2));
  }
  
  private String b(String paramString1, String paramString2)
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(new BasicNameValuePair("grant_type", "client_credentials"));
    localLinkedList.add(new BasicNameValuePair("client_id", paramString1));
    localLinkedList.add(new BasicNameValuePair("client_secret", paramString2));
    paramString1 = URLEncodedUtils.format(localLinkedList, "utf-8");
    return "https://openapi.baidu.com/oauth/2.0/token?" + paramString1;
  }
  
  public int a(c paramc)
  {
    int j = 1;
    String str = paramc.a();
    int i;
    if (StringTool.isEmpty(this.a))
    {
      str = paramc.b();
      paramc = paramc.c();
      LoggerProxy.d("OnlineAuth", "mAK=" + this.b + "--mSK=" + this.c + "--ak2=" + str + "--sk2=" + paramc);
      i = j;
      if (StringTool.isEqual(this.b, str))
      {
        i = j;
        if (StringTool.isEqual(this.c, paramc)) {
          i = 0;
        }
      }
    }
    do
    {
      return i;
      LoggerProxy.d("OnlineAuth", "mProductId=" + this.a + "--productId2=" + str);
      i = j;
    } while (str == null);
    return this.a.compareTo(str);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public a d()
  {
    LoggerProxy.d("OnlineAuth", "enter online auth");
    a locala = new a();
    if (StringTool.isEmpty(this.a)) {}
    for (;;)
    {
      try
      {
        Object localObject = new DefaultHttpClient();
        if (!a(this.b, this.c)) {
          continue;
        }
        String str = b(this.b, this.c);
        LoggerProxy.d("OnlineAuth", "url=" + str);
        localObject = ((HttpClient)localObject).execute(new HttpPost(str));
        str = EntityUtils.toString(((HttpResponse)localObject).getEntity());
        int i = ((HttpResponse)localObject).getStatusLine().getStatusCode();
        LoggerProxy.d("OnlineAuth", "body=" + str + "--code=" + i);
        if (i != 200) {
          continue;
        }
        localObject = new JSONObject(str);
        if (!((JSONObject)localObject).has("access_token")) {
          continue;
        }
        locala.b(((JSONObject)localObject).getString("access_token"));
        if (((JSONObject)localObject).has("expires_in"))
        {
          i = ((JSONObject)localObject).getInt("expires_in");
          locala.a(System.nanoTime() + Math.min(i, 86400L) * 1000000000L);
        }
      }
      catch (Exception localException)
      {
        locala.a(com.baidu.tts.h.a.c.a().a(n.a, localException));
        continue;
        locala.a(com.baidu.tts.h.a.c.a().b(n.a));
        continue;
        locala.a(com.baidu.tts.h.a.c.a().b(n.Y));
        continue;
      }
      LoggerProxy.d("OnlineAuth", "end online auth");
      return locala;
      locala.a(com.baidu.tts.h.a.c.a().b(n.a));
      continue;
      locala.a(this.a);
    }
  }
  
  public static class a
    implements a
  {
    private String a;
    private String b;
    private long c;
    private TtsError d;
    
    public String a()
    {
      return this.b;
    }
    
    public void a(long paramLong)
    {
      this.c = paramLong;
    }
    
    public void a(TtsError paramTtsError)
    {
      if (paramTtsError != null) {
        LoggerProxy.d("OnlineAuth", "this=" + this + "--error=" + paramTtsError.getDetailMessage());
      }
      this.d = paramTtsError;
    }
    
    public void a(String paramString)
    {
      this.a = paramString;
    }
    
    public TtsError b()
    {
      return this.d;
    }
    
    public void b(String paramString)
    {
      this.b = paramString;
    }
    
    public boolean g()
    {
      if (StringTool.isEmpty(this.a))
      {
        if (this.b == null) {}
        while (System.currentTimeMillis() >= this.c) {
          return false;
        }
        return true;
      }
      return true;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/auth/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */