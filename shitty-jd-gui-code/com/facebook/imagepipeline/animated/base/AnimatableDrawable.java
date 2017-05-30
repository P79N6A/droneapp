package com.facebook.imagepipeline.animated.base;

import android.graphics.drawable.Animatable;
import com.a.a.q;
import com.a.a.q.b;

public abstract interface AnimatableDrawable
  extends Animatable
{
  public abstract q.b createAnimatorUpdateListener();
  
  public abstract q createValueAnimator();
  
  public abstract q createValueAnimator(int paramInt);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/animated/base/AnimatableDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */