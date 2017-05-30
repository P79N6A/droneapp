package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.j;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.p.i;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.aok;
import com.google.android.gms.internal.aom;
import com.google.android.gms.signin.internal.e.a;

public class g extends w<e> implements aok {
    private final boolean a;
    private final s e;
    private final Bundle f;
    private Integer g;

    public g(Context context, Looper looper, boolean z, s sVar, Bundle bundle, b bVar, c cVar) {
        super(context, looper, 44, sVar, bVar, cVar);
        this.a = z;
        this.e = sVar;
        this.f = bundle;
        this.g = sVar.l();
    }

    public g(Context context, Looper looper, boolean z, s sVar, aom com_google_android_gms_internal_aom, b bVar, c cVar) {
        this(context, looper, z, sVar, a(sVar), bVar, cVar);
    }

    public static Bundle a(s sVar) {
        aom k = sVar.k();
        Integer l = sVar.l();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", sVar.b());
        if (l != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", l.intValue());
        }
        if (k != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", k.a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", k.b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", k.c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", k.d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", k.e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", k.f());
            if (k.g() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", k.g().longValue());
            }
            if (k.h() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", k.h().longValue());
            }
        }
        return bundle;
    }

    private ResolveAccountRequest i() {
        Account c = this.e.c();
        GoogleSignInAccount googleSignInAccount = null;
        if ("<<default account>>".equals(c.name)) {
            googleSignInAccount = j.a(B()).a();
        }
        return new ResolveAccountRequest(c, this.g.intValue(), googleSignInAccount);
    }

    protected e a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.signin.service.START";
    }

    public void a(ac acVar, boolean z) {
        try {
            ((e) G()).a(acVar, this.g.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public void a(d dVar) {
        d.a(dVar, "Expecting a valid ISignInCallbacks");
        try {
            ((e) G()).a(new SignInRequest(i()), dVar);
        } catch (Throwable e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.a(new SignInResponse(8));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected Bundle c() {
        if (!B().getPackageName().equals(this.e.h())) {
            this.f.putString("com.google.android.gms.signin.internal.realClientPackageName", this.e.h());
        }
        return this.f;
    }

    public void h() {
        a(new i(this));
    }

    public void t_() {
        try {
            ((e) G()).a(this.g.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public boolean v() {
        return this.a;
    }
}
