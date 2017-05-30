package com.fimi.soul.module.remote;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.MidView;
import com.fimi.soul.view.RemoteRollerView;
import com.google.android.gms.location.places.d;
import com.tencent.open.yyb.TitleBar;
import it.a.a.e;

public class RemoteRollerFragment extends BaseRemoteFragment {
    MidView f;
    MidView g;
    a h;
    private TextView i;
    private TextView j;
    private TextView k;
    private Button l;
    private Button m;
    private RemoteRollerView n;
    private RemoteRollerView o;
    private RemoteRollerView p;
    private RemoteRollerView q;

    enum a {
        jap,
        usa
    }

    public void a() {
        if (this.b.U()) {
            if (this.b.ac()) {
                this.j.setText(R.string.calremotewaringfly);
            } else {
                this.j.setText(R.string.remotewaring);
            }
            this.l.setEnabled(false);
            a(this.l, 77);
            this.k.setVisibility(4);
        } else if (this.b.T().a()) {
            if (!this.l.isEnabled()) {
                b.b(getActivity()).a(getString(R.string.reminder_calibration_canStart));
            }
            this.l.setEnabled(true);
            a(this.l, e.F);
            this.j.setText(R.string.remote_roller_title_one);
            this.k.setVisibility(0);
        } else {
            this.l.setEnabled(false);
            a(this.l, 77);
            this.j.setText(R.string.disconremote);
            this.k.setVisibility(4);
        }
    }

    public void a(View view) {
        this.l = (Button) view.findViewById(R.id.nextbutton);
        this.l.setOnClickListener(this);
        this.l.setEnabled(false);
        this.n = (RemoteRollerView) view.findViewById(R.id.left_up_arrow);
        this.o = (RemoteRollerView) view.findViewById(R.id.left_down_arrow);
        this.p = (RemoteRollerView) view.findViewById(R.id.right_up_arrow);
        this.q = (RemoteRollerView) view.findViewById(R.id.right_down_arrow);
        this.n.setInitView(0);
        this.o.setInitView(1);
        this.p.setInitView(2);
        this.q.setInitView(3);
        this.n.setSweep(TitleBar.TITLEBAR_HEIGHT);
        this.o.setSweep(1.0f);
        this.p.setSweep(TitleBar.TITLEBAR_HEIGHT);
        this.q.setSweep(1.0f);
        this.i.setText(R.string.calibrate_remote);
        ao.a(getActivity().getAssets(), this.m, this.i, this.j, this.k, this.l);
        a();
    }

    public void a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.nextbutton:
                if (!this.b.T().a()) {
                    z.a(this.a, this.a.getString(R.string.cali_fail_please_connect_remote), z.b);
                    return;
                } else if (this.b.U()) {
                    z.a(this.a, this.a.getString(R.string.close_plane_to_remote_cali), z.b);
                    return;
                } else {
                    this.d.l();
                    if (this.e != null) {
                        this.e.a(R.id.remote_roller_fragment, R.id.midcalibrationing);
                        return;
                    }
                    return;
                }
            case R.id.black_btn:
                this.d.m();
                getActivity().finish();
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_remote_roller, null);
        this.f = (MidView) inflate.findViewById(R.id.leftview).findViewById(R.id.rightremoteview);
        this.g = (MidView) inflate.findViewById(R.id.rightview).findViewById(R.id.rightremoteview);
        this.m = (Button) inflate.findViewById(R.id.heardView).findViewById(R.id.black_btn);
        this.m.setOnClickListener(this);
        this.i = (TextView) inflate.findViewById(R.id.heardView).findViewById(R.id.tv_settingTitle);
        this.j = (TextView) inflate.findViewById(R.id.showtitleone);
        this.k = (TextView) inflate.findViewById(R.id.showtitletwo);
        a(inflate);
        return inflate;
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        float f = TitleBar.TITLEBAR_HEIGHT;
        float f2 = 1.0f;
        super.onDroneEvent(aVar, aVar2);
        if (aVar == com.fimi.soul.drone.d.a.CLEANALLOBJ) {
            a();
        }
        if (isVisible()) {
            switch (aVar) {
                case NEWREMOTEMODEL:
                    ad g = aVar2.g();
                    if (this.h == a.jap) {
                        this.f.a((float) (((double) g.f()) * 0.0977d), (float) (((double) g.h()) * 0.0977d));
                        this.g.a((float) (((double) g.i()) * 0.0977d), (float) (((double) g.g()) * 0.0977d));
                    } else if (this.h == a.usa) {
                        this.g.a((float) (((double) g.i()) * 0.0977d), (float) (((double) g.h()) * 0.0977d));
                        this.f.a((float) (((double) g.f()) * 0.0977d), (float) (((double) g.g()) * 0.0977d));
                    }
                    int d = g.d() > (short) 50 ? g.d() : g.d();
                    short e = g.e() > (short) 50 ? g.e() : g.e();
                    if (d >= 992) {
                        d = d.bp;
                    }
                    int i = (int) (((double) d) * 0.0977d);
                    if (e >= (short) 992) {
                        d = d.bp;
                    } else {
                        short s = e;
                    }
                    int i2 = (int) (((double) d) * 0.0977d);
                    this.n.setSweep(i > 50 ? (float) i : TitleBar.TITLEBAR_HEIGHT);
                    this.o.setSweep(i < 50 ? (float) (50 - i) : 1.0f);
                    RemoteRollerView remoteRollerView = this.p;
                    if (i2 > 50) {
                        f = (float) i2;
                    }
                    remoteRollerView.setSweep(f);
                    remoteRollerView = this.q;
                    if (i2 < 50) {
                        f2 = (float) (50 - i2);
                    }
                    remoteRollerView.setSweep(f2);
                    return;
                case Remotecontrol:
                    a();
                    return;
                default:
                    return;
            }
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.l.setEnabled(false);
    }

    public void onStart() {
        super.onStart();
        if (v.a(getActivity()).a().getInt(RemoteModelActivity.a, 0) == 0) {
            this.h = a.usa;
        } else {
            this.h = a.jap;
        }
    }
}
