package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.j;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.MessagePush;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class m
  implements Handler.Callback
{
  private static m d = null;
  private static final int f = 0;
  private Handler a;
  private HashMap<Integer, k> b;
  private Context c;
  private j e;
  
  private m(Context paramContext)
  {
    this.c = paramContext;
    this.b = new HashMap();
    this.c = paramContext;
    this.e = new com.fimi.soul.biz.l.m();
    this.a = new Handler(this);
  }
  
  public static m a(Context paramContext)
  {
    if (d == null) {
      d = new m(paramContext.getApplicationContext());
    }
    return d;
  }
  
  public void a(MessagePush paramMessagePush, k paramk)
  {
    this.b.put(Integer.valueOf(0), paramk);
    x.b(new a(0, paramMessagePush));
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
    MessagePush b;
    
    public a(int paramInt)
    {
      this.a = paramInt;
    }
    
    public a(int paramInt, MessagePush paramMessagePush)
    {
      this.a = paramInt;
      this.b = paramMessagePush;
    }
    
    public void run()
    {
      Message localMessage = m.a(m.this).obtainMessage();
      PlaneMsg localPlaneMsg = null;
      if (this.a == 0) {
        localPlaneMsg = m.c(m.this).a(this.b, m.b(m.this));
      }
      localMessage.what = this.a;
      localMessage.obj = localPlaneMsg;
      m.a(m.this).sendMessage(localMessage);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */