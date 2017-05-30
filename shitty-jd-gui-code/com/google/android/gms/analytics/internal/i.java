package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

class i
  extends t
{
  private static final byte[] c = "\n".getBytes();
  private final String a = a("GoogleAnalytics", u.a, Build.VERSION.RELEASE, p.a(Locale.getDefault()), Build.MODEL, Build.ID);
  private final m b;
  
  i(v paramv)
  {
    super(paramv);
    this.b = new m(paramv.d());
  }
  
  /* Error */
  private int a(URL paramURL, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 7
    //   6: aconst_null
    //   7: astore 8
    //   9: aconst_null
    //   10: astore 6
    //   12: aload_1
    //   13: invokestatic 84	com/google/android/gms/common/internal/d:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   16: pop
    //   17: aload_2
    //   18: invokestatic 84	com/google/android/gms/common/internal/d:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   21: pop
    //   22: aload_0
    //   23: ldc 86
    //   25: aload_2
    //   26: arraylength
    //   27: invokestatic 92	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   30: aload_1
    //   31: invokevirtual 95	com/google/android/gms/analytics/internal/i:b	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   34: aload_0
    //   35: invokevirtual 99	com/google/android/gms/analytics/internal/i:B	()Z
    //   38: ifeq +17 -> 55
    //   41: aload_0
    //   42: ldc 101
    //   44: new 18	java/lang/String
    //   47: dup
    //   48: aload_2
    //   49: invokespecial 104	java/lang/String:<init>	([B)V
    //   52: invokevirtual 107	com/google/android/gms/analytics/internal/i:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   55: aload_0
    //   56: aload_0
    //   57: invokevirtual 111	com/google/android/gms/analytics/internal/i:o	()Landroid/content/Context;
    //   60: invokevirtual 117	android/content/Context:getPackageName	()Ljava/lang/String;
    //   63: invokevirtual 120	com/google/android/gms/analytics/internal/i:a	(Ljava/lang/String;)V
    //   66: aload_0
    //   67: aload_1
    //   68: invokevirtual 123	com/google/android/gms/analytics/internal/i:a	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   71: astore_1
    //   72: aload_1
    //   73: astore 5
    //   75: aload 7
    //   77: astore_1
    //   78: aload 5
    //   80: astore 4
    //   82: aload 8
    //   84: astore 6
    //   86: aload 5
    //   88: iconst_1
    //   89: invokevirtual 129	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   92: aload 7
    //   94: astore_1
    //   95: aload 5
    //   97: astore 4
    //   99: aload 8
    //   101: astore 6
    //   103: aload 5
    //   105: aload_2
    //   106: arraylength
    //   107: invokevirtual 133	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   110: aload 7
    //   112: astore_1
    //   113: aload 5
    //   115: astore 4
    //   117: aload 8
    //   119: astore 6
    //   121: aload 5
    //   123: invokevirtual 136	java/net/HttpURLConnection:connect	()V
    //   126: aload 7
    //   128: astore_1
    //   129: aload 5
    //   131: astore 4
    //   133: aload 8
    //   135: astore 6
    //   137: aload 5
    //   139: invokevirtual 140	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   142: astore 7
    //   144: aload 7
    //   146: astore_1
    //   147: aload 5
    //   149: astore 4
    //   151: aload 7
    //   153: astore 6
    //   155: aload 7
    //   157: aload_2
    //   158: invokevirtual 145	java/io/OutputStream:write	([B)V
    //   161: aload 7
    //   163: astore_1
    //   164: aload 5
    //   166: astore 4
    //   168: aload 7
    //   170: astore 6
    //   172: aload_0
    //   173: aload 5
    //   175: invokespecial 148	com/google/android/gms/analytics/internal/i:a	(Ljava/net/HttpURLConnection;)V
    //   178: aload 7
    //   180: astore_1
    //   181: aload 5
    //   183: astore 4
    //   185: aload 7
    //   187: astore 6
    //   189: aload 5
    //   191: invokevirtual 152	java/net/HttpURLConnection:getResponseCode	()I
    //   194: istore_3
    //   195: iload_3
    //   196: sipush 200
    //   199: if_icmpne +21 -> 220
    //   202: aload 7
    //   204: astore_1
    //   205: aload 5
    //   207: astore 4
    //   209: aload 7
    //   211: astore 6
    //   213: aload_0
    //   214: invokevirtual 156	com/google/android/gms/analytics/internal/i:t	()Lcom/google/android/gms/analytics/internal/r;
    //   217: invokevirtual 161	com/google/android/gms/analytics/internal/r:i	()V
    //   220: aload 7
    //   222: astore_1
    //   223: aload 5
    //   225: astore 4
    //   227: aload 7
    //   229: astore 6
    //   231: aload_0
    //   232: ldc -93
    //   234: iload_3
    //   235: invokestatic 92	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   238: invokevirtual 165	com/google/android/gms/analytics/internal/i:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   241: aload 7
    //   243: ifnull +8 -> 251
    //   246: aload 7
    //   248: invokevirtual 168	java/io/OutputStream:close	()V
    //   251: aload 5
    //   253: ifnull +8 -> 261
    //   256: aload 5
    //   258: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   261: aload_0
    //   262: invokevirtual 173	com/google/android/gms/analytics/internal/i:c	()V
    //   265: iload_3
    //   266: ireturn
    //   267: astore_1
    //   268: aload_0
    //   269: ldc -81
    //   271: aload_1
    //   272: invokevirtual 178	com/google/android/gms/analytics/internal/i:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   275: goto -24 -> 251
    //   278: astore_2
    //   279: aconst_null
    //   280: astore 5
    //   282: aload 6
    //   284: astore_1
    //   285: aload 5
    //   287: astore 4
    //   289: aload_0
    //   290: ldc -76
    //   292: aload_2
    //   293: invokevirtual 182	com/google/android/gms/analytics/internal/i:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   296: aload 6
    //   298: ifnull +8 -> 306
    //   301: aload 6
    //   303: invokevirtual 168	java/io/OutputStream:close	()V
    //   306: aload 5
    //   308: ifnull +8 -> 316
    //   311: aload 5
    //   313: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   316: aload_0
    //   317: invokevirtual 173	com/google/android/gms/analytics/internal/i:c	()V
    //   320: iconst_0
    //   321: ireturn
    //   322: astore_1
    //   323: aload_0
    //   324: ldc -81
    //   326: aload_1
    //   327: invokevirtual 178	com/google/android/gms/analytics/internal/i:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   330: goto -24 -> 306
    //   333: astore_2
    //   334: aconst_null
    //   335: astore 4
    //   337: aload 5
    //   339: astore_1
    //   340: aload_1
    //   341: ifnull +7 -> 348
    //   344: aload_1
    //   345: invokevirtual 168	java/io/OutputStream:close	()V
    //   348: aload 4
    //   350: ifnull +8 -> 358
    //   353: aload 4
    //   355: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   358: aload_0
    //   359: invokevirtual 173	com/google/android/gms/analytics/internal/i:c	()V
    //   362: aload_2
    //   363: athrow
    //   364: astore_1
    //   365: aload_0
    //   366: ldc -81
    //   368: aload_1
    //   369: invokevirtual 178	com/google/android/gms/analytics/internal/i:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   372: goto -24 -> 348
    //   375: astore_2
    //   376: goto -36 -> 340
    //   379: astore_2
    //   380: goto -98 -> 282
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	383	0	this	i
    //   0	383	1	paramURL	URL
    //   0	383	2	paramArrayOfByte	byte[]
    //   194	72	3	i	int
    //   80	274	4	localURL1	URL
    //   1	337	5	localURL2	URL
    //   10	292	6	localObject1	Object
    //   4	243	7	localOutputStream	java.io.OutputStream
    //   7	127	8	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   246	251	267	java/io/IOException
    //   55	72	278	java/io/IOException
    //   301	306	322	java/io/IOException
    //   55	72	333	finally
    //   344	348	364	java/io/IOException
    //   86	92	375	finally
    //   103	110	375	finally
    //   121	126	375	finally
    //   137	144	375	finally
    //   155	161	375	finally
    //   172	178	375	finally
    //   189	195	375	finally
    //   213	220	375	finally
    //   231	241	375	finally
    //   289	296	375	finally
    //   86	92	379	java/io/IOException
    //   103	110	379	java/io/IOException
    //   121	126	379	java/io/IOException
    //   137	144	379	java/io/IOException
    //   155	161	379	java/io/IOException
    //   172	178	379	java/io/IOException
    //   189	195	379	java/io/IOException
    //   213	220	379	java/io/IOException
    //   231	241	379	java/io/IOException
  }
  
  private static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6 });
  }
  
  private URL a(c paramc, String paramString)
  {
    String str;
    if (paramc.f())
    {
      paramc = String.valueOf(q().o());
      str = String.valueOf(q().q());
    }
    for (paramc = String.valueOf(paramc).length() + 1 + String.valueOf(str).length() + String.valueOf(paramString).length() + paramc + str + "?" + paramString;; paramc = String.valueOf(paramc).length() + 1 + String.valueOf(str).length() + String.valueOf(paramString).length() + paramc + str + "?" + paramString)
    {
      try
      {
        paramc = new URL(paramc);
        return paramc;
      }
      catch (MalformedURLException paramc)
      {
        e("Error trying to parse the hardcoded host url", paramc);
      }
      paramc = String.valueOf(q().p());
      str = String.valueOf(q().q());
    }
    return null;
  }
  
  private void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    if (paramStringBuilder.length() != 0) {
      paramStringBuilder.append('&');
    }
    paramStringBuilder.append(URLEncoder.encode(paramString1, "UTF-8"));
    paramStringBuilder.append('=');
    paramStringBuilder.append(URLEncoder.encode(paramString2, "UTF-8"));
  }
  
  private void a(HttpURLConnection paramHttpURLConnection)
  {
    localHttpURLConnection = null;
    try
    {
      paramHttpURLConnection = paramHttpURLConnection.getInputStream();
      localHttpURLConnection = paramHttpURLConnection;
      byte[] arrayOfByte = new byte['Ѐ'];
      int i;
      do
      {
        localHttpURLConnection = paramHttpURLConnection;
        i = paramHttpURLConnection.read(arrayOfByte);
      } while (i > 0);
      if (paramHttpURLConnection != null) {}
      try
      {
        paramHttpURLConnection.close();
        return;
      }
      catch (IOException paramHttpURLConnection)
      {
        e("Error closing http connection input stream", paramHttpURLConnection);
        return;
      }
      try
      {
        localHttpURLConnection.close();
        throw paramHttpURLConnection;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          e("Error closing http connection input stream", localIOException);
        }
      }
    }
    finally
    {
      if (localHttpURLConnection == null) {}
    }
  }
  
  private boolean a(c paramc)
  {
    d.a(paramc);
    boolean bool;
    Object localObject;
    if (!paramc.f())
    {
      bool = true;
      localObject = a(paramc, bool);
      if (localObject != null) {
        break label43;
      }
      p().a(paramc, "Error formatting hit for upload");
    }
    label43:
    label90:
    do
    {
      do
      {
        return true;
        bool = false;
        break;
        if (((String)localObject).length() > q().d()) {
          break label90;
        }
        paramc = a(paramc, (String)localObject);
        if (paramc == null)
        {
          u("Failed to build collect GET endpoint url");
          return false;
        }
      } while (b(paramc) == 200);
      return false;
      localObject = a(paramc, false);
      if (localObject == null)
      {
        p().a(paramc, "Error formatting hit for POST upload");
        return true;
      }
      localObject = ((String)localObject).getBytes();
      if (localObject.length > q().f())
      {
        p().a(paramc, "Hit payload exceeds size limit");
        return true;
      }
      paramc = b(paramc);
      if (paramc == null)
      {
        u("Failed to build collect POST endpoint url");
        return false;
      }
    } while (a(paramc, (byte[])localObject) == 200);
    return false;
  }
  
  private static byte[] a(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(localByteArrayOutputStream);
    localGZIPOutputStream.write(paramArrayOfByte);
    localGZIPOutputStream.close();
    localByteArrayOutputStream.close();
    return localByteArrayOutputStream.toByteArray();
  }
  
  private int b(URL paramURL)
  {
    d.a(paramURL);
    b("GET request", paramURL);
    Object localObject = null;
    URL localURL = null;
    try
    {
      paramURL = a(paramURL);
      localURL = paramURL;
      localObject = paramURL;
      paramURL.connect();
      localURL = paramURL;
      localObject = paramURL;
      a(paramURL);
      localURL = paramURL;
      localObject = paramURL;
      int i = paramURL.getResponseCode();
      if (i == 200)
      {
        localURL = paramURL;
        localObject = paramURL;
        t().i();
      }
      localURL = paramURL;
      localObject = paramURL;
      b("GET status", Integer.valueOf(i));
      if (paramURL != null) {
        paramURL.disconnect();
      }
      return i;
    }
    catch (IOException paramURL)
    {
      localObject = localURL;
      d("Network GET connection error", paramURL);
      if (localURL != null) {
        localURL.disconnect();
      }
      return 0;
    }
    finally
    {
      if (localObject != null) {
        ((HttpURLConnection)localObject).disconnect();
      }
    }
  }
  
  /* Error */
  private int b(URL paramURL, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 4
    //   6: aload_1
    //   7: invokestatic 84	com/google/android/gms/common/internal/d:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   10: pop
    //   11: aload_2
    //   12: invokestatic 84	com/google/android/gms/common/internal/d:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   15: pop
    //   16: aload_0
    //   17: aload_0
    //   18: invokevirtual 111	com/google/android/gms/analytics/internal/i:o	()Landroid/content/Context;
    //   21: invokevirtual 117	android/content/Context:getPackageName	()Ljava/lang/String;
    //   24: invokevirtual 120	com/google/android/gms/analytics/internal/i:a	(Ljava/lang/String;)V
    //   27: aload_2
    //   28: invokestatic 325	com/google/android/gms/analytics/internal/i:a	([B)[B
    //   31: astore 6
    //   33: aload_0
    //   34: ldc_w 327
    //   37: aload 6
    //   39: arraylength
    //   40: invokestatic 92	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   43: ldc2_w 328
    //   46: aload 6
    //   48: arraylength
    //   49: i2l
    //   50: lmul
    //   51: aload_2
    //   52: arraylength
    //   53: i2l
    //   54: ldiv
    //   55: invokestatic 334	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   58: aload_1
    //   59: invokevirtual 337	com/google/android/gms/analytics/internal/i:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   62: aload 6
    //   64: arraylength
    //   65: aload_2
    //   66: arraylength
    //   67: if_icmple +21 -> 88
    //   70: aload_0
    //   71: ldc_w 339
    //   74: aload 6
    //   76: arraylength
    //   77: invokestatic 92	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   80: aload_2
    //   81: arraylength
    //   82: invokestatic 92	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   85: invokevirtual 341	com/google/android/gms/analytics/internal/i:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   88: aload_0
    //   89: invokevirtual 99	com/google/android/gms/analytics/internal/i:B	()Z
    //   92: ifeq +37 -> 129
    //   95: new 18	java/lang/String
    //   98: dup
    //   99: aload_2
    //   100: invokespecial 104	java/lang/String:<init>	([B)V
    //   103: invokestatic 209	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   106: astore_2
    //   107: aload_2
    //   108: invokevirtual 216	java/lang/String:length	()I
    //   111: ifeq +113 -> 224
    //   114: ldc 16
    //   116: aload_2
    //   117: invokevirtual 345	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   120: astore_2
    //   121: aload_0
    //   122: ldc_w 347
    //   125: aload_2
    //   126: invokevirtual 107	com/google/android/gms/analytics/internal/i:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   129: aload_0
    //   130: aload_1
    //   131: invokevirtual 123	com/google/android/gms/analytics/internal/i:a	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   134: astore_1
    //   135: aload_1
    //   136: iconst_1
    //   137: invokevirtual 129	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   140: aload_1
    //   141: ldc_w 349
    //   144: ldc_w 351
    //   147: invokevirtual 355	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   150: aload_1
    //   151: aload 6
    //   153: arraylength
    //   154: invokevirtual 133	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   157: aload_1
    //   158: invokevirtual 136	java/net/HttpURLConnection:connect	()V
    //   161: aload_1
    //   162: invokevirtual 140	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   165: astore_2
    //   166: aload_2
    //   167: aload 6
    //   169: invokevirtual 145	java/io/OutputStream:write	([B)V
    //   172: aload_2
    //   173: invokevirtual 168	java/io/OutputStream:close	()V
    //   176: aload_0
    //   177: aload_1
    //   178: invokespecial 148	com/google/android/gms/analytics/internal/i:a	(Ljava/net/HttpURLConnection;)V
    //   181: aload_1
    //   182: invokevirtual 152	java/net/HttpURLConnection:getResponseCode	()I
    //   185: istore_3
    //   186: iload_3
    //   187: sipush 200
    //   190: if_icmpne +10 -> 200
    //   193: aload_0
    //   194: invokevirtual 156	com/google/android/gms/analytics/internal/i:t	()Lcom/google/android/gms/analytics/internal/r;
    //   197: invokevirtual 161	com/google/android/gms/analytics/internal/r:i	()V
    //   200: aload_0
    //   201: ldc -93
    //   203: iload_3
    //   204: invokestatic 92	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   207: invokevirtual 165	com/google/android/gms/analytics/internal/i:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   210: aload_1
    //   211: ifnull +7 -> 218
    //   214: aload_1
    //   215: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   218: aload_0
    //   219: invokevirtual 173	com/google/android/gms/analytics/internal/i:c	()V
    //   222: iload_3
    //   223: ireturn
    //   224: new 18	java/lang/String
    //   227: dup
    //   228: ldc 16
    //   230: invokespecial 356	java/lang/String:<init>	(Ljava/lang/String;)V
    //   233: astore_2
    //   234: goto -113 -> 121
    //   237: astore_2
    //   238: aconst_null
    //   239: astore_1
    //   240: aload_0
    //   241: ldc_w 358
    //   244: aload_2
    //   245: invokevirtual 182	com/google/android/gms/analytics/internal/i:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   248: aload 4
    //   250: ifnull +8 -> 258
    //   253: aload 4
    //   255: invokevirtual 168	java/io/OutputStream:close	()V
    //   258: aload_1
    //   259: ifnull +7 -> 266
    //   262: aload_1
    //   263: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   266: aload_0
    //   267: invokevirtual 173	com/google/android/gms/analytics/internal/i:c	()V
    //   270: iconst_0
    //   271: ireturn
    //   272: astore_2
    //   273: aload_0
    //   274: ldc_w 360
    //   277: aload_2
    //   278: invokevirtual 178	com/google/android/gms/analytics/internal/i:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   281: goto -23 -> 258
    //   284: astore_2
    //   285: aconst_null
    //   286: astore_1
    //   287: aload 5
    //   289: astore 4
    //   291: aload 4
    //   293: ifnull +8 -> 301
    //   296: aload 4
    //   298: invokevirtual 168	java/io/OutputStream:close	()V
    //   301: aload_1
    //   302: ifnull +7 -> 309
    //   305: aload_1
    //   306: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   309: aload_0
    //   310: invokevirtual 173	com/google/android/gms/analytics/internal/i:c	()V
    //   313: aload_2
    //   314: athrow
    //   315: astore 4
    //   317: aload_0
    //   318: ldc_w 360
    //   321: aload 4
    //   323: invokevirtual 178	com/google/android/gms/analytics/internal/i:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   326: goto -25 -> 301
    //   329: astore_2
    //   330: aload 5
    //   332: astore 4
    //   334: goto -43 -> 291
    //   337: astore 5
    //   339: aload_2
    //   340: astore 4
    //   342: aload 5
    //   344: astore_2
    //   345: goto -54 -> 291
    //   348: astore_2
    //   349: goto -58 -> 291
    //   352: astore_2
    //   353: goto -113 -> 240
    //   356: astore 5
    //   358: aload_2
    //   359: astore 4
    //   361: aload 5
    //   363: astore_2
    //   364: goto -124 -> 240
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	367	0	this	i
    //   0	367	1	paramURL	URL
    //   0	367	2	paramArrayOfByte	byte[]
    //   185	38	3	i	int
    //   4	293	4	localObject1	Object
    //   315	7	4	localIOException1	IOException
    //   332	28	4	localObject2	Object
    //   1	330	5	localObject3	Object
    //   337	6	5	localObject4	Object
    //   356	6	5	localIOException2	IOException
    //   31	137	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   16	88	237	java/io/IOException
    //   88	121	237	java/io/IOException
    //   121	129	237	java/io/IOException
    //   129	135	237	java/io/IOException
    //   224	234	237	java/io/IOException
    //   253	258	272	java/io/IOException
    //   16	88	284	finally
    //   88	121	284	finally
    //   121	129	284	finally
    //   129	135	284	finally
    //   224	234	284	finally
    //   296	301	315	java/io/IOException
    //   135	166	329	finally
    //   176	186	329	finally
    //   193	200	329	finally
    //   200	210	329	finally
    //   166	176	337	finally
    //   240	248	348	finally
    //   135	166	352	java/io/IOException
    //   176	186	352	java/io/IOException
    //   193	200	352	java/io/IOException
    //   200	210	352	java/io/IOException
    //   166	176	356	java/io/IOException
  }
  
  private URL b(c paramc)
  {
    String str;
    if (paramc.f())
    {
      paramc = String.valueOf(q().o());
      str = String.valueOf(q().q());
      if (str.length() != 0) {}
      for (paramc = paramc.concat(str);; paramc = new String(paramc)) {
        try
        {
          paramc = new URL(paramc);
          return paramc;
        }
        catch (MalformedURLException paramc)
        {
          e("Error trying to parse the hardcoded host url", paramc);
        }
      }
    }
    else
    {
      paramc = String.valueOf(q().p());
      str = String.valueOf(q().q());
      if (str.length() != 0) {}
      for (paramc = paramc.concat(str);; paramc = new String(paramc)) {
        break;
      }
    }
    return null;
  }
  
  private String c(c paramc)
  {
    return String.valueOf(paramc.c());
  }
  
  private URL e()
  {
    Object localObject = String.valueOf(q().o());
    String str = String.valueOf(q().r());
    if (str.length() != 0) {}
    for (localObject = ((String)localObject).concat(str);; localObject = new String((String)localObject)) {
      try
      {
        localObject = new URL((String)localObject);
        return (URL)localObject;
      }
      catch (MalformedURLException localMalformedURLException)
      {
        e("Error trying to parse the hardcoded host url", localMalformedURLException);
      }
    }
    return null;
  }
  
  String a(c paramc, boolean paramBoolean)
  {
    d.a(paramc);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      Iterator localIterator = paramc.b().entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = (String)localEntry.getKey();
        if ((!"ht".equals(str)) && (!"qt".equals(str)) && (!"AppUID".equals(str)) && (!"z".equals(str)) && (!"_gmsv".equals(str))) {
          a(localStringBuilder, str, (String)localEntry.getValue());
        }
      }
      a(localStringBuilder, "ht", String.valueOf(paramc.d()));
    }
    catch (UnsupportedEncodingException paramc)
    {
      e("Failed to encode name or value", paramc);
      return null;
    }
    a(localStringBuilder, "qt", String.valueOf(n().a() - paramc.d()));
    if (q().a()) {
      a(localStringBuilder, "_gmsv", u.a);
    }
    long l;
    if (paramBoolean)
    {
      l = paramc.g();
      if (l == 0L) {
        break label251;
      }
    }
    label251:
    for (paramc = String.valueOf(l);; paramc = c(paramc))
    {
      a(localStringBuilder, "z", paramc);
      return localStringBuilder.toString();
    }
  }
  
  HttpURLConnection a(URL paramURL)
  {
    paramURL = paramURL.openConnection();
    if (!(paramURL instanceof HttpURLConnection)) {
      throw new IOException("Failed to obtain http connection");
    }
    paramURL = (HttpURLConnection)paramURL;
    paramURL.setDefaultUseCaches(false);
    paramURL.setConnectTimeout(q().D());
    paramURL.setReadTimeout(q().E());
    paramURL.setInstanceFollowRedirects(false);
    paramURL.setRequestProperty("User-Agent", this.a);
    paramURL.setDoInput(true);
    return paramURL;
  }
  
  public List<Long> a(List<c> paramList)
  {
    boolean bool = true;
    m();
    D();
    d.a(paramList);
    int j;
    if ((q().u().isEmpty()) || (!this.b.a(q().n() * 1000L)))
    {
      bool = false;
      j = 0;
      if (j != 0) {
        return a(paramList, bool);
      }
    }
    else
    {
      if (q().s() != ac.a) {}
      for (int i = 1;; i = 0)
      {
        j = i;
        if (q().t() == ae.b) {
          break;
        }
        bool = false;
        j = i;
        break;
      }
    }
    return b(paramList);
  }
  
  List<Long> a(List<c> paramList, boolean paramBoolean)
  {
    boolean bool;
    a locala;
    ArrayList localArrayList;
    if (!paramList.isEmpty())
    {
      bool = true;
      d.b(bool);
      a("Uploading batched hits. compression, count", Boolean.valueOf(paramBoolean), Integer.valueOf(paramList.size()));
      locala = new a();
      localArrayList = new ArrayList();
      paramList = paramList.iterator();
    }
    for (;;)
    {
      c localc;
      if (paramList.hasNext())
      {
        localc = (c)paramList.next();
        if (locala.a(localc)) {}
      }
      else
      {
        if (locala.a() != 0) {
          break label129;
        }
        return localArrayList;
        bool = false;
        break;
      }
      localArrayList.add(Long.valueOf(localc.c()));
    }
    label129:
    paramList = e();
    if (paramList == null)
    {
      u("Failed to build batching endpoint url");
      return Collections.emptyList();
    }
    if (paramBoolean) {}
    for (int i = b(paramList, locala.b()); 200 == i; i = a(paramList, locala.b()))
    {
      a("Batched upload completed. Hits batched", Integer.valueOf(locala.a()));
      return localArrayList;
    }
    a("Network error uploading hits. status code", Integer.valueOf(i));
    if (q().u().contains(Integer.valueOf(i)))
    {
      t("Server instructed the client to stop batching");
      this.b.a();
    }
    return Collections.emptyList();
  }
  
  protected void a()
  {
    a("Network initialized. User agent", this.a);
  }
  
  protected void a(String paramString) {}
  
  List<Long> b(List<c> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    do
    {
      c localc;
      if (paramList.hasNext())
      {
        localc = (c)paramList.next();
        if (a(localc)) {}
      }
      else
      {
        return localArrayList;
      }
      localArrayList.add(Long.valueOf(localc.c()));
    } while (localArrayList.size() < q().l());
    return localArrayList;
  }
  
  public boolean b()
  {
    m();
    D();
    Object localObject1 = (ConnectivityManager)o().getSystemService("connectivity");
    try
    {
      localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
      if ((localObject1 == null) || (!((NetworkInfo)localObject1).isConnected()))
      {
        q("No network connectivity");
        return false;
      }
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return true;
  }
  
  protected void c() {}
  
  private class a
  {
    private int b;
    private ByteArrayOutputStream c = new ByteArrayOutputStream();
    
    public a() {}
    
    public int a()
    {
      return this.b;
    }
    
    public boolean a(c paramc)
    {
      d.a(paramc);
      if (this.b + 1 > i.this.q().m()) {
        return false;
      }
      Object localObject = i.this.a(paramc, false);
      if (localObject == null)
      {
        i.this.p().a(paramc, "Error formatting hit");
        return true;
      }
      localObject = ((String)localObject).getBytes();
      int j = localObject.length;
      if (j > i.this.q().e())
      {
        i.this.p().a(paramc, "Hit size exceeds the maximum size limit");
        return true;
      }
      int i = j;
      if (this.c.size() > 0) {
        i = j + 1;
      }
      if (i + this.c.size() > i.this.q().g()) {
        return false;
      }
      try
      {
        if (this.c.size() > 0) {
          this.c.write(i.d());
        }
        this.c.write((byte[])localObject);
        this.b += 1;
        return true;
      }
      catch (IOException paramc)
      {
        i.this.e("Failed to write payload when batching hits", paramc);
      }
      return true;
    }
    
    public byte[] b()
    {
      return this.c.toByteArray();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */