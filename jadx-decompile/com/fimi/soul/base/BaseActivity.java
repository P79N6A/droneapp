package com.fimi.soul.base;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.fimi.kernel.utils.v;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.d.b;
import com.xiaomi.mistatistic.sdk.MiStatInterface;

@SuppressLint({"NewApi"})
@TargetApi(11)
public class BaseActivity extends BaseFimiActivity implements b {
    public DroidPlannerApp dpa;
    public a drone;
    protected v preferencesUtil;
    public com.fimi.kernel.d.b speakTTs;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dpa = (DroidPlannerApp) getApplication();
        this.drone = this.dpa.a;
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        this.preferencesUtil = v.a((Context) this);
        this.speakTTs = com.fimi.kernel.d.b.a((Context) this);
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    public void onDroneEvent(d.a aVar, a aVar2) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    protected void onPause() {
        super.onPause();
        MiStatInterface.recordPageEnd();
    }

    protected void onResume() {
        super.onResume();
        MiStatInterface.recordPageStart(this, getTitle() != null ? getTitle().toString() : "");
    }

    protected void onStart() {
        super.onStart();
        this.drone.a((b) this);
    }

    protected void onStop() {
        super.onStop();
        this.drone.b((b) this);
    }

    public void setContentView(int i) {
        setAbContentView(i);
    }
}
