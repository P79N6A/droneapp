package com.google.firebase.appindexing.a;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import com.google.firebase.appindexing.g;
import com.google.firebase.appindexing.g.a;

public final class f {
    private f() {
    }

    public static b a() {
        return new b();
    }

    public static g a(@NonNull String str, @NonNull String str2) {
        d.a(str);
        d.a(str2);
        return ((a) ((a) new a().setUrl(str2)).setName(str)).build();
    }

    public static c b() {
        return new c();
    }

    public static c c() {
        return new c("TextDigitalDocument");
    }

    public static c d() {
        return new c("PresentationDigitalDocument");
    }

    public static c e() {
        return new c("SpreadsheetDigitalDocument");
    }

    public static c f() {
        return new c("NoteDigitalDocument");
    }

    public static g g() {
        return new g();
    }

    public static g h() {
        return new g("EmailMessage");
    }

    public static h i() {
        return new h();
    }

    public static i j() {
        return new i();
    }

    public static j k() {
        return new j();
    }

    public static k l() {
        return new k();
    }

    public static d m() {
        return new d();
    }

    public static l n() {
        return new l();
    }
}
