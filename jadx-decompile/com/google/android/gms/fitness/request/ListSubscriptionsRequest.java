package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.all;
import com.google.android.gms.internal.all.a;

public class ListSubscriptionsRequest extends AbstractSafeParcelable {
    public static final Creator<ListSubscriptionsRequest> CREATOR = new ai();
    private final int a;
    private final DataType b;
    private final all c;

    ListSubscriptionsRequest(int i, DataType dataType, IBinder iBinder) {
        this.a = i;
        this.b = dataType;
        this.c = a.a(iBinder);
    }

    public ListSubscriptionsRequest(DataType dataType, all com_google_android_gms_internal_all) {
        this.a = 3;
        this.b = dataType;
        this.c = com_google_android_gms_internal_all;
    }

    public DataType a() {
        return this.b;
    }

    public IBinder b() {
        return this.c == null ? null : this.c.asBinder();
    }

    int c() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ai.a(this, parcel, i);
    }
}
