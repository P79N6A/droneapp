package org.a.a.i.g;

import org.a.a.i.h;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@org.a.a.a.c
public class g
  extends a<HttpRequest>
{
  private final HttpRequestFactory b;
  private final CharArrayBuffer c;
  
  public g(SessionInputBuffer paramSessionInputBuffer)
  {
    this(paramSessionInputBuffer, null, null, org.a.a.e.c.a);
  }
  
  public g(SessionInputBuffer paramSessionInputBuffer, org.a.a.e.c paramc)
  {
    this(paramSessionInputBuffer, null, null, paramc);
  }
  
  public g(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpRequestFactory paramHttpRequestFactory, org.a.a.e.c paramc)
  {
    super(paramSessionInputBuffer, paramLineParser, paramc);
    if (paramHttpRequestFactory != null) {}
    for (;;)
    {
      this.b = paramHttpRequestFactory;
      this.c = new CharArrayBuffer(128);
      return;
      paramHttpRequestFactory = h.a;
    }
  }
  
  @Deprecated
  public g(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpRequestFactory paramHttpRequestFactory, HttpParams paramHttpParams)
  {
    super(paramSessionInputBuffer, paramLineParser, paramHttpParams);
    this.b = ((HttpRequestFactory)org.a.a.o.a.a(paramHttpRequestFactory, "Request factory"));
    this.c = new CharArrayBuffer(128);
  }
  
  protected HttpRequest a(SessionInputBuffer paramSessionInputBuffer)
  {
    this.c.clear();
    if (paramSessionInputBuffer.readLine(this.c) == -1) {
      throw new ConnectionClosedException("Client closed connection");
    }
    paramSessionInputBuffer = new ParserCursor(0, this.c.length());
    paramSessionInputBuffer = this.a.parseRequestLine(this.c, paramSessionInputBuffer);
    return this.b.newHttpRequest(paramSessionInputBuffer);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/g/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */