package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h.a;

public final class h extends com.google.android.gms.c.h<aj> {
    private static final h a = new h();

    private h() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View a(Context context, int i, int i2) {
        return a.b(context, i, i2);
    }

    private View b(Context context, int i, int i2) {
        try {
            SignInButtonConfig signInButtonConfig = new SignInButtonConfig(i, i2, null);
            return (View) f.a(((aj) b(context)).a(f.a((Object) context), signInButtonConfig));
        } catch (Throwable e) {
            throw new a("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    public aj a(IBinder iBinder) {
        return aj.a.a(iBinder);
    }

    public /* synthetic */ Object b(IBinder iBinder) {
        return a(iBinder);
    }
}
