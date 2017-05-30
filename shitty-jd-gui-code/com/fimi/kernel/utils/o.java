package com.fimi.kernel.utils;

import android.util.SparseArray;
import android.view.View;

public class o
{
  public static <T extends View> T a(View paramView, int paramInt)
  {
    SparseArray localSparseArray = (SparseArray)paramView.getTag();
    if (localSparseArray == null)
    {
      localSparseArray = new SparseArray();
      paramView.setTag(localSparseArray);
    }
    for (;;)
    {
      View localView2 = (View)localSparseArray.get(paramInt);
      View localView1 = localView2;
      if (localView2 == null)
      {
        localView1 = paramView.findViewById(paramInt);
        localSparseArray.put(paramInt, localView1);
      }
      return localView1;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */