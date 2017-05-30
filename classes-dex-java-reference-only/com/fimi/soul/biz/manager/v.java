package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.r;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.m.n;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpdateDroneItem;
import java.util.HashMap;

public class v
  implements Handler.Callback
{
  private static v a = null;
  private static final int b = 0;
  private static final int c = 1;
  private static final int d = 2;
  private static final int e = 3;
  private static final int f = 4;
  private static final int g = 5;
  private n h = new r();
  private Handler i = new Handler(this);
  private HashMap<Integer, k> j;
  private Context k = null;
  
  public v(Context paramContext)
  {
    this.k = paramContext;
    this.j = new HashMap();
  }
  
  public static v a(Context paramContext)
  {
    if (a == null) {
      a = new v(paramContext);
    }
    return a;
  }
  
  public void a(UpdateDroneItem paramUpdateDroneItem, k paramk)
  {
    this.j.put(Integer.valueOf(0), paramk);
    x.b(new a(0, paramUpdateDroneItem));
  }
  
  public void a(String paramString, k paramk)
  {
    this.j.put(Integer.valueOf(2), paramk);
    x.b(new a(2, paramString));
  }
  
  public void a(String paramString1, String paramString2, int paramInt, k paramk)
  {
    this.j.put(Integer.valueOf(5), paramk);
    x.b(new a(5, paramString1, paramInt, paramString2));
  }
  
  public void b(UpdateDroneItem paramUpdateDroneItem, k paramk)
  {
    this.j.put(Integer.valueOf(1), paramk);
    x.b(new a(1, paramUpdateDroneItem));
  }
  
  public void b(String paramString, k paramk)
  {
    this.j.put(Integer.valueOf(3), paramk);
    x.b(new a(3, paramString));
  }
  
  public void c(String paramString, k paramk)
  {
    this.j.put(Integer.valueOf(4), paramk);
    x.b(new a(4, paramString));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null) {
      ((k)this.j.get(Integer.valueOf(paramMessage.what))).a((PlaneMsg)paramMessage.obj, null);
    }
    return false;
  }
  
  class a
    implements Runnable
  {
    private int b;
    private UpdateDroneItem c;
    private String d;
    private int e;
    private String f;
    
    public a(int paramInt, UpdateDroneItem paramUpdateDroneItem)
    {
      this.b = paramInt;
      this.c = paramUpdateDroneItem;
    }
    
    public a(int paramInt, String paramString)
    {
      this.d = paramString;
      this.b = paramInt;
    }
    
    public a(int paramInt1, String paramString, int paramInt2)
    {
      this.b = paramInt1;
      this.d = paramString;
      this.e = paramInt2;
    }
    
    public a(int paramInt1, String paramString1, int paramInt2, String paramString2)
    {
      this.b = paramInt1;
      this.d = paramString1;
      this.e = paramInt2;
      this.f = paramString2;
    }
    
    public void run()
    {
      Message localMessage = v.a(v.this).obtainMessage();
      PlaneMsg localPlaneMsg = null;
      if (this.b == 0) {
        localPlaneMsg = v.c(v.this).a(this.c, v.b(v.this));
      }
      for (;;)
      {
        localMessage.what = this.b;
        localMessage.obj = localPlaneMsg;
        v.a(v.this).sendMessage(localMessage);
        return;
        if (this.b == 1) {
          localPlaneMsg = v.c(v.this).b(this.c, v.b(v.this));
        } else if (this.b == 2) {
          localPlaneMsg = v.c(v.this).c(this.d, v.b(v.this));
        } else if (this.b == 3) {
          localPlaneMsg = v.c(v.this).d(this.d, v.b(v.this));
        } else if (this.b == 4) {
          localPlaneMsg = v.c(v.this).e(this.d, v.b(v.this));
        } else if (this.b == 5) {
          localPlaneMsg = v.c(v.this).a(this.d, this.f, this.e, v.b(v.this));
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */