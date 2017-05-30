package com.google.android.gms.games;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;

public final class j extends a<Player> {
    public j(DataHolder dataHolder) {
        super(dataHolder);
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public Player b(int i) {
        return new PlayerRef(this.a, i);
    }
}
