package com.google.android.gms.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@aaa
public class wl
  extends wi
{
  private static final Set<String> d = Collections.synchronizedSet(new HashSet());
  private static final DecimalFormat e = new DecimalFormat("#,###");
  private File f;
  private boolean g;
  
  public wl(acy paramacy)
  {
    super(paramacy);
    paramacy = this.a.getCacheDir();
    if (paramacy == null) {
      abr.d("Context.getCacheDir() returned null");
    }
    do
    {
      return;
      this.f = new File(paramacy, "admobVideoStreams");
      if ((!this.f.isDirectory()) && (!this.f.mkdirs()))
      {
        paramacy = String.valueOf(this.f.getAbsolutePath());
        if (paramacy.length() != 0) {}
        for (paramacy = "Could not create preload cache directory at ".concat(paramacy);; paramacy = new String("Could not create preload cache directory at "))
        {
          abr.d(paramacy);
          this.f = null;
          return;
        }
      }
    } while ((this.f.setReadable(true, false)) && (this.f.setExecutable(true, false)));
    paramacy = String.valueOf(this.f.getAbsolutePath());
    if (paramacy.length() != 0) {}
    for (paramacy = "Could not set cache file permissions at ".concat(paramacy);; paramacy = new String("Could not set cache file permissions at "))
    {
      abr.d(paramacy);
      this.f = null;
      return;
    }
  }
  
  private File a(File paramFile)
  {
    return new File(this.f, String.valueOf(paramFile.getName()).concat(".done"));
  }
  
  private static void b(File paramFile)
  {
    if (paramFile.isFile())
    {
      paramFile.setLastModified(System.currentTimeMillis());
      return;
    }
    try
    {
      paramFile.createNewFile();
      return;
    }
    catch (IOException paramFile) {}
  }
  
  public void a()
  {
    this.g = true;
  }
  
  /* Error */
  public boolean a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 67	com/google/android/gms/internal/wl:f	Ljava/io/File;
    //   4: ifnonnull +14 -> 18
    //   7: aload_0
    //   8: aload_1
    //   9: aconst_null
    //   10: ldc -117
    //   12: aconst_null
    //   13: invokevirtual 142	com/google/android/gms/internal/wl:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   16: iconst_0
    //   17: ireturn
    //   18: aload_0
    //   19: invokevirtual 145	com/google/android/gms/internal/wl:c	()I
    //   22: getstatic 151	com/google/android/gms/internal/uf:r	Lcom/google/android/gms/internal/ub;
    //   25: invokevirtual 156	com/google/android/gms/internal/ub:c	()Ljava/lang/Object;
    //   28: checkcast 158	java/lang/Integer
    //   31: invokevirtual 161	java/lang/Integer:intValue	()I
    //   34: if_icmple +26 -> 60
    //   37: aload_0
    //   38: invokevirtual 163	com/google/android/gms/internal/wl:d	()Z
    //   41: ifne -23 -> 18
    //   44: ldc -91
    //   46: invokestatic 58	com/google/android/gms/internal/abr:d	(Ljava/lang/String;)V
    //   49: aload_0
    //   50: aload_1
    //   51: aconst_null
    //   52: ldc -89
    //   54: aconst_null
    //   55: invokevirtual 142	com/google/android/gms/internal/wl:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   58: iconst_0
    //   59: ireturn
    //   60: aload_0
    //   61: aload_1
    //   62: invokevirtual 169	com/google/android/gms/internal/wl:b	(Ljava/lang/String;)Ljava/lang/String;
    //   65: astore 10
    //   67: new 60	java/io/File
    //   70: dup
    //   71: aload_0
    //   72: getfield 67	com/google/android/gms/internal/wl:f	Ljava/io/File;
    //   75: aload 10
    //   77: invokespecial 65	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   80: astore 17
    //   82: aload_0
    //   83: aload 17
    //   85: invokespecial 171	com/google/android/gms/internal/wl:a	(Ljava/io/File;)Ljava/io/File;
    //   88: astore 11
    //   90: aload 17
    //   92: invokevirtual 117	java/io/File:isFile	()Z
    //   95: ifeq +73 -> 168
    //   98: aload 11
    //   100: invokevirtual 117	java/io/File:isFile	()Z
    //   103: ifeq +65 -> 168
    //   106: aload 17
    //   108: invokevirtual 173	java/io/File:length	()J
    //   111: l2i
    //   112: istore_2
    //   113: aload_1
    //   114: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   117: astore 10
    //   119: aload 10
    //   121: invokevirtual 88	java/lang/String:length	()I
    //   124: ifeq +30 -> 154
    //   127: ldc -81
    //   129: aload 10
    //   131: invokevirtual 94	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   134: astore 10
    //   136: aload 10
    //   138: invokestatic 177	com/google/android/gms/internal/abr:a	(Ljava/lang/String;)V
    //   141: aload_0
    //   142: aload_1
    //   143: aload 17
    //   145: invokevirtual 78	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   148: iload_2
    //   149: invokevirtual 180	com/google/android/gms/internal/wl:a	(Ljava/lang/String;Ljava/lang/String;I)V
    //   152: iconst_1
    //   153: ireturn
    //   154: new 80	java/lang/String
    //   157: dup
    //   158: ldc -81
    //   160: invokespecial 95	java/lang/String:<init>	(Ljava/lang/String;)V
    //   163: astore 10
    //   165: goto -29 -> 136
    //   168: aload_0
    //   169: getfield 67	com/google/android/gms/internal/wl:f	Ljava/io/File;
    //   172: invokevirtual 78	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   175: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   178: astore 10
    //   180: aload_1
    //   181: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   184: astore 12
    //   186: aload 12
    //   188: invokevirtual 88	java/lang/String:length	()I
    //   191: ifeq +85 -> 276
    //   194: aload 10
    //   196: aload 12
    //   198: invokevirtual 94	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   201: astore 16
    //   203: getstatic 29	com/google/android/gms/internal/wl:d	Ljava/util/Set;
    //   206: astore 12
    //   208: aload 12
    //   210: monitorenter
    //   211: getstatic 29	com/google/android/gms/internal/wl:d	Ljava/util/Set;
    //   214: aload 16
    //   216: invokeinterface 186 2 0
    //   221: ifeq +83 -> 304
    //   224: aload_1
    //   225: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   228: astore 10
    //   230: aload 10
    //   232: invokevirtual 88	java/lang/String:length	()I
    //   235: ifeq +55 -> 290
    //   238: ldc -68
    //   240: aload 10
    //   242: invokevirtual 94	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   245: astore 10
    //   247: aload 10
    //   249: invokestatic 58	com/google/android/gms/internal/abr:d	(Ljava/lang/String;)V
    //   252: aload_0
    //   253: aload_1
    //   254: aload 17
    //   256: invokevirtual 78	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   259: ldc -66
    //   261: aconst_null
    //   262: invokevirtual 142	com/google/android/gms/internal/wl:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   265: aload 12
    //   267: monitorexit
    //   268: iconst_0
    //   269: ireturn
    //   270: astore_1
    //   271: aload 12
    //   273: monitorexit
    //   274: aload_1
    //   275: athrow
    //   276: new 80	java/lang/String
    //   279: dup
    //   280: aload 10
    //   282: invokespecial 95	java/lang/String:<init>	(Ljava/lang/String;)V
    //   285: astore 16
    //   287: goto -84 -> 203
    //   290: new 80	java/lang/String
    //   293: dup
    //   294: ldc -68
    //   296: invokespecial 95	java/lang/String:<init>	(Ljava/lang/String;)V
    //   299: astore 10
    //   301: goto -54 -> 247
    //   304: getstatic 29	com/google/android/gms/internal/wl:d	Ljava/util/Set;
    //   307: aload 16
    //   309: invokeinterface 193 2 0
    //   314: pop
    //   315: aload 12
    //   317: monitorexit
    //   318: aconst_null
    //   319: astore 13
    //   321: invokestatic 198	com/google/android/gms/ads/internal/u:r	()Lcom/google/android/gms/internal/acq;
    //   324: aload_1
    //   325: getstatic 201	com/google/android/gms/internal/uf:x	Lcom/google/android/gms/internal/ub;
    //   328: invokevirtual 156	com/google/android/gms/internal/ub:c	()Ljava/lang/Object;
    //   331: checkcast 158	java/lang/Integer
    //   334: invokevirtual 161	java/lang/Integer:intValue	()I
    //   337: invokevirtual 206	com/google/android/gms/internal/acq:a	(Ljava/lang/String;I)Ljava/net/HttpURLConnection;
    //   340: astore 10
    //   342: aload 10
    //   344: instanceof 208
    //   347: ifeq +264 -> 611
    //   350: aload 10
    //   352: checkcast 208	java/net/HttpURLConnection
    //   355: invokevirtual 211	java/net/HttpURLConnection:getResponseCode	()I
    //   358: istore_2
    //   359: iload_2
    //   360: sipush 400
    //   363: if_icmplt +248 -> 611
    //   366: ldc -43
    //   368: astore 12
    //   370: iload_2
    //   371: invokestatic 217	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   374: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   377: astore 10
    //   379: aload 10
    //   381: invokevirtual 88	java/lang/String:length	()I
    //   384: ifeq +205 -> 589
    //   387: ldc -37
    //   389: aload 10
    //   391: invokevirtual 94	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   394: astore 11
    //   396: new 114	java/io/IOException
    //   399: dup
    //   400: new 221	java/lang/StringBuilder
    //   403: dup
    //   404: aload_1
    //   405: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   408: invokevirtual 88	java/lang/String:length	()I
    //   411: bipush 32
    //   413: iadd
    //   414: invokespecial 224	java/lang/StringBuilder:<init>	(I)V
    //   417: ldc -30
    //   419: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: iload_2
    //   423: invokevirtual 233	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   426: ldc -21
    //   428: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   431: aload_1
    //   432: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   435: invokevirtual 237	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   438: invokespecial 238	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   441: athrow
    //   442: astore 10
    //   444: aload 10
    //   446: instanceof 135
    //   449: ifeq +13 -> 462
    //   452: invokestatic 242	com/google/android/gms/ads/internal/u:i	()Lcom/google/android/gms/internal/abl;
    //   455: aload 10
    //   457: ldc -12
    //   459: invokevirtual 249	com/google/android/gms/internal/abl:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   462: aload 13
    //   464: invokevirtual 254	java/io/FileOutputStream:close	()V
    //   467: aload_0
    //   468: getfield 132	com/google/android/gms/internal/wl:g	Z
    //   471: ifeq +1044 -> 1515
    //   474: new 221	java/lang/StringBuilder
    //   477: dup
    //   478: aload_1
    //   479: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   482: invokevirtual 88	java/lang/String:length	()I
    //   485: bipush 26
    //   487: iadd
    //   488: invokespecial 224	java/lang/StringBuilder:<init>	(I)V
    //   491: ldc_w 256
    //   494: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: aload_1
    //   498: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: ldc_w 258
    //   504: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   507: invokevirtual 237	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   510: invokestatic 260	com/google/android/gms/internal/abr:c	(Ljava/lang/String;)V
    //   513: aload 17
    //   515: invokevirtual 263	java/io/File:exists	()Z
    //   518: ifeq +44 -> 562
    //   521: aload 17
    //   523: invokevirtual 266	java/io/File:delete	()Z
    //   526: ifne +36 -> 562
    //   529: aload 17
    //   531: invokevirtual 78	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   534: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   537: astore 10
    //   539: aload 10
    //   541: invokevirtual 88	java/lang/String:length	()I
    //   544: ifeq +1015 -> 1559
    //   547: ldc_w 268
    //   550: aload 10
    //   552: invokevirtual 94	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   555: astore 10
    //   557: aload 10
    //   559: invokestatic 58	com/google/android/gms/internal/abr:d	(Ljava/lang/String;)V
    //   562: aload_0
    //   563: aload_1
    //   564: aload 17
    //   566: invokevirtual 78	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   569: aload 12
    //   571: aload 11
    //   573: invokevirtual 142	com/google/android/gms/internal/wl:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   576: getstatic 29	com/google/android/gms/internal/wl:d	Ljava/util/Set;
    //   579: aload 16
    //   581: invokeinterface 271 2 0
    //   586: pop
    //   587: iconst_0
    //   588: ireturn
    //   589: new 80	java/lang/String
    //   592: dup
    //   593: ldc -37
    //   595: invokespecial 95	java/lang/String:<init>	(Ljava/lang/String;)V
    //   598: astore 11
    //   600: goto -204 -> 396
    //   603: astore 10
    //   605: aconst_null
    //   606: astore 11
    //   608: goto -164 -> 444
    //   611: aload 10
    //   613: invokevirtual 276	java/net/URLConnection:getContentLength	()I
    //   616: istore 4
    //   618: iload 4
    //   620: ifge +74 -> 694
    //   623: aload_1
    //   624: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   627: astore 10
    //   629: aload 10
    //   631: invokevirtual 88	java/lang/String:length	()I
    //   634: ifeq +45 -> 679
    //   637: ldc_w 278
    //   640: aload 10
    //   642: invokevirtual 94	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   645: astore 10
    //   647: aload 10
    //   649: invokestatic 58	com/google/android/gms/internal/abr:d	(Ljava/lang/String;)V
    //   652: aload_0
    //   653: aload_1
    //   654: aload 17
    //   656: invokevirtual 78	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   659: ldc_w 280
    //   662: aconst_null
    //   663: invokevirtual 142	com/google/android/gms/internal/wl:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   666: getstatic 29	com/google/android/gms/internal/wl:d	Ljava/util/Set;
    //   669: aload 16
    //   671: invokeinterface 271 2 0
    //   676: pop
    //   677: iconst_0
    //   678: ireturn
    //   679: new 80	java/lang/String
    //   682: dup
    //   683: ldc_w 278
    //   686: invokespecial 95	java/lang/String:<init>	(Ljava/lang/String;)V
    //   689: astore 10
    //   691: goto -44 -> 647
    //   694: getstatic 38	com/google/android/gms/internal/wl:e	Ljava/text/DecimalFormat;
    //   697: iload 4
    //   699: i2l
    //   700: invokevirtual 284	java/text/DecimalFormat:format	(J)Ljava/lang/String;
    //   703: astore 12
    //   705: getstatic 287	com/google/android/gms/internal/uf:s	Lcom/google/android/gms/internal/ub;
    //   708: invokevirtual 156	com/google/android/gms/internal/ub:c	()Ljava/lang/Object;
    //   711: checkcast 158	java/lang/Integer
    //   714: invokevirtual 161	java/lang/Integer:intValue	()I
    //   717: istore 5
    //   719: iload 4
    //   721: iload 5
    //   723: if_icmple +124 -> 847
    //   726: new 221	java/lang/StringBuilder
    //   729: dup
    //   730: aload 12
    //   732: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   735: invokevirtual 88	java/lang/String:length	()I
    //   738: bipush 33
    //   740: iadd
    //   741: aload_1
    //   742: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   745: invokevirtual 88	java/lang/String:length	()I
    //   748: iadd
    //   749: invokespecial 224	java/lang/StringBuilder:<init>	(I)V
    //   752: ldc_w 289
    //   755: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   758: aload 12
    //   760: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   763: ldc_w 291
    //   766: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   769: aload_1
    //   770: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   773: invokevirtual 237	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   776: invokestatic 58	com/google/android/gms/internal/abr:d	(Ljava/lang/String;)V
    //   779: aload 12
    //   781: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   784: astore 10
    //   786: aload 10
    //   788: invokevirtual 88	java/lang/String:length	()I
    //   791: ifeq +41 -> 832
    //   794: ldc_w 293
    //   797: aload 10
    //   799: invokevirtual 94	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   802: astore 10
    //   804: aload_0
    //   805: aload_1
    //   806: aload 17
    //   808: invokevirtual 78	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   811: ldc_w 295
    //   814: aload 10
    //   816: invokevirtual 142	com/google/android/gms/internal/wl:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   819: getstatic 29	com/google/android/gms/internal/wl:d	Ljava/util/Set;
    //   822: aload 16
    //   824: invokeinterface 271 2 0
    //   829: pop
    //   830: iconst_0
    //   831: ireturn
    //   832: new 80	java/lang/String
    //   835: dup
    //   836: ldc_w 293
    //   839: invokespecial 95	java/lang/String:<init>	(Ljava/lang/String;)V
    //   842: astore 10
    //   844: goto -40 -> 804
    //   847: new 221	java/lang/StringBuilder
    //   850: dup
    //   851: aload 12
    //   853: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   856: invokevirtual 88	java/lang/String:length	()I
    //   859: bipush 20
    //   861: iadd
    //   862: aload_1
    //   863: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   866: invokevirtual 88	java/lang/String:length	()I
    //   869: iadd
    //   870: invokespecial 224	java/lang/StringBuilder:<init>	(I)V
    //   873: ldc_w 297
    //   876: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   879: aload 12
    //   881: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   884: ldc_w 299
    //   887: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   890: aload_1
    //   891: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   894: invokevirtual 237	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   897: invokestatic 177	com/google/android/gms/internal/abr:a	(Ljava/lang/String;)V
    //   900: aload 10
    //   902: invokevirtual 303	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   905: invokestatic 309	java/nio/channels/Channels:newChannel	(Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;
    //   908: astore 12
    //   910: new 251	java/io/FileOutputStream
    //   913: dup
    //   914: aload 17
    //   916: invokespecial 311	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   919: astore 10
    //   921: aload 10
    //   923: invokevirtual 315	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   926: astore 13
    //   928: ldc_w 316
    //   931: invokestatic 322	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   934: astore 14
    //   936: invokestatic 326	com/google/android/gms/ads/internal/u:k	()Lcom/google/android/gms/common/util/e;
    //   939: astore 15
    //   941: iconst_0
    //   942: istore_2
    //   943: aload 15
    //   945: invokeinterface 330 1 0
    //   950: lstore 6
    //   952: new 332	com/google/android/gms/internal/ach
    //   955: dup
    //   956: getstatic 335	com/google/android/gms/internal/uf:w	Lcom/google/android/gms/internal/ub;
    //   959: invokevirtual 156	com/google/android/gms/internal/ub:c	()Ljava/lang/Object;
    //   962: checkcast 337	java/lang/Long
    //   965: invokevirtual 340	java/lang/Long:longValue	()J
    //   968: invokespecial 343	com/google/android/gms/internal/ach:<init>	(J)V
    //   971: astore 18
    //   973: getstatic 346	com/google/android/gms/internal/uf:v	Lcom/google/android/gms/internal/ub;
    //   976: invokevirtual 156	com/google/android/gms/internal/ub:c	()Ljava/lang/Object;
    //   979: checkcast 337	java/lang/Long
    //   982: invokevirtual 340	java/lang/Long:longValue	()J
    //   985: lstore 8
    //   987: aload 12
    //   989: aload 14
    //   991: invokeinterface 352 2 0
    //   996: istore_3
    //   997: iload_3
    //   998: iflt +405 -> 1403
    //   1001: iload_2
    //   1002: iload_3
    //   1003: iadd
    //   1004: istore_3
    //   1005: iload_3
    //   1006: iload 5
    //   1008: if_icmple +154 -> 1162
    //   1011: ldc_w 295
    //   1014: astore 11
    //   1016: aload 11
    //   1018: astore 12
    //   1020: aload 11
    //   1022: astore 13
    //   1024: iload_3
    //   1025: invokestatic 217	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   1028: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1031: astore 14
    //   1033: aload 11
    //   1035: astore 12
    //   1037: aload 11
    //   1039: astore 13
    //   1041: aload 14
    //   1043: invokevirtual 88	java/lang/String:length	()I
    //   1046: ifeq +73 -> 1119
    //   1049: aload 11
    //   1051: astore 12
    //   1053: aload 11
    //   1055: astore 13
    //   1057: ldc_w 293
    //   1060: aload 14
    //   1062: invokevirtual 94	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1065: astore 14
    //   1067: aload 14
    //   1069: astore 12
    //   1071: aload 12
    //   1073: astore 14
    //   1075: aload 11
    //   1077: astore 13
    //   1079: aload 11
    //   1081: astore 15
    //   1083: new 114	java/io/IOException
    //   1086: dup
    //   1087: ldc_w 354
    //   1090: invokespecial 238	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   1093: athrow
    //   1094: astore 11
    //   1096: aload 10
    //   1098: astore 15
    //   1100: aload 11
    //   1102: astore 10
    //   1104: aload 14
    //   1106: astore 11
    //   1108: aload 13
    //   1110: astore 12
    //   1112: aload 15
    //   1114: astore 13
    //   1116: goto -672 -> 444
    //   1119: aload 11
    //   1121: astore 12
    //   1123: aload 11
    //   1125: astore 13
    //   1127: new 80	java/lang/String
    //   1130: dup
    //   1131: ldc_w 293
    //   1134: invokespecial 95	java/lang/String:<init>	(Ljava/lang/String;)V
    //   1137: astore 14
    //   1139: aload 14
    //   1141: astore 12
    //   1143: goto -72 -> 1071
    //   1146: astore 14
    //   1148: aconst_null
    //   1149: astore 11
    //   1151: aload 10
    //   1153: astore 13
    //   1155: aload 14
    //   1157: astore 10
    //   1159: goto -715 -> 444
    //   1162: aload 14
    //   1164: invokevirtual 358	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   1167: pop
    //   1168: aload 13
    //   1170: aload 14
    //   1172: invokevirtual 363	java/nio/channels/FileChannel:write	(Ljava/nio/ByteBuffer;)I
    //   1175: ifgt -7 -> 1168
    //   1178: aload 14
    //   1180: invokevirtual 366	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   1183: pop
    //   1184: aload 15
    //   1186: invokeinterface 330 1 0
    //   1191: lload 6
    //   1193: lsub
    //   1194: ldc2_w 367
    //   1197: lload 8
    //   1199: lmul
    //   1200: lcmp
    //   1201: ifle +122 -> 1323
    //   1204: ldc_w 370
    //   1207: astore 11
    //   1209: aload 11
    //   1211: astore 12
    //   1213: aload 11
    //   1215: astore 13
    //   1217: lload 8
    //   1219: invokestatic 372	java/lang/Long:toString	(J)Ljava/lang/String;
    //   1222: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1225: astore 14
    //   1227: aload 11
    //   1229: astore 12
    //   1231: aload 11
    //   1233: astore 13
    //   1235: new 221	java/lang/StringBuilder
    //   1238: dup
    //   1239: aload 14
    //   1241: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1244: invokevirtual 88	java/lang/String:length	()I
    //   1247: bipush 29
    //   1249: iadd
    //   1250: invokespecial 224	java/lang/StringBuilder:<init>	(I)V
    //   1253: ldc_w 374
    //   1256: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1259: aload 14
    //   1261: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1264: ldc_w 376
    //   1267: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1270: invokevirtual 237	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1273: astore 14
    //   1275: aload 14
    //   1277: astore 12
    //   1279: aload 12
    //   1281: astore 14
    //   1283: aload 11
    //   1285: astore 13
    //   1287: aload 11
    //   1289: astore 15
    //   1291: new 114	java/io/IOException
    //   1294: dup
    //   1295: ldc_w 378
    //   1298: invokespecial 238	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   1301: athrow
    //   1302: astore 11
    //   1304: aload 10
    //   1306: astore 13
    //   1308: aload 11
    //   1310: astore 10
    //   1312: aload 12
    //   1314: astore 11
    //   1316: aload 15
    //   1318: astore 12
    //   1320: goto -876 -> 444
    //   1323: aload_0
    //   1324: getfield 132	com/google/android/gms/internal/wl:g	Z
    //   1327: ifeq +47 -> 1374
    //   1330: ldc_w 380
    //   1333: astore 13
    //   1335: aload 13
    //   1337: astore 12
    //   1339: new 114	java/io/IOException
    //   1342: dup
    //   1343: ldc_w 382
    //   1346: invokespecial 238	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   1349: athrow
    //   1350: astore 12
    //   1352: aconst_null
    //   1353: astore 11
    //   1355: aload 10
    //   1357: astore 14
    //   1359: aload 12
    //   1361: astore 10
    //   1363: aload 13
    //   1365: astore 12
    //   1367: aload 14
    //   1369: astore 13
    //   1371: goto -927 -> 444
    //   1374: iload_3
    //   1375: istore_2
    //   1376: aload 18
    //   1378: invokevirtual 384	com/google/android/gms/internal/ach:a	()Z
    //   1381: ifeq -394 -> 987
    //   1384: aload_0
    //   1385: aload_1
    //   1386: aload 17
    //   1388: invokevirtual 78	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1391: iload_3
    //   1392: iload 4
    //   1394: iconst_0
    //   1395: invokevirtual 387	com/google/android/gms/internal/wl:a	(Ljava/lang/String;Ljava/lang/String;IIZ)V
    //   1398: iload_3
    //   1399: istore_2
    //   1400: goto -413 -> 987
    //   1403: aload 10
    //   1405: invokevirtual 254	java/io/FileOutputStream:close	()V
    //   1408: iconst_3
    //   1409: invokestatic 390	com/google/android/gms/internal/abr:a	(I)Z
    //   1412: ifeq +66 -> 1478
    //   1415: getstatic 38	com/google/android/gms/internal/wl:e	Ljava/text/DecimalFormat;
    //   1418: iload_2
    //   1419: i2l
    //   1420: invokevirtual 284	java/text/DecimalFormat:format	(J)Ljava/lang/String;
    //   1423: astore 12
    //   1425: new 221	java/lang/StringBuilder
    //   1428: dup
    //   1429: aload 12
    //   1431: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1434: invokevirtual 88	java/lang/String:length	()I
    //   1437: bipush 22
    //   1439: iadd
    //   1440: aload_1
    //   1441: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1444: invokevirtual 88	java/lang/String:length	()I
    //   1447: iadd
    //   1448: invokespecial 224	java/lang/StringBuilder:<init>	(I)V
    //   1451: ldc_w 392
    //   1454: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1457: aload 12
    //   1459: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1462: ldc_w 299
    //   1465: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1468: aload_1
    //   1469: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1472: invokevirtual 237	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1475: invokestatic 177	com/google/android/gms/internal/abr:a	(Ljava/lang/String;)V
    //   1478: aload 17
    //   1480: iconst_1
    //   1481: iconst_0
    //   1482: invokevirtual 99	java/io/File:setReadable	(ZZ)Z
    //   1485: pop
    //   1486: aload 11
    //   1488: invokestatic 394	com/google/android/gms/internal/wl:b	(Ljava/io/File;)V
    //   1491: aload_0
    //   1492: aload_1
    //   1493: aload 17
    //   1495: invokevirtual 78	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1498: iload_2
    //   1499: invokevirtual 180	com/google/android/gms/internal/wl:a	(Ljava/lang/String;Ljava/lang/String;I)V
    //   1502: getstatic 29	com/google/android/gms/internal/wl:d	Ljava/util/Set;
    //   1505: aload 16
    //   1507: invokeinterface 271 2 0
    //   1512: pop
    //   1513: iconst_1
    //   1514: ireturn
    //   1515: new 221	java/lang/StringBuilder
    //   1518: dup
    //   1519: aload_1
    //   1520: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1523: invokevirtual 88	java/lang/String:length	()I
    //   1526: bipush 25
    //   1528: iadd
    //   1529: invokespecial 224	java/lang/StringBuilder:<init>	(I)V
    //   1532: ldc_w 396
    //   1535: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1538: aload_1
    //   1539: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1542: ldc_w 258
    //   1545: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1548: invokevirtual 237	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1551: aload 10
    //   1553: invokestatic 399	com/google/android/gms/internal/abr:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1556: goto -1043 -> 513
    //   1559: new 80	java/lang/String
    //   1562: dup
    //   1563: ldc_w 268
    //   1566: invokespecial 95	java/lang/String:<init>	(Ljava/lang/String;)V
    //   1569: astore 10
    //   1571: goto -1014 -> 557
    //   1574: astore 13
    //   1576: goto -1109 -> 467
    //   1579: astore 13
    //   1581: goto -1114 -> 467
    //   1584: astore 10
    //   1586: aconst_null
    //   1587: astore 11
    //   1589: goto -1145 -> 444
    //   1592: astore 10
    //   1594: goto -1150 -> 444
    //   1597: astore 14
    //   1599: aconst_null
    //   1600: astore 11
    //   1602: ldc_w 401
    //   1605: astore 12
    //   1607: aload 10
    //   1609: astore 13
    //   1611: aload 14
    //   1613: astore 10
    //   1615: goto -1171 -> 444
    //   1618: astore 10
    //   1620: aconst_null
    //   1621: astore 11
    //   1623: ldc_w 401
    //   1626: astore 12
    //   1628: goto -1184 -> 444
    //   1631: astore 10
    //   1633: aconst_null
    //   1634: astore 11
    //   1636: ldc_w 401
    //   1639: astore 12
    //   1641: goto -1197 -> 444
    //   1644: astore 14
    //   1646: aconst_null
    //   1647: astore 11
    //   1649: ldc_w 401
    //   1652: astore 12
    //   1654: aload 10
    //   1656: astore 13
    //   1658: aload 14
    //   1660: astore 10
    //   1662: goto -1218 -> 444
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1665	0	this	wl
    //   0	1665	1	paramString	String
    //   112	1387	2	i	int
    //   996	403	3	j	int
    //   616	777	4	k	int
    //   717	292	5	m	int
    //   950	242	6	l1	long
    //   985	233	8	l2	long
    //   65	325	10	localObject1	Object
    //   442	14	10	localIOException1	IOException
    //   537	21	10	str1	String
    //   603	9	10	localIOException2	IOException
    //   627	943	10	localObject2	Object
    //   1584	1	10	localRuntimeException1	RuntimeException
    //   1592	16	10	localRuntimeException2	RuntimeException
    //   1613	1	10	localObject3	Object
    //   1618	1	10	localIOException3	IOException
    //   1631	24	10	localRuntimeException3	RuntimeException
    //   1660	1	10	localObject4	Object
    //   88	992	11	localObject5	Object
    //   1094	7	11	localIOException4	IOException
    //   1106	182	11	localObject6	Object
    //   1302	7	11	localRuntimeException4	RuntimeException
    //   1314	334	11	localObject7	Object
    //   184	1154	12	localObject8	Object
    //   1350	10	12	localRuntimeException5	RuntimeException
    //   1365	288	12	localObject9	Object
    //   319	1051	13	localObject10	Object
    //   1574	1	13	localIOException5	IOException
    //   1579	1	13	localNullPointerException	NullPointerException
    //   1609	48	13	localRuntimeException6	RuntimeException
    //   934	206	14	localObject11	Object
    //   1146	33	14	localIOException6	IOException
    //   1225	143	14	localObject12	Object
    //   1597	15	14	localRuntimeException7	RuntimeException
    //   1644	15	14	localIOException7	IOException
    //   939	378	15	localObject13	Object
    //   201	1305	16	str2	String
    //   80	1414	17	localFile	File
    //   971	406	18	localach	ach
    // Exception table:
    //   from	to	target	type
    //   211	247	270	finally
    //   247	268	270	finally
    //   271	274	270	finally
    //   290	301	270	finally
    //   304	318	270	finally
    //   396	442	442	java/io/IOException
    //   370	396	603	java/io/IOException
    //   589	600	603	java/io/IOException
    //   1083	1094	1094	java/io/IOException
    //   1291	1302	1094	java/io/IOException
    //   1024	1033	1146	java/io/IOException
    //   1041	1049	1146	java/io/IOException
    //   1057	1067	1146	java/io/IOException
    //   1127	1139	1146	java/io/IOException
    //   1217	1227	1146	java/io/IOException
    //   1235	1275	1146	java/io/IOException
    //   1339	1350	1146	java/io/IOException
    //   1083	1094	1302	java/lang/RuntimeException
    //   1291	1302	1302	java/lang/RuntimeException
    //   1024	1033	1350	java/lang/RuntimeException
    //   1041	1049	1350	java/lang/RuntimeException
    //   1057	1067	1350	java/lang/RuntimeException
    //   1127	1139	1350	java/lang/RuntimeException
    //   1217	1227	1350	java/lang/RuntimeException
    //   1235	1275	1350	java/lang/RuntimeException
    //   1339	1350	1350	java/lang/RuntimeException
    //   462	467	1574	java/io/IOException
    //   462	467	1579	java/lang/NullPointerException
    //   370	396	1584	java/lang/RuntimeException
    //   589	600	1584	java/lang/RuntimeException
    //   396	442	1592	java/lang/RuntimeException
    //   921	941	1597	java/lang/RuntimeException
    //   943	987	1597	java/lang/RuntimeException
    //   987	997	1597	java/lang/RuntimeException
    //   1162	1168	1597	java/lang/RuntimeException
    //   1168	1204	1597	java/lang/RuntimeException
    //   1323	1330	1597	java/lang/RuntimeException
    //   1376	1398	1597	java/lang/RuntimeException
    //   1403	1478	1597	java/lang/RuntimeException
    //   1478	1513	1597	java/lang/RuntimeException
    //   321	359	1618	java/io/IOException
    //   611	618	1618	java/io/IOException
    //   623	647	1618	java/io/IOException
    //   647	677	1618	java/io/IOException
    //   679	691	1618	java/io/IOException
    //   694	719	1618	java/io/IOException
    //   726	804	1618	java/io/IOException
    //   804	830	1618	java/io/IOException
    //   832	844	1618	java/io/IOException
    //   847	921	1618	java/io/IOException
    //   321	359	1631	java/lang/RuntimeException
    //   611	618	1631	java/lang/RuntimeException
    //   623	647	1631	java/lang/RuntimeException
    //   647	677	1631	java/lang/RuntimeException
    //   679	691	1631	java/lang/RuntimeException
    //   694	719	1631	java/lang/RuntimeException
    //   726	804	1631	java/lang/RuntimeException
    //   804	830	1631	java/lang/RuntimeException
    //   832	844	1631	java/lang/RuntimeException
    //   847	921	1631	java/lang/RuntimeException
    //   921	941	1644	java/io/IOException
    //   943	987	1644	java/io/IOException
    //   987	997	1644	java/io/IOException
    //   1162	1168	1644	java/io/IOException
    //   1168	1204	1644	java/io/IOException
    //   1323	1330	1644	java/io/IOException
    //   1376	1398	1644	java/io/IOException
    //   1403	1478	1644	java/io/IOException
    //   1478	1513	1644	java/io/IOException
  }
  
  public int c()
  {
    int i = 0;
    int k = 0;
    if (this.f == null) {
      return k;
    }
    File[] arrayOfFile = this.f.listFiles();
    int m = arrayOfFile.length;
    int j = 0;
    for (;;)
    {
      k = i;
      if (j >= m) {
        break;
      }
      k = i;
      if (!arrayOfFile[j].getName().endsWith(".done")) {
        k = i + 1;
      }
      j += 1;
      i = k;
    }
  }
  
  public boolean d()
  {
    if (this.f == null) {
      return false;
    }
    Object localObject = null;
    long l1 = Long.MAX_VALUE;
    File[] arrayOfFile = this.f.listFiles();
    int j = arrayOfFile.length;
    int i = 0;
    if (i < j)
    {
      File localFile = arrayOfFile[i];
      if (localFile.getName().endsWith(".done")) {
        break label134;
      }
      long l2 = localFile.lastModified();
      if (l2 >= l1) {
        break label134;
      }
      localObject = localFile;
      l1 = l2;
    }
    label134:
    for (;;)
    {
      i += 1;
      break;
      boolean bool2;
      if (localObject != null)
      {
        bool2 = ((File)localObject).delete();
        localObject = a((File)localObject);
        bool1 = bool2;
        if (!((File)localObject).isFile()) {}
      }
      for (boolean bool1 = bool2 & ((File)localObject).delete();; bool1 = false) {
        return bool1;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/wl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */