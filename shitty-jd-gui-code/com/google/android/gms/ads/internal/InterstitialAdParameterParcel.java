package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public final class InterstitialAdParameterParcel
  extends AbstractSafeParcelable
{
  public static final m CREATOR = new m();
  public final int a;
  public final boolean b;
  public final boolean c;
  public final String d;
  public final boolean e;
  public final float f;
  public final int g;
  
  InterstitialAdParameterParcel(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, float paramFloat, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramString;
    this.e = paramBoolean3;
    this.f = paramFloat;
    this.g = paramInt2;
  }
  
  public InterstitialAdParameterParcel(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat, int paramInt)
  {
    this(3, paramBoolean1, paramBoolean2, null, paramBoolean3, paramFloat, paramInt);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    m.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/InterstitialAdParameterParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */