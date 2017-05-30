package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.wearable.i;

public class d extends j implements i {
    public d(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return e();
    }

    public String c() {
        return e("asset_id");
    }

    public String d() {
        return e("asset_key");
    }

    public i e() {
        return new b(this);
    }
}
