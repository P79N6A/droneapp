package com.fimi.soul.view.photodraweeview;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import android.view.View.OnLongClickListener;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;

public class PhotoDraweeView extends SimpleDraweeView implements c {
    private a e;

    public PhotoDraweeView(Context context) {
        super(context);
        a();
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public PhotoDraweeView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
        a();
    }

    protected void a() {
        if (this.e == null || this.e.a() == null) {
            this.e = new a(this);
        }
    }

    public void a(float f, float f2, float f3, boolean z) {
        this.e.a(f, f2, f3, z);
    }

    public void a(float f, boolean z) {
        this.e.a(f, z);
    }

    public void a(int i, int i2) {
        this.e.a(i, i2);
    }

    public float getMaximumScale() {
        return this.e.getMaximumScale();
    }

    public float getMediumScale() {
        return this.e.getMediumScale();
    }

    public float getMinimumScale() {
        return this.e.getMinimumScale();
    }

    public d getOnPhotoTapListener() {
        return this.e.getOnPhotoTapListener();
    }

    public g getOnViewTapListener() {
        return this.e.getOnViewTapListener();
    }

    public float getScale() {
        return this.e.getScale();
    }

    protected void onAttachedToWindow() {
        a();
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow() {
        this.e.g();
        super.onDetachedFromWindow();
    }

    protected void onDraw(@NonNull Canvas canvas) {
        int save = canvas.save();
        canvas.concat(this.e.b());
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.e.setAllowParentInterceptOnEdge(z);
    }

    public void setMaximumScale(float f) {
        this.e.setMaximumScale(f);
    }

    public void setMediumScale(float f) {
        this.e.setMediumScale(f);
    }

    public void setMinimumScale(float f) {
        this.e.setMinimumScale(f);
    }

    public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
        this.e.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.e.setOnLongClickListener(onLongClickListener);
    }

    public void setOnPhotoTapListener(d dVar) {
        this.e.setOnPhotoTapListener(dVar);
    }

    public void setOnScaleChangeListener(e eVar) {
        this.e.setOnScaleChangeListener(eVar);
    }

    public void setOnViewTapListener(g gVar) {
        this.e.setOnViewTapListener(gVar);
    }

    public void setScale(float f) {
        this.e.setScale(f);
    }

    public void setZoomTransitionDuration(long j) {
        this.e.setZoomTransitionDuration(j);
    }
}
