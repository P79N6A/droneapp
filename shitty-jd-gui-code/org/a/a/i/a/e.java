package org.a.a.i.a;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.a.a.a.c;
import org.a.a.b;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.RequestLine;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.impl.auth.UnsupportedDigestAlgorithmException;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;

@c
public class e
  extends k
{
  private static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static final int c = -1;
  private static final int d = 0;
  private static final int e = 1;
  private static final int f = 2;
  private boolean b;
  private String g;
  private long h;
  private String i;
  private String j;
  private String k;
  
  public e()
  {
    this(b.f);
  }
  
  public e(Charset paramCharset)
  {
    super(paramCharset);
    this.b = false;
  }
  
  @Deprecated
  public e(org.a.a.b.e parame)
  {
    super(parame);
  }
  
  static String a(byte[] paramArrayOfByte)
  {
    int n = paramArrayOfByte.length;
    char[] arrayOfChar = new char[n * 2];
    int m = 0;
    while (m < n)
    {
      int i1 = paramArrayOfByte[m];
      int i2 = paramArrayOfByte[m];
      arrayOfChar[(m * 2)] = a[((i2 & 0xF0) >> 4)];
      arrayOfChar[(m * 2 + 1)] = a[(i1 & 0xF)];
      m += 1;
    }
    return new String(arrayOfChar);
  }
  
  private static MessageDigest a(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
      return localMessageDigest;
    }
    catch (Exception localException)
    {
      throw new UnsupportedDigestAlgorithmException("Unsupported algorithm in HTTP Digest authentication: " + paramString);
    }
  }
  
  private Header a(Credentials paramCredentials, HttpRequest paramHttpRequest)
  {
    String str2 = getParameter("uri");
    String str3 = getParameter("realm");
    String str4 = getParameter("nonce");
    String str1 = getParameter("opaque");
    String str6 = getParameter("methodname");
    Object localObject2 = getParameter("algorithm");
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = "MD5";
    }
    HashSet localHashSet = new HashSet(8);
    int m = -1;
    localObject2 = getParameter("qop");
    if (localObject2 != null)
    {
      localObject3 = new StringTokenizer((String)localObject2, ",");
      while (((StringTokenizer)localObject3).hasMoreTokens()) {
        localHashSet.add(((StringTokenizer)localObject3).nextToken().trim().toLowerCase(Locale.ENGLISH));
      }
      if (((paramHttpRequest instanceof HttpEntityEnclosingRequest)) && (localHashSet.contains("auth-int"))) {
        m = 1;
      }
    }
    while (m == -1)
    {
      throw new AuthenticationException("None of the qop methods is supported: " + (String)localObject2);
      if (localHashSet.contains("auth"))
      {
        m = 2;
        continue;
        m = 0;
      }
    }
    Object localObject3 = getParameter("charset");
    localObject2 = localObject3;
    if (localObject3 == null) {
      localObject2 = "ISO-8859-1";
    }
    if (((String)localObject1).equalsIgnoreCase("MD5-sess")) {}
    for (localObject3 = "MD5";; localObject3 = localObject1)
    {
      for (;;)
      {
        MessageDigest localMessageDigest;
        String str5;
        StringBuilder localStringBuilder;
        String str7;
        int n;
        boolean bool;
        try
        {
          localMessageDigest = a((String)localObject3);
          str5 = paramCredentials.getUserPrincipal().getName();
          paramCredentials = paramCredentials.getPassword();
          if (str4.equals(this.g))
          {
            this.h += 1L;
            localStringBuilder = new StringBuilder(256);
            localObject3 = new Formatter(localStringBuilder, Locale.US);
            ((Formatter)localObject3).format("%08x", new Object[] { Long.valueOf(this.h) });
            ((Formatter)localObject3).close();
            localObject3 = localStringBuilder.toString();
            if (this.i == null) {
              this.i = f();
            }
            this.j = null;
            this.k = null;
            if (!((String)localObject1).equalsIgnoreCase("MD5-sess")) {
              break label1019;
            }
            localStringBuilder.setLength(0);
            localStringBuilder.append(str5).append(':').append(str3).append(':').append(paramCredentials);
            paramCredentials = a(localMessageDigest.digest(EncodingUtils.getBytes(localStringBuilder.toString(), (String)localObject2)));
            localStringBuilder.setLength(0);
            localStringBuilder.append(paramCredentials).append(':').append(str4).append(':').append(this.i);
            this.j = localStringBuilder.toString();
            str7 = a(localMessageDigest.digest(EncodingUtils.getBytes(this.j, (String)localObject2)));
            if (m != 2) {
              break label1064;
            }
            this.k = (str6 + ':' + str2);
            paramHttpRequest = a(localMessageDigest.digest(EncodingUtils.getBytes(this.k, (String)localObject2)));
            if (m != 0) {
              break label1275;
            }
            localStringBuilder.setLength(0);
            localStringBuilder.append(str7).append(':').append(str4).append(':').append(paramHttpRequest);
            paramCredentials = localStringBuilder.toString();
            paramCredentials = a(localMessageDigest.digest(EncodingUtils.getAsciiBytes(paramCredentials)));
            paramHttpRequest = new CharArrayBuffer(128);
            if (!a()) {
              break label1366;
            }
            paramHttpRequest.append("Proxy-Authorization");
            paramHttpRequest.append(": Digest ");
            localObject2 = new ArrayList(20);
            ((List)localObject2).add(new BasicNameValuePair("username", str5));
            ((List)localObject2).add(new BasicNameValuePair("realm", str3));
            ((List)localObject2).add(new BasicNameValuePair("nonce", str4));
            ((List)localObject2).add(new BasicNameValuePair("uri", str2));
            ((List)localObject2).add(new BasicNameValuePair("response", paramCredentials));
            if (m != 0)
            {
              if (m != 1) {
                break label1376;
              }
              paramCredentials = "auth-int";
              ((List)localObject2).add(new BasicNameValuePair("qop", paramCredentials));
              ((List)localObject2).add(new BasicNameValuePair("nc", (String)localObject3));
              ((List)localObject2).add(new BasicNameValuePair("cnonce", this.i));
            }
            ((List)localObject2).add(new BasicNameValuePair("algorithm", (String)localObject1));
            if (str1 != null) {
              ((List)localObject2).add(new BasicNameValuePair("opaque", str1));
            }
            m = 0;
            if (m >= ((List)localObject2).size()) {
              break;
            }
            paramCredentials = (BasicNameValuePair)((List)localObject2).get(m);
            if (m > 0) {
              paramHttpRequest.append(", ");
            }
            localObject1 = paramCredentials.getName();
            if ((!"nc".equals(localObject1)) && (!"qop".equals(localObject1)) && (!"algorithm".equals(localObject1))) {
              break label1382;
            }
            n = 1;
            localObject1 = org.a.a.k.a.b;
            if (n != 0) {
              break label1388;
            }
            bool = true;
            ((org.a.a.k.a)localObject1).formatNameValuePair(paramHttpRequest, paramCredentials, bool);
            m += 1;
            continue;
          }
          this.h = 1L;
        }
        catch (UnsupportedDigestAlgorithmException paramCredentials)
        {
          throw new AuthenticationException("Unsuppported digest algorithm: " + (String)localObject3);
        }
        this.i = null;
        this.g = str4;
        continue;
        label1019:
        localStringBuilder.setLength(0);
        localStringBuilder.append(str5).append(':').append(str3).append(':').append(paramCredentials);
        this.j = localStringBuilder.toString();
        continue;
        label1064:
        if (m == 1)
        {
          paramCredentials = null;
          if ((paramHttpRequest instanceof HttpEntityEnclosingRequest)) {
            paramCredentials = ((HttpEntityEnclosingRequest)paramHttpRequest).getEntity();
          }
          if ((paramCredentials != null) && (!paramCredentials.isRepeatable()))
          {
            if (localHashSet.contains("auth"))
            {
              m = 2;
              this.k = (str6 + ':' + str2);
            }
            else
            {
              throw new AuthenticationException("Qop auth-int cannot be used with a non-repeatable entity");
            }
          }
          else
          {
            paramHttpRequest = new g(localMessageDigest);
            if (paramCredentials != null) {}
            try
            {
              paramCredentials.writeTo(paramHttpRequest);
              paramHttpRequest.close();
              this.k = (str6 + ':' + str2 + ':' + a(paramHttpRequest.a()));
            }
            catch (IOException paramCredentials)
            {
              throw new AuthenticationException("I/O error reading entity content", paramCredentials);
            }
          }
        }
        else
        {
          this.k = (str6 + ':' + str2);
          continue;
          label1275:
          localStringBuilder.setLength(0);
          localObject2 = localStringBuilder.append(str7).append(':').append(str4).append(':').append((String)localObject3).append(':').append(this.i).append(':');
          if (m == 1) {}
          for (paramCredentials = "auth-int";; paramCredentials = "auth")
          {
            ((StringBuilder)localObject2).append(paramCredentials).append(':').append(paramHttpRequest);
            paramCredentials = localStringBuilder.toString();
            break;
          }
          label1366:
          paramHttpRequest.append("Authorization");
          continue;
          label1376:
          paramCredentials = "auth";
          continue;
          label1382:
          n = 0;
          continue;
          label1388:
          bool = false;
        }
      }
      return new BufferedHeader(paramHttpRequest);
    }
  }
  
  public static String f()
  {
    SecureRandom localSecureRandom = new SecureRandom();
    byte[] arrayOfByte = new byte[8];
    localSecureRandom.nextBytes(arrayOfByte);
    return a(arrayOfByte);
  }
  
  public Header a(Credentials paramCredentials, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    org.a.a.o.a.a(paramCredentials, "Credentials");
    org.a.a.o.a.a(paramHttpRequest, "HTTP request");
    if (getParameter("realm") == null) {
      throw new AuthenticationException("missing realm in challenge");
    }
    if (getParameter("nonce") == null) {
      throw new AuthenticationException("missing nonce in challenge");
    }
    h().put("methodname", paramHttpRequest.getRequestLine().getMethod());
    h().put("uri", paramHttpRequest.getRequestLine().getUri());
    if (getParameter("charset") == null) {
      h().put("charset", a(paramHttpRequest));
    }
    return a(paramCredentials, paramHttpRequest);
  }
  
  public void a(String paramString1, String paramString2)
  {
    h().put(paramString1, paramString2);
  }
  
  @Deprecated
  public Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest)
  {
    return a(paramCredentials, paramHttpRequest, new org.a.a.n.a());
  }
  
  String c()
  {
    return this.i;
  }
  
  String d()
  {
    return this.j;
  }
  
  String e()
  {
    return this.k;
  }
  
  public String getSchemeName()
  {
    return "digest";
  }
  
  public boolean isComplete()
  {
    if ("true".equalsIgnoreCase(getParameter("stale"))) {
      return false;
    }
    return this.b;
  }
  
  public boolean isConnectionBased()
  {
    return false;
  }
  
  public void processChallenge(Header paramHeader)
  {
    super.processChallenge(paramHeader);
    this.b = true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DIGEST [complete=").append(this.b).append(", nonce=").append(this.g).append(", nc=").append(this.h).append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */