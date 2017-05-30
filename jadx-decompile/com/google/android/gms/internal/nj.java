package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.ni.a;
import com.google.firebase.b;
import org.json.JSONObject;

public class nj {
    private static final Object a = new Object();
    private static volatile nj b;
    private ni c;
    private Context d;

    private nj(@NonNull Context context) {
        this.d = context;
        try {
            this.c = a.a(akb.a(context, akb.a, "com.google.android.gms.firebasestorage").a("com.google.firebase.storage.network.NetworkRequestFactoryImpl"));
            if (this.c == null) {
                Log.e("NetworkRqFactoryProxy", "Unable to load Firebase Storage Network layer.");
                throw new RemoteException();
            }
        } catch (Throwable e) {
            Log.e("NetworkRqFactoryProxy", "NetworkRequestFactoryProxy failed with a RemoteException:", e);
            throw new RemoteException();
        }
    }

    public static nj a(@NonNull b bVar) {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new nj(bVar.a());
                }
            }
        }
        return b;
    }

    @NonNull
    public nk a(Uri uri) {
        return new nk(this.c.a(uri, f.a(this.d)));
    }

    @NonNull
    public nk a(Uri uri, long j) {
        return new nk(this.c.a(uri, f.a(this.d), j));
    }

    @NonNull
    public nk a(Uri uri, String str) {
        return new nk(this.c.b(uri, f.a(this.d), str));
    }

    @NonNull
    public nk a(Uri uri, String str, byte[] bArr, long j, int i, boolean z) {
        return new nk(this.c.a(uri, f.a(this.d), str, f.a(bArr), j, i, z));
    }

    @NonNull
    public nk a(Uri uri, JSONObject jSONObject) {
        return new nk(this.c.a(uri, f.a(this.d), f.a(jSONObject)));
    }

    @NonNull
    public nk a(Uri uri, JSONObject jSONObject, String str) {
        return new nk(this.c.a(uri, f.a(this.d), f.a(jSONObject), str));
    }

    @Nullable
    public String a() {
        try {
            return this.c.a();
        } catch (Throwable e) {
            Log.e("NetworkRqFactoryProxy", "getBackendAuthority failed with a RemoteException:", e);
            return null;
        }
    }

    @NonNull
    public nk b(Uri uri) {
        return new nk(this.c.b(uri, f.a(this.d)));
    }

    @NonNull
    public nk b(Uri uri, String str) {
        return new nk(this.c.c(uri, f.a(this.d), str));
    }

    @Nullable
    public String c(Uri uri) {
        try {
            return this.c.a(uri);
        } catch (Throwable e) {
            Log.e("NetworkRqFactoryProxy", "getDefaultURL failed with a RemoteException:", e);
            return null;
        }
    }
}
