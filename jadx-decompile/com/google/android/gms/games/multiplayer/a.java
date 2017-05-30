package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.m;

public final class a extends m<Invitation> {
    public a(DataHolder dataHolder) {
        super(dataHolder);
    }

    protected /* synthetic */ Object a(int i, int i2) {
        return b(i, i2);
    }

    protected Invitation b(int i, int i2) {
        return new InvitationRef(this.a, i, i2);
    }

    protected String h() {
        return "external_invitation_id";
    }
}
