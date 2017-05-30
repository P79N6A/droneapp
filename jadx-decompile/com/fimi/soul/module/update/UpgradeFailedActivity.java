package com.fimi.soul.module.update;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.a;
import com.fimi.soul.drone.d.o;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.ao;

public class UpgradeFailedActivity extends BaseActivity implements OnClickListener {
    private TextView a;
    private TextView b;
    private Button c;
    private Button d;
    private ImageView e;
    private Boolean f;
    private Boolean g;
    private v h;

    public void a() {
        o.a.d = (byte) 0;
        o.a.e = (byte) 2;
        this.drone.T().a(o.a.a());
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.retry_btn:
                if (this.drone.T().a()) {
                    startActivity(new Intent(this, UpgradingActivity.class));
                    finish();
                    overridePendingTransition(17432576, 17432577);
                    return;
                }
                finish();
                return;
            case R.id.noconnect_bt:
                if (this.f.booleanValue()) {
                    v a = v.a((Context) this);
                    a.a().edit().putBoolean(a.J, true).commit();
                    this.dpa.d();
                    return;
                }
                startActivity(new Intent(this, FlightActivity.class));
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dpa.b((Activity) this);
        this.h = v.a((Context) this);
        getWindow().setFlags(128, 128);
        this.f = Boolean.valueOf(this.h.a().getBoolean(a.L, false));
        setContentView(R.layout.activity_upgrade_failed);
        this.a = (TextView) findViewById(R.id.upgradeResult);
        ao.a(getAssets(), this.a);
        this.b = (TextView) findViewById(R.id.failedText);
        ao.a(getAssets(), this.b);
        this.d = (Button) findViewById(R.id.noconnect_bt);
        this.d.setOnClickListener(this);
        this.c = (Button) findViewById(R.id.retry_btn);
        this.c.setOnClickListener(this);
        this.e = (ImageView) findViewById(R.id.upgrade_iv);
        this.g = Boolean.valueOf(getIntent().getBooleanExtra(a.J, true));
        if (!this.g.booleanValue()) {
            this.b.setText(getIntent().getStringExtra("reson"));
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        a();
    }
}
