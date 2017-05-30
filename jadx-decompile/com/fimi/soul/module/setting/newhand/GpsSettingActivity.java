package com.fimi.soul.module.setting.newhand;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.kernel.view.button.SwitchButton.a;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.module.setting.d;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.f;
import org.codehaus.jackson.smile.SmileConstants;

public class GpsSettingActivity extends BaseActivity implements OnClickListener, a, b {
    private static final int B = 1;
    private static final int C = 2;
    private static final int D = 3;
    private static final int E = 4;
    private static final int F = 1000;
    private static final float G = 0.3f;
    private static final float H = 1.0f;
    private static final int I = 300;
    private static final int J = 3000;
    public static final String b = "newhand_mode";
    public static final String c = "optical_flow_mode";
    public static final String d = "force_attitude_mode";
    private boolean A = false;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private Handler N = new Handler(this) {
        final /* synthetic */ GpsSettingActivity a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    d.a(this.a.u).a();
                    return;
                case 2:
                    this.a.r.a();
                    return;
                case 3:
                    this.a.r.b();
                    return;
                case 4:
                    if (!this.a.K) {
                        Toast.makeText(this.a.q, R.string.gps_setting_get_return_height_fail, 0).show();
                        this.a.l.setText(b.ar);
                    }
                    if (!this.a.M) {
                        Toast.makeText(this.a.q, R.string.gps_setting_flight_distance_fail, 0).show();
                        if (this.a.p.getToggleOn()) {
                            this.a.p.a(false, true);
                            this.a.m.setText(R.string.gps_setting_distance_limit_500m);
                        }
                    }
                    if (!this.a.L) {
                        Toast.makeText(this.a.q, R.string.get_setting_flight_speed_fail, 0).show();
                        this.a.k.setText(b.ar);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    };
    TextView a;
    private RelativeLayout e;
    private RelativeLayout f;
    private RelativeLayout g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private ImageView n;
    private ImageView o;
    private SwitchButton p;
    private Context q;
    private d r;
    private com.fimi.soul.module.update.a.b s;
    private boolean t;
    private com.fimi.soul.drone.a u;
    private boolean v = false;
    private int w;
    private int x;
    private int y;
    private int z;

    private void a() {
        this.e = (RelativeLayout) findViewById(R.id.flight_speed_rl);
        this.f = (RelativeLayout) findViewById(R.id.flight_distance_rl);
        this.g = (RelativeLayout) findViewById(R.id.flight_back_height_rl);
        this.e.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.h = (TextView) findViewById(R.id.flight_speed_setting_coontent_tv);
        this.i = (TextView) findViewById(R.id.flight_distance_settig_coontent_tv);
        this.m = (TextView) findViewById(R.id.flight_distance_settig_child_coontent_tv);
        this.j = (TextView) findViewById(R.id.flight_back_height_coontent_tv);
        this.k = (TextView) findViewById(R.id.flight_speed_setting_delcare);
        this.l = (TextView) findViewById(R.id.flight_back_height_setting_delcare);
        ((TextView) findViewById(R.id.tv_settingTitle)).setText(getString(R.string.setting_gps_mode));
        this.a = (TextView) findViewById(R.id.is_connect_tv);
        ao.a(getAssets(), this.h, this.i, this.m, this.j, this.k, this.l, r0, this.a);
        this.n = (ImageView) findViewById(R.id.flight_speed_setting_more_iv);
        this.o = (ImageView) findViewById(R.id.flight_back_height_setting_more_iv);
        this.p = (SwitchButton) findViewById(R.id.flight_distance_switch_btn);
        this.p.setOnSwitchListener(this);
        this.m.setText(R.string.gps_setting_distance_limit_500m);
        findViewById(R.id.black_btn).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ GpsSettingActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
    }

    @TargetApi(16)
    private void a(boolean z) {
        float f = z ? G : 1.0f;
        this.h.setAlpha(f);
        this.k.setAlpha(f);
        this.n.setAlpha(f);
        this.i.setAlpha(f);
        this.m.setAlpha(f);
        this.p.setAlpha(f);
        this.j.setAlpha(f);
        this.l.setAlpha(f);
        this.o.setAlpha(f);
        if (z) {
            this.e.setBackgroundColor(getResources().getColor(R.color.list_nomal));
            this.f.setBackgroundColor(getResources().getColor(R.color.list_nomal));
            this.g.setBackgroundColor(getResources().getColor(R.color.list_nomal));
            return;
        }
        this.e.setBackground(getResources().getDrawable(R.drawable.list_setting_selector));
        this.f.setBackground(getResources().getDrawable(R.drawable.list_setting_selector));
        this.g.setBackground(getResources().getDrawable(R.drawable.list_setting_selector));
    }

    public void a(int i, boolean z) {
        if (!z) {
            this.y = i;
            c.e().c(this.y + "");
        }
        if (i <= 6) {
            this.k.setText(i + this.q.getString(R.string.speed_unit_m) + this.q.getString(R.string.setting_speed_low));
        } else if (i <= 6 || i > 10) {
            this.k.setText(i + this.q.getString(R.string.speed_unit_m) + this.q.getString(R.string.setting_speed_hight));
        } else {
            this.k.setText(i + this.q.getString(R.string.speed_unit_m) + this.q.getString(R.string.setting_speed_standard));
        }
    }

    public void a(View view, boolean z) {
        if (view.getId() == R.id.flight_distance_switch_btn) {
            if (z) {
                this.p.a(false, false);
            } else {
                this.p.a(true, false);
            }
            if (!this.v) {
                this.r.a(this.z, new e(this) {
                    final /* synthetic */ GpsSettingActivity a;

                    {
                        this.a = r1;
                    }

                    public void a(int i) {
                        this.a.z = i;
                    }
                });
            }
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.flight_speed_rl:
                if (!this.v) {
                    this.r.b(this.y, new e(this) {
                        final /* synthetic */ GpsSettingActivity a;

                        {
                            this.a = r1;
                        }

                        public void a(int i) {
                            this.a.y = i;
                        }
                    });
                    return;
                }
                return;
            case R.id.flight_distance_rl:
                if (!this.v) {
                    this.r.a(this.z, new e(this) {
                        final /* synthetic */ GpsSettingActivity a;

                        {
                            this.a = r1;
                        }

                        public void a(int i) {
                            this.a.z = i;
                        }
                    });
                    return;
                }
                return;
            case R.id.flight_back_height_rl:
                if (!this.v) {
                    if (!com.fimi.soul.biz.e.d.a().k() && this.w < d.g) {
                        z.a(this.q, this.q.getString(R.string.please_update_the_last_flight_version), 0);
                        return;
                    } else if (!this.u.U()) {
                        z.a(this.q, (int) R.string.set_new_hand_fail, z.b);
                        return;
                    } else if (this.u.ac()) {
                        z.a(this.q, this.q.getString(R.string.not_set_flight_back_height), z.b);
                        return;
                    } else {
                        new f.b(this.q).c(this.q.getString(R.string.return_height)).b(120).a(30).a(this.q.getString(R.string.distance_unit_m)).b(this.q.getString(R.string.dialog_height_unit)).d(this.q.getResources().getColor(R.color.dialog_ensure_hot)).c(Integer.parseInt(c.e().f())).a(this.q.getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                            final /* synthetic */ GpsSettingActivity a;

                            {
                                this.a = r1;
                            }

                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).b(this.q.getString(R.string.ensure), new DialogInterface.OnClickListener(this) {
                            final /* synthetic */ GpsSettingActivity a;

                            {
                                this.a = r1;
                            }

                            public void onClick(DialogInterface dialogInterface, int i) {
                                d.a(this.a.u).a((float) this.a.x);
                            }
                        }).a(new OnSeekBarChangeListener(this) {
                            final /* synthetic */ GpsSettingActivity a;

                            {
                                this.a = r1;
                            }

                            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                                this.a.x = i + 30;
                            }

                            public void onStartTrackingTouch(SeekBar seekBar) {
                            }

                            public void onStopTrackingTouch(SeekBar seekBar) {
                            }
                        }).a().show();
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_gps_setting);
        getWindow().setFlags(128, 128);
        a();
        this.q = this;
        this.u = ((DroidPlannerApp) getApplication()).a;
        if (getIntent().getBooleanExtra(b, true)) {
            a(6, true);
            this.l.setText(30 + getString(R.string.distance_unit_m));
        }
        if (this.u.U()) {
            this.a.setVisibility(4);
            if (getIntent().getBooleanExtra(b, true) || getIntent().getBooleanExtra(d, false)) {
                a(true);
                this.v = true;
                return;
            }
            return;
        }
        this.a.setVisibility(0);
        a(true);
        this.v = true;
        this.A = true;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        int h;
        switch (aVar) {
            case NEW_HAND_OPERATE:
                if (aVar2.al().d() == (byte) 51) {
                    if (aVar2.al().f() != (byte) 4) {
                        return;
                    }
                    if (aVar2.al().i() == (byte) 0) {
                        z.a(this.q, (int) R.string.set_model_success);
                        if (aVar2.al().g() == (byte) 7) {
                            this.N.sendEmptyMessageDelayed(2, 1000);
                            if (aVar2.al().h() == 5000.0f) {
                                this.p.a(true, true);
                                this.m.setText(R.string.gps_setting_distance_unlimt);
                                this.z = 5000;
                                return;
                            }
                            this.p.a(false, true);
                            this.m.setText(R.string.gps_setting_distance_limit_500m);
                            this.z = 500;
                            return;
                        } else if (aVar2.al().g() == (byte) 3) {
                            this.N.sendEmptyMessageDelayed(3, 1000);
                            a((int) aVar2.al().h(), false);
                            return;
                        } else {
                            return;
                        }
                    }
                    z.a(this.q, (int) R.string.set_model_fail);
                    return;
                } else if (aVar2.al().d() != SmileConstants.TOKEN_LITERAL_FALSE || aVar2.al().f() != (byte) 4) {
                    return;
                } else {
                    if (aVar2.al().g() == (byte) 7) {
                        this.M = true;
                        h = (int) aVar2.al().h();
                        if (h != 0) {
                            c.e().a(h + "");
                        }
                        if (h == 5000) {
                            this.p.a(true, true);
                            this.m.setText(R.string.gps_setting_distance_unlimt);
                            this.z = 5000;
                            return;
                        }
                        this.p.a(false, true);
                        this.m.setText(R.string.gps_setting_distance_limit_500m);
                        this.z = 500;
                        return;
                    } else if (aVar2.al().g() == (byte) 3) {
                        this.L = true;
                        h = (int) aVar2.al().h();
                        if (h != 0) {
                            a(h, false);
                            return;
                        } else {
                            a(10, false);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            case RETURN_HEIGHT:
                if (aVar2.p().b() == d.d) {
                    if (aVar2.p().d() == d.f) {
                        z.a(this.q, (int) R.string.set_model_success);
                        h = (int) aVar2.p().c();
                        c.e().b(h + "");
                        this.x = h;
                        this.l.setText(this.x + this.q.getString(R.string.distance_unit_m));
                    } else {
                        z.a(this.q, (int) R.string.set_model_fail);
                    }
                    this.N.sendEmptyMessageDelayed(1, 1000);
                    return;
                } else if (aVar2.p().b() == d.e) {
                    this.K = true;
                    if (aVar2.p().d() == d.f) {
                        h = (int) aVar2.p().c();
                        c.e().b(h + "");
                        this.x = h;
                        this.l.setText(this.x + this.q.getString(R.string.distance_unit_m));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case CLEANALLOBJ:
            case Remotecontrol:
                if (aVar2.U()) {
                    if (getIntent().getBooleanExtra(b, true) || getIntent().getBooleanExtra(d, false)) {
                        a(true);
                        this.v = true;
                    } else {
                        a(false);
                        this.v = false;
                    }
                    this.a.setVisibility(4);
                    if (this.A) {
                        this.A = false;
                        this.r.b();
                        this.r.a();
                        this.N.sendEmptyMessageDelayed(2, 300);
                        this.N.sendEmptyMessageDelayed(3, 300);
                        this.N.sendEmptyMessageDelayed(2, 600);
                        this.N.sendEmptyMessageDelayed(3, 600);
                        if (this.t || this.w >= d.g) {
                            d.a(aVar2).a();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.l.setText(b.ar);
                this.k.setText(b.ar);
                this.p.a(false, false);
                this.m.setText(R.string.gps_setting_distance_limit_500m);
                this.a.setVisibility(0);
                a(true);
                this.v = true;
                this.A = true;
                return;
            default:
                return;
        }
    }

    public void onStart() {
        super.onStart();
        this.u.a((b) this);
        this.s = (com.fimi.soul.module.update.a.b) c.c().a(com.fimi.soul.module.update.b.w, com.fimi.soul.module.update.a.b.class);
        this.t = com.fimi.soul.biz.e.d.a().k();
        if (this.r == null) {
            this.r = new c(this.u, this.q);
        }
        if (this.s != null) {
            this.w = this.s.a();
        }
        this.r.b();
        this.r.a();
        this.N.sendEmptyMessageDelayed(2, 300);
        this.N.sendEmptyMessageDelayed(3, 300);
        this.N.sendEmptyMessageDelayed(2, 600);
        this.N.sendEmptyMessageDelayed(3, 600);
        this.N.sendEmptyMessageDelayed(2, 900);
        this.N.sendEmptyMessageDelayed(3, 900);
        this.N.sendEmptyMessageDelayed(2, 1200);
        this.N.sendEmptyMessageDelayed(3, 1200);
        if (com.fimi.soul.biz.e.d.a().k() || this.w >= d.g) {
            d.a(this.u).a();
            this.N.sendEmptyMessageDelayed(1, 300);
            this.N.sendEmptyMessageDelayed(1, 600);
            this.N.sendEmptyMessageDelayed(1, 900);
            this.N.sendEmptyMessageDelayed(1, 1200);
            this.K = false;
        } else {
            this.K = true;
        }
        this.y = Integer.parseInt(c.e().g());
        a(this.y, true);
        this.l.setText(c.e().f() + this.q.getString(R.string.distance_unit_m));
        this.z = Integer.parseInt(c.e().e());
        if (this.z == 5000) {
            this.p.a(true, false);
            this.m.setText(R.string.gps_setting_distance_unlimt);
        } else {
            this.p.a(false, false);
            this.m.setText(R.string.gps_setting_distance_limit_500m);
        }
        if (this.u.U()) {
            this.N.sendEmptyMessageDelayed(4, 3000);
            return;
        }
        this.l.setText(b.ar);
        this.k.setText(b.ar);
        this.p.a(false, false);
        this.m.setText(R.string.gps_setting_distance_limit_500m);
    }

    public void onStop() {
        super.onStop();
    }
}
