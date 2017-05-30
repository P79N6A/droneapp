package com.b.a.b.c;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import com.b.a.b.a.f;

public class b
  implements a
{
  private final int a;
  private final boolean b;
  private final boolean c;
  private final boolean d;
  
  public b(int paramInt)
  {
    this(paramInt, true, true, true);
  }
  
  public b(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.a = paramInt;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramBoolean3;
  }
  
  public static void a(View paramView, int paramInt)
  {
    if (paramView != null)
    {
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
      localAlphaAnimation.setDuration(paramInt);
      localAlphaAnimation.setInterpolator(new DecelerateInterpolator());
      paramView.startAnimation(localAlphaAnimation);
    }
  }
  
  public void a(Bitmap paramBitmap, com.b.a.b.e.a parama, f paramf)
  {
    parama.a(paramBitmap);
    if (((this.b) && (paramf == f.a)) || ((this.c) && (paramf == f.b)) || ((this.d) && (paramf == f.c))) {
      a(parama.d(), this.a);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/b/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */