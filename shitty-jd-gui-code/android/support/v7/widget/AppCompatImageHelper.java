package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageHelper
{
  private final AppCompatDrawableManager mDrawableManager;
  private final ImageView mView;
  
  public AppCompatImageHelper(ImageView paramImageView, AppCompatDrawableManager paramAppCompatDrawableManager)
  {
    this.mView = paramImageView;
    this.mDrawableManager = paramAppCompatDrawableManager;
  }
  
  boolean hasOverlappingRendering()
  {
    Drawable localDrawable = this.mView.getBackground();
    return (Build.VERSION.SDK_INT < 21) || (!(localDrawable instanceof RippleDrawable));
  }
  
  public void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject2 = null;
    AttributeSet localAttributeSet = null;
    Object localObject1 = localObject2;
    try
    {
      Drawable localDrawable2 = this.mView.getDrawable();
      Drawable localDrawable1 = localDrawable2;
      if (localDrawable2 == null)
      {
        localObject1 = localObject2;
        paramAttributeSet = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), paramAttributeSet, R.styleable.AppCompatImageView, paramInt, 0);
        localObject1 = paramAttributeSet;
        paramInt = paramAttributeSet.getResourceId(R.styleable.AppCompatImageView_srcCompat, -1);
        localDrawable1 = localDrawable2;
        localAttributeSet = paramAttributeSet;
        if (paramInt != -1)
        {
          localObject1 = paramAttributeSet;
          localDrawable2 = this.mDrawableManager.getDrawable(this.mView.getContext(), paramInt);
          localDrawable1 = localDrawable2;
          localAttributeSet = paramAttributeSet;
          if (localDrawable2 != null)
          {
            localObject1 = paramAttributeSet;
            this.mView.setImageDrawable(localDrawable2);
            localAttributeSet = paramAttributeSet;
            localDrawable1 = localDrawable2;
          }
        }
      }
      if (localDrawable1 != null)
      {
        localObject1 = localAttributeSet;
        DrawableUtils.fixDrawable(localDrawable1);
      }
      if (localAttributeSet != null) {
        localAttributeSet.recycle();
      }
      return;
    }
    finally
    {
      if (localObject1 != null) {
        ((TintTypedArray)localObject1).recycle();
      }
    }
  }
  
  public void setImageResource(int paramInt)
  {
    if (paramInt != 0)
    {
      if (this.mDrawableManager != null) {}
      for (Drawable localDrawable = this.mDrawableManager.getDrawable(this.mView.getContext(), paramInt);; localDrawable = ContextCompat.getDrawable(this.mView.getContext(), paramInt))
      {
        if (localDrawable != null) {
          DrawableUtils.fixDrawable(localDrawable);
        }
        this.mView.setImageDrawable(localDrawable);
        return;
      }
    }
    this.mView.setImageDrawable(null);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/AppCompatImageHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */