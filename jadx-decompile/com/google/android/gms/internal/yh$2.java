package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class yh$2 implements OnClickListener {
    final /* synthetic */ yh a;

    yh$2(yh yhVar) {
        this.a = yhVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.b("Operation denied by user.");
    }
}
