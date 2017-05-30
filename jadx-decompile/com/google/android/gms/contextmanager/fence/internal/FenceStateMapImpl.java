package com.google.android.gms.contextmanager.fence.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.awareness.fence.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FenceStateMapImpl extends AbstractSafeParcelable implements d {
    public static final Creator<FenceStateMapImpl> CREATOR = new j();
    public final Map<String, FenceStateImpl> a = new HashMap();
    private final int b;

    FenceStateMapImpl(int i, Bundle bundle) {
        this.b = i;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.a.put(str, (FenceStateImpl) c.a(bundle.getByteArray(str), FenceStateImpl.CREATOR));
            }
        }
    }

    public /* synthetic */ FenceState a(String str) {
        return b(str);
    }

    public Set<String> a() {
        return this.a.keySet();
    }

    int b() {
        return this.b;
    }

    public FenceStateImpl b(String str) {
        return this.a.containsKey(str) ? (FenceStateImpl) this.a.get(str) : null;
    }

    Bundle c() {
        if (this.a == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Entry entry : this.a.entrySet()) {
            bundle.putByteArray((String) entry.getKey(), c.a((FenceStateImpl) entry.getValue()));
        }
        return bundle;
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
