package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.aaa;

@aaa
public class e {
    public void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel) {
        a(context, adOverlayInfoParcel, true);
    }

    public void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.l == 4 && adOverlayInfoParcel.d == null) {
            if (adOverlayInfoParcel.c != null) {
                adOverlayInfoParcel.c.e();
            }
            u.b().a(context, adOverlayInfoParcel.b, adOverlayInfoParcel.j);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.a);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.n.e);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.a(intent, adOverlayInfoParcel);
        if (!s.j()) {
            intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(com.google.android.gms.drive.e.a_);
        }
        u.e().a(context, intent);
    }
}
