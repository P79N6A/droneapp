package com.fimi.soul.module.flyplannermedia;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.utils.ao;

public class DroneMediaTabActivity extends BaseActivity implements OnClickListener {
    private DroneOnlineFragment a;
    private DroneLocalFragment b;
    private boolean c = false;
    private RelativeLayout d;
    private RelativeLayout e;
    private ImageView f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private View j;
    private View k;
    private View l;
    private View m;
    private ImageButton n;

    private void c() {
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        if (this.c) {
            this.i.setTextColor(getResources().getColor(R.color.drone_tab_gray_color));
            this.g.setVisibility(4);
            this.h.setTextColor(-1);
            this.f.setVisibility(0);
            beginTransaction.replace(R.id.ll_content, this.a);
            beginTransaction.addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
            return;
        }
        this.h.setTextColor(getResources().getColor(R.color.drone_tab_gray_color));
        this.f.setVisibility(4);
        this.i.setTextColor(-1);
        this.g.setVisibility(0);
        beginTransaction.replace(R.id.ll_content, this.b);
        beginTransaction.addToBackStack(null);
        beginTransaction.commitAllowingStateLoss();
    }

    public View a() {
        return this.k;
    }

    public void a(boolean z) {
        this.m.setVisibility(z ? 0 : 8);
    }

    public View b() {
        return this.l;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && intent != null) {
            switch (i2) {
                case 1:
                    this.b.a(intent);
                    return;
                case 2:
                    this.a.a(intent);
                    return;
                default:
                    return;
            }
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.local_layout) {
            this.c = false;
        }
        if (view.getId() == R.id.online_layout) {
            this.c = true;
        }
        c();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = new DroneOnlineFragment();
        this.b = new DroneLocalFragment();
        setContentView(R.layout.activity_drone_media_tab);
        getWindow().setFlags(128, 128);
        this.j = findViewById(R.id.rl_tab_top);
        this.j.findViewById(R.id.ll_center_tab).setVisibility(0);
        this.n = (ImageButton) this.j.findViewById(R.id.btn_back);
        this.k = findViewById(R.id.ll_actionBottom);
        this.k.setVisibility(8);
        this.l = findViewById(R.id.ll_actionTop);
        this.d = (RelativeLayout) findViewById(R.id.online_layout);
        this.e = (RelativeLayout) findViewById(R.id.local_layout);
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.h = (TextView) findViewById(R.id.tv_online);
        this.i = (TextView) findViewById(R.id.tv_local);
        ao.a(c.a().getResources().getAssets(), (ViewGroup) getWindow().getDecorView());
        this.f = (ImageView) findViewById(R.id.iv_onlineDot);
        this.g = (ImageView) findViewById(R.id.iv_localDot);
        this.m = findViewById(R.id.ll_empty);
        this.n.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DroneMediaTabActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.overridePendingTransition(17432576, 17432577);
                this.a.finish();
            }
        });
        this.c = ((d) b.a().d()).d();
        c();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || (b().getVisibility() != 0 && a().getVisibility() != 0)) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.c) {
            this.a.o();
        } else {
            this.b.o();
        }
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }
}
