package com.fimi.soul.module.setting.newhand;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class NewHandTwoFragment extends BaseNewHandFragment {
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
    LoopWidget o;

    protected View a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_newhand_two, null);
    }

    protected void a() {
        this.c.setText("2");
        this.e.setText(R.string.new_hand_take_care);
        this.i.setText(R.string.new_hand_two_tip_one);
        this.j.setText(R.string.new_hand_two_tip_two);
        this.k.setText(R.string.new_hand_two_tip_three);
        this.m.setText(R.string.new_hand_two_tip_four);
        this.n.setOnClickListener(this);
        int[] iArr = new int[]{R.drawable.newhand_pic_one, R.drawable.newhand_pic_two, R.drawable.newhand_pic_three, R.drawable.newhand_pic_four_en};
        this.o.setVisibility(0);
        this.o.setImagesRes(iArr);
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
        this.n = (Button) view.findViewById(R.id.btn_next);
        this.l = (TextView) view.findViewById(R.id.tv_number_four);
        this.m = (TextView) view.findViewById(R.id.tv_tip_four);
        this.o = (LoopWidget) view.findViewById(R.id.kanner);
        ao.b(this.a.getAssets(), this.c, this.d);
        ao.a(this.a.getAssets(), this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    protected String b() {
        return NewHandTwoFragment.class.getName().toLowerCase();
    }

    public void onClick(View view) {
        super.onClick(view);
        if (view == this.n) {
            ((NewHandActivity) getActivity()).a().setCurrentItem(((NewHandActivity) getActivity()).a().getCurrentItem() + 1, true);
        }
    }
}
