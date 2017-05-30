package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.n$b;

public class ProfileSettingsEntity extends AbstractSafeParcelable implements n$b {
    public static final c CREATOR = new c();
    private final int a;
    private final Status b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final StockProfileImageEntity g;
    private final boolean h;
    private final boolean i;

    ProfileSettingsEntity(int i, Status status, String str, boolean z, boolean z2, boolean z3, StockProfileImageEntity stockProfileImageEntity, boolean z4, boolean z5) {
        this.a = i;
        this.b = status;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = stockProfileImageEntity;
        this.h = z4;
        this.i = z5;
    }

    public ProfileSettingsEntity(DataHolder dataHolder) {
        this.a = 3;
        this.b = new Status(dataHolder.e());
        if (!this.b.f() || dataHolder.g() <= 0) {
            this.c = null;
            this.d = false;
            this.e = false;
            this.f = false;
            this.g = null;
            this.h = false;
            this.i = false;
            return;
        }
        int a = dataHolder.a(0);
        this.c = dataHolder.c("gamer_tag", 0, a);
        this.d = dataHolder.d("gamer_tag_explicitly_set", 0, a);
        this.e = dataHolder.d("profile_visible", 0, a);
        this.f = dataHolder.d("profile_visibility_explicitly_set", 0, a);
        Object c = dataHolder.c("stock_avatar_url", 0, a);
        Object c2 = dataHolder.c("stock_avatar_uri", 0, a);
        if (TextUtils.isEmpty(c) || TextUtils.isEmpty(c2)) {
            this.g = null;
        } else {
            this.g = new StockProfileImageEntity(c, Uri.parse(c2));
        }
        this.h = dataHolder.d("profile_discoverable", 0, a);
        this.i = dataHolder.d("auto_sign_in", 0, a);
    }

    public Status a() {
        return this.b;
    }

    public boolean b() {
        return this.e;
    }

    public boolean c() {
        return this.f;
    }

    public String d() {
        return this.c;
    }

    public StockProfileImage e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n$b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        n$b com_google_android_gms_games_n_b = (n$b) obj;
        return c.a(this.c, com_google_android_gms_games_n_b.d()) && c.a(Boolean.valueOf(this.d), Boolean.valueOf(com_google_android_gms_games_n_b.f())) && c.a(Boolean.valueOf(this.e), Boolean.valueOf(com_google_android_gms_games_n_b.b())) && c.a(Boolean.valueOf(this.f), Boolean.valueOf(com_google_android_gms_games_n_b.c())) && c.a(this.b, com_google_android_gms_games_n_b.a()) && c.a(this.g, com_google_android_gms_games_n_b.e()) && c.a(Boolean.valueOf(this.h), Boolean.valueOf(com_google_android_gms_games_n_b.g())) && c.a(Boolean.valueOf(this.i), Boolean.valueOf(com_google_android_gms_games_n_b.h()));
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.h;
    }

    public boolean h() {
        return this.i;
    }

    public int hashCode() {
        return c.a(new Object[]{this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), this.b, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i)});
    }

    public int i() {
        return this.a;
    }

    public String toString() {
        return c.a(this).a("GamerTag", this.c).a("IsGamerTagExplicitlySet", Boolean.valueOf(this.d)).a("IsProfileVisible", Boolean.valueOf(this.e)).a("IsVisibilityExplicitlySet", Boolean.valueOf(this.f)).a("Status", this.b).a("StockProfileImage", this.g).a("IsProfileDiscoverable", Boolean.valueOf(this.h)).a("AutoSignIn", Boolean.valueOf(this.i)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
