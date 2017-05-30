package com.google.android.gms.location.places;

import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;
import com.google.android.gms.location.places.internal.r;

public class e extends a<d> implements m {
    private final Status b;
    private final String c;

    public e(DataHolder dataHolder) {
        super(dataHolder);
        this.b = n.c(dataHolder.e());
        if (dataHolder == null || dataHolder.f() == null) {
            this.c = null;
        } else {
            this.c = dataHolder.f().getString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY");
        }
    }

    public Status a() {
        return this.b;
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public d b(int i) {
        return new r(this.a, i);
    }

    @Nullable
    public CharSequence h() {
        return this.c;
    }
}
