package com.a.c;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import com.a.a.a.a;
import java.util.WeakHashMap;

public abstract class b {
    private static final WeakHashMap<View, b> a = new WeakHashMap(0);

    public static b a(View view) {
        b bVar = (b) a.get(view);
        if (bVar == null) {
            int intValue = Integer.valueOf(VERSION.SDK).intValue();
            bVar = intValue >= 14 ? new d(view) : intValue >= 11 ? new c(view) : new e(view);
            a.put(view, bVar);
        }
        return bVar;
    }

    public abstract long a();

    public abstract b a(float f);

    public abstract b a(long j);

    public abstract b a(Interpolator interpolator);

    public abstract b a(a aVar);

    public abstract long b();

    public abstract b b(float f);

    public abstract b b(long j);

    public abstract b c(float f);

    public abstract void c();

    public abstract b d(float f);

    public abstract void d();

    public abstract b e(float f);

    public abstract b f(float f);

    public abstract b g(float f);

    public abstract b h(float f);

    public abstract b i(float f);

    public abstract b j(float f);

    public abstract b k(float f);

    public abstract b l(float f);

    public abstract b m(float f);

    public abstract b n(float f);

    public abstract b o(float f);

    public abstract b p(float f);

    public abstract b q(float f);

    public abstract b r(float f);

    public abstract b s(float f);

    public abstract b t(float f);
}
