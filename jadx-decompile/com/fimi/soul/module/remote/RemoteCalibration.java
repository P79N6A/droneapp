package com.fimi.soul.module.remote;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.module.b.d;
import com.fimi.soul.view.f.a;

public class RemoteCalibration extends BaseActivity implements b, a {
    private RemoteMidCalibrationFragment a;
    private BaseRemoteFragment b;
    private FragmentManager c;
    private d d;
    private RemoteRollerFragment e;

    public void a() {
        a aVar = new a(this);
        aVar.a(getString(R.string.interruptcaliremote));
        aVar.b(getString(R.string.cancel), new OnClickListener(this) {
            final /* synthetic */ RemoteCalibration a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).a(getString(R.string.ensure), new OnClickListener(this) {
            final /* synthetic */ RemoteCalibration a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                this.a.d.n();
                this.a.d.m();
                this.a.finish();
            }
        }).a().show();
    }

    public void a(int i, int i2) {
        this.c.beginTransaction().hide(this.c.findFragmentById(i)).commitAllowingStateLoss();
        this.c.beginTransaction().show(this.c.findFragmentById(i2)).commitAllowingStateLoss();
    }

    public void a(int i, int i2, String str, boolean z) {
        if (!(this.c.findFragmentById(i) instanceof ErrorCaliBretionFragment)) {
            this.c.beginTransaction().hide(this.c.findFragmentById(i)).commitAllowingStateLoss();
            if (this.c.findFragmentById(i2) != null && (this.c.findFragmentById(i2) instanceof ErrorCaliBretionFragment)) {
                ErrorCaliBretionFragment errorCaliBretionFragment = (ErrorCaliBretionFragment) this.c.findFragmentById(i2);
                errorCaliBretionFragment.a(str, z);
                if (errorCaliBretionFragment.isHidden()) {
                    this.c.beginTransaction().show(errorCaliBretionFragment).commitAllowingStateLoss();
                }
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.remotecalibration);
        getWindow().setFlags(128, 128);
        this.d = d.a(this.drone);
        this.c = getSupportFragmentManager();
        if (bundle == null) {
            this.b = (BaseRemoteFragment) this.c.findFragmentById(R.id.basefragment);
            if (this.b == null) {
                this.b = new BaseRemoteFragment();
                this.c.beginTransaction().add((int) R.id.basefragment, this.b).commit();
            }
            this.e = (RemoteRollerFragment) this.c.findFragmentById(R.id.remote_roller_fragment);
            if (this.e == null) {
                this.e = new RemoteRollerFragment();
            }
            this.c.beginTransaction().add((int) R.id.remote_roller_fragment, this.e).commit();
            Fragment fragment = (RemoteMidcalingFragment) this.c.findFragmentById(R.id.midcalibrationing);
            if (fragment == null) {
                fragment = new RemoteMidcalingFragment();
            }
            this.c.beginTransaction().add((int) R.id.midcalibrationing, fragment).hide(fragment).commit();
            fragment = (RemoteEndCaliFragment) this.c.findFragmentById(R.id.endmidcalibration);
            if (fragment == null) {
                fragment = new RemoteEndCaliFragment();
            }
            this.c.beginTransaction().add((int) R.id.endmidcalibration, fragment).hide(fragment).commit();
            fragment = (CarliRemoteFragment) this.c.findFragmentById(R.id.caliremotestart);
            if (fragment == null) {
                fragment = new CarliRemoteFragment();
            }
            this.c.beginTransaction().add((int) R.id.caliremotestart, fragment).hide(fragment).commit();
            fragment = (WhellRemoteFragment) this.c.findFragmentById(R.id.cariremotecomple);
            if (fragment == null) {
                fragment = new WhellRemoteFragment();
            }
            this.c.beginTransaction().replace(R.id.cariremotecomple, fragment).hide(fragment).commit();
            fragment = (ErrorCaliBretionFragment) this.c.findFragmentById(R.id.errorcalifragment);
            if (fragment == null) {
                fragment = new ErrorCaliBretionFragment();
            }
            this.c.beginTransaction().add((int) R.id.errorcalifragment, fragment).hide(fragment).commit();
        }
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        switch (aVar) {
            case backControl:
                com.fimi.soul.module.calibcompass.a.a().a("98");
                return;
            case CLEANALLOBJ:
                for (Fragment fragment : this.c.getFragments()) {
                    if (fragment.isVisible() && this.e != null && !this.e.isVisible()) {
                        a(fragment.getId(), R.id.errorcalifragment, getString(R.string.calidisconremote), false);
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    public void onHandleMessage(Message message) {
        super.onHandleMessage(message);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.e == null || !this.e.isVisible()) {
            a();
        } else {
            finish();
        }
        return false;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    protected void onStart() {
        super.onStart();
        this.drone.a((b) this);
        this.d.j();
    }
}
