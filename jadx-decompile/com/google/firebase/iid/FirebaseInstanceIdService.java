package com.google.firebase.iid;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.drive.e;
import com.google.firebase.b;

public class FirebaseInstanceIdService extends zzb {
    private static BroadcastReceiver c;
    private static final Object d = new Object();
    private static boolean e = false;
    private boolean f = false;

    private c a(String str) {
        if (str == null) {
            return c.a(this, null);
        }
        Bundle bundle = new Bundle();
        bundle.putString("subtype", str);
        return c.a(this, bundle);
    }

    static void a(Context context) {
        if (e.a(context) != null) {
            synchronized (d) {
                if (!e) {
                    context.sendBroadcast(c(0));
                    e = true;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.content.Context r2, com.google.firebase.iid.FirebaseInstanceId r3) {
        /*
        r1 = d;
        monitor-enter(r1);
        r0 = e;	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
    L_0x0008:
        return;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        r0 = r3.g();
        if (r0 == 0) goto L_0x0022;
    L_0x0010:
        r1 = com.google.firebase.iid.c.e;
        r0 = r0.b(r1);
        if (r0 != 0) goto L_0x0022;
    L_0x0018:
        r0 = r3.i();
        r0 = r0.a();
        if (r0 == 0) goto L_0x0008;
    L_0x0022:
        a(r2);
        goto L_0x0008;
    L_0x0026:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdService.a(android.content.Context, com.google.firebase.iid.FirebaseInstanceId):void");
    }

    private void a(Intent intent, String str) {
        boolean c = c((Context) this);
        final int b = b(intent, c);
        Log.d("FirebaseInstanceId", new StringBuilder(String.valueOf(str).length() + 47).append("background sync failed: ").append(str).append(", retry in ").append(b).append("s").toString());
        synchronized (d) {
            d(b);
            e = true;
        }
        if (!c) {
            if (this.f) {
                Log.d("FirebaseInstanceId", "device not connected. Connectivity change received registered");
            }
            if (c == null) {
                c = new BroadcastReceiver(this) {
                    final /* synthetic */ FirebaseInstanceIdService b;

                    public void onReceive(Context context, Intent intent) {
                        if (FirebaseInstanceIdService.c(context)) {
                            if (this.b.f) {
                                Log.d("FirebaseInstanceId", "connectivity changed. starting background sync.");
                            }
                            this.b.getApplicationContext().unregisterReceiver(this);
                            context.sendBroadcast(FirebaseInstanceIdService.c(b));
                        }
                    }
                };
            }
            getApplicationContext().registerReceiver(c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Intent r9, boolean r10) {
        /*
        r8 = this;
        r2 = 1;
        r1 = 0;
        r3 = d;
        monitor-enter(r3);
        r0 = 0;
        e = r0;	 Catch:{ all -> 0x0010 }
        monitor-exit(r3);	 Catch:{ all -> 0x0010 }
        r0 = com.google.firebase.iid.e.a(r8);
        if (r0 != 0) goto L_0x0013;
    L_0x000f:
        return;
    L_0x0010:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0010 }
        throw r0;
    L_0x0013:
        r0 = com.google.firebase.iid.FirebaseInstanceId.a();
        r3 = r0.g();
        if (r3 != 0) goto L_0x004d;
    L_0x001d:
        r1 = r0.h();	 Catch:{ IOException -> 0x0035, SecurityException -> 0x0044 }
        if (r1 == 0) goto L_0x003e;
    L_0x0023:
        r1 = r8.f;	 Catch:{ IOException -> 0x0035, SecurityException -> 0x0044 }
        if (r1 == 0) goto L_0x002e;
    L_0x0027:
        r1 = "FirebaseInstanceId";
        r2 = "get master token succeeded";
        android.util.Log.d(r1, r2);	 Catch:{ IOException -> 0x0035, SecurityException -> 0x0044 }
    L_0x002e:
        a(r8, r0);	 Catch:{ IOException -> 0x0035, SecurityException -> 0x0044 }
        r8.a();	 Catch:{ IOException -> 0x0035, SecurityException -> 0x0044 }
        goto L_0x000f;
    L_0x0035:
        r0 = move-exception;
        r0 = r0.getMessage();
        r8.a(r9, r0);
        goto L_0x000f;
    L_0x003e:
        r0 = "returned token is null";
        r8.a(r9, r0);	 Catch:{ IOException -> 0x0035, SecurityException -> 0x0044 }
        goto L_0x000f;
    L_0x0044:
        r0 = move-exception;
        r1 = "FirebaseInstanceId";
        r2 = "Unable to get master token";
        android.util.Log.e(r1, r2, r0);
        goto L_0x000f;
    L_0x004d:
        r4 = r0.i();
        r0 = r4.a();
        r3 = r0;
    L_0x0056:
        if (r3 == 0) goto L_0x00be;
    L_0x0058:
        r0 = "!";
        r0 = r3.split(r0);
        r5 = r0.length;
        r6 = 2;
        if (r5 != r6) goto L_0x0071;
    L_0x0062:
        r5 = r0[r1];
        r6 = r0[r2];
        r0 = -1;
        r7 = r5.hashCode();	 Catch:{ IOException -> 0x00a1 }
        switch(r7) {
            case 83: goto L_0x007a;
            case 84: goto L_0x006e;
            case 85: goto L_0x0084;
            default: goto L_0x006e;
        };
    L_0x006e:
        switch(r0) {
            case 0: goto L_0x008e;
            case 1: goto L_0x00ab;
            default: goto L_0x0071;
        };
    L_0x0071:
        r4.b(r3);
        r0 = r4.a();
        r3 = r0;
        goto L_0x0056;
    L_0x007a:
        r7 = "S";
        r5 = r5.equals(r7);	 Catch:{ IOException -> 0x00a1 }
        if (r5 == 0) goto L_0x006e;
    L_0x0082:
        r0 = r1;
        goto L_0x006e;
    L_0x0084:
        r7 = "U";
        r5 = r5.equals(r7);	 Catch:{ IOException -> 0x00a1 }
        if (r5 == 0) goto L_0x006e;
    L_0x008c:
        r0 = r2;
        goto L_0x006e;
    L_0x008e:
        r0 = com.google.firebase.iid.FirebaseInstanceId.a();	 Catch:{ IOException -> 0x00a1 }
        r0.b(r6);	 Catch:{ IOException -> 0x00a1 }
        r0 = r8.f;	 Catch:{ IOException -> 0x00a1 }
        if (r0 == 0) goto L_0x0071;
    L_0x0099:
        r0 = "FirebaseInstanceId";
        r5 = "subscribe operation succeeded";
        android.util.Log.d(r0, r5);	 Catch:{ IOException -> 0x00a1 }
        goto L_0x0071;
    L_0x00a1:
        r0 = move-exception;
        r0 = r0.getMessage();
        r8.a(r9, r0);
        goto L_0x000f;
    L_0x00ab:
        r0 = com.google.firebase.iid.FirebaseInstanceId.a();	 Catch:{ IOException -> 0x00a1 }
        r0.c(r6);	 Catch:{ IOException -> 0x00a1 }
        r0 = r8.f;	 Catch:{ IOException -> 0x00a1 }
        if (r0 == 0) goto L_0x0071;
    L_0x00b6:
        r0 = "FirebaseInstanceId";
        r5 = "unsubscribe operation succeeded";
        android.util.Log.d(r0, r5);	 Catch:{ IOException -> 0x00a1 }
        goto L_0x0071;
    L_0x00be:
        r0 = "FirebaseInstanceId";
        r1 = "topic sync succeeded";
        android.util.Log.d(r0, r1);
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdService.a(android.content.Intent, boolean):void");
    }

    private void a(e eVar, Bundle bundle) {
        String a = e.a((Context) this);
        if (a == null) {
            Log.w("FirebaseInstanceId", "Unable to respond to ping due to missing target package");
            return;
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        intent.setPackage(a);
        intent.putExtras(bundle);
        eVar.a(intent);
        intent.putExtra("google.to", "google.com/iid");
        intent.putExtra("google.message_id", e.b());
        sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    private int b(Intent intent, boolean z) {
        int intExtra = intent == null ? 10 : intent.getIntExtra("next_retry_delay_in_seconds", 0);
        return (intExtra >= 10 || z) ? intExtra >= 10 ? intExtra > 28800 ? 28800 : intExtra : 10 : 30;
    }

    private static Intent c(int i) {
        Context a = b.d().a();
        Intent intent = new Intent("ACTION_TOKEN_REFRESH_RETRY");
        intent.putExtra("next_retry_delay_in_seconds", i);
        return FirebaseInstanceIdInternalReceiver.a(a, intent);
    }

    private static boolean c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private void d(int i) {
        ((AlarmManager) getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + ((long) (i * 1000)), PendingIntent.getBroadcast(this, 0, c(i * 2), e.a_));
    }

    private String e(Intent intent) {
        String stringExtra = intent.getStringExtra("subtype");
        return stringExtra == null ? "" : stringExtra;
    }

    @WorkerThread
    public void a() {
    }

    public boolean a(Intent intent) {
        this.f = Log.isLoggable("FirebaseInstanceId", 3);
        if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) {
            return false;
        }
        String e = e(intent);
        if (this.f) {
            String str = "FirebaseInstanceId";
            String str2 = "Register result in service ";
            String valueOf = String.valueOf(e);
            Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        a(e).e().d(intent);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Intent r5) {
        /*
        r4 = this;
        r1 = 0;
        r0 = r5.getAction();
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        r0 = "";
    L_0x0009:
        r2 = -1;
        r3 = r0.hashCode();
        switch(r3) {
            case -1737547627: goto L_0x0019;
            default: goto L_0x0011;
        };
    L_0x0011:
        r0 = r2;
    L_0x0012:
        switch(r0) {
            case 0: goto L_0x0023;
            default: goto L_0x0015;
        };
    L_0x0015:
        r4.d(r5);
    L_0x0018:
        return;
    L_0x0019:
        r3 = "ACTION_TOKEN_REFRESH_RETRY";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0011;
    L_0x0021:
        r0 = r1;
        goto L_0x0012;
    L_0x0023:
        r4.a(r5, r1);
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdService.b(android.content.Intent):void");
    }

    protected Intent c(Intent intent) {
        return FirebaseInstanceIdInternalReceiver.a();
    }

    public void d(Intent intent) {
        String e = e(intent);
        c a = a(e);
        String stringExtra = intent.getStringExtra("CMD");
        if (this.f) {
            String valueOf = String.valueOf(intent.getExtras());
            Log.d("FirebaseInstanceId", new StringBuilder(((String.valueOf(e).length() + 18) + String.valueOf(stringExtra).length()) + String.valueOf(valueOf).length()).append("Service command ").append(e).append(" ").append(stringExtra).append(" ").append(valueOf).toString());
        }
        if (intent.getStringExtra("unregistered") != null) {
            f d = a.d();
            if (e == null) {
                e = "";
            }
            d.d(e);
            a.e().d(intent);
        } else if ("gcm.googleapis.com/refresh".equals(intent.getStringExtra("from"))) {
            a.d().d(e);
            a(intent, false);
        } else if ("RST".equals(stringExtra)) {
            a.c();
            a(intent, true);
        } else if ("RST_FULL".equals(stringExtra)) {
            if (!a.d().b()) {
                a.c();
                a.d().c();
                a(intent, true);
            }
        } else if ("SYNC".equals(stringExtra)) {
            a.d().d(e);
            a(intent, false);
        } else if ("PING".equals(stringExtra)) {
            a(a.e(), intent.getExtras());
        }
    }
}
