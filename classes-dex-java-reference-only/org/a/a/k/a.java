package org.a.a.k;

import org.a.a.a.b;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.message.HeaderValueFormatter;
import org.apache.http.util.CharArrayBuffer;

@b
public class a
  implements HeaderValueFormatter
{
  @Deprecated
  public static final a a = new a();
  public static final a b = new a();
  public static final String c = " ;,:@()<>\\\"/[]?={}\t";
  public static final String d = "\"\\";
  
  public static String a(HeaderElement paramHeaderElement, boolean paramBoolean, HeaderValueFormatter paramHeaderValueFormatter)
  {
    if (paramHeaderValueFormatter != null) {}
    for (;;)
    {
      return paramHeaderValueFormatter.formatHeaderElement(null, paramHeaderElement, paramBoolean).toString();
      paramHeaderValueFormatter = b;
    }
  }
  
  public static String a(NameValuePair paramNameValuePair, boolean paramBoolean, HeaderValueFormatter paramHeaderValueFormatter)
  {
    if (paramHeaderValueFormatter != null) {}
    for (;;)
    {
      return paramHeaderValueFormatter.formatNameValuePair(null, paramNameValuePair, paramBoolean).toString();
      paramHeaderValueFormatter = b;
    }
  }
  
  public static String a(HeaderElement[] paramArrayOfHeaderElement, boolean paramBoolean, HeaderValueFormatter paramHeaderValueFormatter)
  {
    if (paramHeaderValueFormatter != null) {}
    for (;;)
    {
      return paramHeaderValueFormatter.formatElements(null, paramArrayOfHeaderElement, paramBoolean).toString();
      paramHeaderValueFormatter = b;
    }
  }
  
  public static String a(NameValuePair[] paramArrayOfNameValuePair, boolean paramBoolean, HeaderValueFormatter paramHeaderValueFormatter)
  {
    if (paramHeaderValueFormatter != null) {}
    for (;;)
    {
      return paramHeaderValueFormatter.formatParameters(null, paramArrayOfNameValuePair, paramBoolean).toString();
      paramHeaderValueFormatter = b;
    }
  }
  
  protected int a(HeaderElement paramHeaderElement)
  {
    int k = 0;
    int j;
    if (paramHeaderElement == null) {
      j = 0;
    }
    int i;
    int m;
    do
    {
      return j;
      j = paramHeaderElement.getName().length();
      String str = paramHeaderElement.getValue();
      i = j;
      if (str != null) {
        i = j + (str.length() + 3);
      }
      m = paramHeaderElement.getParameterCount();
      j = i;
    } while (m <= 0);
    for (;;)
    {
      j = i;
      if (k >= m) {
        break;
      }
      i += a(paramHeaderElement.getParameter(k)) + 2;
      k += 1;
    }
  }
  
  protected int a(NameValuePair paramNameValuePair)
  {
    int i;
    if (paramNameValuePair == null) {
      i = 0;
    }
    int j;
    do
    {
      return i;
      j = paramNameValuePair.getName().length();
      paramNameValuePair = paramNameValuePair.getValue();
      i = j;
    } while (paramNameValuePair == null);
    return j + (paramNameValuePair.length() + 3);
  }
  
  protected int a(HeaderElement[] paramArrayOfHeaderElement)
  {
    int i = 0;
    int k = i;
    if (paramArrayOfHeaderElement != null)
    {
      if (paramArrayOfHeaderElement.length < 1) {
        k = i;
      }
    }
    else {
      return k;
    }
    i = paramArrayOfHeaderElement.length;
    int m = paramArrayOfHeaderElement.length;
    i = (i - 1) * 2;
    int j = 0;
    for (;;)
    {
      k = i;
      if (j >= m) {
        break;
      }
      k = a(paramArrayOfHeaderElement[j]);
      j += 1;
      i = k + i;
    }
  }
  
  protected int a(NameValuePair[] paramArrayOfNameValuePair)
  {
    int i = 0;
    int k = i;
    if (paramArrayOfNameValuePair != null)
    {
      if (paramArrayOfNameValuePair.length < 1) {
        k = i;
      }
    }
    else {
      return k;
    }
    i = paramArrayOfNameValuePair.length;
    int m = paramArrayOfNameValuePair.length;
    i = (i - 1) * 2;
    int j = 0;
    for (;;)
    {
      k = i;
      if (j >= m) {
        break;
      }
      k = a(paramArrayOfNameValuePair[j]);
      j += 1;
      i = k + i;
    }
  }
  
  protected void a(CharArrayBuffer paramCharArrayBuffer, String paramString, boolean paramBoolean)
  {
    int j = 0;
    boolean bool = paramBoolean;
    if (!paramBoolean)
    {
      i = 0;
      for (;;)
      {
        bool = paramBoolean;
        if (i >= paramString.length()) {
          break;
        }
        bool = paramBoolean;
        if (paramBoolean) {
          break;
        }
        paramBoolean = a(paramString.charAt(i));
        i += 1;
      }
    }
    int i = j;
    if (bool)
    {
      paramCharArrayBuffer.append('"');
      i = j;
    }
    while (i < paramString.length())
    {
      char c1 = paramString.charAt(i);
      if (b(c1)) {
        paramCharArrayBuffer.append('\\');
      }
      paramCharArrayBuffer.append(c1);
      i += 1;
    }
    if (bool) {
      paramCharArrayBuffer.append('"');
    }
  }
  
  protected boolean a(char paramChar)
  {
    return " ;,:@()<>\\\"/[]?={}\t".indexOf(paramChar) >= 0;
  }
  
  protected boolean b(char paramChar)
  {
    return "\"\\".indexOf(paramChar) >= 0;
  }
  
  public CharArrayBuffer formatElements(CharArrayBuffer paramCharArrayBuffer, HeaderElement[] paramArrayOfHeaderElement, boolean paramBoolean)
  {
    org.a.a.o.a.a(paramArrayOfHeaderElement, "Header element array");
    int i = a(paramArrayOfHeaderElement);
    if (paramCharArrayBuffer == null) {
      paramCharArrayBuffer = new CharArrayBuffer(i);
    }
    for (;;)
    {
      i = 0;
      while (i < paramArrayOfHeaderElement.length)
      {
        if (i > 0) {
          paramCharArrayBuffer.append(", ");
        }
        formatHeaderElement(paramCharArrayBuffer, paramArrayOfHeaderElement[i], paramBoolean);
        i += 1;
      }
      paramCharArrayBuffer.ensureCapacity(i);
    }
    return paramCharArrayBuffer;
  }
  
  public CharArrayBuffer formatHeaderElement(CharArrayBuffer paramCharArrayBuffer, HeaderElement paramHeaderElement, boolean paramBoolean)
  {
    org.a.a.o.a.a(paramHeaderElement, "Header element");
    int i = a(paramHeaderElement);
    if (paramCharArrayBuffer == null) {
      paramCharArrayBuffer = new CharArrayBuffer(i);
    }
    for (;;)
    {
      paramCharArrayBuffer.append(paramHeaderElement.getName());
      String str = paramHeaderElement.getValue();
      if (str != null)
      {
        paramCharArrayBuffer.append('=');
        a(paramCharArrayBuffer, str, paramBoolean);
      }
      int j = paramHeaderElement.getParameterCount();
      if (j <= 0) {
        break;
      }
      i = 0;
      while (i < j)
      {
        paramCharArrayBuffer.append("; ");
        formatNameValuePair(paramCharArrayBuffer, paramHeaderElement.getParameter(i), paramBoolean);
        i += 1;
      }
      paramCharArrayBuffer.ensureCapacity(i);
    }
    return paramCharArrayBuffer;
  }
  
  public CharArrayBuffer formatNameValuePair(CharArrayBuffer paramCharArrayBuffer, NameValuePair paramNameValuePair, boolean paramBoolean)
  {
    org.a.a.o.a.a(paramNameValuePair, "Name / value pair");
    int i = a(paramNameValuePair);
    if (paramCharArrayBuffer == null) {
      paramCharArrayBuffer = new CharArrayBuffer(i);
    }
    for (;;)
    {
      paramCharArrayBuffer.append(paramNameValuePair.getName());
      paramNameValuePair = paramNameValuePair.getValue();
      if (paramNameValuePair != null)
      {
        paramCharArrayBuffer.append('=');
        a(paramCharArrayBuffer, paramNameValuePair, paramBoolean);
      }
      return paramCharArrayBuffer;
      paramCharArrayBuffer.ensureCapacity(i);
    }
  }
  
  public CharArrayBuffer formatParameters(CharArrayBuffer paramCharArrayBuffer, NameValuePair[] paramArrayOfNameValuePair, boolean paramBoolean)
  {
    org.a.a.o.a.a(paramArrayOfNameValuePair, "Header parameter array");
    int i = a(paramArrayOfNameValuePair);
    if (paramCharArrayBuffer == null) {
      paramCharArrayBuffer = new CharArrayBuffer(i);
    }
    for (;;)
    {
      i = 0;
      while (i < paramArrayOfNameValuePair.length)
      {
        if (i > 0) {
          paramCharArrayBuffer.append("; ");
        }
        formatNameValuePair(paramCharArrayBuffer, paramArrayOfNameValuePair[i], paramBoolean);
        i += 1;
      }
      paramCharArrayBuffer.ensureCapacity(i);
    }
    return paramCharArrayBuffer;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */