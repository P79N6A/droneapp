package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.reward.client.b.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.h;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.xq;

@aaa
public class f extends h<c> {
    public f() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    public b a(Context context, xq xqVar) {
        Throwable e;
        try {
            return a.a(((c) b(context)).a(com.google.android.gms.c.f.a((Object) context), xqVar, q.a));
        } catch (RemoteException e2) {
            e = e2;
            b.d("Could not get remote RewardedVideoAd.", e);
            return null;
        } catch (h.a e3) {
            e = e3;
            b.d("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    protected c a(IBinder iBinder) {
        return c.a.a(iBinder);
    }

    protected /* synthetic */ Object b(IBinder iBinder) {
        return a(iBinder);
    }
}
