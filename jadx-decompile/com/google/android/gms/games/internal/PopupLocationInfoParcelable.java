package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.internal.n.a;

public final class PopupLocationInfoParcelable extends AbstractSafeParcelable {
    public static final m CREATOR = new m();
    private final int a;
    private final Bundle b;
    private final IBinder c;

    PopupLocationInfoParcelable(int i, Bundle bundle, IBinder iBinder) {
        this.a = i;
        this.b = bundle;
        this.c = iBinder;
    }

    public PopupLocationInfoParcelable(a aVar) {
        this.a = 1;
        this.b = aVar.a();
        this.c = aVar.a;
    }

    public int a() {
        return this.a;
    }

    public Bundle b() {
        return this.b;
    }

    public IBinder c() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel, i);
    }
}
