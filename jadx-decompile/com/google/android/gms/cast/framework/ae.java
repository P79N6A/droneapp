package com.google.android.gms.cast.framework;

import android.support.annotation.NonNull;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.cast.framework.ab.a;

public class ae<T extends j> extends a {
    private final l<T> a;
    private final Class<T> b;

    public ae(@NonNull l<T> lVar, @NonNull Class<T> cls) {
        this.a = lVar;
        this.b = cls;
    }

    public int a() {
        return 9683208;
    }

    public void a(@NonNull e eVar) {
        j jVar = (j) f.a(eVar);
        if (this.b.isInstance(jVar)) {
            this.a.a((j) this.b.cast(jVar));
        }
    }

    public void a(@NonNull e eVar, int i) {
        j jVar = (j) f.a(eVar);
        if (this.b.isInstance(jVar)) {
            this.a.a((j) this.b.cast(jVar), i);
        }
    }

    public void a(@NonNull e eVar, String str) {
        j jVar = (j) f.a(eVar);
        if (this.b.isInstance(jVar)) {
            this.a.a((j) this.b.cast(jVar), str);
        }
    }

    public void a(@NonNull e eVar, boolean z) {
        j jVar = (j) f.a(eVar);
        if (this.b.isInstance(jVar)) {
            this.a.a((j) this.b.cast(jVar), z);
        }
    }

    public e b() {
        return f.a(this.a);
    }

    public void b(@NonNull e eVar) {
        j jVar = (j) f.a(eVar);
        if (this.b.isInstance(jVar)) {
            this.a.b((j) this.b.cast(jVar));
        }
    }

    public void b(@NonNull e eVar, int i) {
        j jVar = (j) f.a(eVar);
        if (this.b.isInstance(jVar)) {
            this.a.b((j) this.b.cast(jVar), i);
        }
    }

    public void b(@NonNull e eVar, String str) {
        j jVar = (j) f.a(eVar);
        if (this.b.isInstance(jVar)) {
            this.a.b((j) this.b.cast(jVar), str);
        }
    }

    public void c(@NonNull e eVar, int i) {
        j jVar = (j) f.a(eVar);
        if (this.b.isInstance(jVar)) {
            this.a.c((j) this.b.cast(jVar), i);
        }
    }

    public void d(@NonNull e eVar, int i) {
        j jVar = (j) f.a(eVar);
        if (this.b.isInstance(jVar)) {
            this.a.d((j) this.b.cast(jVar), i);
        }
    }
}
