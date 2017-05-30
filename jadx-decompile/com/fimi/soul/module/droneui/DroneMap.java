package com.fimi.soul.module.droneui;

import android.app.Activity;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.biz.manager.MyLocationManager.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.d.b;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.f;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.g;

public abstract class DroneMap extends SupportMapFragment implements a, b, f {
    public static int l = 20;
    public static final byte m = (byte) 80;
    public static final byte n = (byte) 82;
    public static final byte o = (byte) 67;
    public static int p = 0;
    public static final int q = 3;
    public static int r = 0;
    private boolean a = true;
    private g b;
    protected c j;
    public com.fimi.soul.drone.a k;

    private void a(LatLng latLng) {
        this.b = this.j.a(new MarkerOptions().a(latLng).a(com.google.android.gms.maps.model.b.a(R.drawable.ic_wp_home)));
        this.b.a(1.0f, 0.5f);
    }

    public void a(Location location) {
        if (this.j != null && location != null && location.getLatitude() != 0.0d && location.getLongitude() != 0.0d) {
            this.k.a(location);
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            if (!(this.k.U() || this.k.ao())) {
                this.k.f(true);
                this.j.a(com.google.android.gms.maps.b.a(latLng, 18.0f));
            }
            if (this.b == null) {
                a(latLng);
                return;
            }
            if (!this.b.k()) {
                this.b.a();
                a(latLng);
            }
            this.b.a(latLng);
        }
    }

    public void b(c cVar) {
        if (cVar != null) {
            this.j = cVar;
            this.k.a(this.j);
        }
    }

    public void c() {
        super.onDestroy();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.k = ((DroidPlannerApp) getActivity().getApplication()).a;
        MyLocationManager.a(getActivity()).a((a) this);
        a((f) this);
        return onCreateView;
    }

    public void onDroneEvent(d.a aVar, com.fimi.soul.drone.a aVar2) {
        switch (aVar) {
            case HEARDATA:
                aVar2.r();
                l = aVar2.aj().e();
                return;
            default:
                return;
        }
    }

    public void onResume() {
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.k.a((b) this);
    }

    public void onStop() {
        super.onStop();
        this.k.b((b) this);
    }
}
