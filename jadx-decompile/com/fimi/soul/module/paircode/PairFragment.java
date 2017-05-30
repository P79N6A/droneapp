package com.fimi.soul.module.paircode;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.drone.c.a.a.t;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.utils.ao;

public class PairFragment extends Fragment implements OnClickListener, b, a {
    public static final int a = 2;
    public static final int b = 16;
    View c;
    private RelativeLayout d;
    private RelativeLayout e;
    private RelativeLayout f;
    private TextView g;
    private PairCodeActivity h;

    enum a {
        in_sky,
        no_connected,
        prepared
    }

    private void a() {
        t tVar = new t();
        tVar.a((byte) 8);
        tVar.a(d.a().k());
        this.h.drone.T().a(tVar.a());
        PairCodeActivity pairCodeActivity = this.h;
        PairCodeActivity.a = true;
    }

    private void a(a aVar) {
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        switch (aVar) {
            case in_sky:
                this.d.setVisibility(0);
                return;
            case no_connected:
                this.e.setVisibility(0);
                return;
            case prepared:
                this.f.setVisibility(0);
                ((Button) this.c.findViewById(R.id.pre_pair_btn)).setOnClickListener(this);
                return;
            default:
                return;
        }
    }

    public void a(int i) {
        switch (i) {
            case 2:
                a(a.no_connected);
                return;
            case 16:
                if (this.h.drone.ac()) {
                    a(a.in_sky);
                    return;
                } else {
                    a(a.prepared);
                    return;
                }
            default:
                return;
        }
    }

    public void a(int i, int i2) {
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.h = (PairCodeActivity) activity;
        this.h.a((a) this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.pre_pair_btn:
                if (this.h.drone.T().a()) {
                    a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = layoutInflater.inflate(R.layout.pair_status_layout, null);
        this.d = (RelativeLayout) this.c.findViewById(R.id.sky_layout);
        this.e = (RelativeLayout) this.c.findViewById(R.id.connect_layout);
        this.f = (RelativeLayout) this.c.findViewById(R.id.prepare_layout);
        this.g = (TextView) this.c.findViewById(R.id.pair_des);
        return this.c;
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        if (aVar2.U() && aVar2.T().a()) {
            switch (aVar) {
                case FLY_INSKY:
                    if (aVar2.ac()) {
                        a(a.in_sky);
                        return;
                    } else {
                        a(a.prepared);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (d.a().k()) {
            this.g.setText(getString(R.string.paircode_step_des_4k));
        } else {
            this.g.setText(getString(R.string.paircode_step_des));
        }
        ao.a(this.h.getAssets(), this.g);
        if (!this.h.drone.T().a()) {
            a(a.no_connected);
        } else if (this.h.drone.ac()) {
            a(a.in_sky);
        } else {
            a(a.prepared);
        }
    }

    public void onStart() {
        super.onStart();
        this.h.drone.a((b) this);
    }

    public void onStop() {
        super.onStop();
        this.h.drone.b((b) this);
    }
}
