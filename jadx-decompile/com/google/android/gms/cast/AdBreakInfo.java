package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AdBreakInfo extends AbstractSafeParcelable {
    public static final Creator<AdBreakInfo> CREATOR = new h();
    private final int a;
    private final long b;

    public static class a {
        private long a = 0;

        public a(long j) {
            this.a = j;
        }

        public AdBreakInfo a() {
            return new AdBreakInfo(1, this.a);
        }
    }

    AdBreakInfo(int i, long j) {
        this.a = i;
        this.b = j;
    }

    int a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
