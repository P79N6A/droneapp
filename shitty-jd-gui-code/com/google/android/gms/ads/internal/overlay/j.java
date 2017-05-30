package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.un;

@aaa
public abstract class j
{
  @Nullable
  public abstract i a(Context paramContext, acy paramacy, int paramInt, boolean paramBoolean, un paramun);
  
  protected boolean a(Context paramContext)
  {
    paramContext = paramContext.getApplicationInfo();
    return (s.d()) && ((paramContext == null) || (paramContext.targetSdkVersion >= 11));
  }
  
  protected boolean a(acy paramacy)
  {
    return paramacy.k().e;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */