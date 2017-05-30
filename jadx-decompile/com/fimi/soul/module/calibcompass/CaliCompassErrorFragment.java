package com.fimi.soul.module.calibcompass;

import android.app.Activity;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.c.c;
import com.fimi.kernel.d.b;
import com.fimi.kernel.view.percent.PercentRelativeLayout.LayoutParams;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.entity.CheckCampssBeann;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;
import com.google.android.gms.maps.model.LatLng;
import it.a.a.e;
import java.util.List;

public class CaliCompassErrorFragment extends BaseCaliCompassFragment {
    a f;
    private TextView g;
    private Button h;
    private Button i;
    private Button j;
    private Button k;
    private ImageView l;
    private TextView m;
    private TextView n;
    private boolean o;
    private boolean p;
    private boolean q;
    private Handler r = new Handler();
    private Runnable s = new Runnable(this) {
        final /* synthetic */ CaliCompassErrorFragment a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.getActivity().setResult(0);
            this.a.getActivity().finish();
        }
    };
    private int t;

    interface a {
        void c();

        void d();
    }

    private void a(View view) {
        this.l = (ImageView) view.findViewById(R.id.tagIcon);
        this.g = (TextView) view.findViewById(R.id.heardView).findViewById(R.id.tv_settingTitle);
        this.g.setText(R.string.calicompassesucess);
        this.h = (Button) view.findViewById(R.id.heardView).findViewById(R.id.black_btn);
        this.h.setOnClickListener(this);
        this.i = (Button) view.findViewById(R.id.quit);
        this.i.setOnClickListener(this);
        this.j = (Button) view.findViewById(R.id.again);
        this.j.setOnClickListener(this);
        this.k = (Button) view.findViewById(R.id.sucesscomplete);
        this.k.setOnClickListener(this);
        this.m = (TextView) view.findViewById(R.id.destitle);
        this.n = (TextView) view.findViewById(R.id.calireason);
        a(this.i, 128);
        a(this.j, e.F);
        ao.a(getActivity().getAssets(), this.g, this.h, this.i, this.j, this.k, this.m, this.n);
    }

    private void b() {
        this.i.setVisibility(0);
        this.j.setVisibility(0);
        this.k.setVisibility(8);
    }

    private void c() {
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.k.setVisibility(0);
    }

    private void d() {
        new AsyncTask<Void, Void, Void>(this) {
            final /* synthetic */ CaliCompassErrorFragment a;

            {
                this.a = r1;
            }

            protected Void a(Void... voidArr) {
                Object obj;
                List listLatlng;
                CheckCampssBeann checkCampssBeann = (CheckCampssBeann) c.a().a(com.fimi.soul.drone.g.c.Z, CheckCampssBeann.class);
                if (checkCampssBeann != null) {
                    obj = checkCampssBeann;
                    listLatlng = checkCampssBeann.getListLatlng();
                } else {
                    obj = new CheckCampssBeann();
                    listLatlng = obj.getListLatlng();
                }
                Location c = MyLocationManager.a(this.a.getActivity()).c();
                if (c != null) {
                    listLatlng.add(new LatLng(c.getLatitude(), c.getLongitude()));
                    obj.setListLatlng(listLatlng);
                    c.a().a(com.fimi.soul.drone.g.c.Z, obj);
                }
                return null;
            }

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return a((Void[]) objArr);
            }
        }.execute(new Void[0]);
    }

    public void a() {
        d.a(this.b).a((byte) 1, (byte) 1, (byte) 4);
        getActivity().finish();
    }

    public void a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
    }

    public void a(String str, boolean z, boolean z2) {
        this.p = z;
        this.q = z2;
        if (true == z) {
            this.m.setText(R.string.calisucess);
            this.n.setText(str);
            LayoutParams layoutParams = (LayoutParams) this.l.getLayoutParams();
            layoutParams.setMargins(0, (int) (((float) this.t) * 0.1111f), 0, 0);
            this.l.setLayoutParams(layoutParams);
            this.l.setImageResource(R.drawable.icon_calibration_succeed);
            c();
            d();
            return;
        }
        this.m.setText(R.string.califail);
        this.n.setText(str);
        layoutParams = (LayoutParams) this.l.getLayoutParams();
        layoutParams.setMargins(0, (int) (((float) this.t) * 0.12592f), 0, 0);
        this.l.setLayoutParams(layoutParams);
        this.l.setImageResource(R.drawable.icon_calibration_defeat);
        b();
    }

    public void a(boolean z) {
        this.o = z;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f = (a) activity;
    }

    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.quit:
                if (this.f != null) {
                    this.f.d();
                    return;
                }
                return;
            case R.id.again:
                if (this.f != null) {
                    this.f.c();
                    return;
                }
                return;
            case R.id.sucesscomplete:
                this.r.postDelayed(this.s, 300);
                return;
            case R.id.black_btn:
                this.r.postDelayed(this.s, 300);
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.t = displayMetrics.heightPixels;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.caliremotesucess, null);
        a(inflate);
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        if (this.f != null) {
            this.f = null;
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z && isVisible()) {
            if (this.p) {
                b.b(getActivity()).a(getString(R.string.calisucess));
            } else if (!this.q) {
                b.b(getActivity()).a(getString(R.string.calibration_failure));
            }
        }
    }
}
