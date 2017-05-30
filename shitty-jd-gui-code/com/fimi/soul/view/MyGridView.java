package com.fimi.soul.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;
import com.fimi.soul.b.f;

public class MyGridView
  extends GridView
{
  private f a;
  
  public MyGridView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MyGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MyGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.a != null) {
      this.a.a();
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setAdapter(f paramf)
  {
    this.a = paramf;
    super.setAdapter(paramf);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/MyGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */