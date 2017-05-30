package com.google.android.gms.ads.internal.request;

import com.google.android.gms.internal.aaa;
import java.lang.ref.WeakReference;

@aaa
public final class g
  extends l.a
{
  private final WeakReference<c.a> a;
  
  public g(c.a parama)
  {
    this.a = new WeakReference(parama);
  }
  
  public void a(AdResponseParcel paramAdResponseParcel)
  {
    c.a locala = (c.a)this.a.get();
    if (locala != null) {
      locala.a(paramAdResponseParcel);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */