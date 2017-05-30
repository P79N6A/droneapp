package com.fimi.soul.module.a.a.a;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import cn.sharesdk.framework.CustomPlatform;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.Platform.ShareParams;
import cn.sharesdk.framework.ShareSDK;
import com.fimi.soul.module.a.c;
import com.fimi.soul.module.a.e;
import com.mob.tools.gui.MobViewPager;
import com.mob.tools.gui.ViewPagerAdapter;
import com.mob.tools.utils.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public abstract class i
  extends c
{
  private a a;
  private Runnable b;
  private Animation c;
  private Animation d;
  private LinearLayout e;
  private boolean f;
  
  public i(e parame)
  {
    super(parame);
    this.a = ((a)R.forceCast(parame));
  }
  
  private void j()
  {
    this.c = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
    this.c.setDuration(300L);
    this.d = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, 1.0F);
    this.d.setDuration(300L);
  }
  
  protected abstract j a(ArrayList<Object> paramArrayList);
  
  public final void a(final View paramView, final com.fimi.soul.module.a.a parama)
  {
    this.b = new Runnable()
    {
      public void run()
      {
        parama.c.onClick(paramView);
      }
    };
    finish();
  }
  
  public final void d(final Platform paramPlatform)
  {
    this.b = new Runnable()
    {
      public void run()
      {
        boolean bool1 = i.a(i.this);
        boolean bool2 = paramPlatform instanceof CustomPlatform;
        boolean bool3 = i.a(i.this, paramPlatform);
        if ((bool1) || (bool2) || (bool3)) {
          i.b(i.this, paramPlatform);
        }
        Platform.ShareParams localShareParams;
        do
        {
          return;
          localShareParams = i.c(i.this, paramPlatform);
        } while (localShareParams == null);
        ShareSDK.logDemoEvent(3, null);
        if (i.b(i.this) != null) {
          i.c(i.this).a(paramPlatform, localShareParams);
        }
        i.e(i.this).a(i.d(i.this), paramPlatform, localShareParams);
      }
    };
    finish();
  }
  
  protected ArrayList<Object> i()
  {
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = ShareSDK.getPlatformList();
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new Platform[0];
    }
    HashMap localHashMap = e();
    localObject2 = localHashMap;
    if (localHashMap == null) {
      localObject2 = new HashMap();
    }
    int j = localObject1.length;
    while (i < j)
    {
      localHashMap = localObject1[i];
      if (!((HashMap)localObject2).containsKey(localHashMap.getName())) {
        localArrayList.add(localHashMap);
      }
      i += 1;
    }
    localObject1 = d();
    if ((localObject1 != null) && (((ArrayList)localObject1).size() > 0)) {
      localArrayList.addAll((Collection)localObject1);
    }
    return localArrayList;
  }
  
  public void onCreate()
  {
    this.activity.getWindow().setBackgroundDrawable(new ColorDrawable(1275068416));
    j();
    Object localObject1 = new LinearLayout(this.activity);
    ((LinearLayout)localObject1).setOrientation(1);
    this.activity.setContentView((View)localObject1);
    Object localObject2 = new TextView(this.activity);
    Object localObject3 = new LinearLayout.LayoutParams(-1, -2);
    ((LinearLayout.LayoutParams)localObject3).weight = 1.0F;
    ((TextView)localObject2).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        i.this.finish();
      }
    });
    ((LinearLayout)localObject1).addView((View)localObject2, (ViewGroup.LayoutParams)localObject3);
    this.e = new LinearLayout(this.activity);
    this.e.setOrientation(1);
    localObject2 = new LinearLayout.LayoutParams(-1, -2);
    this.e.setAnimation(this.c);
    ((LinearLayout)localObject1).addView(this.e, (ViewGroup.LayoutParams)localObject2);
    localObject1 = new MobViewPager(this.activity);
    localObject2 = a(i());
    localObject3 = new LinearLayout.LayoutParams(-1, ((j)localObject2).b());
    this.e.addView((View)localObject1, (ViewGroup.LayoutParams)localObject3);
    localObject3 = new f(this.activity);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, ((j)localObject2).a());
    this.e.addView((View)localObject3, localLayoutParams);
    ((f)localObject3).setScreenCount(((j)localObject2).getCount());
    ((f)localObject3).a(0, 0);
    ((j)localObject2).a((f)localObject3);
    ((MobViewPager)localObject1).setAdapter((ViewPagerAdapter)localObject2);
  }
  
  public boolean onFinish()
  {
    if (this.f)
    {
      this.f = false;
      return false;
    }
    this.d.setAnimationListener(new Animation.AnimationListener()
    {
      public void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        if (i.f(i.this) == null) {
          ShareSDK.logDemoEvent(2, null);
        }
        for (;;)
        {
          i.a(i.this, true);
          i.this.finish();
          return;
          i.f(i.this).run();
          i.a(i.this, null);
        }
      }
      
      public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public void onAnimationStart(Animation paramAnonymousAnimation) {}
    });
    this.e.clearAnimation();
    this.e.setAnimation(this.d);
    this.e.setVisibility(8);
    return true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */