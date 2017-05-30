package com.fimi.soul.module.calibcompass;

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
import com.fimi.soul.drone.h.j;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;

public class CaliCompassSecondFragment extends BaseCaliCompassFragment {
    private TextView f;
    private TextView g;
    private Button h;
    private Button i;
    private Handler j = new Handler(this) {
        final /* synthetic */ CaliCompassSecondFragment a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            d.a(this.a.b).b((byte) 1, (byte) 1, (byte) 3);
        }
    };

    private void a(View view) {
        this.f = (TextView) view.findViewById(R.id.tv_settingTitle);
        this.f.setText(R.string.compass_hor_calibration);
        this.g = (TextView) view.findViewById(R.id.showtitleone);
        this.h = (Button) view.findViewById(R.id.black_btn);
        this.h.setOnClickListener(this);
        this.i = (Button) view.findViewById(R.id.nextstep);
        this.i.setOnClickListener(this);
        ao.a(getActivity().getAssets(), this.f, this.g, this.i, this.h);
    }

    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.black_btn:
                if (this.e != null) {
                    this.e.a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.cali_compass_second, null);
        a(inflate);
        return inflate;
    }

    public void onDroneEvent(a aVar, com.fimi.soul.drone.a aVar2) {
        super.onDroneEvent(aVar, aVar2);
        if (isVisible() && aVar == a.CaliCompass) {
            j i = aVar2.i();
            if (i.d() == (byte) 2 && i.e() == (byte) 1 && i.b() == (byte) 1 && i.c() == (byte) 1) {
                a.a().a("153");
                this.c.beginTransaction().hide(this).show(this.c.findFragmentByTag("thrid")).commitAllowingStateLoss();
            }
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            this.j.sendEmptyMessageDelayed(0, 2000);
        }
    }
}
