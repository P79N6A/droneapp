package com.tencent.connect.auth;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.open.web.security.JniInterface;

class AuthDialog$3 implements OnDismissListener {
    final /* synthetic */ AuthDialog a;

    AuthDialog$3(AuthDialog authDialog) {
        this.a = authDialog;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        try {
            JniInterface.clearAllPWD();
        } catch (Exception e) {
        }
    }
}
