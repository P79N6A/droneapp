package org.a.a.i.g;

import org.a.a.i.i;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@org.a.a.a.c
public class k
  extends a<HttpResponse>
{
  private final HttpResponseFactory b;
  private final CharArrayBuffer c;
  
  public k(SessionInputBuffer paramSessionInputBuffer)
  {
    this(paramSessionInputBuffer, null, null, org.a.a.e.c.a);
  }
  
  public k(SessionInputBuffer paramSessionInputBuffer, org.a.a.e.c paramc)
  {
    this(paramSessionInputBuffer, null, null, paramc);
  }
  
  public k(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpResponseFactory paramHttpResponseFactory, org.a.a.e.c paramc)
  {
    super(paramSessionInputBuffer, paramLineParser, paramc);
    if (paramHttpResponseFactory != null) {}
    for (;;)
    {
      this.b = paramHttpResponseFactory;
      this.c = new CharArrayBuffer(128);
      return;
      paramHttpResponseFactory = i.a;
    }
  }
  
  @Deprecated
  public k(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpResponseFactory paramHttpResponseFactory, HttpParams paramHttpParams)
  {
    super(paramSessionInputBuffer, paramLineParser, paramHttpParams);
    this.b = ((HttpResponseFactory)org.a.a.o.a.a(paramHttpResponseFactory, "Response factory"));
    this.c = new CharArrayBuffer(128);
  }
  
  protected HttpResponse a(SessionInputBuffer paramSessionInputBuffer)
  {
    this.c.clear();
    if (paramSessionInputBuffer.readLine(this.c) == -1) {
      throw new NoHttpResponseException("The target server failed to respond");
    }
    paramSessionInputBuffer = new ParserCursor(0, this.c.length());
    paramSessionInputBuffer = this.a.parseStatusLine(this.c, paramSessionInputBuffer);
    return this.b.newHttpResponse(paramSessionInputBuffer, null);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/g/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */