package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpgradeResultInfo;
import java.util.HashMap;

public class w
  implements Handler.Callback
{
  private static w a = null;
  private static final int b = 0;
  private static final int c = 1;
  private static final int d = 2;
  private static final int e = 3;
  private com.fimi.soul.biz.m.q f = new com.fimi.soul.biz.l.q();
  private Handler g = new Handler(paramContext.getMainLooper(), this);
  private HashMap<Integer, k> h;
  private Context i = null;
  
  public w(Context paramContext)
  {
    this.i = paramContext;
    this.h = new HashMap();
  }
  
  public static w a(Context paramContext)
  {
    if (a == null) {
      a = new w(paramContext);
    }
    return a;
  }
  
  public void a(k paramk)
  {
    this.h.put(Integer.valueOf(0), paramk);
    x.b(new a(0));
  }
  
  public void a(k paramk, UpgradeResultInfo paramUpgradeResultInfo)
  {
    this.h.put(Integer.valueOf(3), paramk);
    x.b(new a(3, paramUpgradeResultInfo));
  }
  
  public void a(k paramk, String paramString)
  {
    this.h.put(Integer.valueOf(1), paramk);
    x.b(new a(1, paramString));
  }
  
  public void b(k paramk)
  {
    this.h.put(Integer.valueOf(2), paramk);
    x.b(new a(2));
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
    private String c;
    private UpgradeResultInfo d;
    
    public a(int paramInt)
    {
      this.b = paramInt;
    }
    
    public a(int paramInt, UpgradeResultInfo paramUpgradeResultInfo)
    {
      this.b = paramInt;
      this.d = paramUpgradeResultInfo;
    }
    
    public a(int paramInt, String paramString)
    {
      this.b = paramInt;
      this.c = paramString;
    }
    
    public void run()
    {
      Message localMessage = w.a(w.this).obtainMessage();
      PlaneMsg localPlaneMsg = null;
      if (this.b == 0) {
        localPlaneMsg = w.c(w.this).a(w.b(w.this));
      }
      for (;;)
      {
        localMessage.what = this.b;
        localMessage.obj = localPlaneMsg;
        w.a(w.this).sendMessage(localMessage);
        return;
        if (this.b == 1) {
          localPlaneMsg = w.c(w.this).a(w.b(w.this), this.c);
        } else if (this.b == 2) {
          localPlaneMsg = w.c(w.this).b(w.b(w.this));
        } else if (this.b == 3) {
          localPlaneMsg = w.c(w.this).a(w.b(w.this), this.d);
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */