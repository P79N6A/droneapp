package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;

public final class MostRecentGameInfoRef extends j implements MostRecentGameInfo {
    private final b c;

    public MostRecentGameInfoRef(DataHolder dataHolder, int i, b bVar) {
        super(dataHolder, i);
        this.c = bVar;
    }

    public /* synthetic */ Object a() {
        return i();
    }

    public String c() {
        return e(this.c.t);
    }

    public String d() {
        return e(this.c.u);
    }

    public int describeContents() {
        return 0;
    }

    public long e() {
        return b(this.c.v);
    }

    public boolean equals(Object obj) {
        return MostRecentGameInfoEntity.a(this, obj);
    }

    public Uri f() {
        return h(this.c.w);
    }

    public Uri g() {
        return h(this.c.x);
    }

    public Uri h() {
        return h(this.c.y);
    }

    public int hashCode() {
        return MostRecentGameInfoEntity.a(this);
    }

    public MostRecentGameInfo i() {
        return new MostRecentGameInfoEntity(this);
    }

    public String toString() {
        return MostRecentGameInfoEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((MostRecentGameInfoEntity) ((MostRecentGameInfo) a())).writeToParcel(parcel, i);
    }
}
