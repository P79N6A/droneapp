package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;

public class SettableDrawable
  extends ForwardingDrawable
{
  public SettableDrawable(Drawable paramDrawable)
  {
    super((Drawable)Preconditions.checkNotNull(paramDrawable));
  }
  
  public Drawable getDrawable()
  {
    return getCurrent();
  }
  
  public void setDrawable(Drawable paramDrawable)
  {
    Preconditions.checkNotNull(paramDrawable);
    setCurrent(paramDrawable);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/drawee/drawable/SettableDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */