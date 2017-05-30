package com.google.android.gms.plus;

import com.google.android.gms.common.api.a.a.d;
import java.util.HashSet;
import java.util.Set;

public final class c$a implements d {
    final String a;
    final Set<String> b;

    public static final class a {
        String a;
        final Set<String> b = new HashSet();

        public a a(String str) {
            this.a = str;
            return this;
        }

        public a a(String... strArr) {
            com.google.android.gms.common.internal.d.a(strArr, "activityTypes may not be null.");
            for (Object add : strArr) {
                this.b.add(add);
            }
            return this;
        }

        public c$a a() {
            return new c$a();
        }
    }

    private c$a() {
        this.a = null;
        this.b = new HashSet();
    }

    private c$a(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
    }

    public static a a() {
        return new a();
    }
}
