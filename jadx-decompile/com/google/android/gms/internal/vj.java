package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.uw.a;

@aaa
public class vj extends h<uy> {
    public vj() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public uw a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        Throwable e;
        try {
            return a.a(((uy) b(context)).a(f.a((Object) context), f.a((Object) frameLayout), f.a((Object) frameLayout2), q.a));
        } catch (RemoteException e2) {
            e = e2;
            b.d("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (h.a e3) {
            e = e3;
            b.d("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    protected uy a(IBinder iBinder) {
        return uy.a.a(iBinder);
    }

    protected /* synthetic */ Object b(IBinder iBinder) {
        return a(iBinder);
    }
}
