package com.fimi.soul.module.setting.newhand;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class NewHandFiveFragment extends BaseNewHandFragment {
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

    private SpannableString a(int i) {
        String string = getString(i);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.white)), string.length() - 2, string.length(), 33);
        return spannableString;
    }

    protected View a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_newhand_five, null);
    }

    protected void a() {
        this.c.setText("5");
        this.e.setText(R.string.about_right_stick);
        this.i.setText(R.string.new_hand_five_tip_one);
        this.j.setText(R.string.new_hand_five_tip_two);
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
        this.l = (Button) view.findViewById(R.id.btn_next);
        this.l.setOnClickListener(this);
        this.k = (TextView) view.findViewById(R.id.tv_tip_four);
        ao.b(this.a.getAssets(), this.c, this.d);
        ao.a(this.a.getAssets(), this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    protected String b() {
        return NewHandFiveFragment.class.getName().toLowerCase();
    }

    public void onClick(View view) {
        super.onClick(view);
        if (view == this.l) {
            Log.i("zhej", "current:" + ((NewHandActivity) getActivity()).a().getCurrentItem());
            ((NewHandActivity) getActivity()).a().setCurrentItem(((NewHandActivity) getActivity()).a().getCurrentItem() + 1, true);
        }
    }
}
