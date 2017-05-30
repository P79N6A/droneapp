package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.c;
import com.google.android.gms.analytics.e;
import com.google.android.gms.analytics.g;

public class ct {
    private c a;
    private Context b;
    private g c;

    static class a implements e {
        a() {
        }

        private static int b(int i) {
            switch (i) {
                case 2:
                    return 0;
                case 3:
                case 4:
                    return 1;
                case 5:
                    return 2;
                default:
                    return 3;
            }
        }

        public int a() {
            return b(aw.a());
        }

        public void a(int i) {
            aw.b("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
        }

        public void a(Exception exception) {
            aw.a("", exception);
        }

        public void a(String str) {
            aw.e(str);
        }

        public void b(String str) {
            aw.c(str);
        }

        public void c(String str) {
            aw.b(str);
        }

        public void d(String str) {
            aw.a(str);
        }
    }

    public ct(Context context) {
        this.b = context;
    }

    private synchronized void b(String str) {
        if (this.a == null) {
            this.a = c.a(this.b);
            this.a.a(new a());
            this.c = this.a.a(str);
        }
    }

    public g a(String str) {
        b(str);
        return this.c;
    }
}
