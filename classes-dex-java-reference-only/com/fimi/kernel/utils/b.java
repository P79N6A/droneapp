package com.fimi.kernel.utils;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

public class b
{
  public static final long a = 1L;
  
  public static void a(View paramView, float paramFloat)
  {
    if (paramView == null) {
      return;
    }
    paramView.bringToFront();
    c(paramView, paramFloat / paramView.getWidth() + 1.0F);
  }
  
  public static void a(View paramView, long paramLong, int paramInt1, int paramInt2)
  {
    AnimationSet localAnimationSet = new AnimationSet(true);
    RotateAnimation localRotateAnimation = new RotateAnimation(0.0F, 360.0F, 1, 0.5F, 1, 0.5F);
    localRotateAnimation.setDuration(paramLong);
    localRotateAnimation.setRepeatCount(paramInt1);
    localRotateAnimation.setRepeatMode(paramInt2);
    localRotateAnimation.setInterpolator(paramView.getContext(), 17432582);
    localAnimationSet.addAnimation(localRotateAnimation);
    paramView.startAnimation(localAnimationSet);
  }
  
  public static void b(View paramView, float paramFloat)
  {
    if (paramView == null) {
      return;
    }
    c(paramView, (paramFloat / paramView.getWidth() + 1.0F) * -1.0F);
  }
  
  private static void c(View paramView, float paramFloat)
  {
    if (paramFloat == 0.0F) {
      return;
    }
    if (paramFloat > 0.0F) {}
    for (ScaleAnimation localScaleAnimation = new ScaleAnimation(1.0F, paramFloat, 1.0F, paramFloat, 1, 0.5F, 1, 0.5F);; localScaleAnimation = new ScaleAnimation(-1.0F * paramFloat, 1.0F, -1.0F * paramFloat, 1.0F, 1, 0.5F, 1, 0.5F))
    {
      localScaleAnimation.setDuration(1L);
      localScaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
      localScaleAnimation.setFillAfter(true);
      paramView.startAnimation(localScaleAnimation);
      return;
    }
  }
  
  private void d(final View paramView, final float paramFloat)
  {
    float f = -paramFloat;
    AnimationSet localAnimationSet = new AnimationSet(true);
    localAnimationSet.addAnimation(new TranslateAnimation(0.0F, 0.0F, 0.0F, f));
    localAnimationSet.setDuration(300L);
    localAnimationSet.setInterpolator(new AccelerateDecelerateInterpolator());
    localAnimationSet.setFillAfter(true);
    localAnimationSet.setAnimationListener(new Animation.AnimationListener()
    {
      public void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        b.a(b.this, paramView, paramFloat);
      }
      
      public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public void onAnimationStart(Animation paramAnonymousAnimation) {}
    });
    paramView.startAnimation(localAnimationSet);
  }
  
  private void e(final View paramView, final float paramFloat)
  {
    float f = -paramFloat;
    AnimationSet localAnimationSet = new AnimationSet(true);
    localAnimationSet.addAnimation(new TranslateAnimation(0.0F, 0.0F, f, 0.0F));
    localAnimationSet.setDuration(200L);
    localAnimationSet.setInterpolator(new AccelerateInterpolator());
    localAnimationSet.setFillAfter(true);
    localAnimationSet.setAnimationListener(new Animation.AnimationListener()
    {
      public void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        paramView.postDelayed(new Runnable()
        {
          public void run()
          {
            b.b(b.this, b.2.this.a, b.2.this.b);
          }
        }, 2000L);
      }
      
      public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public void onAnimationStart(Animation paramAnonymousAnimation) {}
    });
    paramView.startAnimation(localAnimationSet);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */