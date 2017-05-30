package com.google.firebase.auth;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.g.a;
import com.google.android.gms.g.f;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.b;
import java.util.List;

public abstract class n implements w {
    private FirebaseAuth h() {
        return FirebaseAuth.getInstance(g());
    }

    @NonNull
    public f<Void> a(@NonNull UserProfileChangeRequest userProfileChangeRequest) {
        d.a(userProfileChangeRequest);
        return h().a(this, userProfileChangeRequest);
    }

    public f<Void> a(@NonNull a aVar) {
        d.a(aVar);
        return h().a(this, aVar);
    }

    @NonNull
    public abstract n a(@NonNull List<? extends w> list);

    @NonNull
    public abstract String a();

    public abstract void a(@NonNull GetTokenResponse getTokenResponse);

    @NonNull
    public f<b> b(@NonNull a aVar) {
        d.a(aVar);
        return h().b(this, aVar);
    }

    public f<b> b(@NonNull String str) {
        d.a(str);
        return h().a(this, str);
    }

    public abstract n b(boolean z);

    @NonNull
    public abstract String b();

    @NonNull
    public f<Void> c(@NonNull String str) {
        d.a(str);
        return h().b(this, str);
    }

    @NonNull
    public f<o> c(boolean z) {
        return h().a(this, z);
    }

    @Nullable
    public abstract String c();

    @Nullable
    public abstract Uri d();

    @NonNull
    public f<Void> d(@NonNull String str) {
        d.a(str);
        return h().c(this, str);
    }

    @Nullable
    public abstract String e();

    @NonNull
    public abstract b g();

    public abstract boolean i();

    @Nullable
    public abstract List<String> j();

    @NonNull
    public abstract List<? extends w> k();

    @NonNull
    public abstract GetTokenResponse l();

    @NonNull
    public abstract String m();

    @NonNull
    public abstract String n();

    @NonNull
    public f<Void> o() {
        return h().b(this);
    }

    @NonNull
    public f<Void> p() {
        return h().c(this);
    }

    @NonNull
    public f<Void> q() {
        return h().a(this, false).b(new a<o, f<Void>>(this) {
            final /* synthetic */ n a;

            {
                this.a = r1;
            }

            public /* synthetic */ Object a(@NonNull f fVar) {
                return b(fVar);
            }

            public f<Void> b(@NonNull f<o> fVar) {
                return this.a.h().d(((o) fVar.c()).a());
            }
        });
    }
}
