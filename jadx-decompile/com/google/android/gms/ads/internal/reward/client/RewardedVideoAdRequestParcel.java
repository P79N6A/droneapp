package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public final class RewardedVideoAdRequestParcel extends AbstractSafeParcelable {
    public static final h CREATOR = new h();
    public final int a;
    public final AdRequestParcel b;
    public final String c;

    public RewardedVideoAdRequestParcel(int i, AdRequestParcel adRequestParcel, String str) {
        this.a = i;
        this.b = adRequestParcel;
        this.c = str;
    }

    public RewardedVideoAdRequestParcel(AdRequestParcel adRequestParcel, String str) {
        this(1, adRequestParcel, str);
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
