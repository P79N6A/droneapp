package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.internal.client.ai.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.xq;

@aaa
public final class u extends h<aj> {
    public u() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public ai a(Context context, String str, xq xqVar) {
        try {
            return a.a(((aj) b(context)).a(f.a((Object) context), str, xqVar, q.a));
        } catch (Throwable e) {
            b.d("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (Throwable e2) {
            b.d("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }

    protected aj a(IBinder iBinder) {
        return aj.a.a(iBinder);
    }

    protected /* synthetic */ Object b(IBinder iBinder) {
        return a(iBinder);
    }
}
