package com.google.android.gms.games.snapshot;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;

public final class c extends a<SnapshotMetadata> {
    public c(DataHolder dataHolder) {
        super(dataHolder);
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public SnapshotMetadata b(int i) {
        return new SnapshotMetadataRef(this.a, i);
    }
}
