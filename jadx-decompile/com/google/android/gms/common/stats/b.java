package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Debug;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.stats.c.a;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.t;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class b {
    private static final Object a = new Object();
    private static b b;
    private static Integer h;
    private final List<String> c;
    private final List<String> d;
    private final List<String> e;
    private final List<String> f;
    private e g;
    private e i;

    private b() {
        if (c() == d.b) {
            this.c = Collections.EMPTY_LIST;
            this.d = Collections.EMPTY_LIST;
            this.e = Collections.EMPTY_LIST;
            this.f = Collections.EMPTY_LIST;
            return;
        }
        String str = (String) a.b.a();
        this.c = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
        str = (String) a.c.a();
        this.d = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
        str = (String) a.d.a();
        this.e = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
        str = (String) a.e.a();
        this.f = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
        this.g = new e(1024, ((Long) a.f.a()).longValue());
        this.i = new e(1024, ((Long) a.f.a()).longValue());
    }

    public static b a() {
        synchronized (a) {
            if (b == null) {
                b = new b();
            }
        }
        return b;
    }

    private static String a(int i, int i2) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuffer stringBuffer = new StringBuffer();
        int i3 = i2 + i;
        while (i < i3) {
            stringBuffer.append(a(stackTrace, i)).append(" ");
            i++;
        }
        return stringBuffer.toString();
    }

    private String a(ServiceConnection serviceConnection) {
        return String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(serviceConnection)));
    }

    private static String a(StackTraceElement[] stackTraceElementArr, int i) {
        if (i + 4 >= stackTraceElementArr.length) {
            return "<bottom of call stack>";
        }
        StackTraceElement stackTraceElement = stackTraceElementArr[i + 4];
        String valueOf = String.valueOf(stackTraceElement.getClassName());
        String valueOf2 = String.valueOf(stackTraceElement.getMethodName());
        return new StringBuilder((String.valueOf(valueOf).length() + 13) + String.valueOf(valueOf2).length()).append(valueOf).append(".").append(valueOf2).append(":").append(stackTraceElement.getLineNumber()).toString();
    }

    private void a(Context context, String str, int i, String str2, String str3, String str4, String str5) {
        Parcelable connectionEvent;
        long currentTimeMillis = System.currentTimeMillis();
        String str6 = null;
        if (!((c() & d.f) == 0 || i == 13)) {
            str6 = a(3, 5);
        }
        long j = 0;
        if ((c() & d.h) != 0) {
            j = Debug.getNativeHeapAllocatedSize();
        }
        if (i == 1 || i == 4 || i == 14) {
            connectionEvent = new ConnectionEvent(currentTimeMillis, i, null, null, null, null, str6, str, SystemClock.elapsedRealtime(), j);
        } else {
            connectionEvent = new ConnectionEvent(currentTimeMillis, i, str2, str3, str4, str5, str6, str, SystemClock.elapsedRealtime(), j);
        }
        context.startService(new Intent().setComponent(d.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", connectionEvent));
    }

    private void a(Context context, String str, String str2, Intent intent, int i) {
        String str3 = null;
        if (b() && this.g != null) {
            String str4;
            String str5;
            if (i != 4 && i != 1) {
                ServiceInfo b = b(context, intent);
                if (b == null) {
                    Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", new Object[]{str2, intent.toUri(0)}));
                    return;
                }
                str4 = b.processName;
                str5 = b.name;
                str3 = t.a();
                if (a(str3, str2, str4, str5)) {
                    this.g.a(str);
                } else {
                    return;
                }
            } else if (this.g.b(str)) {
                str5 = null;
                str4 = null;
            } else {
                return;
            }
            a(context, str, i, str3, str2, str4, str5);
        }
    }

    private boolean a(Context context, Intent intent) {
        ComponentName component = intent.getComponent();
        return component == null ? false : d.c(context, component.getPackageName());
    }

    private boolean a(String str, String str2, String str3, String str4) {
        return (this.c.contains(str) || this.d.contains(str2) || this.e.contains(str3) || this.f.contains(str4) || (str3.equals(str) && (c() & d.g) != 0)) ? false : true;
    }

    private static ServiceInfo b(Context context, Intent intent) {
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
        if (queryIntentServices == null || queryIntentServices.size() == 0) {
            Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[]{intent.toUri(0), a(3, 20)}));
            return null;
        } else if (queryIntentServices.size() <= 1) {
            return ((ResolveInfo) queryIntentServices.get(0)).serviceInfo;
        } else {
            Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[]{intent.toUri(0), a(3, 20)}));
            for (ResolveInfo resolveInfo : queryIntentServices) {
                Log.w("ConnectionTracker", resolveInfo.serviceInfo.name);
            }
            return null;
        }
    }

    private boolean b() {
        return false;
    }

    private static int c() {
        if (h == null) {
            try {
                h = Integer.valueOf(d.a() ? ((Integer) a.a.a()).intValue() : d.b);
            } catch (SecurityException e) {
                h = Integer.valueOf(d.b);
            }
        }
        return h.intValue();
    }

    @SuppressLint({"UntrackedBindService"})
    public void a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
        a(context, a(serviceConnection), null, null, 1);
    }

    public void a(Context context, ServiceConnection serviceConnection, String str, Intent intent) {
        a(context, a(serviceConnection), str, intent, 3);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    public boolean a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        if (a(context, intent)) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        boolean bindService = context.bindService(intent, serviceConnection, i);
        if (bindService) {
            a(context, a(serviceConnection), str, intent, 2);
        }
        return bindService;
    }

    public void b(Context context, ServiceConnection serviceConnection) {
        a(context, a(serviceConnection), null, null, 4);
    }
}
