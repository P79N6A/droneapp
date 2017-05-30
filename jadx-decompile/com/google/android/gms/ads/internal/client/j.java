package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.internal.client.ap.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.aaa;

@aaa
public class j extends h<b> {
    public j() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    public ap a(Context context) {
        try {
            return a.a(((b) b(context)).a(f.a((Object) context), q.a));
        } catch (Throwable e) {
            b.d("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (Throwable e2) {
            b.d("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }

    protected b a(IBinder iBinder) {
        return b.a.a(iBinder);
    }

    protected /* synthetic */ Object b(IBinder iBinder) {
        return a(iBinder);
    }
}
