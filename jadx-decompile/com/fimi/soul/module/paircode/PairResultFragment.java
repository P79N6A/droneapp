package com.fimi.soul.module.paircode;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.utils.ao;
import java.util.Timer;
import java.util.TimerTask;

public class PairResultFragment extends Fragment implements OnClickListener, a {
    RelativeLayout a;
    RelativeLayout b;
    RelativeLayout c;
    public int d = 0;
    TextView e;
    TextView f;
    TextView g;
    TextView h;
    Button i;
    Button j;
    Button k;
    ProgressView l;
    PairCodeActivity m;
    View n;
    Timer o;
    private final int p = 2;
    private final int q = 3;
    private final int r = 4;
    private final int s = -1;
    private final int t = 0;
    private final int u = 256;
    private Handler v = new Handler(this) {
        final /* synthetic */ PairResultFragment a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 256:
                    this.a.l.setCurrentCount((float) this.a.d);
                    this.a.g.setText(String.valueOf(this.a.d));
                    return;
                default:
                    return;
            }
        }
    };

    public enum a {
        success,
        fail,
        busy
    }

    private void a(View view) {
        this.b = (RelativeLayout) view.findViewById(R.id.pair_fail);
        this.h = (TextView) this.b.findViewById(R.id.pair_fail_rt);
        this.a = (RelativeLayout) view.findViewById(R.id.pair_success);
        this.c = (RelativeLayout) view.findViewById(R.id.pair_progress);
        this.l = (ProgressView) this.n.findViewById(R.id.progress_v);
        this.l.setFrontColor(getResources().getColor(R.color.white_half));
        this.l.setMaxCount(100.0f);
        this.l.setCurrentCount(0.0f);
        this.e = (TextView) this.n.findViewById(R.id.connect_des);
        this.f = (TextView) this.n.findViewById(R.id.connect_des_tip);
        this.g = (TextView) this.n.findViewById(R.id.pair_index);
        ao.b(getActivity().getAssets(), this.g);
        this.i = (Button) this.n.findViewById(R.id.exit_btn);
        this.j = (Button) this.n.findViewById(R.id.repair_btn);
        this.k = (Button) this.n.findViewById(R.id.con_submit);
        this.k.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.j.setOnClickListener(this);
        ao.a(getActivity().getAssets(), this.e, this.f, this.g, this.i, this.j, this.k);
    }

    private void a(a aVar) {
        this.b.setVisibility(8);
        this.a.setVisibility(8);
        this.c.setVisibility(8);
        switch (aVar) {
            case success:
                this.c.setVisibility(0);
                if (this.d == -1) {
                    this.c.setVisibility(8);
                    this.h.setText(getResources().getString(R.string.pair_outtime));
                    this.b.setVisibility(0);
                    PairCodeActivity pairCodeActivity = this.m;
                    PairCodeActivity.a = false;
                    return;
                } else if (this.d == 100) {
                    this.c.setVisibility(8);
                    this.b.setVisibility(8);
                    this.a.setVisibility(0);
                    if (!d.a().k() && this.o != null) {
                        this.o.cancel();
                        this.o = null;
                        return;
                    }
                    return;
                } else if (d.a().k()) {
                    this.l.setCurrentCount((float) this.d);
                    this.g.setText(String.valueOf(this.d));
                    return;
                } else {
                    this.o = new Timer();
                    this.o.schedule(new TimerTask(this) {
                        final /* synthetic */ PairResultFragment a;

                        {
                            this.a = r1;
                        }

                        public void run() {
                            this.a.v.sendEmptyMessage(256);
                            this.a.d = 10;
                        }
                    }, 200, 200);
                    return;
                }
            case fail:
                this.b.setVisibility(0);
                return;
            case busy:
                this.h.setText(getResources().getString(R.string.pair_busy));
                this.b.setVisibility(0);
                return;
            default:
                return;
        }
    }

    public void a(int i) {
    }

    public void a(int i, int i2) {
        switch (i) {
            case 2:
                this.d = i2;
                a(a.success);
                return;
            case 3:
                a(a.fail);
                return;
            case 4:
                a(a.busy);
                return;
            default:
                return;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.m = (PairCodeActivity) activity;
        this.m.a((a) this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.exit_btn:
                getActivity().finish();
                return;
            case R.id.repair_btn:
                this.m.a();
                return;
            case R.id.con_submit:
                getActivity().finish();
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.n = layoutInflater.inflate(R.layout.pair_rt_layout, null);
        a(this.n);
        return this.n;
    }
}
