package com.fimi.soul.module.droneFragment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.BaseFragment;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11RespCmd.NotificationType;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.g;
import com.fimi.soul.drone.h.i;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.live.NativeAudiolive;
import com.fimi.soul.live.NativeAudiolive.LiveCallBackListener;
import com.fimi.soul.media.player.FermiPlayerUtils;
import com.fimi.soul.module.droneui.DroneMap;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.flyplannermedia.DroneMediaTabActivity;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.UpDownSliding;
import com.google.android.gms.maps.model.LatLng;
import java.util.Timer;
import java.util.TimerTask;

public class ShowDroneUiFragment extends BaseFragment implements OnClickListener, com.fimi.soul.biz.camera.b.e<X11RespCmd>, com.fimi.soul.biz.camera.c.d, com.fimi.soul.drone.d.b {
    private static final int A = 1;
    private static final int B = 2;
    private static final int C = 3;
    private static final int D = 4;
    private static final int E = 5;
    private static final int F = 6;
    private static final int G = 7;
    private static final int H = 8;
    private static final int J = 9;
    private static final int K = 10;
    private static final int L = 11;
    private static final int M = 12;
    private static final int N = 13;
    private static final int O = 15;
    private boolean I = false;
    private com.fimi.soul.drone.h.i.a P;
    private long Q;
    private boolean R = false;
    private boolean S = false;
    private boolean T = false;
    private Timer U;
    private Timer V;
    private Button W;
    private Button X;
    private PercentRelativeLayout Y;
    private boolean Z = false;
    String a = null;
    private boolean aa = false;
    private boolean ab = false;
    private com.fimi.soul.view.f.a ac;
    private com.fimi.soul.view.f.c ad;
    private a ae = a.FIRSTSTATUS;
    private com.fimi.soul.biz.d.a af;
    private e ag = e.Record;
    private d ah;
    private h ai;
    private b aj = b.FIRSTSTATE;
    private com.fimi.kernel.b.b.c ak;
    Handler b = new Handler(this) {
        final /* synthetic */ ShowDroneUiFragment a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                long currentTimeMillis = System.currentTimeMillis() - this.a.Q;
                if (!(this.a.y == null || this.a.getActivity() == null)) {
                    this.a.y.a(true);
                    this.a.y.a(FermiPlayerUtils.getTimelineString(currentTimeMillis));
                }
            } else if (message.what != 2) {
                if (message.what == 7) {
                    if (!this.a.T && this.a.a().b().isShowing()) {
                        this.a.a().c();
                        this.a.b(true);
                    }
                    this.a.b.sendEmptyMessageDelayed(2, 2000);
                } else if (message.what == 3) {
                    this.a.a(true);
                    this.a.b.sendEmptyMessageDelayed(2, 2000);
                } else if (message.what == 8) {
                    this.a.I = true;
                    this.a.d.a(1000, 0);
                    this.a.f.a(1000, 0);
                    this.a.e.a(1000, 0);
                    this.a.c.a(1000, 0);
                    this.a.b.sendEmptyMessageDelayed(9, 3000);
                } else if (message.what == 9) {
                    this.a.d.a();
                    this.a.f.a();
                    this.a.e.a();
                    this.a.c.a();
                } else if (message.what == 10) {
                    this.a.Z = false;
                } else if (message.what == 11) {
                    this.a.aa = false;
                } else if (message.what == 12) {
                    this.a.R = false;
                }
            }
            super.handleMessage(message);
        }
    };
    private SectorProgressBar c;
    private SectorProgressBar d;
    private SectorProgressBar e;
    private SectorProgressBar f;
    private ImageButton g;
    private ImageButton h;
    private ImageButton i;
    private ImageButton j;
    private Context k;
    private com.fimi.soul.drone.a l;
    private DroidPlannerApp m;
    private PercentRelativeLayout n;
    private ImageView o;
    private ImageView p;
    private c q = c.MAP;
    private com.fimi.soul.biz.camera.d r = ((com.fimi.soul.biz.camera.d) com.fimi.soul.biz.camera.b.a().d());
    private UpDownSliding s;
    private com.mi.live.openlivesdk.c t;
    private NativeAudiolive u;
    private boolean v = false;
    private com.fimi.soul.view.UpDownSliding.b w;
    private b x;
    private ShowDroneStatusLineFragment y;
    private ShowDroneStatusFragment z;

    private enum a {
        FIRSTSTATUS,
        SECONDSTATUS
    }

    private enum b {
        FIRSTSTATE,
        SECONDSTATE
    }

    private enum c {
        MAP,
        CAMER
    }

    public interface d {
        void a();
    }

    public enum e {
        Record,
        ContinueCapture,
        TakePhoto,
        Live
    }

    public ShowDroneUiFragment() {
        this.r.c(new com.fimi.kernel.b.c.d(this) {
            final /* synthetic */ ShowDroneUiFragment a;

            {
                this.a = r1;
            }

            public void a(String str) {
                Log.d("Good", str);
            }
        });
    }

    private void a(TextView textView, String str) {
        if (!textView.getText().toString().equals(str)) {
            textView.setText(str);
        }
    }

    private void a(e eVar) {
        if (!this.v) {
            this.ag = eVar;
        }
    }

    private void b(int i) {
        e(false);
        new com.fimi.soul.view.f.c(getActivity()).a(com.fimi.kernel.c.d().getString(R.string.live_stopped) + getString(i)).a(getString(R.string.ensure), new DialogInterface.OnClickListener(this) {
            final /* synthetic */ ShowDroneUiFragment a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).a().show();
    }

    @TargetApi(16)
    private void b(boolean z) {
        if (this.q.equals(c.CAMER)) {
            c(z);
            d(z);
        }
    }

    private void c(int i) {
        int i2 = -1;
        int i3 = 0;
        try {
            this.u.fmLiveStop();
            while (i2 < 0 && i3 < 4) {
                Thread.sleep(2000);
                i2 = this.u.fmLiveStart(com.fimi.soul.biz.camera.e.d(), this.a);
                i3++;
            }
            if (i2 < 0) {
                b(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @TargetApi(16)
    private void c(boolean z) {
        if (this.l.W() && this.y != null && this.y.a() == R.string.fault_camera) {
            a((int) R.string.tf_normal);
        }
        if (this.q.equals(c.CAMER)) {
            this.i.setEnabled(z);
            if (z) {
                this.i.setImageAlpha(255);
                return;
            } else {
                this.i.setImageAlpha(85);
                return;
            }
        }
        this.i.setEnabled(true);
        this.i.setImageAlpha(255);
    }

    @TargetApi(16)
    private void d(boolean z) {
        if (this.q.equals(c.MAP)) {
            this.j.setEnabled(true);
            this.j.setImageAlpha(255);
        } else {
            this.j.setEnabled(z);
            if (z) {
                this.j.setImageAlpha(255);
            } else {
                this.j.setImageAlpha(85);
            }
        }
        this.h.setEnabled(z);
        if (z) {
            this.h.setImageAlpha(255);
        } else {
            this.h.setImageAlpha(85);
        }
    }

    @TargetApi(16)
    private void e(boolean z) {
        boolean z2 = true;
        int i = 0;
        this.v = z;
        if (this.q.equals(c.CAMER)) {
            if (com.fimi.kernel.c.d() != null) {
                this.i.setImageDrawable(com.fimi.kernel.c.d().getResources().getDrawable(!z ? R.drawable.btn_live_play : R.drawable.btn_live_stop));
            }
            this.h.setEnabled(!z);
            this.j.setEnabled(!z);
            if (z) {
                this.j.setImageAlpha(85);
                this.h.setImageAlpha(85);
            } else {
                this.h.setImageAlpha(255);
                this.j.setImageAlpha(255);
            }
        }
        UpDownSliding upDownSliding = this.s;
        if (z) {
            z2 = false;
        }
        upDownSliding.setEnabled(z2);
        if (this.z != null) {
            ShowDroneStatusFragment showDroneStatusFragment = this.z;
            if (!z) {
                i = 8;
            }
            showDroneStatusFragment.a(i);
        }
        if (this.y != null) {
            this.y.b(z);
        }
    }

    private void f() {
        this.q = c.CAMER;
        this.s.setVisibility(0);
        this.i.setImageDrawable(getResources().getDrawable(R.drawable.camer_btn_selector));
        if (this.af != null) {
            this.af.a((int) R.drawable.photo);
        }
        this.g.setImageDrawable(getResources().getDrawable(R.drawable.map));
        i();
        this.x.a(this.r.d());
        ((FlightActivity) getActivity()).d();
        this.x.d();
        this.x.g();
    }

    private void g() {
        if (com.fimi.kernel.c.e().j()) {
            if (this.ac == null) {
                this.ac = new com.fimi.soul.view.f.a(getActivity());
            }
            if (!this.ac.b().isShowing()) {
                this.ac.a(getString(R.string.check_tf_card_must_format)).a(getResources().getColor(R.color.dialog_ensure_hot)).b(getString(R.string.ensure), new DialogInterface.OnClickListener(this) {
                    final /* synthetic */ ShowDroneUiFragment a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        com.fimi.kernel.c.b().a();
                        this.a.r.r().c();
                    }
                }).a(getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                    final /* synthetic */ ShowDroneUiFragment a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        com.fimi.kernel.c.e().c(false);
                    }
                }).a().show();
            }
        }
    }

    private void h() {
        if (com.fimi.kernel.c.e().k()) {
            if (this.ad == null) {
                this.ad = new com.fimi.soul.view.f.c(getActivity());
            }
            if (!this.ad.b().isShowing()) {
                this.ad.a(getString(R.string.tf_card_no_use_please_change)).a(getString(R.string.ensure), new DialogInterface.OnClickListener(this) {
                    final /* synthetic */ ShowDroneUiFragment a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        com.fimi.kernel.c.e().d(false);
                    }
                }).a().show();
            }
        }
    }

    private void i() {
        boolean z = true;
        boolean z2 = this.r.f() == com.fimi.soul.biz.camera.c.a.ContinueCapturing || this.r.f() == com.fimi.soul.biz.camera.c.a.Recoding || this.v;
        if (z2) {
            z = false;
        }
        d(z);
        if (!this.q.equals(c.MAP)) {
            if (this.ag != e.Record) {
                if (this.r.i().isContinueCaptureMode()) {
                    a(e.ContinueCapture);
                }
                if (com.fimi.soul.biz.camera.c.a.Recoding == this.r.f()) {
                    a(e.Record);
                }
            }
            l();
            j();
        }
    }

    private void j() {
        if (!isAdded()) {
            return;
        }
        if (this.v) {
            this.i.setImageDrawable(getResources().getDrawable(R.drawable.btn_live_stop));
            return;
        }
        switch (this.r.f()) {
            case Recoding:
                this.i.setImageDrawable(getResources().getDrawable(R.drawable.recording_on));
                this.s.setEnabled(false);
                return;
            case ContinueCapturing:
                this.i.setImageDrawable(getResources().getDrawable(R.drawable.recording_on));
                this.s.setEnabled(false);
                return;
            case IDLE:
                this.s.setEnabled(true);
                return;
            case Normal:
                this.s.setEnabled(true);
                return;
            default:
                return;
        }
    }

    private void k() {
        try {
            if (this.U != null) {
                this.U.cancel();
                this.U = null;
            }
            if (this.y != null && getActivity() != null) {
                this.y.a(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void l() {
        if (isAdded() && !this.q.equals(c.MAP)) {
            switch (this.ag) {
                case Record:
                    this.s.setState(com.fimi.soul.view.UpDownSliding.b.Record);
                    this.i.setImageDrawable(getResources().getDrawable(R.drawable.video_btn_selector));
                    if (this.z != null) {
                        this.z.a(false);
                        return;
                    }
                    return;
                case ContinueCapture:
                    this.i.setImageDrawable(getResources().getDrawable(R.drawable.video_btn_selector));
                    return;
                case TakePhoto:
                    this.s.setState(com.fimi.soul.view.UpDownSliding.b.TakePhoto);
                    this.i.setImageDrawable(getResources().getDrawable(R.drawable.camer_btn_selector));
                    if (this.z != null) {
                        this.z.a(false);
                        return;
                    }
                    return;
                case Live:
                    this.s.setState(com.fimi.soul.view.UpDownSliding.b.Live);
                    this.i.setImageDrawable(getResources().getDrawable(R.drawable.btn_live_play));
                    if (this.z != null) {
                        this.z.a(true);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void a(int i) {
        if (this.y != null && getActivity() != null) {
            this.y.c(i);
        }
    }

    public void a(long j) {
        this.Q = j;
        if (this.U == null) {
            this.U = new Timer();
            this.U.schedule(new TimerTask(this) {
                final /* synthetic */ ShowDroneUiFragment a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.r.f() == com.fimi.soul.biz.camera.c.a.Recoding) {
                        this.a.b.sendEmptyMessage(1);
                    } else if (this.a.U != null) {
                        this.a.U.cancel();
                        this.a.U = null;
                    } else {
                        this.a.U = null;
                    }
                }
            }, 0, 1000);
        }
    }

    public void a(com.fimi.soul.biz.camera.c.a aVar, com.fimi.soul.biz.camera.c.a aVar2) {
        z.a(getActivity(), "状态变化啦" + aVar + "-->" + aVar2, 1000);
    }

    public void a(ShowDroneStatusLineFragment showDroneStatusLineFragment, ShowDroneStatusFragment showDroneStatusFragment) {
        this.y = showDroneStatusLineFragment;
        this.z = showDroneStatusFragment;
    }

    public void a(boolean z) {
        if (!this.q.equals(c.CAMER)) {
            return;
        }
        if (z) {
            this.x.d();
        } else {
            this.x.e();
        }
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
        if (this.y != null) {
            NotificationType notificationType = x11RespCmd.getNotificationType();
            if (notificationType == NotificationType.CardRemoved) {
                this.r.a(true);
                this.r.b(false);
                this.r.a(com.fimi.soul.biz.camera.c.a.Normal);
            } else if (notificationType == NotificationType.CardInsert) {
                this.r.b(true);
            } else if (notificationType == NotificationType.PhotoFinish) {
                a(true);
            }
            if (!z) {
                switch (x11RespCmd.getRval()) {
                    case -4:
                        this.r.t().b();
                        break;
                }
            }
            switch (x11RespCmd.getMsg_id()) {
                case 3:
                    if (c.CAMER == this.q && isAdded()) {
                        i();
                        return;
                    }
                    return;
                case 4:
                    if (z) {
                        z.a(this.k, getString(R.string.format_success), z.c);
                        this.r.r().c(com.fimi.soul.biz.camera.e.cy);
                        this.r.a(true);
                    } else {
                        z.a(this.k, this.k.getString(R.string.format_fail), z.c);
                    }
                    com.fimi.kernel.c.b().c();
                    return;
                case 257:
                    a(true);
                    this.r.k().getFileList().clear();
                    if (getActivity() != null) {
                        a((int) R.string.tf_normal);
                        return;
                    }
                    return;
                case 260:
                    this.r.r().e();
                    if (this.v) {
                        this.r.r().g();
                    } else {
                        this.r.r().h();
                    }
                    i();
                    return;
                case com.fimi.soul.biz.camera.e.ai /*7829367*/:
                    if (!this.l.U()) {
                        a((int) R.string.fault_camera);
                    }
                    this.r.a(com.fimi.soul.biz.camera.c.a.Normal);
                    a(false);
                    i();
                    return;
                case com.fimi.soul.biz.camera.e.ah /*10066329*/:
                    if (this.l.W() && this.r.f() != com.fimi.soul.biz.camera.c.a.Recoding) {
                        a((int) R.string.tf_normal);
                        a(true);
                    }
                    this.b.sendEmptyMessageDelayed(2, 2000);
                    if (!this.r.d()) {
                        this.r.t().b();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void d() {
        this.u = new NativeAudiolive();
        this.u.setLiveCallBackListener(new LiveCallBackListener(this) {
            final /* synthetic */ ShowDroneUiFragment a;

            {
                this.a = r1;
            }

            public String liveCallResult(int i, int i2) {
                if (i == NativeAudiolive.FM_LIVE_PUSH_OK) {
                    z.a(this.a.getActivity(), (int) R.string.live_connected, 2000);
                } else if (i == NativeAudiolive.FM_LIVE_PUSH_EXIT) {
                    this.a.u.fmLiveStop();
                } else if (this.a.v) {
                    if (i == NativeAudiolive.FM_LIVE_VIDEO_EXIT || i == NativeAudiolive.FM_LIVE_VIDEO_SYS_FAILED || i == NativeAudiolive.FM_LIVE_VIDEO_FORMAT_ERROR || i == NativeAudiolive.FM_LIVE_PUSH_FORMAT_ERROR || i == NativeAudiolive.FM_LIVE_PUSH_NET_BLOCKS) {
                        this.a.c(i2);
                    } else {
                        this.a.b(i2);
                    }
                }
                return null;
            }
        });
        if (this.u.isLivePushing()) {
            e(true);
        }
        this.t = new com.mi.live.openlivesdk.c(com.fimi.soul.base.a.A, com.fimi.soul.base.a.B, 1, new com.mi.live.openlivesdk.a.a(this) {
            final /* synthetic */ ShowDroneUiFragment a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.e(false);
            }

            public void a(int i, String str) {
                switch (i) {
                    case -3:
                        z.a(this.a.getActivity(), (int) R.string.stream_live_version_error, 2000);
                        return;
                    case -2:
                        z.a(this.a.getActivity(), (int) R.string.stream_live_uninstall_error, 2000);
                        return;
                    default:
                        return;
                }
            }

            public void a(String str) {
                this.a.a = str;
                this.a.u.fmLiveStart(com.fimi.soul.biz.camera.e.d(), str);
                this.a.e(true);
            }

            public void b(int i, String str) {
                switch (i) {
                    case -3:
                        z.a(this.a.getActivity(), (int) R.string.stream_live_version_error, 2000);
                        return;
                    case -2:
                        z.a(this.a.getActivity(), (int) R.string.stream_live_uninstall_error, 2000);
                        this.a.e(false);
                        return;
                    default:
                        return;
                }
            }
        }, this.m);
    }

    public void e() {
        if (this.r != null) {
            this.r.m();
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.ak = com.fimi.kernel.b.b.c.a(getActivity());
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.k = activity.getApplicationContext();
        this.m = (DroidPlannerApp) activity.getApplication();
        this.ah = (d) activity;
        this.l = this.m.a;
    }

    @TargetApi(16)
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.view_camera:
                if (this.r.f() == com.fimi.soul.biz.camera.c.a.Recoding) {
                    String str = "";
                    CharSequence videoResolution = this.r.i().getVideoResolution();
                    if (videoResolution != null && !"".equals(videoResolution) && !com.fimi.soul.biz.camera.e.bV.contains(videoResolution) && !com.fimi.soul.biz.camera.e.ce.contains(videoResolution) && !com.fimi.soul.biz.camera.e.bZ.contains(videoResolution)) {
                        if (a().b() == null || !a().b().isShowing()) {
                            a().a();
                            if (a().b() != null) {
                                a().b().setCancelable(false);
                            }
                            this.r.u().k();
                            this.b.sendEmptyMessageDelayed(7, 4000);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case R.id.camerButton:
                if (this.q.equals(c.MAP)) {
                    if ((h.a(getActivity().getApplicationContext()).a().get() == 2 || this.l.aj().e() == (byte) 4) && this.Y.isShown()) {
                        this.Y.setVisibility(8);
                    }
                    f();
                } else {
                    this.q = c.MAP;
                    this.s.setVisibility(8);
                    this.i.setImageDrawable(getResources().getDrawable(R.drawable.navigabutton));
                    if (this.af != null) {
                        this.af.b();
                    }
                    this.g.setImageDrawable(getResources().getDrawable(R.drawable.video));
                    ((FlightActivity) getActivity()).e();
                    this.x.b();
                    this.j.setEnabled(true);
                    this.j.setImageAlpha(255);
                    this.x.e();
                    this.x.h();
                }
                c(this.l.U());
                return;
            case R.id.setttingbutton:
                this.ah.a();
                return;
            case R.id.rightcenterbutton:
                if (!this.q.equals(c.MAP)) {
                    int i = 4000;
                    if (a().b() == null || !a().b().isShowing()) {
                        a().a();
                        if (a().b() != null) {
                            a().b().setCancelable(false);
                        }
                        switch (this.ag) {
                            case Record:
                                if (this.r.f() != com.fimi.soul.biz.camera.c.a.Recoding) {
                                    this.r.u().f();
                                    break;
                                }
                                this.r.u().g();
                                this.b.sendEmptyMessageDelayed(2, 2000);
                                break;
                            case ContinueCapture:
                                if (this.r.f() != com.fimi.soul.biz.camera.c.a.ContinueCapturing) {
                                    Log.d("Good", "开始连拍");
                                    this.r.u().e();
                                    break;
                                }
                                Log.d("Good", "连拍中--》停止连拍");
                                i = 13000;
                                this.S = true;
                                b(false);
                                this.r.u().d();
                                break;
                            case TakePhoto:
                                if (com.fimi.soul.biz.camera.e.ci.equals(this.r.i().getImage_format())) {
                                    i = 10000;
                                }
                                this.r.u().c();
                                break;
                            case Live:
                                if (!this.v) {
                                    if (ao.b(getActivity())) {
                                        if (!com.fimi.soul.biz.a.a.a().c()) {
                                            this.r.r().f();
                                            this.u.fmLiveStop();
                                            this.t.a(getActivity());
                                            break;
                                        }
                                        z.a(getActivity(), (int) R.string.network_disable_live);
                                        this.b.removeMessages(7);
                                        this.b.sendEmptyMessageDelayed(7, (long) 4000);
                                        return;
                                    }
                                    z.a(getActivity(), (int) R.string.network_disable_live);
                                    this.b.removeMessages(7);
                                    this.b.sendEmptyMessageDelayed(7, (long) 4000);
                                    return;
                                }
                                this.t.b(getActivity());
                                break;
                        }
                        this.b.removeMessages(7);
                        this.b.sendEmptyMessageDelayed(7, (long) i);
                        return;
                    }
                    return;
                } else if (this.l.aj().g().judgeOpenDrawLayout()) {
                    this.l.a(com.fimi.soul.drone.d.a.OPENDRAWCONTROL);
                    return;
                } else {
                    return;
                }
            case R.id.locationbutton:
                if (!this.q.equals(c.MAP)) {
                    a(false);
                    Intent intent = new Intent();
                    intent.setClass(getActivity(), DroneMediaTabActivity.class);
                    startActivity(intent);
                    return;
                } else if (this.af != null) {
                    this.af.d();
                    return;
                } else {
                    return;
                }
            case R.id.left_pause_btn:
                com.fimi.soul.module.b.d.a(this.l).d();
                return;
            case R.id.right_pause_btn:
                if (getString(R.string.actionpause).equals(this.X.getText().toString())) {
                    com.fimi.soul.module.b.d.a(this.l).f();
                    return;
                } else {
                    com.fimi.soul.module.b.d.a(this.l).e();
                    return;
                }
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.ai = h.a(getActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.showdroncontral, null);
        this.n = (PercentRelativeLayout) inflate.findViewById(R.id.showui);
        View findViewById = inflate.findViewById(R.id.view_camera);
        this.x = new b(getActivity(), findViewById);
        findViewById.setOnClickListener(this);
        this.o = (ImageView) this.n.findViewById(R.id.leftbg);
        this.p = (ImageView) this.n.findViewById(R.id.rghtbg);
        this.c = (SectorProgressBar) this.n.findViewById(R.id.spb_leftTop);
        this.c.setSectorProgressBarType(com.fimi.soul.module.droneFragment.SectorProgressBar.a.LeftTop);
        this.d = (SectorProgressBar) this.n.findViewById(R.id.spb_leftBottom);
        this.d.setSectorProgressBarType(com.fimi.soul.module.droneFragment.SectorProgressBar.a.LeftBottom);
        this.e = (SectorProgressBar) this.n.findViewById(R.id.spb_rightTop);
        if (ShowDroneStatusFragment.e > 30 || ShowDroneStatusFragment.e == 0) {
            this.e.setSectorProgressBarType(com.fimi.soul.module.droneFragment.SectorProgressBar.a.RightTop);
        } else {
            this.e.setSectorProgressBarType(com.fimi.soul.module.droneFragment.SectorProgressBar.a.RightToplow);
        }
        this.f = (SectorProgressBar) this.n.findViewById(R.id.spb_rightBottom);
        this.f.setSectorProgressBarType(com.fimi.soul.module.droneFragment.SectorProgressBar.a.RightBottom);
        this.Y = (PercentRelativeLayout) this.n.findViewById(R.id.status_action_vg);
        this.W = (Button) this.n.findViewById(R.id.left_pause_btn);
        this.X = (Button) this.n.findViewById(R.id.right_pause_btn);
        ao.a(getActivity().getAssets(), this.W, this.X);
        this.g = (ImageButton) this.n.findViewById(R.id.camerButton);
        this.h = (ImageButton) this.n.findViewById(R.id.setttingbutton);
        this.i = (ImageButton) this.n.findViewById(R.id.rightcenterbutton);
        this.j = (ImageButton) this.n.findViewById(R.id.locationbutton);
        for (View onClickListener : new View[]{this.g, this.h, this.i, this.j, this.W, this.X}) {
            onClickListener.setOnClickListener(this);
        }
        this.s = (UpDownSliding) this.n.findViewById(R.id.up_down_slid);
        if (this.s.getCurrentState() == com.fimi.soul.view.UpDownSliding.b.Record) {
            a(e.Record);
        } else if (this.s.getCurrentState() == com.fimi.soul.view.UpDownSliding.b.TakePhoto) {
            a(e.TakePhoto);
        } else if (this.s.getCurrentState() == com.fimi.soul.view.UpDownSliding.b.Live) {
            a(e.Live);
        }
        this.s.setOnUpDownSliding(new com.fimi.soul.view.UpDownSliding.c(this) {
            final /* synthetic */ ShowDroneUiFragment a;

            {
                this.a = r1;
            }

            public void a(com.fimi.soul.view.UpDownSliding.b bVar) {
                Log.i("ljh", "current mode : " + bVar);
                if (bVar == com.fimi.soul.view.UpDownSliding.b.TakePhoto) {
                    this.a.a(e.TakePhoto);
                } else if (bVar == com.fimi.soul.view.UpDownSliding.b.Live) {
                    this.a.a(e.Live);
                } else if (bVar == com.fimi.soul.view.UpDownSliding.b.Record) {
                    this.a.a(e.Record);
                }
                this.a.i();
                if (this.a.y != null) {
                    this.a.y;
                    if (ShowDroneStatusLineFragment.a && this.a.l.W()) {
                        e d = this.a.ag;
                        this.a.ag;
                        if (d != e.Record) {
                            d = this.a.ag;
                            this.a.ag;
                            if (d == e.ContinueCapture) {
                                this.a.y.a("0张");
                            } else if (this.a.ag != e.TakePhoto || this.a.y.a() != 0) {
                            }
                        } else if (this.a.y.a() == 0) {
                            this.a.y.a(this.a.getString(R.string.tf_normal));
                        }
                    }
                }
            }
        });
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.l.b((com.fimi.soul.drone.d.b) this);
        this.T = true;
        this.c.b();
        this.d.b();
        this.e.b();
        this.f.b();
        this.t.a();
        if (this.U != null) {
            this.U.cancel();
        }
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        if (aVar == com.fimi.soul.drone.d.a.Show9Grid) {
            if (this.x != null && this.q == c.CAMER) {
                this.x.g();
            }
        } else if (aVar == com.fimi.soul.drone.d.a.hide9Grid && this.x != null) {
            this.x.h();
        }
        if (aVar2.U() && aVar2.T().a()) {
            byte a;
            double f;
            switch (aVar) {
                case ENTRYTAKEPHOTOMODEL:
                    f();
                    return;
                case NEWFRONEMODEL:
                    if (aVar2.aj().f() == (byte) 4) {
                        a(this.X, getString(R.string.actionresume));
                    } else if (aVar2.aj().f() == (byte) 2) {
                        a(this.X, getString(R.string.actionpause));
                    }
                    if (aVar2.aj().g().isExceAction()) {
                        if (this.q.equals(c.MAP)) {
                            if (!this.Y.isShown()) {
                                this.Y.setVisibility(0);
                                return;
                            }
                            return;
                        } else if (((this.q.equals(c.CAMER) && h.a(getActivity().getApplicationContext()).a().get() == 2) || aVar2.aj().e() == (byte) 4) && this.Y.isShown()) {
                            this.Y.setVisibility(8);
                            return;
                        } else {
                            return;
                        }
                    } else if (this.Y.isShown()) {
                        this.Y.setVisibility(8);
                        return;
                    } else {
                        return;
                    }
                case SENDHOVERWAYPOINT:
                    com.fimi.soul.module.b.d.a(aVar2).c(147);
                    a = aVar2.J().a();
                    if (a == DroneMap.m) {
                        if (getString(R.string.actionpause).equals(this.X.getText().toString())) {
                            a(this.X, getString(R.string.actionresume));
                            return;
                        }
                        return;
                    } else if (a == DroneMap.n) {
                        a(this.X, getString(R.string.actionpause));
                        return;
                    } else {
                        if (this.Y.isShown()) {
                            this.Y.setVisibility(8);
                        }
                        switch (this.ai.a().get()) {
                            case 1:
                                aVar2.a(com.fimi.soul.drone.d.a.SHOWINFORWINDOW);
                                break;
                            case 2:
                                aVar2.a(com.fimi.soul.drone.d.a.SHOWQUITDOUBLEINFRWINDOW);
                                break;
                            case 3:
                                aVar2.a(com.fimi.soul.drone.d.a.SHOWDOUBLEPOI);
                                break;
                            case 4:
                                aVar2.a(com.fimi.soul.drone.d.a.QUITTAKEPHOTOFLY);
                                break;
                        }
                        this.ai.a(0);
                        a(this.X, getString(R.string.actionpause));
                        return;
                    }
                case HEARDDAY:
                    if (this.af != null && this.af.e()) {
                        if (this.q.equals(c.MAP)) {
                            this.af.b();
                        } else {
                            this.af.a((int) R.drawable.photo);
                        }
                        if (this.af.c() == com.fimi.soul.biz.d.a.a.DRONEPRESS) {
                            ag u = aVar2.u();
                            this.af.a(new LatLng(u.e(), u.d()));
                        }
                    }
                    f = (aVar2.u().f() - 677216.0d) / 10.0d;
                    if (!aVar2.ac()) {
                        f = 0.0d;
                    }
                    if (f < 0.0d) {
                        this.c.setProgress(0.0f);
                    } else if (f >= 100.0d) {
                        this.c.setProgress(100.0f);
                        this.c.a(70.0f);
                    } else {
                        this.c.setProgress((float) (0.7d * f));
                        this.c.a((float) (f * 0.7d));
                    }
                    f = aVar2.u().g();
                    if (!aVar2.ac()) {
                        f = 0.0d;
                    }
                    if (f > 0.0d) {
                        this.d.setProgress(((float) f) > 100.0f ? 100.0f : (float) (0.7d * f));
                        this.d.a((float) (f * 0.7d));
                        return;
                    }
                    this.d.setProgress(0.0f);
                    return;
                case NOTIFYPBATTERY:
                    f = (double) ShowDroneStatusFragment.e;
                    if (0.0d >= f || f >= 30.0d) {
                        this.e.setSectorProgressBarType(com.fimi.soul.module.droneFragment.SectorProgressBar.a.RightTop);
                    } else {
                        this.e.setSectorProgressBarType(com.fimi.soul.module.droneFragment.SectorProgressBar.a.RightToplow);
                    }
                    this.e.setProgress((float) f);
                    this.e.a((float) (f * 0.7d));
                    return;
                case Remotecontrol:
                    c(aVar2.U());
                    if (!aVar2.aj().g().isLightStream()) {
                        a = aVar2.u().c();
                        if (a > (byte) 4) {
                            if (a <= (byte) 8) {
                                this.f.setSectorProgressBarType(com.fimi.soul.module.droneFragment.SectorProgressBar.a.RightBottomSatt);
                            } else {
                                this.f.setSectorProgressBarType(com.fimi.soul.module.droneFragment.SectorProgressBar.a.RightBottom);
                            }
                            if (a <= (byte) 8) {
                                this.f.setProgress(((float) a) * 4.2f);
                                this.f.a(((float) a) * 2.87f);
                                return;
                            } else if (a <= (byte) 8 || a > (byte) 13) {
                                this.f.setProgress((((float) a) * 4.7f) + 5.0f);
                                this.f.a((float) (((double) (((float) a) * 3.29f)) + 3.2d));
                                return;
                            } else {
                                this.f.setProgress((((float) a) * 5.5f) - 11.0f);
                                this.f.a((float) (((double) (((float) a) * 4.6f)) - 13.8d));
                                return;
                            }
                        }
                        return;
                    } else if (this.f.getProgress() != 0.0f) {
                        this.f.setProgress(0.0f);
                        this.f.a(0.0f);
                        return;
                    } else {
                        return;
                    }
                case CONNECTSUCESS:
                    a(aVar2.W());
                    i();
                    return;
                case ERROR_CODE:
                    q ad = aVar2.ad();
                    if (ad.Z() && !ad.u()) {
                        this.x.a(getString(R.string.fault_super_heat));
                        return;
                    } else if (ad.ab() && !ad.u()) {
                        this.x.a(getString(R.string.fault_sevo_stal));
                        return;
                    } else if (ad.ah() && !ad.u()) {
                        this.x.a(getString(R.string.land_GC_PREHEAT));
                        return;
                    } else if (ad.t() && !ad.u()) {
                        this.x.a(getString(R.string.land_GC_UNREADY));
                        return;
                    } else if (ad.Y() && !ad.u()) {
                        this.x.a(getString(R.string.gc_fault));
                        return;
                    } else if (ad.aa() && !ad.u()) {
                        this.x.a(getString(R.string.fault_self_fail));
                        return;
                    } else if (ad.ac() && !ad.u()) {
                        this.x.a(getString(R.string.fault_gc_heat_error));
                        return;
                    } else if (ad.ad() && !ad.u()) {
                        this.x.a(getString(R.string.fault_ahrs));
                        return;
                    } else if (!ad.u() || aVar2.W()) {
                        this.x.a(null);
                        return;
                    } else {
                        this.x.a(getString(R.string.fault_camera));
                        a((int) R.string.fault_camera);
                        return;
                    }
                case OnRecivedCloudCameraCommandInfo:
                    int a2 = aVar2.c.a();
                    if (a2 == 49) {
                        i iVar = (i) aVar2.c;
                        if (!(this.S || iVar.e() == com.fimi.soul.drone.h.i.a.StopQuicklyShot)) {
                            a().c();
                            this.b.removeMessages(7);
                        }
                        if (iVar.e() == com.fimi.soul.drone.h.i.a.StartRecord) {
                            this.r.u().a(com.fimi.soul.biz.camera.e.a.StartRecord);
                            if (this.q.equals(c.CAMER)) {
                                this.i.setImageDrawable(getResources().getDrawable(R.drawable.recording));
                            }
                            this.r.a(com.fimi.soul.biz.camera.c.a.Recoding);
                            if (!this.R) {
                                this.R = true;
                                ao.m(getActivity());
                                this.b.sendEmptyMessageDelayed(12, 2000);
                            }
                            z.a(getActivity(), getString(R.string.record_start), 1500);
                            a(System.currentTimeMillis());
                            aVar2.a(com.fimi.soul.drone.d.a.CAMERARECORD);
                        } else if (iVar.e() == com.fimi.soul.drone.h.i.a.StopRecrod) {
                            this.r.u().a(com.fimi.soul.biz.camera.e.a.StopRecord);
                            if (this.q.equals(c.CAMER)) {
                                this.i.setImageDrawable(getResources().getDrawable(R.drawable.recording));
                            }
                            z.a(getActivity(), getString(R.string.record_end), 1500);
                            if (!this.aa) {
                                this.aa = true;
                                ao.l(getActivity());
                                this.b.sendEmptyMessageDelayed(11, 2000);
                            }
                            this.r.a(com.fimi.soul.biz.camera.c.a.Normal);
                            k();
                        } else if (iVar.e() == com.fimi.soul.drone.h.i.a.NormalShot) {
                            this.r.u().a(com.fimi.soul.biz.camera.e.a.TakePhote);
                            if (this.r.f() == com.fimi.soul.biz.camera.c.a.Recoding) {
                                z.a(getActivity(), getString(R.string.capture_success), 1500);
                            } else {
                                if (this.q.equals(c.CAMER)) {
                                    this.i.setImageDrawable(getResources().getDrawable(R.drawable.recording));
                                }
                                z.a(getActivity(), (int) R.string.take_photo_success, 1500);
                                a((int) R.string.tf_normal);
                                this.r.a(com.fimi.soul.biz.camera.c.a.Normal);
                            }
                            if (!this.Z) {
                                this.Z = true;
                                ao.n(getActivity());
                                this.b.sendEmptyMessageDelayed(10, 1500);
                            }
                            a(e.TakePhoto);
                            this.r.a(true);
                        } else if (iVar.e() == com.fimi.soul.drone.h.i.a.QuicklyShot) {
                            z.a(getActivity(), "开始连拍", 1500);
                            this.b.sendEmptyMessageDelayed(7, 2000);
                            this.r.a(com.fimi.soul.biz.camera.c.a.ContinueCapturing);
                        } else if (iVar.e() == com.fimi.soul.drone.h.i.a.StopQuicklyShot) {
                            z.a(getActivity(), "停止连拍", 3000);
                            this.r.a(com.fimi.soul.biz.camera.c.a.Normal);
                            this.b.sendEmptyMessageDelayed(2, 100);
                        }
                        i();
                        return;
                    } else if (a2 == 50) {
                        g gVar = (g) aVar2.c;
                        if (gVar.f() != com.fimi.soul.drone.h.g.a.NoSDCard) {
                            this.r.b(true);
                        } else {
                            this.r.b(false);
                        }
                        switch (gVar.f()) {
                            case VideoRecording:
                                if (this.r.d()) {
                                    a(e.Record);
                                    this.r.a(com.fimi.soul.biz.camera.c.a.Recoding);
                                    if (gVar.d() != 0) {
                                        a(System.currentTimeMillis() - gVar.d());
                                    }
                                    this.r.a(true);
                                    break;
                                }
                                break;
                            case PhotoShoting:
                                a(e.ContinueCapture);
                                this.r.a(com.fimi.soul.biz.camera.c.a.ContinueCapturing);
                                if (this.y != null) {
                                    this.y.a(gVar.d() + "张");
                                }
                                this.r.a(true);
                                break;
                            case NormalReady:
                                if (this.S) {
                                    a((int) R.string.tf_normal);
                                    a().c();
                                    this.b.sendEmptyMessage(3);
                                    this.S = false;
                                    this.b.removeMessages(7);
                                    b(true);
                                }
                                if (!this.b.hasMessages(7)) {
                                    if (!this.r.d() && aVar2.U()) {
                                        a((int) R.string.tf_normal);
                                    }
                                    if (this.y != null && (this.y.a() == R.string.tf_out_error || this.y.a() == R.string.tf_full_error || this.y.a() == R.string.tf_remove_error || this.y.a() == R.string.tf_io_error)) {
                                        a((int) R.string.tf_normal);
                                    }
                                    k();
                                    this.r.a(com.fimi.soul.biz.camera.c.a.Normal);
                                    break;
                                }
                                return;
                            case NoSDCard:
                                a((int) R.string.tf_remove_error);
                                this.r.a(com.fimi.soul.biz.camera.c.a.Normal);
                                break;
                            case FullSDCard:
                                a((int) R.string.tf_full_error);
                                this.r.a(com.fimi.soul.biz.camera.c.a.Normal);
                                break;
                            case OUTSDCard:
                                a((int) R.string.tf_out_error);
                                this.r.a(com.fimi.soul.biz.camera.c.a.Normal);
                                break;
                            case WIFIINIT:
                                if (!(this.r.d() || !aVar2.U() || com.fimi.soul.biz.e.d.a().m())) {
                                    a((int) R.string.tf_camera_init_wifi);
                                    break;
                                }
                            case CAMERASTART:
                                if (!(this.r.d() || !aVar2.U() || com.fimi.soul.biz.e.d.a().m())) {
                                    a((int) R.string.tf_camera_start);
                                    break;
                                }
                            case Error:
                                a((int) R.string.tf_io_error);
                                this.r.a(com.fimi.soul.biz.camera.c.a.Normal);
                                k();
                                break;
                            case SAVEPHOTO:
                                this.S = true;
                                a((int) R.string.tf_save_photo);
                                break;
                            case LOW_SPEED_CARD:
                            case CardNoPropose:
                            case CardNoProposeAndParamerr:
                            case CardWriteLow:
                            case CardWriteLowAndParamerr:
                                a((int) R.string.tf_low_speed_error);
                                h();
                                break;
                            case CardSetroot:
                                a((int) R.string.tf_io_error);
                                break;
                            case CardFileSysError:
                            case CardParametersError:
                                a((int) R.string.tf_io_error);
                                g();
                                break;
                            case Formating:
                                a((int) R.string.formating);
                                break;
                            case MachineException:
                                a((int) R.string.camera_exception);
                                break;
                        }
                        i();
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
        switch (aVar) {
            case CLEANALLOBJ:
                a(false);
                k();
                break;
        }
        if (!aVar2.T().a()) {
            if (this.d.getProgress() != 0.0f) {
                this.d.setProgress(0.0f);
                this.d.a(0.0f);
            }
            if (this.f.getProgress() != 0.0f) {
                this.f.setProgress(0.0f);
                this.f.a(0.0f);
            }
            if (this.e.getProgress() != 0.0f) {
                this.e.setProgress(0.0f);
                this.e.a(0.0f);
            }
            if (this.c.getProgress() != 0.0f) {
                this.c.setProgress(0.0f);
                this.c.a(0.0f);
            }
        }
        if (!aVar2.W()) {
            a(false);
        }
        if (!(aVar2.U() || this.af == null)) {
            if (this.q.equals(c.MAP)) {
                this.af.b();
            } else {
                this.af.a((int) R.drawable.photo);
            }
        }
        this.r.a(com.fimi.soul.biz.camera.c.a.Normal);
        if (!aVar2.W()) {
            a((int) R.string.fault_camera);
            this.r.k().getFileList().clear();
        }
        e(false);
        i();
        c(false);
        this.x.a(null);
        this.r.a(true);
    }

    public void onResume() {
        super.onResume();
        this.s.b(getActivity());
        boolean k = com.fimi.soul.biz.e.d.a().k();
        if (k != this.ab && k) {
            this.ag = e.TakePhoto;
        }
        this.r.c(true);
        if (!this.I) {
            this.b.sendEmptyMessage(8);
        }
    }

    public void onStart() {
        super.onStart();
        if (this.af == null) {
            this.af = com.fimi.soul.biz.d.a.a();
            this.af.a(this.j, this.l);
        }
        this.aa = false;
        this.Z = false;
        this.l.a((com.fimi.soul.drone.d.b) this);
        this.r.a((com.fimi.soul.biz.camera.c.d) this);
        this.r.a((com.fimi.soul.biz.camera.b.e) this);
        if (!this.r.d() && this.l.W()) {
            this.r.t().b();
        }
        if (this.r.d()) {
            this.r.r().b();
        }
        a(true);
        this.b.sendEmptyMessageDelayed(2, 2000);
        this.ab = com.fimi.soul.biz.e.d.a().k();
    }

    public void onStop() {
        super.onStop();
        a(false);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.x.c();
        d();
    }
}
