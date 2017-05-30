package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.d;
import com.google.ads.mediation.g;
import com.google.ads.mediation.i;
import com.google.ads.mediation.j;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.xr.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@aaa
public final class yd<NETWORK_EXTRAS extends j, SERVER_PARAMETERS extends i> extends a {
    private final d<NETWORK_EXTRAS, SERVER_PARAMETERS> a;
    private final NETWORK_EXTRAS b;

    public yd(d<NETWORK_EXTRAS, SERVER_PARAMETERS> dVar, NETWORK_EXTRAS network_extras) {
        this.a = dVar;
        this.b = network_extras;
    }

    private SERVER_PARAMETERS a(String str, int i, String str2) {
        Map hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    hashMap.put(str3, jSONObject.getString(str3));
                }
            } catch (Throwable th) {
                b.d("Could not get MediationServerParameters.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class c = this.a.c();
        if (c == null) {
            return null;
        }
        i iVar = (i) c.newInstance();
        iVar.a(hashMap);
        return iVar;
    }

    public e a() {
        if (this.a instanceof com.google.ads.mediation.e) {
            try {
                return f.a(((com.google.ads.mediation.e) this.a).d());
            } catch (Throwable th) {
                b.d("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public void a(AdRequestParcel adRequestParcel, String str) {
    }

    public void a(AdRequestParcel adRequestParcel, String str, String str2) {
    }

    public void a(e eVar) {
    }

    public void a(e eVar, AdRequestParcel adRequestParcel, String str, com.google.android.gms.ads.internal.reward.mediation.client.a aVar, String str2) {
    }

    public void a(e eVar, AdRequestParcel adRequestParcel, String str, xs xsVar) {
        a(eVar, adRequestParcel, str, null, xsVar);
    }

    public void a(e eVar, AdRequestParcel adRequestParcel, String str, String str2, xs xsVar) {
        if (this.a instanceof g) {
            b.a("Requesting interstitial ad from adapter.");
            try {
                ((g) this.a).a(new ye(xsVar), (Activity) f.a(eVar), a(str, adRequestParcel.g, str2), yf.a(adRequestParcel), this.b);
            } catch (Throwable th) {
                b.d("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            b.d(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void a(e eVar, AdRequestParcel adRequestParcel, String str, String str2, xs xsVar, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list) {
    }

    public void a(e eVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, xs xsVar) {
        a(eVar, adSizeParcel, adRequestParcel, str, null, xsVar);
    }

    public void a(e eVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, xs xsVar) {
        if (this.a instanceof com.google.ads.mediation.e) {
            b.a("Requesting banner ad from adapter.");
            try {
                ((com.google.ads.mediation.e) this.a).a(new ye(xsVar), (Activity) f.a(eVar), a(str, adRequestParcel.g, str2), yf.a(adSizeParcel), yf.a(adRequestParcel), this.b);
            } catch (Throwable th) {
                b.d("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            b.d(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void b() {
        if (this.a instanceof g) {
            b.a("Showing interstitial from adapter.");
            try {
                ((g) this.a).e();
            } catch (Throwable th) {
                b.d("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public void c() {
        try {
            this.a.a();
        } catch (Throwable th) {
            b.d("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void d() {
        throw new RemoteException();
    }

    public void e() {
        throw new RemoteException();
    }

    public void f() {
    }

    public boolean g() {
        return true;
    }

    public xu h() {
        return null;
    }

    public xv i() {
        return null;
    }

    public Bundle j() {
        return new Bundle();
    }

    public Bundle k() {
        return new Bundle();
    }

    public Bundle l() {
        return new Bundle();
    }
}
