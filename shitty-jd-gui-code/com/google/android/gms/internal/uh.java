package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.u;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@aaa
public class uh
{
  BlockingQueue<un> a;
  ExecutorService b;
  LinkedHashMap<String, String> c = new LinkedHashMap();
  Map<String, uk> d = new HashMap();
  String e;
  final Context f;
  final String g;
  private AtomicBoolean h;
  private File i;
  
  public uh(Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    this.f = paramContext;
    this.g = paramString1;
    this.e = paramString2;
    this.h = new AtomicBoolean(false);
    this.h.set(((Boolean)uf.P.c()).booleanValue());
    if (this.h.get())
    {
      paramContext = Environment.getExternalStorageDirectory();
      if (paramContext != null) {
        this.i = new File(paramContext, "sdk_csi_data.txt");
      }
    }
    paramContext = paramMap.entrySet().iterator();
    while (paramContext.hasNext())
    {
      paramString1 = (Map.Entry)paramContext.next();
      this.c.put((String)paramString1.getKey(), (String)paramString1.getValue());
    }
    this.a = new ArrayBlockingQueue(30);
    this.b = Executors.newSingleThreadExecutor();
    this.b.execute(new uh.1(this));
    this.d.put("action", uk.b);
    this.d.put("ad_format", uk.b);
    this.d.put("e", uk.c);
  }
  
  private void a()
  {
    try
    {
      for (;;)
      {
        un localun = (un)this.a.take();
        String str = localun.c();
        if (!TextUtils.isEmpty(str)) {
          a(a(this.c, localun.d()), str);
        }
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      abr.d("CsiReporter:reporter interrupted", localInterruptedException);
    }
  }
  
  /* Error */
  private void a(@Nullable File paramFile, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +101 -> 102
    //   4: new 208	java/io/FileOutputStream
    //   7: dup
    //   8: aload_1
    //   9: iconst_1
    //   10: invokespecial 211	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   13: astore_3
    //   14: aload_3
    //   15: astore_1
    //   16: aload_3
    //   17: aload_2
    //   18: invokevirtual 215	java/lang/String:getBytes	()[B
    //   21: invokevirtual 219	java/io/FileOutputStream:write	([B)V
    //   24: aload_3
    //   25: astore_1
    //   26: aload_3
    //   27: bipush 10
    //   29: invokevirtual 221	java/io/FileOutputStream:write	(I)V
    //   32: aload_3
    //   33: ifnull +7 -> 40
    //   36: aload_3
    //   37: invokevirtual 224	java/io/FileOutputStream:close	()V
    //   40: return
    //   41: astore_1
    //   42: ldc -30
    //   44: aload_1
    //   45: invokestatic 201	com/google/android/gms/internal/abr:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   48: return
    //   49: astore 4
    //   51: aconst_null
    //   52: astore_2
    //   53: aload_2
    //   54: astore_1
    //   55: ldc -28
    //   57: aload 4
    //   59: invokestatic 201	com/google/android/gms/internal/abr:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   62: aload_2
    //   63: ifnull -23 -> 40
    //   66: aload_2
    //   67: invokevirtual 224	java/io/FileOutputStream:close	()V
    //   70: return
    //   71: astore_1
    //   72: ldc -30
    //   74: aload_1
    //   75: invokestatic 201	com/google/android/gms/internal/abr:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   78: return
    //   79: astore_2
    //   80: aconst_null
    //   81: astore_1
    //   82: aload_1
    //   83: ifnull +7 -> 90
    //   86: aload_1
    //   87: invokevirtual 224	java/io/FileOutputStream:close	()V
    //   90: aload_2
    //   91: athrow
    //   92: astore_1
    //   93: ldc -30
    //   95: aload_1
    //   96: invokestatic 201	com/google/android/gms/internal/abr:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   99: goto -9 -> 90
    //   102: ldc -26
    //   104: invokestatic 233	com/google/android/gms/internal/abr:d	(Ljava/lang/String;)V
    //   107: return
    //   108: astore_2
    //   109: goto -27 -> 82
    //   112: astore 4
    //   114: aload_3
    //   115: astore_2
    //   116: goto -63 -> 53
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	this	uh
    //   0	119	1	paramFile	File
    //   0	119	2	paramString	String
    //   13	102	3	localFileOutputStream	java.io.FileOutputStream
    //   49	9	4	localIOException1	java.io.IOException
    //   112	1	4	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   36	40	41	java/io/IOException
    //   4	14	49	java/io/IOException
    //   66	70	71	java/io/IOException
    //   4	14	79	finally
    //   86	90	92	java/io/IOException
    //   16	24	108	finally
    //   26	32	108	finally
    //   55	62	108	finally
    //   16	24	112	java/io/IOException
    //   26	32	112	java/io/IOException
  }
  
  private void a(Map<String, String> paramMap, String paramString)
  {
    paramMap = a(this.e, paramMap, paramString);
    if (this.h.get())
    {
      a(this.i, paramMap);
      return;
    }
    u.e().a(this.f, this.g, paramMap);
  }
  
  public uk a(String paramString)
  {
    paramString = (uk)this.d.get(paramString);
    if (paramString != null) {
      return paramString;
    }
    return uk.a;
  }
  
  String a(String paramString1, Map<String, String> paramMap, @NonNull String paramString2)
  {
    paramString1 = Uri.parse(paramString1).buildUpon();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      paramString1.appendQueryParameter((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    paramString1 = new StringBuilder(paramString1.build().toString());
    paramString1.append("&").append("it").append("=").append(paramString2);
    return paramString1.toString();
  }
  
  Map<String, String> a(Map<String, String> paramMap1, @Nullable Map<String, String> paramMap2)
  {
    paramMap1 = new LinkedHashMap(paramMap1);
    if (paramMap2 == null) {
      return paramMap1;
    }
    paramMap2 = paramMap2.entrySet().iterator();
    while (paramMap2.hasNext())
    {
      Object localObject = (Map.Entry)paramMap2.next();
      String str1 = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      String str2 = (String)paramMap1.get(str1);
      paramMap1.put(str1, a(str1).a(str2, (String)localObject));
    }
    return paramMap1;
  }
  
  public void a(@Nullable List<String> paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      this.c.put("e", TextUtils.join(",", paramList));
    }
  }
  
  public boolean a(un paramun)
  {
    return this.a.offer(paramun);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/uh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */