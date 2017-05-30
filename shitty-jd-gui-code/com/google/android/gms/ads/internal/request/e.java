package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.p.b;
import com.google.android.gms.common.internal.p.c;
import com.google.android.gms.internal.aaa;

@aaa
public class e
  extends p<k>
{
  final int a;
  
  public e(Context paramContext, Looper paramLooper, p.b paramb, p.c paramc, int paramInt)
  {
    super(paramContext, paramLooper, 8, paramb, paramc, null);
    this.a = paramInt;
  }
  
  protected k a(IBinder paramIBinder)
  {
    return k.a.a(paramIBinder);
  }
  
  protected String a()
  {
    return "com.google.android.gms.ads.service.START";
  }
  
  protected String b()
  {
    return "com.google.android.gms.ads.internal.request.IAdRequestService";
  }
  
  public k b_()
  {
    return (k)super.G();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */