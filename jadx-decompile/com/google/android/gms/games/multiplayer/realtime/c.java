package com.google.android.gms.games.multiplayer.realtime;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.m;

public final class c extends m<Room> {
    public c(DataHolder dataHolder) {
        super(dataHolder);
    }

    protected /* synthetic */ Object a(int i, int i2) {
        return b(i, i2);
    }

    protected Room b(int i, int i2) {
        return new RoomRef(this.a, i, i2);
    }

    protected String h() {
        return "external_match_id";
    }
}
