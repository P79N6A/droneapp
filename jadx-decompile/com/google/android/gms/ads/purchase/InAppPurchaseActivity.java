package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.yz;

public class InAppPurchaseActivity extends Activity {
    public static final String a = "com.google.android.gms.ads.purchase.InAppPurchaseActivity";
    public static final String b = "InAppPurchaseActivity";
    private yz c;

    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            if (this.c != null) {
                this.c.a(i, i2, intent);
            }
        } catch (Throwable e) {
            b.d("Could not forward onActivityResult to in-app purchase manager:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = ac.b().a((Activity) this);
        if (this.c == null) {
            b.d("Could not create in-app purchase manager.");
            finish();
            return;
        }
        try {
            this.c.a();
        } catch (Throwable e) {
            b.d("Could not forward onCreate to in-app purchase manager:", e);
            finish();
        }
    }

    protected void onDestroy() {
        try {
            if (this.c != null) {
                this.c.b();
            }
        } catch (Throwable e) {
            b.d("Could not forward onDestroy to in-app purchase manager:", e);
        }
        super.onDestroy();
    }
}
