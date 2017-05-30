package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ala;
import com.google.android.gms.internal.ala.a;
import java.util.Locale;

public class GetFileUriRequest extends AbstractSafeParcelable {
    public static final Creator<GetFileUriRequest> CREATOR = new ad();
    private final int a;
    private final ala b;

    GetFileUriRequest(int i, IBinder iBinder) {
        this.a = i;
        this.b = a.a(iBinder);
    }

    int a() {
        return this.a;
    }

    public IBinder b() {
        return this.b.asBinder();
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "GetFileUriRequest {%d, %s}", new Object[]{Integer.valueOf(this.a), this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        ad.a(this, parcel, i);
    }
}
