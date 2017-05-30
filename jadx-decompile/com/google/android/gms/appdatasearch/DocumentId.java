package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DocumentId extends AbstractSafeParcelable {
    public static final c CREATOR = new c();
    final int a;
    final String b;
    final String c;
    final String d;

    DocumentId(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public DocumentId(String str, String str2, String str3) {
        this(1, str, str2, str3);
    }

    public String toString() {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[]{this.b, this.c, this.d});
    }

    public void writeToParcel(Parcel parcel, int i) {
        c cVar = CREATOR;
        c.a(this, parcel, i);
    }
}
