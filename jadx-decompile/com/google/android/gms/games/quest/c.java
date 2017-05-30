package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.m;

public final class c extends m<Quest> {
    public c(DataHolder dataHolder) {
        super(dataHolder);
    }

    protected /* synthetic */ Object a(int i, int i2) {
        return b(i, i2);
    }

    protected Quest b(int i, int i2) {
        return new QuestRef(this.a, i, i2);
    }

    protected String h() {
        return "external_quest_id";
    }
}
