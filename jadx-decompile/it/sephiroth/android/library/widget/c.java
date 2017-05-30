package it.sephiroth.android.library.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import java.util.ArrayList;
import java.util.Iterator;

public class c implements Filterable, WrapperListAdapter {
    static final ArrayList<HListView$b> c = new ArrayList();
    ArrayList<HListView$b> a;
    ArrayList<HListView$b> b;
    boolean d;
    private final ListAdapter e;
    private final boolean f;

    public c(ArrayList<HListView$b> arrayList, ArrayList<HListView$b> arrayList2, ListAdapter listAdapter) {
        this.e = listAdapter;
        this.f = listAdapter instanceof Filterable;
        if (arrayList == null) {
            this.a = c;
        } else {
            this.a = arrayList;
        }
        if (arrayList2 == null) {
            this.b = c;
        } else {
            this.b = arrayList2;
        }
        boolean z = a(this.a) && a(this.b);
        this.d = z;
    }

    private boolean a(ArrayList<HListView$b> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((HListView$b) it.next()).c) {
                    return false;
                }
            }
        }
        return true;
    }

    public int a() {
        return this.a.size();
    }

    public boolean a(View view) {
        boolean z = false;
        for (int i = 0; i < this.a.size(); i++) {
            if (((HListView$b) this.a.get(i)).a == view) {
                this.a.remove(i);
                if (a(this.a) && a(this.b)) {
                    z = true;
                }
                this.d = z;
                return true;
            }
        }
        return false;
    }

    public boolean areAllItemsEnabled() {
        return this.e != null ? this.d && this.e.areAllItemsEnabled() : true;
    }

    public int b() {
        return this.b.size();
    }

    public boolean b(View view) {
        boolean z = false;
        for (int i = 0; i < this.b.size(); i++) {
            if (((HListView$b) this.b.get(i)).a == view) {
                this.b.remove(i);
                if (a(this.a) && a(this.b)) {
                    z = true;
                }
                this.d = z;
                return true;
            }
        }
        return false;
    }

    public int getCount() {
        return this.e != null ? (b() + a()) + this.e.getCount() : b() + a();
    }

    public Filter getFilter() {
        return this.f ? ((Filterable) this.e).getFilter() : null;
    }

    public Object getItem(int i) {
        int a = a();
        if (i < a) {
            return ((HListView$b) this.a.get(i)).b;
        }
        int i2 = i - a;
        a = 0;
        if (this.e != null) {
            a = this.e.getCount();
            if (i2 < a) {
                return this.e.getItem(i2);
            }
        }
        return ((HListView$b) this.b.get(i2 - a)).b;
    }

    public long getItemId(int i) {
        int a = a();
        if (this.e != null && i >= a) {
            a = i - a;
            if (a < this.e.getCount()) {
                return this.e.getItemId(a);
            }
        }
        return -1;
    }

    public int getItemViewType(int i) {
        int a = a();
        if (this.e != null && i >= a) {
            a = i - a;
            if (a < this.e.getCount()) {
                return this.e.getItemViewType(a);
            }
        }
        return -2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int a = a();
        if (i < a) {
            return ((HListView$b) this.a.get(i)).a;
        }
        int i2 = i - a;
        a = 0;
        if (this.e != null) {
            a = this.e.getCount();
            if (i2 < a) {
                return this.e.getView(i2, view, viewGroup);
            }
        }
        return ((HListView$b) this.b.get(i2 - a)).a;
    }

    public int getViewTypeCount() {
        return this.e != null ? this.e.getViewTypeCount() : 1;
    }

    public ListAdapter getWrappedAdapter() {
        return this.e;
    }

    public boolean hasStableIds() {
        return this.e != null ? this.e.hasStableIds() : false;
    }

    public boolean isEmpty() {
        return this.e == null || this.e.isEmpty();
    }

    public boolean isEnabled(int i) {
        int a = a();
        if (i < a) {
            return ((HListView$b) this.a.get(i)).c;
        }
        int i2 = i - a;
        a = 0;
        if (this.e != null) {
            a = this.e.getCount();
            if (i2 < a) {
                return this.e.isEnabled(i2);
            }
        }
        return ((HListView$b) this.b.get(i2 - a)).c;
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.e != null) {
            this.e.registerDataSetObserver(dataSetObserver);
        }
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.e != null) {
            this.e.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
