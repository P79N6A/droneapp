package com.fimi.soul.view;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;

public class j
  extends PopupWindow
{
  public j(Context paramContext)
  {
    super(paramContext);
  }
  
  public j(View paramView)
  {
    super(paramView);
  }
  
  public j(View paramView, int paramInt1, int paramInt2)
  {
    super(paramView, paramInt1, paramInt2, true);
  }
  
  public void a(View paramView)
  {
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    paramView.getLocationOnScreen(arrayOfInt1);
    arrayOfInt2[0] = arrayOfInt1[0];
    arrayOfInt2[1] = arrayOfInt1[1];
    super.showAtLocation(paramView, 51, arrayOfInt2[0], arrayOfInt2[1] - getHeight() / 2);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */