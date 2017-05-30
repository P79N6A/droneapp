package com.fimi.soul.module.droneTrack;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.fimi.kernel.utils.t;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.drone.h.y;
import com.fimi.soul.entity.DroneModelType;
import com.fimi.soul.entity.ErrorMode;
import com.fimi.soul.module.droneui.a.a;
import com.fimi.soul.view.RemotesimulatorView;
import com.google.android.gms.maps.model.LatLng;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class PlayBackDroneTrackActivity
  extends BaseActivity
  implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, d, e
{
  private static final int J = 3;
  private TextView A;
  private TextView B;
  private PercentRelativeLayout C;
  private PercentRelativeLayout D;
  private PalyBackMapFragment E;
  private FragmentManager F;
  private RemotesimulatorView G;
  private com.fimi.soul.module.droneTrack.a.c H = com.fimi.soul.module.droneTrack.a.c.a();
  private final int I = 100;
  private int K = 1000;
  private int L = 0;
  private com.fimi.soul.module.droneTrack.a.b M = com.fimi.soul.module.droneTrack.a.b.a();
  private com.fimi.soul.module.droneTrack.a.a N;
  private Timer O;
  private final int P = 1;
  private boolean Q;
  private TextView R;
  private RelativeLayout S;
  private TextView T;
  private TextView U;
  private TextView V;
  private TextView W;
  private TextView X;
  private TextView Y;
  private TextView Z;
  PercentRelativeLayout a;
  private TextView aa;
  private TextView ab;
  private TextView ac;
  private TextView ad;
  private TextView ae;
  private a af = a.a;
  private int ag = 0;
  private Handler ah = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if (paramAnonymousMessage.what == 100)
      {
        PlayBackDroneTrackActivity.a(PlayBackDroneTrackActivity.this, true);
        if (PlayBackDroneTrackActivity.this.a.isShown()) {
          PlayBackDroneTrackActivity.this.a.setVisibility(8);
        }
        PlayBackDroneTrackActivity.a(PlayBackDroneTrackActivity.this, com.fimi.soul.module.droneTrack.a.b.a().b().size());
        paramAnonymousMessage = PlayBackDroneTrackActivity.b(PlayBackDroneTrackActivity.a(PlayBackDroneTrackActivity.this) * 1000 + "");
        PlayBackDroneTrackActivity.b(PlayBackDroneTrackActivity.this).setText(paramAnonymousMessage);
        PlayBackDroneTrackActivity.c(PlayBackDroneTrackActivity.this).setMax(PlayBackDroneTrackActivity.a(PlayBackDroneTrackActivity.this));
        PlayBackDroneTrackActivity.e(PlayBackDroneTrackActivity.this).setText(PlayBackDroneTrackActivity.b(PlayBackDroneTrackActivity.d(PlayBackDroneTrackActivity.this) * 1000 + ""));
      }
      do
      {
        return;
        if (paramAnonymousMessage.what == 3)
        {
          PlayBackDroneTrackActivity.f(PlayBackDroneTrackActivity.this);
          PlayBackDroneTrackActivity.c(PlayBackDroneTrackActivity.this).setProgress(PlayBackDroneTrackActivity.d(PlayBackDroneTrackActivity.this));
          PlayBackDroneTrackActivity.e(PlayBackDroneTrackActivity.this).setText(PlayBackDroneTrackActivity.b(PlayBackDroneTrackActivity.d(PlayBackDroneTrackActivity.this) * 1000 + ""));
          PlayBackDroneTrackActivity.b(PlayBackDroneTrackActivity.this, PlayBackDroneTrackActivity.d(PlayBackDroneTrackActivity.this));
          if (PlayBackDroneTrackActivity.d(PlayBackDroneTrackActivity.this) == 1)
          {
            PlayBackDroneTrackActivity.g(PlayBackDroneTrackActivity.this).b();
            PlayBackDroneTrackActivity.h(PlayBackDroneTrackActivity.this).c().clear();
          }
          if (PlayBackDroneTrackActivity.d(PlayBackDroneTrackActivity.this) <= PlayBackDroneTrackActivity.c(PlayBackDroneTrackActivity.this).getMax())
          {
            PlayBackDroneTrackActivity.j(PlayBackDroneTrackActivity.this).sendEmptyMessageDelayed(3, PlayBackDroneTrackActivity.i(PlayBackDroneTrackActivity.this));
            return;
          }
          PlayBackDroneTrackActivity.c(PlayBackDroneTrackActivity.this, 0);
          PlayBackDroneTrackActivity.c(PlayBackDroneTrackActivity.this).setProgress(PlayBackDroneTrackActivity.d(PlayBackDroneTrackActivity.this));
          PlayBackDroneTrackActivity.e(PlayBackDroneTrackActivity.this).setText(PlayBackDroneTrackActivity.b(PlayBackDroneTrackActivity.d(PlayBackDroneTrackActivity.this) * 1000 + ""));
          PlayBackDroneTrackActivity.d(PlayBackDroneTrackActivity.this, 2130903045);
          PlayBackDroneTrackActivity.a(PlayBackDroneTrackActivity.this, PlayBackDroneTrackActivity.a.a);
          return;
        }
      } while (paramAnonymousMessage.what != 1);
      PlayBackDroneTrackActivity.k(PlayBackDroneTrackActivity.this);
    }
  };
  private com.fimi.soul.module.droneui.a ai;
  private double aj = 0.0D;
  int b = 0;
  int c = 0;
  private ImageView d;
  private ImageView e;
  private ImageView f;
  private ImageView g;
  private ImageView h;
  private ImageView i;
  private ImageView j;
  private ImageView k;
  private ImageView l;
  private ImageView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private TextView q;
  private SeekBar r;
  private TextView s;
  private TextView t;
  private TextView u;
  private TextView v;
  private TextView w;
  private TextView x;
  private TextView y;
  private TextView z;
  
  private String a(double paramDouble)
  {
    return String.format("%.2f", new Object[] { Double.valueOf(paramDouble) });
  }
  
  private void a(double paramDouble, boolean paramBoolean)
  {
    double[] arrayOfDouble;
    if (paramBoolean)
    {
      arrayOfDouble = this.M.j();
      if (arrayOfDouble != null) {
        break label31;
      }
    }
    label31:
    do
    {
      return;
      arrayOfDouble = this.M.i();
      break;
      if (paramDouble < arrayOfDouble[0])
      {
        this.o.setText("0%");
        this.o.setTextColor(getResources().getColor(2131623954));
        return;
      }
      if ((paramDouble >= arrayOfDouble[0]) && (paramDouble < arrayOfDouble[1]))
      {
        this.o.setText("25%");
        this.o.setTextColor(getResources().getColor(2131623954));
        return;
      }
      if ((paramDouble >= arrayOfDouble[1]) && (paramDouble < arrayOfDouble[2]))
      {
        this.o.setText("50%");
        this.o.setTextColor(getResources().getColor(2131624291));
        return;
      }
      if ((paramDouble >= arrayOfDouble[2]) && (paramDouble < arrayOfDouble[3]))
      {
        this.o.setText("75%");
        this.o.setTextColor(getResources().getColor(2131624291));
        return;
      }
    } while (paramDouble < arrayOfDouble[3]);
    this.o.setText("100%");
    this.o.setTextColor(getResources().getColor(2131624291));
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.ai != null) && (this.ai.isShowing()))
    {
      this.ai.dismiss();
      this.ai = null;
    }
    this.ai = new com.fimi.soul.module.droneui.a(this, getString(paramInt1), getString(paramInt2), paramInt3, 3, false, new a.a()
    {
      public void a()
      {
        if (PlayBackDroneTrackActivity.l(PlayBackDroneTrackActivity.this) != null)
        {
          PlayBackDroneTrackActivity.l(PlayBackDroneTrackActivity.this).dismiss();
          PlayBackDroneTrackActivity.a(PlayBackDroneTrackActivity.this, null);
        }
      }
      
      public void b() {}
      
      public void c() {}
      
      public void d()
      {
        if (PlayBackDroneTrackActivity.l(PlayBackDroneTrackActivity.this) != null)
        {
          PlayBackDroneTrackActivity.l(PlayBackDroneTrackActivity.this).dismiss();
          PlayBackDroneTrackActivity.a(PlayBackDroneTrackActivity.this, null);
        }
      }
    });
    this.ai.setCancelable(true);
    this.ai.show();
  }
  
  private void a(ImageView paramImageView, int paramInt)
  {
    paramImageView.setImageResource(paramInt);
  }
  
  private void a(TextView paramTextView)
  {
    ForegroundColorSpan localForegroundColorSpan = new ForegroundColorSpan(getResources().getColor(17170445));
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(paramTextView.getText().toString());
    localSpannableStringBuilder.setSpan(localForegroundColorSpan, 1, 3, 33);
    paramTextView.setText(localSpannableStringBuilder);
  }
  
  private void a(com.fimi.soul.drone.h.a.e parame)
  {
    b(parame.d(), parame.e(), parame.f());
  }
  
  private void a(ad paramad)
  {
    com.fimi.soul.drone.h.c localc = this.M.k();
    com.fimi.soul.utils.ao.a(paramad.b(), 12);
    int i1 = com.fimi.soul.utils.ao.a(paramad.b(), 13);
    double d1;
    if (localc != null)
    {
      if ((localc.d() == 2) || (i1 == 1)) {
        this.G.a(paramad.i(), paramad.h(), paramad.g(), paramad.f());
      }
    }
    else
    {
      i1 = com.fimi.soul.utils.ao.a(paramad.b(), 5);
      d1 = paramad.c() / 100.0D;
      if (Math.abs(d1 - this.aj) > 0.05D)
      {
        if (i1 <= 0) {
          break label152;
        }
        a(d1, true);
      }
    }
    for (;;)
    {
      this.aj = d1;
      return;
      this.G.a(paramad.i(), paramad.g(), paramad.h(), paramad.f());
      break;
      label152:
      a(d1, false);
    }
  }
  
  private void a(ag paramag)
  {
    double d1 = -999.0D;
    double d2 = (paramag.f() - 677216.0D) / 10.0D;
    if (d2 < 3000.0D)
    {
      if ((d2 < 100.0D) && (d2 >= 0.0D)) {
        break label205;
      }
      if (d2 >= -999.0D) {
        break label284;
      }
    }
    for (;;)
    {
      String str;
      if (d1 < 100.0D)
      {
        str = b(d1) + "m";
        a(str, this.x);
        label96:
        d1 = paramag.g();
        if ((d1 > -50.0D) && (d1 < 10000.0D) && (!this.drone.aj().g().isLightStream()))
        {
          if (d1 < 100.0D) {
            break label245;
          }
          a((int)d1 + "m", this.z);
        }
      }
      for (;;)
      {
        g(paramag.c());
        return;
        str = (int)d1 + "m";
        break;
        label205:
        str = b(d2);
        a(str + "m", this.x);
        break label96;
        label245:
        str = b(d1);
        a(str + "m", this.z);
      }
      label284:
      d1 = d2;
    }
  }
  
  private void a(com.fimi.soul.drone.h.ao paramao)
  {
    h(paramao.a());
  }
  
  private void a(com.fimi.soul.drone.h.d paramd)
  {
    this.T.setText(paramd.i() - 60 + getString(2131362830));
    this.U.setText(Math.abs(paramd.h()) + "mA");
    double d1 = paramd.a() / 100.0D;
    double d2 = paramd.b() / 100.0D;
    double d3 = paramd.c() / 100.0D;
    double d4 = paramd.d() / 100.0D;
    this.V.setText(a(d1 + 2.0D) + "V");
    this.W.setText(a(d2 + 2.0D) + "V");
    this.X.setText(a(d3 + 2.0D) + "V");
    this.Y.setText(a(d4 + 2.0D) + "V");
  }
  
  private void a(y paramy)
  {
    double d1 = t.a(paramy.a() / 100.0D, 2);
    double d2 = t.a(paramy.b() / 100.0D, 2);
    this.t.setText(d1 + "m/s");
    this.v.setText(d2 + "m/s");
    float f1 = (float)(paramy.k() / 10.0D);
    this.E.a(f1);
  }
  
  private void a(String paramString, TextView paramTextView)
  {
    if ((paramString != null) && (!paramString.equals(paramTextView.getText().toString()))) {
      paramTextView.setText(paramString);
    }
  }
  
  private String b(double paramDouble)
  {
    return String.format("%.1f", new Object[] { Double.valueOf(paramDouble) });
  }
  
  public static String b(String paramString)
  {
    return new SimpleDateFormat("mm:ss").format(new Date(new Long(paramString).longValue()));
  }
  
  private void b()
  {
    if (this.N == null) {}
    do
    {
      return;
      localObject = com.fimi.soul.module.droneTrack.b.a.a().a(this.N);
    } while (localObject == null);
    Object localObject = ((ErrorMode)localObject).getLightErrorList();
    if (((ArrayList)localObject).size() <= this.b) {
      this.b = 0;
    }
    if (this.drone.ac())
    {
      if (!this.drone.ad().S()) {
        break label173;
      }
      this.c += 1;
      if (this.c >= 3)
      {
        a(2131362852, 2131362126, 2130838366);
        this.c = 0;
      }
    }
    if ((localObject != null) && (((ArrayList)localObject).size() > 0))
    {
      d();
      this.q.setTextColor(getResources().getColor(2131624289));
      c(getText(((Integer)((ArrayList)localObject).get(this.b)).intValue()).toString());
    }
    for (;;)
    {
      this.b += 1;
      return;
      label173:
      if (!this.drone.ad().P()) {
        break;
      }
      this.c += 1;
      if (this.c < 7) {
        break;
      }
      a(2131362853, 2131362127, 2130838366);
      this.c = 0;
      break;
      c("");
      c();
    }
  }
  
  private void b(int paramInt)
  {
    Object localObject1 = (List)this.M.b().get(Integer.valueOf(paramInt));
    if (localObject1 != null)
    {
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = ((Iterator)localObject1).next();
        if (localObject2 != null) {
          if ((localObject2 instanceof ag))
          {
            localObject2 = (ag)localObject2;
            if (localObject2 != null)
            {
              this.N.a((ag)localObject2);
              this.E.a((ag)localObject2);
              a((ag)localObject2);
            }
          }
          else if ((localObject2 instanceof com.fimi.soul.drone.h.z))
          {
            localObject2 = (com.fimi.soul.drone.h.z)localObject2;
            if ((localObject2 != null) && (this.E != null))
            {
              this.N.a((com.fimi.soul.drone.h.z)localObject2);
              this.E.a((com.fimi.soul.drone.h.z)localObject2);
            }
          }
          else if ((localObject2 instanceof y))
          {
            localObject2 = (y)localObject2;
            if (localObject2 != null)
            {
              a((y)localObject2);
              this.N.a((y)localObject2);
            }
          }
          else if ((localObject2 instanceof com.fimi.soul.drone.h.ao))
          {
            localObject2 = (com.fimi.soul.drone.h.ao)localObject2;
            if (localObject2 != null)
            {
              a((com.fimi.soul.drone.h.ao)localObject2);
              this.N.a((com.fimi.soul.drone.h.ao)localObject2);
            }
          }
          else if ((localObject2 instanceof com.fimi.soul.drone.h.e))
          {
            localObject2 = (com.fimi.soul.drone.h.e)localObject2;
            if (localObject2 != null) {
              this.N.a((com.fimi.soul.drone.h.e)localObject2);
            }
          }
          else if ((localObject2 instanceof com.fimi.soul.drone.h.d))
          {
            localObject2 = (com.fimi.soul.drone.h.d)localObject2;
            if (localObject2 != null)
            {
              this.N.a((com.fimi.soul.drone.h.d)localObject2);
              b((com.fimi.soul.drone.h.d)localObject2);
              a((com.fimi.soul.drone.h.d)localObject2);
            }
          }
          else if ((localObject2 instanceof com.fimi.soul.drone.h.a.e))
          {
            localObject2 = (com.fimi.soul.drone.h.a.e)localObject2;
            if (localObject2 != null)
            {
              this.N.a((com.fimi.soul.drone.h.a.e)localObject2);
              a((com.fimi.soul.drone.h.a.e)localObject2);
            }
          }
          else if ((localObject2 instanceof ad))
          {
            localObject2 = (ad)localObject2;
            if (localObject2 != null)
            {
              this.N.a((ad)localObject2);
              a((ad)localObject2);
            }
          }
          else if ((localObject2 instanceof q))
          {
            localObject2 = (q)localObject2;
            if (localObject2 != null) {
              this.N.a((q)localObject2);
            }
          }
          else if ((localObject2 instanceof com.fimi.soul.drone.h.a.b))
          {
            localObject2 = (com.fimi.soul.drone.h.a.b)localObject2;
            if (localObject2 != null)
            {
              this.N.a((com.fimi.soul.drone.h.a.b)localObject2);
              if ((((com.fimi.soul.drone.h.a.b)localObject2).f() != 4) && (((com.fimi.soul.drone.h.a.b)localObject2).f() != 5) && (((com.fimi.soul.drone.h.a.b)localObject2).f() != 6)) {
                this.E.a((com.fimi.soul.drone.h.a.b)localObject2);
              }
            }
          }
        }
      }
    }
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 == 2) && (!this.N.j()) && (paramInt2 == 1))
    {
      c(2131362417);
      d(2130838334);
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if ((paramInt1 == 1) && (!this.N.j()) && (paramInt2 == 1))
            {
              c(2131362320);
              d(2130838334);
              return;
            }
            if ((paramInt1 == 0) && (!this.N.j()) && (paramInt2 == 1))
            {
              c(2131361975);
              d(2130838334);
              return;
            }
            if ((paramInt1 == 2) && (this.N.j()) && (paramInt2 == 1))
            {
              c(2131362416);
              d(2130838334);
              return;
            }
            if ((paramInt1 == 1) && (this.N.j()) && (paramInt2 == 1))
            {
              c(2131362319);
              d(2130838334);
              return;
            }
            if ((paramInt1 == 0) && (this.N.j()) && (paramInt2 == 1))
            {
              c(2131361974);
              d(2130838334);
              return;
            }
            if (paramInt2 == 7)
            {
              c(2131362855);
              d(2130838466);
              return;
            }
            if (paramInt2 == 8)
            {
              c(2131362643);
              d(2130838466);
              return;
            }
            if (paramInt2 == 3)
            {
              c(2131362411);
              d(2130838240);
              return;
            }
            if (paramInt2 == 9)
            {
              c(2131362444);
              d(2130838240);
              return;
            }
            if (paramInt2 == 2)
            {
              c(2131362815);
              d(2130838532);
              return;
            }
            if (paramInt2 != 4) {
              break;
            }
            if (paramInt3 == 4)
            {
              c(2131362797);
              d(2130837870);
              return;
            }
          } while (paramInt3 != 2);
          c(2131362279);
          d(2130837870);
          return;
          if (paramInt2 != 5) {
            break;
          }
          if (paramInt3 == 4)
          {
            c(2131362796);
            d(2130837872);
            return;
          }
        } while (paramInt3 != 2);
        c(2131362359);
        d(2130837872);
        return;
        if (paramInt2 != 6) {
          break;
        }
        if (paramInt3 == 4)
        {
          c(2131362799);
          d(2130838156);
          return;
        }
      } while (paramInt3 != 2);
      c(2131362191);
      d(2130838156);
      return;
      if (paramInt2 != 10) {
        break;
      }
      if (paramInt3 == 4)
      {
        c(2131362798);
        d(2130903047);
        return;
      }
    } while (paramInt3 != 2);
    c(2131362820);
    d(2130903047);
    return;
    c(2131362091);
    d(2130838334);
  }
  
  private void b(com.fimi.soul.drone.h.d paramd)
  {
    com.fimi.soul.drone.h.e locale = this.N.i();
    double d1 = locale.d();
    double d2 = locale.e();
    int i1;
    if (0.0D != d2)
    {
      i1 = (int)(paramd.g() / d2 * 100.0D);
      if (0.0D == d1) {
        break label91;
      }
    }
    label91:
    for (int i2 = (int)(paramd.g() / d1 * 100.0D);; i2 = (int)(paramd.g() / 5200.0D * 100.0D))
    {
      if (i1 >= 0) {
        break label110;
      }
      return;
      i1 = (int)(paramd.g() / 5200.0D * 100.0D);
      break;
    }
    label110:
    if ((i2 > 0) && (i2 < 30))
    {
      this.p.setText(i2 + "%");
      this.p.setTextColor(getResources().getColor(2131623954));
      return;
    }
    this.p.setTextColor(getResources().getColor(2131624291));
    this.p.setText(i1 + "%");
  }
  
  private void c()
  {
    this.f.setVisibility(4);
  }
  
  private void c(int paramInt)
  {
    if ((paramInt == 0) || (getString(paramInt).equals(this.n.getText().toString()))) {
      return;
    }
    this.n.setText(paramInt);
  }
  
  private void c(String paramString)
  {
    if ((paramString != null) && (!paramString.equals(this.q.getText().toString()))) {
      this.q.setText(paramString, TextView.BufferType.NORMAL);
    }
  }
  
  private void d()
  {
    this.f.setVisibility(0);
  }
  
  private void d(int paramInt)
  {
    if (getString(2131362673).equals(this.n.getText().toString()))
    {
      this.e.setImageResource(2130838335);
      this.e.setTag(Integer.valueOf(2130838335));
    }
    do
    {
      return;
      if (this.e.getTag() == null)
      {
        this.e.setImageResource(paramInt);
        this.e.setTag(Integer.valueOf(paramInt));
        return;
      }
    } while (paramInt == ((Integer)this.e.getTag()).intValue());
    this.e.setImageResource(paramInt);
    this.e.setTag(Integer.valueOf(paramInt));
  }
  
  private void e()
  {
    this.m = ((ImageView)findViewById(2131690079));
    this.D = ((PercentRelativeLayout)findViewById(2131690058));
    this.Z = ((TextView)findViewById(2131690059));
    this.aa = ((TextView)findViewById(2131690061));
    this.ab = ((TextView)findViewById(2131690063));
    this.ac = ((TextView)findViewById(2131690065));
    this.ad = ((TextView)findViewById(2131690067));
    this.ae = ((TextView)findViewById(2131690069));
    this.T = ((TextView)findViewById(2131690060));
    this.U = ((TextView)findViewById(2131690062));
    this.V = ((TextView)findViewById(2131690064));
    this.W = ((TextView)findViewById(2131690066));
    this.X = ((TextView)findViewById(2131690068));
    this.Y = ((TextView)findViewById(2131690070));
    this.S = ((RelativeLayout)findViewById(2131690073));
    this.R = ((TextView)findViewById(2131690044));
    this.a = ((PercentRelativeLayout)findViewById(2131690082));
    this.G = ((RemotesimulatorView)findViewById(2131690081));
    this.C = ((PercentRelativeLayout)findViewById(2131690048));
    this.q = ((TextView)findViewById(2131690047));
    this.q.requestFocus();
    this.r = ((SeekBar)findViewById(2131690049));
    this.r.setOnSeekBarChangeListener(this);
    this.l = ((ImageView)findViewById(2131690080));
    this.l.setOnClickListener(this);
    this.d = ((ImageView)findViewById(2131689874));
    this.e = ((ImageView)findViewById(2131690033));
    this.f = ((ImageView)findViewById(2131690037));
    this.g = ((ImageView)findViewById(2131690040));
    this.h = ((ImageView)findViewById(2131690045));
    this.i = ((ImageView)findViewById(2131690076));
    this.j = ((ImageView)findViewById(2131690077));
    this.k = ((ImageView)findViewById(2131690078));
    this.n = ((TextView)findViewById(2131690036));
    this.o = ((TextView)findViewById(2131690038));
    this.p = ((TextView)findViewById(2131690042));
    this.s = ((TextView)findViewById(2131690050));
    this.t = ((TextView)findViewById(2131690051));
    this.u = ((TextView)findViewById(2131690052));
    this.v = ((TextView)findViewById(2131690053));
    this.w = ((TextView)findViewById(2131690054));
    this.x = ((TextView)findViewById(2131690055));
    this.y = ((TextView)findViewById(2131690056));
    this.z = ((TextView)findViewById(2131690057));
    this.A = ((TextView)findViewById(2131690072));
    this.B = ((TextView)findViewById(2131690075));
    com.fimi.soul.utils.ao.b(getAssets(), new View[] { this.p, this.o, this.t, this.v, this.x, this.z, this.A, this.B, this.Z, this.aa, this.ab, this.ac, this.ad, this.ae });
    com.fimi.soul.utils.ao.a(getAssets(), new View[] { this.n, this.s, this.u, this.w, this.y, this.q, this.T, this.U, this.V, this.W, this.X, this.Y });
    View[] arrayOfView = new View[7];
    arrayOfView[0] = this.d;
    arrayOfView[1] = this.l;
    arrayOfView[2] = this.k;
    arrayOfView[3] = this.j;
    arrayOfView[4] = this.S;
    arrayOfView[5] = this.i;
    arrayOfView[6] = this.m;
    int i2 = arrayOfView.length;
    int i1 = 0;
    while (i1 < i2)
    {
      arrayOfView[i1].setOnClickListener(this);
      i1 += 1;
    }
  }
  
  private void e(int paramInt)
  {
    List localList = com.fimi.soul.module.droneTrack.a.b.a().c();
    localList.clear();
    int i1 = 0;
    while (i1 < paramInt)
    {
      Object localObject1 = (List)this.M.b().get(Integer.valueOf(i1));
      if (localObject1 != null)
      {
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = ((Iterator)localObject1).next();
          if (localObject2 != null) {
            if ((localObject2 instanceof ag))
            {
              localObject2 = (ag)localObject2;
              if (localObject2 != null)
              {
                this.N.a((ag)localObject2);
                localObject2 = new LatLng(((ag)localObject2).e(), ((ag)localObject2).d());
                if (!localList.contains(localObject2)) {
                  localList.add(localObject2);
                }
              }
            }
            else if ((localObject2 instanceof com.fimi.soul.drone.h.z))
            {
              localObject2 = (com.fimi.soul.drone.h.z)localObject2;
              if ((localObject2 != null) && (this.E != null)) {
                this.N.a((com.fimi.soul.drone.h.z)localObject2);
              }
            }
            else if ((localObject2 instanceof y))
            {
              localObject2 = (y)localObject2;
              if (localObject2 != null) {
                this.N.a((y)localObject2);
              }
            }
            else if ((localObject2 instanceof com.fimi.soul.drone.h.ao))
            {
              localObject2 = (com.fimi.soul.drone.h.ao)localObject2;
              if (localObject2 != null) {
                this.N.a((com.fimi.soul.drone.h.ao)localObject2);
              }
            }
            else if ((localObject2 instanceof com.fimi.soul.drone.h.e))
            {
              localObject2 = (com.fimi.soul.drone.h.e)localObject2;
              if (localObject2 != null) {
                this.N.a((com.fimi.soul.drone.h.e)localObject2);
              }
            }
            else if ((localObject2 instanceof com.fimi.soul.drone.h.d))
            {
              localObject2 = (com.fimi.soul.drone.h.d)localObject2;
              if (localObject2 != null)
              {
                this.N.a((com.fimi.soul.drone.h.d)localObject2);
                b((com.fimi.soul.drone.h.d)localObject2);
              }
            }
            else if ((localObject2 instanceof com.fimi.soul.drone.h.a.e))
            {
              localObject2 = (com.fimi.soul.drone.h.a.e)localObject2;
              if (localObject2 != null) {
                this.N.a((com.fimi.soul.drone.h.a.e)localObject2);
              }
            }
            else if ((localObject2 instanceof ad))
            {
              localObject2 = (ad)localObject2;
              if (localObject2 != null)
              {
                this.N.a((ad)localObject2);
                a((ad)localObject2);
              }
            }
            else if ((localObject2 instanceof com.fimi.soul.drone.h.e))
            {
              localObject2 = (com.fimi.soul.drone.h.e)localObject2;
              if (localObject2 != null) {
                this.N.a((com.fimi.soul.drone.h.e)localObject2);
              }
            }
            else if ((localObject2 instanceof com.fimi.soul.drone.h.c))
            {
              localObject2 = (com.fimi.soul.drone.h.c)localObject2;
              if (localObject2 != null) {
                this.N.a((com.fimi.soul.drone.h.c)localObject2);
              }
            }
            else if ((localObject2 instanceof com.fimi.soul.drone.h.e))
            {
              localObject2 = (com.fimi.soul.drone.h.e)localObject2;
              if (localObject2 != null) {
                this.N.a((com.fimi.soul.drone.h.e)localObject2);
              }
            }
            else if ((localObject2 instanceof com.fimi.soul.drone.h.c))
            {
              localObject2 = (com.fimi.soul.drone.h.c)localObject2;
              if (localObject2 != null) {
                this.N.a((com.fimi.soul.drone.h.c)localObject2);
              }
            }
            else if ((localObject2 instanceof com.fimi.soul.drone.h.a.b))
            {
              localObject2 = (com.fimi.soul.drone.h.a.b)localObject2;
              if (localObject2 != null) {
                this.N.a((com.fimi.soul.drone.h.a.b)localObject2);
              }
            }
          }
        }
      }
      if ((i1 == paramInt - 1) && (localList.size() > 0)) {
        this.E.a((LatLng)localList.get(localList.size() - 1), localList);
      }
      i1 += 1;
    }
  }
  
  private void f(int paramInt)
  {
    if (paramInt == 1)
    {
      a(this.k, 2130837714);
      return;
    }
    a(this.k, 2130837713);
  }
  
  private void g(int paramInt)
  {
    this.R.setText(paramInt + "");
    if (paramInt < 2) {
      a(this.h, 2130903054);
    }
    do
    {
      return;
      if ((paramInt >= 2) && (paramInt < 4))
      {
        a(this.h, 2130903055);
        return;
      }
      if ((paramInt >= 4) && (paramInt < 8))
      {
        a(this.h, 2130903056);
        return;
      }
      if ((paramInt >= 8) && (paramInt < 12))
      {
        a(this.h, 2130903057);
        return;
      }
      if ((paramInt >= 12) && (paramInt < 16))
      {
        a(this.h, 2130903058);
        return;
      }
    } while (paramInt < 16);
    a(this.h, 2130903059);
  }
  
  private void h(int paramInt)
  {
    if (paramInt < 25) {
      a(this.g, 2130903054);
    }
    do
    {
      return;
      if ((paramInt >= 25) && (paramInt < 35))
      {
        a(this.g, 2130903055);
        return;
      }
      if ((paramInt >= 35) && (paramInt < 50))
      {
        a(this.g, 2130903056);
        return;
      }
      if ((paramInt >= 50) && (paramInt < 65))
      {
        a(this.g, 2130903057);
        return;
      }
      if ((paramInt >= 65) && (paramInt < 80))
      {
        a(this.g, 2130903058);
        return;
      }
    } while (paramInt < 80);
    a(this.g, 2130903059);
  }
  
  private void i(int paramInt)
  {
    this.l.setImageResource(paramInt);
  }
  
  public void a()
  {
    this.ah.sendEmptyMessage(100);
  }
  
  public void a(int paramInt)
  {
    f(paramInt);
  }
  
  public void a(String paramString) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131689874: 
      finish();
      return;
    case 2131690073: 
    case 2131690080: 
      if (!this.Q)
      {
        com.fimi.kernel.utils.z.a(this, "正在加载数据", 3000);
        return;
      }
      if (this.af == a.a)
      {
        if (this.L != this.r.getMax())
        {
          i(2130837710);
          this.af = a.b;
        }
        for (;;)
        {
          this.ah.sendEmptyMessage(3);
          return;
          this.L = 0;
          i(2130903045);
        }
      }
      this.ah.removeMessages(3);
      i(2130903045);
      this.af = a.a;
      return;
    case 2131690078: 
      f(this.E.a());
      return;
    case 2131690077: 
      if (this.G.isShown())
      {
        a(this.j, 2130837712);
        this.G.setVisibility(8);
        this.G.setAnimation(AnimationUtils.loadAnimation(this, 17432579));
        return;
      }
      a(this.j, 2130837711);
      this.G.setVisibility(0);
      this.G.setAnimation(AnimationUtils.loadAnimation(this, 2131034124));
      return;
    case 2131690076: 
      if (this.C.isShown())
      {
        a(this.i, 2130837709);
        this.C.setVisibility(8);
        this.C.setAnimation(AnimationUtils.loadAnimation(this, 2131034123));
        return;
      }
      a(this.i, 2130837708);
      this.C.setVisibility(0);
      this.C.setAnimation(AnimationUtils.loadAnimation(this, 17432578));
      return;
    }
    if (this.D.isShown())
    {
      a(this.m, 2130837705);
      this.D.setVisibility(8);
      this.D.setAnimation(AnimationUtils.loadAnimation(this, 2131034123));
      return;
    }
    a(this.m, 2130837704);
    this.D.setVisibility(0);
    this.D.setAnimation(AnimationUtils.loadAnimation(this, 17432578));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setFlags(128, 128);
    setContentView(2130968669);
    e();
    this.F = getSupportFragmentManager();
    this.E = ((PalyBackMapFragment)this.F.findFragmentById(2131689826));
    if (this.E == null)
    {
      this.E = new PalyBackMapFragment();
      this.F.beginTransaction().add(2131689826, this.E).commit();
    }
    if (getIntent() != null)
    {
      paramBundle = getIntent().getStringExtra("path");
      this.H.a(paramBundle, this);
    }
    this.N = new com.fimi.soul.module.droneTrack.a.a();
    this.O = new Timer();
    this.O.schedule(new TimerTask()
    {
      public void run()
      {
        PlayBackDroneTrackActivity.j(PlayBackDroneTrackActivity.this).sendEmptyMessage(1);
      }
    }, 0L, 3000L);
  }
  
  protected void onDestroy()
  {
    com.fimi.soul.module.droneTrack.a.b.a().d();
    com.fimi.soul.module.droneTrack.a.c.a().b();
    if (this.N != null) {
      this.N = null;
    }
    if (this.ah.hasMessages(3)) {
      this.ah.removeMessages(3);
    }
    this.Q = false;
    if (this.O != null) {
      this.O.cancel();
    }
    super.onDestroy();
  }
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (this.ah.hasMessages(3)) {
      this.ah.removeMessages(3);
    }
    this.L = paramInt;
  }
  
  protected void onResume()
  {
    super.onResume();
    if ((!this.Q) && (!this.a.isShown())) {
      this.a.setVisibility(0);
    }
  }
  
  protected void onStart()
  {
    super.onStart();
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  protected void onStop()
  {
    super.onStop();
    if (this.af == a.b)
    {
      this.ah.removeMessages(3);
      i(2130903045);
      this.af = a.a;
    }
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    if ((this.af == a.b) && (!this.ah.hasMessages(3))) {
      this.ah.sendEmptyMessageDelayed(3, this.K);
    }
    this.A.setText(b(paramSeekBar.getProgress() * 1000 + ""));
    e(paramSeekBar.getProgress());
  }
  
  static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */