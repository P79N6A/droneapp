package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.fence.i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.sx;
import java.util.ArrayList;
import java.util.Iterator;

public class FenceUpdateRequestImpl
  extends AbstractSafeParcelable
  implements com.google.android.gms.awareness.fence.e
{
  public static final Parcelable.Creator<FenceUpdateRequestImpl> CREATOR = new l();
  private final int a;
  private final ArrayList<UpdateFenceOperation> b;
  
  @Deprecated
  public FenceUpdateRequestImpl()
  {
    this(new ArrayList());
  }
  
  FenceUpdateRequestImpl(int paramInt, ArrayList<UpdateFenceOperation> paramArrayList)
  {
    this.a = paramInt;
    this.b = paramArrayList;
  }
  
  public FenceUpdateRequestImpl(ArrayList<UpdateFenceOperation> paramArrayList)
  {
    this(1, paramArrayList);
  }
  
  int a()
  {
    return this.a;
  }
  
  public void a(sx<i, e> paramsx)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      ((UpdateFenceOperation)localIterator.next()).a(paramsx);
    }
  }
  
  public ArrayList<UpdateFenceOperation> b()
  {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    l.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */