package com.google.android.gms.internal;

import com.google.android.gms.internal.acr.c;

class wx$2 implements c<wu> {
    final /* synthetic */ wx$d a;
    final /* synthetic */ wx b;

    wx$2(wx wxVar, wx$d com_google_android_gms_internal_wx_d) {
        this.b = wxVar;
        this.a = com_google_android_gms_internal_wx_d;
    }

    public void a(wu wuVar) {
        synchronized (wx.c(this.b)) {
            wx.a(this.b, 0);
            if (!(wx.g(this.b) == null || this.a == wx.g(this.b))) {
                abr.e("New JS engine is loaded, marking previous one as destroyable.");
                wx.g(this.b).c();
            }
            wx.a(this.b, this.a);
        }
    }

    public /* synthetic */ void a(Object obj) {
        a((wu) obj);
    }
}
