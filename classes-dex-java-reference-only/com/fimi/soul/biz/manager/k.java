package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.h;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import java.util.HashMap;

public class k
  implements Handler.Callback
{
  public static String a = "1";
  public static String b = "2";
  private static k d = null;
  private static final int e = 1;
  private HashMap<Integer, com.fimi.soul.biz.m.k> c = new HashMap();
  private Context f = null;
  private h g;
  private Handler h;
  
  public k(Context paramContext)
  {
    this.f = paramContext;
    this.g = new com.fimi.soul.biz.l.k();
    this.h = new Handler(this);
  }
  
  public static k a(Context paramContext)
  {
    if (d == null) {
      d = new k(paramContext);
    }
    return d;
  }
  
  public void a(User paramUser, String paramString, com.fimi.soul.biz.m.k paramk)
  {
    this.c.put(Integer.valueOf(1), paramk);
    x.b(new a(1, paramString, paramUser));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null) {
      ((com.fimi.soul.biz.m.k)this.c.get(Integer.valueOf(paramMessage.what))).a((PlaneMsg)paramMessage.obj, null);
    }
    return false;
  }
  
  class a
    implements Runnable
  {
    private User b;
    private int c;
    private String d;
    
    public a(int paramInt, String paramString, User paramUser)
    {
      this.c = paramInt;
      this.b = paramUser;
      this.d = paramString;
    }
    
    public void run()
    {
      Message localMessage = k.a(k.this).obtainMessage();
      PlaneMsg localPlaneMsg = null;
      switch (this.c)
      {
      }
      for (;;)
      {
        localMessage.what = this.c;
        localMessage.obj = localPlaneMsg;
        k.a(k.this).sendMessage(localMessage);
        return;
        localPlaneMsg = k.c(k.this).a(this.b, this.d, k.b(k.this));
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */