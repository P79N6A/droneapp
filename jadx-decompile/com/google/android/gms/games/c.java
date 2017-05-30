package com.google.android.gms.games;

import android.content.Intent;
import android.support.annotation.RequiresPermission;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.f;
import com.google.android.gms.games.a.m;
import com.google.android.gms.games.appcontent.i;
import com.google.android.gms.games.internal.a.b;
import com.google.android.gms.games.internal.a.h;
import com.google.android.gms.games.internal.a.j;
import com.google.android.gms.games.internal.a.k;
import com.google.android.gms.games.internal.a.l;
import com.google.android.gms.games.internal.a.n;
import com.google.android.gms.games.internal.a.o;
import com.google.android.gms.games.internal.a.p;
import com.google.android.gms.games.internal.a.q;
import com.google.android.gms.games.internal.d;

public final class c {
    public static final String a = "players";
    public static final String b = "status";
    static final g<d> c = new g();
    public static final Scope d = new Scope(f.f);
    public static final a<c> e = new a("Games.API", y, c);
    public static final Scope f = new Scope("https://www.googleapis.com/auth/games.firstparty");
    public static final a<c> g = new a("Games.API_1P", z, c);
    public static final e h = new com.google.android.gms.games.internal.a.d();
    public static final com.google.android.gms.games.achievement.c i = new com.google.android.gms.games.internal.a.a();
    public static final i j = new b();
    public static final com.google.android.gms.games.event.c k = new com.google.android.gms.games.internal.a.c();
    public static final m l = new com.google.android.gms.games.internal.a.f();
    public static final com.google.android.gms.games.multiplayer.c m = new com.google.android.gms.games.internal.a.e();
    public static final com.google.android.gms.games.multiplayer.turnbased.g n = new p();
    public static final com.google.android.gms.games.multiplayer.realtime.b o = new k();
    public static final com.google.android.gms.games.multiplayer.d p = new com.google.android.gms.games.internal.a.g();
    public static final n q = new com.google.android.gms.games.internal.a.i();
    public static final g r = new h();
    public static final com.google.android.gms.games.quest.f s = new j();
    public static final com.google.android.gms.games.request.g t = new l();
    public static final com.google.android.gms.games.snapshot.g u = new com.google.android.gms.games.internal.a.m();
    public static final com.google.android.gms.games.stats.c v = new o();
    public static final com.google.android.gms.games.video.f w = new q();
    public static final com.google.android.gms.games.social.b x = new n();
    private static final a.b<d, c> y = new 1();
    private static final a.b<d, c> z = new 2();

    @Deprecated
    public interface e extends com.google.android.gms.common.api.m {
        String b();
    }

    private c() {
    }

    @Deprecated
    public static com.google.android.gms.common.api.i<e> a(com.google.android.gms.common.api.g gVar, String str) {
        com.google.android.gms.common.internal.d.a(str, (Object) "Please provide a valid serverClientId");
        return gVar.b(new 4(gVar, str));
    }

    public static d a(com.google.android.gms.common.api.g gVar) {
        return a(gVar, true);
    }

    public static d a(com.google.android.gms.common.api.g gVar, boolean z) {
        com.google.android.gms.common.internal.d.b(gVar != null, "GoogleApiClient parameter is required.");
        com.google.android.gms.common.internal.d.a(gVar.j(), (Object) "GoogleApiClient must be connected.");
        return b(gVar, z);
    }

    public static void a(com.google.android.gms.common.api.g gVar, int i) {
        d a = a(gVar, false);
        if (a != null) {
            a.c(i);
        }
    }

    public static void a(com.google.android.gms.common.api.g gVar, View view) {
        com.google.android.gms.common.internal.d.a((Object) view);
        d a = a(gVar, false);
        if (a != null) {
            a.a(view);
        }
    }

    public static d b(com.google.android.gms.common.api.g gVar, boolean z) {
        com.google.android.gms.common.internal.d.a(gVar.a(e), (Object) "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean b = gVar.b(e);
        if (!z || b) {
            return b ? (d) gVar.a(c) : null;
        } else {
            throw new IllegalStateException("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
        }
    }

    @RequiresPermission("android.permission.GET_ACCOUNTS")
    public static String b(com.google.android.gms.common.api.g gVar) {
        return a(gVar).h();
    }

    public static String c(com.google.android.gms.common.api.g gVar) {
        return a(gVar).M();
    }

    public static Intent d(com.google.android.gms.common.api.g gVar) {
        return a(gVar).K();
    }

    public static com.google.android.gms.common.api.i<Status> e(com.google.android.gms.common.api.g gVar) {
        return gVar.b(new 5(gVar));
    }

    public static int f(com.google.android.gms.common.api.g gVar) {
        return a(gVar).L();
    }
}
