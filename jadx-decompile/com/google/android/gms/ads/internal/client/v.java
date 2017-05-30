package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.ak.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.xq;

@aaa
public class v extends h<al> {
    public v() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public ak a(Context context, AdSizeParcel adSizeParcel, String str, xq xqVar, int i) {
        Throwable e;
        try {
            return a.a(((al) b(context)).a(f.a((Object) context), adSizeParcel, str, xqVar, q.a, i));
        } catch (RemoteException e2) {
            e = e2;
            b.a("Could not create remote AdManager.", e);
            return null;
        } catch (h.a e3) {
            e = e3;
            b.a("Could not create remote AdManager.", e);
            return null;
        }
    }

    protected al a(IBinder iBinder) {
        return al.a.a(iBinder);
    }

    protected /* synthetic */ Object b(IBinder iBinder) {
        return a(iBinder);
    }
}
