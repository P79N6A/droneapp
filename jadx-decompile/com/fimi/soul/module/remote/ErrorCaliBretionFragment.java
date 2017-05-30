package com.fimi.soul.module.remote;

import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.view.percent.PercentRelativeLayout.LayoutParams;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;
import it.a.a.e;

public class ErrorCaliBretionFragment extends BaseRemoteFragment {
    v f;
    Runnable g = new Runnable(this) {
        final /* synthetic */ ErrorCaliBretionFragment a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.d.m();
            this.a.getActivity().finish();
        }
    };
    private TextView h;
    private Button i;
    private Button j;
    private Button k;
    private Button l;
    private TextView m;
    private TextView n;
    private ImageView o;
    private int p;
    private boolean q;

    private void a() {
        this.j.setVisibility(0);
        this.k.setVisibility(0);
        this.l.setVisibility(8);
    }

    private void b() {
        this.j.setVisibility(8);
        this.k.setVisibility(8);
        this.l.setVisibility(0);
    }

    public void a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
    }

    public void a(String str, boolean z) {
        this.q = z;
        LayoutParams layoutParams = (LayoutParams) this.o.getLayoutParams();
        if (true == z) {
            this.m.setText(R.string.calisucess);
            this.n.setText(R.string.caliremotesucess);
            this.n.setVisibility(4);
            layoutParams.setMargins(0, (int) (((double) this.p) * 0.1111d), 0, 0);
            this.o.setLayoutParams(layoutParams);
            this.o.setImageResource(R.drawable.icon_calibration_succeed);
            b();
            return;
        }
        this.m.setText(R.string.califail);
        this.n.setVisibility(0);
        if (str == null || "".equals(str)) {
            this.n.setText(R.string.caliremotefail);
        } else {
            this.n.setText(str);
        }
        layoutParams.setMargins(0, (int) (((double) this.p) * 0.12592d), 0, 0);
        this.o.setLayoutParams(layoutParams);
        this.o.setImageResource(R.drawable.icon_calibration_defeat);
        a();
    }

    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.quit:
                this.d.n();
                this.d.m();
                getActivity().finish();
                return;
            case R.id.again:
                if (this.e != null) {
                    this.e.a(R.id.errorcalifragment, R.id.remote_roller_fragment);
                    return;
                }
                return;
            case R.id.sucesscomplete:
                getActivity().finish();
                new Handler().post(this.g);
                return;
            case R.id.black_btn:
                getActivity().finish();
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.p = displayMetrics.heightPixels;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.caliremotesucess, null);
        this.o = (ImageView) inflate.findViewById(R.id.tagIcon);
        this.h = (TextView) inflate.findViewById(R.id.heardView).findViewById(R.id.tv_settingTitle);
        this.h.setText(R.string.caliremotesucess);
        this.i = (Button) inflate.findViewById(R.id.heardView).findViewById(R.id.black_btn);
        this.i.setOnClickListener(this);
        this.j = (Button) inflate.findViewById(R.id.quit);
        this.j.setOnClickListener(this);
        this.k = (Button) inflate.findViewById(R.id.again);
        this.k.setOnClickListener(this);
        this.l = (Button) inflate.findViewById(R.id.sucesscomplete);
        this.l.setOnClickListener(this);
        this.m = (TextView) inflate.findViewById(R.id.destitle);
        this.n = (TextView) inflate.findViewById(R.id.calireason);
        this.f = new v(getActivity());
        ao.a(getActivity().getAssets(), this.h, this.i, this.j, this.k, this.l, this.m, this.n);
        a(this.j, 128);
        a(this.k, (int) e.F);
        return inflate;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            if (this.q) {
                b.b(getActivity()).a(getString(R.string.calisucess));
            } else {
                b.b(getActivity()).a(getString(R.string.calibration_failure));
            }
        }
    }
}
