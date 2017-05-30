package com.fimi.soul.biz.l;

import com.google.gson.Gson;
import com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential;
import com.xiaomi.infra.galaxy.fds.android.exception.GalaxyFDSClientException;
import com.xiaomi.infra.galaxy.fds.android.model.HttpMethod;
import com.xiaomi.infra.galaxy.fds.android.model.InitMultipartUploadResult;
import com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata;
import com.xiaomi.infra.galaxy.fds.android.model.ProgressListener;
import com.xiaomi.infra.galaxy.fds.android.model.UserParam;
import com.xiaomi.infra.galaxy.fds.android.util.Args;
import com.xiaomi.infra.galaxy.fds.android.util.RequestFactory;
import com.xiaomi.infra.galaxy.fds.android.util.Util;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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

public class h
{
  String a = null;
  String b;
  String c;
  List<UserParam> d;
  BufferedInputStream e;
  ByteArrayOutputStream f;
  ObjectMetadata g;
  ProgressListener h;
  f i = null;
  public File j;
  int k = 0;
  ArrayList l;
  private final d m;
  private final HttpClient n;
  private long o;
  private boolean p = false;
  private int q = 1;
  private int r = 0;
  private long s;
  
  public h(d paramd)
  {
    this.m = paramd;
    this.n = a(this.m);
    this.i = new f();
  }
  
  @Deprecated
  public h(String paramString, GalaxyFDSCredential paramGalaxyFDSCredential, d paramd)
  {
    this.m = paramd;
    this.m.a(paramGalaxyFDSCredential);
    this.n = a(this.m);
    this.i = new f();
  }
  
  private InitMultipartUploadResult a(String paramString1, String paramString2, long paramLong)
  {
    Object localObject2 = new StringBuilder().append(this.m.r()).append("/").append(paramString1).append("/");
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
        ((HashMap)localObject6).put("x-xiaomi-estimated-object-size", Long.toString(paramLong));
        localObject2 = localObject4;
        localObject1 = localObject5;
        GalaxyFDSCredential localGalaxyFDSCredential = this.m.f();
        if (paramString2 == null)
        {
          localObject2 = localObject4;
          localObject1 = localObject5;
          localObject3 = HttpMethod.POST;
          label135:
          localObject2 = localObject4;
          localObject1 = localObject5;
          localObject3 = RequestFactory.createRequest(str, localGalaxyFDSCredential, (HttpMethod)localObject3, (Map)localObject6);
          localObject2 = localObject4;
          localObject1 = localObject5;
          localObject6 = this.n.execute((HttpUriRequest)localObject3);
          localObject2 = localObject4;
          localObject1 = localObject5;
          localObject3 = ((HttpResponse)localObject6).getEntity().getContent();
          localObject2 = localObject3;
          localObject1 = localObject3;
          if (((HttpResponse)localObject6).getStatusLine().getStatusCode() == 200) {
            break label366;
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
        break label135;
        label366:
        localObject2 = localObject3;
        localObject1 = localObject3;
        localObject4 = new InputStreamReader((InputStream)localObject3);
        localObject2 = localObject3;
        localObject1 = localObject3;
        localObject4 = (InitMultipartUploadResult)new Gson().fromJson((Reader)localObject4, InitMultipartUploadResult.class);
        localObject2 = localObject3;
        localObject1 = localObject3;
        this.c = ((InitMultipartUploadResult)localObject4).getObjectName();
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
                break label526;
              }
            }
          }
        }
        localObject2 = localObject3;
        localObject1 = localObject3;
        throw new GalaxyFDSClientException("Fail to parse the result of init multipart upload. bucket name:" + paramString1 + ", object name:" + paramString2);
        label526:
        if (localObject3 != null) {}
        try
        {
          ((InputStream)localObject3).close();
          this.a = ((InitMultipartUploadResult)localObject4).getUploadId();
          return (InitMultipartUploadResult)localObject4;
        }
        catch (IOException paramString1)
        {
          for (;;) {}
        }
      }
      catch (IOException paramString2)
      {
        for (;;) {}
      }
    }
  }
  
  /* Error */
  private com.xiaomi.infra.galaxy.fds.android.model.PutObjectResult a(String paramString1, String paramString2, String paramString3, ObjectMetadata paramObjectMetadata, com.xiaomi.infra.galaxy.fds.android.model.UploadPartResultList paramUploadPartResultList, List<UserParam> paramList)
  {
    // Byte code:
    //   0: new 79	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   7: astore 7
    //   9: aload 7
    //   11: new 79	java/lang/StringBuilder
    //   14: dup
    //   15: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   18: aload_0
    //   19: getfield 57	com/fimi/soul/biz/l/h:m	Lcom/fimi/soul/biz/l/d;
    //   22: invokevirtual 83	com/fimi/soul/biz/l/d:r	()Ljava/lang/String;
    //   25: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: ldc 89
    //   30: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: aload_2
    //   34: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: ldc 89
    //   39: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: aload_3
    //   43: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: ldc -46
    //   48: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: aload_1
    //   52: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload 6
    //   64: ifnull +56 -> 120
    //   67: aload 6
    //   69: invokeinterface 216 1 0
    //   74: astore 6
    //   76: aload 6
    //   78: invokeinterface 222 1 0
    //   83: ifeq +37 -> 120
    //   86: aload 6
    //   88: invokeinterface 226 1 0
    //   93: checkcast 228	com/xiaomi/infra/galaxy/fds/android/model/UserParam
    //   96: astore 8
    //   98: aload 7
    //   100: bipush 38
    //   102: invokevirtual 231	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload 7
    //   108: aload 8
    //   110: invokevirtual 232	com/xiaomi/infra/galaxy/fds/android/model/UserParam:toString	()Ljava/lang/String;
    //   113: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: goto -41 -> 76
    //   120: aload 7
    //   122: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   125: astore 6
    //   127: aload 4
    //   129: ifnull +465 -> 594
    //   132: aload 4
    //   134: invokevirtual 238	com/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata:getAllMetadata	()Ljava/util/Map;
    //   137: astore 4
    //   139: aload 6
    //   141: aload_0
    //   142: getfield 57	com/fimi/soul/biz/l/h:m	Lcom/fimi/soul/biz/l/d;
    //   145: invokevirtual 113	com/fimi/soul/biz/l/d:f	()Lcom/xiaomi/infra/galaxy/fds/android/auth/GalaxyFDSCredential;
    //   148: getstatic 178	com/xiaomi/infra/galaxy/fds/android/model/HttpMethod:PUT	Lcom/xiaomi/infra/galaxy/fds/android/model/HttpMethod;
    //   151: aload 4
    //   153: invokestatic 125	com/xiaomi/infra/galaxy/fds/android/util/RequestFactory:createRequest	(Ljava/lang/String;Lcom/xiaomi/infra/galaxy/fds/android/auth/GalaxyFDSCredential;Lcom/xiaomi/infra/galaxy/fds/android/model/HttpMethod;Ljava/util/Map;)Lorg/apache/http/client/methods/HttpUriRequest;
    //   156: astore 4
    //   158: aload 4
    //   160: checkcast 240	org/apache/http/client/methods/HttpPut
    //   163: new 242	org/apache/http/entity/StringEntity
    //   166: dup
    //   167: new 185	com/google/gson/Gson
    //   170: dup
    //   171: invokespecial 186	com/google/gson/Gson:<init>	()V
    //   174: aload 5
    //   176: invokevirtual 246	com/google/gson/Gson:toJson	(Ljava/lang/Object;)Ljava/lang/String;
    //   179: invokespecial 247	org/apache/http/entity/StringEntity:<init>	(Ljava/lang/String;)V
    //   182: invokevirtual 251	org/apache/http/client/methods/HttpPut:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   185: aload_0
    //   186: getfield 62	com/fimi/soul/biz/l/h:n	Lorg/apache/http/client/HttpClient;
    //   189: aload 4
    //   191: invokeinterface 131 2 0
    //   196: astore 7
    //   198: aload 7
    //   200: invokeinterface 137 1 0
    //   205: invokeinterface 143 1 0
    //   210: astore 5
    //   212: aload 5
    //   214: astore 4
    //   216: aload 7
    //   218: invokeinterface 147 1 0
    //   223: invokeinterface 153 1 0
    //   228: sipush 200
    //   231: if_icmpeq +131 -> 362
    //   234: aload 5
    //   236: astore 4
    //   238: new 155	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   241: dup
    //   242: new 79	java/lang/StringBuilder
    //   245: dup
    //   246: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   249: ldc -99
    //   251: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: aload_2
    //   255: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: ldc 89
    //   260: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: aload_3
    //   264: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: ldc -97
    //   269: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: aload 6
    //   274: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: ldc -3
    //   279: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: aload 7
    //   284: invokeinterface 147 1 0
    //   289: invokevirtual 162	java/lang/Object:toString	()Ljava/lang/String;
    //   292: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   298: invokespecial 165	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;)V
    //   301: athrow
    //   302: astore_1
    //   303: aload 5
    //   305: astore 4
    //   307: aload_0
    //   308: getfield 47	com/fimi/soul/biz/l/h:i	Lcom/fimi/soul/biz/l/f;
    //   311: iconst_0
    //   312: invokevirtual 256	com/fimi/soul/biz/l/f:a	(Z)V
    //   315: aload 5
    //   317: astore 4
    //   319: new 155	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   322: dup
    //   323: new 79	java/lang/StringBuilder
    //   326: dup
    //   327: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   330: ldc_w 258
    //   333: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: aload 6
    //   338: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   344: aload_1
    //   345: invokespecial 170	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   348: athrow
    //   349: astore_1
    //   350: aload 4
    //   352: ifnull +8 -> 360
    //   355: aload 4
    //   357: invokevirtual 175	java/io/InputStream:close	()V
    //   360: aload_1
    //   361: athrow
    //   362: aload 5
    //   364: astore 4
    //   366: new 180	java/io/InputStreamReader
    //   369: dup
    //   370: aload 5
    //   372: invokespecial 183	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   375: astore 7
    //   377: aload 5
    //   379: astore 4
    //   381: new 185	com/google/gson/Gson
    //   384: dup
    //   385: invokespecial 186	com/google/gson/Gson:<init>	()V
    //   388: aload 7
    //   390: ldc_w 260
    //   393: invokevirtual 192	com/google/gson/Gson:fromJson	(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;
    //   396: checkcast 260	com/xiaomi/infra/galaxy/fds/android/model/PutObjectResult
    //   399: astore 7
    //   401: aload 7
    //   403: ifnull +41 -> 444
    //   406: aload 5
    //   408: astore 4
    //   410: aload 7
    //   412: invokevirtual 263	com/xiaomi/infra/galaxy/fds/android/model/PutObjectResult:getAccessKeyId	()Ljava/lang/String;
    //   415: ifnull +29 -> 444
    //   418: aload 5
    //   420: astore 4
    //   422: aload 7
    //   424: invokevirtual 266	com/xiaomi/infra/galaxy/fds/android/model/PutObjectResult:getSignature	()Ljava/lang/String;
    //   427: ifnull +17 -> 444
    //   430: aload 5
    //   432: astore 4
    //   434: aload 7
    //   436: invokevirtual 270	com/xiaomi/infra/galaxy/fds/android/model/PutObjectResult:getExpires	()J
    //   439: lconst_0
    //   440: lcmp
    //   441: ifne +54 -> 495
    //   444: aload 5
    //   446: astore 4
    //   448: new 155	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   451: dup
    //   452: new 79	java/lang/StringBuilder
    //   455: dup
    //   456: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   459: ldc_w 272
    //   462: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   465: aload_2
    //   466: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   469: ldc -49
    //   471: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   474: aload_3
    //   475: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: ldc_w 274
    //   481: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   484: aload_1
    //   485: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   488: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   491: invokespecial 165	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;)V
    //   494: athrow
    //   495: aload 5
    //   497: astore 4
    //   499: aload 7
    //   501: aload_0
    //   502: getfield 57	com/fimi/soul/biz/l/h:m	Lcom/fimi/soul/biz/l/d;
    //   505: invokevirtual 276	com/fimi/soul/biz/l/d:o	()Ljava/lang/String;
    //   508: invokevirtual 279	com/xiaomi/infra/galaxy/fds/android/model/PutObjectResult:setFdsServiceBaseUri	(Ljava/lang/String;)V
    //   511: aload 5
    //   513: astore 4
    //   515: aload 7
    //   517: aload_0
    //   518: getfield 57	com/fimi/soul/biz/l/h:m	Lcom/fimi/soul/biz/l/d;
    //   521: invokevirtual 281	com/fimi/soul/biz/l/d:p	()Ljava/lang/String;
    //   524: invokevirtual 284	com/xiaomi/infra/galaxy/fds/android/model/PutObjectResult:setCdnServiceBaseUri	(Ljava/lang/String;)V
    //   527: aload 5
    //   529: astore 4
    //   531: aload_0
    //   532: getfield 47	com/fimi/soul/biz/l/h:i	Lcom/fimi/soul/biz/l/f;
    //   535: aload 7
    //   537: invokevirtual 285	com/xiaomi/infra/galaxy/fds/android/model/PutObjectResult:getObjectName	()Ljava/lang/String;
    //   540: invokevirtual 287	com/fimi/soul/biz/l/f:b	(Ljava/lang/String;)V
    //   543: aload 5
    //   545: astore 4
    //   547: aload_0
    //   548: getfield 47	com/fimi/soul/biz/l/h:i	Lcom/fimi/soul/biz/l/f;
    //   551: aload 7
    //   553: invokevirtual 290	com/xiaomi/infra/galaxy/fds/android/model/PutObjectResult:getAbsolutePresignedUri	()Ljava/lang/String;
    //   556: invokevirtual 292	com/fimi/soul/biz/l/f:c	(Ljava/lang/String;)V
    //   559: aload 5
    //   561: ifnull +8 -> 569
    //   564: aload 5
    //   566: invokevirtual 175	java/io/InputStream:close	()V
    //   569: aload 7
    //   571: areturn
    //   572: astore_1
    //   573: aload 7
    //   575: areturn
    //   576: astore_2
    //   577: goto -217 -> 360
    //   580: astore_1
    //   581: aconst_null
    //   582: astore 4
    //   584: goto -234 -> 350
    //   587: astore_1
    //   588: aconst_null
    //   589: astore 5
    //   591: goto -288 -> 303
    //   594: aconst_null
    //   595: astore 4
    //   597: goto -458 -> 139
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	600	0	this	h
    //   0	600	1	paramString1	String
    //   0	600	2	paramString2	String
    //   0	600	3	paramString3	String
    //   0	600	4	paramObjectMetadata	ObjectMetadata
    //   0	600	5	paramUploadPartResultList	com.xiaomi.infra.galaxy.fds.android.model.UploadPartResultList
    //   0	600	6	paramList	List<UserParam>
    //   7	567	7	localObject	Object
    //   96	13	8	localUserParam	UserParam
    // Exception table:
    //   from	to	target	type
    //   216	234	302	java/io/IOException
    //   238	302	302	java/io/IOException
    //   366	377	302	java/io/IOException
    //   381	401	302	java/io/IOException
    //   410	418	302	java/io/IOException
    //   422	430	302	java/io/IOException
    //   434	444	302	java/io/IOException
    //   448	495	302	java/io/IOException
    //   499	511	302	java/io/IOException
    //   515	527	302	java/io/IOException
    //   531	543	302	java/io/IOException
    //   547	559	302	java/io/IOException
    //   216	234	349	finally
    //   238	302	349	finally
    //   307	315	349	finally
    //   319	349	349	finally
    //   366	377	349	finally
    //   381	401	349	finally
    //   410	418	349	finally
    //   422	430	349	finally
    //   434	444	349	finally
    //   448	495	349	finally
    //   499	511	349	finally
    //   515	527	349	finally
    //   531	543	349	finally
    //   547	559	349	finally
    //   564	569	572	java/io/IOException
    //   355	360	576	java/io/IOException
    //   132	139	580	finally
    //   139	212	580	finally
    //   132	139	587	java/io/IOException
    //   139	212	587	java/io/IOException
  }
  
  /* Error */
  private com.xiaomi.infra.galaxy.fds.android.model.UploadPartResult a(String paramString1, String paramString2, String paramString3, int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 79	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   7: aload_0
    //   8: getfield 57	com/fimi/soul/biz/l/h:m	Lcom/fimi/soul/biz/l/d;
    //   11: invokevirtual 83	com/fimi/soul/biz/l/d:r	()Ljava/lang/String;
    //   14: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   17: ldc 89
    //   19: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: aload_2
    //   23: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: ldc 89
    //   28: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_3
    //   32: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc -46
    //   37: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: aload_1
    //   41: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: ldc_w 297
    //   47: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: iload 4
    //   52: invokevirtual 300	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   55: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: astore 10
    //   60: aconst_null
    //   61: astore 6
    //   63: aload_0
    //   64: getfield 49	com/fimi/soul/biz/l/h:p	Z
    //   67: ifne -4 -> 63
    //   70: aload 6
    //   72: astore 9
    //   74: aload 6
    //   76: astore 7
    //   78: aload 6
    //   80: astore 8
    //   82: aload 10
    //   84: aload_0
    //   85: getfield 57	com/fimi/soul/biz/l/h:m	Lcom/fimi/soul/biz/l/d;
    //   88: invokevirtual 113	com/fimi/soul/biz/l/d:f	()Lcom/xiaomi/infra/galaxy/fds/android/auth/GalaxyFDSCredential;
    //   91: getstatic 178	com/xiaomi/infra/galaxy/fds/android/model/HttpMethod:PUT	Lcom/xiaomi/infra/galaxy/fds/android/model/HttpMethod;
    //   94: aconst_null
    //   95: checkcast 302	java/util/Map
    //   98: invokestatic 125	com/xiaomi/infra/galaxy/fds/android/util/RequestFactory:createRequest	(Ljava/lang/String;Lcom/xiaomi/infra/galaxy/fds/android/auth/GalaxyFDSCredential;Lcom/xiaomi/infra/galaxy/fds/android/model/HttpMethod;Ljava/util/Map;)Lorg/apache/http/client/methods/HttpUriRequest;
    //   101: astore 11
    //   103: aload 6
    //   105: astore 9
    //   107: aload 6
    //   109: astore 7
    //   111: aload 6
    //   113: astore 8
    //   115: aload 11
    //   117: checkcast 240	org/apache/http/client/methods/HttpPut
    //   120: new 304	org/apache/http/entity/ByteArrayEntity
    //   123: dup
    //   124: aload 5
    //   126: invokespecial 307	org/apache/http/entity/ByteArrayEntity:<init>	([B)V
    //   129: invokevirtual 251	org/apache/http/client/methods/HttpPut:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   132: aload 6
    //   134: astore 9
    //   136: aload 6
    //   138: astore 7
    //   140: aload 6
    //   142: astore 8
    //   144: aload_0
    //   145: getfield 62	com/fimi/soul/biz/l/h:n	Lorg/apache/http/client/HttpClient;
    //   148: aload 11
    //   150: invokeinterface 131 2 0
    //   155: astore 11
    //   157: aload 6
    //   159: astore 9
    //   161: aload 6
    //   163: astore 7
    //   165: aload 6
    //   167: astore 8
    //   169: aload 11
    //   171: invokeinterface 137 1 0
    //   176: invokeinterface 143 1 0
    //   181: astore 6
    //   183: aload 6
    //   185: astore 9
    //   187: aload 6
    //   189: astore 7
    //   191: aload 6
    //   193: astore 8
    //   195: aload 11
    //   197: invokeinterface 147 1 0
    //   202: invokeinterface 153 1 0
    //   207: sipush 200
    //   210: if_icmpeq +139 -> 349
    //   213: aload 6
    //   215: astore 9
    //   217: aload 6
    //   219: astore 7
    //   221: aload 6
    //   223: astore 8
    //   225: new 155	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   228: dup
    //   229: new 79	java/lang/StringBuilder
    //   232: dup
    //   233: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   236: ldc -99
    //   238: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: aload_2
    //   242: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: ldc 89
    //   247: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: aload_3
    //   251: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: ldc -97
    //   256: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: aload 10
    //   261: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: ldc_w 309
    //   267: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: iload 4
    //   272: invokevirtual 300	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   275: ldc_w 311
    //   278: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: aload 11
    //   283: invokeinterface 147 1 0
    //   288: invokevirtual 162	java/lang/Object:toString	()Ljava/lang/String;
    //   291: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   297: invokespecial 165	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;)V
    //   300: athrow
    //   301: astore_1
    //   302: aload 9
    //   304: astore 7
    //   306: new 155	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   309: dup
    //   310: new 79	java/lang/StringBuilder
    //   313: dup
    //   314: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   317: ldc_w 313
    //   320: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: aload 10
    //   325: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   331: aload_1
    //   332: invokespecial 170	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   335: athrow
    //   336: astore_1
    //   337: aload 7
    //   339: ifnull +8 -> 347
    //   342: aload 7
    //   344: invokevirtual 175	java/io/InputStream:close	()V
    //   347: aload_1
    //   348: athrow
    //   349: aload 6
    //   351: astore 9
    //   353: aload 6
    //   355: astore 7
    //   357: aload 6
    //   359: astore 8
    //   361: new 180	java/io/InputStreamReader
    //   364: dup
    //   365: aload 6
    //   367: invokespecial 183	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   370: astore 11
    //   372: aload 6
    //   374: astore 9
    //   376: aload 6
    //   378: astore 7
    //   380: aload 6
    //   382: astore 8
    //   384: new 185	com/google/gson/Gson
    //   387: dup
    //   388: invokespecial 186	com/google/gson/Gson:<init>	()V
    //   391: aload 11
    //   393: ldc_w 315
    //   396: invokevirtual 192	com/google/gson/Gson:fromJson	(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;
    //   399: checkcast 315	com/xiaomi/infra/galaxy/fds/android/model/UploadPartResult
    //   402: astore 11
    //   404: aload 11
    //   406: ifnull +45 -> 451
    //   409: aload 6
    //   411: astore 9
    //   413: aload 6
    //   415: astore 7
    //   417: aload 6
    //   419: astore 8
    //   421: aload 11
    //   423: invokevirtual 318	com/xiaomi/infra/galaxy/fds/android/model/UploadPartResult:getEtag	()Ljava/lang/String;
    //   426: ifnull +25 -> 451
    //   429: aload 6
    //   431: astore 9
    //   433: aload 6
    //   435: astore 7
    //   437: aload 6
    //   439: astore 8
    //   441: aload 11
    //   443: invokevirtual 321	com/xiaomi/infra/galaxy/fds/android/model/UploadPartResult:getPartSize	()J
    //   446: lconst_0
    //   447: lcmp
    //   448: ifne +81 -> 529
    //   451: aload 6
    //   453: astore 9
    //   455: aload 6
    //   457: astore 7
    //   459: aload 6
    //   461: astore 8
    //   463: new 155	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   466: dup
    //   467: new 79	java/lang/StringBuilder
    //   470: dup
    //   471: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   474: ldc_w 323
    //   477: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   480: aload_2
    //   481: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   484: ldc -49
    //   486: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   489: aload_3
    //   490: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   493: ldc_w 274
    //   496: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   499: aload_1
    //   500: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   503: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   506: invokespecial 165	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:<init>	(Ljava/lang/String;)V
    //   509: athrow
    //   510: astore 6
    //   512: aload 8
    //   514: ifnull +8 -> 522
    //   517: aload 8
    //   519: invokevirtual 175	java/io/InputStream:close	()V
    //   522: aload 8
    //   524: astore 6
    //   526: goto -463 -> 63
    //   529: aload 6
    //   531: ifnull +8 -> 539
    //   534: aload 6
    //   536: invokevirtual 175	java/io/InputStream:close	()V
    //   539: aload 11
    //   541: areturn
    //   542: astore_1
    //   543: aload 11
    //   545: areturn
    //   546: astore 6
    //   548: goto -26 -> 522
    //   551: astore_2
    //   552: goto -205 -> 347
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	555	0	this	h
    //   0	555	1	paramString1	String
    //   0	555	2	paramString2	String
    //   0	555	3	paramString3	String
    //   0	555	4	paramInt	int
    //   0	555	5	paramArrayOfByte	byte[]
    //   61	399	6	localInputStream1	InputStream
    //   510	1	6	localGalaxyFDSClientException	GalaxyFDSClientException
    //   524	11	6	localObject1	Object
    //   546	1	6	localIOException	IOException
    //   76	382	7	localInputStream2	InputStream
    //   80	443	8	localInputStream3	InputStream
    //   72	382	9	localInputStream4	InputStream
    //   58	266	10	str	String
    //   101	443	11	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   82	103	301	java/io/IOException
    //   115	132	301	java/io/IOException
    //   144	157	301	java/io/IOException
    //   169	183	301	java/io/IOException
    //   195	213	301	java/io/IOException
    //   225	301	301	java/io/IOException
    //   361	372	301	java/io/IOException
    //   384	404	301	java/io/IOException
    //   421	429	301	java/io/IOException
    //   441	451	301	java/io/IOException
    //   463	510	301	java/io/IOException
    //   82	103	336	finally
    //   115	132	336	finally
    //   144	157	336	finally
    //   169	183	336	finally
    //   195	213	336	finally
    //   225	301	336	finally
    //   306	336	336	finally
    //   361	372	336	finally
    //   384	404	336	finally
    //   421	429	336	finally
    //   441	451	336	finally
    //   463	510	336	finally
    //   82	103	510	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   115	132	510	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   144	157	510	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   169	183	510	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   195	213	510	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   225	301	510	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   361	372	510	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   384	404	510	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   421	429	510	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   441	451	510	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   463	510	510	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   534	539	542	java/io/IOException
    //   517	522	546	java/io/IOException
    //   342	347	551	java/io/IOException
  }
  
  private HttpClient a(d paramd)
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, paramd.c());
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, paramd.b());
    HttpConnectionParams.setStaleCheckingEnabled(localBasicHttpParams, true);
    HttpConnectionParams.setTcpNoDelay(localBasicHttpParams, true);
    int i1 = paramd.d()[0];
    int i2 = paramd.d()[1];
    if ((i1 > 0) || (i2 > 0)) {
      HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, Math.max(i1, i2));
    }
    SchemeRegistry localSchemeRegistry = new SchemeRegistry();
    localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    if (paramd.j())
    {
      paramd = SSLSocketFactory.getSocketFactory();
      paramd.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
      localSchemeRegistry.register(new Scheme("https", paramd, 443));
    }
    return new DefaultHttpClient(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
  }
  
  private void a(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = null;
    InputStream localInputStream2 = null;
    String str = this.m.r() + "/" + paramString1 + "/" + paramString2 + "?uploadId=" + paramString3;
    InputStream localInputStream1 = localInputStream2;
    paramString3 = (String)localObject1;
    try
    {
      Object localObject2 = RequestFactory.createRequest(str, this.m.f(), HttpMethod.DELETE, (Map)null);
      localInputStream1 = localInputStream2;
      paramString3 = (String)localObject1;
      localObject2 = this.n.execute((HttpUriRequest)localObject2);
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
      this.i.a(false);
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
  
  public int a()
  {
    return this.q;
  }
  
  public void a(int paramInt)
  {
    this.q = paramInt;
  }
  
  public void a(String paramString, File paramFile, List<UserParam> paramList, ProgressListener paramProgressListener)
  {
    Args.notNull(paramFile, "file");
    this.b = paramString;
    this.j = paramFile;
    this.h = paramProgressListener;
    this.d = paramList;
    try
    {
      this.e = new BufferedInputStream(new FileInputStream(paramFile));
      this.o = paramFile.length();
      this.g = new ObjectMetadata();
      this.g.setContentLength(paramFile.length());
      this.g.setContentType(Util.getMimeType(paramFile));
      this.g.setLastModified(new Date(paramFile.lastModified()));
      a(paramString, this.c, this.g.getContentLength());
      return;
    }
    catch (FileNotFoundException paramString)
    {
      throw new GalaxyFDSClientException("Unable to find the file to be uploaded:" + paramFile.getAbsolutePath(), paramString);
    }
  }
  
  /* Error */
  public f b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 57	com/fimi/soul/biz/l/h:m	Lcom/fimi/soul/biz/l/d;
    //   4: invokevirtual 493	com/fimi/soul/biz/l/d:e	()I
    //   7: istore_2
    //   8: new 495	com/xiaomi/infra/galaxy/fds/android/model/UploadPartResultList
    //   11: dup
    //   12: invokespecial 496	com/xiaomi/infra/galaxy/fds/android/model/UploadPartResultList:<init>	()V
    //   15: astore 6
    //   17: aload_0
    //   18: getfield 498	com/fimi/soul/biz/l/h:s	J
    //   21: lconst_0
    //   22: lcmp
    //   23: ifle +152 -> 175
    //   26: aload_0
    //   27: getfield 443	com/fimi/soul/biz/l/h:e	Ljava/io/BufferedInputStream;
    //   30: aload_0
    //   31: getfield 450	com/fimi/soul/biz/l/h:o	J
    //   34: aload_0
    //   35: getfield 498	com/fimi/soul/biz/l/h:s	J
    //   38: lsub
    //   39: invokevirtual 502	java/io/BufferedInputStream:skip	(J)J
    //   42: pop2
    //   43: aload_0
    //   44: getfield 498	com/fimi/soul/biz/l/h:s	J
    //   47: iload_2
    //   48: i2l
    //   49: lrem
    //   50: lconst_0
    //   51: lcmp
    //   52: ifne +214 -> 266
    //   55: aload_0
    //   56: getfield 498	com/fimi/soul/biz/l/h:s	J
    //   59: iload_2
    //   60: i2l
    //   61: ldiv
    //   62: lstore 4
    //   64: lload 4
    //   66: l2i
    //   67: istore_1
    //   68: aload_0
    //   69: getfield 51	com/fimi/soul/biz/l/h:q	I
    //   72: istore_1
    //   73: iload_1
    //   74: aload_0
    //   75: getfield 53	com/fimi/soul/biz/l/h:r	I
    //   78: if_icmpgt +357 -> 435
    //   81: iload_2
    //   82: i2l
    //   83: aload_0
    //   84: getfield 498	com/fimi/soul/biz/l/h:s	J
    //   87: invokestatic 506	java/lang/Math:min	(JJ)J
    //   90: lstore 4
    //   92: aload_0
    //   93: new 508	java/io/ByteArrayOutputStream
    //   96: dup
    //   97: lload 4
    //   99: l2i
    //   100: invokespecial 510	java/io/ByteArrayOutputStream:<init>	(I)V
    //   103: putfield 512	com/fimi/soul/biz/l/h:f	Ljava/io/ByteArrayOutputStream;
    //   106: ldc_w 513
    //   109: newarray <illegal type>
    //   111: astore 7
    //   113: aload_0
    //   114: getfield 49	com/fimi/soul/biz/l/h:p	Z
    //   117: ifeq +163 -> 280
    //   120: aload_0
    //   121: aload_0
    //   122: getfield 45	com/fimi/soul/biz/l/h:a	Ljava/lang/String;
    //   125: aload_0
    //   126: getfield 427	com/fimi/soul/biz/l/h:b	Ljava/lang/String;
    //   129: aload_0
    //   130: getfield 197	com/fimi/soul/biz/l/h:c	Ljava/lang/String;
    //   133: iload_1
    //   134: aload_0
    //   135: getfield 512	com/fimi/soul/biz/l/h:f	Ljava/io/ByteArrayOutputStream;
    //   138: invokevirtual 517	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   141: invokespecial 519	com/fimi/soul/biz/l/h:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[B)Lcom/xiaomi/infra/galaxy/fds/android/model/UploadPartResult;
    //   144: astore 7
    //   146: aload 7
    //   148: ifnull +13 -> 161
    //   151: aload_0
    //   152: getfield 521	com/fimi/soul/biz/l/h:l	Ljava/util/ArrayList;
    //   155: aload 7
    //   157: invokevirtual 527	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   160: pop
    //   161: aload_0
    //   162: iload_1
    //   163: iconst_1
    //   164: iadd
    //   165: putfield 51	com/fimi/soul/biz/l/h:q	I
    //   168: iload_1
    //   169: iconst_1
    //   170: iadd
    //   171: istore_1
    //   172: goto -99 -> 73
    //   175: aload_0
    //   176: aload_0
    //   177: getfield 450	com/fimi/soul/biz/l/h:o	J
    //   180: putfield 498	com/fimi/soul/biz/l/h:s	J
    //   183: aload_0
    //   184: getfield 498	com/fimi/soul/biz/l/h:s	J
    //   187: iload_2
    //   188: i2l
    //   189: lrem
    //   190: lconst_0
    //   191: lcmp
    //   192: ifne +60 -> 252
    //   195: aload_0
    //   196: getfield 498	com/fimi/soul/biz/l/h:s	J
    //   199: iload_2
    //   200: i2l
    //   201: ldiv
    //   202: lstore 4
    //   204: aload_0
    //   205: lload 4
    //   207: l2i
    //   208: putfield 53	com/fimi/soul/biz/l/h:r	I
    //   211: aload_0
    //   212: new 523	java/util/ArrayList
    //   215: dup
    //   216: aload_0
    //   217: getfield 53	com/fimi/soul/biz/l/h:r	I
    //   220: invokespecial 528	java/util/ArrayList:<init>	(I)V
    //   223: putfield 521	com/fimi/soul/biz/l/h:l	Ljava/util/ArrayList;
    //   226: goto -183 -> 43
    //   229: astore 6
    //   231: aload_0
    //   232: aload_0
    //   233: getfield 427	com/fimi/soul/biz/l/h:b	Ljava/lang/String;
    //   236: aload_0
    //   237: getfield 197	com/fimi/soul/biz/l/h:c	Ljava/lang/String;
    //   240: aload_0
    //   241: getfield 45	com/fimi/soul/biz/l/h:a	Ljava/lang/String;
    //   244: invokespecial 530	com/fimi/soul/biz/l/h:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   247: aload_0
    //   248: getfield 47	com/fimi/soul/biz/l/h:i	Lcom/fimi/soul/biz/l/f;
    //   251: areturn
    //   252: aload_0
    //   253: getfield 498	com/fimi/soul/biz/l/h:s	J
    //   256: iload_2
    //   257: i2l
    //   258: ldiv
    //   259: lconst_1
    //   260: ladd
    //   261: lstore 4
    //   263: goto -59 -> 204
    //   266: aload_0
    //   267: getfield 498	com/fimi/soul/biz/l/h:s	J
    //   270: iload_2
    //   271: i2l
    //   272: ldiv
    //   273: lconst_1
    //   274: ladd
    //   275: lstore 4
    //   277: goto -213 -> 64
    //   280: aload 7
    //   282: arraylength
    //   283: lload 4
    //   285: l2i
    //   286: invokestatic 532	java/lang/Math:min	(II)I
    //   289: istore_3
    //   290: lload 4
    //   292: lconst_0
    //   293: lcmp
    //   294: ifle -174 -> 120
    //   297: aload_0
    //   298: getfield 443	com/fimi/soul/biz/l/h:e	Ljava/io/BufferedInputStream;
    //   301: aload 7
    //   303: iconst_0
    //   304: iload_3
    //   305: invokevirtual 536	java/io/BufferedInputStream:read	([BII)I
    //   308: istore_3
    //   309: iload_3
    //   310: iconst_m1
    //   311: if_icmpeq -191 -> 120
    //   314: aload_0
    //   315: getfield 512	com/fimi/soul/biz/l/h:f	Ljava/io/ByteArrayOutputStream;
    //   318: aload 7
    //   320: iconst_0
    //   321: iload_3
    //   322: invokevirtual 540	java/io/ByteArrayOutputStream:write	([BII)V
    //   325: lload 4
    //   327: iload_3
    //   328: i2l
    //   329: lsub
    //   330: lstore 4
    //   332: aload_0
    //   333: aload_0
    //   334: getfield 498	com/fimi/soul/biz/l/h:s	J
    //   337: iload_3
    //   338: i2l
    //   339: lsub
    //   340: putfield 498	com/fimi/soul/biz/l/h:s	J
    //   343: aload_0
    //   344: iload_3
    //   345: aload_0
    //   346: getfield 55	com/fimi/soul/biz/l/h:k	I
    //   349: iadd
    //   350: putfield 55	com/fimi/soul/biz/l/h:k	I
    //   353: aload_0
    //   354: getfield 431	com/fimi/soul/biz/l/h:h	Lcom/xiaomi/infra/galaxy/fds/android/model/ProgressListener;
    //   357: aload_0
    //   358: getfield 55	com/fimi/soul/biz/l/h:k	I
    //   361: i2l
    //   362: aload_0
    //   363: getfield 450	com/fimi/soul/biz/l/h:o	J
    //   366: invokevirtual 546	com/xiaomi/infra/galaxy/fds/android/model/ProgressListener:onProgress	(JJ)V
    //   369: ldc_w 548
    //   372: new 79	java/lang/StringBuilder
    //   375: dup
    //   376: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   379: ldc_w 550
    //   382: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: aload_0
    //   386: getfield 55	com/fimi/soul/biz/l/h:k	I
    //   389: bipush 100
    //   391: imul
    //   392: i2l
    //   393: aload_0
    //   394: getfield 450	com/fimi/soul/biz/l/h:o	J
    //   397: ldiv
    //   398: invokevirtual 553	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   401: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   404: invokestatic 558	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   407: pop
    //   408: ldc2_w 559
    //   411: invokestatic 565	java/lang/Thread:sleep	(J)V
    //   414: goto -301 -> 113
    //   417: astore 6
    //   419: aload 6
    //   421: invokevirtual 568	java/io/FileNotFoundException:printStackTrace	()V
    //   424: aload_0
    //   425: getfield 47	com/fimi/soul/biz/l/h:i	Lcom/fimi/soul/biz/l/f;
    //   428: iconst_0
    //   429: invokevirtual 256	com/fimi/soul/biz/l/f:a	(Z)V
    //   432: goto -185 -> 247
    //   435: aload 6
    //   437: aload_0
    //   438: getfield 521	com/fimi/soul/biz/l/h:l	Ljava/util/ArrayList;
    //   441: invokevirtual 572	com/xiaomi/infra/galaxy/fds/android/model/UploadPartResultList:setUploadPartResultList	(Ljava/util/List;)V
    //   444: aload_0
    //   445: aload_0
    //   446: getfield 45	com/fimi/soul/biz/l/h:a	Ljava/lang/String;
    //   449: aload_0
    //   450: getfield 427	com/fimi/soul/biz/l/h:b	Ljava/lang/String;
    //   453: aload_0
    //   454: getfield 197	com/fimi/soul/biz/l/h:c	Ljava/lang/String;
    //   457: aload_0
    //   458: getfield 453	com/fimi/soul/biz/l/h:g	Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;
    //   461: aload 6
    //   463: aload_0
    //   464: getfield 433	com/fimi/soul/biz/l/h:d	Ljava/util/List;
    //   467: invokespecial 574	com/fimi/soul/biz/l/h:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;Lcom/xiaomi/infra/galaxy/fds/android/model/UploadPartResultList;Ljava/util/List;)Lcom/xiaomi/infra/galaxy/fds/android/model/PutObjectResult;
    //   470: pop
    //   471: aload_0
    //   472: getfield 47	com/fimi/soul/biz/l/h:i	Lcom/fimi/soul/biz/l/f;
    //   475: iconst_1
    //   476: invokevirtual 256	com/fimi/soul/biz/l/f:a	(Z)V
    //   479: goto -232 -> 247
    //   482: astore 6
    //   484: aload 6
    //   486: invokevirtual 575	java/io/IOException:printStackTrace	()V
    //   489: aload_0
    //   490: getfield 47	com/fimi/soul/biz/l/h:i	Lcom/fimi/soul/biz/l/f;
    //   493: iconst_0
    //   494: invokevirtual 256	com/fimi/soul/biz/l/f:a	(Z)V
    //   497: goto -250 -> 247
    //   500: astore 6
    //   502: aload 6
    //   504: invokevirtual 576	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException:printStackTrace	()V
    //   507: aload_0
    //   508: getfield 47	com/fimi/soul/biz/l/h:i	Lcom/fimi/soul/biz/l/f;
    //   511: iconst_0
    //   512: invokevirtual 256	com/fimi/soul/biz/l/f:a	(Z)V
    //   515: goto -268 -> 247
    //   518: astore 6
    //   520: aload 6
    //   522: invokevirtual 577	java/lang/InterruptedException:printStackTrace	()V
    //   525: goto -278 -> 247
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	528	0	this	h
    //   67	105	1	i1	int
    //   7	264	2	i2	int
    //   289	61	3	i3	int
    //   62	269	4	l1	long
    //   15	1	6	localUploadPartResultList	com.xiaomi.infra.galaxy.fds.android.model.UploadPartResultList
    //   229	1	6	localGalaxyFDSClientException1	GalaxyFDSClientException
    //   417	45	6	localFileNotFoundException	FileNotFoundException
    //   482	3	6	localIOException	IOException
    //   500	3	6	localGalaxyFDSClientException2	GalaxyFDSClientException
    //   518	3	6	localInterruptedException	InterruptedException
    //   111	208	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   17	43	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   43	64	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   68	73	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   73	113	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   113	120	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   120	146	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   151	161	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   161	168	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   175	204	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   204	226	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   252	263	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   266	277	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   280	290	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   297	309	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   314	325	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   332	414	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   435	479	229	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   17	43	417	java/io/FileNotFoundException
    //   43	64	417	java/io/FileNotFoundException
    //   68	73	417	java/io/FileNotFoundException
    //   73	113	417	java/io/FileNotFoundException
    //   113	120	417	java/io/FileNotFoundException
    //   120	146	417	java/io/FileNotFoundException
    //   151	161	417	java/io/FileNotFoundException
    //   161	168	417	java/io/FileNotFoundException
    //   175	204	417	java/io/FileNotFoundException
    //   204	226	417	java/io/FileNotFoundException
    //   252	263	417	java/io/FileNotFoundException
    //   266	277	417	java/io/FileNotFoundException
    //   280	290	417	java/io/FileNotFoundException
    //   297	309	417	java/io/FileNotFoundException
    //   314	325	417	java/io/FileNotFoundException
    //   332	414	417	java/io/FileNotFoundException
    //   435	479	417	java/io/FileNotFoundException
    //   17	43	482	java/io/IOException
    //   43	64	482	java/io/IOException
    //   68	73	482	java/io/IOException
    //   73	113	482	java/io/IOException
    //   113	120	482	java/io/IOException
    //   120	146	482	java/io/IOException
    //   151	161	482	java/io/IOException
    //   161	168	482	java/io/IOException
    //   175	204	482	java/io/IOException
    //   204	226	482	java/io/IOException
    //   252	263	482	java/io/IOException
    //   266	277	482	java/io/IOException
    //   280	290	482	java/io/IOException
    //   297	309	482	java/io/IOException
    //   314	325	482	java/io/IOException
    //   332	414	482	java/io/IOException
    //   435	479	482	java/io/IOException
    //   231	247	500	com/xiaomi/infra/galaxy/fds/android/exception/GalaxyFDSClientException
    //   17	43	518	java/lang/InterruptedException
    //   43	64	518	java/lang/InterruptedException
    //   68	73	518	java/lang/InterruptedException
    //   73	113	518	java/lang/InterruptedException
    //   113	120	518	java/lang/InterruptedException
    //   120	146	518	java/lang/InterruptedException
    //   151	161	518	java/lang/InterruptedException
    //   161	168	518	java/lang/InterruptedException
    //   175	204	518	java/lang/InterruptedException
    //   204	226	518	java/lang/InterruptedException
    //   252	263	518	java/lang/InterruptedException
    //   266	277	518	java/lang/InterruptedException
    //   280	290	518	java/lang/InterruptedException
    //   297	309	518	java/lang/InterruptedException
    //   314	325	518	java/lang/InterruptedException
    //   332	414	518	java/lang/InterruptedException
    //   435	479	518	java/lang/InterruptedException
  }
  
  public void c()
  {
    this.p = true;
  }
  
  public void d()
  {
    Thread.interrupted();
    this.q = 0;
    this.s = 0L;
  }
  
  public f e()
  {
    this.p = false;
    return b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */