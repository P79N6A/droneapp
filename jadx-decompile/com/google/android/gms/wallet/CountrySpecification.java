package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public class CountrySpecification extends AbstractSafeParcelable {
    public static final Creator<CountrySpecification> CREATOR = new h();
    String a;
    private final int b;

    CountrySpecification(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public CountrySpecification(String str) {
        this.b = 1;
        this.a = str;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
