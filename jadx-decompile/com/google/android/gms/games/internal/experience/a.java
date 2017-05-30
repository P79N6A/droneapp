package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.DataHolder;

public final class a extends com.google.android.gms.common.data.a<ExperienceEvent> {
    public a(DataHolder dataHolder) {
        super(dataHolder);
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public ExperienceEvent b(int i) {
        return new ExperienceEventRef(this.a, i);
    }
}
