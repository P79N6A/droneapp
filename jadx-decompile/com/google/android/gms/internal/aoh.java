package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.aog.a;

public class aoh extends w<aog> {
    public aoh(Context context, b bVar, c cVar, s sVar) {
        super(context, context.getMainLooper(), 73, sVar, bVar, cVar);
    }

    protected aog a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.search.service.SEARCH_AUTH_START";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.search.internal.ISearchAuthService";
    }
}
