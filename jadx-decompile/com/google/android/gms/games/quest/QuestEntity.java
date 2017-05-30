package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.g;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;
import java.util.List;

public final class QuestEntity extends AbstractSafeParcelable implements Quest {
    public static final Creator<QuestEntity> CREATOR = new d();
    private final int h;
    private final GameEntity i;
    private final String j;
    private final long k;
    private final Uri l;
    private final String m;
    private final String n;
    private final long o;
    private final long p;
    private final Uri q;
    private final String r;
    private final String s;
    private final long t;
    private final long u;
    private final int v;
    private final int w;
    private final ArrayList<MilestoneEntity> x;

    QuestEntity(int i, GameEntity gameEntity, String str, long j, Uri uri, String str2, String str3, long j2, long j3, Uri uri2, String str4, String str5, long j4, long j5, int i2, int i3, ArrayList<MilestoneEntity> arrayList) {
        this.h = i;
        this.i = gameEntity;
        this.j = str;
        this.k = j;
        this.l = uri;
        this.m = str2;
        this.n = str3;
        this.o = j2;
        this.p = j3;
        this.q = uri2;
        this.r = str4;
        this.s = str5;
        this.t = j4;
        this.u = j5;
        this.v = i2;
        this.w = i3;
        this.x = arrayList;
    }

    public QuestEntity(Quest quest) {
        this.h = 2;
        this.i = new GameEntity(quest.j());
        this.j = quest.c();
        this.k = quest.m();
        this.n = quest.e();
        this.l = quest.f();
        this.m = quest.getBannerImageUrl();
        this.o = quest.n();
        this.q = quest.g();
        this.r = quest.getIconImageUrl();
        this.p = quest.o();
        this.s = quest.d();
        this.t = quest.p();
        this.u = quest.q();
        this.v = quest.k();
        this.w = quest.l();
        List i = quest.i();
        int size = i.size();
        this.x = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.x.add((MilestoneEntity) ((Milestone) i.get(i2)).a());
        }
    }

    static int a(Quest quest) {
        return c.a(new Object[]{quest.j(), quest.c(), Long.valueOf(quest.m()), quest.f(), quest.e(), Long.valueOf(quest.n()), quest.g(), Long.valueOf(quest.o()), quest.i(), quest.d(), Long.valueOf(quest.p()), Long.valueOf(quest.q()), Integer.valueOf(quest.k())});
    }

    static boolean a(Quest quest, Object obj) {
        if (!(obj instanceof Quest)) {
            return false;
        }
        if (quest == obj) {
            return true;
        }
        Quest quest2 = (Quest) obj;
        return c.a(quest2.j(), quest.j()) && c.a(quest2.c(), quest.c()) && c.a(Long.valueOf(quest2.m()), Long.valueOf(quest.m())) && c.a(quest2.f(), quest.f()) && c.a(quest2.e(), quest.e()) && c.a(Long.valueOf(quest2.n()), Long.valueOf(quest.n())) && c.a(quest2.g(), quest.g()) && c.a(Long.valueOf(quest2.o()), Long.valueOf(quest.o())) && c.a(quest2.i(), quest.i()) && c.a(quest2.d(), quest.d()) && c.a(Long.valueOf(quest2.p()), Long.valueOf(quest.p())) && c.a(Long.valueOf(quest2.q()), Long.valueOf(quest.q())) && c.a(Integer.valueOf(quest2.k()), Integer.valueOf(quest.k()));
    }

    static String b(Quest quest) {
        return c.a(quest).a("Game", quest.j()).a("QuestId", quest.c()).a("AcceptedTimestamp", Long.valueOf(quest.m())).a("BannerImageUri", quest.f()).a("BannerImageUrl", quest.getBannerImageUrl()).a("Description", quest.e()).a("EndTimestamp", Long.valueOf(quest.n())).a("IconImageUri", quest.g()).a("IconImageUrl", quest.getIconImageUrl()).a("LastUpdatedTimestamp", Long.valueOf(quest.o())).a("Milestones", quest.i()).a("Name", quest.d()).a("NotifyTimestamp", Long.valueOf(quest.p())).a("StartTimestamp", Long.valueOf(quest.q())).a("State", Integer.valueOf(quest.k())).toString();
    }

    public /* synthetic */ Object a() {
        return t();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        g.a(this.s, charArrayBuffer);
    }

    public void b(CharArrayBuffer charArrayBuffer) {
        g.a(this.n, charArrayBuffer);
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.j;
    }

    public String d() {
        return this.s;
    }

    public String e() {
        return this.n;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public Uri f() {
        return this.l;
    }

    public Uri g() {
        return this.q;
    }

    public String getBannerImageUrl() {
        return this.m;
    }

    public String getIconImageUrl() {
        return this.r;
    }

    public Milestone h() {
        return (Milestone) i().get(0);
    }

    public int hashCode() {
        return a((Quest) this);
    }

    public List<Milestone> i() {
        return new ArrayList(this.x);
    }

    public Game j() {
        return this.i;
    }

    public int k() {
        return this.v;
    }

    public int l() {
        return this.w;
    }

    public long m() {
        return this.k;
    }

    public long n() {
        return this.o;
    }

    public long o() {
        return this.p;
    }

    public long p() {
        return this.t;
    }

    public long q() {
        return this.u;
    }

    public boolean r() {
        return this.t <= System.currentTimeMillis() + 1800000;
    }

    public int s() {
        return this.h;
    }

    public Quest t() {
        return this;
    }

    public String toString() {
        return b((Quest) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
