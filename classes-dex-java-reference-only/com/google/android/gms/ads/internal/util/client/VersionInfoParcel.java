package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public final class VersionInfoParcel
  extends AbstractSafeParcelable
{
  public static final d CREATOR = new d();
  public final int a;
  public String b;
  public int c;
  public int d;
  public boolean e;
  
  public VersionInfoParcel(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this(paramInt1, paramInt2, paramBoolean, false);
  }
  
  public VersionInfoParcel(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {}
  
  VersionInfoParcel(int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramBoolean;
  }
  
  public static VersionInfoParcel a()
  {
    return new VersionInfoParcel(9683208, 9683208, true);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/client/VersionInfoParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */