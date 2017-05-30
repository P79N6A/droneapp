package com.fimi.soul.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.List;

public class h
  extends Drawable
{
  private final List<Drawable> a;
  
  public h(List<Drawable> paramList)
  {
    this.a = paramList;
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.a.size() == 1)
    {
      ((Drawable)this.a.get(0)).draw(paramCanvas);
      return;
    }
    int i = getBounds().width();
    int j = getBounds().height();
    paramCanvas.save();
    paramCanvas.clipRect(0, 0, i, j);
    if ((this.a.size() == 2) || (this.a.size() == 3))
    {
      paramCanvas.save();
      paramCanvas.clipRect(0, 0, i / 2, j);
      paramCanvas.translate(-i / 4, 0.0F);
      ((Drawable)this.a.get(0)).draw(paramCanvas);
      paramCanvas.restore();
    }
    if (this.a.size() == 2)
    {
      paramCanvas.save();
      paramCanvas.clipRect(i / 2, 0, i, j);
      paramCanvas.translate(i / 4, 0.0F);
      ((Drawable)this.a.get(1)).draw(paramCanvas);
      paramCanvas.restore();
    }
    for (;;)
    {
      if (this.a.size() >= 4)
      {
        paramCanvas.save();
        paramCanvas.scale(0.5F, 0.5F);
        ((Drawable)this.a.get(0)).draw(paramCanvas);
        paramCanvas.translate(0.0F, j);
        ((Drawable)this.a.get(3)).draw(paramCanvas);
        paramCanvas.restore();
      }
      paramCanvas.restore();
      return;
      paramCanvas.save();
      paramCanvas.scale(0.5F, 0.5F);
      paramCanvas.translate(i, 0.0F);
      ((Drawable)this.a.get(1)).draw(paramCanvas);
      paramCanvas.translate(0.0F, j);
      ((Drawable)this.a.get(2)).draw(paramCanvas);
      paramCanvas.restore();
    }
  }
  
  public int getOpacity()
  {
    return 0;
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */