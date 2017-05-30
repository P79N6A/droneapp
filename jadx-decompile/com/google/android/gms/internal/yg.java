package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsIntent.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;

@aaa
public class yg implements e {
    private Activity a;
    private ut b;
    private f c;
    private Uri d;

    public static boolean a(Context context) {
        return ut.a(context);
    }

    public void onDestroy() {
        b.a("Destroying AdMobCustomTabsAdapter adapter.");
        try {
            this.b.a(this.a);
        } catch (Throwable e) {
            b.b("Exception while unbinding from CustomTabsService.", e);
        }
    }

    public void onPause() {
        b.a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public void onResume() {
        b.a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public void requestInterstitialAd(Context context, f fVar, Bundle bundle, a aVar, Bundle bundle2) {
        this.c = fVar;
        if (this.c == null) {
            b.d("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            b.d("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.c.a(this, 0);
        } else if (a(context)) {
            Object string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                b.d("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.c.a(this, 0);
                return;
            }
            this.a = (Activity) context;
            this.d = Uri.parse(string);
            this.b = new ut();
            this.b.a(new 1(this));
            this.b.b(this.a);
            this.c.a(this);
        } else {
            b.d("Default browser does not support custom tabs. Bailing out.");
            this.c.a(this, 0);
        }
    }

    public void showInterstitial() {
        CustomTabsIntent build = new Builder(this.b.b()).build();
        build.intent.setData(this.d);
        abv.a.post(new 3(this, new AdOverlayInfoParcel(new AdLauncherIntentInfoParcel(build.intent), null, new 2(this), null, new VersionInfoParcel(0, 0, false))));
        u.i().c(false);
    }
}
