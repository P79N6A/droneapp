package com.fimi.soul.base;

import android.app.Activity;
import com.fimi.kernel.BaseFragment;
import com.fimi.soul.drone.a;

public abstract class BaseDroneFragment extends BaseFragment {
    private DroidPlannerApp a;

    public DroidPlannerApp d() {
        return this.a;
    }

    protected a e() {
        return d().a;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (DroidPlannerApp) activity.getApplication();
    }
}
