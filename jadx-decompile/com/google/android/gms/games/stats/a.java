package com.google.android.gms.games.stats;

import com.google.android.gms.common.data.DataHolder;

public final class a extends com.google.android.gms.common.data.a<PlayerStats> {
    public a(DataHolder dataHolder) {
        super(dataHolder);
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public PlayerStats b(int i) {
        return new PlayerStatsRef(this.a, i);
    }
}
