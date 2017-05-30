package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.i;
import java.util.Date;

public class d extends i<Date> {
    public d(String str, int i) {
        super(str, i);
    }

    protected void a(Bundle bundle, Date date) {
        bundle.putLong(a(), date.getTime());
    }

    protected Date b(Bundle bundle) {
        return new Date(bundle.getLong(a()));
    }

    protected Date b_(DataHolder dataHolder, int i, int i2) {
        return new Date(dataHolder.a(a(), i, i2));
    }

    protected /* synthetic */ Object c(Bundle bundle) {
        return b(bundle);
    }

    protected /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return b_(dataHolder, i, i2);
    }
}
