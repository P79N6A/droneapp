package com.google.android.gms.location.places.personalized;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.k;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.location.places.n;

@Deprecated
public final class e
  extends k<PlaceUserData>
  implements m
{
  private final Status b;
  
  public e(DataHolder paramDataHolder)
  {
    this(paramDataHolder, n.c(paramDataHolder.e()));
  }
  
  private e(DataHolder paramDataHolder, Status paramStatus)
  {
    super(paramDataHolder, PlaceUserData.CREATOR);
    if ((paramDataHolder == null) || (paramDataHolder.e() == paramStatus.i())) {}
    for (boolean bool = true;; bool = false)
    {
      d.b(bool);
      this.b = paramStatus;
      return;
    }
  }
  
  public Status a()
  {
    return this.b;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/location/places/personalized/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */