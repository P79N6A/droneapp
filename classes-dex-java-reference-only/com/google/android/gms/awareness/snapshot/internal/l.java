package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class l
  implements Parcelable.Creator<SnapshotRequest>
{
  static void a(SnapshotRequest paramSnapshotRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramSnapshotRequest.a());
    b.a(paramParcel, 2, paramSnapshotRequest.b());
    b.c(paramParcel, 3, paramSnapshotRequest.c(), false);
    b.a(paramParcel, paramInt);
  }
  
  public SnapshotRequest a(Parcel paramParcel)
  {
    int j = 0;
    int k = a.b(paramParcel);
    ArrayList localArrayList = null;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        i = a.g(paramParcel, m);
        break;
      case 2: 
        j = a.g(paramParcel, m);
        break;
      case 3: 
        localArrayList = a.c(paramParcel, m, BeaconStateImpl.TypeFilterImpl.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new SnapshotRequest(i, j, localArrayList);
  }
  
  public SnapshotRequest[] a(int paramInt)
  {
    return new SnapshotRequest[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */