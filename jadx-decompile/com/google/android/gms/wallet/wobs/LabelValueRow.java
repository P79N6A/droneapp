package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.b;
import java.util.ArrayList;

public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Creator<LabelValueRow> CREATOR = new c();
    String a;
    String b;
    ArrayList<LabelValue> c;
    private final int d;

    LabelValueRow() {
        this.d = 1;
        this.c = b.a();
    }

    LabelValueRow(int i, String str, String str2, ArrayList<LabelValue> arrayList) {
        this.d = i;
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public int a() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
