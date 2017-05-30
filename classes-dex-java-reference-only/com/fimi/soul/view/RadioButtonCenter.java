package com.fimi.soul.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.fimi.overseas.soul.R.styleable;

public class RadioButtonCenter
  extends RadioButton
{
  private Drawable a;
  
  public RadioButtonCenter(Context paramContext)
  {
    super(paramContext);
  }
  
  public RadioButtonCenter(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public RadioButtonCenter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.RadioButtonCenter, paramInt, 0);
    try
    {
      this.a = paramContext.getDrawable(0);
      paramContext.recycle();
      setButtonDrawable(17170445);
      return;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int k;
    int j;
    int i;
    if (this.a != null)
    {
      this.a.setState(getDrawableState());
      k = getGravity();
      j = this.a.getIntrinsicHeight();
      i = 0;
      switch (k & 0x70)
      {
      }
    }
    for (;;)
    {
      k = this.a.getIntrinsicWidth();
      int m = (getWidth() - k) / 2;
      this.a.setBounds(m, i, k + m, j + i);
      this.a.draw(paramCanvas);
      return;
      i = getHeight() - j;
      continue;
      i = (getHeight() - j) / 2;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/RadioButtonCenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */