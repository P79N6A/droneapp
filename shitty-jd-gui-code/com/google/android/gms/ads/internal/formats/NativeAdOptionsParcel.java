package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public class NativeAdOptionsParcel
  extends AbstractSafeParcelable
{
  public static final k CREATOR = new k();
  public final int a;
  public final boolean b;
  public final int c;
  public final boolean d;
  public final int e;
  @Nullable
  public final VideoOptionsParcel f;
  
  public NativeAdOptionsParcel(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, int paramInt3, VideoOptionsParcel paramVideoOptionsParcel)
  {
    this.a = paramInt1;
    this.b = paramBoolean1;
    this.c = paramInt2;
    this.d = paramBoolean2;
    this.e = paramInt3;
    this.f = paramVideoOptionsParcel;
  }
  
  public NativeAdOptionsParcel(b paramb) {}
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    k.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/formats/NativeAdOptionsParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */