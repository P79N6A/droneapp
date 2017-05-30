package com.fimi.soul.module.droneFragment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.fimi.kernel.utils.v;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.j.g;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.a.e;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.entity.DroneModelType;
import com.fimi.soul.entity.ErrorMode;
import com.fimi.soul.media.player.FermiPlayerFullActivity;
import com.fimi.soul.module.calibcompass.CaliCompassActivity;
import com.fimi.soul.module.droneui.a.a;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.module.remote.RemoteCalibration;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.ap;
import com.fimi.soul.utils.x;
import com.fimi.soul.view.AutoScrollTextView;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;

public class ShowDroneStatusLineFragment
  extends Fragment
  implements Handler.Callback, View.OnClickListener, com.fimi.soul.biz.j.d, d.b
{
  public static boolean a = false;
  private Handler A = new Handler(this);
  private com.fimi.soul.module.b.d B;
  private boolean C = false;
  private Timer D;
  private Button E;
  private ImageView F;
  private com.fimi.soul.biz.j.c G;
  private g H;
  private com.fimi.soul.view.d I;
  private com.fimi.soul.biz.j.a J;
  private String K;
  private Observer L = new Observer()
  {
    public void update(Observable paramAnonymousObservable, Object paramAnonymousObject)
    {
      paramAnonymousObject = new Point();
      paramAnonymousObservable = ShowDroneStatusLineFragment.this.getActivity().getWindow().getWindowManager().getDefaultDisplay();
      paramAnonymousObservable.getSize((Point)paramAnonymousObject);
      if ((ShowDroneStatusLineFragment.a(ShowDroneStatusLineFragment.this).isShown()) || (ShowDroneStatusLineFragment.b(ShowDroneStatusLineFragment.this).isShown()))
      {
        paramAnonymousObject = (RelativeLayout.LayoutParams)ShowDroneStatusLineFragment.c(ShowDroneStatusLineFragment.this).getLayoutParams();
        ((RelativeLayout.LayoutParams)paramAnonymousObject).width = (paramAnonymousObservable.getWidth() * 0);
        ((RelativeLayout.LayoutParams)paramAnonymousObject).addRule(0, ShowDroneStatusLineFragment.a(ShowDroneStatusLineFragment.this).getId());
        ((RelativeLayout.LayoutParams)paramAnonymousObject).setMargins((int)(paramAnonymousObservable.getHeight() * 0.15D), 0, (int)(paramAnonymousObservable.getHeight() * 0.15D), 0);
        ((RelativeLayout.LayoutParams)paramAnonymousObject).addRule(1, ShowDroneStatusLineFragment.d(ShowDroneStatusLineFragment.this).getId());
        ShowDroneStatusLineFragment.c(ShowDroneStatusLineFragment.this).setLayoutParams((ViewGroup.LayoutParams)paramAnonymousObject);
        return;
      }
      paramAnonymousObject = (RelativeLayout.LayoutParams)ShowDroneStatusLineFragment.c(ShowDroneStatusLineFragment.this).getLayoutParams();
      ((RelativeLayout.LayoutParams)paramAnonymousObject).width = (paramAnonymousObservable.getWidth() * 0);
      ((RelativeLayout.LayoutParams)paramAnonymousObject).addRule(0, ShowDroneStatusLineFragment.e(ShowDroneStatusLineFragment.this).getId());
      ((RelativeLayout.LayoutParams)paramAnonymousObject).setMargins((int)(paramAnonymousObservable.getHeight() * 0.15D), 0, (int)(paramAnonymousObservable.getHeight() * 0.15D), 0);
      ((RelativeLayout.LayoutParams)paramAnonymousObject).addRule(1, ShowDroneStatusLineFragment.d(ShowDroneStatusLineFragment.this).getId());
      ShowDroneStatusLineFragment.c(ShowDroneStatusLineFragment.this).setLayoutParams((ViewGroup.LayoutParams)paramAnonymousObject);
    }
  };
  private ErrorMode M;
  private boolean N;
  v b;
  int c = 0;
  int d = 0;
  long e = 0L;
  boolean f = false;
  int g = 0;
  int h = 0;
  private DroidPlannerApp i;
  private com.fimi.soul.drone.a j;
  private com.fimi.soul.module.droneui.a k;
  private Context l;
  private TextView m;
  private TextView n;
  private AutoScrollTextView o;
  private LinearLayout p;
  private Button q;
  private ImageView r;
  private ImageView s;
  private ImageView t;
  private ImageView u;
  private ImageView v;
  private ImageView w;
  private final int x = 0;
  private final int y = 1;
  private final int z = 2;
  
  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.k != null) && (this.k.isShowing()))
    {
      this.k.dismiss();
      this.k = null;
    }
    this.k = new com.fimi.soul.module.droneui.a(getActivity(), getString(paramInt1), getString(paramInt2), paramInt3, 3, false, new a.a()
    {
      public void a()
      {
        if (ShowDroneStatusLineFragment.i(ShowDroneStatusLineFragment.this) != null)
        {
          ShowDroneStatusLineFragment.i(ShowDroneStatusLineFragment.this).dismiss();
          ShowDroneStatusLineFragment.a(ShowDroneStatusLineFragment.this, null);
        }
      }
      
      public void b() {}
      
      public void c() {}
      
      public void d()
      {
        if (ShowDroneStatusLineFragment.i(ShowDroneStatusLineFragment.this) != null)
        {
          ShowDroneStatusLineFragment.i(ShowDroneStatusLineFragment.this).dismiss();
          ShowDroneStatusLineFragment.a(ShowDroneStatusLineFragment.this, null);
        }
      }
    });
    this.k.setCancelable(true);
    this.k.show();
  }
  
  @TargetApi(16)
  private void a(q paramq)
  {
    int i3 = 0;
    int i4 = 2130837599;
    int i2 = 2131362202;
    int i1;
    if (paramq.P()) {
      if ((this.j.aj().e() == 7) || (this.j.aj().e() == 8))
      {
        i1 = 2131362761;
        i2 = 2131362762;
        i4 = 2130838273;
        i3 = 2131362739;
      }
    }
    for (;;)
    {
      if ((this.d != i1) && (i4 != 0)) {
        a(i3, i2, i4);
      }
      this.d = i1;
      return;
      if (this.j.aj().e() == 9)
      {
        i1 = 2131362760;
        i2 = 2131362127;
        break;
      }
      i1 = 2131362737;
      i2 = 2131362738;
      break;
      if ((paramq.g()) || ((this.j.h() != null) && (this.j.h().f() == 3)))
      {
        i1 = 2131362764;
        i3 = 2131362766;
        i2 = 2131362765;
        i4 = 2130838332;
      }
      else if (paramq.m())
      {
        i1 = 2131362724;
        i3 = 2131362726;
        i2 = 2131362725;
      }
      else if ((paramq.f()) && (!this.j.aj().g().isLightStream()))
      {
        i3 = 2131362735;
        i2 = 2131362734;
        i1 = 2131362733;
        i4 = 2130838366;
      }
      else if (paramq.F())
      {
        i1 = 2131362751;
        i3 = 2131362848;
        i2 = 2131362638;
      }
      else if (paramq.E())
      {
        i1 = 2131362752;
        i3 = 2131362849;
        i2 = 2131362639;
      }
      else if (paramq.ae())
      {
        i1 = 2131362711;
        i3 = 2131362713;
        i2 = 2131362712;
      }
      else if ((this.j.aj().g().isLightStream()) && (paramq.p()))
      {
        i3 = 2131362747;
        i2 = 2131362746;
        i1 = 2131362745;
        i4 = 2130838366;
      }
      else if (paramq.O())
      {
        i1 = 2131362740;
        i4 = 0;
      }
      else if (paramq.N())
      {
        i1 = 2131362730;
        i4 = 0;
      }
      else
      {
        if (!paramq.T()) {
          break label390;
        }
        i4 = 2130838229;
        i3 = 2131362795;
        i2 = 2131362794;
        i1 = 2131362793;
      }
    }
    label390:
    this.d = 0;
  }
  
  private float b(String paramString)
  {
    new DisplayMetrics();
    float f1 = getResources().getDisplayMetrics().density;
    TextPaint localTextPaint = new TextPaint();
    Rect localRect = new Rect();
    localTextPaint.setTextSize(13.0F);
    localTextPaint.getTextBounds(paramString, 0, paramString.length(), localRect);
    return f1 * localRect.width();
  }
  
  private void b()
  {
    this.v.setVisibility(4);
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    this.q.setVisibility(paramInt2);
    if (!getString(paramInt1).equals(this.q.getText().toString())) {
      this.q.setText(paramInt1);
    }
    this.q.setEnabled(true);
    this.J.a(true);
  }
  
  private void c()
  {
    if (!isAdded()) {
      return;
    }
    if (!this.j.U())
    {
      com.fimi.kernel.d.b.b(com.fimi.kernel.c.d()).b();
      return;
    }
    this.M = this.H.a(this.j);
    ArrayList localArrayList = this.M.getLightErrorList();
    if (localArrayList.size() <= this.c) {
      this.c = 0;
    }
    if (this.j.ac())
    {
      if (!this.j.ad().S()) {
        break label291;
      }
      this.h += 1;
      if (this.h >= 3)
      {
        a(2131362852, 2131362126, 2130838366);
        com.fimi.kernel.d.b.b(com.fimi.kernel.c.d()).a(com.fimi.kernel.c.d().getString(2131362753));
        ap.a(com.fimi.kernel.c.d(), 2000L);
        this.h = 0;
      }
    }
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      this.o.setVisibility(0);
      this.o.setTextColor(getResources().getColor(2131624289));
      d(getText(((Integer)localArrayList.get(this.c)).intValue()).toString());
      this.r.setVisibility(4);
    }
    for (;;)
    {
      this.c += 1;
      if (((!this.M.isCompassFault()) && (!this.M.isMiddleFault())) || (this.j.ac())) {
        break label465;
      }
      c(true);
      this.E.setText(getString(2131362577));
      this.w.setVisibility(4);
      return;
      label291:
      if (!this.j.ad().P()) {
        break;
      }
      this.h += 1;
      if (this.h < 4) {
        break;
      }
      int i2;
      int i1;
      if ((this.j.aj().e() == 7) || (this.j.aj().e() == 8))
      {
        i2 = 2131362761;
        i1 = 2131362762;
      }
      for (;;)
      {
        a(2131362853, i1, 2130838366);
        com.fimi.kernel.d.b.b(com.fimi.kernel.c.d()).a(com.fimi.kernel.c.d().getString(i2));
        ap.a(com.fimi.kernel.c.d(), 2000L);
        this.h = 0;
        break;
        if (this.j.aj().e() == 9)
        {
          i2 = 2131362760;
          i1 = 2131362127;
        }
        else
        {
          i2 = 2131362737;
          i1 = 2131362738;
        }
      }
      this.o.setVisibility(8);
      this.r.setVisibility(0);
      d("");
      b();
    }
    label465:
    c(false);
    if ((this.M.getSeriousErrorList().size() > 0) && (this.q.getVisibility() != 0))
    {
      this.w.setVisibility(0);
      return;
    }
    this.w.setVisibility(4);
  }
  
  private void c(int paramInt1, int paramInt2)
  {
    this.q.setVisibility(paramInt2);
    if (!"".equals(this.q.getText().toString())) {
      this.q.setVisibility(8);
    }
    this.q.setEnabled(false);
    this.J.a(false);
  }
  
  private void c(boolean paramBoolean)
  {
    Button localButton = this.E;
    if (paramBoolean) {}
    for (int i1 = 0;; i1 = 4)
    {
      localButton.setVisibility(i1);
      this.J.a(paramBoolean);
      return;
    }
  }
  
  private boolean c(String paramString)
  {
    if ((paramString == null) || (!paramString.contains(":"))) {
      return false;
    }
    try
    {
      Integer.valueOf(paramString.split(":")[0]).intValue();
      return true;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return false;
  }
  
  private void d(int paramInt)
  {
    if (isAdded())
    {
      if (this.o.getVisibility() != 0) {
        this.r.setVisibility(0);
      }
      if (!getString(2131362673).equals(this.m.getText().toString())) {
        break label74;
      }
      this.r.setImageResource(2130838335);
      this.r.setTag(Integer.valueOf(2130838335));
    }
    label74:
    do
    {
      return;
      if (this.r.getTag() == null)
      {
        this.r.setImageResource(paramInt);
        this.r.setTag(Integer.valueOf(paramInt));
        return;
      }
    } while (paramInt == ((Integer)this.r.getTag()).intValue());
    this.r.setImageResource(paramInt);
    this.r.setTag(Integer.valueOf(paramInt));
  }
  
  private void d(String paramString)
  {
    if ((paramString != null) && (!paramString.equals(this.o.getText().toString())))
    {
      if (paramString.equals(""))
      {
        this.m.setTextSize(11.0F);
        this.o.setVisibility(8);
      }
    }
    else {
      return;
    }
    this.m.setTextSize(9.0F);
    this.o.setVisibility(0);
    this.o.setText(paramString, TextView.BufferType.NORMAL);
    paramString = AnimationUtils.loadAnimation(this.l, 2131034125);
    this.o.setAnimation(paramString);
  }
  
  private void e(int paramInt)
  {
    if ((!this.A.hasMessages(0)) && (!getString(paramInt).equals(this.o.getText())))
    {
      Message localMessage = Message.obtain();
      localMessage.what = 0;
      localMessage.obj = Integer.valueOf(paramInt);
      this.A.sendMessageDelayed(localMessage, 2500L);
    }
  }
  
  private void f(int paramInt)
  {
    if ((paramInt == 0) || (getString(paramInt).equals(this.m.getText().toString()))) {
      return;
    }
    this.m.setText(paramInt);
  }
  
  public int a()
  {
    return this.g;
  }
  
  public void a(int paramInt)
  {
    f(paramInt);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 > 0)
    {
      b(paramInt1, paramInt2);
      return;
    }
    c(paramInt1, paramInt2);
  }
  
  public void a(String paramString)
  {
    if (c(paramString))
    {
      if (getActivity() != null) {
        ao.b(getActivity().getAssets(), new View[] { this.n });
      }
      this.n.setTextSize(1, 16.5F);
      this.n.setPadding(0, 0, 0, 0);
      this.s.setVisibility(0);
    }
    for (;;)
    {
      this.n.setText(paramString);
      return;
      if (getActivity() != null) {
        ao.a(getActivity().getAssets(), new View[] { this.n });
      }
      this.n.setTextSize(1, 13.0F);
      this.n.setTextColor(-1);
      this.n.setPadding(0, (int)(14.0F * getResources().getDisplayMetrics().density / 3.0F), 0, 0);
      this.s.setVisibility(4);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (System.currentTimeMillis() - this.e >= 800L))
    {
      this.e = System.currentTimeMillis();
      if (!this.f) {
        break label93;
      }
      this.f = false;
      this.s.setImageDrawable(null);
    }
    for (;;)
    {
      this.n.setAlpha(1.0F);
      this.s.invalidate();
      if (!paramBoolean)
      {
        this.s.setImageDrawable(getResources().getDrawable(2130837967));
        this.n.setAlpha(0.3F);
      }
      return;
      label93:
      this.f = true;
      this.s.setImageDrawable(getResources().getDrawable(2130838435));
    }
  }
  
  public void b(int paramInt)
  {
    d(paramInt);
  }
  
  public void b(boolean paramBoolean)
  {
    this.N = paramBoolean;
  }
  
  public void c(int paramInt)
  {
    if (paramInt <= 0) {
      return;
    }
    this.g = paramInt;
    a(getString(paramInt));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 0) {
      if (this.j.U()) {
        d(getString(((Integer)paramMessage.obj).intValue()));
      }
    }
    for (;;)
    {
      return false;
      if (paramMessage.what == 1)
      {
        c();
      }
      else if (paramMessage.what == 2)
      {
        d(2130838334);
        this.m.setText(getString(2131362675));
      }
    }
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.i = ((DroidPlannerApp)paramActivity.getApplication());
    this.j = this.i.a;
    this.l = paramActivity;
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131690587: 
    case 2131690588: 
    default: 
    case 2131690590: 
    case 2131690589: 
    case 2131690591: 
      do
      {
        do
        {
          return;
          if ((this.M != null) && (this.M.isMiddleFault()))
          {
            startActivity(new Intent(getActivity(), RemoteCalibration.class));
            return;
          }
        } while ((this.M == null) || (!this.M.isCompassFault()));
        paramView = new Intent(getActivity(), CaliCompassActivity.class);
        paramView.putExtra("isdirectcalicompass", true);
        startActivity(paramView);
        return;
        if ((this.j.T().a()) && (this.j.U()))
        {
          this.B.d();
          this.j.a(d.a.bo);
          return;
        }
        this.b.a().edit().putBoolean("is_setting_enter", true).commit();
        paramView = new Intent(this.l, LoginActivity.class);
        paramView.putExtra("login", false);
        startActivity(paramView);
        return;
      } while ((!this.j.W()) || (this.N));
      startActivity(new Intent(this.l, FermiPlayerFullActivity.class));
      return;
    }
    this.M = this.H.a(this.j);
    this.I.a(this.M.getSeriousErrorList(), paramView, (int)getResources().getDimension(2131296495), (int)getResources().getDimension(2131296496));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.H = g.a();
    this.J = new com.fimi.soul.biz.j.a();
    this.J.addObserver(this.L);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968790, null);
    this.m = ((TextView)paramLayoutInflater.findViewById(2131690036));
    this.m.getPaint().setFakeBoldText(true);
    this.v = ((ImageView)paramLayoutInflater.findViewById(2131690585));
    this.o = ((AutoScrollTextView)paramLayoutInflater.findViewById(2131690047));
    this.p = ((LinearLayout)paramLayoutInflater.findViewById(2131690583));
    this.n = ((TextView)paramLayoutInflater.findViewById(2131690591));
    this.n.setOnClickListener(this);
    this.q = ((Button)paramLayoutInflater.findViewById(2131690589));
    this.q.setOnClickListener(this);
    this.E = ((Button)paramLayoutInflater.findViewById(2131690590));
    this.E.setOnClickListener(this);
    this.r = ((ImageView)paramLayoutInflater.findViewById(2131690033));
    this.s = ((ImageView)paramLayoutInflater.findViewById(2131690592));
    this.t = ((ImageView)paramLayoutInflater.findViewById(2131690587));
    this.u = ((ImageView)paramLayoutInflater.findViewById(2131690584));
    this.F = ((ImageView)paramLayoutInflater.findViewById(2131690588));
    this.w = ((ImageView)paramLayoutInflater.findViewById(2131690586));
    this.w.setOnClickListener(this);
    ao.a(getActivity().getAssets(), new View[] { this.m, this.o, this.q });
    ao.b(getActivity().getAssets(), new View[] { this.n });
    this.B = com.fimi.soul.module.b.d.a(this.j);
    if (this.j.W()) {
      c(2131362840);
    }
    for (;;)
    {
      this.I = new com.fimi.soul.view.d(getActivity(), (int)getResources().getDimension(2131296494), 400);
      a = true;
      this.o.a(0.0F);
      this.o.setEnabled(false);
      this.o.addTextChangedListener(new TextWatcher()
      {
        public void afterTextChanged(Editable paramAnonymousEditable) {}
        
        public void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          if (!"".equals(paramAnonymousCharSequence.toString())) {
            ShowDroneStatusLineFragment.a(ShowDroneStatusLineFragment.this, paramAnonymousCharSequence.toString());
          }
        }
        
        public void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          if ((!"".equals(paramAnonymousCharSequence.toString())) && (!paramAnonymousCharSequence.toString().equals(ShowDroneStatusLineFragment.f(ShowDroneStatusLineFragment.this))))
          {
            paramAnonymousInt1 = ShowDroneStatusLineFragment.c(ShowDroneStatusLineFragment.this).getMeasuredWidth();
            new Paint().setTextSize(ShowDroneStatusLineFragment.g(ShowDroneStatusLineFragment.this).getTextSize());
            if (ShowDroneStatusLineFragment.b(ShowDroneStatusLineFragment.this, paramAnonymousCharSequence.toString()) <= paramAnonymousInt1 - 20) {
              break label110;
            }
            if (!ShowDroneStatusLineFragment.g(ShowDroneStatusLineFragment.this).b) {
              ShowDroneStatusLineFragment.g(ShowDroneStatusLineFragment.this).a();
            }
          }
          return;
          label110:
          ShowDroneStatusLineFragment.g(ShowDroneStatusLineFragment.this).b();
        }
      });
      this.D = new Timer();
      this.D.schedule(new TimerTask()
      {
        public void run()
        {
          ShowDroneStatusLineFragment.h(ShowDroneStatusLineFragment.this).sendEmptyMessage(1);
        }
      }, 0L, 3000L);
      if ((!this.j.U()) && (!this.j.T().a()))
      {
        b(2131362102, 0);
        this.m.setText(2131362104);
      }
      return paramLayoutInflater;
      c(2131362206);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.J.deleteObserver(this.L);
    this.j.b(this);
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    if ((parama1.U()) && (parama1.T().a()))
    {
      this.C = true;
      if (getResources().getColor(2131624291) != this.m.getCurrentTextColor()) {
        this.m.setTextColor(getResources().getColor(2131624291));
      }
      switch (5.a[parama.ordinal()])
      {
      case 1: 
      case 2: 
      default: 
        return;
      }
      parama = parama1.ad();
      if ((parama.a() >= 0) || ((parama1.h() != null) && (parama1.h().f() == 3)))
      {
        if (parama1.ac())
        {
          a(parama);
          return;
        }
        this.d = 0;
        return;
      }
      this.d = 0;
      this.w.setVisibility(4);
      return;
    }
    switch (5.a[parama.ordinal()])
    {
    }
    for (;;)
    {
      if ((this.M != null) && (this.M.getLightErrorList().size() == 0))
      {
        d("");
        b();
        this.o.a(0.0F);
        this.o.b();
      }
      this.w.setVisibility(4);
      this.g = 0;
      this.d = 0;
      return;
      x.d();
      this.m.setText(2131362141);
      d("");
      d(2130838336);
      this.m.setTextColor(getResources().getColor(2131624063));
      this.q.setVisibility(0);
      c(false);
      b(2131362103, 0);
      if ((this.C) && (parama1.ac()))
      {
        this.C = false;
        com.fimi.kernel.d.b.b(getActivity()).a(getString(2131362141));
        continue;
        if (!parama1.U())
        {
          x.d();
          this.m.setTextColor(getResources().getColor(2131624291));
          d(2130838335);
          this.m.setText(2131362859);
          this.q.setVisibility(8);
          if ((this.M != null) && (!this.M.isMiddleFault())) {
            c(false);
          }
        }
      }
    }
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void onStart()
  {
    super.onStart();
    this.b = v.a(getActivity());
    if (this.G == null) {
      this.G = new com.fimi.soul.biz.j.c(this, this.j, getActivity());
    }
    this.j.a(this);
    this.G.b();
    this.G.d();
    if ((this.j.W()) && (getString(2131362206).equalsIgnoreCase(this.n.getText().toString()))) {
      a(getString(2131362840));
    }
  }
  
  public void onStop()
  {
    super.onStop();
    this.G.c();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */