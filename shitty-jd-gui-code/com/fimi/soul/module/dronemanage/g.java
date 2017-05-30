package com.fimi.soul.module.dronemanage;

import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.google.android.gms.maps.model.PolylineOptions;

abstract class g
{
  public PolylineOptions a = new PolylineOptions();
  private a b = new a();
  
  public g()
  {
    this.a.a(65280).a(5.0F);
  }
  
  public void a()
  {
    if (this.a != null)
    {
      this.a = null;
      this.a = new PolylineOptions();
      this.a.a(65280).a(5.0F);
    }
  }
  
  protected abstract void a(Message paramMessage);
  
  protected void a(Runnable paramRunnable)
  {
    x.a(paramRunnable);
  }
  
  protected Handler b()
  {
    return this.b;
  }
  
  class a
    extends Handler
  {
    a() {}
    
    public void handleMessage(Message paramMessage)
    {
      g.this.a(paramMessage);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/dronemanage/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */