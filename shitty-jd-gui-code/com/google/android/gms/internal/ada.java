package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.s;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

@aaa
public class ada
{
  public acy a(Context paramContext, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, @Nullable ro paramro, VersionInfoParcel paramVersionInfoParcel)
  {
    return a(paramContext, paramAdSizeParcel, paramBoolean1, paramBoolean2, paramro, paramVersionInfoParcel, null, null, null);
  }
  
  public acy a(Context paramContext, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, @Nullable ro paramro, VersionInfoParcel paramVersionInfoParcel, un paramun, s params, d paramd)
  {
    paramContext = new adb(adc.a(paramContext, paramAdSizeParcel, paramBoolean1, paramBoolean2, paramro, paramVersionInfoParcel, paramun, params, paramd));
    paramContext.setWebViewClient(u.g().a(paramContext, paramBoolean2));
    paramContext.setWebChromeClient(u.g().c(paramContext));
    return paramContext;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ada.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */