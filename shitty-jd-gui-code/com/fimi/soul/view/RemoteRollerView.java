package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.kernel.utils.p;

public class RemoteRollerView
  extends View
{
  private static final float A = 0.1718F;
  private static final float B = 0.35F;
  private static final float C = 0.522F;
  private static final int D = 21;
  private static final int E = 22;
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  public static final int e = 51;
  public static final int f = 1;
  public static final int g = 50;
  private static final int m = -14671840;
  private static final float w = 0.2229F;
  private static final float x = 0.3851F;
  private static final float y = 0.175F;
  private static final float z = 0.4685F;
  private Bitmap h;
  private Bitmap i;
  private Bitmap j;
  private Bitmap k;
  private Paint l;
  private int n = 0;
  private RectF o;
  private RectF p;
  private Bitmap q;
  private int r = 0;
  private float s = 0.0F;
  private float t;
  private float u;
  private Context v;
  
  public RemoteRollerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public RemoteRollerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    this.v = paramContext;
    this.h = BitmapFactory.decodeResource(getResources(), 2130837588);
    this.i = BitmapFactory.decodeResource(getResources(), 2130837586);
    this.j = BitmapFactory.decodeResource(getResources(), 2130837593);
    this.k = BitmapFactory.decodeResource(getResources(), 2130837591);
    this.l = new Paint();
    this.l.setAntiAlias(true);
    this.l.setColor(-14671840);
    this.l.setStrokeWidth(p.b(paramContext) * 0.092F);
    this.l.setStyle(Paint.Style.STROKE);
    setLayerType(2, this.l);
  }
  
  public RemoteRollerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void a(int paramInt, Canvas paramCanvas)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      paramCanvas.drawBitmap(this.h, getWidth() * 0.2229F, getHeight() * 0.3851F, this.l);
      this.o = new RectF(getWidth() * 0.1718F, getHeight() * 0.35F, getWidth() * 0.1718F + this.u, getHeight() * 0.35F + this.u);
      this.p = new RectF(getWidth() * 0.2229F, getHeight() * 0.3851F, getWidth() * 0.2229F + this.h.getWidth(), getHeight() * 0.3851F + this.h.getHeight());
      this.r = 226;
      this.s = ((this.t - 50.0F) / 50.0F * 21.0F);
      return;
    case 1: 
      paramCanvas.drawBitmap(this.i, getWidth() * 0.175F, getHeight() * 0.4685F, this.l);
      this.o = new RectF(getWidth() * 0.1718F, getHeight() * 0.35F, getWidth() * 0.1718F + this.u, getHeight() * 0.35F + this.u);
      this.p = new RectF(getWidth() * 0.175F, getHeight() * 0.4685F, getWidth() * 0.175F + this.i.getWidth(), getHeight() * 0.4685F + this.i.getHeight());
      this.r = 215;
      this.s = (-this.t / 50.0F * 22.0F);
      return;
    case 2: 
      paramCanvas.drawBitmap(this.j, getWidth() - this.j.getWidth() - getWidth() * 0.2229F, getHeight() * 0.3851F, this.l);
      this.o = new RectF(getWidth() - getWidth() * 0.1718F - this.u, getHeight() * 0.35F, getWidth() - getWidth() * 0.1718F, getHeight() * 0.35F + this.u);
      this.p = new RectF(getWidth() - this.j.getWidth() - getWidth() * 0.2229F, getHeight() * 0.3851F, getWidth() - getWidth() * 0.2229F, getHeight() * 0.3851F + this.h.getHeight());
      this.r = 314;
      this.s = (-(this.t - 50.0F) / 50.0F * 21.0F);
      return;
    }
    paramCanvas.drawBitmap(this.k, getWidth() - this.k.getWidth() - getWidth() * 0.175F, getHeight() * 0.4685F, this.l);
    this.o = new RectF(getWidth() - getWidth() * 0.1718F - this.u, getHeight() * 0.35F, getWidth() - getWidth() * 0.1718F, getHeight() * 0.35F + this.u);
    this.p = new RectF(getWidth() - this.k.getWidth() - getWidth() * 0.175F, getHeight() * 0.4685F, getWidth() - getWidth() * 0.175F, getHeight() * 0.4685F + this.k.getHeight());
    this.r = 325;
    this.s = (this.t / 50.0F * 22.0F);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    a(this.n, paramCanvas);
    paramCanvas.drawArc(this.o, this.r, this.s, false, this.l);
    this.l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    paramCanvas.drawBitmap(this.q, null, this.p, this.l);
    this.l.setXfermode(null);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.u = (p.b(this.v) * 0.522F);
  }
  
  public void setInitView(int paramInt)
  {
    this.n = paramInt;
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.q = BitmapFactory.decodeResource(getResources(), 2130837589);
      return;
    case 1: 
      this.q = BitmapFactory.decodeResource(getResources(), 2130837587);
      return;
    case 2: 
      this.q = BitmapFactory.decodeResource(getResources(), 2130837594);
      return;
    }
    this.q = BitmapFactory.decodeResource(getResources(), 2130837592);
  }
  
  public void setSweep(float paramFloat)
  {
    this.t = paramFloat;
    invalidate();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/RemoteRollerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */