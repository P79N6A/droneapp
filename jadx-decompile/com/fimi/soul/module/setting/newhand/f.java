package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import java.util.ArrayList;

public class f {
    View a;
    ListView b;
    ArrayList<String> c;
    PopupWindow d;
    g e;
    TextView f;
    a g;
    OnItemClickListener h = new OnItemClickListener(this) {
        final /* synthetic */ f a;

        {
            this.a = r1;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.a.g.a(i);
            if (this.a.d != null) {
                this.a.d.dismiss();
                this.a.d = null;
            }
        }
    };

    public interface a {
        void a(int i);
    }

    public void a(TextView textView, Context context, int i, a aVar) {
        this.f = textView;
        this.g = aVar;
        this.a = LayoutInflater.from(context).inflate(R.layout.listview_newhand, null);
        this.b = (ListView) this.a.findViewById(R.id.lv_group);
        this.c = new ArrayList();
        this.c.add(context.getString(R.string.new_driver_mode));
        this.c.add(context.getString(R.string.normal_driver_model));
        this.e = new g(context, this.c);
        this.e.a(i);
        this.b.setAdapter(this.e);
        this.d = new PopupWindow(this.a, -2, -2);
        this.d.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.radio));
        this.d.setFocusable(true);
        int[] iArr = new int[2];
        textView.getLocationOnScreen(iArr);
        this.d.showAtLocation(textView, 0, iArr[0], iArr[1]);
        this.b.setOnItemClickListener(this.h);
    }
}
