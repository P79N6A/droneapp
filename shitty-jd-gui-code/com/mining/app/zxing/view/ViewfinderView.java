package com.mining.app.zxing.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.zxing.ResultPoint;
import com.mining.app.zxing.a.c;
import java.util.Collection;
import java.util.HashSet;

public final class ViewfinderView
  extends View
{
  private static final int[] b = { 0, 64, 128, 192, 255, 192, 128, 64 };
  private static final String c = "log";
  private static final long d = 10L;
  private static final int e = 255;
  private static final int g = 10;
  private static final int h = 6;
  private static final int i = 2;
  private static final int j = 2;
  private static float k = 0.0F;
  private static final int l = 16;
  private static final int m = 30;
  boolean a;
  private int f;
  private Paint n;
  private int o;
  private int p;
  private Bitmap q;
  private final int r;
  private final int s;
  private final int t;
  private Collection<ResultPoint> u;
  private Collection<ResultPoint> v;
  private int w;
  private int x;
  private Paint y;
  private int z;
  
  public ViewfinderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    k = paramContext.getResources().getDisplayMetrics().density;
    this.f = ((int)(20.0F * k));
    this.n = new Paint();
    paramContext = getResources();
    this.r = paramContext.getColor(2131624274);
    this.s = paramContext.getColor(2131624208);
    this.w = paramContext.getColor(2131624273);
    this.z = paramContext.getColor(2131624106);
    this.t = paramContext.getColor(2131624194);
    this.u = new HashSet(5);
    this.y = new Paint();
    this.y.setStyle(Paint.Style.STROKE);
    this.y.setColor(this.z);
    int i1 = (int)(4.0F * k / 3.0F);
    this.y.setStrokeWidth(i1);
    this.n.setStrokeWidth(i1);
  }
  
  public void a()
  {
    this.q = null;
    invalidate();
  }
  
  public void a(Bitmap paramBitmap)
  {
    this.q = paramBitmap;
    invalidate();
  }
  
  public void a(ResultPoint paramResultPoint)
  {
    this.u.add(paramResultPoint);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    Rect localRect = c.a().e();
    if (localRect == null) {
      return;
    }
    if (!this.a)
    {
      this.a = true;
      this.o = localRect.top;
      this.p = localRect.bottom;
    }
    int i2 = paramCanvas.getWidth();
    int i3 = paramCanvas.getHeight();
    Paint localPaint = this.n;
    if (this.q != null) {}
    for (int i1 = this.s;; i1 = this.r)
    {
      localPaint.setColor(i1);
      paramCanvas.drawRect(0.0F, 0.0F, i2, localRect.top, this.n);
      paramCanvas.drawRect(0.0F, localRect.top, localRect.left, localRect.bottom + 1, this.n);
      paramCanvas.drawRect(localRect.right + 1, localRect.top, i2, localRect.bottom + 1, this.n);
      paramCanvas.drawRect(0.0F, localRect.bottom + 1, i2, i3, this.n);
      paramCanvas.drawRect(localRect.left, localRect.top, localRect.right, localRect.bottom, this.y);
      if (this.q == null) {
        break;
      }
      this.n.setAlpha(255);
      paramCanvas.drawBitmap(this.q, localRect.left, localRect.top, this.n);
      return;
    }
    this.o += 2;
    if (this.o >= localRect.bottom) {
      this.o = localRect.top;
    }
    this.n.setColor(this.w);
    paramCanvas.drawRect(localRect.left + 2, this.o - 3, localRect.right - 2, this.o + 3, this.n);
    postInvalidateDelayed(10L, localRect.left, localRect.top, localRect.right, localRect.bottom);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/mining/app/zxing/view/ViewfinderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */