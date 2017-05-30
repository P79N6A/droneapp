package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi.a;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.ro;
import java.util.concurrent.Future;

@aaa
public class a
{
  public abq a(Context paramContext, AdRequestInfoParcel.a parama, ro paramro, a parama1)
  {
    if (parama.b.c.getBundle("sdk_less_server_data") != null) {}
    for (paramContext = new n(paramContext, parama, parama1);; paramContext = new b(paramContext, parama, paramro, parama1))
    {
      parama = (Future)paramContext.e();
      return paramContext;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(abi.a parama);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */