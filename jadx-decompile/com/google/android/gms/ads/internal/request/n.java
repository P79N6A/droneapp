package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.d;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aab;
import com.google.android.gms.internal.aaf;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.aca;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.vt;
import com.google.android.gms.internal.vu;
import com.google.android.gms.internal.vz;
import com.google.android.gms.internal.wu;
import com.google.android.gms.internal.wx;
import com.google.android.gms.internal.wy;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class n extends abq {
    static final long a = TimeUnit.SECONDS.toMillis(10);
    static boolean b = false;
    private static final Object c = new Object();
    private static wx d = null;
    private static vu e = null;
    private static vz f = null;
    private static vt g = null;
    private final com.google.android.gms.ads.internal.request.a.a h;
    private final com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a i;
    private final Object j = new Object();
    private final Context k;
    private com.google.android.gms.internal.wx.c l;

    public static class a implements aca<wu> {
        public void a(wu wuVar) {
            n.b(wuVar);
        }

        public /* synthetic */ void a(Object obj) {
            a((wu) obj);
        }
    }

    public static class b implements aca<wu> {
        public void a(wu wuVar) {
            n.a(wuVar);
        }

        public /* synthetic */ void a(Object obj) {
            a((wu) obj);
        }
    }

    public static class c implements vt {
        public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
            String str = (String) map.get("request_id");
            String str2 = "Invalid request: ";
            String valueOf = String.valueOf((String) map.get("errors"));
            com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            n.f.b(str);
        }
    }

    public n(Context context, com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a aVar, com.google.android.gms.ads.internal.request.a.a aVar2) {
        super(true);
        this.h = aVar2;
        this.k = context;
        this.i = aVar;
        synchronized (c) {
            if (!b) {
                f = new vz();
                e = new vu(context.getApplicationContext(), aVar.j);
                g = new c();
                d = new wx(this.k.getApplicationContext(), this.i.j, (String) uf.b.c(), new b(), new a());
                b = true;
            }
        }
    }

    private AdResponseParcel a(AdRequestInfoParcel adRequestInfoParcel) {
        final String c = u.e().c();
        final JSONObject a = a(adRequestInfoParcel, c);
        if (a == null) {
            return new AdResponseParcel(0);
        }
        long b = u.k().b();
        Future a2 = f.a(c);
        com.google.android.gms.ads.internal.util.client.a.a.post(new Runnable(this) {
            final /* synthetic */ n c;

            public void run() {
                this.c.l = n.d.a();
                this.c.l.a(new com.google.android.gms.internal.acr.c<wy>(this) {
                    final /* synthetic */ AnonymousClass2 a;

                    {
                        this.a = r1;
                    }

                    public void a(wy wyVar) {
                        try {
                            wyVar.a("AFMA_getAdapterLessMediationAd", a);
                        } catch (Throwable e) {
                            com.google.android.gms.ads.internal.util.client.b.b("Error requesting an ad url", e);
                            n.f.b(c);
                        }
                    }

                    public /* synthetic */ void a(Object obj) {
                        a((wy) obj);
                    }
                }, new com.google.android.gms.internal.acr.a(this) {
                    final /* synthetic */ AnonymousClass2 a;

                    {
                        this.a = r1;
                    }

                    public void a() {
                        n.f.b(c);
                    }
                });
            }
        });
        try {
            JSONObject jSONObject = (JSONObject) a2.get(a - (u.k().b() - b), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new AdResponseParcel(-1);
            }
            AdResponseParcel a3 = aaf.a(this.k, adRequestInfoParcel, jSONObject.toString());
            return (a3.e == -3 || !TextUtils.isEmpty(a3.c)) ? a3 : new AdResponseParcel(3);
        } catch (CancellationException e) {
            return new AdResponseParcel(-1);
        } catch (InterruptedException e2) {
            return new AdResponseParcel(-1);
        } catch (TimeoutException e3) {
            return new AdResponseParcel(2);
        } catch (ExecutionException e4) {
            return new AdResponseParcel(0);
        }
    }

    private JSONObject a(AdRequestInfoParcel adRequestInfoParcel, String str) {
        com.google.android.gms.ads.a.a.a b;
        Throwable e;
        Object obj;
        JSONObject jSONObject = null;
        Bundle bundle = adRequestInfoParcel.c.c.getBundle("sdk_less_server_data");
        if (bundle != null) {
            JSONObject a = aaf.a(this.k, new aab().a(adRequestInfoParcel).a(u.n().a(this.k)));
            if (a != null) {
                Map hashMap;
                try {
                    b = com.google.android.gms.ads.a.a.b(this.k);
                } catch (IOException e2) {
                    e = e2;
                    com.google.android.gms.ads.internal.util.client.b.d("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put(UriUtil.DATA_SCHEME, bundle);
                    if (b != null) {
                        hashMap.put("adid", b.a());
                        hashMap.put("lat", Integer.valueOf(b.b() ? 0 : 1));
                    }
                    jSONObject = u.e().a(hashMap);
                    return jSONObject;
                } catch (IllegalStateException e3) {
                    e = e3;
                    com.google.android.gms.ads.internal.util.client.b.d("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put(UriUtil.DATA_SCHEME, bundle);
                    if (b != null) {
                        hashMap.put("adid", b.a());
                        if (b.b()) {
                        }
                        hashMap.put("lat", Integer.valueOf(b.b() ? 0 : 1));
                    }
                    jSONObject = u.e().a(hashMap);
                    return jSONObject;
                } catch (com.google.android.gms.common.c e4) {
                    e = e4;
                    com.google.android.gms.ads.internal.util.client.b.d("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put(UriUtil.DATA_SCHEME, bundle);
                    if (b != null) {
                        hashMap.put("adid", b.a());
                        if (b.b()) {
                        }
                        hashMap.put("lat", Integer.valueOf(b.b() ? 0 : 1));
                    }
                    jSONObject = u.e().a(hashMap);
                    return jSONObject;
                } catch (d e5) {
                    e = e5;
                    com.google.android.gms.ads.internal.util.client.b.d("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put(UriUtil.DATA_SCHEME, bundle);
                    if (b != null) {
                        hashMap.put("adid", b.a());
                        if (b.b()) {
                        }
                        hashMap.put("lat", Integer.valueOf(b.b() ? 0 : 1));
                    }
                    jSONObject = u.e().a(hashMap);
                    return jSONObject;
                }
                hashMap = new HashMap();
                hashMap.put("request_id", str);
                hashMap.put("request_param", a);
                hashMap.put(UriUtil.DATA_SCHEME, bundle);
                if (b != null) {
                    hashMap.put("adid", b.a());
                    if (b.b()) {
                    }
                    hashMap.put("lat", Integer.valueOf(b.b() ? 0 : 1));
                }
                try {
                    jSONObject = u.e().a(hashMap);
                } catch (JSONException e6) {
                }
            }
        }
        return jSONObject;
    }

    protected static void a(wu wuVar) {
        wuVar.a("/loadAd", f);
        wuVar.a("/fetchHttpRequest", e);
        wuVar.a("/invalidRequest", g);
    }

    protected static void b(wu wuVar) {
        wuVar.b("/loadAd", f);
        wuVar.b("/fetchHttpRequest", e);
        wuVar.b("/invalidRequest", g);
    }

    public void a() {
        com.google.android.gms.ads.internal.util.client.b.a("SdkLessAdLoaderBackgroundTask started.");
        AdRequestInfoParcel adRequestInfoParcel = new AdRequestInfoParcel(this.i, null, -1);
        AdResponseParcel a = a(adRequestInfoParcel);
        AdSizeParcel adSizeParcel = null;
        final com.google.android.gms.internal.abi.a aVar = new com.google.android.gms.internal.abi.a(adRequestInfoParcel, a, null, adSizeParcel, a.e, u.k().b(), a.n, null);
        com.google.android.gms.ads.internal.util.client.a.a.post(new Runnable(this) {
            final /* synthetic */ n b;

            public void run() {
                this.b.h.a(aVar);
                if (this.b.l != null) {
                    this.b.l.q_();
                    this.b.l = null;
                }
            }
        });
    }

    public void b() {
        synchronized (this.j) {
            com.google.android.gms.ads.internal.util.client.a.a.post(new Runnable(this) {
                final /* synthetic */ n a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.l != null) {
                        this.a.l.q_();
                        this.a.l = null;
                    }
                }
            });
        }
    }
}
