package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

class adg$1 implements OnCancelListener {
    final /* synthetic */ JsResult a;

    adg$1(JsResult jsResult) {
        this.a = jsResult;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.cancel();
    }
}
