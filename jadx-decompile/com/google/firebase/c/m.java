package com.google.firebase.c;

import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.g.g;
import com.google.android.gms.internal.nb;
import com.google.android.gms.internal.nk;

class m implements Runnable {
    private i a;
    private g<Void> b;
    private nb c = new nb(this.a.f().f(), this.a.f().d());

    public m(@NonNull i iVar, @NonNull g<Void> gVar) {
        d.a(iVar);
        d.a(gVar);
        this.a = iVar;
        this.b = gVar;
    }

    public void run() {
        try {
            nk a = this.a.h().a(this.a.o());
            this.c.a(a);
            a.a(this.b, null);
        } catch (Throwable e) {
            Log.e("DeleteStorageTask", "Unable to create Firebase Storage network request.", e);
            this.b.a(g.a(e));
        }
    }
}
