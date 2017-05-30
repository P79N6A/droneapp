package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;

@aaa
public class k
{
  private final String a;
  
  public k(String paramString)
  {
    this.a = paramString;
  }
  
  public String a()
  {
    return u.e().d();
  }
  
  public boolean a(String paramString, int paramInt, Intent paramIntent)
  {
    if ((paramString == null) || (paramIntent == null)) {}
    String str;
    do
    {
      return false;
      str = u.s().b(paramIntent);
      paramIntent = u.s().c(paramIntent);
    } while ((str == null) || (paramIntent == null));
    if (!paramString.equals(u.s().a(str)))
    {
      abr.d("Developer payload not match.");
      return false;
    }
    if ((this.a != null) && (!l.a(this.a, str, paramIntent)))
    {
      abr.d("Fail to verify signature.");
      return false;
    }
    return true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/purchase/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */