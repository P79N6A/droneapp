package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompatExtras;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.s;

public final class e extends l {
    public static final String a = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final int b = l.e;
    @Deprecated
    public static final String c = "com.google.android.gms";
    public static final String d = "com.android.vending";

    private static class a extends Handler {
        private final Context a;

        a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.a = context.getApplicationContext();
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    int a = e.a(this.a);
                    if (e.c(a)) {
                        e.c(a, this.a);
                        return;
                    }
                    return;
                default:
                    Log.w("GooglePlayServicesUtil", "Don't know how to handle this message: " + message.what);
                    return;
            }
        }
    }

    private e() {
    }

    @Deprecated
    public static int a(Context context) {
        return l.e(context);
    }

    @Deprecated
    public static Dialog a(int i, Activity activity, int i2) {
        return a(i, activity, i2, null);
    }

    @Deprecated
    public static Dialog a(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        if (a((Context) activity, i)) {
            i = 18;
        }
        return b.a().a(activity, i, i2, onCancelListener);
    }

    @Deprecated
    public static PendingIntent a(int i, Context context, int i2) {
        return l.b(i, context, i2);
    }

    @Deprecated
    public static String a(int i) {
        return l.d(i);
    }

    @Deprecated
    public static void a(int i, Context context) {
        if (i.a(context) && i == 2) {
            i = 42;
        }
        if (a(context, i) || b(context, i)) {
            o(context);
        } else {
            c(i, context);
        }
    }

    static void a(int i, Context context, PendingIntent pendingIntent) {
        a(i, context, null, pendingIntent);
    }

    private static void a(int i, Context context, String str) {
        a(i, context, str, b.a().a(context, i, 0, "n"));
    }

    @TargetApi(20)
    private static void a(int i, Context context, String str, PendingIntent pendingIntent) {
        Notification build;
        int i2;
        Resources resources = context.getResources();
        CharSequence b = t.b(context, i);
        CharSequence d = t.d(context, i);
        if (i.a(context)) {
            d.a(s.e());
            build = new Builder(context).setSmallIcon(R.drawable.common_ic_googleplayservices).setPriority(2).setAutoCancel(true).setStyle(new BigTextStyle().bigText(new StringBuilder((String.valueOf(b).length() + 1) + String.valueOf(d).length()).append(b).append(" ").append(d).toString())).addAction(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent).build();
        } else {
            CharSequence string = resources.getString(R.string.common_google_play_services_notification_ticker);
            if (s.a()) {
                Notification build2;
                Builder autoCancel = new Builder(context).setSmallIcon(17301642).setContentTitle(b).setContentText(d).setContentIntent(pendingIntent).setTicker(string).setAutoCancel(true);
                if (s.i()) {
                    autoCancel.setLocalOnly(true);
                }
                if (s.e()) {
                    autoCancel.setStyle(new BigTextStyle().bigText(d));
                    build2 = autoCancel.build();
                } else {
                    build2 = autoCancel.getNotification();
                }
                if (VERSION.SDK_INT == 19) {
                    build2.extras.putBoolean(NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
                }
                build = build2;
            } else {
                build = new NotificationCompat.Builder(context).setSmallIcon(17301642).setTicker(string).setWhen(System.currentTimeMillis()).setAutoCancel(true).setContentIntent(pendingIntent).setContentTitle(b).setContentText(d).build();
            }
        }
        if (l.f(i)) {
            k.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (str != null) {
            notificationManager.notify(str, i2, build);
        } else {
            notificationManager.notify(i2, build);
        }
    }

    public static boolean a(int i, Activity activity, Fragment fragment, int i2, OnCancelListener onCancelListener) {
        if (a((Context) activity, i)) {
            i = 18;
        }
        b a = b.a();
        if (fragment == null) {
            return a.b(activity, i, i2, onCancelListener);
        }
        Dialog a2 = a.a((Context) activity, i, u.a(fragment, b.a().a((Context) activity, i, "d"), i2), onCancelListener);
        if (a2 == null) {
            return false;
        }
        a.a(activity, a2, a, onCancelListener);
        return true;
    }

    @Deprecated
    public static boolean a(Context context, int i) {
        return l.d(context, i);
    }

    @Deprecated
    public static Intent b(int i) {
        return l.e(i);
    }

    @Deprecated
    public static String b(Context context) {
        return l.j(context);
    }

    @Deprecated
    public static boolean b(int i, Activity activity, int i2) {
        return b(i, activity, i2, null);
    }

    @Deprecated
    public static boolean b(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        return a(i, activity, null, i2, onCancelListener);
    }

    @Deprecated
    public static boolean b(Context context, int i) {
        return l.e(context, i);
    }

    public static Resources c(Context context) {
        return l.k(context);
    }

    private static void c(int i, Context context) {
        a(i, context, null);
    }

    @Deprecated
    public static boolean c(int i) {
        return l.g(i);
    }

    public static Context d(Context context) {
        return l.l(context);
    }

    private static void o(Context context) {
        Handler aVar = new a(context);
        aVar.sendMessageDelayed(aVar.obtainMessage(1), 120000);
    }
}
