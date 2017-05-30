package com.google.android.gms.games.achievement;

import com.google.android.gms.common.data.DataHolder;

public final class a extends com.google.android.gms.common.data.a<Achievement> {
    public a(DataHolder dataHolder) {
        super(dataHolder);
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public Achievement b(int i) {
        return new AchievementRef(this.a, i);
    }
}
