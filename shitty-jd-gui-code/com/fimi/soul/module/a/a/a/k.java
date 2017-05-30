package com.fimi.soul.module.a.a.a;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;

public class k
  extends ImageView
{
  private float a;
  
  public k(Context paramContext)
  {
    super(paramContext);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.rotate(this.a, getWidth() / 2, getHeight() / 2);
    super.onDraw(paramCanvas);
  }
  
  public void setRotation(float paramFloat)
  {
    this.a = paramFloat;
    invalidate();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/a/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */