package com.tencent.open.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import com.tencent.open.a.f;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.List;

public class SystemUtils
{
  public static final String ACTION_LOGIN = "action_login";
  public static final String ACTION_SHARE = "action_share";
  public static final String H5_SHARE_DATA = "h5_share_data";
  public static final String IS_LOGIN = "is_login";
  public static final String IS_QQ_MOBILE_SHARE = "is_qq_mobile_share";
  public static final String QQDATALINE_CALLBACK_ACTION = "sendToMyComputer";
  public static final String QQFAVORITES_CALLBACK_ACTION = "addToQQFavorites";
  public static final String QQ_SHARE_CALLBACK_ACTION = "shareToQQ";
  public static final String QQ_VERSION_NAME_4_2_0 = "4.2.0";
  public static final String QQ_VERSION_NAME_4_3_0 = "4.3.0";
  public static final String QQ_VERSION_NAME_4_5_0 = "4.5.0";
  public static final String QQ_VERSION_NAME_4_6_0 = "4.6.0";
  public static final String QQ_VERSION_NAME_5_0_0 = "5.0.0";
  public static final String QQ_VERSION_NAME_5_1_0 = "5.1.0";
  public static final String QQ_VERSION_NAME_5_2_0 = "5.2.0";
  public static final String QQ_VERSION_NAME_5_3_0 = "5.3.0";
  public static final String QZONE_SHARE_CALLBACK_ACTION = "shareToQzone";
  public static final String TROOPBAR_CALLBACK_ACTION = "shareToTroopBar";
  private static final String a = f.d + ".SysUtils";
  
  private static long a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    long l = 0L;
    byte[] arrayOfByte = new byte[' '];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length);
      if (i == -1) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
      l += i;
    }
    f.c(a, "-->copy, copyed size is: " + l);
    return l;
  }
  
  public static boolean checkMobileQQ(Context paramContext)
  {
    boolean bool2 = false;
    paramContext = paramContext.getPackageManager();
    try
    {
      paramContext = paramContext.getPackageInfo("com.tencent.mobileqq", 0);
      bool1 = bool2;
      if (paramContext != null) {
        paramContext = paramContext.versionName;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        try
        {
          boolean bool1;
          f.b("MobileQQ verson", paramContext);
          paramContext = paramContext.split("\\.");
          int i = Integer.parseInt(paramContext[0]);
          int j = Integer.parseInt(paramContext[1]);
          if (i <= 4)
          {
            bool1 = bool2;
            if (i == 4)
            {
              bool1 = bool2;
              if (j < 1) {}
            }
          }
          else
          {
            bool1 = true;
          }
          return bool1;
        }
        catch (Exception paramContext)
        {
          paramContext.printStackTrace();
        }
        paramContext = paramContext;
        f.b("checkMobileQQ", "error");
        paramContext.printStackTrace();
        paramContext = null;
      }
    }
    return false;
  }
  
  public static int compareQQVersion(Context paramContext, String paramString)
  {
    return compareVersion(getAppVersionName(paramContext, "com.tencent.mobileqq"), paramString);
  }
  
  public static int compareVersion(String paramString1, String paramString2)
  {
    if ((paramString1 == null) && (paramString2 == null)) {
      return 0;
    }
    if ((paramString1 != null) && (paramString2 == null)) {
      return 1;
    }
    if ((paramString1 == null) && (paramString2 != null)) {
      return -1;
    }
    String[] arrayOfString1 = paramString1.split("\\.");
    String[] arrayOfString2 = paramString2.split("\\.");
    int i = 0;
    for (;;)
    {
      int j;
      int k;
      try
      {
        if ((i < arrayOfString1.length) && (i < arrayOfString2.length))
        {
          j = Integer.parseInt(arrayOfString1[i]);
          k = Integer.parseInt(arrayOfString2[i]);
          if (j < k) {
            return -1;
          }
        }
        else
        {
          if (arrayOfString1.length > i) {
            return 1;
          }
          j = arrayOfString2.length;
          if (j <= i) {
            break;
          }
          return -1;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        return paramString1.compareTo(paramString2);
      }
      if (j > k) {
        return 1;
      }
      i += 1;
    }
  }
  
  /* Error */
  @SuppressLint({"SdCardPath"})
  public static boolean extractSecureLib(String paramString1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 4
    //   6: aconst_null
    //   7: astore 7
    //   9: aconst_null
    //   10: astore 6
    //   12: getstatic 84	com/tencent/open/utils/SystemUtils:a	Ljava/lang/String;
    //   15: new 64	java/lang/StringBuilder
    //   18: dup
    //   19: invokespecial 67	java/lang/StringBuilder:<init>	()V
    //   22: ldc -73
    //   24: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: aload_0
    //   28: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   34: invokestatic 108	com/tencent/open/a/f:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: invokestatic 189	com/tencent/open/utils/Global:getContext	()Landroid/content/Context;
    //   40: astore 9
    //   42: aload 9
    //   44: ifnonnull +13 -> 57
    //   47: getstatic 84	com/tencent/open/utils/SystemUtils:a	Ljava/lang/String;
    //   50: ldc -65
    //   52: invokestatic 108	com/tencent/open/a/f:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   55: iconst_0
    //   56: ireturn
    //   57: aload 9
    //   59: ldc -63
    //   61: iconst_0
    //   62: invokevirtual 197	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   65: astore 8
    //   67: new 199	java/io/File
    //   70: dup
    //   71: aload 9
    //   73: invokevirtual 203	android/content/Context:getFilesDir	()Ljava/io/File;
    //   76: aload_1
    //   77: invokespecial 206	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   80: astore 10
    //   82: aload 10
    //   84: invokevirtual 210	java/io/File:exists	()Z
    //   87: ifne +153 -> 240
    //   90: aload 10
    //   92: invokevirtual 213	java/io/File:getParentFile	()Ljava/io/File;
    //   95: invokevirtual 216	java/io/File:mkdirs	()Z
    //   98: ifeq +9 -> 107
    //   101: aload 10
    //   103: invokevirtual 219	java/io/File:createNewFile	()Z
    //   106: pop
    //   107: aload 9
    //   109: invokevirtual 223	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   112: aload_0
    //   113: invokevirtual 229	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   116: astore_0
    //   117: aload_0
    //   118: astore 5
    //   120: aload 4
    //   122: astore_0
    //   123: aload 5
    //   125: astore 4
    //   127: aload 7
    //   129: astore 6
    //   131: aload 9
    //   133: aload_1
    //   134: iconst_0
    //   135: invokevirtual 233	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   138: astore_1
    //   139: aload_1
    //   140: astore_0
    //   141: aload 5
    //   143: astore 4
    //   145: aload_1
    //   146: astore 6
    //   148: aload 5
    //   150: aload_1
    //   151: invokestatic 235	com/tencent/open/utils/SystemUtils:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   154: pop2
    //   155: aload_1
    //   156: astore_0
    //   157: aload 5
    //   159: astore 4
    //   161: aload_1
    //   162: astore 6
    //   164: aload 8
    //   166: invokeinterface 241 1 0
    //   171: astore 7
    //   173: aload_1
    //   174: astore_0
    //   175: aload 5
    //   177: astore 4
    //   179: aload_1
    //   180: astore 6
    //   182: aload 7
    //   184: ldc -13
    //   186: iload_2
    //   187: invokeinterface 249 3 0
    //   192: pop
    //   193: aload_1
    //   194: astore_0
    //   195: aload 5
    //   197: astore 4
    //   199: aload_1
    //   200: astore 6
    //   202: aload 7
    //   204: invokeinterface 252 1 0
    //   209: pop
    //   210: aload 5
    //   212: ifnull +8 -> 220
    //   215: aload 5
    //   217: invokevirtual 255	java/io/InputStream:close	()V
    //   220: aload_1
    //   221: ifnull +7 -> 228
    //   224: aload_1
    //   225: invokevirtual 256	java/io/OutputStream:close	()V
    //   228: iconst_1
    //   229: ireturn
    //   230: astore 10
    //   232: aload 10
    //   234: invokevirtual 257	java/io/IOException:printStackTrace	()V
    //   237: goto -130 -> 107
    //   240: aload 8
    //   242: ldc -13
    //   244: iconst_0
    //   245: invokeinterface 261 3 0
    //   250: istore_3
    //   251: getstatic 84	com/tencent/open/utils/SystemUtils:a	Ljava/lang/String;
    //   254: new 64	java/lang/StringBuilder
    //   257: dup
    //   258: invokespecial 67	java/lang/StringBuilder:<init>	()V
    //   261: ldc_w 263
    //   264: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: iload_2
    //   268: invokevirtual 266	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   271: ldc_w 268
    //   274: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: iload_3
    //   278: invokevirtual 266	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   281: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   284: invokestatic 108	com/tencent/open/a/f:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   287: iload_2
    //   288: iload_3
    //   289: if_icmpne -182 -> 107
    //   292: iconst_1
    //   293: ireturn
    //   294: astore_1
    //   295: aconst_null
    //   296: astore 5
    //   298: aload 6
    //   300: astore_0
    //   301: aload 5
    //   303: astore 4
    //   305: getstatic 84	com/tencent/open/utils/SystemUtils:a	Ljava/lang/String;
    //   308: ldc_w 270
    //   311: aload_1
    //   312: invokestatic 273	com/tencent/open/a/f:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   315: aload 5
    //   317: ifnull +8 -> 325
    //   320: aload 5
    //   322: invokevirtual 255	java/io/InputStream:close	()V
    //   325: aload 6
    //   327: ifnull -272 -> 55
    //   330: aload 6
    //   332: invokevirtual 256	java/io/OutputStream:close	()V
    //   335: iconst_0
    //   336: ireturn
    //   337: astore_0
    //   338: iconst_0
    //   339: ireturn
    //   340: astore_1
    //   341: aconst_null
    //   342: astore 4
    //   344: aload 5
    //   346: astore_0
    //   347: aload 4
    //   349: ifnull +8 -> 357
    //   352: aload 4
    //   354: invokevirtual 255	java/io/InputStream:close	()V
    //   357: aload_0
    //   358: ifnull +7 -> 365
    //   361: aload_0
    //   362: invokevirtual 256	java/io/OutputStream:close	()V
    //   365: aload_1
    //   366: athrow
    //   367: astore_0
    //   368: goto -148 -> 220
    //   371: astore_0
    //   372: goto -144 -> 228
    //   375: astore_0
    //   376: goto -51 -> 325
    //   379: astore 4
    //   381: goto -24 -> 357
    //   384: astore_0
    //   385: goto -20 -> 365
    //   388: astore_1
    //   389: goto -42 -> 347
    //   392: astore_1
    //   393: goto -95 -> 298
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	396	0	paramString1	String
    //   0	396	1	paramString2	String
    //   0	396	2	paramInt	int
    //   250	40	3	i	int
    //   4	349	4	str1	String
    //   379	1	4	localIOException1	java.io.IOException
    //   1	344	5	str2	String
    //   10	321	6	localObject	Object
    //   7	196	7	localEditor	SharedPreferences.Editor
    //   65	176	8	localSharedPreferences	SharedPreferences
    //   40	92	9	localContext	Context
    //   80	22	10	localFile	File
    //   230	3	10	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   101	107	230	java/io/IOException
    //   107	117	294	java/lang/Exception
    //   330	335	337	java/io/IOException
    //   107	117	340	finally
    //   215	220	367	java/io/IOException
    //   224	228	371	java/io/IOException
    //   320	325	375	java/io/IOException
    //   352	357	379	java/io/IOException
    //   361	365	384	java/io/IOException
    //   131	139	388	finally
    //   148	155	388	finally
    //   164	173	388	finally
    //   182	193	388	finally
    //   202	210	388	finally
    //   305	315	388	finally
    //   131	139	392	java/lang/Exception
    //   148	155	392	java/lang/Exception
    //   164	173	392	java/lang/Exception
    //   182	193	392	java/lang/Exception
    //   202	210	392	java/lang/Exception
  }
  
  public static int getAndroidSDKVersion()
  {
    try
    {
      int i = Integer.valueOf(Build.VERSION.SDK).intValue();
      return i;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return 0;
  }
  
  public static String getAppName(Context paramContext)
  {
    return paramContext.getApplicationInfo().loadLabel(paramContext.getPackageManager()).toString();
  }
  
  public static String getAppSignatureMD5(Context paramContext, String paramString)
  {
    f.a(f.d, "OpenUi, getSignValidString");
    try
    {
      String str = paramContext.getPackageName();
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 64).signatures;
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramContext[0].toByteArray());
      paramContext = Util.toHexString(localMessageDigest.digest());
      localMessageDigest.reset();
      f.b("SystemUtils", "-->sign: " + paramContext);
      localMessageDigest.update(Util.getBytesUTF8(str + "_" + paramContext + "_" + paramString + ""));
      paramContext = Util.toHexString(localMessageDigest.digest());
      paramString.printStackTrace();
    }
    catch (Exception paramString)
    {
      try
      {
        localMessageDigest.reset();
        f.b("SystemUtils", "-->signEncryped: " + paramContext);
        return paramContext;
      }
      catch (Exception paramString)
      {
        for (;;) {}
      }
      paramString = paramString;
      paramContext = "";
    }
    f.b(f.d, "OpenUi, getSignValidString error", paramString);
    return paramContext;
  }
  
  public static String getAppVersionName(Context paramContext, String paramString)
  {
    paramContext = paramContext.getPackageManager();
    try
    {
      paramContext = paramContext.getPackageInfo(paramString, 0).versionName;
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  public static String getRealPathFromUri(Activity paramActivity, Uri paramUri)
  {
    Object localObject = null;
    paramUri = paramActivity.managedQuery(paramUri, new String[] { "_data" }, null, null, null);
    paramActivity = (Activity)localObject;
    if (paramUri != null)
    {
      int i = paramUri.getColumnIndexOrThrow("_data");
      paramUri.moveToFirst();
      paramActivity = paramUri.getString(i);
    }
    return paramActivity;
  }
  
  public static boolean isActivityExist(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null)) {}
    while (paramContext.getPackageManager().queryIntentActivities(paramIntent, 0).size() == 0) {
      return false;
    }
    return true;
  }
  
  public static boolean isAppSignatureValid(Context paramContext, String paramString1, String paramString2)
  {
    boolean bool2 = false;
    f.a(f.d, "OpenUi, validateAppSignatureForPackage");
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString1, 64);
      paramContext = paramContext.signatures;
      int j = paramContext.length;
      int i = 0;
      for (;;)
      {
        boolean bool1 = bool2;
        if (i < j)
        {
          if (Util.encrypt(paramContext[i].toCharsString()).equals(paramString2)) {
            bool1 = true;
          }
        }
        else {
          return bool1;
        }
        i += 1;
      }
      return false;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
  }
  
  @SuppressLint({"SdCardPath"})
  public static boolean isLibExtracted(String paramString, int paramInt)
  {
    Object localObject = Global.getContext();
    if (localObject == null) {
      f.c(a, "-->isSecureLibExtracted, global context is null. ");
    }
    do
    {
      return false;
      paramString = new File(((Context)localObject).getFilesDir(), paramString);
      localObject = ((Context)localObject).getSharedPreferences("secure_lib", 0);
    } while (!paramString.exists());
    int i = ((SharedPreferences)localObject).getInt("version", 0);
    f.c(a, "-->extractSecureLib, libVersion: " + paramInt + " | oldVersion: " + i);
    if (paramInt == i) {
      return true;
    }
    paramString = ((SharedPreferences)localObject).edit();
    paramString.putInt("version", paramInt);
    paramString.commit();
    return false;
  }
  
  public static boolean isSupportMultiTouch()
  {
    Method[] arrayOfMethod = MotionEvent.class.getDeclaredMethods();
    int m = arrayOfMethod.length;
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < m)
    {
      Method localMethod = arrayOfMethod[i];
      if (localMethod.getName().equals("getPointerCount")) {
        k = 1;
      }
      if (localMethod.getName().equals("getPointerId")) {
        j = 1;
      }
      i += 1;
    }
    return (getAndroidSDKVersion() >= 7) || ((k != 0) && (j != 0));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/open/utils/SystemUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */