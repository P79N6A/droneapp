package com.google.android.gms.internal;

import com.google.android.gms.internal.acr.a;

class wx$3 implements a {
    final /* synthetic */ wx$d a;
    final /* synthetic */ wx b;

    wx$3(wx wxVar, wx$d com_google_android_gms_internal_wx_d) {
        this.b = wxVar;
        this.a = com_google_android_gms_internal_wx_d;
    }

    public void a() {
        synchronized (wx.c(this.b)) {
            wx.a(this.b, 1);
            abr.e("Failed loading new engine. Marking new engine destroyable.");
            this.a.c();
        }
    }
}
