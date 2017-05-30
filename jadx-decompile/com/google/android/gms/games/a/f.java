package com.google.android.gms.games.a;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;

public final class f extends a<e> {
    private final g b;

    public f(DataHolder dataHolder) {
        super(dataHolder);
        this.b = new g(dataHolder.f());
    }

    public g a() {
        return this.b;
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public e b(int i) {
        return new i(this.a, i);
    }
}
