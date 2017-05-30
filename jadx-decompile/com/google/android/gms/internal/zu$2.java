package com.google.android.gms.internal;

class zu$2 implements Runnable {
    final /* synthetic */ acl a;
    final /* synthetic */ String b;
    final /* synthetic */ zu c;

    zu$2(zu zuVar, acl com_google_android_gms_internal_acl, String str) {
        this.c = zuVar;
        this.a = com_google_android_gms_internal_acl;
        this.b = str;
    }

    public void run() {
        this.a.b((vi) zu.b(this.c).F().get(this.b));
    }
}
