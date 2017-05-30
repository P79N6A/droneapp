package com.google.android.gms.awareness.fence;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.a;

public final class b {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 7;
    public static final int h = 8;

    private b() {
    }

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    public static AwarenessFence a(int... iArr) {
        return ContextFenceStub.a(a.a(iArr));
    }

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    public static AwarenessFence b(int... iArr) {
        return ContextFenceStub.a(a.a(2, iArr));
    }

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    public static AwarenessFence c(int... iArr) {
        return ContextFenceStub.a(a.a(3, iArr));
    }
}
