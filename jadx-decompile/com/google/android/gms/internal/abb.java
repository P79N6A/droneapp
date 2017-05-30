package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.abi.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@aaa
public class abb extends abq implements aba {
    private final a a;
    private final Context b;
    private final ArrayList<Future> c;
    private final ArrayList<String> d;
    private final HashMap<String, aav> e;
    private final List<aaw> f;
    private final HashSet<String> g;
    private final Object h;
    private final aau i;
    private final long j;

    public abb(Context context, a aVar, aau com_google_android_gms_internal_aau) {
        this(context, aVar, com_google_android_gms_internal_aau, ((Long) uf.an.c()).longValue());
    }

    abb(Context context, a aVar, aau com_google_android_gms_internal_aau, long j) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f = new ArrayList();
        this.g = new HashSet();
        this.h = new Object();
        this.b = context;
        this.a = aVar;
        this.i = com_google_android_gms_internal_aau;
        this.j = j;
    }

    private static int a(int i) {
        switch (i) {
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 4;
            case 6:
                return 0;
            case 7:
                return 3;
            default:
                return 6;
        }
    }

    private abi a(int i, @Nullable String str, @Nullable xg xgVar) {
        return new abi(this.a.a.c, null, this.a.b.d, i, this.a.b.f, this.a.b.j, this.a.b.l, this.a.b.k, this.a.a.i, this.a.b.h, xgVar, null, str, this.a.c, null, this.a.b.i, this.a.d, this.a.b.g, this.a.f, this.a.b.n, this.a.b.o, this.a.h, null, this.a.b.C, this.a.b.D, this.a.b.E, this.a.b.F, this.a.b.G, f(), this.a.b.J, this.a.b.N);
    }

    private abi a(String str, xg xgVar) {
        return a(-2, str, xgVar);
    }

    private static String a(aaw com_google_android_gms_internal_aaw) {
        String str = com_google_android_gms_internal_aaw.b;
        int a = a(com_google_android_gms_internal_aaw.c);
        return new StringBuilder(String.valueOf(str).length() + 33).append(str).append(".").append(a).append(".").append(com_google_android_gms_internal_aaw.d).toString();
    }

    private void a(String str, String str2, xg xgVar) {
        synchronized (this.h) {
            abc c = this.i.c(str);
            if (c == null || c.b() == null || c.a() == null) {
                this.f.add(new aaw.a().b(xgVar.d).a(str).a(0).a(7).a());
                return;
            }
            abq a = a(str, str2, xgVar, c);
            this.c.add((Future) a.e());
            this.d.add(str);
            this.e.put(str, a);
        }
    }

    private abi c() {
        return a(3, null, null);
    }

    private String f() {
        StringBuilder stringBuilder = new StringBuilder("");
        if (this.f == null) {
            return stringBuilder.toString();
        }
        for (aaw com_google_android_gms_internal_aaw : this.f) {
            if (!(com_google_android_gms_internal_aaw == null || TextUtils.isEmpty(com_google_android_gms_internal_aaw.b))) {
                stringBuilder.append(String.valueOf(a(com_google_android_gms_internal_aaw)).concat("_"));
            }
        }
        return stringBuilder.substring(0, Math.max(0, stringBuilder.length() - 1));
    }

    protected aav a(String str, String str2, xg xgVar, abc com_google_android_gms_internal_abc) {
        return new aav(this.b, str, str2, xgVar, this.a, com_google_android_gms_internal_abc, this, this.j);
    }

    public void a() {
        String str;
        for (xg xgVar : this.a.c.a) {
            String str2 = xgVar.i;
            for (String str3 : xgVar.c) {
                String str32;
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str32) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str32)) {
                    try {
                        str32 = new JSONObject(str2).getString("class_name");
                    } catch (Throwable e) {
                        b.b("Unable to determine custom event class name, skipping...", e);
                    }
                }
                a(str32, str2, xgVar);
            }
        }
        int i = 0;
        while (i < this.c.size()) {
            aav com_google_android_gms_internal_aav;
            try {
                ((Future) this.c.get(i)).get();
                synchronized (this.h) {
                    str = (String) this.d.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        com_google_android_gms_internal_aav = (aav) this.e.get(str);
                        if (com_google_android_gms_internal_aav != null) {
                            this.f.add(com_google_android_gms_internal_aav.c());
                        }
                    }
                }
                synchronized (this.h) {
                    if (this.g.contains(this.d.get(i))) {
                        str = (String) this.d.get(i);
                        com.google.android.gms.ads.internal.util.client.a.a.post(new 1(this, a(str, this.e.get(str) != null ? ((aav) this.e.get(str)).f() : null)));
                        return;
                    }
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                synchronized (this.h) {
                    str = (String) this.d.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        com_google_android_gms_internal_aav = (aav) this.e.get(str);
                        if (com_google_android_gms_internal_aav != null) {
                            this.f.add(com_google_android_gms_internal_aav.c());
                        }
                    }
                }
            } catch (Throwable e3) {
                b.d("Unable to resolve rewarded adapter.", e3);
                synchronized (this.h) {
                    str = (String) this.d.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        com_google_android_gms_internal_aav = (aav) this.e.get(str);
                        if (com_google_android_gms_internal_aav != null) {
                            this.f.add(com_google_android_gms_internal_aav.c());
                        }
                    }
                }
            } catch (Throwable e32) {
                Throwable th = e32;
                synchronized (this.h) {
                    str = (String) this.d.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        com_google_android_gms_internal_aav = (aav) this.e.get(str);
                        if (com_google_android_gms_internal_aav != null) {
                            this.f.add(com_google_android_gms_internal_aav.c());
                        }
                    }
                }
            }
        }
        com.google.android.gms.ads.internal.util.client.a.a.post(new 2(this, c()));
        return;
        i++;
    }

    public void a(String str) {
        synchronized (this.h) {
            this.g.add(str);
        }
    }

    public void a(String str, int i) {
    }

    public void b() {
    }
}
