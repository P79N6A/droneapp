package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Response;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.aec.a;
import com.google.android.gms.internal.ahl.b;

public abstract class aed<T> extends a {
    protected b<T> a;

    public aed(b<T> bVar) {
        this.a = bVar;
    }

    public void a(Response response) {
    }

    public void a(Status status) {
    }

    public void a(Status status, ParcelFileDescriptor parcelFileDescriptor) {
    }

    public void a(Status status, boolean z) {
    }
}
