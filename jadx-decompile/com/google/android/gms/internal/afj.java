package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.RelativeLayout;
import com.google.android.gms.R;
import com.google.android.gms.cast.framework.h;
import com.google.android.gms.cast.framework.h.b;
import com.google.android.gms.cast.framework.h.c;
import com.google.android.gms.cast.framework.internal.featurehighlight.a;

public class afj extends RelativeLayout implements h {
    private final boolean a;
    private Activity b;
    private b c;
    private View d;
    private a e;
    private String f;
    private boolean g;
    private int h;

    @TargetApi(15)
    public afj(h.a aVar) {
        super(aVar.b());
        this.b = aVar.b();
        this.a = aVar.f();
        this.c = aVar.d();
        this.d = aVar.c();
        this.f = aVar.g();
        this.h = aVar.e();
    }

    static boolean a(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    private void c() {
        removeAllViews();
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = 0;
        this.g = false;
    }

    public void a() {
        if (this.b != null && this.d != null && !this.g && !a(this.b)) {
            if (this.a && c.b(this.b)) {
                c();
                return;
            }
            this.e = new a(this.b);
            if (this.h != 0) {
                this.e.a(this.h);
            }
            addView(this.e);
            com.google.android.gms.cast.framework.internal.featurehighlight.b bVar = (com.google.android.gms.cast.framework.internal.featurehighlight.b) this.b.getLayoutInflater().inflate(R.layout.cast_help_text, this.e, false);
            bVar.setText(this.f, null);
            this.e.a(bVar);
            this.e.a(this.d, null, true, new a.a(this) {
                final /* synthetic */ afj a;

                {
                    this.a = r1;
                }

                public void a() {
                    if (this.a.g) {
                        c.a(this.a.b);
                        this.a.e.c(new Runnable(this) {
                            final /* synthetic */ AnonymousClass1 a;

                            {
                                this.a = r1;
                            }

                            public void run() {
                                if (this.a.a.g) {
                                    ((ViewGroup) this.a.a.b.getWindow().getDecorView()).removeView(this.a.a);
                                    if (this.a.a.c != null) {
                                        this.a.a.c.a();
                                    }
                                    this.a.a.c();
                                }
                            }
                        });
                    }
                }

                public void b() {
                    if (this.a.g) {
                        c.a(this.a.b);
                        this.a.e.b(new Runnable(this) {
                            final /* synthetic */ AnonymousClass1 a;

                            {
                                this.a = r1;
                            }

                            public void run() {
                                if (this.a.a.g) {
                                    ((ViewGroup) this.a.a.b.getWindow().getDecorView()).removeView(this.a.a);
                                    if (this.a.a.c != null) {
                                        this.a.a.c.a();
                                    }
                                    this.a.a.c();
                                }
                            }
                        });
                    }
                }
            });
            this.g = true;
            ((ViewGroup) this.b.getWindow().getDecorView()).addView(this);
            this.e.a(null);
        }
    }

    public void b() {
        if (this.g) {
            ((ViewGroup) this.b.getWindow().getDecorView()).removeView(this);
            c();
        }
    }

    protected void onDetachedFromWindow() {
        c();
        super.onDetachedFromWindow();
    }
}
