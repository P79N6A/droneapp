package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

public class QueryResultEventParcelable extends WriteAwareParcelable implements DriveEvent {
    public static final n CREATOR = new n();
    final int a;
    final DataHolder b;
    final boolean c;
    final int d;

    QueryResultEventParcelable(int i, DataHolder dataHolder, boolean z, int i2) {
        this.a = i;
        this.b = dataHolder;
        this.c = z;
        this.d = i2;
    }

    public int a() {
        return 3;
    }

    public void a(Parcel parcel, int i) {
        n.a(this, parcel, i);
    }

    public DataHolder b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }
}
