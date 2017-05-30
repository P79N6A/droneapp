package com.fimi.soul.module.droneui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.g.f;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;
import com.google.android.gms.cast.framework.media.NotificationOptions;

public class IMUActivity extends BaseActivity implements OnClickListener, b {
    private static int E = 2;
    private static int F = 3;
    private static int G = 1;
    static f a;
    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private d H;
    private f I;
    private boolean J = false;
    private int K = 0;
    private Handler L = new Handler(this) {
        final /* synthetic */ IMUActivity a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == IMUActivity.E) {
                if (this.a.H != null) {
                    this.a.H.a((byte) 4);
                }
            } else if (message.what == IMUActivity.F) {
                this.a.a();
            } else if (message.what == IMUActivity.G) {
                this.a.H.a((byte) 7);
            }
        }
    };
    private Button b;
    private Button c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
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

    private void h() {
        this.b = (Button) findViewById(R.id.back_btn);
        this.b.setOnClickListener(this);
        this.d = (TextView) findViewById(R.id.aboutTitle);
        this.e = (TextView) findViewById(R.id.imu_gyroscope_x);
        this.f = (TextView) findViewById(R.id.imu_gyroscope_y);
        this.g = (TextView) findViewById(R.id.imu_gyroscope_z);
        this.h = (TextView) findViewById(R.id.imu_gyroscope_mod);
        this.i = (TextView) findViewById(R.id.imu_accelerometer_x);
        this.j = (TextView) findViewById(R.id.imu_accelerometer_y);
        this.k = (TextView) findViewById(R.id.imu_accelerometer_z);
        this.l = (TextView) findViewById(R.id.imu_accelerometer_mod);
        this.m = (TextView) findViewById(R.id.imu_compass_one_x);
        this.n = (TextView) findViewById(R.id.imu_compass_one_y);
        this.o = (TextView) findViewById(R.id.imu_compass_one_z);
        this.p = (TextView) findViewById(R.id.imu_compass_one_mod);
        this.q = (TextView) findViewById(R.id.imu_compass_two_x);
        this.r = (TextView) findViewById(R.id.imu_compass_two_y);
        this.s = (TextView) findViewById(R.id.imu_compass_two_z);
        this.t = (TextView) findViewById(R.id.imu_compass_two_mod);
        this.u = (TextView) findViewById(R.id.tv_imu_error);
        this.c = (Button) findViewById(R.id.btn_imu_detection);
        this.c.setOnClickListener(this);
        this.v = (TextView) findViewById(R.id.tv_imu_hint);
        this.w = (TextView) findViewById(R.id.tv_x);
        this.x = (TextView) findViewById(R.id.tv_y);
        this.y = (TextView) findViewById(R.id.tv_z);
        this.w = (TextView) findViewById(R.id.tv_mod);
        this.A = (TextView) findViewById(R.id.tv_gyroscope);
        this.B = (TextView) findViewById(R.id.tv_accelerometer);
        this.C = (TextView) findViewById(R.id.tv_compass_one);
        this.D = (TextView) findViewById(R.id.tv_compass_two);
        if (!this.drone.U()) {
            a(this.u, getResources().getColor(R.color.white_90), getResources().getString(R.string.connect_aircraft_hint));
        } else if (this.drone.ac()) {
            a(this.u, getResources().getColor(R.color.white_90), getResources().getString(R.string.state_flight_hint));
            a(this.c, getResources().getColor(R.color.white_half), false);
        } else {
            a(this.u, getResources().getColor(R.color.white_90), getResources().getString(R.string.hint_one));
        }
    }

    private void i() {
        this.H = d.a(this.drone);
        this.H.a((byte) 4);
        this.H.a((byte) 5);
        a();
    }

    public void a() {
        if (!this.drone.U() || this.drone.ac()) {
            if (this.drone.ac()) {
                a(this.u, getResources().getColor(R.color.white_90), getResources().getString(R.string.state_flight_hint));
            } else if (this.K != 1) {
                a(this.u, getResources().getColor(R.color.white_90), getResources().getString(R.string.connect_aircraft_hint));
                this.J = true;
            }
            a(this.c, getResources().getColor(R.color.white_half), false);
            this.e.setText(getResources().getString(R.string.no_use));
            this.f.setText(getResources().getString(R.string.no_use));
            this.g.setText(getResources().getString(R.string.no_use));
            this.h.setText(getResources().getString(R.string.no_use));
            this.i.setText(getResources().getString(R.string.no_use));
            this.j.setText(getResources().getString(R.string.no_use));
            this.k.setText(getResources().getString(R.string.no_use));
            this.l.setText(getResources().getString(R.string.no_use));
            this.m.setText(getResources().getString(R.string.no_use));
            this.n.setText(getResources().getString(R.string.no_use));
            this.o.setText(getResources().getString(R.string.no_use));
            this.p.setText(getResources().getString(R.string.no_use));
            this.q.setText(getResources().getString(R.string.no_use));
            this.r.setText(getResources().getString(R.string.no_use));
            this.s.setText(getResources().getString(R.string.no_use));
            this.t.setText(getResources().getString(R.string.no_use));
            return;
        }
        if (this.J && this.K != 1) {
            a(this.u, getResources().getColor(R.color.white_90), getResources().getString(R.string.hint_one));
            this.J = false;
        } else if (!this.u.getText().toString().equals(getResources().getString(R.string.detection_hint))) {
            a(this.c, getResources().getColor(R.color.white_90), true);
        }
        this.e.setText(this.drone.x().a() + "");
        this.f.setText(this.drone.x().b() + "");
        this.g.setText(this.drone.x().c() + "");
        this.h.setText(this.drone.x().d() + "");
        this.i.setText(this.drone.x().e() + "");
        this.j.setText(this.drone.x().f() + "");
        this.k.setText(this.drone.x().g() + "");
        this.l.setText(this.drone.x().h() + "");
        this.m.setText(this.drone.z().a() + "");
        this.n.setText(this.drone.z().b() + "");
        this.o.setText(this.drone.z().c() + "");
        this.p.setText(this.drone.z().d() + "");
        this.q.setText(this.drone.z().e() + "");
        this.r.setText(this.drone.z().f() + "");
        this.s.setText(this.drone.z().g() + "");
        this.t.setText(this.drone.z().h() + "");
    }

    public void a(Button button, int i, boolean z) {
        button.setEnabled(z);
        button.setTextColor(i);
    }

    public void a(TextView textView, int i, String str) {
        textView.setTextColor(i);
        textView.setText(str);
    }

    public void b() {
        if ((byte) 1 == this.drone.y().b()) {
            d.a(this.drone).c(153);
            this.I.f();
            if (this.drone.y().a() == 0) {
                this.K = 1;
                a(this.c, getResources().getColor(R.color.white_90), true);
                a(this.u, getResources().getColor(R.color.battery_green), getResources().getString(R.string.imu_normal));
                return;
            }
            this.K = 1;
            a(this.c, getResources().getColor(R.color.white_90), true);
            a(this.u, getResources().getColor(R.color.battery_red), getResources().getString(R.string.imu_exception));
        }
    }

    public void c() {
        if (a != null) {
            a.c();
            return;
        }
        a = new f(5000, new Runnable(this) {
            final /* synthetic */ IMUActivity a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.L.sendEmptyMessage(IMUActivity.E);
            }
        });
        a.d();
    }

    public void d() {
        if (this.I != null) {
            this.I.c();
            return;
        }
        this.I = new f(1000, new Runnable(this) {
            final /* synthetic */ IMUActivity a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.L.sendEmptyMessage(IMUActivity.G);
            }
        });
        this.I.d();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back_btn) {
            finish();
        } else if (id == R.id.btn_imu_detection) {
            a(this.c, getResources().getColor(R.color.white_half), false);
            a(this.u, getResources().getColor(R.color.white_half), getResources().getString(R.string.detection_hint));
            this.K = 0;
            d();
            this.L.postDelayed(new Runnable(this) {
                final /* synthetic */ IMUActivity a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.K != 1) {
                        this.a.K = 0;
                        this.a.a(this.a.u, this.a.getResources().getColor(R.color.white_90), this.a.getResources().getString(R.string.imu_detection_retry));
                        this.a.I.f();
                    }
                }
            }, NotificationOptions.a);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
        setContentView(R.layout.activity_imu);
        h();
        ao.a(getAssets(), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D);
        this.drone.a((b) this);
        i();
        c();
    }

    protected void onDestroy() {
        super.onDestroy();
        this.drone.b((b) this);
        a.f();
        if (this.I != null) {
            this.I.f();
        }
    }

    public void onDroneEvent(a aVar, com.fimi.soul.drone.a aVar2) {
        switch (aVar) {
            case IMU_INFO:
                this.L.sendEmptyMessage(F);
                break;
            case IMU_WORKSTATE:
                b();
                break;
            case CLEANALLOBJ:
                this.L.sendEmptyMessage(F);
                break;
        }
        this.L.sendEmptyMessage(F);
    }
}
