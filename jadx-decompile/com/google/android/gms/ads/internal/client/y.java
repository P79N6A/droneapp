package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.search.b;
import com.google.android.gms.internal.aaa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@aaa
public class y {
    public static final y a = new y();

    protected y() {
    }

    public static y a() {
        return a;
    }

    public AdRequestParcel a(Context context, e eVar) {
        Date a = eVar.a();
        long time = a != null ? a.getTime() : -1;
        String b = eVar.b();
        int c = eVar.c();
        Collection d = eVar.d();
        List unmodifiableList = !d.isEmpty() ? Collections.unmodifiableList(new ArrayList(d)) : null;
        boolean a2 = eVar.a(context);
        int l = eVar.l();
        Location e = eVar.e();
        Bundle b2 = eVar.b(AdMobAdapter.class);
        boolean f = eVar.f();
        String g = eVar.g();
        b i = eVar.i();
        SearchAdRequestParcel searchAdRequestParcel = i != null ? new SearchAdRequestParcel(i) : null;
        String str = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            str = ac.a().a(Thread.currentThread().getStackTrace(), applicationContext.getPackageName());
        }
        return new AdRequestParcel(7, time, b2, c, unmodifiableList, a2, l, f, g, searchAdRequestParcel, e, b, eVar.k(), eVar.m(), Collections.unmodifiableList(new ArrayList(eVar.n())), eVar.h(), str, eVar.o());
    }

    public RewardedVideoAdRequestParcel a(Context context, e eVar, String str) {
        return new RewardedVideoAdRequestParcel(a(context, eVar), str);
    }
}
