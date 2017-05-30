package org.a.a.k;

import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.CharArrayBuffer;

@b
public class d
  implements LineParser
{
  @Deprecated
  public static final d a = new d();
  public static final d b = new d();
  protected final ProtocolVersion c;
  
  public d()
  {
    this(null);
  }
  
  public d(ProtocolVersion paramProtocolVersion)
  {
    if (paramProtocolVersion != null) {}
    for (;;)
    {
      this.c = paramProtocolVersion;
      return;
      paramProtocolVersion = HttpVersion.HTTP_1_1;
    }
  }
  
  public static ProtocolVersion a(String paramString, LineParser paramLineParser)
  {
    a.a(paramString, "Value");
    CharArrayBuffer localCharArrayBuffer = new CharArrayBuffer(paramString.length());
    localCharArrayBuffer.append(paramString);
    paramString = new ParserCursor(0, paramString.length());
    if (paramLineParser != null) {}
    for (;;)
    {
      return paramLineParser.parseProtocolVersion(localCharArrayBuffer, paramString);
      paramLineParser = b;
    }
  }
  
  public static RequestLine b(String paramString, LineParser paramLineParser)
  {
    a.a(paramString, "Value");
    CharArrayBuffer localCharArrayBuffer = new CharArrayBuffer(paramString.length());
    localCharArrayBuffer.append(paramString);
    paramString = new ParserCursor(0, paramString.length());
    if (paramLineParser != null) {}
    for (;;)
    {
      return paramLineParser.parseRequestLine(localCharArrayBuffer, paramString);
      paramLineParser = b;
    }
  }
  
  public static StatusLine c(String paramString, LineParser paramLineParser)
  {
    a.a(paramString, "Value");
    CharArrayBuffer localCharArrayBuffer = new CharArrayBuffer(paramString.length());
    localCharArrayBuffer.append(paramString);
    paramString = new ParserCursor(0, paramString.length());
    if (paramLineParser != null) {}
    for (;;)
    {
      return paramLineParser.parseStatusLine(localCharArrayBuffer, paramString);
      paramLineParser = b;
    }
  }
  
  public static Header d(String paramString, LineParser paramLineParser)
  {
    a.a(paramString, "Value");
    CharArrayBuffer localCharArrayBuffer = new CharArrayBuffer(paramString.length());
    localCharArrayBuffer.append(paramString);
    if (paramLineParser != null) {}
    for (;;)
    {
      return paramLineParser.parseHeader(localCharArrayBuffer);
      paramLineParser = b;
    }
  }
  
  protected ProtocolVersion a(int paramInt1, int paramInt2)
  {
    return this.c.forVersion(paramInt1, paramInt2);
  }
  
  protected RequestLine a(String paramString1, String paramString2, ProtocolVersion paramProtocolVersion)
  {
    return new BasicRequestLine(paramString1, paramString2, paramProtocolVersion);
  }
  
  protected StatusLine a(ProtocolVersion paramProtocolVersion, int paramInt, String paramString)
  {
    return new BasicStatusLine(paramProtocolVersion, paramInt, paramString);
  }
  
  protected void a(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    int i = paramParserCursor.getPos();
    int j = paramParserCursor.getUpperBound();
    while ((i < j) && (HTTP.isWhitespace(paramCharArrayBuffer.charAt(i)))) {
      i += 1;
    }
    paramParserCursor.updatePos(i);
  }
  
  public boolean hasProtocolVersion(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    boolean bool2 = true;
    a.a(paramCharArrayBuffer, "Char array buffer");
    a.a(paramParserCursor, "Parser cursor");
    int j = paramParserCursor.getPos();
    paramParserCursor = this.c.getProtocol();
    int k = paramParserCursor.length();
    if (paramCharArrayBuffer.length() < k + 4) {
      break label65;
    }
    int i;
    label65:
    while (i + k + 4 > paramCharArrayBuffer.length())
    {
      return false;
      if (j >= 0) {
        break;
      }
      i = paramCharArrayBuffer.length() - 4 - k;
    }
    j = 0;
    boolean bool1 = true;
    label84:
    if ((bool1) && (j < k))
    {
      if (paramCharArrayBuffer.charAt(i + j) == paramParserCursor.charAt(j)) {}
      for (bool1 = true;; bool1 = false)
      {
        j += 1;
        break label84;
        i = j;
        if (j != 0) {
          break;
        }
        for (;;)
        {
          i = j;
          if (j >= paramCharArrayBuffer.length()) {
            break;
          }
          i = j;
          if (!HTTP.isWhitespace(paramCharArrayBuffer.charAt(j))) {
            break;
          }
          j += 1;
        }
      }
    }
    if (bool1) {
      if (paramCharArrayBuffer.charAt(i + k) == '/') {
        bool1 = bool2;
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
    }
  }
  
  public Header parseHeader(CharArrayBuffer paramCharArrayBuffer)
  {
    return new BufferedHeader(paramCharArrayBuffer);
  }
  
  public ProtocolVersion parseProtocolVersion(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    int m = 1;
    a.a(paramCharArrayBuffer, "Char array buffer");
    a.a(paramParserCursor, "Parser cursor");
    String str = this.c.getProtocol();
    int i1 = str.length();
    n = paramParserCursor.getPos();
    k = paramParserCursor.getUpperBound();
    a(paramCharArrayBuffer, paramParserCursor);
    int i2 = paramParserCursor.getPos();
    if (i2 + i1 + 4 > k) {
      throw new ParseException("Not a valid protocol version: " + paramCharArrayBuffer.substring(n, k));
    }
    int j = 0;
    int i = 1;
    if ((i != 0) && (j < i1))
    {
      if (paramCharArrayBuffer.charAt(i2 + j) == str.charAt(j)) {}
      for (i = 1;; i = 0)
      {
        j += 1;
        break;
      }
    }
    if (i != 0)
    {
      if (paramCharArrayBuffer.charAt(i2 + i1) == '/') {
        i = m;
      }
      for (;;)
      {
        if (i == 0)
        {
          throw new ParseException("Not a valid protocol version: " + paramCharArrayBuffer.substring(n, k));
          i = 0;
          continue;
        }
        j = i1 + 1 + i2;
        i = paramCharArrayBuffer.indexOf(46, j, k);
        if (i == -1) {
          throw new ParseException("Invalid protocol version number: " + paramCharArrayBuffer.substring(n, k));
        }
        try
        {
          m = Integer.parseInt(paramCharArrayBuffer.substringTrimmed(j, i));
          i1 = i + 1;
          j = paramCharArrayBuffer.indexOf(32, i1, k);
          i = j;
          if (j == -1) {
            i = k;
          }
        }
        catch (NumberFormatException paramParserCursor)
        {
          try
          {
            j = Integer.parseInt(paramCharArrayBuffer.substringTrimmed(i1, i));
            paramParserCursor.updatePos(i);
            return a(m, j);
          }
          catch (NumberFormatException paramParserCursor)
          {
            throw new ParseException("Invalid protocol minor version number: " + paramCharArrayBuffer.substring(n, k));
          }
          paramParserCursor = paramParserCursor;
          throw new ParseException("Invalid protocol major version number: " + paramCharArrayBuffer.substring(n, k));
        }
      }
    }
  }
  
  public RequestLine parseRequestLine(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    a.a(paramCharArrayBuffer, "Char array buffer");
    a.a(paramParserCursor, "Parser cursor");
    int i = paramParserCursor.getPos();
    int j = paramParserCursor.getUpperBound();
    try
    {
      a(paramCharArrayBuffer, paramParserCursor);
      k = paramParserCursor.getPos();
      m = paramCharArrayBuffer.indexOf(32, k, j);
      if (m < 0) {
        throw new ParseException("Invalid request line: " + paramCharArrayBuffer.substring(i, j));
      }
    }
    catch (IndexOutOfBoundsException paramParserCursor)
    {
      throw new ParseException("Invalid request line: " + paramCharArrayBuffer.substring(i, j));
    }
    String str1 = paramCharArrayBuffer.substringTrimmed(k, m);
    paramParserCursor.updatePos(m);
    a(paramCharArrayBuffer, paramParserCursor);
    int k = paramParserCursor.getPos();
    int m = paramCharArrayBuffer.indexOf(32, k, j);
    if (m < 0) {
      throw new ParseException("Invalid request line: " + paramCharArrayBuffer.substring(i, j));
    }
    String str2 = paramCharArrayBuffer.substringTrimmed(k, m);
    paramParserCursor.updatePos(m);
    ProtocolVersion localProtocolVersion = parseProtocolVersion(paramCharArrayBuffer, paramParserCursor);
    a(paramCharArrayBuffer, paramParserCursor);
    if (!paramParserCursor.atEnd()) {
      throw new ParseException("Invalid request line: " + paramCharArrayBuffer.substring(i, j));
    }
    paramParserCursor = a(str1, str2, localProtocolVersion);
    return paramParserCursor;
  }
  
  public StatusLine parseStatusLine(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    a.a(paramCharArrayBuffer, "Char array buffer");
    a.a(paramParserCursor, "Parser cursor");
    int m = paramParserCursor.getPos();
    int k = paramParserCursor.getUpperBound();
    label174:
    label245:
    for (;;)
    {
      ProtocolVersion localProtocolVersion;
      int j;
      int i;
      try
      {
        localProtocolVersion = parseProtocolVersion(paramCharArrayBuffer, paramParserCursor);
        a(paramCharArrayBuffer, paramParserCursor);
        j = paramParserCursor.getPos();
        i = paramCharArrayBuffer.indexOf(32, j, k);
        if (i >= 0) {
          break label245;
        }
        i = k;
        paramParserCursor = paramCharArrayBuffer.substringTrimmed(j, i);
        j = 0;
        if (j >= paramParserCursor.length()) {
          break label174;
        }
        if (!Character.isDigit(paramParserCursor.charAt(j))) {
          throw new ParseException("Status line contains invalid status code: " + paramCharArrayBuffer.substring(m, k));
        }
      }
      catch (IndexOutOfBoundsException paramParserCursor)
      {
        throw new ParseException("Invalid status line: " + paramCharArrayBuffer.substring(m, k));
      }
      j += 1;
      continue;
      for (;;)
      {
        try
        {
          j = Integer.parseInt(paramParserCursor);
          if (i < k)
          {
            paramParserCursor = paramCharArrayBuffer.substringTrimmed(i, k);
            return a(localProtocolVersion, j, paramParserCursor);
          }
        }
        catch (NumberFormatException paramParserCursor)
        {
          throw new ParseException("Status line contains invalid status code: " + paramCharArrayBuffer.substring(m, k));
        }
        paramParserCursor = "";
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/k/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */