package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.g.c;
import com.fimi.soul.drone.h.g;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.e;
import com.fimi.soul.view.f.a;

public class ShowDroneControlFragment extends Fragment implements OnClickListener, b {
    private ImageView A;
    private ImageView B;
    private a C;
    private Dialog D;
    private PercentRelativeLayout a;
    private PercentRelativeLayout b;
    private PercentRelativeLayout c;
    private PercentRelativeLayout d;
    private PercentRelativeLayout e;
    private PercentRelativeLayout f;
    private PercentRelativeLayout g;
    private ImageButton h;
    private Context i;
    private DroidPlannerApp j;
    private com.fimi.soul.drone.a k;
    private d l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private int t;
    private int u = 20;
    private ImageView v;
    private ImageView w;
    private ImageView x;
    private ImageView y;
    private ImageView z;

    private void a(int i, int i2) {
        if (!this.k.T().a() || !this.k.U()) {
            return;
        }
        if (this.k.ac()) {
            a(0.3f, false, this.y, this.m);
            a(1.0f, false, this.a);
            if (this.k.aj().g().isLightStream() || this.k.aj().g().isEnforcementAtti()) {
                if (this.k.aj().g().isEnforcementAtti()) {
                    a(0.3f, false, this.z, this.n);
                    a(1.0f, false, this.b);
                } else {
                    a(1.0f, true, this.b, this.z, this.n);
                }
                a(0.3f, false, this.w, this.q, this.x, this.r, this.v, this.p, this.A, this.o, this.s, this.B);
                a(1.0f, false, this.f, this.d, this.e, this.f, this.c, this.g);
                return;
            }
            a(1.0f, true, this.A, this.o, this.c, this.b, this.z, this.n);
            if (!this.k.aj().g().judgeNoAction() || this.k.al().c()) {
                a(0.3f, false, this.w, this.x, this.q, this.r, this.p, this.v, this.s, this.B);
                a(1.0f, false, this.d, this.e, this.f, this.g);
                return;
            }
            a(1.0f, true, this.d, this.v, this.p, this.w, this.e, this.q, this.r, this.x, this.f, this.g, this.s, this.B);
            return;
        }
        if (this.k.aj().g().isEnforcementAtti()) {
            a(1.0f, false, this.a);
            a(0.3f, false, this.y, this.m);
        } else {
            a(1.0f, true, this.a, this.y, this.m);
        }
        a(0.3f, false, this.z, this.A, this.o, this.n, this.w, this.x, this.q, this.r, this.v, this.p, this.s, this.B);
        a(1.0f, false, this.b, this.c, this.e, this.f, this.d, this.g);
    }

    public void a() {
        a(1.0f, false, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        a(0.3f, false, this.z, this.y, this.A, this.m, this.o, this.n, this.s);
        a(0.3f, false, this.v, this.p, this.w, this.x, this.q, this.r, this.B);
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

    public void b() {
        int b = com.fimi.soul.module.update.a.a.a().a(0).b();
        if (b > 0 && b < c.bL && !com.fimi.soul.biz.e.d.a().k()) {
            if (this.D == null) {
                e.a aVar = new e.a(getActivity());
                aVar.a(getString(R.string.fc_version_compare_tip));
                aVar.a(false);
                aVar.a(getString(R.string.finish), new DialogInterface.OnClickListener(this) {
                    final /* synthetic */ ShowDroneControlFragment a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                this.D = aVar.a();
                this.D.setCanceledOnTouchOutside(false);
            }
            this.D.show();
        }
    }

    public boolean c() {
        return this.D == null ? false : this.D.isShowing();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.i = activity.getApplicationContext();
        this.j = (DroidPlannerApp) activity.getApplication();
        this.k = this.j.a;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.closebutton:
                this.k.a(com.fimi.soul.drone.d.a.CLOSEDRAWCONTROL);
                return;
            case R.id.takeoffrl:
                h.a(getActivity().getApplicationContext()).a(0);
                if (this.k.ac()) {
                    z.a(getActivity(), (int) R.string.wrongtakeoff, 2000);
                } else {
                    if (this.u == 2) {
                        this.C.a(getString(R.string.takeoffpromptlightstream));
                    } else if (this.u == 1) {
                        this.C.a(getString(R.string.takeoffpromptgps));
                    } else {
                        z.a(getActivity(), (int) R.string.wrongtakeoff, 2000);
                        return;
                    }
                    this.C.b(getString(R.string.ensure), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ ShowDroneControlFragment a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            this.a.l.a();
                            dialogInterface.dismiss();
                        }
                    }).a(getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ ShowDroneControlFragment a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).a().show();
                }
                this.k.a(com.fimi.soul.drone.d.a.CLOSEDRAWCONTROL);
                return;
            case R.id.landingpl:
                h.a(getActivity().getApplicationContext()).a(0);
                if (this.k.ac()) {
                    this.C.a(getString(R.string.landprompt));
                    this.C.b(getString(R.string.ensure), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ ShowDroneControlFragment a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            this.a.l.b();
                            dialogInterface.dismiss();
                        }
                    }).a(getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ ShowDroneControlFragment a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).a().show();
                } else {
                    z.a(getActivity(), (int) R.string.wrongLanding, 2000);
                }
                this.k.a(com.fimi.soul.drone.d.a.CLOSEDRAWCONTROL);
                return;
            case R.id.gohomepl:
                h.a(getActivity().getApplicationContext()).a(0);
                boolean isLightStream = this.k.aj().g().isLightStream();
                double f = (this.k.u().f() - 677216.0d) / 10.0d;
                if (this.k.ac() && !isLightStream) {
                    this.C.a(getString(R.string.gohomeprompt3));
                    this.C.b(getString(R.string.ensure), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ ShowDroneControlFragment a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            this.a.l.c();
                            dialogInterface.dismiss();
                        }
                    }).a(getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ ShowDroneControlFragment a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).a().show();
                } else if (isLightStream) {
                    z.a(getActivity(), (int) R.string.lightstreamgohome, 3000);
                } else {
                    z.a(getActivity(), (int) R.string.wrongbackhome, 2000);
                }
                this.k.a(com.fimi.soul.drone.d.a.CLOSEDRAWCONTROL);
                return;
            case R.id.detoruingpointpl:
                if (this.k.aj().g().isGps()) {
                    b();
                    if (!c()) {
                        com.fimi.soul.biz.c.d.k().a(false);
                        h.a(getActivity().getApplicationContext()).a(3);
                        this.k.a(com.fimi.soul.drone.d.a.CLOSEDRAWCONTROL);
                        return;
                    }
                    return;
                }
                z.a(getActivity(), (int) R.string.cant_action_interest);
                return;
            case R.id.takephonemyselfpl:
                if (!this.k.aj().g().isGps()) {
                    z.a(getActivity(), (int) R.string.cant_action_tajephoto);
                    return;
                } else if (this.k.ad().u()) {
                    z.a(getActivity(), (int) R.string.discongc, 3000);
                    return;
                } else if (this.k.ad().t()) {
                    z.a(getActivity(), (int) R.string.gcunready, 3000);
                    return;
                } else if (com.fimi.soul.biz.e.d.a().m()) {
                    try {
                        g gVar = (g) this.k.c;
                        if (gVar.f() == g.a.NoSDCard) {
                            z.a(getActivity(), (int) R.string.tf_remove_error, 3000);
                            return;
                        } else if (gVar.f() == g.a.FullSDCard) {
                            z.a(getActivity(), (int) R.string.tf_full_error, 3000);
                            return;
                        } else if (gVar.f() == g.a.Error) {
                            z.a(getActivity(), (int) R.string.tf_io_error, 3000);
                            return;
                        } else {
                            if (gVar.f() == g.a.LOW_SPEED_CARD) {
                                z.a(getActivity(), (int) R.string.tf_low_speed_error, 3000);
                                return;
                            }
                            b();
                            if (!c()) {
                                h.a(getActivity().getApplicationContext()).a(4);
                                this.k.a(com.fimi.soul.drone.d.a.CLOSEDRAWCONTROL);
                                return;
                            }
                            return;
                        }
                    } catch (Exception e) {
                    }
                } else {
                    z.a(getActivity(), (int) R.string.no_connect_camera, 3000);
                    return;
                }
            case R.id.setwaypointpl:
                if (this.k.aj().g().isGps()) {
                    b();
                    if (!c()) {
                        com.fimi.soul.biz.c.d.k().a(false);
                        h.a(getActivity().getApplicationContext()).a(1);
                        this.k.a(com.fimi.soul.drone.d.a.CLOSEDRAWCONTROL);
                        return;
                    }
                    return;
                }
                z.a(getActivity(), (int) R.string.cant_action_waypoint);
                return;
            case R.id.setdestination:
                if (this.k.aj().g().isGps()) {
                    b();
                    if (!c()) {
                        com.fimi.soul.biz.c.d.k().a(false);
                        h.a(getActivity().getApplicationContext()).a(2);
                        this.k.a(com.fimi.soul.drone.d.a.CLOSEDRAWCONTROL);
                        return;
                    }
                    return;
                }
                z.a(getActivity(), (int) R.string.cant_action_flyto);
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.C = new a(getActivity());
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dronecontrol, null);
        this.g = (PercentRelativeLayout) inflate.findViewById(R.id.takephonemyselfpl);
        this.s = (TextView) inflate.findViewById(R.id.takephonetext);
        this.B = (ImageView) inflate.findViewById(R.id.takephoneicon);
        this.h = (ImageButton) inflate.findViewById(R.id.closebutton);
        this.a = (PercentRelativeLayout) inflate.findViewById(R.id.takeoffrl);
        this.b = (PercentRelativeLayout) inflate.findViewById(R.id.landingpl);
        this.c = (PercentRelativeLayout) inflate.findViewById(R.id.gohomepl);
        this.d = (PercentRelativeLayout) inflate.findViewById(R.id.detoruingpointpl);
        this.e = (PercentRelativeLayout) inflate.findViewById(R.id.setwaypointpl);
        this.f = (PercentRelativeLayout) inflate.findViewById(R.id.setdestination);
        for (View onClickListener : new View[]{this.g, this.a, this.b, this.c, this.d, this.e, this.f, this.h}) {
            onClickListener.setOnClickListener(this);
        }
        this.l = d.a(this.k);
        this.m = (TextView) inflate.findViewById(R.id.takeofftext);
        this.o = (TextView) inflate.findViewById(R.id.gohometext);
        this.n = (TextView) inflate.findViewById(R.id.landingtext);
        this.p = (TextView) inflate.findViewById(R.id.controlfourtext);
        this.q = (TextView) inflate.findViewById(R.id.waypointtext);
        this.r = (TextView) inflate.findViewById(R.id.targetplacetext);
        ao.a(getActivity().getAssets(), this.m, this.o, this.p, this.q, this.r, this.s, this.n);
        this.y = (ImageView) inflate.findViewById(R.id.takeofficon);
        this.z = (ImageView) inflate.findViewById(R.id.landingicon);
        this.A = (ImageView) inflate.findViewById(R.id.gohomeicon);
        this.v = (ImageView) inflate.findViewById(R.id.detoruingpointicon);
        this.w = (ImageView) inflate.findViewById(R.id.setwaypointicon);
        this.x = (ImageView) inflate.findViewById(R.id.setdestinationicon);
        a();
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.k.b((b) this);
        if (this.D != null) {
            this.D = null;
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.k.b((b) this);
        if (this.C != null) {
            this.C = null;
        }
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        switch (aVar) {
            case HEARDATA:
                this.t = aVar2.aj().e();
                this.u = aVar2.aj().d();
                a(this.t, this.u);
                return;
            case CLEANALLOBJ:
                a();
                return;
            case Remotecontrol:
                if (!aVar2.U()) {
                    a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        super.onStart();
        this.k.a((b) this);
    }
}
