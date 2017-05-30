package com.google.android.gms.games.a;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class i extends j implements e {
    private final PlayerRef c;

    i(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.c = new PlayerRef(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return m();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        a("display_rank", charArrayBuffer);
    }

    public void b(CharArrayBuffer charArrayBuffer) {
        a("display_score", charArrayBuffer);
    }

    public long c() {
        return b("rank");
    }

    public void c(CharArrayBuffer charArrayBuffer) {
        if (i("external_player_id")) {
            a("default_display_name", charArrayBuffer);
        } else {
            this.c.a(charArrayBuffer);
        }
    }

    public String d() {
        return e("display_rank");
    }

    public String e() {
        return e("display_score");
    }

    public boolean equals(Object obj) {
        return h.a(this, obj);
    }

    public long f() {
        return b("raw_score");
    }

    public long g() {
        return b("achieved_timestamp");
    }

    public String getScoreHolderHiResImageUrl() {
        return i("external_player_id") ? null : this.c.getHiResImageUrl();
    }

    public String getScoreHolderIconImageUrl() {
        return i("external_player_id") ? e("default_display_image_url") : this.c.getIconImageUrl();
    }

    public String h() {
        return i("external_player_id") ? e("default_display_name") : this.c.d();
    }

    public int hashCode() {
        return h.a((e) this);
    }

    public Uri i() {
        return i("external_player_id") ? h("default_display_image_uri") : this.c.i();
    }

    public Uri j() {
        return i("external_player_id") ? null : this.c.k();
    }

    public Player k() {
        return i("external_player_id") ? null : this.c;
    }

    public String l() {
        return e("score_tag");
    }

    public e m() {
        return new h(this);
    }

    public String toString() {
        return h.b((e) this);
    }
}
