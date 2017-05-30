package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

public class WriteCamera9Grid
  extends View
{
  private Paint a;
  private float b;
  private float c;
  private int d;
  private int e;
  
  public WriteCamera9Grid(Context paramContext)
  {
    super(paramContext);
  }
  
  public WriteCamera9Grid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public WriteCamera9Grid(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a()
  {
    this.a = new Paint();
    this.a.setColor(getResources().getColor(2131624291));
    this.a.setAlpha(153);
    this.a.setStrokeWidth(1.0F);
    this.a.setAntiAlias(true);
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    this.b = localDisplayMetrics.widthPixels;
    this.c = localDisplayMetrics.heightPixels;
    this.d = ((int)(this.b / 3.0F));
    this.e = ((int)(this.c / 3.0F));
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawLine(0.0F, this.e, this.b, this.e, this.a);
    paramCanvas.drawLine(0.0F, this.e * 2, this.b, this.e * 2, this.a);
    paramCanvas.drawLine(this.d, 0.0F, this.d, this.c, this.a);
    paramCanvas.drawLine(this.d * 2, 0.0F, this.d * 2, this.c, this.a);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/WriteCamera9Grid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */