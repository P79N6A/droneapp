package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

@aaa
public class zp
  extends abq
{
  private final zn.a a;
  private final AdResponseParcel b;
  private final abi.a c;
  
  public zp(abi.a parama, zn.a parama1)
  {
    this.c = parama;
    this.b = this.c.b;
    this.a = parama1;
  }
  
  private abi a(int paramInt)
  {
    return new abi(this.c.a.c, null, null, paramInt, null, null, this.b.l, this.b.k, this.c.a.i, false, null, null, null, null, null, this.b.i, this.c.d, this.b.g, this.c.f, this.b.n, this.b.o, this.c.h, null, null, null, null, this.c.b.F, this.c.b.G, null, null, null);
  }
  
  public void a()
  {
    abi localabi = a(0);
    abv.a.post(new zp.1(this, localabi));
  }
  
  public void b() {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */