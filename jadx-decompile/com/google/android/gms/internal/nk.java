package com.google.android.gms.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.c.f;
import com.google.android.gms.g.g;
import java.io.InputStream;
import java.net.SocketException;
import org.json.JSONObject;

public class nk {
    static final /* synthetic */ boolean a = (!nk.class.desiredAssertionStatus());
    private nh b;
    private Exception c;
    private int d;
    private Exception e;

    public nk(@NonNull nh nhVar) {
        this.b = nhVar;
    }

    private boolean a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        this.d = -2;
        this.e = new SocketException("Network subsystem is unavailable");
        return false;
    }

    @Nullable
    public String a(String str) {
        try {
            return this.b.c(str);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "NetworkRequestProxy";
            String str3 = "getResultString failed with a RemoteException:";
            String valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), th);
            return null;
        }
    }

    public void a() {
        try {
            this.d = 0;
            this.e = null;
            this.b.a();
        } catch (Throwable e) {
            this.c = e;
            Log.e("NetworkRequestProxy", "reset failed with a RemoteException:", e);
        }
    }

    public <TResult> void a(g<TResult> gVar, TResult tResult) {
        Throwable f = f();
        if (h() && f == null) {
            gVar.a((Object) tResult);
            return;
        }
        Exception a = com.google.firebase.c.g.a(f, g());
        if (a || a != null) {
            gVar.a(a);
            return;
        }
        throw new AssertionError();
    }

    public void a(@Nullable String str, @NonNull Context context) {
        try {
            if (a(context)) {
                this.b.a(str);
            }
        } catch (Throwable e) {
            this.c = e;
            Log.e("NetworkRequestProxy", "performRequest failed with a RemoteException:", e);
        }
    }

    public void b() {
        try {
            this.b.b();
        } catch (Throwable e) {
            this.c = e;
            Log.e("NetworkRequestProxy", "performRequestEnd failed with a RemoteException:", e);
        }
    }

    public void b(@Nullable String str) {
        try {
            this.b.b(str);
        } catch (Throwable e) {
            this.c = e;
            Log.e("NetworkRequestProxy", "performRequestStart failed with a RemoteException:", e);
        }
    }

    @Nullable
    public InputStream c() {
        try {
            return (InputStream) f.a(this.b.c());
        } catch (Throwable e) {
            this.c = e;
            Log.e("NetworkRequestProxy", "getStream failed with a RemoteException:", e);
            return null;
        }
    }

    @NonNull
    public JSONObject d() {
        return (JSONObject) f.a(this.b.d());
    }

    @Nullable
    public String e() {
        try {
            this.b.e();
        } catch (Throwable e) {
            this.c = e;
            Log.e("NetworkRequestProxy", "getRawResult failed with a RemoteException:", e);
        }
        return null;
    }

    @Nullable
    public Exception f() {
        try {
            return this.e != null ? this.e : this.c != null ? this.c : (Exception) f.a(this.b.g());
        } catch (Throwable e) {
            this.c = e;
            Log.e("NetworkRequestProxy", "getException failed with a RemoteException:", e);
            return null;
        }
    }

    public int g() {
        try {
            return this.d != 0 ? this.d : this.b.h();
        } catch (Throwable e) {
            this.c = e;
            Log.e("NetworkRequestProxy", "getResultCode failed with a RemoteException:", e);
            return 0;
        }
    }

    public boolean h() {
        boolean z = false;
        try {
            if (this.d != -2 && this.e == null) {
                z = this.b.i();
            }
        } catch (Throwable e) {
            this.c = e;
            Log.e("NetworkRequestProxy", "isResultSuccess failed with a RemoteException:", e);
        }
        return z;
    }

    public int i() {
        try {
            return this.b.j();
        } catch (Throwable e) {
            this.c = e;
            Log.e("NetworkRequestProxy", "getResultingContentLength failed with a RemoteException:", e);
            return 0;
        }
    }
}
