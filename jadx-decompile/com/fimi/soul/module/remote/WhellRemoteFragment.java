package com.fimi.soul.module.remote;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.module.setting.newhand.c;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.RemoteRollerView;
import com.tencent.open.yyb.TitleBar;

public class WhellRemoteFragment extends BaseRemoteFragment {
    private TextView f;
    private TextView g;
    private TextView h;
    private Button i;
    private Button j;
    private RemoteRollerView k;
    private RemoteRollerView l;
    private RemoteRollerView m;
    private RemoteRollerView n;
    private boolean o;
    private final int p = 1;
    private Handler q = new Handler(this) {
        final /* synthetic */ WhellRemoteFragment a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (!this.a.o) {
                b.b(this.a.getActivity()).a(this.a.getString(R.string.caliwhell));
            }
        }
    };

    public void a(boolean z, String str) {
        if (this.q.hasMessages(1)) {
            this.q.removeMessages(1);
        }
        if (z) {
            a(R.id.cariremotecomple, R.id.errorcalifragment, "", z);
        } else {
            a(R.id.cariremotecomple, R.id.errorcalifragment, str, z);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.nextbutton:
                this.d.p();
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
        View inflate = layoutInflater.inflate(R.layout.whellcalicomplete, null);
        this.h = (TextView) inflate.findViewById(R.id.heardView).findViewById(R.id.tv_settingTitle);
        this.h.setText(R.string.calireming);
        this.j = (Button) inflate.findViewById(R.id.heardView).findViewById(R.id.black_btn);
        this.j.setOnClickListener(this);
        this.f = (TextView) inflate.findViewById(R.id.showtitleone);
        this.g = (TextView) inflate.findViewById(R.id.showtitletwo);
        this.i = (Button) inflate.findViewById(R.id.nextbutton);
        this.i.setOnClickListener(this);
        this.k = (RemoteRollerView) inflate.findViewById(R.id.left_up_arrow);
        this.l = (RemoteRollerView) inflate.findViewById(R.id.left_down_arrow);
        this.m = (RemoteRollerView) inflate.findViewById(R.id.right_up_arrow);
        this.n = (RemoteRollerView) inflate.findViewById(R.id.right_down_arrow);
        this.k.setInitView(0);
        this.l.setInitView(1);
        this.m.setInitView(2);
        this.n.setInitView(3);
        this.k.setSweep(TitleBar.TITLEBAR_HEIGHT);
        this.l.setSweep(1.0f);
        this.m.setSweep(TitleBar.TITLEBAR_HEIGHT);
        this.n.setSweep(1.0f);
        ao.a(getActivity().getAssets(), this.i, this.f, this.g);
        return inflate;
    }

    public void onDroneEvent(a aVar, com.fimi.soul.drone.a aVar2) {
        super.onDroneEvent(aVar, aVar2);
        if (isVisible()) {
            switch (aVar) {
                case QuitCaliRemote:
                    aVar2.b((d.b) this);
                    return;
                case backControl:
                    com.fimi.soul.module.calibcompass.a.a().a("98");
                    if (aVar2.L().b() == (byte) 86 && aVar2.L().c() == (byte) 2 && aVar2.L().d() == (byte) 1) {
                        a(true, "");
                        return;
                    } else if (aVar2.L().c() >= (byte) 2 && aVar2.L().b() == c.f && aVar2.L().d() == (byte) 2) {
                        this.o = true;
                        a(false, getString(R.string.remote_cali_rocker_failue));
                        return;
                    } else if (aVar2.L().c() >= (byte) 2 && aVar2.L().b() == (byte) 86 && aVar2.L().d() == (byte) 2) {
                        this.o = true;
                        a(false, getString(R.string.remote_cali_roller_failue));
                        return;
                    } else if (aVar2.L().c() == (byte) 3 && aVar2.L().b() == (byte) 86) {
                        a(false, getString(R.string.remote_cali_outtime));
                        return;
                    } else {
                        return;
                    }
                case NEWREMOTEMODEL:
                    ad g = aVar2.g();
                    int d = g.d() > (short) 50 ? g.d() : g.d();
                    short e = g.e() > (short) 50 ? g.e() : g.e();
                    if (d >= 992) {
                        d = com.google.android.gms.location.places.d.bp;
                    }
                    int i = (int) (((double) d) * 0.0977d);
                    if (e >= (short) 992) {
                        d = com.google.android.gms.location.places.d.bp;
                    } else {
                        short s = e;
                    }
                    int i2 = (int) (((double) d) * 0.0977d);
                    this.k.setSweep(i > 50 ? (float) i : TitleBar.TITLEBAR_HEIGHT);
                    this.l.setSweep(i < 50 ? (float) (50 - i) : 1.0f);
                    this.m.setSweep(i2 > 50 ? (float) i2 : TitleBar.TITLEBAR_HEIGHT);
                    this.n.setSweep(i2 < 50 ? (float) (50 - i2) : 1.0f);
                    return;
                default:
                    return;
            }
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            this.o = false;
        } else {
            this.q.sendEmptyMessageDelayed(1, 2000);
        }
    }
}
