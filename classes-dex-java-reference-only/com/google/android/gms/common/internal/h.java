package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h.a;

public final class h
  extends com.google.android.gms.c.h<aj>
{
  private static final h a = new h();
  
  private h()
  {
    super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
  }
  
  public static View a(Context paramContext, int paramInt1, int paramInt2)
  {
    return a.b(paramContext, paramInt1, paramInt2);
  }
  
  private View b(Context paramContext, int paramInt1, int paramInt2)
  {
    try
    {
      SignInButtonConfig localSignInButtonConfig = new SignInButtonConfig(paramInt1, paramInt2, null);
      e locale = f.a(paramContext);
      paramContext = (View)f.a(((aj)b(paramContext)).a(locale, localSignInButtonConfig));
      return paramContext;
    }
    catch (Exception paramContext)
    {
      throw new h.a(64 + "Could not get button with size " + paramInt1 + " and color " + paramInt2, paramContext);
    }
  }
  
  public aj a(IBinder paramIBinder)
  {
    return aj.a.a(paramIBinder);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */