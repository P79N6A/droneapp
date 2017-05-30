package com.fimi.soul.module.remote;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.module.b.d;

public class BaseRemoteFragment extends Fragment implements OnClickListener, b {
    protected Context a;
    protected com.fimi.soul.drone.a b;
    protected FragmentManager c;
    protected d d;
    protected a e;

    protected interface a {
        void a();

        void a(int i, int i2);

        void a(int i, int i2, String str, boolean z);
    }

    protected void a(int i, int i2, String str, boolean z) {
        if (this.c.findFragmentById(R.id.errorcalifragment).isHidden() && this.e != null) {
            this.e.a(i, i2, str, z);
        }
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

    public void onDestroy() {
        super.onDestroy();
        this.b.b((b) this);
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
    }
}
