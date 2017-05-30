package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.xiaomi.market.sdk.l;

public final class GameRef extends j implements Game {
    public GameRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return x();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        a("display_name", charArrayBuffer);
    }

    public void b(CharArrayBuffer charArrayBuffer) {
        a("game_description", charArrayBuffer);
    }

    public String c() {
        return e("external_game_id");
    }

    public void c(CharArrayBuffer charArrayBuffer) {
        a("developer_name", charArrayBuffer);
    }

    public String d() {
        return e("display_name");
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return e("primary_category");
    }

    public boolean equals(Object obj) {
        return GameEntity.a(this, obj);
    }

    public String f() {
        return e("secondary_category");
    }

    public String g() {
        return e("game_description");
    }

    public String getFeaturedImageUrl() {
        return e("featured_image_url");
    }

    public String getHiResImageUrl() {
        return e("game_hi_res_image_url");
    }

    public String getIconImageUrl() {
        return e("game_icon_image_url");
    }

    public String h() {
        return e("developer_name");
    }

    public int hashCode() {
        return GameEntity.a((Game) this);
    }

    public Uri i() {
        return h("game_icon_image_uri");
    }

    public Uri j() {
        return h("game_hi_res_image_uri");
    }

    public Uri k() {
        return h("featured_image_uri");
    }

    public boolean l() {
        return d("play_enabled_game");
    }

    public boolean m() {
        return d("muted");
    }

    public boolean n() {
        return d("identity_sharing_confirmed");
    }

    public boolean o() {
        return c("installed") > 0;
    }

    public String p() {
        return e(l.PACKAGE_NAME);
    }

    public int q() {
        return c("achievement_total_count");
    }

    public int r() {
        return c("leaderboard_count");
    }

    public boolean s() {
        return c("real_time_support") > 0;
    }

    public boolean t() {
        return c("turn_based_support") > 0;
    }

    public String toString() {
        return GameEntity.b((Game) this);
    }

    public boolean u() {
        return c("snapshots_enabled") > 0;
    }

    public String v() {
        return e("theme_color");
    }

    public boolean w() {
        return c("gamepad_support") > 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((GameEntity) ((Game) a())).writeToParcel(parcel, i);
    }

    public Game x() {
        return new GameEntity(this);
    }
}
