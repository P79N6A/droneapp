package com.fimi.soul.module.calibcompass;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
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
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;

public class CaliComPassFirstFragment extends BaseCaliCompassFragment {
    a f;
    private TextView g;
    private TextView h;
    private Button i;
    private boolean j;
    private boolean k;
    private Handler l = new Handler(this) {
        final /* synthetic */ CaliComPassFirstFragment a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            this.a.k = true;
        }
    };
    private boolean m;
    private boolean n;

    interface a {
        void b();
    }

    private void a(View view) {
        this.g = (TextView) view.findViewById(R.id.tv_settingTitle);
        this.g.setText(R.string.compass_hor_calibration);
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
        spannableStringBuilder.setSpan(foregroundColorSpan, 19, 21, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan2, 27, textView.getText().length(), 33);
        textView.setText(spannableStringBuilder);
        a(textView, 128);
    }

    public void a(TextView textView, int i) {
        textView.setTextColor(textView.getTextColors().withAlpha(i));
    }

    public void a(boolean z) {
        this.m = z;
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
        View inflate = layoutInflater.inflate(R.layout.cali_compass_first, null);
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
                    if (!this.m) {
                        return;
                    }
                    if (this.k && i.d() == (byte) 1 && i.e() == (byte) 1 && i.b() == (byte) 1 && i.c() == (byte) 2) {
                        this.k = false;
                        this.n = true;
                        d.a(aVar2).b((byte) 1, (byte) 1, (byte) 3);
                        return;
                    } else if (i.d() == (byte) 1 && i.e() == (byte) 1 && i.b() == (byte) 0 && i.c() == (byte) 1) {
                        Fragment findFragmentByTag = this.c.findFragmentByTag("error");
                        if (findFragmentByTag != null && (findFragmentByTag instanceof CaliCompassErrorFragment) && findFragmentByTag.isHidden()) {
                            ((CaliCompassErrorFragment) findFragmentByTag).a(getString(R.string.remindererror), false, false);
                            this.c.beginTransaction().hide(this).show(findFragmentByTag).commitAllowingStateLoss();
                            return;
                        }
                        return;
                    } else if (this.n && i.d() == (byte) 2 && i.e() == (byte) 1 && i.b() == (byte) 1 && i.c() == (byte) 1) {
                        this.n = false;
                        this.j = false;
                        this.c.beginTransaction().hide(this).show(this.c.findFragmentByTag("thrid")).setCustomAnimations(17432578, 17432579).commitAllowingStateLoss();
                        return;
                    } else if (i.d() == (byte) 1 && i.e() == (byte) 1 && i.b() == (byte) 1 && i.c() == (byte) 1 && !this.j) {
                        this.j = true;
                        this.n = true;
                        b.b(getActivity()).a(getString(R.string.compass_hor));
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            this.j = false;
            this.l.sendEmptyMessageDelayed(0, 2000);
        }
    }

    public void onStart() {
        super.onStart();
    }
}
