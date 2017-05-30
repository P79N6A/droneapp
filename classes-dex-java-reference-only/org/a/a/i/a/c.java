package org.a.a.i.a;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.Principal;
import org.a.a.b;
import org.a.a.b.e;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.Credentials;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;

@org.a.a.a.c
public class c
  extends k
{
  private boolean a;
  
  public c()
  {
    this(b.f);
  }
  
  public c(Charset paramCharset)
  {
    super(paramCharset);
    this.a = false;
  }
  
  @Deprecated
  public c(e parame)
  {
    super(parame);
  }
  
  @Deprecated
  public static Header a(Credentials paramCredentials, String paramString, boolean paramBoolean)
  {
    org.a.a.o.a.a(paramCredentials, "Credentials");
    org.a.a.o.a.a(paramString, "charset");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramCredentials.getUserPrincipal().getName());
    localStringBuilder.append(":");
    if (paramCredentials.getPassword() == null)
    {
      paramCredentials = "null";
      localStringBuilder.append(paramCredentials);
      paramCredentials = Base64.encode(EncodingUtils.getBytes(localStringBuilder.toString(), paramString), 2);
      paramString = new CharArrayBuffer(32);
      if (!paramBoolean) {
        break label129;
      }
      paramString.append("Proxy-Authorization");
    }
    for (;;)
    {
      paramString.append(": Basic ");
      paramString.append(paramCredentials, 0, paramCredentials.length);
      return new BufferedHeader(paramString);
      paramCredentials = paramCredentials.getPassword();
      break;
      label129:
      paramString.append("Authorization");
    }
  }
  
  public Header a(Credentials paramCredentials, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    org.a.a.o.a.a(paramCredentials, "Credentials");
    org.a.a.o.a.a(paramHttpRequest, "HTTP request");
    paramHttpContext = new StringBuilder();
    paramHttpContext.append(paramCredentials.getUserPrincipal().getName());
    paramHttpContext.append(":");
    if (paramCredentials.getPassword() == null)
    {
      paramCredentials = "null";
      paramHttpContext.append(paramCredentials);
      paramCredentials = Base64.encode(EncodingUtils.getBytes(paramHttpContext.toString(), a(paramHttpRequest)), 2);
      paramHttpRequest = new CharArrayBuffer(32);
      if (!a()) {
        break label136;
      }
      paramHttpRequest.append("Proxy-Authorization");
    }
    for (;;)
    {
      paramHttpRequest.append(": Basic ");
      paramHttpRequest.append(paramCredentials, 0, paramCredentials.length);
      return new BufferedHeader(paramHttpRequest);
      paramCredentials = paramCredentials.getPassword();
      break;
      label136:
      paramHttpRequest.append("Authorization");
    }
  }
  
  @Deprecated
  public Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest)
  {
    return a(paramCredentials, paramHttpRequest, new org.a.a.n.a());
  }
  
  public String getSchemeName()
  {
    return "basic";
  }
  
  public boolean isComplete()
  {
    return this.a;
  }
  
  public boolean isConnectionBased()
  {
    return false;
  }
  
  public void processChallenge(Header paramHeader)
  {
    super.processChallenge(paramHeader);
    this.a = true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */