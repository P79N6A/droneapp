package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class FetchConfigIpcRequest extends AbstractSafeParcelable {
    public static final Creator<FetchConfigIpcRequest> CREATOR = new g();
    public final int a;
    private final String b;
    private final long c;
    private final DataHolder d;
    private final String e;
    private final String f;
    private final String g;
    private final List<String> h;
    private final int i;
    private final List<AnalyticsUserProperty> j;

    FetchConfigIpcRequest(int i, String str, long j, DataHolder dataHolder, String str2, String str3, String str4, List<String> list, int i2, List<AnalyticsUserProperty> list2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = dataHolder;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = list;
        this.i = i2;
        this.j = list2;
    }

    public FetchConfigIpcRequest(String str, long j, DataHolder dataHolder, String str2, String str3, String str4, List<String> list, int i, List<AnalyticsUserProperty> list2) {
        this(2, str, j, dataHolder, str2, str3, str4, list, i, list2);
    }

    public String a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }

    public DataHolder c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public String f() {
        return this.g;
    }

    public List<String> g() {
        return this.h;
    }

    public int h() {
        return this.i;
    }

    public List<AnalyticsUserProperty> i() {
        return this.j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
