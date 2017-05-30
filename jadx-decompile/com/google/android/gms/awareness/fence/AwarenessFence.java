package com.google.android.gms.awareness.fence;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import java.util.ArrayList;
import java.util.Collection;

public abstract class AwarenessFence extends AbstractSafeParcelable {
    protected AwarenessFence() {
    }

    public static AwarenessFence a(AwarenessFence awarenessFence) {
        d.a((Object) awarenessFence);
        return ContextFenceStub.a((ContextFenceStub) awarenessFence);
    }

    public static AwarenessFence a(Collection<AwarenessFence> collection) {
        boolean z = (collection == null || collection.isEmpty()) ? false : true;
        d.b(z);
        return ContextFenceStub.c(c((Collection) collection));
    }

    public static AwarenessFence a(AwarenessFence... awarenessFenceArr) {
        boolean z = awarenessFenceArr != null && awarenessFenceArr.length > 0;
        d.b(z);
        return ContextFenceStub.c(c(awarenessFenceArr));
    }

    public static AwarenessFence b(Collection<AwarenessFence> collection) {
        boolean z = (collection == null || collection.isEmpty()) ? false : true;
        d.b(z);
        return ContextFenceStub.d(c((Collection) collection));
    }

    public static AwarenessFence b(AwarenessFence... awarenessFenceArr) {
        boolean z = awarenessFenceArr != null && awarenessFenceArr.length > 0;
        d.b(z);
        return ContextFenceStub.d(c(awarenessFenceArr));
    }

    private static ArrayList<ContextFenceStub> c(Collection<AwarenessFence> collection) {
        ArrayList<ContextFenceStub> arrayList = new ArrayList(collection.size());
        for (AwarenessFence awarenessFence : collection) {
            arrayList.add((ContextFenceStub) awarenessFence);
        }
        return arrayList;
    }

    private static ArrayList<ContextFenceStub> c(AwarenessFence[] awarenessFenceArr) {
        ArrayList<ContextFenceStub> arrayList = new ArrayList(awarenessFenceArr.length);
        for (AwarenessFence awarenessFence : awarenessFenceArr) {
            arrayList.add((ContextFenceStub) awarenessFence);
        }
        return arrayList;
    }
}
