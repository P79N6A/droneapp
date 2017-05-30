package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.app.Presentation;
import android.content.Context;
import android.view.Display;
import android.view.Window;

@TargetApi(19)
public abstract class c
  extends Presentation
{
  public c(Context paramContext, Display paramDisplay)
  {
    super(paramContext, paramDisplay);
    a();
  }
  
  public c(Context paramContext, Display paramDisplay, int paramInt)
  {
    super(paramContext, paramDisplay, paramInt);
    a();
  }
  
  private void a()
  {
    Window localWindow = getWindow();
    if (localWindow != null)
    {
      localWindow.setType(2030);
      localWindow.addFlags(268435456);
      localWindow.addFlags(16777216);
      localWindow.addFlags(1024);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */