package com.google.android.gms.games.quest;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class MilestoneEntity extends AbstractSafeParcelable implements Milestone {
    public static final Creator<MilestoneEntity> CREATOR = new b();
    private final int e;
    private final String f;
    private final long g;
    private final long h;
    private final byte[] i;
    private final int j;
    private final String k;

    MilestoneEntity(int i, String str, long j, long j2, byte[] bArr, int i2, String str2) {
        this.e = i;
        this.f = str;
        this.g = j;
        this.h = j2;
        this.i = bArr;
        this.j = i2;
        this.k = str2;
    }

    public MilestoneEntity(Milestone milestone) {
        this.e = 4;
        this.f = milestone.c();
        this.g = milestone.d();
        this.h = milestone.g();
        this.j = milestone.f();
        this.k = milestone.e();
        Object h = milestone.h();
        if (h == null) {
            this.i = null;
            return;
        }
        this.i = new byte[h.length];
        System.arraycopy(h, 0, this.i, 0, h.length);
    }

    static int a(Milestone milestone) {
        return c.a(new Object[]{milestone.c(), Long.valueOf(milestone.d()), Long.valueOf(milestone.g()), Integer.valueOf(milestone.f()), milestone.e()});
    }

    static boolean a(Milestone milestone, Object obj) {
        if (!(obj instanceof Milestone)) {
            return false;
        }
        if (milestone == obj) {
            return true;
        }
        Milestone milestone2 = (Milestone) obj;
        return c.a(milestone2.c(), milestone.c()) && c.a(Long.valueOf(milestone2.d()), Long.valueOf(milestone.d())) && c.a(Long.valueOf(milestone2.g()), Long.valueOf(milestone.g())) && c.a(Integer.valueOf(milestone2.f()), Integer.valueOf(milestone.f())) && c.a(milestone2.e(), milestone.e());
    }

    static String b(Milestone milestone) {
        return c.a(milestone).a("MilestoneId", milestone.c()).a("CurrentProgress", Long.valueOf(milestone.d())).a("TargetProgress", Long.valueOf(milestone.g())).a("State", Integer.valueOf(milestone.f())).a("CompletionRewardData", milestone.h()).a("EventId", milestone.e()).toString();
    }

    public /* synthetic */ Object a() {
        return j();
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.f;
    }

    public long d() {
        return this.g;
    }

    public String e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public int f() {
        return this.j;
    }

    public long g() {
        return this.h;
    }

    public byte[] h() {
        return this.i;
    }

    public int hashCode() {
        return a(this);
    }

    public int i() {
        return this.e;
    }

    public Milestone j() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
