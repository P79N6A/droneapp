package com.fimi.soul.module.droneFragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.soul.biz.c.d;
import com.fimi.soul.biz.c.j;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.y;
import com.fimi.soul.view.MyEditView;
import com.fimi.soul.view.MyEditView.b;
import com.fimi.soul.view.myhorizontalseebar.SeekBar;
import com.fimi.soul.view.myhorizontalseebar.SeekBar.a;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.h;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.i;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f
  implements View.OnClickListener, View.OnTouchListener
{
  private boolean A;
  private boolean B;
  private boolean C;
  private a D;
  private int E;
  private com.google.android.gms.maps.model.c F;
  private d G;
  private com.google.android.gms.maps.model.g H;
  private com.google.android.gms.maps.model.g I;
  private com.google.android.gms.maps.c J;
  private i K;
  private int L;
  private int M = 5;
  private int N = 120;
  private int O = 10;
  private int P = 1;
  private int Q = 450;
  private int R = 5;
  private int S = 360;
  private int T = 0;
  private String U;
  private SeekBar[] V;
  private float W;
  private float X;
  EditText[] a;
  InputMethodManager b;
  private MyEditView c;
  private MyEditView d;
  private MyEditView e;
  private MyEditView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private TextView j;
  private TextView k;
  private SeekBar l;
  private SeekBar m;
  private SeekBar n;
  private SeekBar o;
  private RadioGroup p;
  private Context q;
  private PercentRelativeLayout r;
  private RadioButton s;
  private RadioButton t;
  private Button u;
  private Button v;
  private Button w;
  private PopupWindow x;
  private String[] y;
  private boolean z;
  
  public f(View paramView, a parama)
  {
    this.b = ((InputMethodManager)parama.d.getSystemService("input_method"));
    this.L = (parama.d.getResources().getDisplayMetrics().heightPixels / 3);
    this.D = parama;
    this.J = parama.aa();
    this.q = parama.d;
    this.G = d.k();
    this.y = this.q.getResources().getStringArray(2131558407);
    this.i = ((TextView)paramView.findViewById(2131689670));
    this.j = ((TextView)paramView.findViewById(2131689673));
    this.k = ((TextView)paramView.findViewById(2131690151));
    this.f = ((MyEditView)paramView.findViewById(2131690156));
    this.h = ((TextView)paramView.findViewById(2131690154));
    this.o = ((SeekBar)paramView.findViewById(2131690155));
    this.o.setMax(this.S);
    this.o.setOnSeekBarChangeListener(new SeekBar.a()
    {
      public void a(SeekBar paramAnonymousSeekBar)
      {
        f.a(f.this, true);
      }
      
      public void a(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        if (f.a(f.this))
        {
          paramAnonymousSeekBar = f.b(f.this).j();
          if (paramAnonymousSeekBar != null)
          {
            f.c(f.this).setText(paramAnonymousInt + "°");
            paramAnonymousSeekBar.setStart_point_agle((short)paramAnonymousInt);
            f.this.a(false);
          }
        }
      }
      
      public void b(SeekBar paramAnonymousSeekBar)
      {
        f.a(f.this, false);
      }
    });
    this.w = ((Button)paramView.findViewById(2131690165));
    this.w.setOnClickListener(this);
    this.g = ((TextView)paramView.findViewById(2131690163));
    this.v = ((Button)paramView.findViewById(2131690164));
    this.v.setOnClickListener(this);
    this.u = ((Button)paramView.findViewById(2131690158));
    this.u.setText(this.y[0]);
    this.u.setOnClickListener(this);
    this.p = ((RadioGroup)paramView.findViewById(2131690160));
    this.s = ((RadioButton)paramView.findViewById(2131690161));
    this.t = ((RadioButton)paramView.findViewById(2131690162));
    this.p.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
    {
      public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt)
      {
        paramAnonymousRadioGroup = f.b(f.this).j();
        if (paramAnonymousRadioGroup != null) {
          switch (paramAnonymousInt)
          {
          }
        }
        for (;;)
        {
          f.this.f();
          f.this.a(false);
          return;
          paramAnonymousRadioGroup.setPara1(3);
          continue;
          paramAnonymousRadioGroup.setPara1(1);
        }
      }
    });
    this.p.check(2131690161);
    this.r = ((PercentRelativeLayout)paramView.findViewById(2131690145));
    this.c = ((MyEditView)paramView.findViewById(2131690149));
    this.d = ((MyEditView)paramView.findViewById(2131690150));
    this.e = ((MyEditView)paramView.findViewById(2131690153));
    this.l = ((SeekBar)paramView.findViewById(2131690148));
    this.m = ((SeekBar)paramView.findViewById(2131690095));
    this.n = ((SeekBar)paramView.findViewById(2131690152));
    this.n.setMax(this.Q);
    this.m.setMax(this.O);
    this.l.setMax(this.N);
    this.l.setOnSeekBarChangeListener(new SeekBar.a()
    {
      public void a(SeekBar paramAnonymousSeekBar)
      {
        f.b(f.this, true);
      }
      
      public void a(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        if (f.d(f.this))
        {
          paramAnonymousSeekBar = f.b(f.this).j();
          if (paramAnonymousSeekBar != null)
          {
            int i = paramAnonymousInt;
            if (paramAnonymousInt < f.e(f.this)) {
              i = f.e(f.this);
            }
            f.f(f.this).setText(i + "m");
            paramAnonymousSeekBar.setHeight(i);
            Iterator localIterator = d.k().e().iterator();
            while (localIterator.hasNext())
            {
              com.google.android.gms.maps.model.g localg = (com.google.android.gms.maps.model.g)localIterator.next();
              if (localg.o().equals(paramAnonymousSeekBar)) {
                localg.a(j.a(f.g(f.this), paramAnonymousSeekBar.getDrawableRes(), paramAnonymousSeekBar.getHeight(), true));
              }
            }
          }
        }
      }
      
      public void b(SeekBar paramAnonymousSeekBar)
      {
        f.b(f.this, false);
      }
    });
    this.m.setOnSeekBarChangeListener(new SeekBar.a()
    {
      public void a(SeekBar paramAnonymousSeekBar)
      {
        f.c(f.this, true);
      }
      
      public void a(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        if (f.h(f.this))
        {
          paramAnonymousSeekBar = f.b(f.this).j();
          if (paramAnonymousSeekBar != null)
          {
            int i = paramAnonymousInt;
            if (paramAnonymousInt < f.i(f.this)) {
              i = f.i(f.this);
            }
            f.j(f.this).setText(i + "m/s");
            paramAnonymousSeekBar.setSpeek(i);
            f.k(f.this);
          }
        }
      }
      
      public void b(SeekBar paramAnonymousSeekBar)
      {
        f.c(f.this, false);
        if (f.l(f.this).getProgress() * 1.5D < paramAnonymousSeekBar.getProgress() * paramAnonymousSeekBar.getProgress())
        {
          int j = (int)(paramAnonymousSeekBar.getProgress() * paramAnonymousSeekBar.getProgress() / 1.5D) + 1;
          int i = j;
          if (j < f.m(f.this)) {
            i = f.m(f.this);
          }
          f.l(f.this).setProgress(i);
          f.n(f.this).setText(i + "m");
          paramAnonymousSeekBar = f.b(f.this).j();
          if (paramAnonymousSeekBar != null)
          {
            paramAnonymousSeekBar.setRidus(i);
            f.this.b(paramAnonymousSeekBar);
            f.this.a(false);
          }
        }
      }
    });
    this.n.setOnSeekBarChangeListener(new SeekBar.a()
    {
      public void a(SeekBar paramAnonymousSeekBar)
      {
        f.d(f.this, true);
        f.a(f.this, (int)(f.q(f.this).getProgress() * f.q(f.this).getProgress() / 1.5D) + 1);
        if (f.p(f.this) < f.i(f.this)) {
          f.a(f.this, f.i(f.this));
        }
      }
      
      public void a(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        if (f.o(f.this))
        {
          paramAnonymousSeekBar = f.b(f.this).j();
          if (paramAnonymousSeekBar != null)
          {
            int i = paramAnonymousInt;
            if (paramAnonymousInt <= f.p(f.this)) {
              i = f.p(f.this);
            }
            paramAnonymousInt = i;
            if (i < f.m(f.this)) {
              paramAnonymousInt = f.m(f.this);
            }
            f.n(f.this).setText(paramAnonymousInt + "m");
            paramAnonymousSeekBar.setRidus(paramAnonymousInt);
            f.this.b(paramAnonymousSeekBar);
            f.this.a(false);
            f.k(f.this);
          }
        }
      }
      
      public void b(SeekBar paramAnonymousSeekBar)
      {
        f.d(f.this, false);
        if (f.l(f.this).getProgress() * 1.5D < paramAnonymousSeekBar.getProgress() * paramAnonymousSeekBar.getProgress())
        {
          int j = (int)Math.sqrt(f.l(f.this).getProgress() * 1.5D);
          int i = j;
          if (j >= f.r(f.this)) {
            i = f.r(f.this);
          }
          f.q(f.this).setMax(i);
          if (f.q(f.this).getProgress() >= i)
          {
            f.q(f.this).setProgress(i);
            f.j(f.this).setText(i + "m/s");
          }
        }
      }
    });
    ao.b(this.q.getAssets(), new View[] { this.f, this.c, this.d, this.e });
    ao.a(this.q.getAssets(), new View[] { this.j, this.k, this.i, this.s, this.t, this.g, this.h });
    this.a = new EditText[] { this.c, this.d, this.e, this.f };
    paramView = this.a;
    int i2 = paramView.length;
    int i1 = 0;
    while (i1 < i2)
    {
      parama = paramView[i1];
      parama.setInputType(2);
      parama.clearFocus();
      i1 += 1;
    }
    this.c.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (!paramAnonymousBoolean)
        {
          f.a(f.this, f.f(f.this), f.s(f.this), f.e(f.this), f.t(f.this), "m");
          return;
        }
        f.a(f.this, f.f(f.this).getText().toString());
      }
    });
    this.d.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (!paramAnonymousBoolean) {
          try
          {
            int j = (int)Math.sqrt(Integer.parseInt(f.b(f.n(f.this).getText().toString())) * 1.5D);
            int i = j;
            if (j >= f.r(f.this)) {
              i = f.r(f.this);
            }
            if (i == 0)
            {
              f.a(f.this, f.j(f.this), f.q(f.this).getMax(), f.i(f.this), f.q(f.this), "m/s");
              return;
            }
            f.a(f.this, f.j(f.this), i, f.i(f.this), f.q(f.this), "m/s");
            return;
          }
          catch (Exception paramAnonymousView)
          {
            return;
          }
        }
        f.a(f.this, f.j(f.this).getText().toString());
      }
    });
    this.e.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (!paramAnonymousBoolean)
        {
          f.a(f.this, f.n(f.this), f.l(f.this).getMax(), f.m(f.this), f.l(f.this), "m");
          return;
        }
        f.a(f.this, f.n(f.this).getText().toString());
      }
    });
    this.f.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (!paramAnonymousBoolean)
        {
          f.a(f.this, f.c(f.this), f.u(f.this), f.v(f.this), f.w(f.this), "°");
          return;
        }
        f.a(f.this, f.c(f.this).getText().toString());
      }
    });
    this.c.setOnFinishComposingListener(new MyEditView.b()
    {
      public void a()
      {
        f.f(f.this).clearFocus();
      }
    });
    this.d.setOnFinishComposingListener(new MyEditView.b()
    {
      public void a()
      {
        f.j(f.this).clearFocus();
      }
    });
    this.e.setOnFinishComposingListener(new MyEditView.b()
    {
      public void a()
      {
        f.n(f.this).clearFocus();
      }
    });
    this.f.setOnFinishComposingListener(new MyEditView.b()
    {
      public void a()
      {
        f.c(f.this).clearFocus();
      }
    });
    this.V = new SeekBar[] { this.l, this.m, this.n, this.o };
    paramView = this.V;
    i2 = paramView.length;
    i1 = 0;
    while (i1 < i2)
    {
      paramView[i1].setOnTouchListener(this);
      i1 += 1;
    }
  }
  
  private void a(FlyActionBean paramFlyActionBean, com.google.android.gms.maps.c paramc, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramFlyActionBean = a(paramFlyActionBean, paramFlyActionBean.getStart_point_agle());
      if (paramFlyActionBean != null)
      {
        if (this.H != null) {
          break label116;
        }
        this.H = paramc.a(new MarkerOptions().a(paramFlyActionBean).a(j.a(2130838139)));
        this.H.a(10000.0F);
        this.H.a(0.5F, 0.5F);
        this.H.a(false);
        this.H.b(p());
      }
    }
    for (;;)
    {
      k();
      return;
      paramFlyActionBean = a(paramFlyActionBean, -paramFlyActionBean.getStart_point_agle());
      break;
      label116:
      this.H.a(paramFlyActionBean);
      this.H.b(p());
    }
  }
  
  private void a(MyEditView paramMyEditView, int paramInt1, int paramInt2, SeekBar paramSeekBar, String paramString)
  {
    for (;;)
    {
      try
      {
        localObject = a(b(paramMyEditView.getText().toString()));
        i1 = Integer.parseInt((String)localObject);
        if (i1 <= paramInt1) {
          continue;
        }
        localObject = paramInt1 + paramString;
        paramMyEditView.setText((CharSequence)localObject);
      }
      catch (Exception paramSeekBar)
      {
        int i1;
        if (this.U == null) {
          return;
        }
        paramMyEditView.setText(this.U);
        this.U = " ";
        return;
        if (paramSeekBar != this.l) {
          continue;
        }
        paramString.setHeight(paramInt1);
        paramSeekBar = d.k().e().iterator();
        if (!paramSeekBar.hasNext()) {
          return;
        }
        Object localObject = (com.google.android.gms.maps.model.g)paramSeekBar.next();
        if (!((com.google.android.gms.maps.model.g)localObject).o().equals(paramString)) {
          continue;
        }
        ((com.google.android.gms.maps.model.g)localObject).a(j.a(this.q, paramString.getDrawableRes(), paramString.getHeight(), true));
        return;
        if (paramSeekBar != this.n) {
          return;
        }
        paramString.setRidus(paramInt1);
        b(paramString);
        a(false);
        o();
        return;
        paramInt1 = i1;
        continue;
      }
      paramSeekBar.setProgress(Integer.valueOf(paramInt1).intValue());
      if (!((String)localObject).contains(paramString)) {
        paramMyEditView.setText((String)localObject + paramString);
      }
      paramString = this.G.j();
      if (paramSeekBar != this.o) {
        continue;
      }
      paramString.setStart_point_agle((short)paramInt1);
      a(false);
      return;
      if (i1 >= paramInt2) {
        continue;
      }
      localObject = paramInt2 + paramString;
      paramMyEditView.setText((CharSequence)localObject);
      paramInt1 = paramInt2;
    }
    if (paramSeekBar == this.m)
    {
      paramString.setSpeek(paramInt1);
      o();
      return;
    }
  }
  
  public static String b(String paramString)
  {
    return Pattern.compile("[^0-9]").matcher(paramString).replaceAll("").trim();
  }
  
  private void b(FlyActionBean paramFlyActionBean, com.google.android.gms.maps.c paramc, boolean paramBoolean)
  {
    LatLng localLatLng;
    if (paramBoolean)
    {
      localLatLng = a(paramFlyActionBean, paramFlyActionBean.getStart_point_agle() + 90);
      if (localLatLng != null)
      {
        if (this.I != null) {
          break label159;
        }
        this.I = paramc.a(new MarkerOptions().a(localLatLng).a(j.a(2130838157)));
        this.I.a(10000.0F);
        if (!paramBoolean) {
          break label131;
        }
        this.I.b(paramFlyActionBean.getStart_point_agle() + 180 + paramc.a().d);
      }
    }
    for (;;)
    {
      this.I.a(0.5F, 0.5F);
      return;
      localLatLng = a(paramFlyActionBean, 270 - paramFlyActionBean.getStart_point_agle());
      break;
      label131:
      this.I.b(-paramFlyActionBean.getStart_point_agle() - 180 + paramc.a().d);
    }
    label159:
    this.I.a(localLatLng);
    if (paramBoolean)
    {
      this.I.b(paramFlyActionBean.getStart_point_agle() + 180 + p());
      return;
    }
    this.I.b(-paramFlyActionBean.getStart_point_agle() - 180 + p());
  }
  
  private void k()
  {
    FlyActionBean localFlyActionBean = d.k().j();
    if ((this.H != null) && (localFlyActionBean != null))
    {
      if (this.K == null) {
        this.K = this.J.a(new PolylineOptions().a(new LatLng[] { this.H.c(), localFlyActionBean.getLatLng() }).a(this.D.d.getResources().getColor(2131624209)).a(4.0F));
      }
    }
    else {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localFlyActionBean.getLatLng());
    localArrayList.add(this.H.c());
    this.K.a(localArrayList);
  }
  
  private double l()
  {
    return y.c(new LatLng(this.D.v().b(), this.D.v().c()), new LatLng(this.D.u().e(), this.D.u().d())).a();
  }
  
  private void m()
  {
    if (this.x == null)
    {
      this.u.setBackgroundResource(2130837611);
      View localView = LayoutInflater.from(this.q).inflate(2130968740, null);
      ListView localListView = (ListView)localView.findViewById(2131690430);
      localListView.setAdapter(new a(this.q, this.y));
      localListView.setSelection(1);
      localListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          paramAnonymousView = d.k().j();
          paramAnonymousAdapterView = (String)paramAnonymousAdapterView.getItemAtPosition(paramAnonymousInt);
          f.x(f.this).setText(paramAnonymousAdapterView);
          int i;
          if (paramAnonymousInt == 0) {
            i = paramAnonymousInt + 1;
          }
          for (;;)
          {
            if (paramAnonymousView != null) {
              paramAnonymousView.setYaw_mode(i);
            }
            f.y(f.this).dismiss();
            f.x(f.this).setBackgroundResource(2130837610);
            return;
            i = paramAnonymousInt;
            if (paramAnonymousInt == 1) {
              i = paramAnonymousInt - 1;
            }
          }
        }
      });
      this.x = new PopupWindow(localListView, this.u.getWidth(), this.u.getHeight() * 4);
      this.x.setContentView(localView);
      this.x.showAsDropDown(this.u, 0, com.fimi.soul.utils.g.b(this.q, -8.0F));
      this.x.setOutsideTouchable(true);
      this.x.setTouchable(true);
      this.x.setFocusable(true);
      this.x.setBackgroundDrawable(new BitmapDrawable());
      this.x.setOnDismissListener(new PopupWindow.OnDismissListener()
      {
        public void onDismiss()
        {
          f.x(f.this).setBackgroundResource(2130837610);
        }
      });
      return;
    }
    if (this.x.isShowing())
    {
      this.x.dismiss();
      this.u.setBackgroundResource(2130837610);
      return;
    }
    this.u.setBackgroundResource(2130837611);
    this.x.showAsDropDown(this.u, 0, com.fimi.soul.utils.g.b(this.q, -8.0F));
  }
  
  private void n()
  {
    this.r.getWidth();
    FlyActionBean localFlyActionBean = this.G.j();
    int i1 = this.q.getResources().getDisplayMetrics().widthPixels;
    int i2 = this.q.getResources().getDisplayMetrics().heightPixels;
    com.google.android.gms.maps.c localc = this.D.aa();
    if (localc != null)
    {
      Point localPoint = localc.n().a(localFlyActionBean.getLatLng());
      if (localPoint.x > i1 / 2)
      {
        int i3 = localPoint.x;
        int i4 = i1 / 3;
        localPoint = new Point(i1 / 2 + (i3 - i4), i2 / 2);
        localc.a(b.a(localc.n().a(localPoint)));
      }
    }
    b(localFlyActionBean);
  }
  
  private void o()
  {
    FlyActionBean localFlyActionBean = d.k().j();
    if ((this.F != null) && (localFlyActionBean != null))
    {
      int i1 = (int)(this.F.d() * 2.0D * 3.141592653589793D / localFlyActionBean.getSpeek());
      this.g.setText(String.format(this.q.getString(2131362776), new Object[] { Integer.valueOf(i1) }));
    }
  }
  
  /* Error */
  private float p()
  {
    // Byte code:
    //   0: fconst_0
    //   1: fstore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 173	com/fimi/soul/module/droneFragment/f:J	Lcom/google/android/gms/maps/c;
    //   8: invokevirtual 552	com/google/android/gms/maps/c:a	()Lcom/google/android/gms/maps/model/CameraPosition;
    //   11: astore_3
    //   12: fload_2
    //   13: fstore_1
    //   14: aload_3
    //   15: ifnull +8 -> 23
    //   18: aload_3
    //   19: getfield 556	com/google/android/gms/maps/model/CameraPosition:d	F
    //   22: fstore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: fload_1
    //   26: freturn
    //   27: astore_3
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_3
    //   31: athrow
    //   32: astore_3
    //   33: fload_2
    //   34: fstore_1
    //   35: goto -12 -> 23
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	f
    //   13	22	1	f1	float
    //   1	33	2	f2	float
    //   11	8	3	localCameraPosition	CameraPosition
    //   27	4	3	localObject	Object
    //   32	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   4	12	27	finally
    //   18	23	27	finally
    //   4	12	32	java/lang/Exception
    //   18	23	32	java/lang/Exception
  }
  
  public LatLng a(FlyActionBean paramFlyActionBean, double paramDouble)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramFlyActionBean != null)
    {
      localObject1 = localObject2;
      if (this.F != null) {
        localObject1 = y.a(paramFlyActionBean.getLatLng(), paramDouble, this.F.d());
      }
    }
    return (LatLng)localObject1;
  }
  
  public String a(String paramString)
  {
    return BigDecimal.valueOf(Integer.parseInt(paramString)).stripTrailingZeros().toPlainString();
  }
  
  public void a()
  {
    if (!this.w.isShown())
    {
      this.w.setVisibility(0);
      com.fimi.kernel.utils.z.a(this.q, 2131362689, 1500);
    }
  }
  
  public void a(FlyActionBean paramFlyActionBean)
  {
    if (this.u.getText().toString().equals(this.y[0]))
    {
      paramFlyActionBean.setYaw_mode(1);
      switch (this.p.getCheckedRadioButtonId())
      {
      }
    }
    for (;;)
    {
      f();
      o();
      return;
      if (this.u.getText().toString().equals(this.y[1]))
      {
        paramFlyActionBean.setYaw_mode(0);
        break;
      }
      if (this.u.getText().toString().equals(this.y[2]))
      {
        paramFlyActionBean.setYaw_mode(2);
        break;
      }
      if (this.u.getText().toString().equals(this.y[3]))
      {
        paramFlyActionBean.setYaw_mode(3);
        break;
      }
      if (!this.u.getText().toString().equals(this.y[4])) {
        break;
      }
      paramFlyActionBean.setYaw_mode(4);
      break;
      paramFlyActionBean.setPara1(3);
      continue;
      paramFlyActionBean.setPara1(1);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    FlyActionBean localFlyActionBean = this.G.j();
    this.J = this.D.aa();
    if ((localFlyActionBean != null) && (this.J != null)) {}
    switch (this.p.getCheckedRadioButtonId())
    {
    default: 
      return;
    case 2131690161: 
      if (!paramBoolean) {
        a(localFlyActionBean, this.J, true);
      }
      b(localFlyActionBean, this.J, true);
      return;
    }
    if (!paramBoolean) {
      a(localFlyActionBean, this.J, false);
    }
    b(localFlyActionBean, this.J, false);
  }
  
  public void b()
  {
    if (this.r.isShown()) {
      this.r.setVisibility(8);
    }
  }
  
  public void b(FlyActionBean paramFlyActionBean)
  {
    this.J = this.D.aa();
    if ((this.J != null) && (paramFlyActionBean != null))
    {
      if (this.F == null)
      {
        LatLng localLatLng = this.G.j().getLatLng();
        int i1 = paramFlyActionBean.getRidus();
        this.F = this.J.a(new CircleOptions().a(i1).a(4.0F).a(this.q.getResources().getColor(2131624209)).a(localLatLng));
        this.G.a(this.F);
      }
    }
    else {
      return;
    }
    this.F.a(paramFlyActionBean.getRidus());
  }
  
  public void c()
  {
    if (!this.r.isShown()) {
      this.r.setVisibility(0);
    }
  }
  
  public void d()
  {
    b();
    if ((this.x != null) && (this.x.isShowing()))
    {
      this.x.dismiss();
      this.u.setBackgroundResource(2130837610);
    }
    if (this.F != null)
    {
      this.F.a();
      this.F = null;
    }
    if (this.H != null)
    {
      this.H.a();
      this.H = null;
    }
    if (this.I != null)
    {
      this.I.a();
      this.I = null;
    }
    if (this.K != null)
    {
      this.K.a();
      this.K = null;
    }
  }
  
  public void e()
  {
    if (this.w.isShown()) {
      this.w.setVisibility(8);
    }
  }
  
  public void f()
  {
    if (this.s.isChecked())
    {
      this.s.setTextColor(this.q.getResources().getColor(2131624004));
      this.t.setTextColor(this.q.getResources().getColor(2131623965));
      return;
    }
    this.t.setTextColor(this.q.getResources().getColor(2131624004));
    this.s.setTextColor(this.q.getResources().getColor(2131623965));
  }
  
  public void g()
  {
    c();
    n();
    h();
  }
  
  public void h()
  {
    FlyActionBean localFlyActionBean = d.k().j();
    double d1;
    if (localFlyActionBean != null)
    {
      d1 = l();
      if (this.Q - d1 < this.R) {
        com.fimi.kernel.utils.z.a(this.q, 2131362060, 3000);
      }
    }
    else
    {
      return;
    }
    this.l.setProgress(localFlyActionBean.getHeight());
    this.m.setProgress(localFlyActionBean.getSpeek());
    this.n.setProgress(localFlyActionBean.getRidus());
    this.o.setProgress(localFlyActionBean.getStart_point_agle());
    this.n.setMax((int)(this.Q - d1));
    this.c.setText(localFlyActionBean.getHeight() + "m");
    this.d.setText(localFlyActionBean.getSpeek() + "m/s");
    this.e.setText(localFlyActionBean.getRidus() + "m");
    this.f.setText(localFlyActionBean.getStart_point_agle() + "°");
    if ((localFlyActionBean.getPara1() == 0) || (localFlyActionBean.getPara1() == 1)) {
      this.p.check(this.t.getId());
    }
    for (;;)
    {
      a(localFlyActionBean);
      a(false);
      k();
      return;
      if ((localFlyActionBean.getPara1() == 2) || (localFlyActionBean.getPara1() == 3)) {
        this.p.check(this.s.getId());
      }
    }
  }
  
  public void i()
  {
    double d1 = 0.0D;
    for (;;)
    {
      LatLng localLatLng;
      try
      {
        FlyActionBean localFlyActionBean = d.k().j();
        if ((this.F != null) && (this.H != null) && (localFlyActionBean != null))
        {
          localFlyActionBean.setRidus((int)y.c(localFlyActionBean.getLatLng(), this.H.c()).a());
          b(localFlyActionBean);
          localLatLng = a(localFlyActionBean, 0.0D);
        }
        switch (this.p.getCheckedRadioButtonId())
        {
        case 2131690161: 
          localFlyActionBean.setStart_point_agle((short)(int)d1);
          this.f.setText((int)d1 + "deg");
          a(false);
          return;
        }
      }
      finally {}
      d1 = y.d(localLatLng, this.H.c());
      continue;
      d1 = this.S;
      double d2 = y.d(localLatLng, this.H.c());
      d1 -= d2;
    }
  }
  
  public void j()
  {
    if ((this.x != null) && (this.x.isShowing())) {
      this.x.dismiss();
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131690158: 
      m();
      return;
    case 2131690164: 
      d();
      this.D.a(d.a.bj);
      a();
      return;
    }
    this.D.a(d.a.bA);
    this.w.setVisibility(8);
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
    case 2: 
      do
      {
        return false;
        this.W = paramMotionEvent.getX();
        this.X = paramMotionEvent.getY();
        return false;
      } while (Math.abs(paramView.getX() - this.W) < Math.abs(paramView.getY() - this.X));
      paramView.getParent().requestDisallowInterceptTouchEvent(true);
      return false;
    }
    paramView.getParent().requestDisallowInterceptTouchEvent(false);
    return false;
  }
  
  class a
    extends BaseAdapter
  {
    private Context b;
    private String[] c;
    
    public a(Context paramContext, String[] paramArrayOfString)
    {
      this.b = paramContext;
      this.c = paramArrayOfString;
    }
    
    public int getCount()
    {
      if (this.c == null) {
        return 0;
      }
      return this.c.length;
    }
    
    public Object getItem(int paramInt)
    {
      if (this.c == null) {
        return null;
      }
      return this.c[paramInt];
    }
    
    public long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramView = LayoutInflater.from(this.b).inflate(2130968739, null);
      paramViewGroup = (TextView)paramView.findViewById(2131690429);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramViewGroup.getLayoutParams();
      if (f.y(f.this) != null) {
        localLayoutParams.width = f.y(f.this).getWidth();
      }
      paramViewGroup.setLayoutParams(localLayoutParams);
      paramViewGroup.setText(this.c[paramInt]);
      ao.a(this.b.getAssets(), new View[] { paramViewGroup });
      return paramView;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */