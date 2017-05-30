package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.g;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public final class EventEntity extends AbstractSafeParcelable implements Event {
    public static final b CREATOR = new b();
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final Uri e;
    private final String f;
    private final PlayerEntity g;
    private final long h;
    private final String i;
    private final boolean j;

    EventEntity(int i, String str, String str2, String str3, Uri uri, String str4, Player player, long j, String str5, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = uri;
        this.f = str4;
        this.g = new PlayerEntity(player);
        this.h = j;
        this.i = str5;
        this.j = z;
    }

    public EventEntity(Event event) {
        this.a = 1;
        this.b = event.c();
        this.c = event.d();
        this.d = event.e();
        this.e = event.f();
        this.f = event.getIconImageUrl();
        this.g = (PlayerEntity) event.g().a();
        this.h = event.h();
        this.i = event.i();
        this.j = event.j();
    }

    static int a(Event event) {
        return c.a(new Object[]{event.c(), event.d(), event.e(), event.f(), event.getIconImageUrl(), event.g(), Long.valueOf(event.h()), event.i(), Boolean.valueOf(event.j())});
    }

    static boolean a(Event event, Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        if (event == obj) {
            return true;
        }
        Event event2 = (Event) obj;
        return c.a(event2.c(), event.c()) && c.a(event2.d(), event.d()) && c.a(event2.e(), event.e()) && c.a(event2.f(), event.f()) && c.a(event2.getIconImageUrl(), event.getIconImageUrl()) && c.a(event2.g(), event.g()) && c.a(Long.valueOf(event2.h()), Long.valueOf(event.h())) && c.a(event2.i(), event.i()) && c.a(Boolean.valueOf(event2.j()), Boolean.valueOf(event.j()));
    }

    static String b(Event event) {
        return c.a(event).a("Id", event.c()).a("Name", event.d()).a("Description", event.e()).a("IconImageUri", event.f()).a("IconImageUrl", event.getIconImageUrl()).a("Player", event.g()).a("Value", Long.valueOf(event.h())).a("FormattedValue", event.i()).a("isVisible", Boolean.valueOf(event.j())).toString();
    }

    public /* synthetic */ Object a() {
        return l();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        g.a(this.c, charArrayBuffer);
    }

    public void b(CharArrayBuffer charArrayBuffer) {
        g.a(this.d, charArrayBuffer);
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.b;
    }

    public void c(CharArrayBuffer charArrayBuffer) {
        g.a(this.i, charArrayBuffer);
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public Uri f() {
        return this.e;
    }

    public Player g() {
        return this.g;
    }

    public String getIconImageUrl() {
        return this.f;
    }

    public long h() {
        return this.h;
    }

    public int hashCode() {
        return a((Event) this);
    }

    public String i() {
        return this.i;
    }

    public boolean j() {
        return this.j;
    }

    public int k() {
        return this.a;
    }

    public Event l() {
        return this;
    }

    public String toString() {
        return b((Event) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
