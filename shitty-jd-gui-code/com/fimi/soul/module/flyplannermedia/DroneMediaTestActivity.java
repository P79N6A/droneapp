package com.fimi.soul.module.flyplannermedia;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.c.f;
import com.fimi.soul.biz.camera.entity.X11FileSystem;
import com.fimi.soul.biz.camera.entity.X11RespCmd;

public class DroneMediaTestActivity
  extends BaseActivity
  implements e<X11RespCmd>
{
  com.fimi.soul.biz.camera.d a;
  long b = 0L;
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd)
  {
    Log.d("Good", paramX11RespCmd.getErrorMsg());
    switch (paramX11RespCmd.getMsg_id())
    {
    default: 
      return;
    case 257: 
      this.a.s().d();
      return;
    }
    getViewManager().a("切换目录成功！");
    this.a.s().f();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new Button(this);
    paramBundle.setText("获取IDR");
    paramBundle.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Log.d("Good", "开始获取IDR");
        DroneMediaTestActivity.this.b = System.currentTimeMillis();
        if (DroneMediaTestActivity.this.a.k().getCurDirFileList() != null) {}
      }
    });
    setContentView(paramBundle);
    this.a = ((com.fimi.soul.biz.camera.d)com.fimi.soul.biz.camera.b.a().d());
    this.a.a(new com.fimi.soul.biz.camera.b.d()
    {
      public void a(String paramAnonymousString1, String paramAnonymousString2)
      {
        long l = System.currentTimeMillis();
        paramAnonymousString1 = "花费:" + (l - DroneMediaTestActivity.this.b) + "毫秒";
        Log.d("Good", paramAnonymousString1);
        DroneMediaTestActivity.a(DroneMediaTestActivity.this).a(paramAnonymousString1);
      }
    });
    if (!this.a.d()) {
      this.a.t().b();
    }
    this.a.a(this);
    this.a.c(new com.fimi.kernel.b.c.d()
    {
      public void a(String paramAnonymousString)
      {
        Log.d("Good", paramAnonymousString + "");
      }
    });
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/flyplannermedia/DroneMediaTestActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */