package com.android.volley.toolbox;

import com.android.volley.n;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;

public class g
  implements i
{
  private static final String b = "Content-Type";
  protected final HttpClient a;
  
  public g(HttpClient paramHttpClient)
  {
    this.a = paramHttpClient;
  }
  
  private static List<NameValuePair> a(Map<String, String> paramMap)
  {
    ArrayList localArrayList = new ArrayList(paramMap.size());
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new BasicNameValuePair(str, (String)paramMap.get(str)));
    }
    return localArrayList;
  }
  
  private static void a(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, n<?> paramn)
  {
    paramn = paramn.v();
    if (paramn != null) {
      paramHttpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(paramn));
    }
  }
  
  private static void a(HttpUriRequest paramHttpUriRequest, Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramHttpUriRequest.setHeader(str, (String)paramMap.get(str));
    }
  }
  
  static HttpUriRequest b(n<?> paramn, Map<String, String> paramMap)
  {
    switch (paramn.a())
    {
    default: 
      throw new IllegalStateException("Unknown request method.");
    case -1: 
      paramMap = paramn.r();
      if (paramMap != null)
      {
        HttpPost localHttpPost = new HttpPost(paramn.g());
        localHttpPost.addHeader("Content-Type", paramn.q());
        localHttpPost.setEntity(new ByteArrayEntity(paramMap));
        return localHttpPost;
      }
      return new HttpGet(paramn.g());
    case 0: 
      return new HttpGet(paramn.g());
    case 3: 
      return new HttpDelete(paramn.g());
    case 1: 
      paramMap = new HttpPost(paramn.g());
      paramMap.addHeader("Content-Type", paramn.u());
      a(paramMap, paramn);
      return paramMap;
    case 2: 
      paramMap = new HttpPut(paramn.g());
      paramMap.addHeader("Content-Type", paramn.u());
      a(paramMap, paramn);
      return paramMap;
    case 4: 
      return new HttpHead(paramn.g());
    case 5: 
      return new HttpOptions(paramn.g());
    case 6: 
      return new HttpTrace(paramn.g());
    }
    paramMap = new a(paramn.g());
    paramMap.addHeader("Content-Type", paramn.u());
    a(paramMap, paramn);
    return paramMap;
  }
  
  public HttpResponse a(n<?> paramn, Map<String, String> paramMap)
  {
    HttpUriRequest localHttpUriRequest = b(paramn, paramMap);
    a(localHttpUriRequest, paramMap);
    a(localHttpUriRequest, paramn.n());
    a(localHttpUriRequest);
    paramMap = localHttpUriRequest.getParams();
    int i = paramn.y();
    HttpConnectionParams.setConnectionTimeout(paramMap, 5000);
    HttpConnectionParams.setSoTimeout(paramMap, i);
    return this.a.execute(localHttpUriRequest);
  }
  
  protected void a(HttpUriRequest paramHttpUriRequest) {}
  
  public static final class a
    extends HttpEntityEnclosingRequestBase
  {
    public static final String a = "PATCH";
    
    public a() {}
    
    public a(String paramString)
    {
      setURI(URI.create(paramString));
    }
    
    public a(URI paramURI)
    {
      setURI(paramURI);
    }
    
    public String getMethod()
    {
      return "PATCH";
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */