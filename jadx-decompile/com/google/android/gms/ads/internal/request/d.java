package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.p.c;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aad;
import com.google.android.gms.internal.aae;
import com.google.android.gms.internal.abx;
import com.google.android.gms.internal.acr;
import com.google.android.gms.internal.ty;
import com.google.android.gms.internal.uf;
import com.tencent.tauth.AuthActivity;

@aaa
public abstract class d implements com.google.android.gms.ads.internal.request.c.a, abx<Void> {
    private final acr<AdRequestInfoParcel> a;
    private final com.google.android.gms.ads.internal.request.c.a b;
    private final Object c = new Object();

    @aaa
    public static final class a extends d {
        private final Context a;

        public a(Context context, acr<AdRequestInfoParcel> com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, com.google.android.gms.ads.internal.request.c.a aVar) {
            super(com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, aVar);
            this.a = context;
        }

        public void a() {
        }

        public k b() {
            return aae.a(this.a, new ty((String) uf.b.c()), aad.a());
        }

        public /* synthetic */ Object e() {
            return super.c();
        }
    }

    @aaa
    public static class b extends d implements com.google.android.gms.common.internal.p.b, c {
        protected e a;
        private Context b;
        private VersionInfoParcel c;
        private acr<AdRequestInfoParcel> d;
        private final com.google.android.gms.ads.internal.request.c.a e;
        private final Object f = new Object();
        private boolean g;

        public b(Context context, VersionInfoParcel versionInfoParcel, acr<AdRequestInfoParcel> com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, com.google.android.gms.ads.internal.request.c.a aVar) {
            Looper a;
            super(com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, aVar);
            this.b = context;
            this.c = versionInfoParcel;
            this.d = com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel;
            this.e = aVar;
            if (((Boolean) uf.H.c()).booleanValue()) {
                this.g = true;
                a = u.u().a();
            } else {
                a = context.getMainLooper();
            }
            this.a = new e(context, a, this, this, this.c.d);
            f();
        }

        public void a() {
            synchronized (this.f) {
                if (this.a.t() || this.a.u()) {
                    this.a.f();
                }
                Binder.flushPendingCommands();
                if (this.g) {
                    u.u().b();
                    this.g = false;
                }
            }
        }

        public void a(int i) {
            com.google.android.gms.ads.internal.util.client.b.a("Disconnected from remote ad request service.");
        }

        public void a(Bundle bundle) {
            Void voidR = (Void) e();
        }

        public void a(@NonNull ConnectionResult connectionResult) {
            com.google.android.gms.ads.internal.util.client.b.a("Cannot connect to remote service, fallback to local instance.");
            g().e();
            Bundle bundle = new Bundle();
            bundle.putString(AuthActivity.ACTION_KEY, "gms_connection_failed_fallback_to_local");
            u.e().b(this.b, this.c.b, "gmob-apps", bundle, true);
        }

        public k b() {
            k b_;
            synchronized (this.f) {
                try {
                    b_ = this.a.b_();
                } catch (IllegalStateException e) {
                    b_ = null;
                    return b_;
                } catch (DeadObjectException e2) {
                    b_ = null;
                    return b_;
                }
            }
            return b_;
        }

        public /* synthetic */ Object e() {
            return super.c();
        }

        protected void f() {
            this.a.A();
        }

        abx g() {
            return new a(this.b, this.d, this.e);
        }
    }

    public d(acr<AdRequestInfoParcel> com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, com.google.android.gms.ads.internal.request.c.a aVar) {
        this.a = com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel;
        this.b = aVar;
    }

    public abstract void a();

    public void a(AdResponseParcel adResponseParcel) {
        synchronized (this.c) {
            this.b.a(adResponseParcel);
            a();
        }
    }

    boolean a(k kVar, AdRequestInfoParcel adRequestInfoParcel) {
        try {
            kVar.a(adRequestInfoParcel, new g(this));
            return true;
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not fetch ad response from ad request service.", e);
            u.i().a(e, "AdRequestClientTask.getAdResponseFromService");
            this.b.a(new AdResponseParcel(0));
            return false;
        } catch (Throwable e2) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not fetch ad response from ad request service due to an Exception.", e2);
            u.i().a(e2, "AdRequestClientTask.getAdResponseFromService");
            this.b.a(new AdResponseParcel(0));
            return false;
        } catch (Throwable e22) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not fetch ad response from ad request service due to an Exception.", e22);
            u.i().a(e22, "AdRequestClientTask.getAdResponseFromService");
            this.b.a(new AdResponseParcel(0));
            return false;
        } catch (Throwable e222) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not fetch ad response from ad request service due to an Exception.", e222);
            u.i().a(e222, "AdRequestClientTask.getAdResponseFromService");
            this.b.a(new AdResponseParcel(0));
            return false;
        }
    }

    public abstract k b();

    public Void c() {
        final k b = b();
        if (b == null) {
            this.b.a(new AdResponseParcel(0));
            a();
        } else {
            this.a.a(new acr.c<AdRequestInfoParcel>(this) {
                final /* synthetic */ d b;

                public void a(AdRequestInfoParcel adRequestInfoParcel) {
                    if (!this.b.a(b, adRequestInfoParcel)) {
                        this.b.a();
                    }
                }

                public /* synthetic */ void a(Object obj) {
                    a((AdRequestInfoParcel) obj);
                }
            }, new com.google.android.gms.internal.acr.a(this) {
                final /* synthetic */ d a;

                {
                    this.a = r1;
                }

                public void a() {
                    this.a.a();
                }
            });
        }
        return null;
    }

    public void d() {
        a();
    }

    public /* synthetic */ Object e() {
        return c();
    }
}
