package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.j;
import com.fimi.soul.biz.m.g;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.HomePage;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class i
  implements Handler.Callback
{
  private static i a = null;
  private static final int b = 10;
  private static final int c = 11;
  private static final int d = 12;
  private Context e = null;
  private HashMap<Integer, k> f;
  private Handler g;
  private g h;
  
  public i(Context paramContext)
  {
    this.e = paramContext;
    this.f = new HashMap();
    this.g = new Handler(this);
    this.h = new j();
  }
  
  public static i a(Context paramContext)
  {
    if (a == null) {
      a = new i(paramContext);
    }
    return a;
  }
  
  public void a(k paramk)
  {
    this.f.put(Integer.valueOf(10), paramk);
    x.b(new a(10, null));
  }
  
  public void a(HomePage paramHomePage, k paramk)
  {
    this.f.put(Integer.valueOf(12), paramk);
    x.b(new a(12, paramHomePage));
  }
  
  public void b(HomePage paramHomePage, k paramk)
  {
    this.f.put(Integer.valueOf(11), paramk);
    x.b(new a(11, paramHomePage));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null) {
      ((k)this.f.get(Integer.valueOf(paramMessage.what))).a((PlaneMsg)paramMessage.obj, null);
    }
    return false;
  }
  
  class a
    implements Runnable
  {
    private int b;
    private HomePage c;
    
    public a(int paramInt, HomePage paramHomePage)
    {
      this.b = paramInt;
      this.c = paramHomePage;
    }
    
    public void run()
    {
      Message localMessage = i.a(i.this).obtainMessage();
      PlaneMsg localPlaneMsg = null;
      if (this.b == 11) {
        localPlaneMsg = i.c(i.this).a(this.c, i.b(i.this));
      }
      for (;;)
      {
        localMessage.what = this.b;
        localMessage.obj = localPlaneMsg;
        i.a(i.this).sendMessage(localMessage);
        return;
        if (this.b == 12) {
          localPlaneMsg = i.c(i.this).b(this.c, i.b(i.this));
        } else if (this.b == 10) {
          localPlaneMsg = i.c(i.this).b(i.b(i.this));
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */