package com.fimi.soul.media.player.widget;

import android.view.View;
import android.view.View.MeasureSpec;
import java.lang.ref.WeakReference;

public final class MeasureHelper
{
  private int mCurrentAspectRatio = 0;
  private int mMeasuredHeight;
  private int mMeasuredWidth;
  private int mVideoHeight;
  private int mVideoRotationDegree;
  private int mVideoSarDen;
  private int mVideoSarNum;
  private int mVideoWidth;
  private WeakReference<View> mWeakView;
  
  public MeasureHelper(View paramView)
  {
    this.mWeakView = new WeakReference(paramView);
  }
  
  public void doMeasure(int paramInt1, int paramInt2)
  {
    if (this.mVideoRotationDegree != 90)
    {
      j = paramInt1;
      i = paramInt2;
      if (this.mVideoRotationDegree != 270) {}
    }
    else
    {
      i = paramInt1;
      j = paramInt2;
    }
    int k = View.getDefaultSize(this.mVideoWidth, j);
    int m = View.getDefaultSize(this.mVideoHeight, i);
    if (this.mCurrentAspectRatio == 3)
    {
      paramInt1 = i;
      paramInt2 = j;
    }
    do
    {
      do
      {
        this.mMeasuredWidth = paramInt2;
        this.mMeasuredHeight = paramInt1;
        return;
        paramInt1 = m;
        paramInt2 = k;
      } while (this.mVideoWidth <= 0);
      paramInt1 = m;
      paramInt2 = k;
    } while (this.mVideoHeight <= 0);
    m = View.MeasureSpec.getMode(j);
    int j = View.MeasureSpec.getSize(j);
    paramInt2 = View.MeasureSpec.getMode(i);
    int i = View.MeasureSpec.getSize(i);
    float f3;
    float f1;
    if ((m == Integer.MIN_VALUE) && (paramInt2 == Integer.MIN_VALUE))
    {
      f3 = j / i;
      switch (this.mCurrentAspectRatio)
      {
      default: 
        float f2 = this.mVideoWidth / this.mVideoHeight;
        f1 = f2;
        if (this.mVideoSarNum > 0)
        {
          f1 = f2;
          if (this.mVideoSarDen > 0) {
            f1 = f2 * this.mVideoSarNum / this.mVideoSarDen;
          }
        }
        break;
      }
    }
    label228:
    label237:
    label639:
    label730:
    for (;;)
    {
      if (f1 > f3)
      {
        paramInt1 = 1;
        switch (this.mCurrentAspectRatio)
        {
        case 2: 
        case 3: 
        default: 
          if (paramInt1 != 0)
          {
            paramInt2 = Math.min(this.mVideoWidth, j);
            paramInt1 = (int)(paramInt2 / f1);
          }
          break;
        }
      }
      for (;;)
      {
        break;
        f1 = 1.7777778F;
        if ((this.mVideoRotationDegree != 90) && (this.mVideoRotationDegree != 270)) {
          break label730;
        }
        f1 = 1.0F / 1.7777778F;
        break label228;
        f1 = 1.3333334F;
        if ((this.mVideoRotationDegree != 90) && (this.mVideoRotationDegree != 270)) {
          break label730;
        }
        f1 = 1.0F / 1.3333334F;
        break label228;
        paramInt1 = 0;
        break label237;
        if (paramInt1 != 0)
        {
          paramInt1 = (int)(j / f1);
          paramInt2 = j;
        }
        else
        {
          paramInt2 = (int)(i * f1);
          paramInt1 = i;
          continue;
          if (paramInt1 != 0)
          {
            paramInt2 = (int)(i * f1);
            paramInt1 = i;
          }
          else
          {
            paramInt1 = (int)(j / f1);
            paramInt2 = j;
            continue;
            paramInt1 = Math.min(this.mVideoHeight, i);
            paramInt2 = (int)(paramInt1 * f1);
          }
        }
      }
      if ((m == 1073741824) && (paramInt2 == 1073741824))
      {
        if (this.mVideoWidth * i < this.mVideoHeight * j)
        {
          paramInt2 = this.mVideoWidth * i / this.mVideoHeight;
          paramInt1 = i;
          break;
        }
        paramInt1 = i;
        paramInt2 = j;
        if (this.mVideoWidth * i <= this.mVideoHeight * j) {
          break;
        }
        paramInt1 = this.mVideoHeight * j / this.mVideoWidth;
        paramInt2 = j;
        break;
      }
      if (m == 1073741824)
      {
        k = this.mVideoHeight * j / this.mVideoWidth;
        if (paramInt2 == Integer.MIN_VALUE)
        {
          paramInt1 = i;
          paramInt2 = j;
          if (k > i) {
            break;
          }
        }
        paramInt1 = k;
        paramInt2 = j;
        break;
      }
      if (paramInt2 == 1073741824)
      {
        k = this.mVideoWidth * i / this.mVideoHeight;
        paramInt1 = i;
        paramInt2 = k;
        if (m == Integer.MIN_VALUE)
        {
          paramInt1 = i;
          paramInt2 = j;
          if (k > j) {
            break;
          }
          paramInt2 = k;
          paramInt1 = i;
        }
        break;
      }
      k = this.mVideoWidth;
      paramInt1 = this.mVideoHeight;
      if ((paramInt2 == Integer.MIN_VALUE) && (paramInt1 > i)) {
        k = this.mVideoWidth * i / this.mVideoHeight;
      }
      for (;;)
      {
        paramInt1 = i;
        paramInt2 = k;
        if (m != Integer.MIN_VALUE) {
          break label639;
        }
        paramInt1 = i;
        paramInt2 = k;
        if (k <= j) {
          break label639;
        }
        paramInt1 = this.mVideoHeight * j / this.mVideoWidth;
        paramInt2 = j;
        break;
        i = paramInt1;
      }
    }
  }
  
  public int getMeasuredHeight()
  {
    return this.mMeasuredHeight;
  }
  
  public int getMeasuredWidth()
  {
    return this.mMeasuredWidth;
  }
  
  public View getView()
  {
    if (this.mWeakView == null) {
      return null;
    }
    return (View)this.mWeakView.get();
  }
  
  public void setAspectRatio(int paramInt)
  {
    this.mCurrentAspectRatio = paramInt;
  }
  
  public void setVideoRotation(int paramInt)
  {
    this.mVideoRotationDegree = paramInt;
  }
  
  public void setVideoSampleAspectRatio(int paramInt1, int paramInt2)
  {
    this.mVideoSarNum = paramInt1;
    this.mVideoSarDen = paramInt2;
  }
  
  public void setVideoSize(int paramInt1, int paramInt2)
  {
    this.mVideoWidth = paramInt1;
    this.mVideoHeight = paramInt2;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/widget/MeasureHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */