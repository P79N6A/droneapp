package com.fimi.soul.module.update;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.update.i;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import java.io.File;
import java.util.List;

public class DowningActivity
  extends BaseActivity
{
  private static final int g = 100;
  private static final int h = 0;
  private static final int m = 1;
  a a = null;
  List<UpdateVersonBean> b;
  private ImageView c;
  private ProgressView d;
  private TextView e;
  private int f = 0;
  private long i = 0L;
  private int j = 1;
  private long k;
  private boolean l;
  private com.fimi.soul.drone.a n;
  private TextView o;
  private TextView p;
  private Toast q;
  
  private void a(UpdateVersonBean paramUpdateVersonBean)
  {
    this.a.b(paramUpdateVersonBean, this.a.e(paramUpdateVersonBean), new i()
    {
      public void a(boolean paramAnonymousBoolean, long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt)
      {
        if (!paramAnonymousBoolean)
        {
          Message localMessage = new Message();
          localMessage.what = 100;
          localMessage.arg1 = ((int)paramAnonymousLong1);
          localMessage.arg2 = ((int)paramAnonymousLong2);
          DowningActivity.a(DowningActivity.this).sendMessageDelayed(localMessage, 300L);
          return;
        }
        if (paramAnonymousLong1 == -2L)
        {
          DowningActivity.this.c();
          return;
        }
        if (DowningActivity.b(DowningActivity.this) < DowningActivity.c(DowningActivity.this))
        {
          DowningActivity.d(DowningActivity.this).sendEmptyMessageDelayed(0, 300L);
          return;
        }
        if (!DowningActivity.e(DowningActivity.this).U())
        {
          z.a(DowningActivity.this, 2131362252);
          DowningActivity.this.a(FlightActivity.class);
          return;
        }
        DowningActivity.this.a(FindNewFirmwareAvtivity.class);
      }
    });
  }
  
  private void a(List<UpdateVersonBean> paramList)
  {
    Object localObject = new File(j.p());
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdir();
    }
    if ((paramList != null) && (paramList.size() > 0))
    {
      this.f = paramList.size();
      this.a = new a();
      localObject = (UpdateVersonBean)paramList.get(0);
      this.i = l.a(paramList);
      this.d.setMaxCount((float)this.i);
      a((UpdateVersonBean)localObject);
    }
  }
  
  private void d()
  {
    if (this.l)
    {
      com.fimi.soul.biz.update.c.b = true;
      this.q.cancel();
      a(FindOnlineFirmwareAvtivity.class);
      finish();
      return;
    }
    this.l = true;
    this.q = Toast.makeText(getApplicationContext(), 2131362052, 0);
    this.q.show();
    getHandler().sendEmptyMessageDelayed(1, 2000L);
  }
  
  public void a()
  {
    this.o = ((TextView)findViewById(2131689723));
    this.p = ((TextView)findViewById(2131689724));
    ao.a(getAssets(), new View[] { this.o });
    ao.a(getAssets(), new View[] { this.p });
  }
  
  public void a(Class paramClass)
  {
    startActivity(new Intent(this, paramClass));
    finish();
    overridePendingTransition(17432576, 17432577);
  }
  
  public void b()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getString(2131362158));
    int i1 = 0;
    while (i1 < this.b.size())
    {
      localStringBuilder.append(((UpdateVersonBean)this.b.get(i1)).getSysname());
      if (i1 != this.b.size() - 1) {
        localStringBuilder.append(getString(2131362888));
      }
      i1 += 1;
    }
    this.p.setText(localStringBuilder.toString());
  }
  
  public void c()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i1 = this.j - 1;
    if (i1 < this.b.size())
    {
      localStringBuffer.append(((UpdateVersonBean)this.b.get(i1)).getSysname());
      if (i1 != this.b.size() - 1) {
        localStringBuffer.append(getString(2131362888));
      }
      for (;;)
      {
        i1 += 1;
        break;
        localStringBuffer.append(getString(2131362162));
      }
    }
    Intent localIntent = new Intent(this, DownFailedActivity.class);
    localIntent.putExtra("DownLoadFailedInfo", localStringBuffer.toString().substring(0, localStringBuffer.length() - 1));
    startActivity(localIntent);
    finish();
    overridePendingTransition(17432576, 17432577);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dpa.b(this);
    setContentView(2130968608);
    getWindow().setFlags(128, 128);
    this.c = ((ImageView)findViewById(2131689720));
    this.d = ((ProgressView)findViewById(2131689725));
    this.e = ((TextView)findViewById(2131689721));
    com.fimi.soul.biz.update.c.b = false;
    com.fimi.soul.biz.update.c.c = false;
    this.b = c.c().b("sp_need_down_firmwares", UpdateVersonBean.class);
    a(this.b);
    this.n = this.dpa.a;
    a();
    b();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    com.fimi.soul.biz.update.c.c = true;
  }
  
  public void onHandleMessage(Message paramMessage)
  {
    super.onHandleMessage(paramMessage);
    long l1;
    if (paramMessage.what == 100)
    {
      l1 = this.k + paramMessage.arg1;
      this.e.setText(100L * l1 / this.i + "");
      this.d.setCurrentCount((float)l1);
    }
    if (paramMessage.what == 0)
    {
      l1 = this.k;
      this.k = (Long.valueOf(((UpdateVersonBean)this.b.get(this.j - 1)).getSize()).longValue() + l1);
      UpdateVersonBean localUpdateVersonBean = (UpdateVersonBean)this.b.get(this.j);
      this.j += 1;
      a(localUpdateVersonBean);
    }
    if (paramMessage.what == 1) {
      this.l = false;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      d();
      return false;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    this.c.setBackgroundResource(2130838593);
    ((AnimationDrawable)this.c.getBackground()).start();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/DowningActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */