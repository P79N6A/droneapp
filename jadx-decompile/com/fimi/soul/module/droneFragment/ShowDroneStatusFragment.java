package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.manager.t;
import com.fimi.soul.drone.c.a.a.bf;
import com.fimi.soul.drone.c.a.a.m;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.d.e;
import com.fimi.soul.drone.h.p;
import com.fimi.soul.entity.BatteryOverDischange;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.module.droneui.DroneMap;
import com.fimi.soul.module.setting.newhand.c;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.d;
import com.fimi.soul.view.EVview;
import com.fimi.soul.view.LightView;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Timer;
import java.util.TimerTask;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
import org.codehaus.jackson.smile.SmileConstants;

public class ShowDroneStatusFragment extends Fragment implements b {
    private static float M = 0.0f;
    private static final int T = 1;
    private static final int U = 0;
    private static final double Z = 0.20000000298023224d;
    private static final double aa = 0.4000000059604645d;
    private static final int ad = 1;
    private static final int ae = 2;
    private static final int af = 3;
    public static int e;
    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private Context E;
    private com.fimi.soul.drone.a F;
    private DroidPlannerApp G;
    private boolean H = true;
    private int I;
    private EVview J;
    private LinearLayout K;
    private TextView L;
    private LightView N;
    private double O = 0.0d;
    private int P = 1;
    private boolean Q = false;
    private boolean R = false;
    private a S = a.none_model;
    private boolean V = false;
    private boolean W = false;
    private boolean X = false;
    private boolean Y = false;
    t a;
    private BatteryOverDischange ab;
    private d ac;
    private Handler ag = new Handler(this) {
        final /* synthetic */ ShowDroneStatusFragment a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 0:
                    this.a.K.setVisibility(8);
                    return;
                case 1:
                    z.a(this.a.E, (int) R.string.show_drone_status_picture_carlton_toast, 1);
                    return;
                default:
                    return;
            }
        }
    };
    private boolean ah = true;
    private double ai;
    private double aj;
    Timer b;
    Timer c;
    c d;
    boolean f = false;
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

    private enum a {
        none_model,
        light_model,
        ev_model
    }

    private double a() {
        double[] dArr = new double[]{(((double) this.F.w().a()) / 100.0d) + 2.0d, (((double) this.F.w().b()) / 100.0d) + 2.0d, (((double) this.F.w().c()) / 100.0d) + 2.0d, (((double) this.F.w().d()) / 100.0d) + 2.0d};
        double d = 0.0d;
        int i = 0;
        while (i < 4) {
            double d2 = d;
            for (int i2 = i + 1; i2 < 4; i2++) {
                if (Math.abs(dArr[i2] - dArr[i]) > d2) {
                    d2 = Math.abs(dArr[i2] - dArr[i]);
                }
            }
            i++;
            d = d2;
        }
        return d;
    }

    private void a(String str, TextView textView) {
        if (str != null && !str.equals(textView.getText().toString())) {
            textView.setText(str);
        }
    }

    private String b(int i) {
        return com.fimi.kernel.utils.t.b((((double) i) / 100.0d) + 2.0d, 2);
    }

    private boolean b() {
        double[] dArr = new double[]{(((double) this.F.w().a()) / 100.0d) + 2.0d, (((double) this.F.w().b()) / 100.0d) + 2.0d, (((double) this.F.w().c()) / 100.0d) + 2.0d, (((double) this.F.w().d()) / 100.0d) + 2.0d};
        for (int i = 0; i < 4; i++) {
            if (dArr[i] < 3.0d) {
                return true;
            }
        }
        return false;
    }

    private void c() {
        this.d.e();
        e();
    }

    private void c(int i) {
        if (this.ac == null) {
            this.ac = d.a(this.E);
        }
        this.ab = new BatteryOverDischange();
        this.ab.setVoltage(com.fimi.kernel.utils.t.b((((double) (((this.F.w().a() + this.F.w().b()) + this.F.w().c()) + this.F.w().d())) / 100.0d) + 8.0d, 2));
        int g = this.F.w().g();
        if (g < 0) {
            g = 0;
        }
        this.ab.setBatteryCurrent(g + "");
        this.ab.setTemperature((this.F.w().i() - 60) + "");
        this.ai = (double) this.F.D().e();
        this.aj = (double) this.F.D().d();
        this.ab.setBatteryFull((this.aj > this.ai ? (int) this.aj : (int) this.ai) + "");
        e = (int) ((((double) g) / this.ai) * 100.0d);
        if (e <= 30) {
            this.ab.setBatteryLevel(e + "%");
        } else {
            this.ab.setBatteryLevel(e + "%");
        }
        this.ab.setUserId(com.fimi.soul.base.a.b(this.E).getUserID());
        this.ab.setBatteryId(com.fimi.soul.module.update.a.a.a().a(5).i() == null ? "0" : com.fimi.soul.module.update.a.a.a().a(5).i());
        this.ab.setBatteryLevel(this.F.w().j() + "");
        this.ab.setBatteryOne(b(this.F.w().a()));
        this.ab.setBatteryTwo(b(this.F.w().b()));
        this.ab.setBatteryThree(b(this.F.w().c()));
        this.ab.setBatteryFour(b(this.F.w().d()));
        this.ab.setBatteryRecyle(this.F.D().c() + "");
        this.ab.setVersion(com.fimi.soul.module.update.a.a.a().a(5).b() + "");
        this.ab.setAppType("0");
        this.ab.setAccidentType(i);
        com.fimi.soul.module.update.a.b bVar = (com.fimi.soul.module.update.a.b) com.fimi.kernel.c.c().a(com.fimi.soul.module.update.b.w, com.fimi.soul.module.update.a.b.class);
        if (bVar != null) {
            this.ab.setFcVersion(String.valueOf(bVar.a()));
        }
        this.ab.setUpdateTimes(String.valueOf(this.F.w().m()));
        this.ab.setUpdateTimes(String.valueOf(-this.F.w().h()));
        new com.fimi.soul.biz.f.a(getActivity()).a(this.ab);
    }

    private float d(int i) {
        return (i < 0 || i > 78) ? (i <= 78 || i > Opcodes.IFGE) ? (i <= Opcodes.IFGE || i > 234) ? (i <= 234 || i > 312) ? (i <= 312 || i > 390) ? (i <= 390 || i > 468) ? (i <= 468 || i > 546) ? (i <= 546 || i > 624) ? (i <= 624 || i > IMediaPlayer.MEDIA_INFO_BUFFERING_END) ? (i <= IMediaPlayer.MEDIA_INFO_BUFFERING_END || i > 780) ? (i <= 780 || i > 858) ? (i <= 858 || i > 936) ? (i <= 936 || i > 1024) ? 0.0f : 2.0f : 1.7f : 1.3f : 1.0f : 0.7f : 0.3f : 0.0f : -0.3f : -0.7f : -1.0f : -1.3f : -1.7f : -2.0f;
    }

    private void d() {
        if (this.ai > 0.0d) {
            int g = this.F.w().g();
            if (g < 0) {
                g = 0;
            }
            e = (int) ((((double) g) / this.ai) * 100.0d);
            if (e >= 0) {
                if (e > 100) {
                    this.ah = true;
                    this.ai = 0.0d;
                    return;
                }
                if (e <= 0 || e >= 30) {
                    this.m.setTextColor(getResources().getColor(R.color.changebetery));
                    this.i.setTextColor(getResources().getColor(R.color.changebetery));
                    this.q.setTextColor(getResources().getColor(R.color.changebetery));
                    this.r.setTextColor(getResources().getColor(R.color.changebetery));
                } else {
                    this.m.setTextColor(getResources().getColor(R.color.changebeterylow));
                    this.i.setTextColor(getResources().getColor(R.color.changebeterylow));
                    this.q.setTextColor(getResources().getColor(R.color.changebeterylow));
                    this.r.setTextColor(getResources().getColor(R.color.changebeterylow));
                }
                if (e <= 30) {
                    this.i.setText(e + "");
                } else {
                    this.i.setText(e + "");
                }
                this.r.setVisibility(8);
                this.q.setVisibility(0);
                a("%", this.q);
                a(getString(R.string.electricity), this.m);
                this.q.setTextSize(16.0f);
                this.F.a(com.fimi.soul.drone.d.a.NOTIFYPBATTERY);
            }
        }
    }

    private float e(int i) {
        return (i < 0 || i > Opcodes.IFGE) ? (i <= Opcodes.IFGE || i > 312) ? (i <= 312 || i > 468) ? (i <= 468 || i > 546) ? (i <= 546 || i > IMediaPlayer.MEDIA_INFO_BUFFERING_END) ? (i <= IMediaPlayer.MEDIA_INFO_BUFFERING_END || i > 858) ? (i <= 858 || i > 1024) ? 0.0f : 2.0f : 1.3f : 0.7f : 0.0f : -0.7f : -1.3f : -2.0f;
    }

    private void e() {
        bf bfVar = new bf();
        bfVar.d = m.b;
        bfVar.e = (byte) 1;
        bfVar.f = (byte) 0;
        this.F.T().a(bfVar.a());
    }

    public void a(int i) {
        this.B.setVisibility(i);
        this.A.setVisibility(i);
    }

    public void a(boolean z) {
        if (z) {
            this.K.setVisibility(8);
            this.C.setVisibility(8);
            this.D.setVisibility(8);
        }
        this.f = z;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.E = activity.getApplicationContext();
        this.G = (DroidPlannerApp) activity.getApplication();
        this.a = t.a(getActivity());
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.showdronestates, null);
        if (com.fimi.kernel.c.e().d()) {
            inflate.findViewById(R.id.bottom_state_rl).setVisibility(0);
        } else {
            inflate.findViewById(R.id.bottom_state_rl).setVisibility(4);
        }
        this.s = (TextView) inflate.findViewById(R.id.deslevelspeek);
        this.t = (TextView) inflate.findViewById(R.id.levelspeek);
        this.J = (EVview) inflate.findViewById(R.id.ev_v);
        this.N = (LightView) inflate.findViewById(R.id.light_v);
        this.L = (TextView) inflate.findViewById(R.id.ev_title);
        this.u = (TextView) inflate.findViewById(R.id.desverticalspeek);
        this.v = (TextView) inflate.findViewById(R.id.verticalspeek);
        this.w = (TextView) inflate.findViewById(R.id.desremotesign);
        this.x = (TextView) inflate.findViewById(R.id.remotesign);
        this.y = (TextView) inflate.findViewById(R.id.desimagetransmission);
        this.z = (TextView) inflate.findViewById(R.id.imagetransmission);
        this.A = (TextView) inflate.findViewById(R.id.network_text);
        this.B = (TextView) inflate.findViewById(R.id.network);
        this.C = (TextView) inflate.findViewById(R.id.ev_text);
        this.D = (TextView) inflate.findViewById(R.id.ev_value_tv);
        this.K = (LinearLayout) inflate.findViewById(R.id.ev_layout);
        this.k = (TextView) inflate.findViewById(R.id.texthight);
        this.k.getPaint().setFakeBoldText(true);
        this.l = (TextView) inflate.findViewById(R.id.textdistance);
        this.l.getPaint().setFakeBoldText(true);
        this.m = (TextView) inflate.findViewById(R.id.textpower);
        this.m.getPaint().setFakeBoldText(true);
        this.o = (TextView) inflate.findViewById(R.id.texthightbelowafter);
        this.n = (TextView) inflate.findViewById(R.id.textsign);
        this.n.getPaint().setFakeBoldText(true);
        this.j = (TextView) inflate.findViewById(R.id.textsignbelow);
        this.p = (TextView) inflate.findViewById(R.id.textdistancenum);
        this.q = (TextView) inflate.findViewById(R.id.textpowernumbelow);
        this.r = (TextView) inflate.findViewById(R.id.textpowernumbelowsec);
        this.g = (TextView) inflate.findViewById(R.id.texthightbelow);
        this.g.getPaint().setFakeBoldText(true);
        this.i = (TextView) inflate.findViewById(R.id.textpowernum);
        this.i.getPaint().setFakeBoldText(true);
        this.h = (TextView) inflate.findViewById(R.id.textdistancenumbelow);
        this.h.getPaint().setFakeBoldText(true);
        this.j = (TextView) inflate.findViewById(R.id.textsignbelow);
        this.j.getPaint().setFakeBoldText(true);
        ao.b(getActivity().getAssets(), this.g, this.h, this.i, this.o, this.p, this.q, this.t, this.v);
        ao.a(getActivity().getAssets(), this.j, this.k, this.l, this.m, this.n, this.r, this.s, this.u, this.w, this.y, this.x, this.z, this.A, this.B);
        this.F = this.G.a;
        this.a.a(new com.fimi.soul.biz.manager.t.a(this) {
            final /* synthetic */ ShowDroneStatusFragment a;

            {
                this.a = r1;
            }

            public void a(String str, String str2) {
                this.a.B.setText(str2 + Constants.ACCEPT_TIME_SEPARATOR_SP + str);
            }
        });
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.F.b((b) this);
        this.a.a();
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        if (aVar2.U() && aVar2.T().a()) {
            double a;
            byte a2;
            switch (aVar) {
                case HEARDATA:
                    if (aVar2.U() && this.ah) {
                        e.a(aVar2);
                    }
                    double a3 = com.fimi.kernel.utils.t.a(aVar2.r().a() / 100.0d, 1);
                    a = com.fimi.kernel.utils.t.a(aVar2.r().b() / 100.0d, 1);
                    a(a3 + "m/s", this.t);
                    a(a + "m/s", this.v);
                    if (!this.W && a() > Z && a() <= aa) {
                        this.W = true;
                        c(1);
                    }
                    if (!this.X && a() > aa) {
                        this.X = true;
                        c(2);
                    }
                    if (!this.Y && b()) {
                        this.Y = true;
                        c(3);
                        return;
                    }
                    return;
                case Remotecontrol:
                    a2 = aVar2.K().a();
                    if ((byte) 30 <= a2 && a2 < DroneMap.m) {
                        a(getString(R.string.remotrmid), this.x);
                        return;
                    } else if (a2 >= DroneMap.m) {
                        a(getString(R.string.strong), this.x);
                        return;
                    } else if ((byte) 5 >= a2 || a2 >= (byte) 30) {
                        a(getString(R.string.nothing), this.x);
                        return;
                    } else {
                        a(getString(R.string.remotelow), this.x);
                        return;
                    }
                case NEWREMOTEMODEL:
                    this.O = (double) aVar2.g().e();
                    if (this.Q && !this.R) {
                        this.D.setVisibility(8);
                        this.C.setVisibility(8);
                        int i = ((int) (this.O * 100.0d)) / 1034 <= 0 ? 0 : ((int) (this.O * 100.0d)) / com.google.android.gms.location.places.d.bm >= 100 ? 100 : ((int) (this.O * 100.0d)) / com.google.android.gms.location.places.d.bm;
                        this.N.setLightPercent(this.P);
                        if (i != this.P && this.S == a.light_model) {
                            this.K.setVisibility(0);
                            this.N.setVisibility(0);
                            this.P = i;
                            this.ag.removeMessages(0);
                            if (this.c != null) {
                                this.c.cancel();
                                this.c = null;
                            }
                            if (this.c == null) {
                                this.c = new Timer();
                            }
                            this.c.schedule(new TimerTask(this) {
                                final /* synthetic */ ShowDroneStatusFragment a;

                                {
                                    this.a = r1;
                                }

                                public void run() {
                                    this.a.ag.sendEmptyMessage(0);
                                }
                            }, 3000);
                            return;
                        }
                        return;
                    }
                    return;
                case HEARDDAY:
                    a = (aVar2.u().f() - 677216.0d) / 10.0d;
                    if (!aVar2.ac()) {
                        a = 0.0d;
                    }
                    if (a < 3000.0d) {
                        if (a >= 100.0d || a < 0.0d) {
                            if (a < -999.0d) {
                                a = -999.0d;
                            }
                            a(a < 100.0d ? com.fimi.kernel.utils.t.a(a, 1) + "" : ((int) a) + "", this.g);
                        } else {
                            a(com.fimi.kernel.utils.t.a(a, 1) + "", this.g);
                        }
                    }
                    a = aVar2.u().g();
                    if (!aVar2.ac()) {
                        a = 0.0d;
                    }
                    if (a > -50.0d && a < 10000.0d && !aVar2.aj().g().isLightStream()) {
                        if (a >= 100.0d) {
                            a(((int) a) + "", this.h);
                        } else {
                            a(com.fimi.kernel.utils.t.a(a, 1) + "", this.h);
                        }
                    }
                    com.fimi.soul.biz.e.d a4 = com.fimi.soul.biz.e.d.a();
                    int f = a4.f();
                    if (!com.fimi.soul.biz.e.d.a().m() || f >= 50 || a >= 300.0d || aVar2.aj().g().isLightStream()) {
                        this.V = false;
                    } else if (!(this.V || com.fimi.soul.biz.e.d.a().k())) {
                        this.ag.sendEmptyMessage(1);
                        this.V = true;
                    }
                    if (!a4.n() || !a4.m()) {
                        a(getString(R.string.nothing), this.z);
                    } else if (30 <= f && f < 60) {
                        a(getString(R.string.remotrmid), this.z);
                    } else if (f >= 60) {
                        a(getString(R.string.strong), this.z);
                    } else if (f <= 0 || f >= 30) {
                        a(getString(R.string.nothing), this.z);
                    } else {
                        a(getString(R.string.remotelow), this.z);
                    }
                    if (aVar2.aj().g().isLightStream()) {
                        a(getString(R.string.nothing), this.j);
                        return;
                    }
                    a2 = aVar2.u().c();
                    if (a2 > (byte) 13) {
                        a(a2 + " ", this.j);
                    } else if ((byte) 8 < a2 && a2 <= (byte) 13) {
                        a(a2 + " ", this.j);
                    } else if (a2 > (byte) 8 || a2 <= (byte) 4) {
                        a(getString(R.string.nothing), this.j);
                    } else {
                        a(a2 + " ", this.j);
                    }
                    if (a2 <= (byte) 8) {
                        this.j.setTextColor(getResources().getColor(R.color.changebeterylow));
                        this.n.setTextColor(getResources().getColor(R.color.changebeterylow));
                        return;
                    }
                    this.j.setTextColor(getResources().getColor(R.color.changebetery));
                    this.n.setTextColor(getResources().getColor(R.color.changebetery));
                    return;
                case BATTERYINFO:
                    this.ah = false;
                    this.ai = (double) aVar2.D().e();
                    this.aj = (double) aVar2.D().d();
                    return;
                case NEW_HAND_OPERATE:
                    if (aVar2.al().f() == (byte) 3 && aVar2.al().d() == (byte) 51 && aVar2.al().g() == (byte) 4) {
                        if (aVar2.al().h() == 1.0f) {
                            this.R = true;
                            this.K.setVisibility(8);
                        } else {
                            this.R = false;
                            if (this.S == a.light_model) {
                                this.K.setVisibility(0);
                            }
                            this.ag.sendEmptyMessageDelayed(0, 2000);
                        }
                    }
                    if (aVar2.al().d() != SmileConstants.TOKEN_LITERAL_FALSE) {
                        return;
                    }
                    if (aVar2.al().f() == (byte) 1 || aVar2.al().f() == (byte) 3) {
                        if (aVar2.al().d() == SmileConstants.TOKEN_LITERAL_FALSE) {
                            if ((((int) aVar2.al().h()) & 4) == 4) {
                                this.R = true;
                                this.K.setVisibility(8);
                            } else {
                                this.R = false;
                                if (this.S == a.light_model) {
                                    this.K.setVisibility(0);
                                }
                                this.ag.sendEmptyMessageDelayed(0, 2000);
                            }
                        }
                        if (aVar2.al().f() == (byte) 1 && aVar2.al().e() == (byte) 0) {
                            this.R = false;
                            e();
                            return;
                        }
                        return;
                    }
                    return;
                case BATTERY:
                    d();
                    return;
                case backControl:
                    com.fimi.soul.drone.h.c L = aVar2.L();
                    if (L != null && L.b() == m.b && L.c == (byte) 2) {
                        switch (L.d) {
                            case (byte) 1:
                                if (!this.f) {
                                    a(false);
                                }
                                this.L.setText(getString(R.string.ev_value));
                                this.Q = false;
                                this.N.setVisibility(8);
                                this.J.setVisibility(0);
                                this.C.setVisibility(0);
                                this.D.setVisibility(0);
                                this.D.setText(String.valueOf(M));
                                return;
                            case (byte) 2:
                                if (!this.R) {
                                    a(false);
                                    this.L.setText(getString(R.string.light_ev));
                                    this.N.setVisibility(0);
                                    this.J.setVisibility(8);
                                    this.Q = true;
                                    this.S = a.light_model;
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                    return;
                case EV_VALUE:
                    this.S = a.ev_model;
                    p f2 = aVar2.f();
                    if (f2.c() == (byte) 2) {
                        int d = f2.d() & 255;
                        int e = f2.e() & 255;
                        float e2 = com.fimi.soul.biz.e.d.a().k() ? e((e << 8) | d) : d((e << 8) | d);
                        this.L.setText(getString(R.string.ev_value));
                        if (M == e2) {
                            return;
                        }
                        if (e != 255 || d != 255) {
                            this.ag.removeMessages(0);
                            M = e2;
                            this.D.setText(String.valueOf(M));
                            this.J.a(e2);
                            if (this.K.getVisibility() == 8 && !this.f) {
                                this.D.setVisibility(0);
                                this.C.setVisibility(0);
                                this.K.setVisibility(0);
                            }
                            if (this.b != null) {
                                this.b.cancel();
                                this.b = null;
                            }
                            if (this.b == null) {
                                this.b = new Timer();
                            }
                            this.b.schedule(new TimerTask(this) {
                                final /* synthetic */ ShowDroneStatusFragment a;

                                {
                                    this.a = r1;
                                }

                                public void run() {
                                    this.a.ag.sendEmptyMessage(0);
                                }
                            }, 3000);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        if (!aVar2.T().a()) {
            this.W = false;
            this.X = false;
            this.Y = false;
            this.r.setVisibility(8);
            this.q.setVisibility(0);
            a("0.0", this.h);
            a("0.0", this.g);
            a("0", this.i);
            a("0.0m/s", this.t);
            a("0.0m/s", this.v);
            a(getString(R.string.electricity), this.m);
            a("%", this.q);
            a(getString(R.string.nothing), this.j);
            a(getString(R.string.nothing), this.x);
            a(getString(R.string.nothing), this.z);
        }
        if (!aVar2.U()) {
            this.ai = 0.0d;
            this.ah = true;
            this.W = false;
            this.X = false;
            this.Y = false;
        }
    }

    public void onResume() {
        super.onResume();
        c();
    }

    public void onStart() {
        super.onStart();
        this.F.a((b) this);
        this.d = new c(this.F, this.E);
    }

    public void onStop() {
        super.onStop();
    }
}
