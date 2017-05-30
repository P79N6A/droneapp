package com.google.android.gms.games.a;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.g;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public final class h implements e {
    private final long b;
    private final String c;
    private final String d;
    private final long e;
    private final long f;
    private final String g;
    private final Uri h;
    private final Uri i;
    private final PlayerEntity j;
    private final String k;
    private final String l;
    private final String m;

    public h(e eVar) {
        this.b = eVar.c();
        this.c = (String) d.a(eVar.d());
        this.d = (String) d.a(eVar.e());
        this.e = eVar.f();
        this.f = eVar.g();
        this.g = eVar.h();
        this.h = eVar.i();
        this.i = eVar.j();
        Player k = eVar.k();
        this.j = k == null ? null : (PlayerEntity) k.a();
        this.k = eVar.l();
        this.l = eVar.getScoreHolderIconImageUrl();
        this.m = eVar.getScoreHolderHiResImageUrl();
    }

    static int a(e eVar) {
        return c.a(new Object[]{Long.valueOf(eVar.c()), eVar.d(), Long.valueOf(eVar.f()), eVar.e(), Long.valueOf(eVar.g()), eVar.h(), eVar.i(), eVar.j(), eVar.k()});
    }

    static boolean a(e eVar, Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (eVar == obj) {
            return true;
        }
        e eVar2 = (e) obj;
        return c.a(Long.valueOf(eVar2.c()), Long.valueOf(eVar.c())) && c.a(eVar2.d(), eVar.d()) && c.a(Long.valueOf(eVar2.f()), Long.valueOf(eVar.f())) && c.a(eVar2.e(), eVar.e()) && c.a(Long.valueOf(eVar2.g()), Long.valueOf(eVar.g())) && c.a(eVar2.h(), eVar.h()) && c.a(eVar2.i(), eVar.i()) && c.a(eVar2.j(), eVar.j()) && c.a(eVar2.k(), eVar.k()) && c.a(eVar2.l(), eVar.l());
    }

    static String b(e eVar) {
        return c.a(eVar).a("Rank", Long.valueOf(eVar.c())).a("DisplayRank", eVar.d()).a("Score", Long.valueOf(eVar.f())).a("DisplayScore", eVar.e()).a("Timestamp", Long.valueOf(eVar.g())).a("DisplayName", eVar.h()).a("IconImageUri", eVar.i()).a("IconImageUrl", eVar.getScoreHolderIconImageUrl()).a("HiResImageUri", eVar.j()).a("HiResImageUrl", eVar.getScoreHolderHiResImageUrl()).a("Player", eVar.k() == null ? null : eVar.k()).a("ScoreTag", eVar.l()).toString();
    }

    public /* synthetic */ Object a() {
        return m();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        g.a(this.c, charArrayBuffer);
    }

    public void b(CharArrayBuffer charArrayBuffer) {
        g.a(this.d, charArrayBuffer);
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return this.b;
    }

    public void c(CharArrayBuffer charArrayBuffer) {
        if (this.j == null) {
            g.a(this.g, charArrayBuffer);
        } else {
            this.j.a(charArrayBuffer);
        }
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public long f() {
        return this.e;
    }

    public long g() {
        return this.f;
    }

    public String getScoreHolderHiResImageUrl() {
        return this.j == null ? this.m : this.j.getHiResImageUrl();
    }

    public String getScoreHolderIconImageUrl() {
        return this.j == null ? this.l : this.j.getIconImageUrl();
    }

    public String h() {
        return this.j == null ? this.g : this.j.d();
    }

    public int hashCode() {
        return a((e) this);
    }

    public Uri i() {
        return this.j == null ? this.h : this.j.i();
    }

    public Uri j() {
        return this.j == null ? this.i : this.j.k();
    }

    public Player k() {
        return this.j;
    }

    public String l() {
        return this.k;
    }

    public e m() {
        return this;
    }

    public String toString() {
        return b((e) this);
    }
}
