package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.xiaomi.market.sdk.j;
import com.xiaomi.mipush.sdk.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@aaa
public class zz implements UncaughtExceptionHandler {
    @Nullable
    private UncaughtExceptionHandler a;
    @Nullable
    private UncaughtExceptionHandler b;
    private Context c;
    private VersionInfoParcel d;

    public zz(Context context, VersionInfoParcel versionInfoParcel, @Nullable UncaughtExceptionHandler uncaughtExceptionHandler, @Nullable UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.a = uncaughtExceptionHandler;
        this.b = uncaughtExceptionHandler2;
        this.c = context;
        this.d = versionInfoParcel;
    }

    public static zz a(Context context, Thread thread, VersionInfoParcel versionInfoParcel) {
        if (context == null || thread == null || versionInfoParcel == null) {
            return null;
        }
        if (!a(context)) {
            return null;
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
        UncaughtExceptionHandler zzVar = new zz(context, versionInfoParcel, uncaughtExceptionHandler, Thread.getDefaultUncaughtExceptionHandler());
        if (uncaughtExceptionHandler != null && (uncaughtExceptionHandler instanceof zz)) {
            return (zz) uncaughtExceptionHandler;
        }
        try {
            thread.setUncaughtExceptionHandler(zzVar);
            return zzVar;
        } catch (Throwable e) {
            b.c("Fail to set UncaughtExceptionHandler.", e);
            return null;
        }
    }

    private static boolean a(Context context) {
        return ((Boolean) uf.g.c()).booleanValue();
    }

    private Throwable c(Throwable th) {
        if (((Boolean) uf.h.c()).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3;
            Throwable th4 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th4.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
            int i = 0;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (a(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    i = 1;
                } else if (b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                } else {
                    arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                }
            }
            if (i != 0) {
                th3 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            } else {
                th3 = th2;
            }
            th2 = th3;
        }
        return th2;
    }

    String a(Class cls, Throwable th, String str) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new Builder().scheme(UriUtil.HTTPS_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(j.ac, VERSION.RELEASE).appendQueryParameter("api", String.valueOf(VERSION.SDK_INT)).appendQueryParameter("device", u.e().e()).appendQueryParameter("js", this.d.b).appendQueryParameter("appid", this.c.getApplicationContext().getPackageName()).appendQueryParameter("exceptiontype", cls.getName()).appendQueryParameter("stacktrace", stringWriter.toString()).appendQueryParameter("eids", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, uf.a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "133155058").appendQueryParameter("rc", "dev").toString();
    }

    public void a(Throwable th, String str) {
        if (a(this.c)) {
            Throwable c = c(th);
            if (c != null) {
                Class cls = th.getClass();
                List arrayList = new ArrayList();
                arrayList.add(a(cls, c, str));
                u.e().a(arrayList, u.i().h());
            }
        }
    }

    protected boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) uf.i.c())) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(aaa.class);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "Fail to check class type for class ";
            String valueOf = String.valueOf(str);
            b.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            return false;
        }
    }

    protected boolean a(Throwable th) {
        boolean z = true;
        if (th == null) {
            return false;
        }
        boolean z2 = false;
        boolean z3 = false;
        while (th != null) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (a(stackTraceElement.getClassName())) {
                    z3 = true;
                }
                if (getClass().getName().equals(stackTraceElement.getClassName())) {
                    z2 = true;
                }
            }
            th = th.getCause();
        }
        if (!z3 || r2) {
            z = false;
        }
        return z;
    }

    public void b(Throwable th) {
        a(th, "");
    }

    protected boolean b(String str) {
        return TextUtils.isEmpty(str) ? false : str.startsWith("android.") || str.startsWith("java.");
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (a(th)) {
            if (Looper.getMainLooper().getThread() != thread) {
                a(th, "AdMobExceptionReporter.uncaughtException");
                return;
            }
            b(th);
        }
        if (this.a != null) {
            this.a.uncaughtException(thread, th);
        } else if (this.b != null) {
            this.b.uncaughtException(thread, th);
        }
    }
}
