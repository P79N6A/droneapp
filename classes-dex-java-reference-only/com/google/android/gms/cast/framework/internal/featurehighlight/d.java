package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.gms.R.dimen;
import com.google.android.gms.internal.fq;

class d
{
  private final Rect a = new Rect();
  private final int b;
  private final int c;
  private final int d;
  private final int e;
  private final a f;
  
  d(a parama)
  {
    this.f = ((a)fq.a(parama));
    parama = parama.getResources();
    this.b = parama.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_inner_radius);
    this.c = parama.getDimensionPixelOffset(R.dimen.cast_libraries_material_featurehighlight_inner_margin);
    this.d = parama.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_text_max_width);
    this.e = parama.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_text_horizontal_offset);
  }
  
  private int a(Rect paramRect)
  {
    Drawable localDrawable = this.f.b();
    if (localDrawable != null) {}
    for (int i = localDrawable.getBounds().height();; i = paramRect.height()) {
      return Math.max(this.b * 2, i);
    }
  }
  
  private int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int j = paramInt3 / 2;
    int i;
    if (paramInt4 - paramInt1 <= paramInt2 - paramInt4)
    {
      i = 1;
      if (i == 0) {
        break label71;
      }
      paramInt4 = paramInt4 - j + this.e;
      label45:
      if (paramInt4 - paramView.leftMargin >= paramInt1) {
        break label86;
      }
      paramInt1 += paramView.leftMargin;
    }
    label71:
    label86:
    do
    {
      return paramInt1;
      i = 0;
      break;
      paramInt4 = paramInt4 - j - this.e;
      break label45;
      paramInt1 = paramInt4;
    } while (paramInt4 + paramInt3 + paramView.rightMargin <= paramInt2);
    return paramInt2 - paramInt3 - paramView.rightMargin;
  }
  
  private void a(View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramView.measure(View.MeasureSpec.makeMeasureSpec(Math.min(paramInt1 - localMarginLayoutParams.leftMargin - localMarginLayoutParams.rightMargin, this.d), 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, Integer.MIN_VALUE));
  }
  
  private void a(View paramView, Rect paramRect)
  {
    paramRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
  }
  
  private void b(View paramView, int paramInt1, int paramInt2)
  {
    paramView.layout(paramInt1, paramInt2, paramView.getMeasuredWidth() + paramInt1, paramView.getMeasuredHeight() + paramInt2);
  }
  
  private void c(View paramView, int paramInt1, int paramInt2)
  {
    paramView.layout(paramInt1, paramInt2 - paramView.getMeasuredHeight(), paramView.getMeasuredWidth() + paramInt1, paramInt2);
  }
  
  void a(Rect paramRect1, Rect paramRect2)
  {
    int i = 0;
    View localView = this.f.c();
    if ((paramRect1.isEmpty()) || (paramRect2.isEmpty())) {
      localView.layout(0, 0, 0, 0);
    }
    for (;;)
    {
      a(localView, this.a);
      this.f.d().a(paramRect1, this.a);
      this.f.e().a(paramRect1);
      return;
      int k = paramRect1.centerY();
      int j = paramRect1.centerX();
      if (k < paramRect2.centerY()) {
        i = 1;
      }
      int m = a(paramRect1);
      int n = m / 2;
      n = this.c + (n + k);
      if (i != 0)
      {
        i = paramRect2.bottom;
        a(localView, paramRect2.width(), i - n);
        b(localView, a(localView, paramRect2.left, paramRect2.right, localView.getMeasuredWidth(), j), n);
      }
      else
      {
        i = k - m / 2 - this.c;
        k = paramRect2.top;
        a(localView, paramRect2.width(), i - k);
        c(localView, a(localView, paramRect2.left, paramRect2.right, localView.getMeasuredWidth(), j), i);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/internal/featurehighlight/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */