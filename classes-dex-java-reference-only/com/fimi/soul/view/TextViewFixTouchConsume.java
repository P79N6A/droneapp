package com.fimi.soul.view;

import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

public class TextViewFixTouchConsume
  extends TextView
{
  boolean a = true;
  boolean b;
  
  public TextViewFixTouchConsume(Context paramContext)
  {
    super(paramContext);
  }
  
  public TextViewFixTouchConsume(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public TextViewFixTouchConsume(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean hasFocus()
  {
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.b = false;
    boolean bool = super.onTouchEvent(paramMotionEvent);
    if (this.a) {
      bool = this.b;
    }
    return bool;
  }
  
  public static class a
    extends LinkMovementMethod
  {
    static a a;
    
    public static a a()
    {
      if (a == null) {
        a = new a();
      }
      return a;
    }
    
    public boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
    {
      int i = paramMotionEvent.getAction();
      if ((i == 1) || (i == 0))
      {
        int j = (int)paramMotionEvent.getX();
        int k = (int)paramMotionEvent.getY();
        int m = paramTextView.getTotalPaddingLeft();
        int n = paramTextView.getTotalPaddingTop();
        int i1 = paramTextView.getScrollX();
        int i2 = paramTextView.getScrollY();
        Object localObject = paramTextView.getLayout();
        j = ((Layout)localObject).getOffsetForHorizontal(((Layout)localObject).getLineForVertical(k - n + i2), j - m + i1);
        localObject = (ClickableSpan[])paramSpannable.getSpans(j, j, ClickableSpan.class);
        if (localObject.length != 0)
        {
          if (i == 1) {
            localObject[0].onClick(paramTextView);
          }
          for (;;)
          {
            if ((paramTextView instanceof TextViewFixTouchConsume)) {
              ((TextViewFixTouchConsume)paramTextView).b = true;
            }
            return true;
            if (i == 0) {
              Selection.setSelection(paramSpannable, paramSpannable.getSpanStart(localObject[0]), paramSpannable.getSpanEnd(localObject[0]));
            }
          }
        }
        Selection.removeSelection(paramSpannable);
        Touch.onTouchEvent(paramTextView, paramSpannable, paramMotionEvent);
        return false;
      }
      return Touch.onTouchEvent(paramTextView, paramSpannable, paramMotionEvent);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/TextViewFixTouchConsume.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */