package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

class adg$2 implements OnClickListener {
    final /* synthetic */ JsResult a;

    adg$2(JsResult jsResult) {
        this.a = jsResult;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.cancel();
    }
}
