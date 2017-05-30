package com.fimi.soul.module.setting.newhand;

import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;
import java.util.Timer;

public class NewHandOneFragment extends BaseNewHandFragment {
    private static a n;
    TextView c;
    TextView d;
    TextView e;
    TextView f;
    TextView g;
    TextView h;
    TextView i;
    TextView j;
    TextView k;
    Button l;
    private ImageView m;
    private boolean o = false;
    private Timer p;
    private AnimationDrawable q = null;

    public static NewHandOneFragment a(a aVar) {
        n = aVar;
        return new NewHandOneFragment();
    }

    protected View a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_newhand_one, null);
    }

    protected void a() {
        this.c.setText("1");
        this.e.setText(R.string.new_hand_mode);
        this.j.setText(R.string.new_hand_one_tip_two);
        this.k.setText(R.string.new_hand_one_tip_three);
        this.l.setText(R.string.new_hand_next);
        this.l.setOnClickListener(this);
    }

    protected void a(View view) {
        this.m = (ImageView) view.findViewById(R.id.img_left);
        this.m.setBackgroundResource(R.drawable.img_guide_fly_scope_en);
        this.c = (TextView) view.findViewById(R.id.tv_seq);
        this.d = (TextView) view.findViewById(R.id.tv_total);
        this.e = (TextView) view.findViewById(R.id.tv_title);
        this.f = (TextView) view.findViewById(R.id.tv_number_one);
        this.g = (TextView) view.findViewById(R.id.tv_number_two);
        this.j = (TextView) view.findViewById(R.id.tv_tip_two);
        this.h = (TextView) view.findViewById(R.id.tv_number_three);
        this.k = (TextView) view.findViewById(R.id.tv_tip_three);
        this.l = (Button) view.findViewById(R.id.btn_next);
        ao.b(this.a.getAssets(), this.c, this.d);
        ao.a(this.a.getAssets(), this.e, this.f, this.g, this.h, this.j, this.k, this.l);
    }

    protected String b() {
        return NewHandOneFragment.class.getName().toLowerCase();
    }

    public void onClick(View view) {
        super.onClick(view);
        if (view == this.l) {
            ((NewHandActivity) getActivity()).a().setCurrentItem(((NewHandActivity) getActivity()).a().getCurrentItem() + 1, true);
        }
    }
}
