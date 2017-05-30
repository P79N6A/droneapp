package com.google.android.gms.games.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.common.util.s;
import java.lang.ref.WeakReference;

public class n {
    protected d a;
    protected a b;

    public static final class a {
        public IBinder a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        private a(int i, IBinder iBinder) {
            this.c = -1;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.b = i;
            this.a = iBinder;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", this.b);
            bundle.putInt("popupLocationInfo.displayId", this.c);
            bundle.putInt("popupLocationInfo.left", this.d);
            bundle.putInt("popupLocationInfo.top", this.e);
            bundle.putInt("popupLocationInfo.right", this.f);
            bundle.putInt("popupLocationInfo.bottom", this.g);
            return bundle;
        }
    }

    @TargetApi(12)
    private static final class b extends n implements OnAttachStateChangeListener, OnGlobalLayoutListener {
        private WeakReference<View> c;
        private boolean d = false;

        protected b(d dVar, int i) {
            super(dVar, i);
        }

        @TargetApi(17)
        private void b(View view) {
            int i = -1;
            if (s.f()) {
                Display display = view.getDisplay();
                if (display != null) {
                    i = display.getDisplayId();
                }
            }
            IBinder windowToken = view.getWindowToken();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int width = view.getWidth();
            int height = view.getHeight();
            this.b.c = i;
            this.b.a = windowToken;
            this.b.d = iArr[0];
            this.b.e = iArr[1];
            this.b.f = iArr[0] + width;
            this.b.g = iArr[1] + height;
            if (this.d) {
                a();
                this.d = false;
            }
        }

        public void a() {
            if (this.b.a != null) {
                super.a();
            } else {
                this.d = this.c != null;
            }
        }

        protected void a(int i) {
            this.b = new a(i, null);
        }

        @TargetApi(16)
        public void a(View view) {
            View view2;
            Context B;
            this.a.W();
            if (this.c != null) {
                view2 = (View) this.c.get();
                B = this.a.B();
                if (view2 == null && (B instanceof Activity)) {
                    view2 = ((Activity) B).getWindow().getDecorView();
                }
                if (view2 != null) {
                    view2.removeOnAttachStateChangeListener(this);
                    ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                    if (s.e()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    } else {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                }
            }
            this.c = null;
            B = this.a.B();
            if (view == null && (B instanceof Activity)) {
                view2 = ((Activity) B).findViewById(16908290);
                if (view2 == null) {
                    view2 = ((Activity) B).getWindow().getDecorView();
                }
                h.a("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
                view = view2;
            }
            if (view != null) {
                b(view);
                this.c = new WeakReference(view);
                view.addOnAttachStateChangeListener(this);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            }
            h.b("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
        }

        public void onGlobalLayout() {
            if (this.c != null) {
                View view = (View) this.c.get();
                if (view != null) {
                    b(view);
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        public void onViewDetachedFromWindow(View view) {
            this.a.W();
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private n(d dVar, int i) {
        this.a = dVar;
        a(i);
    }

    public static n a(d dVar, int i) {
        return s.b() ? new b(dVar, i) : new n(dVar, i);
    }

    public void a() {
        this.a.a(this.b.a, this.b.a());
    }

    protected void a(int i) {
        this.b = new a(i, new Binder());
    }

    public void a(View view) {
    }

    public Bundle b() {
        return this.b.a();
    }

    public void b(int i) {
        this.b.b = i;
    }

    public IBinder c() {
        return this.b.a;
    }

    public a d() {
        return this.b;
    }
}
