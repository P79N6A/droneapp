package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Patterns;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProxyRequest extends AbstractSafeParcelable {
    public static final Creator<ProxyRequest> CREATOR = new d();
    public static final int a = 2;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 7;
    final int k;
    public final String l;
    public final int m;
    public final long n;
    public final byte[] o;
    Bundle p;

    public static class a {
        private String a;
        private int b = ProxyRequest.b;
        private long c = 3000;
        private byte[] d = null;
        private Bundle e = new Bundle();

        public a(String str) {
            d.a(str);
            if (Patterns.WEB_URL.matcher(str).matches()) {
                this.a = str;
                return;
            }
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 51).append("The supplied url [ ").append(str).append("] is not match Patterns.WEB_URL!").toString());
        }

        public a a(int i) {
            boolean z = i >= 0 && i <= ProxyRequest.j;
            d.b(z, "Unrecognized http method code.");
            this.b = i;
            return this;
        }

        public a a(long j) {
            d.b(j >= 0, "The specified timeout must be non-negative.");
            this.c = j;
            return this;
        }

        public a a(String str, String str2) {
            d.a(str, (Object) "Header name cannot be null or empty!");
            Bundle bundle = this.e;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(str, str2);
            return this;
        }

        public a a(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        public ProxyRequest a() {
            if (this.d == null) {
                this.d = new byte[0];
            }
            return new ProxyRequest(2, this.a, this.b, this.c, this.d, this.e);
        }
    }

    ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.k = i;
        this.l = str;
        this.m = i2;
        this.n = j;
        this.o = bArr;
        this.p = bundle;
    }

    public Map<String, String> a() {
        Map linkedHashMap = new LinkedHashMap(this.p.size());
        for (String str : this.p.keySet()) {
            linkedHashMap.put(str, this.p.getString(str));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public String toString() {
        String str = this.l;
        return new StringBuilder(String.valueOf(str).length() + 42).append("ProxyRequest[ url: ").append(str).append(", method: ").append(this.m).append(" ]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
