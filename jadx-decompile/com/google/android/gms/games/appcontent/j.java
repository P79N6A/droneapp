package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public abstract class j extends com.google.android.gms.common.data.j {
    protected final ArrayList<DataHolder> c;

    protected j(ArrayList<DataHolder> arrayList, int i, int i2) {
        super((DataHolder) arrayList.get(i), i2);
        this.c = arrayList;
    }
}
