package com.google.android.gms.vision.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.akb;

public abstract class a<T> {
    private final Context a;
    private final Object b = new Object();
    private final String c;
    private boolean d = false;
    private T e;

    public a(Context context, String str) {
        this.a = context;
        this.c = str;
    }

    protected abstract void a();

    protected abstract T b(akb com_google_android_gms_internal_akb, Context context);

    public boolean b() {
        return d() != null;
    }

    public void c() {
        synchronized (this.b) {
            if (this.e == null) {
                return;
            }
            try {
                a();
            } catch (Throwable e) {
                Log.e(this.c, "Could not finalize native handle", e);
            }
        }
    }

    protected T d() {
        T t;
        Throwable e;
        synchronized (this.b) {
            if (this.e != null) {
                t = this.e;
            } else {
                try {
                    this.e = b(akb.a(this.a, akb.d, "com.google.android.gms.vision.dynamite"), this.a);
                } catch (com.google.android.gms.internal.akb.a e2) {
                    e = e2;
                    Log.e(this.c, "Error creating remote native handle", e);
                    if (!!this.d) {
                    }
                    Log.w(this.c, "Native handle is now available.");
                    t = this.e;
                    return t;
                } catch (RemoteException e3) {
                    e = e3;
                    Log.e(this.c, "Error creating remote native handle", e);
                    if (!this.d) {
                    }
                    Log.w(this.c, "Native handle is now available.");
                    t = this.e;
                    return t;
                }
                if (!this.d && this.e == null) {
                    Log.w(this.c, "Native handle not yet available. Reverting to no-op handle.");
                    this.d = true;
                } else if (this.d && this.e != null) {
                    Log.w(this.c, "Native handle is now available.");
                }
                t = this.e;
            }
        }
        return t;
    }
}
