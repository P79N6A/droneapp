package com.fimi.soul.biz.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.g;
import com.google.android.gms.maps.model.a;
import com.google.android.gms.maps.model.b;
import java.util.ArrayList;

public class j
{
  private static a a;
  
  public static Bitmap a(View paramView, Context paramContext)
  {
    if (paramView == null) {
      return null;
    }
    paramView.measure(View.MeasureSpec.makeMeasureSpec(g.a(paramContext, 28.0F), 1073741824), View.MeasureSpec.makeMeasureSpec(g.a(paramContext, 48.0F), 1073741824));
    paramView.layout(0, 0, paramView.getMeasuredWidth(), paramView.getMeasuredHeight());
    paramContext = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.ARGB_8888);
    paramView.draw(new Canvas(paramContext));
    return paramContext;
  }
  
  public static a a(int paramInt)
  {
    a = b.a(paramInt);
    return a;
  }
  
  public static a a(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130968602, null);
    Object localObject = (TextView)localView.findViewById(2131689667);
    ((TextView)localObject).setText(paramInt2 + "m");
    if (paramBoolean) {
      ((TextView)localObject).setTextColor(paramContext.getResources().getColor(2131624173));
    }
    for (;;)
    {
      ao.b(paramContext.getAssets(), new View[] { localObject });
      localObject = (ImageView)localView.findViewById(2131689668);
      if (paramInt1 != 0) {
        ((ImageView)localObject).setBackgroundResource(paramInt1);
      }
      return b.a(a(localView, paramContext));
      ((TextView)localObject).setTextColor(paramContext.getResources().getColor(2131624167));
    }
  }
  
  public static ArrayList<a> a(Context paramContext, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(b(paramContext, paramInt2, paramInt1, paramBoolean));
    localArrayList.add(b(paramContext, paramInt3, paramInt1, paramBoolean));
    return localArrayList;
  }
  
  public static a b(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130968603, null);
    Object localObject = (TextView)localView.findViewById(2131689667);
    ((TextView)localObject).setText(paramInt2 + "m");
    if (paramBoolean) {
      ((TextView)localObject).setTextColor(paramContext.getResources().getColor(2131624173));
    }
    for (;;)
    {
      ao.b(paramContext.getAssets(), new View[] { localObject });
      localObject = (ImageView)localView.findViewById(2131689668);
      if (paramInt1 != 0) {
        ((ImageView)localObject).setBackgroundResource(paramInt1);
      }
      return b.a(a(localView, paramContext));
      ((TextView)localObject).setTextColor(paramContext.getResources().getColor(2131624167));
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */