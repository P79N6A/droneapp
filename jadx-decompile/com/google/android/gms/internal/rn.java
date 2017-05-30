package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.df.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class rn extends rm {
    private static final String s = rn.class.getSimpleName();

    protected rn(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static rn a(String str, Context context, boolean z) {
        rm.a(context, z);
        return new rn(context, str, z);
    }

    protected List<Callable<Void>> b(rw rwVar, a aVar) {
        if (rwVar.c() == null || !this.l) {
            return super.b(rwVar, aVar);
        }
        int q = rwVar.q();
        List<Callable<Void>> arrayList = new ArrayList();
        arrayList.addAll(super.b(rwVar, aVar));
        arrayList.add(new sf(rwVar, rr.n(), rr.o(), aVar, q, 24));
        return arrayList;
    }
}
