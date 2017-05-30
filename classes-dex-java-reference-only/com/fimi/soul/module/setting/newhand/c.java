package com.fimi.soul.module.setting.newhand;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.fimi.kernel.utils.t;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.soul.entity.FlyModeLog;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.Setting;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.setting.i.d;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.f;
import com.fimi.soul.view.f.b;
import com.fimi.soul.view.f.d;
import java.io.File;
import java.util.List;

public class c
  extends d
{
  private static final int F = 3000;
  private static final int G = 1;
  public static final int a = 9;
  public static final byte b = 0;
  public static final byte c = 1;
  public static final byte d = 2;
  public static final byte e = 3;
  public static final byte f = 85;
  public static final byte g = -86;
  public static final byte h = 0;
  public static final byte i = 1;
  public static final int j = 60;
  private static final int l = 2;
  private static final int m = 3;
  private static final int n = 4;
  private static final int o = 5;
  private static final int p = 6;
  private static final int q = 7;
  private static final int r = 8;
  private static final int s = 9;
  private static final int t = 10;
  private static final int u = 11;
  private static final String v = "0";
  private static final String w = "1";
  private static final String x = "2";
  private static final String y = "3";
  private int A = 0;
  private int B = 0;
  private boolean C = false;
  private Context D;
  private com.fimi.soul.biz.o.a E;
  private Handler H = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if (1 == paramAnonymousMessage.what) {
        c.a(c.this);
      }
      switch (paramAnonymousMessage.what)
      {
      case 8: 
      case 9: 
      case 10: 
      case 11: 
      default: 
        return;
      case 2: 
        c.a(c.this, (byte)0);
        return;
      case 3: 
        c.a(c.this, (byte)1);
        return;
      case 6: 
        c.this.a(4, 1);
        return;
      case 7: 
        c.this.a(4, 0);
        return;
      case 4: 
        c.this.a(2, 1);
        return;
      }
      c.this.a(2, 0);
    }
  };
  com.fimi.soul.drone.a k;
  private int z = 0;
  
  public c(com.fimi.soul.drone.a parama, Context paramContext)
  {
    this.k = parama;
    this.D = paramContext;
    this.E = com.fimi.soul.biz.o.a.a(paramContext);
    this.C = com.fimi.kernel.c.e().m();
  }
  
  private com.fimi.soul.drone.c.a.c a(byte paramByte)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.b = 9;
    localc.c = 135;
    localc.d.b((byte)85);
    localc.d.b(paramByte);
    localc.d.b((byte)1);
    localc.d.b((byte)0);
    localc.d.b(0);
    localc.d.b((byte)0);
    return localc;
  }
  
  private FlyModeLog a(String paramString)
  {
    int i1 = ((com.fimi.soul.module.update.a.b)com.fimi.kernel.c.c().a("sp_firmware_cache", com.fimi.soul.module.update.a.b.class)).a();
    int i2 = ((com.fimi.soul.module.update.a.b)com.fimi.kernel.c.c().a("sp_firmware_cache", com.fimi.soul.module.update.a.b.class)).f();
    FlyModeLog localFlyModeLog = new FlyModeLog();
    localFlyModeLog.setUserID(com.fimi.soul.base.a.b(this.D).getUserID());
    localFlyModeLog.setFcVersion(i1 + "");
    localFlyModeLog.setOpenType(paramString);
    localFlyModeLog.setApplyTime(ao.b(System.currentTimeMillis()));
    localFlyModeLog.setX2Version(i2 + "");
    localFlyModeLog.setAppType("0");
    return localFlyModeLog;
  }
  
  private com.fimi.soul.drone.c.a.c b(int paramInt1, int paramInt2)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.b = 9;
    localc.c = 135;
    localc.d.b((byte)85);
    localc.d.b((byte)0);
    localc.d.b((byte)3);
    localc.d.b((byte)paramInt1);
    localc.d.b((byte)paramInt2);
    localc.d.b((byte)0);
    return localc;
  }
  
  private void b(byte paramByte)
  {
    this.k.T().a(a(paramByte));
  }
  
  private com.fimi.soul.drone.c.a.c d(int paramInt)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.b = 9;
    localc.c = 135;
    localc.d.b((byte)85);
    localc.d.b((byte)0);
    localc.d.b((byte)4);
    localc.d.b((byte)7);
    localc.d.a(paramInt);
    localc.d.b((byte)0);
    return localc;
  }
  
  private com.fimi.soul.drone.c.a.c e(int paramInt)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.b = 9;
    localc.c = 135;
    localc.d.b((byte)85);
    localc.d.b((byte)0);
    localc.d.b((byte)4);
    localc.d.b((byte)3);
    localc.d.a(paramInt);
    localc.d.b((byte)0);
    return localc;
  }
  
  private com.fimi.soul.drone.c.a.c f()
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.b = 9;
    localc.c = 135;
    localc.d.b((byte)-86);
    localc.d.b((byte)0);
    localc.d.b((byte)1);
    localc.d.b((byte)0);
    localc.d.b(0);
    localc.d.b((byte)0);
    return localc;
  }
  
  private com.fimi.soul.drone.c.a.c f(int paramInt)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.b = 9;
    localc.c = 135;
    localc.d.b((byte)85);
    localc.d.b((byte)0);
    localc.d.b((byte)4);
    localc.d.b((byte)5);
    localc.d.a(paramInt);
    localc.d.b((byte)0);
    return localc;
  }
  
  private com.fimi.soul.drone.c.a.c g()
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.b = 9;
    localc.c = 135;
    localc.d.b((byte)-86);
    localc.d.b((byte)0);
    localc.d.b((byte)3);
    localc.d.b((byte)0);
    localc.d.b(0);
    localc.d.b((byte)0);
    return localc;
  }
  
  private com.fimi.soul.drone.c.a.c h()
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.b = 9;
    localc.c = 135;
    localc.d.b((byte)-86);
    localc.d.b((byte)0);
    localc.d.b((byte)4);
    localc.d.b((byte)7);
    localc.d.a(0.0F);
    localc.d.b((byte)0);
    return localc;
  }
  
  private com.fimi.soul.drone.c.a.c i()
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.b = 9;
    localc.c = 135;
    localc.d.b((byte)-86);
    localc.d.b((byte)0);
    localc.d.b((byte)4);
    localc.d.b((byte)3);
    localc.d.a(0.0F);
    localc.d.b((byte)0);
    return localc;
  }
  
  private com.fimi.soul.drone.c.a.c j()
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.b = 9;
    localc.c = 135;
    localc.d.b((byte)-86);
    localc.d.b((byte)0);
    localc.d.b((byte)4);
    localc.d.b((byte)5);
    localc.d.a(0.0F);
    localc.d.b((byte)0);
    return localc;
  }
  
  private void k()
  {
    if ((com.fimi.kernel.c.b().b() != null) && (com.fimi.kernel.c.b().b().isShowing())) {
      com.fimi.kernel.c.b().c();
    }
  }
  
  public void a()
  {
    this.k.T().a(h());
  }
  
  public void a(int paramInt)
  {
    int i1 = paramInt;
    if (this.C) {
      i1 = (int)t.d(paramInt);
    }
    this.k.T().a(d(i1));
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.k.T().a(b(paramInt1, paramInt2));
  }
  
  public void a(int paramInt, final e parame)
  {
    this.z = paramInt;
    if (!this.k.U())
    {
      z.a(this.D, 2131362686, z.b);
      return;
    }
    if (this.k.ac())
    {
      z.a(this.D, this.D.getString(2131362523), z.b);
      return;
    }
    if (paramInt == 5000)
    {
      a(500);
      parame.a(500);
      return;
    }
    final FlyModeLog localFlyModeLog = a("2");
    new com.fimi.soul.view.f.a(this.D).a(this.D.getString(2131362695)).b(this.D.getString(2131362467)).a(this.D.getResources().getColor(2131624046)).b(this.D.getString(2131362693), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        c.this.a(5000);
        parame.a(5000);
        c.b(c.this).a(localFlyModeLog);
      }
    }).a(this.D.getString(2131362051), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    }).a().show();
  }
  
  public void a(SwitchButton paramSwitchButton, Setting paramSetting)
  {
    if (!this.k.U())
    {
      z.a(this.D, 2131362686, z.b);
      return;
    }
    if (this.k.ac())
    {
      z.a(this.D, this.D.getString(2131362526), z.b);
      return;
    }
    if (paramSetting.getIsOPen().booleanValue())
    {
      paramSwitchButton.a(false, true);
      b((byte)1);
      return;
    }
    paramSwitchButton.a(true, true);
    b((byte)0);
  }
  
  public void a(List<Setting> paramList)
  {
    if (((Setting)paramList.get(i.d.f.ordinal())).getIsOPen().booleanValue()) {
      return;
    }
    if (!this.k.U())
    {
      z.a(this.D, 2131362686, z.b);
      return;
    }
    if (this.k.ac())
    {
      z.a(this.D, this.D.getString(2131362521), z.b);
      return;
    }
    if (((Setting)paramList.get(i.d.i.ordinal())).getIsOPen().booleanValue())
    {
      a(4, 0);
      return;
    }
    new com.fimi.soul.view.f.a(this.D).a(this.D.getString(2131362695)).b(this.D.getString(2131362286)).a(this.D.getResources().getColor(2131624046)).b(this.D.getString(2131362693), new DialogInterface.OnClickListener()
    {
      public void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface = c.a(c.this, "1");
        paramAnonymousInt = com.fimi.kernel.c.e().l();
        if (paramAnonymousInt >= 2)
        {
          c.this.a(4, 1);
          c.b(c.this).a(paramAnonymousDialogInterface);
          return;
        }
        com.fimi.kernel.c.e().b(paramAnonymousInt + 1);
        new f.d(c.e(c.this)).a(2130838227).a(c.e(c.this).getString(2131362694)).a(c.e(c.this).getString(2131362175), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            c.this.a(4, 1);
            c.b(c.this).a(paramAnonymousDialogInterface);
          }
        }).a().show();
      }
    }).a(this.D.getString(2131362051), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    }).a().show();
  }
  
  public void a(final List<Setting> paramList, final com.fimi.soul.biz.manager.k paramk)
  {
    if (((Setting)paramList.get(i.d.f.ordinal())).getIsOPen().booleanValue()) {}
    while (((Setting)paramList.get(i.d.i.ordinal())).getIsOPen().booleanValue()) {
      return;
    }
    if (!this.k.U())
    {
      z.a(this.D, 2131362686, z.b);
      return;
    }
    if (this.k.ac())
    {
      z.a(this.D, this.D.getString(2131362527), z.b);
      return;
    }
    if (((Setting)paramList.get(i.d.h.ordinal())).getIsOPen().booleanValue())
    {
      a(2, 0);
      return;
    }
    paramList = a("0");
    new com.fimi.soul.view.f.a(this.D).a(this.D.getString(2131362695)).b(this.D.getString(2131361973)).a(this.D.getResources().getColor(2131624046)).b(this.D.getString(2131362175), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        c.this.a(2, 1);
        c.b(c.this).a(paramList);
        paramk.a(com.fimi.soul.base.a.b(c.e(c.this)), com.fimi.soul.biz.manager.k.b, new com.fimi.soul.biz.m.k()
        {
          public void a(PlaneMsg paramAnonymous2PlaneMsg, File paramAnonymous2File)
          {
            if (paramAnonymous2PlaneMsg.isSuccess()) {}
          }
        });
      }
    }).a(this.D.getString(2131362608), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    }).a().show();
  }
  
  public void b()
  {
    this.k.T().a(i());
  }
  
  public void b(int paramInt)
  {
    int i1 = paramInt;
    if (this.C) {
      i1 = (int)t.c(paramInt);
    }
    this.k.T().a(e(i1));
  }
  
  public void b(int paramInt, e parame)
  {
    this.A = paramInt;
    if (!this.k.U())
    {
      z.a(this.D, 2131362686, z.b);
      return;
    }
    if (this.k.ac())
    {
      z.a(this.D, this.D.getString(2131362525), z.b);
      return;
    }
    label93:
    final int i1;
    if (this.C)
    {
      parame = this.D.getString(2131362774);
      if (!this.C) {
        break label284;
      }
      paramInt = (int)t.b(18.0D);
      if (!com.fimi.kernel.c.e().m()) {
        break label290;
      }
      i1 = (int)t.b(3.0D);
      label110:
      if (!this.C) {
        break label295;
      }
      int i2 = (int)t.b(Integer.parseInt(com.fimi.kernel.c.e().g()));
    }
    for (;;)
    {
      new f.b(this.D).c(this.D.getString(2131362258)).a(i1).b(paramInt).d(this.D.getResources().getColor(2131624046)).a(parame).b(this.D.getString(2131362140)).a(true).c(this.A).a(this.D.getString(2131362051), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
      }).b(this.D.getString(2131362175), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          c.this.b(c.c(c.this));
        }
      }).a(new SeekBar.OnSeekBarChangeListener()
      {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
        {
          c.a(c.this, i1 + paramAnonymousInt);
        }
        
        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {}
        
        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {}
      }).a().show();
      return;
      parame = this.D.getString(2131362773);
      break;
      label284:
      paramInt = 18;
      break label93;
      label290:
      i1 = 3;
      break label110;
      label295:
      Integer.parseInt(com.fimi.kernel.c.e().g());
    }
  }
  
  public void c()
  {
    this.k.T().a(j());
  }
  
  public void c(int paramInt)
  {
    int i1 = paramInt;
    if (this.C) {
      i1 = (int)t.d(paramInt);
    }
    this.k.T().a(f(i1));
  }
  
  public void c(int paramInt, final e parame)
  {
    this.B = paramInt;
    if (!this.k.U())
    {
      z.a(this.D, 2131362686, z.b);
      return;
    }
    if (this.k.ac())
    {
      z.a(this.D, this.D.getString(2131362524), z.b);
      return;
    }
    String str;
    label101:
    final int i1;
    if (this.C)
    {
      str = this.D.getString(2131362150);
      if (!this.C) {
        break label280;
      }
      paramInt = (int)t.a(Integer.parseInt(com.fimi.kernel.c.e().h()));
      if (!this.C) {
        break label293;
      }
      i1 = (int)t.a(30.0D);
      label116:
      if (!this.C) {
        break label299;
      }
    }
    label280:
    label293:
    label299:
    for (int i2 = (int)t.a(500.0D);; i2 = 500)
    {
      new f.b(this.D).c(this.D.getString(2131362256)).a(i1).b(i2).d(this.D.getResources().getColor(2131624046)).a(str).b(this.D.getString(2131362139)).c(paramInt).a(this.D.getString(2131362051), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
      }).b(this.D.getString(2131362175), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          if (c.d(c.this) > 120)
          {
            new com.fimi.soul.view.f.a(c.e(c.this)).a(c.e(c.this).getString(2131362695)).b(c.e(c.this).getString(2131362468)).a(c.e(c.this).getResources().getColor(2131624046)).b(c.e(c.this).getString(2131362693), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                c.this.c(c.d(c.this));
                paramAnonymous2DialogInterface = c.a(c.this, "3");
                c.b(c.this).a(paramAnonymous2DialogInterface);
                c.12.this.a.a(c.d(c.this));
              }
            }).a(c.e(c.this).getString(2131362051), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int) {}
            }).a().show();
            return;
          }
          c.this.c(c.d(c.this));
          parame.a(c.d(c.this));
        }
      }).a(new SeekBar.OnSeekBarChangeListener()
      {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
        {
          c.b(c.this, i1 + paramAnonymousInt);
        }
        
        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {}
        
        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {}
      }).a().show();
      return;
      str = this.D.getString(2131362151);
      break;
      paramInt = Integer.parseInt(com.fimi.kernel.c.e().h());
      break label101;
      i1 = 30;
      break label116;
    }
  }
  
  public void d()
  {
    this.k.T().a(g());
  }
  
  public void e()
  {
    this.k.T().a(f());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */