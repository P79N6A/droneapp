package com.android.volley.toolbox;

import com.android.volley.n;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public class j
  implements i
{
  private static final String a = "Content-Type";
  private final a b;
  private final SSLSocketFactory c;
  
  public j()
  {
    this(null);
  }
  
  public j(a parama)
  {
    this(parama, null);
  }
  
  public j(a parama, SSLSocketFactory paramSSLSocketFactory)
  {
    this.b = parama;
    this.c = paramSSLSocketFactory;
  }
  
  private HttpURLConnection a(URL paramURL, n<?> paramn)
  {
    HttpURLConnection localHttpURLConnection = a(paramURL);
    int i = paramn.y();
    localHttpURLConnection.setConnectTimeout(i);
    localHttpURLConnection.setReadTimeout(i);
    localHttpURLConnection.setUseCaches(false);
    localHttpURLConnection.setDoInput(true);
    if (("https".equals(paramURL.getProtocol())) && (this.c != null)) {
      ((HttpsURLConnection)localHttpURLConnection).setSSLSocketFactory(this.c);
    }
    return localHttpURLConnection;
  }
  
  private static HttpEntity a(HttpURLConnection paramHttpURLConnection)
  {
    BasicHttpEntity localBasicHttpEntity = new BasicHttpEntity();
    try
    {
      InputStream localInputStream1 = paramHttpURLConnection.getInputStream();
      localBasicHttpEntity.setContent(localInputStream1);
      localBasicHttpEntity.setContentLength(paramHttpURLConnection.getContentLength());
      localBasicHttpEntity.setContentEncoding(paramHttpURLConnection.getContentEncoding());
      localBasicHttpEntity.setContentType(paramHttpURLConnection.getContentType());
      return localBasicHttpEntity;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        InputStream localInputStream2 = paramHttpURLConnection.getErrorStream();
      }
    }
  }
  
  static void a(HttpURLConnection paramHttpURLConnection, n<?> paramn)
  {
    switch (paramn.a())
    {
    default: 
      throw new IllegalStateException("Unknown method type.");
    case -1: 
      byte[] arrayOfByte = paramn.r();
      if (arrayOfByte != null)
      {
        paramHttpURLConnection.setDoOutput(true);
        paramHttpURLConnection.setRequestMethod("POST");
        paramHttpURLConnection.addRequestProperty("Content-Type", paramn.q());
        paramHttpURLConnection = new DataOutputStream(paramHttpURLConnection.getOutputStream());
        paramHttpURLConnection.write(arrayOfByte);
        paramHttpURLConnection.close();
      }
      return;
    case 0: 
      paramHttpURLConnection.setRequestMethod("GET");
      return;
    case 3: 
      paramHttpURLConnection.setRequestMethod("DELETE");
      return;
    case 1: 
      paramHttpURLConnection.setRequestMethod("POST");
      b(paramHttpURLConnection, paramn);
      return;
    case 2: 
      paramHttpURLConnection.setRequestMethod("PUT");
      b(paramHttpURLConnection, paramn);
      return;
    case 4: 
      paramHttpURLConnection.setRequestMethod("HEAD");
      return;
    case 5: 
      paramHttpURLConnection.setRequestMethod("OPTIONS");
      return;
    case 6: 
      paramHttpURLConnection.setRequestMethod("TRACE");
      return;
    }
    paramHttpURLConnection.setRequestMethod("PATCH");
    b(paramHttpURLConnection, paramn);
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 != 4) && ((100 > paramInt2) || (paramInt2 >= 200)) && (paramInt2 != 204) && (paramInt2 != 304);
  }
  
  private static void b(HttpURLConnection paramHttpURLConnection, n<?> paramn)
  {
    byte[] arrayOfByte = paramn.v();
    if (arrayOfByte != null)
    {
      paramHttpURLConnection.setDoOutput(true);
      paramHttpURLConnection.addRequestProperty("Content-Type", paramn.u());
      paramHttpURLConnection = new DataOutputStream(paramHttpURLConnection.getOutputStream());
      paramHttpURLConnection.write(arrayOfByte);
      paramHttpURLConnection.close();
    }
  }
  
  protected HttpURLConnection a(URL paramURL)
  {
    return (HttpURLConnection)paramURL.openConnection();
  }
  
  public HttpResponse a(n<?> paramn, Map<String, String> paramMap)
  {
    Object localObject1 = paramn.g();
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(paramn.n());
    localHashMap.putAll(paramMap);
    if (this.b != null)
    {
      localObject2 = this.b.a((String)localObject1);
      paramMap = (Map<String, String>)localObject2;
      if (localObject2 == null) {
        throw new IOException("URL blocked by rewriter: " + (String)localObject1);
      }
    }
    else
    {
      paramMap = (Map<String, String>)localObject1;
    }
    paramMap = a(new URL(paramMap), paramn);
    localObject1 = localHashMap.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      paramMap.addRequestProperty((String)localObject2, (String)localHashMap.get(localObject2));
    }
    a(paramMap, paramn);
    localObject1 = new ProtocolVersion("HTTP", 1, 1);
    if (paramMap.getResponseCode() == -1) {
      throw new IOException("Could not retrieve response code from HttpUrlConnection.");
    }
    Object localObject2 = new BasicStatusLine((ProtocolVersion)localObject1, paramMap.getResponseCode(), paramMap.getResponseMessage());
    localObject1 = new BasicHttpResponse((StatusLine)localObject2);
    if (a(paramn.a(), ((StatusLine)localObject2).getStatusCode())) {
      ((BasicHttpResponse)localObject1).setEntity(a(paramMap));
    }
    paramn = paramMap.getHeaderFields().entrySet().iterator();
    while (paramn.hasNext())
    {
      paramMap = (Map.Entry)paramn.next();
      if (paramMap.getKey() != null) {
        ((BasicHttpResponse)localObject1).addHeader(new BasicHeader((String)paramMap.getKey(), (String)((List)paramMap.getValue()).get(0)));
      }
    }
    return (HttpResponse)localObject1;
  }
  
  public static abstract interface a
  {
    public abstract String a(String paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */