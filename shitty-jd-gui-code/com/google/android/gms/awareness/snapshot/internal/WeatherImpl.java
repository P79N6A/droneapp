package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.state.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.sw;

public class WeatherImpl
  extends AbstractSafeParcelable
  implements b
{
  public static final Parcelable.Creator<WeatherImpl> CREATOR = new o();
  private final int m;
  private final float n;
  private final float o;
  private final float p;
  private final int q;
  private final int[] r;
  
  WeatherImpl(int paramInt1, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt2, int[] paramArrayOfInt)
  {
    this.m = paramInt1;
    this.n = paramFloat1;
    this.o = paramFloat2;
    this.p = paramFloat3;
    this.q = paramInt2;
    this.r = paramArrayOfInt;
  }
  
  private static float a(float paramFloat)
  {
    return 5.0F * (paramFloat - 32.0F) / 9.0F;
  }
  
  static float a(int paramInt, float paramFloat)
  {
    float f = paramFloat;
    switch (paramInt)
    {
    default: 
      sw.a("WeatherImpl", "Invalid temperature unit %s", Integer.valueOf(paramInt));
      throw new IllegalArgumentException("Invalid temperature unit");
    case 2: 
      f = a(paramFloat);
    }
    return f;
  }
  
  public float a(int paramInt)
  {
    return a(paramInt, this.p);
  }
  
  int a()
  {
    return this.m;
  }
  
  public float b()
  {
    return this.p;
  }
  
  public float b(int paramInt)
  {
    return a(paramInt, this.o);
  }
  
  public float c()
  {
    return this.o;
  }
  
  public float c(int paramInt)
  {
    return a(paramInt, this.n);
  }
  
  public float d()
  {
    return this.n;
  }
  
  public int e()
  {
    return this.q;
  }
  
  public int[] f()
  {
    return this.r;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Temp=").append(c(1)).append("F/").append(c(2)).append("C, Feels=").append(b(1)).append("F/").append(b(2)).append("C, Dew=").append(a(1)).append("F/").append(a(2)).append("C, Humidity=").append(e()).append(", Condition=");
    if (f() == null) {
      localStringBuilder.append("unknown");
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("[");
      int[] arrayOfInt = f();
      int k = arrayOfInt.length;
      int j = 1;
      int i = 0;
      while (i < k)
      {
        int i1 = arrayOfInt[i];
        if (j == 0) {
          localStringBuilder.append(",");
        }
        localStringBuilder.append(i1);
        i += 1;
        j = 0;
      }
      localStringBuilder.append("]");
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/WeatherImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */