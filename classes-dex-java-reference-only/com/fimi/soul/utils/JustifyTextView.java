package com.fimi.soul.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

public class JustifyTextView
  extends TextView
{
  private int a;
  private int b;
  private Context c;
  
  public JustifyTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.c = paramContext;
  }
  
  private void a(Canvas paramCanvas, int paramInt, String paramString, float paramFloat)
  {
    float f1 = 0.0F;
    String str = paramString;
    if (a(paramInt, paramString))
    {
      paramCanvas.drawText("  ", 0.0F, this.a - 5.0F, getPaint());
      f1 = 0.0F + StaticLayout.getDesiredWidth("  ", getPaint());
      str = paramString.substring(3);
    }
    float f2 = (this.b - paramFloat) / str.length();
    paramFloat = f1;
    paramInt = 0;
    while (paramInt < str.length())
    {
      paramString = String.valueOf(str.charAt(paramInt));
      f1 = StaticLayout.getDesiredWidth(paramString, getPaint());
      paramCanvas.drawText(paramString, paramFloat, this.a, getPaint());
      paramFloat += f1 + (f2 - 1.0F);
      paramInt += 1;
    }
  }
  
  private boolean a(int paramInt, String paramString)
  {
    return (paramString.length() > 3) && (paramString.charAt(0) == ' ') && (paramString.charAt(1) == ' ');
  }
  
  private boolean a(String paramString)
  {
    if (paramString.length() == 0) {}
    while (paramString.charAt(paramString.length() - 1) == '\n') {
      return false;
    }
    return true;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int i = 0;
    TextPaint localTextPaint = getPaint();
    localTextPaint.setColor(getCurrentTextColor());
    localTextPaint.drawableState = getDrawableState();
    localTextPaint.setTypeface(ao.a(this.c.getAssets()));
    this.b = getMeasuredWidth();
    String str1 = (String)getText();
    this.a = 0;
    this.a = ((int)(this.a + getTextSize()));
    Layout localLayout = getLayout();
    if (i < localLayout.getLineCount())
    {
      int j = localLayout.getLineStart(i);
      int k = localLayout.getLineEnd(i);
      String str2 = str1.substring(j, k);
      float f = StaticLayout.getDesiredWidth(str1, j, k, getPaint());
      if ((a(str2)) && (i != localLayout.getLineCount() - 1)) {
        a(paramCanvas, j, str2, f);
      }
      for (;;)
      {
        this.a += getLineHeight();
        i += 1;
        break;
        paramCanvas.drawText(str2, 0.0F, this.a - 5.0F, localTextPaint);
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/JustifyTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */