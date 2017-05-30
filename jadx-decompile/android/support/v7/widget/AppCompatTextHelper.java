package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R;
import android.support.v7.text.AllCapsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

class AppCompatTextHelper {
    private static final int[] VIEW_ATTRS = new int[]{16842804, 16843119, 16843117, 16843120, 16843118};
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableTopTint;
    final TextView mView;

    AppCompatTextHelper(TextView textView) {
        this.mView = textView;
    }

    static AppCompatTextHelper create(TextView textView) {
        return VERSION.SDK_INT >= 17 ? new AppCompatTextHelperV17(textView) : new AppCompatTextHelper(textView);
    }

    protected static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i);
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    final void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable != null && tintInfo != null) {
            AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
        }
    }

    void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
    }

    void loadFromAttributes(AttributeSet attributeSet, int i) {
        boolean z;
        Context context = this.mView.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, VIEW_ATTRS, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (obtainStyledAttributes.hasValue(1)) {
            this.mDrawableLeftTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(1, 0));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.mDrawableTopTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(2, 0));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            this.mDrawableRightTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(3, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.mDrawableBottomTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(4, 0));
        }
        obtainStyledAttributes.recycle();
        boolean z2 = this.mView.getTransformationMethod() instanceof PasswordTransformationMethod;
        ColorStateList colorStateList = null;
        boolean z3;
        if (resourceId != -1) {
            TintTypedArray obtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(context, resourceId, R.styleable.TextAppearance);
            if (z2 || !obtainStyledAttributes2.hasValue(R.styleable.TextAppearance_textAllCaps)) {
                z3 = false;
                z = false;
            } else {
                z = obtainStyledAttributes2.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
                int i2 = 1;
            }
            if (VERSION.SDK_INT < 23 && obtainStyledAttributes2.hasValue(R.styleable.TextAppearance_android_textColor)) {
                colorStateList = obtainStyledAttributes2.getColorStateList(R.styleable.TextAppearance_android_textColor);
            }
            obtainStyledAttributes2.recycle();
        } else {
            z3 = false;
            z = false;
        }
        TintTypedArray obtainStyledAttributes3 = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.TextAppearance, i, 0);
        if (!z2 && obtainStyledAttributes3.hasValue(R.styleable.TextAppearance_textAllCaps)) {
            z = obtainStyledAttributes3.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
            i2 = 1;
        }
        if (VERSION.SDK_INT < 23 && obtainStyledAttributes3.hasValue(R.styleable.TextAppearance_android_textColor)) {
            colorStateList = obtainStyledAttributes3.getColorStateList(R.styleable.TextAppearance_android_textColor);
        }
        obtainStyledAttributes3.recycle();
        if (colorStateList != null) {
            this.mView.setTextColor(colorStateList);
        }
        if (!z2 && r0 != 0) {
            setAllCaps(z);
        }
    }

    void onSetTextAppearance(Context context, int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_textAllCaps)) {
            setAllCaps(obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textColor)) {
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.TextAppearance_android_textColor);
            if (colorStateList != null) {
                this.mView.setTextColor(colorStateList);
            }
        }
        obtainStyledAttributes.recycle();
    }

    void setAllCaps(boolean z) {
        this.mView.setTransformationMethod(z ? new AllCapsTransformationMethod(this.mView.getContext()) : null);
    }
}
