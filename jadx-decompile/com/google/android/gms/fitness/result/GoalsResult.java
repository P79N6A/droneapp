package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Goal;
import java.util.List;

public class GoalsResult extends AbstractSafeParcelable implements m {
    public static final Creator<GoalsResult> CREATOR = new i();
    private final int a;
    private final Status b;
    private final List<Goal> c;

    GoalsResult(int i, Status status, List<Goal> list) {
        this.a = i;
        this.b = status;
        this.c = list;
    }

    public Status a() {
        return this.b;
    }

    public List<Goal> b() {
        return this.c;
    }

    int c() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
