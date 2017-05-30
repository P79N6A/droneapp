package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Creator<SafeBrowsingData> CREATOR = new g();
    public final int a;
    private String b;
    private DataHolder c;

    SafeBrowsingData(int i, String str, DataHolder dataHolder) {
        this.a = i;
        this.b = str;
        this.c = dataHolder;
    }

    public SafeBrowsingData(String str) {
        this(1, str, null);
    }

    public SafeBrowsingData(String str, DataHolder dataHolder) {
        this(1, str, dataHolder);
    }

    public String a() {
        return this.b;
    }

    public DataHolder b() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
