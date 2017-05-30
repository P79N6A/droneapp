package com.fimi.soul.module.droneui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.t;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.d.f;
import com.fimi.soul.drone.h.u;
import com.fimi.soul.entity.BatteryUpdateSize;
import com.fimi.soul.module.update.a.a;
import com.fimi.soul.module.update.a.e;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.BatteryCapacityView;
import com.fimi.soul.view.BatteryVoltageView;
import com.xiaomi.mipush.sdk.Constants;

public class BatteryInfoActivity extends BaseActivity implements OnClickListener, b {
    private static int A = 1;
    private static final int C = 1340;
    private static final int w = 75;
    private static final int x = 10;
    private boolean B = true;
    private a D;
    private Handler E = new Handler(this) {
        final /* synthetic */ BatteryInfoActivity a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == BatteryInfoActivity.A && !this.a.B) {
                f.i(this.a.drone);
            }
        }
    };
    private float F;
    private float G;
    private boolean H = true;
    private Button a;
    private TextView b;
    private TextView c;
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
    private ImageView n;
    private BatteryCapacityView o;
    private BatteryVoltageView p;
    private BatteryVoltageView q;
    private BatteryVoltageView r;
    private BatteryVoltageView s;
    private com.fimi.soul.utils.a.a t;
    private boolean u = false;
    private com.fimi.soul.module.update.a.b v;
    private int y = 0;
    private boolean z = true;

    private String a(int i) {
        return t.b((((double) i) / 100.0d) + 2.0d, 2) + " V";
    }

    private void a(u uVar) {
        int c = uVar.c() & 65535;
        char b = uVar.b();
        int a = uVar.a() & 255;
        byte d = uVar.d();
        long e = uVar.e();
        long f = uVar.f();
        long g = uVar.g();
        long h = uVar.h();
        if (c > 0) {
            this.D.a(new e(a, d, c, String.valueOf(Long.valueOf((long) b)), e, f, g, h));
            this.D.a(a, c);
        }
    }

    private void b() {
        if (this.drone.U()) {
            if (this.H) {
                com.fimi.soul.drone.d.e.a(this.drone);
            }
            String str = (this.drone.w().i() - 60) + getString(R.string.temp_unit);
            if (this.drone.w().i() - 60 >= 75) {
                str = str + getString(R.string.battery_high_temperature);
                this.b.setTextColor(getResources().getColor(R.color.battery_except));
            } else if (this.drone.w().i() - 60 < 10) {
                str = str + getString(R.string.battery_low_temperature);
                this.b.setTextColor(getResources().getColor(R.color.battery_low_temperature));
            } else {
                str = str + getString(R.string.battery_nomal_temperature);
                this.b.setTextColor(getResources().getColor(R.color.white));
            }
            this.b.setText(" " + str);
            d();
        }
    }

    private void c() {
        this.a = (Button) findViewById(R.id.back_btn);
        this.a.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ BatteryInfoActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
    }

    private void d() {
        this.F = (float) this.drone.D().e();
        this.G = (float) this.drone.D().d();
        if (this.F > 0.0f) {
            this.i.setText(" " + a(this.drone.w().a()));
            this.j.setText(" " + a(this.drone.w().b()));
            this.k.setText(" " + a(this.drone.w().c()));
            this.l.setText(" " + a(this.drone.w().d()));
            this.h.setText(" " + this.drone.D().d + "");
            int g = this.drone.w().g();
            if (g < 0) {
                g = 0;
            }
            int i = (int) ((((float) g) / this.F) * 100.0f);
            int i2 = (int) ((((float) g) / this.G) * 100.0f);
            if (i < 0) {
                i = 0;
            }
            if (i > 100) {
                i = 100;
            }
            if (i2 <= 30) {
                this.o.setPercent(i2);
            } else {
                this.o.setPercent(i);
            }
            this.g.setText(" " + ((int) this.F) + " mAH");
            this.c.setText(" " + g + " mAH");
            double d = 4.35d - 3.2d;
            double a = ((((double) this.drone.w().a()) / 100.0d) + 2.0d) - 3.2d;
            this.p.setPercent(a > 0.0d ? (int) ((a / d) * 100.0d) : 0);
            a = ((((double) this.drone.w().b()) / 100.0d) + 2.0d) - 3.2d;
            this.q.setPercent(a > 0.0d ? (int) ((a / d) * 100.0d) : 0);
            a = ((((double) this.drone.w().c()) / 100.0d) + 2.0d) - 3.2d;
            this.r.setPercent(a > 0.0d ? (int) ((a / d) * 100.0d) : 0);
            double d2 = ((((double) this.drone.w().d()) / 100.0d) + 2.0d) - 3.2d;
            this.s.setPercent(d2 > 0.0d ? (int) ((d2 / d) * 100.0d) : 0);
            if (this.y >= C) {
                this.d.setText(this.drone.w().l() + "");
            }
            double a2 = (((double) this.drone.w().a()) / 100.0d) + 2.0d;
            double b = (((double) this.drone.w().b()) / 100.0d) + 2.0d;
            a = (((double) this.drone.w().c()) / 100.0d) + 2.0d;
            d2 = 2.0d + (((double) this.drone.w().d()) / 100.0d);
            double d3 = a2 > b ? a2 : b;
            if (d3 <= a) {
                d3 = a;
            }
            if (d3 <= d2) {
                d3 = d2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            int i3 = 0;
            if (a(d3, a2) > 0.2d || a2 < 3.0d) {
                if (a(d3, a2) > 0.4d) {
                    this.i.setTextColor(getResources().getColor(R.color.battery_damage));
                    this.p.a(BatteryVoltageView.a.DAMAGE);
                    stringBuilder.append(getString(R.string.battery_one) + getString(R.string.battery_damage));
                } else if (a2 < 3.0d) {
                    this.i.setTextColor(getResources().getColor(R.color.battery_except));
                    this.p.a(BatteryVoltageView.a.EXCEPT);
                    stringBuilder.append(getString(R.string.battery_one) + getString(R.string.battery_over_dischange));
                } else {
                    this.i.setTextColor(getResources().getColor(R.color.battery_except));
                    this.p.a(BatteryVoltageView.a.EXCEPT);
                    stringBuilder.append(getString(R.string.battery_one) + getString(R.string.battery_pressure_highter));
                }
                i3 = 1;
            } else {
                this.p.a(BatteryVoltageView.a.NOMAL);
                this.i.setTextColor(getResources().getColor(R.color.battery_standar_text));
            }
            if (a(d3, b) > 0.2d || b < 3.0d) {
                if (i3 % 2 != 0) {
                    stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                if (a(d3, b) > 0.4d) {
                    this.j.setTextColor(getResources().getColor(R.color.battery_damage));
                    this.q.a(BatteryVoltageView.a.DAMAGE);
                    stringBuilder.append(getString(R.string.battery_two) + getString(R.string.battery_damage));
                } else if (b < 3.0d) {
                    this.j.setTextColor(getResources().getColor(R.color.battery_except));
                    this.q.a(BatteryVoltageView.a.EXCEPT);
                    stringBuilder.append(getString(R.string.battery_two) + getString(R.string.battery_over_dischange));
                } else {
                    this.j.setTextColor(getResources().getColor(R.color.battery_except));
                    this.q.a(BatteryVoltageView.a.EXCEPT);
                    stringBuilder.append(getString(R.string.battery_two) + getString(R.string.battery_pressure_highter));
                }
                i3++;
                if (i3 % 2 == 0) {
                    stringBuilder.append("\n");
                }
            } else {
                this.q.a(BatteryVoltageView.a.NOMAL);
                this.j.setTextColor(getResources().getColor(R.color.battery_standar_text));
            }
            if (a(d3, a) > 0.2d || a < 3.0d) {
                if (i3 % 2 != 0) {
                    stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                if (a(d3, a) > 0.4d) {
                    this.k.setTextColor(getResources().getColor(R.color.battery_damage));
                    this.r.a(BatteryVoltageView.a.DAMAGE);
                    stringBuilder.append(getString(R.string.battery_three) + getString(R.string.battery_damage));
                } else if (a < 3.0d) {
                    this.k.setTextColor(getResources().getColor(R.color.battery_except));
                    this.r.a(BatteryVoltageView.a.EXCEPT);
                    stringBuilder.append(getString(R.string.battery_three) + getString(R.string.battery_over_dischange));
                } else {
                    this.k.setTextColor(getResources().getColor(R.color.battery_except));
                    this.r.a(BatteryVoltageView.a.EXCEPT);
                    stringBuilder.append(getString(R.string.battery_three) + getString(R.string.battery_pressure_highter));
                }
                i3++;
                if (i3 % 2 == 0) {
                    stringBuilder.append("\n");
                }
            } else {
                this.r.a(BatteryVoltageView.a.NOMAL);
                this.k.setTextColor(getResources().getColor(R.color.battery_standar_text));
            }
            if (a(d3, d2) > 0.2d || d2 < 3.0d) {
                if (i3 % 2 != 0) {
                    stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                if (a(d3, d2) > 0.4d) {
                    this.l.setTextColor(getResources().getColor(R.color.battery_damage));
                    this.s.a(BatteryVoltageView.a.DAMAGE);
                    stringBuilder.append(getString(R.string.battery_four) + getString(R.string.battery_damage));
                } else if (d2 < 3.0d) {
                    this.l.setTextColor(getResources().getColor(R.color.battery_except));
                    this.s.a(BatteryVoltageView.a.EXCEPT);
                    stringBuilder.append(getString(R.string.battery_four) + getString(R.string.battery_over_dischange));
                } else {
                    this.l.setTextColor(getResources().getColor(R.color.battery_except));
                    this.s.a(BatteryVoltageView.a.EXCEPT);
                    stringBuilder.append(getString(R.string.battery_four) + getString(R.string.battery_pressure_highter));
                }
                if ((i3 + 1) % 2 == 0) {
                    stringBuilder.append("\n");
                }
            } else {
                this.s.a(BatteryVoltageView.a.NOMAL);
                this.l.setTextColor(getResources().getColor(R.color.battery_standar_text));
            }
            this.f.setText(stringBuilder.toString());
        }
    }

    private void e() {
        if (this.y >= 1342 && !this.u) {
            BatteryUpdateSize batteryUpdateSize = new BatteryUpdateSize();
            batteryUpdateSize.setBatteryId(a.a().a(5).i());
            if (!TextUtils.isEmpty(batteryUpdateSize.getBatteryId())) {
                batteryUpdateSize.setBatteryUpdateSize((this.drone.w().m() / 20) * 20);
                if (batteryUpdateSize.getBatteryUpdateSize() < 20) {
                    this.t.d(batteryUpdateSize);
                    this.u = false;
                    return;
                }
                BatteryUpdateSize b = this.t.b(batteryUpdateSize);
                if (b == null) {
                    batteryUpdateSize.setMessageHintSize(1);
                    this.t.a(batteryUpdateSize);
                    this.n.setVisibility(0);
                    this.u = true;
                } else if (b.getMessageHintSize() < 3) {
                    batteryUpdateSize.setMessageHintSize(b.getMessageHintSize() + 1);
                    this.t.c(batteryUpdateSize);
                    this.n.setVisibility(0);
                    this.u = true;
                }
            }
        }
    }

    public double a(double d, double d2) {
        return ((d * 100.0d) - (d2 * 100.0d)) / 100.0d;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.update_flag_iv:
                if (this.m.getVisibility() == 0) {
                    this.m.setVisibility(8);
                    return;
                } else {
                    this.m.setVisibility(0);
                    return;
                }
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
        setContentView(R.layout.battery_info);
        this.y = a.a().a(5).b();
        this.f = (TextView) findViewById(R.id.except_tv);
        this.b = (TextView) findViewById(R.id.temperature);
        this.o = (BatteryCapacityView) findViewById(R.id.residue_capacity);
        this.c = (TextView) findViewById(R.id.current_capacity);
        this.g = (TextView) findViewById(R.id.all_capacity);
        this.h = (TextView) findViewById(R.id.discharge_times);
        this.i = (TextView) findViewById(R.id.battery_one);
        this.j = (TextView) findViewById(R.id.battery_two);
        this.k = (TextView) findViewById(R.id.battery_three);
        this.l = (TextView) findViewById(R.id.battery_four);
        this.p = (BatteryVoltageView) findViewById(R.id.battery_voltage_view1);
        this.q = (BatteryVoltageView) findViewById(R.id.battery_voltage_view2);
        this.r = (BatteryVoltageView) findViewById(R.id.battery_voltage_view3);
        this.s = (BatteryVoltageView) findViewById(R.id.battery_voltage_view4);
        this.d = (TextView) findViewById(R.id.over_dischange_tv);
        this.e = (TextView) findViewById(R.id.over_dischange_declare_tv);
        if (this.y < C) {
            this.d.setVisibility(8);
            this.e.setVisibility(8);
        }
        this.n = (ImageView) findViewById(R.id.update_flag_iv);
        this.n.setVisibility(8);
        this.n.setOnClickListener(this);
        this.m = (TextView) findViewById(R.id.battery_update_hint_tv);
        this.m.setVisibility(8);
        c();
        b();
        ao.a(getAssets(), getWindow().getDecorView());
        this.drone.a((b) this);
        f.i(this.drone);
        this.E.sendEmptyMessageDelayed(A, 200);
        this.E.sendEmptyMessageDelayed(A, 400);
        this.E.sendEmptyMessageDelayed(A, 600);
        this.E.sendEmptyMessageDelayed(A, 800);
        this.B = false;
        this.c.setSingleLine(true);
        this.c.setEllipsize(TruncateAt.MARQUEE);
        this.c.setMarqueeRepeatLimit(6);
        this.t = com.fimi.soul.utils.a.a.a((Context) this);
        this.D = a.a();
    }

    protected void onDestroy() {
        super.onDestroy();
        this.drone.b((b) this);
    }

    public void onDroneEvent(d.a aVar, com.fimi.soul.drone.a aVar2) {
        switch (aVar) {
            case BATTERYINFO:
                b();
                this.H = false;
                break;
            case BATTERY:
                b();
                e();
                break;
            case FCVERSION2:
                this.v = (com.fimi.soul.module.update.a.b) c.c().a(com.fimi.soul.module.update.b.w, com.fimi.soul.module.update.a.b.class);
                if (!this.B) {
                    if (aVar2.j().a() == (byte) 5) {
                        this.y = aVar2.j().c() & 65535;
                        this.B = true;
                    }
                    a(aVar2.j());
                    if (this.y < C) {
                        this.d.setVisibility(8);
                        this.e.setVisibility(8);
                        break;
                    }
                    this.d.setVisibility(0);
                    this.e.setVisibility(0);
                    break;
                }
                return;
        }
        if (!aVar2.U()) {
            this.u = false;
            this.m.setVisibility(8);
            this.n.setVisibility(8);
            this.H = true;
            this.o.setPercent(-1);
            this.p.setPercent(0);
            this.q.setPercent(0);
            this.r.setPercent(0);
            this.s.setPercent(0);
            this.i.setText(getResources().getString(R.string.no_use));
            this.j.setText(getResources().getString(R.string.no_use));
            this.k.setText(getResources().getString(R.string.no_use));
            this.l.setText(getResources().getString(R.string.no_use));
            this.i.setTextColor(getResources().getColor(R.color.battery_standar_text));
            this.j.setTextColor(getResources().getColor(R.color.battery_standar_text));
            this.k.setTextColor(getResources().getColor(R.color.battery_standar_text));
            this.l.setTextColor(getResources().getColor(R.color.battery_standar_text));
            this.b.setTextColor(getResources().getColor(R.color.battery_standar_text));
            this.c.setText(getString(R.string.no_use));
            this.b.setText(getString(R.string.no_use));
            this.h.setText(getString(R.string.no_use));
            if (this.y >= C) {
                this.d.setText(getString(R.string.no_use));
                this.d.setVisibility(8);
                this.e.setVisibility(8);
            }
            this.g.setText(getString(R.string.no_use));
            this.f.setText("");
            this.z = false;
        }
        if (aVar2.U() && !this.z) {
            this.B = false;
            f.i(aVar2);
            this.E.sendEmptyMessageDelayed(A, 200);
            this.E.sendEmptyMessageDelayed(A, 400);
            this.E.sendEmptyMessageDelayed(A, 600);
            this.E.sendEmptyMessageDelayed(A, 800);
            this.z = true;
        }
    }

    public void onHandleMessage(Message message) {
    }
}
