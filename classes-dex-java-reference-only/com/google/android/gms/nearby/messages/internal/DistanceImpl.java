package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.b;
import java.util.Locale;

public class DistanceImpl
  extends AbstractSafeParcelable
  implements b
{
  public static final Parcelable.Creator<DistanceImpl> CREATOR = new e();
  final int b;
  public final int c;
  public final double d;
  
  public DistanceImpl(int paramInt, double paramDouble)
  {
    this(1, paramInt, paramDouble);
  }
  
  DistanceImpl(int paramInt1, int paramInt2, double paramDouble)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramDouble;
  }
  
  private static String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    }
    return "LOW";
  }
  
  public int a()
  {
    return this.c;
  }
  
  public int a(@NonNull b paramb)
  {
    if ((Double.isNaN(b())) && (Double.isNaN(paramb.b()))) {
      return 0;
    }
    return Double.compare(b(), paramb.b());
  }
  
  public double b()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof DistanceImpl)) {
        return false;
      }
      paramObject = (DistanceImpl)paramObject;
    } while ((a() == ((DistanceImpl)paramObject).a()) && (a((b)paramObject) == 0));
    return false;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { Integer.valueOf(a()), Double.valueOf(b()) });
  }
  
  public String toString()
  {
    return String.format(Locale.US, "(%.1fm, %s)", new Object[] { Double.valueOf(this.d), a(this.c) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/messages/internal/DistanceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */