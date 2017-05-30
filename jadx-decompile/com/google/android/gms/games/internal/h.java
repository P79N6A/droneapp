package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.ab;
import com.google.android.gms.internal.aiz;

public final class h {
    private static final ab a = new ab("Games");
    private static final aiz<Boolean> b = aiz.a("games.play_games_dogfood", false);

    private h() {
    }

    public static void a(String str, String str2) {
        a.b(str, str2);
    }

    public static void a(String str, String str2, Throwable th) {
        a.a(str, str2, th);
    }

    public static void b(String str, String str2) {
        a.c(str, str2);
    }

    public static void b(String str, String str2, Throwable th) {
        a.b(str, str2, th);
    }
}
