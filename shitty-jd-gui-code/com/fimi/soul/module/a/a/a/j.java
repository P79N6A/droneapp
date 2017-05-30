package com.fimi.soul.module.a.a.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import com.fimi.soul.module.a.a;
import com.mob.tools.gui.ViewPagerAdapter;
import com.mob.tools.utils.R;
import java.util.ArrayList;

public abstract class j
  extends ViewPagerAdapter
  implements View.OnClickListener
{
  protected static final int a = 1000;
  public static final int b = 52;
  protected Object[][] c;
  protected int d;
  protected int e;
  protected int f;
  protected int g;
  protected int h;
  protected int i;
  protected int j;
  private i k;
  private f l;
  private long m;
  
  public j(i parami, ArrayList<Object> paramArrayList)
  {
    this.k = parami;
    if ((paramArrayList != null) && (!paramArrayList.isEmpty()))
    {
      a(parami.getContext(), paramArrayList);
      a(paramArrayList);
    }
  }
  
  private View a(Context paramContext)
  {
    int i2 = 0;
    LinearLayout localLinearLayout1 = new LinearLayout(paramContext);
    localLinearLayout1.setOrientation(1);
    localLinearLayout1.setBackgroundColor(-855310);
    int i3 = this.e / this.f;
    LinearLayout[] arrayOfLinearLayout = new LinearLayout[this.g * i3];
    localLinearLayout1.setTag(arrayOfLinearLayout);
    int i4 = R.getBitmapRes(paramContext, "ssdk_oks_classic_platform_cell_back");
    int n = 0;
    LinearLayout localLinearLayout2;
    Object localObject;
    while (n < i3)
    {
      localLinearLayout2 = new LinearLayout(paramContext);
      localLinearLayout1.addView(localLinearLayout2, new LinearLayout.LayoutParams(-1, this.f));
      i1 = 0;
      while (i1 < this.g)
      {
        arrayOfLinearLayout[(this.g * n + i1)] = new LinearLayout(paramContext);
        arrayOfLinearLayout[(this.g * n + i1)].setBackgroundResource(i4);
        arrayOfLinearLayout[(this.g * n + i1)].setOrientation(1);
        localObject = new LinearLayout.LayoutParams(-1, this.f);
        ((LinearLayout.LayoutParams)localObject).weight = 1.0F;
        localLinearLayout2.addView(arrayOfLinearLayout[(this.g * n + i1)], (ViewGroup.LayoutParams)localObject);
        if (i1 < this.g - 1) {
          localLinearLayout2.addView(new View(paramContext), new LinearLayout.LayoutParams(this.h, -1));
        }
        i1 += 1;
      }
      localLinearLayout1.addView(new View(paramContext), new LinearLayout.LayoutParams(-1, this.h));
      n += 1;
    }
    int i1 = arrayOfLinearLayout.length;
    n = i2;
    while (n < i1)
    {
      localLinearLayout2 = arrayOfLinearLayout[n];
      localObject = new ImageView(paramContext);
      ((ImageView)localObject).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, this.j);
      localLayoutParams.topMargin = this.i;
      localLinearLayout2.addView((View)localObject, localLayoutParams);
      localObject = new TextView(paramContext);
      ((TextView)localObject).setTextColor(-10197916);
      ((TextView)localObject).setTextSize(2, 14.0F);
      ((TextView)localObject).setGravity(17);
      localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
      localLayoutParams.weight = 1.0F;
      localLinearLayout2.addView((View)localObject, localLayoutParams);
      n += 1;
    }
    return localLinearLayout1;
  }
  
  private void a(LinearLayout[] paramArrayOfLinearLayout, Object[] paramArrayOfObject)
  {
    int i1 = R.getBitmapRes(this.k.getContext(), "ssdk_oks_classic_platform_cell_back");
    int i2 = R.getBitmapRes(this.k.getContext(), "ssdk_oks_classic_platfrom_cell_back_nor");
    int n = 0;
    if (n < paramArrayOfObject.length)
    {
      ImageView localImageView = (ImageView)R.forceCast(paramArrayOfLinearLayout[n].getChildAt(0));
      TextView localTextView = (TextView)R.forceCast(paramArrayOfLinearLayout[n].getChildAt(1));
      if (paramArrayOfObject[n] == null)
      {
        localImageView.setVisibility(4);
        localTextView.setVisibility(4);
        paramArrayOfLinearLayout[n].setBackgroundResource(i2);
        paramArrayOfLinearLayout[n].setOnClickListener(null);
      }
      for (;;)
      {
        n += 1;
        break;
        localImageView.setVisibility(0);
        localTextView.setVisibility(0);
        paramArrayOfLinearLayout[n].setBackgroundResource(i1);
        paramArrayOfLinearLayout[n].setOnClickListener(this);
        paramArrayOfLinearLayout[n].setTag(paramArrayOfObject[n]);
        Object localObject;
        if ((paramArrayOfObject[n] instanceof a))
        {
          localObject = (a)R.forceCast(paramArrayOfObject[n]);
          if (((a)localObject).b != null) {
            localImageView.setImageBitmap(((a)localObject).b);
          }
          for (;;)
          {
            if (((a)localObject).a == null) {
              break label210;
            }
            localTextView.setText(((a)localObject).a);
            break;
            localImageView.setImageBitmap(null);
          }
          label210:
          localTextView.setText("");
        }
        else
        {
          localObject = ((Platform)R.forceCast(paramArrayOfObject[n])).getName().toLowerCase();
          int i3 = R.getBitmapRes(localImageView.getContext(), "ssdk_oks_classic_" + (String)localObject);
          if (i3 > 0) {
            localImageView.setImageResource(i3);
          }
          for (;;)
          {
            i3 = R.getStringRes(localTextView.getContext(), "ssdk_" + (String)localObject);
            if (i3 <= 0) {
              break label333;
            }
            localTextView.setText(i3);
            break;
            localImageView.setImageBitmap(null);
          }
          label333:
          localTextView.setText("");
        }
      }
    }
  }
  
  public int a()
  {
    return this.d;
  }
  
  protected abstract void a(Context paramContext, ArrayList<Object> paramArrayList);
  
  public void a(f paramf)
  {
    this.l = paramf;
  }
  
  protected abstract void a(ArrayList<Object> paramArrayList);
  
  public int b()
  {
    return this.e;
  }
  
  public int getCount()
  {
    if (this.c == null) {
      return 0;
    }
    return this.c.length;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramView;
    if (paramView == null) {
      localView = a(paramViewGroup.getContext());
    }
    a((LinearLayout[])R.forceCast(((LinearLayout)R.forceCast(localView)).getTag()), this.c[paramInt]);
    return localView;
  }
  
  public void onClick(View paramView)
  {
    long l1 = System.currentTimeMillis();
    if (l1 - this.m < 1000L) {
      return;
    }
    this.m = l1;
    if ((paramView.getTag() instanceof a))
    {
      a locala = (a)R.forceCast(paramView.getTag());
      this.k.a(paramView, locala);
      return;
    }
    paramView = (Platform)R.forceCast(paramView.getTag());
    this.k.d(paramView);
  }
  
  public void onScreenChange(int paramInt1, int paramInt2)
  {
    if (this.l != null)
    {
      this.l.setScreenCount(getCount());
      this.l.a(paramInt1, paramInt2);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/a/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */