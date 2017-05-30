package com.tencent.connect.auth;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class AuthDialog$THandler extends Handler {
    final /* synthetic */ AuthDialog a;
    private AuthDialog$OnTimeListener b;

    public AuthDialog$THandler(AuthDialog authDialog, AuthDialog$OnTimeListener authDialog$OnTimeListener, Looper looper) {
        this.a = authDialog;
        super(looper);
        this.b = authDialog$OnTimeListener;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.b.a((String) message.obj);
                return;
            case 2:
                this.b.onCancel();
                return;
            case 3:
                AuthDialog.a(AuthDialog.a(this.a), (String) message.obj);
                return;
            default:
                return;
        }
    }
}
