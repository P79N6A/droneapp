package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.alq;
import com.google.android.gms.internal.alq.a;

public class UnsubscribeRequest extends AbstractSafeParcelable {
    public static final Creator<UnsubscribeRequest> CREATOR = new o();
    private final int a;
    private final DataType b;
    private final DataSource c;
    private final alq d;

    UnsubscribeRequest(int i, DataType dataType, DataSource dataSource, IBinder iBinder) {
        this.a = i;
        this.b = dataType;
        this.c = dataSource;
        this.d = a.a(iBinder);
    }

    public UnsubscribeRequest(DataType dataType, DataSource dataSource, alq com_google_android_gms_internal_alq) {
        this.a = 3;
        this.b = dataType;
        this.c = dataSource;
        this.d = com_google_android_gms_internal_alq;
    }

    private boolean a(UnsubscribeRequest unsubscribeRequest) {
        return c.a(this.c, unsubscribeRequest.c) && c.a(this.b, unsubscribeRequest.b);
    }

    int a() {
        return this.a;
    }

    public DataType b() {
        return this.b;
    }

    public DataSource c() {
        return this.c;
    }

    public IBinder d() {
        return this.d == null ? null : this.d.asBinder();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof UnsubscribeRequest) && a((UnsubscribeRequest) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.c, this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
