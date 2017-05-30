package com.fimi.soul.module.login;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class FirstLeadFragment extends Fragment implements OnClickListener {
    private static final int k = 1;
    private static final int l = 2;
    private static final int m = 3;
    private static final int n = 4;
    private static final int o = 5;
    private static final int p = 6;
    private static final int q = 7;
    private static final int r = 8;
    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private TextView E;
    private TextView F;
    private TextView G;
    private TextView H;
    private TextView I;
    private TextView J;
    RelativeLayout a;
    RelativeLayout b;
    RelativeLayout c;
    RelativeLayout d;
    RelativeLayout e;
    RelativeLayout f;
    RelativeLayout g;
    RelativeLayout h;
    PercentRelativeLayout i;
    a j;
    private int s = 1;
    private v t;
    private TextView u;
    private TextView v;
    private TextView w;
    private TextView x;
    private TextView y;
    private TextView z;

    public interface a {
        void k();
    }

    public a a() {
        return this.j;
    }

    void a(int i) {
        this.a.setVisibility(8);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        this.h.setVisibility(8);
        switch (i) {
            case 1:
                this.b.setVisibility(0);
                return;
            case 2:
                this.f.setVisibility(0);
                return;
            case 3:
                this.g.setVisibility(0);
                return;
            case 4:
                this.e.setVisibility(0);
                return;
            case 5:
                this.d.setVisibility(0);
                return;
            case 6:
                this.c.setVisibility(0);
                return;
            case 7:
                this.a.setVisibility(0);
                return;
            case 8:
                this.h.setVisibility(0);
                return;
            default:
                return;
        }
    }

    void a(View view) {
        this.i = (PercentRelativeLayout) view.findViewById(R.id.root_layout);
        this.a = (RelativeLayout) view.findViewById(R.id.setting_layout);
        this.b = (RelativeLayout) view.findViewById(R.id.error_status_layout);
        this.c = (RelativeLayout) view.findViewById(R.id.baoxiang_layout);
        this.d = (RelativeLayout) view.findViewById(R.id.location_layout);
        this.e = (RelativeLayout) view.findViewById(R.id.controll_status_layout);
        this.f = (RelativeLayout) view.findViewById(R.id.battery_layout);
        this.g = (RelativeLayout) view.findViewById(R.id.gsp_layout);
        this.h = (RelativeLayout) view.findViewById(R.id.modle_layout);
        this.C = (TextView) view.findViewById(R.id.error_des);
        this.D = (TextView) view.findViewById(R.id.setting_des);
        this.E = (TextView) view.findViewById(R.id.battery_des);
        this.F = (TextView) view.findViewById(R.id.gsp_des);
        this.G = (TextView) view.findViewById(R.id.controller_des);
        this.H = (TextView) view.findViewById(R.id.location_des);
        this.J = (TextView) view.findViewById(R.id.modle_des);
        this.u = (TextView) view.findViewById(R.id.error_status_title);
        this.v = (TextView) view.findViewById(R.id.setting_title);
        this.w = (TextView) view.findViewById(R.id.battery_title);
        this.x = (TextView) view.findViewById(R.id.gsp_title);
        this.y = (TextView) view.findViewById(R.id.controll_status_title);
        this.z = (TextView) view.findViewById(R.id.location_title);
        this.B = (TextView) view.findViewById(R.id.modle_title);
        ao.a(getActivity().getAssets(), this.C, this.E, this.D, this.H, this.F, this.I, this.G, this.E, this.J, this.u, this.w, this.v, this.z, this.x, this.A, this.y, this.w, this.B);
        this.i.setOnClickListener(this);
    }

    public void a(a aVar) {
        this.j = aVar;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.root_layout:
                switch (this.s) {
                    case 1:
                        this.s = 2;
                        break;
                    case 2:
                        this.s = 3;
                        break;
                    case 3:
                        this.s = 4;
                        break;
                    case 4:
                        this.s = 5;
                        break;
                    case 5:
                        this.s = 6;
                        break;
                    case 6:
                        this.s = 7;
                        break;
                    case 7:
                        this.s = 8;
                        break;
                    case 8:
                        if (this.j != null) {
                            this.j.k();
                            break;
                        }
                        break;
                    default:
                        break;
                }
            case R.id.error_status_layout:
                this.s = 2;
                break;
            case R.id.controll_status_layout:
                this.s = 5;
                break;
            case R.id.baoxiang_layout:
                this.s = 7;
                break;
            case R.id.location_layout:
                this.s = 6;
                break;
            case R.id.gsp_layout:
                this.s = 4;
                break;
            case R.id.setting_layout:
                this.s = 8;
                break;
            case R.id.battery_layout:
                this.s = 3;
                break;
            case R.id.modle_layout:
                if (this.j != null) {
                    this.j.k();
                    break;
                }
                break;
        }
        a(this.s);
        this.t.a().edit().putInt("curModel", this.s).commit();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = View.inflate(getActivity(), R.layout.lead_layout, null);
        a(inflate);
        return inflate;
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        super.onStart();
        this.t = v.a(getActivity());
        this.s = this.t.a().getInt("curModel", 1);
        a(this.s);
    }
}
