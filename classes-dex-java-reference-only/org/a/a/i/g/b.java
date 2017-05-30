package org.a.a.i.g;

import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpMessage;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@org.a.a.a.c
public abstract class b<T extends HttpMessage>
  implements HttpMessageWriter
{
  protected final SessionOutputBuffer a;
  protected final CharArrayBuffer b;
  protected final LineFormatter c;
  
  public b(SessionOutputBuffer paramSessionOutputBuffer, LineFormatter paramLineFormatter)
  {
    this.a = ((SessionOutputBuffer)a.a(paramSessionOutputBuffer, "Session input buffer"));
    if (paramLineFormatter != null) {}
    for (;;)
    {
      this.c = paramLineFormatter;
      this.b = new CharArrayBuffer(128);
      return;
      paramLineFormatter = org.a.a.k.c.b;
    }
  }
  
  @Deprecated
  public b(SessionOutputBuffer paramSessionOutputBuffer, LineFormatter paramLineFormatter, HttpParams paramHttpParams)
  {
    a.a(paramSessionOutputBuffer, "Session input buffer");
    this.a = paramSessionOutputBuffer;
    this.b = new CharArrayBuffer(128);
    if (paramLineFormatter != null) {}
    for (;;)
    {
      this.c = paramLineFormatter;
      return;
      paramLineFormatter = org.a.a.k.c.b;
    }
  }
  
  protected abstract void a(HttpMessage paramHttpMessage);
  
  public void write(HttpMessage paramHttpMessage)
  {
    a.a(paramHttpMessage, "HTTP message");
    a(paramHttpMessage);
    paramHttpMessage = paramHttpMessage.headerIterator();
    while (paramHttpMessage.hasNext())
    {
      Header localHeader = paramHttpMessage.nextHeader();
      this.a.writeLine(this.c.formatHeader(this.b, localHeader));
    }
    this.b.clear();
    this.a.writeLine(this.b);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */