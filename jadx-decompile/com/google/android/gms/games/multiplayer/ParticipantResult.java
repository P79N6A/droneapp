package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.internal.b.j;

public final class ParticipantResult extends AbstractSafeParcelable {
    public static final Creator<ParticipantResult> CREATOR = new h();
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = -1;
    private final int i;
    private final String j;
    private final int k;
    private final int l;

    public ParticipantResult(int i, String str, int i2, int i3) {
        this.i = i;
        this.j = (String) d.a(str);
        d.a(j.a(i2));
        this.k = i2;
        this.l = i3;
    }

    public ParticipantResult(String str, int i, int i2) {
        this(1, str, i, i2);
    }

    public int a() {
        return this.i;
    }

    public String b() {
        return this.j;
    }

    public int c() {
        return this.k;
    }

    public int d() {
        return this.l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
