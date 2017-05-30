package com.google.android.gms.internal;

import android.animation.Animator;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.fk.a;

public class fj extends fi {
    protected final Animator a;
    private final fk b;
    private final Runnable c;
    private a d = new a(this) {
        final /* synthetic */ fj a;

        {
            this.a = r1;
        }

        public void a(long j) {
            if (!this.a.a(this.a.a) && !this.a.a.isStarted()) {
                if (this.a.c != null) {
                    this.a.c.run();
                }
                this.a.a.start();
            }
        }
    };

    private fj(Animator animator, @Nullable Runnable runnable) {
        this.a = animator;
        this.c = runnable;
        this.b = fk.a();
    }

    public static fj a(Animator animator, @Nullable Runnable runnable) {
        Object fjVar = new fj(animator, runnable);
        animator.addListener(fjVar);
        return fjVar;
    }

    public static fj b(Animator animator) {
        return a(animator, null);
    }

    public void onAnimationEnd(Animator animator) {
        if (!a(animator)) {
            this.b.a(this.d);
        }
    }
}
