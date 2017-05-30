package com.xiaomi.infra.galaxy.fds.android;

import android.util.Log;
import com.google.gson.Gson;
import com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential;
import com.xiaomi.infra.galaxy.fds.android.exception.GalaxyFDSClientException;
import com.xiaomi.infra.galaxy.fds.android.model.FDSObject;
import com.xiaomi.infra.galaxy.fds.android.model.HttpMethod;
import com.xiaomi.infra.galaxy.fds.android.model.InitMultipartUploadResult;
import com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata;
import com.xiaomi.infra.galaxy.fds.android.model.ProgressListener;
import com.xiaomi.infra.galaxy.fds.android.model.PutObjectResult;
import com.xiaomi.infra.galaxy.fds.android.model.ThumbParam;
import com.xiaomi.infra.galaxy.fds.android.model.UserParam;
import com.xiaomi.infra.galaxy.fds.android.util.Args;
import com.xiaomi.infra.galaxy.fds.android.util.RequestFactory;
import com.xiaomi.infra.galaxy.fds.android.util.Util;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

public class GalaxyFDSClientImpl
  implements GalaxyFDSClient
{
  private static final String HTTPS_SCHEME = "https";
  private static final String HTTP_SCHEME = "http";
  private static final String LOG_TAG = "GalaxyFDSClientImpl";
  private static final boolean TEST_MODE = true;
  private final FDSClientConfiguration config;
  private final HttpClient httpClient;
  
  static
  {
    String str = System.getProperty("java.runtime.name");
    if ((str != null) && (str.equals("android runtime")))
    {
      TEST_MODE = false;
      return;
    }
  }
  
  public GalaxyFDSClientImpl(FDSClientConfiguration paramFDSClientConfiguration)
  {
    this.config = paramFDSClientConfiguration;
    this.httpClient = createHttpClient(this.config);
  }
  
  @Deprecated
  public GalaxyFDSClientImpl(String paramString, GalaxyFDSCredential paramGalaxyFDSCredential, FDSClientConfiguration paramFDSClientConfiguration)
  {
    this.config = paramFDSClientConfiguration;
    this.config.setCredential(paramGalaxyFDSCredential);
    this.httpClient = createHttpClient(this.config);
  }
  
  private void abortMultipartUpload(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = null;
    InputStream localInputStream2 = null;
    String str = this.config.getUploadBaseUri() + "/" + paramString1 + "/" + paramString2 + "?uploadId=" + paramString3;
    InputStream localInputStream1 = localInputStream2;
    paramString3 = (String)localObject1;
    try
    {
      Object localObject2 = RequestFactory.createRequest(str, this.config.getCredential(), HttpMethod.DELETE, null);
      localInputStream1 = localInputStream2;
      paramString3 = (String)localObject1;
      localObject2 = this.httpClient.execute((HttpUriRequest)localObject2);
      localInputStream1 = localInputStream2;
      paramString3 = (String)localObject1;
      localInputStream2 = ((HttpResponse)localObject2).getEntity().getContent();
      localInputStream1 = localInputStream2;
      paramString3 = localInputStream2;
      if (((HttpResponse)localObject2).getStatusLine().getStatusCode() != 200)
      {
        localInputStream1 = localInputStream2;
        paramString3 = localInputStream2;
        throw new GalaxyFDSClientException("Unable to upload object[" + paramString1 + "/" + paramString2 + "] to URI :" + str + ". Fail to abort multipart upload: " + ((HttpResponse)localObject2).getStatusLine().toString());
      }
    }
    catch (IOException paramString1)
    {
      paramString3 = localInputStream1;
      throw new GalaxyFDSClientException("Fail to abort multipart upload. URI:" + str, paramString1);
    }
    finally
    {
      if (paramString3 == null) {}
    }
    try
    {
      paramString3.close();
      throw paramString1;
      if (localInputStream2 != null) {}
      try
      {
        localInputStream2.close();
        return;
      }
      catch (IOException paramString1) {}
    }
    catch (IOException paramString2)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  private PutObjectResult completeMultipartUpload(String paramString1, String paramString2, String paramString3, ObjectMetadata paramObjectMetadata, com.xiaomi.infra.galaxy.fds.android.model.UploadPartResultList paramUploadPartResultList, List<UserParam> paramList)
  {
    // Byte code:
    //   0: new 70	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   7: astore 7
    //   9: aload 7
    //   11: new 70	java/lang/StringBuilder
    //   14: dup
    //   15: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   18: aload_0
    //   19: getfield 49	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:config	Lcom/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration;
    //   22: invokevirtual 75	com/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration:getUploadBaseUri	()Ljava/lang/String;
    //   25: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: ldc 81
    //   30: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: aload_2
    //   34: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: ldc 81
    //   39: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: aload_3
    //   43: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: ldc 83
    //   48: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: aload_1
    //   52: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload 6
    //   64: ifnull +56 -> 120
    //   67: aload 6
    //   69: invokeinterface 160 1 0
    //   74: astore 6
    //   76: aload 6
    //   78: invokeinterface 166 1 0
    //   83: ifeq +37 -> 120
    //   86: aload 6
    //   88: invokeinterface 170 1 0
    //   93: checkcast 172	com/xiaomi/infra/galaxy/fds/android/model/UserParam
    //   96: astore 8
    //   98: aload 7
    //   100: bipush 38
    //   102: invokevirtual 175	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload 7
    //   108: aload 8
    //   110: invokevirtual 176	com/xiaomi/infra/galaxy/fds/android/model/UserParam:toString	()Ljava/lang/String;
    //   113: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: goto -41 -> 76
    //   120: aload 7
    //   122: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   125: astore 6
    //   127: aload 4
    //   129: ifnull +417 -> 546
    //   132: aload 4
    //   134: invokevirtual 182	com/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata:getAllMetadata	()Ljava/util/Map;
    //   137: astore 4
    //   139: aload 6
    //   141: aload_0
    //   142: getfield 49	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:config	Lcom/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration;
    //   145: invokevirtual 90	com/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration:getCredential	()Lcom/xiaomi/infra/galaxy/fds/android/auth/GalaxyFDSCredential;
    //   148: getstatic 185	com/xiaomi/infra/galaxy/fds/android/model/HttpMethod:PUT	Lcom/xiaomi/infra/galaxy/fds/android/model/HttpMethod;
    //   151: aload 4
    //   153: invokestatic 102	com/xiaomi/infra/galaxy/fds/android/util/RequestFactory:createRequest	(Ljava/lang/String;Lcom/xiaomi/infra/galaxy/fds/android/auth/GalaxyFDSCredential;Lcom/xiaomi/infra/galaxy/fds/android/model/HttpMethod;Ljava/util/Map;)Lorg/apache/http/client/methods/HttpUriRequest;
    //   156: astore 4
    //   158: aload 4
    //   160: checkcast 187	org/apache/http/client/methods/HttpPut
    //   163: new 189	org/apache/http/entity/StringEntity
    //   166: dup
    //   167: new 191	com/google/gson/Gson
    //   170: dup
    //   171: invokespecial 192	com/google/gson/Gson:<init>	()V
    //   174: aload 5
    //   176: invokevirtual 196	com/google/gson/Gson:toJson	(Ljava/lang/Object;)Ljava/lang/String;
    //   179: invokespecial 197	org/apache/http/entity/StringEntity:<init>	(Ljava/lang/String;)V
    //   182: invokevirtual 201	org/apache/http/client/methods/HttpPut:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   185: aload_0
    //   186: getfield 55	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:httpClient	Lorg/apache/http/client/HttpClient;
    //   189: aload 4
    //   191: invokeinterface 108 2 0
    //   196: astore 7
    //   198: aload 7
    //   200: invokeinterface 114 1 0
    //   205: invokeinterface 120 1 0
    //   210: astore 5
    //   212: aload 5
    //   214: astore 4
    //   216: aload 7
    //   218: invokeinterface 124 1 0
    //   223: invokeinterface 130 1 0
    //   228: sipush 200
    //   231: if_icmpeq +118 -> 349
    //   234: aload 5
    //   236: astore 4
    //   238: new 132	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   241: dup
    //   242: new 70	java/lang/StringBuilder
    //   245: dup
    //   246: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   249: ldc -122
    //   251: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: aload_2
    //   255: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: ldc 81
    //   260: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: aload_3
    //   264: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: ldc -120
    //   269: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: aload 6
    //   274: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: ldc -53
    //   279: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: aload 7
    //   284: invokeinterface 124 1 0
    //   289: invokevirtual 139	java/lang/Object:toString	()Ljava/lang/String;
    //   292: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   298: invokespecial 142	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;)V
    //   301: athrow
    //   302: astore_1
    //   303: aload 5
    //   305: astore 4
    //   307: new 132	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   310: dup
    //   311: new 70	java/lang/StringBuilder
    //   314: dup
    //   315: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   318: ldc -51
    //   320: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: aload 6
    //   325: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   331: aload_1
    //   332: invokespecial 147	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   335: athrow
    //   336: astore_1
    //   337: aload 4
    //   339: ifnull +8 -> 347
    //   342: aload 4
    //   344: invokevirtual 152	java/io/InputStream:close	()V
    //   347: aload_1
    //   348: athrow
    //   349: aload 5
    //   351: astore 4
    //   353: new 207	java/io/InputStreamReader
    //   356: dup
    //   357: aload 5
    //   359: invokespecial 210	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   362: astore 7
    //   364: aload 5
    //   366: astore 4
    //   368: new 191	com/google/gson/Gson
    //   371: dup
    //   372: invokespecial 192	com/google/gson/Gson:<init>	()V
    //   375: aload 7
    //   377: ldc -44
    //   379: invokevirtual 216	com/google/gson/Gson:fromJson	(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;
    //   382: checkcast 212	com/xiaomi/infra/galaxy/fds/android/model/PutObjectResult
    //   385: astore 7
    //   387: aload 7
    //   389: ifnull +41 -> 430
    //   392: aload 5
    //   394: astore 4
    //   396: aload 7
    //   398: invokevirtual 219	com/xiaomi/infra/galaxy/fds/android/model/PutObjectResult:getAccessKeyId	()Ljava/lang/String;
    //   401: ifnull +29 -> 430
    //   404: aload 5
    //   406: astore 4
    //   408: aload 7
    //   410: invokevirtual 222	com/xiaomi/infra/galaxy/fds/android/model/PutObjectResult:getSignature	()Ljava/lang/String;
    //   413: ifnull +17 -> 430
    //   416: aload 5
    //   418: astore 4
    //   420: aload 7
    //   422: invokevirtual 226	com/xiaomi/infra/galaxy/fds/android/model/PutObjectResult:getExpires	()J
    //   425: lconst_0
    //   426: lcmp
    //   427: ifne +52 -> 479
    //   430: aload 5
    //   432: astore 4
    //   434: new 132	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   437: dup
    //   438: new 70	java/lang/StringBuilder
    //   441: dup
    //   442: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   445: ldc -28
    //   447: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   450: aload_2
    //   451: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: ldc -26
    //   456: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   459: aload_3
    //   460: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   463: ldc -24
    //   465: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   468: aload_1
    //   469: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   472: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   475: invokespecial 142	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;)V
    //   478: athrow
    //   479: aload 5
    //   481: astore 4
    //   483: aload 7
    //   485: aload_0
    //   486: getfield 49	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:config	Lcom/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration;
    //   489: invokevirtual 235	com/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration:getBaseUri	()Ljava/lang/String;
    //   492: invokevirtual 238	com/xiaomi/infra/galaxy/fds/android/model/PutObjectResult:setFdsServiceBaseUri	(Ljava/lang/String;)V
    //   495: aload 5
    //   497: astore 4
    //   499: aload 7
    //   501: aload_0
    //   502: getfield 49	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:config	Lcom/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration;
    //   505: invokevirtual 241	com/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration:getCdnBaseUri	()Ljava/lang/String;
    //   508: invokevirtual 244	com/xiaomi/infra/galaxy/fds/android/model/PutObjectResult:setCdnServiceBaseUri	(Ljava/lang/String;)V
    //   511: aload 5
    //   513: ifnull +8 -> 521
    //   516: aload 5
    //   518: invokevirtual 152	java/io/InputStream:close	()V
    //   521: aload 7
    //   523: areturn
    //   524: astore_1
    //   525: aload 7
    //   527: areturn
    //   528: astore_2
    //   529: goto -182 -> 347
    //   532: astore_1
    //   533: aconst_null
    //   534: astore 4
    //   536: goto -199 -> 337
    //   539: astore_1
    //   540: aconst_null
    //   541: astore 4
    //   543: goto -236 -> 307
    //   546: aconst_null
    //   547: astore 4
    //   549: goto -410 -> 139
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	552	0	this	GalaxyFDSClientImpl
    //   0	552	1	paramString1	String
    //   0	552	2	paramString2	String
    //   0	552	3	paramString3	String
    //   0	552	4	paramObjectMetadata	ObjectMetadata
    //   0	552	5	paramUploadPartResultList	com.xiaomi.infra.galaxy.fds.android.model.UploadPartResultList
    //   0	552	6	paramList	List<UserParam>
    //   7	519	7	localObject	Object
    //   96	13	8	localUserParam	UserParam
    // Exception table:
    //   from	to	target	type
    //   216	234	302	java/io/IOException
    //   238	302	302	java/io/IOException
    //   353	364	302	java/io/IOException
    //   368	387	302	java/io/IOException
    //   396	404	302	java/io/IOException
    //   408	416	302	java/io/IOException
    //   420	430	302	java/io/IOException
    //   434	479	302	java/io/IOException
    //   483	495	302	java/io/IOException
    //   499	511	302	java/io/IOException
    //   216	234	336	finally
    //   238	302	336	finally
    //   307	336	336	finally
    //   353	364	336	finally
    //   368	387	336	finally
    //   396	404	336	finally
    //   408	416	336	finally
    //   420	430	336	finally
    //   434	479	336	finally
    //   483	495	336	finally
    //   499	511	336	finally
    //   516	521	524	java/io/IOException
    //   342	347	528	java/io/IOException
    //   132	139	532	finally
    //   139	212	532	finally
    //   132	139	539	java/io/IOException
    //   139	212	539	java/io/IOException
  }
  
  private HttpClient createHttpClient(FDSClientConfiguration paramFDSClientConfiguration)
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, paramFDSClientConfiguration.getConnectionTimeoutMs());
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, paramFDSClientConfiguration.getSocketTimeoutMs());
    HttpConnectionParams.setStaleCheckingEnabled(localBasicHttpParams, true);
    HttpConnectionParams.setTcpNoDelay(localBasicHttpParams, true);
    int i = paramFDSClientConfiguration.getSocketBufferSizeHints()[0];
    int j = paramFDSClientConfiguration.getSocketBufferSizeHints()[1];
    if ((i > 0) || (j > 0)) {
      HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, Math.max(i, j));
    }
    SchemeRegistry localSchemeRegistry = new SchemeRegistry();
    localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    if (paramFDSClientConfiguration.isHttpsEnabled())
    {
      paramFDSClientConfiguration = SSLSocketFactory.getSocketFactory();
      paramFDSClientConfiguration.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
      localSchemeRegistry.register(new Scheme("https", paramFDSClientConfiguration, 443));
    }
    return new DefaultHttpClient(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
  }
  
  private InitMultipartUploadResult initMultipartUpload(String paramString1, String paramString2, long paramLong)
  {
    Object localObject2 = new StringBuilder().append(this.config.getUploadBaseUri()).append("/").append(paramString1).append("/");
    Object localObject1;
    if (paramString2 == null) {
      localObject1 = "";
    }
    for (;;)
    {
      String str = (String)localObject1 + "?uploads";
      Object localObject5 = null;
      Object localObject4 = null;
      localObject2 = localObject4;
      localObject1 = localObject5;
      Object localObject3;
      try
      {
        Object localObject6 = new HashMap();
        localObject2 = localObject4;
        localObject1 = localObject5;
        ((Map)localObject6).put("x-xiaomi-estimated-object-size", Long.toString(paramLong));
        localObject2 = localObject4;
        localObject1 = localObject5;
        GalaxyFDSCredential localGalaxyFDSCredential = this.config.getCredential();
        if (paramString2 == null)
        {
          localObject2 = localObject4;
          localObject1 = localObject5;
          localObject3 = HttpMethod.POST;
          label140:
          localObject2 = localObject4;
          localObject1 = localObject5;
          localObject3 = RequestFactory.createRequest(str, localGalaxyFDSCredential, (HttpMethod)localObject3, (Map)localObject6);
          localObject2 = localObject4;
          localObject1 = localObject5;
          localObject6 = this.httpClient.execute((HttpUriRequest)localObject3);
          localObject2 = localObject4;
          localObject1 = localObject5;
          localObject3 = ((HttpResponse)localObject6).getEntity().getContent();
          localObject2 = localObject3;
          localObject1 = localObject3;
          if (((HttpResponse)localObject6).getStatusLine().getStatusCode() == 200) {
            break label373;
          }
          localObject2 = localObject3;
          localObject1 = localObject3;
          throw new GalaxyFDSClientException("Unable to upload object[" + paramString1 + "/" + paramString2 + "] to URI :" + str + ". Fail to initiate multipart upload: " + ((HttpResponse)localObject6).getStatusLine().toString());
        }
      }
      catch (IOException paramString1)
      {
        localObject1 = localObject2;
        throw new GalaxyFDSClientException("Fail to initiate multipart upload. URI:" + str, paramString1);
      }
      finally
      {
        if (localObject1 == null) {}
      }
      try
      {
        ((InputStream)localObject1).close();
        throw paramString1;
        localObject1 = paramString2;
        continue;
        localObject2 = localObject4;
        localObject1 = localObject5;
        localObject3 = HttpMethod.PUT;
        break label140;
        label373:
        localObject2 = localObject3;
        localObject1 = localObject3;
        localObject4 = new InputStreamReader((InputStream)localObject3);
        localObject2 = localObject3;
        localObject1 = localObject3;
        localObject4 = (InitMultipartUploadResult)new Gson().fromJson((Reader)localObject4, InitMultipartUploadResult.class);
        if (localObject4 != null)
        {
          localObject2 = localObject3;
          localObject1 = localObject3;
          if (((InitMultipartUploadResult)localObject4).getUploadId() != null)
          {
            localObject2 = localObject3;
            localObject1 = localObject3;
            if (((InitMultipartUploadResult)localObject4).getObjectName() != null)
            {
              localObject2 = localObject3;
              localObject1 = localObject3;
              if (((InitMultipartUploadResult)localObject4).getBucketName() != null) {
                break label518;
              }
            }
          }
        }
        localObject2 = localObject3;
        localObject1 = localObject3;
        throw new GalaxyFDSClientException("Fail to parse the result of init multipart upload. bucket name:" + paramString1 + ", object name:" + paramString2);
        label518:
        if (localObject3 != null) {}
        try
        {
          ((InputStream)localObject3).close();
          return (InitMultipartUploadResult)localObject4;
        }
        catch (IOException paramString1)
        {
          return (InitMultipartUploadResult)localObject4;
        }
      }
      catch (IOException paramString2)
      {
        for (;;) {}
      }
    }
  }
  
  private boolean isGetThumbnail(List<UserParam> paramList)
  {
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        if (((UserParam)paramList.next() instanceof ThumbParam)) {
          return true;
        }
      }
    }
    return false;
  }
  
  /* Error */
  private com.xiaomi.infra.galaxy.fds.android.model.UploadPartResult uploadPart(String paramString1, String paramString2, String paramString3, int paramInt, com.xiaomi.infra.galaxy.fds.android.util.ObjectInputStream paramObjectInputStream, long paramLong)
  {
    // Byte code:
    //   0: new 70	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   7: aload_0
    //   8: getfield 49	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:config	Lcom/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration;
    //   11: invokevirtual 75	com/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration:getUploadBaseUri	()Ljava/lang/String;
    //   14: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   17: ldc 81
    //   19: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: aload_2
    //   23: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: ldc 81
    //   28: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_3
    //   32: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc 83
    //   37: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: aload_1
    //   41: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: ldc_w 379
    //   47: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: iload 4
    //   52: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   55: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: astore 13
    //   60: sipush 4096
    //   63: newarray <illegal type>
    //   65: astore 12
    //   67: new 384	java/io/ByteArrayOutputStream
    //   70: dup
    //   71: lload 6
    //   73: l2i
    //   74: invokespecial 387	java/io/ByteArrayOutputStream:<init>	(I)V
    //   77: astore 11
    //   79: lload 6
    //   81: lstore 9
    //   83: lload 9
    //   85: lconst_0
    //   86: lcmp
    //   87: ifeq +28 -> 115
    //   90: aload 5
    //   92: aload 12
    //   94: iconst_0
    //   95: aload 12
    //   97: arraylength
    //   98: lload 9
    //   100: l2i
    //   101: invokestatic 390	java/lang/Math:min	(II)I
    //   104: invokevirtual 396	com/xiaomi/infra/galaxy/fds/android/util/ObjectInputStream:read	([BII)I
    //   107: istore 8
    //   109: iload 8
    //   111: iconst_m1
    //   112: if_icmpne +290 -> 402
    //   115: aload 11
    //   117: invokevirtual 400	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   120: astore 14
    //   122: aload 11
    //   124: invokevirtual 401	java/io/ByteArrayOutputStream:close	()V
    //   127: aconst_null
    //   128: astore 5
    //   130: iconst_0
    //   131: istore 8
    //   133: aload 13
    //   135: aload_0
    //   136: getfield 49	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:config	Lcom/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration;
    //   139: invokevirtual 90	com/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration:getCredential	()Lcom/xiaomi/infra/galaxy/fds/android/auth/GalaxyFDSCredential;
    //   142: getstatic 185	com/xiaomi/infra/galaxy/fds/android/model/HttpMethod:PUT	Lcom/xiaomi/infra/galaxy/fds/android/model/HttpMethod;
    //   145: aconst_null
    //   146: invokestatic 102	com/xiaomi/infra/galaxy/fds/android/util/RequestFactory:createRequest	(Ljava/lang/String;Lcom/xiaomi/infra/galaxy/fds/android/auth/GalaxyFDSCredential;Lcom/xiaomi/infra/galaxy/fds/android/model/HttpMethod;Ljava/util/Map;)Lorg/apache/http/client/methods/HttpUriRequest;
    //   149: astore 11
    //   151: aload 11
    //   153: checkcast 187	org/apache/http/client/methods/HttpPut
    //   156: new 403	org/apache/http/entity/ByteArrayEntity
    //   159: dup
    //   160: aload 14
    //   162: invokespecial 406	org/apache/http/entity/ByteArrayEntity:<init>	([B)V
    //   165: invokevirtual 201	org/apache/http/client/methods/HttpPut:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   168: aload_0
    //   169: getfield 55	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:httpClient	Lorg/apache/http/client/HttpClient;
    //   172: aload 11
    //   174: invokeinterface 108 2 0
    //   179: astore 15
    //   181: aload 15
    //   183: invokeinterface 114 1 0
    //   188: invokeinterface 120 1 0
    //   193: astore 11
    //   195: aload 11
    //   197: astore 12
    //   199: aload 11
    //   201: astore 5
    //   203: aload 15
    //   205: invokeinterface 124 1 0
    //   210: invokeinterface 130 1 0
    //   215: sipush 200
    //   218: if_icmpeq +236 -> 454
    //   221: aload 11
    //   223: astore 12
    //   225: aload 11
    //   227: astore 5
    //   229: new 132	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   232: dup
    //   233: new 70	java/lang/StringBuilder
    //   236: dup
    //   237: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   240: ldc -122
    //   242: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: aload_2
    //   246: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: ldc 81
    //   251: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: aload_3
    //   255: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: ldc -120
    //   260: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: aload 13
    //   265: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: ldc_w 408
    //   271: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: iload 4
    //   276: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   279: ldc_w 410
    //   282: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: aload 15
    //   287: invokeinterface 124 1 0
    //   292: invokevirtual 139	java/lang/Object:toString	()Ljava/lang/String;
    //   295: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   301: invokespecial 142	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;)V
    //   304: athrow
    //   305: astore 12
    //   307: aload 11
    //   309: astore 5
    //   311: aload 12
    //   313: astore 11
    //   315: aload 5
    //   317: astore 12
    //   319: new 132	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   322: dup
    //   323: new 70	java/lang/StringBuilder
    //   326: dup
    //   327: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   330: ldc_w 412
    //   333: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: aload 13
    //   338: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   344: aload 11
    //   346: invokespecial 147	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   349: athrow
    //   350: astore 5
    //   352: aload 12
    //   354: astore 11
    //   356: aload 5
    //   358: astore 12
    //   360: iload 8
    //   362: iconst_1
    //   363: iadd
    //   364: istore 8
    //   366: aload 11
    //   368: astore 5
    //   370: iload 8
    //   372: aload_0
    //   373: getfield 49	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:config	Lcom/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration;
    //   376: invokevirtual 415	com/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration:getMaxRetryTimes	()I
    //   379: if_icmplt +228 -> 607
    //   382: aload 11
    //   384: astore 5
    //   386: aload 12
    //   388: athrow
    //   389: astore_1
    //   390: aload 5
    //   392: ifnull +8 -> 400
    //   395: aload 5
    //   397: invokevirtual 152	java/io/InputStream:close	()V
    //   400: aload_1
    //   401: athrow
    //   402: aload 11
    //   404: aload 12
    //   406: iconst_0
    //   407: iload 8
    //   409: invokevirtual 419	java/io/ByteArrayOutputStream:write	([BII)V
    //   412: lload 9
    //   414: iload 8
    //   416: i2l
    //   417: lsub
    //   418: lstore 9
    //   420: goto -337 -> 83
    //   423: astore_1
    //   424: new 132	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   427: dup
    //   428: new 70	java/lang/StringBuilder
    //   431: dup
    //   432: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   435: ldc_w 421
    //   438: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: lload 6
    //   443: invokevirtual 424	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   446: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   449: aload_1
    //   450: invokespecial 147	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   453: athrow
    //   454: aload 11
    //   456: astore 12
    //   458: aload 11
    //   460: astore 5
    //   462: new 207	java/io/InputStreamReader
    //   465: dup
    //   466: aload 11
    //   468: invokespecial 210	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   471: astore 15
    //   473: aload 11
    //   475: astore 12
    //   477: aload 11
    //   479: astore 5
    //   481: new 191	com/google/gson/Gson
    //   484: dup
    //   485: invokespecial 192	com/google/gson/Gson:<init>	()V
    //   488: aload 15
    //   490: ldc_w 426
    //   493: invokevirtual 216	com/google/gson/Gson:fromJson	(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;
    //   496: checkcast 426	com/xiaomi/infra/galaxy/fds/android/model/UploadPartResult
    //   499: astore 15
    //   501: aload 15
    //   503: ifnull +37 -> 540
    //   506: aload 11
    //   508: astore 12
    //   510: aload 11
    //   512: astore 5
    //   514: aload 15
    //   516: invokevirtual 429	com/xiaomi/infra/galaxy/fds/android/model/UploadPartResult:getEtag	()Ljava/lang/String;
    //   519: ifnull +21 -> 540
    //   522: aload 11
    //   524: astore 12
    //   526: aload 11
    //   528: astore 5
    //   530: aload 15
    //   532: invokevirtual 432	com/xiaomi/infra/galaxy/fds/android/model/UploadPartResult:getPartSize	()J
    //   535: lconst_0
    //   536: lcmp
    //   537: ifne +57 -> 594
    //   540: aload 11
    //   542: astore 12
    //   544: aload 11
    //   546: astore 5
    //   548: new 132	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   551: dup
    //   552: new 70	java/lang/StringBuilder
    //   555: dup
    //   556: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   559: ldc_w 434
    //   562: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   565: aload_2
    //   566: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   569: ldc -26
    //   571: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   574: aload_3
    //   575: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   578: ldc -24
    //   580: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   583: aload_1
    //   584: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   587: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   590: invokespecial 142	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;)V
    //   593: athrow
    //   594: aload 11
    //   596: ifnull +8 -> 604
    //   599: aload 11
    //   601: invokevirtual 152	java/io/InputStream:close	()V
    //   604: aload 15
    //   606: areturn
    //   607: aload 11
    //   609: astore 5
    //   611: getstatic 42	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:TEST_MODE	Z
    //   614: ifne +84 -> 698
    //   617: aload 11
    //   619: astore 5
    //   621: ldc 16
    //   623: new 70	java/lang/StringBuilder
    //   626: dup
    //   627: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   630: ldc_w 436
    //   633: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   636: aload_3
    //   637: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   640: ldc_w 438
    //   643: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   646: ldc_w 440
    //   649: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   652: aload_2
    //   653: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   656: ldc_w 442
    //   659: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   662: aload_1
    //   663: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   666: ldc_w 444
    //   669: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   672: iload 4
    //   674: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   677: ldc_w 446
    //   680: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   683: aload 12
    //   685: invokestatic 452	com/xiaomi/infra/galaxy/fds/android/util/Util:getStackTrace	(Ljava/lang/Exception;)Ljava/lang/String;
    //   688: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   691: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   694: invokestatic 458	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   697: pop
    //   698: aload 11
    //   700: ifnull +8 -> 708
    //   703: aload 11
    //   705: invokevirtual 152	java/io/InputStream:close	()V
    //   708: aload 11
    //   710: astore 5
    //   712: goto -579 -> 133
    //   715: astore 5
    //   717: goto -590 -> 127
    //   720: astore_1
    //   721: aload 15
    //   723: areturn
    //   724: astore 5
    //   726: goto -18 -> 708
    //   729: astore_2
    //   730: goto -330 -> 400
    //   733: astore_1
    //   734: goto -344 -> 390
    //   737: astore 12
    //   739: aload 5
    //   741: astore 11
    //   743: goto -383 -> 360
    //   746: astore 11
    //   748: goto -433 -> 315
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	751	0	this	GalaxyFDSClientImpl
    //   0	751	1	paramString1	String
    //   0	751	2	paramString2	String
    //   0	751	3	paramString3	String
    //   0	751	4	paramInt	int
    //   0	751	5	paramObjectInputStream	com.xiaomi.infra.galaxy.fds.android.util.ObjectInputStream
    //   0	751	6	paramLong	long
    //   107	308	8	i	int
    //   81	338	9	l	long
    //   77	665	11	localObject1	Object
    //   746	1	11	localIOException1	IOException
    //   65	159	12	localObject2	Object
    //   305	7	12	localIOException2	IOException
    //   317	367	12	localObject3	Object
    //   737	1	12	localGalaxyFDSClientException	GalaxyFDSClientException
    //   58	279	13	str	String
    //   120	41	14	arrayOfByte	byte[]
    //   179	543	15	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   203	221	305	java/io/IOException
    //   229	305	305	java/io/IOException
    //   462	473	305	java/io/IOException
    //   481	501	305	java/io/IOException
    //   514	522	305	java/io/IOException
    //   530	540	305	java/io/IOException
    //   548	594	305	java/io/IOException
    //   203	221	350	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   229	305	350	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   319	350	350	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   462	473	350	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   481	501	350	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   514	522	350	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   530	540	350	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   548	594	350	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   203	221	389	finally
    //   229	305	389	finally
    //   319	350	389	finally
    //   370	382	389	finally
    //   386	389	389	finally
    //   462	473	389	finally
    //   481	501	389	finally
    //   514	522	389	finally
    //   530	540	389	finally
    //   548	594	389	finally
    //   611	617	389	finally
    //   621	698	389	finally
    //   90	109	423	java/io/IOException
    //   402	412	423	java/io/IOException
    //   122	127	715	java/io/IOException
    //   599	604	720	java/io/IOException
    //   703	708	724	java/io/IOException
    //   395	400	729	java/io/IOException
    //   133	168	733	finally
    //   168	195	733	finally
    //   133	168	737	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   168	195	737	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   168	195	746	java/io/IOException
  }
  
  public boolean doesObjectExist(String paramString1, String paramString2)
  {
    Args.notNull(paramString1, "bucket name");
    Args.notEmpty(paramString1, "bucket name");
    Args.notNull(paramString2, "object name");
    Args.notEmpty(paramString2, "object name");
    String str = this.config.getBaseUri() + "/" + paramString1 + "/" + paramString2;
    int i;
    do
    {
      try
      {
        localObject = RequestFactory.createRequest(str, this.config.getCredential(), HttpMethod.HEAD, null);
        localObject = this.httpClient.execute((HttpUriRequest)localObject);
        i = ((HttpResponse)localObject).getStatusLine().getStatusCode();
        if (i != 200) {
          continue;
        }
        return true;
      }
      catch (IOException localIOException)
      {
        Object localObject;
        throw new GalaxyFDSClientException("Unable to head object[" + paramString1 + "/" + paramString2 + "] from URI :" + str + " Exception:" + localIOException.getMessage(), localIOException);
      }
      throw new GalaxyFDSClientException("Unable to head object[" + paramString1 + "/" + paramString2 + "] from URI :" + str + ". Cause:" + ((HttpResponse)localObject).getStatusLine().toString());
    } while (i != 404);
    return false;
  }
  
  /* Error */
  public FDSObject getObject(String paramString, long paramLong, List<UserParam> paramList, ProgressListener paramProgressListener)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 9
    //   3: aconst_null
    //   4: astore 8
    //   6: aload_1
    //   7: ldc_w 494
    //   10: invokestatic 468	com/xiaomi/infra/galaxy/fds/android/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   13: pop
    //   14: lload_2
    //   15: ldc_w 496
    //   18: invokestatic 500	com/xiaomi/infra/galaxy/fds/android/util/Args:notNegative	(JLjava/lang/String;)J
    //   21: pop2
    //   22: aload_1
    //   23: astore 7
    //   25: aload 4
    //   27: ifnull +90 -> 117
    //   30: new 70	java/lang/StringBuilder
    //   33: dup
    //   34: aload_1
    //   35: invokespecial 501	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   38: astore_1
    //   39: aload 4
    //   41: invokeinterface 160 1 0
    //   46: astore 7
    //   48: aload 7
    //   50: invokeinterface 166 1 0
    //   55: ifeq +56 -> 111
    //   58: aload 7
    //   60: invokeinterface 170 1 0
    //   65: checkcast 172	com/xiaomi/infra/galaxy/fds/android/model/UserParam
    //   68: astore 10
    //   70: aload_1
    //   71: ldc_w 503
    //   74: invokevirtual 507	java/lang/StringBuilder:indexOf	(Ljava/lang/String;)I
    //   77: iconst_m1
    //   78: if_icmpne +23 -> 101
    //   81: aload_1
    //   82: bipush 63
    //   84: invokevirtual 175	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: aload_1
    //   89: aload 10
    //   91: invokevirtual 176	com/xiaomi/infra/galaxy/fds/android/model/UserParam:toString	()Ljava/lang/String;
    //   94: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: goto -50 -> 48
    //   101: aload_1
    //   102: bipush 38
    //   104: invokevirtual 175	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: goto -20 -> 88
    //   111: aload_1
    //   112: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: astore 7
    //   117: new 509	java/net/URI
    //   120: dup
    //   121: aload 7
    //   123: invokespecial 510	java/net/URI:<init>	(Ljava/lang/String;)V
    //   126: invokevirtual 513	java/net/URI:getPath	()Ljava/lang/String;
    //   129: astore_1
    //   130: aload_1
    //   131: bipush 47
    //   133: iconst_1
    //   134: invokevirtual 515	java/lang/String:indexOf	(II)I
    //   137: istore 6
    //   139: iload 6
    //   141: iconst_m1
    //   142: if_icmpne +47 -> 189
    //   145: new 492	java/net/URISyntaxException
    //   148: dup
    //   149: aload 7
    //   151: ldc_w 517
    //   154: invokespecial 520	java/net/URISyntaxException:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   157: athrow
    //   158: astore_1
    //   159: new 132	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   162: dup
    //   163: new 70	java/lang/StringBuilder
    //   166: dup
    //   167: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   170: ldc_w 522
    //   173: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: aload 7
    //   178: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: aload_1
    //   185: invokespecial 147	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   188: athrow
    //   189: aload_1
    //   190: iconst_0
    //   191: iload 6
    //   193: invokevirtual 526	java/lang/String:substring	(II)Ljava/lang/String;
    //   196: astore 10
    //   198: aload_1
    //   199: iload 6
    //   201: iconst_1
    //   202: iadd
    //   203: invokevirtual 529	java/lang/String:substring	(I)Ljava/lang/String;
    //   206: astore 11
    //   208: new 336	java/util/HashMap
    //   211: dup
    //   212: invokespecial 337	java/util/HashMap:<init>	()V
    //   215: astore_1
    //   216: lload_2
    //   217: lconst_0
    //   218: lcmp
    //   219: ifle +48 -> 267
    //   222: aload_0
    //   223: aload 4
    //   225: invokespecial 531	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:isGetThumbnail	(Ljava/util/List;)Z
    //   228: ifne +39 -> 267
    //   231: aload_1
    //   232: ldc_w 533
    //   235: new 70	java/lang/StringBuilder
    //   238: dup
    //   239: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   242: ldc_w 535
    //   245: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: lload_2
    //   249: invokevirtual 424	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   252: ldc_w 537
    //   255: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   261: invokeinterface 350 3 0
    //   266: pop
    //   267: aload 7
    //   269: aload_0
    //   270: getfield 49	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:config	Lcom/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration;
    //   273: invokevirtual 90	com/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration:getCredential	()Lcom/xiaomi/infra/galaxy/fds/android/auth/GalaxyFDSCredential;
    //   276: getstatic 540	com/xiaomi/infra/galaxy/fds/android/model/HttpMethod:GET	Lcom/xiaomi/infra/galaxy/fds/android/model/HttpMethod;
    //   279: aload_1
    //   280: invokestatic 102	com/xiaomi/infra/galaxy/fds/android/util/RequestFactory:createRequest	(Ljava/lang/String;Lcom/xiaomi/infra/galaxy/fds/android/auth/GalaxyFDSCredential;Lcom/xiaomi/infra/galaxy/fds/android/model/HttpMethod;Ljava/util/Map;)Lorg/apache/http/client/methods/HttpUriRequest;
    //   283: astore_1
    //   284: aload_0
    //   285: getfield 55	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:httpClient	Lorg/apache/http/client/HttpClient;
    //   288: aload_1
    //   289: invokeinterface 108 2 0
    //   294: astore 12
    //   296: aload 12
    //   298: invokeinterface 114 1 0
    //   303: invokeinterface 120 1 0
    //   308: astore 4
    //   310: aload 12
    //   312: invokeinterface 124 1 0
    //   317: invokeinterface 130 1 0
    //   322: istore 6
    //   324: iload 6
    //   326: sipush 200
    //   329: if_icmpeq +193 -> 522
    //   332: iload 6
    //   334: sipush 206
    //   337: if_icmpeq +185 -> 522
    //   340: new 132	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   343: dup
    //   344: new 70	java/lang/StringBuilder
    //   347: dup
    //   348: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   351: ldc_w 542
    //   354: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: aload 10
    //   359: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: ldc 81
    //   364: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: aload 11
    //   369: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   372: ldc_w 481
    //   375: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: aload 7
    //   380: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: ldc_w 483
    //   386: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: aload 12
    //   391: invokeinterface 124 1 0
    //   396: invokevirtual 139	java/lang/Object:toString	()Ljava/lang/String;
    //   399: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   405: invokespecial 142	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;)V
    //   408: astore_1
    //   409: aload_1
    //   410: athrow
    //   411: astore 8
    //   413: aload_1
    //   414: astore 5
    //   416: aload 4
    //   418: astore_1
    //   419: aload 8
    //   421: astore 4
    //   423: new 132	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   426: dup
    //   427: new 70	java/lang/StringBuilder
    //   430: dup
    //   431: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   434: ldc_w 542
    //   437: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: aload 10
    //   442: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   445: ldc 81
    //   447: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   450: aload 11
    //   452: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   455: ldc_w 481
    //   458: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   461: aload 7
    //   463: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   466: ldc_w 485
    //   469: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   472: aload 4
    //   474: invokevirtual 488	java/io/IOException:getMessage	()Ljava/lang/String;
    //   477: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   480: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   483: aload 4
    //   485: invokespecial 147	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   488: astore 4
    //   490: aload 4
    //   492: athrow
    //   493: astore 7
    //   495: aload 4
    //   497: astore 5
    //   499: aload_1
    //   500: astore 4
    //   502: aload 7
    //   504: astore_1
    //   505: aload 5
    //   507: ifnull +13 -> 520
    //   510: aload 4
    //   512: ifnull +8 -> 520
    //   515: aload 4
    //   517: invokevirtual 152	java/io/InputStream:close	()V
    //   520: aload_1
    //   521: athrow
    //   522: new 544	com/xiaomi/infra/galaxy/fds/android/model/FDSObject
    //   525: dup
    //   526: aload 10
    //   528: aload 11
    //   530: invokespecial 545	com/xiaomi/infra/galaxy/fds/android/model/FDSObject:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   533: astore_1
    //   534: aload 12
    //   536: invokeinterface 549 1 0
    //   541: invokestatic 553	com/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata:parseObjectMetadata	([Lorg/apache/http/Header;)Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;
    //   544: astore 12
    //   546: aload_1
    //   547: new 392	com/xiaomi/infra/galaxy/fds/android/util/ObjectInputStream
    //   550: dup
    //   551: aload 4
    //   553: aload 12
    //   555: aload 5
    //   557: invokespecial 556	com/xiaomi/infra/galaxy/fds/android/util/ObjectInputStream:<init>	(Ljava/io/InputStream;Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;Lcom/xiaomi/infra/galaxy/fds/android/model/ProgressListener;)V
    //   560: invokevirtual 559	com/xiaomi/infra/galaxy/fds/android/model/FDSObject:setObjectContent	(Ljava/io/InputStream;)V
    //   563: aload_1
    //   564: aload 12
    //   566: invokevirtual 563	com/xiaomi/infra/galaxy/fds/android/model/FDSObject:setObjectMetadata	(Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;)V
    //   569: iconst_0
    //   570: ifeq +13 -> 583
    //   573: aload 4
    //   575: ifnull +8 -> 583
    //   578: aload 4
    //   580: invokevirtual 152	java/io/InputStream:close	()V
    //   583: aload_1
    //   584: areturn
    //   585: astore 4
    //   587: aload_1
    //   588: areturn
    //   589: astore 4
    //   591: goto -71 -> 520
    //   594: astore_1
    //   595: aconst_null
    //   596: astore 4
    //   598: aload 9
    //   600: astore 5
    //   602: goto -97 -> 505
    //   605: astore_1
    //   606: aload 9
    //   608: astore 5
    //   610: goto -105 -> 505
    //   613: astore 7
    //   615: aload_1
    //   616: astore 5
    //   618: aload 7
    //   620: astore_1
    //   621: goto -116 -> 505
    //   624: astore 7
    //   626: aload_1
    //   627: astore 4
    //   629: aload 7
    //   631: astore_1
    //   632: goto -127 -> 505
    //   635: astore 4
    //   637: aconst_null
    //   638: astore_1
    //   639: aload 8
    //   641: astore 5
    //   643: goto -220 -> 423
    //   646: astore 5
    //   648: aload 4
    //   650: astore_1
    //   651: aload 5
    //   653: astore 4
    //   655: aload 8
    //   657: astore 5
    //   659: goto -236 -> 423
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	662	0	this	GalaxyFDSClientImpl
    //   0	662	1	paramString	String
    //   0	662	2	paramLong	long
    //   0	662	4	paramList	List<UserParam>
    //   0	662	5	paramProgressListener	ProgressListener
    //   137	201	6	i	int
    //   23	439	7	localObject1	Object
    //   493	10	7	localObject2	Object
    //   613	6	7	localObject3	Object
    //   624	6	7	localObject4	Object
    //   4	1	8	localObject5	Object
    //   411	245	8	localIOException	IOException
    //   1	606	9	localObject6	Object
    //   68	459	10	localObject7	Object
    //   206	323	11	str	String
    //   294	271	12	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   117	139	158	java/net/URISyntaxException
    //   145	158	158	java/net/URISyntaxException
    //   189	208	158	java/net/URISyntaxException
    //   409	411	411	java/io/IOException
    //   490	493	493	finally
    //   578	583	585	java/io/IOException
    //   515	520	589	java/io/IOException
    //   208	216	594	finally
    //   222	267	594	finally
    //   267	310	594	finally
    //   310	324	605	finally
    //   340	409	605	finally
    //   522	569	605	finally
    //   409	411	613	finally
    //   423	490	624	finally
    //   208	216	635	java/io/IOException
    //   222	267	635	java/io/IOException
    //   267	310	635	java/io/IOException
    //   310	324	646	java/io/IOException
    //   340	409	646	java/io/IOException
    //   522	569	646	java/io/IOException
  }
  
  public FDSObject getObject(String paramString1, String paramString2)
  {
    return getObject(paramString1, paramString2, 0L, null);
  }
  
  public FDSObject getObject(String paramString1, String paramString2, long paramLong, List<UserParam> paramList)
  {
    return getObject(paramString1, paramString2, paramLong, paramList, null);
  }
  
  public FDSObject getObject(String paramString1, String paramString2, long paramLong, List<UserParam> paramList, ProgressListener paramProgressListener)
  {
    Args.notNull(paramString1, "bucket name");
    Args.notEmpty(paramString1, "bucket name");
    Args.notNull(paramString2, "object name");
    Args.notEmpty(paramString2, "object name");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.config.getDownloadBaseUri());
    localStringBuilder.append("/" + paramString1 + "/" + paramString2);
    return getObject(localStringBuilder.toString(), paramLong, paramList, paramProgressListener);
  }
  
  @Deprecated
  public FDSObject getObject(String paramString1, String paramString2, long paramLong, List<UserParam> paramList, ProgressListener paramProgressListener, boolean paramBoolean)
  {
    return getObject(paramString1, paramString2, paramLong, paramList, paramProgressListener);
  }
  
  public ObjectMetadata getObject(String paramString, File paramFile, List<UserParam> paramList, ProgressListener paramProgressListener)
  {
    Args.notNull(paramFile, "Destination file");
    boolean bool2 = isGetThumbnail(paramList);
    int i = 0;
    label78:
    label166:
    for (;;)
    {
      boolean bool1;
      if ((i != 0) && (!bool2))
      {
        bool1 = true;
        if (!bool1) {
          break label78;
        }
      }
      for (;;)
      {
        try
        {
          l = paramFile.length();
          Object localObject = getObject(paramString, l, paramList, paramProgressListener);
          Util.downloadObjectToFile((FDSObject)localObject, paramFile, bool1);
          localObject = ((FDSObject)localObject).getObjectMetadata();
          return (ObjectMetadata)localObject;
        }
        catch (GalaxyFDSClientException localGalaxyFDSClientException)
        {
          long l;
          i += 1;
          if (i < this.config.getMaxRetryTimes()) {
            continue;
          }
          throw localGalaxyFDSClientException;
          if (TEST_MODE) {
            break label166;
          }
          Log.i("GalaxyFDSClientImpl", "Retry the download of object:" + paramString + " to file: " + paramFile.getAbsolutePath() + " cause:" + Util.getStackTrace(localGalaxyFDSClientException));
        }
        bool1 = false;
        break;
        l = 0L;
      }
    }
  }
  
  public ObjectMetadata getObject(String paramString1, String paramString2, File paramFile)
  {
    return getObject(paramString1, paramString2, paramFile, null);
  }
  
  public ObjectMetadata getObject(String paramString1, String paramString2, File paramFile, List<UserParam> paramList)
  {
    return getObject(paramString1, paramString2, paramFile, paramList, null);
  }
  
  public ObjectMetadata getObject(String paramString1, String paramString2, File paramFile, List<UserParam> paramList, ProgressListener paramProgressListener)
  {
    Args.notNull(paramFile, "Destination file");
    boolean bool2 = isGetThumbnail(paramList);
    int i = 0;
    label81:
    label185:
    for (;;)
    {
      boolean bool1;
      if ((i != 0) && (!bool2))
      {
        bool1 = true;
        if (!bool1) {
          break label81;
        }
      }
      for (;;)
      {
        try
        {
          l = paramFile.length();
          Object localObject = getObject(paramString1, paramString2, l, paramList, paramProgressListener);
          Util.downloadObjectToFile((FDSObject)localObject, paramFile, bool1);
          localObject = ((FDSObject)localObject).getObjectMetadata();
          return (ObjectMetadata)localObject;
        }
        catch (GalaxyFDSClientException localGalaxyFDSClientException)
        {
          long l;
          i += 1;
          if (i < this.config.getMaxRetryTimes()) {
            continue;
          }
          throw localGalaxyFDSClientException;
          if (TEST_MODE) {
            break label185;
          }
          Log.i("GalaxyFDSClientImpl", "Retry the download of object:" + paramString2 + " bucket" + ":" + paramString1 + " to file: " + paramFile.getAbsolutePath() + " cause:" + Util.getStackTrace(localGalaxyFDSClientException));
        }
        bool1 = false;
        break;
        l = 0L;
      }
    }
  }
  
  @Deprecated
  public ObjectMetadata getObject(String paramString1, String paramString2, File paramFile, List<UserParam> paramList, ProgressListener paramProgressListener, boolean paramBoolean)
  {
    return getObject(paramString1, paramString2, paramFile, paramList, paramProgressListener);
  }
  
  public PutObjectResult putObject(String paramString, File paramFile)
  {
    return putObject(paramString, paramFile, null);
  }
  
  public PutObjectResult putObject(String paramString, File paramFile, List<UserParam> paramList)
  {
    return putObject(paramString, paramFile, paramList, null);
  }
  
  public PutObjectResult putObject(String paramString, File paramFile, List<UserParam> paramList, ProgressListener paramProgressListener)
  {
    return putObject(paramString, null, paramFile, paramList, paramProgressListener);
  }
  
  public PutObjectResult putObject(String paramString, InputStream paramInputStream, ObjectMetadata paramObjectMetadata)
  {
    return putObject(paramString, paramInputStream, paramObjectMetadata, null);
  }
  
  public PutObjectResult putObject(String paramString, InputStream paramInputStream, ObjectMetadata paramObjectMetadata, List<UserParam> paramList)
  {
    return putObject(paramString, paramInputStream, paramObjectMetadata, paramList, null);
  }
  
  public PutObjectResult putObject(String paramString, InputStream paramInputStream, ObjectMetadata paramObjectMetadata, List<UserParam> paramList, ProgressListener paramProgressListener)
  {
    return putObject(paramString, null, paramInputStream, paramObjectMetadata, paramList, paramProgressListener);
  }
  
  public PutObjectResult putObject(String paramString1, String paramString2, File paramFile)
  {
    return putObject(paramString1, paramString2, paramFile, null);
  }
  
  public PutObjectResult putObject(String paramString1, String paramString2, File paramFile, List<UserParam> paramList)
  {
    return putObject(paramString1, paramString2, paramFile, paramList, null);
  }
  
  public PutObjectResult putObject(String paramString1, String paramString2, File paramFile, List<UserParam> paramList, ProgressListener paramProgressListener)
  {
    Args.notNull(paramFile, "file");
    try
    {
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(new FileInputStream(paramFile));
      ObjectMetadata localObjectMetadata = new ObjectMetadata();
      localObjectMetadata.setContentLength(paramFile.length());
      localObjectMetadata.setContentType(Util.getMimeType(paramFile));
      localObjectMetadata.setLastModified(new Date(paramFile.lastModified()));
      paramString1 = putObject(paramString1, paramString2, localBufferedInputStream, localObjectMetadata, paramList, paramProgressListener);
      return paramString1;
    }
    catch (FileNotFoundException paramString1)
    {
      throw new GalaxyFDSClientException("Unable to find the file to be uploaded:" + paramFile.getAbsolutePath(), paramString1);
    }
  }
  
  public PutObjectResult putObject(String paramString1, String paramString2, InputStream paramInputStream, ObjectMetadata paramObjectMetadata)
  {
    return putObject(paramString1, paramString2, paramInputStream, paramObjectMetadata, null);
  }
  
  public PutObjectResult putObject(String paramString1, String paramString2, InputStream paramInputStream, ObjectMetadata paramObjectMetadata, List<UserParam> paramList)
  {
    return putObject(paramString1, paramString2, paramInputStream, paramObjectMetadata, paramList, null);
  }
  
  /* Error */
  public PutObjectResult putObject(String paramString1, String paramString2, InputStream paramInputStream, ObjectMetadata paramObjectMetadata, List<UserParam> paramList, ProgressListener paramProgressListener)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 462
    //   4: invokestatic 468	com/xiaomi/infra/galaxy/fds/android/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   7: pop
    //   8: aload_1
    //   9: ldc_w 462
    //   12: invokestatic 472	com/xiaomi/infra/galaxy/fds/android/util/Args:notEmpty	(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/CharSequence;
    //   15: pop
    //   16: aload_3
    //   17: ldc_w 690
    //   20: invokestatic 468	com/xiaomi/infra/galaxy/fds/android/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   23: pop
    //   24: aload 4
    //   26: ldc_w 692
    //   29: invokestatic 468	com/xiaomi/infra/galaxy/fds/android/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   32: pop
    //   33: aload 4
    //   35: invokevirtual 695	com/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata:getContentLength	()J
    //   38: lstore 10
    //   40: lload 10
    //   42: ldc_w 697
    //   45: invokestatic 500	com/xiaomi/infra/galaxy/fds/android/util/Args:notNegative	(JLjava/lang/String;)J
    //   48: pop2
    //   49: aload 4
    //   51: invokevirtual 700	com/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata:getContentType	()Ljava/lang/String;
    //   54: ifnonnull +11 -> 65
    //   57: aload 4
    //   59: getstatic 705	com/xiaomi/infra/galaxy/fds/android/util/Consts:APPLICATION_OCTET_STREAM	Ljava/lang/String;
    //   62: invokevirtual 669	com/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata:setContentType	(Ljava/lang/String;)V
    //   65: aconst_null
    //   66: astore 15
    //   68: aconst_null
    //   69: astore 14
    //   71: new 392	com/xiaomi/infra/galaxy/fds/android/util/ObjectInputStream
    //   74: dup
    //   75: aload_3
    //   76: aload 4
    //   78: aload 6
    //   80: invokespecial 556	com/xiaomi/infra/galaxy/fds/android/util/ObjectInputStream:<init>	(Ljava/io/InputStream;Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;Lcom/xiaomi/infra/galaxy/fds/android/model/ProgressListener;)V
    //   83: astore 16
    //   85: aload_0
    //   86: aload_1
    //   87: aload_2
    //   88: aload 4
    //   90: invokevirtual 695	com/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata:getContentLength	()J
    //   93: invokespecial 707	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:initMultipartUpload	(Ljava/lang/String;Ljava/lang/String;J)Lcom/xiaomi/infra/galaxy/fds/android/model/InitMultipartUploadResult;
    //   96: astore 6
    //   98: aload 6
    //   100: invokevirtual 365	com/xiaomi/infra/galaxy/fds/android/model/InitMultipartUploadResult:getObjectName	()Ljava/lang/String;
    //   103: astore_3
    //   104: aload 15
    //   106: astore_2
    //   107: aload 6
    //   109: invokevirtual 362	com/xiaomi/infra/galaxy/fds/android/model/InitMultipartUploadResult:getUploadId	()Ljava/lang/String;
    //   112: astore 6
    //   114: aload 6
    //   116: astore_2
    //   117: aload_0
    //   118: getfield 49	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:config	Lcom/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration;
    //   121: invokevirtual 710	com/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration:getUploadPartSize	()I
    //   124: istore 8
    //   126: aload 6
    //   128: astore_2
    //   129: iload 8
    //   131: i2l
    //   132: lload 10
    //   134: ladd
    //   135: lconst_1
    //   136: lsub
    //   137: l2i
    //   138: iload 8
    //   140: idiv
    //   141: istore 9
    //   143: aload 6
    //   145: astore_2
    //   146: new 712	java/util/ArrayList
    //   149: dup
    //   150: iload 9
    //   152: invokespecial 713	java/util/ArrayList:<init>	(I)V
    //   155: astore 14
    //   157: iconst_1
    //   158: istore 7
    //   160: iload 7
    //   162: iload 9
    //   164: if_icmpgt +57 -> 221
    //   167: aload 6
    //   169: astore_2
    //   170: iload 8
    //   172: i2l
    //   173: lload 10
    //   175: invokestatic 716	java/lang/Math:min	(JJ)J
    //   178: lstore 12
    //   180: aload 6
    //   182: astore_2
    //   183: aload 14
    //   185: aload_0
    //   186: aload 6
    //   188: aload_1
    //   189: aload_3
    //   190: iload 7
    //   192: aload 16
    //   194: lload 12
    //   196: invokespecial 718	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:uploadPart	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/xiaomi/infra/galaxy/fds/android/util/ObjectInputStream;J)Lcom/xiaomi/infra/galaxy/fds/android/model/UploadPartResult;
    //   199: invokeinterface 721 2 0
    //   204: pop
    //   205: iload 7
    //   207: iconst_1
    //   208: iadd
    //   209: istore 7
    //   211: lload 10
    //   213: lload 12
    //   215: lsub
    //   216: lstore 10
    //   218: goto -58 -> 160
    //   221: aload 6
    //   223: astore_2
    //   224: new 723	com/xiaomi/infra/galaxy/fds/android/model/UploadPartResultList
    //   227: dup
    //   228: invokespecial 724	com/xiaomi/infra/galaxy/fds/android/model/UploadPartResultList:<init>	()V
    //   231: astore 15
    //   233: aload 6
    //   235: astore_2
    //   236: aload 15
    //   238: aload 14
    //   240: invokevirtual 728	com/xiaomi/infra/galaxy/fds/android/model/UploadPartResultList:setUploadPartResultList	(Ljava/util/List;)V
    //   243: aload 6
    //   245: astore_2
    //   246: aload_0
    //   247: aload 6
    //   249: aload_1
    //   250: aload_3
    //   251: aload 4
    //   253: aload 15
    //   255: aload 5
    //   257: invokespecial 730	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:completeMultipartUpload	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;Lcom/xiaomi/infra/galaxy/fds/android/model/UploadPartResultList;Ljava/util/List;)Lcom/xiaomi/infra/galaxy/fds/android/model/PutObjectResult;
    //   260: astore 4
    //   262: aload 16
    //   264: invokevirtual 731	com/xiaomi/infra/galaxy/fds/android/util/ObjectInputStream:close	()V
    //   267: aload 4
    //   269: areturn
    //   270: astore 4
    //   272: aload_2
    //   273: astore_3
    //   274: aload 14
    //   276: astore_2
    //   277: aload_2
    //   278: ifnull +10 -> 288
    //   281: aload_0
    //   282: aload_1
    //   283: aload_3
    //   284: aload_2
    //   285: invokespecial 733	com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl:abortMultipartUpload	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   288: aload 4
    //   290: athrow
    //   291: astore_1
    //   292: aload 16
    //   294: invokevirtual 731	com/xiaomi/infra/galaxy/fds/android/util/ObjectInputStream:close	()V
    //   297: aload_1
    //   298: athrow
    //   299: astore_1
    //   300: aload 4
    //   302: areturn
    //   303: astore_2
    //   304: goto -7 -> 297
    //   307: astore 4
    //   309: goto -32 -> 277
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	312	0	this	GalaxyFDSClientImpl
    //   0	312	1	paramString1	String
    //   0	312	2	paramString2	String
    //   0	312	3	paramInputStream	InputStream
    //   0	312	4	paramObjectMetadata	ObjectMetadata
    //   0	312	5	paramList	List<UserParam>
    //   0	312	6	paramProgressListener	ProgressListener
    //   158	52	7	i	int
    //   124	47	8	j	int
    //   141	24	9	k	int
    //   38	179	10	l1	long
    //   178	36	12	l2	long
    //   69	206	14	localArrayList	java.util.ArrayList
    //   66	188	15	localUploadPartResultList	com.xiaomi.infra.galaxy.fds.android.model.UploadPartResultList
    //   83	210	16	localObjectInputStream	com.xiaomi.infra.galaxy.fds.android.util.ObjectInputStream
    // Exception table:
    //   from	to	target	type
    //   85	104	270	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   85	104	291	finally
    //   107	114	291	finally
    //   117	126	291	finally
    //   129	143	291	finally
    //   146	157	291	finally
    //   170	180	291	finally
    //   183	205	291	finally
    //   224	233	291	finally
    //   236	243	291	finally
    //   246	262	291	finally
    //   281	288	291	finally
    //   288	291	291	finally
    //   262	267	299	java/io/IOException
    //   292	297	303	java/io/IOException
    //   107	114	307	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   117	126	307	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   129	143	307	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   146	157	307	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   170	180	307	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   183	205	307	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   224	233	307	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   236	243	307	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   246	262	307	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/xiaomi/infra/galaxy/fds/android/GalaxyFDSClientImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */