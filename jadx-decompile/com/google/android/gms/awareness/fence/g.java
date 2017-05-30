package com.google.android.gms.awareness.fence;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.n;

public final class g {
    private g() {
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static AwarenessFence a(double d, double d2, double d3) {
        return ContextFenceStub.a(n.a((int) (d * 1.0E7d), (int) (1.0E7d * d2), d3));
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static AwarenessFence a(double d, double d2, double d3, long j) {
        return ContextFenceStub.a(n.a((int) (d * 1.0E7d), (int) (1.0E7d * d2), d3, j));
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static AwarenessFence b(double d, double d2, double d3) {
        return ContextFenceStub.a(n.b((int) (d * 1.0E7d), (int) (1.0E7d * d2), d3));
    }
}
