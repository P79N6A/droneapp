package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;

public interface d {
    public static final d a = new SnapshotMetadataChangeEntity();

    public static final class a {
        private String a;
        private Long b;
        private Long c;
        private BitmapTeleporter d;
        private Uri e;

        public a a(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public a a(Bitmap bitmap) {
            this.d = new BitmapTeleporter(bitmap);
            this.e = null;
            return this;
        }

        public a a(SnapshotMetadata snapshotMetadata) {
            this.a = snapshotMetadata.j();
            this.b = Long.valueOf(snapshotMetadata.l());
            this.c = Long.valueOf(snapshotMetadata.n());
            if (this.b.longValue() == -1) {
                this.b = null;
            }
            this.e = snapshotMetadata.f();
            if (this.e != null) {
                this.d = null;
            }
            return this;
        }

        public a a(String str) {
            this.a = str;
            return this;
        }

        public d a() {
            return new SnapshotMetadataChangeEntity(this.a, this.b, this.d, this.e, this.c);
        }

        public a b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }
    }

    String a();

    Long b();

    BitmapTeleporter c();

    Bitmap d();

    Long e();
}
