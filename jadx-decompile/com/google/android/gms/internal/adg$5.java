package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

class adg$5 implements OnClickListener {
    final /* synthetic */ JsPromptResult a;

    adg$5(JsPromptResult jsPromptResult) {
        this.a = jsPromptResult;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.cancel();
    }
}
