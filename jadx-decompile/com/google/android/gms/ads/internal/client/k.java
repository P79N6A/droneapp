package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.vf;
import com.google.android.gms.internal.vg;
import com.google.android.gms.internal.vh;
import com.google.android.gms.internal.vi;

public class k extends com.google.android.gms.ads.internal.client.ai.a {
    private ag a;

    private class a extends com.google.android.gms.ads.internal.client.ah.a {
        final /* synthetic */ k a;

        private a(k kVar) {
            this.a = kVar;
        }

        public void a(AdRequestParcel adRequestParcel) {
            b.b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
            com.google.android.gms.ads.internal.util.client.a.a.post(new Runnable(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.a.a != null) {
                        try {
                            this.a.a.a.a(1);
                        } catch (Throwable e) {
                            b.d("Could not notify onAdFailedToLoad event.", e);
                        }
                    }
                }
            });
        }

        public boolean a() {
            return false;
        }

        public String b() {
            return null;
        }
    }

    public ah a() {
        return new a();
    }

    public void a(ag agVar) {
        this.a = agVar;
    }

    public void a(ao aoVar) {
    }

    public void a(NativeAdOptionsParcel nativeAdOptionsParcel) {
    }

    public void a(vf vfVar) {
    }

    public void a(vg vgVar) {
    }

    public void a(String str, vi viVar, vh vhVar) {
    }
}
