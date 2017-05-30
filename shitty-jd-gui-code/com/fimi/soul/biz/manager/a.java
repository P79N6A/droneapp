package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.AddPlane;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class a
  implements Handler.Callback
{
  private static a a = null;
  private static final int e = 1;
  private Handler b = new Handler(this);
  private com.fimi.soul.biz.m.a c = new com.fimi.soul.biz.l.a();
  private HashMap<Integer, k> d;
  private Context f = null;
  
  public a(Context paramContext)
  {
    this.f = paramContext;
    this.d = new HashMap();
  }
  
  public static a a(Context paramContext)
  {
    if (a == null) {
      a = new a(paramContext);
    }
    return a;
  }
  
  public void a(AddPlane paramAddPlane, k paramk)
  {
    this.d.put(Integer.valueOf(1), paramk);
    x.b(new a(1, paramAddPlane));
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
    private int b;
    private AddPlane c;
    
    public a(int paramInt, AddPlane paramAddPlane)
    {
      this.b = paramInt;
      this.c = paramAddPlane;
    }
    
    public void run()
    {
      Message localMessage = a.a(a.this).obtainMessage();
      PlaneMsg localPlaneMsg = null;
      if (this.b == 1) {
        localPlaneMsg = a.c(a.this).a(this.c, a.b(a.this));
      }
      localMessage.what = this.b;
      localMessage.obj = localPlaneMsg;
      a.a(a.this).sendMessage(localMessage);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */