package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.b;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.e;
import java.util.regex.Pattern;

public class a {
    public static final String a = "FCM";
    private static final Pattern b = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private static a c;
    private final FirebaseInstanceId d;
    private PendingIntent e;

    private a(FirebaseInstanceId firebaseInstanceId) {
        this.d = firebaseInstanceId;
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (c == null) {
                c = new a(FirebaseInstanceId.a());
            }
            aVar = c;
        }
        return aVar;
    }

    private synchronized void a(Context context, Intent intent) {
        if (this.e == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.e = PendingIntent.getBroadcast(context, 0, intent2, 0);
        }
        intent.putExtra("app", this.e);
    }

    public void a(RemoteMessage remoteMessage) {
        if (TextUtils.isEmpty(remoteMessage.b())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Context a = b.d().a();
        String a2 = e.a(a);
        if (a2 == null) {
            Log.e("FirebaseMessaging", "Google Play services package is missing. Impossible to send message");
            return;
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        a(a, intent);
        intent.setPackage(a2);
        remoteMessage.a(intent);
        a.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void a(String str) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in subscribeToTopic.");
            Object substring = str.substring("/topics/".length());
        }
        if (substring == null || !b.matcher(substring).matches()) {
            String valueOf = String.valueOf("[a-zA-Z0-9-_.~%]{1,900}");
            throw new IllegalArgumentException(new StringBuilder((String.valueOf(substring).length() + 55) + String.valueOf(valueOf).length()).append("Invalid topic name: ").append(substring).append(" does not match the allowed format ").append(valueOf).toString());
        }
        FirebaseInstanceId a = FirebaseInstanceId.a();
        String valueOf2 = String.valueOf("S!");
        String valueOf3 = String.valueOf(substring);
        a.a(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
    }

    public void b(String str) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in unsubscribeFromTopic.");
            Object substring = str.substring("/topics/".length());
        }
        if (substring == null || !b.matcher(substring).matches()) {
            String valueOf = String.valueOf("[a-zA-Z0-9-_.~%]{1,900}");
            throw new IllegalArgumentException(new StringBuilder((String.valueOf(substring).length() + 55) + String.valueOf(valueOf).length()).append("Invalid topic name: ").append(substring).append(" does not match the allowed format ").append(valueOf).toString());
        }
        FirebaseInstanceId a = FirebaseInstanceId.a();
        String valueOf2 = String.valueOf("U!");
        String valueOf3 = String.valueOf(substring);
        a.a(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
    }
}
