package com.fimi.soul.view.photodraweeview;

import android.view.GestureDetector.OnDoubleTapListener;
import android.view.View.OnLongClickListener;

public interface c {
    public static final float a = 3.0f;
    public static final float b = 1.75f;
    public static final float c = 1.0f;
    public static final long d = 200;

    void a(float f, float f2, float f3, boolean z);

    void a(float f, boolean z);

    void a(int i, int i2);

    float getMaximumScale();

    float getMediumScale();

    float getMinimumScale();

    d getOnPhotoTapListener();

    g getOnViewTapListener();

    float getScale();

    void setAllowParentInterceptOnEdge(boolean z);

    void setMaximumScale(float f);

    void setMediumScale(float f);

    void setMinimumScale(float f);

    void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener);

    void setOnLongClickListener(OnLongClickListener onLongClickListener);

    void setOnPhotoTapListener(d dVar);

    void setOnScaleChangeListener(e eVar);

    void setOnViewTapListener(g gVar);

    void setScale(float f);

    void setZoomTransitionDuration(long j);
}
