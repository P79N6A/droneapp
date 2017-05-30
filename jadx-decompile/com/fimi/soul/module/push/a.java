package com.fimi.soul.module.push;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.utils.ao;
import java.util.List;

public class a extends BaseAdapter {
    private Context a;
    private List<HistoryPushMessage> b;

    private class a {
        TextView a;
        TextView b;
        TextView c;
        RelativeLayout d;
        ImageView e;
        final /* synthetic */ a f;

        private a(a aVar) {
            this.f = aVar;
        }

        public View a(ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(this.f.a).inflate(R.layout.adapt_history_push_message, viewGroup, false);
            this.a = (TextView) inflate.findViewById(R.id.title_tv);
            this.b = (TextView) inflate.findViewById(R.id.message_tv);
            this.c = (TextView) inflate.findViewById(R.id.time_tv);
            this.e = (ImageView) inflate.findViewById(R.id.setting_more_iv);
            this.d = (RelativeLayout) inflate.findViewById(R.id.rl);
            ao.a(this.f.a.getAssets(), this.a, this.b, this.c);
            return inflate;
        }
    }

    public a(Context context, List<HistoryPushMessage> list) {
        this.a = context;
        this.b = list;
    }

    public int getCount() {
        return this.b.size();
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            a aVar2 = new a();
            view = aVar2.a(viewGroup);
            view.setTag(aVar2);
            aVar = aVar2;
        } else {
            aVar = (a) view.getTag();
        }
        view.getLayoutParams().height = (int) this.a.getResources().getDimension(R.dimen.setting_adapt_switch);
        aVar.d.setLayoutParams(view.getLayoutParams());
        aVar.e.setVisibility(0);
        aVar.a.setText(((HistoryPushMessage) this.b.get(i)).getTitle());
        aVar.b.setText(((HistoryPushMessage) this.b.get(i)).getPayload());
        aVar.c.setText(((HistoryPushMessage) this.b.get(i)).getTime());
        return view;
    }
}
