package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.cache.e;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.k.a;
import com.google.android.gms.ads.internal.request.l;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public final class aae
  extends k.a
{
  private static final Object a = new Object();
  private static aae b;
  private final Context c;
  private final aad d;
  private final ty e;
  private final wx f;
  
  aae(Context paramContext, ty paramty, aad paramaad)
  {
    this.c = paramContext;
    this.d = paramaad;
    this.e = paramty;
    if (paramContext.getApplicationContext() != null) {
      paramContext = paramContext.getApplicationContext();
    }
    for (;;)
    {
      this.f = new wx(paramContext, VersionInfoParcel.a(), paramty.a(), new aae.4(this), new wx.b());
      return;
    }
  }
  
  private static Location a(aco<Location> paramaco)
  {
    try
    {
      paramaco = (Location)paramaco.get(((Long)uf.bZ.c()).longValue(), TimeUnit.MILLISECONDS);
      return paramaco;
    }
    catch (Exception paramaco)
    {
      abr.d("Exception caught while getting location", paramaco);
    }
    return null;
  }
  
  private static AdResponseParcel a(Context paramContext, wx paramwx, ty paramty, aad paramaad, AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    abr.a("Starting ad request from service using: AFMA_getAd");
    uf.a(paramContext);
    aco localaco = paramaad.i.a();
    un localun = new un(((Boolean)uf.N.c()).booleanValue(), "load_ad", paramAdRequestInfoParcel.d.b);
    if ((paramAdRequestInfoParcel.a > 10) && (paramAdRequestInfoParcel.B != -1L)) {
      localun.a(localun.a(paramAdRequestInfoParcel.B), new String[] { "cts" });
    }
    ul localul = localun.a();
    if ((paramAdRequestInfoParcel.a >= 4) && (paramAdRequestInfoParcel.o != null)) {}
    label1046:
    Object localObject2;
    for (Object localObject1 = paramAdRequestInfoParcel.o;; localObject2 = null)
    {
      if ((((Boolean)uf.W.c()).booleanValue()) && (paramaad.a != null))
      {
        paramty = (ty)localObject1;
        if (localObject1 == null)
        {
          paramty = (ty)localObject1;
          if (((Boolean)uf.X.c()).booleanValue())
          {
            abr.e("contentInfo is not present, but we'll still launch the app index task");
            paramty = new Bundle();
          }
        }
        if (paramty != null) {
          localObject1 = abu.a(new aae.1(paramaad, paramContext, paramAdRequestInfoParcel, paramty));
        }
      }
      for (;;)
      {
        Object localObject3 = new acm(null);
        Object localObject4 = paramAdRequestInfoParcel.c.c;
        int i;
        if ((localObject4 != null) && (((Bundle)localObject4).getString("_ad") != null))
        {
          i = 1;
          if ((!paramAdRequestInfoParcel.I) || (i != 0)) {
            break label1046;
          }
          localObject3 = paramaad.f.a(paramAdRequestInfoParcel.f);
        }
        for (;;)
        {
          aak localaak = u.n().a(paramContext);
          if (localaak.m == -1)
          {
            abr.a("Device is offline.");
            return new AdResponseParcel(2);
            i = 0;
            break;
          }
          if (paramAdRequestInfoParcel.a >= 7) {}
          aag localaag;
          for (localObject4 = paramAdRequestInfoParcel.w;; localObject4 = UUID.randomUUID().toString())
          {
            localaag = new aag((String)localObject4, paramAdRequestInfoParcel.f.packageName);
            if (paramAdRequestInfoParcel.c.c == null) {
              break;
            }
            localObject5 = paramAdRequestInfoParcel.c.c.getString("_ad");
            if (localObject5 == null) {
              break;
            }
            return aaf.a(paramContext, paramAdRequestInfoParcel, (String)localObject5);
          }
          Object localObject5 = paramaad.d.a(paramAdRequestInfoParcel);
          String str = paramaad.j.a(paramAdRequestInfoParcel);
          aao.a locala = paramaad.h.a(paramContext);
          if (localObject1 != null) {}
          try
          {
            abr.e("Waiting for app index fetching task.");
            ((Future)localObject1).get(((Long)uf.Y.c()).longValue(), TimeUnit.MILLISECONDS);
            abr.e("App index fetching task completed.");
            localObject1 = paramaad.c.a(paramAdRequestInfoParcel.g.packageName);
            b(localaco);
            paramty = aaf.a(paramContext, new aab().a(paramAdRequestInfoParcel).a(localaak).a(locala).a(a((aco)localObject3)).a(b(localaco)).a(str).a((List)localObject5).b(paramty).b((String)localObject1).a(paramaad.b.a(paramContext)));
            if (paramty == null) {
              return new AdResponseParcel(0);
            }
          }
          catch (InterruptedException localInterruptedException)
          {
            for (;;)
            {
              abr.d("Failed to fetch app index signal", localInterruptedException);
            }
          }
          catch (TimeoutException localTimeoutException)
          {
            for (;;)
            {
              abr.a("Timed out waiting for app index fetching task");
            }
            if (paramAdRequestInfoParcel.a < 7) {}
            try
            {
              paramty.put("request_id", localObject4);
              try
              {
                paramty.put("prefetch_mode", "url");
                paramty = paramty.toString();
                localun.a(localul, new String[] { "arc" });
                localObject3 = localun.a();
                abv.a.post(new aae.2(paramwx, localaag, localun, (ul)localObject3, paramty));
              }
              catch (JSONException localJSONException1)
              {
                for (;;)
                {
                  try
                  {
                    localObject3 = (aaj)localaag.b().get(10L, TimeUnit.SECONDS);
                    if (localObject3 != null) {
                      continue;
                    }
                    paramwx = new AdResponseParcel(0);
                    return paramwx;
                  }
                  catch (Exception paramwx)
                  {
                    paramwx = new AdResponseParcel(0);
                    return paramwx;
                    if (localJSONException1.a() == -2) {
                      continue;
                    }
                    paramwx = new AdResponseParcel(localJSONException1.a());
                    return paramwx;
                    if (localun.e() == null) {
                      continue;
                    }
                    localun.a(localun.e(), new String[] { "rur" });
                    paramty = null;
                    if (TextUtils.isEmpty(localJSONException1.h())) {
                      continue;
                    }
                    paramty = aaf.a(paramContext, paramAdRequestInfoParcel, localJSONException1.h());
                    paramwx = paramty;
                    if (paramty != null) {
                      continue;
                    }
                    paramwx = paramty;
                    if (TextUtils.isEmpty(localJSONException1.d())) {
                      continue;
                    }
                    paramwx = a(paramAdRequestInfoParcel, paramContext, paramAdRequestInfoParcel.k.b, localJSONException1.d(), localTimeoutException, localJSONException1, localun, paramaad);
                    paramty = paramwx;
                    if (paramwx != null) {
                      continue;
                    }
                    paramty = new AdResponseParcel(0);
                    localun.a(localul, new String[] { "tts" });
                    paramty.y = localun.c();
                    return paramty;
                  }
                  finally
                  {
                    abv.a.post(new aae.3(paramaad, paramContext, localaag, paramAdRequestInfoParcel));
                  }
                  localJSONException1 = localJSONException1;
                  abr.d("Failed putting prefetch parameters to ad request.", localJSONException1);
                }
              }
            }
            catch (JSONException localJSONException2)
            {
              for (;;) {}
            }
          }
          catch (ExecutionException localExecutionException)
          {
            for (;;) {}
          }
        }
        localObject2 = null;
        continue;
        paramty = (ty)localObject2;
        localObject2 = null;
      }
    }
  }
  
  /* Error */
  public static AdResponseParcel a(AdRequestInfoParcel paramAdRequestInfoParcel, Context paramContext, String paramString1, String paramString2, String paramString3, aaj paramaaj, un paramun, aad paramaad)
  {
    // Byte code:
    //   0: aload 6
    //   2: ifnull +706 -> 708
    //   5: aload 6
    //   7: invokevirtual 185	com/google/android/gms/internal/un:a	()Lcom/google/android/gms/internal/ul;
    //   10: astore 12
    //   12: new 482	com/google/android/gms/internal/aah
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 485	com/google/android/gms/internal/aah:<init>	(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)V
    //   20: astore 15
    //   22: aload_3
    //   23: invokestatic 489	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   26: astore 13
    //   28: aload 13
    //   30: invokevirtual 492	java/lang/String:length	()I
    //   33: ifeq +329 -> 362
    //   36: ldc_w 494
    //   39: aload 13
    //   41: invokevirtual 497	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   44: astore 13
    //   46: aload 13
    //   48: invokestatic 123	com/google/android/gms/internal/abr:a	(Ljava/lang/String;)V
    //   51: new 499	java/net/URL
    //   54: dup
    //   55: aload_3
    //   56: invokespecial 501	java/net/URL:<init>	(Ljava/lang/String;)V
    //   59: astore_3
    //   60: invokestatic 504	com/google/android/gms/ads/internal/u:k	()Lcom/google/android/gms/common/util/e;
    //   63: invokeinterface 508 1 0
    //   68: lstore 10
    //   70: iconst_0
    //   71: istore 8
    //   73: aload 7
    //   75: ifnull +13 -> 88
    //   78: aload 7
    //   80: getfield 511	com/google/android/gms/internal/aad:g	Lcom/google/android/gms/internal/aan;
    //   83: invokeinterface 515 1 0
    //   88: aload_3
    //   89: invokevirtual 519	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   92: checkcast 521	java/net/HttpURLConnection
    //   95: astore 14
    //   97: invokestatic 524	com/google/android/gms/ads/internal/u:e	()Lcom/google/android/gms/internal/abv;
    //   100: aload_1
    //   101: aload_2
    //   102: iconst_0
    //   103: aload 14
    //   105: invokevirtual 527	com/google/android/gms/internal/abv:a	(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;)V
    //   108: aload 4
    //   110: invokestatic 461	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   113: ifne +21 -> 134
    //   116: aload 5
    //   118: invokevirtual 529	com/google/android/gms/internal/aaj:f	()Z
    //   121: ifeq +13 -> 134
    //   124: aload 14
    //   126: ldc_w 531
    //   129: aload 4
    //   131: invokevirtual 534	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   134: aload_0
    //   135: getfield 536	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:J	Ljava/lang/String;
    //   138: astore 13
    //   140: aload 13
    //   142: invokestatic 461	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   145: ifne +19 -> 164
    //   148: ldc_w 538
    //   151: invokestatic 123	com/google/android/gms/internal/abr:a	(Ljava/lang/String;)V
    //   154: aload 14
    //   156: ldc_w 540
    //   159: aload 13
    //   161: invokevirtual 534	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   164: aload 5
    //   166: ifnull +64 -> 230
    //   169: aload 5
    //   171: invokevirtual 541	com/google/android/gms/internal/aaj:c	()Ljava/lang/String;
    //   174: invokestatic 461	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   177: ifne +53 -> 230
    //   180: aload 14
    //   182: iconst_1
    //   183: invokevirtual 545	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   186: aload 5
    //   188: invokevirtual 541	com/google/android/gms/internal/aaj:c	()Ljava/lang/String;
    //   191: invokevirtual 549	java/lang/String:getBytes	()[B
    //   194: astore 16
    //   196: aload 14
    //   198: aload 16
    //   200: arraylength
    //   201: invokevirtual 552	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   204: new 554	java/io/BufferedOutputStream
    //   207: dup
    //   208: aload 14
    //   210: invokevirtual 558	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   213: invokespecial 561	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   216: astore 13
    //   218: aload 13
    //   220: aload 16
    //   222: invokevirtual 565	java/io/BufferedOutputStream:write	([B)V
    //   225: aload 13
    //   227: invokestatic 570	com/google/android/gms/common/util/o:a	(Ljava/io/Closeable;)V
    //   230: aload 14
    //   232: invokevirtual 573	java/net/HttpURLConnection:getResponseCode	()I
    //   235: istore 9
    //   237: aload 14
    //   239: invokevirtual 577	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   242: astore 13
    //   244: iload 9
    //   246: sipush 200
    //   249: if_icmplt +206 -> 455
    //   252: iload 9
    //   254: sipush 300
    //   257: if_icmpge +198 -> 455
    //   260: aload_3
    //   261: invokevirtual 578	java/net/URL:toString	()Ljava/lang/String;
    //   264: astore_0
    //   265: new 580	java/io/InputStreamReader
    //   268: dup
    //   269: aload 14
    //   271: invokevirtual 584	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   274: invokespecial 587	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   277: astore_1
    //   278: invokestatic 524	com/google/android/gms/ads/internal/u:e	()Lcom/google/android/gms/internal/abv;
    //   281: aload_1
    //   282: invokevirtual 590	com/google/android/gms/internal/abv:a	(Ljava/io/InputStreamReader;)Ljava/lang/String;
    //   285: astore_2
    //   286: aload_1
    //   287: invokestatic 570	com/google/android/gms/common/util/o:a	(Ljava/io/Closeable;)V
    //   290: aload_0
    //   291: aload 13
    //   293: aload_2
    //   294: iload 9
    //   296: invokestatic 593	com/google/android/gms/internal/aae:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //   299: aload 15
    //   301: aload_0
    //   302: aload 13
    //   304: aload_2
    //   305: invokevirtual 596	com/google/android/gms/internal/aah:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    //   308: aload 6
    //   310: ifnull +21 -> 331
    //   313: aload 6
    //   315: aload 12
    //   317: iconst_1
    //   318: anewarray 177	java/lang/String
    //   321: dup
    //   322: iconst_0
    //   323: ldc_w 598
    //   326: aastore
    //   327: invokevirtual 182	com/google/android/gms/internal/un:a	(Lcom/google/android/gms/internal/ul;[Ljava/lang/String;)Z
    //   330: pop
    //   331: aload 15
    //   333: lload 10
    //   335: invokevirtual 601	com/google/android/gms/internal/aah:a	(J)Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   338: astore_0
    //   339: aload 14
    //   341: invokevirtual 604	java/net/HttpURLConnection:disconnect	()V
    //   344: aload 7
    //   346: ifnull +360 -> 706
    //   349: aload 7
    //   351: getfield 511	com/google/android/gms/internal/aad:g	Lcom/google/android/gms/internal/aan;
    //   354: invokeinterface 606 1 0
    //   359: goto +347 -> 706
    //   362: new 177	java/lang/String
    //   365: dup
    //   366: ldc_w 494
    //   369: invokespecial 607	java/lang/String:<init>	(Ljava/lang/String;)V
    //   372: astore 13
    //   374: goto -328 -> 46
    //   377: astore_0
    //   378: aload_0
    //   379: invokevirtual 610	java/io/IOException:getMessage	()Ljava/lang/String;
    //   382: invokestatic 489	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   385: astore_0
    //   386: aload_0
    //   387: invokevirtual 492	java/lang/String:length	()I
    //   390: ifeq +291 -> 681
    //   393: ldc_w 612
    //   396: aload_0
    //   397: invokevirtual 497	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   400: astore_0
    //   401: aload_0
    //   402: invokestatic 614	com/google/android/gms/internal/abr:d	(Ljava/lang/String;)V
    //   405: new 267	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   408: dup
    //   409: iconst_2
    //   410: invokespecial 270	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   413: areturn
    //   414: astore_0
    //   415: aconst_null
    //   416: astore_1
    //   417: aload_1
    //   418: invokestatic 570	com/google/android/gms/common/util/o:a	(Ljava/io/Closeable;)V
    //   421: aload_0
    //   422: athrow
    //   423: astore_0
    //   424: aload 14
    //   426: invokevirtual 604	java/net/HttpURLConnection:disconnect	()V
    //   429: aload 7
    //   431: ifnull +13 -> 444
    //   434: aload 7
    //   436: getfield 511	com/google/android/gms/internal/aad:g	Lcom/google/android/gms/internal/aan;
    //   439: invokeinterface 606 1 0
    //   444: aload_0
    //   445: athrow
    //   446: astore_0
    //   447: aconst_null
    //   448: astore_1
    //   449: aload_1
    //   450: invokestatic 570	com/google/android/gms/common/util/o:a	(Ljava/io/Closeable;)V
    //   453: aload_0
    //   454: athrow
    //   455: aload_3
    //   456: invokevirtual 578	java/net/URL:toString	()Ljava/lang/String;
    //   459: aload 13
    //   461: aconst_null
    //   462: iload 9
    //   464: invokestatic 593	com/google/android/gms/internal/aae:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //   467: iload 9
    //   469: sipush 300
    //   472: if_icmplt +122 -> 594
    //   475: iload 9
    //   477: sipush 400
    //   480: if_icmpge +114 -> 594
    //   483: aload 14
    //   485: ldc_w 616
    //   488: invokevirtual 619	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   491: astore_3
    //   492: aload_3
    //   493: invokestatic 461	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   496: ifeq +40 -> 536
    //   499: ldc_w 621
    //   502: invokestatic 614	com/google/android/gms/internal/abr:d	(Ljava/lang/String;)V
    //   505: new 267	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   508: dup
    //   509: iconst_0
    //   510: invokespecial 270	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   513: astore_0
    //   514: aload 14
    //   516: invokevirtual 604	java/net/HttpURLConnection:disconnect	()V
    //   519: aload 7
    //   521: ifnull +13 -> 534
    //   524: aload 7
    //   526: getfield 511	com/google/android/gms/internal/aad:g	Lcom/google/android/gms/internal/aan;
    //   529: invokeinterface 606 1 0
    //   534: aload_0
    //   535: areturn
    //   536: new 499	java/net/URL
    //   539: dup
    //   540: aload_3
    //   541: invokespecial 501	java/net/URL:<init>	(Ljava/lang/String;)V
    //   544: astore_3
    //   545: iload 8
    //   547: iconst_1
    //   548: iadd
    //   549: istore 8
    //   551: iload 8
    //   553: iconst_5
    //   554: if_icmple +97 -> 651
    //   557: ldc_w 623
    //   560: invokestatic 614	com/google/android/gms/internal/abr:d	(Ljava/lang/String;)V
    //   563: new 267	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   566: dup
    //   567: iconst_0
    //   568: invokespecial 270	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   571: astore_0
    //   572: aload 14
    //   574: invokevirtual 604	java/net/HttpURLConnection:disconnect	()V
    //   577: aload 7
    //   579: ifnull +13 -> 592
    //   582: aload 7
    //   584: getfield 511	com/google/android/gms/internal/aad:g	Lcom/google/android/gms/internal/aan;
    //   587: invokeinterface 606 1 0
    //   592: aload_0
    //   593: areturn
    //   594: new 625	java/lang/StringBuilder
    //   597: dup
    //   598: bipush 46
    //   600: invokespecial 626	java/lang/StringBuilder:<init>	(I)V
    //   603: ldc_w 628
    //   606: invokevirtual 632	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   609: iload 9
    //   611: invokevirtual 635	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   614: invokevirtual 636	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   617: invokestatic 614	com/google/android/gms/internal/abr:d	(Ljava/lang/String;)V
    //   620: new 267	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   623: dup
    //   624: iconst_0
    //   625: invokespecial 270	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   628: astore_0
    //   629: aload 14
    //   631: invokevirtual 604	java/net/HttpURLConnection:disconnect	()V
    //   634: aload 7
    //   636: ifnull +13 -> 649
    //   639: aload 7
    //   641: getfield 511	com/google/android/gms/internal/aad:g	Lcom/google/android/gms/internal/aan;
    //   644: invokeinterface 606 1 0
    //   649: aload_0
    //   650: areturn
    //   651: aload 15
    //   653: aload 13
    //   655: invokevirtual 639	com/google/android/gms/internal/aah:a	(Ljava/util/Map;)V
    //   658: aload 14
    //   660: invokevirtual 604	java/net/HttpURLConnection:disconnect	()V
    //   663: aload 7
    //   665: ifnull +13 -> 678
    //   668: aload 7
    //   670: getfield 511	com/google/android/gms/internal/aad:g	Lcom/google/android/gms/internal/aan;
    //   673: invokeinterface 606 1 0
    //   678: goto -605 -> 73
    //   681: new 177	java/lang/String
    //   684: dup
    //   685: ldc_w 612
    //   688: invokespecial 607	java/lang/String:<init>	(Ljava/lang/String;)V
    //   691: astore_0
    //   692: goto -291 -> 401
    //   695: astore_0
    //   696: goto -247 -> 449
    //   699: astore_0
    //   700: aload 13
    //   702: astore_1
    //   703: goto -286 -> 417
    //   706: aload_0
    //   707: areturn
    //   708: aconst_null
    //   709: astore 12
    //   711: goto -699 -> 12
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	714	0	paramAdRequestInfoParcel	AdRequestInfoParcel
    //   0	714	1	paramContext	Context
    //   0	714	2	paramString1	String
    //   0	714	3	paramString2	String
    //   0	714	4	paramString3	String
    //   0	714	5	paramaaj	aaj
    //   0	714	6	paramun	un
    //   0	714	7	paramaad	aad
    //   71	484	8	i	int
    //   235	375	9	j	int
    //   68	266	10	l	long
    //   10	700	12	localul	ul
    //   26	675	13	localObject	Object
    //   95	564	14	localHttpURLConnection	java.net.HttpURLConnection
    //   20	632	15	localaah	aah
    //   194	27	16	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   12	46	377	java/io/IOException
    //   46	70	377	java/io/IOException
    //   78	88	377	java/io/IOException
    //   88	97	377	java/io/IOException
    //   339	344	377	java/io/IOException
    //   349	359	377	java/io/IOException
    //   362	374	377	java/io/IOException
    //   424	429	377	java/io/IOException
    //   434	444	377	java/io/IOException
    //   444	446	377	java/io/IOException
    //   514	519	377	java/io/IOException
    //   524	534	377	java/io/IOException
    //   572	577	377	java/io/IOException
    //   582	592	377	java/io/IOException
    //   629	634	377	java/io/IOException
    //   639	649	377	java/io/IOException
    //   658	663	377	java/io/IOException
    //   668	678	377	java/io/IOException
    //   204	218	414	finally
    //   97	134	423	finally
    //   134	164	423	finally
    //   169	204	423	finally
    //   225	230	423	finally
    //   230	244	423	finally
    //   260	265	423	finally
    //   286	308	423	finally
    //   313	331	423	finally
    //   331	339	423	finally
    //   417	423	423	finally
    //   449	455	423	finally
    //   455	467	423	finally
    //   483	514	423	finally
    //   536	545	423	finally
    //   557	572	423	finally
    //   594	629	423	finally
    //   651	658	423	finally
    //   265	278	446	finally
    //   278	286	695	finally
    //   218	225	699	finally
  }
  
  public static aae a(Context paramContext, ty paramty, aad paramaad)
  {
    synchronized (a)
    {
      if (b == null)
      {
        Context localContext = paramContext;
        if (paramContext.getApplicationContext() != null) {
          localContext = paramContext.getApplicationContext();
        }
        b = new aae(localContext, paramty, paramaad);
      }
      paramContext = b;
      return paramContext;
    }
  }
  
  private static void a(String paramString1, Map<String, List<String>> paramMap, String paramString2, int paramInt)
  {
    if (abr.a(2))
    {
      abr.e(String.valueOf(paramString1).length() + 39 + "Http Response: {\n  URL:\n    " + paramString1 + "\n  Headers:");
      if (paramMap != null)
      {
        Iterator localIterator1 = paramMap.keySet().iterator();
        if (localIterator1.hasNext())
        {
          paramString1 = (String)localIterator1.next();
          abr.e(String.valueOf(paramString1).length() + 5 + "    " + paramString1 + ":");
          Iterator localIterator2 = ((List)paramMap.get(paramString1)).iterator();
          label139:
          if (localIterator2.hasNext())
          {
            paramString1 = String.valueOf((String)localIterator2.next());
            if (paramString1.length() == 0) {
              break label185;
            }
          }
          label185:
          for (paramString1 = "      ".concat(paramString1);; paramString1 = new String("      "))
          {
            abr.e(paramString1);
            break label139;
            break;
          }
        }
      }
      abr.e("  Body:");
      if (paramString2 != null)
      {
        int i = 0;
        while (i < Math.min(paramString2.length(), 100000))
        {
          abr.e(paramString2.substring(i, Math.min(paramString2.length(), i + 1000)));
          i += 1000;
        }
      }
      abr.e("    null");
      abr.e(34 + "  Response Code:\n    " + paramInt + "\n}");
    }
  }
  
  private static Bundle b(aco<Bundle> paramaco)
  {
    Bundle localBundle = new Bundle();
    try
    {
      paramaco = (Bundle)paramaco.get(((Long)uf.cq.c()).longValue(), TimeUnit.MILLISECONDS);
      return paramaco;
    }
    catch (Exception paramaco)
    {
      abr.d("Exception caught while getting parental controls.", paramaco);
    }
    return localBundle;
  }
  
  public AdResponseParcel a(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    return a(this.c, this.f, this.e, this.d, paramAdRequestInfoParcel);
  }
  
  public void a(AdRequestInfoParcel paramAdRequestInfoParcel, l paraml)
  {
    u.i().a(this.c, paramAdRequestInfoParcel.k);
    abu.a(new aae.5(this, paramAdRequestInfoParcel, paraml));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/aae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */