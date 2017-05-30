package org.a.a.i.g;

import java.util.ArrayList;
import java.util.List;
import org.a.a.f;
import org.a.a.k.d;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@org.a.a.a.c
public abstract class a<T extends HttpMessage>
  implements HttpMessageParser
{
  private static final int b = 0;
  private static final int c = 1;
  protected final LineParser a;
  private final SessionInputBuffer d;
  private final org.a.a.e.c e;
  private final List<CharArrayBuffer> f;
  private int g;
  private T h;
  
  public a(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, org.a.a.e.c paramc)
  {
    this.d = ((SessionInputBuffer)org.a.a.o.a.a(paramSessionInputBuffer, "Session input buffer"));
    if (paramLineParser != null)
    {
      this.a = paramLineParser;
      if (paramc == null) {
        break label59;
      }
    }
    for (;;)
    {
      this.e = paramc;
      this.f = new ArrayList();
      this.g = 0;
      return;
      paramLineParser = d.b;
      break;
      label59:
      paramc = org.a.a.e.c.a;
    }
  }
  
  @Deprecated
  public a(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpParams paramHttpParams)
  {
    org.a.a.o.a.a(paramSessionInputBuffer, "Session input buffer");
    org.a.a.o.a.a(paramHttpParams, "HTTP parameters");
    this.d = paramSessionInputBuffer;
    this.e = org.a.a.l.a.b(paramHttpParams);
    if (paramLineParser != null) {}
    for (;;)
    {
      this.a = paramLineParser;
      this.f = new ArrayList();
      this.g = 0;
      return;
      paramLineParser = d.b;
    }
  }
  
  public static Header[] a(SessionInputBuffer paramSessionInputBuffer, int paramInt1, int paramInt2, LineParser paramLineParser)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramLineParser != null) {}
    for (;;)
    {
      return a(paramSessionInputBuffer, paramInt1, paramInt2, paramLineParser, localArrayList);
      paramLineParser = d.b;
    }
  }
  
  public static Header[] a(SessionInputBuffer paramSessionInputBuffer, int paramInt1, int paramInt2, LineParser paramLineParser, List<CharArrayBuffer> paramList)
  {
    int j = 0;
    org.a.a.o.a.a(paramSessionInputBuffer, "Session input buffer");
    org.a.a.o.a.a(paramLineParser, "Line parser");
    org.a.a.o.a.a(paramList, "Header line list");
    Object localObject2 = null;
    Object localObject1 = null;
    for (;;)
    {
      if (localObject1 == null) {
        localObject1 = new CharArrayBuffer(64);
      }
      while ((paramSessionInputBuffer.readLine((CharArrayBuffer)localObject1) == -1) || (((CharArrayBuffer)localObject1).length() < 1))
      {
        paramSessionInputBuffer = new Header[paramList.size()];
        paramInt1 = j;
        while (paramInt1 < paramList.size())
        {
          localObject1 = (CharArrayBuffer)paramList.get(paramInt1);
          try
          {
            paramSessionInputBuffer[paramInt1] = paramLineParser.parseHeader((CharArrayBuffer)localObject1);
            paramInt1 += 1;
          }
          catch (ParseException paramSessionInputBuffer)
          {
            int i;
            throw new ProtocolException(paramSessionInputBuffer.getMessage());
          }
        }
        ((CharArrayBuffer)localObject1).clear();
      }
      if (((((CharArrayBuffer)localObject1).charAt(0) == ' ') || (((CharArrayBuffer)localObject1).charAt(0) == '\t')) && (localObject2 != null))
      {
        i = 0;
        for (;;)
        {
          if (i < ((CharArrayBuffer)localObject1).length())
          {
            int k = ((CharArrayBuffer)localObject1).charAt(i);
            if ((k == 32) || (k == 9)) {}
          }
          else
          {
            if ((paramInt2 <= 0) || (((CharArrayBuffer)localObject2).length() + 1 + ((CharArrayBuffer)localObject1).length() - i <= paramInt2)) {
              break;
            }
            throw new f("Maximum line length limit exceeded");
          }
          i += 1;
        }
        ((CharArrayBuffer)localObject2).append(' ');
        ((CharArrayBuffer)localObject2).append((CharArrayBuffer)localObject1, i, ((CharArrayBuffer)localObject1).length() - i);
      }
      while ((paramInt1 > 0) && (paramList.size() >= paramInt1))
      {
        throw new f("Maximum header count exceeded");
        paramList.add(localObject1);
        Object localObject3 = null;
        localObject2 = localObject1;
        localObject1 = localObject3;
      }
    }
    return paramSessionInputBuffer;
  }
  
  protected abstract T b(SessionInputBuffer paramSessionInputBuffer);
  
  public T parse()
  {
    switch (this.g)
    {
    default: 
      throw new IllegalStateException("Inconsistent parser state");
    }
    try
    {
      this.h = b(this.d);
      this.g = 1;
      Object localObject = a(this.d, this.e.b(), this.e.a(), this.a, this.f);
      this.h.setHeaders((Header[])localObject);
      localObject = this.h;
      this.h = null;
      this.f.clear();
      this.g = 0;
      return (T)localObject;
    }
    catch (ParseException localParseException)
    {
      throw new ProtocolException(localParseException.getMessage(), localParseException);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */