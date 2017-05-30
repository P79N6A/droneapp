package com.google.android.gms.awareness.fence;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import java.util.Collection;

public abstract class FenceQueryRequest extends AbstractSafeParcelable {
    protected FenceQueryRequest() {
    }

    public static FenceQueryRequest a() {
        return new FenceQueryRequestImpl();
    }

    public static FenceQueryRequest a(Collection<String> collection) {
        d.a((Object) collection);
        for (String a : collection) {
            d.a(a);
        }
        return new FenceQueryRequestImpl(collection);
    }

    public static FenceQueryRequest a(String... strArr) {
        d.a((Object) strArr);
        for (String a : strArr) {
            d.a(a);
        }
        return new FenceQueryRequestImpl(strArr);
    }
}
