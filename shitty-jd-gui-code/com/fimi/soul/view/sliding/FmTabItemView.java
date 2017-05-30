package com.fimi.soul.view.sliding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.fimi.kernel.utils.p;

public class FmTabItemView
  extends LinearLayout
{
  private Context a;
  private int b;
  private TextView c;
  private Drawable d;
  private Drawable e;
  private Drawable f;
  private Drawable g;
  private int h;
  private int i;
  private int j;
  private int k;
  
  public FmTabItemView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public FmTabItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(0);
    setGravity(17);
    setPadding(10, 10, 10, 10);
    this.a = paramContext;
    this.c = new TextView(paramContext);
    this.c.setGravity(17);
    this.c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    this.c.setFocusable(true);
    this.c.setPadding(0, 0, 0, 0);
    this.c.setCompoundDrawablePadding(10);
    this.c.setSingleLine();
    addView(this.c);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.h = p.e(this.a, paramInt1);
    this.i = p.e(this.a, paramInt2);
    this.j = p.e(this.a, paramInt3);
    this.k = p.e(this.a, paramInt4);
  }
  
  public void a(int paramInt, String paramString)
  {
    this.b = paramInt;
    this.c.setText(paramString);
  }
  
  public void a(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    this.d = paramDrawable1;
    this.e = paramDrawable2;
    this.f = paramDrawable3;
    this.g = paramDrawable4;
    if (this.d != null) {
      this.d.setBounds(this.h, this.i, this.j, this.k);
    }
    if (this.e != null) {
      this.e.setBounds(this.h, this.i, this.j, this.k);
    }
    if (this.f != null) {
      this.f.setBounds(this.h, this.i, this.j, this.k);
    }
    if (this.g != null) {
      this.g.setBounds(this.h, this.i, this.j, this.k);
    }
    this.c.setCompoundDrawables(this.d, this.e, this.f, this.g);
  }
  
  public int getIndex()
  {
    return this.b;
  }
  
  public TextView getTextView()
  {
    return this.c;
  }
  
  public void setTabBackgroundDrawable(Drawable paramDrawable)
  {
    setBackgroundDrawable(paramDrawable);
  }
  
  public void setTabBackgroundResource(int paramInt)
  {
    setBackgroundResource(paramInt);
  }
  
  public void setTabTextColor(int paramInt)
  {
    this.c.setTextColor(paramInt);
  }
  
  public void setTabTextSize(int paramInt)
  {
    p.b(this.c, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/sliding/FmTabItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */