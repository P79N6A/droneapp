package com.google.android.gms.games.a;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.util.g;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public final class c implements a {
    private final String c;
    private final String d;
    private final Uri e;
    private final int f;
    private final ArrayList<k> g;
    private final Game h;
    private final String i;

    public c(a aVar) {
        this.c = aVar.c();
        this.d = aVar.d();
        this.e = aVar.e();
        this.i = aVar.getIconImageUrl();
        this.f = aVar.f();
        Game h = aVar.h();
        this.h = h == null ? null : new GameEntity(h);
        ArrayList g = aVar.g();
        int size = g.size();
        this.g = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.g.add((k) ((j) g.get(i)).a());
        }
    }

    static int a(a aVar) {
        return com.google.android.gms.common.internal.c.a(new Object[]{aVar.c(), aVar.d(), aVar.e(), Integer.valueOf(aVar.f()), aVar.g()});
    }

    static boolean a(a aVar, Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        a aVar2 = (a) obj;
        return com.google.android.gms.common.internal.c.a(aVar2.c(), aVar.c()) && com.google.android.gms.common.internal.c.a(aVar2.d(), aVar.d()) && com.google.android.gms.common.internal.c.a(aVar2.e(), aVar.e()) && com.google.android.gms.common.internal.c.a(Integer.valueOf(aVar2.f()), Integer.valueOf(aVar.f())) && com.google.android.gms.common.internal.c.a(aVar2.g(), aVar.g());
    }

    static String b(a aVar) {
        return com.google.android.gms.common.internal.c.a(aVar).a("LeaderboardId", aVar.c()).a("DisplayName", aVar.d()).a("IconImageUri", aVar.e()).a("IconImageUrl", aVar.getIconImageUrl()).a("ScoreOrder", Integer.valueOf(aVar.f())).a("Variants", aVar.g()).toString();
    }

    public /* synthetic */ Object a() {
        return i();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        g.a(this.d, charArrayBuffer);
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public Uri e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public int f() {
        return this.f;
    }

    public ArrayList<j> g() {
        return new ArrayList(this.g);
    }

    public String getIconImageUrl() {
        return this.i;
    }

    public Game h() {
        return this.h;
    }

    public int hashCode() {
        return a((a) this);
    }

    public a i() {
        return this;
    }

    public String toString() {
        return b(this);
    }
}
