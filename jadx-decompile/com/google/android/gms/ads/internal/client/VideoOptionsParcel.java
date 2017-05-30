package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public class VideoOptionsParcel extends AbstractSafeParcelable {
    public static final r CREATOR = new r();
    public final int a;
    public final boolean b;

    public VideoOptionsParcel(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public VideoOptionsParcel(i iVar) {
        this(1, iVar.a());
    }

    public void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
