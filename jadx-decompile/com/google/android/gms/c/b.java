package com.google.android.gms.c;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.t;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class b<T extends a> {
    private T a;
    private Bundle b;
    private LinkedList<a> c;
    private final g<T> d = new g<T>(this) {
        final /* synthetic */ b a;

        {
            this.a = r1;
        }

        public void a(T t) {
            this.a.a = t;
            Iterator it = this.a.c.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(this.a.a);
            }
            this.a.c.clear();
            this.a.b = null;
        }
    };

    private interface a {
        int a();

        void a(a aVar);
    }

    class AnonymousClass5 implements OnClickListener {
        final /* synthetic */ Context a;
        final /* synthetic */ int b;

        AnonymousClass5(Context context, int i) {
            this.a = context;
            this.b = i;
        }

        public void onClick(View view) {
            this.a.startActivity(e.b(this.b));
        }
    }

    private void a(int i) {
        while (!this.c.isEmpty() && ((a) this.c.getLast()).a() >= i) {
            this.c.removeLast();
        }
    }

    private void a(Bundle bundle, a aVar) {
        if (this.a != null) {
            aVar.a(this.a);
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(aVar);
        if (bundle != null) {
            if (this.b == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                this.b.putAll(bundle);
            }
        }
        a(this.d);
    }

    public static void b(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        int a = e.a(context);
        CharSequence c = t.c(context, a);
        CharSequence e = t.e(context, a);
        View linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        View textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setText(c);
        linearLayout.addView(textView);
        if (e != null) {
            View button = new Button(context);
            button.setLayoutParams(new LayoutParams(-2, -2));
            button.setText(e);
            linearLayout.addView(button);
            button.setOnClickListener(new AnonymousClass5(context, a));
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        final LayoutInflater layoutInflater2 = layoutInflater;
        final ViewGroup viewGroup2 = viewGroup;
        final Bundle bundle2 = bundle;
        a(bundle, new a(this) {
            final /* synthetic */ b e;

            public int a() {
                return 2;
            }

            public void a(a aVar) {
                frameLayout.removeAllViews();
                frameLayout.addView(this.e.a.a(layoutInflater2, viewGroup2, bundle2));
            }
        });
        if (this.a == null) {
            a(frameLayout);
        }
        return frameLayout;
    }

    public T a() {
        return this.a;
    }

    public void a(final Activity activity, final Bundle bundle, final Bundle bundle2) {
        a(bundle2, new a(this) {
            final /* synthetic */ b d;

            public int a() {
                return 0;
            }

            public void a(a aVar) {
                this.d.a.a(activity, bundle, bundle2);
            }
        });
    }

    public void a(final Bundle bundle) {
        a(bundle, new a(this) {
            final /* synthetic */ b b;

            public int a() {
                return 1;
            }

            public void a(a aVar) {
                this.b.a.a(bundle);
            }
        });
    }

    protected void a(FrameLayout frameLayout) {
        b(frameLayout);
    }

    protected abstract void a(g<T> gVar);

    public void b() {
        a(null, new a(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public int a() {
                return 4;
            }

            public void a(a aVar) {
                this.a.a.a();
            }
        });
    }

    public void b(Bundle bundle) {
        if (this.a != null) {
            this.a.b(bundle);
        } else if (this.b != null) {
            bundle.putAll(this.b);
        }
    }

    public void c() {
        a(null, new a(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public int a() {
                return 5;
            }

            public void a(a aVar) {
                this.a.a.b();
            }
        });
    }

    public void d() {
        if (this.a != null) {
            this.a.c();
        } else {
            a(5);
        }
    }

    public void e() {
        if (this.a != null) {
            this.a.d();
        } else {
            a(4);
        }
    }

    public void f() {
        if (this.a != null) {
            this.a.e();
        } else {
            a(2);
        }
    }

    public void g() {
        if (this.a != null) {
            this.a.f();
        } else {
            a(1);
        }
    }

    public void h() {
        if (this.a != null) {
            this.a.g();
        }
    }
}
