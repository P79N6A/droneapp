package com.fimi.soul.module.update;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.R;
import com.fimi.soul.b.g;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.UpgradeResultDetail;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.TranslationView;
import java.util.ArrayList;
import java.util.List;

public class UpgradeResultActivity extends BaseActivity implements OnClickListener {
    public static final String a = "result_list";
    StringBuffer b;
    StringBuffer c;
    TranslationView d;
    TextView e;
    g f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private Button k;
    private Button l;
    private Button m;
    private ImageView n;
    private PercentRelativeLayout o;
    private PercentRelativeLayout p;
    private PercentRelativeLayout q;
    private Button r;
    private Button s;
    private TextView t;
    private ListView u;
    private List<UpgradeResultDetail> v = new ArrayList();

    private String a(StringBuffer stringBuffer, int i) {
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return String.format(getString(i), new Object[]{stringBuffer.toString()});
    }

    private void c() {
        this.n = (ImageView) findViewById(R.id.img_result);
        this.g = (TextView) findViewById(R.id.tv_result);
        this.h = (TextView) findViewById(R.id.tv_sucess_firmware);
        this.i = (TextView) findViewById(R.id.tv_fail_firmwares);
        this.k = (Button) findViewById(R.id.bt_ensure);
        this.k.setOnClickListener(this);
        this.j = (TextView) findViewById(R.id.warm_prompt);
        this.l = (Button) findViewById(R.id.btn_exit);
        this.l.setOnClickListener(this);
        this.m = (Button) findViewById(R.id.btn_reconnect);
        this.m.setOnClickListener(this);
        this.o = (PercentRelativeLayout) findViewById(R.id.result_rl1);
        this.p = (PercentRelativeLayout) findViewById(R.id.result_rl2);
        this.q = (PercentRelativeLayout) findViewById(R.id.main_rl);
        ao.a(getAssets(), this.g, this.h, this.i, this.j);
    }

    private void d() {
        List<FirmwareInfo> list = (List) getIntent().getSerializableExtra(a);
        this.b = new StringBuffer();
        this.c = new StringBuffer();
        if (list != null && list.size() > 0) {
            for (FirmwareInfo firmwareInfo : list) {
                if (firmwareInfo.isUpgradeSuccess().booleanValue()) {
                    this.b.append(firmwareInfo.getSysName() + getString(R.string.upgrade_symbol));
                } else {
                    this.c.append(firmwareInfo.getSysName() + getString(R.string.upgrade_symbol));
                }
            }
        }
        if (this.b.length() > 0 && this.c.length() == 0) {
            this.i.setVisibility(8);
            this.j.setVisibility(8);
            this.h.setText(a(this.b, R.string.upgrade_firmware_success));
        } else if (this.b.length() <= 0 || this.c.length() <= 0) {
            this.i.setTextSize(2, 11.3f);
            this.i.setVisibility(0);
            this.h.setText(a(this.c, R.string.upgrade_firmware_failing));
            this.i.setText(getString(R.string.warm_prompt));
            this.j.setVisibility(4);
        } else {
            this.i.setVisibility(0);
            this.h.setText(a(this.b, R.string.upgrade_firmware_success));
            this.i.setText(a(this.c, R.string.upgrade_firmware_failing));
            this.j.setTextSize(2, 11.3f);
            this.j.setVisibility(0);
            this.j.setText(getString(R.string.warm_prompt));
        }
    }

    private void e() {
        List list = (List) getIntent().getSerializableExtra(a);
        this.b = new StringBuffer();
        this.c = new StringBuffer();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                FirmwareInfo firmwareInfo = (FirmwareInfo) list.get(i);
                UpgradeResultDetail upgradeResultDetail;
                if (firmwareInfo.isUpgradeSuccess().booleanValue()) {
                    upgradeResultDetail = new UpgradeResultDetail();
                    upgradeResultDetail.setDetail(firmwareInfo.getSysName() + getString(R.string.upgrade_success1));
                    upgradeResultDetail.setImg(R.drawable.icon_upgrade_succeed);
                    this.v.add(upgradeResultDetail);
                    this.b.append(firmwareInfo.getSysName());
                    if (i != list.size() - 1) {
                        this.b.append(getString(R.string.upgrade_symbol));
                    }
                } else {
                    upgradeResultDetail = new UpgradeResultDetail();
                    upgradeResultDetail.setDetail(firmwareInfo.getSysName() + getString(R.string.upgrade_faile1));
                    upgradeResultDetail.setImg(R.drawable.icon_upgrade_defeated);
                    this.v.add(upgradeResultDetail);
                    this.c.append(firmwareInfo.getSysName());
                    if (i != list.size() - 1) {
                        this.c.append(getString(R.string.upgrade_symbol));
                    }
                }
            }
        }
        if (this.b.length() > 0 && this.c.length() == 0) {
            this.i.setVisibility(8);
            this.j.setVisibility(8);
            this.l.setVisibility(8);
            this.m.setVisibility(8);
            this.b.append(getString(R.string.upgrade_success1));
            this.h.setText(this.b.toString());
        } else if (this.b.length() == 0 && this.c.length() > 0) {
            this.c.append(getString(R.string.upgrade_faile1));
            this.c.append(getString(R.string.upgrade_faile_tip2));
            this.h.setText(this.c.toString());
            this.n.setBackgroundResource(R.drawable.update_waining);
            this.k.setVisibility(8);
            this.g.setText(getString(R.string.upgrade_faile));
        } else if (this.b.length() > 0 && this.c.length() > 0) {
            this.o.setVisibility(8);
            this.p.setVisibility(0);
            this.q.setBackgroundResource(R.drawable.upgradbg2);
            a();
            b();
        }
    }

    public void a() {
        this.r = (Button) findViewById(R.id.btn_down_after);
        ao.a(getAssets(), this.r);
        this.r.setOnClickListener(this);
        this.s = (Button) findViewById(R.id.btn_down);
        ao.a(getAssets(), this.s);
        this.s.setOnClickListener(this);
        this.d = (TranslationView) findViewById(R.id.translationview);
        this.d.setVisibility(0);
        this.d.a();
        this.e = (TextView) findViewById(R.id.update_firmware_title);
        ao.a(getAssets(), this.e);
        this.t = (TextView) findViewById(R.id.confirm_tv);
        ao.a(getAssets(), this.t);
        new StringBuilder().append(getString(R.string.update_firmware_title));
        getString(R.string.down_firmwares_detail_ex);
        this.u = (ListView) findViewById(R.id.testListView);
    }

    public void b() {
        this.f = new g(this, this.v);
        this.u.setAdapter(this.f);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_down_after:
                finish();
                return;
            case R.id.btn_down:
                finish();
                return;
            case R.id.bt_ensure:
                finish();
                return;
            case R.id.btn_exit:
                finish();
                return;
            case R.id.btn_reconnect:
                finish();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_upgrade_result);
        c();
        e();
    }
}
