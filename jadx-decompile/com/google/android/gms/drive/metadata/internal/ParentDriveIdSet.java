package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ParentDriveIdSet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<ParentDriveIdSet> CREATOR = new l();
    final int a;
    final List<PartialDriveId> b;

    public ParentDriveIdSet() {
        this(1, new ArrayList());
    }

    ParentDriveIdSet(int i, List<PartialDriveId> list) {
        this.a = i;
        this.b = list;
    }

    public Set<DriveId> a(long j) {
        Set<DriveId> hashSet = new HashSet();
        for (PartialDriveId a : this.b) {
            hashSet.add(a.a(j));
        }
        return hashSet;
    }

    public void a(PartialDriveId partialDriveId) {
        this.b.add(partialDriveId);
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
