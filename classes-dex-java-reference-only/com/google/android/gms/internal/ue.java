package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.l;

@aaa
public class ue
{
  private final Object a = new Object();
  private boolean b = false;
  @Nullable
  private SharedPreferences c = null;
  
  public <T> T a(ub<T> paramub)
  {
    synchronized (this.a)
    {
      if (!this.b)
      {
        paramub = paramub.b();
        return paramub;
      }
      return (T)acj.a(new ue.1(this, paramub));
    }
  }
  
  public void a(Context paramContext)
  {
    synchronized (this.a)
    {
      if (this.b) {
        return;
      }
      paramContext = l.l(paramContext);
      if (paramContext == null) {
        return;
      }
    }
    this.c = u.o().a(paramContext);
    this.b = true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */