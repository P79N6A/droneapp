package com.google.android.gms.internal;

class abd$1 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ abd c;

    abd$1(abd com_google_android_gms_internal_abd, String str, long j) {
        this.c = com_google_android_gms_internal_abd;
        this.a = str;
        this.b = j;
    }

    public void run() {
        abd.b(this.c).a(this.a, this.b);
        abd.b(this.c).a(toString());
    }
}
