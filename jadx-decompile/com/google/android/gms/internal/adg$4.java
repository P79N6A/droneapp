package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

class adg$4 implements OnCancelListener {
    final /* synthetic */ JsPromptResult a;

    adg$4(JsPromptResult jsPromptResult) {
        this.a = jsPromptResult;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.cancel();
    }
}
