package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ActivityRecognitionRequest extends AbstractSafeParcelable {
    public static final Creator<ActivityRecognitionRequest> CREATOR = new r();
    private final int a;
    private long b;
    private boolean c;
    @Nullable
    private WorkSource d;
    @Nullable
    private String e;
    @Nullable
    private int[] f;
    @Nullable
    private boolean g;
    @Nullable
    private String h;
    private final long i;

    ActivityRecognitionRequest(int i, long j, boolean z, @Nullable WorkSource workSource, @Nullable String str, @Nullable int[] iArr, boolean z2, @Nullable String str2, long j2) {
        this.a = i;
        this.b = j;
        this.c = z;
        this.d = workSource;
        this.e = str;
        this.f = iArr;
        this.g = z2;
        this.h = str2;
        this.i = j2;
    }

    public long a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    @Nullable
    public WorkSource c() {
        return this.d;
    }

    @Nullable
    public String d() {
        return this.e;
    }

    @Nullable
    public int[] e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    @Nullable
    public String g() {
        return this.h;
    }

    public long h() {
        return this.i;
    }

    int i() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
