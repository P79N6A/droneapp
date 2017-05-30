package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.VisibleForTesting;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zzb extends Service {
    MessengerCompat a = new MessengerCompat(new Handler(this, Looper.getMainLooper()) {
        final /* synthetic */ zzb a;

        public void handleMessage(Message message) {
            int a = MessengerCompat.a(message);
            e.a(this.a);
            this.a.getPackageManager();
            if (a == e.c || a == e.b) {
                this.a.b((Intent) message.obj);
                return;
            }
            int i = e.b;
            Log.w("FirebaseInstanceId", "Message from unexpected caller " + a + " mine=" + i + " appid=" + e.c);
        }
    });
    @VisibleForTesting
    final ExecutorService b = Executors.newSingleThreadExecutor();
    private final Object c = new Object();
    private int d;
    private int e = 0;

    private void d(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.c) {
            this.e--;
            if (this.e == 0) {
                b(this.d);
            }
        }
    }

    public boolean a(Intent intent) {
        return false;
    }

    public abstract void b(Intent intent);

    boolean b(int i) {
        return stopSelfResult(i);
    }

    protected abstract Intent c(Intent intent);

    public final IBinder onBind(Intent intent) {
        return (intent == null || !"com.google.firebase.INSTANCE_ID_EVENT".equals(intent.getAction())) ? null : this.a.a();
    }

    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        final Intent c = c(intent);
        if (c == null) {
            d(intent);
            return 2;
        } else if (a(c)) {
            d(intent);
            return 2;
        } else {
            this.b.execute(new Runnable(this) {
                final /* synthetic */ zzb c;

                public void run() {
                    this.c.b(c);
                    this.c.d(intent);
                }
            });
            return 3;
        }
    }
}
