package com.fimi.kernel.utils;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

public class b {
    public static final long a = 1;

    public static void a(View view, float f) {
        if (view != null) {
            view.bringToFront();
            c(view, (f / ((float) view.getWidth())) + 1.0f);
        }
    }

    public static void a(View view, long j, int i, int i2) {
        Animation animationSet = new AnimationSet(true);
        Animation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(j);
        rotateAnimation.setRepeatCount(i);
        rotateAnimation.setRepeatMode(i2);
        rotateAnimation.setInterpolator(view.getContext(), 17432582);
        animationSet.addAnimation(rotateAnimation);
        view.startAnimation(animationSet);
    }

    public static void b(View view, float f) {
        if (view != null) {
            c(view, ((f / ((float) view.getWidth())) + 1.0f) * -1.0f);
        }
    }

    private static void c(View view, float f) {
        if (f != 0.0f) {
            Animation scaleAnimation = f > 0.0f ? new ScaleAnimation(1.0f, f, 1.0f, f, 1, 0.5f, 1, 0.5f) : new ScaleAnimation(-1.0f * f, 1.0f, -1.0f * f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(1);
            scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            scaleAnimation.setFillAfter(true);
            view.startAnimation(scaleAnimation);
        }
    }

    private void d(final View view, final float f) {
        float f2 = -f;
        Animation animationSet = new AnimationSet(true);
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, f2));
        animationSet.setDuration(300);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(new AnimationListener(this) {
            final /* synthetic */ b c;

            public void onAnimationEnd(Animation animation) {
                this.c.e(view, f);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation(animationSet);
    }

    private void e(final View view, final float f) {
        float f2 = -f;
        Animation animationSet = new AnimationSet(true);
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, f2, 0.0f));
        animationSet.setDuration(200);
        animationSet.setInterpolator(new AccelerateInterpolator());
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(new AnimationListener(this) {
            final /* synthetic */ b c;

            public void onAnimationEnd(Animation animation) {
                view.postDelayed(new Runnable(this) {
                    final /* synthetic */ AnonymousClass2 a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.c.d(view, f);
                    }
                }, 2000);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation(animationSet);
    }
}
