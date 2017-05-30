package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

public class FieldWithSortOrder extends AbstractSafeParcelable {
    public static final c CREATOR = new c();
    final String a;
    final boolean b;
    final int c;

    FieldWithSortOrder(int i, String str, boolean z) {
        this.c = i;
        this.a = str;
        this.b = z;
    }

    public FieldWithSortOrder(String str, boolean z) {
        this(1, str, z);
    }

    public String toString() {
        Locale locale = Locale.US;
        String str = "FieldWithSortOrder[%s %s]";
        Object[] objArr = new Object[2];
        objArr[0] = this.a;
        objArr[1] = this.b ? "ASC" : "DESC";
        return String.format(locale, str, objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
