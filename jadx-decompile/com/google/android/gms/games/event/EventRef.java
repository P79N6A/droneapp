package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class EventRef extends j implements Event {
    EventRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return k();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        a(User.FN_NAME, charArrayBuffer);
    }

    public void b(CharArrayBuffer charArrayBuffer) {
        a("description", charArrayBuffer);
    }

    public String c() {
        return e("external_event_id");
    }

    public void c(CharArrayBuffer charArrayBuffer) {
        a("formatted_value", charArrayBuffer);
    }

    public String d() {
        return e(User.FN_NAME);
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return e("description");
    }

    public boolean equals(Object obj) {
        return EventEntity.a(this, obj);
    }

    public Uri f() {
        return h("icon_image_uri");
    }

    public Player g() {
        return new PlayerRef(this.c_, this.d_);
    }

    public String getIconImageUrl() {
        return e("icon_image_url");
    }

    public long h() {
        return b("value");
    }

    public int hashCode() {
        return EventEntity.a((Event) this);
    }

    public String i() {
        return e("formatted_value");
    }

    public boolean j() {
        return d("visibility");
    }

    public Event k() {
        return new EventEntity(this);
    }

    public String toString() {
        return EventEntity.b((Event) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((EventEntity) ((Event) a())).writeToParcel(parcel, i);
    }
}
