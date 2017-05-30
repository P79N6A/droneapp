package com.google.android.gms.drive.internal;

import com.google.android.gms.drive.l;
import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class bo extends l {
    private final MetadataBundle c;

    public bo(MetadataBundle metadataBundle) {
        this.c = metadataBundle;
    }

    public l H() {
        return new bo(this.c.b());
    }

    public /* synthetic */ Object a() {
        return H();
    }

    public <T> T a(a<T> aVar) {
        return this.c.a((a) aVar);
    }

    public boolean b() {
        return this.c != null;
    }

    public String toString() {
        String valueOf = String.valueOf(this.c);
        return new StringBuilder(String.valueOf(valueOf).length() + 17).append("Metadata [mImpl=").append(valueOf).append("]").toString();
    }
}
