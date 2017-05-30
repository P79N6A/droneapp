package com.fimi.soul.module.a.a.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import com.mob.tools.gui.PullToRequestView;
import com.mob.tools.utils.R;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class e
  extends com.fimi.soul.module.a.c
  implements View.OnClickListener, AdapterView.OnItemClickListener
{
  private static final int a = 40;
  private Platform b;
  private LinearLayout c;
  private RelativeLayout d;
  private TextView e;
  private TextView f;
  private c g;
  private int h = -1;
  private int i = 0;
  
  public e(com.fimi.soul.module.a.e parame)
  {
    super(parame);
  }
  
  private void a(RelativeLayout paramRelativeLayout, float paramFloat)
  {
    this.e = new TextView(this.activity);
    this.e.setTextColor(-12895429);
    this.e.setTextSize(2, 18.0F);
    this.e.setGravity(17);
    int j = R.getStringRes(this.activity, "ssdk_oks_cancel");
    if (j > 0) {
      this.e.setText(j);
    }
    j = (int)(40.0F * paramFloat);
    this.e.setPadding(j, 0, j, 0);
    Object localObject = new RelativeLayout.LayoutParams(-2, -1);
    paramRelativeLayout.addView(this.e, (ViewGroup.LayoutParams)localObject);
    this.e.setOnClickListener(this);
    localObject = new TextView(this.activity);
    ((TextView)localObject).setTextColor(-12895429);
    ((TextView)localObject).setTextSize(2, 22.0F);
    ((TextView)localObject).setGravity(17);
    int k = R.getStringRes(this.activity, "ssdk_oks_contacts");
    if (k > 0) {
      ((TextView)localObject).setText(k);
    }
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -1);
    localLayoutParams.addRule(13);
    paramRelativeLayout.addView((View)localObject, localLayoutParams);
    this.f = new TextView(this.activity);
    this.f.setTextColor(-37615);
    this.f.setTextSize(2, 18.0F);
    this.f.setGravity(17);
    k = R.getStringRes(this.activity, "ssdk_oks_confirm");
    if (k > 0) {
      this.f.setText(k);
    }
    this.f.setPadding(j, 0, j, 0);
    localObject = new RelativeLayout.LayoutParams(-2, -1);
    ((RelativeLayout.LayoutParams)localObject).addRule(11);
    paramRelativeLayout.addView(this.f, (ViewGroup.LayoutParams)localObject);
    this.f.setOnClickListener(this);
  }
  
  private void k()
  {
    int j = R.getStringRes(this.activity, "ssdk_oks_confirm");
    String str = "Confirm";
    if (j > 0) {
      str = getContext().getResources().getString(j);
    }
    if (this.i == 0) {
      this.f.setText(str);
    }
    while (this.i <= 0) {
      return;
    }
    this.f.setText(str + "(" + this.i + ")");
  }
  
  public void d(Platform paramPlatform)
  {
    this.b = paramPlatform;
  }
  
  protected abstract float i();
  
  protected abstract int j();
  
  public void onClick(View paramView)
  {
    if (paramView.equals(this.e))
    {
      finish();
      return;
    }
    paramView = new ArrayList();
    int j = 0;
    int k = this.g.getCount();
    while (j < k)
    {
      if (this.g.a(j).a) {
        paramView.add(this.g.a(j).f);
      }
      j += 1;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("selected", paramView);
    localHashMap.put("platform", this.b);
    setResult(localHashMap);
    finish();
  }
  
  public void onCreate()
  {
    this.activity.getWindow().setBackgroundDrawable(new ColorDrawable(-789517));
    this.c = new LinearLayout(this.activity);
    this.c.setOrientation(1);
    this.activity.setContentView(this.c);
    this.d = new RelativeLayout(this.activity);
    float f2 = i();
    Object localObject1 = new LinearLayout.LayoutParams(-1, (int)(j() * f2));
    this.c.addView(this.d, (ViewGroup.LayoutParams)localObject1);
    a(this.d, f2);
    localObject1 = new View(this.activity);
    if (f2 < 1.0F) {}
    for (float f1 = 1.0F;; f1 = f2)
    {
      Object localObject2 = new LinearLayout.LayoutParams(-1, (int)f1);
      ((View)localObject1).setBackgroundColor(-2434599);
      this.c.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
      localObject1 = new FrameLayout(getContext());
      localObject2 = new LinearLayout.LayoutParams(-1, -2);
      ((LinearLayout.LayoutParams)localObject2).weight = 1.0F;
      ((FrameLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      this.c.addView((View)localObject1);
      localObject2 = new PullToRequestView(getContext());
      ((PullToRequestView)localObject2).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
      ((FrameLayout)localObject1).addView((View)localObject2);
      this.g = new c(this, (PullToRequestView)localObject2);
      this.g.a(this.b);
      this.g.a(f2);
      this.g.a(this);
      ((PullToRequestView)localObject2).setAdapter(this.g);
      ((PullToRequestView)localObject2).performPullingDown(true);
      return;
    }
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    boolean bool = false;
    if ("FacebookMessenger".equals(this.b.getName()))
    {
      if (this.h >= 0) {
        this.g.a(this.h).a = false;
      }
      this.h = paramInt;
    }
    paramAdapterView = this.g.a(paramInt);
    if (!paramAdapterView.a) {
      bool = true;
    }
    paramAdapterView.a = bool;
    if (paramAdapterView.a) {}
    for (this.i += 1;; this.i -= 1)
    {
      k();
      this.g.notifyDataSetChanged();
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */