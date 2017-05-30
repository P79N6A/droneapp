package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.g;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.d;
import java.util.ArrayList;

public final class TurnBasedMatchEntity extends AbstractSafeParcelable implements TurnBasedMatch {
    public static final Creator<TurnBasedMatchEntity> CREATOR = new f();
    private final Bundle A;
    private final int B;
    private final boolean C;
    private final String D;
    private final String E;
    private final int k;
    private final GameEntity l;
    private final String m;
    private final String n;
    private final long o;
    private final String p;
    private final long q;
    private final String r;
    private final int s;
    private final int t;
    private final int u;
    private final byte[] v;
    private final ArrayList<ParticipantEntity> w;
    private final String x;
    private final byte[] y;
    private final int z;

    TurnBasedMatchEntity(int i, GameEntity gameEntity, String str, String str2, long j, String str3, long j2, String str4, int i2, int i3, int i4, byte[] bArr, ArrayList<ParticipantEntity> arrayList, String str5, byte[] bArr2, int i5, Bundle bundle, int i6, boolean z, String str6, String str7) {
        this.k = i;
        this.l = gameEntity;
        this.m = str;
        this.n = str2;
        this.o = j;
        this.p = str3;
        this.q = j2;
        this.r = str4;
        this.s = i2;
        this.B = i6;
        this.t = i3;
        this.u = i4;
        this.v = bArr;
        this.w = arrayList;
        this.x = str5;
        this.y = bArr2;
        this.z = i5;
        this.A = bundle;
        this.C = z;
        this.D = str6;
        this.E = str7;
    }

    public TurnBasedMatchEntity(TurnBasedMatch turnBasedMatch) {
        this.k = 2;
        this.l = new GameEntity(turnBasedMatch.c());
        this.m = turnBasedMatch.d();
        this.n = turnBasedMatch.e();
        this.o = turnBasedMatch.f();
        this.p = turnBasedMatch.k();
        this.q = turnBasedMatch.l();
        this.r = turnBasedMatch.n();
        this.s = turnBasedMatch.g();
        this.B = turnBasedMatch.h();
        this.t = turnBasedMatch.j();
        this.u = turnBasedMatch.p();
        this.x = turnBasedMatch.r();
        this.z = turnBasedMatch.t();
        this.A = turnBasedMatch.u();
        this.C = turnBasedMatch.w();
        this.D = turnBasedMatch.i();
        this.E = turnBasedMatch.y();
        Object o = turnBasedMatch.o();
        if (o == null) {
            this.v = null;
        } else {
            this.v = new byte[o.length];
            System.arraycopy(o, 0, this.v, 0, o.length);
        }
        o = turnBasedMatch.s();
        if (o == null) {
            this.y = null;
        } else {
            this.y = new byte[o.length];
            System.arraycopy(o, 0, this.y, 0, o.length);
        }
        ArrayList m = turnBasedMatch.m();
        int size = m.size();
        this.w = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.w.add((ParticipantEntity) ((Participant) m.get(i)).a());
        }
    }

    static int a(TurnBasedMatch turnBasedMatch) {
        return c.a(new Object[]{turnBasedMatch.c(), turnBasedMatch.d(), turnBasedMatch.e(), Long.valueOf(turnBasedMatch.f()), turnBasedMatch.k(), Long.valueOf(turnBasedMatch.l()), turnBasedMatch.n(), Integer.valueOf(turnBasedMatch.g()), Integer.valueOf(turnBasedMatch.h()), turnBasedMatch.i(), Integer.valueOf(turnBasedMatch.j()), Integer.valueOf(turnBasedMatch.p()), turnBasedMatch.m(), turnBasedMatch.r(), Integer.valueOf(turnBasedMatch.t()), turnBasedMatch.u(), Integer.valueOf(turnBasedMatch.v()), Boolean.valueOf(turnBasedMatch.w())});
    }

    static int a(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList m = turnBasedMatch.m();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) m.get(i);
            if (participant.j().equals(str)) {
                return participant.c();
            }
        }
        String valueOf = String.valueOf(turnBasedMatch.d());
        throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(valueOf).length()).append("Participant ").append(str).append(" is not in match ").append(valueOf).toString());
    }

    static boolean a(TurnBasedMatch turnBasedMatch, Object obj) {
        if (!(obj instanceof TurnBasedMatch)) {
            return false;
        }
        if (turnBasedMatch == obj) {
            return true;
        }
        TurnBasedMatch turnBasedMatch2 = (TurnBasedMatch) obj;
        return c.a(turnBasedMatch2.c(), turnBasedMatch.c()) && c.a(turnBasedMatch2.d(), turnBasedMatch.d()) && c.a(turnBasedMatch2.e(), turnBasedMatch.e()) && c.a(Long.valueOf(turnBasedMatch2.f()), Long.valueOf(turnBasedMatch.f())) && c.a(turnBasedMatch2.k(), turnBasedMatch.k()) && c.a(Long.valueOf(turnBasedMatch2.l()), Long.valueOf(turnBasedMatch.l())) && c.a(turnBasedMatch2.n(), turnBasedMatch.n()) && c.a(Integer.valueOf(turnBasedMatch2.g()), Integer.valueOf(turnBasedMatch.g())) && c.a(Integer.valueOf(turnBasedMatch2.h()), Integer.valueOf(turnBasedMatch.h())) && c.a(turnBasedMatch2.i(), turnBasedMatch.i()) && c.a(Integer.valueOf(turnBasedMatch2.j()), Integer.valueOf(turnBasedMatch.j())) && c.a(Integer.valueOf(turnBasedMatch2.p()), Integer.valueOf(turnBasedMatch.p())) && c.a(turnBasedMatch2.m(), turnBasedMatch.m()) && c.a(turnBasedMatch2.r(), turnBasedMatch.r()) && c.a(Integer.valueOf(turnBasedMatch2.t()), Integer.valueOf(turnBasedMatch.t())) && c.a(turnBasedMatch2.u(), turnBasedMatch.u()) && c.a(Integer.valueOf(turnBasedMatch2.v()), Integer.valueOf(turnBasedMatch.v())) && c.a(Boolean.valueOf(turnBasedMatch2.w()), Boolean.valueOf(turnBasedMatch.w()));
    }

    static String b(TurnBasedMatch turnBasedMatch) {
        return c.a(turnBasedMatch).a("Game", turnBasedMatch.c()).a("MatchId", turnBasedMatch.d()).a("CreatorId", turnBasedMatch.e()).a("CreationTimestamp", Long.valueOf(turnBasedMatch.f())).a("LastUpdaterId", turnBasedMatch.k()).a("LastUpdatedTimestamp", Long.valueOf(turnBasedMatch.l())).a("PendingParticipantId", turnBasedMatch.n()).a("MatchStatus", Integer.valueOf(turnBasedMatch.g())).a("TurnStatus", Integer.valueOf(turnBasedMatch.h())).a("Description", turnBasedMatch.i()).a("Variant", Integer.valueOf(turnBasedMatch.j())).a("Data", turnBasedMatch.o()).a("Version", Integer.valueOf(turnBasedMatch.p())).a("Participants", turnBasedMatch.m()).a("RematchId", turnBasedMatch.r()).a("PreviousData", turnBasedMatch.s()).a("MatchNumber", Integer.valueOf(turnBasedMatch.t())).a("AutoMatchCriteria", turnBasedMatch.u()).a("AvailableAutoMatchSlots", Integer.valueOf(turnBasedMatch.v())).a("LocallyModified", Boolean.valueOf(turnBasedMatch.w())).a("DescriptionParticipantId", turnBasedMatch.y()).toString();
    }

    static String b(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList m = turnBasedMatch.m();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) m.get(i);
            Player k = participant.k();
            if (k != null && k.c().equals(str)) {
                return participant.j();
            }
        }
        return null;
    }

    static Participant c(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList m = turnBasedMatch.m();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) m.get(i);
            if (participant.j().equals(str)) {
                return participant;
            }
        }
        String valueOf = String.valueOf(turnBasedMatch.d());
        throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(valueOf).length()).append("Participant ").append(str).append(" is not in match ").append(valueOf).toString());
    }

    static ArrayList<String> c(TurnBasedMatch turnBasedMatch) {
        ArrayList m = turnBasedMatch.m();
        int size = m.size();
        ArrayList<String> arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(((Participant) m.get(i)).j());
        }
        return arrayList;
    }

    public int A() {
        return this.k;
    }

    public TurnBasedMatch B() {
        return this;
    }

    public int a(String str) {
        return a((TurnBasedMatch) this, str);
    }

    public /* synthetic */ Object a() {
        return B();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        g.a(this.D, charArrayBuffer);
    }

    public boolean b() {
        return true;
    }

    public Game c() {
        return this.l;
    }

    public String d() {
        return this.m;
    }

    public String e() {
        return this.n;
    }

    public String e_(String str) {
        return b(this, str);
    }

    public boolean equals(Object obj) {
        return a((TurnBasedMatch) this, obj);
    }

    public long f() {
        return this.o;
    }

    public Participant f_(String str) {
        return c(this, str);
    }

    public int g() {
        return this.s;
    }

    public int h() {
        return this.B;
    }

    public int hashCode() {
        return a((TurnBasedMatch) this);
    }

    public String i() {
        return this.D;
    }

    public int j() {
        return this.t;
    }

    public String k() {
        return this.p;
    }

    public long l() {
        return this.q;
    }

    public ArrayList<Participant> m() {
        return new ArrayList(this.w);
    }

    public String n() {
        return this.r;
    }

    public byte[] o() {
        return this.v;
    }

    public int p() {
        return this.u;
    }

    public boolean q() {
        return this.s == 2 && this.x == null;
    }

    public String r() {
        return this.x;
    }

    public byte[] s() {
        return this.y;
    }

    public int t() {
        return this.z;
    }

    public String toString() {
        return b(this);
    }

    public Bundle u() {
        return this.A;
    }

    public int v() {
        return this.A == null ? 0 : this.A.getInt(d.j);
    }

    public boolean w() {
        return this.C;
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }

    public ArrayList<String> x() {
        return c(this);
    }

    public String y() {
        return this.E;
    }

    public Participant z() {
        String y = y();
        return y == null ? null : f_(y);
    }
}
