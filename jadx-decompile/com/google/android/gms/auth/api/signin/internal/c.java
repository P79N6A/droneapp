package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;

public class c extends w<g> {
    private final GoogleSignInOptions a;

    public c(Context context, Looper looper, s sVar, GoogleSignInOptions googleSignInOptions, b bVar, com.google.android.gms.common.api.g.c cVar) {
        super(context, looper, 91, sVar, bVar, cVar);
        if (googleSignInOptions == null) {
            googleSignInOptions = new a().d();
        }
        if (!sVar.f().isEmpty()) {
            a aVar = new a(googleSignInOptions);
            for (Scope a : sVar.f()) {
                aVar.a(a, new Scope[0]);
            }
            googleSignInOptions = aVar.d();
        }
        this.a = googleSignInOptions;
    }

    protected g a(IBinder iBinder) {
        return g.a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public Intent e() {
        Parcelable signInConfiguration = new SignInConfiguration(B().getPackageName(), this.a);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setClass(B(), SignInHubActivity.class);
        intent.putExtra("config", signInConfiguration);
        return intent;
    }

    public boolean h_() {
        return true;
    }

    public GoogleSignInOptions i_() {
        return this.a;
    }
}
