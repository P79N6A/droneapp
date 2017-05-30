package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.i;
import com.fimi.soul.biz.m.f;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class h
  implements Handler.Callback
{
  private static final int a = 0;
  private static h f;
  private Context b;
  private Handler c;
  private HashMap<Integer, k> d;
  private f e;
  
  private h(Context paramContext)
  {
    this.b = paramContext;
    this.c = new Handler(this);
    this.d = new HashMap();
    this.b = paramContext;
    this.e = new i();
  }
  
  public static h a(Context paramContext)
  {
    if (f == null) {
      f = new h(paramContext.getApplicationContext());
    }
    return f;
  }
  
  public void a(k paramk)
  {
    this.d.put(Integer.valueOf(0), paramk);
    x.b(new a(0));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null) {
      ((k)this.d.get(Integer.valueOf(paramMessage.what))).a((PlaneMsg)paramMessage.obj, null);
    }
    return false;
  }
  
  class a
    implements Runnable
  {
    int a;
    
    public a(int paramInt)
    {
      this.a = paramInt;
    }
    
    public void run()
    {
      Message localMessage = h.a(h.this).obtainMessage();
      PlaneMsg localPlaneMsg = null;
      if (this.a == 0) {
        localPlaneMsg = h.c(h.this).a(h.b(h.this));
      }
      localMessage.what = this.a;
      localMessage.obj = localPlaneMsg;
      h.a(h.this).sendMessage(localMessage);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */