package com.google.android.gms.games.snapshot;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;

public interface g {
    public static final String a = "com.google.android.gms.games.SNAPSHOT_METADATA";
    public static final String b = "com.google.android.gms.games.SNAPSHOT_NEW";
    public static final int c = -1;
    public static final int d = -1;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;

    public interface a extends m {
        SnapshotMetadata c();
    }

    public interface b extends m {
        String b();
    }

    public interface c extends k, m {
        c c();
    }

    public interface d extends m {
        Snapshot c();

        String d();

        Snapshot e();

        SnapshotContents f();
    }

    int a(com.google.android.gms.common.api.g gVar);

    Intent a(com.google.android.gms.common.api.g gVar, String str, boolean z, boolean z2, int i);

    i<a> a(com.google.android.gms.common.api.g gVar, Snapshot snapshot, d dVar);

    i<d> a(com.google.android.gms.common.api.g gVar, SnapshotMetadata snapshotMetadata);

    i<d> a(com.google.android.gms.common.api.g gVar, SnapshotMetadata snapshotMetadata, int i);

    i<d> a(com.google.android.gms.common.api.g gVar, String str, Snapshot snapshot);

    i<d> a(com.google.android.gms.common.api.g gVar, String str, String str2, d dVar, SnapshotContents snapshotContents);

    i<d> a(com.google.android.gms.common.api.g gVar, String str, boolean z);

    i<d> a(com.google.android.gms.common.api.g gVar, String str, boolean z, int i);

    i<c> a(com.google.android.gms.common.api.g gVar, boolean z);

    SnapshotMetadata a(Bundle bundle);

    void a(com.google.android.gms.common.api.g gVar, Snapshot snapshot);

    int b(com.google.android.gms.common.api.g gVar);

    i<b> b(com.google.android.gms.common.api.g gVar, SnapshotMetadata snapshotMetadata);
}
