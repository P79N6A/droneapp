package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.i;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.Plane;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class l
  implements Handler.Callback
{
  private static l a = null;
  private static final int b = 0;
  private static final int c = 1;
  private static final int d = 2;
  private i e = new com.fimi.soul.biz.l.l();
  private Handler f = new Handler(this);
  private Context g = null;
  private HashMap<Integer, k> h;
  
  public l(Context paramContext)
  {
    this.g = paramContext;
  }
  
  public static l a(Context paramContext)
  {
    if (a == null) {
      a = new l(paramContext);
    }
    return a;
  }
  
  public void a(k paramk)
  {
    this.h.put(Integer.valueOf(0), paramk);
    x.b(new a(0, null));
  }
  
  public void a(Plane paramPlane, k paramk)
  {
    this.h.put(Integer.valueOf(1), paramk);
    x.b(new a(1, paramPlane));
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
    private Plane c;
    
    public a(int paramInt, Plane paramPlane)
    {
      this.b = paramInt;
      this.c = paramPlane;
    }
    
    public void run()
    {
      Message localMessage = l.a(l.this).obtainMessage();
      Object localObject2 = null;
      Object localObject1;
      if (this.b == 0) {
        localObject1 = l.c(l.this).a(l.b(l.this));
      }
      for (;;)
      {
        localMessage.what = this.b;
        localMessage.obj = localObject1;
        l.a(l.this).sendMessage(localMessage);
        return;
        if (this.b == 1)
        {
          localObject1 = l.c(l.this).a(this.c, l.b(l.this));
        }
        else
        {
          localObject1 = localObject2;
          if (this.b == 2) {
            localObject1 = localObject2;
          }
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */