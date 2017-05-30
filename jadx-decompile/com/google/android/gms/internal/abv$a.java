package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class abv$a extends BroadcastReceiver {
    final /* synthetic */ abv a;

    private abv$a(abv com_google_android_gms_internal_abv) {
        this.a = com_google_android_gms_internal_abv;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            abv.a(this.a, true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            abv.a(this.a, false);
        }
    }
}
