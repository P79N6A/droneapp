package com.fimi.soul.module.droneui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.o;
import com.fimi.soul.drone.c.a.a.bf;
import com.fimi.soul.drone.c.a.a.m;
import com.fimi.soul.drone.h.ba;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.media.player.FimiMediaPlayer;
import com.fimi.soul.module.droneFragment.DroneTakePhotoFragment;
import com.fimi.soul.module.droneFragment.FlyActionSettingFragment;
import com.fimi.soul.module.droneFragment.ShowDroneStatusFragment;
import com.fimi.soul.module.droneFragment.ShowDroneStatusLineFragment;
import com.fimi.soul.module.droneFragment.ShowDroneUiFragment;
import com.fimi.soul.module.droneFragment.ShowDroneUiFragment.d;
import com.fimi.soul.module.dronemanage.FlightMapFragment;
import com.fimi.soul.module.insurance.ReceiveInsuranceActivity;
import com.fimi.soul.module.login.FirstLeadFragment;
import com.fimi.soul.module.push.MessageDetailActivity;
import com.fimi.soul.module.setting.MapSettingFragment;
import com.fimi.soul.module.social.WebViewActivity;
import com.fimi.soul.service.CheckCampassCaliService;
import com.fimi.soul.service.RequestVersionService;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.g;
import com.fimi.soul.view.MapWrapperLayout;
import com.fimi.soul.view.f;
import com.google.android.gms.drive.e;
import com.google.android.gms.maps.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class FlightActivity extends BaseActivity implements com.fimi.soul.drone.d.b, d, com.fimi.soul.module.droneFragment.d, com.fimi.soul.module.dronemanage.FlightMapFragment.a, com.fimi.soul.module.login.FirstLeadFragment.a, com.fimi.soul.module.setting.MapSettingFragment.a {
    private static final int m = 1;
    private static final int u = 123;
    private static final int z = 15;
    View a;
    public b b = b.EarthMap;
    Timer c = null;
    a d;
    private FragmentManager e;
    private FlightMapFragment f;
    private FirstLeadFragment g;
    private ShowDroneUiFragment h;
    private ShowDroneStatusFragment i;
    private ShowDroneStatusLineFragment j;
    private DroneTakePhotoFragment k;
    private MapSettingFragment l;
    private boolean n = true;
    private ProgressBar o;
    private Handler p = new Handler(this) {
        final /* synthetic */ FlightActivity a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1 && this.a.n) {
                if (h.a(this.a.getApplicationContext()).a().get() != 4) {
                    z.a(this.a, (int) R.string.updataerror, 3000);
                } else if (((com.fimi.soul.biz.camera.d) com.fimi.soul.biz.camera.b.a().d()).f() != com.fimi.soul.biz.camera.c.a.Recoding) {
                    z.a(this.a, (int) R.string.open_record_error, 3000);
                } else {
                    z.a(this.a, (int) R.string.updateLoadtakephotoerror, 3000);
                }
                this.a.o.setVisibility(8);
            } else if (message.what == 123) {
                if (this.a.v > 0) {
                    sendEmptyMessageDelayed(123, 1000);
                    this.a.t.setText(this.a.v + "");
                    this.a.t.setVisibility(0);
                    this.a.v = this.a.v - 1;
                    return;
                }
                this.a.t.setVisibility(8);
                this.a.drone.a(com.fimi.soul.drone.d.a.CHANGETAKEPHOTOMARKERCOLOR);
            } else if (message.what == 15 && this.a.drone.W() && this.a.drone.U()) {
                this.a.h.a(true);
            }
        }
    };
    private RelativeLayout q;
    private DrawerLayout r;
    private FlyActionSettingFragment s;
    private TextView t;
    private int v = 5;
    private v w;
    private boolean x;
    private Toast y;

    class a extends BroadcastReceiver {
        final /* synthetic */ FlightActivity a;

        a(FlightActivity flightActivity) {
            this.a = flightActivity;
        }

        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("rtsp", -1);
            if (intExtra == 0 && this.a.c != null) {
                this.a.c.cancel();
                this.a.c = null;
            } else if (intExtra == 1) {
                if (this.a.c == null) {
                    this.a.c = new Timer();
                }
                this.a.c.schedule(new TimerTask(this) {
                    final /* synthetic */ a a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.a.p.sendEmptyMessageDelayed(15, 3000);
                    }
                }, 1000, 5000);
            }
        }
    }

    public enum b {
        EarthMap,
        Camera
    }

    private void a(int i) {
        if (!this.o.isShown()) {
            this.o.setVisibility(0);
            if (this.p.hasMessages(1)) {
                this.p.removeMessages(1);
            }
            this.n = true;
            if (com.fimi.soul.biz.c.d.k().f().size() < 1) {
                this.p.sendEmptyMessageDelayed(1, (long) i);
            } else {
                this.p.sendEmptyMessageDelayed(1, (long) (com.fimi.soul.biz.c.d.k().f().size() * 2000));
            }
        }
    }

    private void l() {
        File file = new File(ao.o(this));
        if (!file.exists()) {
            try {
                file.createNewFile();
                InputStream open = getAssets().open("NoFlyZone-V1.0.0-DB.sqlite");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = open.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        open.close();
                        return;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void m() {
    }

    private void n() {
        if (!this.q.isShown()) {
            this.q.setVisibility(0);
            this.e.beginTransaction().hide(this.s).commitAllowingStateLoss();
            if (this.k.isVisible()) {
                this.e.beginTransaction().hide(this.k).commitAllowingStateLoss();
            }
            this.drone.a(com.fimi.soul.drone.d.a.HIDEDISPLAYCIRCLE);
        }
    }

    private void o() {
        if (this.x) {
            this.y.cancel();
            finish();
            Process.killProcess(Process.myPid());
            this.h.e();
            return;
        }
        this.x = true;
        this.y = Toast.makeText(getApplicationContext(), R.string.again_exit, 0);
        this.y.show();
        getHandler().sendEmptyMessageDelayed(0, 2000);
    }

    private void p() {
        com.fimi.soul.biz.manager.h.a((Context) this).a(new k(this) {
            final /* synthetic */ FlightActivity a;

            {
                this.a = r1;
            }

            public void a(PlaneMsg planeMsg, File file) {
                if (planeMsg.isSuccess()) {
                    final HistoryPushMessage historyPushMessage = (HistoryPushMessage) planeMsg.getData();
                    historyPushMessage.setTime(new SimpleDateFormat("yyyy.MM.dd").format(new Date()));
                    com.fimi.soul.utils.a.b a = com.fimi.soul.utils.a.b.a(this.a);
                    if (!a.b(historyPushMessage)) {
                        a.a(historyPushMessage);
                        new com.fimi.soul.view.f.a(this.a).a(historyPushMessage.getTitle()).b(historyPushMessage.getPayload()).a(this.a.getResources().getColor(R.color.dialog_right_btn)).b(this.a.getString(R.string.ensure), new OnClickListener(this) {
                            final /* synthetic */ AnonymousClass5 b;

                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(this.b.a, MessageDetailActivity.class);
                                intent.setFlags(e.a_);
                                intent.putExtra("redirectURL", historyPushMessage.getRedirectURL());
                                this.b.a.startActivity(intent);
                            }
                        }).d(17).a(this.a.getString(R.string.dialog_close), new OnClickListener(this) {
                            final /* synthetic */ AnonymousClass5 a;

                            {
                                this.a = r1;
                            }

                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).a().show();
                    }
                }
            }
        });
    }

    public void a() {
        if (this.l != null) {
            this.l.a();
            this.e.beginTransaction().show(this.l).commit();
        }
    }

    public void a(b bVar) {
        this.b = bVar;
    }

    public void a(c cVar) {
        MapWrapperLayout mapWrapperLayout = (MapWrapperLayout) findViewById(R.id.map_relative_layout);
        mapWrapperLayout.a(cVar, g.a(this, 28.0f));
        this.drone.a(mapWrapperLayout);
    }

    public void a(List<ba> list) {
    }

    public b b() {
        return this.b;
    }

    public void c() {
        if (this.l != null) {
            this.e.beginTransaction().hide(this.l).commit();
            if (this.h != null) {
                this.h.onStart();
            }
        }
        if (this.f != null) {
            this.f.b();
        }
        com.fimi.soul.biz.j.g.b().clear();
    }

    public void d() {
        this.e.beginTransaction().hide(this.f).commitAllowingStateLoss();
        this.e.executePendingTransactions();
    }

    public void e() {
        this.e.beginTransaction().show(this.f).commitAllowingStateLoss();
    }

    public void f() {
        this.a.setVisibility(4);
    }

    public void g() {
        this.a.setVisibility(0);
    }

    public void h() {
        if (com.fimi.kernel.c.e().d()) {
            findViewById(R.id.bottom_state_rl).setVisibility(0);
        } else {
            findViewById(R.id.bottom_state_rl).setVisibility(4);
        }
    }

    public void i() {
        try {
            int o = com.fimi.kernel.c.e().o();
            if (o < 3) {
                com.fimi.kernel.c.e().c(o + 1);
                f.d dVar = new f.d(this);
                CharSequence spannableStringBuilder = new SpannableStringBuilder(getString(R.string.dialog_emergency_stop_puple_content));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.setting_dialog_force_attitude)), 13, 29, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.setting_dialog_force_attitude)), 34, 49, 33);
                dVar.a(getString(R.string.dialog_emergency_stop_puple)).b(getResources().getColor(R.color.emergencystoppulp)).b(spannableStringBuilder).a(false).b(true).a((int) R.drawable.img_rc_btn).a(getString(R.string.ensure), new OnClickListener(this) {
                    final /* synthetic */ FlightActivity a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).a().show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void j() {
        if (ao.b((Context) this)) {
            final v vVar = new v(this);
            final int e = vVar.e("insurance_ret");
            if (e != -2 && e != 100) {
                com.fimi.soul.view.c.c cVar = new com.fimi.soul.view.c.c(this);
                cVar.b(getString(R.string.insurance_content));
                cVar.a(getString(R.string.insurance_title));
                cVar.a(getString(R.string.insurance_confirm), new OnClickListener(this) {
                    final /* synthetic */ FlightActivity c;

                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (ao.b(this.c)) {
                            vVar.a("insurance_ret", e + 1);
                            Intent intent = new Intent(this.c, WebViewActivity.class);
                            intent.putExtra("url", ReceiveInsuranceActivity.a);
                            intent.putExtra("title", this.c.getString(R.string.xiaomi_insurance));
                            this.c.startActivity(intent);
                        } else {
                            z.a(this.c, (int) R.string.login_result_net, 1000);
                        }
                        dialogInterface.dismiss();
                    }
                }).b(getString(R.string.cancel), new OnClickListener(this) {
                    final /* synthetic */ FlightActivity c;

                    public void onClick(DialogInterface dialogInterface, int i) {
                        vVar.a("insurance_ret", e - 1);
                        dialogInterface.dismiss();
                    }
                }).a().show();
            }
        }
    }

    public void k() {
        this.e.beginTransaction().remove(this.g).commit();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = com.fimi.soul.base.a.L;
        if (this.w.a().getBoolean(str, false)) {
            this.w.a().edit().putBoolean(str, true).commit();
            str = com.fimi.soul.base.a.J;
            if (!(!this.w.a().getBoolean(str, false) || this.l == null || this.l.isHidden())) {
                this.e.beginTransaction().hide(this.l).commit();
            }
            this.w.a().edit().putBoolean(str, false).commit();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
        this.dpa.d();
        FimiMediaPlayer.loadLibrariesOnce(null);
        FimiMediaPlayer.native_profileBegin("libfmplayer.so");
        this.a = findViewById(R.id.showStatus);
        setContentView(R.layout.activity_main);
        this.w = v.a((Context) this);
        this.t = (TextView) findViewById(R.id.reciprocal_value);
        this.g = new FirstLeadFragment();
        this.g.a((com.fimi.soul.module.login.FirstLeadFragment.a) this);
        this.o = (ProgressBar) findViewById(R.id.progrebar);
        this.q = (RelativeLayout) findViewById(R.id.normal_rla);
        this.r = (DrawerLayout) findViewById(R.id.drawerview);
        this.r.setDrawerLockMode(1);
        this.r.setFocusableInTouchMode(false);
        if (o.a((Context) this).b()) {
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            audioManager.setStreamVolume(3, audioManager.getStreamMaxVolume(3), 0);
        }
        this.e = getSupportFragmentManager();
        this.k = (DroneTakePhotoFragment) this.e.findFragmentById(R.id.takephoto);
        if (this.k == null) {
            this.k = new DroneTakePhotoFragment();
            this.e.beginTransaction().add(R.id.takephoto, this.k, "takephoto").hide(this.k).commitAllowingStateLoss();
        } else {
            this.e.beginTransaction().hide(this.k).commit();
        }
        this.s = (FlyActionSettingFragment) this.e.findFragmentById(R.id.flyaction);
        if (this.s == null) {
            this.s = new FlyActionSettingFragment();
            this.e.beginTransaction().add(R.id.flyaction, this.s, com.google.android.gms.fitness.data.a.h).hide(this.s).commit();
        } else {
            this.e.beginTransaction().hide(this.s).commit();
        }
        this.f = (FlightMapFragment) this.e.findFragmentById(R.id.mapFragment);
        if (this.f == null) {
            this.f = new FlightMapFragment();
            this.e.beginTransaction().add((int) R.id.mapFragment, this.f).commit();
        }
        this.j = (ShowDroneStatusLineFragment) this.e.findFragmentById(R.id.showBasedata);
        if (this.j == null) {
            this.j = new ShowDroneStatusLineFragment();
            this.e.beginTransaction().add((int) R.id.showBasedata, this.j).commit();
        }
        this.i = (ShowDroneStatusFragment) this.e.findFragmentById(R.id.showStatus);
        if (this.i == null) {
            this.i = new ShowDroneStatusFragment();
            this.e.beginTransaction().add((int) R.id.showStatus, this.i).commit();
        }
        this.h = (ShowDroneUiFragment) this.e.findFragmentById(R.id.handleWapoint);
        if (this.h == null) {
            this.h = new ShowDroneUiFragment();
            this.h.a(this.j, this.i);
            this.e.beginTransaction().add((int) R.id.handleWapoint, this.h).commit();
        }
        this.l = (MapSettingFragment) this.e.findFragmentById(R.id.activity_general_setting);
        if (this.l == null) {
            this.l = new MapSettingFragment();
            this.e.beginTransaction().add((int) R.id.activity_general_setting, this.l).hide(this.l).commit();
        }
        l();
        startService(new Intent(this, CheckCampassCaliService.class));
        if (this.w.a().getInt("curModel", 1) == 1) {
            this.e.beginTransaction().add((int) R.id.lead_layout, this.g).commit();
        }
        new com.fimi.soul.biz.f.a(this).a();
        if (com.fimi.soul.module.update.a.a.a().a(0).b() <= 0) {
            startService(new Intent(this, RequestVersionService.class));
        }
        i();
        p();
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.h != null) {
            this.h.a(false);
        }
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        switch (aVar) {
            case QUITTAKEPHOTOFLY:
                if (this.p.hasMessages(123)) {
                    this.p.removeMessages(123);
                }
                if (this.p.hasMessages(1)) {
                    this.p.removeMessages(1);
                }
                this.t.setVisibility(8);
                this.o.setVisibility(8);
                this.n = false;
                return;
            case ENTRYTAKEPHOTOMODEL:
                if (aVar2.ap().j() == (byte) 18) {
                    if (!this.p.hasMessages(123)) {
                        this.v = 5;
                    }
                    this.p.sendEmptyMessage(123);
                }
                if (this.p.hasMessages(1)) {
                    this.p.removeMessages(1);
                }
                this.o.setVisibility(8);
                this.n = false;
                return;
            case TAKEPHOTOBACKDATA:
                if (!this.q.isShown()) {
                    this.q.setVisibility(0);
                }
                if (this.k.isVisible()) {
                    this.e.beginTransaction().hide(this.k).commitAllowingStateLoss();
                    return;
                }
                return;
            case CLOSEOUTTIMEPROBAR:
                if (this.p.hasMessages(1)) {
                    this.p.removeMessages(1);
                }
                this.o.setVisibility(8);
                this.n = false;
                return;
            case SHOWOUTTIMEPROBAR:
                a(5000);
                return;
            case HEARDATA:
                if (aVar2.aj().g().isExceAction() && !this.q.isShown()) {
                    this.q.setVisibility(0);
                    this.e.beginTransaction().hide(this.s).commitAllowingStateLoss();
                    aVar2.a(com.fimi.soul.drone.d.a.HIDEDISPLAYCIRCLE);
                    return;
                }
                return;
            case CANCALFLYACTION:
                this.q.setVisibility(0);
                this.e.beginTransaction().hide(this.s).commitAllowingStateLoss();
                this.e.beginTransaction().hide(this.k).commitAllowingStateLoss();
                this.s.setUserVisibleHint(true);
                aVar2.a(com.fimi.soul.drone.d.a.HIDEDISPLAYCIRCLE);
                return;
            case SHOWCAMPASSCALI:
                if (aVar2.U() && !aVar2.ac()) {
                    return;
                }
                return;
            case CLOSEDRAWCONTROL:
                h a = h.a(getApplicationContext());
                if (!aVar2.ac() || a.a().get() == 0) {
                    this.q.setVisibility(0);
                    this.e.beginTransaction().hide(this.s).commitAllowingStateLoss();
                    this.e.beginTransaction().hide(this.k).commitAllowingStateLoss();
                } else if (aVar2.aj().g().judgeNoAction()) {
                    this.q.setVisibility(4);
                    if (a.a().get() == 4) {
                        this.e.beginTransaction().show(this.k).commitAllowingStateLoss();
                    } else {
                        this.e.beginTransaction().show(this.s).commitAllowingStateLoss();
                    }
                }
                this.r.closeDrawer((int) GravityCompat.END);
                return;
            case OPENDRAWCONTROL:
                this.r.openDrawer((int) GravityCompat.END);
                return;
            case ChangeCameraOrMap:
                if (this.b != b.Camera) {
                    d();
                    break;
                } else {
                    e();
                    break;
                }
            case CLOSEFLYACTIONFRAGMENT:
                break;
            case DRONEINFLOOR:
                n();
                return;
            case SHOWTAKEPHOTOFRAGMENT:
                n();
                return;
            case CLEANALLOBJ:
                n();
                return;
            default:
                return;
        }
        if (!this.q.isShown()) {
            this.q.setVisibility(0);
        }
        if (this.s.isVisible()) {
            this.e.beginTransaction().hide(this.s).commitAllowingStateLoss();
        }
        if (this.k.isVisible()) {
            this.e.beginTransaction().hide(this.k).commitAllowingStateLoss();
        }
    }

    public void onHandleMessage(Message message) {
        super.onHandleMessage(message);
        this.x = false;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.r.isDrawerOpen((int) GravityCompat.END)) {
            this.r.closeDrawer((int) GravityCompat.END);
            return true;
        } else if (this.s != null && this.s.b()) {
            return true;
        } else {
            if (this.k != null && this.k.a()) {
                return true;
            }
            if (this.s != null && !this.s.isHidden()) {
                this.s.a();
                if (!this.q.isShown()) {
                    this.q.setVisibility(0);
                }
                if (!this.s.isVisible()) {
                    return true;
                }
                this.e.beginTransaction().hide(this.s).commitAllowingStateLoss();
                return true;
            } else if (this.k != null && !this.k.isHidden()) {
                if (!this.q.isShown()) {
                    this.q.setVisibility(0);
                }
                if (!this.k.isVisible()) {
                    return true;
                }
                this.e.beginTransaction().hide(this.k).commitAllowingStateLoss();
                return true;
            } else if (this.l == null || this.l.isHidden()) {
                o();
                return false;
            } else {
                if (this.l.c()) {
                    this.e.beginTransaction().hide(this.l).commit();
                }
                return false;
            }
        }
    }

    protected void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (this.l == null) {
            this.l = new MapSettingFragment();
            this.e.beginTransaction().add((int) R.id.activity_general_setting, this.l).hide(this.l).commit();
        }
        if (this.h != null) {
            this.h.a(this.drone.W());
        }
        com.fimi.soul.biz.j.g.b().clear();
    }

    protected void onStart() {
        super.onStart();
        if (this.drone.T().a() && this.drone.U()) {
            bf bfVar = new bf();
            bfVar.d = m.b;
            bfVar.e = (byte) 1;
            bfVar.f = (byte) 0;
            this.drone.T().a(bfVar.a());
        }
        this.d = new a(this);
        registerReceiver(this.d, new IntentFilter("resetRTSP"));
    }

    protected void onStop() {
        super.onStop();
        FimiMediaPlayer.native_profileEnd();
        unregisterReceiver(this.d);
        com.fimi.kernel.d.b.b(getApplicationContext()).a(false);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m();
    }
}
