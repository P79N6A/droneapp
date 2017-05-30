package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.a;
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.ad;
import com.google.android.gms.analytics.internal.ak;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.adx;
import java.util.List;
import java.util.ListIterator;

public class h
  extends o<h>
{
  private final v b;
  private boolean c;
  
  public h(v paramv)
  {
    super(paramv.h(), paramv.d());
    this.b = paramv;
  }
  
  protected void a(l paraml)
  {
    paraml = (adx)paraml.b(adx.class);
    if (TextUtils.isEmpty(paraml.b())) {
      paraml.b(this.b.p().b());
    }
    if ((this.c) && (TextUtils.isEmpty(paraml.d())))
    {
      a locala = this.b.o();
      paraml.d(locala.c());
      paraml.a(locala.b());
    }
  }
  
  public void b(String paramString)
  {
    d.a(paramString);
    c(paramString);
    n().add(new i(this.b, paramString));
  }
  
  public void c(String paramString)
  {
    paramString = i.a(paramString);
    ListIterator localListIterator = n().listIterator();
    while (localListIterator.hasNext()) {
      if (paramString.equals(((r)localListIterator.next()).a())) {
        localListIterator.remove();
      }
    }
  }
  
  public void c(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  v k()
  {
    return this.b;
  }
  
  public l l()
  {
    l locall = m().a();
    locall.a(this.b.q().c());
    locall.a(this.b.r().b());
    b(locall);
    return locall;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */