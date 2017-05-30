package com.google.android.gms.internal;

class ww$3 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ww b;

    ww$3(ww wwVar, String str) {
        this.b = wwVar;
        this.a = str;
    }

    public void run() {
        ww.a(this.b).loadData(this.a, "text/html", "UTF-8");
    }
}
