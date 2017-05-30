package com.google.android.gms.internal;

class ww$5 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ww b;

    ww$5(ww wwVar, String str) {
        this.b = wwVar;
        this.a = str;
    }

    public void run() {
        ww.a(this.b).loadUrl(this.a);
    }
}
