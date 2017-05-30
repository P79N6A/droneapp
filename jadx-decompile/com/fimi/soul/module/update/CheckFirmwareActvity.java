package com.fimi.soul.module.update;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.calibcompass.CaliCompassActivity;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.module.setting.newhand.NewHandActivity;
import com.fimi.soul.module.update.UpdateConnectDefeaFrgment.a;
import com.fimi.soul.module.update.a.g;
import com.fimi.soul.utils.ao;
import java.util.List;

public class CheckFirmwareActvity extends BaseActivity implements b, a {
    private String A = com.fimi.soul.base.a.J;
    List<FirmwareInfo> a = null;
    d b;
    g c;
    com.fimi.soul.biz.e.d d;
    Handler e = new Handler(this) {
        final /* synthetic */ CheckFirmwareActvity a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            float floatValue = message.obj != null ? ((Float) message.obj).floatValue() : 0.0f;
            this.a.h.setCurrentCount(floatValue);
            if (!this.a.v.T().a()) {
                this.a.a(this.a.getString(R.string.disconnect_titlefaile), this.a.getString(R.string.disconnect_reson), false, false, false);
            } else if (!this.a.v.U()) {
                this.a.a(this.a.getString(R.string.unconnectdrone), this.a.getString(R.string.fc_tip_error), false, false, false);
            } else if (floatValue == 390.0f) {
                if (!this.a.b()) {
                    if (c.c().d(com.fimi.soul.base.a.s)) {
                        this.a.e.postDelayed(this.a.f, 10);
                        return;
                    }
                    this.a.e.removeCallbacks(this.a.f);
                    this.a.startActivity(new Intent(this.a, NewHandActivity.class));
                    this.a.finish();
                    this.a.overridePendingTransition(17432576, 17432577);
                }
            } else if (floatValue >= 400.0f) {
                this.a.e.removeCallbacks(this.a.f);
                if (this.a.y) {
                    this.a.z.a().edit().putBoolean(this.a.A, true).commit();
                    this.a.dpa.d();
                    return;
                }
                this.a.startActivity(new Intent(this.a, FlightActivity.class));
            } else if (this.a.p > 0.0f) {
                this.a.e.postDelayed(this.a.f, 10);
            }
        }
    };
    Runnable f = new Runnable(this) {
        final /* synthetic */ CheckFirmwareActvity a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.p = 1.0f + this.a.p;
            Message obtainMessage = this.a.e.obtainMessage();
            obtainMessage.obj = Float.valueOf(this.a.p);
            obtainMessage.what = 1;
            this.a.e.sendMessage(obtainMessage);
        }
    };
    int g = 0;
    private ProgressView h;
    private boolean i = false;
    private final int j = 400;
    private final int k = 10;
    private final int l = 1;
    private final int m = 2;
    private UpdateConnectDefeaFrgment n;
    private AutoSelfErrorFrgment o;
    private float p = 0.0f;
    private final int q = 1536;
    private TextView r;
    private boolean s = false;
    private com.fimi.soul.module.droneui.a t;
    private com.fimi.soul.biz.e.b u = null;
    private com.fimi.soul.drone.a v;
    private boolean w = false;
    private ProgressBar x;
    private boolean y;
    private v z;

    private void a(q qVar) {
        String string;
        int i = 5;
        String string2 = getString(R.string.self_error_result);
        if (this.v.af()) {
        }
        if (qVar.n()) {
            string = getString(R.string.self_error_battery_copyright);
            i = 1;
        } else if (qVar.m()) {
            string = getString(R.string.self_error_battery);
            i = 2;
        } else if (qVar.ae()) {
            string = getString(R.string.fault_short_life_battery);
            i = 3;
        } else if (qVar.P()) {
            string = getString(R.string.fault_low_battery);
            i = 4;
        } else if (qVar.f()) {
            string = getString(R.string.land_GPS_ERROR);
        } else if (qVar.j()) {
            string = getString(R.string.land_IMUACCEL_ERROR);
        } else if (qVar.k()) {
            string = getString(R.string.land_IMUGYRO_ERROR);
        } else if (qVar.l()) {
            string = getString(R.string.land_BRO_ERROR);
        } else if ((qVar.h() || qVar.i()) && !qVar.I()) {
            string = getString(R.string.land_CAMP1_ERROR);
            i = 6;
        } else if (qVar.ai()) {
            string = getString(R.string.fault_bat_pre_heart_des);
            i = 7;
        } else if (qVar.I()) {
            string = getString(R.string.fault_compass);
            i = 8;
            this.s = true;
        } else {
            if (qVar.J()) {
            }
            if (qVar.K()) {
            }
            if (qVar.L()) {
            }
            if (qVar.M()) {
                string = getString(R.string.fault_gesture);
                i = 12;
            } else if (this.v.K().g()) {
                string = getString(R.string.rc_low_battery);
                i = 13;
            } else if (qVar.p()) {
                string2 = getString(R.string.fault_vps_tip);
                string = getString(R.string.fault_vps_des);
                i = 14;
            } else if (this.i) {
                getFragmentManager().beginTransaction().remove(this.n).commit();
                a(getString(R.string.self_error_auto_result_title), getString(R.string.self_error_auto_result), false, true);
                this.i = false;
                this.g = 0;
                return;
            } else {
                this.i = false;
                return;
            }
        }
        this.i = true;
        if (this.g < i && this.g != 0) {
            getFragmentManager().beginTransaction().remove(this.n).commit();
            a(getString(R.string.self_error_auto_result_title), getString(R.string.self_error_auto_result), false, true);
            this.g = i;
        }
        if (this.g != i && qVar.a() >= 0) {
            if (this.n == null || !this.n.isVisible()) {
                this.g = i;
                a(string2, string, true, false, this.s);
            }
        }
    }

    private void a(String str, String str2, boolean z, boolean z2) {
        this.p = 0.0f;
        this.e.removeCallbacks(this.f);
        if (this.o == null) {
            this.o = new AutoSelfErrorFrgment();
        }
        this.o.a(str2);
        this.o.b(str);
        this.o.b(z);
        this.o.a(z2);
        getFragmentManager().beginTransaction().setCustomAnimations(17432576, 17432577);
        getFragmentManager().beginTransaction().add(R.id.contrain_layout, this.o).commit();
    }

    private void a(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.p = 0.0f;
        this.e.removeCallbacks(this.f);
        boolean c = c();
        if (this.n == null) {
            this.n = new UpdateConnectDefeaFrgment();
        }
        if (!c) {
            getFragmentManager().beginTransaction().replace(R.id.contrain_layout, this.n).commitAllowingStateLoss();
        } else if (this.n.isAdded()) {
            getFragmentManager().beginTransaction().remove(this.n).commit();
            this.n = new UpdateConnectDefeaFrgment();
            getFragmentManager().beginTransaction().add(R.id.contrain_layout, this.n).commitAllowingStateLoss();
        }
        this.n.a(str2);
        this.n.b(str);
        this.n.c(getString(R.string.no_connect));
        this.n.c(z);
        this.n.a(z2);
        this.n.b(z3);
        getFragmentManager().beginTransaction().setCustomAnimations(17432576, 17432577);
    }

    private boolean b() {
        StringBuffer stringBuffer = new StringBuffer();
        List e = com.fimi.soul.module.update.a.a.a().e();
        if (e == null || e.size() <= 0) {
            this.a = com.fimi.soul.module.update.a.a.a().d();
            if (this.a == null || this.a.size() <= 0) {
                return false;
            }
            this.e.removeCallbacks(this.f);
            Intent intent = new Intent(this, FindNewFirmwareAvtivity.class);
            com.fimi.kernel.c.c.a().a(FindNewFirmwareAvtivity.a, this.a);
            startActivity(intent);
            finish();
            overridePendingTransition(17432576, 17432577);
            return true;
        }
        com.fimi.kernel.c.c.a().a(UpdateVersonBean.SP_NEED_DOWN_FIRMWWARES, e);
        this.e.removeCallbacks(this.f);
        startActivity(new Intent(this, FindOnlineFirmwareAvtivity.class));
        finish();
        overridePendingTransition(17432576, 17432577);
        return true;
    }

    private boolean c() {
        try {
            this.n = (UpdateConnectDefeaFrgment) getFragmentManager().findFragmentById(R.id.main_layout);
            if (this.n != null) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private com.fimi.soul.module.droneui.a.a f() {
        return new com.fimi.soul.module.droneui.a.a(this) {
            final /* synthetic */ CheckFirmwareActvity a;

            {
                this.a = r1;
            }

            public void a() {
            }

            public void b() {
            }

            public void c() {
            }

            public void d() {
                Intent intent = new Intent(this.a, LoginActivity.class);
                intent.putExtra(com.google.firebase.a.a.a.k, false);
                this.a.startActivity(intent);
                this.a.finish();
            }
        };
    }

    public void a() {
        this.r = (TextView) findViewById(R.id.tv_check_firmware);
        ao.a(getAssets(), this.r);
        this.h = (ProgressView) findViewById(R.id.checkFirmwareprogress);
        this.h.setMaxCount(400.0f);
        com.fimi.soul.module.update.a.a.a().c();
        this.v = ((DroidPlannerApp) getApplication()).a;
        com.fimi.soul.biz.e.d.a().b(null);
        this.b = (d) com.fimi.soul.biz.camera.b.a().d();
        this.b.t().b();
        if (this.b.d()) {
            this.b.r().k();
        }
        this.x = (ProgressBar) findViewById(R.id.checkFirmwareProgressBar);
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300);
        this.x.setAnimation(alphaAnimation);
        alphaAnimation.start();
    }

    public void d() {
        if (!this.v.U() || b()) {
            if (!this.v.U()) {
                startActivity(new Intent(this, FlightActivity.class));
            }
        } else if (this.y) {
            this.z.a().edit().putBoolean(this.A, false).commit();
            this.dpa.d();
        } else {
            startActivity(new Intent(this, FlightActivity.class));
        }
    }

    public void e() {
        if (this.s) {
            startActivity(new Intent(this, CaliCompassActivity.class));
            finish();
            overridePendingTransition(17432576, 17432577);
        }
        finish();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dpa.b((Activity) this);
        this.z = v.a((Context) this);
        this.A = com.fimi.soul.base.a.J;
        this.y = c.c().d(com.fimi.soul.base.a.L);
        this.i = false;
        getWindow().setFlags(128, 128);
        setContentView(R.layout.activity_check_firmware_actvity);
        a();
        this.c = new g(this, this.v);
        new Thread(new Runnable(this) {
            final /* synthetic */ CheckFirmwareActvity a;

            {
                this.a = r1;
            }

            public void run() {
                Looper.prepare();
                for (int i = 0; i < 5; i++) {
                    this.a.c.a();
                }
            }
        }).start();
        this.e.postDelayed(this.f, 200);
        this.v.a((b) this);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.e.removeMessages(1);
        this.v.b((b) this);
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        switch (aVar) {
            case ERROR_CODE:
                aVar2.ad();
                if (this.p <= 200.0f && this.i) {
                    return;
                }
                return;
            default:
                return;
        }
    }

    protected void onResume() {
        super.onResume();
        if (this.p > 0.0f) {
            this.e.postDelayed(this.f, 10);
        }
    }

    protected void onStop() {
        super.onStop();
        this.c.c();
        this.e.removeCallbacks(this.f);
    }
}
