package com.google.android.gms.games.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.m;

public final class a extends m<GameRequest> {
    public a(DataHolder dataHolder) {
        super(dataHolder);
    }

    protected /* synthetic */ Object a(int i, int i2) {
        return b(i, i2);
    }

    protected GameRequest b(int i, int i2) {
        return new GameRequestRef(this.a, i, i2);
    }

    protected String h() {
        return "external_request_id";
    }
}
