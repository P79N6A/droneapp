package com.google.android.gms.ads.internal.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public class CapabilityParcel
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<CapabilityParcel> CREATOR = new j();
  public final int a;
  public final boolean b;
  public final boolean c;
  public final boolean d;
  
  CapabilityParcel(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.a = paramInt;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramBoolean3;
  }
  
  public CapabilityParcel(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this(2, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public Bundle a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("iap_supported", this.b);
    localBundle.putBoolean("default_iap_supported", this.c);
    localBundle.putBoolean("app_streaming_supported", this.d);
    return localBundle;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    j.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/CapabilityParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */