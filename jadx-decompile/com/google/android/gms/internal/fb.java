package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import com.google.android.gms.c.d;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h;
import com.google.android.gms.common.c;
import com.google.android.gms.common.e;
import com.google.android.gms.internal.ew.a;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public class fb extends h<ew> {
    private static fb a;

    protected fb() {
        super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
    }

    public static et a(Activity activity, d dVar, WalletFragmentOptions walletFragmentOptions, eu euVar) {
        int a = e.a(activity);
        if (a != 0) {
            throw new c(a);
        }
        try {
            return ((ew) a().b(activity)).a(f.a(activity), dVar, walletFragmentOptions, euVar);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    private static fb a() {
        if (a == null) {
            a = new fb();
        }
        return a;
    }

    protected ew a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected /* synthetic */ Object b(IBinder iBinder) {
        return a(iBinder);
    }
}
