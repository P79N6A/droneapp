package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.d;

public interface c extends b {
    View getBannerView();

    void requestBannerAd(Context context, d dVar, Bundle bundle, d dVar2, a aVar, Bundle bundle2);
}
