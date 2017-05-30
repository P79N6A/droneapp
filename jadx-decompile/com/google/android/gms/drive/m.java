package com.google.android.gms.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;
import com.google.android.gms.drive.metadata.internal.e;

public final class m extends a<l> {
    private a b;

    public m(DataHolder dataHolder) {
        super(dataHolder);
        dataHolder.f().setClassLoader(m.class.getClassLoader());
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    @Deprecated
    public String a() {
        return null;
    }

    public l b(int i) {
        l lVar = this.b;
        if (lVar != null && a.a(lVar) == i) {
            return lVar;
        }
        lVar = new a(this.a, i);
        this.b = lVar;
        return lVar;
    }

    public void b() {
        if (this.a != null) {
            e.a(this.a);
        }
        super.b();
    }
}
