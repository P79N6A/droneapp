package com.fimi.soul.module.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.kernel.view.button.SwitchButton.a;
import com.fimi.soul.biz.manager.k;
import com.fimi.soul.biz.manager.o;
import com.fimi.soul.entity.Setting;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.update.a.b;
import com.fimi.soul.utils.ao;
import java.util.List;

public class i
  extends BaseAdapter
  implements SwitchButton.a
{
  public static final String b = "100";
  public c a;
  private Context c;
  private List<Setting> d;
  private com.fimi.soul.drone.a e;
  private b f;
  private b g;
  private k h;
  private a i;
  
  public i(Context paramContext, com.fimi.soul.drone.a parama)
  {
    this.c = paramContext;
    this.e = parama;
    this.h = k.a(paramContext);
    this.g = ((b)c.c().a("sp_firmware_cache", b.class));
  }
  
  private void a(e parame, ViewGroup.LayoutParams paramLayoutParams)
  {
    parame.i.setBackgroundResource(2130838257);
    parame.a.setVisibility(4);
    parame.f.setVisibility(4);
    parame.b.setVisibility(4);
    parame.j.setVisibility(4);
    parame.h.setVisibility(8);
    parame.g.setVisibility(4);
    parame.d.setVisibility(4);
    parame.e.setVisibility(4);
    parame.c.setTextColor(this.c.getResources().getColor(2131624227));
    parame.d.setTextColor(this.c.getResources().getColor(2131624227));
    parame.e.setTextColor(this.c.getResources().getColor(2131624228));
    parame.g.setTextColor(this.c.getResources().getColor(2131624229));
    parame.b.setAlpha(1.0F);
    parame.j.setAlpha(1.0F);
    parame.f.setAlpha(1.0F);
    paramLayoutParams.height = ((int)this.c.getResources().getDimension(2131296501));
    parame.i.setLayoutParams(paramLayoutParams);
  }
  
  public void a(int paramInt, View paramView)
  {
    if (paramView == null) {}
    while (!(paramView.getTag() instanceof e)) {
      return;
    }
    ((e)paramView.getTag()).g.setText(((Setting)this.d.get(paramInt)).getContent());
  }
  
  public void a(View paramView, boolean paramBoolean)
  {
    label104:
    Object localObject;
    if (((Integer)paramView.getTag()).intValue() == d.x.ordinal())
    {
      if (o.a(this.c).e())
      {
        o.a(this.c).f(false);
        PreferenceManager.getDefaultSharedPreferences(this.c).edit().putInt("Amptype", 1).commit();
      }
    }
    else
    {
      if (((Integer)paramView.getTag()).intValue() == d.j.ordinal())
      {
        if (!c.e().d()) {
          break label287;
        }
        c.e().a(false);
        ((FlightActivity)this.c).h();
      }
      if (((Integer)paramView.getTag()).intValue() == d.f.ordinal())
      {
        localObject = (SwitchButton)paramView.findViewWithTag(paramView.getTag());
        this.f.a((SwitchButton)localObject);
      }
      if (((Integer)paramView.getTag()).intValue() != d.i.ordinal()) {
        break label320;
      }
      localObject = (SwitchButton)paramView.findViewWithTag(paramView.getTag());
      if (!((Setting)this.d.get(d.i.ordinal())).getIsOPen().booleanValue()) {
        break label297;
      }
      ((SwitchButton)localObject).a(true, false);
    }
    for (;;)
    {
      if (!((Setting)this.d.get(d.f.ordinal())).getIsOPen().booleanValue()) {
        break label306;
      }
      return;
      o.a(this.c).f(true);
      PreferenceManager.getDefaultSharedPreferences(this.c).edit().putInt("Amptype", 2).commit();
      break;
      label287:
      c.e().a(true);
      break label104;
      label297:
      ((SwitchButton)localObject).a(false, false);
    }
    label306:
    this.a.a(4);
    notifyDataSetChanged();
    label320:
    if (((Integer)paramView.getTag()).intValue() == d.h.ordinal())
    {
      localObject = (SwitchButton)paramView.findViewWithTag(paramView.getTag());
      if (!((Setting)this.d.get(d.h.ordinal())).getIsOPen().booleanValue()) {
        break label471;
      }
      ((SwitchButton)localObject).a(true, false);
    }
    for (;;)
    {
      this.a.a(2);
      if (((Integer)paramView.getTag()).intValue() != d.y.ordinal()) {
        break;
      }
      paramView = v.a(this.e.d).a();
      localObject = com.fimi.soul.biz.n.a.a();
      if (!paramView.getBoolean("Map_Code_Correction", false)) {
        break label480;
      }
      paramView.edit().putBoolean("Map_Code_Correction", false).commit();
      ((com.fimi.soul.biz.n.a)localObject).a(true);
      return;
      label471:
      ((SwitchButton)localObject).a(false, false);
    }
    label480:
    paramView.edit().putBoolean("Map_Code_Correction", true).commit();
    ((com.fimi.soul.biz.n.a)localObject).a(false);
  }
  
  public void a(a parama)
  {
    this.i = parama;
  }
  
  public void a(b paramb)
  {
    this.f = paramb;
  }
  
  public void a(c paramc)
  {
    this.a = paramc;
  }
  
  public void a(List<Setting> paramList)
  {
    this.d = paramList;
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    return d.values().length;
  }
  
  public Object getItem(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = new e(null);
      localObject = paramView.a(paramViewGroup);
      ((View)localObject).setTag(paramView);
      paramViewGroup = paramView;
      paramView = (View)localObject;
      if (this.d != null) {
        break label52;
      }
    }
    label52:
    label776:
    label1205:
    label1325:
    label1494:
    label1590:
    label1762:
    label2666:
    label3137:
    do
    {
      return paramView;
      paramViewGroup = (e)paramView.getTag();
      break;
      a(paramViewGroup, paramView.getLayoutParams());
      if (paramInt == d.a.ordinal())
      {
        paramViewGroup.a.setVisibility(0);
        paramViewGroup.a.setText(2131362254);
        paramViewGroup.f.setVisibility(4);
        paramViewGroup.c.setVisibility(4);
        paramViewGroup.b.setVisibility(4);
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.i.setBackgroundResource(2131624131);
      }
      if (paramInt == d.b.ordinal())
      {
        if (!((Setting)this.d.get(d.b.ordinal())).getIsOPen().booleanValue())
        {
          paramViewGroup.c.setTextColor(this.c.getResources().getColor(2131624225));
          paramViewGroup.i.setBackgroundResource(2131624131);
          paramViewGroup.b.setAlpha(0.3F);
          paramViewGroup.f.setAlpha(0.3F);
        }
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.b.setBackgroundResource(2130837850);
        paramViewGroup.c.setText(2131362101);
      }
      if (paramInt == d.c.ordinal())
      {
        if (!((Setting)this.d.get(d.c.ordinal())).getIsOPen().booleanValue())
        {
          paramViewGroup.c.setTextColor(this.c.getResources().getColor(2131624225));
          paramViewGroup.i.setBackgroundResource(2131624131);
          paramViewGroup.b.setAlpha(0.3F);
          paramViewGroup.f.setAlpha(0.3F);
        }
        if (((Setting)this.d.get(d.c.ordinal())).getIsOPen().booleanValue())
        {
          if (!((Setting)this.d.get(d.c.ordinal())).isDisplayTv()) {
            break label4056;
          }
          paramViewGroup.g.setVisibility(0);
          paramViewGroup.g.setText(this.c.getResources().getString(2131362476));
          paramViewGroup.h.setVisibility(0);
        }
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setBackgroundResource(2130837933);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.c.setText(2131362607);
      }
      if (paramInt == d.d.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130837849);
        paramViewGroup.c.setText(2131362082);
      }
      if (paramInt == d.e.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130838303);
        paramViewGroup.c.setText(2131362483);
      }
      if (paramInt == d.f.ordinal())
      {
        paramViewGroup.c.setVisibility(4);
        paramViewGroup.d.setVisibility(0);
        paramViewGroup.e.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.d.setText(2131362485);
        paramViewGroup.e.setText(2131362506);
        paramViewGroup.b.setBackgroundResource(2130837859);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.j.setVisibility(0);
        if (!((Setting)this.d.get(d.f.ordinal())).getIsOPen().booleanValue()) {
          break label4075;
        }
        paramViewGroup.j.a(true, false);
        paramViewGroup.j.setAlpha(1.0F);
        paramViewGroup.j.setTag(Integer.valueOf(d.f.ordinal()));
        paramViewGroup.j.setOnSwitchListener(this);
        localObject = paramView.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = ((int)this.c.getResources().getDimension(2131296502));
        paramViewGroup.i.setLayoutParams((ViewGroup.LayoutParams)localObject);
        paramViewGroup.f.setVisibility(4);
      }
      if (paramInt == d.g.ordinal())
      {
        if (((Setting)this.d.get(d.f.ordinal())).getIsOPen().booleanValue())
        {
          paramViewGroup.d.setTextColor(this.c.getResources().getColor(2131624225));
          paramViewGroup.e.setTextColor(this.c.getResources().getColor(2131624225));
          paramViewGroup.i.setBackgroundResource(2131624131);
          paramViewGroup.f.setAlpha(0.3F);
          paramViewGroup.b.setAlpha(0.3F);
        }
        paramViewGroup.c.setVisibility(4);
        paramViewGroup.d.setVisibility(0);
        paramViewGroup.e.setVisibility(0);
        paramViewGroup.d.setText(2131362314);
        paramViewGroup.e.setText(2131362471);
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130838169);
        paramViewGroup.b.setVisibility(0);
        localObject = paramView.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = ((int)this.c.getResources().getDimension(2131296502));
        paramViewGroup.i.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      if (paramInt == d.h.ordinal())
      {
        if ((!((Setting)this.d.get(d.f.ordinal())).getIsOPen().booleanValue()) && (!((Setting)this.d.get(d.i.ordinal())).getIsOPen().booleanValue())) {
          break label4087;
        }
        paramViewGroup.b.setAlpha(0.3F);
        paramViewGroup.f.setAlpha(0.3F);
        paramViewGroup.d.setTextColor(this.c.getResources().getColor(2131624225));
        paramViewGroup.e.setTextColor(this.c.getResources().getColor(2131624225));
        paramViewGroup.i.setBackgroundResource(2131624131);
        paramViewGroup.j.setAlpha(0.3F);
        paramViewGroup.j.setTag(Integer.valueOf(d.h.ordinal()));
        paramViewGroup.j.setOnSwitchListener(this);
        paramViewGroup.c.setVisibility(4);
        paramViewGroup.d.setVisibility(0);
        paramViewGroup.e.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.d.setText(2131362538);
        paramViewGroup.e.setText(2131362471);
        paramViewGroup.j.setVisibility(0);
        if (!((Setting)this.d.get(d.h.ordinal())).getIsOPen().booleanValue()) {
          break label4114;
        }
        paramViewGroup.j.a(true, false);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130838171);
        localObject = paramView.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = ((int)this.c.getResources().getDimension(2131296502));
        paramViewGroup.i.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      if (paramInt == d.i.ordinal())
      {
        if (!((Setting)this.d.get(d.f.ordinal())).getIsOPen().booleanValue()) {
          break label4126;
        }
        paramViewGroup.b.setAlpha(0.3F);
        paramViewGroup.f.setAlpha(0.3F);
        paramViewGroup.d.setTextColor(this.c.getResources().getColor(2131624225));
        paramViewGroup.e.setTextColor(this.c.getResources().getColor(2131624225));
        paramViewGroup.i.setBackgroundResource(2131624131);
        paramViewGroup.j.setAlpha(0.3F);
        paramViewGroup.d.setVisibility(0);
        paramViewGroup.c.setVisibility(4);
        paramViewGroup.e.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.d.setText(2131362287);
        paramViewGroup.e.setText(2131362471);
        paramViewGroup.j.setVisibility(0);
        if (!((Setting)this.d.get(d.i.ordinal())).getIsOPen().booleanValue()) {
          break label4153;
        }
        paramViewGroup.j.a(true, false);
        paramViewGroup.j.setTag(Integer.valueOf(d.i.ordinal()));
        paramViewGroup.j.setOnSwitchListener(this);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130838181);
        localObject = paramView.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = ((int)this.c.getResources().getDimension(2131296502));
        paramViewGroup.i.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      if (paramInt == d.j.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setBackgroundResource(2130837939);
        paramViewGroup.c.setText(2131362717);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.j.setVisibility(0);
        if (!c.e().d()) {
          break label4165;
        }
        paramViewGroup.j.a(true, false);
        paramViewGroup.j.setOnSwitchListener(this);
        paramViewGroup.j.setTag(Integer.valueOf(d.j.ordinal()));
        paramViewGroup.f.setVisibility(4);
      }
      if (paramInt == d.k.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.a.setVisibility(0);
        paramViewGroup.a.setText(2131362631);
        paramViewGroup.f.setVisibility(4);
        paramViewGroup.c.setVisibility(4);
        paramViewGroup.b.setVisibility(4);
        paramViewGroup.i.setBackgroundResource(2131624131);
      }
      if (paramInt == d.l.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        if (!((Setting)this.d.get(d.l.ordinal())).getIsOPen().booleanValue())
        {
          paramViewGroup.c.setTextColor(this.c.getResources().getColor(2131624225));
          paramViewGroup.i.setBackgroundResource(2131624131);
          paramViewGroup.b.setAlpha(0.3F);
          paramViewGroup.f.setAlpha(0.3F);
        }
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130838539);
        paramViewGroup.c.setText(2131362013);
      }
      if (paramInt == d.m.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130838526);
        paramViewGroup.c.setText(2131362810);
        paramViewGroup.g.setVisibility(0);
        paramViewGroup.g.setText(((Setting)this.d.get(d.m.ordinal())).getContent());
      }
      if (paramInt == d.q.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.a.setVisibility(0);
        paramViewGroup.a.setText(2131361981);
        paramViewGroup.f.setVisibility(4);
        paramViewGroup.c.setVisibility(4);
        paramViewGroup.b.setVisibility(4);
        paramViewGroup.i.setBackgroundResource(2131624131);
      }
      if (paramInt == d.p.ordinal())
      {
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.c.setText(2131362646);
        paramViewGroup.b.setBackgroundResource(2130838182);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.j.setVisibility(8);
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.g.setText(((Setting)this.d.get(d.p.ordinal())).getContent());
        paramViewGroup.g.setVisibility(0);
      }
      if (paramInt == d.r.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130838140);
        paramViewGroup.c.setText(2131361988);
      }
      if (paramInt == d.s.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.a.setVisibility(0);
        paramViewGroup.a.setText(2131362304);
        paramViewGroup.f.setVisibility(4);
        paramViewGroup.c.setVisibility(4);
        paramViewGroup.b.setVisibility(4);
        paramViewGroup.i.setBackgroundResource(2131624131);
      }
      if (paramInt == d.t.ordinal())
      {
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130837958);
        paramViewGroup.c.setText(2131362305);
      }
      if (paramInt == d.w.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.a.setVisibility(0);
        paramViewGroup.a.setText(2131362448);
        paramViewGroup.f.setVisibility(4);
        paramViewGroup.c.setVisibility(4);
        paramViewGroup.b.setVisibility(4);
        paramViewGroup.i.setBackgroundResource(2131624131);
      }
      if (paramInt == d.x.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setBackgroundResource(2130838467);
        paramViewGroup.c.setText(2131362651);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.j.setVisibility(0);
        if (!o.a(this.c).e()) {
          break label4177;
        }
        paramViewGroup.j.a(true, false);
        paramViewGroup.j.setOnSwitchListener(this);
        paramViewGroup.j.setTag(Integer.valueOf(d.x.ordinal()));
        paramViewGroup.f.setVisibility(4);
      }
      if (paramInt == d.u.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.a.setVisibility(0);
        paramViewGroup.a.setText(2131362034);
        paramViewGroup.f.setVisibility(4);
        paramViewGroup.c.setVisibility(4);
        paramViewGroup.b.setVisibility(4);
        paramViewGroup.i.setBackgroundResource(2131624131);
      }
      if (paramInt == d.v.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130837772);
        paramViewGroup.c.setText(2131362042);
      }
      if (paramInt == d.z.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.a.setVisibility(0);
        paramViewGroup.a.setText(2131361956);
        paramViewGroup.f.setVisibility(4);
        paramViewGroup.c.setVisibility(4);
        paramViewGroup.b.setVisibility(4);
        paramViewGroup.i.setBackgroundResource(2131624131);
      }
      if (paramInt == d.A.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130838163);
        paramViewGroup.c.setText(2131362257);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.f.setVisibility(0);
      }
      if (paramInt == d.B.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130838161);
        paramViewGroup.c.setText(2131362268);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.f.setVisibility(0);
      }
      if (paramInt == d.F.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        if (!((Setting)this.d.get(d.F.ordinal())).getIsOPen().booleanValue()) {
          break label4189;
        }
        paramViewGroup.g.setText(((Setting)this.d.get(d.F.ordinal())).getContent());
        paramViewGroup.f.setVisibility(4);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130838279);
        paramViewGroup.c.setText(2131362922);
        paramViewGroup.g.setVisibility(0);
      }
      if (paramInt == d.C.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130838155);
        paramViewGroup.c.setText(2131362898);
      }
      if (paramInt == d.D.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130837580);
        paramViewGroup.c.setText(2131361949);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.f.setVisibility(0);
      }
      if (paramInt == d.E.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130838177);
        paramViewGroup.c.setText(2131362699);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.f.setVisibility(0);
      }
      if (paramInt == d.G.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.f.setVisibility(4);
        paramViewGroup.b.setVisibility(4);
        paramViewGroup.j.setVisibility(4);
        paramViewGroup.h.setVisibility(4);
        paramViewGroup.g.setVisibility(4);
        paramViewGroup.d.setVisibility(4);
        paramViewGroup.e.setVisibility(4);
        paramViewGroup.c.setVisibility(4);
        localObject = paramView.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = ((int)this.c.getResources().getDimension(2131296500));
        paramViewGroup.i.setLayoutParams((ViewGroup.LayoutParams)localObject);
        paramViewGroup.i.setBackgroundResource(2131624131);
      }
      if (paramInt == d.o.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        if (!((Setting)this.d.get(d.l.ordinal())).getIsOPen().booleanValue())
        {
          paramViewGroup.c.setTextColor(this.c.getResources().getColor(2131624225));
          paramViewGroup.i.setBackgroundResource(2131624131);
          paramViewGroup.b.setAlpha(0.3F);
          paramViewGroup.f.setAlpha(0.3F);
        }
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130838176);
        paramViewGroup.c.setText(2131362558);
      }
      if (paramInt == d.n.ordinal())
      {
        paramViewGroup.k.setVisibility(4);
        if (!((Setting)this.d.get(d.l.ordinal())).getIsOPen().booleanValue())
        {
          paramViewGroup.c.setTextColor(this.c.getResources().getColor(2131624225));
          paramViewGroup.i.setBackgroundResource(2131624131);
          paramViewGroup.b.setAlpha(0.3F);
          paramViewGroup.f.setAlpha(0.3F);
        }
        paramViewGroup.f.setVisibility(0);
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.a.setVisibility(4);
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setBackgroundResource(2130838496);
        paramViewGroup.c.setText(2131362616);
      }
    } while (paramInt != d.y.ordinal());
    paramViewGroup.k.setVisibility(4);
    paramViewGroup.f.setVisibility(0);
    paramViewGroup.c.setVisibility(4);
    paramViewGroup.a.setVisibility(4);
    paramViewGroup.b.setBackgroundResource(2130903048);
    paramViewGroup.d.setText(2131362449);
    paramViewGroup.e.setText(2131362450);
    paramViewGroup.d.setVisibility(0);
    paramViewGroup.e.setVisibility(0);
    paramViewGroup.b.setVisibility(0);
    paramViewGroup.j.setVisibility(0);
    Object localObject = v.a(this.e.d).a();
    com.fimi.soul.biz.n.a locala = com.fimi.soul.biz.n.a.a();
    if (((SharedPreferences)localObject).getBoolean("Map_Code_Correction", false))
    {
      paramViewGroup.j.a(true, false);
      locala.a(false);
    }
    for (;;)
    {
      paramViewGroup.j.setOnSwitchListener(this);
      paramViewGroup.j.setTag(Integer.valueOf(d.y.ordinal()));
      paramViewGroup.f.setVisibility(4);
      localObject = paramView.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = ((int)this.c.getResources().getDimension(2131296502));
      paramViewGroup.i.setLayoutParams((ViewGroup.LayoutParams)localObject);
      return paramView;
      label4056:
      paramViewGroup.h.setVisibility(4);
      paramViewGroup.g.setVisibility(4);
      break;
      label4075:
      paramViewGroup.j.a(false, false);
      break label776;
      label4087:
      paramViewGroup.b.setAlpha(1.0F);
      paramViewGroup.f.setAlpha(1.0F);
      paramViewGroup.j.setAlpha(1.0F);
      break label1205;
      label4114:
      paramViewGroup.j.a(false, false);
      break label1325;
      label4126:
      paramViewGroup.b.setAlpha(1.0F);
      paramViewGroup.f.setAlpha(1.0F);
      paramViewGroup.j.setAlpha(1.0F);
      break label1494;
      label4153:
      paramViewGroup.j.a(false, false);
      break label1590;
      label4165:
      paramViewGroup.j.a(false, false);
      break label1762;
      label4177:
      paramViewGroup.j.a(false, false);
      break label2666;
      label4189:
      paramViewGroup.g.setText(2131362194);
      paramViewGroup.f.setVisibility(0);
      break label3137;
      paramViewGroup.j.a(false, false);
      locala.a(true);
    }
  }
  
  public static abstract interface a
  {
    public abstract void b();
  }
  
  public static abstract interface b
  {
    public abstract void a(SwitchButton paramSwitchButton);
  }
  
  public static abstract interface c
  {
    public abstract void a(int paramInt);
  }
  
  public static enum d
  {
    private d() {}
  }
  
  private class e
  {
    TextView a;
    ImageView b;
    TextView c;
    TextView d;
    TextView e;
    ImageView f;
    TextView g;
    ImageView h;
    RelativeLayout i;
    SwitchButton j;
    TextView k;
    
    private e() {}
    
    public View a(ViewGroup paramViewGroup)
    {
      paramViewGroup = LayoutInflater.from(i.a(i.this)).inflate(2130968638, paramViewGroup, false);
      this.i = ((RelativeLayout)paramViewGroup.findViewById(2131689894));
      this.a = ((TextView)paramViewGroup.findViewById(2131689899));
      this.b = ((ImageView)paramViewGroup.findViewById(2131689900));
      this.c = ((TextView)paramViewGroup.findViewById(2131689901));
      this.f = ((ImageView)paramViewGroup.findViewById(2131689896));
      this.d = ((TextView)paramViewGroup.findViewById(2131689902));
      this.e = ((TextView)paramViewGroup.findViewById(2131689903));
      this.g = ((TextView)paramViewGroup.findViewById(2131689905));
      this.h = ((ImageView)paramViewGroup.findViewById(2131689904));
      this.j = ((SwitchButton)paramViewGroup.findViewById(2131689906));
      this.k = ((TextView)paramViewGroup.findViewById(2131689907));
      ao.a(i.a(i.this).getAssets(), new View[] { this.a, this.c, this.g, this.d, this.e, this.k });
      return paramViewGroup;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */