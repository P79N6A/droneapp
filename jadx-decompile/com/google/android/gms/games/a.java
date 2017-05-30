package com.google.android.gms.games;

import com.google.android.gms.common.data.DataHolder;

public final class a extends com.google.android.gms.common.data.a<Game> {
    public a(DataHolder dataHolder) {
        super(dataHolder);
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public Game b(int i) {
        return new GameRef(this.a, i);
    }
}
