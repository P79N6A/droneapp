package com.google.android.gms.drive;

public class x extends j {
    private boolean d;

    public static class a extends com.google.android.gms.drive.j.a {
        private boolean d = true;

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
            super.a(i);
            return this;
        }

        public a b(String str) {
            super.a(str);
            return this;
        }

        public a b(boolean z) {
            super.a(z);
            return this;
        }

        public x c() {
            a();
            return new x(this.a, this.b, this.c, this.d);
        }
    }

    private x(String str, boolean z, int i, boolean z2) {
        super(str, z, i);
        this.d = z2;
    }

    public static x a(j jVar) {
        a aVar = new a();
        if (jVar != null) {
            a aVar2 = (a) aVar.a(jVar.c());
            aVar2 = (a) aVar.a(jVar.b());
            String a = jVar.a();
            if (a != null) {
                aVar2 = (a) aVar.a(a);
            }
        }
        return (x) aVar.b();
    }

    public boolean d() {
        return this.d;
    }
}
