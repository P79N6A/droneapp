package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.request.l.a;
import com.google.android.gms.internal.aaa;
import java.lang.ref.WeakReference;

@aaa
public final class g extends a {
    private final WeakReference<c.a> a;

    public g(c.a aVar) {
        this.a = new WeakReference(aVar);
    }

    public void a(AdResponseParcel adResponseParcel) {
        c.a aVar = (c.a) this.a.get();
        if (aVar != null) {
            aVar.a(adResponseParcel);
        }
    }
}
