package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.common.util.i;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abx;
import com.google.android.gms.internal.acr;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;

@aaa
public final class c
{
  public static abx a(Context paramContext, VersionInfoParcel paramVersionInfoParcel, acr<AdRequestInfoParcel> paramacr, a parama)
  {
    a(paramContext, paramVersionInfoParcel, paramacr, parama, new b()
    {
      public boolean a(VersionInfoParcel paramAnonymousVersionInfoParcel)
      {
        return (paramAnonymousVersionInfoParcel.e) || ((i.b(c.this)) && (!((Boolean)uf.I.c()).booleanValue()));
      }
    });
  }
  
  static abx a(Context paramContext, VersionInfoParcel paramVersionInfoParcel, acr<AdRequestInfoParcel> paramacr, a parama, b paramb)
  {
    if (paramb.a(paramVersionInfoParcel)) {
      return a(paramContext, paramacr, parama);
    }
    return b(paramContext, paramVersionInfoParcel, paramacr, parama);
  }
  
  private static abx a(Context paramContext, acr<AdRequestInfoParcel> paramacr, a parama)
  {
    abr.a("Fetching ad response from local ad request service.");
    paramContext = new d.a(paramContext, paramacr, parama);
    paramacr = (Void)paramContext.e();
    return paramContext;
  }
  
  private static abx b(Context paramContext, VersionInfoParcel paramVersionInfoParcel, acr<AdRequestInfoParcel> paramacr, a parama)
  {
    abr.a("Fetching ad response from remote ad request service.");
    if (!ac.a().b(paramContext))
    {
      abr.d("Failed to connect to remote ad request service.");
      return null;
    }
    return new d.b(paramContext, paramVersionInfoParcel, paramacr, parama);
  }
  
  public static abstract interface a
  {
    public abstract void a(AdResponseParcel paramAdResponseParcel);
  }
  
  static abstract interface b
  {
    public abstract boolean a(VersionInfoParcel paramVersionInfoParcel);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */