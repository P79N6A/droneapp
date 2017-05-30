package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DayAttributesImpl
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<DayAttributesImpl> CREATOR = new c();
  private final int a;
  private final int[] b;
  
  DayAttributesImpl(int paramInt, int[] paramArrayOfInt)
  {
    this.a = paramInt;
    this.b = paramArrayOfInt;
  }
  
  int a()
  {
    return this.a;
  }
  
  public int[] b()
  {
    return this.b;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Attributes=");
    if (this.b == null) {
      localStringBuilder.append("unknown");
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("[");
      int[] arrayOfInt = this.b;
      int k = arrayOfInt.length;
      int j = 1;
      int i = 0;
      while (i < k)
      {
        int m = arrayOfInt[i];
        if (j == 0) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append(m);
        i += 1;
        j = 0;
      }
      localStringBuilder.append("]");
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/DayAttributesImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */