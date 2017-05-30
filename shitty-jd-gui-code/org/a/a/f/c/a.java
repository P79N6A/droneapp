package org.a.a.f.c;

import android.util.Log;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.security.auth.x500.X500Principal;
import org.a.a.a.b;
import org.a.a.o.f;
import org.apache.http.NameValuePair;
import org.apache.http.conn.ssl.X509HostnameVerifier;

@b
public abstract class a
  implements X509HostnameVerifier
{
  private static final String[] a = { "ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org" };
  private static final String b = "HttpClient";
  
  static
  {
    Arrays.sort(a);
  }
  
  @Deprecated
  public static boolean a(String paramString)
  {
    paramString = paramString.split("\\.");
    if ((paramString.length != 3) || (paramString[2].length() != 2)) {}
    while (Arrays.binarySearch(a, paramString[1]) < 0) {
      return true;
    }
    return false;
  }
  
  public static String[] a(X509Certificate paramX509Certificate)
  {
    paramX509Certificate = paramX509Certificate.getSubjectX500Principal().toString();
    try
    {
      paramX509Certificate = c(paramX509Certificate);
      return paramX509Certificate;
    }
    catch (SSLException paramX509Certificate) {}
    return null;
  }
  
  private static String[] a(X509Certificate paramX509Certificate, String paramString)
  {
    int i;
    if (e(paramString)) {
      i = 7;
    }
    for (;;)
    {
      paramString = new LinkedList();
      try
      {
        paramX509Certificate = paramX509Certificate.getSubjectAlternativeNames();
        if (paramX509Certificate != null)
        {
          paramX509Certificate = paramX509Certificate.iterator();
          while (paramX509Certificate.hasNext())
          {
            List localList = (List)paramX509Certificate.next();
            if (((Integer)localList.get(0)).intValue() == i)
            {
              paramString.add((String)localList.get(1));
              continue;
              i = 2;
            }
          }
        }
      }
      catch (CertificateParsingException paramX509Certificate)
      {
        for (;;)
        {
          paramX509Certificate = null;
        }
        if (!paramString.isEmpty())
        {
          paramX509Certificate = new String[paramString.size()];
          paramString.toArray(paramX509Certificate);
          return paramX509Certificate;
        }
      }
    }
    return null;
  }
  
  public static String[] b(X509Certificate paramX509Certificate)
  {
    return a(paramX509Certificate, null);
  }
  
  static String[] c(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    List localList = d.a.a(paramString);
    int i = 0;
    while (i < localList.size())
    {
      Object localObject = (NameValuePair)localList.get(i);
      String str = ((NameValuePair)localObject).getName();
      localObject = ((NameValuePair)localObject).getValue();
      if (f.b(str)) {
        throw new SSLException(paramString + " is not a valid X500 distinguished name");
      }
      if (str.equalsIgnoreCase("cn")) {
        localArrayList.add(localObject);
      }
      i += 1;
    }
    if (localArrayList.isEmpty()) {}
    for (paramString = null;; paramString = (String[])localArrayList.toArray(new String[localArrayList.size()])) {
      return paramString;
    }
  }
  
  public static int d(String paramString)
  {
    int i = 0;
    int k;
    for (int j = 0; i < paramString.length(); j = k)
    {
      k = j;
      if (paramString.charAt(i) == '.') {
        k = j + 1;
      }
      i += 1;
    }
    return j;
  }
  
  private static boolean e(String paramString)
  {
    return (paramString != null) && ((org.a.a.f.d.a.a(paramString)) || (org.a.a.f.d.a.e(paramString)));
  }
  
  private String f(String paramString)
  {
    if ((paramString == null) || (!org.a.a.f.d.a.e(paramString))) {
      return paramString;
    }
    try
    {
      String str = InetAddress.getByName(paramString).getHostAddress();
      return str;
    }
    catch (UnknownHostException localUnknownHostException)
    {
      Log.e("HttpClient", "Unexpected error converting " + paramString, localUnknownHostException);
    }
    return paramString;
  }
  
  public final void a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean)
  {
    Object localObject1 = new LinkedList();
    if ((paramArrayOfString1 != null) && (paramArrayOfString1.length > 0) && (paramArrayOfString1[0] != null)) {
      ((LinkedList)localObject1).add(paramArrayOfString1[0]);
    }
    int i;
    if (paramArrayOfString2 != null)
    {
      int j = paramArrayOfString2.length;
      i = 0;
      while (i < j)
      {
        paramArrayOfString1 = paramArrayOfString2[i];
        if (paramArrayOfString1 != null) {
          ((LinkedList)localObject1).add(paramArrayOfString1);
        }
        i += 1;
      }
    }
    if (((LinkedList)localObject1).isEmpty()) {
      throw new SSLException("Certificate for <" + paramString + "> doesn't contain CN or DNS subjectAlt");
    }
    paramArrayOfString1 = new StringBuilder();
    paramArrayOfString2 = f(paramString.trim().toLowerCase(Locale.ENGLISH));
    localObject1 = ((LinkedList)localObject1).iterator();
    boolean bool2 = false;
    boolean bool1 = bool2;
    String str1;
    if (((Iterator)localObject1).hasNext())
    {
      str1 = ((String)((Iterator)localObject1).next()).toLowerCase(Locale.ENGLISH);
      paramArrayOfString1.append(" <");
      paramArrayOfString1.append(str1);
      paramArrayOfString1.append('>');
      if (((Iterator)localObject1).hasNext()) {
        paramArrayOfString1.append(" OR");
      }
      Object localObject2 = str1.split("\\.");
      if ((localObject2.length < 3) || (!localObject2[0].endsWith("*")) || (!b(str1)) || (e(paramString))) {
        break label432;
      }
      i = 1;
      label267:
      if (i == 0) {
        break label465;
      }
      String str2 = localObject2[0];
      if (str2.length() <= 1) {
        break label444;
      }
      localObject2 = str2.substring(0, str2.length() - 1);
      str2 = str1.substring(str2.length());
      String str3 = paramArrayOfString2.substring(((String)localObject2).length());
      if ((!paramArrayOfString2.startsWith((String)localObject2)) || (!str3.endsWith(str2))) {
        break label438;
      }
      bool2 = true;
      label347:
      bool1 = bool2;
      if (bool2)
      {
        bool1 = bool2;
        if (paramBoolean)
        {
          if (d(paramArrayOfString2) != d(str1)) {
            break label459;
          }
          bool1 = true;
        }
      }
    }
    for (;;)
    {
      bool2 = bool1;
      if (!bool1) {
        break;
      }
      if (bool1) {
        return;
      }
      throw new SSLException("hostname in certificate didn't match: <" + paramString + "> !=" + paramArrayOfString1);
      label432:
      i = 0;
      break label267;
      label438:
      bool2 = false;
      break label347;
      label444:
      bool2 = paramArrayOfString2.endsWith(str1.substring(1));
      break label347;
      label459:
      bool1 = false;
      continue;
      label465:
      bool1 = paramArrayOfString2.equals(f(str1));
    }
  }
  
  boolean b(String paramString)
  {
    paramString = paramString.split("\\.");
    if ((paramString.length != 3) || (paramString[2].length() != 2)) {}
    while (Arrays.binarySearch(a, paramString[1]) < 0) {
      return true;
    }
    return false;
  }
  
  public final void verify(String paramString, X509Certificate paramX509Certificate)
  {
    verify(paramString, a(paramX509Certificate), a(paramX509Certificate, paramString));
  }
  
  public final void verify(String paramString, SSLSocket paramSSLSocket)
  {
    if (paramString == null) {
      throw new NullPointerException("host to verify is null");
    }
    SSLSession localSSLSession2 = paramSSLSocket.getSession();
    SSLSession localSSLSession1 = localSSLSession2;
    if (localSSLSession2 == null)
    {
      paramSSLSocket.getInputStream().available();
      localSSLSession2 = paramSSLSocket.getSession();
      localSSLSession1 = localSSLSession2;
      if (localSSLSession2 == null)
      {
        paramSSLSocket.startHandshake();
        localSSLSession1 = paramSSLSocket.getSession();
      }
    }
    verify(paramString, (X509Certificate)localSSLSession1.getPeerCertificates()[0]);
  }
  
  public final boolean verify(String paramString, SSLSession paramSSLSession)
  {
    try
    {
      verify(paramString, (X509Certificate)paramSSLSession.getPeerCertificates()[0]);
      return true;
    }
    catch (SSLException paramString) {}
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/f/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */