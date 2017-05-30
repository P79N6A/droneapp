package com.fimi.soul.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.R.styleable;

public class MidView
  extends View
{
  public static final int c = 1;
  public static final int d = 2;
  private int A;
  float a = 50.0F;
  float b = 50.0F;
  private Bitmap e;
  private Bitmap f;
  private Bitmap g;
  private Bitmap h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private float o;
  private float p;
  private float q;
  private Point r;
  private Point s;
  private Point t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z;
  
  public MidView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MidView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.mycircleView);
    this.u = paramContext.getInteger(0, 0);
    setType(this.u);
    paramContext.recycle();
  }
  
  public MidView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    if ((this.a != paramFloat1) || (this.b != paramFloat2))
    {
      this.o = ((this.i / 2 - this.k / 2) / 50.0F);
      this.a = paramFloat1;
      this.b = paramFloat2;
      invalidate();
    }
  }
  
  public void a(Bitmap... paramVarArgs)
  {
    int i2 = paramVarArgs.length;
    int i1 = 0;
    while (i1 < i2)
    {
      Bitmap localBitmap = paramVarArgs[i1];
      if ((localBitmap != null) && (localBitmap.isRecycled())) {
        localBitmap.recycle();
      }
      i1 += 1;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Paint localPaint = new Paint();
    localPaint.setColor(-1);
    paramCanvas.drawBitmap(this.e, 0.0F, 0.0F, localPaint);
    paramCanvas.drawBitmap(this.g, this.i / 2 - this.m / 2, this.j / 2 - this.n / 2, localPaint);
    this.x = g.a(this.i / 2, this.i / 2, this.a * this.p + this.k, this.b * this.q + this.k);
    if (this.x <= this.y)
    {
      paramCanvas.drawBitmap(this.f, this.a * this.p + this.i / 2 - this.h.getWidth() / 2, this.b * this.q + this.i / 2 - this.h.getHeight() / 2, localPaint);
      return;
    }
    this.s = g.a(this.r, new Point((int)(this.a * this.p + this.k), (int)(this.b * this.q + this.k)), this.y);
    if (this.s.x < this.i / 2 - this.h.getWidth() / 2) {
      this.s.x = (this.i / 2 - this.h.getWidth() / 2);
    }
    if ((this.u == 1) && (this.s.x > this.h.getWidth() - this.k / 2)) {
      this.s.x = (this.h.getWidth() - this.k / 2);
    }
    if (this.s.y < this.i / 2 - this.h.getHeight() / 2) {
      this.s.y = (this.i / 2 - this.h.getHeight() / 2);
    }
    paramCanvas.drawBitmap(this.f, this.s.x, this.s.y, localPaint);
    a(new Bitmap[] { this.e, this.f, this.g, this.h });
  }
  
  public void setType(int paramInt)
  {
    if (paramInt == 1)
    {
      this.e = BitmapFactory.decodeResource(getResources(), 2130838147);
      this.f = BitmapFactory.decodeResource(getResources(), 2130838144);
      this.g = BitmapFactory.decodeResource(getResources(), 2130838145);
      this.h = BitmapFactory.decodeResource(getResources(), 2130837601);
    }
    for (;;)
    {
      this.m = this.g.getWidth();
      this.n = this.g.getHeight();
      this.i = this.e.getWidth();
      this.j = this.e.getHeight();
      this.k = this.f.getWidth();
      this.l = this.f.getHeight();
      this.y = ((int)Math.sqrt(Math.pow(this.h.getWidth() / 2, 2.0D) + Math.pow(this.h.getHeight() / 2, 2.0D)) - this.k / 2);
      this.r = new Point(this.i / 2 - this.k / 2, this.j / 2 - this.k / 2);
      this.z = g.a(this.k / 2, this.l / 2, this.i / 2, this.j / 2);
      this.p = ((this.h.getWidth() / 2 - this.k / 2) / 50.0F);
      this.q = ((this.h.getHeight() / 2 - this.k / 2) / 50.0F);
      return;
      if (paramInt == 2)
      {
        this.e = BitmapFactory.decodeResource(getResources(), 2130837600);
        this.f = BitmapFactory.decodeResource(getResources(), 2130837753);
        this.g = BitmapFactory.decodeResource(getResources(), 2130837755);
        this.h = BitmapFactory.decodeResource(getResources(), 2130838446);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/MidView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */