package com.fimi.soul.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import java.util.HashMap;
import java.util.List;

public class c extends BaseExpandableListAdapter {
    HashMap<String, List<String>> a;
    List<String> b;
    Context c;

    class a {
        public TextView a;
        final /* synthetic */ c b;

        a(c cVar) {
            this.b = cVar;
        }
    }

    public c(Context context, HashMap<String, List<String>> hashMap, List<String> list) {
        this.c = context;
        this.a = hashMap;
        this.b = list;
    }

    public void a(HashMap<String, List<String>> hashMap, List<String> list) {
        this.a = hashMap;
        this.b = list;
        notifyDataSetChanged();
    }

    public Object getChild(int i, int i2) {
        return this.a == null ? null : (String) ((List) this.a.get(this.b.get(i))).get(i2);
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.c).inflate(R.layout.errorcodebody, null);
            a aVar2 = new a(this);
            aVar2.a = (TextView) view.findViewById(R.id.errorbody);
            view.setTag(aVar2);
            aVar = aVar2;
        } else {
            aVar = (a) view.getTag();
        }
        aVar.a.setText((CharSequence) ((List) this.a.get(this.b.get(i))).get(i2));
        return view;
    }

    public int getChildrenCount(int i) {
        return this.a == null ? 0 : ((List) this.a.get(this.b.get(i))).size();
    }

    public Object getGroup(int i) {
        return this.b.get(i);
    }

    public int getGroupCount() {
        return this.b.size();
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.errorcodeheard, null);
        ((TextView) inflate.findViewById(R.id.errorheard)).setText((CharSequence) this.b.get(i));
        return inflate;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int i, int i2) {
        return false;
    }
}
