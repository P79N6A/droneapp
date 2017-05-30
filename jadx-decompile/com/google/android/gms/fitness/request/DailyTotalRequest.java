package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.akw;
import com.google.android.gms.internal.akw.a;

public class DailyTotalRequest extends AbstractSafeParcelable {
    public static final Creator<DailyTotalRequest> CREATOR = new q();
    private final int a;
    private final akw b;
    private DataType c;
    private final boolean d;

    DailyTotalRequest(int i, IBinder iBinder, DataType dataType, boolean z) {
        this.a = i;
        this.b = a.a(iBinder);
        this.c = dataType;
        this.d = z;
    }

    public DailyTotalRequest(akw com_google_android_gms_internal_akw, DataType dataType, boolean z) {
        this.a = 3;
        this.b = com_google_android_gms_internal_akw;
        this.c = dataType;
        this.d = z;
    }

    int a() {
        return this.a;
    }

    public DataType b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public IBinder d() {
        return this.b.asBinder();
    }

    public String toString() {
        String str = "DailyTotalRequest{%s}";
        Object[] objArr = new Object[1];
        objArr[0] = this.c == null ? "null" : this.c.c();
        return String.format(str, objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
