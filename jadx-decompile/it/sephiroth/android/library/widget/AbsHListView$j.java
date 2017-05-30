package it.sephiroth.android.library.widget;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.support.v4.util.SparseArrayCompat;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class AbsHListView$j {
    final /* synthetic */ AbsHListView a;
    private AbsHListView$k b;
    private int c;
    private View[] d = new View[0];
    private ArrayList<View>[] e;
    private int f;
    private ArrayList<View> g;
    private ArrayList<View> h;
    private SparseArrayCompat<View> i;

    public AbsHListView$j(AbsHListView absHListView) {
        this.a = absHListView;
    }

    @SuppressLint({"NewApi"})
    private void f() {
        int i = 0;
        int length = this.d.length;
        int i2 = this.f;
        ArrayList[] arrayListArr = this.e;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList = arrayListArr[i3];
            int size = arrayList.size();
            int i4 = size - length;
            size--;
            int i5 = 0;
            while (i5 < i4) {
                int i6 = size - 1;
                AbsHListView.e(this.a, (View) arrayList.remove(size), false);
                i5++;
                size = i6;
            }
        }
        if (this.i != null) {
            while (i < this.i.size()) {
                if (!((View) this.i.valueAt(i)).hasTransientState()) {
                    this.i.removeAt(i);
                    i--;
                }
                i++;
            }
        }
    }

    public void a() {
        int i;
        int i2 = 0;
        int size;
        if (this.f == 1) {
            ArrayList arrayList = this.g;
            size = arrayList.size();
            for (i = 0; i < size; i++) {
                ((View) arrayList.get(i)).forceLayout();
            }
        } else {
            size = this.f;
            for (int i3 = 0; i3 < size; i3++) {
                ArrayList arrayList2 = this.e[i3];
                int size2 = arrayList2.size();
                for (i = 0; i < size2; i++) {
                    ((View) arrayList2.get(i)).forceLayout();
                }
            }
        }
        if (this.i != null) {
            i = this.i.size();
            while (i2 < i) {
                ((View) this.i.valueAt(i2)).forceLayout();
                i2++;
            }
        }
    }

    public void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("Can't have a viewTypeCount < 1");
        }
        ArrayList[] arrayListArr = new ArrayList[i];
        for (int i2 = 0; i2 < i; i2++) {
            arrayListArr[i2] = new ArrayList();
        }
        this.f = i;
        this.g = arrayListArr[0];
        this.e = arrayListArr;
    }

    public void a(int i, int i2) {
        if (this.d.length < i) {
            this.d = new View[i];
        }
        this.c = i2;
        View[] viewArr = this.d;
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = this.a.getChildAt(i3);
            AbsHListView$LayoutParams absHListView$LayoutParams = (AbsHListView$LayoutParams) childAt.getLayoutParams();
            if (!(absHListView$LayoutParams == null || absHListView$LayoutParams.a == -2)) {
                viewArr[i3] = childAt;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void a(View view, int i) {
        AbsHListView$LayoutParams absHListView$LayoutParams = (AbsHListView$LayoutParams) view.getLayoutParams();
        if (absHListView$LayoutParams != null) {
            absHListView$LayoutParams.d = i;
            int i2 = absHListView$LayoutParams.a;
            boolean hasTransientState = VERSION.SDK_INT >= 16 ? view.hasTransientState() : false;
            if (!b(i2) || hasTransientState) {
                if (i2 != -2 || hasTransientState) {
                    if (this.h == null) {
                        this.h = new ArrayList();
                    }
                    this.h.add(view);
                }
                if (hasTransientState) {
                    if (this.i == null) {
                        this.i = new SparseArrayCompat();
                    }
                    view.onStartTemporaryDetach();
                    this.i.put(i, view);
                    return;
                }
                return;
            }
            view.onStartTemporaryDetach();
            if (this.f == 1) {
                this.g.add(view);
            } else {
                this.e[i2].add(view);
            }
            if (VERSION.SDK_INT >= 14) {
                view.setAccessibilityDelegate(null);
            }
            if (this.b != null) {
                this.b.a(view);
            }
        }
    }

    void a(List<View> list) {
        if (this.f == 1) {
            list.addAll(this.g);
            return;
        }
        int i = this.f;
        ArrayList[] arrayListArr = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            list.addAll(arrayListArr[i2]);
        }
    }

    public void b() {
        int size;
        int i;
        if (this.f == 1) {
            ArrayList arrayList = this.g;
            size = arrayList.size();
            for (i = 0; i < size; i++) {
                AbsHListView.a(this.a, (View) arrayList.remove((size - 1) - i), false);
            }
        } else {
            size = this.f;
            for (int i2 = 0; i2 < size; i2++) {
                ArrayList arrayList2 = this.e[i2];
                int size2 = arrayList2.size();
                for (i = 0; i < size2; i++) {
                    AbsHListView.b(this.a, (View) arrayList2.remove((size2 - 1) - i), false);
                }
            }
        }
        if (this.i != null) {
            this.i.clear();
        }
    }

    public boolean b(int i) {
        return i >= 0;
    }

    public View c(int i) {
        int i2 = i - this.c;
        View[] viewArr = this.d;
        if (i2 < 0 || i2 >= viewArr.length) {
            return null;
        }
        View view = viewArr[i2];
        viewArr[i2] = null;
        return view;
    }

    void c() {
        if (this.i != null) {
            this.i.clear();
        }
    }

    View d(int i) {
        if (this.i == null) {
            return null;
        }
        int indexOfKey = this.i.indexOfKey(i);
        if (indexOfKey < 0) {
            return null;
        }
        View view = (View) this.i.valueAt(indexOfKey);
        this.i.removeAt(indexOfKey);
        return view;
    }

    public void d() {
        if (this.h != null) {
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                AbsHListView.c(this.a, (View) this.h.get(i), false);
            }
            this.h.clear();
        }
    }

    View e(int i) {
        if (this.f == 1) {
            return AbsHListView.a(this.g, i);
        }
        int itemViewType = this.a.B.getItemViewType(i);
        return (itemViewType < 0 || itemViewType >= this.e.length) ? null : AbsHListView.a(this.e[itemViewType], i);
    }

    @SuppressLint({"NewApi"})
    public void e() {
        View[] viewArr = this.d;
        boolean z = this.b != null;
        boolean z2 = this.f > 1;
        ArrayList arrayList = this.g;
        for (int length = viewArr.length - 1; length >= 0; length--) {
            View view = viewArr[length];
            if (view != null) {
                AbsHListView$LayoutParams absHListView$LayoutParams = (AbsHListView$LayoutParams) view.getLayoutParams();
                int i = absHListView$LayoutParams.a;
                viewArr[length] = null;
                boolean hasTransientState = VERSION.SDK_INT >= 16 ? view.hasTransientState() : false;
                if (!b(i) || hasTransientState) {
                    if (i != -2 || hasTransientState) {
                        AbsHListView.d(this.a, view, false);
                    }
                    if (hasTransientState) {
                        if (this.i == null) {
                            this.i = new SparseArrayCompat();
                        }
                        this.i.put(this.c + length, view);
                    }
                } else {
                    ArrayList arrayList2 = z2 ? this.e[i] : arrayList;
                    view.onStartTemporaryDetach();
                    absHListView$LayoutParams.d = this.c + length;
                    arrayList2.add(view);
                    if (VERSION.SDK_INT >= 14) {
                        view.setAccessibilityDelegate(null);
                    }
                    if (z) {
                        this.b.a(view);
                    }
                    arrayList = arrayList2;
                }
            }
        }
        f();
    }

    void f(int i) {
        int size;
        int i2;
        if (this.f == 1) {
            ArrayList arrayList = this.g;
            size = arrayList.size();
            for (i2 = 0; i2 < size; i2++) {
                ((View) arrayList.get(i2)).setDrawingCacheBackgroundColor(i);
            }
        } else {
            size = this.f;
            int i3;
            for (i3 = 0; i3 < size; i3++) {
                ArrayList arrayList2 = this.e[i3];
                int size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    ((View) arrayList2.get(i2)).setDrawingCacheBackgroundColor(i);
                }
            }
        }
        for (View view : this.d) {
            if (view != null) {
                view.setDrawingCacheBackgroundColor(i);
            }
        }
    }
}
