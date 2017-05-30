package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class SnapshotMetadataChangeEntity extends AbstractSafeParcelable implements d {
    public static final e CREATOR = new e();
    private final int b;
    private final String c;
    private final Long d;
    private final Uri e;
    private BitmapTeleporter f;
    private final Long g;

    SnapshotMetadataChangeEntity() {
        this(5, null, null, null, null, null);
    }

    SnapshotMetadataChangeEntity(int i, String str, Long l, BitmapTeleporter bitmapTeleporter, Uri uri, Long l2) {
        boolean z = true;
        this.b = i;
        this.c = str;
        this.d = l;
        this.f = bitmapTeleporter;
        this.e = uri;
        this.g = l2;
        if (this.f != null) {
            if (this.e != null) {
                z = false;
            }
            d.a(z, "Cannot set both a URI and an image");
        } else if (this.e != null) {
            if (this.f != null) {
                z = false;
            }
            d.a(z, "Cannot set both a URI and an image");
        }
    }

    SnapshotMetadataChangeEntity(String str, Long l, BitmapTeleporter bitmapTeleporter, Uri uri, Long l2) {
        this(5, str, l, bitmapTeleporter, uri, l2);
    }

    public String a() {
        return this.c;
    }

    public Long b() {
        return this.d;
    }

    public BitmapTeleporter c() {
        return this.f;
    }

    public Bitmap d() {
        return this.f == null ? null : this.f.a();
    }

    public Long e() {
        return this.g;
    }

    public int f() {
        return this.b;
    }

    public Uri g() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
