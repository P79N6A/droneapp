package com.google.android.gms.games.event;

import com.google.android.gms.common.data.DataHolder;

public final class a extends com.google.android.gms.common.data.a<Event> {
    public a(DataHolder dataHolder) {
        super(dataHolder);
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public Event b(int i) {
        return new EventRef(this.a, i);
    }
}
