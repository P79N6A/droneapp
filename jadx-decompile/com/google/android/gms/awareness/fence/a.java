package com.google.android.gms.awareness.fence;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.awareness.state.BeaconState.TypeFilter;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.d;
import java.util.Collection;

public final class a {
    private a() {
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static AwarenessFence a(Collection<TypeFilter> collection) {
        return (collection == null || collection.isEmpty()) ? a(new TypeFilter[0]) : a((TypeFilter[]) collection.toArray(new TypeFilter[collection.size()]));
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static AwarenessFence a(TypeFilter... typeFilterArr) {
        return ContextFenceStub.a(d.a(typeFilterArr));
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static AwarenessFence b(Collection<TypeFilter> collection) {
        return (collection == null || collection.isEmpty()) ? b(new TypeFilter[0]) : b((TypeFilter[]) collection.toArray(new TypeFilter[collection.size()]));
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static AwarenessFence b(TypeFilter... typeFilterArr) {
        return ContextFenceStub.a(d.b(typeFilterArr));
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static AwarenessFence c(Collection<TypeFilter> collection) {
        return (collection == null || collection.isEmpty()) ? c(new TypeFilter[0]) : c((TypeFilter[]) collection.toArray(new TypeFilter[collection.size()]));
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static AwarenessFence c(TypeFilter... typeFilterArr) {
        return ContextFenceStub.a(d.c(typeFilterArr));
    }
}
