package com.fimi.soul.module.calibcompass;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.h.j;
import com.fimi.soul.view.f.a;
import com.google.android.gms.cast.framework.media.NotificationOptions;

public class CaliCompassActivity extends BaseActivity implements a, a, a, a {
    private CaliComPassFirstFragment a;
    private CaliCompassSecondFragment b;
    private CaliCompassErrorFragment c;
    private CaliComPassThirdFragment d;
    private CaliCompassFourFragment e;
    private CaliCompassErrorVertialFragment f;
    private CaliCompassStatusFragment g;
    private FragmentManager h;
    private boolean i;
    private boolean j;
    private boolean k = true;
    private boolean l;
    private final int m = 11;
    private final int n = 12;
    private final int o = 13;
    private boolean p;
    private Handler q = new Handler(this) {
        final /* synthetic */ CaliCompassActivity a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 12:
                    if (this.a.a != null) {
                        this.a.p = true;
                        this.a.a.a(true);
                        return;
                    }
                    return;
                case 13:
                    if (!this.a.drone.U() && this.a.drone.T().a()) {
                        this.a.a(R.string.GC_caliFail_discon_drone, "error", false, false);
                        return;
                    } else if (!this.a.drone.T().a()) {
                        this.a.a(R.string.GC_caliFail_discon, "error", false, false);
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    };
    private boolean r = false;

    private void a(int i, String str, boolean z, boolean z2) {
        if (this.k) {
            for (Fragment fragment : this.h.getFragments()) {
                if (fragment != null && fragment.isVisible()) {
                    Fragment findFragmentByTag = this.h.findFragmentByTag(str);
                    if ((findFragmentByTag instanceof CaliCompassErrorFragment) && findFragmentByTag.isHidden()) {
                        ((CaliCompassErrorFragment) findFragmentByTag).a(getString(i), z, z2);
                        this.h.beginTransaction().hide(fragment).show(findFragmentByTag).commitAllowingStateLoss();
                    }
                }
            }
        }
        this.g.a(false);
    }

    private void a(Bundle bundle) {
        this.h = getSupportFragmentManager();
        if (bundle == null) {
            this.g = (CaliCompassStatusFragment) this.h.findFragmentById(R.id.compass_begin);
            if (this.g == null) {
                this.g = new CaliCompassStatusFragment();
            }
            this.h.beginTransaction().add(R.id.compass_begin, this.g, "begin").commitAllowingStateLoss();
            this.a = (CaliComPassFirstFragment) this.h.findFragmentById(R.id.compass_first);
            if (this.a == null) {
                this.a = new CaliComPassFirstFragment();
            }
            this.h.beginTransaction().add(R.id.compass_first, this.a, "first").hide(this.a).commitAllowingStateLoss();
            this.b = (CaliCompassSecondFragment) this.h.findFragmentById(R.id.compass_second);
            if (this.b == null) {
                this.b = new CaliCompassSecondFragment();
            }
            this.h.beginTransaction().add(R.id.compass_second, this.b, "second").hide(this.b).commitAllowingStateLoss();
            this.c = (CaliCompassErrorFragment) this.h.findFragmentById(R.id.compass_error);
            if (this.c == null) {
                this.c = new CaliCompassErrorFragment();
                this.c.a(this.i);
            }
            this.h.beginTransaction().add(R.id.compass_error, this.c, "error").hide(this.c).commitAllowingStateLoss();
            this.d = (CaliComPassThirdFragment) this.h.findFragmentById(R.id.compass_thrid);
            if (this.d == null) {
                this.d = new CaliComPassThirdFragment();
            }
            this.h.beginTransaction().add(R.id.compass_thrid, this.d, "thrid").hide(this.d).commitAllowingStateLoss();
            this.e = (CaliCompassFourFragment) this.h.findFragmentById(R.id.compass_four);
            if (this.e == null) {
                this.e = new CaliCompassFourFragment();
            }
            this.e.a(this.i);
            this.h.beginTransaction().add(R.id.compass_four, this.e, "four").hide(this.e).commitAllowingStateLoss();
            this.f = (CaliCompassErrorVertialFragment) this.h.findFragmentById(R.id.compass_error_vertail);
            if (this.f == null) {
                this.f = new CaliCompassErrorVertialFragment();
            }
            this.h.beginTransaction().add(R.id.compass_error_vertail, this.f, "errortratil").hide(this.f).commitAllowingStateLoss();
        }
    }

    public void a() {
        new a(this).a(getString(R.string.interruptcaliremote)).b(getString(R.string.cancel), new OnClickListener(this) {
            final /* synthetic */ CaliCompassActivity a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).a(getString(R.string.ensure), new OnClickListener(this) {
            final /* synthetic */ CaliCompassActivity a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                if (this.a.c != null) {
                    this.a.l = true;
                    this.a.c.a();
                }
                this.a.finish();
            }
        }).a().show();
    }

    public void a(boolean z) {
        if (!z && this.q.hasMessages(13)) {
            this.q.removeMessages(13);
        }
        this.r = z;
    }

    public void b() {
    }

    public void c() {
        this.j = true;
        this.h.beginTransaction().hide(this.c).show(this.h.findFragmentByTag("begin")).commitAllowingStateLoss();
    }

    public void d() {
        if (this.e != null) {
            this.e.a();
        }
    }

    protected void onCreate(Bundle bundle) {
        getWindow().setFlags(128, 128);
        super.onCreate(bundle);
        setContentView(R.layout.calicompassmain);
        this.i = getIntent().getBooleanExtra(com.fimi.soul.base.a.R, false);
        a(bundle);
        this.dpa.b((Activity) this);
        this.q.sendEmptyMessageDelayed(12, 300);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.r = false;
        if (this.speakTTs != null) {
            this.speakTTs.e();
        }
    }

    public void onDroneEvent(d.a aVar, com.fimi.soul.drone.a aVar2) {
        super.onDroneEvent(aVar, aVar2);
        switch (aVar) {
            case Remotecontrol:
                if (!(aVar2.U() || this.g == null || this.g.isVisible())) {
                    if (this.r) {
                        if (!this.q.hasMessages(13)) {
                            this.q.sendEmptyMessageDelayed(13, NotificationOptions.a);
                            break;
                        }
                    }
                    a(R.string.GC_caliFail_discon_drone, "error", false, false);
                    break;
                }
                break;
        }
        if (!(aVar != d.a.CLEANALLOBJ || this.g == null || this.g.isVisible())) {
            a(R.string.GC_caliFail_discon, "error", false, false);
        }
        if (this.g != null && !this.g.isVisible() && aVar == d.a.CaliCompass) {
            j i = aVar2.i();
            if (this.p && ((i.d() == (byte) 1 || i.d() == (byte) 2) && i.e() == (byte) 1 && i.b() == (byte) 1 && i.c() == (byte) 3)) {
                a(R.string.calierrordata, "error", false, false);
            } else if (this.j && ((i.d() == (byte) 1 || i.d() == (byte) 0) && i.e() == (byte) 1 && i.b() == (byte) 1 && (i.c() == (byte) 1 || i.c() == (byte) 0))) {
                this.j = false;
                this.k = true;
                com.fimi.soul.module.b.d.a(aVar2).a((byte) 1, (byte) 1, (byte) 1);
            } else if (i.c() == (byte) 4) {
                if (this.l) {
                    a(R.string.calierror, "error", false, true);
                } else {
                    a(R.string.calierror, "error", false, false);
                }
            } else if (i.c() == (byte) 5) {
                a(0, "errortratil", false, false);
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || this.g == null || this.g.isVisible() || this.c == null || this.c.isVisible()) {
            return super.onKeyDown(i, keyEvent);
        }
        a();
        return true;
    }
}
