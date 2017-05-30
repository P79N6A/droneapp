package com.fimi.soul.module.droneTrack;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentManager;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.fimi.kernel.utils.t;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.h.a.e;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.d;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.drone.h.y;
import com.fimi.soul.drone.h.z;
import com.fimi.soul.entity.ErrorMode;
import com.fimi.soul.module.droneTrack.a.b;
import com.fimi.soul.module.droneTrack.a.c;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.RemotesimulatorView;
import com.google.android.gms.maps.model.LatLng;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import m.framework.ui.widget.asyncview.AsyncImageView;

public class PlayBackDroneTrackActivity extends BaseActivity implements OnClickListener, OnSeekBarChangeListener, d, e {
    private static final int J = 3;
    private TextView A;
    private TextView B;
    private PercentRelativeLayout C;
    private PercentRelativeLayout D;
    private PalyBackMapFragment E;
    private FragmentManager F;
    private RemotesimulatorView G;
    private c H = c.a();
    private final int I = 100;
    private int K = 1000;
    private int L = 0;
    private b M = b.a();
    private com.fimi.soul.module.droneTrack.a.a N;
    private Timer O;
    private final int P = 1;
    private boolean Q;
    private TextView R;
    private RelativeLayout S;
    private TextView T;
    private TextView U;
    private TextView V;
    private TextView W;
    private TextView X;
    private TextView Y;
    private TextView Z;
    PercentRelativeLayout a;
    private TextView aa;
    private TextView ab;
    private TextView ac;
    private TextView ad;
    private TextView ae;
    private a af = a.Payback;
    private int ag = 0;
    private Handler ah = new Handler(this) {
        final /* synthetic */ PlayBackDroneTrackActivity a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 100) {
                this.a.Q = true;
                if (this.a.a.isShown()) {
                    this.a.a.setVisibility(8);
                }
                this.a.ag = b.a().b().size();
                this.a.B.setText(PlayBackDroneTrackActivity.b((this.a.ag * 1000) + ""));
                this.a.r.setMax(this.a.ag);
                this.a.A.setText(PlayBackDroneTrackActivity.b((this.a.L * 1000) + ""));
            } else if (message.what == 3) {
                this.a.L = this.a.L + 1;
                this.a.r.setProgress(this.a.L);
                this.a.A.setText(PlayBackDroneTrackActivity.b((this.a.L * 1000) + ""));
                this.a.b(this.a.L);
                if (this.a.L == 1) {
                    this.a.E.b();
                    this.a.M.c().clear();
                }
                if (this.a.L <= this.a.r.getMax()) {
                    this.a.ah.sendEmptyMessageDelayed(3, (long) this.a.K);
                    return;
                }
                this.a.L = 0;
                this.a.r.setProgress(this.a.L);
                this.a.A.setText(PlayBackDroneTrackActivity.b((this.a.L * 1000) + ""));
                this.a.i((int) R.mipmap.btn_playback_play);
                this.a.af = a.Payback;
            } else if (message.what == 1) {
                this.a.b();
            }
        }
    };
    private com.fimi.soul.module.droneui.a ai;
    private double aj = 0.0d;
    int b = 0;
    int c = 0;
    private ImageView d;
    private ImageView e;
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private ImageView i;
    private ImageView j;
    private ImageView k;
    private ImageView l;
    private ImageView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private SeekBar r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private TextView w;
    private TextView x;
    private TextView y;
    private TextView z;

    enum a {
        Payback,
        Stop
    }

    private String a(double d) {
        return String.format("%.2f", new Object[]{Double.valueOf(d)});
    }

    private void a(double d, boolean z) {
        double[] j = z ? this.M.j() : this.M.i();
        if (j != null) {
            if (d < j[0]) {
                this.o.setText("0%");
                this.o.setTextColor(getResources().getColor(R.color.battery_except));
            } else if (d >= j[0] && d < j[1]) {
                this.o.setText("25%");
                this.o.setTextColor(getResources().getColor(R.color.battery_except));
            } else if (d >= j[1] && d < j[2]) {
                this.o.setText("50%");
                this.o.setTextColor(getResources().getColor(R.color.white));
            } else if (d >= j[2] && d < j[3]) {
                this.o.setText("75%");
                this.o.setTextColor(getResources().getColor(R.color.white));
            } else if (d >= j[3]) {
                this.o.setText("100%");
                this.o.setTextColor(getResources().getColor(R.color.white));
            }
        }
    }

    private void a(int i, int i2, int i3) {
        if (this.ai != null && this.ai.isShowing()) {
            this.ai.dismiss();
            this.ai = null;
        }
        this.ai = new com.fimi.soul.module.droneui.a(this, getString(i), getString(i2), i3, 3, false, new com.fimi.soul.module.droneui.a.a(this) {
            final /* synthetic */ PlayBackDroneTrackActivity a;

            {
                this.a = r1;
            }

            public void a() {
                if (this.a.ai != null) {
                    this.a.ai.dismiss();
                    this.a.ai = null;
                }
            }

            public void b() {
            }

            public void c() {
            }

            public void d() {
                if (this.a.ai != null) {
                    this.a.ai.dismiss();
                    this.a.ai = null;
                }
            }
        });
        this.ai.setCancelable(true);
        this.ai.show();
    }

    private void a(ImageView imageView, int i) {
        imageView.setImageResource(i);
    }

    private void a(TextView textView) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(AsyncImageView.a));
        CharSequence spannableStringBuilder = new SpannableStringBuilder(textView.getText().toString());
        spannableStringBuilder.setSpan(foregroundColorSpan, 1, 3, 33);
        textView.setText(spannableStringBuilder);
    }

    private void a(e eVar) {
        b(eVar.d(), eVar.e(), eVar.f());
    }

    private void a(ad adVar) {
        com.fimi.soul.drone.h.c k = this.M.k();
        ao.a(adVar.b(), 12);
        int a = ao.a(adVar.b(), 13);
        if (k != null) {
            if (k.d() == (byte) 2 || a == 1) {
                this.G.a(adVar.i(), adVar.h(), adVar.g(), adVar.f());
            } else {
                this.G.a(adVar.i(), adVar.g(), adVar.h(), adVar.f());
            }
        }
        int a2 = ao.a(adVar.b(), 5);
        double c = ((double) adVar.c()) / 100.0d;
        if (Math.abs(c - this.aj) > 0.05d) {
            if (a2 > 0) {
                a(c, true);
            } else {
                a(c, false);
            }
            this.aj = c;
        }
    }

    private void a(ag agVar) {
        double d = -999.0d;
        double f = (agVar.f() - 677216.0d) / 10.0d;
        if (f < 3000.0d) {
            if (f >= 100.0d || f < 0.0d) {
                if (f >= -999.0d) {
                    d = f;
                }
                a(d < 100.0d ? b(d) + "m" : ((int) d) + "m", this.x);
            } else {
                a(b(f) + "m", this.x);
            }
        }
        d = agVar.g();
        if (d > -50.0d && d < 10000.0d && !this.drone.aj().g().isLightStream()) {
            if (d >= 100.0d) {
                a(((int) d) + "m", this.z);
            } else {
                a(b(d) + "m", this.z);
            }
        }
        g(agVar.c());
    }

    private void a(com.fimi.soul.drone.h.ao aoVar) {
        h(aoVar.a());
    }

    private void a(d dVar) {
        this.T.setText((dVar.i() - 60) + getString(R.string.temp_unit));
        this.U.setText(Math.abs(dVar.h()) + "mA");
        double b = (((double) dVar.b()) / 100.0d) + 2.0d;
        double c = (((double) dVar.c()) / 100.0d) + 2.0d;
        double d = (((double) dVar.d()) / 100.0d) + 2.0d;
        this.V.setText(a((((double) dVar.a()) / 100.0d) + 2.0d) + "V");
        this.W.setText(a(b) + "V");
        this.X.setText(a(c) + "V");
        this.Y.setText(a(d) + "V");
    }

    private void a(y yVar) {
        double a = t.a(yVar.a() / 100.0d, 2);
        double a2 = t.a(yVar.b() / 100.0d, 2);
        this.t.setText(a + "m/s");
        this.v.setText(a2 + "m/s");
        this.E.a((float) (yVar.k() / 10.0d));
    }

    private void a(String str, TextView textView) {
        if (str != null && !str.equals(textView.getText().toString())) {
            textView.setText(str);
        }
    }

    private String b(double d) {
        return String.format("%.1f", new Object[]{Double.valueOf(d)});
    }

    public static String b(String str) {
        return new SimpleDateFormat("mm:ss").format(new Date(new Long(str).longValue()));
    }

    private void b() {
        if (this.N != null) {
            ErrorMode a = com.fimi.soul.module.droneTrack.b.a.a().a(this.N);
            if (a != null) {
                ArrayList lightErrorList = a.getLightErrorList();
                if (lightErrorList.size() <= this.b) {
                    this.b = 0;
                }
                if (this.drone.ac()) {
                    if (this.drone.ad().S()) {
                        this.c++;
                        if (this.c >= 3) {
                            a(R.string.title_sky_bat_lowpower_dangerous, R.string.des_sky_bat_lowpower_dangerous, R.drawable.plane_fall_bg);
                            this.c = 0;
                        }
                    } else if (this.drone.ad().P()) {
                        this.c++;
                        if (this.c >= 7) {
                            a(R.string.title_sky_landing_BAT_LOWPOWER, R.string.des_sky_landing_BAT_LOWPOWER, R.drawable.plane_fall_bg);
                            this.c = 0;
                        }
                    }
                }
                if (lightErrorList == null || lightErrorList.size() <= 0) {
                    c("");
                    c();
                } else {
                    d();
                    this.q.setTextColor(getResources().getColor(R.color.warmtextcl));
                    c(getText(((Integer) lightErrorList.get(this.b)).intValue()).toString());
                }
                this.b++;
            }
        }
    }

    private void b(int i) {
        List list = (List) this.M.b().get(Integer.valueOf(i));
        if (list != null) {
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof ag) {
                        ag agVar = (ag) next;
                        if (agVar != null) {
                            this.N.a(agVar);
                            this.E.a(agVar);
                            a(agVar);
                        }
                    } else if (next instanceof z) {
                        z zVar = (z) next;
                        if (!(zVar == null || this.E == null)) {
                            this.N.a(zVar);
                            this.E.a(zVar);
                        }
                    } else if (next instanceof y) {
                        y yVar = (y) next;
                        if (yVar != null) {
                            a(yVar);
                            this.N.a(yVar);
                        }
                    } else if (next instanceof com.fimi.soul.drone.h.ao) {
                        com.fimi.soul.drone.h.ao aoVar = (com.fimi.soul.drone.h.ao) next;
                        if (aoVar != null) {
                            a(aoVar);
                            this.N.a(aoVar);
                        }
                    } else if (next instanceof com.fimi.soul.drone.h.e) {
                        com.fimi.soul.drone.h.e eVar = (com.fimi.soul.drone.h.e) next;
                        if (eVar != null) {
                            this.N.a(eVar);
                        }
                    } else if (next instanceof d) {
                        d dVar = (d) next;
                        if (dVar != null) {
                            this.N.a(dVar);
                            b(dVar);
                            a(dVar);
                        }
                    } else if (next instanceof e) {
                        e eVar2 = (e) next;
                        if (eVar2 != null) {
                            this.N.a(eVar2);
                            a(eVar2);
                        }
                    } else if (next instanceof ad) {
                        ad adVar = (ad) next;
                        if (adVar != null) {
                            this.N.a(adVar);
                            a(adVar);
                        }
                    } else if (next instanceof q) {
                        q qVar = (q) next;
                        if (qVar != null) {
                            this.N.a(qVar);
                        }
                    } else if (next instanceof com.fimi.soul.drone.h.a.b) {
                        com.fimi.soul.drone.h.a.b bVar = (com.fimi.soul.drone.h.a.b) next;
                        if (bVar != null) {
                            this.N.a(bVar);
                            if (!(bVar.f() == (byte) 4 || bVar.f() == (byte) 5 || bVar.f() == (byte) 6)) {
                                this.E.a(bVar);
                            }
                        }
                    }
                }
            }
        }
    }

    private void b(int i, int i2, int i3) {
        if (i == 2 && !this.N.j() && i2 == 1) {
            c((int) R.string.lightstreamfly);
            d((int) R.drawable.normal_icon);
        } else if (i == 1 && !this.N.j() && i2 == 1) {
            c((int) R.string.gpsfly);
            d((int) R.drawable.normal_icon);
        } else if (i == 0 && !this.N.j() && i2 == 1) {
            c((int) R.string.attibase);
            d((int) R.drawable.normal_icon);
        } else if (i == 2 && this.N.j() && i2 == 1) {
            c((int) R.string.lightstreamfling);
            d((int) R.drawable.normal_icon);
        } else if (i == 1 && this.N.j() && i2 == 1) {
            c((int) R.string.gpsfling);
            d((int) R.drawable.normal_icon);
        } else if (i == 0 && this.N.j() && i2 == 1) {
            c((int) R.string.attfling);
            d((int) R.drawable.normal_icon);
        } else if (i2 == 7) {
            c((int) R.string.tohome);
            d((int) R.drawable.sailround_icon);
        } else if (i2 == 8) {
            c((int) R.string.returntohome);
            d((int) R.drawable.sailround_icon);
        } else if (i2 == 3) {
            c((int) R.string.landing);
            d((int) R.drawable.landing_icon);
        } else if (i2 == 9) {
            c((int) R.string.lowlanding);
            d((int) R.drawable.landing_icon);
        } else if (i2 == 2) {
            c((int) R.string.take_off);
            d((int) R.drawable.takeoff_icon);
        } else if (i2 == 4) {
            if (i3 == 4) {
                c((int) R.string.stopflyto);
                d((int) R.drawable.destination_icon);
            } else if (i3 == 2) {
                c((int) R.string.flyto);
                d((int) R.drawable.destination_icon);
            }
        } else if (i2 == 5) {
            if (i3 == 4) {
                c((int) R.string.stop_poi_fly);
                d((int) R.drawable.detouringpoint_icon);
            } else if (i3 == 2) {
                c((int) R.string.interestFly);
                d((int) R.drawable.detouringpoint_icon);
            }
        } else if (i2 == 6) {
            if (i3 == 4) {
                c((int) R.string.stopwaypoint);
                d((int) R.drawable.icon_fly_airline);
            } else if (i3 == 2) {
                c((int) R.string.execuwaypoint);
                d((int) R.drawable.icon_fly_airline);
            }
        } else if (i2 != 10) {
            c((int) R.string.condrone);
            d((int) R.drawable.normal_icon);
        } else if (i3 == 4) {
            c((int) R.string.stoptake_photo);
            d((int) R.mipmap.icon_fly_mode_selfie);
        } else if (i3 == 2) {
            c((int) R.string.take_photo_fly);
            d((int) R.mipmap.icon_fly_mode_selfie);
        }
    }

    private void b(d dVar) {
        com.fimi.soul.drone.h.e i = this.N.i();
        double d = (double) i.d();
        double e = (double) i.e();
        int g = 0.0d != e ? (int) ((((double) dVar.g()) / e) * 100.0d) : (int) ((((double) dVar.g()) / 5200.0d) * 100.0d);
        int g2 = 0.0d != d ? (int) ((((double) dVar.g()) / d) * 100.0d) : (int) ((((double) dVar.g()) / 5200.0d) * 100.0d);
        if (g >= 0) {
            if (g2 <= 0 || g2 >= 30) {
                this.p.setTextColor(getResources().getColor(R.color.white));
                this.p.setText(g + "%");
                return;
            }
            this.p.setText(g2 + "%");
            this.p.setTextColor(getResources().getColor(R.color.battery_except));
        }
    }

    private void c() {
        this.f.setVisibility(4);
    }

    private void c(int i) {
        if (i != 0 && !getString(i).equals(this.n.getText().toString())) {
            this.n.setText(i);
        }
    }

    private void c(String str) {
        if (str != null && !str.equals(this.q.getText().toString())) {
            this.q.setText(str, BufferType.NORMAL);
        }
    }

    private void d() {
        this.f.setVisibility(0);
    }

    private void d(int i) {
        if (getString(R.string.self_error_result).equals(this.n.getText().toString())) {
            this.e.setImageResource(R.drawable.notnormal_icon);
            this.e.setTag(Integer.valueOf(R.drawable.notnormal_icon));
        } else if (this.e.getTag() == null) {
            this.e.setImageResource(i);
            this.e.setTag(Integer.valueOf(i));
        } else if (i != ((Integer) this.e.getTag()).intValue()) {
            this.e.setImageResource(i);
            this.e.setTag(Integer.valueOf(i));
        }
    }

    private void e() {
        this.m = (ImageView) findViewById(R.id.show_more_battery_status);
        this.D = (PercentRelativeLayout) findViewById(R.id.dront_battery_RL);
        this.Z = (TextView) findViewById(R.id.battery_tem_des);
        this.aa = (TextView) findViewById(R.id.battery_electricity_des);
        this.ab = (TextView) findViewById(R.id.battery_voltage_one);
        this.ac = (TextView) findViewById(R.id.battery_voltage_sencond);
        this.ad = (TextView) findViewById(R.id.battery_voltage_three);
        this.ae = (TextView) findViewById(R.id.battery_voltage_four);
        this.T = (TextView) findViewById(R.id.battery_tem_des_value);
        this.U = (TextView) findViewById(R.id.battery_electricity_des_value);
        this.V = (TextView) findViewById(R.id.battery_voltage_one_value);
        this.W = (TextView) findViewById(R.id.battery_voltage_sencond_value);
        this.X = (TextView) findViewById(R.id.battery_voltage_three_value);
        this.Y = (TextView) findViewById(R.id.battery_voltage_four_value);
        this.S = (RelativeLayout) findViewById(R.id.play_back_start);
        this.R = (TextView) findViewById(R.id.drone_gps_number);
        this.a = (PercentRelativeLayout) findViewById(R.id.progress_loading);
        this.G = (RemotesimulatorView) findViewById(R.id.remote_simulator);
        this.C = (PercentRelativeLayout) findViewById(R.id.drone_more_status);
        this.q = (TextView) findViewById(R.id.dronerrorcode);
        this.q.requestFocus();
        this.r = (SeekBar) findViewById(R.id.paly_seebar);
        this.r.setOnSeekBarChangeListener(this);
        this.l = (ImageView) findViewById(R.id.paly_btn);
        this.l.setOnClickListener(this);
        this.d = (ImageView) findViewById(R.id.back_btn);
        this.e = (ImageView) findViewById(R.id.headview);
        this.f = (ImageView) findViewById(R.id.divide_line2);
        this.g = (ImageView) findViewById(R.id.remote_signal);
        this.h = (ImageView) findViewById(R.id.gps_signal);
        this.i = (ImageView) findViewById(R.id.show_more_status);
        this.j = (ImageView) findViewById(R.id.show_more_remote_status);
        this.k = (ImageView) findViewById(R.id.show_more_gps_status);
        this.n = (TextView) findViewById(R.id.dronestuts);
        this.o = (TextView) findViewById(R.id.remote_signal_value);
        this.p = (TextView) findViewById(R.id.drone_signal_value);
        this.s = (TextView) findViewById(R.id.hs_des);
        this.t = (TextView) findViewById(R.id.hs_value);
        this.u = (TextView) findViewById(R.id.vs_des);
        this.v = (TextView) findViewById(R.id.vs_value);
        this.w = (TextView) findViewById(R.id.height_des);
        this.x = (TextView) findViewById(R.id.height_des_value);
        this.y = (TextView) findViewById(R.id.distance_des);
        this.z = (TextView) findViewById(R.id.distance_des_value);
        this.A = (TextView) findViewById(R.id.play_back_progress_fact);
        this.B = (TextView) findViewById(R.id.play_back_progress_all);
        ao.b(getAssets(), this.p, this.o, this.t, this.v, this.x, this.z, this.A, this.B, this.Z, this.aa, this.ab, this.ac, this.ad, this.ae);
        ao.a(getAssets(), this.n, this.s, this.u, this.w, this.y, this.q, this.T, this.U, this.V, this.W, this.X, this.Y);
        for (View onClickListener : new View[]{this.d, this.l, this.k, this.j, this.S, this.i, this.m}) {
            onClickListener.setOnClickListener(this);
        }
    }

    private void e(int i) {
        List c = b.a().c();
        c.clear();
        for (int i2 = 0; i2 < i; i2++) {
            List list = (List) this.M.b().get(Integer.valueOf(i2));
            if (list != null) {
                for (Object next : list) {
                    if (next != null) {
                        if (next instanceof ag) {
                            ag agVar = (ag) next;
                            if (agVar != null) {
                                this.N.a(agVar);
                                LatLng latLng = new LatLng(agVar.e(), agVar.d());
                                if (!c.contains(latLng)) {
                                    c.add(latLng);
                                }
                            }
                        } else if (next instanceof z) {
                            z zVar = (z) next;
                            if (!(zVar == null || this.E == null)) {
                                this.N.a(zVar);
                            }
                        } else if (next instanceof y) {
                            y yVar = (y) next;
                            if (yVar != null) {
                                this.N.a(yVar);
                            }
                        } else if (next instanceof com.fimi.soul.drone.h.ao) {
                            com.fimi.soul.drone.h.ao aoVar = (com.fimi.soul.drone.h.ao) next;
                            if (aoVar != null) {
                                this.N.a(aoVar);
                            }
                        } else if (next instanceof com.fimi.soul.drone.h.e) {
                            r0 = (com.fimi.soul.drone.h.e) next;
                            if (r0 != null) {
                                this.N.a(r0);
                            }
                        } else if (next instanceof d) {
                            d dVar = (d) next;
                            if (dVar != null) {
                                this.N.a(dVar);
                                b(dVar);
                            }
                        } else if (next instanceof e) {
                            e eVar = (e) next;
                            if (eVar != null) {
                                this.N.a(eVar);
                            }
                        } else if (next instanceof ad) {
                            ad adVar = (ad) next;
                            if (adVar != null) {
                                this.N.a(adVar);
                                a(adVar);
                            }
                        } else if (next instanceof com.fimi.soul.drone.h.e) {
                            r0 = (com.fimi.soul.drone.h.e) next;
                            if (r0 != null) {
                                this.N.a(r0);
                            }
                        } else if (next instanceof com.fimi.soul.drone.h.c) {
                            r0 = (com.fimi.soul.drone.h.c) next;
                            if (r0 != null) {
                                this.N.a(r0);
                            }
                        } else if (next instanceof com.fimi.soul.drone.h.e) {
                            r0 = (com.fimi.soul.drone.h.e) next;
                            if (r0 != null) {
                                this.N.a(r0);
                            }
                        } else if (next instanceof com.fimi.soul.drone.h.c) {
                            r0 = (com.fimi.soul.drone.h.c) next;
                            if (r0 != null) {
                                this.N.a(r0);
                            }
                        } else if (next instanceof com.fimi.soul.drone.h.a.b) {
                            com.fimi.soul.drone.h.a.b bVar = (com.fimi.soul.drone.h.a.b) next;
                            if (bVar != null) {
                                this.N.a(bVar);
                            }
                        }
                    }
                }
            }
            if (i2 == i - 1 && c.size() > 0) {
                this.E.a((LatLng) c.get(c.size() - 1), c);
            }
        }
    }

    private void f(int i) {
        if (i == 1) {
            a(this.k, (int) R.drawable.btn_playback_satellite_map_normal);
        } else {
            a(this.k, (int) R.drawable.btn_playback_satellite_map_checked);
        }
    }

    private void g(int i) {
        this.R.setText(i + "");
        if (i < 2) {
            a(this.h, (int) R.mipmap.icon_playback_signal_0);
        } else if (i >= 2 && i < 4) {
            a(this.h, (int) R.mipmap.icon_playback_signal_1);
        } else if (i >= 4 && i < 8) {
            a(this.h, (int) R.mipmap.icon_playback_signal_2);
        } else if (i >= 8 && i < 12) {
            a(this.h, (int) R.mipmap.icon_playback_signal_3);
        } else if (i >= 12 && i < 16) {
            a(this.h, (int) R.mipmap.icon_playback_signal_4);
        } else if (i >= 16) {
            a(this.h, (int) R.mipmap.icon_playback_signal_5);
        }
    }

    private void h(int i) {
        if (i < 25) {
            a(this.g, (int) R.mipmap.icon_playback_signal_0);
        } else if (i >= 25 && i < 35) {
            a(this.g, (int) R.mipmap.icon_playback_signal_1);
        } else if (i >= 35 && i < 50) {
            a(this.g, (int) R.mipmap.icon_playback_signal_2);
        } else if (i >= 50 && i < 65) {
            a(this.g, (int) R.mipmap.icon_playback_signal_3);
        } else if (i >= 65 && i < 80) {
            a(this.g, (int) R.mipmap.icon_playback_signal_4);
        } else if (i >= 80) {
            a(this.g, (int) R.mipmap.icon_playback_signal_5);
        }
    }

    private void i(int i) {
        this.l.setImageResource(i);
    }

    public void a() {
        this.ah.sendEmptyMessage(100);
    }

    public void a(int i) {
        f(i);
    }

    public void a(String str) {
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_btn:
                finish();
                return;
            case R.id.play_back_start:
            case R.id.paly_btn:
                if (!this.Q) {
                    com.fimi.kernel.utils.z.a((Context) this, "正在加载数据", 3000);
                    return;
                } else if (this.af == a.Payback) {
                    if (this.L != this.r.getMax()) {
                        i((int) R.drawable.btn_playback_pause);
                        this.af = a.Stop;
                    } else {
                        this.L = 0;
                        i((int) R.mipmap.btn_playback_play);
                    }
                    this.ah.sendEmptyMessage(3);
                    return;
                } else {
                    this.ah.removeMessages(3);
                    i((int) R.mipmap.btn_playback_play);
                    this.af = a.Payback;
                    return;
                }
            case R.id.show_more_status:
                if (this.C.isShown()) {
                    a(this.i, (int) R.drawable.btn_playback_more_normal);
                    this.C.setVisibility(8);
                    this.C.setAnimation(AnimationUtils.loadAnimation(this, R.anim.more_drone_status_detial));
                    return;
                }
                a(this.i, (int) R.drawable.btn_playback_more_checked);
                this.C.setVisibility(0);
                this.C.setAnimation(AnimationUtils.loadAnimation(this, 17432578));
                return;
            case R.id.show_more_remote_status:
                if (this.G.isShown()) {
                    a(this.j, (int) R.drawable.btn_playback_rc_normal);
                    this.G.setVisibility(8);
                    this.G.setAnimation(AnimationUtils.loadAnimation(this, 17432579));
                    return;
                }
                a(this.j, (int) R.drawable.btn_playback_rc_checked);
                this.G.setVisibility(0);
                this.G.setAnimation(AnimationUtils.loadAnimation(this, R.anim.more_remote_detial));
                return;
            case R.id.show_more_gps_status:
                f(this.E.a());
                return;
            case R.id.show_more_battery_status:
                if (this.D.isShown()) {
                    a(this.m, (int) R.drawable.btn_playback_battery_info_normal);
                    this.D.setVisibility(8);
                    this.D.setAnimation(AnimationUtils.loadAnimation(this, R.anim.more_drone_status_detial));
                    return;
                }
                a(this.m, (int) R.drawable.btn_playback_battery_info_checked);
                this.D.setVisibility(0);
                this.D.setAnimation(AnimationUtils.loadAnimation(this, 17432578));
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
        setContentView(R.layout.drone_paly_back_main);
        e();
        this.F = getSupportFragmentManager();
        this.E = (PalyBackMapFragment) this.F.findFragmentById(R.id.mapFragment);
        if (this.E == null) {
            this.E = new PalyBackMapFragment();
            this.F.beginTransaction().add((int) R.id.mapFragment, this.E).commit();
        }
        if (getIntent() != null) {
            this.H.a(getIntent().getStringExtra("path"), (e) this);
        }
        this.N = new com.fimi.soul.module.droneTrack.a.a();
        this.O = new Timer();
        this.O.schedule(new TimerTask(this) {
            final /* synthetic */ PlayBackDroneTrackActivity a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.ah.sendEmptyMessage(1);
            }
        }, 0, 3000);
    }

    protected void onDestroy() {
        b.a().d();
        c.a().b();
        if (this.N != null) {
            this.N = null;
        }
        if (this.ah.hasMessages(3)) {
            this.ah.removeMessages(3);
        }
        this.Q = false;
        if (this.O != null) {
            this.O.cancel();
        }
        super.onDestroy();
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.ah.hasMessages(3)) {
            this.ah.removeMessages(3);
        }
        this.L = i;
    }

    protected void onResume() {
        super.onResume();
        if (!this.Q && !this.a.isShown()) {
            this.a.setVisibility(0);
        }
    }

    protected void onStart() {
        super.onStart();
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    protected void onStop() {
        super.onStop();
        if (this.af == a.Stop) {
            this.ah.removeMessages(3);
            i((int) R.mipmap.btn_playback_play);
            this.af = a.Payback;
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this.af == a.Stop && !this.ah.hasMessages(3)) {
            this.ah.sendEmptyMessageDelayed(3, (long) this.K);
        }
        this.A.setText(b((seekBar.getProgress() * 1000) + ""));
        e(seekBar.getProgress());
    }
}
