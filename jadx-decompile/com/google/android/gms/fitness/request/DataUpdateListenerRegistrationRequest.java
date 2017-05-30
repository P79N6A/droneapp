package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.alq;

public class DataUpdateListenerRegistrationRequest extends AbstractSafeParcelable {
    public static final Creator<DataUpdateListenerRegistrationRequest> CREATOR = new y();
    private final int a;
    private DataSource b;
    private DataType c;
    private final PendingIntent d;
    private final alq e;

    public static class a {
        private DataSource a;
        private DataType b;
        private PendingIntent c;

        public a a(PendingIntent pendingIntent) {
            d.a(pendingIntent);
            this.c = pendingIntent;
            return this;
        }

        public a a(DataSource dataSource) {
            d.a(dataSource);
            this.a = dataSource;
            return this;
        }

        public a a(DataType dataType) {
            d.a(dataType);
            this.b = dataType;
            return this;
        }

        public DataUpdateListenerRegistrationRequest a() {
            boolean z = (this.a == null && this.b == null) ? false : true;
            d.a(z, "Set either dataSource or dataTYpe");
            d.a(this.c, "pendingIntent must be set");
            return new DataUpdateListenerRegistrationRequest();
        }
    }

    DataUpdateListenerRegistrationRequest(int i, DataSource dataSource, DataType dataType, PendingIntent pendingIntent, IBinder iBinder) {
        this.a = i;
        this.b = dataSource;
        this.c = dataType;
        this.d = pendingIntent;
        this.e = com.google.android.gms.internal.alq.a.a(iBinder);
    }

    public DataUpdateListenerRegistrationRequest(DataSource dataSource, DataType dataType, PendingIntent pendingIntent, IBinder iBinder) {
        this.a = 1;
        this.b = dataSource;
        this.c = dataType;
        this.d = pendingIntent;
        this.e = com.google.android.gms.internal.alq.a.a(iBinder);
    }

    private DataUpdateListenerRegistrationRequest(a aVar) {
        this(aVar.a, aVar.b, aVar.c, null);
    }

    public DataUpdateListenerRegistrationRequest(DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest, IBinder iBinder) {
        this(dataUpdateListenerRegistrationRequest.b, dataUpdateListenerRegistrationRequest.c, dataUpdateListenerRegistrationRequest.d, iBinder);
    }

    private boolean a(DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
        return c.a(this.b, dataUpdateListenerRegistrationRequest.b) && c.a(this.c, dataUpdateListenerRegistrationRequest.c) && c.a(this.d, dataUpdateListenerRegistrationRequest.d);
    }

    public DataSource a() {
        return this.b;
    }

    public DataType b() {
        return this.c;
    }

    public PendingIntent c() {
        return this.d;
    }

    public IBinder d() {
        return this.e == null ? null : this.e.asBinder();
    }

    int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataUpdateListenerRegistrationRequest) && a((DataUpdateListenerRegistrationRequest) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c, this.d});
    }

    public String toString() {
        return c.a(this).a("dataSource", this.b).a("dataType", this.c).a("pendingIntent", this.d).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        y.a(this, parcel, i);
    }
}
