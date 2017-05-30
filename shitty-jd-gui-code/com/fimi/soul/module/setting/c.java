package com.fimi.soul.module.setting;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fimi.kernel.b.e;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.entity.APConfig;

public class c
  extends a
{
  private EditText a;
  private EditText b;
  private Button c;
  private TextView d;
  private TextView e;
  private TextView f;
  private com.fimi.soul.biz.e.b g = new com.fimi.soul.biz.e.b();
  private APConfig h;
  private String i;
  
  public c(Context paramContext)
  {
    super(paramContext);
  }
  
  private void g()
  {
    this.e = c(f().getString(2131362900), "");
    this.d = c(f().getString(2131362361), "");
    this.f = c(f().getString(2131362108), "");
    this.a = b(f().getString(2131361936), "");
    this.b = b(f().getString(2131362614), "");
    this.c = a("出厂设置", "恢复", new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        com.fimi.kernel.c.b().a();
        c.a(c.this).e(new e()
        {
          public void a(Boolean paramAnonymous2Boolean)
          {
            com.fimi.kernel.c.b().c();
            if (paramAnonymous2Boolean.booleanValue())
            {
              com.fimi.kernel.c.b().a("操作成功，中继重启");
              return;
            }
            com.fimi.kernel.c.b().a("操作失败");
          }
          
          public void b(Boolean paramAnonymous2Boolean)
          {
            com.fimi.kernel.c.b().c();
            com.fimi.kernel.c.b().a("操作失败");
          }
        });
      }
    });
    a.a locala = a(f().getString(2131362652), f().getString(2131362594));
    locala.a().setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        c.b(c.this);
      }
    });
    locala.b().setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        com.fimi.kernel.c.b().a();
        c.a(c.this).d(new e()
        {
          public void a(Boolean paramAnonymous2Boolean)
          {
            com.fimi.kernel.c.b().c();
            com.fimi.kernel.c.b().a("开始重启");
          }
          
          public void b(Boolean paramAnonymous2Boolean)
          {
            com.fimi.kernel.c.b().c();
            com.fimi.kernel.c.b().a("重置失败，请检查是否连接遥控器");
          }
        });
      }
    });
    this.g.b(new e()
    {
      public void a(APConfig paramAnonymousAPConfig)
      {
        if (paramAnonymousAPConfig != null)
        {
          c.a(c.this, paramAnonymousAPConfig);
          c.c(c.this).setText(paramAnonymousAPConfig.getSsid());
          c.d(c.this).setText(paramAnonymousAPConfig.getApPwd());
          c.e(c.this).setText(paramAnonymousAPConfig.getIpAddr());
          c.f(c.this).setText(paramAnonymousAPConfig.getVersion());
          c.g(c.this).setText(paramAnonymousAPConfig.getCountryCode());
        }
      }
      
      public void b(APConfig paramAnonymousAPConfig) {}
    });
  }
  
  private void h()
  {
    if (this.h != null)
    {
      this.h.setIpAddr(this.d.getText().toString());
      this.h.setApPwd(this.b.getText().toString());
      this.h.setSsid(this.a.getText().toString());
      com.fimi.kernel.c.b().a();
      this.g.a(this.h, new e()
      {
        public void a(Boolean paramAnonymousBoolean)
        {
          com.fimi.kernel.c.b().c();
          com.fimi.kernel.c.b().a("设置成功");
        }
        
        public void b(Boolean paramAnonymousBoolean)
        {
          com.fimi.kernel.c.b().c();
          com.fimi.kernel.c.b().a("设置失败，请检查中继网络");
        }
      });
    }
  }
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd) {}
  
  public View c()
  {
    g();
    return b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */