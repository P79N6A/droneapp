package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl.TypeFilterImpl;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.d;
import java.util.ArrayList;
import java.util.Iterator;

public class SnapshotRequest extends AbstractSafeParcelable {
    public static final Creator<SnapshotRequest> CREATOR = new l();
    private static final int[] a = new int[]{d.b, d.c, d.d, d.e, d.f, d.g, d.h};
    private final int b;
    private final int c;
    private final ArrayList<TypeFilterImpl> d;

    SnapshotRequest(int i, int i2, ArrayList<TypeFilterImpl> arrayList) {
        this.b = i;
        this.c = i2;
        this.d = arrayList;
    }

    public SnapshotRequest(int i, ArrayList<TypeFilterImpl> arrayList) {
        this(1, i, arrayList);
    }

    int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public ArrayList<TypeFilterImpl> c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnapshotRequest)) {
            return false;
        }
        SnapshotRequest snapshotRequest = (SnapshotRequest) obj;
        if (this.c != snapshotRequest.b()) {
            return false;
        }
        if (((this.d == null ? 1 : 0) ^ (snapshotRequest.c() == null ? 1 : 0)) != 0) {
            return false;
        }
        if (this.d != null) {
            if (this.d.size() != snapshotRequest.c().size()) {
                return false;
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                if (!snapshotRequest.c().contains((TypeFilterImpl) it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        int i;
        if (this.d != null) {
            Iterator it = this.d.iterator();
            i = 0;
            while (it.hasNext()) {
                i = (((TypeFilterImpl) it.next()).hashCode() * 13) + i;
            }
        } else {
            i = 0;
        }
        return c.a(Integer.valueOf(this.c), Integer.valueOf(i));
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
