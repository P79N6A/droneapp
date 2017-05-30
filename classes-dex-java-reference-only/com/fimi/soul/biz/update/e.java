package com.fimi.soul.biz.update;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;

public class e
  extends AsyncTask<String, Void, Boolean>
{
  Context a;
  String b;
  String c;
  
  public e(Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.c = paramString;
  }
  
  private void a()
  {
    String str = this.a.getPackageName();
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("market://details?id=" + str));
    this.a.startActivity(localIntent);
  }
  
  /* Error */
  protected Boolean a(String... paramVarArgs)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_1
    //   3: istore 4
    //   5: iconst_1
    //   6: istore_2
    //   7: new 75	org/apache/http/client/methods/HttpPost
    //   10: dup
    //   11: aload_1
    //   12: iconst_0
    //   13: aaload
    //   14: invokespecial 76	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   17: astore_1
    //   18: ldc 78
    //   20: invokestatic 84	android/net/http/AndroidHttpClient:newInstance	(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;
    //   23: astore 7
    //   25: new 86	java/io/BufferedReader
    //   28: dup
    //   29: new 88	java/io/InputStreamReader
    //   32: dup
    //   33: aload 7
    //   35: aload_1
    //   36: invokevirtual 92	android/net/http/AndroidHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   39: invokeinterface 98 1 0
    //   44: invokeinterface 104 1 0
    //   49: invokespecial 107	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   52: invokespecial 110	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   55: astore 5
    //   57: ldc 112
    //   59: astore 6
    //   61: aload 5
    //   63: astore_1
    //   64: ldc 114
    //   66: invokestatic 120	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   69: astore 8
    //   71: aload 5
    //   73: astore_1
    //   74: aload 5
    //   76: invokevirtual 123	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   79: astore 9
    //   81: aload 9
    //   83: ifnull +100 -> 183
    //   86: aload 5
    //   88: astore_1
    //   89: aload 8
    //   91: aload 9
    //   93: invokevirtual 127	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   96: astore 10
    //   98: aload 5
    //   100: astore_1
    //   101: aload 10
    //   103: invokevirtual 133	java/util/regex/Matcher:find	()Z
    //   106: ifeq +49 -> 155
    //   109: aload 5
    //   111: astore_1
    //   112: ldc -121
    //   114: new 41	java/lang/StringBuilder
    //   117: dup
    //   118: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   121: ldc -119
    //   123: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: aload 10
    //   128: iconst_1
    //   129: invokevirtual 141	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   132: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   138: invokestatic 147	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   141: pop
    //   142: aload 5
    //   144: astore_1
    //   145: aload_0
    //   146: aload 10
    //   148: iconst_1
    //   149: invokevirtual 141	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   152: putfield 149	com/fimi/soul/biz/update/e:b	Ljava/lang/String;
    //   155: aload 5
    //   157: astore_1
    //   158: new 41	java/lang/StringBuilder
    //   161: dup
    //   162: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   165: aload 6
    //   167: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: aload 9
    //   172: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   178: astore 6
    //   180: goto -109 -> 71
    //   183: aload 5
    //   185: astore_1
    //   186: ldc -121
    //   188: aload 6
    //   190: invokestatic 147	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   193: pop
    //   194: ldc -121
    //   196: ldc -105
    //   198: invokestatic 147	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   201: pop
    //   202: aload 5
    //   204: ifnull +8 -> 212
    //   207: aload 5
    //   209: invokevirtual 154	java/io/BufferedReader:close	()V
    //   212: iload_2
    //   213: istore_3
    //   214: aload 7
    //   216: ifnull +10 -> 226
    //   219: aload 7
    //   221: invokevirtual 155	android/net/http/AndroidHttpClient:close	()V
    //   224: iload_2
    //   225: istore_3
    //   226: iload_3
    //   227: invokestatic 161	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   230: areturn
    //   231: astore_1
    //   232: aload_1
    //   233: invokevirtual 164	java/io/IOException:printStackTrace	()V
    //   236: iload_2
    //   237: istore_3
    //   238: goto -12 -> 226
    //   241: astore 6
    //   243: aconst_null
    //   244: astore 5
    //   246: iconst_0
    //   247: istore_2
    //   248: aload 5
    //   250: astore_1
    //   251: aload 6
    //   253: invokevirtual 165	org/apache/http/client/ClientProtocolException:printStackTrace	()V
    //   256: ldc -121
    //   258: ldc -105
    //   260: invokestatic 147	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   263: pop
    //   264: aload 5
    //   266: ifnull +8 -> 274
    //   269: aload 5
    //   271: invokevirtual 154	java/io/BufferedReader:close	()V
    //   274: iload_2
    //   275: istore_3
    //   276: aload 7
    //   278: ifnull -52 -> 226
    //   281: aload 7
    //   283: invokevirtual 155	android/net/http/AndroidHttpClient:close	()V
    //   286: iload_2
    //   287: istore_3
    //   288: goto -62 -> 226
    //   291: astore_1
    //   292: aload_1
    //   293: invokevirtual 164	java/io/IOException:printStackTrace	()V
    //   296: iload_2
    //   297: istore_3
    //   298: goto -72 -> 226
    //   301: astore 6
    //   303: aconst_null
    //   304: astore 5
    //   306: iconst_0
    //   307: istore_2
    //   308: aload 5
    //   310: astore_1
    //   311: aload 6
    //   313: invokevirtual 164	java/io/IOException:printStackTrace	()V
    //   316: ldc -121
    //   318: ldc -105
    //   320: invokestatic 147	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   323: pop
    //   324: aload 5
    //   326: ifnull +8 -> 334
    //   329: aload 5
    //   331: invokevirtual 154	java/io/BufferedReader:close	()V
    //   334: iload_2
    //   335: istore_3
    //   336: aload 7
    //   338: ifnull -112 -> 226
    //   341: aload 7
    //   343: invokevirtual 155	android/net/http/AndroidHttpClient:close	()V
    //   346: iload_2
    //   347: istore_3
    //   348: goto -122 -> 226
    //   351: astore_1
    //   352: aload_1
    //   353: invokevirtual 164	java/io/IOException:printStackTrace	()V
    //   356: iload_2
    //   357: istore_3
    //   358: goto -132 -> 226
    //   361: astore 5
    //   363: aconst_null
    //   364: astore_1
    //   365: ldc -121
    //   367: ldc -105
    //   369: invokestatic 147	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   372: pop
    //   373: aload_1
    //   374: ifnull +7 -> 381
    //   377: aload_1
    //   378: invokevirtual 154	java/io/BufferedReader:close	()V
    //   381: aload 7
    //   383: ifnull +8 -> 391
    //   386: aload 7
    //   388: invokevirtual 155	android/net/http/AndroidHttpClient:close	()V
    //   391: aload 5
    //   393: athrow
    //   394: astore_1
    //   395: aload_1
    //   396: invokevirtual 164	java/io/IOException:printStackTrace	()V
    //   399: goto -8 -> 391
    //   402: astore 5
    //   404: goto -39 -> 365
    //   407: astore 6
    //   409: iconst_0
    //   410: istore_2
    //   411: goto -103 -> 308
    //   414: astore 6
    //   416: iload 4
    //   418: istore_2
    //   419: goto -111 -> 308
    //   422: astore 6
    //   424: iconst_0
    //   425: istore_2
    //   426: goto -178 -> 248
    //   429: astore 6
    //   431: iload_3
    //   432: istore_2
    //   433: goto -185 -> 248
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	436	0	this	e
    //   0	436	1	paramVarArgs	String[]
    //   6	427	2	bool1	boolean
    //   1	431	3	bool2	boolean
    //   3	414	4	bool3	boolean
    //   55	275	5	localBufferedReader	java.io.BufferedReader
    //   361	31	5	localObject1	Object
    //   402	1	5	localObject2	Object
    //   59	130	6	str1	String
    //   241	11	6	localClientProtocolException1	org.apache.http.client.ClientProtocolException
    //   301	11	6	localIOException1	java.io.IOException
    //   407	1	6	localIOException2	java.io.IOException
    //   414	1	6	localIOException3	java.io.IOException
    //   422	1	6	localClientProtocolException2	org.apache.http.client.ClientProtocolException
    //   429	1	6	localClientProtocolException3	org.apache.http.client.ClientProtocolException
    //   23	364	7	localAndroidHttpClient	android.net.http.AndroidHttpClient
    //   69	21	8	localPattern	java.util.regex.Pattern
    //   79	92	9	str2	String
    //   96	51	10	localMatcher	java.util.regex.Matcher
    // Exception table:
    //   from	to	target	type
    //   207	212	231	java/io/IOException
    //   219	224	231	java/io/IOException
    //   25	57	241	org/apache/http/client/ClientProtocolException
    //   269	274	291	java/io/IOException
    //   281	286	291	java/io/IOException
    //   25	57	301	java/io/IOException
    //   329	334	351	java/io/IOException
    //   341	346	351	java/io/IOException
    //   25	57	361	finally
    //   377	381	394	java/io/IOException
    //   386	391	394	java/io/IOException
    //   64	71	402	finally
    //   74	81	402	finally
    //   89	98	402	finally
    //   101	109	402	finally
    //   112	142	402	finally
    //   145	155	402	finally
    //   158	180	402	finally
    //   186	194	402	finally
    //   251	256	402	finally
    //   311	316	402	finally
    //   64	71	407	java/io/IOException
    //   74	81	407	java/io/IOException
    //   89	98	407	java/io/IOException
    //   101	109	407	java/io/IOException
    //   112	142	407	java/io/IOException
    //   145	155	407	java/io/IOException
    //   158	180	407	java/io/IOException
    //   186	194	414	java/io/IOException
    //   64	71	422	org/apache/http/client/ClientProtocolException
    //   74	81	422	org/apache/http/client/ClientProtocolException
    //   89	98	422	org/apache/http/client/ClientProtocolException
    //   101	109	422	org/apache/http/client/ClientProtocolException
    //   112	142	422	org/apache/http/client/ClientProtocolException
    //   145	155	422	org/apache/http/client/ClientProtocolException
    //   158	180	422	org/apache/http/client/ClientProtocolException
    //   186	194	429	org/apache/http/client/ClientProtocolException
  }
  
  protected void a(Boolean paramBoolean)
  {
    super.onPostExecute(paramBoolean);
    if (paramBoolean.booleanValue()) {
      new AlertDialog.Builder(this.a, 2131427411).setTitle("Update").setMessage("App have update,please update!").setOnCancelListener(new DialogInterface.OnCancelListener()
      {
        public void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          paramAnonymousDialogInterface.dismiss();
        }
      }).setNegativeButton("cancel", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          paramAnonymousDialogInterface.dismiss();
        }
      }).setPositiveButton("update", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          e.a(e.this);
        }
      }).create().show();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/update/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */