package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.Iterator;

public abstract class GcmListenerService extends Service {
    private final Object a = new Object();
    private int b;
    private int c = 0;

    @TargetApi(11)
    private void a(final Intent intent) {
        if (VERSION.SDK_INT >= 11) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable(this) {
                final /* synthetic */ GcmListenerService b;

                public void run() {
                    this.b.b(intent);
                }
            });
        } else {
            new AsyncTask<Void, Void, Void>(this) {
                final /* synthetic */ GcmListenerService b;

                protected Void a(Void... voidArr) {
                    this.b.b(intent);
                    return null;
                }

                protected /* synthetic */ Object doInBackground(Object[] objArr) {
                    return a((Void[]) objArr);
                }
            }.execute(new Void[0]);
        }
    }

    static void a(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    private void b() {
        synchronized (this.a) {
            this.c--;
            if (this.c == 0) {
                a(this.b);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.content.Intent r5) {
        /*
        r4 = this;
        r1 = r5.getAction();	 Catch:{ all -> 0x003d }
        r0 = -1;
        r2 = r1.hashCode();	 Catch:{ all -> 0x003d }
        switch(r2) {
            case 366519424: goto L_0x002f;
            default: goto L_0x000c;
        };	 Catch:{ all -> 0x003d }
    L_0x000c:
        switch(r0) {
            case 0: goto L_0x0039;
            default: goto L_0x000f;
        };	 Catch:{ all -> 0x003d }
    L_0x000f:
        r1 = "GcmListenerService";
        r2 = "Unknown intent action: ";
        r0 = r5.getAction();	 Catch:{ all -> 0x003d }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x003d }
        r3 = r0.length();	 Catch:{ all -> 0x003d }
        if (r3 == 0) goto L_0x0042;
    L_0x0021:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x003d }
    L_0x0025:
        android.util.Log.d(r1, r0);	 Catch:{ all -> 0x003d }
    L_0x0028:
        r4.b();	 Catch:{ all -> 0x003d }
        com.google.android.gms.gcm.GcmReceiver.completeWakefulIntent(r5);
        return;
    L_0x002f:
        r2 = "com.google.android.c2dm.intent.RECEIVE";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x003d }
        if (r1 == 0) goto L_0x000c;
    L_0x0037:
        r0 = 0;
        goto L_0x000c;
    L_0x0039:
        r4.c(r5);	 Catch:{ all -> 0x003d }
        goto L_0x0028;
    L_0x003d:
        r0 = move-exception;
        com.google.android.gms.gcm.GcmReceiver.completeWakefulIntent(r5);
        throw r0;
    L_0x0042:
        r0 = new java.lang.String;	 Catch:{ all -> 0x003d }
        r0.<init>(r2);	 Catch:{ all -> 0x003d }
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmListenerService.b(android.content.Intent):void");
    }

    private void c(Intent intent) {
        String stringExtra = intent.getStringExtra(PushMessageHelper.MESSAGE_TYPE);
        if (stringExtra == null) {
            stringExtra = c.g;
        }
        Object obj = -1;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals(c.f)) {
                    obj = 1;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals(c.g)) {
                    obj = null;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals(c.i)) {
                    obj = 3;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals(c.h)) {
                    obj = 2;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                d(intent);
                return;
            case 1:
                a();
                return;
            case 2:
                a(intent.getStringExtra("google.message_id"));
                return;
            case 3:
                a(e(intent), intent.getStringExtra("error"));
                return;
            default:
                String str = "GcmListenerService";
                String str2 = "Received message with unknown type: ";
                stringExtra = String.valueOf(stringExtra);
                Log.w(str, stringExtra.length() != 0 ? str2.concat(stringExtra) : new String(str2));
                return;
        }
    }

    private void d(Intent intent) {
        Bundle extras = intent.getExtras();
        extras.remove(PushMessageHelper.MESSAGE_TYPE);
        extras.remove("android.support.content.wakelockid");
        if (e.a(extras)) {
            if (e.b((Context) this)) {
                e.b(extras);
            } else {
                e.a((Context) this).c(extras);
                return;
            }
        }
        String string = extras.getString("from");
        extras.remove("from");
        a(extras);
        a(string, extras);
    }

    private String e(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    public void a() {
    }

    public void a(String str) {
    }

    public void a(String str, Bundle bundle) {
    }

    public void a(String str, String str2) {
    }

    boolean a(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.a) {
            this.b = i2;
            this.c++;
        }
        if (intent == null) {
            b();
            return 2;
        }
        a(intent);
        return 3;
    }
}
