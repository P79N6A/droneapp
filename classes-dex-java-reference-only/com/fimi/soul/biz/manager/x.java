package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.l.s;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.m.o;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.Relation;
import com.fimi.soul.entity.User;
import com.xiaomi.account.openauth.XMAuthericationException;
import java.io.File;
import java.util.HashMap;

public class x
  implements Handler.Callback
{
  private static x a = null;
  private static final int b = 0;
  private static final int c = 1;
  private static final int d = 2;
  private static final int e = 3;
  private static final int f = 4;
  private static final int g = 5;
  private static final int h = 6;
  private static final int i = 7;
  private static final int j = 8;
  private static final int k = 10;
  private static final int l = 11;
  private static final int m = 12;
  private static final int n = 13;
  private static final int o = 14;
  private static final int p = 15;
  private static final int q = 16;
  private static final int r = 17;
  private static final int s = 18;
  private static final int t = 19;
  private o u;
  private f v;
  private Handler w;
  private HashMap<Integer, k> x;
  private Context y = null;
  
  public x(Context paramContext)
  {
    this.u = new s(paramContext);
    this.v = f.a(paramContext);
    this.w = new Handler(paramContext.getMainLooper(), this);
    this.y = paramContext;
    this.x = new HashMap();
  }
  
  public static x a(Context paramContext)
  {
    if (a == null) {
      a = new x(paramContext);
    }
    return a;
  }
  
  public void a(Context paramContext, k paramk)
  {
    this.v.a(new k()
    {
      public void a(PlaneMsg paramAnonymousPlaneMsg, File paramAnonymousFile)
      {
        a.a("Create fds server" + paramAnonymousPlaneMsg.isSuccess(), x.class);
      }
    });
    this.x.put(Integer.valueOf(3), paramk);
    com.fimi.kernel.utils.x.b(new a(3, 0, null));
  }
  
  public void a(k paramk)
  {
    this.x.put(Integer.valueOf(0), paramk);
    com.fimi.kernel.utils.x.b(new a(0, 0, null));
  }
  
  public void a(User paramUser, int paramInt, k paramk)
  {
    this.x.put(Integer.valueOf(11), paramk);
    com.fimi.kernel.utils.x.b(new a(11, 0, paramUser));
  }
  
  public void a(User paramUser, int paramInt, String paramString, k paramk)
  {
    this.x.put(Integer.valueOf(12), paramk);
    com.fimi.kernel.utils.x.b(new a(12, paramInt, paramUser, paramString));
  }
  
  public void a(User paramUser, k paramk)
  {
    this.x.put(Integer.valueOf(15), paramk);
    com.fimi.kernel.utils.x.b(new a(15, 0, paramUser));
  }
  
  public void a(String paramString, int paramInt, k paramk)
  {
    this.x.put(Integer.valueOf(6), paramk);
    paramk = new User();
    paramk.setUserID(paramString);
    com.fimi.kernel.utils.x.b(new a(6, paramInt, paramk));
  }
  
  public void a(String paramString, k paramk)
  {
    this.x.put(Integer.valueOf(14), paramk);
    paramk = new User();
    paramk.setUserID(a.b(this.y).getUserID());
    paramk.setDevice(paramString);
    com.fimi.kernel.utils.x.b(new a(14, 0, paramk));
  }
  
  public void a(String paramString1, String paramString2, k paramk)
  {
    this.x.put(Integer.valueOf(10), paramk);
    paramk = new User();
    paramk.setUserID(paramString1);
    paramk.setCountry(paramString2);
    com.fimi.kernel.utils.x.b(new a(10, 0, paramk));
  }
  
  public void b(k paramk)
  {
    this.x.put(Integer.valueOf(19), paramk);
    com.fimi.kernel.utils.x.b(new a(19, null));
  }
  
  public void b(User paramUser, k paramk)
  {
    this.x.put(Integer.valueOf(13), paramk);
    com.fimi.kernel.utils.x.b(new a(13, 0, paramUser));
  }
  
  public void b(String paramString, int paramInt, k paramk)
  {
    this.x.put(Integer.valueOf(16), paramk);
    paramk = new User();
    paramk.setUserID(paramString);
    com.fimi.kernel.utils.x.b(new a(16, paramInt, paramk));
  }
  
  public void b(String paramString, k paramk)
  {
    this.x.put(Integer.valueOf(18), paramk);
    com.fimi.kernel.utils.x.b(new a(18, paramString));
  }
  
  public void b(String paramString1, String paramString2, k paramk)
  {
    this.x.put(Integer.valueOf(7), paramk);
    paramk = new User();
    paramk.setUserID(paramString1);
    paramk.setCountry(paramString2);
    com.fimi.kernel.utils.x.b(new a(7, 0, paramk));
  }
  
  public void c(User paramUser, k paramk)
  {
    this.x.put(Integer.valueOf(4), paramk);
    com.fimi.kernel.utils.x.b(new a(4, 0, paramUser));
  }
  
  public void c(String paramString, int paramInt, k paramk)
  {
    this.x.put(Integer.valueOf(8), paramk);
    paramk = new User();
    paramk.setNickName(paramString);
    com.fimi.kernel.utils.x.b(new a(8, paramInt, paramk));
  }
  
  public void c(String paramString1, String paramString2, k paramk)
  {
    this.x.put(Integer.valueOf(2), paramk);
    com.fimi.kernel.utils.x.b(new a(2, 0, new User()));
  }
  
  public void d(User paramUser, k paramk)
  {
    this.x.put(Integer.valueOf(1), paramk);
    com.fimi.kernel.utils.x.b(new a(1, 0, paramUser));
  }
  
  public void d(String paramString1, String paramString2, k paramk)
  {
    this.x.put(Integer.valueOf(17), paramk);
    com.fimi.kernel.utils.x.b(new a(17, paramString1, paramString2));
  }
  
  public void e(User paramUser, k paramk)
  {
    this.x.put(Integer.valueOf(5), paramk);
    com.fimi.kernel.utils.x.b(new a(5, 0, paramUser));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null) {
      ((k)this.x.get(Integer.valueOf(paramMessage.what))).a((PlaneMsg)paramMessage.obj, null);
    }
    return false;
  }
  
  class a
    implements Runnable
  {
    private int b;
    private User c;
    private int d;
    private String e;
    private String f;
    private long g;
    private long h;
    private String i;
    private String j;
    
    public a(int paramInt1, int paramInt2, User paramUser)
    {
      this.b = paramInt1;
      this.c = paramUser;
      this.d = paramInt2;
    }
    
    public a(int paramInt1, int paramInt2, User paramUser, String paramString)
    {
      this.b = paramInt1;
      this.c = paramUser;
      this.d = paramInt2;
      this.e = paramString;
    }
    
    public a(int paramInt, String paramString)
    {
      this.b = paramInt;
      this.j = paramString;
    }
    
    public a(int paramInt1, String paramString, int paramInt2)
    {
      this.b = paramInt1;
      this.j = paramString;
      this.i = String.valueOf(paramInt2);
    }
    
    public a(int paramInt, String paramString1, long paramLong1, long paramLong2, String paramString2)
    {
      this.b = paramInt;
      this.f = paramString1;
      this.g = paramLong1;
      this.i = paramString2;
      this.h = paramLong2;
    }
    
    public a(int paramInt, String paramString1, String paramString2)
    {
      this.b = paramInt;
      this.f = paramString1;
      this.i = paramString2;
    }
    
    public void run()
    {
      Message localMessage = x.a(x.this).obtainMessage();
      Object localObject = null;
      if (this.b == 0) {
        localObject = x.c(x.this).a(x.b(x.this));
      }
      for (;;)
      {
        localMessage.what = this.b;
        localMessage.obj = localObject;
        x.a(x.this).sendMessage(localMessage);
        return;
        if (this.b == 1)
        {
          localObject = x.c(x.this).a(this.c, x.b(x.this));
        }
        else if (this.b == 3)
        {
          try
          {
            PlaneMsg localPlaneMsg = x.c(x.this).b(x.b(x.this));
            localObject = localPlaneMsg;
          }
          catch (XMAuthericationException localXMAuthericationException)
          {
            localXMAuthericationException.printStackTrace();
          }
        }
        else if (this.b == 4)
        {
          localObject = x.c(x.this).b(this.c, x.b(x.this));
        }
        else if (this.b == 5)
        {
          localObject = x.c(x.this).c(this.c, x.b(x.this));
        }
        else if (this.b == 6)
        {
          localObject = x.c(x.this).b(this.c.getUserID(), this.d, x.b(x.this));
        }
        else if (this.b == 16)
        {
          localObject = x.c(x.this).c(this.c.getUserID(), this.d, x.b(x.this));
        }
        else if (this.b == 8)
        {
          localObject = x.c(x.this).a(this.c.getNickName(), this.d, x.b(x.this));
        }
        else if (this.b == 7)
        {
          localObject = new Relation();
          ((Relation)localObject).setUserID(this.c.getUserID());
          ((Relation)localObject).setRelationID(this.c.getCountry());
          localObject = x.c(x.this).a((Relation)localObject, x.b(x.this));
        }
        else if (this.b == 10)
        {
          localObject = x.c(x.this).d(this.c, x.b(x.this));
        }
        else if (this.b == 11)
        {
          localObject = x.c(x.this).e(this.c, x.b(x.this));
        }
        else if (this.b == 12)
        {
          localObject = x.c(x.this).a(this.c, this.d, this.e, x.b(x.this));
        }
        else if (this.b == 13)
        {
          localObject = x.c(x.this).f(this.c, x.b(x.this));
        }
        else if (this.b == 14)
        {
          localObject = x.c(x.this).b(this.c.getUserID(), this.c.getDevice(), x.b(x.this));
        }
        else if (this.b == 15)
        {
          localObject = x.c(x.this).g(this.c, x.b(x.this));
        }
        else if (this.b == 17)
        {
          localObject = x.c(x.this).c(this.f, this.i, x.b(x.this));
        }
        else if (this.b == 18)
        {
          localObject = x.c(x.this).c(this.j, x.b(x.this));
        }
        else if (this.b == 19)
        {
          localObject = x.c(x.this).c(x.b(x.this));
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */