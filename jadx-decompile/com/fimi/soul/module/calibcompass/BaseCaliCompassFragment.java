package com.fimi.soul.module.calibcompass;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.module.b.d;

public class BaseCaliCompassFragment extends Fragment implements OnClickListener, b {
    protected Context a;
    protected com.fimi.soul.drone.a b;
    protected FragmentManager c;
    protected d d;
    protected a e;

    protected interface a {
        void a();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.e = (a) activity;
        this.a = activity.getApplicationContext();
        this.b = ((DroidPlannerApp) activity.getApplication()).a;
        this.c = getFragmentManager();
        this.d = d.a(this.b);
    }

    public void onClick(View view) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDetach() {
        super.onDetach();
        if (this.e != null) {
            this.e = null;
        }
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
    }

    public void onStart() {
        super.onStart();
        this.b.a((b) this);
    }

    public void onStop() {
        super.onStop();
        this.b.b((b) this);
    }
}
