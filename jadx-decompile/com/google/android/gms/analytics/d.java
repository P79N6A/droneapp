package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class d {

    protected static class d<T extends d> {
        com.google.android.gms.analytics.a.b a;
        Map<String, List<com.google.android.gms.analytics.a.a>> b = new HashMap();
        List<com.google.android.gms.analytics.a.c> c = new ArrayList();
        List<com.google.android.gms.analytics.a.a> d = new ArrayList();
        private Map<String, String> e = new HashMap();

        protected d() {
        }

        private T b(String str, String str2) {
            if (str == null) {
                com.google.android.gms.analytics.internal.f.c("HitBuilder.setIfNonNull() called with a null paramName.");
            } else if (str2 != null) {
                this.e.put(str, str2);
            }
            return this;
        }

        public T a(int i, float f) {
            a(j.c(i), Float.toString(f));
            return this;
        }

        public T a(int i, String str) {
            a(j.a(i), str);
            return this;
        }

        public T a(com.google.android.gms.analytics.a.a aVar) {
            if (aVar == null) {
                com.google.android.gms.analytics.internal.f.c("product should be non-null");
            } else {
                this.d.add(aVar);
            }
            return this;
        }

        public T a(com.google.android.gms.analytics.a.a aVar, String str) {
            if (aVar == null) {
                com.google.android.gms.analytics.internal.f.c("product should be non-null");
            } else {
                Object obj;
                if (str == null) {
                    obj = "";
                }
                if (!this.b.containsKey(obj)) {
                    this.b.put(obj, new ArrayList());
                }
                ((List) this.b.get(obj)).add(aVar);
            }
            return this;
        }

        public T a(com.google.android.gms.analytics.a.b bVar) {
            this.a = bVar;
            return this;
        }

        public T a(com.google.android.gms.analytics.a.c cVar) {
            if (cVar == null) {
                com.google.android.gms.analytics.internal.f.c("promotion should be non-null");
            } else {
                this.c.add(cVar);
            }
            return this;
        }

        public final T a(String str, String str2) {
            if (str != null) {
                this.e.put(str, str2);
            } else {
                com.google.android.gms.analytics.internal.f.c("HitBuilder.set() called with a null paramName.");
            }
            return this;
        }

        public final T a(Map<String, String> map) {
            if (map != null) {
                this.e.putAll(new HashMap(map));
            }
            return this;
        }

        public Map<String, String> a() {
            Map<String, String> hashMap = new HashMap(this.e);
            if (this.a != null) {
                hashMap.putAll(this.a.a());
            }
            int i = 1;
            for (com.google.android.gms.analytics.a.c e : this.c) {
                hashMap.putAll(e.e(j.g(i)));
                i++;
            }
            i = 1;
            for (com.google.android.gms.analytics.a.a g : this.d) {
                hashMap.putAll(g.g(j.e(i)));
                i++;
            }
            int i2 = 1;
            for (Entry entry : this.b.entrySet()) {
                List<com.google.android.gms.analytics.a.a> list = (List) entry.getValue();
                String j = j.j(i2);
                int i3 = 1;
                for (com.google.android.gms.analytics.a.a aVar : list) {
                    String valueOf = String.valueOf(j);
                    String valueOf2 = String.valueOf(j.i(i3));
                    hashMap.putAll(aVar.g(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i3++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    String valueOf3 = String.valueOf(j);
                    String valueOf4 = String.valueOf("nm");
                    hashMap.put(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), (String) entry.getKey());
                }
                i2++;
            }
            return hashMap;
        }

        public T b() {
            a("&sc", "start");
            return this;
        }

        public T b(boolean z) {
            a("&ni", p.a(z));
            return this;
        }

        public T d(String str) {
            String c = p.c(str);
            if (!TextUtils.isEmpty(c)) {
                Map a = p.a(c);
                b("&cc", (String) a.get("utm_content"));
                b("&cm", (String) a.get("utm_medium"));
                b("&cn", (String) a.get("utm_campaign"));
                b("&cs", (String) a.get("utm_source"));
                b("&ck", (String) a.get("utm_term"));
                b("&ci", (String) a.get("utm_id"));
                b("&anid", (String) a.get("anid"));
                b("&gclid", (String) a.get("gclid"));
                b("&dclid", (String) a.get("dclid"));
                b("&aclid", (String) a.get("aclid"));
                b("&gmob_t", (String) a.get("gmob_t"));
            }
            return this;
        }

        public T e(String str) {
            this.e.put("&promoa", str);
            return this;
        }

        protected T f(String str) {
            a("&t", str);
            return this;
        }

        protected String g(String str) {
            return (String) this.e.get(str);
        }
    }

    @Deprecated
    public static class a extends d<a> {
        public a() {
            a("&t", "screenview");
        }

        public /* bridge */ /* synthetic */ Map a() {
            return super.a();
        }
    }

    public static class b extends d<b> {
        public b() {
            a("&t", com.google.android.gms.tagmanager.e.b);
        }

        public b(String str, String str2) {
            this();
            a(str);
            b(str2);
        }

        public b a(long j) {
            a("&ev", Long.toString(j));
            return this;
        }

        public b a(String str) {
            a("&ec", str);
            return this;
        }

        public /* bridge */ /* synthetic */ Map a() {
            return super.a();
        }

        public b b(String str) {
            a("&ea", str);
            return this;
        }

        public b c(String str) {
            a("&el", str);
            return this;
        }
    }

    public static class c extends d<c> {
        public c() {
            a("&t", "exception");
        }

        public c a(String str) {
            a("&exd", str);
            return this;
        }

        public c a(boolean z) {
            a("&exf", p.a(z));
            return this;
        }

        public /* bridge */ /* synthetic */ Map a() {
            return super.a();
        }
    }

    @Deprecated
    public static class e extends d<e> {
        public e() {
            a("&t", "item");
        }

        public e a(double d) {
            a("&ip", Double.toString(d));
            return this;
        }

        public e a(long j) {
            a("&iq", Long.toString(j));
            return this;
        }

        public e a(String str) {
            a("&ti", str);
            return this;
        }

        public /* bridge */ /* synthetic */ Map a() {
            return super.a();
        }

        public e b(String str) {
            a("&in", str);
            return this;
        }

        public e c(String str) {
            a("&ic", str);
            return this;
        }

        public e h(String str) {
            a("&iv", str);
            return this;
        }

        public e i(String str) {
            a("&cu", str);
            return this;
        }
    }

    public static class f extends d<f> {
        public f() {
            a("&t", "screenview");
        }

        public /* bridge */ /* synthetic */ Map a() {
            return super.a();
        }
    }

    public static class g extends d<g> {
        public g() {
            a("&t", "social");
        }

        public g a(String str) {
            a("&sn", str);
            return this;
        }

        public /* bridge */ /* synthetic */ Map a() {
            return super.a();
        }

        public g b(String str) {
            a("&sa", str);
            return this;
        }

        public g c(String str) {
            a("&st", str);
            return this;
        }
    }

    public static class h extends d<h> {
        public h() {
            a("&t", "timing");
        }

        public h(String str, String str2, long j) {
            this();
            a(str2);
            a(j);
            b(str);
        }

        public h a(long j) {
            a("&utt", Long.toString(j));
            return this;
        }

        public h a(String str) {
            a("&utv", str);
            return this;
        }

        public /* bridge */ /* synthetic */ Map a() {
            return super.a();
        }

        public h b(String str) {
            a("&utc", str);
            return this;
        }

        public h c(String str) {
            a("&utl", str);
            return this;
        }
    }

    @Deprecated
    public static class i extends d<i> {
        public i() {
            a("&t", "transaction");
        }

        public i a(double d) {
            a("&tr", Double.toString(d));
            return this;
        }

        public i a(String str) {
            a("&ti", str);
            return this;
        }

        public /* bridge */ /* synthetic */ Map a() {
            return super.a();
        }

        public i b(double d) {
            a("&tt", Double.toString(d));
            return this;
        }

        public i b(String str) {
            a("&ta", str);
            return this;
        }

        public i c(double d) {
            a("&ts", Double.toString(d));
            return this;
        }

        public i c(String str) {
            a("&cu", str);
            return this;
        }
    }
}
