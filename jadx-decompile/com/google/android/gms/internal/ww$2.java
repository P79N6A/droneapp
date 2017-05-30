package com.google.android.gms.internal;

class ww$2 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ ww c;

    ww$2(ww wwVar, String str, String str2) {
        this.c = wwVar;
        this.a = str;
        this.b = str2;
    }

    public void run() {
        ww.a(this.c).a(this.a, this.b);
    }
}
