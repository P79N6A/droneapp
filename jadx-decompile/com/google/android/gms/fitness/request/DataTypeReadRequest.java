package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.akz;
import com.google.android.gms.internal.akz.a;

public class DataTypeReadRequest extends AbstractSafeParcelable {
    public static final Creator<DataTypeReadRequest> CREATOR = new x();
    private final int a;
    private final String b;
    private final akz c;

    DataTypeReadRequest(int i, String str, IBinder iBinder) {
        this.a = i;
        this.b = str;
        this.c = a.a(iBinder);
    }

    public DataTypeReadRequest(String str, akz com_google_android_gms_internal_akz) {
        this.a = 3;
        this.b = str;
        this.c = com_google_android_gms_internal_akz;
    }

    private boolean a(DataTypeReadRequest dataTypeReadRequest) {
        return c.a(this.b, dataTypeReadRequest.b);
    }

    public String a() {
        return this.b;
    }

    public IBinder b() {
        return this.c.asBinder();
    }

    int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataTypeReadRequest) && a((DataTypeReadRequest) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.b});
    }

    public String toString() {
        return c.a(this).a(User.FN_NAME, this.b).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        x.a(this, parcel, i);
    }
}
