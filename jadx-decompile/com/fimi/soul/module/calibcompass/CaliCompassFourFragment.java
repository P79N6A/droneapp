package com.fimi.soul.module.calibcompass;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.c.c;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.entity.CheckCampssBeann;
import com.fimi.soul.module.b.d;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.utils.ao;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.a.a.a;
import java.util.List;

public class CaliCompassFourFragment extends BaseCaliCompassFragment {
    private TextView f;
    private TextView g;
    private TextView h;
    private Button i;
    private boolean j;
    private Handler k = new Handler();
    private Runnable l = new Runnable(this) {
        final /* synthetic */ CaliCompassFourFragment a;

        {
            this.a = r1;
        }

        public void run() {
            if (this.a.j) {
                Intent intent = new Intent(this.a.getActivity(), LoginActivity.class);
                intent.putExtra(a.k, false);
                this.a.startActivity(intent);
                this.a.getActivity().finish();
                return;
            }
            this.a.getActivity().setResult(0);
            this.a.getActivity().finish();
        }
    };

    private void a(View view) {
        this.f = (TextView) view.findViewById(R.id.title);
        this.g = (TextView) view.findViewById(R.id.descompass);
        this.h = (TextView) view.findViewById(R.id.descompasscom);
        this.i = (Button) view.findViewById(R.id.endcalicompass);
        this.i.setOnClickListener(this);
        ao.a(getActivity().getAssets(), this.f, this.g, this.h, this.i);
    }

    public void a() {
        d.a(this.b).a((byte) 1, (byte) 1, (byte) 4);
        getActivity().finish();
    }

    public void a(boolean z) {
        this.j = z;
    }

    public void onClick(View view) {
        super.onClick(view);
        if (view.getId() == R.id.endcalicompass) {
            this.k.postDelayed(this.l, 300);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.cali_compass_four, null);
        a(inflate);
        return inflate;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z && isVisible()) {
            Object obj;
            List listLatlng;
            CheckCampssBeann checkCampssBeann = (CheckCampssBeann) c.a().a(com.fimi.soul.drone.g.c.Z, CheckCampssBeann.class);
            if (checkCampssBeann != null) {
                obj = checkCampssBeann;
                listLatlng = checkCampssBeann.getListLatlng();
            } else {
                obj = new CheckCampssBeann();
                listLatlng = obj.getListLatlng();
            }
            Location c = MyLocationManager.a(getActivity()).c();
            if (c != null) {
                listLatlng.add(new LatLng(c.getLatitude(), c.getLongitude()));
                obj.setListLatlng(listLatlng);
                c.a().a(com.fimi.soul.drone.g.c.Z, obj);
            }
        }
    }

    public void onResume() {
        super.onResume();
    }
}
