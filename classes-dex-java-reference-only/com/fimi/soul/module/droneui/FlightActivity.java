package com.fimi.soul.module.droneui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.c.a;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.o;
import com.fimi.soul.drone.c.a.a.bf;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.ba;
import com.fimi.soul.entity.DroneModelType;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.media.player.FimiMediaPlayer;
import com.fimi.soul.module.droneFragment.DroneTakePhotoFragment;
import com.fimi.soul.module.droneFragment.FlyActionSettingFragment;
import com.fimi.soul.module.droneFragment.ShowDroneStatusFragment;
import com.fimi.soul.module.droneFragment.ShowDroneStatusLineFragment;
import com.fimi.soul.module.droneFragment.ShowDroneUiFragment;
import com.fimi.soul.module.droneFragment.ShowDroneUiFragment.d;
import com.fimi.soul.module.dronemanage.FlightMapFragment;
import com.fimi.soul.module.dronemanage.FlightMapFragment.a;
import com.fimi.soul.module.insurance.ReceiveInsuranceActivity;
import com.fimi.soul.module.login.FirstLeadFragment;
import com.fimi.soul.module.login.FirstLeadFragment.a;
import com.fimi.soul.module.push.MessageDetailActivity;
import com.fimi.soul.module.setting.MapSettingFragment;
import com.fimi.soul.module.setting.MapSettingFragment.a;
import com.fimi.soul.module.social.WebViewActivity;
import com.fimi.soul.service.CheckCampassCaliService;
import com.fimi.soul.service.RequestVersionService;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.MapWrapperLayout;
import com.fimi.soul.view.c.c;
import com.fimi.soul.view.f;
import com.fimi.soul.view.f.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class FlightActivity
  extends BaseActivity
  implements d.b, ShowDroneUiFragment.d, com.fimi.soul.module.droneFragment.d, FlightMapFragment.a, FirstLeadFragment.a, MapSettingFragment.a
{
  private static final int m = 1;
  private static final int u = 123;
  private static final int z = 15;
  View a;
  public b b = b.a;
  Timer c = null;
  a d;
  private FragmentManager e;
  private FlightMapFragment f;
  private FirstLeadFragment g;
  private ShowDroneUiFragment h;
  private ShowDroneStatusFragment i;
  private ShowDroneStatusLineFragment j;
  private DroneTakePhotoFragment k;
  private MapSettingFragment l;
  private boolean n = true;
  private ProgressBar o;
  private Handler p = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if ((paramAnonymousMessage.what == 1) && (FlightActivity.a(FlightActivity.this))) {
        if (com.fimi.soul.biz.c.h.a(FlightActivity.this.getApplicationContext()).a().get() != 4)
        {
          z.a(FlightActivity.this, 2131362864, 3000);
          FlightActivity.b(FlightActivity.this).setVisibility(8);
        }
      }
      do
      {
        return;
        if (((com.fimi.soul.biz.camera.d)com.fimi.soul.biz.camera.b.a().d()).f() != c.a.c)
        {
          z.a(FlightActivity.this, 2131362536, 3000);
          break;
        }
        z.a(FlightActivity.this, 2131362865, 3000);
        break;
        if (paramAnonymousMessage.what == 123)
        {
          if (FlightActivity.c(FlightActivity.this) > 0)
          {
            sendEmptyMessageDelayed(123, 1000L);
            FlightActivity.d(FlightActivity.this).setText(FlightActivity.c(FlightActivity.this) + "");
            FlightActivity.d(FlightActivity.this).setVisibility(0);
            FlightActivity.e(FlightActivity.this);
            return;
          }
          FlightActivity.d(FlightActivity.this).setVisibility(8);
          FlightActivity.this.drone.a(d.a.bP);
          return;
        }
      } while ((paramAnonymousMessage.what != 15) || (!FlightActivity.this.drone.W()) || (!FlightActivity.this.drone.U()));
      FlightActivity.f(FlightActivity.this).a(true);
    }
  };
  private RelativeLayout q;
  private DrawerLayout r;
  private FlyActionSettingFragment s;
  private TextView t;
  private int v = 5;
  private v w;
  private boolean x;
  private Toast y;
  
  private void a(int paramInt)
  {
    if (!this.o.isShown())
    {
      this.o.setVisibility(0);
      if (this.p.hasMessages(1)) {
        this.p.removeMessages(1);
      }
      this.n = true;
      if (com.fimi.soul.biz.c.d.k().f().size() < 1) {
        this.p.sendEmptyMessageDelayed(1, paramInt);
      }
    }
    else
    {
      return;
    }
    this.p.sendEmptyMessageDelayed(1, com.fimi.soul.biz.c.d.k().f().size() * 2000);
  }
  
  private void l()
  {
    Object localObject = new File(ao.o(this));
    if (!((File)localObject).exists()) {
      try
      {
        ((File)localObject).createNewFile();
        InputStream localInputStream = getAssets().open("NoFlyZone-V1.0.0-DB.sqlite");
        localObject = new FileOutputStream((File)localObject);
        byte[] arrayOfByte = new byte['ࠀ'];
        for (;;)
        {
          int i1 = localInputStream.read(arrayOfByte);
          if (i1 == -1) {
            break;
          }
          ((FileOutputStream)localObject).write(arrayOfByte, 0, i1);
        }
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
    ((FileOutputStream)localObject).flush();
    ((FileOutputStream)localObject).close();
    localException.close();
  }
  
  private void m() {}
  
  private void n()
  {
    if (!this.q.isShown())
    {
      this.q.setVisibility(0);
      this.e.beginTransaction().hide(this.s).commitAllowingStateLoss();
      if (this.k.isVisible()) {
        this.e.beginTransaction().hide(this.k).commitAllowingStateLoss();
      }
      this.drone.a(d.a.br);
    }
  }
  
  private void o()
  {
    if (this.x)
    {
      this.y.cancel();
      finish();
      Process.killProcess(Process.myPid());
      this.h.e();
      return;
    }
    this.x = true;
    this.y = Toast.makeText(getApplicationContext(), 2131361962, 0);
    this.y.show();
    getHandler().sendEmptyMessageDelayed(0, 2000L);
  }
  
  private void p()
  {
    com.fimi.soul.biz.manager.h.a(this).a(new k()
    {
      public void a(final PlaneMsg paramAnonymousPlaneMsg, File paramAnonymousFile)
      {
        if (paramAnonymousPlaneMsg.isSuccess())
        {
          paramAnonymousPlaneMsg = (HistoryPushMessage)paramAnonymousPlaneMsg.getData();
          paramAnonymousPlaneMsg.setTime(new SimpleDateFormat("yyyy.MM.dd").format(new Date()));
          paramAnonymousFile = com.fimi.soul.utils.a.b.a(FlightActivity.this);
          if (!paramAnonymousFile.b(paramAnonymousPlaneMsg))
          {
            paramAnonymousFile.a(paramAnonymousPlaneMsg);
            new com.fimi.soul.view.f.a(FlightActivity.this).a(paramAnonymousPlaneMsg.getTitle()).b(paramAnonymousPlaneMsg.getPayload()).a(FlightActivity.this.getResources().getColor(2131624047)).b(FlightActivity.this.getString(2131362175), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                paramAnonymous2DialogInterface = new Intent(FlightActivity.this, MessageDetailActivity.class);
                paramAnonymous2DialogInterface.setFlags(268435456);
                paramAnonymous2DialogInterface.putExtra("redirectURL", paramAnonymousPlaneMsg.getRedirectURL());
                FlightActivity.this.startActivity(paramAnonymous2DialogInterface);
              }
            }).d(17).a(FlightActivity.this.getString(2131362136), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int) {}
            }).a().show();
          }
        }
      }
    });
  }
  
  public void a()
  {
    if (this.l != null)
    {
      this.l.a();
      this.e.beginTransaction().show(this.l).commit();
    }
  }
  
  public void a(b paramb)
  {
    this.b = paramb;
  }
  
  public void a(com.google.android.gms.maps.c paramc)
  {
    MapWrapperLayout localMapWrapperLayout = (MapWrapperLayout)findViewById(2131689825);
    localMapWrapperLayout.a(paramc, com.fimi.soul.utils.g.a(this, 28.0F));
    this.drone.a(localMapWrapperLayout);
  }
  
  public void a(List<ba> paramList) {}
  
  public b b()
  {
    return this.b;
  }
  
  public void c()
  {
    if (this.l != null)
    {
      this.e.beginTransaction().hide(this.l).commit();
      if (this.h != null) {
        this.h.onStart();
      }
    }
    if (this.f != null) {
      this.f.b();
    }
    com.fimi.soul.biz.j.g.b().clear();
  }
  
  public void d()
  {
    this.e.beginTransaction().hide(this.f).commitAllowingStateLoss();
    this.e.executePendingTransactions();
  }
  
  public void e()
  {
    this.e.beginTransaction().show(this.f).commitAllowingStateLoss();
  }
  
  public void f()
  {
    this.a.setVisibility(4);
  }
  
  public void g()
  {
    this.a.setVisibility(0);
  }
  
  public void h()
  {
    if (com.fimi.kernel.c.e().d())
    {
      findViewById(2131690556).setVisibility(0);
      return;
    }
    findViewById(2131690556).setVisibility(4);
  }
  
  public void i()
  {
    try
    {
      int i1 = com.fimi.kernel.c.e().o();
      if (i1 >= 3) {
        return;
      }
      com.fimi.kernel.c.e().c(i1 + 1);
      f.d locald = new f.d(this);
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(getString(2131362138));
      localSpannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131624230)), 13, 29, 33);
      localSpannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131624230)), 34, 49, 33);
      locald.a(getString(2131362137)).b(getResources().getColor(2131624062)).b(localSpannableStringBuilder).a(false).b(true).a(2130838225).a(getString(2131362175), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
      }).a().show();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void j()
  {
    if (!ao.b(this)) {}
    final v localv;
    final int i1;
    do
    {
      return;
      localv = new v(this);
      i1 = localv.e("insurance_ret");
    } while ((i1 == -2) || (i1 == 100));
    c.c localc = new c.c(this);
    localc.b(getString(2131362355));
    localc.a(getString(2131362358));
    localc.a(getString(2131362354), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (ao.b(FlightActivity.this))
        {
          localv.a("insurance_ret", i1 + 1);
          Intent localIntent = new Intent(FlightActivity.this, WebViewActivity.class);
          localIntent.putExtra("url", ReceiveInsuranceActivity.a);
          localIntent.putExtra("title", FlightActivity.this.getString(2131362923));
          FlightActivity.this.startActivity(localIntent);
        }
        for (;;)
        {
          paramAnonymousDialogInterface.dismiss();
          return;
          z.a(FlightActivity.this, 2131362440, 1000);
        }
      }
    }).b(getString(2131362051), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        localv.a("insurance_ret", i1 - 1);
        paramAnonymousDialogInterface.dismiss();
      }
    }).a().show();
  }
  
  public void k()
  {
    this.e.beginTransaction().remove(this.g).commit();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.w.a().getBoolean("is_setting_enter", false))
    {
      this.w.a().edit().putBoolean("is_setting_enter", true).commit();
      if ((this.w.a().getBoolean("connect_success", false)) && (this.l != null) && (!this.l.isHidden())) {
        this.e.beginTransaction().hide(this.l).commit();
      }
      this.w.a().edit().putBoolean("connect_success", false).commit();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setFlags(128, 128);
    this.dpa.d();
    FimiMediaPlayer.loadLibrariesOnce(null);
    FimiMediaPlayer.native_profileBegin("libfmplayer.so");
    this.a = findViewById(2131689833);
    setContentView(2130968623);
    this.w = v.a(this);
    this.t = ((TextView)findViewById(2131689836));
    this.g = new FirstLeadFragment();
    this.g.a(this);
    this.o = ((ProgressBar)findViewById(2131689835));
    this.q = ((RelativeLayout)findViewById(2131689829));
    this.r = ((DrawerLayout)findViewById(2131689824));
    this.r.setDrawerLockMode(1);
    this.r.setFocusableInTouchMode(false);
    if (o.a(this).b())
    {
      paramBundle = (AudioManager)getSystemService("audio");
      paramBundle.setStreamVolume(3, paramBundle.getStreamMaxVolume(3), 0);
    }
    this.e = getSupportFragmentManager();
    this.k = ((DroneTakePhotoFragment)this.e.findFragmentById(2131689828));
    if (this.k == null)
    {
      this.k = new DroneTakePhotoFragment();
      this.e.beginTransaction().add(2131689828, this.k, "takephoto").hide(this.k).commitAllowingStateLoss();
      this.s = ((FlyActionSettingFragment)this.e.findFragmentById(2131689827));
      if (this.s != null) {
        break label757;
      }
      this.s = new FlyActionSettingFragment();
      this.e.beginTransaction().add(2131689827, this.s, "fly").hide(this.s).commit();
    }
    for (;;)
    {
      this.f = ((FlightMapFragment)this.e.findFragmentById(2131689826));
      if (this.f == null)
      {
        this.f = new FlightMapFragment();
        this.e.beginTransaction().add(2131689826, this.f).commit();
      }
      this.j = ((ShowDroneStatusLineFragment)this.e.findFragmentById(2131689832));
      if (this.j == null)
      {
        this.j = new ShowDroneStatusLineFragment();
        this.e.beginTransaction().add(2131689832, this.j).commit();
      }
      this.i = ((ShowDroneStatusFragment)this.e.findFragmentById(2131689833));
      if (this.i == null)
      {
        this.i = new ShowDroneStatusFragment();
        this.e.beginTransaction().add(2131689833, this.i).commit();
      }
      this.h = ((ShowDroneUiFragment)this.e.findFragmentById(2131689831));
      if (this.h == null)
      {
        this.h = new ShowDroneUiFragment();
        this.h.a(this.j, this.i);
        this.e.beginTransaction().add(2131689831, this.h).commit();
      }
      this.l = ((MapSettingFragment)this.e.findFragmentById(2131689678));
      if (this.l == null)
      {
        this.l = new MapSettingFragment();
        this.e.beginTransaction().add(2131689678, this.l).hide(this.l).commit();
      }
      l();
      startService(new Intent(this, CheckCampassCaliService.class));
      if (this.w.a().getInt("curModel", 1) == 1) {
        this.e.beginTransaction().add(2131689837, this.g).commit();
      }
      new com.fimi.soul.biz.f.a(this).a();
      if (com.fimi.soul.module.update.a.a.a().a(0).b() <= 0) {
        startService(new Intent(this, RequestVersionService.class));
      }
      i();
      p();
      return;
      this.e.beginTransaction().hide(this.k).commit();
      break;
      label757:
      this.e.beginTransaction().hide(this.s).commit();
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.h != null) {
      this.h.a(false);
    }
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    switch (6.a[parama.ordinal()])
    {
    case 13: 
    default: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
      do
      {
        do
        {
          do
          {
            return;
            if (this.p.hasMessages(123)) {
              this.p.removeMessages(123);
            }
            if (this.p.hasMessages(1)) {
              this.p.removeMessages(1);
            }
            this.t.setVisibility(8);
            this.o.setVisibility(8);
            this.n = false;
            return;
            if (parama1.ap().j() == 18)
            {
              if (!this.p.hasMessages(123)) {
                this.v = 5;
              }
              this.p.sendEmptyMessage(123);
            }
            if (this.p.hasMessages(1)) {
              this.p.removeMessages(1);
            }
            this.o.setVisibility(8);
            this.n = false;
            return;
            if (!this.q.isShown()) {
              this.q.setVisibility(0);
            }
          } while (!this.k.isVisible());
          this.e.beginTransaction().hide(this.k).commitAllowingStateLoss();
          return;
          if (this.p.hasMessages(1)) {
            this.p.removeMessages(1);
          }
          this.o.setVisibility(8);
          this.n = false;
          return;
          a(5000);
          return;
        } while ((!parama1.aj().g().isExceAction()) || (this.q.isShown()));
        this.q.setVisibility(0);
        this.e.beginTransaction().hide(this.s).commitAllowingStateLoss();
        parama1.a(d.a.br);
        return;
        this.q.setVisibility(0);
        this.e.beginTransaction().hide(this.s).commitAllowingStateLoss();
        this.e.beginTransaction().hide(this.k).commitAllowingStateLoss();
        this.s.setUserVisibleHint(true);
        parama1.a(d.a.br);
        return;
      } while ((!parama1.U()) || (parama1.ac()));
      return;
    case 9: 
      parama = com.fimi.soul.biz.c.h.a(getApplicationContext());
      if ((parama1.ac()) && (parama.a().get() != 0)) {
        if (parama1.aj().g().judgeNoAction())
        {
          this.q.setVisibility(4);
          if (parama.a().get() != 4) {
            break label533;
          }
          this.e.beginTransaction().show(this.k).commitAllowingStateLoss();
        }
      }
      for (;;)
      {
        this.r.closeDrawer(8388613);
        return;
        this.e.beginTransaction().show(this.s).commitAllowingStateLoss();
        continue;
        this.q.setVisibility(0);
        this.e.beginTransaction().hide(this.s).commitAllowingStateLoss();
        this.e.beginTransaction().hide(this.k).commitAllowingStateLoss();
      }
    case 10: 
      this.r.openDrawer(8388613);
      return;
    case 11: 
      if (this.b == b.b) {
        e();
      }
    case 12: 
      for (;;)
      {
        if (!this.q.isShown()) {
          this.q.setVisibility(0);
        }
        if (this.s.isVisible()) {
          this.e.beginTransaction().hide(this.s).commitAllowingStateLoss();
        }
        if (!this.k.isVisible()) {
          break;
        }
        this.e.beginTransaction().hide(this.k).commitAllowingStateLoss();
        return;
        d();
      }
    case 14: 
      n();
      return;
    case 15: 
      label533:
      n();
      return;
    }
    n();
  }
  
  public void onHandleMessage(Message paramMessage)
  {
    super.onHandleMessage(paramMessage);
    this.x = false;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (this.r.isDrawerOpen(8388613)) {
        this.r.closeDrawer(8388613);
      }
      do
      {
        do
        {
          do
          {
            return true;
          } while (((this.s != null) && (this.s.b())) || ((this.k != null) && (this.k.a())));
          if ((this.s == null) || (this.s.isHidden())) {
            break;
          }
          this.s.a();
          if (!this.q.isShown()) {
            this.q.setVisibility(0);
          }
        } while (!this.s.isVisible());
        this.e.beginTransaction().hide(this.s).commitAllowingStateLoss();
        return true;
        if ((this.k == null) || (this.k.isHidden())) {
          break;
        }
        if (!this.q.isShown()) {
          this.q.setVisibility(0);
        }
      } while (!this.k.isVisible());
      this.e.beginTransaction().hide(this.k).commitAllowingStateLoss();
      return true;
      if ((this.l != null) && (!this.l.isHidden()))
      {
        if (this.l.c()) {
          this.e.beginTransaction().hide(this.l).commit();
        }
        return false;
      }
      o();
      return false;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.l == null)
    {
      this.l = new MapSettingFragment();
      this.e.beginTransaction().add(2131689678, this.l).hide(this.l).commit();
    }
    if (this.h != null) {
      this.h.a(this.drone.W());
    }
    com.fimi.soul.biz.j.g.b().clear();
  }
  
  protected void onStart()
  {
    super.onStart();
    if ((this.drone.T().a()) && (this.drone.U()))
    {
      bf localbf = new bf();
      localbf.d = 115;
      localbf.e = 1;
      localbf.f = 0;
      this.drone.T().a(localbf.a());
    }
    this.d = new a();
    registerReceiver(this.d, new IntentFilter("resetRTSP"));
  }
  
  protected void onStop()
  {
    super.onStop();
    FimiMediaPlayer.native_profileEnd();
    unregisterReceiver(this.d);
    com.fimi.kernel.d.b.b(getApplicationContext()).a(false);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    m();
  }
  
  class a
    extends BroadcastReceiver
  {
    a() {}
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      int i = paramIntent.getIntExtra("rtsp", -1);
      if ((i == 0) && (FlightActivity.this.c != null))
      {
        FlightActivity.this.c.cancel();
        FlightActivity.this.c = null;
      }
      while (i != 1) {
        return;
      }
      if (FlightActivity.this.c == null) {
        FlightActivity.this.c = new Timer();
      }
      FlightActivity.this.c.schedule(new TimerTask()
      {
        public void run()
        {
          FlightActivity.g(FlightActivity.this).sendEmptyMessageDelayed(15, 3000L);
        }
      }, 1000L, 5000L);
    }
  }
  
  public static enum b
  {
    private b() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneui/FlightActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */