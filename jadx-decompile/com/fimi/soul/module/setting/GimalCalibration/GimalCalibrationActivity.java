package com.fimi.soul.module.setting.GimalCalibration;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.module.setting.GimalCalibration.a.a;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.f;
import it.a.a.e;

public class GimalCalibrationActivity extends BaseActivity implements OnClickListener, a, a {
    TextView a;
    TextView b;
    Button c;
    Button d;
    ProgressView e;
    a f;
    private ImageView g;
    private GimalCaliIngFragment h;
    private FragmentManager i;
    private PercentRelativeLayout j;
    private boolean k;

    private void a(TextView textView, int i, Button button, int i2, ImageView imageView, int i3) {
        imageView.setImageResource(i3);
        if (!textView.getText().toString().equals(getString(i))) {
            textView.setText(i);
        }
        button.setEnabled(false);
        a(button, i2);
    }

    private void e() {
        this.g = (ImageView) findViewById(R.id.img_calibration_plane);
        this.a = (TextView) findViewById(R.id.tv_tips);
        this.c = (Button) findViewById(R.id.btn_start_calibration);
        this.c.setOnClickListener(this);
        this.c.setEnabled(false);
        this.b = (TextView) findViewById(R.id.heardView).findViewById(R.id.tv_settingTitle);
        this.b.setText(R.string.gimbal_calibration);
        this.d = (Button) findViewById(R.id.heardView).findViewById(R.id.black_btn);
        this.d.setOnClickListener(this);
        this.e = (ProgressView) findViewById(R.id.pro_calibration);
        this.e.setMaxCount((float) a.a);
        ao.a(getAssets(), this.a, this.c, this.b);
        this.f = new a(this, this.drone);
        f();
    }

    @TargetApi(23)
    private void f() {
        if (!this.drone.T().a()) {
            a(this.a, R.string.calidisconremote, this.c, 75, this.g, R.drawable.gimbal_calibration_plane);
        } else if (!this.drone.U()) {
            a(this.a, R.string.calisiacondrone, this.c, 75, this.g, R.drawable.gimbal_calibration_plane);
        } else if (this.drone.U() && this.drone.ac()) {
            a(this.a, R.string.caligcremider, this.c, 75, this.g, R.drawable.gimbal_calibration_plane);
        } else if (this.drone.ad().aj()) {
            a(this.a, R.string.calicompasscoming, this.c, 75, this.g, R.drawable.gimbal_calibration_plane);
        } else if (this.drone.ad().u()) {
            a(this.a, R.string.discongc, this.c, 75, this.g, R.drawable.img_no_pan_tilt_calibration_plane);
        } else if (this.drone.ad().Z()) {
            a(this.a, R.string.gcpreheat, this.c, 75, this.g, R.drawable.gimbal_calibration_plane);
        } else if (this.drone.ad().t()) {
            a(this.a, R.string.gcunready, this.c, 75, this.g, R.drawable.gimbal_calibration_plane);
        } else if (this.drone.ad().M()) {
            a(this.a, R.string.compasscgerror, this.c, 75, this.g, R.drawable.img_pan_tilt_calibration_jiggly);
        } else {
            if (!this.c.isEnabled()) {
                b.b((Context) this).a(getResources().getString(R.string.reminder_calibration_canStart));
            }
            this.a.setText(getString(R.string.gc_calbration_tips));
            this.c.setEnabled(true);
            a(this.c, e.F);
            this.g.setImageResource(R.drawable.imh_pan_tilt_calibration_plane);
        }
    }

    private SpannableString g() {
        Object string = getString(R.string.gc_calbration_tips);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.gc_calibration_tips)), 0, 11, 33);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.white)), 11, 15, 33);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.gc_calibration_tips)), 16, string.length(), 33);
        return spannableString;
    }

    public void a() {
        if (this.h != null && this.h.isVisible()) {
            f.a aVar = new f.a(this);
            aVar.a(getString(R.string.interruptcaliremote));
            aVar.b(getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                final /* synthetic */ GimalCalibrationActivity a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).a(getString(R.string.ensure), new DialogInterface.OnClickListener(this) {
                final /* synthetic */ GimalCalibrationActivity a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    this.a.f.d();
                    this.a.finish();
                }
            }).a().show();
        }
    }

    public void a(int i) {
        if (this.h != null) {
            this.h.a(i);
        }
        if (!this.k) {
            this.k = true;
            b.b((Context) this).a(getString(R.string.GC_calibrationing));
        }
    }

    public void a(TextView textView, int i) {
        textView.setTextColor(textView.getTextColors().withAlpha(i));
    }

    public void a(Class cls, int i, String str) {
        Intent intent = new Intent(this, cls);
        intent.putExtra(ResultCalibrationActivity.c, i);
        intent.putExtra(ResultCalibrationActivity.d, str);
        startActivity(intent);
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    public void a(String str) {
        a(ResultCalibrationActivity.class, 1, str);
    }

    public void b() {
        if (this.h != null && !this.h.isVisible()) {
            this.i.beginTransaction().show(this.h).commitAllowingStateLoss();
            this.j.setVisibility(8);
        }
    }

    public void b(int i) {
        a(this.a, i, this.c, 75, this.g, R.drawable.gimbal_calibration_plane);
    }

    public void c() {
        a(ResultCalibrationActivity.class, 0, getString(R.string.GC_caliSucess));
    }

    public void d() {
        f();
    }

    public void onClick(View view) {
        if (view == this.c) {
            this.f.a();
        }
        if (view == this.d) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        getWindow().setFlags(128, 128);
        super.onCreate(bundle);
        setContentView(R.layout.activity_gc_calibration);
        this.j = (PercentRelativeLayout) findViewById(R.id.activity_PL);
        this.i = getSupportFragmentManager();
        this.h = (GimalCaliIngFragment) this.i.findFragmentById(R.id.caligamble);
        if (this.h == null) {
            this.h = new GimalCaliIngFragment();
        }
        if (this.h.isAdded()) {
            this.i.beginTransaction().hide(this.h).commitAllowingStateLoss();
        } else {
            this.i.beginTransaction().add((int) R.id.caligamble, this.h).hide(this.h).commitAllowingStateLoss();
        }
        e();
        this.k = false;
    }

    protected void onDestroy() {
        super.onDestroy();
        this.f.g();
        this.f.f();
        if (this.f != null) {
            this.f = null;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || this.h == null || !this.h.isVisible()) {
            return super.onKeyDown(i, keyEvent);
        }
        a();
        return true;
    }

    protected void onStart() {
        super.onStart();
        this.f.e();
    }

    protected void onStop() {
        super.onStop();
    }
}
