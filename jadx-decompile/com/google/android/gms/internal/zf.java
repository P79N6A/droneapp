package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h;
import com.google.android.gms.internal.yz.a;

@aaa
public final class zf extends h<za> {
    public zf() {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    public yz a(Activity activity) {
        try {
            return a.a(((za) b((Context) activity)).a(f.a((Object) activity)));
        } catch (Throwable e) {
            b.d("Could not create remote InAppPurchaseManager.", e);
            return null;
        } catch (Throwable e2) {
            b.d("Could not create remote InAppPurchaseManager.", e2);
            return null;
        }
    }

    protected za a(IBinder iBinder) {
        return za.a.a(iBinder);
    }

    protected /* synthetic */ Object b(IBinder iBinder) {
        return a(iBinder);
    }
}
