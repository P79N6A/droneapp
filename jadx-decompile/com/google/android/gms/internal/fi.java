package com.google.android.gms.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.util.SimpleArrayMap;

public class fi extends AnimatorListenerAdapter {
    private SimpleArrayMap<Animator, Boolean> a = new SimpleArrayMap();

    protected final boolean a(Animator animator) {
        return this.a.containsKey(animator) && ((Boolean) this.a.get(animator)).booleanValue();
    }

    public void onAnimationCancel(Animator animator) {
        this.a.put(animator, Boolean.valueOf(true));
    }

    public void onAnimationStart(Animator animator) {
        this.a.put(animator, Boolean.valueOf(false));
    }
}
