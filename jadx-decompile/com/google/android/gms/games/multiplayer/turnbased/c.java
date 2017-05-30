package com.google.android.gms.games.multiplayer.turnbased;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.m;

public final class c extends m<TurnBasedMatch> {
    public c(DataHolder dataHolder) {
        super(dataHolder);
    }

    protected /* synthetic */ Object a(int i, int i2) {
        return b(i, i2);
    }

    protected TurnBasedMatch b(int i, int i2) {
        return new TurnBasedMatchRef(this.a, i, i2);
    }

    protected String h() {
        return "external_match_id";
    }
}
