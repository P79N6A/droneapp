package com.fimi.soul.module.dronemanage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.fimi.kernel.utils.t;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.biz.manager.x;
import com.fimi.soul.drone.c.a.a.l;
import com.fimi.soul.drone.h.ba;
import com.fimi.soul.entity.DynamicDYZ_Entity;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.module.droneFragment.FlyActionSettingFragment;
import com.fimi.soul.module.droneFragment.d;
import com.fimi.soul.module.droneFragment.e;
import com.fimi.soul.module.droneui.DroneMap;
import com.fimi.soul.utils.ae;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.y;
import com.fimi.soul.view.MapWrapperLayout;
import com.fimi.soul.view.titlebar.TouchableMap;
import com.google.android.gms.maps.c.c;
import com.google.android.gms.maps.c.k;
import com.google.android.gms.maps.c.n;
import com.google.android.gms.maps.c.o;
import com.google.android.gms.maps.c.p;
import com.google.android.gms.maps.c.q;
import com.google.android.gms.maps.c.r;
import com.google.android.gms.maps.f;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONArray;
import org.json.JSONException;

public class FlightMapFragment extends DroneMap implements com.fimi.soul.view.titlebar.TouchableMap.a, com.google.android.gms.maps.c.b, c, k, n, o, p, q, r, f {
    private e A;
    private e B;
    private e C;
    private boolean D = false;
    private View E;
    private Button F;
    private Button G;
    private View H;
    private float I;
    private float J;
    private a K;
    private SharedPreferences L;
    private h M;
    private com.fimi.soul.biz.c.c N;
    private TouchableMap O;
    private double P;
    private d Q;
    private List<com.google.android.gms.maps.model.c> R;
    private final int S = 16;
    private LatLng T;
    private final int U = 1;
    private b V = b.no_check;
    private int W = 1;
    boolean a = false;
    Editor b;
    Point c;
    boolean d = true;
    com.google.android.gms.maps.model.c e;
    com.google.android.gms.maps.model.c f;
    List<DynamicDYZ_Entity> g = new ArrayList();
    List<DynamicDYZ_Entity> h = new ArrayList();
    protected Handler i = new Handler(this) {
        final /* synthetic */ FlightMapFragment a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            com.fimi.soul.drone.c.a.a.k kVar = new com.fimi.soul.drone.c.a.a.k();
            switch (message.what) {
                case 1:
                    kVar.c(true);
                    if (this.a.g != null) {
                        for (DynamicDYZ_Entity dynamicDYZ_Entity : this.a.g) {
                            if (dynamicDYZ_Entity != null) {
                                y.c(this.a.T, new LatLng(dynamicDYZ_Entity.getLatitude(), dynamicDYZ_Entity.getLogitude())).a();
                                this.a.h.add(dynamicDYZ_Entity);
                            }
                        }
                    }
                    if (this.a.h != null && this.a.h.size() > 0) {
                        String encryptKey = ((DynamicDYZ_Entity) this.a.h.get(0)).getEncryptKey();
                        kVar.b(t.a(encryptKey.substring(6, encryptKey.length() - 4)));
                        if (com.fimi.soul.biz.e.d.a().k()) {
                            kVar.a((byte) 26);
                            kVar.a(true);
                            kVar.b(true);
                            kVar.a(FlightMapFragment.a(this.a.W));
                        } else {
                            kVar.a(false);
                        }
                        this.a.k.T().a(kVar.a());
                        this.a.V = b.sendKey;
                        return;
                    }
                    return;
                case 16:
                    kVar.c(false);
                    this.a.k.T().a(kVar.a());
                    return;
                default:
                    return;
            }
        }
    };
    private com.fimi.soul.biz.k.a s;
    private com.fimi.soul.biz.c.n t;
    private LatLng u;
    private com.google.android.gms.maps.model.c v;
    private boolean w;
    private FragmentManager x;
    private View y;
    private Button z;

    public interface a {
        void a(List<ba> list);
    }

    private enum b {
        no_check,
        checkStatus,
        sendKey,
        sendData,
        finish
    }

    public static int a(byte[] bArr) {
        return ((bArr[1] & 255) << 8) | (bArr[0] & 255);
    }

    private void a(ba baVar) {
    }

    private void a(LatLng latLng, int i, int i2) {
        int i3 = this.L.getInt(com.fimi.soul.drone.g.c.s, 1);
        if (i2 == 3) {
            if (this.f != null) {
                this.f.a(latLng);
                if (((double) i) != this.f.d()) {
                    this.f.a((double) (i + 100));
                }
            } else {
                this.f = this.j.a(new CircleOptions().a(latLng).a((double) (i + 100)).a(Color.argb(127, 0, 0, 0)).a(2.0f).b(1 == i3 ? Color.argb(204, 198, 200, 203) : Color.argb(204, 101, 104, 106)));
            }
        } else if (this.f != null) {
            this.f.a();
            this.f = null;
        }
        if (this.e == null || !this.R.contains(this.e)) {
            this.e = this.j.a(new CircleOptions().a(latLng).a((double) i).a(Color.argb(127, 255, 54, 0)).a(2.0f).b(Color.argb(51, 255, 54, 0)).b(100.0f));
        } else {
            this.e.a(latLng);
            if (((double) i) != this.e.d()) {
                this.e.a((double) i);
            }
        }
        if (!this.R.contains(this.e)) {
            this.R.add(this.e);
        }
    }

    private void a(String str) {
        if (str != null) {
            this.k.T().a(t.a(str));
        }
    }

    public static byte[] a(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    private String b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        int i = 0;
        for (byte b : bArr) {
            i += b & 255;
        }
        return t.a(a(i, false));
    }

    private void c(LatLng latLng) {
        if (this.v == null) {
            this.v = this.j.a(new CircleOptions().a(latLng).a(500.0d).a(5.0f).a(getResources().getColor(R.color.errortextcl)));
            return;
        }
        this.v.a(latLng);
        this.v.a(true);
    }

    private void f() {
    }

    private void g() {
        this.E = LayoutInflater.from(getActivity()).inflate(R.layout.mystyle_com_inforwindow, null);
        this.F = (Button) this.E.findViewById(R.id.delete);
        this.G = (Button) this.E.findViewById(R.id.excute_again);
        this.C = new e(this, this.F, getResources().getDrawable(R.drawable.btn_fly_back_bubble_left_normal), getResources().getDrawable(R.drawable.btn_fly_back_bubble_left_pressed)) {
            final /* synthetic */ FlightMapFragment a;

            protected void a(View view, g gVar) {
                com.fimi.soul.biz.c.d.k().m();
                this.a.k.a(com.fimi.soul.drone.d.a.CLEARDATA);
            }
        };
        this.B = new e(this, this.F, getResources().getDrawable(R.drawable.btn_fly_back_bubble_left_normal), getResources().getDrawable(R.drawable.btn_fly_back_bubble_left_pressed)) {
            final /* synthetic */ FlightMapFragment a;

            protected void a(View view, g gVar) {
                h a = h.a(this.a.getActivity());
                FlyActionBean flyActionBean = null;
                if (gVar.o() instanceof FlyActionBean) {
                    flyActionBean = (FlyActionBean) gVar.o();
                }
                if (flyActionBean != null) {
                    switch (flyActionBean.getModelType()) {
                        case 1:
                            a.a(1);
                            this.a.k.a(com.fimi.soul.drone.d.a.UPWAYPOINT);
                            return;
                        case 2:
                            a.a(2);
                            this.a.k.a(com.fimi.soul.drone.d.a.ASSIGNWAYPOINT);
                            return;
                        case 3:
                            a.a(3);
                            this.a.k.a(com.fimi.soul.drone.d.a.INTERESTWAYPOINT);
                            return;
                        default:
                            return;
                    }
                }
            }
        };
        this.F.setOnTouchListener(this.C);
        this.G.setOnTouchListener(this.B);
    }

    private void h() {
        this.y = LayoutInflater.from(getActivity()).inflate(R.layout.mystyle_inforwindow, null);
        this.z = (Button) this.y.findViewById(R.id.reminder);
        this.A = new e(this, this.z, getResources().getDrawable(R.drawable.btn_fly_back_bubble_normal), getResources().getDrawable(R.drawable.btn_fly_back_bubble_pressed)) {
            final /* synthetic */ FlightMapFragment a;

            protected void a(View view, g gVar) {
                if (this.a.z.getText().toString().equals(this.a.getString(R.string.delete_marker))) {
                    this.a.k.a(com.fimi.soul.drone.d.a.DELETE_WAYPOINT);
                }
            }
        };
        this.z.setOnTouchListener(this.A);
    }

    private void i() {
        if (this.j != null) {
            this.j.a((n) this);
            this.j.a((q) this);
            this.j.a((r) this);
            this.j.a(this.L.getInt(com.fimi.soul.drone.g.c.s, 1));
            this.j.a(false);
            this.j.a((c) this);
            this.j.a((o) this);
            this.j.a((com.google.android.gms.maps.c.b) this);
            this.j.m().a(false);
        }
    }

    private void j() {
        if (this.v != null) {
            this.v.a(false);
        }
    }

    private void k() {
        x.a(getActivity()).b(new com.fimi.soul.biz.m.k(this) {
            final /* synthetic */ FlightMapFragment a;

            {
                this.a = r1;
            }

            public void a(PlaneMsg planeMsg, File file) {
                if (planeMsg.isSuccess()) {
                    try {
                        JSONArray jSONArray = new JSONArray(planeMsg.getData().toString());
                        if (jSONArray != null && jSONArray.length() > 0) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                this.a.g.add((DynamicDYZ_Entity) ae.b(DynamicDYZ_Entity.class, jSONArray.getJSONObject(i).toString()));
                            }
                            this.a.i.sendEmptyMessage(1);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    } catch (JsonMappingException e2) {
                        e2.printStackTrace();
                    } catch (JsonParseException e3) {
                        e3.printStackTrace();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
            }
        });
    }

    private void l() {
        if (this.W < this.h.size() && this.W >= 0) {
            DynamicDYZ_Entity dynamicDYZ_Entity = (DynamicDYZ_Entity) this.h.get(this.W - 1);
            String encryptValue;
            if (com.fimi.soul.biz.e.d.a().k()) {
                com.fimi.soul.drone.c.a.a.k kVar = new com.fimi.soul.drone.c.a.a.k();
                kVar.a((byte) 36);
                kVar.c(true);
                encryptValue = dynamicDYZ_Entity.getEncryptValue();
                byte[] a = t.a(encryptValue.substring(6, encryptValue.length() - 4));
                if (com.fimi.soul.biz.e.d.a().k()) {
                    kVar.a(true);
                    kVar.b(false);
                    kVar.a(a(this.W));
                } else {
                    kVar.a(false);
                }
                kVar.b(a);
                this.k.T().a(kVar.a());
            } else {
                l lVar = new l();
                encryptValue = dynamicDYZ_Entity.getEncryptValue();
                lVar.b(t.a(encryptValue.substring(6, encryptValue.length() - 4)));
                this.k.T().a(lVar.a());
            }
            this.V = b.sendData;
        }
    }

    private void m() {
        com.fimi.soul.drone.c.a.a.k kVar = new com.fimi.soul.drone.c.a.a.k();
        kVar.c(false);
        kVar.g((byte) 1);
        kVar.e((byte) 1);
        this.k.T().a(kVar.a());
        this.s.a(this.h);
        this.V = b.finish;
    }

    public View a(g gVar) {
        if (gVar.o() instanceof FlyActionBean) {
            FlyActionBean flyActionBean = (FlyActionBean) gVar.o();
            if (flyActionBean != null) {
                MapWrapperLayout aq;
                if (flyActionBean.getStyleInfo() == 2) {
                    if (flyActionBean.isCanExcute()) {
                        a(this.G, 255);
                    } else {
                        a(this.G, 75);
                    }
                    this.B.a(gVar);
                    this.C.a(gVar);
                    aq = this.k.aq();
                    if (aq != null) {
                        aq.a(gVar, this.E);
                    }
                    ao.a(getActivity().getAssets(), this.F, this.G);
                    return this.E;
                }
                this.z.setText(gVar.e());
                this.A.a(gVar);
                aq = this.k.aq();
                if (aq != null) {
                    aq.a(gVar, this.y);
                }
                ao.a(getActivity().getAssets(), this.z);
                return this.y;
            }
        }
        return null;
    }

    public void a() {
        if (this.j.a().b >= 7.0f) {
            this.s.a();
            k();
        }
    }

    public void a(float f, boolean z, View... viewArr) {
        for (int i = 0; i < viewArr.length; i++) {
            View view = viewArr[i];
            if (view.getAlpha() != f) {
                view.setAlpha(f);
            }
            if (view.isEnabled() != z) {
                viewArr[i].setEnabled(z);
            }
        }
    }

    public void a(MotionEvent motionEvent) {
        com.fimi.soul.biz.d.a a = com.fimi.soul.biz.d.a.a();
        if (a.c() == com.fimi.soul.biz.d.a.a.DRONEPRESS) {
            switch (motionEvent.getAction() & 255) {
                case 0:
                    this.I = motionEvent.getX();
                    this.J = motionEvent.getY();
                    this.a = true;
                    a.a(false);
                    return;
                case 1:
                    a.a(true);
                    if (!this.a) {
                        return;
                    }
                    if (Math.abs(motionEvent.getX() - this.I) > com.google.android.gms.maps.model.b.b || Math.abs(motionEvent.getY() - this.J) > com.google.android.gms.maps.model.b.b) {
                        a.a(com.fimi.soul.biz.d.a.a.DRONE);
                        return;
                    }
                    return;
                case 5:
                    this.a = false;
                    return;
                default:
                    return;
            }
        }
    }

    public void a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
        if (i == 255) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
    }

    public void a(com.fimi.soul.drone.h.a.b bVar) {
        LatLng latLng = new LatLng((double) bVar.j(), (double) bVar.k());
        int g = bVar.g() * 10;
        if (this.j != null) {
            a(latLng, g, bVar.i());
        }
    }

    public void a(FlyActionBean flyActionBean) {
        this.N.b();
    }

    public void a(CameraPosition cameraPosition) {
        if (this.M.a().get() == 3 && this.k.U()) {
            this.k.a(com.fimi.soul.drone.d.a.CHANGESTARTMARKER);
        }
        if (cameraPosition != null && cameraPosition.b >= 7.0f) {
            this.s.a();
        }
    }

    public void a(LatLng latLng) {
        if (l != 6 && l != 4 && l != 5) {
            this.k.a(com.fimi.soul.drone.d.a.HIDEINFORWINDOW);
            FlyActionSettingFragment flyActionSettingFragment = (FlyActionSettingFragment) this.x.findFragmentById(R.id.flyaction);
            if ((flyActionSettingFragment != null && !flyActionSettingFragment.isVisible()) || !this.M.b()) {
                return;
            }
            if (this.M.a().get() == 1) {
                this.N.a(latLng, (int) R.drawable.icon_fly_waypoint_red);
            } else if (this.M.a().get() == 2) {
                this.N.a(latLng, (int) R.drawable.img_fly_flag_blue);
            } else if (this.M.a().get() == 3) {
                this.N.a(latLng, (int) R.drawable.img_fly_flag_blue);
            }
        }
    }

    public void a(List<ba> list) {
    }

    public byte[] a(int i, boolean z) {
        byte[] bArr = new byte[2];
        int length;
        if (z) {
            for (length = bArr.length - 1; length >= 0; length--) {
                bArr[length] = (byte) (i & 255);
                i >>= 8;
            }
        } else {
            for (length = 0; length < bArr.length; length++) {
                bArr[length] = (byte) (i & 255);
                i >>= 8;
            }
        }
        return bArr;
    }

    public View b(g gVar) {
        return null;
    }

    public void b() {
        if (this.j != null) {
            this.j.a(this.L.getInt(com.fimi.soul.drone.g.c.s, 1));
        }
    }

    public void b(com.google.android.gms.maps.c cVar) {
        if (cVar != null) {
            this.j = cVar;
            this.k.a(this.j);
            if (this.s == null) {
                this.s = new com.fimi.soul.biz.k.a(getActivity().getApplicationContext(), this.j);
            }
            if (this.N == null) {
                this.N = new com.fimi.soul.biz.c.c(this.k, this.j, getActivity().getApplicationContext(), this.x);
            } else {
                this.N.d();
            }
            if (this.t == null) {
                this.t = new com.fimi.soul.biz.c.n(this.k);
            }
            i();
            if (this.Q != null) {
                this.Q.a(cVar);
            }
            h();
            g();
            f();
            if (MyLocationManager.a(getActivity()).c() == null && !this.k.U() && this.j != null) {
                this.k.f(true);
                this.j.a(com.google.android.gms.maps.b.a(new LatLng(32.76593d, 102.523984d), 4.0f));
            }
        }
    }

    public void b(LatLng latLng) {
    }

    public void c(g gVar) {
    }

    public boolean d(g gVar) {
        if (this.k.aj().g().judgeNoAction()) {
            this.N.a(gVar);
        }
        return true;
    }

    public void e(g gVar) {
        h(gVar);
    }

    public void f(g gVar) {
        if ((this.P >= 500.0d || this.w) && this.u != null) {
            gVar.a(this.u);
        }
        if (gVar.j()) {
            gVar.i();
            gVar.a("");
        }
        this.k.a(com.fimi.soul.drone.d.a.NOTIFICHANGECIECLERIDUS);
    }

    public void g(g gVar) {
    }

    public void h(g gVar) {
        LatLng c = gVar.c();
        for (com.google.android.gms.maps.model.c cVar : com.fimi.soul.biz.k.b.a().b()) {
            if (cVar != null && y.c(cVar.c(), c).a() < cVar.d()) {
                this.w = true;
                z.a(this.k.d, (int) R.string.flyzonwaypoint, 3000);
                return;
            }
        }
        this.w = false;
        this.P = y.c(c, new LatLng(this.k.v().b(), this.k.v().c())).a();
        if (this.M.a().get() == 1 || this.M.a().get() == 2) {
            if (com.fimi.kernel.c.e().m()) {
                gVar.a(getString(R.string.distancetag) + t.a(this.P) + getString(R.string.foot_unit));
            } else {
                gVar.a(getString(R.string.distancetag) + t.a(this.P, 1) + getString(R.string.meter));
            }
            gVar.h();
        }
        if (this.P >= 500.0d) {
            z.a(getActivity(), (int) R.string.waypoint_distan_home_Err, 1000);
            return;
        }
        this.u = c;
        FlyActionBean flyActionBean = null;
        if (gVar.o() instanceof FlyActionBean) {
            flyActionBean = (FlyActionBean) gVar.o();
        }
        if (flyActionBean != null) {
            flyActionBean.setLatLng(c);
            a(flyActionBean);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.K = (a) getActivity();
            this.Q = (d) getActivity();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.t == null) {
            if (this.k == null) {
                this.k = ((DroidPlannerApp) getActivity().getApplication()).a;
            }
            this.t = new com.fimi.soul.biz.c.n(this.k);
        }
        this.M = h.a(getActivity().getApplicationContext());
        this.R = com.fimi.soul.biz.k.b.a().b();
        this.x = getActivity().getSupportFragmentManager();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.O = new TouchableMap(getActivity());
        this.O.addView(onCreateView);
        this.O.setNonConsumingTouchListener(this);
        this.L = PreferenceManager.getDefaultSharedPreferences(getActivity());
        this.b = this.L.edit();
        return this.O;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.s != null) {
            this.s.b();
        }
        for (com.google.android.gms.maps.model.c cVar : this.R) {
            if (cVar != null) {
                cVar.a();
            }
        }
        this.t.a();
        if (this.Q != null) {
            this.Q = null;
        }
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        boolean z = false;
        super.onDroneEvent(aVar, aVar2);
        switch (aVar) {
            case Remotecontrol:
                if (!(aVar2.U() || this.D)) {
                    aVar2.V();
                    this.D = true;
                }
                if (aVar2.U()) {
                    this.D = false;
                    return;
                }
                return;
            case NOFLYZONE:
                com.fimi.soul.drone.h.a.b h = aVar2.h();
                if (h.f() != (byte) 4 && h.f() != (byte) 5 && h.f() != (byte) 6) {
                    a(h);
                    return;
                }
                return;
            case DISPLAYLIMITCIRCLE:
                com.fimi.soul.drone.h.z v = aVar2.v();
                c(new LatLng(v.b(), v.c()));
                return;
            case HIDEDISPLAYCIRCLE:
                j();
                return;
            case DYNAMIC_RESULT:
                if (this.V != b.finish) {
                    com.fimi.soul.drone.h.o d = aVar2.d();
                    if (d != null) {
                        byte e = d.e();
                        byte f = d.f();
                        byte g = d.g();
                        if (f != (byte) 1) {
                            switch (this.V) {
                                case checkStatus:
                                    this.g.clear();
                                    this.h.clear();
                                    if (e == (byte) 1 && f == (byte) 0 && g == (byte) 0) {
                                        this.T = new LatLng(aVar2.u().e(), aVar2.u().d());
                                        k();
                                        return;
                                    }
                                    return;
                                case sendKey:
                                    if (g == (byte) 0) {
                                        l();
                                        return;
                                    }
                                    return;
                                case sendData:
                                    if (g == (byte) 0 && f != (byte) 1) {
                                        byte[] d2 = d.d();
                                        if (d2 != null && d2.length > 0) {
                                            z = a(d2);
                                        }
                                        if (this.W == this.h.size()) {
                                            m();
                                            return;
                                        } else if (this.W == z) {
                                            l();
                                            this.W++;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                default:
                                    return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }
}
