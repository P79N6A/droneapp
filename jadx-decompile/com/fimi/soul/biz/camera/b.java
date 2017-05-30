package com.fimi.soul.biz.camera;

import android.util.Log;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.b.c;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.biz.camera.entity.X11SystemConfigOption;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.utils.j;
import java.io.File;
import java.text.SimpleDateFormat;

public class b {
    private static b b = new b();
    private static final String d = "SP_KEY_IsDownloadAndDelete";
    private static final String e = "SP_KEY_IsTakePhotoByAPI";
    private b a = b.X11;
    private c c = new com.fimi.soul.biz.camera.a.b();
    private a[] f = new a[b.values().length];

    public enum a {
        Thumbnail,
        Video,
        Image,
        Other
    }

    public enum b {
        X11,
        Ant,
        GoPro
    }

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (b == null) {
                b = new b();
            }
            bVar = b;
        }
        return bVar;
    }

    public static String a(X11FileInfo x11FileInfo) {
        return String.format("THUMB_%s", new Object[]{x11FileInfo.getName()});
    }

    public static String a(String str) {
        return String.format("http://%s/%s", new Object[]{e.a(), str});
    }

    public static String a(String str, String str2) {
        return String.format("%s", new Object[]{str});
    }

    public static void a(DroidPlannerApp droidPlannerApp) {
        droidPlannerApp.a.a(((d) a().d()).u());
    }

    private static void a(X11SystemConfig x11SystemConfig, String str, int i, String[] strArr) {
        a(x11SystemConfig, str, i, strArr, strArr);
    }

    private static void a(X11SystemConfig x11SystemConfig, String str, int i, String[] strArr, String[] strArr2) {
        X11SystemConfigOption x11SystemConfigOption = new X11SystemConfigOption();
        x11SystemConfigOption.setType(str);
        x11SystemConfigOption.setOptions(strArr2);
        x11SystemConfigOption.setOptionsText(strArr);
        x11SystemConfigOption.setDefaultOption(strArr2[i]);
        x11SystemConfig.getSystemConfigOptions().put(str, x11SystemConfigOption);
    }

    public static boolean a(WifiDistanceFile wifiDistanceFile) {
        return c(b(wifiDistanceFile));
    }

    public static String b(WifiDistanceFile wifiDistanceFile) {
        try {
            Log.d("Good", "count" + wifiDistanceFile.getName().split("\\.").length + "");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMddhhmmss");
            Log.d("Good", "date:" + wifiDistanceFile.getDateString());
            String format = simpleDateFormat2.format(simpleDateFormat.parse(wifiDistanceFile.getDateString()));
            String format2 = String.format("%s_%s.%s", new Object[]{format, r0[0], r0[1]});
            Log.d("Good", "target file download:" + format2);
            return format2;
        } catch (Exception e) {
            return wifiDistanceFile.getName();
        }
    }

    public static boolean b(String str) {
        return new File(e(str)).exists();
    }

    public static String c(WifiDistanceFile wifiDistanceFile) {
        return String.format("%s%s", new Object[]{j.o(), b(wifiDistanceFile)});
    }

    public static boolean c(String str) {
        File file = new File(d(str));
        return file.exists() && file.length() > 0;
    }

    public static String d(String str) {
        return String.format("%s%s", new Object[]{j.o(), str});
    }

    public static String e(String str) {
        return String.format("%s%s", new Object[]{j.n(), str});
    }

    public static a f(String str) {
        return str.toUpperCase().contains("THUMB_") ? a.Thumbnail : str.toLowerCase().contains(".mp4") ? a.Video : str.toLowerCase().contains(".jpg") ? a.Image : null;
    }

    public void a(boolean z) {
        com.fimi.kernel.c.c().a(e, z);
    }

    public void b(boolean z) {
        com.fimi.kernel.c.c().a(d, z);
    }

    public boolean b() {
        return com.fimi.kernel.c.c().d(e);
    }

    public boolean c() {
        return com.fimi.kernel.c.c().d(d);
    }

    public com.fimi.soul.biz.camera.b.a d() {
        int ordinal = this.a.ordinal();
        switch (this.a) {
            case X11:
                if (this.f[ordinal] == null) {
                    this.f[ordinal] = new d(e());
                    break;
                }
                break;
        }
        return this.f[ordinal];
    }

    public c e() {
        return this.c;
    }

    public b f() {
        return this.a;
    }
}
