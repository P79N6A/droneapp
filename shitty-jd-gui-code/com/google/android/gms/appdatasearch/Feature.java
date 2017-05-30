package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Feature
  extends AbstractSafeParcelable
{
  public static final e CREATOR = new e();
  final int a;
  public final int b;
  final Bundle c;
  
  Feature(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramBundle;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof Feature))
    {
      paramObject = (Feature)paramObject;
      bool1 = bool2;
      if (c.a(Integer.valueOf(((Feature)paramObject).b), Integer.valueOf(this.b)))
      {
        bool1 = bool2;
        if (c.a(((Feature)paramObject).c, this.c)) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { Integer.valueOf(this.b), this.c });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e locale = CREATOR;
    e.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appdatasearch/Feature.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */