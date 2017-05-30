package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class SnapshotEntity extends AbstractSafeParcelable implements Snapshot {
    public static final Creator<SnapshotEntity> CREATOR = new b();
    private final int a;
    private final SnapshotMetadataEntity b;
    private final SnapshotContentsEntity c;

    SnapshotEntity(int i, SnapshotMetadata snapshotMetadata, SnapshotContentsEntity snapshotContentsEntity) {
        this.a = i;
        this.b = new SnapshotMetadataEntity(snapshotMetadata);
        this.c = snapshotContentsEntity;
    }

    public SnapshotEntity(SnapshotMetadata snapshotMetadata, SnapshotContentsEntity snapshotContentsEntity) {
        this(2, snapshotMetadata, snapshotContentsEntity);
    }

    static int a(Snapshot snapshot) {
        return c.a(new Object[]{snapshot.c(), snapshot.d()});
    }

    static boolean a(Snapshot snapshot, Object obj) {
        if (!(obj instanceof Snapshot)) {
            return false;
        }
        if (snapshot == obj) {
            return true;
        }
        Snapshot snapshot2 = (Snapshot) obj;
        return c.a(snapshot2.c(), snapshot.c()) && c.a(snapshot2.d(), snapshot.d());
    }

    static String b(Snapshot snapshot) {
        return c.a(snapshot).a("Metadata", snapshot.c()).a("HasContents", Boolean.valueOf(snapshot.d() != null)).toString();
    }

    private boolean g() {
        return this.c.d();
    }

    public /* synthetic */ Object a() {
        return f();
    }

    public boolean b() {
        return true;
    }

    public SnapshotMetadata c() {
        return this.b;
    }

    public SnapshotContents d() {
        return g() ? null : this.c;
    }

    public int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public Snapshot f() {
        return this;
    }

    public int hashCode() {
        return a(this);
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
