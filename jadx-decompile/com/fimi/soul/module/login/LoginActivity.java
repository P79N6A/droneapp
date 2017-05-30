package com.fimi.soul.module.login;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.d;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.update.e;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.d.o;
import com.fimi.soul.drone.g.c;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.login.LoginFragment.a;
import com.fimi.soul.module.push.MessageDetailActivity;
import com.fimi.soul.module.update.CheckFirmwareActvity;
import com.fimi.soul.module.update.UpdateConnectDefeaFrgment;
import com.fimi.soul.module.update.UpgradingActivity;
import com.fimi.soul.service.UsbStatus;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.BreathLeapView;
import com.fimi.soul.view.TranslationView;

public class LoginActivity extends BaseActivity implements b, a, UsbConnectFragment.a, UpdateConnectDefeaFrgment.a {
    private static final int A = 4;
    private static final int D = 8;
    private static final int N = 0;
    private static final int o = 0;
    private static final int p = 1;
    private static final int u = 2;
    private static final int v = 3;
    private static final int w = 0;
    private static final int x = 1;
    private static final int y = 2;
    private static final int z = 3;
    private boolean B;
    private int C = 0;
    private boolean E = false;
    private boolean F = false;
    private final int G = 35000;
    private int H = 0;
    private ImageView I;
    private ValueAnimator J;
    private com.fimi.soul.biz.update.b K;
    private int L = 0;
    private Thread M;
    private final Handler O = new Handler(this) {
        final /* synthetic */ LoginActivity a;

        {
            this.a = r1;
        }

        @TargetApi(17)
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 0:
                    this.a.O.removeCallbacks(this.a.Q);
                    if (this.a.C == 1 && this.a.H <= 0) {
                        this.a.C = 3;
                        this.a.a(this.a.getString(R.string.rc_tip_error), this.a.getString(R.string.unconnetremote));
                        this.a.f();
                        return;
                    }
                    return;
                case 1:
                    if (this.a.C == 1 && this.a.H <= 0) {
                        if (!this.a.drone.U()) {
                            this.a.a(this.a.getString(R.string.fc_tip_error), this.a.getString(R.string.unconnectdrone));
                        } else if (this.a.drone.ac()) {
                            this.a.k();
                        } else {
                            this.a.C = 0;
                            this.a.dpa.b();
                            this.a.dpa.b(this.a);
                            this.a.startActivityForResult(new Intent(this.a, CheckFirmwareActvity.class), 0);
                            this.a.overridePendingTransition(17432576, 17432577);
                        }
                        this.a.f.d();
                        return;
                    }
                    return;
                case 3:
                    this.a.B = false;
                    return;
                case 4:
                    if (this.a.C != 0) {
                        this.a.f.a(false);
                        this.a.f();
                        this.a.M = new Thread(this.a.R);
                        this.a.M.start();
                        this.a.J.start();
                        this.a.O.postDelayed(this.a.Q, 200);
                        this.a.O.sendEmptyMessageDelayed(0, 35000);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    };
    private Runnable P = new Runnable(this) {
        final /* synthetic */ LoginActivity a;

        {
            this.a = r1;
        }

        public void run() {
            if (!this.a.i.isAdded() && !this.a.isFinishing()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("isEnterLoginFragment", true);
                this.a.i.setArguments(bundle);
                this.a.getFragmentManager().beginTransaction().replace(R.id.main_layout, this.a.i).commitAllowingStateLoss();
            }
        }
    };
    private Runnable Q = new Runnable(this) {
        final /* synthetic */ LoginActivity a;

        {
            this.a = r1;
        }

        public void run() {
            if (this.a.C == 0) {
                this.a.l.a();
                this.a.m.setVisibility(4);
                this.a.l.setVisibility(0);
                return;
            }
            if (this.a.a) {
                this.a.s.start();
                this.a.t.setVisibility(0);
                this.a.q.setVisibility(0);
                this.a.getFragmentManager().beginTransaction().remove(this.a.i).commitAllowingStateLoss();
                this.a.a = false;
            }
            this.a.m.setVisibility(0);
            this.a.l.setVisibility(4);
            this.a.m.setting(this.a.n);
            this.a.n = this.a.n + 1;
            if (this.a.n == 8) {
                this.a.n = 0;
                this.a.O.postDelayed(this.a.Q, 600);
                return;
            }
            this.a.O.postDelayed(this.a.Q, 200);
        }
    };
    private Runnable R = new Runnable(this) {
        final /* synthetic */ LoginActivity a;

        {
            this.a = r1;
        }

        public void run() {
            boolean z;
            boolean z2 = false;
            boolean z3 = false;
            byte b = (byte) 0;
            int i = 0;
            while (i < 25) {
                boolean z4;
                byte b2;
                z2 = this.a.f.c();
                if (z2) {
                    if (!z3) {
                        z3 = ao.d(c.b());
                    }
                    if (z3 && !this.a.drone.T().a()) {
                        this.a.i();
                    }
                    this.a.a(1500);
                    if (this.a.drone.T().a() && b == (byte) 0) {
                        o.a.d = (byte) 0;
                        o.a.e = (byte) 2;
                        this.a.drone.T().a(o.a.a());
                        b = (byte) 1;
                    }
                    if ((this.a.drone.T().a() || this.a.drone.U()) && z2) {
                        z = z2;
                        break;
                    }
                    z4 = z3;
                    b2 = b;
                    z = z4;
                } else {
                    this.a.f.a();
                    this.a.e.b();
                    this.a.a((int) d.a);
                    z4 = z3;
                    b2 = b;
                    z = z4;
                }
                i++;
                z4 = z;
                b = b2;
                z3 = z4;
            }
            z = z2;
            this.a.O.removeMessages(0);
            if (this.a.O.hasMessages(0)) {
                this.a.O.removeMessages(0);
            }
            if (this.a.drone.T().a() && r0) {
                this.a.O.removeCallbacks(this.a.Q);
                this.a.O.sendEmptyMessageDelayed(1, 500);
                return;
            }
            this.a.O.sendEmptyMessage(0);
        }
    };
    boolean a = true;
    v b;
    boolean c;
    com.fimi.soul.biz.e.d d;
    com.fimi.soul.biz.e.c e;
    com.fimi.soul.biz.i.a f;
    private UpdateConnectDefeaFrgment g;
    private LoginFragment h;
    private UsbConnectFragment i;
    private ImageView j;
    private AnimationDrawable k;
    private TranslationView l;
    private BreathLeapView m;
    private int n = 0;
    private ProgressView q;
    private final int r = 200;
    private ValueAnimator s;
    private TextView t;

    static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] a = new int[com.fimi.soul.drone.d.a.values().length];

        static {
            try {
                a[com.fimi.soul.drone.d.a.Remotecontrol.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
        }
    }

    private void a(int i) {
        try {
            Thread.sleep((long) i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void a(String str, String str2) {
        boolean g = g();
        if (this.g == null) {
            this.g = new UpdateConnectDefeaFrgment();
        }
        if (!this.F) {
            if (g) {
                getFragmentManager().beginTransaction().show(this.g);
            } else {
                getFragmentManager().beginTransaction().add(R.id.main_layout, this.g).commitAllowingStateLoss();
            }
            this.g.a(str);
            this.g.b(str2);
            this.g.c(getString(R.string.no_connect));
            this.g.c(false);
            this.g.a(false);
            getFragmentManager().beginTransaction().setCustomAnimations(17432576, 17432577);
        }
    }

    private void f() {
        if (this.M != null && this.M.isAlive() && !this.M.isInterrupted()) {
            this.M.interrupt();
        }
    }

    private boolean g() {
        try {
            this.g = (UpdateConnectDefeaFrgment) getFragmentManager().findFragmentById(R.id.main_layout);
            if (this.g != null) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private void h() {
        try {
            String packageName = getPackageName();
            String str = "https://play.google.com/store/apps/details?id=" + packageName;
            new e(this, getPackageManager().getPackageInfo(packageName, 0).versionName).execute(new String[]{str});
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void i() {
        com.fimi.soul.drone.droneconnection.connection.a.a.a(c.d);
        this.drone.T().b();
    }

    private void j() {
        if (this.B) {
            finish();
            return;
        }
        this.B = true;
        z.a(getApplicationContext(), (int) R.string.again_exit, z.b);
        this.O.sendEmptyMessageDelayed(3, 2000);
    }

    private void k() {
        startActivity(new Intent(this, FlightActivity.class));
        finish();
    }

    public void a() {
        if (this.k != null) {
            this.C = 0;
            this.k.stop();
            this.k.start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new AnimatorUpdateListener(this) {
                final /* synthetic */ LoginActivity a;

                {
                    this.a = r1;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            ofFloat.setDuration(720);
            ofFloat.start();
            getWindow().setFlags(128, 128);
            this.O.postDelayed(this.P, 1100);
        }
    }

    public void b() {
        this.d.o().f().a(com.fimi.soul.biz.camera.e.b());
        this.e.f().f().a(com.fimi.soul.biz.camera.e.c());
        com.fimi.soul.biz.camera.b.c e = com.fimi.soul.biz.camera.b.a().e();
        if (e != null && (e instanceof com.fimi.soul.biz.camera.a.b)) {
            com.fimi.soul.biz.camera.a.b bVar = (com.fimi.soul.biz.camera.a.b) e;
            com.fimi.kernel.b.d.c g = bVar.g();
            if (g != null) {
                g.f().a(com.fimi.soul.biz.camera.e.a());
            }
            com.fimi.kernel.b.d.c f = bVar.f();
            if (f != null) {
                f.f().a(com.fimi.soul.biz.camera.e.a());
            }
        }
        this.C = 1;
        if (this.j != null) {
            this.j.setVisibility(8);
        }
        this.l.setVisibility(0);
        this.l.a(500);
        this.O.sendEmptyMessageDelayed(4, 500);
        this.n = 0;
        this.I.setAlpha(0.0f);
        getFragmentManager().beginTransaction().remove(this.i).commitAllowingStateLoss();
    }

    public void c() {
        if (this.E) {
            this.b.a().edit().putBoolean(com.fimi.soul.base.a.J, false).commit();
            this.dpa.d();
            return;
        }
        startActivity(new Intent(this, FlightActivity.class));
    }

    public void d() {
        if (this.E) {
            this.b.a().edit().putBoolean(com.fimi.soul.base.a.J, false);
            this.dpa.d();
            return;
        }
        startActivity(new Intent(this, FlightActivity.class));
    }

    public void e() {
        this.C = 0;
        getFragmentManager().beginTransaction().remove(this.g).commit();
        this.a = true;
        this.t.setVisibility(4);
        this.q.setVisibility(4);
        this.m.setAlpha(0.0f);
        this.l.setVisibility(0);
        this.l.a();
        getFragmentManager().beginTransaction().replace(R.id.main_layout, this.i).commit();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            this.a = true;
            this.t.setVisibility(4);
            this.q.setVisibility(4);
            if (this.m != null) {
                this.m.setAlpha(0.0f);
            }
            if (this.j != null) {
                this.j.setVisibility(4);
            }
            this.l.setVisibility(0);
            this.l.a();
            getFragmentManager().beginTransaction().replace(R.id.main_layout, this.i).commit();
        }
        super.onActivityResult(i, i2, intent);
    }

    @TargetApi(16)
    protected void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_login);
        this.dpa.b((Activity) this);
        startService(new Intent(this, UsbStatus.class));
        this.I = (ImageView) findViewById(R.id.login_mask_iv);
        this.l = (TranslationView) findViewById(R.id.translationview);
        this.h = new LoginFragment();
        this.i = new UsbConnectFragment();
        this.d = com.fimi.soul.biz.e.d.a();
        this.e = com.fimi.soul.biz.e.c.a();
        if (getIntent().getBooleanExtra("islaunchexit", false)) {
            this.b = v.a((Context) this);
            this.E = this.b.a().getBoolean(com.fimi.soul.base.a.L, false);
        } else {
            this.b = v.a((Context) this);
            this.E = this.b.a().getBoolean(com.fimi.soul.base.a.L, false);
        }
        if (getIntent().getBooleanExtra(com.google.firebase.a.a.a.k, true)) {
            ((ViewStub) findViewById(R.id.login_animation_vs)).inflate();
            this.j = (ImageView) findViewById(R.id.login_animation_iv);
            this.j.setVisibility(0);
            this.C = 2;
            getFragmentManager().beginTransaction().replace(R.id.main_layout, this.h).commit();
            this.I.setAlpha(0.0f);
        } else {
            this.C = 0;
            this.l.setVisibility(0);
            this.l.a();
            bundle2 = new Bundle();
            bundle2.putBoolean("isenterLoginFragment", true);
            this.i.setArguments(bundle2);
            getFragmentManager().beginTransaction().replace(R.id.main_layout, this.i).commit();
            getWindow().setFlags(128, 128);
            this.I.setAlpha(1.0f);
        }
        this.s = ValueAnimator.ofFloat(new float[]{0.0f, 200.0f});
        this.s.setDuration(35000);
        this.s.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ LoginActivity a;

            {
                this.a = r1;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.q.setCurrentCount(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.J = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.J.setDuration(200);
        this.J.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ LoginActivity a;

            {
                this.a = r1;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        new IntentFilter().addAction("exit");
        this.drone.a((b) this);
        this.q = (ProgressView) findViewById(R.id.checkFirmwareprogress);
        this.q.setMaxCount(200.0f);
        this.t = (TextView) findViewById(R.id.checking_hard_tv);
        ao.a(getAssets(), this.t);
        this.O.postDelayed(new Runnable(this) {
            final /* synthetic */ LoginActivity a;

            {
                this.a = r1;
            }

            public void run() {
                ((ViewStub) this.a.findViewById(R.id.breathleap_vs)).inflate();
                this.a.m = (BreathLeapView) this.a.findViewById(R.id.breathleap);
                this.a.I.setBackgroundResource(R.drawable.login_mask);
                if (this.a.getIntent().getBooleanExtra(com.google.firebase.a.a.a.k, true)) {
                    Drawable drawable = this.a.getResources().getDrawable(R.drawable.login_anim);
                    this.a.k = (AnimationDrawable) drawable;
                    this.a.k.setOneShot(true);
                    this.a.j.setBackground(drawable);
                }
            }
        }, 500);
        this.L = getIntent().getIntExtra(UpgradingActivity.a, 0);
        bundle2 = getIntent().getBundleExtra("launchBundle");
        if (bundle2 != null) {
            Intent intent = new Intent(this, MessageDetailActivity.class);
            intent.putExtra("redirectURL", bundle2.getString("redirectURL"));
            startActivity(intent);
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        this.F = true;
        if (!(this.l == null || this.m == null)) {
            this.l.c();
            this.m.a();
        }
        this.drone.b((b) this);
        f();
        if (this.O.hasMessages(0)) {
            this.O.removeMessages(0);
        }
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        int i = AnonymousClass9.a[aVar.ordinal()];
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            switch (this.C) {
                case 0:
                    if (this.E) {
                        finish();
                        return false;
                    }
                    j();
                    return false;
                case 1:
                    if (this.J.isRunning()) {
                        this.J.cancel();
                    }
                    if (this.s.isRunning()) {
                        this.s.cancel();
                    }
                    this.C = 0;
                    this.a = true;
                    this.O.removeCallbacks(this.Q);
                    this.O.removeCallbacks(this.R);
                    this.t.setVisibility(4);
                    this.q.setVisibility(4);
                    this.m.setAlpha(0.0f);
                    getFragmentManager().beginTransaction().replace(R.id.main_layout, this.i).commit();
                    this.l.setVisibility(0);
                    this.l.b();
                    this.l.a();
                    return false;
                case 2:
                    if (this.E) {
                        finish();
                        return false;
                    }
                    j();
                    return false;
                case 3:
                    this.C = 0;
                    getFragmentManager().beginTransaction().remove(this.g).commit();
                    this.a = true;
                    this.t.setVisibility(4);
                    this.q.setVisibility(4);
                    this.m.setAlpha(0.0f);
                    this.l.setVisibility(0);
                    this.l.a();
                    getFragmentManager().beginTransaction().replace(R.id.main_layout, this.i).commit();
                    return false;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    protected void onResume() {
        super.onResume();
        if (this.L == 20) {
            a(getString(R.string.phone_unconect_flight), getString(R.string.remote_noconnect_plane));
        }
    }

    protected void onStart() {
        super.onStart();
        this.f = com.fimi.soul.biz.i.a.b();
        this.F = false;
        if (this.C == 1) {
            this.O.post(this.Q);
        }
    }

    protected void onStop() {
        super.onStop();
        this.F = true;
        this.O.removeCallbacks(this.Q);
        this.O.removeCallbacks(this.P);
        if (this.K != null && this.K.b() != null) {
            this.K.a(null);
        }
    }
}
