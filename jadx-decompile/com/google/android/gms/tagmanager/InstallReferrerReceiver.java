package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;

public final class InstallReferrerReceiver extends CampaignTrackingReceiver {
    protected Class<? extends CampaignTrackingService> a() {
        return InstallReferrerService.class;
    }

    protected void a(Context context, String str) {
        an.a(str);
        an.a(context, str);
    }
}
