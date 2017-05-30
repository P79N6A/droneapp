package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.soul.utils.ao;

public class BatteryCapacityView
  extends View
{
  private static final int i = -90;
  private static final int j = Color.parseColor("#19ffffff");
  private static final int k = Color.parseColor("#30b0e5");
  private static final int l = Color.parseColor("#fe5400");
  private static final int m = Color.parseColor("#f62f14");
  private static final int n = Color.parseColor("#FFFFFFFF");
  private static final int o = Color.parseColor("#7fFFFFFF");
  float a;
  private Paint b;
  private Paint c;
  private int d;
  private int e;
  private Context f;
  private int g = -1;
  private Rect h;
  
  public BatteryCapacityView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public BatteryCapacityView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public BatteryCapacityView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    this.f = paramContext;
    this.a = this.f.getResources().getDimension(2131296360);
    this.b = new Paint();
    this.b.setAntiAlias(true);
    this.b.setColor(j);
    this.b.setStyle(Paint.Style.STROKE);
    this.b.setStrokeWidth(this.a);
    this.b.setStrokeCap(Paint.Cap.ROUND);
    this.h = new Rect();
    this.c = new Paint();
    this.c.setStrokeWidth(this.a);
    this.c.setAntiAlias(true);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.b.setColor(j);
    paramCanvas.drawCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2 - this.a, this.b);
    float f1;
    if (this.g == -1)
    {
      this.b.setColor(k);
      this.c.setColor(n);
      localObject = new RectF();
      ((RectF)localObject).left = this.a;
      ((RectF)localObject).top = this.a;
      ((RectF)localObject).right = (getWidth() - this.a);
      ((RectF)localObject).bottom = (getHeight() - this.a);
      if (this.g != -1) {
        break label512;
      }
      f1 = 0.0F;
      label144:
      paramCanvas.drawArc((RectF)localObject, -90.0F, f1, false, this.b);
      if (this.g != -1) {
        break label528;
      }
    }
    label512:
    label528:
    for (Object localObject = this.f.getResources().getString(2131362517);; localObject = String.valueOf(this.g + "%"))
    {
      this.c.setTextSize(this.f.getResources().getDimension(2131296361));
      this.c.setTypeface(ao.b(this.f.getAssets()));
      this.c.getTextBounds((String)localObject, 0, ((String)localObject).length(), this.h);
      float f2 = this.h.width();
      f1 = this.h.height();
      paramCanvas.drawText((String)localObject, getWidth() / 2 - f2 / 2.0F, getHeight() * 0.32F + f1, this.c);
      localObject = this.f.getString(2131361995);
      this.c.setTypeface(ao.a(this.f.getAssets()));
      this.c.setColor(o);
      this.c.setTextSize(this.f.getResources().getDimension(2131296362));
      this.c.getTextBounds((String)localObject, 0, ((String)localObject).length(), this.h);
      f2 = this.h.width();
      float f3 = this.h.height();
      paramCanvas.drawText((String)localObject, getWidth() / 2 - f2 / 2.0F, f1 + getHeight() * 0.32F + f3 + getHeight() * 0.06F, this.c);
      return;
      if (this.g < 15)
      {
        this.b.setColor(m);
        this.c.setColor(m);
        break;
      }
      if (this.g < 30)
      {
        this.b.setColor(l);
        this.c.setColor(l);
        break;
      }
      this.b.setColor(k);
      this.c.setColor(n);
      break;
      f1 = this.g * 360 / 100;
      break label144;
    }
  }
  
  public void setPercent(int paramInt)
  {
    this.g = paramInt;
    invalidate();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/BatteryCapacityView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */