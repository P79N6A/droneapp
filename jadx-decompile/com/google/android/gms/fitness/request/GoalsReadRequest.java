package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.alb;
import com.google.android.gms.internal.alb.a;
import java.util.List;

public class GoalsReadRequest extends AbstractSafeParcelable {
    public static final Creator<GoalsReadRequest> CREATOR = new af();
    private final int a;
    private final alb b;
    private final List<DataType> c;

    GoalsReadRequest(int i, IBinder iBinder, List<DataType> list) {
        this.a = i;
        this.b = iBinder == null ? null : a.a(iBinder);
        this.c = list;
    }

    private boolean a(GoalsReadRequest goalsReadRequest) {
        return c.a(this.c, goalsReadRequest.c);
    }

    public List<DataType> a() {
        return this.c;
    }

    int b() {
        return this.a;
    }

    public IBinder c() {
        return this.b.asBinder();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof GoalsReadRequest) && a((GoalsReadRequest) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.c});
    }

    public String toString() {
        return c.a(this).a("dataTypes", this.c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        af.a(this, parcel, i);
    }
}
