package com.fimi.soul.view.titlebar;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import com.fimi.kernel.utils.p;

public class FmBottomBar
  extends LinearLayout
{
  public int a = 2;
  public LayoutInflater b;
  public int c = 320;
  private Activity d;
  private PopupWindow e;
  private WindowManager f = null;
  
  public FmBottomBar(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public FmBottomBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  private void a(View paramView1, View paramView2, boolean paramBoolean)
  {
    p.a(paramView2);
    int i = paramView1.getMeasuredWidth();
    if (paramView2.getMeasuredWidth() > paramView1.getMeasuredWidth()) {
      i = paramView2.getMeasuredWidth();
    }
    int k = getMeasuredHeight();
    int j;
    if (paramBoolean)
    {
      this.e = new PopupWindow(paramView2, i, -2, true);
      paramView2 = new int[2];
      paramView1.getLocationInWindow(paramView2);
      j = paramView2[0] - paramView1.getLeft();
      if (j + i < this.c) {
        break label164;
      }
    }
    label164:
    for (i = this.c - i - 2;; i = j)
    {
      this.e.setFocusable(true);
      this.e.setOutsideTouchable(true);
      this.e.setBackgroundDrawable(new ColorDrawable(17170445));
      this.e.showAtLocation(paramView1, 83, i, k + 2);
      return;
      this.e = new PopupWindow(paramView2, -1, -2, true);
      break;
    }
  }
  
  public void a(Context paramContext)
  {
    this.d = ((Activity)paramContext);
    setOrientation(0);
    setId(this.a);
    setPadding(0, 0, 0, 0);
    this.b = LayoutInflater.from(paramContext);
    this.f = this.d.getWindowManager();
    this.c = this.f.getDefaultDisplay().getWidth();
  }
  
  public void a(final View paramView1, final View paramView2)
  {
    if ((paramView1 == null) || (paramView2 == null)) {
      return;
    }
    paramView1.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        FmBottomBar.a(FmBottomBar.this, paramView1, paramView2, true);
      }
    });
  }
  
  public void setBottomBarBackground(int paramInt)
  {
    setBackgroundResource(paramInt);
  }
  
  public void setBottomBarBackgroundColor(int paramInt)
  {
    setBackgroundColor(paramInt);
  }
  
  public void setBottomBarBackgroundDrawable(Drawable paramDrawable)
  {
    setBackgroundDrawable(paramDrawable);
  }
  
  public void setBottomView(int paramInt)
  {
    setBottomView(this.b.inflate(paramInt, null));
  }
  
  public void setBottomView(View paramView)
  {
    removeAllViews();
    addView(paramView, new LinearLayout.LayoutParams(-1, -2));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/titlebar/FmBottomBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */