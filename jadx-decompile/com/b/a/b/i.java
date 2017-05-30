package com.b.a.b;

import android.graphics.Bitmap;
import android.os.Handler;
import com.b.a.b.a.f;
import com.b.a.c.d;

final class i implements Runnable {
    private static final String a = "PostProcess image before displaying [%s]";
    private final f b;
    private final Bitmap c;
    private final g d;
    private final Handler e;

    public i(f fVar, Bitmap bitmap, g gVar, Handler handler) {
        this.b = fVar;
        this.c = bitmap;
        this.d = gVar;
        this.e = handler;
    }

    public void run() {
        d.a(a, this.d.b);
        h.a(new b(this.d.e.p().a(this.c), this.d, this.b, f.MEMORY_CACHE), this.d.e.s(), this.e, this.b);
    }
}
