package com.fimi.soul.module.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.w;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.service.InitAppService;
import com.fimi.soul.utils.ao;
import java.io.File;

public class LaunchedActivity
  extends BaseActivity
  implements Handler.Callback
{
  private static final int e = 2;
  private static final int f = 3;
  boolean a = false;
  Intent b;
  v c;
  private final int d = 500;
  private Context g;
  private com.fimi.soul.biz.manager.x h;
  private Handler i;
  private boolean j = false;
  private TextView k;
  private TextView l;
  
  private void a(boolean paramBoolean)
  {
    this.j = paramBoolean;
    Message localMessage = new Message();
    localMessage.obj = Boolean.valueOf(this.j);
    localMessage.what = 2;
    this.i.sendMessageDelayed(localMessage, 500L);
  }
  
  private void b(boolean paramBoolean)
  {
    if (this.a) {
      return;
    }
    ao.k(this);
    this.a = true;
    this.i.removeMessages(2);
    this.i.removeMessages(3);
    Intent localIntent = new Intent(this, LoginActivity.class);
    localIntent.putExtra("login", paramBoolean);
    localIntent.putExtra("islaunchexit", true);
    Bundle localBundle1 = getIntent().getBundleExtra("launchBundle");
    if (localBundle1 != null)
    {
      Bundle localBundle2 = new Bundle();
      localBundle2.putString("redirectURL", localBundle1.getString("redirectURL"));
      localBundle2.putBoolean("islaunch", true);
      localIntent.putExtra("launchBundle", localBundle2);
    }
    startActivity(localIntent);
    finish();
    overridePendingTransition(17432576, 17432577);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    b(((Boolean)paramMessage.obj).booleanValue());
    return false;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968621);
    com.fimi.soul.utils.x.d();
    this.c = v.a(this);
    this.c.a().edit().putBoolean("is_setting_enter", false).commit();
    this.i = new Handler(this);
    this.mTintManager.a(true, this);
    this.g = this;
    this.b = new Intent(this, InitAppService.class);
    startService(this.b);
    paramBundle = new Message();
    if (!this.c.a().contains("isfirstloading")) {}
    for (boolean bool = true;; bool = false)
    {
      paramBundle.obj = Boolean.valueOf(bool);
      paramBundle.what = 3;
      this.i.sendMessageDelayed(paramBundle, 2000L);
      this.k = ((TextView)findViewById(2131689817));
      this.l = ((TextView)findViewById(2131689818));
      ao.a(getAssets(), new View[] { this.k, this.l });
      MyLocationManager.a(this.g);
      return;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.a = true;
  }
  
  protected void onResume()
  {
    super.onResume();
    this.a = false;
    com.fimi.kernel.utils.x.a(new Runnable()
    {
      public void run()
      {
        LaunchedActivity.a(LaunchedActivity.this, com.fimi.soul.biz.manager.x.a(LaunchedActivity.a(LaunchedActivity.this)));
        LaunchedActivity.this.speakTTs.a();
        if (LaunchedActivity.this.c.a().contains("isfirstloading"))
        {
          if (ao.b(LaunchedActivity.this))
          {
            LaunchedActivity.b(LaunchedActivity.this).a(LaunchedActivity.a(LaunchedActivity.this), new k()
            {
              public void a(PlaneMsg paramAnonymous2PlaneMsg, File paramAnonymous2File)
              {
                LaunchedActivity.a(LaunchedActivity.this, false);
              }
            });
            return;
          }
          a.a(LaunchedActivity.a(LaunchedActivity.this));
          LaunchedActivity.a(LaunchedActivity.this, false);
          return;
        }
        LaunchedActivity.a(LaunchedActivity.this, true);
      }
    });
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/login/LaunchedActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */