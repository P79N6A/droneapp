package com.google.android.gms.games.snapshot;

import android.os.Parcelable;
import com.google.android.gms.common.data.f;

public interface Snapshot extends Parcelable, f<Snapshot> {
    SnapshotMetadata c();

    SnapshotContents d();
}
