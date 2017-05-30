package com.fimi.soul.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.utils.ao;
import java.util.List;

public class h extends BaseAdapter {
    List<UpdateVersonBean> a = null;
    private Context b;

    class a {
        TextView a;
        TextView b;
        View c;
        final /* synthetic */ h d;

        a(h hVar) {
            this.d = hVar;
        }
    }

    public h(Context context, List<UpdateVersonBean> list) {
        this.b = context;
        this.a = list;
    }

    public int getCount() {
        return this.a.size();
    }

    public Object getItem(int i) {
        return this.a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            a aVar2 = new a(this);
            view = LayoutInflater.from(this.b).inflate(R.layout.list_firmware_info_item, null);
            aVar2.a = (TextView) view.findViewById(R.id.serial);
            aVar2.b = (TextView) view.findViewById(R.id.info_tv);
            aVar2.c = view.findViewById(R.id.divider);
            ao.a(this.b.getAssets(), aVar2.a);
            ao.a(this.b.getAssets(), aVar2.b);
            aVar2.b.setTag(Integer.valueOf(i));
            view.setTag(aVar2);
            aVar = aVar2;
        } else {
            aVar = (a) view.getTag();
        }
        aVar.a.setText("" + (i + 1));
        aVar.b.setText(((UpdateVersonBean) this.a.get(i)).getSysname() + ":" + ((UpdateVersonBean) this.a.get(i)).getUpdcontents());
        return view;
    }

    public boolean isEnabled(int i) {
        return false;
    }
}
