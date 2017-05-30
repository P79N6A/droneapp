package com.google.android.gms.awareness.fence;

import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.p;
import java.util.TimeZone;

public final class h {
    private h() {
    }

    public static AwarenessFence a(long j, long j2) {
        return ContextFenceStub.a(p.a(j, j2));
    }

    public static AwarenessFence a(TimeZone timeZone, long j, long j2) {
        return ContextFenceStub.a(p.a(2, timeZone, j, j2));
    }

    public static AwarenessFence b(TimeZone timeZone, long j, long j2) {
        return ContextFenceStub.a(p.a(5, timeZone, j, j2));
    }

    public static AwarenessFence c(TimeZone timeZone, long j, long j2) {
        return ContextFenceStub.a(p.a(6, timeZone, j, j2));
    }

    public static AwarenessFence d(TimeZone timeZone, long j, long j2) {
        return ContextFenceStub.a(p.a(7, timeZone, j, j2));
    }

    public static AwarenessFence e(TimeZone timeZone, long j, long j2) {
        return ContextFenceStub.a(p.a(8, timeZone, j, j2));
    }

    public static AwarenessFence f(TimeZone timeZone, long j, long j2) {
        return ContextFenceStub.a(p.a(9, timeZone, j, j2));
    }

    public static AwarenessFence g(TimeZone timeZone, long j, long j2) {
        return ContextFenceStub.a(p.a(10, timeZone, j, j2));
    }

    public static AwarenessFence h(TimeZone timeZone, long j, long j2) {
        return ContextFenceStub.a(p.a(11, timeZone, j, j2));
    }
}
