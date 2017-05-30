package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.places.g;

public class PlaceLikelihoodEntity extends AbstractSafeParcelable implements g {
    public static final Creator<PlaceLikelihoodEntity> CREATOR = new m();
    final int a;
    final PlaceEntity b;
    final float c;

    PlaceLikelihoodEntity(int i, PlaceEntity placeEntity, float f) {
        this.a = i;
        this.b = placeEntity;
        this.c = f;
    }

    public static PlaceLikelihoodEntity a(PlaceEntity placeEntity, float f) {
        return new PlaceLikelihoodEntity(0, (PlaceEntity) d.a(placeEntity), f);
    }

    public /* synthetic */ Object a() {
        return e();
    }

    public boolean b() {
        return true;
    }

    public float c() {
        return this.c;
    }

    public com.google.android.gms.location.places.d d() {
        return this.b;
    }

    public g e() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceLikelihoodEntity)) {
            return false;
        }
        PlaceLikelihoodEntity placeLikelihoodEntity = (PlaceLikelihoodEntity) obj;
        return this.b.equals(placeLikelihoodEntity.b) && this.c == placeLikelihoodEntity.c;
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, Float.valueOf(this.c)});
    }

    public String toString() {
        return c.a(this).a("place", this.b).a("likelihood", Float.valueOf(this.c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel, i);
    }
}
