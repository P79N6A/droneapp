package com.google.android.gms.plus.a.a;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.data.k;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

public final class b extends a<a> {
    private final k<PersonEntity> b;

    public b(DataHolder dataHolder) {
        super(dataHolder);
        if (dataHolder.f() == null || !dataHolder.f().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false)) {
            this.b = null;
        } else {
            this.b = new k(dataHolder, PersonEntity.CREATOR);
        }
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public a b(int i) {
        return this.b != null ? (a) ((SafeParcelable) this.b.a(i)) : new com.google.android.gms.plus.internal.model.people.k(this.a, i);
    }
}
