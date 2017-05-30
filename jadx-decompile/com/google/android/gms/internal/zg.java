package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.ads.purchase.c;

@aaa
public class zg implements c {
    private final zc a;

    public zg(zc zcVar) {
        this.a = zcVar;
    }

    public String a() {
        try {
            return this.a.b();
        } catch (Throwable e) {
            b.d("Could not forward getProductId to InAppPurchaseResult", e);
            return null;
        }
    }

    public Intent b() {
        try {
            return this.a.c();
        } catch (Throwable e) {
            b.d("Could not forward getPurchaseData to InAppPurchaseResult", e);
            return null;
        }
    }

    public int c() {
        try {
            return this.a.d();
        } catch (Throwable e) {
            b.d("Could not forward getPurchaseData to InAppPurchaseResult", e);
            return 0;
        }
    }

    public boolean d() {
        try {
            return this.a.a();
        } catch (Throwable e) {
            b.d("Could not forward isVerified to InAppPurchaseResult", e);
            return false;
        }
    }

    public void e() {
        try {
            this.a.e();
        } catch (Throwable e) {
            b.d("Could not forward finishPurchase to InAppPurchaseResult", e);
        }
    }
}
