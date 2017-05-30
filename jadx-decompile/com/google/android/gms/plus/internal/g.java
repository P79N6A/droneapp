package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h;
import com.google.android.gms.plus.d;
import com.google.android.gms.plus.internal.c.a;

public final class g extends h<c> {
    private static final g a = new g();

    private g() {
        super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
    }

    public static View a(Context context, int i, int i2, String str, int i3) {
        if (str != null) {
            return (View) f.a(((c) a.b(context)).a(f.a(context), i, i2, str, i3));
        }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            return new d(context, i);
        }
    }

    protected c a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected /* synthetic */ Object b(IBinder iBinder) {
        return a(iBinder);
    }
}
