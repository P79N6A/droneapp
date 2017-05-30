package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import java.util.ArrayList;
import java.util.List;

public final class PlacesData
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<PlacesData> CREATOR = new g();
  private final int a;
  private final ArrayList<PlaceLikelihoodEntity> b;
  
  PlacesData(int paramInt, ArrayList<PlaceLikelihoodEntity> paramArrayList)
  {
    this.a = paramInt;
    this.b = paramArrayList;
  }
  
  public List<com.google.android.gms.location.places.g> a()
  {
    return this.b;
  }
  
  ArrayList<PlaceLikelihoodEntity> b()
  {
    return this.b;
  }
  
  int c()
  {
    return this.a;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/PlacesData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */