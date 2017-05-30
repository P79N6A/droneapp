package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.annotation.CallSuper;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

public abstract class GcmTaskService extends Service {
    public static final String a = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    public static final String b = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final String c = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    private final Set<String> d = new HashSet();
    private int e;

    private class a extends Thread {
        final /* synthetic */ GcmTaskService a;
        private final String b;
        private final f c;
        private final Bundle d;

        a(GcmTaskService gcmTaskService, String str, IBinder iBinder, Bundle bundle) {
            this.a = gcmTaskService;
            super(String.valueOf(str).concat(" GCM Task"));
            this.b = str;
            this.c = com.google.android.gms.gcm.f.a.a(iBinder);
            this.d = bundle;
        }

        public void run() {
            Process.setThreadPriority(10);
            try {
                this.c.a(this.a.a(new d(this.b, this.d)));
            } catch (RemoteException e) {
                String str = "GcmTaskService";
                String str2 = "Error reporting result of operation to scheduler for ";
                String valueOf = String.valueOf(this.b);
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            } finally {
                this.a.a(this.b);
            }
        }
    }

    private void a(int i) {
        synchronized (this.d) {
            this.e = i;
            if (this.d.size() == 0) {
                stopSelf(this.e);
            }
        }
    }

    private void a(String str) {
        synchronized (this.d) {
            this.d.remove(str);
            if (this.d.size() == 0) {
                stopSelf(this.e);
            }
        }
    }

    public abstract int a(d dVar);

    public void a() {
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    @CallSuper
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            a(i2);
        } else {
            try {
                intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
                String action = intent.getAction();
                if (b.equals(action)) {
                    String stringExtra = intent.getStringExtra("tag");
                    Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                    Bundle bundle = (Bundle) intent.getParcelableExtra("extras");
                    if (parcelableExtra == null || !(parcelableExtra instanceof PendingCallback)) {
                        String valueOf = String.valueOf(getPackageName());
                        Log.e("GcmTaskService", new StringBuilder((String.valueOf(valueOf).length() + 47) + String.valueOf(stringExtra).length()).append(valueOf).append(" ").append(stringExtra).append(": Could not process request, invalid callback.").toString());
                    } else {
                        synchronized (this.d) {
                            this.d.add(stringExtra);
                        }
                        new a(this, stringExtra, ((PendingCallback) parcelableExtra).a(), bundle).start();
                    }
                } else if (c.equals(action)) {
                    a();
                } else {
                    Log.e("GcmTaskService", new StringBuilder(String.valueOf(action).length() + 37).append("Unknown action received ").append(action).append(", terminating").toString());
                }
                a(i2);
            } finally {
                a(i2);
            }
        }
        return 2;
    }
}
