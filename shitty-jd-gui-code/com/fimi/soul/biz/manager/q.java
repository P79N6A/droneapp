package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.o;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class q
  implements Handler.Callback
{
  private static q a = null;
  private static final int b = 0;
  private static final int c = 1;
  private HashMap<Integer, k> d;
  private o e = new o();
  private Context f = null;
  private Handler g = new Handler(this);
  
  public q(Context paramContext)
  {
    this.f = paramContext;
    this.d = new HashMap();
  }
  
  public static q a(Context paramContext)
  {
    if (a == null) {
      a = new q(paramContext);
    }
    return a;
  }
  
  public void a(k paramk)
  {
    this.d.put(Integer.valueOf(1), paramk);
    x.b(new a(1, null, null));
  }
  
  public void a(String paramString1, String paramString2, k paramk)
  {
    this.d.put(Integer.valueOf(0), paramk);
    x.b(new a(0, paramString1, paramString2));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null) {
      ((k)this.d.get(Integer.valueOf(paramMessage.what))).a((PlaneMsg)paramMessage.obj, null);
    }
    return true;
  }
  
  class a
    implements Runnable
  {
    private int b;
    private String c;
    private String d;
    
    public a(int paramInt, String paramString1, String paramString2)
    {
      this.b = paramInt;
      this.c = paramString1;
      this.d = paramString2;
    }
    
    public void run()
    {
      Message localMessage = q.a(q.this).obtainMessage();
      PlaneMsg localPlaneMsg = null;
      if (this.b == 0) {
        localPlaneMsg = q.c(q.this).a(this.c, this.d, q.b(q.this));
      }
      if (this.b == 1) {
        localPlaneMsg = q.c(q.this).a(q.b(q.this));
      }
      localMessage.what = this.b;
      localMessage.obj = localPlaneMsg;
      q.a(q.this).sendMessage(localMessage);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */