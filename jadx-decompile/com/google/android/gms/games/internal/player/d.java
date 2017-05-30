package com.google.android.gms.games.internal.player;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;

public class d extends a<StockProfileImage> {
    public d(DataHolder dataHolder) {
        super(dataHolder);
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public StockProfileImage b(int i) {
        return new StockProfileImageRef(this.a, i);
    }
}
