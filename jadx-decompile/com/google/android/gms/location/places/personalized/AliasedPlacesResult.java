package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class AliasedPlacesResult extends AbstractSafeParcelable implements m {
    public static final Creator<AliasedPlacesResult> CREATOR = new b();
    final int a;
    private final Status b;
    private final List<AliasedPlace> c;

    AliasedPlacesResult(int i, Status status, List<AliasedPlace> list) {
        this.a = i;
        this.b = status;
        this.c = list;
    }

    public Status a() {
        return this.b;
    }

    public List<AliasedPlace> b() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
