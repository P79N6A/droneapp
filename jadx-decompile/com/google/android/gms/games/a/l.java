package com.google.android.gms.games.a;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;

public final class l extends j implements j {
    l(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return o();
    }

    public int c() {
        return c("timespan");
    }

    public int d() {
        return c("collection");
    }

    public boolean e() {
        return !i("player_raw_score");
    }

    public boolean equals(Object obj) {
        return k.a(this, obj);
    }

    public long f() {
        return i("player_raw_score") ? -1 : b("player_raw_score");
    }

    public String g() {
        return e("player_display_score");
    }

    public long h() {
        return i("player_rank") ? -1 : b("player_rank");
    }

    public int hashCode() {
        return k.a(this);
    }

    public String i() {
        return e("player_display_rank");
    }

    public String j() {
        return e("player_score_tag");
    }

    public long k() {
        return i("total_scores") ? -1 : b("total_scores");
    }

    public String l() {
        return e("top_page_token_next");
    }

    public String m() {
        return e("window_page_token_prev");
    }

    public String n() {
        return e("window_page_token_next");
    }

    public j o() {
        return new k(this);
    }

    public String toString() {
        return k.b(this);
    }
}
