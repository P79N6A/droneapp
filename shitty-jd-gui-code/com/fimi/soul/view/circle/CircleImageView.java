package com.fimi.soul.view.circle;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.fimi.overseas.soul.R.styleable;
import com.fimi.soul.base.a;

public class CircleImageView
  extends ImageView
{
  private static final ImageView.ScaleType a = ImageView.ScaleType.CENTER_CROP;
  private static final Bitmap.Config b = Bitmap.Config.ARGB_8888;
  private static final int c = 2;
  private static final int d = 0;
  private static final int e = -16777216;
  private final RectF f = new RectF();
  private final RectF g = new RectF();
  private final Matrix h = new Matrix();
  private final Paint i = new Paint();
  private final Paint j = new Paint();
  private int k = -16777216;
  private int l = 0;
  private Bitmap m;
  private BitmapShader n;
  private int o;
  private int p;
  private float q;
  private float r;
  private boolean s;
  private boolean t;
  
  public CircleImageView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public CircleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CircleImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CircleImageView, paramInt, 0);
    this.l = paramContext.getDimensionPixelSize(0, 0);
    this.k = paramContext.getColor(1, -16777216);
    paramContext.recycle();
    a();
  }
  
  private Bitmap a(Drawable paramDrawable)
  {
    a.a((paramDrawable instanceof BitmapDrawable) + "|drawable=" + paramDrawable, CircleImageView.class);
    if (paramDrawable == null) {
      return BitmapFactory.decodeResource(getResources(), 2130837868);
    }
    if ((paramDrawable instanceof BitmapDrawable)) {
      return ((BitmapDrawable)paramDrawable).getBitmap();
    }
    for (;;)
    {
      try
      {
        if ((paramDrawable instanceof ColorDrawable))
        {
          localBitmap = Bitmap.createBitmap(2, 2, b);
          Canvas localCanvas = new Canvas(localBitmap);
          paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
          paramDrawable.draw(localCanvas);
          return localBitmap;
        }
      }
      catch (OutOfMemoryError paramDrawable)
      {
        paramDrawable.printStackTrace();
        return null;
      }
      Bitmap localBitmap = Bitmap.createBitmap(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), b);
    }
  }
  
  private void a()
  {
    super.setScaleType(a);
    this.s = true;
    if (this.t)
    {
      b();
      this.t = false;
    }
  }
  
  private void b()
  {
    if (!this.s) {
      this.t = true;
    }
    while (this.m == null) {
      return;
    }
    this.n = new BitmapShader(this.m, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    this.i.setAntiAlias(true);
    this.i.setShader(this.n);
    this.j.setStyle(Paint.Style.STROKE);
    this.j.setAntiAlias(true);
    this.j.setColor(this.k);
    this.j.setStrokeWidth(this.l);
    this.p = this.m.getHeight();
    this.o = this.m.getWidth();
    this.g.set(0.0F, 0.0F, getWidth(), getHeight());
    this.r = Math.min((this.g.height() - this.l) / 2.0F, (this.g.width() - this.l) / 2.0F);
    this.f.set(this.l, this.l, this.g.width() - this.l, this.g.height() - this.l);
    this.q = Math.min(this.f.height() / 2.0F, this.f.width() / 2.0F);
    c();
    invalidate();
  }
  
  private void c()
  {
    float f1 = 0.0F;
    this.h.set(null);
    float f3;
    float f2;
    if (this.o * this.f.height() > this.f.width() * this.p)
    {
      f3 = this.f.height() / this.p;
      f2 = (this.f.width() - this.o * f3) * 0.5F;
    }
    for (;;)
    {
      this.h.setScale(f3, f3);
      this.h.postTranslate((int)(f2 + 0.5F) + this.l, (int)(f1 + 0.5F) + this.l);
      this.n.setLocalMatrix(this.h);
      return;
      f3 = this.f.width() / this.o;
      f1 = this.f.height();
      float f4 = this.p;
      f2 = 0.0F;
      f1 = (f1 - f4 * f3) * 0.5F;
    }
  }
  
  public int getBorderColor()
  {
    return this.k;
  }
  
  public int getBorderWidth()
  {
    return this.l;
  }
  
  public ImageView.ScaleType getScaleType()
  {
    return a;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (getDrawable() == null) {}
    do
    {
      return;
      paramCanvas.drawCircle(getWidth() / 2, getHeight() / 2, this.q, this.i);
    } while (this.l == 0);
    paramCanvas.drawCircle(getWidth() / 2, getHeight() / 2, this.r, this.j);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    b();
  }
  
  public void setAdjustViewBounds(boolean paramBoolean)
  {
    if (paramBoolean) {
      throw new IllegalArgumentException("adjustViewBounds not supported.");
    }
  }
  
  public void setBorderColor(int paramInt)
  {
    if (paramInt == this.k) {
      return;
    }
    this.k = paramInt;
    this.j.setColor(this.k);
    invalidate();
  }
  
  public void setBorderWidth(int paramInt)
  {
    if (paramInt == this.l) {
      return;
    }
    this.l = paramInt;
    b();
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    this.m = paramBitmap;
    b();
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
    this.m = a(paramDrawable);
    b();
  }
  
  public void setImageResource(int paramInt)
  {
    super.setImageResource(paramInt);
    this.m = a(getDrawable());
    b();
  }
  
  public void setImageURI(Uri paramUri)
  {
    super.setImageURI(paramUri);
    this.m = a(getDrawable());
    b();
  }
  
  public void setScaleType(ImageView.ScaleType paramScaleType)
  {
    if (paramScaleType != a) {
      throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[] { paramScaleType }));
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/circle/CircleImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */