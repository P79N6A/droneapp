package com.fimi.kernel.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.fimi.kernel.a.d;
import com.fimi.kernel.a.f;
import com.fimi.kernel.a.g;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class c
{
  public static List<String[]> a = null;
  
  public static int a()
  {
    try
    {
      int i = new File("/sys/devices/system/cpu/").listFiles(new FileFilter()
      {
        public boolean accept(File paramAnonymousFile)
        {
          return Pattern.matches("cpu[0-9]", paramAnonymousFile.getName());
        }
      }).length;
      return i;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return 1;
  }
  
  public static f a(int paramInt)
  {
    f localf = new f();
    if (a == null) {
      a = c();
    }
    int j = a.size();
    int i = 0;
    String[] arrayOfString;
    long l;
    if (i < j)
    {
      arrayOfString = (String[])a.get(i);
      String str = arrayOfString[0];
      if (str == null) {}
      while (Integer.parseInt(str) != paramInt)
      {
        i += 1;
        break;
      }
      localf.c = Integer.parseInt(arrayOfString[0]);
      localf.e = arrayOfString[2];
      localf.f = arrayOfString[3];
      localf.g = arrayOfString[4];
      l = 0L;
      if (arrayOfString[6].indexOf("M") == -1) {
        break label186;
      }
      l = Long.parseLong(arrayOfString[6].replace("M", "")) * 1000L * 1024L;
    }
    for (;;)
    {
      localf.d = l;
      localf.a = arrayOfString[8];
      localf.b = arrayOfString[9];
      return localf;
      label186:
      if (arrayOfString[6].indexOf("K") != -1) {
        l = Long.parseLong(arrayOfString[6].replace("K", "")) * 1000L;
      } else if (arrayOfString[6].indexOf("G") != -1) {
        l = Long.parseLong(arrayOfString[6].replace("G", "")) * 1000L * 1024L * 1024L;
      }
    }
  }
  
  public static g a(String paramString)
  {
    Iterator localIterator = b().iterator();
    while (localIterator.hasNext())
    {
      g localg = (g)localIterator.next();
      if (paramString.equals(localg.b)) {
        return localg;
      }
    }
    return null;
  }
  
  public static String a(String[] paramArrayOfString, String paramString)
  {
    k.a(c.class, "#" + paramArrayOfString);
    try
    {
      paramArrayOfString = new ProcessBuilder(paramArrayOfString);
      if (paramString != null) {
        paramArrayOfString.directory(new File(paramString));
      }
      paramArrayOfString.redirectErrorStream(true);
      InputStream localInputStream = paramArrayOfString.start().getInputStream();
      byte[] arrayOfByte = new byte['Ѐ'];
      paramArrayOfString = "";
      paramString.printStackTrace();
    }
    catch (Exception paramString)
    {
      try
      {
        while (localInputStream.read(arrayOfByte) != -1)
        {
          paramString = new String(arrayOfByte);
          paramString = paramArrayOfString + paramString;
          paramArrayOfString = paramString;
        }
        localInputStream.close();
        return paramArrayOfString;
      }
      catch (Exception paramString)
      {
        for (;;) {}
      }
      paramString = paramString;
      paramArrayOfString = "";
    }
    return paramArrayOfString;
  }
  
  public static void a(Context paramContext, int paramInt, String paramString)
  {
    paramContext = (ActivityManager)paramContext.getSystemService("activity");
    try
    {
      if (paramString.indexOf(":") == -1) {}
      for (;;)
      {
        paramContext.killBackgroundProcesses(paramString);
        Method localMethod = paramContext.getClass().getDeclaredMethod("forceStopPackage", new Class[] { String.class });
        localMethod.setAccessible(true);
        localMethod.invoke(paramContext, new Object[] { paramString });
        return;
        paramString = paramString.split(":")[0];
      }
      return;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public static void a(Context paramContext, File paramFile)
  {
    Intent localIntent = new Intent();
    localIntent.addFlags(268435456);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.fromFile(paramFile), "application/vnd.android.package-archive");
    paramContext.startActivity(localIntent);
  }
  
  public static void a(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.DELETE");
    localIntent.setData(Uri.parse("package:" + paramString));
    paramContext.startActivity(localIntent);
  }
  
  public static boolean a(Context paramContext)
  {
    try
    {
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext != null)
      {
        paramContext = paramContext.getActiveNetworkInfo();
        if ((paramContext != null) && (paramContext.isConnected()))
        {
          paramContext = paramContext.getState();
          NetworkInfo.State localState = NetworkInfo.State.CONNECTED;
          if (paramContext == localState) {
            return true;
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
      return false;
    }
    return false;
  }
  
  /* Error */
  public static boolean a(Context paramContext, String paramString, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore_3
    //   5: aconst_null
    //   6: astore 4
    //   8: aconst_null
    //   9: astore 5
    //   11: new 26	java/io/File
    //   14: dup
    //   15: new 140	java/lang/StringBuilder
    //   18: dup
    //   19: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   22: ldc_w 308
    //   25: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: aload_0
    //   29: invokevirtual 311	android/content/Context:getPackageName	()Ljava/lang/String;
    //   32: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc_w 313
    //   38: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_1
    //   42: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokespecial 31	java/io/File:<init>	(Ljava/lang/String;)V
    //   51: astore 7
    //   53: aload 7
    //   55: invokevirtual 316	java/io/File:exists	()Z
    //   58: ifne +222 -> 280
    //   61: aload 7
    //   63: invokevirtual 320	java/io/File:getParentFile	()Ljava/io/File;
    //   66: invokevirtual 316	java/io/File:exists	()Z
    //   69: ifne +12 -> 81
    //   72: aload 7
    //   74: invokevirtual 320	java/io/File:getParentFile	()Ljava/io/File;
    //   77: invokevirtual 323	java/io/File:mkdirs	()Z
    //   80: pop
    //   81: aload 7
    //   83: invokevirtual 326	java/io/File:createNewFile	()Z
    //   86: pop
    //   87: aload_0
    //   88: invokevirtual 330	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   91: iload_2
    //   92: invokevirtual 336	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   95: astore_0
    //   96: aload 4
    //   98: astore_3
    //   99: aload_0
    //   100: astore_1
    //   101: new 338	java/io/FileOutputStream
    //   104: dup
    //   105: aload 7
    //   107: invokespecial 341	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   110: astore 4
    //   112: sipush 1024
    //   115: newarray <illegal type>
    //   117: astore_1
    //   118: aload_0
    //   119: aload_1
    //   120: invokevirtual 188	java/io/InputStream:read	([B)I
    //   123: istore_2
    //   124: iload_2
    //   125: ifle +52 -> 177
    //   128: aload 4
    //   130: aload_1
    //   131: iconst_0
    //   132: iload_2
    //   133: invokevirtual 345	java/io/FileOutputStream:write	([BII)V
    //   136: goto -18 -> 118
    //   139: astore_1
    //   140: aload 4
    //   142: astore 5
    //   144: aload_1
    //   145: astore 4
    //   147: aload 5
    //   149: astore_3
    //   150: aload_0
    //   151: astore_1
    //   152: aload 4
    //   154: invokevirtual 39	java/lang/Exception:printStackTrace	()V
    //   157: aload 5
    //   159: ifnull +8 -> 167
    //   162: aload 5
    //   164: invokevirtual 346	java/io/FileOutputStream:close	()V
    //   167: aload_0
    //   168: ifnull +108 -> 276
    //   171: aload_0
    //   172: invokevirtual 194	java/io/InputStream:close	()V
    //   175: iconst_0
    //   176: ireturn
    //   177: aload 4
    //   179: invokevirtual 349	java/io/FileOutputStream:flush	()V
    //   182: aload 4
    //   184: ifnull +8 -> 192
    //   187: aload 4
    //   189: invokevirtual 346	java/io/FileOutputStream:close	()V
    //   192: aload_0
    //   193: ifnull +85 -> 278
    //   196: aload_0
    //   197: invokevirtual 194	java/io/InputStream:close	()V
    //   200: iconst_1
    //   201: ireturn
    //   202: astore_0
    //   203: iconst_1
    //   204: ireturn
    //   205: astore_0
    //   206: iconst_0
    //   207: ireturn
    //   208: astore 4
    //   210: aconst_null
    //   211: astore_0
    //   212: aload_3
    //   213: ifnull +7 -> 220
    //   216: aload_3
    //   217: invokevirtual 346	java/io/FileOutputStream:close	()V
    //   220: aload_0
    //   221: ifnull +7 -> 228
    //   224: aload_0
    //   225: invokevirtual 194	java/io/InputStream:close	()V
    //   228: aload 4
    //   230: athrow
    //   231: astore_1
    //   232: goto -40 -> 192
    //   235: astore_1
    //   236: goto -69 -> 167
    //   239: astore_1
    //   240: goto -20 -> 220
    //   243: astore_0
    //   244: goto -16 -> 228
    //   247: astore 4
    //   249: aload_1
    //   250: astore_0
    //   251: goto -39 -> 212
    //   254: astore_1
    //   255: aload 4
    //   257: astore_3
    //   258: aload_1
    //   259: astore 4
    //   261: goto -49 -> 212
    //   264: astore 4
    //   266: aconst_null
    //   267: astore_0
    //   268: goto -121 -> 147
    //   271: astore 4
    //   273: goto -126 -> 147
    //   276: iconst_0
    //   277: ireturn
    //   278: iconst_1
    //   279: ireturn
    //   280: aconst_null
    //   281: astore 4
    //   283: aload 6
    //   285: astore_0
    //   286: goto -104 -> 182
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	289	0	paramContext	Context
    //   0	289	1	paramString	String
    //   0	289	2	paramInt	int
    //   4	254	3	localObject1	Object
    //   6	182	4	localObject2	Object
    //   208	21	4	localObject3	Object
    //   247	9	4	localObject4	Object
    //   259	1	4	str	String
    //   264	1	4	localException1	Exception
    //   271	1	4	localException2	Exception
    //   281	1	4	localObject5	Object
    //   9	154	5	localObject6	Object
    //   1	283	6	localObject7	Object
    //   51	55	7	localFile	File
    // Exception table:
    //   from	to	target	type
    //   112	118	139	java/lang/Exception
    //   118	124	139	java/lang/Exception
    //   128	136	139	java/lang/Exception
    //   177	182	139	java/lang/Exception
    //   196	200	202	java/lang/Exception
    //   171	175	205	java/lang/Exception
    //   11	81	208	finally
    //   81	96	208	finally
    //   187	192	231	java/lang/Exception
    //   162	167	235	java/lang/Exception
    //   216	220	239	java/lang/Exception
    //   224	228	243	java/lang/Exception
    //   101	112	247	finally
    //   152	157	247	finally
    //   112	118	254	finally
    //   118	124	254	finally
    //   128	136	254	finally
    //   177	182	254	finally
    //   11	81	264	java/lang/Exception
    //   81	96	264	java/lang/Exception
    //   101	112	271	java/lang/Exception
  }
  
  public static f b(String paramString)
  {
    f localf = new f();
    if (a == null) {
      a = c();
    }
    Iterator localIterator = a.iterator();
    String[] arrayOfString;
    long l;
    while (localIterator.hasNext())
    {
      arrayOfString = (String[])localIterator.next();
      String str = arrayOfString[9];
      if ((str != null) && (str.equals(paramString)))
      {
        localf.c = Integer.parseInt(arrayOfString[0]);
        localf.e = arrayOfString[2];
        localf.f = arrayOfString[3];
        localf.g = arrayOfString[4];
        l = 0L;
        if (arrayOfString[6].indexOf("M") == -1) {
          break label216;
        }
        l = Long.parseLong(arrayOfString[6].replace("M", "")) * 1000L * 1024L;
      }
    }
    for (;;)
    {
      localf.d = l;
      localf.a = arrayOfString[8];
      localf.b = arrayOfString[9];
      if (localf.d == 0L) {
        k.a(c.class, "##" + paramString + ",top -n 1未找到");
      }
      return localf;
      label216:
      if (arrayOfString[6].indexOf("K") != -1) {
        l = Long.parseLong(arrayOfString[6].replace("K", "")) * 1000L;
      } else if (arrayOfString[6].indexOf("G") != -1) {
        l = Long.parseLong(arrayOfString[6].replace("G", "")) * 1000L * 1024L * 1024L;
      }
    }
  }
  
  public static List<g> b()
  {
    new ArrayList();
    String[] arrayOfString = c("ps").split("\n");
    ArrayList localArrayList = new ArrayList();
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      g localg = new g(arrayOfString[i]);
      if (localg.a != null) {
        localArrayList.add(localg);
      }
      i += 1;
    }
    return localArrayList;
  }
  
  public static boolean b(Context paramContext)
  {
    return ((LocationManager)paramContext.getSystemService("location")).isProviderEnabled("gps");
  }
  
  public static boolean b(Context paramContext, String paramString)
  {
    boolean bool = false;
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
    if (paramContext.hasNext())
    {
      if (!paramString.equals(((ActivityManager.RunningServiceInfo)paramContext.next()).service.getClassName())) {
        break label61;
      }
      bool = true;
    }
    label61:
    for (;;)
    {
      break;
      return bool;
    }
  }
  
  public static String c(final String paramString)
  {
    final StringBuilder localStringBuilder;
    Thread localThread2;
    try
    {
      localObject = Runtime.getRuntime().exec(paramString);
      localStringBuilder = new StringBuilder();
      Thread localThread1 = new Thread(new Runnable()
      {
        public void run()
        {
          BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(this.a.getInputStream()), 8192);
          try
          {
            for (;;)
            {
              String str = localBufferedReader.readLine();
              if (str == null) {
                break;
              }
              localStringBuilder.append(str).append("\n");
            }
            try
            {
              localIOException2.close();
              throw ((Throwable)localObject);
            }
            catch (IOException localIOException3)
            {
              for (;;)
              {
                localIOException3.printStackTrace();
              }
            }
          }
          catch (IOException localIOException4)
          {
            localIOException4 = localIOException4;
            localIOException4.printStackTrace();
            for (;;)
            {
              try
              {
                localBufferedReader.close();
                return;
              }
              catch (IOException localIOException2)
              {
                localIOException2.printStackTrace();
                return;
              }
              try
              {
                localBufferedReader.close();
                return;
              }
              catch (IOException localIOException1)
              {
                localIOException1.printStackTrace();
                return;
              }
            }
          }
          finally {}
        }
      });
      localThread1.start();
      paramString = new StringBuilder();
      localThread2 = new Thread(new Runnable()
      {
        public void run()
        {
          BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(this.a.getErrorStream()), 8192);
          try
          {
            for (;;)
            {
              String str = localBufferedReader.readLine();
              if (str == null) {
                break;
              }
              paramString.append(str).append("\n");
            }
            try
            {
              localIOException2.close();
              throw ((Throwable)localObject);
            }
            catch (IOException localIOException3)
            {
              for (;;)
              {
                localIOException3.printStackTrace();
              }
            }
          }
          catch (IOException localIOException4)
          {
            localIOException4 = localIOException4;
            localIOException4.printStackTrace();
            for (;;)
            {
              try
              {
                localBufferedReader.close();
                return;
              }
              catch (IOException localIOException2)
              {
                localIOException2.printStackTrace();
                return;
              }
              try
              {
                localBufferedReader.close();
                return;
              }
              catch (IOException localIOException1)
              {
                localIOException1.printStackTrace();
                return;
              }
            }
          }
          finally {}
        }
      });
      localThread2.start();
      ((Process)localObject).waitFor();
      while (localThread1.isAlive()) {
        Thread.sleep(50L);
      }
      if (!localThread2.isAlive()) {
        break label109;
      }
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
      return null;
    }
    localThread2.interrupt();
    label109:
    Object localObject = localStringBuilder.toString();
    paramString = paramString.toString();
    paramString = (String)localObject + paramString;
    return paramString;
  }
  
  public static List<String[]> c()
  {
    try
    {
      List localList = d(d());
      return localList;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static boolean c(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (paramContext != null) && (paramContext.getType() == 0);
  }
  
  public static boolean c(Context paramContext, String paramString)
  {
    boolean bool = false;
    try
    {
      paramString = new Intent(paramContext, Class.forName(paramString));
      if (paramString != null) {
        bool = paramContext.stopService(paramString);
      }
      return bool;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = null;
      }
    }
  }
  
  public static ApplicationInfo d(Context paramContext, String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramContext = paramContext.getApplicationContext().getPackageManager().getInstalledApplications(8192).iterator();
    while (paramContext.hasNext())
    {
      ApplicationInfo localApplicationInfo = (ApplicationInfo)paramContext.next();
      if (paramString.equals(localApplicationInfo.processName)) {
        return localApplicationInfo;
      }
    }
    return null;
  }
  
  public static DisplayMetrics d(Context paramContext)
  {
    if (paramContext == null) {}
    for (paramContext = Resources.getSystem();; paramContext = paramContext.getResources()) {
      return paramContext.getDisplayMetrics();
    }
  }
  
  public static String d()
  {
    try
    {
      String str = a(new String[] { "/system/bin/top", "-n", "1" }, "/system/bin/");
      return str;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static List<String[]> d(String paramString)
  {
    int j = 0;
    ArrayList localArrayList = new ArrayList();
    paramString = paramString.split("[\n]+");
    int i = 0;
    if (i < paramString.length)
    {
      String[] arrayOfString = paramString[i];
      int k;
      if (arrayOfString.indexOf("PID") == -1)
      {
        k = j;
        if (j == 1)
        {
          arrayOfString = arrayOfString.trim().split("[ ]+");
          k = j;
          if (arrayOfString.length == 10)
          {
            if (!arrayOfString[9].startsWith("/system/bin/")) {
              break label99;
            }
            k = j;
          }
        }
      }
      for (;;)
      {
        i += 1;
        j = k;
        break;
        label99:
        localArrayList.add(arrayOfString);
        k = j;
        continue;
        k = 1;
      }
    }
    return localArrayList;
  }
  
  public static d e()
  {
    try
    {
      d locald = e(d());
      return locald;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static d e(String paramString)
  {
    d locald = new d();
    paramString = paramString.split("[\n]+");
    int i = 0;
    while (i < paramString.length)
    {
      String[] arrayOfString1 = paramString[i];
      if ((arrayOfString1.indexOf("User") != -1) && (arrayOfString1.indexOf("System") != -1))
      {
        arrayOfString1 = arrayOfString1.trim().split(",");
        int j = 0;
        if (j < arrayOfString1.length)
        {
          String[] arrayOfString2 = arrayOfString1[j].trim().split(" ");
          if (j == 0) {
            locald.a = arrayOfString2[1];
          }
          for (;;)
          {
            j += 1;
            break;
            if (j == 1) {
              locald.b = arrayOfString2[1];
            } else if (j == 2) {
              locald.c = arrayOfString2[1];
            } else if (j == 3) {
              locald.d = arrayOfString2[1];
            }
          }
        }
      }
      i += 1;
    }
    return locald;
  }
  
  public static void e(Context paramContext)
  {
    ((InputMethodManager)paramContext.getSystemService("input_method")).toggleSoftInput(0, 2);
  }
  
  public static void f(Context paramContext)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)paramContext.getSystemService("input_method");
    if ((localInputMethodManager != null) && (((Activity)paramContext).getCurrentFocus() != null)) {
      localInputMethodManager.hideSoftInputFromWindow(((Activity)paramContext).getCurrentFocus().getWindowToken(), 2);
    }
  }
  
  public static PackageInfo g(Context paramContext)
  {
    try
    {
      String str = paramContext.getPackageName();
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 1);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
  
  public static List<com.fimi.kernel.a.c> h(Context paramContext)
  {
    for (;;)
    {
      try
      {
        Object localObject2 = (ActivityManager)paramContext.getSystemService("activity");
        PackageManager localPackageManager = paramContext.getApplicationContext().getPackageManager();
        localObject1 = new ArrayList();
        try
        {
          localObject2 = ((ActivityManager)localObject2).getRunningAppProcesses();
          g(paramContext);
          if (a != null) {
            a.clear();
          }
          a = c();
          localObject2 = ((List)localObject2).iterator();
          if (!((Iterator)localObject2).hasNext()) {
            continue;
          }
          localObject3 = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject2).next();
          localc = new com.fimi.kernel.a.c(((ActivityManager.RunningAppProcessInfo)localObject3).processName, ((ActivityManager.RunningAppProcessInfo)localObject3).pid, ((ActivityManager.RunningAppProcessInfo)localObject3).uid);
          Object localObject4 = d(paramContext, ((ActivityManager.RunningAppProcessInfo)localObject3).processName);
          if (localObject4 == null) {
            continue;
          }
          Drawable localDrawable = ((ApplicationInfo)localObject4).loadIcon(localPackageManager);
          localObject4 = ((ApplicationInfo)localObject4).loadLabel(localPackageManager).toString();
          localc.e = localDrawable;
          localc.a = ((String)localObject4);
          localObject3 = b(((ActivityManager.RunningAppProcessInfo)localObject3).processName);
          localc.f = ((f)localObject3).d;
          localc.g = ((f)localObject3).e;
          localc.h = ((f)localObject3).f;
          localc.i = ((f)localObject3).g;
          ((List)localObject1).add(localc);
          continue;
          ((Exception)localObject1).printStackTrace();
        }
        catch (Exception localException2)
        {
          paramContext = (Context)localObject1;
          localObject1 = localException2;
        }
      }
      catch (Exception localException1)
      {
        Object localObject1;
        Object localObject3;
        com.fimi.kernel.a.c localc;
        paramContext = null;
        continue;
      }
      return paramContext;
      if (((ActivityManager.RunningAppProcessInfo)localObject3).processName.indexOf(":") != -1) {
        localc.e = d(paramContext, localObject3.processName.split(":")[0]).loadIcon(localException2);
      }
      localc.a = ((ActivityManager.RunningAppProcessInfo)localObject3).processName;
    }
    return (List<com.fimi.kernel.a.c>)localObject1;
  }
  
  /* Error */
  public static boolean i(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_0
    //   5: invokevirtual 610	android/content/Context:getPackageCodePath	()Ljava/lang/String;
    //   8: astore_0
    //   9: new 140	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   16: ldc_w 612
    //   19: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: aload_0
    //   23: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: astore 4
    //   31: invokestatic 404	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   34: ldc_w 614
    //   37: invokevirtual 408	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   40: astore_0
    //   41: new 616	java/io/DataOutputStream
    //   44: dup
    //   45: aload_0
    //   46: invokevirtual 620	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   49: invokespecial 623	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   52: astore_1
    //   53: aload_1
    //   54: new 140	java/lang/StringBuilder
    //   57: dup
    //   58: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   61: aload 4
    //   63: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: ldc_w 364
    //   69: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   75: invokevirtual 626	java/io/DataOutputStream:writeBytes	(Ljava/lang/String;)V
    //   78: aload_1
    //   79: ldc_w 628
    //   82: invokevirtual 626	java/io/DataOutputStream:writeBytes	(Ljava/lang/String;)V
    //   85: aload_1
    //   86: invokevirtual 629	java/io/DataOutputStream:flush	()V
    //   89: aload_0
    //   90: invokevirtual 422	java/lang/Process:waitFor	()I
    //   93: pop
    //   94: aload_1
    //   95: ifnull +7 -> 102
    //   98: aload_1
    //   99: invokevirtual 630	java/io/DataOutputStream:close	()V
    //   102: aload_0
    //   103: invokevirtual 633	java/lang/Process:destroy	()V
    //   106: iconst_1
    //   107: ireturn
    //   108: astore_0
    //   109: aload_0
    //   110: invokevirtual 39	java/lang/Exception:printStackTrace	()V
    //   113: goto -7 -> 106
    //   116: astore_0
    //   117: aconst_null
    //   118: astore_0
    //   119: aload_3
    //   120: astore_1
    //   121: aload_1
    //   122: ifnull +7 -> 129
    //   125: aload_1
    //   126: invokevirtual 630	java/io/DataOutputStream:close	()V
    //   129: aload_0
    //   130: invokevirtual 633	java/lang/Process:destroy	()V
    //   133: iconst_0
    //   134: ireturn
    //   135: astore_0
    //   136: aload_0
    //   137: invokevirtual 39	java/lang/Exception:printStackTrace	()V
    //   140: iconst_0
    //   141: ireturn
    //   142: astore_1
    //   143: aconst_null
    //   144: astore_0
    //   145: aload_2
    //   146: ifnull +7 -> 153
    //   149: aload_2
    //   150: invokevirtual 630	java/io/DataOutputStream:close	()V
    //   153: aload_0
    //   154: invokevirtual 633	java/lang/Process:destroy	()V
    //   157: aload_1
    //   158: athrow
    //   159: astore_0
    //   160: aload_0
    //   161: invokevirtual 39	java/lang/Exception:printStackTrace	()V
    //   164: goto -7 -> 157
    //   167: astore_1
    //   168: goto -23 -> 145
    //   171: astore_3
    //   172: aload_1
    //   173: astore_2
    //   174: aload_3
    //   175: astore_1
    //   176: goto -31 -> 145
    //   179: astore_1
    //   180: aload_3
    //   181: astore_1
    //   182: goto -61 -> 121
    //   185: astore_2
    //   186: goto -65 -> 121
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	189	0	paramContext	Context
    //   52	74	1	localObject1	Object
    //   142	16	1	localObject2	Object
    //   167	6	1	localObject3	Object
    //   175	1	1	localObject4	Object
    //   179	1	1	localException1	Exception
    //   181	1	1	localObject5	Object
    //   1	173	2	localObject6	Object
    //   185	1	2	localException2	Exception
    //   3	117	3	localObject7	Object
    //   171	10	3	localObject8	Object
    //   29	33	4	str	String
    // Exception table:
    //   from	to	target	type
    //   98	102	108	java/lang/Exception
    //   102	106	108	java/lang/Exception
    //   9	41	116	java/lang/Exception
    //   125	129	135	java/lang/Exception
    //   129	133	135	java/lang/Exception
    //   9	41	142	finally
    //   149	153	159	java/lang/Exception
    //   153	157	159	java/lang/Exception
    //   41	53	167	finally
    //   53	94	171	finally
    //   41	53	179	java/lang/Exception
    //   53	94	185	java/lang/Exception
  }
  
  public static long j(Context paramContext)
  {
    paramContext = (ActivityManager)paramContext.getSystemService("activity");
    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
    paramContext.getMemoryInfo(localMemoryInfo);
    return localMemoryInfo.availMem;
  }
  
  /* Error */
  public static long k(Context paramContext)
  {
    // Byte code:
    //   0: new 648	java/io/BufferedReader
    //   3: dup
    //   4: new 650	java/io/FileReader
    //   7: dup
    //   8: ldc_w 652
    //   11: invokespecial 653	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   14: sipush 8192
    //   17: invokespecial 656	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   20: astore_0
    //   21: aload_0
    //   22: invokevirtual 659	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   25: ldc_w 661
    //   28: invokevirtual 236	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   31: astore 5
    //   33: aload 5
    //   35: arraylength
    //   36: istore_2
    //   37: iconst_0
    //   38: istore_1
    //   39: iload_1
    //   40: iload_2
    //   41: if_icmpge +42 -> 83
    //   44: aload 5
    //   46: iload_1
    //   47: aaload
    //   48: astore 6
    //   50: ldc 2
    //   52: new 140	java/lang/StringBuilder
    //   55: dup
    //   56: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   59: aload 6
    //   61: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: ldc_w 663
    //   67: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   73: invokestatic 159	com/fimi/kernel/utils/k:a	(Ljava/lang/Class;Ljava/lang/String;)V
    //   76: iload_1
    //   77: iconst_1
    //   78: iadd
    //   79: istore_1
    //   80: goto -41 -> 39
    //   83: aload 5
    //   85: iconst_1
    //   86: aaload
    //   87: invokestatic 667	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   90: invokevirtual 670	java/lang/Integer:intValue	()I
    //   93: istore_1
    //   94: iload_1
    //   95: sipush 1024
    //   98: imul
    //   99: i2l
    //   100: lstore_3
    //   101: aload_0
    //   102: invokevirtual 671	java/io/BufferedReader:close	()V
    //   105: lload_3
    //   106: lreturn
    //   107: astore_0
    //   108: lconst_0
    //   109: lstore_3
    //   110: aload_0
    //   111: invokevirtual 39	java/lang/Exception:printStackTrace	()V
    //   114: lload_3
    //   115: lreturn
    //   116: astore_0
    //   117: goto -7 -> 110
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	paramContext	Context
    //   38	61	1	i	int
    //   36	6	2	j	int
    //   100	15	3	l	long
    //   31	53	5	arrayOfString	String[]
    //   48	12	6	str	String
    // Exception table:
    //   from	to	target	type
    //   0	37	107	java/lang/Exception
    //   50	76	107	java/lang/Exception
    //   83	94	107	java/lang/Exception
    //   101	105	116	java/lang/Exception
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */