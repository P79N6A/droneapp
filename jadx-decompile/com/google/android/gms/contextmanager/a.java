package com.google.android.gms.contextmanager;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.k;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class a extends k<ContextData> {
    public a(DataHolder dataHolder) {
        super(dataHolder, ContextData.CREATOR);
    }

    public /* synthetic */ Object a(int i) {
        return c(i);
    }

    public /* synthetic */ SafeParcelable b(int i) {
        return (ContextData) a(i);
    }

    public ContextData c(int i) {
        return (ContextData) super.b(i);
    }
}
