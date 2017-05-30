package com.fimi.soul.module.setting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.manager.k;
import com.fimi.soul.biz.manager.o;
import com.fimi.soul.biz.manager.x;
import com.fimi.soul.biz.modifyRealyWiFiConfigure.ModifyRelayWiFi;
import com.fimi.soul.drone.c.a.a.bf;
import com.fimi.soul.drone.c.a.a.m;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.Setting;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.calibcompass.CaliCompassActivity;
import com.fimi.soul.module.droneui.BatteryInfoActivity;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.module.paircode.PairCodeActivity;
import com.fimi.soul.module.push.HistoryMessageActivity;
import com.fimi.soul.module.remote.RemoteCalibration;
import com.fimi.soul.module.remote.RemoteModelActivity;
import com.fimi.soul.module.setting.GimalCalibration.GimalCalibrationActivity;
import com.fimi.soul.module.setting.i.c;
import com.fimi.soul.module.setting.newhand.GpsSettingActivity;
import com.fimi.soul.module.setting.newhand.NewHandActivity;
import com.fimi.soul.module.setting.newhand.d;
import com.fimi.soul.module.update.FindNewFirmwareAvtivity;
import com.fimi.soul.module.update.FindOnlineFirmwareAvtivity;
import com.fimi.soul.utils.ao;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import org.a.a.o.f;
import org.codehaus.jackson.smile.SmileConstants;

public class MapSettingFragment extends Fragment implements OnItemClickListener, com.fimi.soul.biz.update.b.a, b, com.fimi.soul.module.setting.i.a, i.b, c {
    private static final int A = 0;
    private static final int B = 2;
    private static final int C = 1;
    private static final int D = 3;
    private static final int E = 5;
    private k F;
    private boolean G;
    private boolean H = false;
    private long I = 0;
    private boolean J = true;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private boolean N = false;
    private String O = com.fimi.soul.base.a.L;
    private String P = RemoteModelActivity.a;
    private Handler Q = new Handler(this) {
        final /* synthetic */ MapSettingFragment a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    this.a.e.a();
                    return;
                case 1:
                    if (!this.a.M) {
                        this.a.e.e();
                        return;
                    }
                    return;
                case 2:
                    this.a.e.b();
                    return;
                case 3:
                    d.a(this.a.p).a();
                    return;
                case 5:
                    if (!this.a.N) {
                        this.a.e.d();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    };
    public boolean a = false;
    public com.fimi.soul.biz.update.b b;
    List<FirmwareInfo> c = null;
    List<UpdateVersonBean> d;
    d e;
    private Observer f = new Observer(this) {
        final /* synthetic */ MapSettingFragment a;

        {
            this.a = r1;
        }

        public void update(Observable observable, Object obj) {
            if (this.a.h != null) {
                this.a.h.a(this.a.j);
            }
        }
    };
    private ListView g;
    private i h;
    private com.fimi.soul.b.b i;
    private List<Setting> j = new ArrayList();
    private Setting k;
    private Context l;
    private a m;
    private Button n;
    private TextView o;
    private com.fimi.soul.drone.a p;
    private com.fimi.soul.module.b.d q;
    private PercentRelativeLayout r;
    private v s;
    private com.fimi.soul.biz.camera.d t;
    private x u;
    private boolean v = false;
    private int w = 0;
    private int x = 0;
    private int y = 0;
    private boolean z = false;

    public interface a {
        void c();
    }

    private void a(com.fimi.soul.drone.a aVar) {
        bf bfVar = new bf();
        bfVar.d = m.b;
        bfVar.e = (byte) 1;
        bfVar.f = (byte) 0;
        aVar.T().a(bfVar.a());
    }

    private boolean d() {
        return this.d != null && this.d.size() > 0;
    }

    private void e() {
        if (this.a) {
            this.o.setText(R.string.camera_setting);
            if (this.i == null) {
                this.i = new com.fimi.soul.b.b(getActivity(), this.p);
            }
            this.i.a();
            this.i.b();
            this.g.setAdapter(this.i);
            this.g.setOnItemClickListener(this.i);
        } else if (this.h == null || this.j.size() <= 0) {
            this.o.setText(R.string.setting);
            this.h = new i(this.l, this.p);
            this.h.a((i.b) this);
            this.h.a((c) this);
            this.h.a((com.fimi.soul.module.setting.i.a) this);
            this.g.setAdapter(this.h);
            this.g.setOverScrollMode(2);
            this.g.setOnItemClickListener(this);
            for (int i = 0; i < i.d.values().length; i++) {
                this.k = new Setting();
                this.k.setId(i);
                this.k.addObserver(this.f);
                this.k.setIsOPen(Boolean.valueOf(true));
                this.j.add(this.k);
            }
            f();
            this.g.setOnScrollListener(new OnScrollListener(this) {
                final /* synthetic */ MapSettingFragment a;

                {
                    this.a = r1;
                }

                public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                }

                public void onScrollStateChanged(AbsListView absListView, int i) {
                    int i2 = 0;
                    if (!this.a.a) {
                        if (i == 0) {
                            this.a.w = this.a.g.getFirstVisiblePosition();
                        }
                        if (this.a.j != null) {
                            View childAt = this.a.g.getChildAt(0);
                            MapSettingFragment mapSettingFragment = this.a;
                            if (childAt != null) {
                                i2 = childAt.getTop();
                            }
                            mapSettingFragment.x = i2;
                        }
                    }
                }
            });
        } else {
            this.g.setAdapter(this.h);
            this.g.setOverScrollMode(2);
            this.g.setOnItemClickListener(this);
            f();
            this.g.setSelectionFromTop(this.w, this.x);
            this.o.setText(R.string.setting);
        }
    }

    private void f() {
        ((Setting) this.j.get(i.d.NEW_HAND_MODE.ordinal())).setIsOPen(Boolean.valueOf(this.J));
        ((Setting) this.j.get(i.d.OPTICAL_FLOW_MODE.ordinal())).setIsOPen(Boolean.valueOf(this.L));
        ((Setting) this.j.get(i.d.FORCED_ATTITUDE_MODE.ordinal())).setIsOPen(Boolean.valueOf(this.K));
        ((Setting) this.j.get(i.d.SWITCH_RIGHT_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
        this.c = com.fimi.soul.module.update.a.a.a().d();
        if (this.s.a().contains("isfirstloading")) {
            ((Setting) this.j.get(i.d.XIAOMI_ACCOUNT.ordinal())).setIsOPen(Boolean.valueOf(true));
            ((Setting) this.j.get(i.d.XIAOMI_ACCOUNT.ordinal())).setContent(com.fimi.soul.base.a.b(this.l).getName());
        } else {
            ((Setting) this.j.get(i.d.XIAOMI_ACCOUNT.ordinal())).setIsOPen(Boolean.valueOf(false));
        }
        if (this.s.a().getInt(RemoteModelActivity.a, 0) == 0) {
            ((Setting) this.j.get(i.d.SWITCH_REMOTE_MODE.ordinal())).setContent(getResources().getString(R.string.modelcannal));
        } else {
            ((Setting) this.j.get(i.d.SWITCH_REMOTE_MODE.ordinal())).setContent(getResources().getString(R.string.modelcannaljp));
        }
        if (!(this.p.T().a() && this.p.U())) {
            ((Setting) this.j.get(i.d.CONNECT_PLANE.ordinal())).setIsOPen(Boolean.valueOf(true));
        }
        this.d = com.fimi.soul.module.update.a.a.a().e();
        g();
        this.h.a(this.j);
    }

    private void g() {
        ((Setting) this.j.get(i.d.FIMWARE_UPDATE.ordinal())).setIsOPen(Boolean.valueOf(true));
        if (d() || (this.c != null && this.c.size() > 0)) {
            ((Setting) this.j.get(i.d.FIMWARE_UPDATE.ordinal())).setDisplayTv(true);
        } else {
            ((Setting) this.j.get(i.d.FIMWARE_UPDATE.ordinal())).setDisplayTv(false);
        }
    }

    private void h() {
        final com.fimi.soul.view.i.a aVar = new com.fimi.soul.view.i.a(getActivity(), this.p);
        String q = com.fimi.soul.biz.e.d.a().q();
        String p = com.fimi.soul.biz.e.d.a().p();
        if (q != null) {
            aVar.c(q);
        }
        if (p != null) {
            aVar.d(p);
        }
        aVar.a(getString(R.string.cancel), new OnClickListener(this) {
            final /* synthetic */ MapSettingFragment a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }, getString(R.string.ensure), new OnClickListener(this) {
            final /* synthetic */ MapSettingFragment b;

            public void onClick(DialogInterface dialogInterface, int i) {
                if (f.a(aVar.a())) {
                    aVar.b(this.b.getString(R.string.relay_error_ssid));
                } else if (f.a(aVar.b())) {
                    aVar.b(this.b.getString(R.string.relay_error_pas));
                } else if (aVar.b().length() < 8) {
                    aVar.b(this.b.getString(R.string.relay_error_pas));
                } else {
                    ModifyRelayWiFi instance = ModifyRelayWiFi.getInstance();
                    instance.setSsid(aVar.a());
                    instance.setPassword(aVar.b());
                    instance.sendModifyCongigure();
                }
            }
        });
        aVar.c().show();
    }

    public void a() {
        if (this.e == null) {
            this.e = new com.fimi.soul.module.setting.newhand.c(this.p, this.l);
        }
        this.e.e();
    }

    public void a(int i) {
        if (i == 4) {
            this.e.a(this.j);
        } else if (i == 2) {
            this.e.a(this.j, this.F);
        }
    }

    public void a(SwitchButton switchButton) {
        this.e.a(switchButton, (Setting) this.j.get(i.d.NEW_HAND_MODE.ordinal()));
        this.h.notifyDataSetChanged();
    }

    public void a(String str) {
        this.h.a(this.j);
        this.c = com.fimi.soul.module.update.a.a.a().d();
    }

    public void a(boolean z) {
        byte b = z ? (byte) 2 : (byte) 1;
        bf bfVar = new bf();
        bfVar.d = (byte) 116;
        bfVar.e = (byte) 1;
        bfVar.f = b;
        this.p.T().a(bfVar.a());
    }

    public void b() {
    }

    public boolean c() {
        if (this.a) {
            this.a = false;
            this.t.r().e();
            e();
            return false;
        }
        this.m.c();
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 100:
                ((Setting) this.j.get(i.d.SWITCH_RIGHT_MODE.ordinal())).setContent(intent.getStringExtra("content"));
                this.h.notifyDataSetChanged();
                return;
            default:
                return;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.l = activity;
        this.m = (a) activity;
        this.p = ((DroidPlannerApp) activity.getApplication()).a;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_general_setting, viewGroup, false);
        this.r = (PercentRelativeLayout) inflate.findViewById(R.id.heardView);
        this.n = (Button) this.r.findViewById(R.id.black_btn);
        this.g = (ListView) inflate.findViewById(R.id.setting_lv);
        this.o = (TextView) this.r.findViewById(R.id.tv_settingTitle);
        this.s = v.a(getActivity());
        this.t = (com.fimi.soul.biz.camera.d) com.fimi.soul.biz.camera.b.a().d();
        this.n.setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ MapSettingFragment a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (this.a.a) {
                    this.a.a = false;
                    ((com.fimi.soul.biz.camera.d) com.fimi.soul.biz.camera.b.a().d()).r().e();
                    this.a.e();
                    return;
                }
                this.a.m.c();
            }
        });
        this.b = new com.fimi.soul.biz.update.b(this.l);
        this.b.a((com.fimi.soul.biz.update.b.a) this);
        this.b.a();
        this.u = x.a(this.l);
        this.F = k.a(this.l);
        if (ao.b(this.l) && this.p.U()) {
            this.F.a(com.fimi.soul.base.a.b(this.l), k.a, new com.fimi.soul.biz.m.k(this) {
                final /* synthetic */ MapSettingFragment a;

                {
                    this.a = r1;
                }

                public void a(PlaneMsg planeMsg, File file) {
                    if (!planeMsg.isSuccess()) {
                    }
                }
            });
        }
        return inflate;
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        if (!aVar2.T().a() || !aVar2.U()) {
            ((Setting) this.j.get(i.d.CONNECT_PLANE.ordinal())).setIsOPen(Boolean.valueOf(true));
            switch (aVar) {
                case Remotecontrol:
                    break;
                case CLEANALLOBJ:
                    g();
                    ((Setting) this.j.get(i.d.CONNECT_PLANE.ordinal())).setIsOPen(Boolean.valueOf(true));
                    break;
                default:
                    break;
            }
        }
        switch (aVar) {
            case Remotecontrol:
                ((Setting) this.j.get(i.d.CONNECT_PLANE.ordinal())).setIsOPen(Boolean.valueOf(false));
                break;
            case NEW_HAND_OPERATE:
                if (aVar2.al().d() == (byte) 51) {
                    if (com.fimi.kernel.c.b().b() != null && com.fimi.kernel.c.b().b().isShowing()) {
                        com.fimi.kernel.c.b().c();
                    }
                    if (aVar2.al().f() == (byte) 1) {
                        if (aVar2.al().i() == (byte) 0) {
                            z.a(this.l, (int) R.string.set_model_success);
                            this.Q.sendEmptyMessageDelayed(1, 1000);
                            this.Q.sendEmptyMessageDelayed(1, 2000);
                            this.M = false;
                        } else {
                            z.a(this.l, (int) R.string.set_model_fail);
                        }
                        if (aVar2.al().e() == (byte) 0) {
                            this.J = true;
                            this.K = false;
                            this.L = false;
                            ((Setting) this.j.get(i.d.NEW_HAND_MODE.ordinal())).setIsOPen(Boolean.valueOf(true));
                            ((Setting) this.j.get(i.d.OPTICAL_FLOW_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                            ((Setting) this.j.get(i.d.FORCED_ATTITUDE_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                            this.e.e();
                        } else {
                            this.J = false;
                            ((Setting) this.j.get(i.d.NEW_HAND_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                        }
                    }
                    if (aVar2.al().f() == (byte) 3) {
                        if (aVar2.al().i() == (byte) 0) {
                            z.a(this.l, (int) R.string.set_model_success);
                            this.Q.sendEmptyMessageDelayed(5, 1000);
                            this.Q.sendEmptyMessageDelayed(5, 2000);
                            this.N = false;
                        } else {
                            z.a(this.l, (int) R.string.set_model_fail);
                        }
                        if (aVar2.al().g() == (byte) 2) {
                            if (aVar2.al().h() == 1.0f) {
                                this.J = false;
                                this.K = false;
                                this.L = true;
                                ((Setting) this.j.get(i.d.FORCED_ATTITUDE_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                                ((Setting) this.j.get(i.d.OPTICAL_FLOW_MODE.ordinal())).setIsOPen(Boolean.valueOf(true));
                            } else {
                                this.L = false;
                                ((Setting) this.j.get(i.d.OPTICAL_FLOW_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                            }
                        }
                        if (aVar2.al().g() == (byte) 4) {
                            if (aVar2.al().h() == 1.0f) {
                                this.J = false;
                                this.K = true;
                                this.L = false;
                                ((Setting) this.j.get(i.d.OPTICAL_FLOW_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                                ((Setting) this.j.get(i.d.FORCED_ATTITUDE_MODE.ordinal())).setIsOPen(Boolean.valueOf(true));
                                this.H = true;
                                a(true);
                                a(aVar2);
                                ((Setting) this.j.get(i.d.SWITCH_RIGHT_MODE.ordinal())).setContent(this.l.getString(R.string.gps_atti));
                            } else {
                                this.K = false;
                                ((Setting) this.j.get(i.d.FORCED_ATTITUDE_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                                ((Setting) this.j.get(i.d.SWITCH_RIGHT_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                            }
                        }
                    }
                }
                if (aVar2.al().d() == SmileConstants.TOKEN_LITERAL_FALSE) {
                    this.M = true;
                    this.N = true;
                    if (aVar2.al().f() == (byte) 1 || aVar2.al().f() == (byte) 3) {
                        if (aVar2.al().f() == (byte) 1) {
                            if (aVar2.al().e() == (byte) 0) {
                                this.J = true;
                                this.K = false;
                                this.L = false;
                                ((Setting) this.j.get(i.d.NEW_HAND_MODE.ordinal())).setIsOPen(Boolean.valueOf(true));
                                ((Setting) this.j.get(i.d.OPTICAL_FLOW_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                                ((Setting) this.j.get(i.d.FORCED_ATTITUDE_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                                ((Setting) this.j.get(i.d.SWITCH_RIGHT_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                                this.H = false;
                                a(false);
                                a(aVar2);
                            } else {
                                this.J = false;
                                ((Setting) this.j.get(i.d.NEW_HAND_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                            }
                        }
                        if ((((int) aVar2.al().h()) & 1) == 1) {
                            ((Setting) this.j.get(i.d.FORCED_ATTITUDE_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                            this.K = false;
                        }
                        if ((((int) aVar2.al().h()) & 2) == 2) {
                            this.J = false;
                            this.K = false;
                            this.L = true;
                            ((Setting) this.j.get(i.d.FORCED_ATTITUDE_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                            ((Setting) this.j.get(i.d.OPTICAL_FLOW_MODE.ordinal())).setIsOPen(Boolean.valueOf(true));
                        } else {
                            this.L = false;
                            ((Setting) this.j.get(i.d.OPTICAL_FLOW_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                        }
                        if ((((int) aVar2.al().h()) & 4) == 4) {
                            if (!this.J) {
                                this.H = true;
                                ((Setting) this.j.get(i.d.SWITCH_RIGHT_MODE.ordinal())).setContent(this.l.getString(R.string.gps_atti));
                                ((Setting) this.j.get(i.d.SWITCH_RIGHT_MODE.ordinal())).setIsOPen(Boolean.valueOf(true));
                                this.J = false;
                                this.K = true;
                                this.L = false;
                                ((Setting) this.j.get(i.d.FORCED_ATTITUDE_MODE.ordinal())).setIsOPen(Boolean.valueOf(true));
                                ((Setting) this.j.get(i.d.OPTICAL_FLOW_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                                break;
                            }
                        } else if (System.currentTimeMillis() - this.I >= 1000) {
                            this.I = System.currentTimeMillis();
                            ((Setting) this.j.get(i.d.SWITCH_RIGHT_MODE.ordinal())).setIsOPen(Boolean.valueOf(false));
                            this.H = false;
                            a(false);
                            a(aVar2);
                            break;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case backControl:
                com.fimi.soul.drone.h.c L = aVar2.L();
                if (L != null && L.b() == m.b) {
                    if (!this.H) {
                        if (L.c() == (byte) 2) {
                            switch (L.d) {
                                case (byte) 1:
                                    ((Setting) this.j.get(i.d.SWITCH_RIGHT_MODE.ordinal())).setContent(getString(R.string.ev_control));
                                    break;
                                case (byte) 2:
                                    ((Setting) this.j.get(i.d.SWITCH_RIGHT_MODE.ordinal())).setContent(getString(R.string.light_control));
                                    break;
                            }
                        }
                    }
                    return;
                }
                this.h.notifyDataSetChanged();
                break;
        }
        if (aVar == com.fimi.soul.drone.d.a.backControl && aVar2.L().b() == (byte) 114) {
            com.fimi.soul.module.calibcompass.a.a().a("98");
            if (aVar2.L().d() == (byte) 2) {
                this.s.a().edit().putInt(RemoteModelActivity.a, 1).commit();
                ((Setting) this.j.get(i.d.SWITCH_REMOTE_MODE.ordinal())).setContent(getResources().getString(R.string.modelcannaljp));
            } else if (aVar2.L().d() == (byte) 1) {
                this.s.a().edit().putInt(RemoteModelActivity.a, 0).commit();
                ((Setting) this.j.get(i.d.SWITCH_REMOTE_MODE.ordinal())).setContent(getResources().getString(R.string.modelcannal));
            }
            if (this.h != null) {
                this.h.a(i.d.SWITCH_REMOTE_MODE.ordinal(), this.g.getChildAt(i.d.SWITCH_REMOTE_MODE.ordinal()));
            }
        }
        switch (aVar) {
            case Remotecontrol:
            case CLEANALLOBJ:
                if (!aVar2.U()) {
                    this.z = true;
                    return;
                } else if (this.z) {
                    this.z = false;
                    this.e.e();
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        SwitchButton switchButton;
        if (i == i.d.CONNECT_PLANE.ordinal()) {
            if (((Setting) this.j.get(i.d.CONNECT_PLANE.ordinal())).getIsOPen().booleanValue()) {
                this.s.a().edit().putBoolean(com.fimi.soul.base.a.L, true).commit();
                Intent intent = new Intent(this.l, LoginActivity.class);
                intent.putExtra(com.google.firebase.a.a.a.k, false);
                startActivityForResult(intent, 0);
            } else {
                return;
            }
        }
        if (i == i.d.FIMWARE_UPDATE.ordinal()) {
            if (!((Setting) this.j.get(i.d.FIMWARE_UPDATE.ordinal())).getIsOPen().booleanValue()) {
                return;
            }
            if (d()) {
                com.fimi.kernel.c.c.a().a(UpdateVersonBean.SP_NEED_DOWN_FIRMWWARES, this.d);
                startActivity(new Intent(this.l, FindOnlineFirmwareAvtivity.class));
            } else if (this.c == null || this.c.size() <= 0) {
                z.a(this.l, (int) R.string.version_tip);
            } else {
                startActivity(new Intent(this.l, FindNewFirmwareAvtivity.class));
            }
        }
        if (i == i.d.COMPASS_CALIBRATION.ordinal()) {
            intent = new Intent(getActivity(), CaliCompassActivity.class);
            intent.putExtra(com.fimi.soul.base.a.R, true);
            startActivity(intent);
        }
        if (i == i.d.GIMBAL_CALIBRATION.ordinal()) {
            startActivity(new Intent(this.l, GimalCalibrationActivity.class));
        }
        if (i == i.d.NEW_HAND_GUIDE.ordinal()) {
            this.s.a().edit().putBoolean(com.fimi.soul.base.a.L, true).commit();
            startActivity(new Intent(this.l, NewHandActivity.class));
        }
        if (i == i.d.NEW_HAND_MODE.ordinal()) {
            this.e.a((SwitchButton) view.findViewById(R.id.switch_btn), (Setting) this.j.get(i.d.NEW_HAND_MODE.ordinal()));
            this.h.notifyDataSetChanged();
        }
        if (i == i.d.GPS_MODE.ordinal()) {
            if (!((Setting) this.j.get(i.d.NEW_HAND_MODE.ordinal())).getIsOPen().booleanValue()) {
                Intent intent2 = new Intent(this.l, GpsSettingActivity.class);
                intent2.putExtra(GpsSettingActivity.b, ((Setting) this.j.get(i.d.NEW_HAND_MODE.ordinal())).getIsOPen());
                intent2.putExtra(GpsSettingActivity.c, ((Setting) this.j.get(i.d.OPTICAL_FLOW_MODE.ordinal())).getIsOPen());
                intent2.putExtra(GpsSettingActivity.d, ((Setting) this.j.get(i.d.FORCED_ATTITUDE_MODE.ordinal())).getIsOPen());
                this.l.startActivity(intent2);
            } else {
                return;
            }
        }
        if (i == i.d.SATELLITE_MAP.ordinal()) {
            switchButton = (SwitchButton) view.findViewById(R.id.switch_btn);
            if (o.a(this.l).e()) {
                switchButton.a(false, true);
                o.a(this.l).f(false);
                PreferenceManager.getDefaultSharedPreferences(this.l).edit().putInt(com.fimi.soul.drone.g.c.s, 1).commit();
            } else {
                switchButton.a(true, true);
                o.a(this.l).f(true);
                PreferenceManager.getDefaultSharedPreferences(this.l).edit().putInt(com.fimi.soul.drone.g.c.s, 2).commit();
            }
        }
        if (i == i.d.SHOW_MORE_PAT.ordinal()) {
            switchButton = (SwitchButton) view.findViewById(R.id.switch_btn);
            if (com.fimi.kernel.c.e().d()) {
                com.fimi.kernel.c.e().a(false);
                switchButton.a(false, true);
            } else {
                com.fimi.kernel.c.e().a(true);
                switchButton.a(true, true);
            }
            ((FlightActivity) this.l).h();
        }
        if (i == i.d.CALIBRATION_REMOTE.ordinal()) {
            startActivity(new Intent(this.l, RemoteCalibration.class));
        }
        if (i == i.d.SWITCH_REMOTE_MODE.ordinal()) {
            if (this.p.U()) {
                z.a(this.l, this.l.getString(R.string.close_plane_switch_rocket), z.b);
                return;
            }
            startActivity(new Intent(this.l, RemoteModelActivity.class));
        }
        if (i == i.d.CAMERA_SETTING.ordinal()) {
            this.a = true;
            e();
        }
        if (i == i.d.HISTORY_MESSAGE.ordinal()) {
            startActivity(new Intent(this.l, HistoryMessageActivity.class));
        }
        if (i == i.d.XIAOMI_ACCOUNT.ordinal()) {
            if (this.s.a().contains("isfirstloading")) {
                new com.fimi.soul.view.f.a(this.l).a(this.l.getString(R.string.log_out)).c(17).a(getResources().getColor(R.color.dialog_ensure_hot)).b(this.l.getString(R.string.exit), new OnClickListener(this) {
                    final /* synthetic */ MapSettingFragment a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        this.a.s.a().edit().remove("isfirstloading").commit();
                        ((Setting) this.a.j.get(i.d.XIAOMI_ACCOUNT.ordinal())).setIsOPen(Boolean.valueOf(false));
                        this.a.h.a(this.a.j);
                        this.a.u.b(com.fimi.soul.base.a.b(this.a.l), new com.fimi.soul.biz.m.k(this) {
                            final /* synthetic */ AnonymousClass7 a;

                            {
                                this.a = r1;
                            }

                            public void a(PlaneMsg planeMsg, File file) {
                            }
                        });
                    }
                }).a(this.l.getString(R.string.cancel), new OnClickListener(this) {
                    final /* synthetic */ MapSettingFragment a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).a().show();
            } else {
                this.s.a().edit().putBoolean(com.fimi.soul.base.a.L, true).commit();
                intent = new Intent(this.l, LoginActivity.class);
                intent.putExtra(com.google.firebase.a.a.a.k, true);
                startActivity(intent);
            }
        }
        if (i == i.d.USER_FEEDBACK.ordinal()) {
            startActivity(new Intent(this.l, UserFeedBackActivity.class));
        }
        if (i == i.d.ABOUT.ordinal()) {
            startActivity(new Intent(this.l, AboutActivity.class));
        }
        if (i == i.d.BATTERY_INFO.ordinal()) {
            startActivity(new Intent(this.l, BatteryInfoActivity.class));
        }
        if (i == i.d.OPTICAL_FLOW_MODE.ordinal()) {
            this.e.a(this.j, this.F);
        }
        if (i == i.d.FORCED_ATTITUDE_MODE.ordinal()) {
            this.e.a(this.j);
        }
        if (i == i.d.FLIGHT_RECORD.ordinal()) {
            startActivity(new Intent(this.l, FlyRecordActivity.class));
        }
        if (i == i.d.FLIGHT_INFO.ordinal()) {
            startActivity(new Intent(this.l, FlyLogsActivity.class));
        }
        if (i == i.d.PAIR_REMOTE.ordinal()) {
            startActivity(new Intent(this.l, PairCodeActivity.class));
        }
        if (i == i.d.SWITCH_RIGHT_MODE.ordinal()) {
            intent2 = new Intent(this.l, RightRollerSetActivity.class);
            intent2.putExtra("GPS_ATTI", ((Setting) this.j.get(i.d.FORCED_ATTITUDE_MODE.ordinal())).getIsOPen());
            intent2.putExtra("curModel", ((Setting) this.j.get(i.d.SWITCH_RIGHT_MODE.ordinal())).getContent());
            getActivity().startActivityForResult(intent2, 100);
        }
        if (i == i.d.RELAY_WIFI_CONFIGURE.ordinal()) {
            if (!this.p.T().a()) {
                z.a(getActivity(), (int) R.string.connectdefault, 3000);
            } else if (this.p.ac()) {
                z.a(getActivity(), (int) R.string.relay_error_in_sky_tip, 3000);
                return;
            } else {
                h();
            }
        }
        if (i == i.d.MAP_CODE_CORREECTION.ordinal()) {
            switchButton = (SwitchButton) view.findViewById(R.id.switch_btn);
            boolean z = this.s.a().getBoolean(com.fimi.soul.drone.g.c.bN, false);
            com.fimi.soul.biz.n.a a = com.fimi.soul.biz.n.a.a();
            if (z) {
                this.s.a().edit().putBoolean(com.fimi.soul.drone.g.c.bN, false).commit();
                switchButton.setSwitchState(false);
                a.a(true);
                return;
            }
            this.s.a().edit().putBoolean(com.fimi.soul.drone.g.c.bN, true).commit();
            switchButton.setSwitchState(true);
            a.a(false);
        }
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        super.onStart();
        e();
        this.p.a((b) this);
        this.q = com.fimi.soul.module.b.d.a(this.p);
        this.q.g();
        this.G = com.fimi.soul.biz.e.d.a().k();
        if (this.e == null) {
            this.e = new com.fimi.soul.module.setting.newhand.c(this.p, this.l);
        }
        this.M = false;
        this.e.e();
        this.Q.sendEmptyMessageDelayed(1, 500);
        this.Q.sendEmptyMessageDelayed(1, 1000);
        this.O = com.fimi.soul.base.a.L;
        this.P = RemoteModelActivity.a;
    }

    public void onStop() {
        super.onStop();
        this.p.b((b) this);
        if (this.b != null && this.b.b() != null) {
            this.b.a(null);
        }
    }
}
