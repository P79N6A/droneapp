package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class yk$2 implements OnClickListener {
    final /* synthetic */ yk a;

    yk$2(yk ykVar) {
        this.a = ykVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.b("User canceled the download.");
    }
}
