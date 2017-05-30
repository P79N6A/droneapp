package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class AppCompatSeekBar extends SeekBar {
    private AppCompatSeekBarHelper mAppCompatSeekBarHelper;
    private AppCompatDrawableManager mDrawableManager;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDrawableManager = AppCompatDrawableManager.get();
        this.mAppCompatSeekBarHelper = new AppCompatSeekBarHelper(this, this.mDrawableManager);
        this.mAppCompatSeekBarHelper.loadFromAttributes(attributeSet, i);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.mAppCompatSeekBarHelper.drawableStateChanged();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.mAppCompatSeekBarHelper.jumpDrawablesToCurrentState();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mAppCompatSeekBarHelper.drawTickMarks(canvas);
    }
}
