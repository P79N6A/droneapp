package com.fimi.soul.module.droneFragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.t;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.c;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.y;
import com.fimi.soul.view.MyEditView;
import com.fimi.soul.view.SwitchButtonStoke;
import com.fimi.soul.view.SwitchButtonStoke.a;
import com.fimi.soul.view.myhorizontalseebar.SeekBar;
import com.google.android.gms.maps.model.LatLng;
import java.math.BigDecimal;
import java.util.regex.Pattern;

public class k implements OnClickListener, a {
    private int A = 8;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F = 20;
    private int G = 1;
    private double H;
    private double I;
    private double J;
    private double K;
    private double L;
    private d M;
    private int N = 300;
    private boolean O;
    private boolean P = false;
    private int Q = 0;
    private String R;
    private String S = "s";
    private String T = "m/s";
    private Button a;
    private Button b;
    private Button c;
    private MyEditView d;
    private MyEditView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private SeekBar n;
    private SeekBar o;
    private SwitchButtonStoke p;
    private com.fimi.soul.drone.a q;
    private PercentRelativeLayout r;
    private ImageView s;
    private int t = 1;
    private int u = 30;
    private int v = 10;
    private int w = 10;
    private int x = 120;
    private int y = 500;
    private int z = 4;

    public k(View view, com.fimi.soul.drone.a aVar) {
        this.q = aVar;
        a(view);
        this.M = (d) b.a().d();
    }

    private int a(double d) {
        this.H = d;
        double sin = (double) ((int) (((double) this.z) / Math.sin(Math.toRadians(d))));
        double cos = (double) ((int) (((double) this.A) / Math.cos(Math.toRadians(d))));
        if (Math.cos(Math.toRadians(d)) * sin <= ((double) this.A) && Math.sin(Math.toRadians(d)) * cos > ((double) this.z)) {
            this.B = (int) sin;
        }
        if (Math.cos(Math.toRadians(d)) * sin > ((double) this.A) && Math.sin(Math.toRadians(d)) * cos <= ((double) this.z)) {
            this.B = (int) cos;
        }
        if (Math.sin(Math.toRadians(d)) * cos <= ((double) this.z) && Math.cos(Math.toRadians(d)) * sin <= ((double) this.A)) {
            if (sin >= cos) {
                this.B = (int) sin;
            } else {
                this.B = (int) cos;
            }
        }
        this.o.setMax(this.B);
        this.m.setText(String.format(this.q.d.getString(R.string.fly_angle), new Object[]{Integer.valueOf((int) d)}));
        int progress = this.o.getProgress();
        if (progress < this.t) {
            progress = this.t;
        }
        a(j(), d, (int) (((double) this.y) - i()), progress);
        return this.B;
    }

    private int a(int i, double d, int i2, int i3) {
        double sin = ((double) i) / Math.sin(Math.toRadians(d));
        double d2 = (double) this.N;
        int i4 = this.N;
        if ((Math.cos(Math.toRadians(d)) * sin) - i() <= ((double) i4) && (Math.sin(Math.toRadians(d)) * d2) - ((this.q.u().f() - 677216.0d) / 10.0d) <= ((double) i)) {
            if (sin <= d2) {
                this.E = (int) (d2 / ((double) i3));
                this.C = (int) d2;
            } else {
                this.E = (int) (sin / ((double) i3));
                this.C = (int) sin;
            }
        }
        if ((Math.cos(Math.toRadians(d)) * sin) - i() <= ((double) i4) && (Math.sin(Math.toRadians(d)) * d2) - ((this.q.u().f() - 677216.0d) / 10.0d) > ((double) i)) {
            this.E = (int) (sin / ((double) i3));
            this.C = (int) sin;
        }
        if ((sin * Math.cos(Math.toRadians(d))) - i() > ((double) i4) && (Math.sin(Math.toRadians(d)) * d2) - ((this.q.u().f() - 677216.0d) / 10.0d) <= ((double) i)) {
            this.E = (int) (d2 / ((double) i3));
            this.C = (int) d2;
        }
        k();
        this.n.setMax(this.E);
        return this.E;
    }

    private void a(View view) {
        this.j = (TextView) view.findViewById(R.id.guestDestinceDes);
        this.k = (TextView) view.findViewById(R.id.height_diatance_guest);
        this.l = (TextView) view.findViewById(R.id.drone_fly_direction);
        this.m = (TextView) view.findViewById(R.id.drone_fly_angle);
        this.s = (ImageView) view.findViewById(R.id.targeImage);
        this.r = (PercentRelativeLayout) view.findViewById(R.id.takephoto_operaRL);
        this.a = (Button) view.findViewById(R.id.fly_action_cancal_btn);
        this.b = (Button) view.findViewById(R.id.fly_action_execute_btn);
        this.f = (TextView) view.findViewById(R.id.show_camera_angle);
        this.g = (TextView) view.findViewById(R.id.heighdes);
        this.h = (TextView) view.findViewById(R.id.speekdes);
        this.n = (SeekBar) view.findViewById(R.id.heightseebar_value);
        this.n.setOnSeekBarChangeListener(new SeekBar.a(this) {
            final /* synthetic */ k a;

            {
                this.a = r1;
            }

            public void a(SeekBar seekBar) {
            }

            public void a(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    this.a.d.setText(i + "s");
                    this.a.k();
                }
            }

            public void b(SeekBar seekBar) {
            }
        });
        this.o = (SeekBar) view.findViewById(R.id.speek_seebar_value);
        this.o.setOnSeekBarChangeListener(new SeekBar.a(this) {
            final /* synthetic */ k a;

            {
                this.a = r1;
            }

            public void a(SeekBar seekBar) {
            }

            public void a(SeekBar seekBar, int i, boolean z) {
                if (i < 1) {
                    i = 1;
                }
                this.a.k();
                this.a.e.setText(i + "m/s");
            }

            public void b(SeekBar seekBar) {
                this.a.g();
            }
        });
        this.p = (SwitchButtonStoke) view.findViewById(R.id.is_auto_back);
        this.p.setOnSwitchListener(new a(this) {
            final /* synthetic */ k a;

            {
                this.a = r1;
            }

            public void a(View view, boolean z) {
                if (z) {
                    this.a.Q = 1;
                } else {
                    this.a.Q = 0;
                }
            }
        });
        this.i = (TextView) view.findViewById(R.id.sbbuttondes);
        this.c = (Button) view.findViewById(R.id.setflyphoto);
        this.d = (MyEditView) view.findViewById(R.id.height_value);
        this.d.setOnFinishComposingListener(new MyEditView.b(this) {
            final /* synthetic */ k a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.d.clearFocus();
            }
        });
        this.d.setOnFocusChangeListener(new OnFocusChangeListener(this) {
            final /* synthetic */ k a;

            {
                this.a = r1;
            }

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    this.a.R = this.a.d.getText().toString();
                } else {
                    this.a.a(this.a.d, this.a.E, 0, this.a.n, this.a.S);
                }
            }
        });
        this.e = (MyEditView) view.findViewById(R.id.speek_value);
        this.e.setOnFinishComposingListener(new MyEditView.b(this) {
            final /* synthetic */ k a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.e.clearFocus();
            }
        });
        this.e.setOnFocusChangeListener(new OnFocusChangeListener(this) {
            final /* synthetic */ k a;

            {
                this.a = r1;
            }

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    this.a.R = this.a.d.getText().toString();
                } else {
                    this.a.a(this.a.e, this.a.B, this.a.t, this.a.o, this.a.T);
                }
            }
        });
        ao.a(this.q.d.getAssets(), this.a, this.b, this.f, this.g, this.h, this.i, this.c, this.j, this.k, this.l, this.m);
        ao.b(this.q.d.getAssets(), this.d, this.e);
        for (View view2 : new View[]{this.a, this.b, this.c}) {
            if (view2 instanceof SwitchButtonStoke) {
                ((SwitchButtonStoke) view2).setOnSwitchListener(this);
            } else {
                view2.setOnClickListener(this);
            }
        }
        for (MyEditView myEditView : new MyEditView[]{this.d, this.e}) {
            myEditView.clearFocus();
            myEditView.setInputType(2);
        }
    }

    private void a(TextView textView, int i, double d) {
        if (!textView.getText().toString().equals(String.format(this.q.d.getString(i), new Object[]{Double.valueOf(d)}))) {
            textView.setText(String.format(this.q.d.getString(i), new Object[]{Double.valueOf(d)}));
        }
    }

    private void a(MyEditView myEditView, int i, int i2, SeekBar seekBar, String str) {
        try {
            String str2;
            String a = a(b(myEditView.getText().toString()));
            int parseInt = Integer.parseInt(a);
            if (parseInt > i) {
                str2 = i + str;
                myEditView.setText(str2);
            } else if (parseInt < i2) {
                str2 = i2 + str;
                myEditView.setText(str2);
                i = i2;
            } else {
                i = parseInt;
                str2 = a;
            }
            seekBar.setProgress(Integer.valueOf(i).intValue());
            if (!str2.contains(str)) {
                myEditView.setText(str2 + str);
            }
        } catch (Exception e) {
            if (this.R != null) {
                myEditView.setText(this.R);
                this.R = " ";
            }
        }
    }

    public static String b(String str) {
        return Pattern.compile("[^0-9]").matcher(str).replaceAll("").trim();
    }

    private double i() {
        return y.c(new LatLng(this.q.v().b(), this.q.v().c()), new LatLng(this.q.u().e(), this.q.u().d())).a();
    }

    private int j() {
        return (int) (((double) this.x) - ((this.q.u().f() - 677216.0d) / 10.0d));
    }

    private void k() {
        int progress = this.o.getProgress();
        if (progress < this.t) {
            progress = this.t;
        }
        progress *= this.n.getProgress();
        double a = t.a((((double) progress) * Math.sin(Math.toRadians(this.H))) + ((this.q.u().f() - 677216.0d) / 10.0d), 1);
        double a2 = t.a(((double) progress) * Math.cos(Math.toRadians(this.H)), 1);
        a(this.k, (int) R.string.take_phone_fly_time, a);
        a(this.j, (int) R.string.guest_distance_value, a2);
    }

    public LatLng a(LatLng latLng, double d, double d2) {
        return y.a(latLng, d, d2);
    }

    public String a(String str) {
        return BigDecimal.valueOf(Double.parseDouble(str)).stripTrailingZeros().toPlainString();
    }

    public void a() {
        if (this.q.aj().g().isEnforcementAtti()) {
            z.a(this.q.d, (int) R.string.cant_fly_takePhoto_atti, 3000);
        } else if (this.q.aj().g().isLightStream()) {
            z.a(this.q.d, (int) R.string.cant_fly_takePhoto_VPU, 3000);
        } else if (this.E <= 0 || this.n.getProgress() != 0) {
            if (this.M == null || this.M.f() != c.a.Recoding) {
                this.M.u().f();
            } else {
                b();
            }
            this.q.a(com.fimi.soul.drone.d.a.SHOWOUTTIMEPROBAR);
        } else {
            z.a(this.q.d, (int) R.string.set_flyTime, 3000);
        }
    }

    public void a(int i) {
        this.D = i;
        this.f.setText(this.D + "°");
        a((double) Math.abs(i));
    }

    public void a(View view, boolean z) {
    }

    public void a(com.fimi.soul.drone.h.a.a aVar) {
        if (aVar != null) {
            try {
                if (this.J == 0.0d) {
                    this.J = (double) aVar.d();
                }
                if (this.K == 0.0d) {
                    this.K = (double) aVar.e();
                }
                if (this.L == 0.0d) {
                    this.L = (double) aVar.c();
                }
                if (this.I == 0.0d) {
                    this.I = (double) (aVar.f() / 10);
                }
                this.o.setProgress(aVar.g() / 10);
                this.n.setProgress(aVar.h() / aVar.g());
            } catch (Exception e) {
            }
        }
    }

    public void b() {
        if (this.P) {
            if (this.J == 0.0d) {
                this.J = this.q.u().f() - 677216.0d;
            }
            LatLng latLng = new LatLng(this.q.u().e(), this.q.u().d());
            if (this.K == 0.0d) {
                this.K = latLng.b;
            }
            if (this.L == 0.0d) {
                this.L = latLng.a;
            }
            if (this.I == 0.0d) {
                this.I = this.H;
            }
            c();
        }
    }

    public void c() {
        int progress = this.o.getProgress();
        int i = progress < this.t ? this.t : progress;
        if (!com.fimi.soul.biz.n.a.a().b()) {
            af a = com.fimi.soul.utils.z.a(0.5d, this.L, this.K);
            this.L = a.a();
            this.K = a.b();
        }
        com.fimi.soul.module.b.d.a(this.q).a((byte) 18, (byte) this.Q, (short) ((this.n.getProgress() * i) * 10), (short) ((int) (this.I * 100.0d)), (byte) (i * 10), (short) ((int) this.J), (float) this.K, (float) this.L);
    }

    public void d() {
        z.a(this.q.d, (int) R.string.take_photo_tip, 2000);
    }

    public void e() {
        this.c.setVisibility(0);
        this.s.setVisibility(0);
    }

    public void f() {
        this.c.setVisibility(8);
        this.c.setVisibility(8);
        if (this.r.isShown()) {
            this.r.setVisibility(8);
        }
    }

    public void g() {
        if (this.E >= 20) {
            this.n.setProgress(this.F);
            this.d.setText(this.F + "s");
            return;
        }
        if (this.E == 0 && this.r.isShown() && j() < 2) {
            z.a(this.q.d, "飞机将达到最大高度，请调节云台角度", 3000);
        }
        this.n.setProgress(this.E);
        this.d.setText(this.E + "s");
    }

    public void h() {
        g();
        if (this.B >= 1) {
            this.o.setProgress(this.G);
            this.e.setText(this.G + "m/s");
        } else {
            this.o.setProgress(this.B);
            this.e.setText(this.B + "m/s");
        }
        this.r.setVisibility(8);
        this.p.setSwitchState(false);
        this.Q = 0;
        this.L = 0.0d;
        this.J = 0.0d;
        this.K = 0.0d;
        this.I = 0.0d;
        this.O = false;
        this.P = false;
        k();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fly_action_cancal_btn:
                this.P = false;
                f();
                h.a(this.q.d).a(0);
                this.q.a(com.fimi.soul.drone.d.a.CANCALFLYACTION);
                return;
            case R.id.fly_action_execute_btn:
                if (this.O) {
                    this.P = true;
                    a();
                    return;
                }
                z.a(this.q.d, (int) R.string.on_next, 3000);
                return;
            case R.id.setflyphoto:
                this.O = true;
                if (!this.r.isShown()) {
                    this.r.setVisibility(0);
                }
                if (this.s.isShown()) {
                    this.s.setVisibility(8);
                }
                if (this.c.isShown()) {
                    this.c.setVisibility(8);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
