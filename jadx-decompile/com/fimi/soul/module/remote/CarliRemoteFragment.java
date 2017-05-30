package com.fimi.soul.module.remote;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.module.setting.newhand.c;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.MidView;

public class CarliRemoteFragment extends BaseRemoteFragment {
    a f;
    private Button g;
    private Button h;
    private TextView i;
    private TextView j;
    private TextView k;
    private MidView l;
    private MidView m;

    enum a {
        jap,
        usa
    }

    public void a() {
        a(R.id.caliremotestart, R.id.errorcalifragment, getString(R.string.remote_cali_outtime), false);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.nextbutton:
                this.d.o();
                if (this.e != null) {
                    this.e.a(R.id.caliremotestart, R.id.cariremotecomple);
                    return;
                }
                return;
            case R.id.black_btn:
                if (isVisible() && this.e != null) {
                    this.e.a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.caliremotebegin, null);
        this.k = (TextView) inflate.findViewById(R.id.heardView).findViewById(R.id.tv_settingTitle);
        this.k.setText(R.string.calireming);
        this.h = (Button) inflate.findViewById(R.id.heardView).findViewById(R.id.black_btn);
        this.h.setOnClickListener(this);
        this.l = (MidView) inflate.findViewById(R.id.leftcircle).findViewById(R.id.rightremoteview);
        this.m = (MidView) inflate.findViewById(R.id.rightcircle).findViewById(R.id.rightremoteview);
        this.i = (TextView) inflate.findViewById(R.id.showtitleone);
        this.j = (TextView) inflate.findViewById(R.id.showtitletwo);
        this.g = (Button) inflate.findViewById(R.id.nextbutton);
        this.g.setOnClickListener(this);
        ao.a(getActivity().getAssets(), this.g, this.i, this.j, this.k);
        return inflate;
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        if (isVisible()) {
            switch (aVar) {
                case QuitCaliRemote:
                    aVar2.b((b) this);
                    return;
                case NEWREMOTEMODEL:
                    if (isVisible()) {
                        ad g = aVar2.g();
                        if (this.f != a.usa) {
                            if (this.f == a.jap) {
                                this.m.a((float) (((double) g.i()) * 0.0977d), (float) (((double) g.g()) * 0.0977d));
                                this.l.a((float) (((double) g.f()) * 0.0977d), (float) (((double) g.h()) * 0.0977d));
                                break;
                            }
                        }
                        this.m.a((float) (((double) g.i()) * 0.0977d), (float) (((double) g.h()) * 0.0977d));
                        this.l.a((float) (((double) g.f()) * 0.0977d), (float) (((double) g.g()) * 0.0977d));
                        break;
                    }
                    break;
                case backControl:
                    break;
                default:
                    return;
            }
            if (aVar2.L().c() != (byte) 3) {
                return;
            }
            if (aVar2.L().b() == (byte) 86 || aVar2.L().b() == c.f) {
                a();
            }
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z && isVisible()) {
            com.fimi.kernel.d.b.b(getActivity()).a(getString(R.string.calirockertitle));
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
