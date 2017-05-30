package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.ads.internal.u;

class aby$2 implements OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ aby b;

    aby$2(aby com_google_android_gms_internal_aby, String str) {
        this.b = com_google_android_gms_internal_aby;
        this.a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        u.e().a(aby.b(this.b), Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.a), "Share via"));
    }
}
