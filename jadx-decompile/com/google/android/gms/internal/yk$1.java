package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.fimi.kernel.a;

class yk$1 implements OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ yk c;

    yk$1(yk ykVar, String str, String str2) {
        this.c = ykVar;
        this.a = str;
        this.b = str2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            ((DownloadManager) yk.a(this.c).getSystemService(a.a)).enqueue(this.c.a(this.a, this.b));
        } catch (IllegalStateException e) {
            this.c.b("Could not store picture.");
        }
    }
}
