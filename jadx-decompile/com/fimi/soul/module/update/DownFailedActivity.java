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
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.a;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.ao;

public class DownFailedActivity extends BaseActivity implements OnClickListener {
    private TextView a;
    private TextView b;
    private Button c;
    private Button d;
    private ImageView e;
    private Boolean f;
    private Boolean g;
    private v h;
    private String i = a.L;

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.download_later:
                if (this.f.booleanValue()) {
                    this.h.a().edit().putBoolean(a.J, true).commit();
                    this.dpa.d();
                    return;
                }
                startActivity(new Intent(this, FlightActivity.class));
                return;
            case R.id.retry_btn:
                if (ao.b((Context) this)) {
                    startActivity(new Intent(this, DowningActivity.class));
                    finish();
                    overridePendingTransition(17432576, 17432577);
                    return;
                }
                z.a((Context) this, (int) R.string.no_available_network);
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dpa.b((Activity) this);
        this.h = v.a((Context) this);
        this.i = a.L;
        getWindow().setFlags(128, 128);
        this.f = Boolean.valueOf(this.h.a().getBoolean(this.i, false));
        setContentView(R.layout.activity_down_failed);
        this.a = (TextView) findViewById(R.id.downResult);
        this.b = (TextView) findViewById(R.id.downFailedText);
        ao.a(getAssets(), this.a, this.b);
        this.d = (Button) findViewById(R.id.download_later);
        this.d.setOnClickListener(this);
        this.c = (Button) findViewById(R.id.retry_btn);
        this.c.setOnClickListener(this);
        this.e = (ImageView) findViewById(R.id.upgrade_iv);
        this.g = Boolean.valueOf(getIntent().getBooleanExtra(a.J, true));
        this.b.setText(getIntent().getStringExtra("DownLoadFailedInfo"));
    }
}
