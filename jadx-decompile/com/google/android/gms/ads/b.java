package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.client.ah;
import com.google.android.gms.ads.internal.client.ai;
import com.google.android.gms.ads.internal.client.e;
import com.google.android.gms.ads.internal.client.t;
import com.google.android.gms.ads.internal.client.y;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.vk;
import com.google.android.gms.internal.vl;
import com.google.android.gms.internal.vm;
import com.google.android.gms.internal.vn;
import com.google.android.gms.internal.xp;

public class b {
    private final y a;
    private final Context b;
    private final ah c;

    public static class a {
        private final Context a;
        private final ai b;

        a(Context context, ai aiVar) {
            this.a = context;
            this.b = aiVar;
        }

        public a(Context context, String str) {
            this((Context) d.a((Object) context, (Object) "context cannot be null"), ac.b().a(context, str, new xp()));
        }

        public a a(a aVar) {
            try {
                this.b.a(new t(aVar));
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Failed to set AdListener.", e);
            }
            return this;
        }

        public a a(@NonNull e eVar) {
            d.a((Object) eVar);
            try {
                this.b.a(eVar.b());
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Failed to set correlator.", e);
            }
            return this;
        }

        public a a(com.google.android.gms.ads.formats.b bVar) {
            try {
                this.b.a(new NativeAdOptionsParcel(bVar));
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Failed to specify native ad options", e);
            }
            return this;
        }

        public a a(com.google.android.gms.ads.formats.c.a aVar) {
            try {
                this.b.a(new vk(aVar));
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Failed to add app install ad listener", e);
            }
            return this;
        }

        public a a(com.google.android.gms.ads.formats.d.a aVar) {
            try {
                this.b.a(new vl(aVar));
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Failed to add content ad listener", e);
            }
            return this;
        }

        public a a(String str, com.google.android.gms.ads.formats.e.b bVar, com.google.android.gms.ads.formats.e.a aVar) {
            try {
                this.b.a(str, new vn(bVar), aVar == null ? null : new vm(aVar));
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public b a() {
            try {
                return new b(this.a, this.b.a());
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    b(Context context, ah ahVar) {
        this(context, ahVar, y.a());
    }

    b(Context context, ah ahVar, y yVar) {
        this.b = context;
        this.c = ahVar;
        this.a = yVar;
    }

    private void a(e eVar) {
        try {
            this.c.a(this.a.a(this.b, eVar));
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.b("Failed to load ad.", e);
        }
    }

    public String a() {
        try {
            return this.c.b();
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public void a(c cVar) {
        a(cVar.f());
    }

    public void a(com.google.android.gms.ads.doubleclick.d dVar) {
        a(dVar.j());
    }

    public boolean b() {
        try {
            return this.c.a();
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to check if ad is loading.", e);
            return false;
        }
    }
}
