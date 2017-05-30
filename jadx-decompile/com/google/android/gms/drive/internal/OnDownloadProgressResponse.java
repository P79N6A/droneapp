package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveFileRange;
import java.util.Collections;
import java.util.List;

public class OnDownloadProgressResponse extends AbstractSafeParcelable {
    public static final Creator<OnDownloadProgressResponse> CREATOR = new w();
    private static final List<DriveFileRange> f = Collections.emptyList();
    final int a;
    final long b;
    final long c;
    final int d;
    final List<DriveFileRange> e;

    OnDownloadProgressResponse(int i, long j, long j2, int i2, List<DriveFileRange> list) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = i2;
        this.e = list;
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        w.a(this, parcel, i);
    }
}
