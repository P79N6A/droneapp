package com.xiaomi.account.openauth;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.xiaomi.account.openauth.utils.Base64Coder;
import java.io.File;
import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public class AuthorizeHelper
{
  private static final String HMAC_SHA1 = "HmacSHA1";
  public static final String OAUTH2_HOST;
  public static final boolean USE_PREVIEW = new File("/data/system/oauth_staging_preview").exists();
  private static final String UTF8 = "UTF-8";
  private static Random random;
  
  static
  {
    if (USE_PREVIEW) {}
    for (String str = "http://account.preview.n.xiaomi.net";; str = "https://account.xiaomi.com")
    {
      OAUTH2_HOST = str;
      random = new Random();
      return;
    }
  }
  
  protected static HashMap<String, String> buildMacRequestHead(String paramString1, String paramString2, String paramString3)
  {
    paramString1 = String.format("MAC access_token=\"%s\", nonce=\"%s\",mac=\"%s\"", new Object[] { URLEncoder.encode(paramString1, "UTF-8"), URLEncoder.encode(paramString2, "UTF-8"), URLEncoder.encode(paramString3, "UTF-8") });
    paramString2 = new HashMap();
    paramString2.put("Authorization", paramString1);
    return paramString2;
  }
  
  protected static String encodeSign(byte[] paramArrayOfByte)
  {
    return new String(Base64Coder.encode(paramArrayOfByte));
  }
  
  protected static byte[] encryptHMACSha1(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte2 = new SecretKeySpec(paramArrayOfByte2, "HmacSHA1");
    Mac localMac = Mac.getInstance("HmacSHA1");
    localMac.init(paramArrayOfByte2);
    localMac.update(paramArrayOfByte1);
    return localMac.doFinal();
  }
  
  protected static String generateNonce()
  {
    long l = random.nextLong();
    int i = (int)(System.currentTimeMillis() / 60000L);
    return l + ":" + i;
  }
  
  protected static String generateUrl(String paramString, List<NameValuePair> paramList)
  {
    Object localObject = paramString;
    if (paramList != null)
    {
      localObject = paramString;
      if (paramList.size() > 0)
      {
        paramString = Uri.parse(paramString).buildUpon();
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          localObject = (NameValuePair)paramList.next();
          paramString.appendQueryParameter(((NameValuePair)localObject).getName(), ((NameValuePair)localObject).getValue());
        }
        localObject = paramString.build().toString();
      }
    }
    return (String)localObject;
  }
  
  protected static String getMacAccessTokenSignatureString(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    if ("HmacSHA1".equalsIgnoreCase(paramString7))
    {
      paramString7 = new StringBuilder("");
      paramString7.append(paramString1 + "\n");
      paramString7.append(paramString2.toUpperCase() + "\n");
      paramString7.append(paramString3 + "\n");
      paramString7.append(paramString4 + "\n");
      if (!TextUtils.isEmpty(paramString5))
      {
        paramString1 = new StringBuffer();
        paramString2 = new ArrayList();
        URLEncodedUtils.parse(paramString2, new Scanner(paramString5), "UTF-8");
        Collections.sort(paramString2, new Comparator()
        {
          public int compare(NameValuePair paramAnonymousNameValuePair1, NameValuePair paramAnonymousNameValuePair2)
          {
            return paramAnonymousNameValuePair1.getName().compareTo(paramAnonymousNameValuePair2.getName());
          }
        });
        paramString1.append(URLEncodedUtils.format(paramString2, "UTF-8"));
        paramString7.append(paramString1.toString() + "\n");
      }
      return encodeSign(encryptHMACSha1(paramString7.toString().getBytes("UTF-8"), paramString6.getBytes("UTF-8")));
    }
    throw new NoSuchAlgorithmException("error mac algorithm : " + paramString7);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/xiaomi/account/openauth/AuthorizeHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */