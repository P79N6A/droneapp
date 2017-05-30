package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.util.g;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class ParticipantEntity extends GamesDowngradeableSafeParcel implements Participant {
    public static final Creator<ParticipantEntity> CREATOR = new a();
    private final int h;
    private final String i;
    private final String j;
    private final Uri k;
    private final Uri l;
    private final int m;
    private final String n;
    private final boolean o;
    private final PlayerEntity p;
    private final int q;
    private final ParticipantResult r;
    private final String s;
    private final String t;

    static final class a extends g {
        a() {
        }

        public ParticipantEntity a(Parcel parcel) {
            Object obj = 1;
            if (GamesDowngradeableSafeParcel.b(ParticipantEntity.l_()) || ParticipantEntity.a_(ParticipantEntity.class.getCanonicalName())) {
                return super.a(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Uri parse = readString3 == null ? null : Uri.parse(readString3);
            String readString4 = parcel.readString();
            Uri parse2 = readString4 == null ? null : Uri.parse(readString4);
            int readInt = parcel.readInt();
            String readString5 = parcel.readString();
            boolean z = parcel.readInt() > 0;
            if (parcel.readInt() <= 0) {
                obj = null;
            }
            return new ParticipantEntity(3, readString, readString2, parse, parse2, readInt, readString5, z, obj != null ? (PlayerEntity) PlayerEntity.CREATOR.createFromParcel(parcel) : null, 7, null, null, null);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }
    }

    ParticipantEntity(int i, String str, String str2, Uri uri, Uri uri2, int i2, String str3, boolean z, PlayerEntity playerEntity, int i3, ParticipantResult participantResult, String str4, String str5) {
        this.h = i;
        this.i = str;
        this.j = str2;
        this.k = uri;
        this.l = uri2;
        this.m = i2;
        this.n = str3;
        this.o = z;
        this.p = playerEntity;
        this.q = i3;
        this.r = participantResult;
        this.s = str4;
        this.t = str5;
    }

    public ParticipantEntity(Participant participant) {
        this.h = 3;
        this.i = participant.j();
        this.j = participant.g();
        this.k = participant.h();
        this.l = participant.i();
        this.m = participant.c();
        this.n = participant.d();
        this.o = participant.f();
        Player k = participant.k();
        this.p = k == null ? null : new PlayerEntity(k);
        this.q = participant.e();
        this.r = participant.l();
        this.s = participant.getIconImageUrl();
        this.t = participant.getHiResImageUrl();
    }

    static int a(Participant participant) {
        return c.a(new Object[]{participant.k(), Integer.valueOf(participant.c()), participant.d(), Boolean.valueOf(participant.f()), participant.g(), participant.h(), participant.i(), Integer.valueOf(participant.e()), participant.l(), participant.j()});
    }

    static boolean a(Participant participant, Object obj) {
        if (!(obj instanceof Participant)) {
            return false;
        }
        if (participant == obj) {
            return true;
        }
        Participant participant2 = (Participant) obj;
        return c.a(participant2.k(), participant.k()) && c.a(Integer.valueOf(participant2.c()), Integer.valueOf(participant.c())) && c.a(participant2.d(), participant.d()) && c.a(Boolean.valueOf(participant2.f()), Boolean.valueOf(participant.f())) && c.a(participant2.g(), participant.g()) && c.a(participant2.h(), participant.h()) && c.a(participant2.i(), participant.i()) && c.a(Integer.valueOf(participant2.e()), Integer.valueOf(participant.e())) && c.a(participant2.l(), participant.l()) && c.a(participant2.j(), participant.j());
    }

    static String b(Participant participant) {
        return c.a(participant).a("ParticipantId", participant.j()).a("Player", participant.k()).a("Status", Integer.valueOf(participant.c())).a("ClientAddress", participant.d()).a("ConnectedToRoom", Boolean.valueOf(participant.f())).a("DisplayName", participant.g()).a("IconImage", participant.h()).a("IconImageUrl", participant.getIconImageUrl()).a("HiResImage", participant.i()).a("HiResImageUrl", participant.getHiResImageUrl()).a("Capabilities", Integer.valueOf(participant.e())).a("Result", participant.l()).toString();
    }

    public /* synthetic */ Object a() {
        return n();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        if (this.p == null) {
            g.a(this.j, charArrayBuffer);
        } else {
            this.p.a(charArrayBuffer);
        }
    }

    public boolean b() {
        return true;
    }

    public int c() {
        return this.m;
    }

    public String d() {
        return this.n;
    }

    public int e() {
        return this.q;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public boolean f() {
        return this.o;
    }

    public String g() {
        return this.p == null ? this.j : this.p.d();
    }

    public String getHiResImageUrl() {
        return this.p == null ? this.t : this.p.getHiResImageUrl();
    }

    public String getIconImageUrl() {
        return this.p == null ? this.s : this.p.getIconImageUrl();
    }

    public Uri h() {
        return this.p == null ? this.k : this.p.i();
    }

    public int hashCode() {
        return a((Participant) this);
    }

    public Uri i() {
        return this.p == null ? this.l : this.p.k();
    }

    public String j() {
        return this.i;
    }

    public Player k() {
        return this.p;
    }

    public ParticipantResult l() {
        return this.r;
    }

    public int m() {
        return this.h;
    }

    public Participant n() {
        return this;
    }

    public String toString() {
        return b((Participant) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = null;
        int i2 = 0;
        if (m_()) {
            parcel.writeString(this.i);
            parcel.writeString(this.j);
            parcel.writeString(this.k == null ? null : this.k.toString());
            if (this.l != null) {
                str = this.l.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.m);
            parcel.writeString(this.n);
            parcel.writeInt(this.o ? 1 : 0);
            if (this.p != null) {
                i2 = 1;
            }
            parcel.writeInt(i2);
            if (this.p != null) {
                this.p.writeToParcel(parcel, i);
                return;
            }
            return;
        }
        g.a(this, parcel, i);
    }
}
