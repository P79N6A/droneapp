package com.fimi.soul.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
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
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fimi.kernel.utils.x;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.a;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.fimi.soul.module.login.LoginActivity;
import com.google.android.gms.drive.e;
import com.google.firebase.a.a.b;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public class ao {
    private static Typeface a = null;
    private static Typeface b = null;
    private static MediaPlayer c = null;
    private static MediaPlayer d = null;
    private static MediaPlayer e = null;

    public static int a(int i, int i2) {
        return Math.abs(((1 << i2) & i) >> i2);
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i) / ((float) width), ((float) i2) / ((float) height));
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Typeface a(AssetManager assetManager) {
        if (a == null) {
            a = Typeface.createFromAsset(assetManager, "lanting.TTF");
        }
        return a;
    }

    public static String a() {
        return Build.MODEL;
    }

    public static String a(long j) {
        return new SimpleDateFormat(a.m).format(new Date(j));
    }

    public static String a(Context context) {
        return "" + Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String a(Context context, Bitmap bitmap) {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(Uri.parse(Media.insertImage(context.getContentResolver(), bitmap, null, null)), new String[]{"_data"}, null, null, null);
            if (query != null) {
                try {
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                    query.moveToFirst();
                    String string = query.getString(columnIndexOrThrow);
                    if (query == null) {
                        return string;
                    }
                    query.close();
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static String a(Context context, String str) {
        String str2 = "";
        try {
            str2 = String.valueOf(context.getPackageManager().getPackageArchiveInfo(str, 2).versionName);
        } catch (Exception e) {
        }
        a.a("findAppVersionName version=" + str2, ao.class);
        return str2;
    }

    public static String a(String str) {
        return TextUtils.isEmpty(str) ? str : a(Long.parseLong(str));
    }

    public static void a(AssetManager assetManager, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getClass().equals(TextView.class)) {
                    a(assetManager, childAt);
                }
                a(assetManager, childAt);
            }
        }
    }

    public static void a(AssetManager assetManager, ViewGroup viewGroup) {
        if (a == null) {
            a = Typeface.createFromAsset(assetManager, "lanting.TTF");
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Button) {
                ((Button) childAt).setTypeface(a);
            } else if (childAt instanceof TextView) {
                ((TextView) childAt).setTypeface(a);
            } else if (childAt instanceof EditText) {
                ((EditText) childAt).setTypeface(a);
            } else if (childAt instanceof ViewGroup) {
                a(assetManager, (ViewGroup) childAt);
            }
        }
    }

    public static void a(AssetManager assetManager, View... viewArr) {
        if (a == null) {
            a = Typeface.createFromAsset(assetManager, "lanting.TTF");
        }
        for (View view : viewArr) {
            if (view instanceof Button) {
                ((Button) view).setTypeface(a);
            } else if (view instanceof TextView) {
                ((TextView) view).setTypeface(a);
            } else if (view instanceof EditText) {
                ((EditText) view).setTypeface(a);
            }
        }
    }

    public static void a(TextView textView) {
        textView.getPaint().setFakeBoldText(true);
    }

    public static boolean a(Context context, Class cls) {
        ComponentName resolveActivity = new Intent(context, cls).resolveActivity(context.getPackageManager());
        if (resolveActivity != null) {
            for (RunningTaskInfo runningTaskInfo : ((ActivityManager) context.getSystemService("activity")).getRunningTasks(10)) {
                if (runningTaskInfo.baseActivity.equals(resolveActivity)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Bitmap bitmap, String str) {
        try {
            OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str, false));
            bitmap.compress(CompressFormat.JPEG, 100, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean a(File file) {
        if (file == null) {
            return false;
        }
        File file2 = new File(file.getParent() + File.separator + System.currentTimeMillis());
        file.renameTo(file2);
        return file2.delete();
    }

    public static boolean a(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        for (File name : listFiles) {
            if (name.getName().equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, String[] strArr) {
        for (String endsWith : strArr) {
            if (str.toLowerCase().endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }

    public static Typeface b(AssetManager assetManager) {
        if (b == null) {
            b = Typeface.createFromAsset(assetManager, "DIN Alternate Bold.TTF");
        }
        return b;
    }

    public static String b() {
        return Build.MANUFACTURER;
    }

    public static String b(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? str : b(Long.parseLong(str));
    }

    public static void b(AssetManager assetManager, View... viewArr) {
        if (b == null) {
            b = Typeface.createFromAsset(assetManager, "DIN Alternate Bold.TTF");
        }
        for (View view : viewArr) {
            if (view instanceof Button) {
                ((Button) view).setTypeface(b);
            } else if (view instanceof TextView) {
                ((TextView) view).setTypeface(b);
            } else if (view instanceof EditText) {
                ((EditText) view).setTypeface(b);
            }
        }
    }

    private void b(File file) {
        if (file.isFile()) {
            a(file);
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                a(file);
                return;
            }
            for (File b : listFiles) {
                b(b);
            }
            a(file);
        }
    }

    public static boolean b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null ? activeNetworkInfo.isAvailable() : false;
    }

    public static boolean b(Context context, String str) {
        for (RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService("activity")).getRunningServices(50)) {
            if (runningServiceInfo.service.getClassName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static WifiDistanceFile c(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str2 = "/media";
        WifiDistanceFile wifiDistanceFile = new WifiDistanceFile(str2);
        wifiDistanceFile.setType(0);
        wifiDistanceFile.setParentStrDir("/");
        hashMap.put(str2, wifiDistanceFile);
        String[] split = str.split("\n");
        int i = 0;
        while (i < split.length) {
            String str3 = split[i];
            a.a("line=" + str3, ao.class);
            String[] g = g(str3);
            if (g.length <= 1 || str3.startsWith("/")) {
                str3 = "/media/:".equalsIgnoreCase(str3) ? "/media" : str3.replace(":", "");
            } else {
                WifiDistanceFile wifiDistanceFile2 = new WifiDistanceFile(g[2]);
                wifiDistanceFile2.setSize(Long.parseLong(g[1]));
                wifiDistanceFile2.setParentStrDir(str2);
                if (g[0].startsWith("d")) {
                    wifiDistanceFile.setType(0);
                    hashMap.put(str2 + "/" + g[2], wifiDistanceFile2);
                } else {
                    wifiDistanceFile.setType(0);
                }
                WifiDistanceFile wifiDistanceFile3 = (WifiDistanceFile) hashMap.get(str2);
                if (wifiDistanceFile3 != null) {
                    wifiDistanceFile3.addFile(wifiDistanceFile2);
                    wifiDistanceFile2.setParentDir(wifiDistanceFile3);
                } else {
                    wifiDistanceFile2.setParentDir(null);
                }
                str3 = str2;
            }
            i++;
            str2 = str3;
        }
        return wifiDistanceFile;
    }

    public static String c() {
        return Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory().getPath() : null;
    }

    public static String c(long j) {
        if (j == 0) {
            return "0.00B";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String str = "";
        return j < FimiMediaMeta.AV_CH_SIDE_RIGHT ? decimalFormat.format((double) j) + "B" : j < 1048576 ? decimalFormat.format(((double) j) / 1024.0d) + "KB" : j < FimiMediaMeta.AV_CH_STEREO_RIGHT ? decimalFormat.format(((double) j) / 1048576.0d) + "MB" : decimalFormat.format(((double) j) / 1.073741824E9d) + "GB";
    }

    public static boolean c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI");
    }

    public static boolean c(Context context, String str) {
        AssetManager assets = context.getAssets();
        if (str == null) {
            return false;
        }
        try {
            String[] list = assets.list("");
            for (String equals : list) {
                if (equals.equals(str.trim())) {
                    System.out.println(str + "文件存在！！！！");
                    return true;
                }
                System.out.println(str + "不存在啦！！！！");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("不存在！");
        return false;
    }

    public static String d() {
        return Locale.getDefault().getLanguage();
    }

    public static String d(Context context) {
        String str = "";
        try {
            str = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (Exception e) {
        }
        a.a("findAppVersionName version=" + str, ao.class);
        return str;
    }

    public static boolean d(Context context, String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        try {
            context.getPackageManager().getApplicationInfo(str, 8192);
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static boolean d(String str) {
        boolean z = false;
        Process process = null;
        try {
            process = Runtime.getRuntime().exec("ping -c 1 -W 1 " + str);
            if (process.waitFor() == 0) {
                z = true;
            }
            if (process != null) {
                process.destroy();
            }
        } catch (Exception e) {
            if (process != null) {
                process.destroy();
            }
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
        }
        return z;
    }

    public static String e(Context context) {
        String str = "";
        try {
            str = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception e) {
        }
        a.a("findAppVersionName versionCode=" + str, ao.class);
        return str;
    }

    public static boolean e(Context context, String str) {
        List runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        for (int i = 0; i < runningAppProcesses.size(); i++) {
            if (((RunningAppProcessInfo) runningAppProcesses.get(i)).processName.equals(str)) {
                Log.i("NotificationLaunch", String.format("the %s is running, isAppAlive return true", new Object[]{str}));
                return true;
            }
        }
        Log.i("NotificationLaunch", String.format("the %s is not running, isAppAlive return false", new Object[]{str}));
        return false;
    }

    public static boolean e(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public static String f(Context context) {
        int ipAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        return String.format("%d.%d.%d.%d", new Object[]{Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255)});
    }

    public static String f(String str) {
        String str2 = null;
        try {
            str2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new SimpleDateFormat("yyyy-MMM-dd_HH:mm:ss", Locale.ENGLISH).parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return str2;
    }

    public static String g(Context context) {
        return Build.MODEL + Constants.ACCEPT_TIME_SEPARATOR_SP + ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
    }

    private static String[] g(String str) {
        String[] strArr = new String[3];
        String[] split = str.split(" ");
        if (split.length <= 9) {
            return split;
        }
        String str2 = "";
        int i = 0;
        for (int i2 = 0; i2 < split.length; i2++) {
            if (!"".equalsIgnoreCase(split[i2])) {
                i++;
                if (i == 1) {
                    strArr[0] = split[i2];
                } else if (i == 5) {
                    strArr[1] = split[i2];
                } else if (i >= 9) {
                    str2 = "".equalsIgnoreCase(str2) ? str2 + split[i2] : str2 + " " + split[i2];
                }
            }
        }
        strArr[2] = str2;
        return strArr;
    }

    public static void h(Context context) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            a.a("error : ", ao.class);
        }
        ((AlarmManager) context.getSystemService("alarm")).set(1, System.currentTimeMillis() + 1000, PendingIntent.getActivity(context, 0, new Intent(context.getApplicationContext(), LoginActivity.class), e.a_));
    }

    public static Boolean i(Context context) {
        String[] strArr;
        String[] strArr2;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Method[] declaredMethods = connectivityManager.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            if (method.getName().equals("getTetheredIfaces")) {
                try {
                    strArr = (String[]) method.invoke(connectivityManager, new Object[0]);
                    break;
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (InvocationTargetException e3) {
                    e3.printStackTrace();
                }
            } else {
                i++;
            }
        }
        strArr = null;
        int length2 = declaredMethods.length;
        length = 0;
        while (length < length2) {
            method = declaredMethods[length];
            if (method.getName().equals("getTetherableUsbRegexs")) {
                try {
                    strArr2 = (String[]) method.invoke(connectivityManager, new Object[0]);
                    break;
                } catch (IllegalAccessException e22) {
                    e22.printStackTrace();
                } catch (InvocationTargetException e32) {
                    e32.printStackTrace();
                }
            } else {
                length++;
            }
        }
        strArr2 = null;
        if (strArr == null) {
            return Boolean.valueOf(true);
        }
        boolean z;
        if (strArr2 != null) {
            z = false;
            for (String str : strArr) {
                for (String matches : strArr2) {
                    if (str.matches(matches)) {
                        z = true;
                        break;
                    }
                }
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static boolean j(Context context) {
        Object packageName = ((RunningTaskInfo) ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getPackageName();
        return !TextUtils.isEmpty(packageName) && packageName.equals(context.getPackageName());
    }

    public static void k(Context context) {
        c = MediaPlayer.create(context, R.raw.video_record_end);
        c.setVolume(1.0f, 1.0f);
        d = MediaPlayer.create(context, R.raw.video_record_start);
        d.setVolume(1.0f, 1.0f);
        e = MediaPlayer.create(context, R.raw.camera_click);
        e.setVolume(1.0f, 1.0f);
    }

    public static void l(Context context) {
        if (c != null) {
            x.a(new Runnable() {
                public void run() {
                    if (!ao.c.isPlaying()) {
                        ao.c.start();
                    }
                }
            });
        }
    }

    public static void m(Context context) {
        if (d != null) {
            x.a(new Runnable() {
                public void run() {
                    if (!ao.d.isPlaying()) {
                        ao.d.start();
                    }
                }
            });
        }
    }

    public static void n(Context context) {
        if (e != null) {
            x.a(new Runnable() {
                public void run() {
                    if (!ao.e.isPlaying()) {
                        ao.e.start();
                    }
                }
            });
        }
    }

    public static String o(Context context) {
        return "/data/data/" + context.getPackageName() + "/databases/NoFlyZone-V1.0.0-DB.sqlite";
    }

    public static boolean p(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService(b.p);
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    public static boolean q(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean r(Context context) {
        for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equals(context.getPackageName())) {
                Log.i(context.getPackageName(), "此appimportace =" + runningAppProcessInfo.importance + ",context.getClass().getName()=" + context.getClass().getName());
                if (runningAppProcessInfo.importance != 100) {
                    Log.i(context.getPackageName(), "处于后台" + runningAppProcessInfo.processName);
                    return true;
                }
                Log.i(context.getPackageName(), "处于前台" + runningAppProcessInfo.processName);
                return false;
            }
        }
        return false;
    }
}
