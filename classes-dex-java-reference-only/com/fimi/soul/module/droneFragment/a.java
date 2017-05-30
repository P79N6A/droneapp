package com.fimi.soul.module.droneFragment;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.soul.biz.c.d;
import com.fimi.soul.biz.c.j;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.MyEditView;
import com.fimi.soul.view.MyEditView.b;
import com.fimi.soul.view.myhorizontalseebar.SeekBar;
import com.fimi.soul.view.myhorizontalseebar.SeekBar.a;
import com.google.android.gms.maps.model.g;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a
  implements View.OnClickListener
{
  private PercentRelativeLayout a;
  private SeekBar b;
  private SeekBar c;
  private com.fimi.soul.drone.a d;
  private TextView e;
  private TextView f;
  private MyEditView g;
  private MyEditView h;
  private int i = 1;
  private int j = 8;
  private int k = 120;
  private int l = 5;
  private String m = "m";
  private String n = "m/s";
  private String o;
  private Button p;
  
  public a(com.fimi.soul.drone.a parama, View paramView)
  {
    this.d = parama;
    a(paramView);
  }
  
  private void a(View paramView)
  {
    this.p = ((Button)paramView.findViewById(2131689677));
    this.p.setOnClickListener(this);
    this.a = ((PercentRelativeLayout)paramView.findViewById(2131690144));
    this.b = ((SeekBar)paramView.findViewById(2131689671));
    this.b.setMax(this.k);
    this.b.setOnSeekBarChangeListener(new SeekBar.a()
    {
      public void a(SeekBar paramAnonymousSeekBar) {}
      
      public void a(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        int i = paramAnonymousInt;
        if (paramAnonymousInt < a.a(a.this)) {
          i = a.a(a.this);
        }
        a.c(a.this).setText(i + a.b(a.this));
        a.this.b(i);
      }
      
      public void b(SeekBar paramAnonymousSeekBar) {}
    });
    this.c = ((SeekBar)paramView.findViewById(2131689674));
    this.c.setMax(this.j);
    this.c.setOnSeekBarChangeListener(new SeekBar.a()
    {
      public void a(SeekBar paramAnonymousSeekBar) {}
      
      public void a(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        int i = paramAnonymousInt;
        if (paramAnonymousInt < a.d(a.this)) {
          i = a.d(a.this);
        }
        paramAnonymousSeekBar = d.k().j();
        if (paramAnonymousSeekBar != null) {
          paramAnonymousSeekBar.setSpeek(i);
        }
        d.k().b(i);
        a.f(a.this).setText(i + a.e(a.this));
      }
      
      public void b(SeekBar paramAnonymousSeekBar) {}
    });
    this.e = ((TextView)paramView.findViewById(2131689670));
    this.f = ((TextView)paramView.findViewById(2131689673));
    this.g = ((MyEditView)paramView.findViewById(2131689672));
    this.g.setInputType(2);
    this.g.setOnFinishComposingListener(new MyEditView.b()
    {
      public void a()
      {
        a.c(a.this).clearFocus();
      }
    });
    this.g.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (!paramAnonymousBoolean)
        {
          a.a(a.this, a.c(a.this), a.g(a.this), a.a(a.this), a.h(a.this), a.b(a.this));
          return;
        }
        a.a(a.this, a.c(a.this).getText().toString());
      }
    });
    this.h = ((MyEditView)paramView.findViewById(2131689675));
    this.h.setInputType(2);
    this.h.setOnFinishComposingListener(new MyEditView.b()
    {
      public void a()
      {
        a.f(a.this).clearFocus();
      }
    });
    this.h.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (!paramAnonymousBoolean)
        {
          a.a(a.this, a.f(a.this), a.i(a.this), a.d(a.this), a.j(a.this), a.e(a.this));
          return;
        }
        a.a(a.this, a.f(a.this).getText().toString());
      }
    });
    ao.a(this.d.d.getAssets(), new View[] { this.e, this.f, this.p, this.g, this.h });
  }
  
  private void a(MyEditView paramMyEditView, int paramInt1, int paramInt2, SeekBar paramSeekBar, String paramString)
  {
    for (;;)
    {
      try
      {
        str = a(b(paramMyEditView.getText().toString()));
        i1 = Integer.parseInt(str);
        if (i1 <= paramInt1) {
          continue;
        }
        str = paramInt1 + paramString;
        paramMyEditView.setText(str);
      }
      catch (Exception paramSeekBar)
      {
        String str;
        int i1;
        if (this.o == null) {
          return;
        }
        paramMyEditView.setText(this.o);
        this.o = " ";
        return;
        paramInt1 = i1;
        continue;
      }
      paramSeekBar.setProgress(paramInt1);
      if (!str.contains(paramString)) {
        paramMyEditView.setText(str + paramString);
      }
      paramString = d.k().j();
      if (paramSeekBar != this.b) {
        continue;
      }
      paramString.setHeight(paramInt1);
      b(paramInt1);
      return;
      if (i1 >= paramInt2) {
        continue;
      }
      str = paramInt2 + paramString;
      paramMyEditView.setText(str);
      paramInt1 = paramInt2;
    }
    if (paramSeekBar == this.c)
    {
      paramString.setSpeek(paramInt1);
      return;
    }
  }
  
  public static String b(String paramString)
  {
    return Pattern.compile("[^0-9]").matcher(paramString).replaceAll("").trim();
  }
  
  public String a(String paramString)
  {
    return BigDecimal.valueOf(Integer.parseInt(paramString)).stripTrailingZeros().toPlainString();
  }
  
  public void a()
  {
    if (!this.a.isShown()) {
      this.a.setVisibility(0);
    }
  }
  
  public void a(int paramInt)
  {
    this.b.setProgress(paramInt);
  }
  
  public void b()
  {
    if (this.a.isShown()) {
      this.a.setVisibility(4);
    }
  }
  
  public void b(int paramInt)
  {
    FlyActionBean localFlyActionBean1 = d.k().j();
    if (localFlyActionBean1 != null)
    {
      d.k().a(paramInt);
      localFlyActionBean1.setHeight(paramInt);
      Iterator localIterator = d.k().e().iterator();
      while (localIterator.hasNext())
      {
        g localg = (g)localIterator.next();
        FlyActionBean localFlyActionBean2 = (FlyActionBean)localg.o();
        if ((localFlyActionBean2 != null) && (localFlyActionBean2.equals(localFlyActionBean1))) {
          localg.a(j.a(this.d.d, localFlyActionBean1.getDrawableRes(), localFlyActionBean1.getHeight(), true));
        }
      }
    }
  }
  
  public void c(int paramInt)
  {
    this.p.setText(paramInt);
  }
  
  public void d(int paramInt)
  {
    this.c.setProgress(paramInt);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    this.d.a(d.a.by);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */