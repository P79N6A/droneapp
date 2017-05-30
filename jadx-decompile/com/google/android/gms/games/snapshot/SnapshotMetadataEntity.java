package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.g;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public final class SnapshotMetadataEntity extends AbstractSafeParcelable implements SnapshotMetadata {
    public static final Creator<SnapshotMetadataEntity> CREATOR = new f();
    private final int c;
    private final GameEntity d;
    private final PlayerEntity e;
    private final String f;
    private final Uri g;
    private final String h;
    private final String i;
    private final String j;
    private final long k;
    private final long l;
    private final float m;
    private final String n;
    private final boolean o;
    private final long p;
    private final String q;

    SnapshotMetadataEntity(int i, GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j, long j2, float f, String str5, boolean z, long j3, String str6) {
        this.c = i;
        this.d = gameEntity;
        this.e = playerEntity;
        this.f = str;
        this.g = uri;
        this.h = str2;
        this.m = f;
        this.i = str3;
        this.j = str4;
        this.k = j;
        this.l = j2;
        this.n = str5;
        this.o = z;
        this.p = j3;
        this.q = str6;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotMetadata) {
        this.c = 6;
        this.d = new GameEntity(snapshotMetadata.c());
        this.e = new PlayerEntity(snapshotMetadata.d());
        this.f = snapshotMetadata.e();
        this.g = snapshotMetadata.f();
        this.h = snapshotMetadata.getCoverImageUrl();
        this.m = snapshotMetadata.g();
        this.i = snapshotMetadata.i();
        this.j = snapshotMetadata.j();
        this.k = snapshotMetadata.k();
        this.l = snapshotMetadata.l();
        this.n = snapshotMetadata.h();
        this.o = snapshotMetadata.m();
        this.p = snapshotMetadata.n();
        this.q = snapshotMetadata.o();
    }

    static int a(SnapshotMetadata snapshotMetadata) {
        return c.a(new Object[]{snapshotMetadata.c(), snapshotMetadata.d(), snapshotMetadata.e(), snapshotMetadata.f(), Float.valueOf(snapshotMetadata.g()), snapshotMetadata.i(), snapshotMetadata.j(), Long.valueOf(snapshotMetadata.k()), Long.valueOf(snapshotMetadata.l()), snapshotMetadata.h(), Boolean.valueOf(snapshotMetadata.m()), Long.valueOf(snapshotMetadata.n()), snapshotMetadata.o()});
    }

    static boolean a(SnapshotMetadata snapshotMetadata, Object obj) {
        if (!(obj instanceof SnapshotMetadata)) {
            return false;
        }
        if (snapshotMetadata == obj) {
            return true;
        }
        SnapshotMetadata snapshotMetadata2 = (SnapshotMetadata) obj;
        return c.a(snapshotMetadata2.c(), snapshotMetadata.c()) && c.a(snapshotMetadata2.d(), snapshotMetadata.d()) && c.a(snapshotMetadata2.e(), snapshotMetadata.e()) && c.a(snapshotMetadata2.f(), snapshotMetadata.f()) && c.a(Float.valueOf(snapshotMetadata2.g()), Float.valueOf(snapshotMetadata.g())) && c.a(snapshotMetadata2.i(), snapshotMetadata.i()) && c.a(snapshotMetadata2.j(), snapshotMetadata.j()) && c.a(Long.valueOf(snapshotMetadata2.k()), Long.valueOf(snapshotMetadata.k())) && c.a(Long.valueOf(snapshotMetadata2.l()), Long.valueOf(snapshotMetadata.l())) && c.a(snapshotMetadata2.h(), snapshotMetadata.h()) && c.a(Boolean.valueOf(snapshotMetadata2.m()), Boolean.valueOf(snapshotMetadata.m())) && c.a(Long.valueOf(snapshotMetadata2.n()), Long.valueOf(snapshotMetadata.n())) && c.a(snapshotMetadata2.o(), snapshotMetadata.o());
    }

    static String b(SnapshotMetadata snapshotMetadata) {
        return c.a(snapshotMetadata).a("Game", snapshotMetadata.c()).a("Owner", snapshotMetadata.d()).a("SnapshotId", snapshotMetadata.e()).a("CoverImageUri", snapshotMetadata.f()).a("CoverImageUrl", snapshotMetadata.getCoverImageUrl()).a("CoverImageAspectRatio", Float.valueOf(snapshotMetadata.g())).a("Description", snapshotMetadata.j()).a("LastModifiedTimestamp", Long.valueOf(snapshotMetadata.k())).a("PlayedTime", Long.valueOf(snapshotMetadata.l())).a("UniqueName", snapshotMetadata.h()).a("ChangePending", Boolean.valueOf(snapshotMetadata.m())).a("ProgressValue", Long.valueOf(snapshotMetadata.n())).a("DeviceName", snapshotMetadata.o()).toString();
    }

    public /* synthetic */ Object a() {
        return q();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        g.a(this.j, charArrayBuffer);
    }

    public boolean b() {
        return true;
    }

    public Game c() {
        return this.d;
    }

    public Player d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public Uri f() {
        return this.g;
    }

    public float g() {
        return this.m;
    }

    public String getCoverImageUrl() {
        return this.h;
    }

    public String h() {
        return this.n;
    }

    public int hashCode() {
        return a((SnapshotMetadata) this);
    }

    public String i() {
        return this.i;
    }

    public String j() {
        return this.j;
    }

    public long k() {
        return this.k;
    }

    public long l() {
        return this.l;
    }

    public boolean m() {
        return this.o;
    }

    public long n() {
        return this.p;
    }

    public String o() {
        return this.q;
    }

    public int p() {
        return this.c;
    }

    public SnapshotMetadata q() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
