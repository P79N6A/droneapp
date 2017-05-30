package com.fimi.kernel.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
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
import android.view.inputmethod.InputMethodManager;
import com.fimi.kernel.a.d;
import com.fimi.kernel.a.f;
import com.fimi.kernel.a.g;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.drive.e;
import com.google.firebase.a.a.b;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class c {
    public static List<String[]> a = null;

    public static int a() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() {
                public boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]", file.getName());
                }
            }).length;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public static f a(int i) {
        f fVar = new f();
        if (a == null) {
            a = c();
        }
        String str = "";
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            String[] strArr = (String[]) a.get(i2);
            String str2 = strArr[0];
            if (str2 != null && Integer.parseInt(str2) == i) {
                fVar.c = Integer.parseInt(strArr[0]);
                fVar.e = strArr[2];
                fVar.f = strArr[3];
                fVar.g = strArr[4];
                long j = 0;
                if (strArr[6].indexOf("M") != -1) {
                    j = (Long.parseLong(strArr[6].replace("M", "")) * 1000) * FimiMediaMeta.AV_CH_SIDE_RIGHT;
                } else if (strArr[6].indexOf("K") != -1) {
                    j = Long.parseLong(strArr[6].replace("K", "")) * 1000;
                } else if (strArr[6].indexOf("G") != -1) {
                    j = ((Long.parseLong(strArr[6].replace("G", "")) * 1000) * FimiMediaMeta.AV_CH_SIDE_RIGHT) * FimiMediaMeta.AV_CH_SIDE_RIGHT;
                }
                fVar.d = j;
                fVar.a = strArr[8];
                fVar.b = strArr[9];
                return fVar;
            }
        }
        return fVar;
    }

    public static g a(String str) {
        for (g gVar : b()) {
            if (str.equals(gVar.b)) {
                return gVar;
            }
        }
        return null;
    }

    public static String a(String[] strArr, String str) {
        String str2;
        Exception e;
        String str3 = "";
        k.a(c.class, "#" + strArr);
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(strArr);
            if (str != null) {
                processBuilder.directory(new File(str));
            }
            processBuilder.redirectErrorStream(true);
            InputStream inputStream = processBuilder.start().getInputStream();
            byte[] bArr = new byte[1024];
            str2 = str3;
            while (inputStream.read(bArr) != -1) {
                try {
                    str2 = str2 + new String(bArr);
                } catch (Exception e2) {
                    e = e2;
                }
            }
            inputStream.close();
        } catch (Exception e3) {
            Exception exception = e3;
            str2 = str3;
            e = exception;
            e.printStackTrace();
            return str2;
        }
        return str2;
    }

    public static void a(Context context, int i, String str) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        try {
            if (str.indexOf(":") != -1) {
                str = str.split(":")[0];
            }
            activityManager.killBackgroundProcesses(str);
            Method declaredMethod = activityManager.getClass().getDeclaredMethod("forceStopPackage", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activityManager, new Object[]{str});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(Context context, File file) {
        Intent intent = new Intent();
        intent.addFlags(e.a_);
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
        context.startActivity(intent);
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.DELETE");
        intent.setData(Uri.parse("package:" + str));
        context.startActivity(intent);
    }

    public static boolean a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == State.CONNECTED) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean a(Context context, String str, int i) {
        InputStream openRawResource;
        Exception e;
        Throwable th;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2;
            InputStream inputStream;
            File file = new File("/data/data/" + context.getPackageName() + "/databases/" + str);
            if (file.exists()) {
                fileOutputStream2 = null;
            } else {
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
                openRawResource = context.getResources().openRawResource(i);
                try {
                    fileOutputStream2 = new FileOutputStream(file);
                } catch (Exception e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e3) {
                            }
                        }
                        if (openRawResource != null) {
                            return false;
                        }
                        try {
                            openRawResource.close();
                            return false;
                        } catch (Exception e4) {
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e5) {
                            }
                        }
                        if (openRawResource != null) {
                            try {
                                openRawResource.close();
                            } catch (Exception e6) {
                            }
                        }
                        throw th;
                    }
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openRawResource.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                    fileOutputStream2.flush();
                    inputStream = openRawResource;
                } catch (Exception e7) {
                    Exception exception = e7;
                    fileOutputStream = fileOutputStream2;
                    e = exception;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (openRawResource != null) {
                        return false;
                    }
                    openRawResource.close();
                    return false;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    fileOutputStream = fileOutputStream2;
                    th = th4;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (openRawResource != null) {
                        openRawResource.close();
                    }
                    throw th;
                }
            }
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (Exception e8) {
                }
            }
            if (inputStream == null) {
                return true;
            }
            try {
                inputStream.close();
                return true;
            } catch (Exception e9) {
                return true;
            }
        } catch (Exception e10) {
            e = e10;
            openRawResource = null;
            e.printStackTrace();
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (openRawResource != null) {
                return false;
            }
            openRawResource.close();
            return false;
        } catch (Throwable th5) {
            th = th5;
            openRawResource = null;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (openRawResource != null) {
                openRawResource.close();
            }
            throw th;
        }
    }

    public static f b(String str) {
        f fVar = new f();
        if (a == null) {
            a = c();
        }
        String str2 = "";
        for (String[] strArr : a) {
            String str3 = strArr[9];
            if (str3 != null && str3.equals(str)) {
                fVar.c = Integer.parseInt(strArr[0]);
                fVar.e = strArr[2];
                fVar.f = strArr[3];
                fVar.g = strArr[4];
                long j = 0;
                if (strArr[6].indexOf("M") != -1) {
                    j = (Long.parseLong(strArr[6].replace("M", "")) * 1000) * FimiMediaMeta.AV_CH_SIDE_RIGHT;
                } else if (strArr[6].indexOf("K") != -1) {
                    j = Long.parseLong(strArr[6].replace("K", "")) * 1000;
                } else if (strArr[6].indexOf("G") != -1) {
                    j = ((Long.parseLong(strArr[6].replace("G", "")) * 1000) * FimiMediaMeta.AV_CH_SIDE_RIGHT) * FimiMediaMeta.AV_CH_SIDE_RIGHT;
                }
                fVar.d = j;
                fVar.a = strArr[8];
                fVar.b = strArr[9];
                if (fVar.d == 0) {
                    k.a(c.class, "##" + str + ",top -n 1未找到");
                }
                return fVar;
            }
        }
        if (fVar.d == 0) {
            k.a(c.class, "##" + str + ",top -n 1未找到");
        }
        return fVar;
    }

    public static List<g> b() {
        ArrayList arrayList = new ArrayList();
        String[] split = c("ps").split("\n");
        List<g> arrayList2 = new ArrayList();
        for (String gVar : split) {
            g gVar2 = new g(gVar);
            if (gVar2.a != null) {
                arrayList2.add(gVar2);
            }
        }
        return arrayList2;
    }

    public static boolean b(Context context) {
        return ((LocationManager) context.getSystemService(b.p)).isProviderEnabled("gps");
    }

    public static boolean b(Context context, String str) {
        boolean z = false;
        for (RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            z = str.equals(runningServiceInfo.service.getClassName()) ? true : z;
        }
        return z;
    }

    public static String c(String str) {
        String str2 = "";
        try {
            final Process exec = Runtime.getRuntime().exec(str);
            final StringBuilder stringBuilder = new StringBuilder();
            Thread thread = new Thread(new Runnable() {
                /* JADX WARNING: inconsistent code. */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                    r3 = this;
                    r1 = new java.io.BufferedReader;
                    r0 = new java.io.InputStreamReader;
                    r2 = r0;
                    r2 = r2.getInputStream();
                    r0.<init>(r2);
                    r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
                    r1.<init>(r0, r2);
                L_0x0012:
                    r0 = r1.readLine();	 Catch:{ IOException -> 0x0024 }
                    if (r0 == 0) goto L_0x002c;
                L_0x0018:
                    r2 = r1;	 Catch:{ IOException -> 0x0024 }
                    r0 = r2.append(r0);	 Catch:{ IOException -> 0x0024 }
                    r2 = "\n";
                    r0.append(r2);	 Catch:{ IOException -> 0x0024 }
                    goto L_0x0012;
                L_0x0024:
                    r0 = move-exception;
                    r0.printStackTrace();	 Catch:{ all -> 0x003a }
                    r1.close();	 Catch:{ IOException -> 0x0035 }
                L_0x002b:
                    return;
                L_0x002c:
                    r1.close();	 Catch:{ IOException -> 0x0030 }
                    goto L_0x002b;
                L_0x0030:
                    r0 = move-exception;
                    r0.printStackTrace();
                    goto L_0x002b;
                L_0x0035:
                    r0 = move-exception;
                    r0.printStackTrace();
                    goto L_0x002b;
                L_0x003a:
                    r0 = move-exception;
                    r1.close();	 Catch:{ IOException -> 0x003f }
                L_0x003e:
                    throw r0;
                L_0x003f:
                    r1 = move-exception;
                    r1.printStackTrace();
                    goto L_0x003e;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.fimi.kernel.utils.c.2.run():void");
                }
            });
            thread.start();
            final StringBuilder stringBuilder2 = new StringBuilder();
            Thread thread2 = new Thread(new Runnable() {
                /* JADX WARNING: inconsistent code. */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                    r3 = this;
                    r1 = new java.io.BufferedReader;
                    r0 = new java.io.InputStreamReader;
                    r2 = r0;
                    r2 = r2.getErrorStream();
                    r0.<init>(r2);
                    r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
                    r1.<init>(r0, r2);
                L_0x0012:
                    r0 = r1.readLine();	 Catch:{ IOException -> 0x0024 }
                    if (r0 == 0) goto L_0x002c;
                L_0x0018:
                    r2 = r3;	 Catch:{ IOException -> 0x0024 }
                    r0 = r2.append(r0);	 Catch:{ IOException -> 0x0024 }
                    r2 = "\n";
                    r0.append(r2);	 Catch:{ IOException -> 0x0024 }
                    goto L_0x0012;
                L_0x0024:
                    r0 = move-exception;
                    r0.printStackTrace();	 Catch:{ all -> 0x003a }
                    r1.close();	 Catch:{ IOException -> 0x0035 }
                L_0x002b:
                    return;
                L_0x002c:
                    r1.close();	 Catch:{ IOException -> 0x0030 }
                    goto L_0x002b;
                L_0x0030:
                    r0 = move-exception;
                    r0.printStackTrace();
                    goto L_0x002b;
                L_0x0035:
                    r0 = move-exception;
                    r0.printStackTrace();
                    goto L_0x002b;
                L_0x003a:
                    r0 = move-exception;
                    r1.close();	 Catch:{ IOException -> 0x003f }
                L_0x003e:
                    throw r0;
                L_0x003f:
                    r1 = move-exception;
                    r1.printStackTrace();
                    goto L_0x003e;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.fimi.kernel.utils.c.3.run():void");
                }
            });
            thread2.start();
            exec.waitFor();
            while (thread.isAlive()) {
                Thread.sleep(50);
            }
            if (thread2.isAlive()) {
                thread2.interrupt();
            }
            str2 = stringBuilder.toString();
            return str2 + stringBuilder2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<String[]> c() {
        List<String[]> list = null;
        try {
            list = d(d());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static boolean c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
    }

    public static boolean c(Context context, String str) {
        Intent intent;
        try {
            intent = new Intent(context, Class.forName(str));
        } catch (Exception e) {
            e.printStackTrace();
            intent = null;
        }
        return intent != null ? context.stopService(intent) : false;
    }

    public static ApplicationInfo d(Context context, String str) {
        if (str == null) {
            return null;
        }
        for (ApplicationInfo applicationInfo : context.getApplicationContext().getPackageManager().getInstalledApplications(8192)) {
            if (str.equals(applicationInfo.processName)) {
                return applicationInfo;
            }
        }
        return null;
    }

    public static DisplayMetrics d(Context context) {
        return (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics();
    }

    public static String d() {
        String str = null;
        try {
            str = a(new String[]{"/system/bin/top", "-n", "1"}, "/system/bin/");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public static List<String[]> d(String str) {
        Object obj = null;
        List<String[]> arrayList = new ArrayList();
        String str2 = "";
        String[] split = str.split("[\n]+");
        for (String str3 : split) {
            if (str3.indexOf("PID") != -1) {
                int i = 1;
            } else if (obj == 1) {
                Object split2 = str3.trim().split("[ ]+");
                if (split2.length == 10 && !split2[9].startsWith("/system/bin/")) {
                    arrayList.add(split2);
                }
            }
        }
        return arrayList;
    }

    public static d e() {
        d dVar = null;
        try {
            dVar = e(d());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dVar;
    }

    public static d e(String str) {
        d dVar = new d();
        String str2 = "";
        String[] split = str.split("[\n]+");
        for (String str22 : split) {
            if (!(str22.indexOf("User") == -1 || str22.indexOf("System") == -1)) {
                String[] split2 = str22.trim().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                for (int i = 0; i < split2.length; i++) {
                    String[] split3 = split2[i].trim().split(" ");
                    if (i == 0) {
                        dVar.a = split3[1];
                    } else if (i == 1) {
                        dVar.b = split3[1];
                    } else if (i == 2) {
                        dVar.c = split3[1];
                    } else if (i == 3) {
                        dVar.d = split3[1];
                    }
                }
            }
        }
        return dVar;
    }

    public static void e(Context context) {
        ((InputMethodManager) context.getSystemService("input_method")).toggleSoftInput(0, 2);
    }

    public static void f(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null && ((Activity) context).getCurrentFocus() != null) {
            inputMethodManager.hideSoftInputFromWindow(((Activity) context).getCurrentFocus().getWindowToken(), 2);
        }
    }

    public static PackageInfo g(Context context) {
        PackageInfo packageInfo = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return packageInfo;
    }

    public static List<com.fimi.kernel.a.c> h(Context context) {
        List<com.fimi.kernel.a.c> list;
        Exception exception;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            List<com.fimi.kernel.a.c> arrayList = new ArrayList();
            try {
                List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                g(context);
                if (a != null) {
                    a.clear();
                }
                a = c();
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    com.fimi.kernel.a.c cVar = new com.fimi.kernel.a.c(runningAppProcessInfo.processName, runningAppProcessInfo.pid, runningAppProcessInfo.uid);
                    ApplicationInfo d = d(context, runningAppProcessInfo.processName);
                    if (d != null) {
                        Drawable loadIcon = d.loadIcon(packageManager);
                        String charSequence = d.loadLabel(packageManager).toString();
                        cVar.e = loadIcon;
                        cVar.a = charSequence;
                    } else {
                        if (runningAppProcessInfo.processName.indexOf(":") != -1) {
                            cVar.e = d(context, runningAppProcessInfo.processName.split(":")[0]).loadIcon(packageManager);
                        }
                        cVar.a = runningAppProcessInfo.processName;
                    }
                    f b = b(runningAppProcessInfo.processName);
                    cVar.f = b.d;
                    cVar.g = b.e;
                    cVar.h = b.f;
                    cVar.i = b.g;
                    arrayList.add(cVar);
                }
                return arrayList;
            } catch (Exception e) {
                Exception exception2 = e;
                list = arrayList;
                exception = exception2;
            }
        } catch (Exception e2) {
            exception = e2;
            list = null;
            exception.printStackTrace();
            return list;
        }
    }

    public static boolean i(Context context) {
        Process exec;
        Throwable th;
        DataOutputStream dataOutputStream = null;
        try {
            String str = "chmod 777 " + context.getPackageCodePath();
            exec = Runtime.getRuntime().exec("su");
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(exec.getOutputStream());
                try {
                    dataOutputStream2.writeBytes(str + "\n");
                    dataOutputStream2.writeBytes("exit\n");
                    dataOutputStream2.flush();
                    exec.waitFor();
                    if (dataOutputStream2 != null) {
                        try {
                            dataOutputStream2.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    exec.destroy();
                    return true;
                } catch (Exception e2) {
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            return false;
                        }
                    }
                    exec.destroy();
                    return false;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    dataOutputStream = dataOutputStream2;
                    th = th3;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (Exception e32) {
                            e32.printStackTrace();
                            throw th;
                        }
                    }
                    exec.destroy();
                    throw th;
                }
            } catch (Exception e4) {
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                exec.destroy();
                return false;
            } catch (Throwable th4) {
                th = th4;
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                exec.destroy();
                throw th;
            }
        } catch (Exception e5) {
            exec = null;
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
            exec.destroy();
            return false;
        } catch (Throwable th5) {
            th = th5;
            exec = null;
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
            exec.destroy();
            throw th;
        }
    }

    public static long j(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        MemoryInfo memoryInfo = new MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long k(Context context) {
        long intValue;
        Exception e;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            String[] split = bufferedReader.readLine().split("\\s+");
            for (String str : split) {
                k.a(c.class, str + "\t");
            }
            intValue = (long) (Integer.valueOf(split[1]).intValue() * 1024);
            try {
                bufferedReader.close();
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return intValue;
            }
        } catch (Exception e3) {
            Exception exception = e3;
            intValue = 0;
            e = exception;
            e.printStackTrace();
            return intValue;
        }
        return intValue;
    }
}
