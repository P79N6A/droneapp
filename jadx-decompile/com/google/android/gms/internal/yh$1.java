package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.gms.ads.internal.u;

class yh$1 implements OnClickListener {
    final /* synthetic */ yh a;

    yh$1(yh yhVar) {
        this.a = yhVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        u.e().a(yh.a(this.a), this.a.b());
    }
}
