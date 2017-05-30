package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.stats.b;
import com.google.android.gms.internal.apf.a;
import com.google.android.gms.tagmanager.TagManagerService;

public class aqa implements ServiceConnection {
    private final Context a;
    private final b b;
    private volatile boolean c;
    private volatile boolean d;
    private apf e;

    public aqa(Context context) {
        this(context, b.a());
    }

    aqa(Context context, b bVar) {
        this.c = false;
        this.d = false;
        this.a = context;
        this.b = bVar;
    }

    @WorkerThread
    private void a(@Nullable ape com_google_android_gms_internal_ape, String str) {
        if (com_google_android_gms_internal_ape != null) {
            try {
                com_google_android_gms_internal_ape.a(false, str);
            } catch (Throwable e) {
                aph.a("Error - local callback should not throw RemoteException", e);
            }
        }
    }

    @WorkerThread
    public void a(String str, Bundle bundle, String str2, long j, boolean z) {
        if (a()) {
            try {
                this.e.a(str, bundle, str2, j, z);
            } catch (Throwable e) {
                aph.b("Error calling service to emit event", e);
            }
        }
    }

    @WorkerThread
    public void a(String str, @Nullable String str2, @Nullable String str3, @Nullable ape com_google_android_gms_internal_ape) {
        if (a()) {
            try {
                this.e.a(str, str2, str3, com_google_android_gms_internal_ape);
                return;
            } catch (Throwable e) {
                aph.b("Error calling service to load container", e);
                a(com_google_android_gms_internal_ape, str);
                return;
            }
        }
        a(com_google_android_gms_internal_ape, str);
    }

    @WorkerThread
    public boolean a() {
        if (this.c) {
            return true;
        }
        synchronized (this) {
            if (this.c) {
                return true;
            }
            if (!this.d) {
                if (this.b.a(this.a, new Intent(this.a, TagManagerService.class), (ServiceConnection) this, 1)) {
                    this.d = true;
                } else {
                    return false;
                }
            }
            while (this.d) {
                try {
                    wait();
                    this.d = false;
                } catch (Throwable e) {
                    aph.b("Error connecting to TagManagerService", e);
                    this.d = false;
                }
            }
            boolean z = this.c;
            return z;
        }
    }

    @WorkerThread
    public boolean b() {
        if (a()) {
            try {
                this.e.a();
                return true;
            } catch (Throwable e) {
                aph.b("Error in resetting service", e);
            }
        }
        return false;
    }

    @WorkerThread
    public void c() {
        if (a()) {
            try {
                this.e.b();
            } catch (Throwable e) {
                aph.b("Error calling service to dispatch pending events", e);
            }
        }
    }

    @MainThread
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.e = a.a(iBinder);
            this.c = true;
            this.d = false;
            notifyAll();
        }
    }

    @MainThread
    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.e = null;
            this.c = false;
            this.d = false;
        }
    }
}
