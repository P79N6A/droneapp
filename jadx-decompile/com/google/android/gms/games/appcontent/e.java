package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.m;
import java.util.ArrayList;

public final class e extends m<AppContentSection> {
    protected /* synthetic */ Object a(int i, int i2) {
        return b(i, i2);
    }

    protected AppContentSection b(int i, int i2) {
        return new AppContentSectionRef(null, i, i2);
    }

    public void b() {
        ArrayList arrayList = null;
        super.b();
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            DataHolder dataHolder = (DataHolder) arrayList.get(i);
            if (dataHolder != null) {
                dataHolder.close();
            }
        }
    }

    protected String h() {
        return "section_id";
    }

    protected String i() {
        return "card_id";
    }
}
