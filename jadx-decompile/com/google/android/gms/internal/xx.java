package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.j;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.xr.a;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@aaa
public final class xx extends a {
    private final b a;
    private xy b;

    public xx(b bVar) {
        this.a = bVar;
    }

    private Bundle a(String str, int i, String str2) {
        String str3 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    valueOf = (String) keys.next();
                    bundle2.putString(valueOf, jSONObject.getString(valueOf));
                }
                bundle = bundle2;
            }
            if (this.a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                bundle.putInt("tagForChildDirectedTreatment", i);
            }
            return bundle;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not get Server Parameters Bundle.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public e a() {
        if (this.a instanceof c) {
            try {
                return f.a(((c) this.a).getBannerView());
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public void a(AdRequestParcel adRequestParcel, String str) {
        a(adRequestParcel, str, null);
    }

    public void a(AdRequestParcel adRequestParcel, String str, String str2) {
        if (this.a instanceof com.google.android.gms.ads.b.a.a) {
            com.google.android.gms.ads.internal.util.client.b.a("Requesting rewarded video ad from adapter.");
            try {
                com.google.android.gms.ads.b.a.a aVar = (com.google.android.gms.ads.b.a.a) this.a;
                aVar.loadAd(new xw(adRequestParcel.b == -1 ? null : new Date(adRequestParcel.b), adRequestParcel.d, adRequestParcel.e != null ? new HashSet(adRequestParcel.e) : null, adRequestParcel.k, adRequestParcel.f, adRequestParcel.g, adRequestParcel.r), a(str, adRequestParcel.g, str2), adRequestParcel.m != null ? adRequestParcel.m.getBundle(aVar.getClass().getName()) : null);
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not load rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void a(e eVar) {
        try {
            ((n) this.a).a((Context) f.a(eVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.b.a("Could not inform adapter of changed context", th);
        }
    }

    public void a(e eVar, AdRequestParcel adRequestParcel, String str, com.google.android.gms.ads.internal.reward.mediation.client.a aVar, String str2) {
        if (this.a instanceof com.google.android.gms.ads.b.a.a) {
            com.google.android.gms.ads.internal.util.client.b.a("Initialize rewarded video adapter.");
            try {
                com.google.android.gms.ads.b.a.a aVar2 = (com.google.android.gms.ads.b.a.a) this.a;
                aVar2.initialize((Context) f.a(eVar), new xw(adRequestParcel.b == -1 ? null : new Date(adRequestParcel.b), adRequestParcel.d, adRequestParcel.e != null ? new HashSet(adRequestParcel.e) : null, adRequestParcel.k, adRequestParcel.f, adRequestParcel.g, adRequestParcel.r), str, new com.google.android.gms.ads.internal.reward.mediation.client.b(aVar), a(str2, adRequestParcel.g, null), adRequestParcel.m != null ? adRequestParcel.m.getBundle(aVar2.getClass().getName()) : null);
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void a(e eVar, AdRequestParcel adRequestParcel, String str, xs xsVar) {
        a(eVar, adRequestParcel, str, null, xsVar);
    }

    public void a(e eVar, AdRequestParcel adRequestParcel, String str, String str2, xs xsVar) {
        if (this.a instanceof com.google.android.gms.ads.mediation.e) {
            com.google.android.gms.ads.internal.util.client.b.a("Requesting interstitial ad from adapter.");
            try {
                com.google.android.gms.ads.mediation.e eVar2 = (com.google.android.gms.ads.mediation.e) this.a;
                eVar2.requestInterstitialAd((Context) f.a(eVar), new xy(xsVar), a(str, adRequestParcel.g, str2), new xw(adRequestParcel.b == -1 ? null : new Date(adRequestParcel.b), adRequestParcel.d, adRequestParcel.e != null ? new HashSet(adRequestParcel.e) : null, adRequestParcel.k, adRequestParcel.f, adRequestParcel.g, adRequestParcel.r), adRequestParcel.m != null ? adRequestParcel.m.getBundle(eVar2.getClass().getName()) : null);
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void a(e eVar, AdRequestParcel adRequestParcel, String str, String str2, xs xsVar, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list) {
        if (this.a instanceof g) {
            try {
                g gVar = (g) this.a;
                yc ycVar = new yc(adRequestParcel.b == -1 ? null : new Date(adRequestParcel.b), adRequestParcel.d, adRequestParcel.e != null ? new HashSet(adRequestParcel.e) : null, adRequestParcel.k, adRequestParcel.f, adRequestParcel.g, nativeAdOptionsParcel, list, adRequestParcel.r);
                Bundle bundle = adRequestParcel.m != null ? adRequestParcel.m.getBundle(gVar.getClass().getName()) : null;
                this.b = new xy(xsVar);
                gVar.requestNativeAd((Context) f.a(eVar), this.b, a(str, adRequestParcel.g, str2), ycVar, bundle);
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not request native ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationNativeAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void a(e eVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, xs xsVar) {
        a(eVar, adSizeParcel, adRequestParcel, str, null, xsVar);
    }

    public void a(e eVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, xs xsVar) {
        if (this.a instanceof c) {
            com.google.android.gms.ads.internal.util.client.b.a("Requesting banner ad from adapter.");
            try {
                c cVar = (c) this.a;
                cVar.requestBannerAd((Context) f.a(eVar), new xy(xsVar), a(str, adRequestParcel.g, str2), j.a(adSizeParcel.f, adSizeParcel.c, adSizeParcel.b), new xw(adRequestParcel.b == -1 ? null : new Date(adRequestParcel.b), adRequestParcel.d, adRequestParcel.e != null ? new HashSet(adRequestParcel.e) : null, adRequestParcel.k, adRequestParcel.f, adRequestParcel.g, adRequestParcel.r), adRequestParcel.m != null ? adRequestParcel.m.getBundle(cVar.getClass().getName()) : null);
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void b() {
        if (this.a instanceof com.google.android.gms.ads.mediation.e) {
            com.google.android.gms.ads.internal.util.client.b.a("Showing interstitial from adapter.");
            try {
                ((com.google.android.gms.ads.mediation.e) this.a).showInterstitial();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public void c() {
        try {
            this.a.onDestroy();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void d() {
        try {
            this.a.onPause();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not pause adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void e() {
        try {
            this.a.onResume();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not resume adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void f() {
        if (this.a instanceof com.google.android.gms.ads.b.a.a) {
            com.google.android.gms.ads.internal.util.client.b.a("Show rewarded video ad from adapter.");
            try {
                ((com.google.android.gms.ads.b.a.a) this.a).showVideo();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not show rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public boolean g() {
        if (this.a instanceof com.google.android.gms.ads.b.a.a) {
            com.google.android.gms.ads.internal.util.client.b.a("Check if adapter is initialized.");
            try {
                return ((com.google.android.gms.ads.b.a.a) this.a).isInitialized();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not check if adapter is initialized.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public xu h() {
        i a = this.b.a();
        return a instanceof com.google.android.gms.ads.mediation.j ? new xz((com.google.android.gms.ads.mediation.j) a) : null;
    }

    public xv i() {
        i a = this.b.a();
        return a instanceof k ? new yb((k) a) : null;
    }

    public Bundle j() {
        if (this.a instanceof adm) {
            return ((adm) this.a).a();
        }
        String str = "MediationAdapter is not a v2 MediationBannerAdapter: ";
        String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
        com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    public Bundle k() {
        if (this.a instanceof adn) {
            return ((adn) this.a).getInterstitialAdapterInfo();
        }
        String str = "MediationAdapter is not a v2 MediationInterstitialAdapter: ";
        String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
        com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    public Bundle l() {
        return new Bundle();
    }
}
