package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class KeyboardRelativeLayout
  extends RelativeLayout
{
  public static final byte a = -4;
  private static final String b = KeyboardRelativeLayout.class.getSimpleName();
  private a c;
  
  public KeyboardRelativeLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public KeyboardRelativeLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public KeyboardRelativeLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected boolean fitSystemWindows(Rect paramRect)
  {
    paramRect.top = 0;
    return super.fitSystemWindows(paramRect);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.c != null) {
      this.c.a(-4);
    }
  }
  
  public void setOnKeyboardStateChangedListener(a parama)
  {
    this.c = parama;
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/KeyboardRelativeLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */