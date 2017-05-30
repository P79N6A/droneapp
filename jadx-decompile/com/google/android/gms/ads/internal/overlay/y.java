package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abv;

@aaa
class y implements Runnable {
    private k a;
    private boolean b = false;

    y(k kVar) {
        this.a = kVar;
    }

    public void a() {
        this.b = true;
        abv.a.removeCallbacks(this);
    }

    public void b() {
        abv.a.postDelayed(this, 250);
    }

    public void run() {
        if (!this.b) {
            this.a.n();
            b();
        }
    }
}
