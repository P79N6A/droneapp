package com.google.android.gms.games.a;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

public final class d extends j implements a {
    private final int c;
    private final Game d;

    d(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.c = i2;
        this.d = new GameRef(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return i();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        a(User.FN_NAME, charArrayBuffer);
    }

    public String c() {
        return e("external_leaderboard_id");
    }

    public String d() {
        return e(User.FN_NAME);
    }

    public Uri e() {
        return h("board_icon_image_uri");
    }

    public boolean equals(Object obj) {
        return c.a(this, obj);
    }

    public int f() {
        return c("score_order");
    }

    public ArrayList<j> g() {
        ArrayList<j> arrayList = new ArrayList(this.c);
        for (int i = 0; i < this.c; i++) {
            arrayList.add(new l(this.c_, this.d_ + i));
        }
        return arrayList;
    }

    public String getIconImageUrl() {
        return e("board_icon_image_url");
    }

    public Game h() {
        return this.d;
    }

    public int hashCode() {
        return c.a((a) this);
    }

    public a i() {
        return new c(this);
    }

    public String toString() {
        return c.b(this);
    }
}
