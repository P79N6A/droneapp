package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.state.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class HeadphoneStateImpl
  extends AbstractSafeParcelable
  implements a
{
  public static final Parcelable.Creator<HeadphoneStateImpl> CREATOR = new d();
  private final int c;
  private final int d;
  
  HeadphoneStateImpl(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public int a()
  {
    return this.d;
  }
  
  int b()
  {
    return this.c;
  }
  
  public String toString()
  {
    switch (this.d)
    {
    default: 
      int i = this.d;
      return 35 + "unknown headphone state=" + i;
    case 1: 
      return "HEADPHONE_PLUGGED";
    }
    return "HEADPHONE_UNPLUGGED";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/HeadphoneStateImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */