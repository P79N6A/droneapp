package com.google.android.gms.games.snapshot;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;

public interface SnapshotContents extends Parcelable {
    ParcelFileDescriptor a();

    boolean a(int i, byte[] bArr, int i2, int i3);

    boolean a(byte[] bArr);

    Contents b();

    void c();

    boolean d();

    byte[] e();
}
