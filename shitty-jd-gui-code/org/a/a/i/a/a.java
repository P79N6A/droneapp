package org.a.a.i.a;

import java.util.Locale;
import org.a.a.a.c;
import org.a.a.b.e;
import org.a.a.b.f;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;

@c
public abstract class a
  implements f
{
  private e a;
  
  public a() {}
  
  @Deprecated
  public a(e parame)
  {
    this.a = parame;
  }
  
  public Header a(Credentials paramCredentials, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    return authenticate(paramCredentials, paramHttpRequest);
  }
  
  protected abstract void a(CharArrayBuffer paramCharArrayBuffer, int paramInt1, int paramInt2);
  
  public boolean a()
  {
    return (this.a != null) && (this.a == e.b);
  }
  
  public e b()
  {
    return this.a;
  }
  
  public void processChallenge(Header paramHeader)
  {
    org.a.a.o.a.a(paramHeader, "Header");
    Object localObject = paramHeader.getName();
    int i;
    if (((String)localObject).equalsIgnoreCase("WWW-Authenticate"))
    {
      this.a = e.a;
      if (!(paramHeader instanceof FormattedHeader)) {
        break label137;
      }
      localObject = ((FormattedHeader)paramHeader).getBuffer();
      i = ((FormattedHeader)paramHeader).getValuePos();
      paramHeader = (Header)localObject;
    }
    for (;;)
    {
      if ((i >= paramHeader.length()) || (!HTTP.isWhitespace(paramHeader.charAt(i)))) {
        break label184;
      }
      i += 1;
      continue;
      if (((String)localObject).equalsIgnoreCase("Proxy-Authenticate"))
      {
        this.a = e.b;
        break;
      }
      throw new MalformedChallengeException("Unexpected header name: " + (String)localObject);
      label137:
      localObject = paramHeader.getValue();
      if (localObject == null) {
        throw new MalformedChallengeException("Header value is null");
      }
      paramHeader = new CharArrayBuffer(((String)localObject).length());
      paramHeader.append((String)localObject);
      i = 0;
    }
    label184:
    int j = i;
    while ((j < paramHeader.length()) && (!HTTP.isWhitespace(paramHeader.charAt(j)))) {
      j += 1;
    }
    localObject = paramHeader.substring(i, j);
    if (!((String)localObject).equalsIgnoreCase(getSchemeName())) {
      throw new MalformedChallengeException("Invalid scheme identifier: " + (String)localObject);
    }
    a(paramHeader, j, paramHeader.length());
  }
  
  public String toString()
  {
    String str = getSchemeName();
    if (str != null) {
      return str.toUpperCase(Locale.ENGLISH);
    }
    return super.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */