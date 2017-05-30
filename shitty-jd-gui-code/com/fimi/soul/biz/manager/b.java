package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.c;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.BroadcastMode;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class b
  implements Handler.Callback
{
  private static b a = null;
  private static final int b = 0;
  private static final int c = 3;
  private static final int d = 5;
  private static final int e = 6;
  private static final int f = 7;
  private static final int g = 9;
  private static final int h = 10;
  private static final int i = 8;
  private static final int j = 1;
  private static final int k = 4;
  private static final int l = 2;
  private c m = new com.fimi.soul.biz.l.b();
  private Handler n = new Handler(this);
  private Context o = null;
  private HashMap<Integer, k> p;
  
  public b(Context paramContext)
  {
    this.o = paramContext;
    this.p = new HashMap();
  }
  
  public static b a(Context paramContext)
  {
    if (a == null) {
      a = new b(paramContext);
    }
    return a;
  }
  
  public void a(k paramk)
  {
    this.p.put(Integer.valueOf(0), paramk);
    x.b(new a(0, null, 1, null));
  }
  
  public void a(BroadcastMode paramBroadcastMode, k paramk)
  {
    this.p.put(Integer.valueOf(1), paramk);
    x.b(new a(1, null, 1, paramBroadcastMode));
  }
  
  public void a(String paramString, int paramInt, b paramb, k paramk)
  {
    if (paramb == b.a)
    {
      this.p.put(Integer.valueOf(3), paramk);
      x.b(new a(3, paramString, paramInt, null));
    }
    do
    {
      return;
      if (paramb == b.d)
      {
        this.p.put(Integer.valueOf(7), paramk);
        x.b(new a(7, paramString, paramInt, null));
        return;
      }
      if (paramb == b.c)
      {
        this.p.put(Integer.valueOf(5), paramk);
        x.b(new a(5, paramString, paramInt, null));
        return;
      }
    } while (paramb != b.b);
    this.p.put(Integer.valueOf(6), paramk);
    x.b(new a(6, paramString, paramInt, null));
  }
  
  public void a(String paramString, k paramk)
  {
    BroadcastMode localBroadcastMode = new BroadcastMode();
    localBroadcastMode.setBroadcastID(paramString);
    this.p.put(Integer.valueOf(10), paramk);
    x.b(new a(10, null, 1, localBroadcastMode));
  }
  
  public void b(BroadcastMode paramBroadcastMode, k paramk)
  {
    this.p.put(Integer.valueOf(8), paramk);
    x.b(new a(8, null, 1, paramBroadcastMode));
  }
  
  public void c(BroadcastMode paramBroadcastMode, k paramk)
  {
    this.p.put(Integer.valueOf(9), paramk);
    x.b(new a(9, null, 1, paramBroadcastMode));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null) {
      ((k)this.p.get(Integer.valueOf(paramMessage.what))).a((PlaneMsg)paramMessage.obj, null);
    }
    return false;
  }
  
  class a
    implements Runnable
  {
    private int b;
    private BroadcastMode c;
    private String d;
    private int e;
    
    public a(int paramInt1, String paramString, int paramInt2, BroadcastMode paramBroadcastMode)
    {
      this.b = paramInt1;
      this.c = paramBroadcastMode;
      this.d = paramString;
      this.e = paramInt2;
    }
    
    public void run()
    {
      Message localMessage = b.a(b.this).obtainMessage();
      PlaneMsg localPlaneMsg = null;
      if (this.b == 0) {
        localPlaneMsg = b.c(b.this).a(b.b(b.this));
      }
      for (;;)
      {
        localMessage.what = this.b;
        localMessage.obj = localPlaneMsg;
        b.a(b.this).sendMessage(localMessage);
        return;
        if (this.b == 1) {
          localPlaneMsg = b.c(b.this).a(this.c, b.b(b.this));
        } else if (this.b == 3) {
          localPlaneMsg = b.c(b.this).a(b.b(b.this), this.d, this.e);
        } else if (this.b == 6) {
          localPlaneMsg = b.c(b.this).a(b.b(b.this), this.e);
        } else if (this.b == 5) {
          localPlaneMsg = b.c(b.this).b(b.b(b.this), this.e);
        } else if (this.b == 7) {
          localPlaneMsg = b.c(b.this).c(b.b(b.this), this.d, this.e);
        } else if (this.b == 8) {
          localPlaneMsg = b.c(b.this).b(this.c, b.b(b.this));
        } else if (this.b == 9) {
          localPlaneMsg = b.c(b.this).c(this.c, b.b(b.this));
        } else if (this.b == 10) {
          localPlaneMsg = b.c(b.this).c(this.c.getBroadcastID(), b.b(b.this));
        }
      }
    }
  }
  
  public static enum b
  {
    private b() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */