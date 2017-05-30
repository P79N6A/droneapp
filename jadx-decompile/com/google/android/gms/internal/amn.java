package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.identity.intents.UserAddressRequest;

public class amn extends w<amp> {
    private Activity a;
    private a e;
    private final String f;
    private final int g;

    public static final class a extends com.google.android.gms.internal.amo.a {
        private final int a;
        private Activity b;

        public a(int i, Activity activity) {
            this.a = i;
            this.b = activity;
        }

        private void a(Activity activity) {
            this.b = activity;
        }

        public void a(int i, Bundle bundle) {
            PendingIntent createPendingResult;
            if (i == 1) {
                Intent intent = new Intent();
                intent.putExtras(bundle);
                createPendingResult = this.b.createPendingResult(this.a, intent, 1073741824);
                if (createPendingResult != null) {
                    try {
                        createPendingResult.send(1);
                        return;
                    } catch (Throwable e) {
                        Log.w("AddressClientImpl", "Exception settng pending result", e);
                        return;
                    }
                }
                return;
            }
            createPendingResult = null;
            if (bundle != null) {
                createPendingResult = (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT");
            }
            ConnectionResult connectionResult = new ConnectionResult(i, createPendingResult);
            if (connectionResult.a()) {
                try {
                    connectionResult.a(this.b, this.a);
                    return;
                } catch (Throwable e2) {
                    Log.w("AddressClientImpl", "Exception starting pending intent", e2);
                    return;
                }
            }
            try {
                createPendingResult = this.b.createPendingResult(this.a, new Intent(), 1073741824);
                if (createPendingResult != null) {
                    createPendingResult.send(1);
                }
            } catch (Throwable e22) {
                Log.w("AddressClientImpl", "Exception setting pending result", e22);
            }
        }
    }

    public amn(Activity activity, Looper looper, s sVar, int i, b bVar, c cVar) {
        super(activity, looper, 12, sVar, bVar, cVar);
        this.f = sVar.a();
        this.a = activity;
        this.g = i;
    }

    public boolean H() {
        return true;
    }

    protected amp a(IBinder iBinder) {
        return com.google.android.gms.internal.amp.a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.identity.service.BIND";
    }

    public void a(UserAddressRequest userAddressRequest, int i) {
        i();
        this.e = new a(i, this.a);
        Bundle bundle;
        try {
            bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", B().getPackageName());
            if (!TextUtils.isEmpty(this.f)) {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.f, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.g);
            h().a(this.e, userAddressRequest, bundle);
        } catch (Throwable e) {
            Log.e("AddressClientImpl", "Exception requesting user address", e);
            bundle = new Bundle();
            bundle.putInt(com.google.android.gms.identity.intents.b.b.b, com.google.android.gms.identity.intents.b.a.a);
            this.e.a(1, bundle);
        }
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    public void f() {
        super.f();
        if (this.e != null) {
            this.e.a(null);
            this.e = null;
        }
    }

    protected amp h() {
        return (amp) super.G();
    }

    protected void i() {
        super.F();
    }
}
