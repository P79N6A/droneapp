package com.fimi.soul.module.setting;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.manager.o;
import com.fimi.soul.biz.manager.x;
import com.fimi.soul.biz.modifyRealyWiFiConfigure.ModifyRelayWiFi;
import com.fimi.soul.biz.update.b.a;
import com.fimi.soul.drone.c.a.a.bf;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.ac;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.Setting;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.calibcompass.CaliCompassActivity;
import com.fimi.soul.module.droneui.BatteryInfoActivity;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.module.paircode.PairCodeActivity;
import com.fimi.soul.module.push.HistoryMessageActivity;
import com.fimi.soul.module.remote.RemoteCalibration;
import com.fimi.soul.module.remote.RemoteModelActivity;
import com.fimi.soul.module.setting.GimalCalibration.GimalCalibrationActivity;
import com.fimi.soul.module.setting.newhand.GpsSettingActivity;
import com.fimi.soul.module.setting.newhand.NewHandActivity;
import com.fimi.soul.module.update.FindNewFirmwareAvtivity;
import com.fimi.soul.module.update.FindOnlineFirmwareAvtivity;
import com.fimi.soul.utils.ao;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class MapSettingFragment
  extends Fragment
  implements AdapterView.OnItemClickListener, b.a, d.b, i.a, i.b, i.c
{
  private static final int A = 0;
  private static final int B = 2;
  private static final int C = 1;
  private static final int D = 3;
  private static final int E = 5;
  private com.fimi.soul.biz.manager.k F;
  private boolean G;
  private boolean H = false;
  private long I = 0L;
  private boolean J = true;
  private boolean K = false;
  private boolean L = false;
  private boolean M = false;
  private boolean N = false;
  private String O = "is_setting_enter";
  private String P = "remodel";
  private Handler Q = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      }
      do
      {
        do
        {
          return;
          MapSettingFragment.this.e.a();
          return;
        } while (MapSettingFragment.i(MapSettingFragment.this));
        MapSettingFragment.this.e.e();
        return;
        MapSettingFragment.this.e.b();
        return;
        d.a(MapSettingFragment.j(MapSettingFragment.this)).a();
        return;
      } while (MapSettingFragment.k(MapSettingFragment.this));
      MapSettingFragment.this.e.d();
    }
  };
  public boolean a = false;
  public com.fimi.soul.biz.update.b b;
  List<FirmwareInfo> c = null;
  List<UpdateVersonBean> d;
  com.fimi.soul.module.setting.newhand.d e;
  private Observer f = new Observer()
  {
    public void update(Observable paramAnonymousObservable, Object paramAnonymousObject)
    {
      if (MapSettingFragment.a(MapSettingFragment.this) != null) {
        MapSettingFragment.a(MapSettingFragment.this).a(MapSettingFragment.b(MapSettingFragment.this));
      }
    }
  };
  private ListView g;
  private i h;
  private com.fimi.soul.b.b i;
  private List<Setting> j = new ArrayList();
  private Setting k;
  private Context l;
  private a m;
  private Button n;
  private TextView o;
  private com.fimi.soul.drone.a p;
  private com.fimi.soul.module.b.d q;
  private PercentRelativeLayout r;
  private v s;
  private com.fimi.soul.biz.camera.d t;
  private x u;
  private boolean v = false;
  private int w = 0;
  private int x = 0;
  private int y = 0;
  private boolean z = false;
  
  private void a(com.fimi.soul.drone.a parama)
  {
    bf localbf = new bf();
    localbf.d = 115;
    localbf.e = 1;
    localbf.f = 0;
    parama.T().a(localbf.a());
  }
  
  private boolean d()
  {
    return (this.d != null) && (this.d.size() > 0);
  }
  
  private void e()
  {
    if (this.a)
    {
      this.o.setText(2131362042);
      if (this.i == null) {
        this.i = new com.fimi.soul.b.b(getActivity(), this.p);
      }
      this.i.a();
      this.i.b();
      this.g.setAdapter(this.i);
      this.g.setOnItemClickListener(this.i);
      return;
    }
    if ((this.h != null) && (this.j.size() > 0))
    {
      this.g.setAdapter(this.h);
      this.g.setOverScrollMode(2);
      this.g.setOnItemClickListener(this);
      f();
      this.g.setSelectionFromTop(this.w, this.x);
      this.o.setText(2131362692);
      return;
    }
    this.o.setText(2131362692);
    this.h = new i(this.l, this.p);
    this.h.a(this);
    this.h.a(this);
    this.h.a(this);
    this.g.setAdapter(this.h);
    this.g.setOverScrollMode(2);
    this.g.setOnItemClickListener(this);
    int i1 = 0;
    while (i1 < i.d.values().length)
    {
      this.k = new Setting();
      this.k.setId(i1);
      this.k.addObserver(this.f);
      this.k.setIsOPen(Boolean.valueOf(true));
      this.j.add(this.k);
      i1 += 1;
    }
    f();
    this.g.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      
      public void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        int i = 0;
        if (MapSettingFragment.this.a) {}
        do
        {
          return;
          if (paramAnonymousInt == 0) {
            MapSettingFragment.a(MapSettingFragment.this, MapSettingFragment.e(MapSettingFragment.this).getFirstVisiblePosition());
          }
        } while (MapSettingFragment.b(MapSettingFragment.this) == null);
        paramAnonymousAbsListView = MapSettingFragment.e(MapSettingFragment.this).getChildAt(0);
        MapSettingFragment localMapSettingFragment = MapSettingFragment.this;
        if (paramAnonymousAbsListView == null) {}
        for (paramAnonymousInt = i;; paramAnonymousInt = paramAnonymousAbsListView.getTop())
        {
          MapSettingFragment.b(localMapSettingFragment, paramAnonymousInt);
          return;
        }
      }
    });
  }
  
  private void f()
  {
    ((Setting)this.j.get(i.d.f.ordinal())).setIsOPen(Boolean.valueOf(this.J));
    ((Setting)this.j.get(i.d.h.ordinal())).setIsOPen(Boolean.valueOf(this.L));
    ((Setting)this.j.get(i.d.i.ordinal())).setIsOPen(Boolean.valueOf(this.K));
    ((Setting)this.j.get(i.d.p.ordinal())).setIsOPen(Boolean.valueOf(false));
    this.c = com.fimi.soul.module.update.a.a.a().d();
    if (this.s.a().contains("isfirstloading"))
    {
      ((Setting)this.j.get(i.d.F.ordinal())).setIsOPen(Boolean.valueOf(true));
      ((Setting)this.j.get(i.d.F.ordinal())).setContent(com.fimi.soul.base.a.b(this.l).getName());
      if (this.s.a().getInt("remodel", 0) != 0) {
        break label321;
      }
      ((Setting)this.j.get(i.d.m.ordinal())).setContent(getResources().getString(2131362462));
      label242:
      if ((!this.p.T().a()) || (!this.p.U())) {
        break label355;
      }
    }
    for (;;)
    {
      this.d = com.fimi.soul.module.update.a.a.a().e();
      g();
      this.h.a(this.j);
      return;
      ((Setting)this.j.get(i.d.F.ordinal())).setIsOPen(Boolean.valueOf(false));
      break;
      label321:
      ((Setting)this.j.get(i.d.m.ordinal())).setContent(getResources().getString(2131362463));
      break label242;
      label355:
      ((Setting)this.j.get(i.d.b.ordinal())).setIsOPen(Boolean.valueOf(true));
    }
  }
  
  private void g()
  {
    ((Setting)this.j.get(i.d.c.ordinal())).setIsOPen(Boolean.valueOf(true));
    if ((d()) || ((this.c != null) && (this.c.size() > 0)))
    {
      ((Setting)this.j.get(i.d.c.ordinal())).setDisplayTv(true);
      return;
    }
    ((Setting)this.j.get(i.d.c.ordinal())).setDisplayTv(false);
  }
  
  private void h()
  {
    final com.fimi.soul.view.i.a locala = new com.fimi.soul.view.i.a(getActivity(), this.p);
    String str1 = com.fimi.soul.biz.e.d.a().q();
    String str2 = com.fimi.soul.biz.e.d.a().p();
    if (str1 != null) {
      locala.c(str1);
    }
    if (str2 != null) {
      locala.d(str2);
    }
    locala.a(getString(2131362051), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.dismiss();
      }
    }, getString(2131362175), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (org.a.a.o.f.a(locala.a()))
        {
          locala.b(MapSettingFragment.this.getString(2131362611));
          return;
        }
        if (org.a.a.o.f.a(locala.b()))
        {
          locala.b(MapSettingFragment.this.getString(2131362610));
          return;
        }
        if (locala.b().length() < 8)
        {
          locala.b(MapSettingFragment.this.getString(2131362610));
          return;
        }
        paramAnonymousDialogInterface = ModifyRelayWiFi.getInstance();
        paramAnonymousDialogInterface.setSsid(locala.a());
        paramAnonymousDialogInterface.setPassword(locala.b());
        paramAnonymousDialogInterface.sendModifyCongigure();
      }
    });
    locala.c().show();
  }
  
  public void a()
  {
    if (this.e == null) {
      this.e = new com.fimi.soul.module.setting.newhand.c(this.p, this.l);
    }
    this.e.e();
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 4) {
      this.e.a(this.j);
    }
    while (paramInt != 2) {
      return;
    }
    this.e.a(this.j, this.F);
  }
  
  public void a(SwitchButton paramSwitchButton)
  {
    this.e.a(paramSwitchButton, (Setting)this.j.get(i.d.f.ordinal()));
    this.h.notifyDataSetChanged();
  }
  
  public void a(String paramString)
  {
    this.h.a(this.j);
    this.c = com.fimi.soul.module.update.a.a.a().d();
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (byte b1 = 2;; b1 = 1)
    {
      bf localbf = new bf();
      localbf.d = 116;
      localbf.e = 1;
      localbf.f = b1;
      this.p.T().a(localbf.a());
      return;
    }
  }
  
  public void b() {}
  
  public boolean c()
  {
    if (this.a)
    {
      this.a = false;
      this.t.r().e();
      e();
      return false;
    }
    this.m.c();
    return true;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default: 
      return;
    }
    paramIntent = paramIntent.getStringExtra("content");
    ((Setting)this.j.get(i.d.p.ordinal())).setContent(paramIntent);
    this.h.notifyDataSetChanged();
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.l = paramActivity;
    this.m = ((a)paramActivity);
    this.p = ((DroidPlannerApp)paramActivity.getApplication()).a;
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968614, paramViewGroup, false);
    this.r = ((PercentRelativeLayout)paramLayoutInflater.findViewById(2131689748));
    this.n = ((Button)this.r.findViewById(2131690535));
    this.g = ((ListView)paramLayoutInflater.findViewById(2131689757));
    this.o = ((TextView)this.r.findViewById(2131690327));
    this.s = v.a(getActivity());
    this.t = ((com.fimi.soul.biz.camera.d)com.fimi.soul.biz.camera.b.a().d());
    this.n.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (MapSettingFragment.this.a)
        {
          MapSettingFragment.this.a = false;
          ((com.fimi.soul.biz.camera.d)com.fimi.soul.biz.camera.b.a().d()).r().e();
          MapSettingFragment.c(MapSettingFragment.this);
          return;
        }
        MapSettingFragment.d(MapSettingFragment.this).c();
      }
    });
    this.b = new com.fimi.soul.biz.update.b(this.l);
    this.b.a(this);
    this.b.a();
    this.u = x.a(this.l);
    this.F = com.fimi.soul.biz.manager.k.a(this.l);
    if ((ao.b(this.l)) && (this.p.U())) {
      this.F.a(com.fimi.soul.base.a.b(this.l), com.fimi.soul.biz.manager.k.a, new com.fimi.soul.biz.m.k()
      {
        public void a(PlaneMsg paramAnonymousPlaneMsg, File paramAnonymousFile)
        {
          if (paramAnonymousPlaneMsg.isSuccess()) {}
        }
      });
    }
    return paramLayoutInflater;
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    if ((parama1.T().a()) && (parama1.U())) {
      switch (2.a[parama.ordinal()])
      {
      default: 
        if ((parama == d.a.ah) && (parama1.L().b() == 114))
        {
          com.fimi.soul.module.calibcompass.a.a().a("98");
          if (parama1.L().d() != 2) {
            break;
          }
          this.s.a().edit().putInt("remodel", 1).commit();
          ((Setting)this.j.get(i.d.m.ordinal())).setContent(getResources().getString(2131362463));
          label148:
          if (this.h != null) {
            this.h.a(i.d.m.ordinal(), this.g.getChildAt(i.d.m.ordinal()));
          }
        }
        switch (2.a[parama.ordinal()])
        {
        }
        break;
      }
    }
    label354:
    label461:
    label521:
    label609:
    label743:
    label938:
    label1211:
    label1224:
    label1257:
    label1270:
    label1303:
    label1394:
    label1427:
    label1552:
    do
    {
      com.fimi.soul.drone.h.c localc;
      do
      {
        do
        {
          return;
          ((Setting)this.j.get(i.d.b.ordinal())).setIsOPen(Boolean.valueOf(false));
          break;
          if (parama1.al().d() == 51)
          {
            if ((com.fimi.kernel.c.b().b() != null) && (com.fimi.kernel.c.b().b().isShowing())) {
              com.fimi.kernel.c.b().c();
            }
            if (parama1.al().f() == 1)
            {
              if (parama1.al().i() != 0) {
                break label1211;
              }
              z.a(this.l, 2131362685);
              this.Q.sendEmptyMessageDelayed(1, 1000L);
              this.Q.sendEmptyMessageDelayed(1, 2000L);
              this.M = false;
              if (parama1.al().e() != 0) {
                break label1224;
              }
              this.J = true;
              this.K = false;
              this.L = false;
              ((Setting)this.j.get(i.d.f.ordinal())).setIsOPen(Boolean.valueOf(true));
              ((Setting)this.j.get(i.d.h.ordinal())).setIsOPen(Boolean.valueOf(false));
              ((Setting)this.j.get(i.d.i.ordinal())).setIsOPen(Boolean.valueOf(false));
              this.e.e();
            }
            if (parama1.al().f() == 3)
            {
              if (parama1.al().i() != 0) {
                break label1257;
              }
              z.a(this.l, 2131362685);
              this.Q.sendEmptyMessageDelayed(5, 1000L);
              this.Q.sendEmptyMessageDelayed(5, 2000L);
              this.N = false;
              if (parama1.al().g() == 2)
              {
                if (parama1.al().h() != 1.0F) {
                  break label1270;
                }
                this.J = false;
                this.K = false;
                this.L = true;
                ((Setting)this.j.get(i.d.i.ordinal())).setIsOPen(Boolean.valueOf(false));
                ((Setting)this.j.get(i.d.h.ordinal())).setIsOPen(Boolean.valueOf(true));
              }
              if (parama1.al().g() == 4)
              {
                if (parama1.al().h() != 1.0F) {
                  break label1303;
                }
                this.J = false;
                this.K = true;
                this.L = false;
                ((Setting)this.j.get(i.d.h.ordinal())).setIsOPen(Boolean.valueOf(false));
                ((Setting)this.j.get(i.d.i.ordinal())).setIsOPen(Boolean.valueOf(true));
                this.H = true;
                a(true);
                a(parama1);
                ((Setting)this.j.get(i.d.p.ordinal())).setContent(this.l.getString(2131362312));
              }
            }
          }
          if (parama1.al().d() != 34) {
            break;
          }
          this.M = true;
          this.N = true;
          if ((parama1.al().f() != 1) && (parama1.al().f() != 3)) {
            break;
          }
          if (parama1.al().f() == 1)
          {
            if (parama1.al().e() == 0)
            {
              this.J = true;
              this.K = false;
              this.L = false;
              ((Setting)this.j.get(i.d.f.ordinal())).setIsOPen(Boolean.valueOf(true));
              ((Setting)this.j.get(i.d.h.ordinal())).setIsOPen(Boolean.valueOf(false));
              ((Setting)this.j.get(i.d.i.ordinal())).setIsOPen(Boolean.valueOf(false));
              ((Setting)this.j.get(i.d.p.ordinal())).setIsOPen(Boolean.valueOf(false));
              this.H = false;
              a(false);
              a(parama1);
            }
          }
          else
          {
            if (((int)parama1.al().h() & 0x1) == 1)
            {
              ((Setting)this.j.get(i.d.i.ordinal())).setIsOPen(Boolean.valueOf(false));
              this.K = false;
            }
            if (((int)parama1.al().h() & 0x2) != 2) {
              break label1394;
            }
            this.J = false;
            this.K = false;
            this.L = true;
            ((Setting)this.j.get(i.d.i.ordinal())).setIsOPen(Boolean.valueOf(false));
            ((Setting)this.j.get(i.d.h.ordinal())).setIsOPen(Boolean.valueOf(true));
          }
          for (;;)
          {
            if (((int)parama1.al().h() & 0x4) != 4) {
              break label1427;
            }
            if (this.J) {
              break;
            }
            this.H = true;
            ((Setting)this.j.get(i.d.p.ordinal())).setContent(this.l.getString(2131362312));
            ((Setting)this.j.get(i.d.p.ordinal())).setIsOPen(Boolean.valueOf(true));
            this.J = false;
            this.K = true;
            this.L = false;
            ((Setting)this.j.get(i.d.i.ordinal())).setIsOPen(Boolean.valueOf(true));
            ((Setting)this.j.get(i.d.h.ordinal())).setIsOPen(Boolean.valueOf(false));
            break;
            z.a(this.l, 2131362684);
            break label354;
            this.J = false;
            ((Setting)this.j.get(i.d.f.ordinal())).setIsOPen(Boolean.valueOf(false));
            break label461;
            z.a(this.l, 2131362684);
            break label521;
            this.L = false;
            ((Setting)this.j.get(i.d.h.ordinal())).setIsOPen(Boolean.valueOf(false));
            break label609;
            this.K = false;
            ((Setting)this.j.get(i.d.i.ordinal())).setIsOPen(Boolean.valueOf(false));
            ((Setting)this.j.get(i.d.p.ordinal())).setIsOPen(Boolean.valueOf(false));
            break label743;
            this.J = false;
            ((Setting)this.j.get(i.d.f.ordinal())).setIsOPen(Boolean.valueOf(false));
            break label938;
            this.L = false;
            ((Setting)this.j.get(i.d.h.ordinal())).setIsOPen(Boolean.valueOf(false));
          }
        } while (System.currentTimeMillis() - this.I < 1000L);
        this.I = System.currentTimeMillis();
        ((Setting)this.j.get(i.d.p.ordinal())).setIsOPen(Boolean.valueOf(false));
        this.H = false;
        a(false);
        a(parama1);
        break;
        localc = parama1.L();
        if ((localc == null) || (localc.b() != 115)) {
          break label1552;
        }
      } while (this.H);
      if (localc.c() == 2) {
        switch (localc.d)
        {
        }
      }
      for (;;)
      {
        this.h.notifyDataSetChanged();
        break;
        ((Setting)this.j.get(i.d.p.ordinal())).setContent(getString(2131362414));
        continue;
        ((Setting)this.j.get(i.d.p.ordinal())).setContent(getString(2131362185));
      }
      ((Setting)this.j.get(i.d.b.ordinal())).setIsOPen(Boolean.valueOf(true));
      switch (2.a[parama.ordinal()])
      {
      case 1: 
      case 2: 
      case 3: 
      default: 
        break;
      case 4: 
        g();
        ((Setting)this.j.get(i.d.b.ordinal())).setIsOPen(Boolean.valueOf(true));
        break;
        if (parama1.L().d() != 1) {
          break label148;
        }
        this.s.a().edit().putInt("remodel", 0).commit();
        ((Setting)this.j.get(i.d.m.ordinal())).setContent(getResources().getString(2131362462));
        break label148;
        if (!parama1.U()) {
          break label1821;
        }
      }
    } while (!this.z);
    this.z = false;
    this.e.e();
    return;
    label1821:
    this.z = true;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt == i.d.b.ordinal()) {
      if (((Setting)this.j.get(i.d.b.ordinal())).getIsOPen().booleanValue()) {}
    }
    for (;;)
    {
      return;
      this.s.a().edit().putBoolean("is_setting_enter", true).commit();
      paramAdapterView = new Intent(this.l, LoginActivity.class);
      paramAdapterView.putExtra("login", false);
      startActivityForResult(paramAdapterView, 0);
      if (paramInt == i.d.c.ordinal())
      {
        if (!((Setting)this.j.get(i.d.c.ordinal())).getIsOPen().booleanValue()) {
          continue;
        }
        if (d())
        {
          com.fimi.kernel.c.c.a().a("sp_need_down_firmwares", this.d);
          startActivity(new Intent(this.l, FindOnlineFirmwareAvtivity.class));
        }
      }
      else
      {
        if (paramInt == i.d.d.ordinal())
        {
          paramAdapterView = new Intent(getActivity(), CaliCompassActivity.class);
          paramAdapterView.putExtra("isdirectcalicompass", true);
          startActivity(paramAdapterView);
        }
        if (paramInt == i.d.t.ordinal()) {
          startActivity(new Intent(this.l, GimalCalibrationActivity.class));
        }
        if (paramInt == i.d.e.ordinal())
        {
          this.s.a().edit().putBoolean("is_setting_enter", true).commit();
          startActivity(new Intent(this.l, NewHandActivity.class));
        }
        if (paramInt == i.d.f.ordinal())
        {
          paramAdapterView = (SwitchButton)paramView.findViewById(2131689906);
          this.e.a(paramAdapterView, (Setting)this.j.get(i.d.f.ordinal()));
          this.h.notifyDataSetChanged();
        }
        if (paramInt == i.d.g.ordinal())
        {
          if (((Setting)this.j.get(i.d.f.ordinal())).getIsOPen().booleanValue()) {
            continue;
          }
          paramAdapterView = new Intent(this.l, GpsSettingActivity.class);
          paramAdapterView.putExtra("newhand_mode", ((Setting)this.j.get(i.d.f.ordinal())).getIsOPen());
          paramAdapterView.putExtra("optical_flow_mode", ((Setting)this.j.get(i.d.h.ordinal())).getIsOPen());
          paramAdapterView.putExtra("force_attitude_mode", ((Setting)this.j.get(i.d.i.ordinal())).getIsOPen());
          this.l.startActivity(paramAdapterView);
        }
        if (paramInt == i.d.x.ordinal())
        {
          paramAdapterView = (SwitchButton)paramView.findViewById(2131689906);
          if (!o.a(this.l).e()) {
            break label744;
          }
          paramAdapterView.a(false, true);
          o.a(this.l).f(false);
          PreferenceManager.getDefaultSharedPreferences(this.l).edit().putInt("Amptype", 1).commit();
        }
        label569:
        if (paramInt == i.d.j.ordinal())
        {
          paramAdapterView = (SwitchButton)paramView.findViewById(2131689906);
          if (!com.fimi.kernel.c.e().d()) {
            break label791;
          }
          com.fimi.kernel.c.e().a(false);
          paramAdapterView.a(false, true);
        }
      }
      for (;;)
      {
        ((FlightActivity)this.l).h();
        if (paramInt == i.d.l.ordinal()) {
          startActivity(new Intent(this.l, RemoteCalibration.class));
        }
        if (paramInt != i.d.m.ordinal()) {
          break label825;
        }
        if (!this.p.U()) {
          break label807;
        }
        z.a(this.l, this.l.getString(2131362074), z.b);
        return;
        if ((this.c != null) && (this.c.size() > 0))
        {
          startActivity(new Intent(this.l, FindNewFirmwareAvtivity.class));
          break;
        }
        z.a(this.l, 2131362901);
        break;
        label744:
        paramAdapterView.a(true, true);
        o.a(this.l).f(true);
        PreferenceManager.getDefaultSharedPreferences(this.l).edit().putInt("Amptype", 2).commit();
        break label569;
        label791:
        com.fimi.kernel.c.e().a(true);
        paramAdapterView.a(true, true);
      }
      label807:
      startActivity(new Intent(this.l, RemoteModelActivity.class));
      label825:
      if (paramInt == i.d.v.ordinal())
      {
        this.a = true;
        e();
      }
      if (paramInt == i.d.E.ordinal()) {
        startActivity(new Intent(this.l, HistoryMessageActivity.class));
      }
      if (paramInt == i.d.F.ordinal())
      {
        if (!this.s.a().contains("isfirstloading")) {
          break label1346;
        }
        new com.fimi.soul.view.f.a(this.l).a(this.l.getString(2131362438)).c(17).a(getResources().getColor(2131624046)).b(this.l.getString(2131362192), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            MapSettingFragment.f(MapSettingFragment.this).a().edit().remove("isfirstloading").commit();
            ((Setting)MapSettingFragment.b(MapSettingFragment.this).get(i.d.F.ordinal())).setIsOPen(Boolean.valueOf(false));
            MapSettingFragment.a(MapSettingFragment.this).a(MapSettingFragment.b(MapSettingFragment.this));
            MapSettingFragment.h(MapSettingFragment.this).b(com.fimi.soul.base.a.b(MapSettingFragment.g(MapSettingFragment.this)), new com.fimi.soul.biz.m.k()
            {
              public void a(PlaneMsg paramAnonymous2PlaneMsg, File paramAnonymous2File) {}
            });
          }
        }).a(this.l.getString(2131362051), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
        }).a().show();
      }
      for (;;)
      {
        if (paramInt == i.d.C.ordinal()) {
          startActivity(new Intent(this.l, UserFeedBackActivity.class));
        }
        if (paramInt == i.d.D.ordinal()) {
          startActivity(new Intent(this.l, AboutActivity.class));
        }
        if (paramInt == i.d.r.ordinal()) {
          startActivity(new Intent(this.l, BatteryInfoActivity.class));
        }
        if (paramInt == i.d.h.ordinal()) {
          this.e.a(this.j, this.F);
        }
        if (paramInt == i.d.i.ordinal()) {
          this.e.a(this.j);
        }
        if (paramInt == i.d.A.ordinal()) {
          startActivity(new Intent(this.l, FlyRecordActivity.class));
        }
        if (paramInt == i.d.B.ordinal()) {
          startActivity(new Intent(this.l, FlyLogsActivity.class));
        }
        if (paramInt == i.d.o.ordinal()) {
          startActivity(new Intent(this.l, PairCodeActivity.class));
        }
        if (paramInt == i.d.p.ordinal())
        {
          paramAdapterView = new Intent(this.l, RightRollerSetActivity.class);
          paramAdapterView.putExtra("GPS_ATTI", ((Setting)this.j.get(i.d.i.ordinal())).getIsOPen());
          paramAdapterView.putExtra("curModel", ((Setting)this.j.get(i.d.p.ordinal())).getContent());
          getActivity().startActivityForResult(paramAdapterView, 100);
        }
        if (paramInt != i.d.n.ordinal()) {
          break label1408;
        }
        if (!this.p.T().a()) {
          break label1494;
        }
        if (!this.p.ac()) {
          break;
        }
        z.a(getActivity(), 2131362609, 3000);
        return;
        label1346:
        this.s.a().edit().putBoolean("is_setting_enter", true).commit();
        paramAdapterView = new Intent(this.l, LoginActivity.class);
        paramAdapterView.putExtra("login", true);
        startActivity(paramAdapterView);
      }
      h();
      label1408:
      while (paramInt == i.d.y.ordinal())
      {
        paramAdapterView = (SwitchButton)paramView.findViewById(2131689906);
        boolean bool = this.s.a().getBoolean("Map_Code_Correction", false);
        paramView = com.fimi.soul.biz.n.a.a();
        if (bool) {
          break label1510;
        }
        this.s.a().edit().putBoolean("Map_Code_Correction", true).commit();
        paramAdapterView.setSwitchState(true);
        paramView.a(false);
        return;
        label1494:
        z.a(getActivity(), 2131362104, 3000);
      }
    }
    label1510:
    this.s.a().edit().putBoolean("Map_Code_Correction", false).commit();
    paramAdapterView.setSwitchState(false);
    paramView.a(true);
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void onStart()
  {
    super.onStart();
    e();
    this.p.a(this);
    this.q = com.fimi.soul.module.b.d.a(this.p);
    this.q.g();
    this.G = com.fimi.soul.biz.e.d.a().k();
    if (this.e == null) {
      this.e = new com.fimi.soul.module.setting.newhand.c(this.p, this.l);
    }
    this.M = false;
    this.e.e();
    this.Q.sendEmptyMessageDelayed(1, 500L);
    this.Q.sendEmptyMessageDelayed(1, 1000L);
    this.O = "is_setting_enter";
    this.P = "remodel";
  }
  
  public void onStop()
  {
    super.onStop();
    this.p.b(this);
    if ((this.b != null) && (this.b.b() != null)) {
      this.b.a(null);
    }
  }
  
  public static abstract interface a
  {
    public abstract void c();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/MapSettingFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */