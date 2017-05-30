package com.xiaomi.market.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.fimi.soul.media.player.IMediaPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

public class a {
    static String COUNTRY;
    static String LANGUAGE;
    static String RELEASE;
    static final int a = 0;
    static int b;
    static int c;
    static String d;
    static int e;
    static int f;
    static String g;
    static ArrayList h;
    static ArrayList i;
    static ArrayList j;
    static int k;
    static String l;
    static String m;
    static String n;
    private static final Object o = new Object();

    private static void a() {
        Object b = b();
        synchronized (o) {
            j = new ArrayList();
            if (!TextUtils.isEmpty(b)) {
                for (CharSequence charSequence : TextUtils.split(b, " ")) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        j.add(charSequence);
                    }
                }
            }
            Collections.sort(j);
        }
    }

    static void a(Context context) {
        b(context);
        c(context);
        d(context);
        e(context);
        a();
        f(context);
        g(context);
        h(context);
    }

    private static String b() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY || !egl10.eglInitialize(eglGetDisplay, new int[2])) {
            return null;
        }
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!egl10.eglChooseConfig(eglGetDisplay, new int[]{12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, eGLConfigArr, 1, iArr)) {
            return null;
        }
        EGLConfig eGLConfig = iArr[0] > 0 ? eGLConfigArr[0] : null;
        EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, null);
        EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 480, 12374, IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING, 12344});
        if (eglCreatePbufferSurface == null || eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE) {
            return null;
        }
        egl10.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
        if (!egl10.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
            return null;
        }
        String glGetString = ((GL10) eglCreateContext.getGL()).glGetString(7939);
        egl10.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
        egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
        egl10.eglTerminate(eglGetDisplay);
        return glGetString != null ? glGetString.trim() : null;
    }

    private static void b(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        c = displayMetrics.heightPixels;
        b = displayMetrics.widthPixels;
        d = c + "*" + b;
        e = displayMetrics.densityDpi;
    }

    private static void c(Context context) {
        ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo();
        f = deviceConfigurationInfo.reqTouchScreen;
        g = deviceConfigurationInfo.getGlEsVersion();
    }

    static boolean c() {
        return k >= 13;
    }

    private static void d(Context context) {
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        synchronized (o) {
            h = new ArrayList();
            if (systemAvailableFeatures != null) {
                for (FeatureInfo featureInfo : systemAvailableFeatures) {
                    if (!TextUtils.isEmpty(featureInfo.name)) {
                        h.add(featureInfo.name);
                    }
                }
            }
            Collections.sort(h);
        }
    }

    static boolean d() {
        return k >= 11;
    }

    private static void e(Context context) {
        String[] systemSharedLibraryNames = context.getPackageManager().getSystemSharedLibraryNames();
        synchronized (o) {
            i = new ArrayList();
            if (systemSharedLibraryNames != null) {
                for (CharSequence charSequence : systemSharedLibraryNames) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        i.add(charSequence);
                    }
                }
            }
            Collections.sort(i);
        }
    }

    private static void f(Context context) {
        RELEASE = VERSION.RELEASE;
        l = VERSION.INCREMENTAL;
        k = VERSION.SDK_INT;
    }

    private static void g(Context context) {
        COUNTRY = Locale.getDefault().getCountry();
        LANGUAGE = Locale.getDefault().getLanguage();
    }

    private static void h(Context context) {
        Object obj;
        CharSequence deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            obj = "";
        } else {
            CharSequence charSequence = deviceId;
        }
        m = obj;
        Object macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        StringBuffer stringBuffer = new StringBuffer();
        if (!TextUtils.isEmpty(obj)) {
            stringBuffer.append(obj);
        }
        if (!TextUtils.isEmpty(macAddress)) {
            stringBuffer.append("_");
            stringBuffer.append(macAddress);
        }
        n = b.a(stringBuffer.toString());
    }
}
