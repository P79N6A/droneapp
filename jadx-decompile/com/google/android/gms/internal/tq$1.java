package com.google.android.gms.internal;

import android.view.View;

class tq$1 implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ tq b;

    tq$1(tq tqVar, View view) {
        this.b = tqVar;
        this.a = view;
    }

    public void run() {
        this.b.b(this.a);
    }
}
