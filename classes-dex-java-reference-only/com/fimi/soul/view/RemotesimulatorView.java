package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.soul.utils.g;

public class RemotesimulatorView
  extends View
{
  private Bitmap a;
  private Bitmap b;
  private Bitmap c;
  private float d;
  private float e;
  private float f;
  private float g;
  private float h;
  private float i;
  private float j;
  private int k = 512;
  private RectF l;
  private int m;
  private int n;
  private float o;
  private float p;
  private int q = 8;
  private Context r;
  private int[] s = { Color.parseColor("#00FE5400"), Color.parseColor("#FE5400") };
  private Paint t;
  private int u;
  private int v;
  
  public RemotesimulatorView(Context paramContext)
  {
    super(paramContext);
  }
  
  public RemotesimulatorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.r = paramContext;
    this.a = BitmapFactory.decodeResource(getResources(), 2130838223);
    this.b = BitmapFactory.decodeResource(getResources(), 2130838224);
    this.c = BitmapFactory.decodeResource(getResources(), 2130838221);
    this.q = g.a(paramContext, this.q);
    this.d = this.q;
    this.g = (this.d + this.b.getWidth() / 2 - this.c.getWidth() / 2);
    this.e = (this.a.getHeight() / 2 - this.b.getWidth() / 2);
    this.f = (this.a.getWidth() - this.b.getWidth() - this.d);
    this.i = (this.a.getHeight() / 2 - this.c.getWidth() / 2);
    this.h = (this.a.getWidth() - this.b.getWidth() / 2 - this.d - this.c.getWidth() / 2);
    this.t = new Paint();
    this.t.setAntiAlias(true);
    this.t.setColor(-1);
  }
  
  public RemotesimulatorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public static double a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    paramInt1 = Math.abs((int)(paramFloat1 - paramInt1));
    paramInt2 = Math.abs((int)(paramFloat2 - paramInt2));
    double d1 = Math.sqrt(paramInt1 * paramInt1 + paramInt2 * paramInt2);
    return Math.round((float)(Math.acos(paramInt2 / d1) / 3.141592653589793D * 180.0D));
  }
  
  private void a(Bitmap... paramVarArgs)
  {
    int i2 = paramVarArgs.length;
    int i1 = 0;
    while (i1 < i2)
    {
      Bitmap localBitmap = paramVarArgs[i1];
      if ((localBitmap != null) && (!localBitmap.isRecycled())) {
        localBitmap.recycle();
      }
      i1 += 1;
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    double d1 = 0.0D;
    int i2;
    int i1;
    if ((paramInt2 <= this.k) && (paramInt4 >= this.k))
    {
      i2 = (int)Math.sqrt(Math.pow(paramInt4 - this.k, 2.0D) + Math.pow(this.k - paramInt2, 2.0D));
      i1 = i2;
      if (i2 != 0)
      {
        d1 = a(0.0F, 0.0F, paramInt4 - this.k, this.k - paramInt2);
        i1 = i2;
      }
      paramInt2 = i1;
      if (i1 > this.k) {
        paramInt2 = this.k;
      }
      this.m = paramInt2;
      this.o = ((float)d1);
      d1 = 0.0D;
      if ((paramInt3 > this.k) || (paramInt1 < this.k)) {
        break label487;
      }
      paramInt4 = (int)Math.sqrt(Math.pow(paramInt1 - this.k, 2.0D) + Math.pow(this.k - paramInt3, 2.0D));
      paramInt2 = paramInt4;
      if (paramInt4 != 0)
      {
        d1 = -a(0.0F, 0.0F, paramInt1 - this.k, this.k - paramInt3);
        paramInt2 = paramInt4;
      }
    }
    for (;;)
    {
      paramInt1 = paramInt2;
      if (paramInt2 > this.k) {
        paramInt1 = this.k;
      }
      this.n = paramInt1;
      this.p = ((float)d1);
      invalidate();
      return;
      if ((paramInt2 <= this.k) && (paramInt4 < this.k))
      {
        i2 = (int)Math.sqrt(Math.pow(this.k - paramInt4, 2.0D) + Math.pow(this.k - paramInt2, 2.0D));
        i1 = i2;
        if (i2 == 0) {
          break;
        }
        d1 = 360.0D - a(0.0F, 0.0F, this.k - paramInt4, this.k - paramInt2);
        i1 = i2;
        break;
      }
      if ((paramInt2 > this.k) && (paramInt4 >= this.k))
      {
        i2 = (int)Math.sqrt(Math.pow(paramInt4 - this.k, 2.0D) + Math.pow(paramInt2 - this.k, 2.0D));
        i1 = i2;
        if (i2 == 0) {
          break;
        }
        d1 = 180.0D - a(0.0F, 0.0F, paramInt4 - this.k, paramInt2 - this.k);
        i1 = i2;
        break;
      }
      i2 = (int)Math.sqrt(Math.pow(this.k - paramInt4, 2.0D) + Math.pow(paramInt2 - this.k, 2.0D));
      i1 = i2;
      if (i2 == 0) {
        break;
      }
      d1 = 180.0D + a(0.0F, 0.0F, this.k - paramInt4, paramInt2 - this.k);
      i1 = i2;
      break;
      label487:
      if ((paramInt3 <= this.k) && (paramInt1 < this.k))
      {
        paramInt4 = (int)Math.sqrt(Math.pow(this.k - paramInt1, 2.0D) + Math.pow(this.k - paramInt3, 2.0D));
        paramInt2 = paramInt4;
        if (paramInt4 != 0)
        {
          d1 = a(0.0F, 0.0F, this.k - paramInt1, this.k - paramInt3);
          paramInt2 = paramInt4;
        }
      }
      else if ((paramInt3 > this.k) && (paramInt1 >= this.k))
      {
        paramInt4 = (int)Math.sqrt(Math.pow(paramInt1 - this.k, 2.0D) + Math.pow(paramInt3 - this.k, 2.0D));
        paramInt2 = paramInt4;
        if (paramInt4 != 0)
        {
          d1 = 180.0D + a(0.0F, 0.0F, paramInt1 - this.k, paramInt3 - this.k);
          paramInt2 = paramInt4;
        }
      }
      else
      {
        paramInt4 = (int)Math.sqrt(Math.pow(this.k - paramInt1, 2.0D) + Math.pow(paramInt3 - this.k, 2.0D));
        paramInt2 = paramInt4;
        if (paramInt4 != 0)
        {
          d1 = 180.0D + a(0.0F, 0.0F, this.k - paramInt1, paramInt3 - this.k);
          paramInt2 = paramInt4;
        }
      }
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.j = ((float)(getHeight() * 0.06111D / this.k));
    this.u = ((int)(getHeight() * 0.74074D));
    this.v = ((int)(getWidth() * 0.73229D));
    paramCanvas.drawBitmap(this.a, this.v, this.u, this.t);
    paramCanvas.drawBitmap(this.b, this.d + this.v, this.e + this.u, this.t);
    paramCanvas.drawBitmap(this.b, this.f + this.v, this.e + this.u, this.t);
    this.t.setColor(Color.parseColor("#FE5400"));
    this.t.setShader(new LinearGradient(this.g + this.v, this.a.getHeight() / 2 + this.u, this.g + this.c.getWidth() + this.v, this.a.getHeight() / 2 - this.m * this.j + this.u, this.s, null, Shader.TileMode.MIRROR));
    this.l = new RectF(this.g + this.v, this.a.getHeight() / 2 - this.m * this.j + this.u, this.g + this.c.getWidth() + this.v, this.a.getHeight() / 2 + this.u);
    Matrix localMatrix = new Matrix();
    localMatrix.postRotate(this.o, this.g + this.c.getWidth() / 2 + this.v, this.i + this.c.getWidth() / 2 + this.u);
    paramCanvas.setMatrix(localMatrix);
    paramCanvas.drawRoundRect(this.l, this.c.getWidth() / 2, this.c.getWidth() / 2, this.t);
    localMatrix.setRotate(0.0F);
    paramCanvas.setMatrix(localMatrix);
    this.t.setShader(new LinearGradient(this.h + this.v, this.a.getHeight() / 2 + this.u, this.h + this.c.getWidth() + this.v, this.a.getHeight() / 2 - this.n * this.j + this.u, this.s, null, Shader.TileMode.MIRROR));
    this.l = new RectF(this.h + this.v, this.a.getHeight() / 2 - this.n * this.j + this.u, this.h + this.c.getWidth() + this.v, this.a.getHeight() / 2 + this.u);
    localMatrix.postRotate(this.p, this.h + this.c.getWidth() / 2 + this.v, this.i + this.c.getWidth() / 2 + this.u);
    paramCanvas.setMatrix(localMatrix);
    paramCanvas.drawRoundRect(this.l, this.c.getWidth() / 2, this.c.getWidth() / 2, this.t);
    localMatrix.setRotate(0.0F);
    paramCanvas.setMatrix(localMatrix);
    paramCanvas.drawBitmap(this.c, this.g + this.v, this.i + this.u, this.t);
    paramCanvas.drawBitmap(this.c, this.h + this.v, this.i + this.u, this.t);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/RemotesimulatorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */