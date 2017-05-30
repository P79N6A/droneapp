package com.google.android.gms.contextmanager.fence.internal;

import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl.TypeFilterImpl;
import com.google.android.gms.awareness.state.BeaconState.TypeFilter;
import com.google.android.gms.internal.px;
import com.google.android.gms.internal.px.a;

public class d {
    private final px a;

    public d(px pxVar) {
        this.a = (px) com.google.android.gms.common.internal.d.a(pxVar);
    }

    public static d a(TypeFilter[] typeFilterArr) {
        return new d(a(1, typeFilterArr, 3000));
    }

    private static px a(int i, TypeFilter[] typeFilterArr, long j) {
        px pxVar = new px();
        pxVar.a = i;
        if (!(typeFilterArr == null || typeFilterArr.length == 0)) {
            pxVar.c = new a[typeFilterArr.length];
            int i2 = 0;
            for (TypeFilter typeFilter : typeFilterArr) {
                pxVar.c[i2] = ((TypeFilterImpl) typeFilter).d();
                i2++;
            }
        }
        pxVar.b = j;
        return pxVar;
    }

    public static d b(TypeFilter[] typeFilterArr) {
        return new d(a(2, typeFilterArr, 3000));
    }

    public static d c(TypeFilter[] typeFilterArr) {
        return new d(a(3, typeFilterArr, 3000));
    }

    public px a() {
        return this.a;
    }
}
