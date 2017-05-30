package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.g.c;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.e;

public class FlyActionSettingFragment extends Fragment implements OnClickListener, b {
    private Button a;
    private Button b;
    private TextView c;
    private a d;
    private PercentRelativeLayout e;
    private h f;
    private v g;
    private f h;
    private h i;
    private ImageButton j;
    private boolean k;
    private a l;
    private View m;
    private Dialog n;

    private void a(View view) {
        this.j = (ImageButton) view.findViewById(R.id.toggleaction);
        this.j.setOnClickListener(this);
        this.e = (PercentRelativeLayout) view.findViewById(R.id.changgeHeight_view);
        this.a = (Button) view.findViewById(R.id.fly_action_cancal_btn);
        this.a.setOnClickListener(this);
        this.b = (Button) view.findViewById(R.id.fly_action_execute_btn);
        this.b.setOnClickListener(this);
        this.c = (TextView) view.findViewById(R.id.title);
        ao.a(getActivity().getAssets(), this.a, this.b, this.c);
        ao.b(getActivity().getAssets(), new View[0]);
    }

    private void a(String str) {
        if (this.n != null && this.n.isShowing()) {
            this.n.dismiss();
            this.n = null;
        }
        e.a aVar = new e.a(getActivity());
        aVar.a(str);
        aVar.a(true);
        aVar.a(getString(R.string.finish), new DialogInterface.OnClickListener(this) {
            final /* synthetic */ FlyActionSettingFragment a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                if (this.a.f.a().get() == 2) {
                    z.a(this.a.getActivity(), (int) R.string.promtt_fly_to, 2000);
                } else if (this.a.f.a().get() == 1) {
                    z.a(this.a.getActivity(), (int) R.string.promtt_waypoint, 2000);
                } else if (this.a.f.a().get() == 3) {
                    this.a.h.a();
                }
            }
        });
        this.n = aVar.a();
        this.n.setCanceledOnTouchOutside(false);
        this.n.show();
    }

    private boolean b(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return ((float) (view.getBottom() - rect.bottom)) > view.getResources().getDisplayMetrics().density * 100.0f;
    }

    private void c() {
        this.d.a(d.a.DISPLAYLIMITCIRCLE);
        this.d.a(d.a.CLEARTAKEPHOTO);
    }

    private void d() {
        if (this.f.a().get() == 1) {
            this.c.setText(R.string.settingwaypoint);
            this.l.c((int) R.string.delete_wraypoint);
            this.h.e();
            this.j.setVisibility(8);
            if (this.g.a().getBoolean(c.bC, false)) {
                z.a(getActivity(), (int) R.string.promtt_waypoint, 2000);
            } else {
                a(getString(R.string.fly_action_tip));
            }
        } else if (this.f.a().get() == 2) {
            this.c.setText(R.string.settingtargetplace);
            this.l.c((int) R.string.delete_flytopoint);
            this.h.e();
            this.j.setVisibility(8);
            if (this.g.a().getBoolean(c.bD, false)) {
                z.a(getActivity(), (int) R.string.promtt_fly_to, 2000);
            } else {
                a(getString(R.string.fly_action_flyto_tip));
            }
        } else if (this.f.a().get() == 3) {
            this.c.setText(R.string.set_interest_point);
            this.j.setVisibility(0);
            if (this.g.a().getBoolean(c.bE, false)) {
                this.h.a();
            } else {
                a(getString(R.string.fly_action_poi_tip));
            }
        }
        int f = (int) ((this.d.u().f() - 677216.0d) / 10.0d);
        this.l.a(f);
        com.fimi.soul.biz.c.d.k().a(f);
        com.fimi.soul.biz.c.d.k().m();
        this.d.a(d.a.CLEARDATA);
        this.l.b();
    }

    private void e() {
        if (com.fimi.soul.biz.c.d.k().f().size() > 0) {
            this.b.setBackgroundResource(R.drawable.flyaction_bg);
        } else {
            this.b.setBackgroundResource(R.drawable.fly_action_cancal_bg);
        }
    }

    private void f() {
        this.b.setBackgroundResource(R.drawable.fly_action_cancal_bg);
    }

    public void a() {
        this.h.d();
        this.h.e();
        this.i.b();
        this.j.setImageResource(R.drawable.switch_action_poi);
        this.k = false;
        com.fimi.soul.biz.c.d.k().m();
        h.a(getActivity().getApplicationContext()).a(0);
        this.d.a(d.a.CANCALFLYACTION);
    }

    public boolean b() {
        return (this.n == null || !this.n.isShowing()) ? b(this.m) : false;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.d = ((DroidPlannerApp) activity.getApplication()).a;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fly_action_cancal_btn:
                a();
                return;
            case R.id.fly_action_execute_btn:
                if (this.d.aj().g().isLightStream()) {
                    z.a(getActivity(), (int) R.string.in_light_stream, 3000);
                    return;
                } else if (this.d.aj().g().isEnforcementAtti()) {
                    z.a(getActivity(), (int) R.string.in_Atti, 3000);
                    return;
                } else if (this.f.a().get() == 1) {
                    this.d.a(d.a.UPWAYPOINT);
                    return;
                } else if (this.f.a().get() == 2) {
                    this.d.a(d.a.ASSIGNWAYPOINT);
                    return;
                } else if (this.f.a().get() == 3) {
                    this.d.a(d.a.INTERESTWAYPOINT);
                    return;
                } else {
                    return;
                }
            case R.id.toggleaction:
                if (this.k) {
                    this.k = false;
                    this.i.b();
                    this.j.setImageResource(R.drawable.switch_action_poi);
                    return;
                } else if (this.d.W()) {
                    this.k = true;
                    this.i.a();
                    this.j.setImageResource(R.drawable.switch_poi_map);
                    return;
                } else {
                    z.a(this.d.d, (int) R.string.disconnect_camer, 3000);
                    return;
                }
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = h.a(this.d.d);
        this.g = v.a(getActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fly_drone_action, null);
        this.m = inflate.getRootView();
        this.h = new f(inflate, this.d);
        this.i = new h(inflate, this.d.d);
        this.l = new a(this.d, inflate);
        a(inflate);
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        if (this.h != null) {
            this.h = null;
        }
        if (this.i != null) {
            this.i = null;
        }
    }

    public void onDroneEvent(d.a aVar, a aVar2) {
        switch (aVar) {
            case CLEARDATATAKEPHOTO:
                a();
                return;
            case CREATEPOI:
                this.k = false;
                this.i.b();
                this.j.setImageResource(R.drawable.switch_action_poi);
                return;
            case CHANGESTARTMARKER:
                if (this.h != null) {
                    this.h.a(false);
                    return;
                }
                return;
            case SHOWHEIGHTVIEW:
                this.l.a();
                FlyActionBean j = com.fimi.soul.biz.c.d.k().j();
                if (j != null) {
                    this.l.a(j.getHeight());
                    this.l.d(j.getSpeek());
                }
                e();
                return;
            case HIDEHEIGHTVALUE:
                e();
                this.l.b();
                return;
            case CLOSEFLYACTIONFRAGMENT:
                if (isVisible() && aVar2.aj().g().judgeNoAction()) {
                    d();
                    c();
                    return;
                }
                return;
            case SHOWPOIOPERA:
                e();
                this.h.g();
                return;
            case CLEANALLOBJ:
                if (this.h != null) {
                    this.h.d();
                    return;
                }
                return;
            case CLEARPOIDATA:
                if (this.h != null) {
                    this.h.d();
                    return;
                }
                return;
            case CLOSECARMERPOI:
                this.i.b();
                this.h.j();
                this.j.setImageResource(R.drawable.switch_action_poi);
                this.k = false;
                return;
            case CLEARDATA:
                e();
                return;
            default:
                return;
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!isAdded()) {
            return;
        }
        if (z) {
            if (this.n != null) {
                this.n.dismiss();
            }
            this.k = false;
            if (this.i != null) {
                this.i.b();
            }
            if (this.j != null) {
                this.j.setImageResource(R.drawable.switch_action_poi);
                return;
            }
            return;
        }
        f();
        d();
        c();
    }

    public void onResume() {
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        super.onStart();
        this.d.a((b) this);
    }

    public void onStop() {
        super.onStop();
        this.d.b((b) this);
    }
}
