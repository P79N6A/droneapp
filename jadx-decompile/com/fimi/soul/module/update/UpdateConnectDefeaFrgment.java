package com.fimi.soul.module.update;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class UpdateConnectDefeaFrgment extends Fragment implements OnClickListener {
    Handler a = new Handler(this) {
        final /* synthetic */ UpdateConnectDefeaFrgment a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            this.a.n.d();
        }
    };
    private Button b;
    private Button c;
    private Button d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private Context h;
    private String i;
    private String j;
    private String k;
    private boolean l = false;
    private boolean m = false;
    private a n;
    private boolean o = false;

    public interface a {
        void d();

        void e();
    }

    private void a() {
        this.e.startAnimation(AnimationUtils.loadAnimation(this.h, R.anim.update_connect_defea_scale));
        Animation loadAnimation = AnimationUtils.loadAnimation(this.h, R.anim.update_connect_defea_alpha_trans);
        loadAnimation.setStartOffset(350);
        this.f.startAnimation(loadAnimation);
        loadAnimation = AnimationUtils.loadAnimation(this.h, R.anim.update_connect_defea_alpha_trans);
        loadAnimation.setStartOffset(400);
        this.g.startAnimation(loadAnimation);
        loadAnimation = AnimationUtils.loadAnimation(this.h, R.anim.update_connect_defea_alpha_trans);
        loadAnimation.setStartOffset(450);
        this.b.startAnimation(loadAnimation);
        this.c.startAnimation(loadAnimation);
    }

    public void a(String str) {
        this.j = str;
    }

    public void a(boolean z) {
        this.m = z;
    }

    public void b(String str) {
        this.i = str;
    }

    public void b(boolean z) {
        this.o = z;
    }

    public void c(String str) {
        this.k = str;
    }

    public void c(boolean z) {
        this.l = z;
    }

    public void onActivityCreated(Bundle bundle) {
        int i = 0;
        super.onActivityCreated(bundle);
        this.g.setText(this.j);
        this.f.setText(this.i);
        this.b.setText(this.k);
        if (this.m) {
            this.a.sendEmptyMessageDelayed(0, 2000);
            this.e.setBackgroundResource(R.drawable.newbie_finish_icon);
        }
        if (this.o) {
            this.c.setVisibility(0);
            this.c.setText(getString(R.string.begincalibration));
            this.b.setVisibility(0);
            this.b.setText(getString(R.string.ignore));
            this.d.setVisibility(8);
            return;
        }
        Button button = this.c;
        int i2 = (this.l || this.m) ? 8 : 0;
        button.setVisibility(i2);
        button = this.b;
        i2 = (this.l || this.m) ? 8 : 0;
        button.setVisibility(i2);
        Button button2 = this.d;
        if (!this.l || this.m) {
            i = 8;
        }
        button2.setVisibility(i);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.h = activity;
        this.n = (a) activity;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.retry_btn:
                this.n.e();
                return;
            case R.id.noconnect_bt:
                this.n.d();
                return;
            case R.id.ignore_bt:
                this.n.d();
                return;
            default:
                return;
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_update_connect_defea, viewGroup, false);
        this.f = (TextView) inflate.findViewById(R.id.update_fail_tv);
        this.g = (TextView) inflate.findViewById(R.id.fail_reason);
        this.e = (ImageView) inflate.findViewById(R.id.connect_defeat_iv);
        this.b = (Button) inflate.findViewById(R.id.noconnect_bt);
        this.c = (Button) inflate.findViewById(R.id.retry_btn);
        this.d = (Button) inflate.findViewById(R.id.ignore_bt);
        this.b.setOnClickListener(this);
        this.c.setOnClickListener(this);
        this.d.setOnClickListener(this);
        a();
        ao.a(this.h.getAssets(), this.f, this.g, this.c, this.b);
        return inflate;
    }
}
