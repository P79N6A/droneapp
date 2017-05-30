package com.google.android.gms.location.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.location.internal.i.a;

public class b extends w<i> {
    protected final p<i> a = new p<i>(this) {
        final /* synthetic */ b a;

        {
            this.a = r1;
        }

        public void a() {
            this.a.F();
        }

        public i b() {
            return (i) this.a.G();
        }

        public /* synthetic */ IInterface c() {
            return b();
        }
    };
    private final String e;

    public b(Context context, Looper looper, com.google.android.gms.common.api.g.b bVar, c cVar, String str, s sVar) {
        super(context, looper, 23, sVar, bVar, cVar);
        this.e = str;
    }

    protected i a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.e);
        return bundle;
    }
}
