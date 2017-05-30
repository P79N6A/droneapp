package com.fimi.soul.module.setting;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.module.update.a.b;
import com.fimi.soul.module.update.a.g;
import com.fimi.soul.utils.ao;
import com.google.android.gms.drive.e;

public class AboutActivity extends BaseActivity implements OnClickListener {
    private static final int F = 1;
    private static final int G = 0;
    private static final int H = 1;
    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private d E;
    private int I = 0;
    g a;
    private Button b;
    private Button c;
    private TextView d;
    private TextView e;
    private ImageView f;
    private TextView g;
    private b h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private TextView w;
    private TextView x;
    private TextView y;
    private TextView z;

    private String a(int i) {
        return String.valueOf(i);
    }

    private void a() {
        this.b = (Button) findViewById(R.id.aboutBtn);
        this.b.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ AboutActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
    }

    private void b() {
        this.g = (TextView) findViewById(R.id.copyright);
        this.d = (TextView) findViewById(R.id.aboutVersion);
        this.e = (TextView) findViewById(R.id.agreementshengming_tv);
        this.e.setOnClickListener(this);
        this.e.getPaint().setFlags(8);
        this.e.getPaint().setAntiAlias(true);
        this.d.setText(getString(R.string.about_version, new Object[]{ao.d((Context) this)}));
        this.c = (Button) findViewById(R.id.scoreBtn);
        this.c.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ AboutActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + this.a.getPackageName()));
                intent.addFlags(e.a_);
                this.a.startActivity(intent);
            }
        });
        this.f = (ImageView) findViewById(R.id.aboutImg);
        this.m = (TextView) findViewById(R.id.tv_camera);
        this.i = (TextView) findViewById(R.id.tv_fc);
        this.k = (TextView) findViewById(R.id.tv_x2);
        this.j = (TextView) findViewById(R.id.tv_battery);
        this.l = (TextView) findViewById(R.id.tv_rc);
        this.n = (TextView) findViewById(R.id.tv_gimbal);
        this.o = (TextView) findViewById(R.id.tv_servo);
        this.p = (TextView) findViewById(R.id.tv_nofly);
        this.t = (TextView) findViewById(R.id.tv_fc_tip);
        this.u = (TextView) findViewById(R.id.tv_battery_tip);
        this.v = (TextView) findViewById(R.id.tv_x2_tip);
        this.w = (TextView) findViewById(R.id.tv_rc_tip);
        this.x = (TextView) findViewById(R.id.tv_camera_tip);
        this.y = (TextView) findViewById(R.id.tv_gimbal_tip);
        this.z = (TextView) findViewById(R.id.tv_servo_tip);
        this.A = (TextView) findViewById(R.id.tv_nofly_tip);
        this.q = (TextView) findViewById(R.id.tv_rc_x6);
        this.r = (TextView) findViewById(R.id.tv_fc_x6);
        this.B = (TextView) findViewById(R.id.tv_fc_x6_tip);
        this.C = (TextView) findViewById(R.id.tv_rc_x6_tip);
        if (!com.fimi.soul.biz.e.d.a().k()) {
            this.B.setVisibility(8);
            this.r.setVisibility(8);
        }
        this.D = (TextView) findViewById(R.id.tv_fc_bootloader_tip);
        this.s = (TextView) findViewById(R.id.tv_fc_bootloader_version);
        this.s.setVisibility(8);
        this.D.setVisibility(8);
        this.a = new g(this, this.drone);
    }

    private void c() {
        this.h = (b) c.c().a(com.fimi.soul.module.update.b.w, b.class);
        if (this.h != null && this.h.b() > 0) {
            this.l.setText(a(this.h.b()));
        } else if (this.I == 1) {
            this.l.setText(R.string.no_get_versin);
        }
        if (this.h != null && this.h.a() > 0) {
            this.i.setText(a(this.h.a()));
        } else if (this.I == 1) {
            this.i.setText(R.string.no_get_versin);
        }
        if (this.h != null && this.h.c() > 0) {
            this.n.setText(a(this.h.c()));
        } else if (this.I == 1) {
            this.n.setText(R.string.no_get_versin);
        }
        if (this.h != null && this.h.h() > 0) {
            this.o.setText(a(this.h.h()));
        } else if (this.I == 1) {
            this.o.setText(R.string.no_get_versin);
        }
        if (this.h != null && this.h.f() > 0) {
            this.k.setText(a(this.h.f()));
        } else if (this.I == 1) {
            this.k.setText(R.string.no_get_versin);
        }
        if (this.h != null && this.h.g() > 0) {
            this.p.setText(a(this.h.g()));
        } else if (this.I == 1) {
            this.p.setText(R.string.no_get_versin);
        }
        if (this.h != null && this.h.e() > 0) {
            this.q.setText(a(this.h.e()));
        } else if (this.I == 1) {
            this.q.setText(R.string.no_get_versin);
        }
        if (this.h != null && this.h.n() > 0) {
            this.m.setText(this.h.n() + "");
        } else if (this.I == 1) {
            this.m.setText(R.string.no_get_versin);
        }
        if (!TextUtils.isEmpty(com.fimi.soul.biz.e.c.a().e()) && Integer.valueOf(com.fimi.soul.biz.e.c.a().e()).intValue() > 0) {
            this.r.setText(com.fimi.soul.biz.e.c.a().e() + "");
        } else if (this.I == 1) {
            this.r.setText(R.string.no_get_versin);
        }
        if (this.h != null && this.h.l() > 0) {
            this.j.setText(a(this.h.l()));
        } else if (this.I == 1) {
            this.j.setText(R.string.no_get_versin);
        }
        if (this.h != null && this.h.o() > 0) {
            this.s.setText(a(this.h.o()));
        } else if (this.I == 1) {
            this.s.setText(R.string.no_get_versin);
        }
        if (this.I != 1) {
            d();
        }
    }

    private void d() {
        this.I = 1;
        new Thread(new Runnable(this) {
            final /* synthetic */ AboutActivity a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.a.b();
            }
        }).start();
        getHandler().sendEmptyMessageDelayed(1, 2200);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.agreementshengming_tv:
                Intent intent = new Intent(this, ShowTextActivity.class);
                intent.putExtra(ShowTextActivity.c, a.h);
                intent.putExtra(ShowTextActivity.a, R.string.agreement_shengming);
                intent.putExtra(ShowTextActivity.b, "file:///android_asset/statement.html");
                startActivity(intent);
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_about);
        this.E = (d) com.fimi.soul.biz.camera.b.a().d();
        a();
        b();
        c();
        ao.a(getAssets(), this.d, this.e, this.b, this.g, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.q, this.r, this.B, this.C);
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.a != null) {
            this.a.c();
        }
    }

    public void onHandleMessage(Message message) {
        if (message.what == 1) {
            c();
        }
    }
}
