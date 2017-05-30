package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

@aaa
@TargetApi(19)
public class zq
  extends zo
{
  private Object g = new Object();
  private PopupWindow h;
  private boolean i = false;
  
  zq(Context paramContext, abi.a parama, acy paramacy, zn.a parama1)
  {
    super(paramContext, parama, paramacy, parama1);
  }
  
  private void g()
  {
    synchronized (this.g)
    {
      this.i = true;
      if (((this.b instanceof Activity)) && (((Activity)this.b).isDestroyed())) {
        this.h = null;
      }
      if (this.h != null)
      {
        if (this.h.isShowing()) {
          this.h.dismiss();
        }
        this.h = null;
      }
      return;
    }
  }
  
  protected void a(int paramInt)
  {
    g();
    super.a(paramInt);
  }
  
  public void d()
  {
    g();
    super.d();
  }
  
  protected void f()
  {
    if ((this.b instanceof Activity)) {}
    Object localObject2;
    for (Window localWindow = ((Activity)this.b).getWindow();; localObject2 = null)
    {
      if ((localWindow == null) || (localWindow.getDecorView() == null)) {}
      while (((Activity)this.b).isDestroyed()) {
        return;
      }
      FrameLayout localFrameLayout = new FrameLayout(this.b);
      localFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      localFrameLayout.addView(this.c.b(), -1, -1);
      synchronized (this.g)
      {
        if (this.i) {
          return;
        }
      }
      this.h = new PopupWindow(localFrameLayout, 1, 1, false);
      this.h.setOutsideTouchable(true);
      this.h.setClippingEnabled(false);
      abr.a("Displaying the 1x1 popup off the screen.");
      try
      {
        this.h.showAtLocation(((Window)localObject1).getDecorView(), 0, -1, -1);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          this.h = null;
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */