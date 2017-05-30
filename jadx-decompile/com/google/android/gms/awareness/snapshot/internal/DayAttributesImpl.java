package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DayAttributesImpl extends AbstractSafeParcelable {
    public static final Creator<DayAttributesImpl> CREATOR = new c();
    private final int a;
    private final int[] b;

    DayAttributesImpl(int i, int[] iArr) {
        this.a = i;
        this.b = iArr;
    }

    int a() {
        return this.a;
    }

    public int[] b() {
        return this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attributes=");
        if (this.b == null) {
            stringBuilder.append("unknown");
        } else {
            stringBuilder.append("[");
            int[] iArr = this.b;
            int length = iArr.length;
            Object obj = 1;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (obj == null) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(i2);
                i++;
                obj = null;
            }
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
