package com.baidu.tts.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.DisplayMetrics;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.zip.GZIPOutputStream;

public class d
{
  public static long a(Context paramContext)
  {
    return paramContext.getSharedPreferences("tts", 0).getLong("last_upload_stat_time", 0L);
  }
  
  public static String a()
  {
    return "1.0.0-20140804";
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return null;
    }
    try
    {
      paramArrayOfByte = new String(Base64.encode(paramArrayOfByte, 0, paramArrayOfByte.length, 0), "utf-8");
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return null;
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    paramContext = paramContext.getSharedPreferences("tts", 0).edit();
    paramContext.putInt("last_download_stat_period", paramInt);
    paramContext.commit();
  }
  
  public static void a(Context paramContext, long paramLong)
  {
    paramContext = paramContext.getSharedPreferences("tts", 0).edit();
    paramContext.putLong("last_upload_stat_time", paramLong);
    paramContext.commit();
  }
  
  public static byte[] a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(localByteArrayOutputStream);
      localGZIPOutputStream.write(paramString.getBytes("utf-8"));
      localGZIPOutputStream.close();
      paramString = localByteArrayOutputStream.toByteArray();
      localByteArrayOutputStream.flush();
      localByteArrayOutputStream.close();
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
      return null;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  public static int b(Context paramContext)
  {
    return paramContext.getSharedPreferences("tts", 0).getInt("last_download_stat_period", 0);
  }
  
  public static String b()
  {
    return "Android";
  }
  
  private static String b(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = (X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(paramArrayOfByte));
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramArrayOfByte.getEncoded());
      paramArrayOfByte = c(localMessageDigest.digest());
      return paramArrayOfByte;
    }
    catch (CertificateException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return null;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return null;
  }
  
  public static String c()
  {
    return "离线TTS SDK";
  }
  
  public static String c(Context paramContext)
  {
    return h(paramContext);
  }
  
  private static String c(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      if (str.length() == 1) {
        localStringBuffer.append("0");
      }
      localStringBuffer.append(str);
      i += 1;
    }
    return localStringBuffer.toString();
  }
  
  public static String d(Context paramContext)
  {
    return b() + "&" + Build.MODEL + "&" + Build.VERSION.RELEASE + "&" + Build.VERSION.SDK_INT + "&" + e(paramContext);
  }
  
  @SuppressLint({"DefaultLocale"})
  public static int e(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((paramContext != null) && ("wifi".equals(paramContext.getTypeName().toLowerCase()))) {
      return 1;
    }
    return 3;
  }
  
  public static String f(Context paramContext)
  {
    paramContext = paramContext.getResources().getDisplayMetrics();
    int i = paramContext.widthPixels;
    int j = paramContext.heightPixels;
    return i + "*" + j;
  }
  
  public static String g(Context paramContext)
  {
    try
    {
      paramContext = b(paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64).signatures[0].toByteArray());
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
  
  /* Error */
  private static String h(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: invokevirtual 270	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   6: astore_1
    //   7: aload_1
    //   8: aload_0
    //   9: invokevirtual 273	android/content/Context:getPackageName	()Ljava/lang/String;
    //   12: iconst_0
    //   13: invokevirtual 297	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   16: astore_0
    //   17: aload_1
    //   18: aload_0
    //   19: invokevirtual 301	android/content/pm/PackageManager:getApplicationLabel	(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    //   22: checkcast 31	java/lang/String
    //   25: areturn
    //   26: astore_0
    //   27: aconst_null
    //   28: astore_1
    //   29: aload_2
    //   30: astore_0
    //   31: goto -14 -> 17
    //   34: astore_0
    //   35: aload_2
    //   36: astore_0
    //   37: goto -20 -> 17
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	paramContext	Context
    //   6	23	1	localPackageManager	android.content.pm.PackageManager
    //   1	35	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	26	android/content/pm/PackageManager$NameNotFoundException
    //   7	17	34	android/content/pm/PackageManager$NameNotFoundException
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */