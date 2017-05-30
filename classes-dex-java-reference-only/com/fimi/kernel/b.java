package com.fimi.kernel;

import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.x;

public abstract class b
{
  private a a = new a();
  
  protected Handler a()
  {
    return this.a;
  }
  
  protected abstract void a(Message paramMessage);
  
  protected void a(Runnable paramRunnable)
  {
    x.a(paramRunnable);
  }
  
  class a
    extends Handler
  {
    a() {}
    
    public void handleMessage(Message paramMessage)
    {
      b.this.a(paramMessage);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */