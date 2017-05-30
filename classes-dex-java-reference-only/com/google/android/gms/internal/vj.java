package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h;
import com.google.android.gms.c.h.a;

@aaa
public class vj
  extends h<uy>
{
  public vj()
  {
    super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
  }
  
  public uw a(Context paramContext, FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    try
    {
      e locale = f.a(paramContext);
      paramFrameLayout1 = f.a(paramFrameLayout1);
      paramFrameLayout2 = f.a(paramFrameLayout2);
      paramContext = uw.a.a(((uy)b(paramContext)).a(locale, paramFrameLayout1, paramFrameLayout2, 9683000));
      return paramContext;
    }
    catch (RemoteException paramContext)
    {
      b.d("Could not create remote NativeAdViewDelegate.", paramContext);
      return null;
    }
    catch (h.a paramContext)
    {
      for (;;) {}
    }
  }
  
  protected uy a(IBinder paramIBinder)
  {
    return uy.a.a(paramIBinder);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/vj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */