package com.fimi.soul.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.utils.ao;
import java.util.List;

public class d extends BaseAdapter {
    List<FirmwareInfo> a = null;
    private Context b;

    class a {
        TextView a;
        TextView b;
        View c;
        final /* synthetic */ d d;

        a(d dVar) {
            this.d = dVar;
        }
    }

    public d(Context context, List<FirmwareInfo> list) {
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
        aVar.b.setText(((FirmwareInfo) this.a.get(i)).getSysName() + ":" + ((FirmwareInfo) this.a.get(i)).getUpdcontents());
        return view;
    }

    public boolean isEnabled(int i) {
        return false;
    }
}
