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
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.utils.ao;

public class RemoteEndCaliFragment extends BaseRemoteFragment {
    private Button f;
    private TextView g;
    private Button h;
    private Handler i = new Handler(this) {
        final /* synthetic */ RemoteEndCaliFragment a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (this.a.e != null) {
                this.a.e.a(R.id.endmidcalibration, R.id.caliremotestart);
            }
        }
    };

    public void a() {
        a(R.id.endmidcalibration, R.id.errorcalifragment, getString(R.string.remote_cali_outtime), false);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onClick(View view) {
        switch (view.getId()) {
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
        View inflate = layoutInflater.inflate(R.layout.endremotecalibation, null);
        this.g = (TextView) inflate.findViewById(R.id.heardView).findViewById(R.id.tv_settingTitle);
        this.g.setText(R.string.calireming);
        this.h = (Button) inflate.findViewById(R.id.heardView).findViewById(R.id.black_btn);
        this.h.setOnClickListener(this);
        this.f = (Button) inflate.findViewById(R.id.nextbutton);
        this.f.setOnClickListener(this);
        ao.a(getActivity().getAssets(), this.g, this.h, this.f);
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
                        if (aVar2.L().c() == (byte) 3 && aVar2.L().b() == (byte) 86) {
                            a();
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            this.i.sendEmptyMessageDelayed(0, 2000);
        }
    }
}
