package com.fimi.soul.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.fimi.kernel.utils.t;
import com.fimi.overseas.soul.R;
import com.fimi.soul.entity.Describehistor;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.x;
import java.util.List;

public class a extends BaseAdapter {
    SharedPreferences a;
    private Context b;
    private List<Describehistor> c;

    class a {
        TextView a;
        TextView b;
        TextView c;
        SimpleDraweeView d;
        final /* synthetic */ a e;

        a(a aVar) {
            this.e = aVar;
        }
    }

    public a(Context context) {
        this.b = context;
        this.a = context.getSharedPreferences("imagehead", 0);
    }

    public void a() {
        notifyDataSetChanged();
    }

    public void a(List<Describehistor> list) {
        this.c = list;
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.c == null ? 0 : this.c.size();
    }

    public Object getItem(int i) {
        return this.c == null ? null : (Describehistor) this.c.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        Describehistor describehistor = (Describehistor) this.c.get(i);
        if (this.a != null && describehistor.getUserID().equals(this.a.getString(User.FN_NAME, ""))) {
            describehistor.setUserImgUrl(this.a.getString(describehistor.getUserID(), ""));
        }
        if (view == null) {
            view = LayoutInflater.from(this.b).inflate(R.layout.describehistoryitem, null);
            a aVar2 = new a(this);
            aVar2.b = (TextView) view.findViewById(R.id.nickname);
            aVar2.a = (TextView) view.findViewById(R.id.listnum);
            aVar2.c = (TextView) view.findViewById(R.id.flytimedescribe);
            aVar2.d = (SimpleDraweeView) view.findViewById(R.id.imageView1);
            view.setTag(aVar2);
            aVar = aVar2;
        } else {
            aVar = (a) view.getTag();
        }
        aVar.b.setText(describehistor.getName());
        aVar.a.setText((i + 1) + "");
        aVar.c.setText(t.a(describehistor.getSumTime() / 60.0d, 2) + "Hrs");
        x.a(aVar.d, describehistor.getUserImgUrl());
        return view;
    }
}
