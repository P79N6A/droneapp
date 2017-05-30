package com.fimi.soul.module.remote;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.module.droneui.DroneMap;
import com.fimi.soul.utils.ao;

public class RemoteMidcalingFragment extends BaseRemoteFragment {
    private RemoteEndCaliFragment f;
    private TextView g;
    private Button h;

    public void a() {
        a(R.id.midcalibrationing, R.id.errorcalifragment, getString(R.string.remote_cali_outtime), false);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onClick(View view) {
        super.onClick(view);
        if (view.getId() == R.id.black_btn && isVisible() && this.e != null) {
            this.e.a();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.remotecaliing, null);
        this.g = (TextView) inflate.findViewById(R.id.heardView).findViewById(R.id.tv_settingTitle);
        this.g.setText(R.string.calireming);
        this.h = (Button) inflate.findViewById(R.id.heardView).findViewById(R.id.black_btn);
        this.h.setOnClickListener(this);
        ao.a(getActivity().getAssets(), this.g, this.h);
        return inflate;
    }

    public void onDroneEvent(a aVar, com.fimi.soul.drone.a aVar2) {
        if (isVisible()) {
            switch (aVar) {
                case QuitCaliRemote:
                    aVar2.b((b) this);
                    return;
                case backControl:
                    if (isVisible()) {
                        com.fimi.soul.module.calibcompass.a.a().a("98");
                        if (aVar2.L().c() == (byte) 1 && aVar2.L().b() == DroneMap.n) {
                            if (this.e != null) {
                                this.e.a(R.id.midcalibrationing, R.id.endmidcalibration);
                            }
                            this.d.k();
                        }
                    }
                    if (aVar2.L().c() == (byte) 3 && aVar2.L().b() == (byte) 86) {
                        a();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
