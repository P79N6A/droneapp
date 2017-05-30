package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public class VideoOptionsParcel
  extends AbstractSafeParcelable
{
  public static final r CREATOR = new r();
  public final int a;
  public final boolean b;
  
  public VideoOptionsParcel(int paramInt, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramBoolean;
  }
  
  public VideoOptionsParcel(i parami)
  {
    this(1, parami.a());
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    r.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/VideoOptionsParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */