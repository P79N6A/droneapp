package com.fimi.soul.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.entity.FmMenuItem;
import java.util.List;

public class e extends BaseAdapter {
    private Context a;
    private List<FmMenuItem> b;
    private int c = R.layout.item_list_pop;

    static class a {
        TextView a;

        a() {
        }
    }

    public e(Context context, List<FmMenuItem> list) {
        this.a = context;
        this.b = list;
    }

    public int getCount() {
        return this.b.size();
    }

    public Object getItem(int i) {
        return this.b.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(this.c, null);
            aVar = new a();
            aVar.a = (TextView) view.findViewById(R.id.pop_item);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        FmMenuItem fmMenuItem = (FmMenuItem) this.b.get(i);
        aVar.a.setText(fmMenuItem.getText());
        view.setId(fmMenuItem.getId());
        return view;
    }
}
