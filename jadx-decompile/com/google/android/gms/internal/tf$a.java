package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.formats.i;
import java.lang.ref.WeakReference;

public class tf$a implements tm {
    private WeakReference<i> a;

    public tf$a(i iVar) {
        this.a = new WeakReference(iVar);
    }

    @Nullable
    public View a() {
        i iVar = (i) this.a.get();
        return iVar != null ? iVar.e() : null;
    }

    public boolean b() {
        return this.a.get() == null;
    }

    public tm c() {
        return new tf$b((i) this.a.get());
    }
}
