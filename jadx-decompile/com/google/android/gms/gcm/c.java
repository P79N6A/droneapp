package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.iid.a;
import com.google.android.gms.iid.d;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class c {
    public static int a = 5000000;
    public static int b = 6500000;
    public static int c = 7000000;
    public static final String d = "SERVICE_NOT_AVAILABLE";
    public static final String e = "MAIN_THREAD";
    @Deprecated
    public static final String f = "deleted_messages";
    @Deprecated
    public static final String g = "gcm";
    @Deprecated
    public static final String h = "send_event";
    @Deprecated
    public static final String i = "send_error";
    public static final String j = "GCM";
    static c k;
    private static final AtomicInteger p = new AtomicInteger(1);
    final Messenger l = new Messenger(new 1(this, Looper.getMainLooper()));
    private Context m;
    private PendingIntent n;
    private Map<String, Handler> o = Collections.synchronizedMap(new HashMap());
    private final BlockingQueue<Intent> q = new LinkedBlockingQueue();

    public static synchronized c a(Context context) {
        c cVar;
        synchronized (c.class) {
            if (k == null) {
                k = new c();
                k.m = context.getApplicationContext();
            }
            cVar = k;
        }
        return cVar;
    }

    static String a(Intent intent, String str) {
        if (intent == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String stringExtra = intent.getStringExtra(str);
        if (stringExtra != null) {
            return stringExtra;
        }
        stringExtra = intent.getStringExtra("error");
        if (stringExtra != null) {
            throw new IOException(stringExtra);
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    private String a(String str) {
        int indexOf = str.indexOf(64);
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        return a.c(this.m).f().a("", str, j);
    }

    private void a(String str, String str2, long j, int i, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        String b = b(this.m);
        if (b == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        b(intent);
        intent.setPackage(b);
        intent.putExtra("google.to", str);
        intent.putExtra("google.message_id", str2);
        intent.putExtra("google.ttl", Long.toString(j));
        intent.putExtra("google.delay", Integer.toString(i));
        intent.putExtra("google.from", a(str));
        if (b.contains(".gsf")) {
            Bundle bundle2 = new Bundle();
            for (String b2 : bundle.keySet()) {
                Object obj = bundle.get(b2);
                if (obj instanceof String) {
                    String str3 = "gcm.";
                    b2 = String.valueOf(b2);
                    bundle2.putString(b2.length() != 0 ? str3.concat(b2) : new String(str3), (String) obj);
                }
            }
            bundle2.putString("google.to", str);
            bundle2.putString("google.message_id", str2);
            a.c(this.m).c(j, "upstream", bundle2);
            return;
        }
        this.m.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public static String b(Context context) {
        return d.a(context);
    }

    public static int c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String b = b(context);
        if (b != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(b, 0);
                if (packageInfo != null) {
                    return packageInfo.versionCode;
                }
            } catch (NameNotFoundException e) {
            }
        }
        return -1;
    }

    private boolean c(Intent intent) {
        Object stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra("error")) {
            stringExtra = intent.getStringExtra("google.message_id");
        }
        if (stringExtra != null) {
            Handler handler = (Handler) this.o.remove(stringExtra);
            if (handler != null) {
                Message obtain = Message.obtain();
                obtain.obj = intent;
                return handler.sendMessage(obtain);
            }
        }
        return false;
    }

    private String d() {
        String valueOf = String.valueOf("google.rpc");
        String valueOf2 = String.valueOf(String.valueOf(p.getAndIncrement()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @Deprecated
    Intent a(Bundle bundle) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        } else if (c(this.m) < 0) {
            throw new IOException("Google Play Services missing");
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage(b(this.m));
            b(intent);
            intent.putExtra("google.message_id", d());
            intent.putExtras(bundle);
            intent.putExtra("google.messenger", this.l);
            this.m.startService(intent);
            try {
                return (Intent) this.q.poll(NotificationOptions.b, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    public String a(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        String stringExtra = intent.getStringExtra(PushMessageHelper.MESSAGE_TYPE);
        return stringExtra == null ? g : stringExtra;
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    @Deprecated
    public synchronized String a(String... strArr) {
        String b;
        b = b(this.m);
        if (b == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String b2 = b(strArr);
        Bundle bundle = new Bundle();
        if (b.contains(".gsf")) {
            bundle.putString("legacy.sender", b2);
            b = a.c(this.m).b(b2, j, bundle);
        } else {
            bundle.putString("sender", b2);
            b = a(a(bundle), "registration_id");
        }
        return b;
    }

    public void a() {
        k = null;
        e.a = null;
        c();
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    public void a(String str, String str2, long j, Bundle bundle) {
        a(str, str2, j, -1, bundle);
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    public void a(String str, String str2, Bundle bundle) {
        a(str, str2, -1, bundle);
    }

    String b(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder stringBuilder = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            stringBuilder.append(',').append(strArr[i]);
        }
        return stringBuilder.toString();
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    @Deprecated
    public synchronized void b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        a.c(this.m).d();
    }

    synchronized void b(Intent intent) {
        if (this.n == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.n = PendingIntent.getBroadcast(this.m, 0, intent2, 0);
        }
        intent.putExtra("app", this.n);
    }

    synchronized void c() {
        if (this.n != null) {
            this.n.cancel();
            this.n = null;
        }
    }
}
