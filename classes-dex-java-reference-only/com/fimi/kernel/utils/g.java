package com.fimi.kernel.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

public class g
{
  private static String a = null;
  private static String b = null;
  private static String c = null;
  private static String d = null;
  private static String e = null;
  private static int f = 209715200;
  
  public static Bitmap a(Context paramContext, String paramString)
  {
    try
    {
      paramContext = BitmapFactory.decodeStream(paramContext.getAssets().open(paramString));
      return paramContext;
    }
    catch (Exception paramContext)
    {
      k.a(g.class, "获取图片异常：" + paramContext.getMessage());
    }
    return null;
  }
  
  public static Bitmap a(File paramFile)
  {
    try
    {
      if (!a()) {
        return null;
      }
      if (paramFile.exists())
      {
        paramFile = s.a(paramFile);
        return paramFile;
      }
    }
    catch (Exception paramFile)
    {
      paramFile.printStackTrace();
    }
    return null;
  }
  
  public static Bitmap a(File paramFile, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      if (!a()) {
        return null;
      }
      if (paramFile.exists())
      {
        if (paramInt1 == 0) {
          return s.b(paramFile, paramInt2, paramInt3);
        }
        if (paramInt1 == 1) {
          return s.a(paramFile, paramInt2, paramInt3);
        }
        paramFile = s.a(paramFile);
        return paramFile;
      }
    }
    catch (Exception paramFile)
    {
      paramFile.printStackTrace();
    }
    return null;
  }
  
  public static Bitmap a(String paramString)
  {
    try
    {
      paramString = BitmapFactory.decodeStream(g.class.getResourceAsStream(paramString));
      return paramString;
    }
    catch (Exception paramString)
    {
      k.a(g.class, "获取图片异常：" + paramString.getMessage());
    }
    return null;
  }
  
  public static Bitmap a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      if (n.b(paramString)) {
        return null;
      }
      if ((!a()) || (f < b())) {
        return b(paramString, paramInt1, paramInt2, paramInt3);
      }
      paramString = a(paramString, b);
      if (paramString != null)
      {
        paramString = a(new File(paramString), paramInt1, paramInt2, paramInt3);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  /* Error */
  public static Bitmap a(byte[] paramArrayOfByte, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 12
    //   3: aconst_null
    //   4: astore 6
    //   6: aload_0
    //   7: ifnull +437 -> 444
    //   10: new 81	java/io/File
    //   13: dup
    //   14: new 56	java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   21: getstatic 20	com/fimi/kernel/utils/g:b	Ljava/lang/String;
    //   24: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: aload_1
    //   28: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   34: invokespecial 120	java/io/File:<init>	(Ljava/lang/String;)V
    //   37: astore 6
    //   39: aload 6
    //   41: invokevirtual 84	java/io/File:exists	()Z
    //   44: ifne +9 -> 53
    //   47: aload 6
    //   49: invokevirtual 126	java/io/File:createNewFile	()Z
    //   52: pop
    //   53: new 128	java/io/FileOutputStream
    //   56: dup
    //   57: aload 6
    //   59: invokespecial 131	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   62: astore_1
    //   63: new 133	java/io/ByteArrayInputStream
    //   66: dup
    //   67: aload_0
    //   68: invokespecial 136	java/io/ByteArrayInputStream:<init>	([B)V
    //   71: astore_0
    //   72: new 138	java/io/DataInputStream
    //   75: dup
    //   76: aload_0
    //   77: invokespecial 141	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   80: astore 10
    //   82: aload_0
    //   83: astore 11
    //   85: aload 10
    //   87: astore 9
    //   89: aload_1
    //   90: astore 8
    //   92: sipush 1024
    //   95: newarray <illegal type>
    //   97: astore 7
    //   99: aload_0
    //   100: astore 11
    //   102: aload 10
    //   104: astore 9
    //   106: aload_1
    //   107: astore 8
    //   109: aload 10
    //   111: aload 7
    //   113: invokevirtual 145	java/io/DataInputStream:read	([B)I
    //   116: istore 5
    //   118: iload 5
    //   120: iconst_m1
    //   121: if_icmpeq +46 -> 167
    //   124: aload_0
    //   125: astore 11
    //   127: aload 10
    //   129: astore 9
    //   131: aload_1
    //   132: astore 8
    //   134: aload_1
    //   135: aload 7
    //   137: iconst_0
    //   138: iload 5
    //   140: invokevirtual 149	java/io/FileOutputStream:write	([BII)V
    //   143: aload_0
    //   144: astore 11
    //   146: aload 10
    //   148: astore 9
    //   150: aload_1
    //   151: astore 8
    //   153: ldc2_w 150
    //   156: invokestatic 157	java/lang/Thread:sleep	(J)V
    //   159: goto -60 -> 99
    //   162: astore 8
    //   164: goto -65 -> 99
    //   167: aload_0
    //   168: astore 11
    //   170: aload 10
    //   172: astore 9
    //   174: aload_1
    //   175: astore 8
    //   177: aload_1
    //   178: invokevirtual 160	java/io/FileOutputStream:flush	()V
    //   181: aload_0
    //   182: astore 11
    //   184: aload 10
    //   186: astore 9
    //   188: aload_1
    //   189: astore 8
    //   191: aload 6
    //   193: iload_2
    //   194: iload_3
    //   195: iload 4
    //   197: invokestatic 122	com/fimi/kernel/utils/g:a	(Ljava/io/File;III)Landroid/graphics/Bitmap;
    //   200: astore 7
    //   202: aload_0
    //   203: astore 6
    //   205: aload 7
    //   207: astore_0
    //   208: aload 10
    //   210: ifnull +8 -> 218
    //   213: aload 10
    //   215: invokevirtual 163	java/io/DataInputStream:close	()V
    //   218: aload 6
    //   220: ifnull +8 -> 228
    //   223: aload 6
    //   225: invokevirtual 164	java/io/ByteArrayInputStream:close	()V
    //   228: aload_0
    //   229: astore 6
    //   231: aload_1
    //   232: ifnull +10 -> 242
    //   235: aload_1
    //   236: invokevirtual 165	java/io/FileOutputStream:close	()V
    //   239: aload_0
    //   240: astore 6
    //   242: aload 6
    //   244: areturn
    //   245: astore 6
    //   247: aconst_null
    //   248: astore 7
    //   250: aconst_null
    //   251: astore_0
    //   252: aconst_null
    //   253: astore_1
    //   254: aload 7
    //   256: astore 11
    //   258: aload_0
    //   259: astore 9
    //   261: aload_1
    //   262: astore 8
    //   264: aload 6
    //   266: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   269: aload_0
    //   270: ifnull +7 -> 277
    //   273: aload_0
    //   274: invokevirtual 163	java/io/DataInputStream:close	()V
    //   277: aload 7
    //   279: ifnull +8 -> 287
    //   282: aload 7
    //   284: invokevirtual 164	java/io/ByteArrayInputStream:close	()V
    //   287: aload 12
    //   289: astore 6
    //   291: aload_1
    //   292: ifnull -50 -> 242
    //   295: aload_1
    //   296: invokevirtual 165	java/io/FileOutputStream:close	()V
    //   299: aconst_null
    //   300: areturn
    //   301: astore_0
    //   302: aconst_null
    //   303: areturn
    //   304: astore 6
    //   306: aconst_null
    //   307: astore_0
    //   308: aconst_null
    //   309: astore 7
    //   311: aconst_null
    //   312: astore_1
    //   313: aload 7
    //   315: ifnull +8 -> 323
    //   318: aload 7
    //   320: invokevirtual 163	java/io/DataInputStream:close	()V
    //   323: aload_0
    //   324: ifnull +7 -> 331
    //   327: aload_0
    //   328: invokevirtual 164	java/io/ByteArrayInputStream:close	()V
    //   331: aload_1
    //   332: ifnull +7 -> 339
    //   335: aload_1
    //   336: invokevirtual 165	java/io/FileOutputStream:close	()V
    //   339: aload 6
    //   341: athrow
    //   342: astore 7
    //   344: goto -126 -> 218
    //   347: astore 6
    //   349: goto -121 -> 228
    //   352: astore_1
    //   353: aload_0
    //   354: areturn
    //   355: astore_0
    //   356: goto -79 -> 277
    //   359: astore_0
    //   360: goto -73 -> 287
    //   363: astore 7
    //   365: goto -42 -> 323
    //   368: astore_0
    //   369: goto -38 -> 331
    //   372: astore_0
    //   373: goto -34 -> 339
    //   376: astore 6
    //   378: aconst_null
    //   379: astore_0
    //   380: aconst_null
    //   381: astore 7
    //   383: goto -70 -> 313
    //   386: astore 6
    //   388: aconst_null
    //   389: astore 7
    //   391: goto -78 -> 313
    //   394: astore 6
    //   396: aload 11
    //   398: astore_0
    //   399: aload 9
    //   401: astore 7
    //   403: aload 8
    //   405: astore_1
    //   406: goto -93 -> 313
    //   409: astore 6
    //   411: aconst_null
    //   412: astore 7
    //   414: aconst_null
    //   415: astore_0
    //   416: goto -162 -> 254
    //   419: astore 6
    //   421: aconst_null
    //   422: astore 8
    //   424: aload_0
    //   425: astore 7
    //   427: aload 8
    //   429: astore_0
    //   430: goto -176 -> 254
    //   433: astore 6
    //   435: aload_0
    //   436: astore 7
    //   438: aload 10
    //   440: astore_0
    //   441: goto -187 -> 254
    //   444: aconst_null
    //   445: astore 7
    //   447: aconst_null
    //   448: astore 10
    //   450: aconst_null
    //   451: astore_1
    //   452: aload 6
    //   454: astore_0
    //   455: aload 7
    //   457: astore 6
    //   459: goto -251 -> 208
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	462	0	paramArrayOfByte	byte[]
    //   0	462	1	paramString	String
    //   0	462	2	paramInt1	int
    //   0	462	3	paramInt2	int
    //   0	462	4	paramInt3	int
    //   116	23	5	i	int
    //   4	239	6	localObject1	Object
    //   245	20	6	localException1	Exception
    //   289	1	6	localObject2	Object
    //   304	36	6	localObject3	Object
    //   347	1	6	localException2	Exception
    //   376	1	6	localObject4	Object
    //   386	1	6	localObject5	Object
    //   394	1	6	localObject6	Object
    //   409	1	6	localException3	Exception
    //   419	1	6	localException4	Exception
    //   433	20	6	localException5	Exception
    //   457	1	6	localObject7	Object
    //   97	222	7	localObject8	Object
    //   342	1	7	localException6	Exception
    //   363	1	7	localException7	Exception
    //   381	75	7	localObject9	Object
    //   90	62	8	str1	String
    //   162	1	8	localException8	Exception
    //   175	253	8	str2	String
    //   87	313	9	localObject10	Object
    //   80	369	10	localDataInputStream	java.io.DataInputStream
    //   83	314	11	localObject11	Object
    //   1	287	12	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   153	159	162	java/lang/Exception
    //   10	53	245	java/lang/Exception
    //   53	63	245	java/lang/Exception
    //   295	299	301	java/lang/Exception
    //   10	53	304	finally
    //   53	63	304	finally
    //   213	218	342	java/lang/Exception
    //   223	228	347	java/lang/Exception
    //   235	239	352	java/lang/Exception
    //   273	277	355	java/lang/Exception
    //   282	287	359	java/lang/Exception
    //   318	323	363	java/lang/Exception
    //   327	331	368	java/lang/Exception
    //   335	339	372	java/lang/Exception
    //   63	72	376	finally
    //   72	82	386	finally
    //   92	99	394	finally
    //   109	118	394	finally
    //   134	143	394	finally
    //   153	159	394	finally
    //   177	181	394	finally
    //   191	202	394	finally
    //   264	269	394	finally
    //   63	72	409	java/lang/Exception
    //   72	82	419	java/lang/Exception
    //   92	99	433	java/lang/Exception
    //   109	118	433	java/lang/Exception
    //   134	143	433	java/lang/Exception
    //   177	181	433	java/lang/Exception
    //   191	202	433	java/lang/Exception
  }
  
  /* Error */
  public static String a(Context paramContext, int paramInt, String paramString)
  {
    // Byte code:
    //   0: new 168	java/io/InputStreamReader
    //   3: dup
    //   4: aload_0
    //   5: invokevirtual 172	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   8: iload_1
    //   9: invokevirtual 178	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   12: invokespecial 179	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   15: astore_3
    //   16: new 181	java/io/BufferedReader
    //   19: dup
    //   20: aload_3
    //   21: invokespecial 184	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   24: astore_0
    //   25: aload_0
    //   26: astore 5
    //   28: aload_3
    //   29: astore 4
    //   31: new 186	java/lang/StringBuffer
    //   34: dup
    //   35: invokespecial 187	java/lang/StringBuffer:<init>	()V
    //   38: astore 6
    //   40: aload_0
    //   41: astore 5
    //   43: aload_3
    //   44: astore 4
    //   46: aload_0
    //   47: invokevirtual 190	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   50: astore 7
    //   52: aload 7
    //   54: ifnull +51 -> 105
    //   57: aload_0
    //   58: astore 5
    //   60: aload_3
    //   61: astore 4
    //   63: aload 6
    //   65: aload 7
    //   67: invokevirtual 193	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   70: pop
    //   71: goto -31 -> 40
    //   74: astore_2
    //   75: aload_0
    //   76: astore 5
    //   78: aload_3
    //   79: astore 4
    //   81: aload_2
    //   82: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   85: aload_0
    //   86: ifnull +7 -> 93
    //   89: aload_0
    //   90: invokevirtual 194	java/io/BufferedReader:close	()V
    //   93: aload_3
    //   94: ifnull +7 -> 101
    //   97: aload_3
    //   98: invokevirtual 195	java/io/InputStreamReader:close	()V
    //   101: aconst_null
    //   102: astore_0
    //   103: aload_0
    //   104: areturn
    //   105: aload_0
    //   106: astore 5
    //   108: aload_3
    //   109: astore 4
    //   111: new 197	java/lang/String
    //   114: dup
    //   115: aload 6
    //   117: invokevirtual 198	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   120: invokevirtual 202	java/lang/String:getBytes	()[B
    //   123: aload_2
    //   124: invokespecial 205	java/lang/String:<init>	([BLjava/lang/String;)V
    //   127: astore_2
    //   128: aload_0
    //   129: ifnull +7 -> 136
    //   132: aload_0
    //   133: invokevirtual 194	java/io/BufferedReader:close	()V
    //   136: aload_2
    //   137: astore_0
    //   138: aload_3
    //   139: ifnull -36 -> 103
    //   142: aload_3
    //   143: invokevirtual 195	java/io/InputStreamReader:close	()V
    //   146: aload_2
    //   147: areturn
    //   148: astore_0
    //   149: aload_0
    //   150: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   153: aload_2
    //   154: areturn
    //   155: astore_0
    //   156: aload_0
    //   157: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   160: aconst_null
    //   161: areturn
    //   162: astore_0
    //   163: aconst_null
    //   164: astore 5
    //   166: aconst_null
    //   167: astore_3
    //   168: aload 5
    //   170: ifnull +8 -> 178
    //   173: aload 5
    //   175: invokevirtual 194	java/io/BufferedReader:close	()V
    //   178: aload_3
    //   179: ifnull +7 -> 186
    //   182: aload_3
    //   183: invokevirtual 195	java/io/InputStreamReader:close	()V
    //   186: aload_0
    //   187: athrow
    //   188: astore_2
    //   189: aload_2
    //   190: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   193: goto -7 -> 186
    //   196: astore_0
    //   197: aconst_null
    //   198: astore 5
    //   200: goto -32 -> 168
    //   203: astore_0
    //   204: aload 4
    //   206: astore_3
    //   207: goto -39 -> 168
    //   210: astore_2
    //   211: aconst_null
    //   212: astore_0
    //   213: aconst_null
    //   214: astore_3
    //   215: goto -140 -> 75
    //   218: astore_2
    //   219: aconst_null
    //   220: astore_0
    //   221: goto -146 -> 75
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	224	0	paramContext	Context
    //   0	224	1	paramInt	int
    //   0	224	2	paramString	String
    //   15	200	3	localObject1	Object
    //   29	176	4	localObject2	Object
    //   26	173	5	localContext	Context
    //   38	78	6	localStringBuffer	StringBuffer
    //   50	16	7	str	String
    // Exception table:
    //   from	to	target	type
    //   31	40	74	java/lang/Exception
    //   46	52	74	java/lang/Exception
    //   63	71	74	java/lang/Exception
    //   111	128	74	java/lang/Exception
    //   132	136	148	java/lang/Exception
    //   142	146	148	java/lang/Exception
    //   89	93	155	java/lang/Exception
    //   97	101	155	java/lang/Exception
    //   0	16	162	finally
    //   173	178	188	java/lang/Exception
    //   182	186	188	java/lang/Exception
    //   16	25	196	finally
    //   31	40	203	finally
    //   46	52	203	finally
    //   63	71	203	finally
    //   81	85	203	finally
    //   111	128	203	finally
    //   0	16	210	java/lang/Exception
    //   16	25	218	java/lang/Exception
  }
  
  /* Error */
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 168	java/io/InputStreamReader
    //   3: dup
    //   4: aload_0
    //   5: invokevirtual 42	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   8: aload_1
    //   9: invokevirtual 48	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   12: invokespecial 179	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   15: astore_1
    //   16: new 181	java/io/BufferedReader
    //   19: dup
    //   20: aload_1
    //   21: invokespecial 184	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   24: astore_0
    //   25: aload_0
    //   26: astore 4
    //   28: aload_1
    //   29: astore_3
    //   30: new 186	java/lang/StringBuffer
    //   33: dup
    //   34: invokespecial 187	java/lang/StringBuffer:<init>	()V
    //   37: astore 5
    //   39: aload_0
    //   40: astore 4
    //   42: aload_1
    //   43: astore_3
    //   44: aload_0
    //   45: invokevirtual 190	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   48: astore 6
    //   50: aload 6
    //   52: ifnull +49 -> 101
    //   55: aload_0
    //   56: astore 4
    //   58: aload_1
    //   59: astore_3
    //   60: aload 5
    //   62: aload 6
    //   64: invokevirtual 193	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   67: pop
    //   68: goto -29 -> 39
    //   71: astore_2
    //   72: aload_0
    //   73: astore 4
    //   75: aload_1
    //   76: astore_3
    //   77: aload_2
    //   78: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   81: aload_0
    //   82: ifnull +7 -> 89
    //   85: aload_0
    //   86: invokevirtual 194	java/io/BufferedReader:close	()V
    //   89: aload_1
    //   90: ifnull +7 -> 97
    //   93: aload_1
    //   94: invokevirtual 195	java/io/InputStreamReader:close	()V
    //   97: aconst_null
    //   98: astore_0
    //   99: aload_0
    //   100: areturn
    //   101: aload_0
    //   102: astore 4
    //   104: aload_1
    //   105: astore_3
    //   106: new 197	java/lang/String
    //   109: dup
    //   110: aload 5
    //   112: invokevirtual 198	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   115: invokevirtual 202	java/lang/String:getBytes	()[B
    //   118: aload_2
    //   119: invokespecial 205	java/lang/String:<init>	([BLjava/lang/String;)V
    //   122: astore_2
    //   123: aload_0
    //   124: ifnull +7 -> 131
    //   127: aload_0
    //   128: invokevirtual 194	java/io/BufferedReader:close	()V
    //   131: aload_2
    //   132: astore_0
    //   133: aload_1
    //   134: ifnull -35 -> 99
    //   137: aload_1
    //   138: invokevirtual 195	java/io/InputStreamReader:close	()V
    //   141: aload_2
    //   142: areturn
    //   143: astore_0
    //   144: aload_0
    //   145: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   148: aload_2
    //   149: areturn
    //   150: astore_0
    //   151: aload_0
    //   152: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   155: aconst_null
    //   156: areturn
    //   157: astore_0
    //   158: aconst_null
    //   159: astore 4
    //   161: aconst_null
    //   162: astore_1
    //   163: aload 4
    //   165: ifnull +8 -> 173
    //   168: aload 4
    //   170: invokevirtual 194	java/io/BufferedReader:close	()V
    //   173: aload_1
    //   174: ifnull +7 -> 181
    //   177: aload_1
    //   178: invokevirtual 195	java/io/InputStreamReader:close	()V
    //   181: aload_0
    //   182: athrow
    //   183: astore_1
    //   184: aload_1
    //   185: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   188: goto -7 -> 181
    //   191: astore_0
    //   192: aconst_null
    //   193: astore 4
    //   195: goto -32 -> 163
    //   198: astore_0
    //   199: aload_3
    //   200: astore_1
    //   201: goto -38 -> 163
    //   204: astore_2
    //   205: aconst_null
    //   206: astore_0
    //   207: aconst_null
    //   208: astore_1
    //   209: goto -137 -> 72
    //   212: astore_2
    //   213: aconst_null
    //   214: astore_0
    //   215: goto -143 -> 72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	218	0	paramContext	Context
    //   0	218	1	paramString1	String
    //   0	218	2	paramString2	String
    //   29	171	3	str1	String
    //   26	168	4	localContext	Context
    //   37	74	5	localStringBuffer	StringBuffer
    //   48	15	6	str2	String
    // Exception table:
    //   from	to	target	type
    //   30	39	71	java/lang/Exception
    //   44	50	71	java/lang/Exception
    //   60	68	71	java/lang/Exception
    //   106	123	71	java/lang/Exception
    //   127	131	143	java/lang/Exception
    //   137	141	143	java/lang/Exception
    //   85	89	150	java/lang/Exception
    //   93	97	150	java/lang/Exception
    //   0	16	157	finally
    //   168	173	183	java/lang/Exception
    //   177	181	183	java/lang/Exception
    //   16	25	191	finally
    //   30	39	198	finally
    //   44	50	198	finally
    //   60	68	198	finally
    //   77	81	198	finally
    //   106	123	198	finally
    //   0	16	204	java/lang/Exception
    //   16	25	212	java/lang/Exception
  }
  
  /* Error */
  public static String a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore 4
    //   5: invokestatic 79	com/fimi/kernel/utils/g:a	()Z
    //   8: istore_3
    //   9: iload_3
    //   10: ifne +64 -> 74
    //   13: iconst_0
    //   14: ifeq +11 -> 25
    //   17: new 208	java/lang/NullPointerException
    //   20: dup
    //   21: invokespecial 209	java/lang/NullPointerException:<init>	()V
    //   24: athrow
    //   25: iconst_0
    //   26: ifeq +11 -> 37
    //   29: new 208	java/lang/NullPointerException
    //   32: dup
    //   33: invokespecial 209	java/lang/NullPointerException:<init>	()V
    //   36: athrow
    //   37: iconst_0
    //   38: ifeq +11 -> 49
    //   41: new 208	java/lang/NullPointerException
    //   44: dup
    //   45: invokespecial 209	java/lang/NullPointerException:<init>	()V
    //   48: athrow
    //   49: aconst_null
    //   50: areturn
    //   51: astore_0
    //   52: aload_0
    //   53: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   56: goto -31 -> 25
    //   59: astore_0
    //   60: aload_0
    //   61: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   64: goto -27 -> 37
    //   67: astore_0
    //   68: aload_0
    //   69: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   72: aconst_null
    //   73: areturn
    //   74: aload_0
    //   75: invokestatic 212	com/fimi/kernel/utils/g:d	(Ljava/lang/String;)Ljava/lang/String;
    //   78: astore 5
    //   80: new 81	java/io/File
    //   83: dup
    //   84: getstatic 20	com/fimi/kernel/utils/g:b	Ljava/lang/String;
    //   87: invokespecial 120	java/io/File:<init>	(Ljava/lang/String;)V
    //   90: invokevirtual 216	java/io/File:listFiles	()[Ljava/io/File;
    //   93: astore_1
    //   94: iload_2
    //   95: aload_1
    //   96: arraylength
    //   97: if_icmpge +108 -> 205
    //   100: aload_1
    //   101: iload_2
    //   102: aaload
    //   103: invokevirtual 219	java/io/File:getName	()Ljava/lang/String;
    //   106: astore 6
    //   108: aload 6
    //   110: iconst_0
    //   111: aload 6
    //   113: ldc -35
    //   115: invokevirtual 225	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   118: invokevirtual 229	java/lang/String:substring	(II)Ljava/lang/String;
    //   121: aload 5
    //   123: invokevirtual 233	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   126: ifeq +72 -> 198
    //   129: aload_1
    //   130: iload_2
    //   131: aaload
    //   132: invokevirtual 236	java/io/File:getPath	()Ljava/lang/String;
    //   135: astore_0
    //   136: iconst_0
    //   137: ifeq +11 -> 148
    //   140: new 208	java/lang/NullPointerException
    //   143: dup
    //   144: invokespecial 209	java/lang/NullPointerException:<init>	()V
    //   147: athrow
    //   148: iconst_0
    //   149: ifeq +11 -> 160
    //   152: new 208	java/lang/NullPointerException
    //   155: dup
    //   156: invokespecial 209	java/lang/NullPointerException:<init>	()V
    //   159: athrow
    //   160: iconst_0
    //   161: ifeq +11 -> 172
    //   164: new 208	java/lang/NullPointerException
    //   167: dup
    //   168: invokespecial 209	java/lang/NullPointerException:<init>	()V
    //   171: athrow
    //   172: aload_0
    //   173: areturn
    //   174: astore_1
    //   175: aload_1
    //   176: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   179: goto -31 -> 148
    //   182: astore_1
    //   183: aload_1
    //   184: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   187: goto -27 -> 160
    //   190: astore_1
    //   191: aload_1
    //   192: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   195: goto -23 -> 172
    //   198: iload_2
    //   199: iconst_1
    //   200: iadd
    //   201: istore_2
    //   202: goto -108 -> 94
    //   205: new 238	java/net/URL
    //   208: dup
    //   209: aload_0
    //   210: invokespecial 239	java/net/URL:<init>	(Ljava/lang/String;)V
    //   213: invokevirtual 243	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   216: checkcast 245	java/net/HttpURLConnection
    //   219: astore_1
    //   220: aload_1
    //   221: invokevirtual 248	java/net/HttpURLConnection:connect	()V
    //   224: aload_0
    //   225: aload_1
    //   226: invokestatic 251	com/fimi/kernel/utils/g:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)Ljava/lang/String;
    //   229: astore_0
    //   230: new 81	java/io/File
    //   233: dup
    //   234: getstatic 20	com/fimi/kernel/utils/g:b	Ljava/lang/String;
    //   237: aload_0
    //   238: invokespecial 254	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   241: astore_0
    //   242: aload_0
    //   243: invokevirtual 236	java/io/File:getPath	()Ljava/lang/String;
    //   246: astore 4
    //   248: aload_0
    //   249: invokevirtual 84	java/io/File:exists	()Z
    //   252: ifne +128 -> 380
    //   255: aload_0
    //   256: invokevirtual 126	java/io/File:createNewFile	()Z
    //   259: pop
    //   260: aload_1
    //   261: invokevirtual 258	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   264: astore 6
    //   266: new 128	java/io/FileOutputStream
    //   269: dup
    //   270: aload_0
    //   271: invokespecial 131	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   274: astore 5
    //   276: sipush 1024
    //   279: newarray <illegal type>
    //   281: astore 7
    //   283: aload 6
    //   285: aload 7
    //   287: invokevirtual 261	java/io/InputStream:read	([B)I
    //   290: istore_2
    //   291: iload_2
    //   292: iconst_m1
    //   293: if_icmpeq +152 -> 445
    //   296: aload 5
    //   298: aload 7
    //   300: iconst_0
    //   301: iload_2
    //   302: invokevirtual 149	java/io/FileOutputStream:write	([BII)V
    //   305: goto -22 -> 283
    //   308: astore 7
    //   310: aload_0
    //   311: astore 4
    //   313: aload_1
    //   314: astore_0
    //   315: aload 5
    //   317: astore_1
    //   318: aload 4
    //   320: astore 5
    //   322: aload 7
    //   324: astore 4
    //   326: aload 4
    //   328: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   331: ldc 2
    //   333: ldc_w 263
    //   336: invokestatic 265	com/fimi/kernel/utils/k:c	(Ljava/lang/Class;Ljava/lang/String;)V
    //   339: aload 5
    //   341: ifnull +9 -> 350
    //   344: aload 5
    //   346: invokevirtual 268	java/io/File:delete	()Z
    //   349: pop
    //   350: aload 6
    //   352: ifnull +8 -> 360
    //   355: aload 6
    //   357: invokevirtual 269	java/io/InputStream:close	()V
    //   360: aload_1
    //   361: ifnull +7 -> 368
    //   364: aload_1
    //   365: invokevirtual 165	java/io/FileOutputStream:close	()V
    //   368: aload_0
    //   369: ifnull +7 -> 376
    //   372: aload_0
    //   373: invokevirtual 272	java/net/HttpURLConnection:disconnect	()V
    //   376: aconst_null
    //   377: astore_0
    //   378: aload_0
    //   379: areturn
    //   380: aload_0
    //   381: invokevirtual 236	java/io/File:getPath	()Ljava/lang/String;
    //   384: astore 4
    //   386: iconst_0
    //   387: ifeq +11 -> 398
    //   390: new 208	java/lang/NullPointerException
    //   393: dup
    //   394: invokespecial 209	java/lang/NullPointerException:<init>	()V
    //   397: athrow
    //   398: iconst_0
    //   399: ifeq +11 -> 410
    //   402: new 208	java/lang/NullPointerException
    //   405: dup
    //   406: invokespecial 209	java/lang/NullPointerException:<init>	()V
    //   409: athrow
    //   410: aload_1
    //   411: ifnull +7 -> 418
    //   414: aload_1
    //   415: invokevirtual 272	java/net/HttpURLConnection:disconnect	()V
    //   418: aload 4
    //   420: areturn
    //   421: astore_0
    //   422: aload_0
    //   423: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   426: goto -28 -> 398
    //   429: astore_0
    //   430: aload_0
    //   431: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   434: goto -24 -> 410
    //   437: astore_0
    //   438: aload_0
    //   439: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   442: goto -24 -> 418
    //   445: aload 6
    //   447: ifnull +8 -> 455
    //   450: aload 6
    //   452: invokevirtual 269	java/io/InputStream:close	()V
    //   455: aload 5
    //   457: ifnull +8 -> 465
    //   460: aload 5
    //   462: invokevirtual 165	java/io/FileOutputStream:close	()V
    //   465: aload_1
    //   466: ifnull +7 -> 473
    //   469: aload_1
    //   470: invokevirtual 272	java/net/HttpURLConnection:disconnect	()V
    //   473: aload 4
    //   475: astore_0
    //   476: goto -98 -> 378
    //   479: astore_0
    //   480: aload_0
    //   481: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   484: goto -29 -> 455
    //   487: astore_0
    //   488: aload_0
    //   489: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   492: goto -27 -> 465
    //   495: astore_0
    //   496: aload_0
    //   497: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   500: aload 4
    //   502: astore_0
    //   503: goto -125 -> 378
    //   506: astore 4
    //   508: aload 4
    //   510: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   513: goto -153 -> 360
    //   516: astore_1
    //   517: aload_1
    //   518: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   521: goto -153 -> 368
    //   524: astore_0
    //   525: aload_0
    //   526: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   529: aconst_null
    //   530: astore_0
    //   531: goto -153 -> 378
    //   534: astore_0
    //   535: aconst_null
    //   536: astore_1
    //   537: aconst_null
    //   538: astore 6
    //   540: aload 6
    //   542: ifnull +8 -> 550
    //   545: aload 6
    //   547: invokevirtual 269	java/io/InputStream:close	()V
    //   550: aload_1
    //   551: ifnull +7 -> 558
    //   554: aload_1
    //   555: invokevirtual 165	java/io/FileOutputStream:close	()V
    //   558: aload 4
    //   560: ifnull +8 -> 568
    //   563: aload 4
    //   565: invokevirtual 272	java/net/HttpURLConnection:disconnect	()V
    //   568: aload_0
    //   569: athrow
    //   570: astore 5
    //   572: aload 5
    //   574: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   577: goto -27 -> 550
    //   580: astore_1
    //   581: aload_1
    //   582: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   585: goto -27 -> 558
    //   588: astore_1
    //   589: aload_1
    //   590: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   593: goto -25 -> 568
    //   596: astore_0
    //   597: aconst_null
    //   598: astore 5
    //   600: aconst_null
    //   601: astore 6
    //   603: aload_1
    //   604: astore 4
    //   606: aload 5
    //   608: astore_1
    //   609: goto -69 -> 540
    //   612: astore_0
    //   613: aconst_null
    //   614: astore 5
    //   616: aload_1
    //   617: astore 4
    //   619: aload 5
    //   621: astore_1
    //   622: goto -82 -> 540
    //   625: astore_0
    //   626: aload_1
    //   627: astore 4
    //   629: aload 5
    //   631: astore_1
    //   632: goto -92 -> 540
    //   635: astore 5
    //   637: aload_0
    //   638: astore 4
    //   640: aload 5
    //   642: astore_0
    //   643: goto -103 -> 540
    //   646: astore 4
    //   648: aconst_null
    //   649: astore 5
    //   651: aconst_null
    //   652: astore_0
    //   653: aconst_null
    //   654: astore_1
    //   655: aconst_null
    //   656: astore 6
    //   658: goto -332 -> 326
    //   661: astore 4
    //   663: aload_1
    //   664: astore_0
    //   665: aconst_null
    //   666: astore_1
    //   667: aconst_null
    //   668: astore 6
    //   670: aconst_null
    //   671: astore 5
    //   673: goto -347 -> 326
    //   676: astore 4
    //   678: aconst_null
    //   679: astore 7
    //   681: aconst_null
    //   682: astore 6
    //   684: aload_0
    //   685: astore 5
    //   687: aload_1
    //   688: astore_0
    //   689: aload 7
    //   691: astore_1
    //   692: goto -366 -> 326
    //   695: astore 4
    //   697: aconst_null
    //   698: astore 7
    //   700: aload_0
    //   701: astore 5
    //   703: aload_1
    //   704: astore_0
    //   705: aload 7
    //   707: astore_1
    //   708: goto -382 -> 326
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	711	0	paramString1	String
    //   0	711	1	paramString2	String
    //   1	301	2	i	int
    //   8	2	3	bool	boolean
    //   3	498	4	localObject1	Object
    //   506	58	4	localException1	Exception
    //   604	35	4	str1	String
    //   646	1	4	localException2	Exception
    //   661	1	4	localException3	Exception
    //   676	1	4	localException4	Exception
    //   695	1	4	localException5	Exception
    //   78	383	5	localObject2	Object
    //   570	3	5	localException6	Exception
    //   598	32	5	localObject3	Object
    //   635	6	5	localObject4	Object
    //   649	53	5	str2	String
    //   106	577	6	localObject5	Object
    //   281	18	7	arrayOfByte	byte[]
    //   308	15	7	localException7	Exception
    //   679	27	7	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   17	25	51	java/lang/Exception
    //   29	37	59	java/lang/Exception
    //   41	49	67	java/lang/Exception
    //   140	148	174	java/lang/Exception
    //   152	160	182	java/lang/Exception
    //   164	172	190	java/lang/Exception
    //   276	283	308	java/lang/Exception
    //   283	291	308	java/lang/Exception
    //   296	305	308	java/lang/Exception
    //   390	398	421	java/lang/Exception
    //   402	410	429	java/lang/Exception
    //   414	418	437	java/lang/Exception
    //   450	455	479	java/lang/Exception
    //   460	465	487	java/lang/Exception
    //   469	473	495	java/lang/Exception
    //   355	360	506	java/lang/Exception
    //   364	368	516	java/lang/Exception
    //   372	376	524	java/lang/Exception
    //   5	9	534	finally
    //   74	94	534	finally
    //   94	136	534	finally
    //   205	220	534	finally
    //   545	550	570	java/lang/Exception
    //   554	558	580	java/lang/Exception
    //   563	568	588	java/lang/Exception
    //   220	242	596	finally
    //   242	266	596	finally
    //   380	386	596	finally
    //   266	276	612	finally
    //   276	283	625	finally
    //   283	291	625	finally
    //   296	305	625	finally
    //   326	339	635	finally
    //   344	350	635	finally
    //   5	9	646	java/lang/Exception
    //   74	94	646	java/lang/Exception
    //   94	136	646	java/lang/Exception
    //   205	220	646	java/lang/Exception
    //   220	242	661	java/lang/Exception
    //   242	266	676	java/lang/Exception
    //   380	386	676	java/lang/Exception
    //   266	276	695	java/lang/Exception
  }
  
  public static String a(String paramString, HttpURLConnection paramHttpURLConnection)
  {
    if (n.b(paramString)) {
      return null;
    }
    try
    {
      String str = b(paramString, paramHttpURLConnection);
      paramHttpURLConnection = str;
      if (n.b(str)) {
        paramHttpURLConnection = ".ab";
      }
      paramString = m.b(paramString) + paramHttpURLConnection;
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String a(String paramString, HttpResponse paramHttpResponse)
  {
    if (n.b(paramString)) {
      return null;
    }
    try
    {
      String str = b(paramString, paramHttpResponse);
      paramHttpResponse = str;
      if (n.b(str)) {
        paramHttpResponse = ".ab";
      }
      paramString = m.b(paramString) + paramHttpResponse;
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String a(HttpURLConnection paramHttpURLConnection)
  {
    if (paramHttpURLConnection == null) {}
    for (;;)
    {
      return null;
      try
      {
        if (paramHttpURLConnection.getResponseCode() != 200) {
          continue;
        }
        int i = 0;
        for (;;)
        {
          Object localObject = paramHttpURLConnection.getHeaderField(i);
          if (localObject == null) {
            break;
          }
          if ("content-disposition".equals(paramHttpURLConnection.getHeaderFieldKey(i).toLowerCase()))
          {
            localObject = Pattern.compile(".*filename=(.*)").matcher(((String)localObject).toLowerCase());
            if (((Matcher)localObject).find())
            {
              paramHttpURLConnection = ((Matcher)localObject).group(1).replace("\"", "");
              return paramHttpURLConnection;
            }
          }
          i += 1;
        }
        return null;
      }
      catch (Exception paramHttpURLConnection)
      {
        paramHttpURLConnection.printStackTrace();
        k.c(g.class, "网络上获取文件名失败");
      }
    }
  }
  
  public static String a(HttpResponse paramHttpResponse)
  {
    Object localObject2 = null;
    Header[] arrayOfHeader = null;
    localObject1 = null;
    if (paramHttpResponse == null) {
      localObject2 = localObject1;
    }
    for (;;)
    {
      return (String)localObject2;
      localObject1 = arrayOfHeader;
      try
      {
        arrayOfHeader = paramHttpResponse.getHeaders("content-disposition");
        int i = 0;
        for (paramHttpResponse = (HttpResponse)localObject2;; paramHttpResponse = (HttpResponse)localObject2)
        {
          localObject2 = paramHttpResponse;
          localObject1 = paramHttpResponse;
          if (i >= arrayOfHeader.length) {
            break;
          }
          localObject1 = paramHttpResponse;
          Matcher localMatcher = Pattern.compile(".*filename=(.*)").matcher(arrayOfHeader[i].getValue());
          localObject2 = paramHttpResponse;
          localObject1 = paramHttpResponse;
          if (localMatcher.find())
          {
            localObject1 = paramHttpResponse;
            localObject2 = localMatcher.group(1).replace("\"", "");
          }
          i += 1;
        }
        return (String)localObject1;
      }
      catch (Exception paramHttpResponse)
      {
        paramHttpResponse.printStackTrace();
        k.c(g.class, "网络上获取文件名失败");
      }
    }
  }
  
  public static void a(Context paramContext)
  {
    paramContext = c.g(paramContext);
    Object localObject3 = File.separator + "download" + File.separator + paramContext.packageName + File.separator;
    Object localObject1 = (String)localObject3 + "images" + File.separator;
    paramContext = (String)localObject3 + "files" + File.separator;
    Object localObject2 = (String)localObject3 + "cache" + File.separator;
    try
    {
      if (!a()) {
        return;
      }
      File localFile = Environment.getExternalStorageDirectory();
      localObject3 = new File(localFile.getAbsolutePath() + (String)localObject3);
      if (!((File)localObject3).exists()) {
        ((File)localObject3).mkdirs();
      }
      a = ((File)localObject3).getPath();
      localObject2 = new File(localFile.getAbsolutePath() + (String)localObject2);
      if (!((File)localObject2).exists()) {
        ((File)localObject2).mkdirs();
      }
      d = ((File)localObject2).getPath();
      localObject1 = new File(localFile.getAbsolutePath() + (String)localObject1);
      if (!((File)localObject1).exists()) {
        ((File)localObject1).mkdirs();
      }
      b = ((File)localObject1).getPath();
      paramContext = new File(localFile.getAbsolutePath() + paramContext);
      if (!paramContext.exists()) {
        paramContext.mkdirs();
      }
      c = paramContext.getPath();
      return;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  /* Error */
  public static void a(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 5
    //   6: aload 6
    //   8: astore 4
    //   10: new 81	java/io/File
    //   13: dup
    //   14: aload_0
    //   15: invokespecial 120	java/io/File:<init>	(Ljava/lang/String;)V
    //   18: astore 7
    //   20: aload 6
    //   22: astore 4
    //   24: invokestatic 79	com/fimi/kernel/utils/g:a	()Z
    //   27: istore_3
    //   28: iload_3
    //   29: ifne +16 -> 45
    //   32: iconst_0
    //   33: ifeq +11 -> 44
    //   36: new 208	java/lang/NullPointerException
    //   39: dup
    //   40: invokespecial 209	java/lang/NullPointerException:<init>	()V
    //   43: athrow
    //   44: return
    //   45: aload 6
    //   47: astore 4
    //   49: aload 7
    //   51: invokevirtual 84	java/io/File:exists	()Z
    //   54: ifne +50 -> 104
    //   57: iload_2
    //   58: ifeq +75 -> 133
    //   61: aload 6
    //   63: astore 4
    //   65: aload 7
    //   67: invokevirtual 380	java/io/File:getParentFile	()Ljava/io/File;
    //   70: astore 8
    //   72: aload 6
    //   74: astore 4
    //   76: aload 8
    //   78: invokevirtual 84	java/io/File:exists	()Z
    //   81: ifne +23 -> 104
    //   84: aload 6
    //   86: astore 4
    //   88: aload 8
    //   90: invokevirtual 376	java/io/File:mkdirs	()Z
    //   93: pop
    //   94: aload 6
    //   96: astore 4
    //   98: aload 7
    //   100: invokevirtual 126	java/io/File:createNewFile	()Z
    //   103: pop
    //   104: aload 6
    //   106: astore 4
    //   108: new 128	java/io/FileOutputStream
    //   111: dup
    //   112: aload_0
    //   113: invokespecial 381	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   116: astore_0
    //   117: aload_0
    //   118: aload_1
    //   119: invokevirtual 383	java/io/FileOutputStream:write	([B)V
    //   122: aload_0
    //   123: ifnull -79 -> 44
    //   126: aload_0
    //   127: invokevirtual 165	java/io/FileOutputStream:close	()V
    //   130: return
    //   131: astore_0
    //   132: return
    //   133: iconst_0
    //   134: ifeq -90 -> 44
    //   137: new 208	java/lang/NullPointerException
    //   140: dup
    //   141: invokespecial 209	java/lang/NullPointerException:<init>	()V
    //   144: athrow
    //   145: astore_0
    //   146: return
    //   147: astore_1
    //   148: aload 5
    //   150: astore_0
    //   151: aload_0
    //   152: astore 4
    //   154: aload_1
    //   155: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   158: aload_0
    //   159: ifnull -115 -> 44
    //   162: aload_0
    //   163: invokevirtual 165	java/io/FileOutputStream:close	()V
    //   166: return
    //   167: astore_0
    //   168: return
    //   169: astore_0
    //   170: aload 4
    //   172: astore_1
    //   173: aload_1
    //   174: ifnull +7 -> 181
    //   177: aload_1
    //   178: invokevirtual 165	java/io/FileOutputStream:close	()V
    //   181: aload_0
    //   182: athrow
    //   183: astore_0
    //   184: return
    //   185: astore_1
    //   186: goto -5 -> 181
    //   189: astore 4
    //   191: aload_0
    //   192: astore_1
    //   193: aload 4
    //   195: astore_0
    //   196: goto -23 -> 173
    //   199: astore_1
    //   200: goto -49 -> 151
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	203	0	paramString	String
    //   0	203	1	paramArrayOfByte	byte[]
    //   0	203	2	paramBoolean	boolean
    //   27	2	3	bool	boolean
    //   8	163	4	localObject1	Object
    //   189	5	4	localObject2	Object
    //   4	145	5	localObject3	Object
    //   1	104	6	localObject4	Object
    //   18	81	7	localFile1	File
    //   70	19	8	localFile2	File
    // Exception table:
    //   from	to	target	type
    //   126	130	131	java/lang/Exception
    //   137	145	145	java/lang/Exception
    //   10	20	147	java/lang/Exception
    //   24	28	147	java/lang/Exception
    //   49	57	147	java/lang/Exception
    //   65	72	147	java/lang/Exception
    //   76	84	147	java/lang/Exception
    //   88	94	147	java/lang/Exception
    //   98	104	147	java/lang/Exception
    //   108	117	147	java/lang/Exception
    //   162	166	167	java/lang/Exception
    //   10	20	169	finally
    //   24	28	169	finally
    //   49	57	169	finally
    //   65	72	169	finally
    //   76	84	169	finally
    //   88	94	169	finally
    //   98	104	169	finally
    //   108	117	169	finally
    //   154	158	169	finally
    //   36	44	183	java/lang/Exception
    //   177	181	185	java/lang/Exception
    //   117	122	189	finally
    //   117	122	199	java/lang/Exception
  }
  
  public static boolean a()
  {
    try
    {
      boolean bool = Environment.getExternalStorageState().equals("mounted");
      return bool;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
  
  public static int b()
  {
    StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
    double d1 = localStatFs.getAvailableBlocks();
    return (int)(localStatFs.getBlockSize() * d1 / 1024.0D * 1024.0D);
  }
  
  public static int b(String paramString)
  {
    try
    {
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
      localHttpURLConnection.setConnectTimeout(5000);
      localHttpURLConnection.setRequestMethod("GET");
      localHttpURLConnection.setRequestProperty("Accept", "image/gif, image/jpeg, image/pjpeg, image/pjpeg, application/x-shockwave-flash, application/xaml+xml, application/vnd.ms-xpsdocument, application/x-ms-xbap, application/x-ms-application, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*");
      localHttpURLConnection.setRequestProperty("Accept-Language", "zh-CN");
      localHttpURLConnection.setRequestProperty("Referer", paramString);
      localHttpURLConnection.setRequestProperty("Charset", "UTF-8");
      localHttpURLConnection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2; Trident/4.0; .NET CLR 1.1.4322; .NET CLR 2.0.50727; .NET CLR 3.0.04506.30; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729)");
      localHttpURLConnection.setRequestProperty("Connection", "Keep-Alive");
      localHttpURLConnection.connect();
      if (localHttpURLConnection.getResponseCode() == 200)
      {
        int i = localHttpURLConnection.getContentLength();
        return i;
      }
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
      k.a(g.class, "获取长度异常：" + paramString.getMessage());
    }
    return 0;
  }
  
  public static Bitmap b(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      paramString = s.a(paramString, paramInt1, paramInt2, paramInt3);
      return paramString;
    }
    catch (Exception paramString)
    {
      k.a(g.class, "下载图片异常：" + paramString.getMessage());
    }
    return null;
  }
  
  public static Drawable b(Context paramContext, String paramString)
  {
    try
    {
      paramContext = Drawable.createFromStream(paramContext.getAssets().open(paramString), null);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      k.a(g.class, "获取图片异常：" + paramContext.getMessage());
    }
    return null;
  }
  
  public static String b(Context paramContext)
  {
    if (a == null) {
      a(paramContext);
    }
    return a;
  }
  
  public static String b(String paramString, HttpURLConnection paramHttpURLConnection)
  {
    Object localObject3 = null;
    Object localObject4 = null;
    localObject1 = null;
    if (n.b(paramString)) {
      paramString = (String)localObject1;
    }
    do
    {
      do
      {
        do
        {
          return paramString;
          localObject1 = localObject3;
          localObject2 = localObject4;
          for (;;)
          {
            try
            {
              if (paramString.lastIndexOf(".") != -1)
              {
                localObject2 = localObject4;
                paramString = paramString.substring(paramString.lastIndexOf("."));
                localObject1 = localObject3;
              }
            }
            catch (Exception paramString)
            {
              paramString.printStackTrace();
              return (String)localObject2;
            }
            try
            {
              if (paramString.indexOf("/") == -1)
              {
                localObject1 = localObject3;
                if (paramString.indexOf("?") == -1)
                {
                  int i = paramString.indexOf("&");
                  if (i == -1) {
                    break label169;
                  }
                  localObject1 = localObject3;
                }
              }
            }
            catch (Exception paramHttpURLConnection)
            {
              localObject2 = paramString;
              paramString = paramHttpURLConnection;
              continue;
              localObject1 = paramString;
            }
          }
          paramString = (String)localObject1;
          localObject2 = localObject1;
        } while (!n.b((String)localObject1));
        localObject2 = localObject1;
        paramHttpURLConnection = a(paramHttpURLConnection);
        paramString = (String)localObject1;
      } while (paramHttpURLConnection == null);
      paramString = (String)localObject1;
      localObject2 = localObject1;
    } while (paramHttpURLConnection.lastIndexOf(".") == -1);
    localObject2 = localObject1;
    paramString = paramHttpURLConnection.substring(paramHttpURLConnection.lastIndexOf("."));
    return paramString;
  }
  
  public static String b(String paramString, HttpResponse paramHttpResponse)
  {
    Object localObject3 = null;
    Object localObject4 = null;
    localObject1 = null;
    if (n.b(paramString)) {
      paramString = (String)localObject1;
    }
    do
    {
      do
      {
        do
        {
          return paramString;
          localObject1 = localObject3;
          localObject2 = localObject4;
          for (;;)
          {
            try
            {
              if (paramString.lastIndexOf(".") != -1)
              {
                localObject2 = localObject4;
                paramString = paramString.substring(paramString.lastIndexOf("."));
                localObject1 = localObject3;
              }
            }
            catch (Exception paramString)
            {
              paramString.printStackTrace();
              return (String)localObject2;
            }
            try
            {
              if (paramString.indexOf("/") == -1)
              {
                localObject1 = localObject3;
                if (paramString.indexOf("?") == -1)
                {
                  int i = paramString.indexOf("&");
                  if (i == -1) {
                    break label169;
                  }
                  localObject1 = localObject3;
                }
              }
            }
            catch (Exception paramHttpResponse)
            {
              localObject2 = paramString;
              paramString = paramHttpResponse;
              continue;
              localObject1 = paramString;
            }
          }
          paramString = (String)localObject1;
          localObject2 = localObject1;
        } while (!n.b((String)localObject1));
        localObject2 = localObject1;
        paramHttpResponse = a(paramHttpResponse);
        paramString = (String)localObject1;
      } while (paramHttpResponse == null);
      paramString = (String)localObject1;
      localObject2 = localObject1;
    } while (paramHttpResponse.lastIndexOf(".") == -1);
    localObject2 = localObject1;
    paramString = paramHttpResponse.substring(paramHttpResponse.lastIndexOf("."));
    return paramString;
  }
  
  public static boolean b(File paramFile)
  {
    do
    {
      try
      {
        if (a()) {
          continue;
        }
        return false;
      }
      catch (Exception paramFile)
      {
        int i;
        paramFile.printStackTrace();
        return false;
      }
      if (paramFile.isDirectory())
      {
        paramFile = paramFile.listFiles();
        i = 0;
      }
      for (;;)
      {
        if (i < paramFile.length)
        {
          b(paramFile[i]);
          i += 1;
          continue;
          paramFile.delete();
        }
        else
        {
          return true;
        }
      }
    } while (paramFile != null);
    return true;
  }
  
  public static String c(Context paramContext)
  {
    if (a == null) {
      a(paramContext);
    }
    return b;
  }
  
  public static String c(String paramString)
  {
    try
    {
      if (n.b(paramString)) {
        return null;
      }
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
      localHttpURLConnection.setConnectTimeout(5000);
      localHttpURLConnection.setRequestMethod("GET");
      localHttpURLConnection.setRequestProperty("Accept", "image/gif, image/jpeg, image/pjpeg, image/pjpeg, application/x-shockwave-flash, application/xaml+xml, application/vnd.ms-xpsdocument, application/x-ms-xbap, application/x-ms-application, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*");
      localHttpURLConnection.setRequestProperty("Accept-Language", "zh-CN");
      localHttpURLConnection.setRequestProperty("Referer", paramString);
      localHttpURLConnection.setRequestProperty("Charset", "UTF-8");
      localHttpURLConnection.setRequestProperty("User-Agent", "");
      localHttpURLConnection.setRequestProperty("Connection", "Keep-Alive");
      localHttpURLConnection.connect();
      if (localHttpURLConnection.getResponseCode() == 200)
      {
        int i = 0;
        for (;;)
        {
          paramString = localHttpURLConnection.getHeaderField(i);
          if (paramString == null) {
            break;
          }
          if ("content-disposition".equals(localHttpURLConnection.getHeaderFieldKey(i).toLowerCase()))
          {
            paramString = Pattern.compile(".*filename=(.*)").matcher(paramString.toLowerCase());
            if (paramString.find())
            {
              paramString = paramString.group(1).replace("\"", "");
              return paramString;
            }
          }
          i += 1;
        }
      }
      return null;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
      k.c(g.class, "网络上获取文件名失败");
    }
  }
  
  public static boolean c()
  {
    try
    {
      b(new File(a));
      return true;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
  
  public static int d()
  {
    return f;
  }
  
  public static String d(Context paramContext)
  {
    if (a == null) {
      a(paramContext);
    }
    return c;
  }
  
  public static String d(String paramString)
  {
    if (n.b(paramString)) {
      return null;
    }
    try
    {
      paramString = m.b(paramString);
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String e(Context paramContext)
  {
    if (a == null) {
      a(paramContext);
    }
    return d;
  }
  
  /* Error */
  public static byte[] e(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: new 81	java/io/File
    //   6: dup
    //   7: aload_0
    //   8: invokespecial 120	java/io/File:<init>	(Ljava/lang/String;)V
    //   11: astore 5
    //   13: invokestatic 79	com/fimi/kernel/utils/g:a	()Z
    //   16: istore 4
    //   18: iload 4
    //   20: ifne +22 -> 42
    //   23: aload 7
    //   25: astore 6
    //   27: iconst_0
    //   28: ifeq +11 -> 39
    //   31: new 208	java/lang/NullPointerException
    //   34: dup
    //   35: invokespecial 209	java/lang/NullPointerException:<init>	()V
    //   38: athrow
    //   39: aload 6
    //   41: areturn
    //   42: aload 5
    //   44: invokevirtual 84	java/io/File:exists	()Z
    //   47: istore 4
    //   49: iload 4
    //   51: ifne +22 -> 73
    //   54: aload 7
    //   56: astore 6
    //   58: iconst_0
    //   59: ifeq -20 -> 39
    //   62: new 208	java/lang/NullPointerException
    //   65: dup
    //   66: invokespecial 209	java/lang/NullPointerException:<init>	()V
    //   69: athrow
    //   70: astore_0
    //   71: aconst_null
    //   72: areturn
    //   73: aload 5
    //   75: invokevirtual 478	java/io/File:length	()J
    //   78: lstore_2
    //   79: lload_2
    //   80: ldc2_w 479
    //   83: lcmp
    //   84: ifle +22 -> 106
    //   87: aload 7
    //   89: astore 6
    //   91: iconst_0
    //   92: ifeq -53 -> 39
    //   95: new 208	java/lang/NullPointerException
    //   98: dup
    //   99: invokespecial 209	java/lang/NullPointerException:<init>	()V
    //   102: athrow
    //   103: astore_0
    //   104: aconst_null
    //   105: areturn
    //   106: new 482	java/io/FileInputStream
    //   109: dup
    //   110: aload_0
    //   111: invokespecial 483	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   114: astore 8
    //   116: new 485	java/io/ByteArrayOutputStream
    //   119: dup
    //   120: sipush 1024
    //   123: invokespecial 487	java/io/ByteArrayOutputStream:<init>	(I)V
    //   126: astore 5
    //   128: aload 5
    //   130: astore_0
    //   131: sipush 1024
    //   134: newarray <illegal type>
    //   136: astore 6
    //   138: aload 5
    //   140: astore_0
    //   141: aload 8
    //   143: aload 6
    //   145: invokevirtual 488	java/io/FileInputStream:read	([B)I
    //   148: istore_1
    //   149: iload_1
    //   150: iconst_m1
    //   151: if_icmpeq +47 -> 198
    //   154: aload 5
    //   156: astore_0
    //   157: aload 5
    //   159: aload 6
    //   161: iconst_0
    //   162: iload_1
    //   163: invokevirtual 489	java/io/ByteArrayOutputStream:write	([BII)V
    //   166: goto -28 -> 138
    //   169: astore 6
    //   171: aload 5
    //   173: astore_0
    //   174: aload 6
    //   176: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   179: aload 7
    //   181: astore 6
    //   183: aload 5
    //   185: ifnull -146 -> 39
    //   188: aload 5
    //   190: invokevirtual 490	java/io/ByteArrayOutputStream:close	()V
    //   193: aconst_null
    //   194: areturn
    //   195: astore_0
    //   196: aconst_null
    //   197: areturn
    //   198: aload 5
    //   200: astore_0
    //   201: aload 8
    //   203: invokevirtual 491	java/io/FileInputStream:close	()V
    //   206: aload 5
    //   208: astore_0
    //   209: aload 5
    //   211: invokevirtual 494	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   214: astore 6
    //   216: aload 6
    //   218: astore_0
    //   219: aload_0
    //   220: astore 6
    //   222: aload 5
    //   224: ifnull -185 -> 39
    //   227: aload 5
    //   229: invokevirtual 490	java/io/ByteArrayOutputStream:close	()V
    //   232: aload_0
    //   233: areturn
    //   234: astore 5
    //   236: aload_0
    //   237: areturn
    //   238: astore 5
    //   240: aconst_null
    //   241: astore_0
    //   242: aload_0
    //   243: ifnull +7 -> 250
    //   246: aload_0
    //   247: invokevirtual 490	java/io/ByteArrayOutputStream:close	()V
    //   250: aload 5
    //   252: athrow
    //   253: astore_0
    //   254: aconst_null
    //   255: areturn
    //   256: astore_0
    //   257: goto -7 -> 250
    //   260: astore 5
    //   262: goto -20 -> 242
    //   265: astore 6
    //   267: aconst_null
    //   268: astore 5
    //   270: goto -99 -> 171
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	273	0	paramString	String
    //   148	15	1	i	int
    //   78	2	2	l	long
    //   16	34	4	bool	boolean
    //   11	217	5	localObject1	Object
    //   234	1	5	localException1	Exception
    //   238	13	5	localObject2	Object
    //   260	1	5	localObject3	Object
    //   268	1	5	localObject4	Object
    //   25	135	6	localObject5	Object
    //   169	6	6	localException2	Exception
    //   181	40	6	localObject6	Object
    //   265	1	6	localException3	Exception
    //   1	179	7	localObject7	Object
    //   114	88	8	localFileInputStream	java.io.FileInputStream
    // Exception table:
    //   from	to	target	type
    //   62	70	70	java/lang/Exception
    //   95	103	103	java/lang/Exception
    //   131	138	169	java/lang/Exception
    //   141	149	169	java/lang/Exception
    //   157	166	169	java/lang/Exception
    //   201	206	169	java/lang/Exception
    //   209	216	169	java/lang/Exception
    //   188	193	195	java/lang/Exception
    //   227	232	234	java/lang/Exception
    //   3	18	238	finally
    //   42	49	238	finally
    //   73	79	238	finally
    //   106	128	238	finally
    //   31	39	253	java/lang/Exception
    //   246	250	256	java/lang/Exception
    //   131	138	260	finally
    //   141	149	260	finally
    //   157	166	260	finally
    //   174	179	260	finally
    //   201	206	260	finally
    //   209	216	260	finally
    //   3	18	265	java/lang/Exception
    //   42	49	265	java/lang/Exception
    //   73	79	265	java/lang/Exception
    //   106	128	265	java/lang/Exception
  }
  
  public static File f(String paramString)
  {
    File localFile = new File(paramString);
    if (!localFile.exists()) {}
    try
    {
      paramString = paramString.substring(0, paramString.lastIndexOf("/"));
      System.out.println(paramString);
      paramString = new File(paramString);
      if (!paramString.exists()) {
        paramString.mkdirs();
      }
      localFile.createNewFile();
      return localFile;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return localFile;
  }
  
  public static String f(Context paramContext)
  {
    if (a == null) {
      a(paramContext);
    }
    return e;
  }
  
  public static boolean g(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString != null)
    {
      int i = paramString.lastIndexOf(".");
      bool1 = bool2;
      if (i >= 0)
      {
        bool1 = bool2;
        if ("mp4".equals(paramString.substring(i + 1).toLowerCase())) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public static class a
    implements Comparator<File>
  {
    public int a(File paramFile1, File paramFile2)
    {
      if (paramFile1.lastModified() > paramFile2.lastModified()) {
        return 1;
      }
      if (paramFile1.lastModified() == paramFile2.lastModified()) {
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */