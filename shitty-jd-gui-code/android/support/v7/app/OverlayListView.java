package android.support.v7.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class OverlayListView
  extends ListView
{
  private final List<OverlayObject> mOverlayObjects = new ArrayList();
  
  public OverlayListView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OverlayListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OverlayListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void addOverlayObject(OverlayObject paramOverlayObject)
  {
    this.mOverlayObjects.add(paramOverlayObject);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.mOverlayObjects.size() > 0)
    {
      Iterator localIterator = this.mOverlayObjects.iterator();
      while (localIterator.hasNext())
      {
        OverlayObject localOverlayObject = (OverlayObject)localIterator.next();
        BitmapDrawable localBitmapDrawable = localOverlayObject.getBitmapDrawable();
        if (localBitmapDrawable != null) {
          localBitmapDrawable.draw(paramCanvas);
        }
        if (!localOverlayObject.update(getDrawingTime())) {
          localIterator.remove();
        }
      }
    }
  }
  
  public void startAnimationAll()
  {
    Iterator localIterator = this.mOverlayObjects.iterator();
    while (localIterator.hasNext())
    {
      OverlayObject localOverlayObject = (OverlayObject)localIterator.next();
      if (!localOverlayObject.isAnimationStarted()) {
        localOverlayObject.startAnimation(getDrawingTime());
      }
    }
  }
  
  public void stopAnimationAll()
  {
    Iterator localIterator = this.mOverlayObjects.iterator();
    while (localIterator.hasNext()) {
      ((OverlayObject)localIterator.next()).stopAnimation();
    }
  }
  
  public static class OverlayObject
  {
    private BitmapDrawable mBitmap;
    private float mCurrentAlpha = 1.0F;
    private Rect mCurrentBounds;
    private int mDeltaY;
    private long mDuration;
    private float mEndAlpha = 1.0F;
    private Interpolator mInterpolator;
    private boolean mIsAnimationEnded;
    private boolean mIsAnimationStarted;
    private OnAnimationEndListener mListener;
    private float mStartAlpha = 1.0F;
    private Rect mStartRect;
    private long mStartTime;
    
    public OverlayObject(BitmapDrawable paramBitmapDrawable, Rect paramRect)
    {
      this.mBitmap = paramBitmapDrawable;
      this.mStartRect = paramRect;
      this.mCurrentBounds = new Rect(paramRect);
      if ((this.mBitmap != null) && (this.mCurrentBounds != null))
      {
        this.mBitmap.setAlpha((int)(this.mCurrentAlpha * 255.0F));
        this.mBitmap.setBounds(this.mCurrentBounds);
      }
    }
    
    public BitmapDrawable getBitmapDrawable()
    {
      return this.mBitmap;
    }
    
    public boolean isAnimationStarted()
    {
      return this.mIsAnimationStarted;
    }
    
    public OverlayObject setAlphaAnimation(float paramFloat1, float paramFloat2)
    {
      this.mStartAlpha = paramFloat1;
      this.mEndAlpha = paramFloat2;
      return this;
    }
    
    public OverlayObject setAnimationEndListener(OnAnimationEndListener paramOnAnimationEndListener)
    {
      this.mListener = paramOnAnimationEndListener;
      return this;
    }
    
    public OverlayObject setDuration(long paramLong)
    {
      this.mDuration = paramLong;
      return this;
    }
    
    public OverlayObject setInterpolator(Interpolator paramInterpolator)
    {
      this.mInterpolator = paramInterpolator;
      return this;
    }
    
    public OverlayObject setTranslateYAnimation(int paramInt)
    {
      this.mDeltaY = paramInt;
      return this;
    }
    
    public void startAnimation(long paramLong)
    {
      this.mStartTime = paramLong;
      this.mIsAnimationStarted = true;
    }
    
    public void stopAnimation()
    {
      this.mIsAnimationStarted = true;
      this.mIsAnimationEnded = true;
      if (this.mListener != null) {
        this.mListener.onAnimationEnd();
      }
    }
    
    public boolean update(long paramLong)
    {
      float f1 = 0.0F;
      if (this.mIsAnimationEnded) {
        return false;
      }
      float f2 = Math.max(0.0F, Math.min(1.0F, (float)(paramLong - this.mStartTime) / (float)this.mDuration));
      if (!this.mIsAnimationStarted) {}
      for (;;)
      {
        if (this.mInterpolator == null)
        {
          f2 = f1;
          int i = (int)(this.mDeltaY * f2);
          this.mCurrentBounds.top = (this.mStartRect.top + i);
          this.mCurrentBounds.bottom = (i + this.mStartRect.bottom);
          float f3 = this.mStartAlpha;
          this.mCurrentAlpha = (f2 * (this.mEndAlpha - this.mStartAlpha) + f3);
          if ((this.mBitmap != null) && (this.mCurrentBounds != null))
          {
            this.mBitmap.setAlpha((int)(this.mCurrentAlpha * 255.0F));
            this.mBitmap.setBounds(this.mCurrentBounds);
          }
          if ((this.mIsAnimationStarted) && (f1 >= 1.0F))
          {
            this.mIsAnimationEnded = true;
            if (this.mListener != null) {
              this.mListener.onAnimationEnd();
            }
          }
          if (this.mIsAnimationEnded) {
            break label223;
          }
        }
        label223:
        for (boolean bool = true;; bool = false)
        {
          return bool;
          f2 = this.mInterpolator.getInterpolation(f1);
          break;
        }
        f1 = f2;
      }
    }
    
    public static abstract interface OnAnimationEndListener
    {
      public abstract void onAnimationEnd();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/OverlayListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */