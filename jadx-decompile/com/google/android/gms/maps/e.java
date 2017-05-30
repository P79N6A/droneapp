package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.maps.a.v;
import com.google.android.gms.maps.a.x;
import com.google.android.gms.maps.model.b;
import com.google.android.gms.maps.model.j;

public final class e {
    private static boolean a = false;

    private e() {
    }

    public static synchronized int a(Context context) {
        int i = 0;
        synchronized (e.class) {
            d.a(context, "Context is null");
            if (!a) {
                try {
                    a(v.a(context));
                    a = true;
                } catch (c e) {
                    i = e.a;
                }
            }
        }
        return i;
    }

    public static void a(x xVar) {
        try {
            b.a(xVar.a());
            b.a(xVar.b());
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
