package com.fimi.soul.module.update;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.b.h;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.setting.newhand.NewHandActivity;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.TranslationView;
import java.util.List;

public class FindOnlineFirmwareAvtivity extends BaseActivity implements OnClickListener {
    TranslationView a;
    TextView b;
    TextView c;
    List<UpdateVersonBean> d = null;
    private Button e;
    private Button f;
    private Button g;
    private Boolean h;
    private ListView i;
    private TextView j;
    private h k;
    private boolean l;
    private String m = a.L;
    private Handler n = new Handler(this) {
        final /* synthetic */ FindOnlineFirmwareAvtivity a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            this.a.f.setTextColor(-419430401);
            this.a.g.setTextColor(-419430401);
            this.a.f.setClickable(true);
            this.a.g.setClickable(true);
            switch (message.what) {
                case 0:
                    this.a.b();
                    return;
                case 1:
                    z.a(this.a, (int) R.string.network_disable_download);
                    return;
                default:
                    return;
            }
        }
    };

    public void a() {
        if (!ao.b((Context) this)) {
            z.a((Context) this, (int) R.string.network_disable_download);
        } else if (com.fimi.soul.biz.a.a.a().c()) {
            this.f.setTextColor(872415231);
            this.g.setTextColor(872415231);
            this.f.setClickable(false);
            this.g.setClickable(false);
            c();
        } else {
            b();
        }
    }

    public void b() {
        startActivity(new Intent(this, DowningActivity.class));
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    public void c() {
        new Thread(this) {
            final /* synthetic */ FindOnlineFirmwareAvtivity a;

            {
                this.a = r1;
            }

            public void run() {
                if (ao.d("192.168.100.1")) {
                    this.a.n.sendEmptyMessage(1);
                } else {
                    this.a.n.sendEmptyMessage(0);
                }
            }
        }.start();
    }

    public void d() {
        this.e = (Button) findViewById(R.id.btn_down_after);
        ao.a(getAssets(), this.e);
        this.e.setOnClickListener(this);
        this.f = (Button) findViewById(R.id.btn_down);
        ao.a(getAssets(), this.f);
        this.f.setOnClickListener(this);
        this.g = (Button) findViewById(R.id.btn_down2);
        ao.a(getAssets(), this.g);
        this.g.setOnClickListener(this);
        this.a = (TranslationView) findViewById(R.id.translationview);
        this.a.setVisibility(0);
        this.a.a();
        this.b = (TextView) findViewById(R.id.update_firmware_title);
        ao.a(getAssets(), this.b);
        this.c = (TextView) findViewById(R.id.down_firmwares_detail_ex);
        ao.a(getAssets(), this.c);
        this.j = (TextView) findViewById(R.id.confirm_tv);
        ao.a(getAssets(), this.j);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getString(R.string.update_firmware_title));
        String string = getString(R.string.down_firmwares_detail_ex);
        if (this.l) {
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            this.g.setVisibility(0);
            stringBuilder.append(getString(R.string.update_firmware_title_ex));
        } else {
            this.e.setVisibility(0);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
        }
        this.b.setText(stringBuilder.toString());
        this.c.setText(String.format(string, new Object[]{l.b()}));
        this.i = (ListView) findViewById(R.id.testListView);
    }

    public void e() {
        this.k = new h(this, this.d);
        this.i.setAdapter(this.k);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_down_after:
                if (!c.c().d(a.s)) {
                    startActivity(new Intent(this, NewHandActivity.class));
                    finish();
                    overridePendingTransition(17432576, 17432577);
                    return;
                } else if (this.h.booleanValue()) {
                    this.preferencesUtil.a().edit().putBoolean(a.J, true).commit();
                    this.dpa.d();
                    return;
                } else {
                    startActivity(new Intent(this, FlightActivity.class));
                    return;
                }
            case R.id.btn_down:
                a();
                return;
            case R.id.btn_down2:
                a();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dpa.b((Activity) this);
        setContentView(R.layout.activity_online_new_firmware);
        getWindow().setFlags(128, 128);
        com.fimi.soul.biz.update.c.c = true;
        com.fimi.soul.biz.update.c.b = true;
        this.preferencesUtil = v.a((Context) this);
        this.m = a.L;
        this.h = Boolean.valueOf(this.preferencesUtil.a().getBoolean(this.m, false));
        this.d = c.c().b(UpdateVersonBean.SP_NEED_DOWN_FIRMWWARES, UpdateVersonBean.class);
        for (int i = 0; i < this.d.size(); i++) {
            if ("2".equals(((UpdateVersonBean) this.d.get(i)).getForceSign())) {
                this.l = true;
                break;
            }
        }
        d();
        e();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
