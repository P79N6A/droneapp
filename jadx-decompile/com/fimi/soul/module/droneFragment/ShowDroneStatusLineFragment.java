package com.fimi.soul.module.droneFragment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.fimi.kernel.utils.v;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.j.a;
import com.fimi.soul.biz.j.c;
import com.fimi.soul.biz.j.d;
import com.fimi.soul.biz.j.g;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.entity.ErrorMode;
import com.fimi.soul.media.player.FermiPlayerFullActivity;
import com.fimi.soul.module.calibcompass.CaliCompassActivity;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.module.remote.RemoteCalibration;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.ap;
import com.fimi.soul.utils.x;
import com.fimi.soul.view.AutoScrollTextView;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;

public class ShowDroneStatusLineFragment extends Fragment implements Callback, OnClickListener, d, b {
    public static boolean a = false;
    private Handler A = new Handler(this);
    private com.fimi.soul.module.b.d B;
    private boolean C = false;
    private Timer D;
    private Button E;
    private ImageView F;
    private c G;
    private g H;
    private com.fimi.soul.view.d I;
    private a J;
    private String K;
    private Observer L = new Observer(this) {
        final /* synthetic */ ShowDroneStatusLineFragment a;

        {
            this.a = r1;
        }

        public void update(Observable observable, Object obj) {
            Point point = new Point();
            Display defaultDisplay = this.a.getActivity().getWindow().getWindowManager().getDefaultDisplay();
            defaultDisplay.getSize(point);
            if (this.a.E.isShown() || this.a.q.isShown()) {
                LayoutParams layoutParams = (LayoutParams) this.a.p.getLayoutParams();
                layoutParams.width = defaultDisplay.getWidth() * 0;
                layoutParams.addRule(0, this.a.E.getId());
                layoutParams.setMargins((int) (((double) defaultDisplay.getHeight()) * 0.15d), 0, (int) (((double) defaultDisplay.getHeight()) * 0.15d), 0);
                layoutParams.addRule(1, this.a.r.getId());
                this.a.p.setLayoutParams(layoutParams);
                return;
            }
            layoutParams = (LayoutParams) this.a.p.getLayoutParams();
            layoutParams.width = defaultDisplay.getWidth() * 0;
            layoutParams.addRule(0, this.a.u.getId());
            layoutParams.setMargins((int) (((double) defaultDisplay.getHeight()) * 0.15d), 0, (int) (((double) defaultDisplay.getHeight()) * 0.15d), 0);
            layoutParams.addRule(1, this.a.r.getId());
            this.a.p.setLayoutParams(layoutParams);
        }
    };
    private ErrorMode M;
    private boolean N;
    v b;
    int c = 0;
    int d = 0;
    long e = 0;
    boolean f = false;
    int g = 0;
    int h = 0;
    private DroidPlannerApp i;
    private com.fimi.soul.drone.a j;
    private com.fimi.soul.module.droneui.a k;
    private Context l;
    private TextView m;
    private TextView n;
    private AutoScrollTextView o;
    private LinearLayout p;
    private Button q;
    private ImageView r;
    private ImageView s;
    private ImageView t;
    private ImageView u;
    private ImageView v;
    private ImageView w;
    private final int x = 0;
    private final int y = 1;
    private final int z = 2;

    private void a(int i, int i2, int i3) {
        if (this.k != null && this.k.isShowing()) {
            this.k.dismiss();
            this.k = null;
        }
        this.k = new com.fimi.soul.module.droneui.a(getActivity(), getString(i), getString(i2), i3, 3, false, new com.fimi.soul.module.droneui.a.a(this) {
            final /* synthetic */ ShowDroneStatusLineFragment a;

            {
                this.a = r1;
            }

            public void a() {
                if (this.a.k != null) {
                    this.a.k.dismiss();
                    this.a.k = null;
                }
            }

            public void b() {
            }

            public void c() {
            }

            public void d() {
                if (this.a.k != null) {
                    this.a.k.dismiss();
                    this.a.k = null;
                }
            }
        });
        this.k.setCancelable(true);
        this.k.show();
    }

    @TargetApi(16)
    private void a(q qVar) {
        int i;
        int i2 = 0;
        int i3 = R.drawable.battery_abnormal;
        int i4 = R.string.fault_back_battery_des;
        if (qVar.P()) {
            if (this.j.aj().e() == (byte) 7 || this.j.aj().e() == (byte) 8) {
                i2 = R.string.sky_lowpower_return;
                i4 = R.string.sky_lowpower_return_result;
            } else if (this.j.aj().e() == (byte) 9) {
                i2 = R.string.sky_landing_BAT_LOWPOWER;
                i4 = R.string.des_sky_landing_BAT_LOWPOWER;
            } else {
                i2 = R.string.sky_LOWPOWER;
                i4 = R.string.sky_LOWPOWER_result;
            }
            i3 = R.drawable.low_battery;
            i = i2;
            i2 = R.string.sky_LOWPOWER_title;
        } else if (qVar.g() || (this.j.h() != null && this.j.h().f() == (byte) 3)) {
            i = R.string.sky_no_fly_error;
            i2 = R.string.sky_no_fly_title;
            i4 = R.string.sky_no_fly_result;
            i3 = R.drawable.no_fly_zone;
        } else if (qVar.m()) {
            i = R.string.sky_BATTERY_ERROR;
            i2 = R.string.sky_BATTERY_ERROR_title;
            i4 = R.string.sky_BATTERY_ERROR_result;
        } else if (qVar.f() && !this.j.aj().g().isLightStream()) {
            i2 = R.string.sky_GPS_ERROR_title;
            i4 = R.string.sky_GPS_ERROR_result;
            i = R.string.sky_GPS_ERROR;
            i3 = R.drawable.plane_fall_bg;
        } else if (qVar.F()) {
            i = R.string.sky_bat_damage;
            i2 = R.string.title_bat_damage;
            i4 = R.string.result_bat_damage;
        } else if (qVar.E()) {
            i = R.string.sky_bat_dischage_warning;
            i2 = R.string.title_bat_dischage_warning;
            i4 = R.string.result_bat_dischage_warning;
        } else if (qVar.ae()) {
            i = R.string.shortlife_sky_BATTERY_ERROR;
            i2 = R.string.shortlife_sky__BATTERY_ERROR_title;
            i4 = R.string.shortlife_sky__BATTERY_ERROR_result;
        } else if (this.j.aj().g().isLightStream() && qVar.p()) {
            i2 = R.string.sky_VPS_ERROR_title;
            i4 = R.string.sky_VPS_ERROR_result;
            i = R.string.sky_VPS_ERROR;
            i3 = R.drawable.plane_fall_bg;
        } else if (qVar.O()) {
            i = R.string.sky_LP_RETURN;
            i3 = 0;
        } else if (qVar.N()) {
            i = R.string.sky_BAT_light_LOWPOWER;
            i3 = 0;
        } else if (qVar.T()) {
            i3 = R.drawable.img_warning_rocker;
            i2 = R.string.stick_move_warning_title;
            i4 = R.string.stick_move_warning_result;
            i = R.string.stick_move_warning_des;
        } else {
            this.d = 0;
            return;
        }
        if (!(this.d == i || i3 == 0)) {
            a(i2, i4, i3);
        }
        this.d = i;
    }

    private float b(String str) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        float f = getResources().getDisplayMetrics().density;
        TextPaint textPaint = new TextPaint();
        Rect rect = new Rect();
        textPaint.setTextSize(13.0f);
        textPaint.getTextBounds(str, 0, str.length(), rect);
        return f * ((float) rect.width());
    }

    private void b() {
        this.v.setVisibility(4);
    }

    private void b(int i, int i2) {
        this.q.setVisibility(i2);
        if (!getString(i).equals(this.q.getText().toString())) {
            this.q.setText(i);
        }
        this.q.setEnabled(true);
        this.J.a(true);
    }

    private void c() {
        if (!isAdded()) {
            return;
        }
        if (this.j.U()) {
            this.M = this.H.a(this.j);
            ArrayList lightErrorList = this.M.getLightErrorList();
            if (lightErrorList.size() <= this.c) {
                this.c = 0;
            }
            if (this.j.ac()) {
                if (this.j.ad().S()) {
                    this.h++;
                    if (this.h >= 3) {
                        a(R.string.title_sky_bat_lowpower_dangerous, R.string.des_sky_bat_lowpower_dangerous, R.drawable.plane_fall_bg);
                        com.fimi.kernel.d.b.b(com.fimi.kernel.c.d()).a(com.fimi.kernel.c.d().getString(R.string.sky_bat_lowpower_dangerous));
                        ap.a(com.fimi.kernel.c.d(), 2000);
                        this.h = 0;
                    }
                } else if (this.j.ad().P()) {
                    this.h++;
                    if (this.h >= 4) {
                        int i;
                        int i2;
                        if (this.j.aj().e() == (byte) 7 || this.j.aj().e() == (byte) 8) {
                            i = R.string.sky_lowpower_return;
                            i2 = R.string.sky_lowpower_return_result;
                        } else if (this.j.aj().e() == (byte) 9) {
                            i = R.string.sky_landing_BAT_LOWPOWER;
                            i2 = R.string.des_sky_landing_BAT_LOWPOWER;
                        } else {
                            i = R.string.sky_LOWPOWER;
                            i2 = R.string.sky_LOWPOWER_result;
                        }
                        a(R.string.title_sky_landing_BAT_LOWPOWER, i2, R.drawable.plane_fall_bg);
                        com.fimi.kernel.d.b.b(com.fimi.kernel.c.d()).a(com.fimi.kernel.c.d().getString(i));
                        ap.a(com.fimi.kernel.c.d(), 2000);
                        this.h = 0;
                    }
                }
            }
            if (lightErrorList == null || lightErrorList.size() <= 0) {
                this.o.setVisibility(8);
                this.r.setVisibility(0);
                d("");
                b();
            } else {
                this.o.setVisibility(0);
                this.o.setTextColor(getResources().getColor(R.color.warmtextcl));
                d(getText(((Integer) lightErrorList.get(this.c)).intValue()).toString());
                this.r.setVisibility(4);
            }
            this.c++;
            if ((this.M.isCompassFault() || this.M.isMiddleFault()) && !this.j.ac()) {
                c(true);
                this.E.setText(getString(R.string.platform_correct));
                this.w.setVisibility(4);
                return;
            }
            c(false);
            if (this.M.getSeriousErrorList().size() <= 0 || this.q.getVisibility() == 0) {
                this.w.setVisibility(4);
                return;
            } else {
                this.w.setVisibility(0);
                return;
            }
        }
        com.fimi.kernel.d.b.b(com.fimi.kernel.c.d()).b();
    }

    private void c(int i, int i2) {
        this.q.setVisibility(i2);
        if (!"".equals(this.q.getText().toString())) {
            this.q.setVisibility(8);
        }
        this.q.setEnabled(false);
        this.J.a(false);
    }

    private void c(boolean z) {
        this.E.setVisibility(z ? 0 : 4);
        this.J.a(z);
    }

    private boolean c(String str) {
        if (str == null || !str.contains(":")) {
            return false;
        }
        try {
            Integer.valueOf(str.split(":")[0]).intValue();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void d(int i) {
        if (isAdded()) {
            if (this.o.getVisibility() != 0) {
                this.r.setVisibility(0);
            }
            if (getString(R.string.self_error_result).equals(this.m.getText().toString())) {
                this.r.setImageResource(R.drawable.notnormal_icon);
                this.r.setTag(Integer.valueOf(R.drawable.notnormal_icon));
            } else if (this.r.getTag() == null) {
                this.r.setImageResource(i);
                this.r.setTag(Integer.valueOf(i));
            } else if (i != ((Integer) this.r.getTag()).intValue()) {
                this.r.setImageResource(i);
                this.r.setTag(Integer.valueOf(i));
            }
        }
    }

    private void d(String str) {
        if (str != null && !str.equals(this.o.getText().toString())) {
            if (str.equals("")) {
                this.m.setTextSize(11.0f);
                this.o.setVisibility(8);
                return;
            }
            this.m.setTextSize(9.0f);
            this.o.setVisibility(0);
            this.o.setText(str, BufferType.NORMAL);
            this.o.setAnimation(AnimationUtils.loadAnimation(this.l, R.anim.push_up_in));
        }
    }

    private void e(int i) {
        if (!this.A.hasMessages(0) && !getString(i).equals(this.o.getText())) {
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = Integer.valueOf(i);
            this.A.sendMessageDelayed(obtain, 2500);
        }
    }

    private void f(int i) {
        if (i != 0 && !getString(i).equals(this.m.getText().toString())) {
            this.m.setText(i);
        }
    }

    public int a() {
        return this.g;
    }

    public void a(int i) {
        f(i);
    }

    public void a(int i, int i2) {
        if (i > 0) {
            b(i, i2);
        } else {
            c(i, i2);
        }
    }

    public void a(String str) {
        if (c(str)) {
            if (getActivity() != null) {
                ao.b(getActivity().getAssets(), this.n);
            }
            this.n.setTextSize(1, 16.5f);
            this.n.setPadding(0, 0, 0, 0);
            this.s.setVisibility(0);
        } else {
            if (getActivity() != null) {
                ao.a(getActivity().getAssets(), this.n);
            }
            this.n.setTextSize(1, 13.0f);
            this.n.setTextColor(-1);
            this.n.setPadding(0, (int) ((14.0f * getResources().getDisplayMetrics().density) / com.fimi.soul.view.photodraweeview.c.a), 0, 0);
            this.s.setVisibility(4);
        }
        this.n.setText(str);
    }

    public void a(boolean z) {
        if (z && System.currentTimeMillis() - this.e >= 800) {
            this.e = System.currentTimeMillis();
            if (this.f) {
                this.f = false;
                this.s.setImageDrawable(null);
            } else {
                this.f = true;
                this.s.setImageDrawable(getResources().getDrawable(R.drawable.record_time_red_dot));
            }
            this.n.setAlpha(1.0f);
            this.s.invalidate();
        }
        if (!z) {
            this.s.setImageDrawable(getResources().getDrawable(R.drawable.gray_point));
            this.n.setAlpha(0.3f);
        }
    }

    public void b(int i) {
        d(i);
    }

    public void b(boolean z) {
        this.N = z;
    }

    public void c(int i) {
        if (i > 0) {
            this.g = i;
            a(getString(i));
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            if (this.j.U()) {
                d(getString(((Integer) message.obj).intValue()));
            }
        } else if (message.what == 1) {
            c();
        } else if (message.what == 2) {
            d((int) R.drawable.normal_icon);
            this.m.setText(getString(R.string.self_vps_ok_result));
        }
        return false;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.i = (DroidPlannerApp) activity.getApplication();
        this.j = this.i.a;
        this.l = activity;
    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.fault_bnt:
                this.M = this.H.a(this.j);
                this.I.a(this.M.getSeriousErrorList(), view, (int) getResources().getDimension(R.dimen.popuwindows_xoff), (int) getResources().getDimension(R.dimen.popuwindows_yoff));
                return;
            case R.id.dronemoelbutton:
                if (this.j.T().a() && this.j.U()) {
                    this.B.d();
                    this.j.a(com.fimi.soul.drone.d.a.NOTIDRONEAIR);
                    return;
                }
                this.b.a().edit().putBoolean(com.fimi.soul.base.a.L, true).commit();
                intent = new Intent(this.l, LoginActivity.class);
                intent.putExtra(com.google.firebase.a.a.a.k, false);
                startActivity(intent);
                return;
            case R.id.compass_calibration:
                if (this.M != null && this.M.isMiddleFault()) {
                    startActivity(new Intent(getActivity(), RemoteCalibration.class));
                    return;
                } else if (this.M != null && this.M.isCompassFault()) {
                    intent = new Intent(getActivity(), CaliCompassActivity.class);
                    intent.putExtra(com.fimi.soul.base.a.R, true);
                    startActivity(intent);
                    return;
                } else {
                    return;
                }
            case R.id.camertime:
                if (this.j.W() && !this.N) {
                    startActivity(new Intent(this.l, FermiPlayerFullActivity.class));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.H = g.a();
        this.J = new a();
        this.J.addObserver(this.L);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.showstatusline, null);
        this.m = (TextView) inflate.findViewById(R.id.dronestuts);
        this.m.getPaint().setFakeBoldText(true);
        this.v = (ImageView) inflate.findViewById(R.id.divide_line);
        this.o = (AutoScrollTextView) inflate.findViewById(R.id.dronerrorcode);
        this.p = (LinearLayout) inflate.findViewById(R.id.ll_erroe_hint);
        this.n = (TextView) inflate.findViewById(R.id.camertime);
        this.n.setOnClickListener(this);
        this.q = (Button) inflate.findViewById(R.id.dronemoelbutton);
        this.q.setOnClickListener(this);
        this.E = (Button) inflate.findViewById(R.id.compass_calibration);
        this.E.setOnClickListener(this);
        this.r = (ImageView) inflate.findViewById(R.id.headview);
        this.s = (ImageView) inflate.findViewById(R.id.camericon);
        this.t = (ImageView) inflate.findViewById(R.id.linestart);
        this.u = (ImageView) inflate.findViewById(R.id.lineend);
        this.F = (ImageView) inflate.findViewById(R.id.linecalibration);
        this.w = (ImageView) inflate.findViewById(R.id.fault_bnt);
        this.w.setOnClickListener(this);
        ao.a(getActivity().getAssets(), this.m, this.o, this.q);
        ao.b(getActivity().getAssets(), this.n);
        this.B = com.fimi.soul.module.b.d.a(this.j);
        if (this.j.W()) {
            c((int) R.string.tf_normal);
        } else {
            c((int) R.string.fault_camera);
        }
        this.I = new com.fimi.soul.view.d(getActivity(), (int) getResources().getDimension(R.dimen.popuwindows_w), 400);
        a = true;
        this.o.a(0.0f);
        this.o.setEnabled(false);
        this.o.addTextChangedListener(new TextWatcher(this) {
            final /* synthetic */ ShowDroneStatusLineFragment a;

            {
                this.a = r1;
            }

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!"".equals(charSequence.toString())) {
                    this.a.K = charSequence.toString();
                }
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!"".equals(charSequence.toString()) && !charSequence.toString().equals(this.a.K)) {
                    int measuredWidth = this.a.p.getMeasuredWidth();
                    new Paint().setTextSize(this.a.o.getTextSize());
                    if (this.a.b(charSequence.toString()) <= ((float) (measuredWidth - 20))) {
                        this.a.o.b();
                    } else if (!this.a.o.b) {
                        this.a.o.a();
                    }
                }
            }
        });
        this.D = new Timer();
        this.D.schedule(new TimerTask(this) {
            final /* synthetic */ ShowDroneStatusLineFragment a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.A.sendEmptyMessage(1);
            }
        }, 0, 3000);
        if (!(this.j.U() || this.j.T().a())) {
            b((int) R.string.connect_rn, 0);
            this.m.setText(R.string.connectdefault);
        }
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.J.deleteObserver(this.L);
        this.j.b((b) this);
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        if (aVar2.U() && aVar2.T().a()) {
            this.C = true;
            if (getResources().getColor(R.color.white) != this.m.getCurrentTextColor()) {
                this.m.setTextColor(getResources().getColor(R.color.white));
            }
            switch (aVar) {
                case ERROR_CODE:
                    q ad = aVar2.ad();
                    if (ad.a() < 0 && (aVar2.h() == null || aVar2.h().f() != (byte) 3)) {
                        this.d = 0;
                        this.w.setVisibility(4);
                        return;
                    } else if (aVar2.ac()) {
                        a(ad);
                        return;
                    } else {
                        this.d = 0;
                        return;
                    }
                default:
                    return;
            }
        }
        switch (aVar) {
            case Remotecontrol:
                if (!aVar2.U()) {
                    x.d();
                    this.m.setTextColor(getResources().getColor(R.color.white));
                    d((int) R.drawable.notnormal_icon);
                    this.m.setText(R.string.uncondrone);
                    this.q.setVisibility(8);
                    if (!(this.M == null || this.M.isMiddleFault())) {
                        c(false);
                        break;
                    }
                }
                break;
            case CLEANALLOBJ:
                x.d();
                this.m.setText(R.string.dis_connect_phone);
                d("");
                d((int) R.drawable.notnormal_red_icon);
                this.m.setTextColor(getResources().getColor(R.color.errortextcl));
                this.q.setVisibility(0);
                c(false);
                b((int) R.string.connectagain, 0);
                if (this.C && aVar2.ac()) {
                    this.C = false;
                    com.fimi.kernel.d.b.b(getActivity()).a(getString(R.string.dis_connect_phone));
                    break;
                }
        }
        if (this.M != null && this.M.getLightErrorList().size() == 0) {
            d("");
            b();
            this.o.a(0.0f);
            this.o.b();
        }
        this.w.setVisibility(4);
        this.g = 0;
        this.d = 0;
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        super.onStart();
        this.b = v.a(getActivity());
        if (this.G == null) {
            this.G = new c(this, this.j, getActivity());
        }
        this.j.a((b) this);
        this.G.b();
        this.G.d();
        if (this.j.W() && getString(R.string.fault_camera).equalsIgnoreCase(this.n.getText().toString())) {
            a(getString(R.string.tf_normal));
        }
    }

    public void onStop() {
        super.onStop();
        this.G.c();
    }
}
