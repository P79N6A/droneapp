package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class n
  implements Handler.Callback
{
  private static n a = null;
  private static final int b = 0;
  private static final int c = 1;
  private static final int d = 2;
  private static final int e = 3;
  private HashMap<Integer, k> f;
  private com.fimi.soul.biz.l.n g;
  private Handler h;
  
  public n(Context paramContext)
  {
    this.g = new com.fimi.soul.biz.l.n(paramContext);
    this.h = new Handler(this);
    this.f = new HashMap();
  }
  
  public static n a(Context paramContext)
  {
    if (a == null) {
      a = new n(paramContext);
    }
    return a;
  }
  
  public String a()
  {
    return this.g.a();
  }
  
  public void a(k paramk)
  {
    this.f.put(Integer.valueOf(0), paramk);
    x.b(new a(0, null, null));
  }
  
  public void a(String paramString)
  {
    this.g.a(paramString);
  }
  
  public void a(String paramString1, String paramString2, k paramk)
  {
    this.f.put(Integer.valueOf(1), paramk);
    x.b(new a(1, paramString1, paramString2));
  }
  
  public void b(k paramk)
  {
    this.f.put(Integer.valueOf(2), paramk);
    x.b(new a(2, null, null));
  }
  
  public void c(k paramk)
  {
    this.f.put(Integer.valueOf(3), paramk);
    x.b(new a(3, null, null));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null) {
      ((k)this.f.get(Integer.valueOf(paramMessage.what))).a((PlaneMsg)paramMessage.obj, null);
    }
    return true;
  }
  
  class a
    implements Runnable
  {
    String a;
    String b;
    private int d;
    
    public a(int paramInt, String paramString1, String paramString2)
    {
      this.d = paramInt;
      this.b = paramString2;
      this.a = paramString1;
    }
    
    public void run()
    {
      Message localMessage = n.a(n.this).obtainMessage();
      Object localObject = null;
      if (this.d == 0)
      {
        PlaneMsg localPlaneMsg = n.b(n.this).c();
        localObject = localPlaneMsg;
        if (localPlaneMsg.isSuccess()) {
          localObject = n.b(n.this).b();
        }
      }
      for (;;)
      {
        localMessage.what = this.d;
        localMessage.obj = localObject;
        n.a(n.this).sendMessage(localMessage);
        return;
        if (this.d == 1) {
          localObject = n.b(n.this).a(this.a, this.b);
        } else if (this.d == 2) {
          localObject = n.b(n.this).c();
        } else if (this.d == 3) {
          localObject = n.b(n.this).d();
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */