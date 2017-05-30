package com.google.android.gms.location.places.personalized;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.k;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.location.places.n;

@Deprecated
public final class e extends k<PlaceUserData> implements m {
    private final Status b;

    public e(DataHolder dataHolder) {
        this(dataHolder, n.c(dataHolder.e()));
    }

    private e(DataHolder dataHolder, Status status) {
        super(dataHolder, PlaceUserData.CREATOR);
        boolean z = dataHolder == null || dataHolder.e() == status.i();
        d.b(z);
        this.b = status;
    }

    public Status a() {
        return this.b;
    }
}
