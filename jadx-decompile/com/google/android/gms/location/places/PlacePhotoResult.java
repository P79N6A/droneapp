package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PlacePhotoResult extends AbstractSafeParcelable implements m {
    public static final Creator<PlacePhotoResult> CREATOR = new v();
    final int a;
    final BitmapTeleporter b;
    private final Status c;
    private final Bitmap d;

    PlacePhotoResult(int i, Status status, BitmapTeleporter bitmapTeleporter) {
        this.a = i;
        this.c = status;
        this.b = bitmapTeleporter;
        if (this.b != null) {
            this.d = bitmapTeleporter.a();
        } else {
            this.d = null;
        }
    }

    public PlacePhotoResult(Status status, @Nullable BitmapTeleporter bitmapTeleporter) {
        this(0, status, bitmapTeleporter);
    }

    public Status a() {
        return this.c;
    }

    public Bitmap b() {
        return this.d;
    }

    public String toString() {
        return c.a(this).a("status", this.c).a("bitmap", this.d).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        v.a(this, parcel, i);
    }
}
