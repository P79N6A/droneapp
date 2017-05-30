package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.d;
import com.google.ads.mediation.i;
import com.google.ads.mediation.j;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.internal.xq.a;
import java.util.Map;

@aaa
public final class xp extends a {
    private Map<Class<? extends m>, m> a;

    private <NETWORK_EXTRAS extends j, SERVER_PARAMETERS extends i> xr c(String str) {
        try {
            Class cls = Class.forName(str, false, xp.class.getClassLoader());
            if (d.class.isAssignableFrom(cls)) {
                d dVar = (d) cls.newInstance();
                return new yd(dVar, (j) this.a.get(dVar.b()));
            } else if (b.class.isAssignableFrom(cls)) {
                return new xx((b) cls.newInstance());
            } else {
                com.google.android.gms.ads.internal.util.client.b.d(new StringBuilder(String.valueOf(str).length() + 64).append("Could not instantiate mediation adapter: ").append(str).append(" (not a valid adapter).").toString());
                throw new RemoteException();
            }
        } catch (Throwable th) {
            return d(str);
        }
    }

    private xr d(String str) {
        try {
            com.google.android.gms.ads.internal.util.client.b.a("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new xx(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new xx(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new xx(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                d customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new yd(customEventAdapter, (com.google.android.gms.ads.mediation.customevent.d) this.a.get(customEventAdapter.b()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.b.d(new StringBuilder(String.valueOf(str).length() + 43).append("Could not instantiate mediation adapter: ").append(str).append(". ").toString(), th);
        }
    }

    public xr a(String str) {
        return c(str);
    }

    public void a(Map<Class<? extends m>, m> map) {
        this.a = map;
    }

    public boolean b(String str) {
        boolean z = false;
        try {
            z = com.google.android.gms.ads.mediation.customevent.a.class.isAssignableFrom(Class.forName(str, false, xp.class.getClassLoader()));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.b.d(new StringBuilder(String.valueOf(str).length() + 80).append("Could not load custom event implementation class: ").append(str).append(", assuming old implementation.").toString());
        }
        return z;
    }
}
