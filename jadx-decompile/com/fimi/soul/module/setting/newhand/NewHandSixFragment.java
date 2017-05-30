package com.fimi.soul.module.setting.newhand;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class NewHandSixFragment extends BaseNewHandFragment {
    TextView c;
    TextView d;
    TextView e;
    TextView f;
    TextView g;
    TextView h;
    TextView i;
    TextView j;
    Button k;

    protected View a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_newhand_six, null);
    }

    protected void a() {
        this.c.setText("6");
        this.e.setText(R.string.about_motor);
        this.i.setText(R.string.new_hand_six_tip_one);
        this.j.setText(R.string.new_hand_six_tip_two);
        this.k.setOnClickListener(this);
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
        this.k = (Button) view.findViewById(R.id.btn_next);
        ao.b(this.a.getAssets(), this.c, this.d);
        ao.a(this.a.getAssets(), this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    protected String b() {
        return NewHandSixFragment.class.getName().toLowerCase();
    }

    public void onClick(View view) {
        super.onClick(view);
        if (view == this.k) {
            Log.i("zhej", "current:" + ((NewHandActivity) getActivity()).a().getCurrentItem());
            ((NewHandActivity) getActivity()).a().setCurrentItem(((NewHandActivity) getActivity()).a().getCurrentItem() + 1, true);
        }
    }
}
