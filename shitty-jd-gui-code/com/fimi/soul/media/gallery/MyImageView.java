package com.fimi.soul.media.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class MyImageView
  extends ImageView
{
  private a a;
  
  public MyImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MyImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.a != null) {
      this.a.a(getMeasuredWidth(), getMeasuredHeight());
    }
  }
  
  public void setOnMeasureListener(a parama)
  {
    this.a = parama;
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, int paramInt2);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/gallery/MyImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */