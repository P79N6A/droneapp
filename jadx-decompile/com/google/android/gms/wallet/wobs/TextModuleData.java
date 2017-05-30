package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class TextModuleData extends AbstractSafeParcelable {
    public static final Creator<TextModuleData> CREATOR = new f();
    String a;
    String b;
    private final int c;

    TextModuleData() {
        this.c = 1;
    }

    TextModuleData(int i, String str, String str2) {
        this.c = i;
        this.a = str;
        this.b = str2;
    }

    public int a() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
