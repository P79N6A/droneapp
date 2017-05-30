package com.xiaomi.account.openauth;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public class AuthorizeApi
{
  private static final int CONNECTION_TIMEOUT = 10000;
  private static final String HOST = "open.account.xiaomi.com";
  private static final String METHOD_GET = "GET";
  private static final String OAUTH_URL_BASE = "https://open.account.xiaomi.com";
  private static final int READ_TIMEOUT = 15000;
  private static final String UTF8 = "UTF-8";
  
  private static void closeQuietly(BufferedReader paramBufferedReader)
  {
    if (paramBufferedReader != null) {}
    try
    {
      paramBufferedReader.close();
      return;
    }
    catch (IOException paramBufferedReader) {}
  }
  
  @Deprecated
  public static String doHttpGet(Context paramContext, String paramString1, long paramLong, String paramString2)
  {
    return doHttpGet(paramString1, paramLong, paramString2, null, null);
  }
  
  @Deprecated
  public static String doHttpGet(Context paramContext, String paramString1, long paramLong, String paramString2, String paramString3, String paramString4)
  {
    return doHttpGet(paramString1, paramLong, paramString2, paramString3, paramString4);
  }
  
  public static String doHttpGet(String paramString1, long paramLong, String paramString2)
  {
    return doHttpGet(paramString1, paramLong, paramString2, null, null);
  }
  
  /* Error */
  public static String doHttpGet(String paramString1, long paramLong, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: new 53	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 54	java/util/ArrayList:<init>	()V
    //   7: astore 12
    //   9: aload 12
    //   11: new 56	org/apache/http/message/BasicNameValuePair
    //   14: dup
    //   15: ldc 58
    //   17: lload_1
    //   18: invokestatic 64	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   21: invokespecial 67	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: invokeinterface 73 2 0
    //   29: pop
    //   30: aload 12
    //   32: new 56	org/apache/http/message/BasicNameValuePair
    //   35: dup
    //   36: ldc 75
    //   38: aload_3
    //   39: invokespecial 67	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   42: invokeinterface 73 2 0
    //   47: pop
    //   48: aconst_null
    //   49: astore 10
    //   51: aconst_null
    //   52: astore 9
    //   54: aconst_null
    //   55: astore 7
    //   57: aconst_null
    //   58: astore 8
    //   60: aload 10
    //   62: astore 6
    //   64: new 77	java/net/URL
    //   67: dup
    //   68: new 79	java/lang/StringBuilder
    //   71: dup
    //   72: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   75: ldc 17
    //   77: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: aload_0
    //   81: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: aload 12
    //   89: invokestatic 94	com/xiaomi/account/openauth/AuthorizeHelper:generateUrl	(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    //   92: invokespecial 97	java/net/URL:<init>	(Ljava/lang/String;)V
    //   95: astore 11
    //   97: aload 10
    //   99: astore 6
    //   101: iconst_1
    //   102: invokestatic 103	java/net/HttpURLConnection:setFollowRedirects	(Z)V
    //   105: aload 10
    //   107: astore 6
    //   109: aload 11
    //   111: invokevirtual 107	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   114: checkcast 99	java/net/HttpURLConnection
    //   117: astore 11
    //   119: aload 10
    //   121: astore 6
    //   123: aload 11
    //   125: iconst_1
    //   126: invokevirtual 110	java/net/HttpURLConnection:setDoInput	(Z)V
    //   129: aload 10
    //   131: astore 6
    //   133: aload 11
    //   135: ldc 14
    //   137: invokevirtual 113	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   140: aload 10
    //   142: astore 6
    //   144: aload 11
    //   146: sipush 10000
    //   149: invokevirtual 117	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   152: aload 10
    //   154: astore 6
    //   156: aload 11
    //   158: sipush 15000
    //   161: invokevirtual 120	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   164: aload 10
    //   166: astore 6
    //   168: aload_0
    //   169: aload_3
    //   170: aload 4
    //   172: aload 5
    //   174: aload 12
    //   176: invokestatic 124	com/xiaomi/account/openauth/AuthorizeApi:makeHeaders	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/HashMap;
    //   179: astore_0
    //   180: aload_0
    //   181: ifnull +95 -> 276
    //   184: aload 10
    //   186: astore 6
    //   188: aload_0
    //   189: invokevirtual 130	java/util/HashMap:keySet	()Ljava/util/Set;
    //   192: invokeinterface 136 1 0
    //   197: astore_3
    //   198: aload 10
    //   200: astore 6
    //   202: aload_3
    //   203: invokeinterface 142 1 0
    //   208: ifeq +68 -> 276
    //   211: aload 10
    //   213: astore 6
    //   215: aload_3
    //   216: invokeinterface 146 1 0
    //   221: checkcast 60	java/lang/String
    //   224: astore 4
    //   226: aload 10
    //   228: astore 6
    //   230: aload 11
    //   232: aload 4
    //   234: aload_0
    //   235: aload 4
    //   237: invokevirtual 150	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   240: checkcast 60	java/lang/String
    //   243: invokevirtual 153	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   246: goto -48 -> 198
    //   249: astore 4
    //   251: aconst_null
    //   252: astore_0
    //   253: aload_0
    //   254: astore_3
    //   255: new 155	com/xiaomi/account/openauth/XMAuthericationException
    //   258: dup
    //   259: aload 4
    //   261: invokespecial 158	com/xiaomi/account/openauth/XMAuthericationException:<init>	(Ljava/lang/Throwable;)V
    //   264: athrow
    //   265: astore_0
    //   266: aload_3
    //   267: astore 6
    //   269: aload 6
    //   271: invokestatic 160	com/xiaomi/account/openauth/AuthorizeApi:closeQuietly	(Ljava/io/BufferedReader;)V
    //   274: aload_0
    //   275: athrow
    //   276: aload 10
    //   278: astore 6
    //   280: aload 11
    //   282: invokevirtual 163	java/net/HttpURLConnection:connect	()V
    //   285: aload 10
    //   287: astore 6
    //   289: aload 11
    //   291: invokevirtual 167	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   294: astore_0
    //   295: aload_0
    //   296: ifnonnull +54 -> 350
    //   299: aload 10
    //   301: astore 6
    //   303: new 155	com/xiaomi/account/openauth/XMAuthericationException
    //   306: dup
    //   307: new 31	java/io/IOException
    //   310: dup
    //   311: invokespecial 168	java/io/IOException:<init>	()V
    //   314: invokespecial 158	com/xiaomi/account/openauth/XMAuthericationException:<init>	(Ljava/lang/Throwable;)V
    //   317: athrow
    //   318: astore_0
    //   319: aload 8
    //   321: astore 6
    //   323: new 155	com/xiaomi/account/openauth/XMAuthericationException
    //   326: dup
    //   327: aload_0
    //   328: invokespecial 158	com/xiaomi/account/openauth/XMAuthericationException:<init>	(Ljava/lang/Throwable;)V
    //   331: athrow
    //   332: astore_0
    //   333: goto -64 -> 269
    //   336: astore_0
    //   337: aload 10
    //   339: astore 6
    //   341: aload 11
    //   343: invokevirtual 171	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   346: astore_0
    //   347: goto -52 -> 295
    //   350: aload 10
    //   352: astore 6
    //   354: new 33	java/io/BufferedReader
    //   357: dup
    //   358: new 173	java/io/InputStreamReader
    //   361: dup
    //   362: aload_0
    //   363: invokespecial 176	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   366: sipush 1024
    //   369: invokespecial 179	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   372: astore_0
    //   373: aload_0
    //   374: astore_3
    //   375: new 79	java/lang/StringBuilder
    //   378: dup
    //   379: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   382: astore 4
    //   384: aload_0
    //   385: astore_3
    //   386: aload_0
    //   387: invokevirtual 182	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   390: astore 5
    //   392: aload 5
    //   394: ifnull +16 -> 410
    //   397: aload_0
    //   398: astore_3
    //   399: aload 4
    //   401: aload 5
    //   403: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   406: pop
    //   407: goto -23 -> 384
    //   410: aload_0
    //   411: astore_3
    //   412: aload 4
    //   414: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   417: astore 4
    //   419: aload_0
    //   420: invokestatic 160	com/xiaomi/account/openauth/AuthorizeApi:closeQuietly	(Ljava/io/BufferedReader;)V
    //   423: aload 4
    //   425: areturn
    //   426: astore_0
    //   427: aload 9
    //   429: astore 6
    //   431: new 155	com/xiaomi/account/openauth/XMAuthericationException
    //   434: dup
    //   435: aload_0
    //   436: invokespecial 158	com/xiaomi/account/openauth/XMAuthericationException:<init>	(Ljava/lang/Throwable;)V
    //   439: athrow
    //   440: new 155	com/xiaomi/account/openauth/XMAuthericationException
    //   443: dup
    //   444: aload_0
    //   445: invokespecial 158	com/xiaomi/account/openauth/XMAuthericationException:<init>	(Ljava/lang/Throwable;)V
    //   448: athrow
    //   449: astore_3
    //   450: aload_0
    //   451: astore 6
    //   453: aload_3
    //   454: astore_0
    //   455: goto -15 -> 440
    //   458: astore_3
    //   459: aload_0
    //   460: astore 6
    //   462: aload_3
    //   463: astore_0
    //   464: goto -33 -> 431
    //   467: astore_3
    //   468: aload_0
    //   469: astore 6
    //   471: aload_3
    //   472: astore_0
    //   473: goto -150 -> 323
    //   476: astore 4
    //   478: goto -225 -> 253
    //   481: astore_0
    //   482: aload 7
    //   484: astore 6
    //   486: goto -46 -> 440
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	489	0	paramString1	String
    //   0	489	1	paramLong	long
    //   0	489	3	paramString2	String
    //   0	489	4	paramString3	String
    //   0	489	5	paramString4	String
    //   62	423	6	localObject1	Object
    //   55	428	7	localObject2	Object
    //   58	262	8	localObject3	Object
    //   52	376	9	localObject4	Object
    //   49	302	10	localObject5	Object
    //   95	247	11	localObject6	Object
    //   7	168	12	localArrayList	java.util.ArrayList
    // Exception table:
    //   from	to	target	type
    //   64	97	249	java/io/UnsupportedEncodingException
    //   101	105	249	java/io/UnsupportedEncodingException
    //   109	119	249	java/io/UnsupportedEncodingException
    //   123	129	249	java/io/UnsupportedEncodingException
    //   133	140	249	java/io/UnsupportedEncodingException
    //   144	152	249	java/io/UnsupportedEncodingException
    //   156	164	249	java/io/UnsupportedEncodingException
    //   168	180	249	java/io/UnsupportedEncodingException
    //   188	198	249	java/io/UnsupportedEncodingException
    //   202	211	249	java/io/UnsupportedEncodingException
    //   215	226	249	java/io/UnsupportedEncodingException
    //   230	246	249	java/io/UnsupportedEncodingException
    //   280	285	249	java/io/UnsupportedEncodingException
    //   289	295	249	java/io/UnsupportedEncodingException
    //   303	318	249	java/io/UnsupportedEncodingException
    //   341	347	249	java/io/UnsupportedEncodingException
    //   354	373	249	java/io/UnsupportedEncodingException
    //   255	265	265	finally
    //   375	384	265	finally
    //   386	392	265	finally
    //   399	407	265	finally
    //   412	419	265	finally
    //   64	97	318	java/io/IOException
    //   101	105	318	java/io/IOException
    //   109	119	318	java/io/IOException
    //   123	129	318	java/io/IOException
    //   133	140	318	java/io/IOException
    //   144	152	318	java/io/IOException
    //   156	164	318	java/io/IOException
    //   168	180	318	java/io/IOException
    //   188	198	318	java/io/IOException
    //   202	211	318	java/io/IOException
    //   215	226	318	java/io/IOException
    //   230	246	318	java/io/IOException
    //   280	285	318	java/io/IOException
    //   303	318	318	java/io/IOException
    //   341	347	318	java/io/IOException
    //   354	373	318	java/io/IOException
    //   64	97	332	finally
    //   101	105	332	finally
    //   109	119	332	finally
    //   123	129	332	finally
    //   133	140	332	finally
    //   144	152	332	finally
    //   156	164	332	finally
    //   168	180	332	finally
    //   188	198	332	finally
    //   202	211	332	finally
    //   215	226	332	finally
    //   230	246	332	finally
    //   280	285	332	finally
    //   289	295	332	finally
    //   303	318	332	finally
    //   323	332	332	finally
    //   341	347	332	finally
    //   354	373	332	finally
    //   431	440	332	finally
    //   440	449	332	finally
    //   289	295	336	java/io/IOException
    //   64	97	426	java/security/NoSuchAlgorithmException
    //   101	105	426	java/security/NoSuchAlgorithmException
    //   109	119	426	java/security/NoSuchAlgorithmException
    //   123	129	426	java/security/NoSuchAlgorithmException
    //   133	140	426	java/security/NoSuchAlgorithmException
    //   144	152	426	java/security/NoSuchAlgorithmException
    //   156	164	426	java/security/NoSuchAlgorithmException
    //   168	180	426	java/security/NoSuchAlgorithmException
    //   188	198	426	java/security/NoSuchAlgorithmException
    //   202	211	426	java/security/NoSuchAlgorithmException
    //   215	226	426	java/security/NoSuchAlgorithmException
    //   230	246	426	java/security/NoSuchAlgorithmException
    //   280	285	426	java/security/NoSuchAlgorithmException
    //   289	295	426	java/security/NoSuchAlgorithmException
    //   303	318	426	java/security/NoSuchAlgorithmException
    //   341	347	426	java/security/NoSuchAlgorithmException
    //   354	373	426	java/security/NoSuchAlgorithmException
    //   375	384	449	java/security/InvalidKeyException
    //   386	392	449	java/security/InvalidKeyException
    //   399	407	449	java/security/InvalidKeyException
    //   412	419	449	java/security/InvalidKeyException
    //   375	384	458	java/security/NoSuchAlgorithmException
    //   386	392	458	java/security/NoSuchAlgorithmException
    //   399	407	458	java/security/NoSuchAlgorithmException
    //   412	419	458	java/security/NoSuchAlgorithmException
    //   375	384	467	java/io/IOException
    //   386	392	467	java/io/IOException
    //   399	407	467	java/io/IOException
    //   412	419	467	java/io/IOException
    //   375	384	476	java/io/UnsupportedEncodingException
    //   386	392	476	java/io/UnsupportedEncodingException
    //   399	407	476	java/io/UnsupportedEncodingException
    //   412	419	476	java/io/UnsupportedEncodingException
    //   64	97	481	java/security/InvalidKeyException
    //   101	105	481	java/security/InvalidKeyException
    //   109	119	481	java/security/InvalidKeyException
    //   123	129	481	java/security/InvalidKeyException
    //   133	140	481	java/security/InvalidKeyException
    //   144	152	481	java/security/InvalidKeyException
    //   156	164	481	java/security/InvalidKeyException
    //   168	180	481	java/security/InvalidKeyException
    //   188	198	481	java/security/InvalidKeyException
    //   202	211	481	java/security/InvalidKeyException
    //   215	226	481	java/security/InvalidKeyException
    //   230	246	481	java/security/InvalidKeyException
    //   280	285	481	java/security/InvalidKeyException
    //   289	295	481	java/security/InvalidKeyException
    //   303	318	481	java/security/InvalidKeyException
    //   341	347	481	java/security/InvalidKeyException
    //   354	373	481	java/security/InvalidKeyException
  }
  
  private static HashMap<String, String> makeHeaders(String paramString1, String paramString2, String paramString3, String paramString4, List<NameValuePair> paramList)
  {
    if ((paramString3 == null) && (paramString4 == null)) {
      return null;
    }
    String str = AuthorizeHelper.generateNonce();
    return AuthorizeHelper.buildMacRequestHead(paramString2, str, AuthorizeHelper.getMacAccessTokenSignatureString(str, "GET", "open.account.xiaomi.com", paramString1, URLEncodedUtils.format(paramList, "UTF-8"), paramString3, paramString4));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/xiaomi/account/openauth/AuthorizeApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */