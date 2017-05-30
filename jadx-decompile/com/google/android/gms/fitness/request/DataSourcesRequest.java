package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.b;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.aky;
import java.util.Arrays;
import java.util.List;

public class DataSourcesRequest extends AbstractSafeParcelable {
    public static final Creator<DataSourcesRequest> CREATOR = new v();
    private final int a;
    private final List<DataType> b;
    private final List<Integer> c;
    private final boolean d;
    private final aky e;

    public static class a {
        private DataType[] a = new DataType[0];
        private int[] b = new int[]{0, 1};
        private boolean c = false;

        public a a(int... iArr) {
            this.b = iArr;
            return this;
        }

        public a a(DataType... dataTypeArr) {
            this.a = dataTypeArr;
            return this;
        }

        public DataSourcesRequest a() {
            boolean z = true;
            d.a(this.a.length > 0, "Must add at least one data type");
            if (this.b.length <= 0) {
                z = false;
            }
            d.a(z, "Must add at least one data source type");
            return new DataSourcesRequest();
        }
    }

    DataSourcesRequest(int i, List<DataType> list, List<Integer> list2, boolean z, IBinder iBinder) {
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = com.google.android.gms.internal.aky.a.a(iBinder);
    }

    private DataSourcesRequest(a aVar) {
        this(b.a(aVar.a), Arrays.asList(b.a(aVar.b)), false, null);
    }

    public DataSourcesRequest(DataSourcesRequest dataSourcesRequest, aky com_google_android_gms_internal_aky) {
        this(dataSourcesRequest.b, dataSourcesRequest.c, dataSourcesRequest.d, com_google_android_gms_internal_aky);
    }

    public DataSourcesRequest(List<DataType> list, List<Integer> list2, boolean z, aky com_google_android_gms_internal_aky) {
        this.a = 4;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = com_google_android_gms_internal_aky;
    }

    public List<DataType> a() {
        return this.b;
    }

    public List<Integer> b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public IBinder d() {
        return this.e == null ? null : this.e.asBinder();
    }

    int e() {
        return this.a;
    }

    public String toString() {
        com.google.android.gms.common.internal.c.a a = c.a(this).a("dataTypes", this.b).a("sourceTypes", this.c);
        if (this.d) {
            a.a("includeDbOnlySources", "true");
        }
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        v.a(this, parcel, i);
    }
}
