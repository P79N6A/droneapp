package com.google.android.gms.wearable;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PutDataRequest extends AbstractSafeParcelable {
    public static final Creator<PutDataRequest> CREATOR = new aa();
    public static final String a = "wear";
    private static final long c = TimeUnit.MINUTES.toMillis(30);
    private static final Random d = new SecureRandom();
    final int b;
    private final Uri e;
    private final Bundle f;
    private byte[] g;
    private long h;

    private PutDataRequest(int i, Uri uri) {
        this(i, uri, new Bundle(), null, c);
    }

    PutDataRequest(int i, Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.b = i;
        this.e = uri;
        this.f = bundle;
        this.f.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        this.g = bArr;
        this.h = j;
    }

    public static PutDataRequest a(Uri uri) {
        return new PutDataRequest(2, uri);
    }

    public static PutDataRequest a(h hVar) {
        PutDataRequest a = a(hVar.c());
        for (Entry entry : hVar.e().entrySet()) {
            if (((i) entry.getValue()).c() == null) {
                String str = "Cannot create an asset for a put request without a digest: ";
                String valueOf = String.valueOf((String) entry.getKey());
                throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
            a.a((String) entry.getKey(), Asset.a(((i) entry.getValue()).c()));
        }
        a.a(hVar.d());
        return a;
    }

    public static PutDataRequest a(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        if (!str.endsWith("/")) {
            stringBuilder.append("/");
        }
        stringBuilder.append("PN").append(d.nextLong());
        return new PutDataRequest(2, f(stringBuilder.toString()));
    }

    public static PutDataRequest b(String str) {
        return a(f(str));
    }

    private static Uri f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        } else if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        } else if (!str.startsWith("//")) {
            return new Builder().scheme(a).path(str).build();
        } else {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
    }

    public Uri a() {
        return this.e;
    }

    public PutDataRequest a(String str, Asset asset) {
        d.a(str);
        d.a(asset);
        this.f.putParcelable(str, asset);
        return this;
    }

    public PutDataRequest a(byte[] bArr) {
        this.g = bArr;
        return this;
    }

    public String a(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("PutDataRequest[");
        String valueOf = String.valueOf(this.g == null ? "null" : Integer.valueOf(this.g.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 7).append("dataSz=").append(valueOf).toString());
        stringBuilder.append(", numAssets=" + this.f.size());
        valueOf = String.valueOf(this.e);
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 6).append(", uri=").append(valueOf).toString());
        stringBuilder.append(", syncDeadline=" + this.h);
        if (z) {
            stringBuilder.append("]\n  assets: ");
            for (String valueOf2 : this.f.keySet()) {
                String valueOf3 = String.valueOf(this.f.getParcelable(valueOf2));
                stringBuilder.append(new StringBuilder((String.valueOf(valueOf2).length() + 7) + String.valueOf(valueOf3).length()).append("\n    ").append(valueOf2).append(": ").append(valueOf3).toString());
            }
            stringBuilder.append("\n  ]");
            return stringBuilder.toString();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public byte[] b() {
        return this.g;
    }

    public Asset c(String str) {
        return (Asset) this.f.getParcelable(str);
    }

    public Map<String, Asset> c() {
        Map hashMap = new HashMap();
        for (String str : this.f.keySet()) {
            hashMap.put(str, (Asset) this.f.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public Bundle d() {
        return this.f;
    }

    public boolean d(String str) {
        return this.f.containsKey(str);
    }

    public long e() {
        return this.h;
    }

    public PutDataRequest e(String str) {
        this.f.remove(str);
        return this;
    }

    public boolean f() {
        return this.h == 0;
    }

    public PutDataRequest g() {
        this.h = 0;
        return this;
    }

    public String toString() {
        return a(Log.isLoggable(k.a, 3));
    }

    public void writeToParcel(Parcel parcel, int i) {
        aa.a(this, parcel, i);
    }
}
