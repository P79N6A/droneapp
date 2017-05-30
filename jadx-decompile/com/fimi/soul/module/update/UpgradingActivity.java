package com.fimi.soul.module.update;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.biz.camera.entity.RelayEntity;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.e.c;
import com.fimi.soul.biz.update.f;
import com.fimi.soul.biz.update.f.b;
import com.fimi.soul.biz.update.i;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.drone.d.o;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.utils.ao;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.List;

public class UpgradingActivity extends BaseActivity implements e<X11RespCmd>, com.fimi.soul.module.update.c.a {
    public static final String a = "sp_upgrade_skip";
    private static final int q = 153;
    private static final int r = 256;
    private static final int s = 136;
    private static final int t = 102;
    private static final int u = 50;
    private static int w = 1;
    private int A = 0;
    private d B = null;
    private com.fimi.soul.biz.update.d C;
    private String D = null;
    private a E;
    private Boolean F;
    private boolean G;
    private StringBuffer H = null;
    private boolean I;
    private TextView J;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private v N;
    private String O = com.fimi.soul.base.a.L;
    private Toast P;
    List<FirmwareInfo> b;
    com.fimi.soul.biz.update.a c = null;
    c d = null;
    com.fimi.soul.biz.e.d e = null;
    com.fimi.soul.biz.e.d.a f;
    c g = null;
    com.fimi.soul.biz.e.c.a h;
    long i;
    private ProgressView j;
    private TextView k;
    private ImageView l;
    private com.fimi.soul.drone.a m;
    private TextView n;
    private f o;
    private TextView p;
    private final int v = 32;
    private boolean x;
    private int y = 0;
    private int z = 1;

    public enum a {
        OnlyAP,
        OnlyRC,
        RCAndAP,
        Others
    }

    private void a(int i, int i2, int i3) {
        if (System.currentTimeMillis() - this.i > 500 || i2 == i3 || i == 256) {
            this.i = System.currentTimeMillis();
            Message message = new Message();
            message.what = i;
            message.arg1 = i2;
            message.arg2 = i3;
            getHandler().sendMessageDelayed(message, 50);
        }
    }

    private void a(FirmwareInfo firmwareInfo) {
        if (b(firmwareInfo)) {
            this.c.a(new i(this) {
                final /* synthetic */ UpgradingActivity a;

                {
                    this.a = r1;
                }

                public void a(boolean z, long j, long j2, int i) {
                    if (z) {
                        this.a.getHandler().sendEmptyMessageDelayed(102, 50);
                    }
                }
            }, this, firmwareInfo);
        } else {
            this.o.a(firmwareInfo, this.z);
        }
    }

    private void a(String str) {
        a(153, (Integer.valueOf(str.substring(str.lastIndexOf("=") + 1, str.length()).trim()).intValue() / 2) + 50, 100);
    }

    private void b() {
        this.o.e();
        this.b = com.fimi.soul.module.update.a.a.a().d();
        if (this.b == null || this.b.size() == 0) {
            finish();
            return;
        }
        this.p.setText(getResources().getString(R.string.upgrading_firmware) + ((FirmwareInfo) this.b.get(this.z - 1)).getSysName());
        this.E = a(this.b);
        this.A = this.b.size();
        this.y = this.b.size() * 100;
        this.j.setMaxCount((float) this.y);
        this.o.a(new i(this) {
            final /* synthetic */ UpgradingActivity a;

            {
                this.a = r1;
            }

            public void a(boolean z, long j, long j2, int i) {
                if (i == -1) {
                    this.a.k();
                } else if (z) {
                    this.a.a(256, i, 0);
                } else {
                    this.a.z = i;
                    this.a.a(153, (int) j, (int) j2);
                }
            }
        });
        this.o.a(new b(this) {
            final /* synthetic */ UpgradingActivity a;

            {
                this.a = r1;
            }

            public void a(int i) {
                this.a.c(i);
            }

            public void a(boolean z) {
                if (z && !this.a.I) {
                    this.a.f();
                    this.a.I = true;
                }
            }
        });
        FirmwareInfo firmwareInfo = (FirmwareInfo) this.b.get(0);
        if (c()) {
            this.d.a();
            if (firmwareInfo.getSysId() == 4 || firmwareInfo.getSysId() == 13) {
                b(firmwareInfo.getSysId());
            } else {
                a(firmwareInfo);
            }
        }
    }

    private void b(final int i) {
        this.D = "firmware.zip";
        new Thread(new Runnable(this) {
            final /* synthetic */ UpgradingActivity b;

            public void run() {
                l.c("request camera upgrade:" + i);
                if (i == 13) {
                    l.c("request camera upgrade:xx");
                    com.fimi.soul.biz.camera.c.d s = this.b.B.s();
                    this.b.C;
                    s.h(com.fimi.soul.biz.update.d.c());
                    return;
                }
                s = this.b.B.s();
                this.b.C;
                s.h(com.fimi.soul.biz.update.d.b());
            }
        }).start();
    }

    private boolean b(FirmwareInfo firmwareInfo) {
        return firmwareInfo.getSysId() == 11 || firmwareInfo.getSysId() == 15 || firmwareInfo.getSysId() == 14;
    }

    private void c(int i) {
        a(153, (i / 2) + 50, 100);
    }

    private void c(FirmwareInfo firmwareInfo) {
        if (b(firmwareInfo)) {
            this.c.a(new i(this) {
                final /* synthetic */ UpgradingActivity a;

                {
                    this.a = r1;
                }

                public void a(boolean z, long j, long j2, int i) {
                    if (z) {
                        this.a.getHandler().sendEmptyMessageDelayed(102, 50);
                    }
                }
            }, this, firmwareInfo);
        } else if (d(firmwareInfo)) {
            this.o.a(firmwareInfo, this.z);
        } else if (d(firmwareInfo)) {
            this.o.a(firmwareInfo, this.z);
        } else if (this.m.U()) {
            this.o.a(firmwareInfo, this.z);
        } else {
            getHandler().sendEmptyMessageDelayed(32, 50);
        }
    }

    private boolean c() {
        if (!this.o.c()) {
            return true;
        }
        k();
        return false;
    }

    private void d() {
        this.d.b();
        this.d.a();
        try {
            this.c.e();
        } catch (Exception e) {
            l.b("e:closeFtpNetwork:" + e.getMessage().toString());
        }
        this.e = com.fimi.soul.biz.e.d.a();
        this.f = new com.fimi.soul.biz.e.d.a(this) {
            final /* synthetic */ UpgradingActivity a;

            {
                this.a = r1;
            }

            public void a(RelayEntity relayEntity) {
                int firmupg_finished = relayEntity.getFirmupg_finished();
                if (firmupg_finished > 0) {
                    if (!this.a.L) {
                        this.a.a(153, firmupg_finished, 100);
                    }
                    if (firmupg_finished < 100) {
                        this.a.d.b();
                    } else if (!this.a.L) {
                        l.d(((FirmwareInfo) this.a.b.get(this.a.A - 1)).getVersion());
                        this.a.a(256, 0, 0);
                        this.a.L = true;
                    }
                }
            }
        };
        this.e.a(this.f);
        this.g = c.a();
        this.h = new com.fimi.soul.biz.e.c.a(this) {
            final /* synthetic */ UpgradingActivity a;

            {
                this.a = r1;
            }

            public void a(RelayEntity relayEntity) {
                int firmupg_finished = relayEntity.getFirmupg_finished();
                if (firmupg_finished > 0) {
                    if (!this.a.K) {
                        this.a.a(153, firmupg_finished, 100);
                    }
                    if (firmupg_finished < 100) {
                        this.a.d.b();
                    } else if (!this.a.K) {
                        l.d(((FirmwareInfo) this.a.b.get(this.a.A - 1)).getVersion());
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        this.a.a(256, 0, 0);
                        this.a.K = true;
                    }
                }
            }
        };
        this.g.a(this.h);
    }

    private boolean d(FirmwareInfo firmwareInfo) {
        return firmwareInfo.getSysId() == 1;
    }

    private void e() {
        this.d = new c(0, this);
        this.H = new StringBuffer();
        this.E = a.Others;
        w = 1;
        this.c = new com.fimi.soul.biz.update.a();
        this.C = new com.fimi.soul.biz.update.d();
        this.B = (d) com.fimi.soul.biz.camera.b.a().d();
        this.I = false;
        this.B.c(false);
        this.B.a((e) this);
        this.B.c(new com.fimi.kernel.b.c.d(this) {
            final /* synthetic */ UpgradingActivity a;

            {
                this.a = r1;
            }

            public void a(String str) {
            }
        });
        this.B.s().a(new i(this) {
            final /* synthetic */ UpgradingActivity a;

            {
                this.a = r1;
            }

            public void a(boolean z, long j, long j2, int i) {
                l.c("uplaod file progress:" + ((100 * j) / j2) + "%");
                if (!this.a.B.s().g()) {
                    this.a.a(153, ((int) j) / 2, (int) j2);
                }
            }
        });
        l.e();
        this.m = ((DroidPlannerApp) getApplication()).a;
        this.o = new f(this, this.m);
    }

    private void f() {
        l.c(com.fimi.soul.biz.camera.e.aZ);
        this.I = true;
        l.e(((FirmwareInfo) this.b.get(0)).getVersion());
        g();
    }

    private void g() {
        ((FirmwareInfo) this.b.get(0)).setIsUpgradeSuccess(Boolean.valueOf(true));
        if (this.A >= 2) {
            FirmwareInfo firmwareInfo = (FirmwareInfo) this.b.get(1);
            this.z++;
            a(firmwareInfo);
            return;
        }
        h();
    }

    private void h() {
        w = 0;
        this.d.d();
        this.o.m();
        if (this.G) {
            try {
                this.H.deleteCharAt(this.H.length() - 1);
            } catch (Exception e) {
            }
        }
        if (!this.M) {
            if (this.E == a.OnlyRC) {
                l.b("reset rc");
                this.o.k();
                i();
            } else {
                i();
            }
            this.M = true;
        }
    }

    private void i() {
        n();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        w = 0;
        m();
    }

    private void j() {
        if (this.G) {
            z.a((Context) this, this.H.toString() + getResources().getString(R.string.updatefail));
        } else {
            z.a((Context) this, (int) R.string.upgrade_firmware_success);
        }
    }

    private void k() {
        this.G = true;
        this.I = true;
        this.B.s().a(true);
        getHandler().sendEmptyMessageDelayed(32, 50);
    }

    private void l() {
        this.H.append(((FirmwareInfo) this.b.get(this.z - 1)).getSysName() + Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (a() && this.m.T().a()) {
            this.z++;
            if (c()) {
                c((FirmwareInfo) this.b.get(this.z - 1));
                return;
            }
            return;
        }
        m();
    }

    private void m() {
        Intent intent = new Intent(this, UpgradeResultActivity.class);
        intent.putExtra(UpgradeResultActivity.a, (Serializable) this.b);
        startActivity(intent);
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    private void n() {
        if (this.B != null) {
            this.B.s().a(true);
            this.B = null;
        }
        this.o.e();
        this.o.l();
        this.c = null;
        this.d.d();
        o();
        p();
        getHandler().removeCallbacksAndMessages(null);
        System.gc();
    }

    private void o() {
        if (this.e != null && this.f != null) {
            this.e.b(this.f);
        }
    }

    private void p() {
        if (this.g != null && this.h != null) {
            this.g.b(this.h);
        }
    }

    private void q() {
        if (this.x) {
            this.B.s().a(true);
            new Thread(new Runnable(this) {
                final /* synthetic */ UpgradingActivity a;

                {
                    this.a = r1;
                }

                public void run() {
                    o.a.d = (byte) 0;
                    o.a.e = (byte) 2;
                    this.a.m.T().a(o.a.a());
                }
            }).start();
            this.P.cancel();
            startActivity(new Intent(this, FindNewFirmwareAvtivity.class));
            finish();
            return;
        }
        this.x = true;
        this.P = Toast.makeText(getApplicationContext(), R.string.upgrading_not_disconnect, 0);
        this.P.show();
        getHandler().sendEmptyMessageDelayed(136, 2000);
    }

    public a a(List<FirmwareInfo> list) {
        a aVar = a.Others;
        a aVar2 = aVar;
        for (FirmwareInfo firmwareInfo : list) {
            if (firmwareInfo.getSysId() == 11) {
                aVar = a.OnlyAP;
                aVar2 = aVar;
                for (FirmwareInfo firmwareInfo2 : list) {
                    aVar2 = firmwareInfo2.getSysId() == 1 ? a.RCAndAP : aVar2;
                }
                return aVar2;
            }
            aVar2 = firmwareInfo2.getSysId() == 1 ? a.OnlyRC : aVar2;
        }
        return aVar2;
    }

    public void a(int i) {
        this.z = i;
    }

    public void a(boolean z) {
        if (z) {
            k();
        }
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
        if (z && x11RespCmd.isNotification()) {
            if (com.fimi.soul.biz.camera.e.aY.equals(x11RespCmd.getType())) {
                l.c(com.fimi.soul.biz.camera.e.aY);
                this.d.b();
            }
            if (com.fimi.soul.biz.camera.e.aZ.equals(x11RespCmd.getType())) {
                f();
            }
            if (com.fimi.soul.biz.camera.e.ba.equals(x11RespCmd.getType())) {
                l.c(com.fimi.soul.biz.camera.e.ba);
            }
            if (com.fimi.soul.biz.camera.e.bd.equals(x11RespCmd.getType())) {
                l.c(com.fimi.soul.biz.camera.e.bd);
            }
            if (x11RespCmd.getType().contains(com.fimi.soul.biz.camera.e.bb) && !this.I) {
                String type = x11RespCmd.getType();
                l.c(type);
                a(type);
            }
        }
    }

    public boolean a() {
        return this.A > this.z;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dpa.b((Activity) this);
        this.N = v.a((Context) this);
        this.F = Boolean.valueOf(this.N.a().getBoolean(this.O, false));
        getWindow().setFlags(128, 128);
        setContentView(R.layout.activity_upgrading);
        this.j = (ProgressView) findViewById(R.id.progress_view);
        this.k = (TextView) findViewById(R.id.tv_progress);
        ao.b(getAssets(), this.k);
        this.l = (ImageView) findViewById(R.id.img_anim);
        this.p = (TextView) findViewById(R.id.upgrade_result);
        this.J = (TextView) findViewById(R.id.upgrading_warning);
        ao.a(getAssets(), this.p, this.J);
        this.n = (TextView) findViewById(R.id.tv_percent);
        ao.b(getAssets(), this.n);
        this.z = 1;
        e();
        b();
    }

    protected void onDestroy() {
        super.onDestroy();
        n();
    }

    public void onHandleMessage(Message message) {
        if (message.what == 153) {
            this.d.b();
            this.p.setText(getResources().getString(R.string.upgrading_firmware) + ((FirmwareInfo) this.b.get(this.z - 1)).getSysName());
            int i = ((message.arg1 * 100) / message.arg2) + ((this.z - 1) * 100);
            this.k.setText(((i * 100) / this.y) + "");
            this.j.setCurrentCount((float) i);
        }
        if (message.what == 256) {
            this.o.f();
            ((FirmwareInfo) this.b.get(this.z - 1)).setIsUpgradeSuccess(Boolean.valueOf(true));
            this.o.a((FirmwareInfo) this.b.get(this.z - 1));
            if (!c()) {
                return;
            }
            if (a()) {
                this.z++;
                a((FirmwareInfo) this.b.get(this.z - 1));
            } else {
                h();
            }
        }
        if (message.what == 136) {
            this.x = false;
        }
        if (message.what == 102) {
            d();
        }
        if (message.what == 32) {
            l();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        q();
        return false;
    }

    protected void onResume() {
        super.onResume();
        if (w == 0) {
            w = 0;
            m();
        }
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.l.setBackgroundResource(R.drawable.update_anim);
        ((AnimationDrawable) this.l.getBackground()).start();
    }
}
