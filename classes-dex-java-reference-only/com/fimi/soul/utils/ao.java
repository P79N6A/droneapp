package com.fimi.soul.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.location.LocationManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fimi.kernel.utils.x;
import com.fimi.soul.base.a;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.module.login.LoginActivity;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ao
{
  private static Typeface a = null;
  private static Typeface b = null;
  private static MediaPlayer c = null;
  private static MediaPlayer d = null;
  private static MediaPlayer e = null;
  
  public static int a(int paramInt1, int paramInt2)
  {
    return Math.abs((1 << paramInt2 & paramInt1) >> paramInt2);
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    Matrix localMatrix = new Matrix();
    localMatrix.postScale(paramInt1 / i, paramInt2 / j);
    return Bitmap.createBitmap(paramBitmap, 0, 0, i, j, localMatrix, true);
  }
  
  public static Typeface a(AssetManager paramAssetManager)
  {
    if (a == null) {
      a = Typeface.createFromAsset(paramAssetManager, "lanting.TTF");
    }
    return a;
  }
  
  public static String a()
  {
    return Build.MODEL;
  }
  
  public static String a(long paramLong)
  {
    Date localDate = new Date(paramLong);
    return new SimpleDateFormat("MM-dd HH:mm").format(localDate);
  }
  
  public static String a(Context paramContext)
  {
    return "" + Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
  }
  
  public static String a(Context paramContext, Bitmap paramBitmap)
  {
    Object localObject = null;
    paramBitmap = Uri.parse(MediaStore.Images.Media.insertImage(paramContext.getContentResolver(), paramBitmap, null, null));
    for (;;)
    {
      try
      {
        paramBitmap = paramContext.getContentResolver().query(paramBitmap, new String[] { "_data" }, null, null, null);
        if (paramBitmap == null) {}
      }
      finally
      {
        int i;
        paramBitmap = (Bitmap)localObject;
      }
      try
      {
        i = paramBitmap.getColumnIndexOrThrow("_data");
        paramBitmap.moveToFirst();
        paramContext = paramBitmap.getString(i);
        if (paramBitmap != null) {
          paramBitmap.close();
        }
        return paramContext;
      }
      finally {}
    }
    if (paramBitmap != null) {
      paramBitmap.close();
    }
    return null;
    if (paramBitmap != null) {
      paramBitmap.close();
    }
    throw paramContext;
  }
  
  public static String a(Context paramContext, String paramString)
  {
    String str = "";
    try
    {
      paramContext = String.valueOf(paramContext.getPackageManager().getPackageArchiveInfo(paramString, 2).versionName);
      a.a("findAppVersionName version=" + paramContext, ao.class);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = str;
      }
    }
  }
  
  public static String a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return paramString;
    }
    return a(Long.parseLong(paramString));
  }
  
  public static void a(AssetManager paramAssetManager, View paramView)
  {
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      int i = 0;
      while (i < paramView.getChildCount())
      {
        View localView = paramView.getChildAt(i);
        if (localView.getClass().equals(TextView.class)) {
          a(paramAssetManager, new View[] { localView });
        }
        a(paramAssetManager, localView);
        i += 1;
      }
    }
  }
  
  public static void a(AssetManager paramAssetManager, ViewGroup paramViewGroup)
  {
    if (a == null) {
      a = Typeface.createFromAsset(paramAssetManager, "lanting.TTF");
    }
    int i = 0;
    if (i < paramViewGroup.getChildCount())
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof Button)) {
        ((Button)localView).setTypeface(a);
      }
      for (;;)
      {
        i += 1;
        break;
        if ((localView instanceof TextView)) {
          ((TextView)localView).setTypeface(a);
        } else if ((localView instanceof EditText)) {
          ((EditText)localView).setTypeface(a);
        } else if ((localView instanceof ViewGroup)) {
          a(paramAssetManager, (ViewGroup)localView);
        }
      }
    }
  }
  
  public static void a(AssetManager paramAssetManager, View... paramVarArgs)
  {
    if (a == null) {
      a = Typeface.createFromAsset(paramAssetManager, "lanting.TTF");
    }
    int i = 0;
    if (i < paramVarArgs.length)
    {
      paramAssetManager = paramVarArgs[i];
      if ((paramAssetManager instanceof Button)) {
        ((Button)paramAssetManager).setTypeface(a);
      }
      for (;;)
      {
        i += 1;
        break;
        if ((paramAssetManager instanceof TextView)) {
          ((TextView)paramAssetManager).setTypeface(a);
        } else if ((paramAssetManager instanceof EditText)) {
          ((EditText)paramAssetManager).setTypeface(a);
        }
      }
    }
  }
  
  public static void a(TextView paramTextView)
  {
    paramTextView.getPaint().setFakeBoldText(true);
  }
  
  public static boolean a(Context paramContext, Class paramClass)
  {
    paramClass = new Intent(paramContext, paramClass).resolveActivity(paramContext.getPackageManager());
    if (paramClass != null)
    {
      paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(10).iterator();
      while (paramContext.hasNext()) {
        if (((ActivityManager.RunningTaskInfo)paramContext.next()).baseActivity.equals(paramClass)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean a(Bitmap paramBitmap, String paramString)
  {
    try
    {
      paramString = new BufferedOutputStream(new FileOutputStream(paramString, false));
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, paramString);
      paramString.flush();
      paramString.close();
      return true;
    }
    catch (Exception paramBitmap)
    {
      paramBitmap.printStackTrace();
    }
    return false;
  }
  
  public static boolean a(File paramFile)
  {
    if (paramFile != null)
    {
      File localFile = new File(paramFile.getParent() + File.separator + System.currentTimeMillis());
      paramFile.renameTo(localFile);
      return localFile.delete();
    }
    return false;
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    boolean bool2 = false;
    paramString1 = new File(paramString1);
    boolean bool1 = bool2;
    int i;
    if (paramString1.exists())
    {
      paramString1 = paramString1.listFiles();
      i = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (i < paramString1.length)
      {
        if (paramString1[i].getName().equals(paramString2)) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public static boolean a(String paramString, String[] paramArrayOfString)
  {
    boolean bool2 = false;
    int j = paramArrayOfString.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        String str = paramArrayOfString[i];
        if (paramString.toLowerCase().endsWith(str)) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i += 1;
    }
  }
  
  public static Typeface b(AssetManager paramAssetManager)
  {
    if (b == null) {
      b = Typeface.createFromAsset(paramAssetManager, "DIN Alternate Bold.TTF");
    }
    return b;
  }
  
  public static String b()
  {
    return Build.MANUFACTURER;
  }
  
  public static String b(long paramLong)
  {
    Date localDate = new Date(paramLong);
    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(localDate);
  }
  
  public static String b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return paramString;
    }
    return b(Long.parseLong(paramString));
  }
  
  public static void b(AssetManager paramAssetManager, View... paramVarArgs)
  {
    if (b == null) {
      b = Typeface.createFromAsset(paramAssetManager, "DIN Alternate Bold.TTF");
    }
    int i = 0;
    if (i < paramVarArgs.length)
    {
      paramAssetManager = paramVarArgs[i];
      if ((paramAssetManager instanceof Button)) {
        ((Button)paramAssetManager).setTypeface(b);
      }
      for (;;)
      {
        i += 1;
        break;
        if ((paramAssetManager instanceof TextView)) {
          ((TextView)paramAssetManager).setTypeface(b);
        } else if ((paramAssetManager instanceof EditText)) {
          ((EditText)paramAssetManager).setTypeface(b);
        }
      }
    }
  }
  
  private void b(File paramFile)
  {
    if (paramFile.isFile()) {
      a(paramFile);
    }
    while (!paramFile.isDirectory()) {
      return;
    }
    File[] arrayOfFile = paramFile.listFiles();
    if ((arrayOfFile == null) || (arrayOfFile.length == 0))
    {
      a(paramFile);
      return;
    }
    int i = 0;
    while (i < arrayOfFile.length)
    {
      b(arrayOfFile[i]);
      i += 1;
    }
    a(paramFile);
  }
  
  public static boolean b(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if (paramContext != null) {
      return paramContext.isAvailable();
    }
    return false;
  }
  
  public static boolean b(Context paramContext, String paramString)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningServices(50).iterator();
    while (paramContext.hasNext()) {
      if (((ActivityManager.RunningServiceInfo)paramContext.next()).service.getClassName().equals(paramString) == true) {
        return true;
      }
    }
    return false;
  }
  
  public static WifiDistanceFile c(String paramString)
  {
    if (paramString != null)
    {
      HashMap localHashMap = new HashMap();
      Object localObject1 = "/media";
      WifiDistanceFile localWifiDistanceFile = new WifiDistanceFile("/media");
      localWifiDistanceFile.setType(0);
      localWifiDistanceFile.setParentStrDir("/");
      localHashMap.put("/media", localWifiDistanceFile);
      String[] arrayOfString = paramString.split("\n");
      int i = 0;
      paramString = (String)localObject1;
      if (i < arrayOfString.length)
      {
        Object localObject2 = arrayOfString[i];
        a.a("line=" + (String)localObject2, ao.class);
        localObject1 = g((String)localObject2);
        if ((localObject1.length > 1) && (!((String)localObject2).startsWith("/")))
        {
          localObject2 = new WifiDistanceFile(localObject1[2]);
          ((WifiDistanceFile)localObject2).setSize(Long.parseLong(localObject1[1]));
          ((WifiDistanceFile)localObject2).setParentStrDir(paramString);
          if (localObject1[0].startsWith("d"))
          {
            localWifiDistanceFile.setType(0);
            localHashMap.put(paramString + "/" + localObject1[2], localObject2);
            label207:
            localObject1 = (WifiDistanceFile)localHashMap.get(paramString);
            if (localObject1 == null) {
              break label248;
            }
            ((WifiDistanceFile)localObject1).addFile((WifiDistanceFile)localObject2);
            ((WifiDistanceFile)localObject2).setParentDir((WifiDistanceFile)localObject1);
          }
        }
        for (;;)
        {
          i += 1;
          break;
          localWifiDistanceFile.setType(0);
          break label207;
          label248:
          ((WifiDistanceFile)localObject2).setParentDir(null);
          continue;
          if ("/media/:".equalsIgnoreCase((String)localObject2)) {
            paramString = "/media";
          } else {
            paramString = ((String)localObject2).replace(":", "");
          }
        }
      }
      return localWifiDistanceFile;
    }
    return null;
  }
  
  public static String c()
  {
    if (Environment.getExternalStorageState().equals("mounted")) {
      return Environment.getExternalStorageDirectory().getPath();
    }
    return null;
  }
  
  public static String c(long paramLong)
  {
    if (paramLong == 0L) {
      return "0.00B";
    }
    DecimalFormat localDecimalFormat = new DecimalFormat("#.00");
    if (paramLong < 1024L) {
      return localDecimalFormat.format(paramLong) + "B";
    }
    if (paramLong < 1048576L) {
      return localDecimalFormat.format(paramLong / 1024.0D) + "KB";
    }
    if (paramLong < 1073741824L) {
      return localDecimalFormat.format(paramLong / 1048576.0D) + "MB";
    }
    return localDecimalFormat.format(paramLong / 1.073741824E9D) + "GB";
  }
  
  public static boolean c(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (paramContext != null) && (paramContext.isConnected()) && (paramContext.getTypeName().equalsIgnoreCase("WIFI"));
  }
  
  public static boolean c(Context paramContext, String paramString)
  {
    paramContext = paramContext.getAssets();
    if (paramString == null) {
      return false;
    }
    try
    {
      paramContext = paramContext.list("");
      int i = 0;
      while (i < paramContext.length)
      {
        if (paramContext[i].equals(paramString.trim()))
        {
          System.out.println(paramString + "文件存在！！！！");
          return true;
        }
        System.out.println(paramString + "不存在啦！！！！");
        i += 1;
      }
      return false;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
      System.out.println("不存在！");
    }
  }
  
  public static String d()
  {
    return Locale.getDefault().getLanguage();
  }
  
  public static String d(Context paramContext)
  {
    String str = "";
    try
    {
      paramContext = String.valueOf(paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName);
      a.a("findAppVersionName version=" + paramContext, ao.class);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = str;
      }
    }
  }
  
  public static boolean d(Context paramContext, String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return false;
    }
    try
    {
      paramContext.getPackageManager().getApplicationInfo(paramString, 8192);
      return true;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return false;
  }
  
  public static boolean d(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    str2 = null;
    str1 = null;
    try
    {
      paramString = Runtime.getRuntime().exec("ping -c 1 -W 1 " + paramString);
      str1 = paramString;
      str2 = paramString;
      int i = paramString.waitFor();
      if (i == 0) {
        bool1 = true;
      }
      bool2 = bool1;
      if (paramString != null)
      {
        paramString.destroy();
        bool2 = bool1;
      }
    }
    catch (Exception paramString)
    {
      return false;
    }
    finally
    {
      if (str2 == null) {
        break label92;
      }
      str2.destroy();
    }
    return bool2;
  }
  
  public static String e(Context paramContext)
  {
    str = "";
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      paramContext = String.valueOf(i);
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = str;
      }
    }
    a.a("findAppVersionName versionCode=" + paramContext, ao.class);
    return paramContext;
  }
  
  public static boolean e(Context paramContext, String paramString)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    int i = 0;
    while (i < paramContext.size())
    {
      if (((ActivityManager.RunningAppProcessInfo)paramContext.get(i)).processName.equals(paramString))
      {
        Log.i("NotificationLaunch", String.format("the %s is running, isAppAlive return true", new Object[] { paramString }));
        return true;
      }
      i += 1;
    }
    Log.i("NotificationLaunch", String.format("the %s is not running, isAppAlive return false", new Object[] { paramString }));
    return false;
  }
  
  public static boolean e(String paramString)
  {
    return Pattern.compile("[0-9]*").matcher(paramString).matches();
  }
  
  public static String f(Context paramContext)
  {
    int i = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getIpAddress();
    return String.format("%d.%d.%d.%d", new Object[] { Integer.valueOf(i & 0xFF), Integer.valueOf(i >> 8 & 0xFF), Integer.valueOf(i >> 16 & 0xFF), Integer.valueOf(i >> 24 & 0xFF) });
  }
  
  public static String f(String paramString)
  {
    SimpleDateFormat localSimpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat localSimpleDateFormat2 = new SimpleDateFormat("yyyy-MMM-dd_HH:mm:ss", Locale.ENGLISH);
    try
    {
      paramString = localSimpleDateFormat1.format(localSimpleDateFormat2.parse(paramString));
      return paramString;
    }
    catch (ParseException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String g(Context paramContext)
  {
    paramContext = (TelephonyManager)paramContext.getSystemService("phone");
    return Build.MODEL + "," + paramContext.getDeviceId();
  }
  
  private static String[] g(String paramString)
  {
    String[] arrayOfString1 = new String[3];
    String[] arrayOfString2 = paramString.split(" ");
    if (arrayOfString2.length > 9)
    {
      String str = "";
      int i = 0;
      int j = 0;
      if (i < arrayOfString2.length)
      {
        if ("".equalsIgnoreCase(arrayOfString2[i])) {
          paramString = str;
        }
        for (;;)
        {
          i += 1;
          str = paramString;
          break;
          int k = j + 1;
          if (k == 1)
          {
            arrayOfString1[0] = arrayOfString2[i];
            paramString = str;
            j = k;
          }
          else if (k == 5)
          {
            arrayOfString1[1] = arrayOfString2[i];
            paramString = str;
            j = k;
          }
          else
          {
            paramString = str;
            j = k;
            if (k >= 9) {
              if ("".equalsIgnoreCase(str))
              {
                paramString = str + arrayOfString2[i];
                j = k;
              }
              else
              {
                paramString = str + " " + arrayOfString2[i];
                j = k;
              }
            }
          }
        }
      }
      arrayOfString1[2] = str;
      return arrayOfString1;
    }
    return arrayOfString2;
  }
  
  public static void h(Context paramContext)
  {
    try
    {
      Thread.sleep(2000L);
      PendingIntent localPendingIntent = PendingIntent.getActivity(paramContext, 0, new Intent(paramContext.getApplicationContext(), LoginActivity.class), 268435456);
      ((AlarmManager)paramContext.getSystemService("alarm")).set(1, System.currentTimeMillis() + 1000L, localPendingIntent);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        a.a("error : ", ao.class);
      }
    }
  }
  
  /* Error */
  public static Boolean i(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 397
    //   4: invokevirtual 271	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   7: checkcast 399	android/net/ConnectivityManager
    //   10: astore 8
    //   12: aload 8
    //   14: invokevirtual 218	java/lang/Object:getClass	()Ljava/lang/Class;
    //   17: invokevirtual 757	java/lang/Class:getDeclaredMethods	()[Ljava/lang/reflect/Method;
    //   20: astore 9
    //   22: aload 9
    //   24: arraylength
    //   25: istore_2
    //   26: iconst_0
    //   27: istore_1
    //   28: iload_1
    //   29: iload_2
    //   30: if_icmpge +241 -> 271
    //   33: aload 9
    //   35: iload_1
    //   36: aaload
    //   37: astore_0
    //   38: aload_0
    //   39: invokevirtual 760	java/lang/reflect/Method:getName	()Ljava/lang/String;
    //   42: ldc_w 762
    //   45: invokevirtual 366	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   48: ifeq +84 -> 132
    //   51: aload_0
    //   52: aload 8
    //   54: iconst_0
    //   55: anewarray 4	java/lang/Object
    //   58: invokevirtual 766	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   61: checkcast 768	[Ljava/lang/String;
    //   64: checkcast 768	[Ljava/lang/String;
    //   67: astore_0
    //   68: aload 9
    //   70: arraylength
    //   71: istore_2
    //   72: iconst_0
    //   73: istore_1
    //   74: iload_1
    //   75: iload_2
    //   76: if_icmpge +189 -> 265
    //   79: aload 9
    //   81: iload_1
    //   82: aaload
    //   83: astore 7
    //   85: aload 7
    //   87: invokevirtual 760	java/lang/reflect/Method:getName	()Ljava/lang/String;
    //   90: ldc_w 770
    //   93: invokevirtual 366	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   96: ifeq +66 -> 162
    //   99: aload 7
    //   101: aload 8
    //   103: iconst_0
    //   104: anewarray 4	java/lang/Object
    //   107: invokevirtual 766	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   110: checkcast 768	[Ljava/lang/String;
    //   113: checkcast 768	[Ljava/lang/String;
    //   116: astore 7
    //   118: aload_0
    //   119: ifnonnull +60 -> 179
    //   122: iconst_1
    //   123: invokestatic 775	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   126: areturn
    //   127: astore_0
    //   128: aload_0
    //   129: invokevirtual 776	java/lang/IllegalArgumentException:printStackTrace	()V
    //   132: iload_1
    //   133: iconst_1
    //   134: iadd
    //   135: istore_1
    //   136: goto -108 -> 28
    //   139: astore_0
    //   140: aload_0
    //   141: invokevirtual 777	java/lang/IllegalAccessException:printStackTrace	()V
    //   144: goto -12 -> 132
    //   147: astore_0
    //   148: aload_0
    //   149: invokevirtual 778	java/lang/reflect/InvocationTargetException:printStackTrace	()V
    //   152: goto -20 -> 132
    //   155: astore 7
    //   157: aload 7
    //   159: invokevirtual 777	java/lang/IllegalAccessException:printStackTrace	()V
    //   162: iload_1
    //   163: iconst_1
    //   164: iadd
    //   165: istore_1
    //   166: goto -92 -> 74
    //   169: astore 7
    //   171: aload 7
    //   173: invokevirtual 778	java/lang/reflect/InvocationTargetException:printStackTrace	()V
    //   176: goto -14 -> 162
    //   179: aload 7
    //   181: ifnull +75 -> 256
    //   184: aload_0
    //   185: arraylength
    //   186: istore_3
    //   187: iconst_0
    //   188: istore_1
    //   189: iconst_0
    //   190: istore 5
    //   192: iload 5
    //   194: istore 6
    //   196: iload_1
    //   197: iload_3
    //   198: if_icmpge +61 -> 259
    //   201: aload_0
    //   202: iload_1
    //   203: aaload
    //   204: astore 8
    //   206: aload 7
    //   208: arraylength
    //   209: istore 4
    //   211: iconst_0
    //   212: istore_2
    //   213: iload 5
    //   215: istore 6
    //   217: iload_2
    //   218: iload 4
    //   220: if_icmpge +18 -> 238
    //   223: aload 8
    //   225: aload 7
    //   227: iload_2
    //   228: aaload
    //   229: invokevirtual 780	java/lang/String:matches	(Ljava/lang/String;)Z
    //   232: ifeq +17 -> 249
    //   235: iconst_1
    //   236: istore 6
    //   238: iload_1
    //   239: iconst_1
    //   240: iadd
    //   241: istore_1
    //   242: iload 6
    //   244: istore 5
    //   246: goto -54 -> 192
    //   249: iload_2
    //   250: iconst_1
    //   251: iadd
    //   252: istore_2
    //   253: goto -40 -> 213
    //   256: iconst_0
    //   257: istore 6
    //   259: iload 6
    //   261: invokestatic 775	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   264: areturn
    //   265: aconst_null
    //   266: astore 7
    //   268: goto -150 -> 118
    //   271: aconst_null
    //   272: astore_0
    //   273: goto -205 -> 68
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	276	0	paramContext	Context
    //   27	215	1	i	int
    //   25	228	2	j	int
    //   186	13	3	k	int
    //   209	12	4	m	int
    //   190	55	5	bool1	boolean
    //   194	66	6	bool2	boolean
    //   83	34	7	localObject1	Object
    //   155	3	7	localIllegalAccessException	IllegalAccessException
    //   169	57	7	localInvocationTargetException	java.lang.reflect.InvocationTargetException
    //   266	1	7	localObject2	Object
    //   10	214	8	localConnectivityManager	ConnectivityManager
    //   20	60	9	arrayOfMethod	java.lang.reflect.Method[]
    // Exception table:
    //   from	to	target	type
    //   51	68	127	java/lang/IllegalArgumentException
    //   51	68	139	java/lang/IllegalAccessException
    //   51	68	147	java/lang/reflect/InvocationTargetException
    //   99	118	155	java/lang/IllegalAccessException
    //   99	118	169	java/lang/reflect/InvocationTargetException
  }
  
  public static boolean j(Context paramContext)
  {
    String str = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getPackageName();
    return (!TextUtils.isEmpty(str)) && (str.equals(paramContext.getPackageName()));
  }
  
  public static void k(Context paramContext)
  {
    c = MediaPlayer.create(paramContext, 2131230722);
    c.setVolume(1.0F, 1.0F);
    d = MediaPlayer.create(paramContext, 2131230723);
    d.setVolume(1.0F, 1.0F);
    e = MediaPlayer.create(paramContext, 2131230720);
    e.setVolume(1.0F, 1.0F);
  }
  
  public static void l(Context paramContext)
  {
    if (c != null) {
      x.a(new Runnable()
      {
        public void run()
        {
          if (!ao.e().isPlaying()) {
            ao.e().start();
          }
        }
      });
    }
  }
  
  public static void m(Context paramContext)
  {
    if (d != null) {
      x.a(new Runnable()
      {
        public void run()
        {
          if (!ao.f().isPlaying()) {
            ao.f().start();
          }
        }
      });
    }
  }
  
  public static void n(Context paramContext)
  {
    if (e != null) {
      x.a(new Runnable()
      {
        public void run()
        {
          if (!ao.g().isPlaying()) {
            ao.g().start();
          }
        }
      });
    }
  }
  
  public static String o(Context paramContext)
  {
    return "/data/data/" + paramContext.getPackageName() + "/databases/NoFlyZone-V1.0.0-DB.sqlite";
  }
  
  public static boolean p(Context paramContext)
  {
    paramContext = (LocationManager)paramContext.getSystemService("location");
    boolean bool1 = paramContext.isProviderEnabled("gps");
    boolean bool2 = paramContext.isProviderEnabled("network");
    return (bool1) || (bool2);
  }
  
  public static boolean q(Context paramContext)
  {
    return (paramContext.getApplicationInfo().flags & 0x2) != 0;
  }
  
  public static boolean r(Context paramContext)
  {
    Iterator localIterator = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
    while (localIterator.hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
      if (localRunningAppProcessInfo.processName.equals(paramContext.getPackageName()))
      {
        Log.i(paramContext.getPackageName(), "此appimportace =" + localRunningAppProcessInfo.importance + ",context.getClass().getName()=" + paramContext.getClass().getName());
        if (localRunningAppProcessInfo.importance != 100)
        {
          Log.i(paramContext.getPackageName(), "处于后台" + localRunningAppProcessInfo.processName);
          return true;
        }
        Log.i(paramContext.getPackageName(), "处于前台" + localRunningAppProcessInfo.processName);
        return false;
      }
    }
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */