package com.fimi.soul.service;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.n;
import com.fimi.kernel.utils.u;
import com.fimi.soul.biz.update.d;
import com.fimi.soul.biz.update.f;
import com.fimi.soul.biz.update.f.c;
import com.fimi.soul.biz.update.i;
import com.fimi.soul.biz.update.k;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.receiver.SpeekSignReceiver;
import com.fimi.soul.utils.FlyLogTools;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public class InitAppService
  extends Service
{
  public static final String a = "sp_down_firmware";
  private volatile int b = 0;
  private com.fimi.soul.biz.update.a c = new com.fimi.soul.biz.update.a();
  private d d = new d();
  private f e = new f();
  private i f;
  private k<UpdateVersonBean> g;
  private i h;
  private SpeekSignReceiver i;
  private com.fimi.soul.biz.o.a j;
  private i k;
  
  private void a(f paramf, UpdateVersonBean paramUpdateVersonBean)
  {
    e();
    paramUpdateVersonBean.getSysname();
    Object localObject1 = new File(j.p());
    if (!((File)localObject1).exists()) {
      ((File)localObject1).mkdir();
    }
    localObject1 = paramUpdateVersonBean.getFileEncode();
    String str = paramf.e(paramUpdateVersonBean);
    Object localObject2 = new File(str);
    int n = 0;
    int m = n;
    if (((File)localObject2).exists())
    {
      localObject2 = u.a((File)localObject2);
      m = n;
      if (!n.b((String)localObject1))
      {
        m = n;
        if (((String)localObject1).equals(localObject2)) {
          m = 1;
        }
      }
    }
    if (m == 0) {
      paramf.b(paramUpdateVersonBean, str, new i()
      {
        public void a(boolean paramAnonymousBoolean, long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt)
        {
          if (!paramAnonymousBoolean) {
            return;
          }
          InitAppService.a(InitAppService.this);
        }
      });
    }
  }
  
  private void e()
  {
    try
    {
      this.b += 1;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void f()
  {
    try
    {
      this.b -= 1;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void g()
  {
    if (ao.c(getBaseContext()))
    {
      if (!b()) {
        c();
      }
      return;
    }
    if (ao.b(getBaseContext()))
    {
      d();
      return;
    }
    Log.d("Good", "没有网络");
  }
  
  private void h()
  {
    final f localf = new f();
    localf.a(new f.c()
    {
      public void a(List<UpdateVersonBean> paramAnonymousList)
      {
        InitAppService.this.a(paramAnonymousList);
        if ((paramAnonymousList == null) || (paramAnonymousList.size() < 1)) {}
        for (;;)
        {
          return;
          com.fimi.soul.biz.update.c.c = false;
          com.fimi.soul.biz.update.c.b = false;
          paramAnonymousList = com.fimi.soul.module.update.a.a.a().e();
          if ((paramAnonymousList != null) && (paramAnonymousList.size() > 0))
          {
            paramAnonymousList = paramAnonymousList.iterator();
            while (paramAnonymousList.hasNext())
            {
              UpdateVersonBean localUpdateVersonBean = (UpdateVersonBean)paramAnonymousList.next();
              InitAppService.a(InitAppService.this, localf, localUpdateVersonBean);
            }
          }
        }
      }
    });
  }
  
  public void a()
  {
    this.f = null;
    this.g = null;
    this.h = null;
  }
  
  public void a(i parami)
  {
    this.k = parami;
  }
  
  public void a(k<UpdateVersonBean> paramk)
  {
    this.g = paramk;
  }
  
  public void a(List<UpdateVersonBean> paramList)
  {
    if ((paramList == null) || (paramList.size() < 1))
    {
      c.c().a("sp_down_firmware", "");
      return;
    }
    c.c().a("sp_down_firmware", paramList);
  }
  
  public void b(i parami)
  {
    this.h = parami;
  }
  
  /* Error */
  public boolean b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 41	com/fimi/soul/service/InitAppService:b	I
    //   6: istore_1
    //   7: iload_1
    //   8: ifle +9 -> 17
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_2
    //   19: goto -6 -> 13
    //   22: astore_3
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_3
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	InitAppService
    //   6	2	1	m	int
    //   12	7	2	bool	boolean
    //   22	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public void c()
  {
    try
    {
      if ((!b()) && (ao.c(getBaseContext()))) {
        h();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void c(i parami)
  {
    this.f = parami;
  }
  
  public void d()
  {
    this.e.a(new f.c()
    {
      public void a(List<UpdateVersonBean> paramAnonymousList)
      {
        InitAppService.this.a(paramAnonymousList);
      }
    });
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return new a();
  }
  
  public void onCreate()
  {
    super.onCreate();
    this.i = new SpeekSignReceiver();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    registerReceiver(this.i, localIntentFilter);
    this.j = com.fimi.soul.biz.o.a.a(getBaseContext());
    this.j.a();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (this.i != null) {
      unregisterReceiver(this.i);
    }
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    f.n();
    g();
    FlyLogTools.a(this).a();
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
  
  public class a
    extends Binder
  {
    public a() {}
    
    public InitAppService a()
    {
      return InitAppService.this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/service/InitAppService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */