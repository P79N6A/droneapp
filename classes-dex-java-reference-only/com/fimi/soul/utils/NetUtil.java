package com.fimi.soul.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import com.fimi.kernel.utils.f;
import com.fimi.kernel.utils.v;
import com.fimi.soul.base.a;
import com.fimi.soul.entity.User;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.a.a.f.b.b;
import org.a.a.f.c.g;
import org.a.a.f.c.h;
import org.a.a.f.c.i;
import org.a.a.i.b.s;
import org.a.a.i.b.t;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

public class NetUtil
{
  public static String a;
  public static Header b;
  public static final String c = "admin";
  private static NetUtil d;
  
  static
  {
    System.loadLibrary("server-jni");
  }
  
  public static NetUtil a()
  {
    if (d == null) {
      d = new NetUtil();
    }
    return d;
  }
  
  /* Error */
  public static String a(String paramString, List<NameValuePair> paramList, Context paramContext)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 41	com/fimi/soul/utils/NetUtil:b	(Ljava/util/List;)Ljava/lang/String;
    //   4: invokestatic 44	com/fimi/soul/utils/NetUtil:a	(Ljava/lang/String;)Z
    //   7: ifeq +6 -> 13
    //   10: ldc 46
    //   12: astore_0
    //   13: aload_2
    //   14: invokestatic 51	com/fimi/kernel/utils/v:a	(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;
    //   17: pop
    //   18: aload_1
    //   19: aload_2
    //   20: invokestatic 54	com/fimi/soul/utils/NetUtil:a	(Ljava/util/List;Landroid/content/Context;)V
    //   23: new 56	org/apache/http/client/methods/HttpPost
    //   26: dup
    //   27: aload_0
    //   28: invokespecial 58	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   31: astore_2
    //   32: aload_1
    //   33: ifnull +26 -> 59
    //   36: aload_1
    //   37: invokeinterface 64 1 0
    //   42: ifle +17 -> 59
    //   45: aload_2
    //   46: new 66	org/apache/http/client/entity/UrlEncodedFormEntity
    //   49: dup
    //   50: aload_1
    //   51: ldc 68
    //   53: invokespecial 71	org/apache/http/client/entity/UrlEncodedFormEntity:<init>	(Ljava/util/List;Ljava/lang/String;)V
    //   56: invokevirtual 77	org/apache/http/client/methods/HttpEntityEnclosingRequestBase:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   59: invokestatic 80	com/fimi/soul/utils/NetUtil:b	()Lorg/apache/http/client/HttpClient;
    //   62: astore_1
    //   63: ldc 46
    //   65: astore_0
    //   66: aload_1
    //   67: aload_2
    //   68: invokeinterface 86 2 0
    //   73: astore_2
    //   74: aload_2
    //   75: ldc 88
    //   77: invokeinterface 94 2 0
    //   82: putstatic 96	com/fimi/soul/utils/NetUtil:b	Lorg/apache/http/Header;
    //   85: aload_2
    //   86: invokeinterface 100 1 0
    //   91: invokeinterface 105 1 0
    //   96: sipush 200
    //   99: if_icmpne +42 -> 141
    //   102: aload_2
    //   103: invokeinterface 109 1 0
    //   108: ldc 111
    //   110: invokestatic 117	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    //   113: invokestatic 121	com/fimi/soul/utils/NetUtil:getNetKey	()Ljava/lang/String;
    //   116: invokestatic 126	com/fimi/kernel/utils/r:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   119: astore_0
    //   120: aload_1
    //   121: invokeinterface 130 1 0
    //   126: invokeinterface 135 1 0
    //   131: aload_0
    //   132: areturn
    //   133: astore_0
    //   134: aload_0
    //   135: invokevirtual 138	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   138: goto -79 -> 59
    //   141: ldc -116
    //   143: ldc 2
    //   145: invokestatic 145	com/fimi/soul/base/a:a	(Ljava/lang/String;Ljava/lang/Class;)V
    //   148: goto -28 -> 120
    //   151: astore_0
    //   152: aload_0
    //   153: invokevirtual 146	java/lang/Exception:printStackTrace	()V
    //   156: aload_1
    //   157: invokeinterface 130 1 0
    //   162: invokeinterface 135 1 0
    //   167: ldc 46
    //   169: areturn
    //   170: astore_0
    //   171: aload_1
    //   172: invokeinterface 130 1 0
    //   177: invokeinterface 135 1 0
    //   182: aload_0
    //   183: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	paramString	String
    //   0	184	1	paramList	List<NameValuePair>
    //   0	184	2	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   36	59	133	java/io/UnsupportedEncodingException
    //   66	120	151	java/lang/Exception
    //   141	148	151	java/lang/Exception
    //   66	120	170	finally
    //   141	148	170	finally
    //   152	156	170	finally
  }
  
  public static String a(String paramString, List<NameValuePair> paramList, Context paramContext, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return a(paramString, paramList, paramContext);
    }
    a(paramList, paramContext);
    new v(paramContext);
    paramContext = paramString;
    if (paramList != null)
    {
      paramContext = paramString;
      if (paramList.size() > 0) {
        paramContext = paramString + "?" + URLEncodedUtils.format(paramList, "UTF-8");
      }
    }
    DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient();
    localDefaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(30000));
    localDefaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(120000));
    paramString = new HttpGet(paramContext);
    for (;;)
    {
      try
      {
        paramString = localDefaultHttpClient.execute(paramString);
        i = paramString.getStatusLine().getStatusCode();
        b = paramString.getFirstHeader("Content-Encoding");
        if (i != 200) {
          break label327;
        }
        paramList = localDefaultHttpClient.getCookieStore().getCookies();
        i = 0;
        if (i < paramList.size())
        {
          if ("JSESSIONID".equals(((Cookie)paramList.get(i)).getName())) {
            a = ((Cookie)paramList.get(i)).getValue();
          }
        }
        else {
          paramString = EntityUtils.toString(paramString.getEntity(), "utf-8");
        }
      }
      catch (Exception paramList)
      {
        int i;
        paramString = "";
        paramList.printStackTrace();
        return paramString;
      }
      finally
      {
        localDefaultHttpClient.getConnectionManager().shutdown();
      }
      try
      {
        a.a("data... json: " + paramString, NetUtil.class);
        localDefaultHttpClient.getConnectionManager().shutdown();
        return paramString;
      }
      catch (Exception paramList)
      {
        continue;
      }
      i += 1;
      continue;
      label327:
      paramString = "";
    }
  }
  
  public static String a(List<NameValuePair> paramList)
  {
    TreeMap localTreeMap = new TreeMap();
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject;
    if ((paramList != null) && (paramList.size() > 0))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localObject = (NameValuePair)paramList.next();
        localTreeMap.put(((NameValuePair)localObject).getName(), ((NameValuePair)localObject).getValue());
      }
    }
    if ((localTreeMap == null) || (localTreeMap.size() == 0)) {
      return null;
    }
    paramList = localTreeMap.keySet().iterator();
    while (paramList.hasNext())
    {
      localObject = (String)paramList.next();
      if ((localTreeMap.get(localObject) != null) && (localTreeMap.get(localObject) != "")) {
        localStringBuffer.append((String)localObject + "=" + (String)localTreeMap.get(localObject) + "&");
      }
    }
    paramList = localStringBuffer.toString() + "key=";
    try
    {
      paramList = at.a(URLEncoder.encode(paramList, "utf-8"), getServerTokenKey()).toUpperCase();
      return paramList;
    }
    catch (UnsupportedEncodingException paramList)
    {
      paramList.printStackTrace();
    }
    return null;
  }
  
  public static void a(List<NameValuePair> paramList, Context paramContext)
  {
    paramList.add(new BasicNameValuePair("req", f.a(new Date(), "yyyyMMddHHmmss") + (int)(Math.random() * 1000000.0D) + "10"));
    paramList.add(new BasicNameValuePair("channel", "android"));
    paramList.add(new BasicNameValuePair("deviceID", ao.g(paramContext)));
    if (a.b(paramContext).getUserID().equals("")) {}
    for (String str = "0";; str = a.b(paramContext).getUserID())
    {
      paramList.add(new BasicNameValuePair("visitID", str));
      paramList.add(new BasicNameValuePair("local", ao.d()));
      paramList.add(new BasicNameValuePair("appVersion", ao.d(paramContext)));
      paramList.add(new BasicNameValuePair("encrypt", "0"));
      paramList.add(new BasicNameValuePair("signMsg", a(paramList)));
      return;
    }
  }
  
  public static boolean a(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext == null) {
      return false;
    }
    paramContext = paramContext.getAllNetworkInfo();
    if (paramContext != null)
    {
      int j = paramContext.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = paramContext[i];
        if ((((NetworkInfo)localObject).isAvailable()) && (((NetworkInfo)localObject).getState() == NetworkInfo.State.CONNECTED)) {
          return true;
        }
        i += 1;
      }
    }
    return false;
    return false;
  }
  
  private static boolean a(String paramString)
  {
    boolean bool = false;
    n[] arrayOfn = n.values();
    int j = arrayOfn.length;
    int i = 0;
    while (i < j)
    {
      if (arrayOfn[i].toString().equals(paramString)) {
        bool = true;
      }
      i += 1;
    }
    return bool;
  }
  
  public static String b(String paramString, List<NameValuePair> paramList, Context paramContext)
  {
    return a(paramString, paramList, paramContext);
  }
  
  public static String b(List<NameValuePair> paramList)
  {
    Iterator localIterator = null;
    Object localObject2 = null;
    Object localObject1 = localIterator;
    if (paramList != null)
    {
      localObject1 = localIterator;
      if (paramList.size() > 0)
      {
        localIterator = paramList.iterator();
        paramList = (List<NameValuePair>)localObject2;
        localObject1 = paramList;
        if (localIterator.hasNext())
        {
          localObject1 = (NameValuePair)localIterator.next();
          if (!((NameValuePair)localObject1).getName().equals("commandCode")) {
            break label78;
          }
          paramList = ((NameValuePair)localObject1).getValue();
        }
      }
    }
    label78:
    for (;;)
    {
      break;
      return (String)localObject1;
    }
  }
  
  private static HttpClient b()
  {
    try
    {
      Object localObject = new g(i.c().a().a(null, new org.a.a.f.c.n()
      {
        public boolean a(X509Certificate[] paramAnonymousArrayOfX509Certificate, String paramAnonymousString)
        {
          return true;
        }
      }).c());
      localObject = t.a().a((b)localObject).i();
      return (HttpClient)localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localNoSuchAlgorithmException.printStackTrace();
      return null;
    }
    catch (KeyManagementException localKeyManagementException)
    {
      localKeyManagementException.printStackTrace();
      return null;
    }
    catch (KeyStoreException localKeyStoreException)
    {
      localKeyStoreException.printStackTrace();
    }
    return null;
  }
  
  public static native String getLogTokenKey();
  
  public static native String getNetKey();
  
  public static native String getSSL1234Key();
  
  public static native String getServerTokenKey();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/NetUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */