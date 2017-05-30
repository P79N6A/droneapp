package com.fimi.soul.module.setting.GimalCalibration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.kernel.view.percent.PercentRelativeLayout.LayoutParams;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.utils.ao;
import it.a.a.e;

public class ResultCalibrationActivity extends BaseActivity implements OnClickListener {
    public static final int a = 0;
    public static final int b = 1;
    public static final String c = "calibration_result";
    public static final String d = "calibration_result_reson";
    private TextView e;
    private Button f;
    private Button g;
    private Button h;
    private Button i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private int m;

    private void a() {
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra(c, 0);
            CharSequence stringExtra = intent.getStringExtra(d);
            LayoutParams layoutParams;
            if (intExtra == 1) {
                this.k.setText(R.string.califail);
                b.b((Context) this).a(getString(R.string.calibration_failure));
                if (stringExtra != null) {
                    this.l.setText(stringExtra);
                }
                layoutParams = (LayoutParams) this.j.getLayoutParams();
                layoutParams.setMargins(0, (int) (((float) this.m) * 0.12592f), 0, 0);
                this.j.setLayoutParams(layoutParams);
                this.j.setImageResource(R.drawable.icon_calibration_defeat);
                c();
                return;
            }
            this.k.setText(getString(R.string.calisucess));
            b.b((Context) this).a(getString(R.string.calisucess));
            if (stringExtra != null) {
                this.l.setText("");
            }
            layoutParams = (LayoutParams) this.j.getLayoutParams();
            layoutParams.setMargins(0, (int) (((float) this.m) * 0.1111f), 0, 0);
            this.j.setLayoutParams(layoutParams);
            this.j.setImageResource(R.drawable.icon_calibration_succeed);
            d();
        }
    }

    private void b() {
        this.j = (ImageView) findViewById(R.id.tagIcon);
        this.e = (TextView) findViewById(R.id.heardView).findViewById(R.id.tv_settingTitle);
        this.e.setText(R.string.gccalisucess);
        this.f = (Button) findViewById(R.id.heardView).findViewById(R.id.black_btn);
        this.f.setOnClickListener(this);
        this.g = (Button) findViewById(R.id.quit);
        this.g.setOnClickListener(this);
        this.h = (Button) findViewById(R.id.again);
        this.h.setOnClickListener(this);
        this.i = (Button) findViewById(R.id.sucesscomplete);
        this.i.setOnClickListener(this);
        this.k = (TextView) findViewById(R.id.destitle);
        this.l = (TextView) findViewById(R.id.calireason);
        a(this.g, 128);
        a(this.h, e.F);
        ao.a(getAssets(), this.e, this.f, this.g, this.h, this.i, this.k, this.l);
    }

    private void c() {
        this.g.setVisibility(0);
        this.h.setVisibility(0);
        this.i.setVisibility(8);
    }

    private void d() {
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(0);
    }

    public void a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.quit:
                finish();
                return;
            case R.id.again:
                startActivity(new Intent(this, GimalCalibrationActivity.class));
                finish();
                return;
            case R.id.sucesscomplete:
                finish();
                return;
            case R.id.black_btn:
                finish();
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        getWindow().setFlags(128, 128);
        super.onCreate(bundle);
        setContentView(R.layout.caliremotesucess);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.m = displayMetrics.heightPixels;
        b();
        a();
    }
}
