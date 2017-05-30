package com.fimi.soul.module.setting.newhand;

import android.graphics.drawable.AnimationDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class NewHandThreeFragment extends BaseNewHandFragment {
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
    private ImageView o;

    protected View a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_newhand_three, null);
    }

    protected void a() {
        this.c.setText("3");
        this.e.setText(R.string.new_hand_about_drone);
        this.i.setText(R.string.new_hand_three_tip_one);
        this.j.setText(R.string.new_hand_three_tip_two);
        this.k.setText(R.string.new_hand_three_tip_three);
        this.n.setOnClickListener(this);
    }

    protected void a(View view) {
        this.o = (ImageView) view.findViewById(R.id.left_iv);
        this.o.setBackgroundResource(R.drawable.newhand_three_anim);
        ((AnimationDrawable) this.o.getBackground()).start();
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
        this.l = (TextView) view.findViewById(R.id.tv_plane_header);
        this.m = (TextView) view.findViewById(R.id.tv_plane_tail);
        ao.b(this.a.getAssets(), this.c, this.d);
        ao.a(this.a.getAssets(), this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.n, this.l, this.m);
    }

    protected String b() {
        return NewHandThreeFragment.class.getName().toLowerCase();
    }

    public void onClick(View view) {
        super.onClick(view);
        if (view == this.n) {
            Log.i("zhej", "current:" + ((NewHandActivity) getActivity()).a().getCurrentItem());
            ((NewHandActivity) getActivity()).a().setCurrentItem(((NewHandActivity) getActivity()).a().getCurrentItem() + 1, true);
        }
    }
}
