package com.google.android.gms.internal;

import com.google.android.gms.internal.adf.a;

class acc$2 implements a {
    final /* synthetic */ String a;
    final /* synthetic */ acc$c b;
    final /* synthetic */ acc c;

    acc$2(acc com_google_android_gms_internal_acc, String str, acc$c com_google_android_gms_internal_acc_c) {
        this.c = com_google_android_gms_internal_acc;
        this.a = str;
        this.b = com_google_android_gms_internal_acc_c;
    }

    public void a(aii com_google_android_gms_internal_aii) {
        String str = this.a;
        String valueOf = String.valueOf(com_google_android_gms_internal_aii.toString());
        abr.d(new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(valueOf).length()).append("Failed to load URL: ").append(str).append("\n").append(valueOf).toString());
        this.b.a(null);
    }
}
