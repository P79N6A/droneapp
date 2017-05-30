package com.google.ads.mediation;

import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.g;

@Keep
public final class AdUrlAdapter extends a implements c, e, g {
    public String getAdUnitId(Bundle bundle) {
        return "adurl";
    }

    protected Bundle zza(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("sdk_less_server_data", bundle2);
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}
