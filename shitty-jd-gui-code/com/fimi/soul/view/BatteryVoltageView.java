package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class BatteryVoltageView
  extends View
{
  private static final int m = Color.parseColor("#19ffffff");
  private static final int n = Color.parseColor("#222225");
  private static final int o = Color.parseColor("#30b0e5");
  private Context a;
  private Paint b;
  private RectF c;
  private Paint d;
  private RectF e;
  private Bitmap f;
  private Bitmap g;
  private Bitmap h;
  private Bitmap i;
  private int j = 0;
  private boolean k = false;
  private a l = a.a;
  
  public BatteryVoltageView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public BatteryVoltageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public BatteryVoltageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private Bitmap a()
  {
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    Bitmap localBitmap = Bitmap.createBitmap(this.g.getWidth(), this.g.getHeight(), Bitmap.Config.ARGB_8888);
    int i1 = (int)(8.0F + (this.g.getHeight() - 10 - this.j / 100.0F * (this.g.getHeight() - 10)));
    Canvas localCanvas = new Canvas(localBitmap);
    if (this.l == a.a) {
      localCanvas.drawBitmap(this.g, 0.0F, 0.0F, localPaint);
    }
    for (;;)
    {
      localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      localPaint.setColor(n);
      localCanvas.drawRect(0.0F, 0.0F, getWidth(), i1, localPaint);
      return localBitmap;
      if (this.l == a.b) {
        localCanvas.drawBitmap(this.h, 0.0F, 0.0F, localPaint);
      } else {
        localCanvas.drawBitmap(this.i, 0.0F, 0.0F, localPaint);
      }
    }
  }
  
  public void a(Context paramContext)
  {
    this.a = paramContext;
    this.b = new Paint();
    this.b.setAntiAlias(true);
    this.c = new RectF();
    this.d = new Paint();
    this.f = BitmapFactory.decodeResource(getResources(), 2130838194);
    this.g = BitmapFactory.decodeResource(getResources(), 2130838193);
    this.h = BitmapFactory.decodeResource(getResources(), 2130838195);
    this.i = BitmapFactory.decodeResource(getResources(), 2130838196);
  }
  
  public void a(a parama)
  {
    this.l = parama;
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawBitmap(this.f, 0.0F, 0.0F, this.b);
    paramCanvas.drawBitmap(a(), 0.0F, 0.0F, this.b);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(this.g.getWidth(), this.g.getHeight());
  }
  
  public void setPercent(int paramInt)
  {
    this.j = paramInt;
    invalidate();
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/BatteryVoltageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */