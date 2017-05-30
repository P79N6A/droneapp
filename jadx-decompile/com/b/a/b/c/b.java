package com.b.a.b.c;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.b.a.b.a.f;
import com.b.a.b.e.a;

public class b implements a {
    private final int a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public b(int i) {
        this(i, true, true, true);
    }

    public b(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static void a(View view, int i) {
        if (view != null) {
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) i);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            view.startAnimation(alphaAnimation);
        }
    }

    public void a(Bitmap bitmap, a aVar, f fVar) {
        aVar.a(bitmap);
        if ((this.b && fVar == f.NETWORK) || ((this.c && fVar == f.DISC_CACHE) || (this.d && fVar == f.MEMORY_CACHE))) {
            a(aVar.d(), this.a);
        }
    }
}
