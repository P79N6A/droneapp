package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;

public class SnapshotRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<SnapshotRequest> CREATOR = new l();
  private static final int[] a = { 10002, 10003, 10004, 10005, 10006, 10007, 10008 };
  private final int b;
  private final int c;
  private final ArrayList<BeaconStateImpl.TypeFilterImpl> d;
  
  SnapshotRequest(int paramInt1, int paramInt2, ArrayList<BeaconStateImpl.TypeFilterImpl> paramArrayList)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramArrayList;
  }
  
  public SnapshotRequest(int paramInt, ArrayList<BeaconStateImpl.TypeFilterImpl> paramArrayList)
  {
    this(1, paramInt, paramArrayList);
  }
  
  int a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public ArrayList<BeaconStateImpl.TypeFilterImpl> c()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (this == paramObject) {
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (!(paramObject instanceof SnapshotRequest));
      paramObject = (SnapshotRequest)paramObject;
      bool1 = bool2;
    } while (this.c != ((SnapshotRequest)paramObject).b());
    int i;
    if (this.d == null)
    {
      i = 1;
      label54:
      if (((SnapshotRequest)paramObject).c() != null) {
        break label151;
      }
    }
    label151:
    for (int j = 1;; j = 0)
    {
      bool1 = bool2;
      if ((i ^ j) != 0) {
        break;
      }
      if (this.d == null) {
        break label156;
      }
      bool1 = bool2;
      if (this.d.size() != ((SnapshotRequest)paramObject).c().size()) {
        break;
      }
      Iterator localIterator = this.d.iterator();
      BeaconStateImpl.TypeFilterImpl localTypeFilterImpl;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localTypeFilterImpl = (BeaconStateImpl.TypeFilterImpl)localIterator.next();
      } while (((SnapshotRequest)paramObject).c().contains(localTypeFilterImpl));
      return false;
      i = 0;
      break label54;
    }
    label156:
    return true;
  }
  
  public int hashCode()
  {
    if (this.d != null)
    {
      Iterator localIterator = this.d.iterator();
      for (int i = 0;; i = ((BeaconStateImpl.TypeFilterImpl)localIterator.next()).hashCode() * 13 + i)
      {
        j = i;
        if (!localIterator.hasNext()) {
          break;
        }
      }
    }
    int j = 0;
    return c.a(new Object[] { Integer.valueOf(this.c), Integer.valueOf(j) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    l.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/SnapshotRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */