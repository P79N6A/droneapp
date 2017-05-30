package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class MediaImageLoadingView
  extends View
{
  private Paint a;
  private float b;
  
  public MediaImageLoadingView(Context paramContext)
  {
    this(paramContext, null);
    c();
  }
  
  public MediaImageLoadingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    c();
  }
  
  public MediaImageLoadingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    c();
  }
  
  private void c()
  {
    setBackgroundResource(2130837894);
    this.a = new Paint();
    this.a.setAntiAlias(true);
    this.a.setStrokeWidth(2.0F);
    this.a.setStyle(Paint.Style.STROKE);
  }
  
  public void a()
  {
    this.a.setColor(getResources().getColor(2131624133));
    invalidate();
  }
  
  public void b()
  {
    this.a.setColor(getResources().getColor(2131624134));
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawArc(new RectF(2.0F, 2.0F, getWidth() - 2, getWidth() - 2), -90.0F, this.b, false, this.a);
  }
  
  public void setPaintColor(int paramInt)
  {
    this.a.setColor(paramInt);
  }
  
  public void setSweepAngle(float paramFloat)
  {
    this.b = (3.6F * paramFloat);
    invalidate();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/MediaImageLoadingView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */