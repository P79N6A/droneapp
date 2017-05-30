package com.google.android.gms.awareness.fence;

import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.b;

public final class f {
    private f() {
    }

    public static AwarenessFence a() {
        return ContextFenceStub.a(b.a());
    }

    public static AwarenessFence a(int i) {
        return ContextFenceStub.a(b.a(i));
    }

    public static AwarenessFence b() {
        return ContextFenceStub.a(b.b());
    }
}
