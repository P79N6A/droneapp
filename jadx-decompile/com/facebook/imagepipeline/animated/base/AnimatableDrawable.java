package com.facebook.imagepipeline.animated.base;

import android.graphics.drawable.Animatable;
import com.a.a.q;
import com.a.a.q.b;

public interface AnimatableDrawable extends Animatable {
    b createAnimatorUpdateListener();

    q createValueAnimator();

    q createValueAnimator(int i);
}
