package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.client.f;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.vj;
import com.google.android.gms.internal.yp;
import com.google.android.gms.internal.zf;

@aaa
public class ac
{
  private static final Object a = new Object();
  private static ac b;
  private final a c = new a();
  private final ab d = new ab(new v(), new u(), new j(), new vj(), new f(), new zf(), new yp());
  
  static
  {
    a(new ac());
  }
  
  public static a a()
  {
    return c().c;
  }
  
  protected static void a(ac paramac)
  {
    synchronized (a)
    {
      b = paramac;
      return;
    }
  }
  
  public static ab b()
  {
    return c().d;
  }
  
  private static ac c()
  {
    synchronized (a)
    {
      ac localac = b;
      return localac;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */