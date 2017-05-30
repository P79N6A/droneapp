package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat.BigTextStyle;
import android.support.v4.app.NotificationCompat.Builder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.drive.e;
import com.google.firebase.iid.FirebaseInstanceIdInternalReceiver;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

class c {
    static c a;
    private final Context b;
    private final AtomicInteger c = new AtomicInteger((int) SystemClock.elapsedRealtime());

    private c(Context context) {
        this.b = context.getApplicationContext();
    }

    private int a() {
        return this.c.incrementAndGet();
    }

    private PendingIntent a(Bundle bundle, PendingIntent pendingIntent) {
        Intent intent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
        a(intent, bundle);
        intent.putExtra("pending_intent", pendingIntent);
        return PendingIntent.getBroadcast(this.b, a(), FirebaseInstanceIdInternalReceiver.b(this.b, intent), 1073741824);
    }

    static synchronized c a(Context context) {
        c cVar;
        synchronized (c.class) {
            if (a == null) {
                a = new c(context);
            }
            cVar = a;
        }
        return cVar;
    }

    static String a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    private static String a(String str) {
        return str.substring("gcm.n.".length());
    }

    private void a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    private void a(String str, Notification notification) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        NotificationManager notificationManager = (NotificationManager) this.b.getSystemService("notification");
        if (TextUtils.isEmpty(str)) {
            str = "GCM-Notification:" + SystemClock.uptimeMillis();
        }
        notificationManager.notify(str, 0, notification);
    }

    static boolean a(Bundle bundle) {
        return "1".equals(a(bundle, "gcm.n.e")) || a(bundle, "gcm.n.icon") != null;
    }

    private int b(String str) {
        int identifier;
        if (!TextUtils.isEmpty(str)) {
            Resources resources = this.b.getResources();
            identifier = resources.getIdentifier(str, "drawable", this.b.getPackageName());
            if (identifier != 0) {
                return identifier;
            }
            identifier = resources.getIdentifier(str, "mipmap", this.b.getPackageName());
            if (identifier != 0) {
                return identifier;
            }
            Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(str).length() + 57).append("Icon resource ").append(str).append(" not found. Notification will use app icon.").toString());
        }
        identifier = this.b.getApplicationInfo().icon;
        return identifier == 0 ? 17301651 : identifier;
    }

    static String b(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_key");
        return a(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    static boolean b(Context context) {
        if (((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        int myPid = Process.myPid();
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    private Uri c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("default".equals(str) || this.b.getResources().getIdentifier(str, "raw", this.b.getPackageName()) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        String valueOf = String.valueOf("android.resource://");
        String valueOf2 = String.valueOf(this.b.getPackageName());
        return Uri.parse(new StringBuilder(((String.valueOf(valueOf).length() + 5) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()).append(valueOf).append(valueOf2).append("/raw/").append(str).toString());
    }

    static String c(Bundle bundle) {
        Object a = a(bundle, "gcm.n.sound2");
        return TextUtils.isEmpty(a) ? a(bundle, "gcm.n.sound") : a;
    }

    static Object[] c(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_args");
        String a = a(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(a);
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = jSONArray.opt(i);
            }
            return strArr;
        } catch (JSONException e) {
            valueOf = "FirebaseMessaging";
            String valueOf3 = String.valueOf(str);
            valueOf2 = String.valueOf("_loc_args");
            valueOf2 = String.valueOf(a(valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3)));
            Log.w(valueOf, new StringBuilder((String.valueOf(valueOf2).length() + 41) + String.valueOf(a).length()).append("Malformed ").append(valueOf2).append(": ").append(a).append("  Default value will be used.").toString());
            return null;
        }
    }

    private Notification d(Bundle bundle) {
        CharSequence d = d(bundle, "gcm.n.title");
        CharSequence d2 = d(bundle, "gcm.n.body");
        int b = b(a(bundle, "gcm.n.icon"));
        Object a = a(bundle, "gcm.n.color");
        Uri c = c(c(bundle));
        PendingIntent e = e(bundle);
        PendingIntent pendingIntent = null;
        if (FirebaseMessagingService.b(bundle)) {
            e = a(bundle, e);
            pendingIntent = f(bundle);
        }
        Builder smallIcon = new Builder(this.b).setAutoCancel(true).setSmallIcon(b);
        if (TextUtils.isEmpty(d)) {
            smallIcon.setContentTitle(this.b.getApplicationInfo().loadLabel(this.b.getPackageManager()));
        } else {
            smallIcon.setContentTitle(d);
        }
        if (!TextUtils.isEmpty(d2)) {
            smallIcon.setContentText(d2);
            smallIcon.setStyle(new BigTextStyle().bigText(d2));
        }
        if (!TextUtils.isEmpty(a)) {
            smallIcon.setColor(Color.parseColor(a));
        }
        if (c != null) {
            smallIcon.setSound(c);
        }
        if (e != null) {
            smallIcon.setContentIntent(e);
        }
        if (pendingIntent != null) {
            smallIcon.setDeleteIntent(pendingIntent);
        }
        return smallIcon.build();
    }

    private String d(Bundle bundle, String str) {
        Object a = a(bundle, str);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String b = b(bundle, str);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        Resources resources = this.b.getResources();
        int identifier = resources.getIdentifier(b, "string", this.b.getPackageName());
        if (identifier == 0) {
            String str2 = "FirebaseMessaging";
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf("_loc_key");
            valueOf2 = String.valueOf(a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
            Log.w(str2, new StringBuilder((String.valueOf(valueOf2).length() + 49) + String.valueOf(b).length()).append(valueOf2).append(" resource not found: ").append(b).append(" Default value will be used.").toString());
            return null;
        }
        Object[] c = c(bundle, str);
        if (c == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, c);
        } catch (Throwable e) {
            valueOf = String.valueOf(Arrays.toString(c));
            Log.w("FirebaseMessaging", new StringBuilder((String.valueOf(b).length() + 58) + String.valueOf(valueOf).length()).append("Missing format argument for ").append(b).append(": ").append(valueOf).append(" Default value will be used.").toString(), e);
            return null;
        }
    }

    private PendingIntent e(Bundle bundle) {
        Intent intent;
        Object a = a(bundle, "gcm.n.click_action");
        Intent launchIntentForPackage;
        if (TextUtils.isEmpty(a)) {
            launchIntentForPackage = this.b.getPackageManager().getLaunchIntentForPackage(this.b.getPackageName());
            if (launchIntentForPackage == null) {
                Log.w("FirebaseMessaging", "No activity found to launch app");
                return null;
            }
            intent = launchIntentForPackage;
        } else {
            launchIntentForPackage = new Intent(a);
            launchIntentForPackage.setPackage(this.b.getPackageName());
            launchIntentForPackage.setFlags(e.a_);
            intent = launchIntentForPackage;
        }
        Bundle bundle2 = new Bundle(bundle);
        FirebaseMessagingService.a(bundle2);
        intent.putExtras(bundle2);
        for (String str : bundle2.keySet()) {
            if (str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                intent.removeExtra(str);
            }
        }
        return PendingIntent.getActivity(this.b, a(), intent, 1073741824);
    }

    private PendingIntent f(Bundle bundle) {
        Intent intent = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
        a(intent, bundle);
        return PendingIntent.getBroadcast(this.b, a(), FirebaseInstanceIdInternalReceiver.b(this.b, intent), 1073741824);
    }

    void b(Bundle bundle) {
        a(a(bundle, "gcm.n.tag"), d(bundle));
    }
}
