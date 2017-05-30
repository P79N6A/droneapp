package com.google.android.gms.drive;

public class w extends j {
    private String d;
    private String e;

    public static class a extends com.google.android.gms.drive.j.a {
        public /* synthetic */ com.google.android.gms.drive.j.a a(int i) {
            return b(i);
        }

        public /* synthetic */ com.google.android.gms.drive.j.a a(String str) {
            return b(str);
        }

        public /* synthetic */ com.google.android.gms.drive.j.a a(boolean z) {
            return b(z);
        }

        public /* synthetic */ j b() {
            return c();
        }

        public a b(int i) {
            throw new UnsupportedOperationException();
        }

        public a b(String str) {
            super.a(str);
            return this;
        }

        public a b(boolean z) {
            super.a(z);
            return this;
        }

        public w c() {
            a();
            return new w(this.a, this.b, null, null, this.c);
        }
    }

    private w(String str, boolean z, String str2, String str3, int i) {
        super(str, z, i);
        this.d = str2;
        this.e = str3;
    }

    public static w a(j jVar) {
        a aVar = new a();
        if (jVar != null) {
            if (jVar.c() != 0) {
                throw new IllegalStateException("May not set a conflict strategy for new file creation.");
            }
            a aVar2;
            String a = jVar.a();
            if (a != null) {
                aVar2 = (a) aVar.a(a);
            }
            aVar2 = (a) aVar.a(jVar.b());
        }
        return (w) aVar.b();
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }
}
