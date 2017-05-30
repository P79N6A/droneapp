package com.google.android.gms.drive;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.ajw;
import com.google.android.gms.internal.ajy;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public final class n {
    public static final int a = 131072;
    public static final int b = 124;
    public static final int c = 30;
    public static final int d = 30;
    public static final int e = 100;
    public static final n f = new n(MetadataBundle.a());
    private final MetadataBundle g;

    public static class a {
        private final MetadataBundle a = MetadataBundle.a();
        private com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.a b;

        private String a(String str, int i, int i2) {
            return String.format("%s must be no more than %d bytes, but is %d bytes.", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)});
        }

        private com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.a b() {
            if (this.b == null) {
                this.b = new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.a();
            }
            return this.b;
        }

        private void b(String str, int i, int i2) {
            d.b(i2 <= i, a(str, i, i2));
        }

        private int e(String str) {
            return str == null ? 0 : str.getBytes().length;
        }

        public a a(CustomPropertyKey customPropertyKey) {
            d.a(customPropertyKey, "key");
            b().a(customPropertyKey, null);
            return this;
        }

        public a a(CustomPropertyKey customPropertyKey, String str) {
            d.a(customPropertyKey, "key");
            d.a(str, "value");
            b("The total size of key string and value string of a custom property", 124, e(customPropertyKey.a()) + e(str));
            b().a(customPropertyKey, str);
            return this;
        }

        public a a(String str) {
            this.a.b(ajw.d, str);
            return this;
        }

        public a a(Date date) {
            this.a.b(ajy.b, date);
            return this;
        }

        public a a(boolean z) {
            this.a.b(ajw.p, Boolean.valueOf(z));
            return this;
        }

        public n a() {
            if (this.b != null) {
                this.a.b(ajw.c, this.b.a());
            }
            return new n(this.a);
        }

        public a b(String str) {
            b("Indexable text size", 131072, e(str));
            this.a.b(ajw.j, str);
            return this;
        }

        public a b(boolean z) {
            this.a.b(ajw.E, Boolean.valueOf(z));
            return this;
        }

        public a c(String str) {
            this.a.b(ajw.x, str);
            return this;
        }

        public a c(boolean z) {
            this.a.b(ajw.w, Boolean.valueOf(z));
            return this;
        }

        public a d(String str) {
            this.a.b(ajw.G, str);
            return this;
        }
    }

    public n(MetadataBundle metadataBundle) {
        this.g = metadataBundle.b();
    }

    public <T> n a(com.google.android.gms.drive.metadata.a<T> aVar, T t) {
        n k = k();
        k.j().b(aVar, t);
        return k;
    }

    public Map<CustomPropertyKey, String> a() {
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) this.g.a(ajw.c);
        return appVisibleCustomProperties == null ? Collections.emptyMap() : appVisibleCustomProperties.a();
    }

    public String b() {
        return (String) this.g.a(ajw.d);
    }

    public String c() {
        return (String) this.g.a(ajw.j);
    }

    public Date d() {
        return (Date) this.g.a(ajy.b);
    }

    public String e() {
        return (String) this.g.a(ajw.x);
    }

    public String f() {
        return (String) this.g.a(ajw.G);
    }

    public Boolean g() {
        return (Boolean) this.g.a(ajw.p);
    }

    public Boolean h() {
        return (Boolean) this.g.a(ajw.E);
    }

    public Boolean i() {
        return (Boolean) this.g.a(ajw.w);
    }

    public MetadataBundle j() {
        return this.g;
    }

    public n k() {
        return new n(j());
    }
}
