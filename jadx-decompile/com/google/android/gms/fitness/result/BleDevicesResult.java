package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BleDevicesResult extends AbstractSafeParcelable implements m {
    public static final Creator<BleDevicesResult> CREATOR = new a();
    private final int a;
    private final List<BleDevice> b;
    private final Status c;

    BleDevicesResult(int i, List<BleDevice> list, Status status) {
        this.a = i;
        this.b = Collections.unmodifiableList(list);
        this.c = status;
    }

    public BleDevicesResult(List<BleDevice> list, Status status) {
        this.a = 3;
        this.b = Collections.unmodifiableList(list);
        this.c = status;
    }

    public static BleDevicesResult a(Status status) {
        return new BleDevicesResult(Collections.emptyList(), status);
    }

    private boolean a(BleDevicesResult bleDevicesResult) {
        return this.c.equals(bleDevicesResult.c) && c.a(this.b, bleDevicesResult.b);
    }

    public Status a() {
        return this.c;
    }

    public List<BleDevice> a(DataType dataType) {
        List arrayList = new ArrayList();
        for (BleDevice bleDevice : this.b) {
            if (bleDevice.d().contains(dataType)) {
                arrayList.add(bleDevice);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List<BleDevice> b() {
        return this.b;
    }

    int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BleDevicesResult) && a((BleDevicesResult) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.c, this.b});
    }

    public String toString() {
        return c.a(this).a("status", this.c).a("bleDevices", this.b).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
