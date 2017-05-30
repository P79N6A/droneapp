package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.b;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

public class FirebaseInstanceId {
    private static Map<String, FirebaseInstanceId> a = new ArrayMap();
    private static d b;
    private final b c;
    private final c d;
    private final String e = b();

    private FirebaseInstanceId(b bVar, c cVar) {
        this.c = bVar;
        this.d = cVar;
        if (this.e == null) {
            throw new IllegalStateException("IID failing to initialize, FirebaseApp is missing project ID");
        }
        FirebaseInstanceIdService.a(this.c.a(), this);
    }

    public static FirebaseInstanceId a() {
        return getInstance(b.d());
    }

    static String a(Context context) {
        return a().c.c().b();
    }

    static String a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required alghorithms");
            return null;
        }
    }

    static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    static void a(Context context, f fVar) {
        fVar.c();
        Intent intent = new Intent();
        intent.putExtra("CMD", "RST");
        context.sendBroadcast(FirebaseInstanceIdInternalReceiver.a(context, intent));
    }

    static int b(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return i;
        }
    }

    static String c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return null;
        }
    }

    static void d(Context context) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.putExtra("CMD", "SYNC");
        context.sendBroadcast(FirebaseInstanceIdInternalReceiver.a(context, intent));
    }

    @Keep
    public static synchronized FirebaseInstanceId getInstance(@NonNull b bVar) {
        FirebaseInstanceId firebaseInstanceId;
        synchronized (FirebaseInstanceId.class) {
            firebaseInstanceId = (FirebaseInstanceId) a.get(bVar.c().b());
            if (firebaseInstanceId == null) {
                c a = c.a(bVar.a(), null);
                if (b == null) {
                    b = new d(a.d());
                }
                firebaseInstanceId = new FirebaseInstanceId(bVar, a);
                a.put(bVar.c().b(), firebaseInstanceId);
            }
        }
        return firebaseInstanceId;
    }

    @WorkerThread
    public String a(String str, String str2) {
        return this.d.b(str, str2, null);
    }

    public void a(String str) {
        b.a(str);
        FirebaseInstanceIdService.a(this.c.a());
    }

    String b() {
        String d = this.c.c().d();
        if (d != null) {
            return d;
        }
        d = this.c.c().b();
        if (!d.startsWith("1:")) {
            return d;
        }
        String[] split = d.split(":");
        if (split.length < 2) {
            return null;
        }
        d = split[1];
        return d.isEmpty() ? null : d;
    }

    void b(String str) {
        if (f() == null) {
            throw new IOException("token not available");
        }
        Bundle bundle = new Bundle();
        String str2 = "gcm.topic";
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str);
        bundle.putString(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        c cVar = this.d;
        valueOf = f();
        String valueOf3 = String.valueOf("/topics/");
        valueOf2 = String.valueOf(str);
        cVar.b(valueOf, valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3), bundle);
    }

    @WorkerThread
    public void b(String str, String str2) {
        this.d.a(str, str2, null);
    }

    public String c() {
        return a(this.d.a());
    }

    void c(String str) {
        if (f() == null) {
            throw new IOException("token not available");
        }
        Bundle bundle = new Bundle();
        String str2 = "gcm.topic";
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str);
        bundle.putString(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        c cVar = this.d;
        valueOf = f();
        String valueOf3 = String.valueOf("/topics/");
        valueOf2 = String.valueOf(str);
        cVar.a(valueOf, valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3), bundle);
    }

    public long d() {
        return this.d.b();
    }

    public void e() {
        this.d.a("*", "*", null);
        this.d.c();
    }

    @Nullable
    public String f() {
        a g = g();
        if (g == null || g.b(c.e)) {
            FirebaseInstanceIdService.a(this.c.a());
        }
        return g != null ? g.a : null;
    }

    @Nullable
    a g() {
        return this.d.d().a("", this.e, "*");
    }

    String h() {
        return a(this.e, "*");
    }

    d i() {
        return b;
    }
}
