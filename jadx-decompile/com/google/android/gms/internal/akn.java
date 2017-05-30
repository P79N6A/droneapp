package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.fitness.j;
import java.util.Collection;
import java.util.Set;

public abstract class akn<T extends IInterface> extends w<T> {
    protected akn(Context context, Looper looper, int i, b bVar, c cVar, s sVar) {
        super(context, looper, i, sVar, bVar, cVar);
    }

    public boolean H() {
        return true;
    }

    public abstract String a();

    protected Set<Scope> a(Set<Scope> set) {
        return j.a((Collection) set);
    }

    public abstract T b(IBinder iBinder);

    public abstract String b();

    public boolean v() {
        return !akk.a(B());
    }
}
