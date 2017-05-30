package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public class FenceTriggerInfoImpl
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<FenceTriggerInfoImpl> CREATOR = new k();
  private final int a;
  private final boolean b;
  private final String c;
  
  FenceTriggerInfoImpl(int paramInt, boolean paramBoolean, String paramString)
  {
    this.a = paramInt;
    this.b = paramBoolean;
    this.c = paramString;
  }
  
  int a()
  {
    return this.a;
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    k.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */