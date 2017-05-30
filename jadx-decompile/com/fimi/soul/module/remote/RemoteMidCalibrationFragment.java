package com.fimi.soul.module.remote;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.MidView;

public class RemoteMidCalibrationFragment extends BaseRemoteFragment {
    a f;
    private PercentRelativeLayout g;
    private Button h;
    private Button i;
    private TextView j;
    private TextView k;
    private TextView l;
    private MidView m;
    private MidView n;

    enum a {
        jap,
        usa
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.nextbutton:
                this.c.beginTransaction().hide(this.c.findFragmentById(R.id.midcalibreation)).commit();
                this.c.beginTransaction().show(this.c.findFragmentById(R.id.remote_roller_fragment)).commit();
                return;
            case R.id.black_btn:
                this.d.m();
                getActivity().finish();
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.midcalibration, null);
        this.g = (PercentRelativeLayout) inflate.findViewById(R.id.heardView);
        this.m = (MidView) inflate.findViewById(R.id.leftremoteview);
        this.n = (MidView) inflate.findViewById(R.id.rightremoteview);
        this.k = (TextView) inflate.findViewById(R.id.showtitleone);
        this.l = (TextView) inflate.findViewById(R.id.showtitletwo);
        this.h = (Button) this.g.findViewById(R.id.black_btn);
        this.h.setOnClickListener(this);
        this.j = (TextView) this.g.findViewById(R.id.tv_settingTitle);
        this.j.setText(R.string.calibration_remote);
        this.i = (Button) inflate.findViewById(R.id.nextbutton);
        this.i.setOnClickListener(this);
        ao.a(getActivity().getAssets(), this.j, this.i, this.k, this.l);
        return inflate;
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        if (isVisible()) {
            switch (aVar) {
                case NEWREMOTEMODEL:
                    ad g = aVar2.g();
                    if (this.f == a.jap) {
                        this.m.a((float) (((double) g.f()) * 0.0977d), (float) (((double) g.h()) * 0.0977d));
                        this.n.a((float) (((double) g.i()) * 0.0977d), (float) (((double) g.g()) * 0.0977d));
                        return;
                    } else if (this.f == a.usa) {
                        this.n.a((float) (((double) g.i()) * 0.0977d), (float) (((double) g.h()) * 0.0977d));
                        this.m.a((float) (((double) g.f()) * 0.0977d), (float) (((double) g.g()) * 0.0977d));
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public void onStart() {
        super.onStart();
        if (v.a(getActivity()).a().getInt(RemoteModelActivity.a, 0) == 0) {
            this.f = a.usa;
        } else {
            this.f = a.jap;
        }
    }
}
