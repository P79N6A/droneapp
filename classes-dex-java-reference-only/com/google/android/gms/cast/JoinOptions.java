package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class JoinOptions
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<JoinOptions> CREATOR = new k();
  private final int a;
  private int b;
  
  public JoinOptions()
  {
    this(1, 0);
  }
  
  JoinOptions(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof JoinOptions)) {
        return false;
      }
      paramObject = (JoinOptions)paramObject;
    } while (this.b == ((JoinOptions)paramObject).b);
    return false;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { Integer.valueOf(this.b) });
  }
  
  public String toString()
  {
    String str;
    switch (this.b)
    {
    case 1: 
    default: 
      str = "UNKNOWN";
    }
    for (;;)
    {
      return String.format("joinOptions(connectionType=%s)", new Object[] { str });
      str = "STRONG";
      continue;
      str = "INVISIBLE";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    k.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/JoinOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */