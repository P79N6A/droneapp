package com.a.c;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import com.a.a.a.a;
import java.lang.ref.WeakReference;

class d extends b {
    private static final long a = -1;
    private final WeakReference<ViewPropertyAnimator> b;

    d(View view) {
        this.b = new WeakReference(view.animate());
    }

    public long a() {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        return viewPropertyAnimator != null ? viewPropertyAnimator.getDuration() : -1;
    }

    public b a(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.x(f);
        }
        return this;
    }

    public b a(long j) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setDuration(j);
        }
        return this;
    }

    public b a(Interpolator interpolator) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setInterpolator(interpolator);
        }
        return this;
    }

    public b a(final a aVar) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            if (aVar == null) {
                viewPropertyAnimator.setListener(null);
            } else {
                viewPropertyAnimator.setListener(new AnimatorListener(this) {
                    final /* synthetic */ d b;

                    public void onAnimationCancel(Animator animator) {
                        aVar.c(null);
                    }

                    public void onAnimationEnd(Animator animator) {
                        aVar.b(null);
                    }

                    public void onAnimationRepeat(Animator animator) {
                        aVar.d(null);
                    }

                    public void onAnimationStart(Animator animator) {
                        aVar.a(null);
                    }
                });
            }
        }
        return this;
    }

    public long b() {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        return viewPropertyAnimator != null ? viewPropertyAnimator.getStartDelay() : -1;
    }

    public b b(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.xBy(f);
        }
        return this;
    }

    public b b(long j) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setStartDelay(j);
        }
        return this;
    }

    public b c(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.y(f);
        }
        return this;
    }

    public void c() {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.start();
        }
    }

    public b d(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.yBy(f);
        }
        return this;
    }

    public void d() {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public b e(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotation(f);
        }
        return this;
    }

    public b f(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationBy(f);
        }
        return this;
    }

    public b g(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationX(f);
        }
        return this;
    }

    public b h(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationXBy(f);
        }
        return this;
    }

    public b i(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationY(f);
        }
        return this;
    }

    public b j(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationYBy(f);
        }
        return this;
    }

    public b k(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationX(f);
        }
        return this;
    }

    public b l(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationXBy(f);
        }
        return this;
    }

    public b m(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationY(f);
        }
        return this;
    }

    public b n(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationYBy(f);
        }
        return this;
    }

    public b o(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleX(f);
        }
        return this;
    }

    public b p(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleXBy(f);
        }
        return this;
    }

    public b q(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleY(f);
        }
        return this;
    }

    public b r(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleYBy(f);
        }
        return this;
    }

    public b s(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.alpha(f);
        }
        return this;
    }

    public b t(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.alphaBy(f);
        }
        return this;
    }
}
