package com.fimi.soul.module.setting.newhand;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.a;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.ao;

public abstract class BaseNewHandFragment extends Fragment implements OnClickListener {
    protected Context a;
    protected FragmentManager b;
    private TextView c;

    protected abstract View a(LayoutInflater layoutInflater);

    protected abstract void a();

    protected abstract void a(View view);

    protected abstract String b();

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = activity.getApplicationContext();
        this.b = getFragmentManager();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.newhand_skip_tv:
                c.c().a(a.s, true);
                if (c.c().d(a.L)) {
                    getActivity().finish();
                    return;
                }
                startActivity(new Intent(getActivity(), FlightActivity.class));
                getActivity().finish();
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View a = a(layoutInflater);
        a(a);
        a();
        this.c = (TextView) a.findViewById(R.id.newhand_skip_tv);
        this.c.setOnClickListener(this);
        ao.a(getActivity().getAssets(), this.c);
        return a;
    }
}
