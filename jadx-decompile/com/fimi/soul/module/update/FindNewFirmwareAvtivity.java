package com.fimi.soul.module.update;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.drone.h.g;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.setting.newhand.NewHandActivity;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import com.fimi.soul.view.TranslationView;
import java.io.File;
import java.util.List;

public class FindNewFirmwareAvtivity extends BaseActivity implements OnClickListener, e<X11RespCmd> {
    public static final String a = "upgrade_firmwares";
    boolean b = false;
    List<FirmwareInfo> c = null;
    TranslationView d;
    TextView e;
    TextView f;
    private Button g;
    private Button h;
    private Button i;
    private Context j;
    private int k;
    private Boolean l;
    private d m = null;
    private boolean n;
    private v o;
    private String p = com.fimi.soul.base.a.L;
    private ListView q;
    private TextView r;
    private com.fimi.soul.b.d s;
    private boolean t;
    private boolean u;
    private a v = a.IDILE;

    private enum a {
        IDILE,
        TF_CARD_NO_UPGRADE_PLEASE_REPLACE,
        TF_CARD_ERROR_NO_UPGRADE,
        CAMERA_RECORDING,
        TF_CARD_CAPACITY,
        DRONE_SKY,
        DIS_CONNECT_DRONE,
        REMOTE_LOW_BATTERY,
        NO_TF_CARD_NO_UPGRADE,
        CARD_PARAMETERS_ERROR,
        FLIGHT_LOW_BATTERY,
        UPGRADING,
        CALIBRATION
    }

    private void a(a aVar) {
        if (this.v == aVar) {
            this.r.setText(R.string.confirm_all_connection2);
            this.v = a.IDILE;
            i();
        }
    }

    private void a(a aVar, int i) {
        if (this.v != aVar) {
            this.v = aVar;
            this.r.setText(i);
            j();
        }
    }

    private void f() {
        int i;
        if (this.c == null || this.c.size() <= 0) {
            i = 0;
        } else {
            i = 0;
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                FirmwareInfo firmwareInfo = (FirmwareInfo) this.c.get(i2);
                if (firmwareInfo.getSysId() == 4 || firmwareInfo.getSysId() == 13) {
                    this.b = true;
                }
                i += firmwareInfo.getUpdateTime();
            }
        }
        this.n = com.fimi.soul.biz.e.d.a().k();
        this.m = (d) b.a().d();
        this.m.a((e) this);
        if (!this.m.d() && this.drone.W()) {
            this.m.t().b();
        }
        if (this.b && this.m.d()) {
            this.m.r().c(com.fimi.soul.biz.camera.e.cy);
        }
        String string = getString(R.string.down_firmwares_detail_ex);
        String string2 = getString(R.string.update_firmwares_detail_ex);
        l.a(i);
        this.f.setText(String.format(string, new Object[]{l.c()}) + " | " + String.format(string2, new Object[]{l.a(i)}));
    }

    private void g() {
        if (this.v == a.CARD_PARAMETERS_ERROR) {
            e();
            return;
        }
        startActivity(new Intent(this.j, UpgradingActivity.class));
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    private void h() {
        a(a.CAMERA_RECORDING);
        a(a.NO_TF_CARD_NO_UPGRADE);
        a(a.TF_CARD_NO_UPGRADE_PLEASE_REPLACE);
        a(a.TF_CARD_ERROR_NO_UPGRADE);
        a(a.CARD_PARAMETERS_ERROR);
        a(a.UPGRADING);
        if (this.m.i().getFreeKBSpace() == 0) {
            this.m.r().c(com.fimi.soul.biz.camera.e.cy);
        } else if (b()) {
            a(a.TF_CARD_CAPACITY);
        } else {
            a(a.TF_CARD_CAPACITY, (int) R.string.camera_tf_space_detail);
        }
    }

    private void i() {
        this.h.setTextColor(-419430401);
        this.i.setTextColor(-419430401);
        this.h.setClickable(true);
        this.i.setClickable(true);
    }

    private void j() {
        this.h.setTextColor(872415231);
        this.i.setTextColor(872415231);
        this.h.setClickable(false);
        this.i.setClickable(false);
    }

    public void a() {
        if (!this.drone.U()) {
            a(a.DIS_CONNECT_DRONE, (int) R.string.confirm_all_connection);
        } else if (this.drone.K().g()) {
            a(a.REMOTE_LOW_BATTERY, (int) R.string.update_low_battery);
        } else if (this.c != null && this.c.size() > 0 && this.drone.ac()) {
            a(a.DRONE_SKY, (int) R.string.motor_start_up);
        } else if (this.u) {
            this.r.setText(getString(R.string.confirm_all_connection3));
        } else {
            this.r.setText(getString(R.string.confirm_all_connection2));
        }
    }

    public void a(com.fimi.soul.drone.d.a aVar) {
        switch (aVar) {
            case OnRecivedCloudCameraCommandInfo:
                if (this.drone.c.a() == 50) {
                    g gVar = (g) this.drone.c;
                    if (gVar.f() != com.fimi.soul.drone.h.g.a.NoSDCard) {
                        this.m.b(true);
                    } else {
                        this.m.b(false);
                    }
                    switch (gVar.f()) {
                        case VideoRecording:
                            a(a.CAMERA_RECORDING, (int) R.string.findnewfimware_camera_update_no_ugrade);
                            return;
                        case NoSDCard:
                            a(a.NO_TF_CARD_NO_UPGRADE, (int) R.string.tf_card_no_check_no_upgrade);
                            return;
                        case UPDATEPRO:
                            a(a.UPGRADING, (int) R.string.update_updating);
                            return;
                        case LOW_SPEED_CARD:
                        case CardNoPropose:
                        case CardNoProposeAndParamerr:
                        case CardWriteLow:
                        case CardWriteLowAndParamerr:
                            if (this.n) {
                                a(a.TF_CARD_NO_UPGRADE_PLEASE_REPLACE, (int) R.string.tf_card_no_use_please_change);
                                return;
                            } else {
                                h();
                                return;
                            }
                        case CardSetroot:
                            a(a.TF_CARD_ERROR_NO_UPGRADE, (int) R.string.tf_card_error_no_ugraded);
                            return;
                        case CardFileSysError:
                        case CardParametersError:
                            if (this.v != a.CARD_PARAMETERS_ERROR) {
                                this.v = a.CARD_PARAMETERS_ERROR;
                                this.r.setText(R.string.please_format_tf_card_upgraded);
                                return;
                            }
                            return;
                        default:
                            h();
                            return;
                    }
                }
                return;
            default:
                return;
        }
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
        if (!isFinishing()) {
            switch (x11RespCmd.getMsg_id()) {
                case 4:
                    if (z) {
                        a(a.CARD_PARAMETERS_ERROR);
                        com.fimi.kernel.utils.g.b(new File(j.n()));
                        z.a((Context) this, getString(R.string.format_success), z.c);
                        this.m.r().c(com.fimi.soul.biz.camera.e.cy);
                        this.m.a(true);
                    } else {
                        z.a((Context) this, getString(R.string.format_fail), z.c);
                    }
                    c.b().c();
                    return;
                default:
                    return;
            }
        }
    }

    public boolean b() {
        return this.b && this.m.i().getFreeKBSpace() > 81920;
    }

    public void c() {
        this.g = (Button) findViewById(R.id.btn_after);
        ao.a(getAssets(), this.g);
        this.g.setOnClickListener(this);
        this.h = (Button) findViewById(R.id.btn_upgrade);
        ao.a(getAssets(), this.h);
        this.h.setOnClickListener(this);
        this.i = (Button) findViewById(R.id.btn_upgrade2);
        ao.a(getAssets(), this.i);
        this.i.setOnClickListener(this);
        this.d = (TranslationView) findViewById(R.id.translationview);
        this.d.setVisibility(0);
        this.d.a();
        this.e = (TextView) findViewById(R.id.update_firmware_title);
        ao.a(getAssets(), this.e);
        this.f = (TextView) findViewById(R.id.down_firmwares_detail_ex);
        ao.a(getAssets(), this.f);
        this.r = (TextView) findViewById(R.id.confirm_tv);
        ao.a(getAssets(), this.r);
        StringBuilder stringBuilder = new StringBuilder();
        if (this.t) {
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.i.setVisibility(0);
            stringBuilder.append(getString(R.string.update_firmware_title_ex));
        } else {
            this.g.setVisibility(0);
            this.h.setVisibility(0);
            this.i.setVisibility(8);
            stringBuilder.append(getString(R.string.refreshupdate));
        }
        this.e.setText(stringBuilder.toString());
        this.q = (ListView) findViewById(R.id.testListView);
    }

    public void d() {
        if (this.c != null && this.c.size() > 0) {
            this.s = new com.fimi.soul.b.d(this, this.c);
            this.q.setAdapter(this.s);
        }
    }

    public void e() {
        new com.fimi.soul.view.f.a(this).a(getString(R.string.check_tf_card_must_format)).a(false).a(getResources().getColor(R.color.dialog_ensure_hot)).b(getString(R.string.ensure), new DialogInterface.OnClickListener(this) {
            final /* synthetic */ FindNewFirmwareAvtivity a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                c.b().a();
                this.a.m.r().c();
            }
        }).a(getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
            final /* synthetic */ FindNewFirmwareAvtivity a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).a().show();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_after:
                if (!c.c().d(com.fimi.soul.base.a.s)) {
                    startActivity(new Intent(this, NewHandActivity.class));
                    finish();
                    overridePendingTransition(17432576, 17432577);
                    return;
                } else if (this.k == 1) {
                    finish();
                    return;
                } else if (this.l.booleanValue()) {
                    this.o.a().edit().putBoolean(com.fimi.soul.base.a.J, true).commit();
                    this.dpa.d();
                    return;
                } else {
                    startActivity(new Intent(this, FlightActivity.class));
                    return;
                }
            case R.id.btn_upgrade:
                g();
                return;
            case R.id.btn_upgrade2:
                g();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dpa.b((Activity) this);
        this.o = v.a((Context) this);
        this.p = com.fimi.soul.base.a.L;
        this.l = Boolean.valueOf(this.o.a().getBoolean(this.p, false));
        getWindow().setFlags(128, 128);
        setContentView(R.layout.activity_find_new_firmware_avtivity);
        ao.a(getAssets(), this.h);
        this.j = this;
        this.k = getIntent().getIntExtra(com.fimi.soul.base.a.G, 0);
        this.c = com.fimi.soul.module.update.a.a.a().d();
        for (int i = 0; i < this.c.size(); i++) {
            if ("2".equals(((FirmwareInfo) this.c.get(i)).getForceSign())) {
                this.t = true;
            }
            if (((FirmwareInfo) this.c.get(i)).isVersionError()) {
                this.t = true;
                this.u = true;
                break;
            }
        }
        c();
        f();
        d();
        a();
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        super.onDroneEvent(aVar, aVar2);
        if (aVar2.U()) {
            a(a.DIS_CONNECT_DRONE);
            if (aVar2.ad().ak() || com.fimi.soul.biz.e.d.a().h() || com.fimi.soul.biz.e.c.a().d()) {
                a(a.UPGRADING, (int) R.string.update_updating);
                return;
            }
            a(a.UPGRADING);
            if (aVar2.ad().aj()) {
                a(a.CALIBRATION, (int) R.string.update_calibration);
                return;
            }
            a(a.CALIBRATION);
            if (aVar2.K().g()) {
                a(a.REMOTE_LOW_BATTERY, (int) R.string.update_low_battery);
                return;
            }
            a(a.REMOTE_LOW_BATTERY);
            if (aVar2.ad().O() || aVar2.ad().P()) {
                a(a.FLIGHT_LOW_BATTERY, (int) R.string.update_flight_low_battery);
                return;
            }
            a(a.FLIGHT_LOW_BATTERY);
            if (aVar2.ac()) {
                a(a.DRONE_SKY, (int) R.string.motor_start_up);
                return;
            }
            a(a.DRONE_SKY);
            if (this.b) {
                a(aVar);
                return;
            }
            return;
        }
        a(a.DIS_CONNECT_DRONE, (int) R.string.confirm_all_connection);
    }

    protected void onStart() {
        super.onStart();
        if (this.b) {
            this.m.u().i();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
