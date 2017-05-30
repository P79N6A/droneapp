package com.google.android.gms.analytics.internal;

public class ap extends ag<b> {

    private static class a implements com.google.android.gms.analytics.internal.ag.a<b> {
        private final v a;
        private final b b = new b();

        public a(v vVar) {
            this.a = vVar;
        }

        public b a() {
            return this.b;
        }

        public void a(String str, int i) {
            if ("ga_dispatchPeriod".equals(str)) {
                this.b.d = i;
            } else {
                this.a.f().d("Int xml configuration name not recognized", str);
            }
        }

        public void a(String str, String str2) {
        }

        public void a(String str, boolean z) {
            if ("ga_dryRun".equals(str)) {
                this.b.e = z ? 1 : 0;
                return;
            }
            this.a.f().d("Bool xml configuration name not recognized", str);
        }

        public /* synthetic */ af b() {
            return a();
        }

        public void b(String str, String str2) {
            if ("ga_appName".equals(str)) {
                this.b.a = str2;
            } else if ("ga_appVersion".equals(str)) {
                this.b.b = str2;
            } else if ("ga_logLevel".equals(str)) {
                this.b.c = str2;
            } else {
                this.a.f().d("String xml configuration name not recognized", str);
            }
        }
    }

    public ap(v vVar) {
        super(vVar, new a(vVar));
    }
}
