package it.sephiroth.android.library.a;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;

public class b {
    private static final String a = "ViewHelper";

    public static abstract class a {
        protected View a;

        protected a(View view) {
            this.a = view;
        }

        public abstract void a(int i);

        public abstract void a(Runnable runnable);

        public abstract boolean a();
    }

    public static class b extends a {
        public b(View view) {
            super(view);
        }

        public void a(int i) {
            Log.d(b.a, "setScrollX: " + i);
            this.a.scrollTo(i, this.a.getScrollY());
        }

        public void a(Runnable runnable) {
            this.a.post(runnable);
        }

        public boolean a() {
            return false;
        }
    }

    public static final a a(View view) {
        int i = VERSION.SDK_INT;
        return i >= 16 ? new it.sephiroth.android.library.a.c.a(view) : i >= 14 ? new it.sephiroth.android.library.a.b.a(view) : new b(view);
    }
}
