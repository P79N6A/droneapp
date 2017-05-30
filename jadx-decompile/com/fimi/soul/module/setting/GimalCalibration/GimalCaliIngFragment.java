package com.fimi.soul.module.setting.GimalCalibration;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class GimalCaliIngFragment extends Fragment implements OnClickListener {
    private static final int i = 100;
    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private Button f;
    private ProgressView g;
    private a h;

    interface a {
        void a();
    }

    private void a(View view) {
        this.a = (TextView) view.findViewById(R.id.heardView).findViewById(R.id.tv_settingTitle);
        this.a.setText(R.string.gc_calbrating_titling);
        this.b = (TextView) view.findViewById(R.id.process);
        this.c = (TextView) view.findViewById(R.id.processsign);
        this.d = (TextView) view.findViewById(R.id.desTitle);
        this.e = (TextView) view.findViewById(R.id.desTips);
        this.f = (Button) view.findViewById(R.id.heardView).findViewById(R.id.black_btn);
        this.f.setOnClickListener(this);
        this.g = (ProgressView) view.findViewById(R.id.pro_calibration);
        this.g.setMaxCount(100.0f);
        ao.a(getActivity().getAssets(), this.a, this.d, this.f);
        ao.b(getActivity().getAssets(), this.b, this.c);
    }

    public void a(int i) {
        this.b.setText(i + "");
        this.g.setCurrentCount((float) i);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.h = (a) activity;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.black_btn && this.h != null) {
            this.h.a();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.gimalcaliing, null);
        a(inflate);
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        if (this.h != null) {
            this.h = null;
        }
    }
}
