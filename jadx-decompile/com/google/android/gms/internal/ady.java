package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.n;
import com.google.android.gms.common.internal.d;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class ady extends n<ady> {
    private String a;
    private int b;
    private int c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;

    public ady() {
        this(false);
    }

    public ady(boolean z) {
        this(z, a());
    }

    public ady(boolean z, int i) {
        d.a(i);
        this.b = i;
        this.g = z;
    }

    static int a() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits != 0) {
            return leastSignificantBits;
        }
        leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L);
        if (leastSignificantBits != 0) {
            return leastSignificantBits;
        }
        Log.e("GAv4", "UUID.randomUUID() returned 0.");
        return Integer.MAX_VALUE;
    }

    private void e() {
    }

    public void a(int i) {
        e();
        this.b = i;
    }

    public /* synthetic */ void a(n nVar) {
        a((ady) nVar);
    }

    public void a(ady com_google_android_gms_internal_ady) {
        if (!TextUtils.isEmpty(this.a)) {
            com_google_android_gms_internal_ady.a(this.a);
        }
        if (this.b != 0) {
            com_google_android_gms_internal_ady.a(this.b);
        }
        if (this.c != 0) {
            com_google_android_gms_internal_ady.b(this.c);
        }
        if (!TextUtils.isEmpty(this.d)) {
            com_google_android_gms_internal_ady.b(this.d);
        }
        if (!TextUtils.isEmpty(this.e)) {
            com_google_android_gms_internal_ady.c(this.e);
        }
        if (this.f) {
            com_google_android_gms_internal_ady.b(this.f);
        }
        if (this.g) {
            com_google_android_gms_internal_ady.a(this.g);
        }
    }

    public void a(String str) {
        e();
        this.a = str;
    }

    public void a(boolean z) {
        e();
        this.g = z;
    }

    public String b() {
        return this.a;
    }

    public void b(int i) {
        e();
        this.c = i;
    }

    public void b(String str) {
        e();
        this.d = str;
    }

    public void b(boolean z) {
        e();
        this.f = z;
    }

    public int c() {
        return this.b;
    }

    public void c(String str) {
        e();
        if (TextUtils.isEmpty(str)) {
            this.e = null;
        } else {
            this.e = str;
        }
    }

    public String d() {
        return this.e;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("screenName", this.a);
        hashMap.put("interstitial", Boolean.valueOf(this.f));
        hashMap.put("automatic", Boolean.valueOf(this.g));
        hashMap.put("screenId", Integer.valueOf(this.b));
        hashMap.put("referrerScreenId", Integer.valueOf(this.c));
        hashMap.put("referrerScreenName", this.d);
        hashMap.put("referrerUri", this.e);
        return a(hashMap);
    }
}
