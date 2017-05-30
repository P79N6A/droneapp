package org.a.a.i.c;

import android.util.Log;
import org.a.a.i.i;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@org.a.a.a.c
public class f
  extends org.a.a.i.g.a<HttpResponse>
{
  private static final String b = "HttpClient";
  private final HttpResponseFactory c;
  private final CharArrayBuffer d;
  
  public f(SessionInputBuffer paramSessionInputBuffer)
  {
    this(paramSessionInputBuffer, null, null, org.a.a.e.c.a);
  }
  
  public f(SessionInputBuffer paramSessionInputBuffer, org.a.a.e.c paramc)
  {
    this(paramSessionInputBuffer, null, null, paramc);
  }
  
  public f(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpResponseFactory paramHttpResponseFactory, org.a.a.e.c paramc)
  {
    super(paramSessionInputBuffer, paramLineParser, paramc);
    if (paramHttpResponseFactory != null) {}
    for (;;)
    {
      this.c = paramHttpResponseFactory;
      this.d = new CharArrayBuffer(128);
      return;
      paramHttpResponseFactory = i.a;
    }
  }
  
  @Deprecated
  public f(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpResponseFactory paramHttpResponseFactory, HttpParams paramHttpParams)
  {
    super(paramSessionInputBuffer, paramLineParser, paramHttpParams);
    org.a.a.o.a.a(paramHttpResponseFactory, "Response factory");
    this.c = paramHttpResponseFactory;
    this.d = new CharArrayBuffer(128);
  }
  
  protected HttpResponse a(SessionInputBuffer paramSessionInputBuffer)
  {
    int i = 0;
    for (;;)
    {
      this.d.clear();
      int j = paramSessionInputBuffer.readLine(this.d);
      if ((j == -1) && (i == 0)) {
        throw new NoHttpResponseException("The target server failed to respond");
      }
      ParserCursor localParserCursor = new ParserCursor(0, this.d.length());
      if (this.a.hasProtocolVersion(this.d, localParserCursor))
      {
        paramSessionInputBuffer = this.a.parseStatusLine(this.d, localParserCursor);
        return this.c.newHttpResponse(paramSessionInputBuffer, null);
      }
      if ((j == -1) || (a(this.d, i))) {
        throw new ProtocolException("The server failed to respond with a valid HTTP response");
      }
      if (Log.isLoggable("HttpClient", 3)) {
        Log.d("HttpClient", "Garbage in response: " + this.d.toString());
      }
      i += 1;
    }
  }
  
  protected boolean a(CharArrayBuffer paramCharArrayBuffer, int paramInt)
  {
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */