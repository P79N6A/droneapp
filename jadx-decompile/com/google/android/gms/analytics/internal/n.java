package com.google.android.gms.analytics.internal;

public class n extends ag<o> {

    private static class a extends s implements com.google.android.gms.analytics.internal.ag.a<o> {
        private final o a = new o();

        public a(v vVar) {
            super(vVar);
        }

        public o a() {
            return this.a;
        }

        public void a(String str, int i) {
            if ("ga_sessionTimeout".equals(str)) {
                this.a.c = i;
            } else {
                d("int configuration name not recognized", str);
            }
        }

        public void a(String str, String str2) {
            this.a.g.put(str, str2);
        }

        public void a(String str, boolean z) {
            int i = 1;
            o oVar;
            if ("ga_autoActivityTracking".equals(str)) {
                oVar = this.a;
                if (!z) {
                    i = 0;
                }
                oVar.d = i;
            } else if ("ga_anonymizeIp".equals(str)) {
                oVar = this.a;
                if (!z) {
                    i = 0;
                }
                oVar.e = i;
            } else if ("ga_reportUncaughtExceptions".equals(str)) {
                oVar = this.a;
                if (!z) {
                    i = 0;
                }
                oVar.f = i;
            } else {
                d("bool configuration name not recognized", str);
            }
        }

        public /* synthetic */ af b() {
            return a();
        }

        public void b(String str, String str2) {
            if ("ga_trackingId".equals(str)) {
                this.a.a = str2;
            } else if ("ga_sampleFrequency".equals(str)) {
                try {
                    this.a.b = Double.parseDouble(str2);
                } catch (NumberFormatException e) {
                    c("Error parsing ga_sampleFrequency value", str2, e);
                }
            } else {
                d("string configuration name not recognized", str);
            }
        }
    }

    public n(v vVar) {
        super(vVar, new a(vVar));
    }
}
