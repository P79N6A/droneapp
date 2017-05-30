package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.un;

@aaa
public class n
  extends j
{
  @Nullable
  public i a(Context paramContext, acy paramacy, int paramInt, boolean paramBoolean, un paramun)
  {
    if (!a(paramContext)) {
      return null;
    }
    return new c(paramContext, paramBoolean, a(paramacy), new x(paramContext, paramacy.o(), paramacy.v(), paramun, paramacy.x()));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */