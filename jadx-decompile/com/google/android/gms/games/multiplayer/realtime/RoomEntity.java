package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.util.g;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public final class RoomEntity extends GamesDowngradeableSafeParcel implements Room {
    public static final Creator<RoomEntity> CREATOR = new a();
    private final int f;
    private final String g;
    private final String h;
    private final long i;
    private final int j;
    private final String k;
    private final int l;
    private final Bundle m;
    private final ArrayList<ParticipantEntity> n;
    private final int o;

    static final class a extends f {
        a() {
        }

        public RoomEntity a(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.b(RoomEntity.l_()) || RoomEntity.a_(RoomEntity.class.getCanonicalName())) {
                return super.a(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            Bundle readBundle = parcel.readBundle();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i = 0; i < readInt3; i++) {
                arrayList.add((ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel));
            }
            return new RoomEntity(2, readString, readString2, readLong, readInt, readString3, readInt2, readBundle, arrayList, -1);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }
    }

    RoomEntity(int i, String str, String str2, long j, int i2, String str3, int i3, Bundle bundle, ArrayList<ParticipantEntity> arrayList, int i4) {
        this.f = i;
        this.g = str;
        this.h = str2;
        this.i = j;
        this.j = i2;
        this.k = str3;
        this.l = i3;
        this.m = bundle;
        this.n = arrayList;
        this.o = i4;
    }

    public RoomEntity(Room room) {
        this.f = 2;
        this.g = room.c();
        this.h = room.d();
        this.i = room.e();
        this.j = room.f();
        this.k = room.g();
        this.l = room.h();
        this.m = room.i();
        ArrayList m = room.m();
        int size = m.size();
        this.n = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.n.add((ParticipantEntity) ((Participant) m.get(i)).a());
        }
        this.o = room.j();
    }

    static int a(Room room) {
        return c.a(new Object[]{room.c(), room.d(), Long.valueOf(room.e()), Integer.valueOf(room.f()), room.g(), Integer.valueOf(room.h()), room.i(), room.m(), Integer.valueOf(room.j())});
    }

    static int a(Room room, String str) {
        ArrayList m = room.m();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) m.get(i);
            if (participant.j().equals(str)) {
                return participant.c();
            }
        }
        String valueOf = String.valueOf(room.c());
        throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 28) + String.valueOf(valueOf).length()).append("Participant ").append(str).append(" is not in room ").append(valueOf).toString());
    }

    static boolean a(Room room, Object obj) {
        if (!(obj instanceof Room)) {
            return false;
        }
        if (room == obj) {
            return true;
        }
        Room room2 = (Room) obj;
        return c.a(room2.c(), room.c()) && c.a(room2.d(), room.d()) && c.a(Long.valueOf(room2.e()), Long.valueOf(room.e())) && c.a(Integer.valueOf(room2.f()), Integer.valueOf(room.f())) && c.a(room2.g(), room.g()) && c.a(Integer.valueOf(room2.h()), Integer.valueOf(room.h())) && c.a(room2.i(), room.i()) && c.a(room2.m(), room.m()) && c.a(Integer.valueOf(room2.j()), Integer.valueOf(room.j()));
    }

    static String b(Room room) {
        return c.a(room).a("RoomId", room.c()).a("CreatorId", room.d()).a("CreationTimestamp", Long.valueOf(room.e())).a("RoomStatus", Integer.valueOf(room.f())).a("Description", room.g()).a("Variant", Integer.valueOf(room.h())).a("AutoMatchCriteria", room.i()).a("Participants", room.m()).a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.j())).toString();
    }

    static String b(Room room, String str) {
        ArrayList m = room.m();
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

    static Participant c(Room room, String str) {
        ArrayList m = room.m();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) m.get(i);
            if (participant.j().equals(str)) {
                return participant;
            }
        }
        String valueOf = String.valueOf(room.c());
        throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(valueOf).length()).append("Participant ").append(str).append(" is not in match ").append(valueOf).toString());
    }

    static ArrayList<String> c(Room room) {
        ArrayList m = room.m();
        int size = m.size();
        ArrayList<String> arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(((Participant) m.get(i)).j());
        }
        return arrayList;
    }

    public int a(String str) {
        return a((Room) this, str);
    }

    public /* synthetic */ Object a() {
        return n();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        g.a(this.k, charArrayBuffer);
    }

    public boolean b() {
        return true;
    }

    public String b_(String str) {
        return b(this, str);
    }

    public String c() {
        return this.g;
    }

    public Participant c_(String str) {
        return c(this, str);
    }

    public String d() {
        return this.h;
    }

    public long e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        return a((Room) this, obj);
    }

    public int f() {
        return this.j;
    }

    public String g() {
        return this.k;
    }

    public int h() {
        return this.l;
    }

    public int hashCode() {
        return a((Room) this);
    }

    public Bundle i() {
        return this.m;
    }

    public int j() {
        return this.o;
    }

    public ArrayList<String> k() {
        return c(this);
    }

    public int l() {
        return this.f;
    }

    public ArrayList<Participant> m() {
        return new ArrayList(this.n);
    }

    public Room n() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (m_()) {
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeLong(this.i);
            parcel.writeInt(this.j);
            parcel.writeString(this.k);
            parcel.writeInt(this.l);
            parcel.writeBundle(this.m);
            int size = this.n.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((ParticipantEntity) this.n.get(i2)).writeToParcel(parcel, i);
            }
            return;
        }
        f.a(this, parcel, i);
    }
}
