package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.places.g;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import java.util.ArrayList;
import java.util.List;

public final class PlacesData extends AbstractSafeParcelable {
    public static final Creator<PlacesData> CREATOR = new g();
    private final int a;
    private final ArrayList<PlaceLikelihoodEntity> b;

    PlacesData(int i, ArrayList<PlaceLikelihoodEntity> arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public List<g> a() {
        return this.b;
    }

    ArrayList<PlaceLikelihoodEntity> b() {
        return this.b;
    }

    int c() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
