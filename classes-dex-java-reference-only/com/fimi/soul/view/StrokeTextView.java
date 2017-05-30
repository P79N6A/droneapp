package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.fimi.soul.utils.ao;

public class StrokeTextView
  extends TextView
{
  private TextView a = null;
  
  public StrokeTextView(Context paramContext)
  {
    super(paramContext);
    this.a = new TextView(paramContext);
    ao.a(paramContext.getAssets(), new View[] { this.a, this });
    a();
  }
  
  public StrokeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = new TextView(paramContext, paramAttributeSet);
    ao.a(paramContext.getAssets(), new View[] { this.a, this });
    a();
  }
  
  public StrokeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = new TextView(paramContext, paramAttributeSet, paramInt);
    ao.a(paramContext.getAssets(), new View[] { this.a, this });
    a();
  }
  
  public void a()
  {
    TextPaint localTextPaint = this.a.getPaint();
    localTextPaint.setStrokeWidth(1.0F);
    localTextPaint.setStyle(Paint.Style.STROKE);
    this.a.setTextColor(1275068416);
    this.a.setGravity(getGravity());
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    this.a.draw(paramCanvas);
    super.onDraw(paramCanvas);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.a.layout(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    CharSequence localCharSequence = this.a.getText();
    if ((localCharSequence == null) || (!localCharSequence.equals(getText())))
    {
      this.a.setText(getText());
      postInvalidate();
    }
    super.onMeasure(paramInt1, paramInt2);
    this.a.measure(paramInt1, paramInt2);
  }
  
  public void setLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setLayoutParams(paramLayoutParams);
    this.a.setLayoutParams(paramLayoutParams);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/StrokeTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */