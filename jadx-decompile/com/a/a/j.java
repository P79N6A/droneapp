package com.a.a;

import android.view.animation.Interpolator;

public abstract class j implements Cloneable {
    float a;
    Class b;
    boolean c = false;
    private Interpolator d = null;

    static class a extends j {
        float d;

        a(float f) {
            this.a = f;
            this.b = Float.TYPE;
        }

        a(float f, float f2) {
            this.a = f;
            this.d = f2;
            this.b = Float.TYPE;
            this.c = true;
        }

        public void a(Object obj) {
            if (obj != null && obj.getClass() == Float.class) {
                this.d = ((Float) obj).floatValue();
                this.c = true;
            }
        }

        public Object b() {
            return Float.valueOf(this.d);
        }

        public /* synthetic */ Object clone() {
            return h();
        }

        public /* synthetic */ j f() {
            return h();
        }

        public float g() {
            return this.d;
        }

        public a h() {
            a aVar = new a(c(), this.d);
            aVar.a(d());
            return aVar;
        }
    }

    static class b extends j {
        int d;

        b(float f) {
            this.a = f;
            this.b = Integer.TYPE;
        }

        b(float f, int i) {
            this.a = f;
            this.d = i;
            this.b = Integer.TYPE;
            this.c = true;
        }

        public void a(Object obj) {
            if (obj != null && obj.getClass() == Integer.class) {
                this.d = ((Integer) obj).intValue();
                this.c = true;
            }
        }

        public Object b() {
            return Integer.valueOf(this.d);
        }

        public /* synthetic */ Object clone() {
            return h();
        }

        public /* synthetic */ j f() {
            return h();
        }

        public int g() {
            return this.d;
        }

        public b h() {
            b bVar = new b(c(), this.d);
            bVar.a(d());
            return bVar;
        }
    }

    static class c extends j {
        Object d;

        c(float f, Object obj) {
            this.a = f;
            this.d = obj;
            this.c = obj != null;
            this.b = this.c ? obj.getClass() : Object.class;
        }

        public void a(Object obj) {
            this.d = obj;
            this.c = obj != null;
        }

        public Object b() {
            return this.d;
        }

        public /* synthetic */ Object clone() {
            return g();
        }

        public /* synthetic */ j f() {
            return g();
        }

        public c g() {
            c cVar = new c(c(), this.d);
            cVar.a(d());
            return cVar;
        }
    }

    public static j a(float f) {
        return new b(f);
    }

    public static j a(float f, float f2) {
        return new a(f, f2);
    }

    public static j a(float f, int i) {
        return new b(f, i);
    }

    public static j a(float f, Object obj) {
        return new c(f, obj);
    }

    public static j b(float f) {
        return new a(f);
    }

    public static j c(float f) {
        return new c(f, null);
    }

    public void a(Interpolator interpolator) {
        this.d = interpolator;
    }

    public abstract void a(Object obj);

    public boolean a() {
        return this.c;
    }

    public abstract Object b();

    public float c() {
        return this.a;
    }

    public /* synthetic */ Object clone() {
        return f();
    }

    public Interpolator d() {
        return this.d;
    }

    public void d(float f) {
        this.a = f;
    }

    public Class e() {
        return this.b;
    }

    public abstract j f();
}
