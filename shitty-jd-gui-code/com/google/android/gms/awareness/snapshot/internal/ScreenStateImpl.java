package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ScreenStateImpl
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ScreenStateImpl> CREATOR = new i();
  private final int a;
  private final int b;
  
  ScreenStateImpl(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public int a()
  {
    return this.b;
  }
  
  int b()
  {
    return this.a;
  }
  
  public String toString()
  {
    if (this.b == 1) {
      return "ScreenState: SCREEN_OFF";
    }
    if (this.b == 2) {
      return "ScreenState: SCREEN_ON";
    }
    return "ScreenState: UNKNOWN";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/ScreenStateImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */