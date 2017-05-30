package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.u;

@aaa
public class zo
  extends zj
  implements acz.a
{
  zo(Context paramContext, abi.a parama, acy paramacy, zn.a parama1)
  {
    super(paramContext, parama, paramacy, parama1);
  }
  
  protected void b()
  {
    if (this.e.e != -2) {
      return;
    }
    this.c.l().a(this);
    f();
    abr.a("Loading HTML in WebView.");
    this.c.loadDataWithBaseURL(u.e().a(this.e.b), this.e.c, "text/html", "UTF-8", null);
  }
  
  protected void f() {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */