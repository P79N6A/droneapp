package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h;
import com.google.android.gms.c.h.a;
import com.google.android.gms.common.j;

public final class tb extends h<td> {
    private static final tb a = new tb();

    private tb() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    public static tc a(String str, Context context, boolean z) {
        if (j.b().a(context) == 0) {
            tc b = a.b(str, context, z);
            if (b != null) {
                return b;
            }
        }
        return new ta(str, context, z);
    }

    private tc b(String str, Context context, boolean z) {
        IBinder a;
        e a2 = f.a(context);
        if (z) {
            try {
                a = ((td) b(context)).a(str, a2);
            } catch (RemoteException e) {
                return null;
            } catch (a e2) {
                return null;
            }
        }
        a = ((td) b(context)).b(str, a2);
        return tc.a.a(a);
    }

    protected td a(IBinder iBinder) {
        return td.a.a(iBinder);
    }

    protected /* synthetic */ Object b(IBinder iBinder) {
        return a(iBinder);
    }
}
