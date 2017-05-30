package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public class NativeAdOptionsParcel extends AbstractSafeParcelable {
    public static final k CREATOR = new k();
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    @Nullable
    public final VideoOptionsParcel f;

    public NativeAdOptionsParcel(int i, boolean z, int i2, boolean z2, int i3, VideoOptionsParcel videoOptionsParcel) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = i3;
        this.f = videoOptionsParcel;
    }

    public NativeAdOptionsParcel(b bVar) {
        this(3, bVar.a(), bVar.b(), bVar.c(), bVar.d(), bVar.e() != null ? new VideoOptionsParcel(bVar.e()) : null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
