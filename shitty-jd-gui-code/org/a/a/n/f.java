package org.a.a.n;

import java.util.List;
import org.a.a.a.d;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestInterceptorList;
import org.apache.http.protocol.HttpResponseInterceptorList;

@d
public final class f
  implements HttpProcessor
{
  private final HttpRequestInterceptor[] a;
  private final HttpResponseInterceptor[] b;
  
  public f(List<HttpRequestInterceptor> paramList, List<HttpResponseInterceptor> paramList1)
  {
    if (paramList != null) {}
    for (this.a = ((HttpRequestInterceptor[])paramList.toArray(new HttpRequestInterceptor[paramList.size()])); paramList1 != null; this.a = new HttpRequestInterceptor[0])
    {
      this.b = ((HttpResponseInterceptor[])paramList1.toArray(new HttpResponseInterceptor[paramList1.size()]));
      return;
    }
    this.b = new HttpResponseInterceptor[0];
  }
  
  @Deprecated
  public f(HttpRequestInterceptorList paramHttpRequestInterceptorList, HttpResponseInterceptorList paramHttpResponseInterceptorList)
  {
    int k;
    int i;
    if (paramHttpRequestInterceptorList != null)
    {
      k = paramHttpRequestInterceptorList.getRequestInterceptorCount();
      this.a = new HttpRequestInterceptor[k];
      i = 0;
      while (i < k)
      {
        this.a[i] = paramHttpRequestInterceptorList.getRequestInterceptor(i);
        i += 1;
      }
    }
    this.a = new HttpRequestInterceptor[0];
    if (paramHttpResponseInterceptorList != null)
    {
      k = paramHttpResponseInterceptorList.getResponseInterceptorCount();
      this.b = new HttpResponseInterceptor[k];
      i = j;
      while (i < k)
      {
        this.b[i] = paramHttpResponseInterceptorList.getResponseInterceptor(i);
        i += 1;
      }
    }
    this.b = new HttpResponseInterceptor[0];
  }
  
  public f(HttpRequestInterceptor... paramVarArgs)
  {
    this(paramVarArgs, null);
  }
  
  public f(HttpRequestInterceptor[] paramArrayOfHttpRequestInterceptor, HttpResponseInterceptor[] paramArrayOfHttpResponseInterceptor)
  {
    int i;
    if (paramArrayOfHttpRequestInterceptor != null)
    {
      i = paramArrayOfHttpRequestInterceptor.length;
      this.a = new HttpRequestInterceptor[i];
      System.arraycopy(paramArrayOfHttpRequestInterceptor, 0, this.a, 0, i);
    }
    while (paramArrayOfHttpResponseInterceptor != null)
    {
      i = paramArrayOfHttpResponseInterceptor.length;
      this.b = new HttpResponseInterceptor[i];
      System.arraycopy(paramArrayOfHttpResponseInterceptor, 0, this.b, 0, i);
      return;
      this.a = new HttpRequestInterceptor[0];
    }
    this.b = new HttpResponseInterceptor[0];
  }
  
  public f(HttpResponseInterceptor... paramVarArgs)
  {
    this(null, paramVarArgs);
  }
  
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    HttpRequestInterceptor[] arrayOfHttpRequestInterceptor = this.a;
    int j = arrayOfHttpRequestInterceptor.length;
    int i = 0;
    while (i < j)
    {
      arrayOfHttpRequestInterceptor[i].process(paramHttpRequest, paramHttpContext);
      i += 1;
    }
  }
  
  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    HttpResponseInterceptor[] arrayOfHttpResponseInterceptor = this.b;
    int j = arrayOfHttpResponseInterceptor.length;
    int i = 0;
    while (i < j)
    {
      arrayOfHttpResponseInterceptor[i].process(paramHttpResponse, paramHttpContext);
      i += 1;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/n/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */