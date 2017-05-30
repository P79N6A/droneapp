package com.tencent.connect.auth;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class AuthDialog$2 implements OnTouchListener {
    final /* synthetic */ AuthDialog a;

    AuthDialog$2(AuthDialog authDialog) {
        this.a = authDialog;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
            case 1:
                if (!view.hasFocus()) {
                    view.requestFocus();
                    break;
                }
                break;
        }
        return false;
    }
}
