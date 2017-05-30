package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.fence.e;
import com.google.android.gms.awareness.fence.i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.sx;
import java.util.ArrayList;
import java.util.Iterator;

public class FenceUpdateRequestImpl extends AbstractSafeParcelable implements e {
    public static final Creator<FenceUpdateRequestImpl> CREATOR = new l();
    private final int a;
    private final ArrayList<UpdateFenceOperation> b;

    @Deprecated
    public FenceUpdateRequestImpl() {
        this(new ArrayList());
    }

    FenceUpdateRequestImpl(int i, ArrayList<UpdateFenceOperation> arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public FenceUpdateRequestImpl(ArrayList<UpdateFenceOperation> arrayList) {
        this(1, arrayList);
    }

    int a() {
        return this.a;
    }

    public void a(sx<i, e> sxVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((UpdateFenceOperation) it.next()).a(sxVar);
        }
    }

    public ArrayList<UpdateFenceOperation> b() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
