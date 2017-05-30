package com.google.android.gms.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.bo;
import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.e;
import com.google.android.gms.internal.ajw;

class m$a extends l {
    private final DataHolder c;
    private final int d;
    private final int e;

    public m$a(DataHolder dataHolder, int i) {
        this.c = dataHolder;
        this.d = i;
        this.e = dataHolder.a(i);
    }

    public l H() {
        MetadataBundle a = MetadataBundle.a();
        for (a aVar : e.a()) {
            if (aVar != ajw.F) {
                aVar.a(this.c, a, this.d, this.e);
            }
        }
        return new bo(a);
    }

    public /* synthetic */ Object a() {
        return H();
    }

    public <T> T a(a<T> aVar) {
        return aVar.a(this.c, this.d, this.e);
    }

    public boolean b() {
        return !this.c.h();
    }
}
