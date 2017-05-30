package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AttestationData extends AbstractSafeParcelable {
    public static final Creator<AttestationData> CREATOR = new e();
    public final int a;
    private String b;

    AttestationData(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public String a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
