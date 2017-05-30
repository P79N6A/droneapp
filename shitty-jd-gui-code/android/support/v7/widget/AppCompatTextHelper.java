package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.text.AllCapsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

class AppCompatTextHelper
{
  private static final int[] VIEW_ATTRS = { 16842804, 16843119, 16843117, 16843120, 16843118 };
  private TintInfo mDrawableBottomTint;
  private TintInfo mDrawableLeftTint;
  private TintInfo mDrawableRightTint;
  private TintInfo mDrawableTopTint;
  final TextView mView;
  
  AppCompatTextHelper(TextView paramTextView)
  {
    this.mView = paramTextView;
  }
  
  static AppCompatTextHelper create(TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return new AppCompatTextHelperV17(paramTextView);
    }
    return new AppCompatTextHelper(paramTextView);
  }
  
  protected static TintInfo createTintInfo(Context paramContext, AppCompatDrawableManager paramAppCompatDrawableManager, int paramInt)
  {
    paramContext = paramAppCompatDrawableManager.getTintList(paramContext, paramInt);
    if (paramContext != null)
    {
      paramAppCompatDrawableManager = new TintInfo();
      paramAppCompatDrawableManager.mHasTintList = true;
      paramAppCompatDrawableManager.mTintList = paramContext;
      return paramAppCompatDrawableManager;
    }
    return null;
  }
  
  final void applyCompoundDrawableTint(Drawable paramDrawable, TintInfo paramTintInfo)
  {
    if ((paramDrawable != null) && (paramTintInfo != null)) {
      AppCompatDrawableManager.tintDrawable(paramDrawable, paramTintInfo, this.mView.getDrawableState());
    }
  }
  
  void applyCompoundDrawablesTints()
  {
    if ((this.mDrawableLeftTint != null) || (this.mDrawableTopTint != null) || (this.mDrawableRightTint != null) || (this.mDrawableBottomTint != null))
    {
      Drawable[] arrayOfDrawable = this.mView.getCompoundDrawables();
      applyCompoundDrawableTint(arrayOfDrawable[0], this.mDrawableLeftTint);
      applyCompoundDrawableTint(arrayOfDrawable[1], this.mDrawableTopTint);
      applyCompoundDrawableTint(arrayOfDrawable[2], this.mDrawableRightTint);
      applyCompoundDrawableTint(arrayOfDrawable[3], this.mDrawableBottomTint);
    }
  }
  
  void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    Context localContext = this.mView.getContext();
    Object localObject = AppCompatDrawableManager.get();
    TintTypedArray localTintTypedArray1 = TintTypedArray.obtainStyledAttributes(localContext, paramAttributeSet, VIEW_ATTRS, paramInt, 0);
    int i = localTintTypedArray1.getResourceId(0, -1);
    if (localTintTypedArray1.hasValue(1)) {
      this.mDrawableLeftTint = createTintInfo(localContext, (AppCompatDrawableManager)localObject, localTintTypedArray1.getResourceId(1, 0));
    }
    if (localTintTypedArray1.hasValue(2)) {
      this.mDrawableTopTint = createTintInfo(localContext, (AppCompatDrawableManager)localObject, localTintTypedArray1.getResourceId(2, 0));
    }
    if (localTintTypedArray1.hasValue(3)) {
      this.mDrawableRightTint = createTintInfo(localContext, (AppCompatDrawableManager)localObject, localTintTypedArray1.getResourceId(3, 0));
    }
    if (localTintTypedArray1.hasValue(4)) {
      this.mDrawableBottomTint = createTintInfo(localContext, (AppCompatDrawableManager)localObject, localTintTypedArray1.getResourceId(4, 0));
    }
    localTintTypedArray1.recycle();
    boolean bool3 = this.mView.getTransformationMethod() instanceof PasswordTransformationMethod;
    localObject = null;
    localTintTypedArray1 = null;
    boolean bool1;
    if (i != -1)
    {
      TintTypedArray localTintTypedArray2 = TintTypedArray.obtainStyledAttributes(localContext, i, R.styleable.TextAppearance);
      if ((!bool3) && (localTintTypedArray2.hasValue(R.styleable.TextAppearance_textAllCaps)))
      {
        bool1 = localTintTypedArray2.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        i = 1;
        localObject = localTintTypedArray1;
        if (Build.VERSION.SDK_INT < 23)
        {
          localObject = localTintTypedArray1;
          if (localTintTypedArray2.hasValue(R.styleable.TextAppearance_android_textColor)) {
            localObject = localTintTypedArray2.getColorStateList(R.styleable.TextAppearance_android_textColor);
          }
        }
        localTintTypedArray2.recycle();
      }
    }
    for (;;)
    {
      localTintTypedArray1 = TintTypedArray.obtainStyledAttributes(localContext, paramAttributeSet, R.styleable.TextAppearance, paramInt, 0);
      paramInt = i;
      boolean bool2 = bool1;
      if (!bool3)
      {
        paramInt = i;
        bool2 = bool1;
        if (localTintTypedArray1.hasValue(R.styleable.TextAppearance_textAllCaps))
        {
          bool2 = localTintTypedArray1.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
          paramInt = 1;
        }
      }
      paramAttributeSet = (AttributeSet)localObject;
      if (Build.VERSION.SDK_INT < 23)
      {
        paramAttributeSet = (AttributeSet)localObject;
        if (localTintTypedArray1.hasValue(R.styleable.TextAppearance_android_textColor)) {
          paramAttributeSet = localTintTypedArray1.getColorStateList(R.styleable.TextAppearance_android_textColor);
        }
      }
      localTintTypedArray1.recycle();
      if (paramAttributeSet != null) {
        this.mView.setTextColor(paramAttributeSet);
      }
      if ((!bool3) && (paramInt != 0)) {
        setAllCaps(bool2);
      }
      return;
      i = 0;
      bool1 = false;
      break;
      i = 0;
      bool1 = false;
    }
  }
  
  void onSetTextAppearance(Context paramContext, int paramInt)
  {
    paramContext = TintTypedArray.obtainStyledAttributes(paramContext, paramInt, R.styleable.TextAppearance);
    if (paramContext.hasValue(R.styleable.TextAppearance_textAllCaps)) {
      setAllCaps(paramContext.getBoolean(R.styleable.TextAppearance_textAllCaps, false));
    }
    if ((Build.VERSION.SDK_INT < 23) && (paramContext.hasValue(R.styleable.TextAppearance_android_textColor)))
    {
      ColorStateList localColorStateList = paramContext.getColorStateList(R.styleable.TextAppearance_android_textColor);
      if (localColorStateList != null) {
        this.mView.setTextColor(localColorStateList);
      }
    }
    paramContext.recycle();
  }
  
  void setAllCaps(boolean paramBoolean)
  {
    TextView localTextView = this.mView;
    if (paramBoolean) {}
    for (AllCapsTransformationMethod localAllCapsTransformationMethod = new AllCapsTransformationMethod(this.mView.getContext());; localAllCapsTransformationMethod = null)
    {
      localTextView.setTransformationMethod(localAllCapsTransformationMethod);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/AppCompatTextHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */