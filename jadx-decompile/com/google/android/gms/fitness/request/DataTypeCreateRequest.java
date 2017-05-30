package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.internal.akz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataTypeCreateRequest extends AbstractSafeParcelable {
    public static final Creator<DataTypeCreateRequest> CREATOR = new w();
    private final int a;
    private final String b;
    private final List<Field> c;
    private final akz d;

    public static class a {
        private String a;
        private List<Field> b = new ArrayList();

        public a a(Field field) {
            if (!this.b.contains(field)) {
                this.b.add(field);
            }
            return this;
        }

        public a a(String str) {
            this.a = str;
            return this;
        }

        public a a(String str, int i) {
            boolean z = (str == null || str.isEmpty()) ? false : true;
            d.b(z, "Invalid name specified");
            return a(Field.a(str, i));
        }

        public DataTypeCreateRequest a() {
            boolean z = true;
            d.a(this.a != null, "Must set the name");
            if (this.b.isEmpty()) {
                z = false;
            }
            d.a(z, "Must specify the data fields");
            return new DataTypeCreateRequest();
        }
    }

    DataTypeCreateRequest(int i, String str, List<Field> list, IBinder iBinder) {
        this.a = i;
        this.b = str;
        this.c = Collections.unmodifiableList(list);
        this.d = com.google.android.gms.internal.akz.a.a(iBinder);
    }

    private DataTypeCreateRequest(a aVar) {
        this(aVar.a, aVar.b, null);
    }

    public DataTypeCreateRequest(DataTypeCreateRequest dataTypeCreateRequest, akz com_google_android_gms_internal_akz) {
        this(dataTypeCreateRequest.b, dataTypeCreateRequest.c, com_google_android_gms_internal_akz);
    }

    public DataTypeCreateRequest(String str, List<Field> list, akz com_google_android_gms_internal_akz) {
        this.a = 3;
        this.b = str;
        this.c = Collections.unmodifiableList(list);
        this.d = com_google_android_gms_internal_akz;
    }

    private boolean a(DataTypeCreateRequest dataTypeCreateRequest) {
        return c.a(this.b, dataTypeCreateRequest.b) && c.a(this.c, dataTypeCreateRequest.c);
    }

    public String a() {
        return this.b;
    }

    public List<Field> b() {
        return this.c;
    }

    public IBinder c() {
        return this.d == null ? null : this.d.asBinder();
    }

    int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataTypeCreateRequest) && a((DataTypeCreateRequest) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c});
    }

    public String toString() {
        return c.a(this).a(User.FN_NAME, this.b).a("fields", this.c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        w.a(this, parcel, i);
    }
}
