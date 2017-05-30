package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.akd;
import java.util.Collections;
import java.util.List;

public class BleDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<BleDevice> CREATOR = new h();
    private final int a;
    private final String b;
    private final String c;
    private final List<String> d;
    private final List<DataType> e;

    BleDevice(int i, String str, String str2, List<String> list, List<DataType> list2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
    }

    private boolean a(BleDevice bleDevice) {
        return this.c.equals(bleDevice.c) && this.b.equals(bleDevice.b) && akd.a(bleDevice.d, this.d) && akd.a(this.e, bleDevice.e);
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public List<String> c() {
        return this.d;
    }

    public List<DataType> d() {
        return this.e;
    }

    int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof BleDevice) && a((BleDevice) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.c, this.b, this.d, this.e});
    }

    public String toString() {
        return c.a(this).a(User.FN_NAME, this.c).a("address", this.b).a("dataTypes", this.e).a("supportedProfiles", this.d).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
