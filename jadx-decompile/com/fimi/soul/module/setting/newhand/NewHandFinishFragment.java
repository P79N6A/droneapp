package com.fimi.soul.module.setting.newhand;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.a;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.ao;

public class NewHandFinishFragment extends BaseNewHandFragment {
    TextView c;
    TextView d;
    Button e;
    Button f;

    protected View a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_newhand_finish, null);
    }

    protected void a() {
    }

    protected void a(View view) {
        this.c = (TextView) view.findViewById(R.id.tv_finish);
        this.d = (TextView) view.findViewById(R.id.tv_content);
        this.e = (Button) view.findViewById(R.id.btn_study_again);
        this.e.setOnClickListener(this);
        this.f = (Button) view.findViewById(R.id.btn_try_fly);
        this.f.setOnClickListener(this);
        ao.a(this.a.getAssets(), this.c, this.d, this.e, this.f);
    }

    protected String b() {
        return NewHandFiveFragment.class.getName().toLowerCase();
    }

    public void onClick(View view) {
        super.onClick(view);
        if (view == this.e) {
            Fragment newHandOneFragment = new NewHandOneFragment();
            this.b.beginTransaction().replace(R.id.root_layout, newHandOneFragment, newHandOneFragment.b()).commitAllowingStateLoss();
        }
        if (view == this.f) {
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
