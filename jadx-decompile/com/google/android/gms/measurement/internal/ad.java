package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.MainThread;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.d;

class ad extends BroadcastReceiver {
    static final String a = ad.class.getName();
    private final aj b;
    private boolean c;
    private boolean d;

    ad(aj ajVar) {
        d.a(ajVar);
        this.b = ajVar;
    }

    private Context d() {
        return this.b.r();
    }

    private ab e() {
        return this.b.f();
    }

    @WorkerThread
    public void a() {
        this.b.a();
        this.b.z();
        if (!this.c) {
            d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.d = this.b.q().f();
            e().E().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.d));
            this.c = true;
        }
    }

    @WorkerThread
    public void b() {
        this.b.a();
        this.b.z();
        if (c()) {
            e().E().a("Unregistering connectivity change receiver");
            this.c = false;
            this.d = false;
            try {
                d().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                e().f().a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @WorkerThread
    public boolean c() {
        this.b.z();
        return this.c;
    }

    @MainThread
    public void onReceive(Context context, Intent intent) {
        this.b.a();
        String action = intent.getAction();
        e().E().a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            final boolean f = this.b.q().f();
            if (this.d != f) {
                this.d = f;
                this.b.h().a(new Runnable(this) {
                    final /* synthetic */ ad b;

                    public void run() {
                        this.b.b.a(f);
                    }
                });
                return;
            }
            return;
        }
        e().z().a("NetworkBroadcastReceiver received unknown action", action);
    }
}
