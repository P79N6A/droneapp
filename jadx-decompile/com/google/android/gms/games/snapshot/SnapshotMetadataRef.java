package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class SnapshotMetadataRef extends j implements SnapshotMetadata {
    private final Game c;
    private final Player d;

    public SnapshotMetadataRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.c = new GameRef(dataHolder, i);
        this.d = new PlayerRef(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return p();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        a("description", charArrayBuffer);
    }

    public Game c() {
        return this.c;
    }

    public Player d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return e("external_snapshot_id");
    }

    public boolean equals(Object obj) {
        return SnapshotMetadataEntity.a(this, obj);
    }

    public Uri f() {
        return h("cover_icon_image_uri");
    }

    public float g() {
        float f = f("cover_icon_image_height");
        return f == 0.0f ? 0.0f : f("cover_icon_image_width") / f;
    }

    public String getCoverImageUrl() {
        return e("cover_icon_image_url");
    }

    public String h() {
        return e("unique_name");
    }

    public int hashCode() {
        return SnapshotMetadataEntity.a((SnapshotMetadata) this);
    }

    public String i() {
        return e("title");
    }

    public String j() {
        return e("description");
    }

    public long k() {
        return b("last_modified_timestamp");
    }

    public long l() {
        return b("duration");
    }

    public boolean m() {
        return c("pending_change_count") > 0;
    }

    public long n() {
        return b("progress_value");
    }

    public String o() {
        return e("device_name");
    }

    public SnapshotMetadata p() {
        return new SnapshotMetadataEntity(this);
    }

    public String toString() {
        return SnapshotMetadataEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((SnapshotMetadataEntity) ((SnapshotMetadata) a())).writeToParcel(parcel, i);
    }
}
