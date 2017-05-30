package com.xiaomi.market.sdk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

class u implements OnClickListener {
    u() {
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!s.l(XiaomiUpdateAgent.mContext) || XiaomiUpdateAgent.aK.bj == 1) {
            m.i(XiaomiUpdateAgent.mContext).a(XiaomiUpdateAgent.aL, XiaomiUpdateAgent.aK);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + XiaomiUpdateAgent.aL.packageName));
        intent.setClassName("com.xiaomi.market", "com.xiaomi.market.ui.AppDetailActivity");
        XiaomiUpdateAgent.mContext.startActivity(intent);
    }
}
