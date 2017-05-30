package com.fimi.soul.module.droneFragment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.BaseFragment;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.biz.camera.c.a;
import com.fimi.soul.biz.camera.c.d;
import com.fimi.soul.biz.camera.e.a;
import com.fimi.soul.biz.camera.entity.X11FileSystem;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11RespCmd.NotificationType;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.biz.d.a.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.ar;
import com.fimi.soul.drone.h.g;
import com.fimi.soul.drone.h.g.a;
import com.fimi.soul.drone.h.i;
import com.fimi.soul.drone.h.i.a;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.entity.DroneModelType;
import com.fimi.soul.live.NativeAudiolive;
import com.fimi.soul.live.NativeAudiolive.LiveCallBackListener;
import com.fimi.soul.media.player.FermiPlayerUtils;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.flyplannermedia.DroneMediaTabActivity;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.UpDownSliding;
import com.fimi.soul.view.UpDownSliding.b;
import com.fimi.soul.view.UpDownSliding.c;
import com.fimi.soul.view.f.c;
import com.google.android.gms.maps.model.LatLng;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class ShowDroneUiFragment
  extends BaseFragment
  implements View.OnClickListener, com.fimi.soul.biz.camera.b.e<X11RespCmd>, c.d, d.b
{
  private static final int A = 1;
  private static final int B = 2;
  private static final int C = 3;
  private static final int D = 4;
  private static final int E = 5;
  private static final int F = 6;
  private static final int G = 7;
  private static final int H = 8;
  private static final int J = 9;
  private static final int K = 10;
  private static final int L = 11;
  private static final int M = 12;
  private static final int N = 13;
  private static final int O = 15;
  private boolean I = false;
  private i.a P;
  private long Q;
  private boolean R = false;
  private boolean S = false;
  private boolean T = false;
  private Timer U;
  private Timer V;
  private Button W;
  private Button X;
  private PercentRelativeLayout Y;
  private boolean Z = false;
  String a = null;
  private boolean aa = false;
  private boolean ab = false;
  private com.fimi.soul.view.f.a ac;
  private f.c ad;
  private a ae = a.a;
  private com.fimi.soul.biz.d.a af;
  private e ag = e.a;
  private d ah;
  private h ai;
  private b aj = b.a;
  private com.fimi.kernel.b.b.c ak;
  Handler b = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      if (paramAnonymousMessage.what == 1)
      {
        long l1 = System.currentTimeMillis();
        long l2 = ShowDroneUiFragment.i(ShowDroneUiFragment.this);
        if ((ShowDroneUiFragment.b(ShowDroneUiFragment.this) != null) && (ShowDroneUiFragment.this.getActivity() != null))
        {
          ShowDroneUiFragment.b(ShowDroneUiFragment.this).a(true);
          ShowDroneUiFragment.b(ShowDroneUiFragment.this).a(FermiPlayerUtils.getTimelineString(l1 - l2));
        }
      }
      for (;;)
      {
        super.handleMessage(paramAnonymousMessage);
        return;
        if (paramAnonymousMessage.what != 2) {
          if (paramAnonymousMessage.what == 7)
          {
            if ((!ShowDroneUiFragment.j(ShowDroneUiFragment.this)) && (ShowDroneUiFragment.this.a().b().isShowing()))
            {
              ShowDroneUiFragment.this.a().c();
              ShowDroneUiFragment.b(ShowDroneUiFragment.this, true);
            }
            ShowDroneUiFragment.this.b.sendEmptyMessageDelayed(2, 2000L);
          }
          else if (paramAnonymousMessage.what == 3)
          {
            ShowDroneUiFragment.this.a(true);
            ShowDroneUiFragment.this.b.sendEmptyMessageDelayed(2, 2000L);
          }
          else if (paramAnonymousMessage.what == 8)
          {
            ShowDroneUiFragment.c(ShowDroneUiFragment.this, true);
            ShowDroneUiFragment.k(ShowDroneUiFragment.this).a(1000, 0);
            ShowDroneUiFragment.l(ShowDroneUiFragment.this).a(1000, 0);
            ShowDroneUiFragment.m(ShowDroneUiFragment.this).a(1000, 0);
            ShowDroneUiFragment.n(ShowDroneUiFragment.this).a(1000, 0);
            ShowDroneUiFragment.this.b.sendEmptyMessageDelayed(9, 3000L);
          }
          else if (paramAnonymousMessage.what == 9)
          {
            ShowDroneUiFragment.k(ShowDroneUiFragment.this).a();
            ShowDroneUiFragment.l(ShowDroneUiFragment.this).a();
            ShowDroneUiFragment.m(ShowDroneUiFragment.this).a();
            ShowDroneUiFragment.n(ShowDroneUiFragment.this).a();
          }
          else if (paramAnonymousMessage.what == 10)
          {
            ShowDroneUiFragment.d(ShowDroneUiFragment.this, false);
          }
          else if (paramAnonymousMessage.what == 11)
          {
            ShowDroneUiFragment.e(ShowDroneUiFragment.this, false);
          }
          else if (paramAnonymousMessage.what == 12)
          {
            ShowDroneUiFragment.f(ShowDroneUiFragment.this, false);
          }
        }
      }
    }
  };
  private SectorProgressBar c;
  private SectorProgressBar d;
  private SectorProgressBar e;
  private SectorProgressBar f;
  private ImageButton g;
  private ImageButton h;
  private ImageButton i;
  private ImageButton j;
  private Context k;
  private com.fimi.soul.drone.a l;
  private DroidPlannerApp m;
  private PercentRelativeLayout n;
  private ImageView o;
  private ImageView p;
  private c q = c.a;
  private com.fimi.soul.biz.camera.d r = (com.fimi.soul.biz.camera.d)com.fimi.soul.biz.camera.b.a().d();
  private UpDownSliding s;
  private com.mi.live.openlivesdk.c t;
  private NativeAudiolive u;
  private boolean v = false;
  private UpDownSliding.b w;
  private b x;
  private ShowDroneStatusLineFragment y;
  private ShowDroneStatusFragment z;
  
  public ShowDroneUiFragment()
  {
    this.r.c(new com.fimi.kernel.b.c.d()
    {
      public void a(String paramAnonymousString)
      {
        Log.d("Good", paramAnonymousString);
      }
    });
  }
  
  private void a(TextView paramTextView, String paramString)
  {
    if (!paramTextView.getText().toString().equals(paramString)) {
      paramTextView.setText(paramString);
    }
  }
  
  private void a(e parame)
  {
    if (!this.v) {
      this.ag = parame;
    }
  }
  
  private void b(int paramInt)
  {
    e(false);
    new f.c(getActivity()).a(com.fimi.kernel.c.d().getString(2131362430) + getString(paramInt)).a(getString(2131362175), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    }).a().show();
  }
  
  @TargetApi(16)
  private void b(boolean paramBoolean)
  {
    if (this.q.equals(c.b))
    {
      c(paramBoolean);
      d(paramBoolean);
    }
  }
  
  private void c(int paramInt)
  {
    int i2 = -1;
    int i1 = 0;
    try
    {
      this.u.fmLiveStop();
      while ((i2 < 0) && (i1 < 4))
      {
        Thread.sleep(2000L);
        i2 = this.u.fmLiveStart(com.fimi.soul.biz.camera.e.d(), this.a);
        i1 += 1;
      }
      if (i2 < 0) {
        b(paramInt);
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  @TargetApi(16)
  private void c(boolean paramBoolean)
  {
    if ((this.l.W()) && (this.y != null) && (this.y.a() == 2131362206)) {
      a(2131362840);
    }
    if (this.q.equals(c.b))
    {
      this.i.setEnabled(paramBoolean);
      if (paramBoolean)
      {
        this.i.setImageAlpha(255);
        return;
      }
      this.i.setImageAlpha(85);
      return;
    }
    this.i.setEnabled(true);
    this.i.setImageAlpha(255);
  }
  
  @TargetApi(16)
  private void d(boolean paramBoolean)
  {
    if (this.q.equals(c.a))
    {
      this.j.setEnabled(true);
      this.j.setImageAlpha(255);
    }
    for (;;)
    {
      this.h.setEnabled(paramBoolean);
      if (!paramBoolean) {
        break;
      }
      this.h.setImageAlpha(255);
      return;
      this.j.setEnabled(paramBoolean);
      if (paramBoolean) {
        this.j.setImageAlpha(255);
      } else {
        this.j.setImageAlpha(85);
      }
    }
    this.h.setImageAlpha(85);
  }
  
  @TargetApi(16)
  private void e(boolean paramBoolean)
  {
    boolean bool2 = true;
    int i2 = 0;
    this.v = paramBoolean;
    Object localObject;
    boolean bool1;
    if (this.q.equals(c.b))
    {
      if (com.fimi.kernel.c.d() != null)
      {
        localObject = this.i;
        Resources localResources = com.fimi.kernel.c.d().getResources();
        if (!paramBoolean)
        {
          i1 = 2130837700;
          ((ImageButton)localObject).setImageDrawable(localResources.getDrawable(i1));
        }
      }
      else
      {
        localObject = this.h;
        if (paramBoolean) {
          break label193;
        }
        bool1 = true;
        label75:
        ((ImageButton)localObject).setEnabled(bool1);
        localObject = this.j;
        if (paramBoolean) {
          break label199;
        }
        bool1 = true;
        label95:
        ((ImageButton)localObject).setEnabled(bool1);
        if (!paramBoolean) {
          break label205;
        }
        this.j.setImageAlpha(85);
        this.h.setImageAlpha(85);
      }
    }
    else
    {
      label124:
      localObject = this.s;
      if (paramBoolean) {
        break label228;
      }
      bool1 = bool2;
      label138:
      ((UpDownSliding)localObject).setEnabled(bool1);
      if (this.z != null)
      {
        localObject = this.z;
        if (!paramBoolean) {
          break label234;
        }
      }
    }
    label193:
    label199:
    label205:
    label228:
    label234:
    for (int i1 = i2;; i1 = 8)
    {
      ((ShowDroneStatusFragment)localObject).a(i1);
      if (this.y != null) {
        this.y.b(paramBoolean);
      }
      return;
      i1 = 2130837701;
      break;
      bool1 = false;
      break label75;
      bool1 = false;
      break label95;
      this.h.setImageAlpha(255);
      this.j.setImageAlpha(255);
      break label124;
      bool1 = false;
      break label138;
    }
  }
  
  private void f()
  {
    this.q = c.b;
    this.s.setVisibility(0);
    this.i.setImageDrawable(getResources().getDrawable(2130837768));
    if (this.af != null) {
      this.af.a(2130838361);
    }
    this.g.setImageDrawable(getResources().getDrawable(2130838276));
    i();
    this.x.a(this.r.d());
    ((FlightActivity)getActivity()).d();
    this.x.d();
    this.x.g();
  }
  
  private void g()
  {
    if (com.fimi.kernel.c.e().j())
    {
      if (this.ac == null) {
        this.ac = new com.fimi.soul.view.f.a(getActivity());
      }
      if (!this.ac.b().isShowing()) {
        this.ac.a(getString(2131362067)).a(getResources().getColor(2131624046)).b(getString(2131362175), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            com.fimi.kernel.c.b().a();
            ShowDroneUiFragment.g(ShowDroneUiFragment.this).r().c();
          }
        }).a(getString(2131362051), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            com.fimi.kernel.c.e().c(false);
          }
        }).a().show();
      }
    }
  }
  
  private void h()
  {
    if (com.fimi.kernel.c.e().k())
    {
      if (this.ad == null) {
        this.ad = new f.c(getActivity());
      }
      if (!this.ad.b().isShowing()) {
        this.ad.a(getString(2131362836)).a(getString(2131362175), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            com.fimi.kernel.c.e().d(false);
          }
        }).a().show();
      }
    }
  }
  
  private void i()
  {
    boolean bool = true;
    int i1;
    if ((this.r.f() == c.a.d) || (this.r.f() == c.a.c) || (this.v))
    {
      i1 = 1;
      if (i1 != 0) {
        break label65;
      }
    }
    for (;;)
    {
      d(bool);
      if (!this.q.equals(c.a)) {
        break label70;
      }
      return;
      i1 = 0;
      break;
      label65:
      bool = false;
    }
    label70:
    if (this.ag != e.a)
    {
      if (this.r.i().isContinueCaptureMode()) {
        a(e.b);
      }
      if (c.a.c == this.r.f()) {
        a(e.a);
      }
    }
    l();
    j();
  }
  
  private void j()
  {
    if (!isAdded()) {
      return;
    }
    if (this.v)
    {
      this.i.setImageDrawable(getResources().getDrawable(2130837701));
      return;
    }
    switch (3.d[this.r.f().ordinal()])
    {
    default: 
      return;
    case 1: 
      this.i.setImageDrawable(getResources().getDrawable(2130838437));
      this.s.setEnabled(false);
      return;
    case 2: 
      this.i.setImageDrawable(getResources().getDrawable(2130838437));
      this.s.setEnabled(false);
      return;
    case 3: 
      this.s.setEnabled(true);
      return;
    }
    this.s.setEnabled(true);
  }
  
  private void k()
  {
    try
    {
      if (this.U != null)
      {
        this.U.cancel();
        this.U = null;
      }
      if ((this.y != null) && (getActivity() != null)) {
        this.y.a(false);
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private void l()
  {
    if (!isAdded()) {}
    do
    {
      do
      {
        do
        {
          do
          {
            return;
          } while (this.q.equals(c.a));
          switch (3.c[this.ag.ordinal()])
          {
          default: 
            return;
          case 1: 
            this.s.setState(UpDownSliding.b.a);
            this.i.setImageDrawable(getResources().getDrawable(2130838608));
          }
        } while (this.z == null);
        this.z.a(false);
        return;
        this.s.setState(UpDownSliding.b.b);
        this.i.setImageDrawable(getResources().getDrawable(2130837768));
      } while (this.z == null);
      this.z.a(false);
      return;
      this.s.setState(UpDownSliding.b.c);
      this.i.setImageDrawable(getResources().getDrawable(2130837700));
    } while (this.z == null);
    this.z.a(true);
    return;
    this.i.setImageDrawable(getResources().getDrawable(2130838608));
  }
  
  public void a(int paramInt)
  {
    if ((this.y != null) && (getActivity() != null)) {
      this.y.c(paramInt);
    }
  }
  
  public void a(long paramLong)
  {
    this.Q = paramLong;
    if (this.U == null)
    {
      this.U = new Timer();
      this.U.schedule(new TimerTask()
      {
        public void run()
        {
          if (ShowDroneUiFragment.g(ShowDroneUiFragment.this).f() == c.a.c)
          {
            ShowDroneUiFragment.this.b.sendEmptyMessage(1);
            return;
          }
          if (ShowDroneUiFragment.h(ShowDroneUiFragment.this) != null)
          {
            ShowDroneUiFragment.h(ShowDroneUiFragment.this).cancel();
            ShowDroneUiFragment.a(ShowDroneUiFragment.this, null);
            return;
          }
          ShowDroneUiFragment.a(ShowDroneUiFragment.this, null);
        }
      }, 0L, 1000L);
    }
  }
  
  public void a(c.a parama1, c.a parama2)
  {
    z.a(getActivity(), "状态变化啦" + parama1 + "-->" + parama2, 1000);
  }
  
  public void a(ShowDroneStatusLineFragment paramShowDroneStatusLineFragment, ShowDroneStatusFragment paramShowDroneStatusFragment)
  {
    this.y = paramShowDroneStatusLineFragment;
    this.z = paramShowDroneStatusFragment;
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.q.equals(c.b))
    {
      if (paramBoolean) {
        this.x.d();
      }
    }
    else {
      return;
    }
    this.x.e();
  }
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd)
  {
    X11RespCmd.NotificationType localNotificationType;
    if (this.y != null)
    {
      localNotificationType = paramX11RespCmd.getNotificationType();
      if (localNotificationType != X11RespCmd.NotificationType.CardRemoved) {
        break label137;
      }
      this.r.a(true);
      this.r.b(false);
      this.r.a(c.a.b);
      if (!paramBoolean) {}
      switch (paramX11RespCmd.getRval())
      {
      default: 
        label72:
        switch (paramX11RespCmd.getMsg_id())
        {
        }
        break;
      }
    }
    label137:
    do
    {
      do
      {
        do
        {
          return;
          if (localNotificationType == X11RespCmd.NotificationType.CardInsert)
          {
            this.r.b(true);
            break;
          }
          if (localNotificationType != X11RespCmd.NotificationType.PhotoFinish) {
            break;
          }
          a(true);
          break;
          this.r.t().b();
          break label72;
          this.r.r().e();
          if (this.v) {
            this.r.r().g();
          }
          for (;;)
          {
            i();
            return;
            this.r.r().h();
          }
          if ((this.l.W()) && (this.r.f() != c.a.c))
          {
            a(2131362840);
            a(true);
          }
          this.b.sendEmptyMessageDelayed(2, 2000L);
        } while (this.r.d());
        this.r.t().b();
        return;
        if (!this.l.U()) {
          a(2131362206);
        }
        this.r.a(c.a.b);
        a(false);
        i();
        return;
        a(true);
        this.r.k().getFileList().clear();
      } while (getActivity() == null);
      a(2131362840);
      return;
    } while ((c.b != this.q) || (!isAdded()));
    i();
    return;
    if (paramBoolean)
    {
      z.a(this.k, getString(2131362291), z.c);
      this.r.r().c(com.fimi.soul.biz.camera.e.cy);
      this.r.a(true);
    }
    for (;;)
    {
      com.fimi.kernel.c.b().c();
      return;
      z.a(this.k, this.k.getString(2131362289), z.c);
    }
  }
  
  public void d()
  {
    this.u = new NativeAudiolive();
    this.u.setLiveCallBackListener(new NativeAudiolive.LiveCallBackListener()
    {
      public String liveCallResult(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        if (paramAnonymousInt1 == 5001223) {
          z.a(ShowDroneUiFragment.this.getActivity(), 2131362422, 2000);
        }
        for (;;)
        {
          return null;
          if (paramAnonymousInt1 == 5001217) {
            ShowDroneUiFragment.e(ShowDroneUiFragment.this).fmLiveStop();
          } else if (ShowDroneUiFragment.f(ShowDroneUiFragment.this)) {
            if ((paramAnonymousInt1 == 5002753) || (paramAnonymousInt1 == 5002754) || (paramAnonymousInt1 == 5002755) || (paramAnonymousInt1 == 5001219) || (paramAnonymousInt1 == 5001221)) {
              ShowDroneUiFragment.a(ShowDroneUiFragment.this, paramAnonymousInt2);
            } else {
              ShowDroneUiFragment.b(ShowDroneUiFragment.this, paramAnonymousInt2);
            }
          }
        }
      }
    });
    if (this.u.isLivePushing()) {
      e(true);
    }
    this.t = new com.mi.live.openlivesdk.c("1465961173", "f423350548790693b784577448fd7d15", 1, new com.mi.live.openlivesdk.a.a()
    {
      public void a()
      {
        ShowDroneUiFragment.a(ShowDroneUiFragment.this, false);
      }
      
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        switch (paramAnonymousInt)
        {
        default: 
          return;
        case -2: 
          z.a(ShowDroneUiFragment.this.getActivity(), 2131362805, 2000);
          return;
        }
        z.a(ShowDroneUiFragment.this.getActivity(), 2131362806, 2000);
      }
      
      public void a(String paramAnonymousString)
      {
        ShowDroneUiFragment.this.a = paramAnonymousString;
        ShowDroneUiFragment.e(ShowDroneUiFragment.this).fmLiveStart(com.fimi.soul.biz.camera.e.d(), paramAnonymousString);
        ShowDroneUiFragment.a(ShowDroneUiFragment.this, true);
      }
      
      public void b(int paramAnonymousInt, String paramAnonymousString)
      {
        switch (paramAnonymousInt)
        {
        default: 
          return;
        case -2: 
          z.a(ShowDroneUiFragment.this.getActivity(), 2131362805, 2000);
          ShowDroneUiFragment.a(ShowDroneUiFragment.this, false);
          return;
        }
        z.a(ShowDroneUiFragment.this.getActivity(), 2131362806, 2000);
      }
    }, this.m);
  }
  
  public void e()
  {
    if (this.r != null) {
      this.r.m();
    }
  }
  
  public void onActivityCreated(@Nullable Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.ak = com.fimi.kernel.b.b.c.a(getActivity());
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.k = paramActivity.getApplicationContext();
    this.m = ((DroidPlannerApp)paramActivity.getApplication());
    this.ah = ((d)paramActivity);
    this.l = this.m.a;
  }
  
  @TargetApi(16)
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      do
      {
        do
        {
          int i1;
          do
          {
            do
            {
              return;
              com.fimi.soul.module.b.d.a(this.l).d();
              return;
              if (getString(2131361957).equals(this.X.getText().toString()))
              {
                com.fimi.soul.module.b.d.a(this.l).f();
                return;
              }
              com.fimi.soul.module.b.d.a(this.l).e();
              return;
              if (this.q.equals(c.a))
              {
                if (((h.a(getActivity().getApplicationContext()).a().get() == 2) || (this.l.aj().e() == 4)) && (this.Y.isShown())) {
                  this.Y.setVisibility(8);
                }
                f();
              }
              for (;;)
              {
                c(this.l.U());
                return;
                this.q = c.a;
                this.s.setVisibility(8);
                this.i.setImageDrawable(getResources().getDrawable(2130838302));
                if (this.af != null) {
                  this.af.b();
                }
                this.g.setImageDrawable(getResources().getDrawable(2130838607));
                ((FlightActivity)getActivity()).e();
                this.x.b();
                this.j.setEnabled(true);
                this.j.setImageAlpha(255);
                this.x.e();
                this.x.h();
              }
              this.ah.a();
              return;
              if (!this.q.equals(c.a)) {
                break;
              }
            } while (!this.l.aj().g().judgeOpenDrawLayout());
            this.l.a(d.a.aR);
            return;
            i1 = 4000;
          } while ((a().b() != null) && (a().b().isShowing()));
          a().a();
          if (a().b() != null) {
            a().b().setCancelable(false);
          }
          switch (3.c[this.ag.ordinal()])
          {
          }
          for (;;)
          {
            this.b.removeMessages(7);
            this.b.sendEmptyMessageDelayed(7, i1);
            return;
            if (this.r.f() == c.a.c)
            {
              this.r.u().g();
              this.b.sendEmptyMessageDelayed(2, 2000L);
            }
            else
            {
              this.r.u().f();
              continue;
              if (this.r.f() == c.a.d)
              {
                Log.d("Good", "连拍中--》停止连拍");
                i1 = 13000;
                this.S = true;
                b(false);
                this.r.u().d();
              }
              else
              {
                Log.d("Good", "开始连拍");
                this.r.u().e();
                continue;
                if ("JPG+DNG".equals(this.r.i().getImage_format())) {
                  i1 = 10000;
                }
                this.r.u().c();
                continue;
                if (!this.v)
                {
                  if (!ao.b(getActivity()))
                  {
                    z.a(getActivity(), 2131362474);
                    this.b.removeMessages(7);
                    this.b.sendEmptyMessageDelayed(7, 'ྠ');
                    return;
                  }
                  if (com.fimi.soul.biz.a.a.a().c())
                  {
                    z.a(getActivity(), 2131362474);
                    this.b.removeMessages(7);
                    this.b.sendEmptyMessageDelayed(7, 'ྠ');
                    return;
                  }
                  this.r.r().f();
                  this.u.fmLiveStop();
                  this.t.a(getActivity());
                }
                else
                {
                  this.t.b(getActivity());
                }
              }
            }
          }
          if (!this.q.equals(c.a)) {
            break;
          }
        } while (this.af == null);
        this.af.d();
        return;
        a(false);
        paramView = new Intent();
        paramView.setClass(getActivity(), DroneMediaTabActivity.class);
        startActivity(paramView);
        return;
      } while (this.r.f() != c.a.c);
      paramView = this.r.i().getVideoResolution();
    } while ((paramView == null) || ("".equals(paramView)) || ("1280x720 120P 16:9".contains(paramView)) || ("3840x2160 30P 16:9".contains(paramView)) || ("2560x1440 60P 16:9".contains(paramView)) || ((a().b() != null) && (a().b().isShowing())));
    a().a();
    if (a().b() != null) {
      a().b().setCancelable(false);
    }
    this.r.u().k();
    this.b.sendEmptyMessageDelayed(7, 4000L);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.ai = h.a(getActivity());
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968786, null);
    this.n = ((PercentRelativeLayout)paramLayoutInflater.findViewById(2131690539));
    paramViewGroup = paramLayoutInflater.findViewById(2131690210);
    this.x = new b(getActivity(), paramViewGroup);
    paramViewGroup.setOnClickListener(this);
    this.o = ((ImageView)this.n.findViewById(2131690569));
    this.p = ((ImageView)this.n.findViewById(2131690573));
    this.c = ((SectorProgressBar)this.n.findViewById(2131690571));
    this.c.setSectorProgressBarType(SectorProgressBar.a.a);
    this.d = ((SectorProgressBar)this.n.findViewById(2131690572));
    this.d.setSectorProgressBarType(SectorProgressBar.a.b);
    this.e = ((SectorProgressBar)this.n.findViewById(2131690578));
    if ((ShowDroneStatusFragment.e > 30) || (ShowDroneStatusFragment.e == 0)) {
      this.e.setSectorProgressBarType(SectorProgressBar.a.c);
    }
    for (;;)
    {
      this.f = ((SectorProgressBar)this.n.findViewById(2131690579));
      this.f.setSectorProgressBarType(SectorProgressBar.a.d);
      this.Y = ((PercentRelativeLayout)this.n.findViewById(2131690580));
      this.W = ((Button)this.n.findViewById(2131690581));
      this.X = ((Button)this.n.findViewById(2131690582));
      ao.a(getActivity().getAssets(), new View[] { this.W, this.X });
      this.g = ((ImageButton)this.n.findViewById(2131690570));
      this.h = ((ImageButton)this.n.findViewById(2131690574));
      this.i = ((ImageButton)this.n.findViewById(2131690575));
      this.j = ((ImageButton)this.n.findViewById(2131690576));
      paramViewGroup = new View[6];
      paramViewGroup[0] = this.g;
      paramViewGroup[1] = this.h;
      paramViewGroup[2] = this.i;
      paramViewGroup[3] = this.j;
      paramViewGroup[4] = this.W;
      paramViewGroup[5] = this.X;
      int i2 = paramViewGroup.length;
      int i1 = 0;
      while (i1 < i2)
      {
        paramViewGroup[i1].setOnClickListener(this);
        i1 += 1;
      }
      this.e.setSectorProgressBarType(SectorProgressBar.a.e);
    }
    this.s = ((UpDownSliding)this.n.findViewById(2131690577));
    if (this.s.getCurrentState() == UpDownSliding.b.a) {
      a(e.a);
    }
    for (;;)
    {
      this.s.setOnUpDownSliding(new UpDownSliding.c()
      {
        public void a(UpDownSliding.b paramAnonymousb)
        {
          Log.i("ljh", "current mode : " + paramAnonymousb);
          if (paramAnonymousb == UpDownSliding.b.b)
          {
            ShowDroneUiFragment.a(ShowDroneUiFragment.this, ShowDroneUiFragment.e.c);
            ShowDroneUiFragment.a(ShowDroneUiFragment.this);
            if (ShowDroneUiFragment.b(ShowDroneUiFragment.this) != null)
            {
              ShowDroneUiFragment.b(ShowDroneUiFragment.this);
              if ((ShowDroneStatusLineFragment.a) && (ShowDroneUiFragment.c(ShowDroneUiFragment.this).W()))
              {
                paramAnonymousb = ShowDroneUiFragment.d(ShowDroneUiFragment.this);
                ShowDroneUiFragment.d(ShowDroneUiFragment.this);
                if (paramAnonymousb != ShowDroneUiFragment.e.a) {
                  break label182;
                }
                if (ShowDroneUiFragment.b(ShowDroneUiFragment.this).a() == 0) {
                  ShowDroneUiFragment.b(ShowDroneUiFragment.this).a(ShowDroneUiFragment.this.getString(2131362840));
                }
              }
            }
          }
          label182:
          do
          {
            return;
            if (paramAnonymousb == UpDownSliding.b.c)
            {
              ShowDroneUiFragment.a(ShowDroneUiFragment.this, ShowDroneUiFragment.e.d);
              break;
            }
            if (paramAnonymousb != UpDownSliding.b.a) {
              break;
            }
            ShowDroneUiFragment.a(ShowDroneUiFragment.this, ShowDroneUiFragment.e.a);
            break;
            paramAnonymousb = ShowDroneUiFragment.d(ShowDroneUiFragment.this);
            ShowDroneUiFragment.d(ShowDroneUiFragment.this);
            if (paramAnonymousb == ShowDroneUiFragment.e.b)
            {
              ShowDroneUiFragment.b(ShowDroneUiFragment.this).a("0张");
              return;
            }
          } while ((ShowDroneUiFragment.d(ShowDroneUiFragment.this) != ShowDroneUiFragment.e.c) || (ShowDroneUiFragment.b(ShowDroneUiFragment.this).a() != 0));
        }
      });
      return paramLayoutInflater;
      if (this.s.getCurrentState() == UpDownSliding.b.b) {
        a(e.c);
      } else if (this.s.getCurrentState() == UpDownSliding.b.c) {
        a(e.d);
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.l.b(this);
    this.T = true;
    this.c.b();
    this.d.b();
    this.e.b();
    this.f.b();
    this.t.a();
    if (this.U != null) {
      this.U.cancel();
    }
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    if (parama == d.a.bZ)
    {
      if ((this.x != null) && (this.q == c.b)) {
        this.x.g();
      }
      if ((!parama1.U()) || (!parama1.T().a())) {
        break label2651;
      }
      switch (3.b[parama.ordinal()])
      {
      }
    }
    label246:
    label310:
    int i1;
    label397:
    label682:
    label744:
    label797:
    label808:
    label1076:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                return;
                if ((parama != d.a.ca) || (this.x == null)) {
                  break;
                }
                this.x.h();
                break;
                f();
                return;
                if (parama1.aj().f() == 4) {
                  a(this.X, getString(2131361958));
                }
                for (;;)
                {
                  if (!parama1.aj().g().isExceAction()) {
                    break label310;
                  }
                  if (!this.q.equals(c.a)) {
                    break label246;
                  }
                  if (this.Y.isShown()) {
                    break;
                  }
                  this.Y.setVisibility(0);
                  return;
                  if (parama1.aj().f() == 2) {
                    a(this.X, getString(2131361957));
                  }
                }
              } while (((!this.q.equals(c.b)) || (h.a(getActivity().getApplicationContext()).a().get() != 2)) && ((parama1.aj().e() != 4) || (!this.Y.isShown())));
              this.Y.setVisibility(8);
              return;
            } while (!this.Y.isShown());
            this.Y.setVisibility(8);
            return;
            com.fimi.soul.module.b.d.a(parama1).c(147);
            i1 = parama1.J().a();
            if (i1 != 80) {
              break label397;
            }
          } while (!getString(2131361957).equals(this.X.getText().toString()));
          a(this.X, getString(2131361958));
          return;
          if (i1 == 82)
          {
            a(this.X, getString(2131361957));
            return;
          }
          if (this.Y.isShown()) {
            this.Y.setVisibility(8);
          }
          switch (this.ai.a().get())
          {
          }
          for (;;)
          {
            this.ai.a(0);
            a(this.X, getString(2131361957));
            return;
            parama1.a(d.a.bm);
            continue;
            parama1.a(d.a.bv);
            continue;
            parama1.a(d.a.bD);
            continue;
            parama1.a(d.a.bL);
          }
          if ((this.af != null) && (this.af.e()))
          {
            if (!this.q.equals(c.a)) {
              break label744;
            }
            this.af.b();
            if (this.af.c() == a.a.c)
            {
              parama = parama1.u();
              parama = new LatLng(parama.e(), parama.d());
              this.af.a(parama);
            }
          }
          double d1 = (parama1.u().f() - 677216.0D) / 10.0D;
          if (!parama1.ac()) {
            d1 = 0.0D;
          }
          if (d1 >= 0.0D) {
            if (d1 >= 100.0D)
            {
              this.c.setProgress(100.0F);
              this.c.a(70.0F);
              d1 = parama1.u().g();
              if (!parama1.ac()) {
                d1 = 0.0D;
              }
              if (d1 <= 0.0D) {
                break label808;
              }
              parama = this.d;
              if ((float)d1 <= 100.0F) {
                break label797;
              }
            }
          }
          for (float f1 = 100.0F;; f1 = (float)(0.7D * d1))
          {
            parama.setProgress(f1);
            this.d.a((float)(d1 * 0.7D));
            return;
            this.af.a(2130838361);
            break;
            this.c.setProgress((float)(0.7D * d1));
            this.c.a((float)(d1 * 0.7D));
            break label682;
            this.c.setProgress(0.0F);
            break label682;
          }
          this.d.setProgress(0.0F);
          return;
          d1 = ShowDroneStatusFragment.e;
          if ((0.0D < d1) && (d1 < 30.0D)) {
            this.e.setSectorProgressBarType(SectorProgressBar.a.e);
          }
          for (;;)
          {
            this.e.setProgress((float)d1);
            this.e.a((float)(d1 * 0.7D));
            return;
            this.e.setSectorProgressBarType(SectorProgressBar.a.c);
          }
          c(parama1.U());
          if (parama1.aj().g().isLightStream()) {
            break label1076;
          }
          i1 = parama1.u().c();
        } while (i1 <= 4);
        if (i1 <= 8) {
          this.f.setSectorProgressBarType(SectorProgressBar.a.f);
        }
        while (i1 <= 8)
        {
          this.f.setProgress(i1 * 4.2F);
          this.f.a(i1 * 2.87F);
          return;
          this.f.setSectorProgressBarType(SectorProgressBar.a.d);
        }
        if ((i1 > 8) && (i1 <= 13))
        {
          this.f.setProgress(i1 * 5.5F - 11.0F);
          this.f.a((float)(i1 * 4.6F - 13.8D));
          return;
        }
        this.f.setProgress(i1 * 4.7F + 5.0F);
        this.f.a((float)(i1 * 3.29F + 3.2D));
        return;
      } while (this.f.getProgress() == 0.0F);
      this.f.setProgress(0.0F);
      this.f.a(0.0F);
      return;
      a(parama1.W());
      i();
      return;
      parama = parama1.ad();
      if ((parama.Z()) && (!parama.u()))
      {
        this.x.a(getString(2131362223));
        return;
      }
      if ((parama.ab()) && (!parama.u()))
      {
        this.x.a(getString(2131362221));
        return;
      }
      if ((parama.ah()) && (!parama.u()))
      {
        this.x.a(getString(2131362373));
        return;
      }
      if ((parama.t()) && (!parama.u()))
      {
        this.x.a(getString(2131362374));
        return;
      }
      if ((parama.Y()) && (!parama.u()))
      {
        this.x.a(getString(2131362298));
        return;
      }
      if ((parama.aa()) && (!parama.u()))
      {
        this.x.a(getString(2131362220));
        return;
      }
      if ((parama.ac()) && (!parama.u()))
      {
        this.x.a(getString(2131362209));
        return;
      }
      if ((parama.ad()) && (!parama.u()))
      {
        this.x.a(getString(2131362200));
        return;
      }
      if ((parama.u()) && (!parama1.W()))
      {
        this.x.a(getString(2131362206));
        a(2131362206);
        return;
      }
      this.x.a(null);
      return;
      i1 = parama1.c.a();
      if (i1 == 49)
      {
        parama = (i)parama1.c;
        if ((!this.S) && (parama.e() != i.a.e))
        {
          a().c();
          this.b.removeMessages(7);
        }
        if (parama.e() == i.a.b)
        {
          this.r.u().a(e.a.a);
          if (this.q.equals(c.b)) {
            this.i.setImageDrawable(getResources().getDrawable(2130838436));
          }
          this.r.a(c.a.c);
          if (!this.R)
          {
            this.R = true;
            ao.m(getActivity());
            this.b.sendEmptyMessageDelayed(12, 2000L);
          }
          z.a(getActivity(), getString(2131362596), 1500);
          a(System.currentTimeMillis());
          parama1.a(d.a.bQ);
        }
        for (;;)
        {
          i();
          return;
          if (parama.e() == i.a.c)
          {
            this.r.u().a(e.a.c);
            if (this.q.equals(c.b)) {
              this.i.setImageDrawable(getResources().getDrawable(2130838436));
            }
            z.a(getActivity(), getString(2131362595), 1500);
            if (!this.aa)
            {
              this.aa = true;
              ao.l(getActivity());
              this.b.sendEmptyMessageDelayed(11, 2000L);
            }
            this.r.a(c.a.b);
            k();
          }
          else
          {
            if (parama.e() == i.a.f)
            {
              this.r.u().a(e.a.b);
              if (this.r.f() == c.a.c) {
                z.a(getActivity(), getString(2131362061), 1500);
              }
              for (;;)
              {
                if (!this.Z)
                {
                  this.Z = true;
                  ao.n(getActivity());
                  this.b.sendEmptyMessageDelayed(10, 1500L);
                }
                a(e.c);
                this.r.a(true);
                break;
                if (this.q.equals(c.b)) {
                  this.i.setImageDrawable(getResources().getDrawable(2130838436));
                }
                z.a(getActivity(), 2131362823, 1500);
                a(2131362840);
                this.r.a(c.a.b);
              }
            }
            if (parama.e() == i.a.d)
            {
              z.a(getActivity(), "开始连拍", 1500);
              this.b.sendEmptyMessageDelayed(7, 2000L);
              this.r.a(c.a.d);
            }
            else if (parama.e() == i.a.e)
            {
              z.a(getActivity(), "停止连拍", 3000);
              this.r.a(c.a.b);
              this.b.sendEmptyMessageDelayed(2, 100L);
            }
          }
        }
      }
    } while (i1 != 50);
    parama = (g)parama1.c;
    if (parama.f() != g.a.f)
    {
      this.r.b(true);
      label2007:
      switch (3.a[parama.f().ordinal()])
      {
      }
    }
    for (;;)
    {
      i();
      return;
      this.r.b(false);
      break label2007;
      if (this.r.d())
      {
        a(e.a);
        this.r.a(c.a.c);
        if (parama.d() != 0L) {
          a(System.currentTimeMillis() - parama.d());
        }
        this.r.a(true);
        continue;
        a(e.b);
        this.r.a(c.a.d);
        if (this.y != null) {
          this.y.a(parama.d() + "张");
        }
        this.r.a(true);
        continue;
        if (this.S)
        {
          a(2131362840);
          a().c();
          this.b.sendEmptyMessage(3);
          this.S = false;
          this.b.removeMessages(7);
          b(true);
        }
        if (this.b.hasMessages(7)) {
          break;
        }
        if ((!this.r.d()) && (parama1.U())) {
          a(2131362840);
        }
        if ((this.y != null) && ((this.y.a() == 2131362841) || (this.y.a() == 2131362837) || (this.y.a() == 2131362842) || (this.y.a() == 2131362838))) {
          a(2131362840);
        }
        k();
        this.r.a(c.a.b);
        continue;
        a(2131362842);
        this.r.a(c.a.b);
        continue;
        a(2131362837);
        this.r.a(c.a.b);
        continue;
        a(2131362841);
        this.r.a(c.a.b);
        continue;
        if ((!this.r.d()) && (parama1.U()) && (!com.fimi.soul.biz.e.d.a().m()))
        {
          a(2131362832);
          continue;
          if ((!this.r.d()) && (parama1.U()) && (!com.fimi.soul.biz.e.d.a().m()))
          {
            a(2131362833);
            continue;
            a(2131362838);
            this.r.a(c.a.b);
            k();
            continue;
            this.S = true;
            a(2131362844);
            continue;
            a(2131362839);
            h();
            continue;
            a(2131362838);
            continue;
            a(2131362838);
            g();
            continue;
            a(2131362292);
            continue;
            a(2131362039);
          }
        }
      }
    }
    label2651:
    switch (3.b[parama.ordinal()])
    {
    default: 
      if (!parama1.T().a())
      {
        if (this.d.getProgress() != 0.0F)
        {
          this.d.setProgress(0.0F);
          this.d.a(0.0F);
        }
        if (this.f.getProgress() != 0.0F)
        {
          this.f.setProgress(0.0F);
          this.f.a(0.0F);
        }
        if (this.e.getProgress() != 0.0F)
        {
          this.e.setProgress(0.0F);
          this.e.a(0.0F);
        }
        if (this.c.getProgress() != 0.0F)
        {
          this.c.setProgress(0.0F);
          this.c.a(0.0F);
        }
      }
      if (!parama1.W()) {
        a(false);
      }
      if ((!parama1.U()) && (this.af != null))
      {
        if (!this.q.equals(c.a)) {
          break label2928;
        }
        this.af.b();
      }
      break;
    }
    for (;;)
    {
      this.r.a(c.a.b);
      if (!parama1.W())
      {
        a(2131362206);
        this.r.k().getFileList().clear();
      }
      e(false);
      i();
      c(false);
      this.x.a(null);
      this.r.a(true);
      return;
      a(false);
      k();
      break;
      label2928:
      this.af.a(2130838361);
    }
  }
  
  public void onResume()
  {
    super.onResume();
    this.s.b(getActivity());
    boolean bool = com.fimi.soul.biz.e.d.a().k();
    if ((bool != this.ab) && (bool)) {
      this.ag = e.c;
    }
    this.r.c(true);
    if (!this.I) {
      this.b.sendEmptyMessage(8);
    }
  }
  
  public void onStart()
  {
    super.onStart();
    if (this.af == null)
    {
      this.af = com.fimi.soul.biz.d.a.a();
      this.af.a(this.j, this.l);
    }
    this.aa = false;
    this.Z = false;
    this.l.a(this);
    this.r.a(this);
    this.r.a(this);
    if ((!this.r.d()) && (this.l.W())) {
      this.r.t().b();
    }
    if (this.r.d()) {
      this.r.r().b();
    }
    a(true);
    this.b.sendEmptyMessageDelayed(2, 2000L);
    this.ab = com.fimi.soul.biz.e.d.a().k();
  }
  
  public void onStop()
  {
    super.onStop();
    a(false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.x.c();
    d();
  }
  
  private static enum a
  {
    private a() {}
  }
  
  private static enum b
  {
    private b() {}
  }
  
  private static enum c
  {
    private c() {}
  }
  
  public static abstract interface d
  {
    public abstract void a();
  }
  
  public static enum e
  {
    private e() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/ShowDroneUiFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */