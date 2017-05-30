package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h;
import com.google.android.gms.internal.yq.a;

@aaa
public final class yp extends h<yr> {
    public yp() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public yq a(Activity activity) {
        try {
            return a.a(((yr) b((Context) activity)).a(f.a((Object) activity)));
        } catch (Throwable e) {
            b.d("Could not create remote AdOverlay.", e);
            return null;
        } catch (Throwable e2) {
            b.d("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    protected yr a(IBinder iBinder) {
        return yr.a.a(iBinder);
    }

    protected /* synthetic */ Object b(IBinder iBinder) {
        return a(iBinder);
    }
}
