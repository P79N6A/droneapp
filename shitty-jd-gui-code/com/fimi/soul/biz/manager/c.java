package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.b;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.BroadcastComment;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class c
  implements Handler.Callback
{
  private static c a = null;
  private static final int b = 1;
  private static final int c = 2;
  private static final int d = 4;
  private static final int e = 3;
  private com.fimi.soul.biz.m.c f = new b();
  private Handler g = new Handler(this);
  private Context h = null;
  private HashMap<Integer, k> i;
  
  public c(Context paramContext)
  {
    this.h = paramContext;
    this.i = new HashMap();
  }
  
  public static c a(Context paramContext)
  {
    if (a == null) {
      a = new c(paramContext);
    }
    return a;
  }
  
  public void a(BroadcastComment paramBroadcastComment, k paramk)
  {
    this.i.put(Integer.valueOf(1), paramk);
    x.b(new a(1, null, 1, paramBroadcastComment));
  }
  
  public void a(String paramString, int paramInt, k paramk)
  {
    this.i.put(Integer.valueOf(3), paramk);
    x.b(new a(3, paramString, paramInt, null));
  }
  
  public void a(String paramString1, String paramString2, k paramk)
  {
    BroadcastComment localBroadcastComment = new BroadcastComment();
    localBroadcastComment.setUserID(paramString2);
    this.i.put(Integer.valueOf(2), paramk);
    x.b(new a(2, paramString1, 1, localBroadcastComment));
  }
  
  public void b(String paramString1, String paramString2, k paramk)
  {
    BroadcastComment localBroadcastComment = new BroadcastComment();
    localBroadcastComment.setUserID(paramString2);
    this.i.put(Integer.valueOf(4), paramk);
    x.b(new a(4, paramString1, 1, localBroadcastComment));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null) {
      ((k)this.i.get(Integer.valueOf(paramMessage.what))).a((PlaneMsg)paramMessage.obj, null);
    }
    return false;
  }
  
  class a
    implements Runnable
  {
    private int b;
    private BroadcastComment c;
    private String d;
    private int e;
    
    public a(int paramInt1, String paramString, int paramInt2, BroadcastComment paramBroadcastComment)
    {
      this.b = paramInt1;
      this.c = paramBroadcastComment;
      this.d = paramString;
      this.e = paramInt2;
    }
    
    public void run()
    {
      Message localMessage = c.a(c.this).obtainMessage();
      PlaneMsg localPlaneMsg = null;
      if (this.b == 1) {
        localPlaneMsg = c.c(c.this).a(c.b(c.this), this.c);
      }
      for (;;)
      {
        localMessage.what = this.b;
        localMessage.obj = localPlaneMsg;
        c.a(c.this).sendMessage(localMessage);
        return;
        if (this.b == 3) {
          localPlaneMsg = c.c(c.this).b(c.b(c.this), this.d, this.e);
        } else if (this.b == 2) {
          localPlaneMsg = c.c(c.this).a(c.b(c.this), this.d, this.c.getUserID());
        } else if (this.b == 4) {
          localPlaneMsg = c.c(c.this).b(c.b(c.this), this.d, this.c.getUserID());
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */