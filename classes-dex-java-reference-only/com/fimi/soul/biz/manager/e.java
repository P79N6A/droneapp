package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.c;
import com.fimi.soul.biz.m.d;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class e
  implements Handler.Callback
{
  private static e a = null;
  private static final int b = 0;
  private static final int c = 1;
  private static final int d = 2;
  private static final int e = 3;
  private d f = new c();
  private Handler g = new Handler(this);
  private HashMap<Integer, k> h;
  private Context i = null;
  
  public e(Context paramContext)
  {
    this.i = paramContext;
    this.h = new HashMap();
  }
  
  public static e a(Context paramContext)
  {
    if (a == null) {
      a = new e(paramContext);
    }
    return a;
  }
  
  public void a(k paramk)
  {
    this.h.put(Integer.valueOf(0), paramk);
    x.b(new a(0));
  }
  
  public void b(k paramk)
  {
    this.h.put(Integer.valueOf(1), paramk);
    x.b(new a(1));
  }
  
  public void c(k paramk)
  {
    this.h.put(Integer.valueOf(2), paramk);
    x.b(new a(2));
  }
  
  public void d(k paramk)
  {
    this.h.put(Integer.valueOf(3), paramk);
    x.b(new a(3));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null) {
      ((k)this.h.get(Integer.valueOf(paramMessage.what))).a((PlaneMsg)paramMessage.obj, null);
    }
    return false;
  }
  
  class a
    implements Runnable
  {
    private int b;
    
    public a(int paramInt)
    {
      this.b = paramInt;
    }
    
    public void run()
    {
      Message localMessage = e.a(e.this).obtainMessage();
      PlaneMsg localPlaneMsg = null;
      if (this.b == 0) {
        localPlaneMsg = e.c(e.this).b(e.b(e.this));
      }
      for (;;)
      {
        localMessage.what = this.b;
        localMessage.obj = localPlaneMsg;
        e.a(e.this).sendMessage(localMessage);
        return;
        if (this.b == 1) {
          localPlaneMsg = e.c(e.this).c(e.b(e.this));
        } else if (this.b == 2) {
          localPlaneMsg = e.c(e.this).d(e.b(e.this));
        } else if (this.b == 3) {
          localPlaneMsg = e.c(e.this).e(e.b(e.this));
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */