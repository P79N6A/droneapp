package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.facebook.drawee.R.styleable;
import com.facebook.drawee.drawable.AutoRotateDrawable;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import javax.annotation.Nullable;

public class GenericDraweeView
  extends DraweeView<GenericDraweeHierarchy>
{
  private float mAspectRatio = 0.0F;
  private final AspectRatioMeasure.Spec mMeasureSpec = new AspectRatioMeasure.Spec();
  
  public GenericDraweeView(Context paramContext)
  {
    super(paramContext);
    inflateHierarchy(paramContext, null);
  }
  
  public GenericDraweeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    inflateHierarchy(paramContext, paramAttributeSet);
  }
  
  public GenericDraweeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    inflateHierarchy(paramContext, paramAttributeSet);
  }
  
  @TargetApi(21)
  public GenericDraweeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    inflateHierarchy(paramContext, paramAttributeSet);
  }
  
  public GenericDraweeView(Context paramContext, GenericDraweeHierarchy paramGenericDraweeHierarchy)
  {
    super(paramContext);
    setHierarchy(paramGenericDraweeHierarchy);
  }
  
  private static ScalingUtils.ScaleType getScaleTypeFromXml(TypedArray paramTypedArray, int paramInt, ScalingUtils.ScaleType paramScaleType)
  {
    paramInt = paramTypedArray.getInt(paramInt, -1);
    if (paramInt < 0) {
      return paramScaleType;
    }
    return ScalingUtils.ScaleType.values()[paramInt];
  }
  
  private void inflateHierarchy(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    Resources localResources = paramContext.getResources();
    int i8 = 300;
    int i7 = 0;
    ScalingUtils.ScaleType localScaleType10 = GenericDraweeHierarchyBuilder.DEFAULT_SCALE_TYPE;
    int i6 = 0;
    ScalingUtils.ScaleType localScaleType9 = GenericDraweeHierarchyBuilder.DEFAULT_SCALE_TYPE;
    int i5 = 0;
    ScalingUtils.ScaleType localScaleType8 = GenericDraweeHierarchyBuilder.DEFAULT_SCALE_TYPE;
    int i4 = 0;
    ScalingUtils.ScaleType localScaleType7 = GenericDraweeHierarchyBuilder.DEFAULT_SCALE_TYPE;
    ScalingUtils.ScaleType localScaleType6 = GenericDraweeHierarchyBuilder.DEFAULT_ACTUAL_IMAGE_SCALE_TYPE;
    int i3 = 0;
    int i2 = 0;
    int i1 = 0;
    boolean bool5 = false;
    int n = 0;
    boolean bool4 = true;
    boolean bool3 = true;
    boolean bool2 = true;
    boolean bool1 = true;
    int m = 0;
    int k = 0;
    int j = 0;
    int i = 0;
    ScalingUtils.ScaleType localScaleType2 = localScaleType6;
    ScalingUtils.ScaleType localScaleType1 = localScaleType7;
    ScalingUtils.ScaleType localScaleType5 = localScaleType8;
    ScalingUtils.ScaleType localScaleType4 = localScaleType9;
    ScalingUtils.ScaleType localScaleType3 = localScaleType10;
    if (paramAttributeSet != null) {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.GenericDraweeView);
    }
    label687:
    label693:
    label699:
    label705:
    for (;;)
    {
      try
      {
        i8 = paramContext.getInt(R.styleable.GenericDraweeView_fadeDuration, 300);
        this.mAspectRatio = paramContext.getFloat(R.styleable.GenericDraweeView_viewAspectRatio, this.mAspectRatio);
        i7 = paramContext.getResourceId(R.styleable.GenericDraweeView_placeholderImage, 0);
        localScaleType3 = getScaleTypeFromXml(paramContext, R.styleable.GenericDraweeView_placeholderImageScaleType, localScaleType10);
        i6 = paramContext.getResourceId(R.styleable.GenericDraweeView_retryImage, 0);
        localScaleType4 = getScaleTypeFromXml(paramContext, R.styleable.GenericDraweeView_retryImageScaleType, localScaleType9);
        i5 = paramContext.getResourceId(R.styleable.GenericDraweeView_failureImage, 0);
        localScaleType5 = getScaleTypeFromXml(paramContext, R.styleable.GenericDraweeView_failureImageScaleType, localScaleType8);
        i4 = paramContext.getResourceId(R.styleable.GenericDraweeView_progressBarImage, 0);
        localScaleType1 = getScaleTypeFromXml(paramContext, R.styleable.GenericDraweeView_progressBarImageScaleType, localScaleType7);
        i = paramContext.getInteger(R.styleable.GenericDraweeView_progressBarAutoRotateInterval, 0);
        localScaleType2 = getScaleTypeFromXml(paramContext, R.styleable.GenericDraweeView_actualImageScaleType, localScaleType6);
        i3 = paramContext.getResourceId(R.styleable.GenericDraweeView_backgroundImage, 0);
        i2 = paramContext.getResourceId(R.styleable.GenericDraweeView_overlayImage, 0);
        i1 = paramContext.getResourceId(R.styleable.GenericDraweeView_pressedStateOverlayImage, 0);
        bool5 = paramContext.getBoolean(R.styleable.GenericDraweeView_roundAsCircle, false);
        n = paramContext.getDimensionPixelSize(R.styleable.GenericDraweeView_roundedCornerRadius, 0);
        bool4 = paramContext.getBoolean(R.styleable.GenericDraweeView_roundTopLeft, true);
        bool3 = paramContext.getBoolean(R.styleable.GenericDraweeView_roundTopRight, true);
        bool2 = paramContext.getBoolean(R.styleable.GenericDraweeView_roundBottomRight, true);
        bool1 = paramContext.getBoolean(R.styleable.GenericDraweeView_roundBottomLeft, true);
        m = paramContext.getColor(R.styleable.GenericDraweeView_roundWithOverlayColor, 0);
        k = paramContext.getDimensionPixelSize(R.styleable.GenericDraweeView_roundingBorderWidth, 0);
        j = paramContext.getColor(R.styleable.GenericDraweeView_roundingBorderColor, 0);
        paramContext.recycle();
        paramAttributeSet = new GenericDraweeHierarchyBuilder(localResources);
        paramAttributeSet.setFadeDuration(i8);
        if (i7 > 0) {
          paramAttributeSet.setPlaceholderImage(localResources.getDrawable(i7), localScaleType3);
        }
        if (i6 > 0) {
          paramAttributeSet.setRetryImage(localResources.getDrawable(i6), localScaleType4);
        }
        if (i5 > 0) {
          paramAttributeSet.setFailureImage(localResources.getDrawable(i5), localScaleType5);
        }
        if (i4 > 0)
        {
          paramContext = localResources.getDrawable(i4);
          if (i <= 0) {
            break label705;
          }
          paramContext = new AutoRotateDrawable(paramContext, i);
          paramAttributeSet.setProgressBarImage(paramContext, localScaleType1);
        }
        if (i3 > 0) {
          paramAttributeSet.setBackground(localResources.getDrawable(i3));
        }
        if (i2 > 0) {
          paramAttributeSet.setOverlay(localResources.getDrawable(i2));
        }
        if (i1 > 0) {
          paramAttributeSet.setPressedStateOverlay(getResources().getDrawable(i1));
        }
        paramAttributeSet.setActualImageScaleType(localScaleType2);
        if ((bool5) || (n > 0))
        {
          paramContext = new RoundingParams();
          paramContext.setRoundAsCircle(bool5);
          if (n > 0)
          {
            if (bool4)
            {
              f1 = n;
              if (!bool3) {
                break label687;
              }
              f2 = n;
              if (!bool2) {
                break label693;
              }
              f3 = n;
              if (!bool1) {
                break label699;
              }
              f4 = n;
              paramContext.setCornersRadii(f1, f2, f3, f4);
            }
          }
          else
          {
            if (m != 0) {
              paramContext.setOverlayColor(m);
            }
            if ((j != 0) && (k > 0)) {
              paramContext.setBorder(j, k);
            }
            paramAttributeSet.setRoundingParams(paramContext);
          }
        }
        else
        {
          setHierarchy(paramAttributeSet.build());
          return;
        }
      }
      finally
      {
        paramContext.recycle();
      }
      float f1 = 0.0F;
      continue;
      float f2 = 0.0F;
      continue;
      float f3 = 0.0F;
      continue;
      float f4 = 0.0F;
    }
  }
  
  public float getAspectRatio()
  {
    return this.mAspectRatio;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.mMeasureSpec.width = paramInt1;
    this.mMeasureSpec.height = paramInt2;
    AspectRatioMeasure.updateMeasureSpec(this.mMeasureSpec, this.mAspectRatio, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
    super.onMeasure(this.mMeasureSpec.width, this.mMeasureSpec.height);
  }
  
  public void setAspectRatio(float paramFloat)
  {
    if (paramFloat == this.mAspectRatio) {
      return;
    }
    this.mAspectRatio = paramFloat;
    requestLayout();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/drawee/view/GenericDraweeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */