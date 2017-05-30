package com.fimi.soul.module.calibcompass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class CaliCompassErrorVertialFragment extends BaseCaliCompassFragment {
    private TextView f;
    private TextView g;
    private Button h;

    private void a(View view) {
        this.f = (TextView) view.findViewById(R.id.title);
        this.g = (TextView) view.findViewById(R.id.descompass);
        this.h = (Button) view.findViewById(R.id.againcali);
        this.h.setOnClickListener(this);
        ao.a(getActivity().getAssets(), this.f, this.g, this.h);
    }

    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.againcali:
                getActivity().finish();
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.cali_compass_error_vertical, null);
        a(inflate);
        return inflate;
    }
}
