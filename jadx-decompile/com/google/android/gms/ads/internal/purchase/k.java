package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;

@aaa
public class k {
    private final String a;

    public k(String str) {
        this.a = str;
    }

    public String a() {
        return u.e().d();
    }

    public boolean a(String str, int i, Intent intent) {
        if (str == null || intent == null) {
            return false;
        }
        String b = u.s().b(intent);
        String c = u.s().c(intent);
        if (b == null || c == null) {
            return false;
        }
        if (!str.equals(u.s().a(b))) {
            b.d("Developer payload not match.");
            return false;
        } else if (this.a == null || l.a(this.a, b, c)) {
            return true;
        } else {
            b.d("Fail to verify signature.");
            return false;
        }
    }
}
