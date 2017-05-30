package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PlacePhotoMetadataResult extends AbstractSafeParcelable implements m {
    public static final Creator<PlacePhotoMetadataResult> CREATOR = new u();
    final int a;
    final DataHolder b;
    private final Status c;
    private final j d;

    PlacePhotoMetadataResult(int i, Status status, DataHolder dataHolder) {
        this.a = i;
        this.c = status;
        this.b = dataHolder;
        if (dataHolder == null) {
            this.d = null;
        } else {
            this.d = new j(this.b);
        }
    }

    public PlacePhotoMetadataResult(Status status, DataHolder dataHolder) {
        this(0, status, dataHolder);
    }

    public Status a() {
        return this.c;
    }

    public j b() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        u.a(this, parcel, i);
    }
}
