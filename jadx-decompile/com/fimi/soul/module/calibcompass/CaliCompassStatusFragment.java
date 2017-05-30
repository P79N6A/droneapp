package com.fimi.soul.module.calibcompass;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.h.j;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;
import it.a.a.e;

public class CaliCompassStatusFragment extends BaseCaliCompassFragment {
    private TextView f;
    private TextView g;
    private Button h;
    private Button i;
    private boolean j;

    public void a(int i, boolean z) {
        if (!getString(i).toString().equals(this.g.getText().toString())) {
            this.g.setText(i);
        }
        if (this.i.isEnabled() != z && z) {
            b.b(getActivity()).a(getString(R.string.reminder_calibration_canStart));
        }
        this.i.setEnabled(z);
        if (z) {
            a(this.i, (int) e.F);
        } else {
            a(this.i, 77);
        }
    }

    public void a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
    }

    public void a(boolean z) {
        this.i.setEnabled(z);
    }

    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.begincalicompss:
                d.a(this.b).a((byte) 1, (byte) 1, (byte) 1);
                this.c.beginTransaction().hide(this).show(this.c.findFragmentByTag("first")).commitAllowingStateLoss();
                return;
            case R.id.black_btn:
                getActivity().finish();
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.begin_calicaompass, null);
        this.f = (TextView) inflate.findViewById(R.id.tv_settingTitle);
        this.f.setText(R.string.compass_calibration);
        this.g = (TextView) inflate.findViewById(R.id.showtitleone);
        this.h = (Button) inflate.findViewById(R.id.black_btn);
        this.h.setOnClickListener(this);
        this.i = (Button) inflate.findViewById(R.id.begincalicompss);
        this.i.setOnClickListener(this);
        this.i.setEnabled(false);
        ao.a(getActivity().getAssets(), this.h, this.f, this.g);
        if (!this.b.T().a() || this.b.ac()) {
            if (this.b.ac()) {
                a((int) R.string.plane_start_can_not_calration_compass, false);
            } else {
                a((int) R.string.calidisconremote, false);
            }
        } else if (this.b.ad().aj()) {
            a((int) R.string.calicpmssing, false);
            b.b(getActivity()).a(getString(R.string.calicpmssing));
        } else {
            a((int) R.string.begincalocomremider, true);
        }
        return inflate;
    }

    public void onDroneEvent(a aVar, com.fimi.soul.drone.a aVar2) {
        super.onDroneEvent(aVar, aVar2);
        if (isVisible()) {
            switch (aVar) {
                case CaliCompass:
                    j i = aVar2.i();
                    if (i.d() != (byte) 2 || i.e() != (byte) 1 || i.b() != (byte) 1) {
                        return;
                    }
                    if (i.c() != (byte) 2 && i.c() != (byte) 3) {
                        return;
                    }
                    if (i.c() == (byte) 2) {
                        Fragment findFragmentByTag = this.c.findFragmentByTag("error");
                        if (findFragmentByTag != null && (findFragmentByTag instanceof CaliCompassErrorFragment) && !findFragmentByTag.isHidden()) {
                            ((CaliCompassErrorFragment) findFragmentByTag).a(getString(R.string.calicomsucess), true, false);
                            this.c.beginTransaction().hide(this).show(findFragmentByTag).commitAllowingStateLoss();
                            return;
                        }
                        return;
                    }
                    this.j = true;
                    a((int) R.string.calicompasscoming, false);
                    return;
                case Remotecontrol:
                    if (!aVar2.U() && this.j) {
                        this.j = false;
                    }
                    if (!this.j) {
                        if (!aVar2.U()) {
                            a((int) R.string.calisiacondrone, false);
                            return;
                        } else if (aVar2.U() && aVar2.ac()) {
                            a((int) R.string.plane_start_can_not_calration_compass, false);
                            return;
                        } else if (!aVar2.U()) {
                            return;
                        } else {
                            if (aVar2.ad().aj()) {
                                a((int) R.string.calicpmssing, false);
                                return;
                            } else {
                                a((int) R.string.begincalocomremider, true);
                                return;
                            }
                        }
                    }
                    return;
                case CLEANALLOBJ:
                    a((int) R.string.GC_caliFail_discon, false);
                    return;
                default:
                    return;
            }
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            if (this.b.T().a() && !this.b.ac()) {
                return;
            }
            if (this.b.ac()) {
                a((int) R.string.plane_start_can_not_calration_compass, false);
            } else {
                a((int) R.string.calidisconremote, false);
            }
        }
    }
}
