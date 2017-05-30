package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.List;

public class d
  extends PopupWindow
{
  final Handler a = new Handler();
  Runnable b = new Runnable()
  {
    public void run()
    {
      d.a(d.this);
      if (d.b(d.this) < 0)
      {
        if (d.this.isShowing()) {
          d.this.dismiss();
        }
        return;
      }
      d.this.a.postDelayed(d.this.b, 1000L);
    }
  };
  private LinearLayout c;
  private LinearLayout.LayoutParams d = null;
  private Context e;
  private int f = 2;
  
  public d(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext);
    this.e = paramContext;
    this.d = new LinearLayout.LayoutParams(-2, -2);
    this.d.gravity = 17;
    this.d.topMargin = 10;
    this.c = new LinearLayout(paramContext);
    this.c.setOrientation(1);
    this.c.setGravity(1);
    setContentView(this.c);
    setWidth(-2);
    setHeight(paramInt2);
    setBackgroundDrawable(paramContext.getResources().getDrawable(2130837750));
    getContentView().setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (!paramAnonymousBoolean) {
          d.this.dismiss();
        }
      }
    });
  }
  
  public void a(List<Integer> paramList, View paramView, int paramInt1, int paramInt2)
  {
    if (isShowing())
    {
      dismiss();
      return;
    }
    this.c.removeAllViews();
    Object localObject = new View(this.e);
    ((View)localObject).setLayoutParams(new ViewGroup.LayoutParams(1, 30));
    this.c.addView((View)localObject);
    int i = 0;
    while (i < paramList.size())
    {
      localObject = new TextView(this.e);
      ((TextView)localObject).setTextColor(-1);
      ((TextView)localObject).setSingleLine(true);
      ((TextView)localObject).setText(this.e.getResources().getString(((Integer)paramList.get(i)).intValue()));
      this.d.topMargin = 5;
      this.c.addView((View)localObject, this.d);
      i += 1;
    }
    setHeight(paramList.size() * (int)this.e.getResources().getDimension(2131296493) + 50);
    setFocusable(true);
    showAsDropDown(paramView, paramInt1, paramInt2);
    this.f = 1;
    this.a.postDelayed(this.b, 1000L);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */