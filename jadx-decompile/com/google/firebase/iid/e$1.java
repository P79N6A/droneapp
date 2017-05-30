package com.google.firebase.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class e$1 extends Handler {
    final /* synthetic */ e a;

    e$1(e eVar, Looper looper) {
        this.a = eVar;
        super(looper);
    }

    public void handleMessage(Message message) {
        this.a.a(message);
    }
}
