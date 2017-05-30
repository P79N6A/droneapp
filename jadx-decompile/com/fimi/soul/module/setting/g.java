package com.fimi.soul.module.setting;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;
import java.util.List;

public class g extends BaseAdapter {
    List<h> a;
    Context b;
    ListView c;
    a d;
    private boolean e = false;
    private boolean f = false;

    class a {
        TextView a;
        ImageView b;
        final /* synthetic */ g c;

        a(g gVar) {
            this.c = gVar;
        }
    }

    public g(Context context, List<h> list) {
        this.b = context;
        this.a = list;
    }

    public void a(int i) {
        if (this.a != null) {
            for (h a : this.a) {
                a.a(false);
            }
            ((h) this.a.get(i)).a(true);
        }
        notifyDataSetChanged();
    }

    public void a(boolean z) {
        this.f = z;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public int getCount() {
        return this.a != null ? this.a.size() : 0;
    }

    public Object getItem(int i) {
        return this.a != null ? (h) this.a.get(i) : null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        this.c = (ListView) viewGroup;
        if (view == null) {
            this.d = new a(this);
            view = LinearLayout.inflate(this.b, R.layout.roller_setting_item, null);
            this.d.b = (ImageView) view.findViewById(R.id.item_icon);
            this.d.a = (TextView) view.findViewById(R.id.item_name);
            view.setLayoutParams(new LayoutParams(-1, (int) this.b.getResources().getDimension(R.dimen.setting_adapt_height)));
            view.setTag(this.d);
            ao.a(this.b.getAssets(), this.d.a);
        } else {
            this.d = (a) view.getTag();
        }
        this.d.a.setText(((h) this.a.get(i)).a());
        if (((h) this.a.get(i)).b()) {
            this.d.b.setVisibility(0);
            this.d.a.setSelected(true);
        } else {
            this.d.b.setVisibility(4);
            this.d.a.setSelected(false);
        }
        if (this.f) {
            this.d.a.setTextColor(this.b.getResources().getColor(R.color.setting_ash));
        } else if (i != 2 && this.e) {
            this.d.a.setTextColor(this.b.getResources().getColor(R.color.setting_ash));
        } else if (!this.e && i == 2) {
            this.d.a.setTextColor(this.b.getResources().getColor(R.color.setting_ash));
        }
        return view;
    }
}
