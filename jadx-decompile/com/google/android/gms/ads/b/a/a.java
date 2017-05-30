package com.google.android.gms.ads.b.a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.b;

public interface a extends b {
    public static final String a = "parameter";

    void initialize(Context context, com.google.android.gms.ads.mediation.a aVar, String str, b bVar, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(com.google.android.gms.ads.mediation.a aVar, Bundle bundle, Bundle bundle2);

    void showVideo();
}
