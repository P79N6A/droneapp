package org.a.a.k;

import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.message.LineFormatter;
import org.apache.http.util.CharArrayBuffer;

@b
public class c
  implements LineFormatter
{
  @Deprecated
  public static final c a = new c();
  public static final c b = new c();
  
  public static String a(Header paramHeader, LineFormatter paramLineFormatter)
  {
    if (paramLineFormatter != null) {}
    for (;;)
    {
      return paramLineFormatter.formatHeader(null, paramHeader).toString();
      paramLineFormatter = b;
    }
  }
  
  public static String a(ProtocolVersion paramProtocolVersion, LineFormatter paramLineFormatter)
  {
    if (paramLineFormatter != null) {}
    for (;;)
    {
      return paramLineFormatter.appendProtocolVersion(null, paramProtocolVersion).toString();
      paramLineFormatter = b;
    }
  }
  
  public static String a(RequestLine paramRequestLine, LineFormatter paramLineFormatter)
  {
    if (paramLineFormatter != null) {}
    for (;;)
    {
      return paramLineFormatter.formatRequestLine(null, paramRequestLine).toString();
      paramLineFormatter = b;
    }
  }
  
  public static String a(StatusLine paramStatusLine, LineFormatter paramLineFormatter)
  {
    if (paramLineFormatter != null) {}
    for (;;)
    {
      return paramLineFormatter.formatStatusLine(null, paramStatusLine).toString();
      paramLineFormatter = b;
    }
  }
  
  protected int a(ProtocolVersion paramProtocolVersion)
  {
    return paramProtocolVersion.getProtocol().length() + 4;
  }
  
  protected CharArrayBuffer a(CharArrayBuffer paramCharArrayBuffer)
  {
    if (paramCharArrayBuffer != null)
    {
      paramCharArrayBuffer.clear();
      return paramCharArrayBuffer;
    }
    return new CharArrayBuffer(64);
  }
  
  protected void a(CharArrayBuffer paramCharArrayBuffer, Header paramHeader)
  {
    String str = paramHeader.getName();
    paramHeader = paramHeader.getValue();
    int j = str.length() + 2;
    int i = j;
    if (paramHeader != null) {
      i = j + paramHeader.length();
    }
    paramCharArrayBuffer.ensureCapacity(i);
    paramCharArrayBuffer.append(str);
    paramCharArrayBuffer.append(": ");
    if (paramHeader != null) {
      paramCharArrayBuffer.append(paramHeader);
    }
  }
  
  protected void a(CharArrayBuffer paramCharArrayBuffer, RequestLine paramRequestLine)
  {
    String str1 = paramRequestLine.getMethod();
    String str2 = paramRequestLine.getUri();
    paramCharArrayBuffer.ensureCapacity(str1.length() + 1 + str2.length() + 1 + a(paramRequestLine.getProtocolVersion()));
    paramCharArrayBuffer.append(str1);
    paramCharArrayBuffer.append(' ');
    paramCharArrayBuffer.append(str2);
    paramCharArrayBuffer.append(' ');
    appendProtocolVersion(paramCharArrayBuffer, paramRequestLine.getProtocolVersion());
  }
  
  protected void a(CharArrayBuffer paramCharArrayBuffer, StatusLine paramStatusLine)
  {
    int j = a(paramStatusLine.getProtocolVersion()) + 1 + 3 + 1;
    String str = paramStatusLine.getReasonPhrase();
    int i = j;
    if (str != null) {
      i = j + str.length();
    }
    paramCharArrayBuffer.ensureCapacity(i);
    appendProtocolVersion(paramCharArrayBuffer, paramStatusLine.getProtocolVersion());
    paramCharArrayBuffer.append(' ');
    paramCharArrayBuffer.append(Integer.toString(paramStatusLine.getStatusCode()));
    paramCharArrayBuffer.append(' ');
    if (str != null) {
      paramCharArrayBuffer.append(str);
    }
  }
  
  public CharArrayBuffer appendProtocolVersion(CharArrayBuffer paramCharArrayBuffer, ProtocolVersion paramProtocolVersion)
  {
    a.a(paramProtocolVersion, "Protocol version");
    int i = a(paramProtocolVersion);
    if (paramCharArrayBuffer == null) {
      paramCharArrayBuffer = new CharArrayBuffer(i);
    }
    for (;;)
    {
      paramCharArrayBuffer.append(paramProtocolVersion.getProtocol());
      paramCharArrayBuffer.append('/');
      paramCharArrayBuffer.append(Integer.toString(paramProtocolVersion.getMajor()));
      paramCharArrayBuffer.append('.');
      paramCharArrayBuffer.append(Integer.toString(paramProtocolVersion.getMinor()));
      return paramCharArrayBuffer;
      paramCharArrayBuffer.ensureCapacity(i);
    }
  }
  
  public CharArrayBuffer formatHeader(CharArrayBuffer paramCharArrayBuffer, Header paramHeader)
  {
    a.a(paramHeader, "Header");
    if ((paramHeader instanceof FormattedHeader)) {
      return ((FormattedHeader)paramHeader).getBuffer();
    }
    paramCharArrayBuffer = a(paramCharArrayBuffer);
    a(paramCharArrayBuffer, paramHeader);
    return paramCharArrayBuffer;
  }
  
  public CharArrayBuffer formatRequestLine(CharArrayBuffer paramCharArrayBuffer, RequestLine paramRequestLine)
  {
    a.a(paramRequestLine, "Request line");
    paramCharArrayBuffer = a(paramCharArrayBuffer);
    a(paramCharArrayBuffer, paramRequestLine);
    return paramCharArrayBuffer;
  }
  
  public CharArrayBuffer formatStatusLine(CharArrayBuffer paramCharArrayBuffer, StatusLine paramStatusLine)
  {
    a.a(paramStatusLine, "Status line");
    paramCharArrayBuffer = a(paramCharArrayBuffer);
    a(paramCharArrayBuffer, paramStatusLine);
    return paramCharArrayBuffer;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */