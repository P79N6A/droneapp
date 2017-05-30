package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.b;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.alq;
import java.util.Collections;
import java.util.List;

public class StartBleScanRequest extends AbstractSafeParcelable {
    public static final Creator<StartBleScanRequest> CREATOR = new k();
    private final int a;
    private final List<DataType> b;
    private final ag c;
    private final int d;
    private final alq e;

    public static class a {
        private DataType[] a = new DataType[0];
        private ag b;
        private int c = 10;

        public a a(int i) {
            boolean z = true;
            d.b(i > 0, "Stop time must be greater than zero");
            if (i > 60) {
                z = false;
            }
            d.b(z, "Stop time must be less than 1 minute");
            this.c = i;
            return this;
        }

        public a a(a aVar) {
            a(com.google.android.gms.fitness.request.d.a.a().a(aVar));
            return this;
        }

        public a a(ag agVar) {
            this.b = agVar;
            return this;
        }

        public a a(DataType... dataTypeArr) {
            this.a = dataTypeArr;
            return this;
        }

        public StartBleScanRequest a() {
            d.a(this.b != null, "Must set BleScanCallback");
            return new StartBleScanRequest();
        }
    }

    StartBleScanRequest(int i, List<DataType> list, IBinder iBinder, int i2, IBinder iBinder2) {
        this.a = i;
        this.b = list;
        this.c = com.google.android.gms.fitness.request.ag.a.a(iBinder);
        this.d = i2;
        this.e = com.google.android.gms.internal.alq.a.a(iBinder2);
    }

    private StartBleScanRequest(a aVar) {
        this(b.a(aVar.a), aVar.b, aVar.c, null);
    }

    public StartBleScanRequest(StartBleScanRequest startBleScanRequest, alq com_google_android_gms_internal_alq) {
        this(startBleScanRequest.b, startBleScanRequest.c, startBleScanRequest.d, com_google_android_gms_internal_alq);
    }

    public StartBleScanRequest(List<DataType> list, ag agVar, int i, alq com_google_android_gms_internal_alq) {
        this.a = 4;
        this.b = list;
        this.c = agVar;
        this.d = i;
        this.e = com_google_android_gms_internal_alq;
    }

    public List<DataType> a() {
        return Collections.unmodifiableList(this.b);
    }

    public int b() {
        return this.d;
    }

    public IBinder c() {
        return this.c.asBinder();
    }

    public IBinder d() {
        return this.e == null ? null : this.e.asBinder();
    }

    int e() {
        return this.a;
    }

    public String toString() {
        return c.a(this).a("dataTypes", this.b).a("timeoutSecs", Integer.valueOf(this.d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
