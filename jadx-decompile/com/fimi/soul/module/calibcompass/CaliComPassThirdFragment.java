package com.fimi.soul.module.calibcompass;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.h.j;
import com.fimi.soul.utils.ao;

public class CaliComPassThirdFragment extends BaseCaliCompassFragment {
    a f;
    private TextView g;
    private TextView h;
    private Button i;
    private boolean j;

    interface a {
        void a(boolean z);
    }

    private void a(View view) {
        this.g = (TextView) view.findViewById(R.id.tv_settingTitle);
        this.g.setText(R.string.compass_ver_calibration);
        this.h = (TextView) view.findViewById(R.id.showtitleone);
        this.i = (Button) view.findViewById(R.id.black_btn);
        this.i.setOnClickListener(this);
        a(this.h, 128);
        ao.a(getActivity().getAssets(), this.g, this.h, this.i);
    }

    private void a(TextView textView) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(R.color.white));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(getResources().getColor(R.color.white));
        CharSequence spannableStringBuilder = new SpannableStringBuilder(textView.getText().toString());
        spannableStringBuilder.setSpan(foregroundColorSpan, 19, 23, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan2, 29, this.h.getText().length(), 33);
        this.h.setText(spannableStringBuilder);
        a(this.h, 128);
    }

    public void a(TextView textView, int i) {
        textView.setTextColor(textView.getTextColors().withAlpha(i));
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f = (a) activity;
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
        View inflate = layoutInflater.inflate(R.layout.cali_compass_third, null);
        a(inflate);
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f = null;
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        super.onDroneEvent(aVar, aVar2);
        if (isVisible()) {
            switch (aVar) {
                case CaliCompass:
                    j i = aVar2.i();
                    if (this.f != null) {
                        this.f.a(true);
                    }
                    if (i.d() == (byte) 2 && i.e() == (byte) 1 && i.b() == (byte) 1 && i.c() == (byte) 2) {
                        if (this.f != null) {
                            this.f.a(false);
                        }
                        this.j = false;
                        Fragment findFragmentByTag = this.c.findFragmentByTag("error");
                        if (findFragmentByTag != null && (findFragmentByTag instanceof CaliCompassErrorFragment) && findFragmentByTag.isHidden()) {
                            ((CaliCompassErrorFragment) findFragmentByTag).a(getString(R.string.calicomsucess), true, false);
                            this.c.beginTransaction().hide(this).show(findFragmentByTag).commitAllowingStateLoss();
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
            b.a(getActivity()).a(getString(R.string.compass_ver));
        }
    }
}
