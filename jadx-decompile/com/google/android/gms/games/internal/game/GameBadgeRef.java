package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;

public final class GameBadgeRef extends j implements GameBadge {
    public GameBadgeRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return g();
    }

    public int c() {
        return c("badge_type");
    }

    public String d() {
        return e("badge_title");
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return e("badge_description");
    }

    public boolean equals(Object obj) {
        return GameBadgeEntity.a(this, obj);
    }

    public Uri f() {
        return h("badge_icon_image_uri");
    }

    public GameBadge g() {
        return new GameBadgeEntity(this);
    }

    public int hashCode() {
        return GameBadgeEntity.a((GameBadge) this);
    }

    public String toString() {
        return GameBadgeEntity.b((GameBadge) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((GameBadgeEntity) ((GameBadge) a())).writeToParcel(parcel, i);
    }
}
