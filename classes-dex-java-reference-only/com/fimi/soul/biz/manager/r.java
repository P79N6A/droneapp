package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.p;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.m.m;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class r
  implements Handler.Callback
{
  private static final int e = 0;
  private static final int f = 1;
  private static r g = null;
  private Handler a;
  private HashMap<Integer, k> b;
  private Context c;
  private m d;
  
  private r(Context paramContext)
  {
    this.c = paramContext;
    this.a = new Handler(this.c.getMainLooper(), this);
    this.d = new p();
    this.b = new HashMap();
  }
  
  public static r a(Context paramContext)
  {
    if (g == null) {
      g = new r(paramContext.getApplicationContext());
    }
    return g;
  }
  
  public void a(String paramString, k paramk)
  {
    this.b.put(Integer.valueOf(0), paramk);
    x.b(new a(0, paramString));
  }
  
  public void b(String paramString, k paramk)
  {
    this.b.put(Integer.valueOf(1), paramk);
    x.b(new a(1, paramString));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null) {
      ((k)this.b.get(Integer.valueOf(paramMessage.what))).a((PlaneMsg)paramMessage.obj, null);
    }
    return false;
  }
  
  class a
    implements Runnable
  {
    int a;
    String b;
    
    public a(int paramInt, String paramString)
    {
      this.a = paramInt;
      this.b = paramString;
    }
    
    public void run()
    {
      Message localMessage = r.a(r.this).obtainMessage();
      PlaneMsg localPlaneMsg = null;
      if (this.a == 0) {
        localPlaneMsg = r.c(r.this).c(this.b, r.b(r.this));
      }
      for (;;)
      {
        localMessage.what = this.a;
        localMessage.obj = localPlaneMsg;
        r.a(r.this).sendMessage(localMessage);
        return;
        if (this.a == 1) {
          localPlaneMsg = r.c(r.this).d(this.b, r.b(r.this));
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */