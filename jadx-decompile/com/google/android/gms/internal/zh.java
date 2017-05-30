package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.ads.purchase.a;

@aaa
public class zh implements a {
    private final yx e;

    public zh(yx yxVar) {
        this.e = yxVar;
    }

    public String a() {
        try {
            return this.e.a();
        } catch (Throwable e) {
            b.d("Could not forward getProductId to InAppPurchase", e);
            return null;
        }
    }

    public void a(int i) {
        try {
            this.e.b(i);
        } catch (Throwable e) {
            b.d("Could not forward recordResolution to InAppPurchase", e);
        }
    }

    public void b(int i) {
        try {
            this.e.c(i);
        } catch (Throwable e) {
            b.d("Could not forward recordPlayBillingResolution to InAppPurchase", e);
        }
    }
}
