package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.a;

public final class f extends a<Participant> {
    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public Participant b(int i) {
        return new ParticipantRef(this.a, i);
    }
}
