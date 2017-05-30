package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;
import java.util.ArrayList;

public class g extends BaseAdapter {
    private Context a;
    private ArrayList<String> b;
    private LayoutInflater c = LayoutInflater.from(this.a);
    private int d;

    class a {
        TextView a;
        final /* synthetic */ g b;

        a(g gVar) {
            this.b = gVar;
        }
    }

    public g(Context context, ArrayList<String> arrayList) {
        this.a = context;
        this.b = arrayList;
    }

    public void a(int i) {
        this.d = i;
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
            aVar = new a(this);
            view = this.c.inflate(R.layout.item_set_newhand_mode, null);
            view.setTag(aVar);
            aVar.a = (TextView) view.findViewById(R.id.tv_group_item);
        } else {
            aVar = (a) view.getTag();
        }
        if (i == this.d) {
            aVar.a.setTextColor(this.a.getResources().getColor(R.color.color_set_model));
        } else {
            aVar.a.setTextColor(this.a.getResources().getColor(17170443));
        }
        aVar.a.setText((CharSequence) this.b.get(i));
        ao.a(this.a.getAssets(), aVar.a);
        return view;
    }
}
