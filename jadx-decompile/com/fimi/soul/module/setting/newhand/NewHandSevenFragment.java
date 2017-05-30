package com.fimi.soul.module.setting.newhand;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.a;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.m;

public class NewHandSevenFragment extends BaseNewHandFragment {
    TextView c;
    TextView d;
    TextView e;
    TextView f;
    TextView g;
    TextView h;
    TextView i;
    TextView j;
    TextView k;
    TextView l;
    TextView m;
    Button n;

    protected View a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_newhand_seven, null);
    }

    protected void a() {
        this.c.setText(m.l);
        this.e.setText(R.string.ready_flying);
        this.i.setText(R.string.new_hand_seven_tip_one);
        this.j.setText(R.string.new_hand_seven_tip_two);
        this.k.setText(R.string.new_hand_seven_tip_three);
        this.m.setText(R.string.new_hand_seven_tip_four);
        this.n.setOnClickListener(this);
    }

    protected void a(View view) {
        this.c = (TextView) view.findViewById(R.id.tv_seq);
        this.d = (TextView) view.findViewById(R.id.tv_total);
        this.e = (TextView) view.findViewById(R.id.tv_title);
        this.f = (TextView) view.findViewById(R.id.tv_number_one);
        this.i = (TextView) view.findViewById(R.id.tv_tip_one);
        this.g = (TextView) view.findViewById(R.id.tv_number_two);
        this.j = (TextView) view.findViewById(R.id.tv_tip_two);
        this.h = (TextView) view.findViewById(R.id.tv_number_three);
        this.k = (TextView) view.findViewById(R.id.tv_tip_three);
        this.l = (TextView) view.findViewById(R.id.tv_number_four);
        this.m = (TextView) view.findViewById(R.id.tv_tip_four);
        this.n = (Button) view.findViewById(R.id.btn_next);
        ao.b(this.a.getAssets(), this.c, this.d);
        ao.a(this.a.getAssets(), this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.n, this.l, this.m);
    }

    protected String b() {
        return NewHandSevenFragment.class.getName().toLowerCase();
    }

    public void onClick(View view) {
        super.onClick(view);
        if (view == this.n) {
            c.c().a(a.s, true);
            if (c.c().d(a.L)) {
                getActivity().finish();
                return;
            }
            startActivity(new Intent(getActivity(), FlightActivity.class));
            getActivity().finish();
        }
    }
}
