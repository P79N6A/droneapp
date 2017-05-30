package com.google.android.gms.drive.a;

import android.content.Context;
import android.database.CursorIndexOutOfBoundsException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.common.data.b;
import com.google.android.gms.drive.internal.by;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a<T> extends BaseAdapter {
    private final Context a;
    private final int b;
    private int c;
    private final int d;
    private final List<b<T>> e;
    private final LayoutInflater f;
    private boolean g;

    public a(Context context, int i) {
        this(context, i, 0, new ArrayList());
    }

    public a(Context context, int i, int i2) {
        this(context, i, i2, new ArrayList());
    }

    public a(Context context, int i, int i2, List<b<T>> list) {
        this.g = true;
        this.a = context;
        this.c = i;
        this.b = i;
        this.d = i2;
        this.e = list;
        this.f = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public a(Context context, int i, int i2, b<T>... bVarArr) {
        this(context, i, i2, Arrays.asList(bVarArr));
    }

    public a(Context context, int i, List<b<T>> list) {
        this(context, i, 0, (List) list);
    }

    public a(Context context, int i, b<T>... bVarArr) {
        this(context, i, 0, Arrays.asList(bVarArr));
    }

    private View a(int i, View view, ViewGroup viewGroup, int i2) {
        View inflate = view == null ? this.f.inflate(i2, viewGroup, false) : view;
        try {
            TextView textView = this.d == 0 ? (TextView) inflate : (TextView) inflate.findViewById(this.d);
            Object item = getItem(i);
            if (item instanceof CharSequence) {
                textView.setText((CharSequence) item);
            } else {
                textView.setText(item.toString());
            }
            return inflate;
        } catch (Throwable e) {
            by.a("DataBufferAdapter", e, "You must supply a resource ID for a TextView");
            throw new IllegalStateException("DataBufferAdapter requires the resource ID to be a TextView", e);
        }
    }

    public void a() {
        for (b b : this.e) {
            b.b();
        }
        this.e.clear();
        if (this.g) {
            notifyDataSetChanged();
        }
    }

    public void a(int i) {
        this.c = i;
    }

    public void a(b<T> bVar) {
        this.e.add(bVar);
        if (this.g) {
            notifyDataSetChanged();
        }
    }

    public void a(boolean z) {
        this.g = z;
    }

    public Context b() {
        return this.a;
    }

    public int getCount() {
        int i = 0;
        for (b c : this.e) {
            i = c.c() + i;
        }
        return i;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, this.c);
    }

    public T getItem(int i) {
        int i2 = i;
        for (b bVar : this.e) {
            int c = bVar.c();
            if (c <= i2) {
                i2 -= c;
            } else {
                try {
                    return bVar.a(i2);
                } catch (CursorIndexOutOfBoundsException e) {
                    throw new CursorIndexOutOfBoundsException(i, getCount());
                }
            }
        }
        throw new CursorIndexOutOfBoundsException(i, getCount());
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, this.b);
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.g = true;
    }
}
