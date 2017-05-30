package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

public class MyRadioButton
  extends RadioButton
{
  private Context a;
  private Drawable b;
  private int c;
  
  public MyRadioButton(Context paramContext)
  {
    super(paramContext);
    this.a = paramContext;
  }
  
  public MyRadioButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Drawable localDrawable = this.b;
    int m;
    int j;
    int k;
    int i;
    if (localDrawable != null)
    {
      m = getGravity();
      j = localDrawable.getIntrinsicHeight();
      k = localDrawable.getIntrinsicWidth();
      i = 0;
      switch (m & 0x11)
      {
      }
    }
    for (;;)
    {
      m = (getWidth() - k) / 2;
      localDrawable.setBounds(m, i, k + m, j + i);
      localDrawable.draw(paramCanvas);
      return;
      i = getHeight() - j;
      continue;
      i = (getHeight() - j) / 2;
    }
  }
  
  public void setButtonDrawable(int paramInt)
  {
    if ((paramInt != 0) && (paramInt == this.c)) {
      return;
    }
    this.c = paramInt;
    Drawable localDrawable = null;
    if (this.c != 0) {
      localDrawable = getResources().getDrawable(this.c);
    }
    setButtonDrawable(localDrawable);
  }
  
  public void setButtonDrawable(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      if (this.b != null)
      {
        this.b.setCallback(null);
        unscheduleDrawable(this.b);
      }
      paramDrawable.setCallback(this);
      paramDrawable.setState(getDrawableState());
      if (getVisibility() != 0) {
        break label87;
      }
    }
    label87:
    for (boolean bool = true;; bool = false)
    {
      paramDrawable.setVisible(bool, false);
      this.b = paramDrawable;
      this.b.setState(null);
      setMinHeight(this.b.getIntrinsicHeight());
      refreshDrawableState();
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/MyRadioButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */