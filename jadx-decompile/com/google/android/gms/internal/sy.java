package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;

public final class sy {
    private final tc a;

    public sy(String str, Context context, boolean z) {
        this.a = tb.a(str, context, z);
    }

    public Uri a(Uri uri, Context context) {
        e a = this.a.a(f.a(uri), f.a(context));
        if (a != null) {
            return (Uri) f.a(a);
        }
        throw new sz();
    }

    public void a(MotionEvent motionEvent) {
        this.a.d(f.a(motionEvent));
    }

    public Uri b(Uri uri, Context context) {
        e b = this.a.b(f.a(uri), f.a(context));
        if (b != null) {
            return (Uri) f.a(b);
        }
        throw new sz();
    }
}
