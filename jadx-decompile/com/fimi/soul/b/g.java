package com.fimi.soul.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.entity.UpgradeResultDetail;
import java.util.List;

public class g extends BaseAdapter {
    private Context a;
    private List<UpgradeResultDetail> b;

    class a {
        TextView a;
        TextView b;
        View c;
        ImageView d;
        final /* synthetic */ g e;

        a(g gVar) {
            this.e = gVar;
        }
    }

    public g(Context context, List<UpgradeResultDetail> list) {
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
            aVar = new a(this);
            view = LayoutInflater.from(this.a).inflate(R.layout.list_update_result_item, null);
            aVar.a = (TextView) view.findViewById(R.id.time);
            aVar.b = (TextView) view.findViewById(R.id.info_tv);
            aVar.c = view.findViewById(R.id.divider);
            aVar.d = (ImageView) view.findViewById(R.id.info_tv2);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.b.setText(((UpgradeResultDetail) this.b.get(i)).getDetail());
        aVar.d.setImageResource(((UpgradeResultDetail) this.b.get(i)).getImg());
        return view;
    }

    public boolean isEnabled(int i) {
        return false;
    }
}
