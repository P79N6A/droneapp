package com.fimi.soul.view.myhorizontalseebar;

class f<T extends c<T>> implements b<T> {
    private final b<T> a;
    private final Object b;

    public f(b<T> bVar) {
        this.a = bVar;
        this.b = this;
    }

    public f(b<T> bVar, Object obj) {
        this.a = bVar;
        this.b = obj;
    }

    public T a() {
        T a;
        synchronized (this.b) {
            a = this.a.a();
        }
        return a;
    }

    public void a(T t) {
        synchronized (this.b) {
            this.a.a(t);
        }
    }
}
