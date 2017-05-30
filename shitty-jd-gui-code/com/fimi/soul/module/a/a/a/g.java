package com.fimi.soul.module.a.a.a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mob.tools.utils.R;

public class g
  extends LinearLayout
{
  private static final int a = 720;
  private static final int b = 64;
  private static final int c = 24;
  private TextView d;
  private k e;
  private ProgressBar f;
  
  public g(Context paramContext)
  {
    super(paramContext);
    Object localObject = R.getScreenSize(paramContext);
    if (localObject[0] < localObject[1]) {}
    for (float f1 = localObject[0];; f1 = localObject[1])
    {
      f1 /= 720.0F;
      setOrientation(1);
      localObject = new LinearLayout(paramContext);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
      localLayoutParams.gravity = 1;
      addView((View)localObject, localLayoutParams);
      this.e = new k(paramContext);
      int i = R.getBitmapRes(paramContext, "ssdk_oks_ptr_ptr");
      if (i > 0) {
        this.e.setImageResource(i);
      }
      i = (int)(64.0F * f1);
      localLayoutParams = new LinearLayout.LayoutParams(i, i);
      localLayoutParams.gravity = 16;
      i = (int)(f1 * 24.0F);
      localLayoutParams.bottomMargin = i;
      localLayoutParams.topMargin = i;
      ((LinearLayout)localObject).addView(this.e, localLayoutParams);
      this.f = new ProgressBar(paramContext);
      int j = R.getBitmapRes(paramContext, "ssdk_oks_classic_progressbar");
      paramContext = paramContext.getResources().getDrawable(j);
      this.f.setIndeterminateDrawable(paramContext);
      ((LinearLayout)localObject).addView(this.f, localLayoutParams);
      this.f.setVisibility(8);
      this.d = new TextView(getContext());
      this.d.setTextSize(2, 18.0F);
      this.d.setPadding(i, 0, i, 0);
      this.d.setTextColor(-16139513);
      paramContext = new LinearLayout.LayoutParams(-2, -2);
      paramContext.gravity = 16;
      ((LinearLayout)localObject).addView(this.d, paramContext);
      return;
    }
  }
  
  @TargetApi(11)
  public void a()
  {
    this.e.setVisibility(8);
    this.f.setVisibility(0);
    int i = R.getStringRes(getContext(), "ssdk_oks_refreshing");
    if (i > 0) {
      this.d.setText(i);
    }
  }
  
  @SuppressLint({"NewApi"})
  @TargetApi(11)
  public void a(int paramInt)
  {
    int i = 180;
    int j;
    if (paramInt > 100)
    {
      j = (paramInt - 100) * 180 / 20;
      if (j <= 180) {
        break label109;
      }
    }
    for (;;)
    {
      j = i;
      if (i < 0) {
        j = 0;
      }
      this.e.setRotation(j);
      if (paramInt < 100)
      {
        paramInt = R.getStringRes(getContext(), "ssdk_oks_pull_to_refresh");
        if (paramInt > 0) {
          this.d.setText(paramInt);
        }
      }
      do
      {
        return;
        this.e.setRotation(0.0F);
        break;
        paramInt = R.getStringRes(getContext(), "ssdk_oks_release_to_refresh");
      } while (paramInt <= 0);
      this.d.setText(paramInt);
      return;
      label109:
      i = j;
    }
  }
  
  @SuppressLint({"NewApi"})
  public void b()
  {
    this.f.setVisibility(8);
    this.e.setRotation(180.0F);
    this.e.setVisibility(0);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */