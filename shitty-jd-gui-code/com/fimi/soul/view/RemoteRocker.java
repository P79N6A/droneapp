package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class RemoteRocker
  extends View
{
  private static final float h = 0.2373F;
  private static final float i = 0.228F;
  private Paint a;
  private Bitmap b;
  private Paint c;
  private RectF d;
  private RectF e;
  private RectF f;
  private RectF g;
  private float j = -90.0F;
  private a k;
  private float l = 0.0F;
  private float m = 0.0F;
  private float n = 0.0F;
  private float o = 0.0F;
  
  public RemoteRocker(Context paramContext)
  {
    super(paramContext);
    b();
  }
  
  public RemoteRocker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
  }
  
  public RemoteRocker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    b();
  }
  
  private void b()
  {
    this.a = new Paint();
    this.c = new Paint();
  }
  
  public void a()
  {
    if (this.b != null)
    {
      this.b.recycle();
      this.b = null;
      System.gc();
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    RectF localRectF = new RectF(0.0F, 0.0F, getWidth(), getHeight());
    if (this.b == null) {
      setRemoteRocker(this.k);
    }
    paramCanvas.drawBitmap(this.b, null, localRectF, this.a);
    paramCanvas.drawArc(this.d, this.j, this.l, false, this.c);
    paramCanvas.drawArc(this.e, this.j, this.m, false, this.c);
    paramCanvas.drawArc(this.f, this.j, this.o, false, this.c);
    paramCanvas.drawArc(this.g, this.j, this.n, false, this.c);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.c.setStrokeWidth(getWidth() * 0.0046499968F);
    this.c.setColor(-14172853);
    this.c.setAntiAlias(true);
    this.c.setStyle(Paint.Style.STROKE);
    this.d = new RectF(getWidth() / 2 - getWidth() * 0.228F / 2.0F, getWidth() * 0.0092999935F / 2.0F, getWidth() / 2 + getWidth() * 0.228F / 2.0F, getWidth() * 0.23265F);
    this.e = new RectF(getWidth() * 0.0092999935F / 2.0F, getWidth() / 2 - getWidth() * 0.228F / 2.0F, getWidth() * 0.23265F, getWidth() / 2.0F + getWidth() * 0.228F / 2.0F);
    this.f = new RectF(getWidth() - getWidth() * 0.23265F, getWidth() / 2 - getWidth() * 0.228F / 2.0F, getWidth() - getWidth() * 0.0046499968F, getWidth() / 2.0F + getWidth() * 0.228F / 2.0F);
    this.g = new RectF(getWidth() / 2 - getWidth() * 0.228F / 2.0F, getWidth() - getWidth() * 0.23265F, getWidth() / 2 + getWidth() * 0.228F / 2.0F, getWidth() - getWidth() * 0.0092999935F / 2.0F);
  }
  
  public void setBottomSweepAngle(float paramFloat)
  {
    this.o = paramFloat;
    if (this.m < 360.0F) {
      this.m = 0.0F;
    }
    if (this.n < 360.0F) {
      this.n = 0.0F;
    }
    if (this.l < 360.0F) {
      this.l = 0.0F;
    }
    invalidate();
  }
  
  public void setLeftSweepAngle(float paramFloat)
  {
    this.m = paramFloat;
    if (this.l < 360.0F) {
      this.l = 0.0F;
    }
    if (this.n < 360.0F) {
      this.n = 0.0F;
    }
    if (this.o < 360.0F) {
      this.o = 0.0F;
    }
    invalidate();
  }
  
  public void setRemoteRocker(a parama)
  {
    this.k = parama;
    switch (1.a[parama.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.b = BitmapFactory.decodeResource(getResources(), 2130838315);
      return;
    }
    this.b = BitmapFactory.decodeResource(getResources(), 2130838317);
  }
  
  public void setRightSweepAngle(float paramFloat)
  {
    this.n = paramFloat;
    if (this.m < 360.0F) {
      this.m = 0.0F;
    }
    if (this.l < 360.0F) {
      this.l = 0.0F;
    }
    if (this.o < 360.0F) {
      this.o = 0.0F;
    }
    invalidate();
  }
  
  public void setTopSweepAngle(float paramFloat)
  {
    this.l = paramFloat;
    if (this.m < 360.0F) {
      this.m = 0.0F;
    }
    if (this.n < 360.0F) {
      this.n = 0.0F;
    }
    if (this.o < 360.0F) {
      this.o = 0.0F;
    }
    invalidate();
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/RemoteRocker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */