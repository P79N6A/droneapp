package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.aak.a;
import java.util.WeakHashMap;

@aaa
public final class aal {
    private WeakHashMap<Context, a> a = new WeakHashMap();

    public aak a(Context context) {
        a aVar = (a) this.a.get(context);
        aak a = (aVar == null || aVar.a() || !((Boolean) uf.aJ.c()).booleanValue()) ? new a(context).a() : new a(context, aVar.b).a();
        this.a.put(context, new a(this, a));
        return a;
    }
}
