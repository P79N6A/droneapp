package com.fimi.soul.module.remote;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.MidView;

public class RemoteBeginMidCaFragment extends BaseRemoteFragment {
    public DroidPlannerApp f;
    a g;
    private TextView h;
    private Button i;
    private Button j;
    private MidView k;
    private MidView l;
    private com.fimi.soul.drone.a m;

    enum a {
        jap,
        usa
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f = (DroidPlannerApp) activity.getApplication();
        this.m = this.f.a;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.nextbutton:
                if (!this.m.T().a()) {
                    z.a(this.a, this.a.getString(R.string.cali_fail_please_connect_remote), z.b);
                    return;
                } else if (this.m.U()) {
                    z.a(this.a, this.a.getString(R.string.close_plane_to_remote_cali), z.b);
                    return;
                } else {
                    this.d.l();
                    this.c.beginTransaction().hide(this.c.findFragmentById(R.id.beginmidcalibration)).commit();
                    this.c.beginTransaction().show(this.c.findFragmentById(R.id.midcalibrationing)).commit();
                    return;
                }
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.beginmidcalibration, null);
        this.h = (TextView) inflate.findViewById(R.id.heardView).findViewById(R.id.tv_settingTitle);
        this.h.setText(R.string.calireming);
        this.j = (Button) inflate.findViewById(R.id.headview).findViewById(R.id.back_btn);
        this.k = (MidView) inflate.findViewById(R.id.rightVew);
        this.l = (MidView) inflate.findViewById(R.id.leftView);
        this.i = (Button) inflate.findViewById(R.id.nextbutton);
        this.i.setOnClickListener(this);
        this.j.setOnClickListener(this);
        ao.a(getActivity().getAssets(), this.h, this.j, this.i);
        return inflate;
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        if (isVisible()) {
            switch (aVar) {
                case NEWREMOTEMODEL:
                    if (isVisible()) {
                        ad g = aVar2.g();
                        if (this.g == a.jap) {
                            this.l.a((float) (((double) g.f()) * 0.0977d), (float) (((double) g.h()) * 0.0977d));
                            this.k.a((float) (((double) g.i()) * 0.0977d), (float) (((double) g.g()) * 0.0977d));
                            return;
                        } else if (this.g == a.usa) {
                            this.k.a((float) (((double) g.i()) * 0.0977d), (float) (((double) g.h()) * 0.0977d));
                            this.l.a((float) (((double) g.f()) * 0.0977d), (float) (((double) g.g()) * 0.0977d));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void onStart() {
        super.onStart();
        if (v.a(getActivity()).a().getInt(RemoteModelActivity.a, 0) == 0) {
            this.g = a.usa;
        } else {
            this.g = a.jap;
        }
    }
}
