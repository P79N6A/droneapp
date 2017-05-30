package org.a.a.i.a;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.a.a.a.c;
import org.a.a.b.e;
import org.apache.http.HeaderElement;
import org.apache.http.HttpRequest;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.message.HeaderValueParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@c
public abstract class k
  extends a
{
  private final Map<String, String> a = new HashMap();
  private final Charset b;
  
  public k()
  {
    this(org.a.a.b.f);
  }
  
  public k(Charset paramCharset)
  {
    if (paramCharset != null) {}
    for (;;)
    {
      this.b = paramCharset;
      return;
      paramCharset = org.a.a.b.f;
    }
  }
  
  @Deprecated
  public k(e parame)
  {
    super(parame);
    this.b = org.a.a.b.f;
  }
  
  String a(HttpRequest paramHttpRequest)
  {
    String str = (String)paramHttpRequest.getParams().getParameter("http.auth.credential-charset");
    paramHttpRequest = str;
    if (str == null) {
      paramHttpRequest = g().name();
    }
    return paramHttpRequest;
  }
  
  protected void a(CharArrayBuffer paramCharArrayBuffer, int paramInt1, int paramInt2)
  {
    paramCharArrayBuffer = org.a.a.k.b.b.parseElements(paramCharArrayBuffer, new ParserCursor(paramInt1, paramCharArrayBuffer.length()));
    if (paramCharArrayBuffer.length == 0) {
      throw new MalformedChallengeException("Authentication challenge is empty");
    }
    this.a.clear();
    paramInt2 = paramCharArrayBuffer.length;
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      Object localObject = paramCharArrayBuffer[paramInt1];
      this.a.put(((HeaderElement)localObject).getName().toLowerCase(Locale.ENGLISH), ((HeaderElement)localObject).getValue());
      paramInt1 += 1;
    }
  }
  
  public Charset g()
  {
    return this.b;
  }
  
  public String getParameter(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return (String)this.a.get(paramString.toLowerCase(Locale.ENGLISH));
  }
  
  public String getRealm()
  {
    return getParameter("realm");
  }
  
  protected Map<String, String> h()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */