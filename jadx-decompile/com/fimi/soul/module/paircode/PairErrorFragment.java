package com.fimi.soul.module.paircode;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class PairErrorFragment extends Fragment implements OnClickListener {
    PairCodeActivity a;
    Button b;
    View c;
    private TextView d;
    private TextView e;

    private void a(View view) {
        this.d = (TextView) view.findViewById(R.id.connect_dis_title);
        this.e = (TextView) view.findViewById(R.id.connect_dis_tip);
        this.b = (Button) view.findViewById(R.id.dis_con_submit);
        ao.a(this.a.getAssets(), this.e, this.d, this.b);
        this.b.setOnClickListener(this);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (PairCodeActivity) activity;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.dis_con_submit:
                this.a.finish();
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = layoutInflater.inflate(R.layout.pair_disconnect_layout, null);
        a(this.c);
        return this.c;
    }
}
