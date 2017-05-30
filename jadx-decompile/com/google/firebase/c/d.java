package com.google.firebase.c;

import android.net.Uri;
import android.net.Uri.Builder;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ng;
import com.google.firebase.b;
import java.util.HashMap;
import java.util.Map;

public class d {
    static final /* synthetic */ boolean a = (!d.class.desiredAssertionStatus());
    private static final Map<b, d> b = new HashMap();
    private final b c;
    private long d = 600000;
    private long e = 600000;
    private long f = 120000;

    private d(@NonNull b bVar) {
        this.c = bVar;
    }

    @NonNull
    public static d a() {
        b d = b.d();
        com.google.android.gms.common.internal.d.b(d != null, "You must call FirebaseApp.initialize() first.");
        if (a || d != null) {
            return a(d);
        }
        throw new AssertionError();
    }

    @NonNull
    public static d a(@NonNull b bVar) {
        d dVar;
        com.google.android.gms.common.internal.d.b(bVar != null, "Null is not a valid value for the FirebaseApp.");
        synchronized (b) {
            dVar = (d) b.get(bVar);
            if (dVar == null) {
                dVar = new d(bVar);
                b.put(bVar, dVar);
            }
        }
        return dVar;
    }

    @NonNull
    private i a(@NonNull Uri uri) {
        com.google.android.gms.common.internal.d.a(uri, "uri must not be null");
        Object g = g();
        boolean z = TextUtils.isEmpty(g) || uri.getAuthority().equalsIgnoreCase(g);
        com.google.android.gms.common.internal.d.b(z, "The supplied bucketname is not available to this project.");
        return new i(uri, this);
    }

    @Nullable
    private String g() {
        return this.c.c().e();
    }

    @NonNull
    public i a(@NonNull String str) {
        com.google.android.gms.common.internal.d.b(!TextUtils.isEmpty(str), "location must not be null or empty");
        String toLowerCase = str.toLowerCase();
        if (toLowerCase.startsWith("gs://") || toLowerCase.startsWith("https://") || toLowerCase.startsWith("http://")) {
            try {
                Uri a = ng.a(this.c, str);
                if (a != null) {
                    return a(a);
                }
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            } catch (Throwable e) {
                Throwable th = e;
                String str2 = "FirebaseStorage";
                String str3 = "Unable to parse location:";
                toLowerCase = String.valueOf(str);
                Log.e(str2, toLowerCase.length() != 0 ? str3.concat(toLowerCase) : new String(str3), th);
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            }
        }
        throw new IllegalArgumentException("The storage Uri could not be parsed.");
    }

    public void a(long j) {
        this.e = j;
    }

    public long b() {
        return this.e;
    }

    @NonNull
    public i b(@NonNull String str) {
        com.google.android.gms.common.internal.d.b(!TextUtils.isEmpty(str), "location must not be null or empty");
        String toLowerCase = str.toLowerCase();
        if (!toLowerCase.startsWith("gs://") && !toLowerCase.startsWith("https://") && !toLowerCase.startsWith("http://")) {
            return e().a(str);
        }
        throw new IllegalArgumentException("location should not be a full URL.");
    }

    public void b(long j) {
        this.d = j;
    }

    public long c() {
        return this.d;
    }

    public void c(long j) {
        this.f = j;
    }

    public long d() {
        return this.f;
    }

    @NonNull
    public i e() {
        if (!TextUtils.isEmpty(g())) {
            return a(new Builder().scheme("gs").authority(g()).path("/").build());
        }
        throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
    }

    @NonNull
    public b f() {
        return this.c;
    }
}
