package com.fimi.soul.module.droneFragment;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.c.d;
import com.fimi.soul.biz.c.j;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.y;
import com.fimi.soul.view.MyEditView;
import com.fimi.soul.view.MyEditView.b;
import com.fimi.soul.view.myhorizontalseebar.SeekBar;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.c;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.i;
import it.a.a.e;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public class f implements OnClickListener, OnTouchListener {
    private boolean A;
    private boolean B;
    private boolean C;
    private com.fimi.soul.drone.a D;
    private int E;
    private c F;
    private d G;
    private g H;
    private g I;
    private com.google.android.gms.maps.c J;
    private i K;
    private int L;
    private int M = 5;
    private int N = 120;
    private int O = 10;
    private int P = 1;
    private int Q = e.n;
    private int R = 5;
    private int S = 360;
    private int T = 0;
    private String U;
    private SeekBar[] V;
    private float W;
    private float X;
    EditText[] a;
    InputMethodManager b;
    private MyEditView c;
    private MyEditView d;
    private MyEditView e;
    private MyEditView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private SeekBar l;
    private SeekBar m;
    private SeekBar n;
    private SeekBar o;
    private RadioGroup p;
    private Context q;
    private PercentRelativeLayout r;
    private RadioButton s;
    private RadioButton t;
    private Button u;
    private Button v;
    private Button w;
    private PopupWindow x;
    private String[] y;
    private boolean z;

    class a extends BaseAdapter {
        final /* synthetic */ f a;
        private Context b;
        private String[] c;

        public a(f fVar, Context context, String[] strArr) {
            this.a = fVar;
            this.b = context;
            this.c = strArr;
        }

        public int getCount() {
            return this.c == null ? 0 : this.c.length;
        }

        public Object getItem(int i) {
            return this.c == null ? null : this.c[i];
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.mysimple_spinner_dropdown_item, null);
            TextView textView = (TextView) inflate.findViewById(R.id.itemangle);
            LayoutParams layoutParams = (LayoutParams) textView.getLayoutParams();
            if (this.a.x != null) {
                layoutParams.width = this.a.x.getWidth();
            }
            textView.setLayoutParams(layoutParams);
            textView.setText(this.c[i]);
            ao.a(this.b.getAssets(), textView);
            return inflate;
        }
    }

    public f(View view, com.fimi.soul.drone.a aVar) {
        this.b = (InputMethodManager) aVar.d.getSystemService("input_method");
        this.L = aVar.d.getResources().getDisplayMetrics().heightPixels / 3;
        this.D = aVar;
        this.J = aVar.aa();
        this.q = aVar.d;
        this.G = d.k();
        this.y = this.q.getResources().getStringArray(R.array.drone_head);
        this.i = (TextView) view.findViewById(R.id.pointheight);
        this.j = (TextView) view.findViewById(R.id.pointsppek);
        this.k = (TextView) view.findViewById(R.id.pointridus);
        this.f = (MyEditView) view.findViewById(R.id.poianglevalue);
        this.h = (TextView) view.findViewById(R.id.poiangle);
        this.o = (SeekBar) view.findViewById(R.id.angle_seebar_value);
        this.o.setMax(this.S);
        this.o.setOnSeekBarChangeListener(new com.fimi.soul.view.myhorizontalseebar.SeekBar.a(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void a(SeekBar seekBar) {
                this.a.C = true;
            }

            public void a(SeekBar seekBar, int i, boolean z) {
                if (this.a.C) {
                    FlyActionBean j = this.a.G.j();
                    if (j != null) {
                        this.a.f.setText(i + "°");
                        j.setStart_point_agle((short) i);
                        this.a.a(false);
                    }
                }
            }

            public void b(SeekBar seekBar) {
                this.a.C = false;
            }
        });
        this.w = (Button) view.findViewById(R.id.setPoi);
        this.w.setOnClickListener(this);
        this.g = (TextView) view.findViewById(R.id.spend_time);
        this.v = (Button) view.findViewById(R.id.delete_poi);
        this.v.setOnClickListener(this);
        this.u = (Button) view.findViewById(R.id.myspinner);
        this.u.setText(this.y[0]);
        this.u.setOnClickListener(this);
        this.p = (RadioGroup) view.findViewById(R.id.drone_direction);
        this.s = (RadioButton) view.findViewById(R.id.clockwise);
        this.t = (RadioButton) view.findViewById(R.id.anticlockwise);
        this.p.setOnCheckedChangeListener(new OnCheckedChangeListener(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                FlyActionBean j = this.a.G.j();
                if (j != null) {
                    switch (i) {
                        case R.id.clockwise:
                            j.setPara1(3);
                            break;
                        case R.id.anticlockwise:
                            j.setPara1(1);
                            break;
                    }
                    this.a.f();
                    this.a.a(false);
                }
            }
        });
        this.p.check(R.id.clockwise);
        this.r = (PercentRelativeLayout) view.findViewById(R.id.poi_operaRL);
        this.c = (MyEditView) view.findViewById(R.id.poi_height_value);
        this.d = (MyEditView) view.findViewById(R.id.poispeek);
        this.e = (MyEditView) view.findViewById(R.id.poiridusvalue);
        this.l = (SeekBar) view.findViewById(R.id.height_seebar_value);
        this.m = (SeekBar) view.findViewById(R.id.speek_seebar_value);
        this.n = (SeekBar) view.findViewById(R.id.ridus_seebar_value);
        this.n.setMax(this.Q);
        this.m.setMax(this.O);
        this.l.setMax(this.N);
        this.l.setOnSeekBarChangeListener(new com.fimi.soul.view.myhorizontalseebar.SeekBar.a(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void a(SeekBar seekBar) {
                this.a.z = true;
            }

            public void a(SeekBar seekBar, int i, boolean z) {
                if (this.a.z) {
                    FlyActionBean j = this.a.G.j();
                    if (j != null) {
                        if (i < this.a.M) {
                            i = this.a.M;
                        }
                        this.a.c.setText(i + "m");
                        j.setHeight(i);
                        for (g gVar : d.k().e()) {
                            if (gVar.o().equals(j)) {
                                gVar.a(j.a(this.a.q, j.getDrawableRes(), j.getHeight(), true));
                                return;
                            }
                        }
                    }
                }
            }

            public void b(SeekBar seekBar) {
                this.a.z = false;
            }
        });
        this.m.setOnSeekBarChangeListener(new com.fimi.soul.view.myhorizontalseebar.SeekBar.a(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void a(SeekBar seekBar) {
                this.a.A = true;
            }

            public void a(SeekBar seekBar, int i, boolean z) {
                if (this.a.A) {
                    FlyActionBean j = this.a.G.j();
                    if (j != null) {
                        if (i < this.a.P) {
                            i = this.a.P;
                        }
                        this.a.d.setText(i + "m/s");
                        j.setSpeek(i);
                        this.a.o();
                    }
                }
            }

            public void b(SeekBar seekBar) {
                this.a.A = false;
                if (((double) this.a.n.getProgress()) * 1.5d < ((double) (seekBar.getProgress() * seekBar.getProgress()))) {
                    int progress = ((int) (((double) (seekBar.getProgress() * seekBar.getProgress())) / 1.5d)) + 1;
                    if (progress < this.a.R) {
                        progress = this.a.R;
                    }
                    this.a.n.setProgress(progress);
                    this.a.e.setText(progress + "m");
                    FlyActionBean j = this.a.G.j();
                    if (j != null) {
                        j.setRidus(progress);
                        this.a.b(j);
                        this.a.a(false);
                    }
                }
            }
        });
        this.n.setOnSeekBarChangeListener(new com.fimi.soul.view.myhorizontalseebar.SeekBar.a(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void a(SeekBar seekBar) {
                this.a.B = true;
                this.a.E = ((int) (((double) (this.a.m.getProgress() * this.a.m.getProgress())) / 1.5d)) + 1;
                if (this.a.E < this.a.P) {
                    this.a.E = this.a.P;
                }
            }

            public void a(SeekBar seekBar, int i, boolean z) {
                if (this.a.B) {
                    FlyActionBean j = this.a.G.j();
                    if (j != null) {
                        if (i <= this.a.E) {
                            i = this.a.E;
                        }
                        if (i < this.a.R) {
                            i = this.a.R;
                        }
                        this.a.e.setText(i + "m");
                        j.setRidus(i);
                        this.a.b(j);
                        this.a.a(false);
                        this.a.o();
                    }
                }
            }

            public void b(SeekBar seekBar) {
                this.a.B = false;
                if (((double) this.a.n.getProgress()) * 1.5d < ((double) (seekBar.getProgress() * seekBar.getProgress()))) {
                    int sqrt = (int) Math.sqrt(((double) this.a.n.getProgress()) * 1.5d);
                    if (sqrt >= this.a.O) {
                        sqrt = this.a.O;
                    }
                    this.a.m.setMax(sqrt);
                    if (this.a.m.getProgress() >= sqrt) {
                        this.a.m.setProgress(sqrt);
                        this.a.d.setText(sqrt + "m/s");
                    }
                }
            }
        });
        ao.b(this.q.getAssets(), this.f, this.c, this.d, this.e);
        ao.a(this.q.getAssets(), this.j, this.k, this.i, this.s, this.t, this.g, this.h);
        this.a = new EditText[]{this.c, this.d, this.e, this.f};
        for (EditText editText : this.a) {
            editText.setInputType(2);
            editText.clearFocus();
        }
        this.c.setOnFocusChangeListener(new OnFocusChangeListener(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    this.a.U = this.a.c.getText().toString();
                } else {
                    this.a.a(this.a.c, this.a.N, this.a.M, this.a.l, "m");
                }
            }
        });
        this.d.setOnFocusChangeListener(new OnFocusChangeListener(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    this.a.U = this.a.d.getText().toString();
                    return;
                }
                try {
                    int sqrt = (int) Math.sqrt(((double) Integer.parseInt(f.b(this.a.e.getText().toString()))) * 1.5d);
                    if (sqrt >= this.a.O) {
                        sqrt = this.a.O;
                    }
                    if (sqrt == 0) {
                        this.a.a(this.a.d, this.a.m.getMax(), this.a.P, this.a.m, "m/s");
                    } else {
                        this.a.a(this.a.d, sqrt, this.a.P, this.a.m, "m/s");
                    }
                } catch (Exception e) {
                }
            }
        });
        this.e.setOnFocusChangeListener(new OnFocusChangeListener(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    this.a.U = this.a.e.getText().toString();
                } else {
                    this.a.a(this.a.e, this.a.n.getMax(), this.a.R, this.a.n, "m");
                }
            }
        });
        this.f.setOnFocusChangeListener(new OnFocusChangeListener(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    this.a.U = this.a.f.getText().toString();
                } else {
                    this.a.a(this.a.f, this.a.S, this.a.T, this.a.o, "°");
                }
            }
        });
        this.c.setOnFinishComposingListener(new b(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.c.clearFocus();
            }
        });
        this.d.setOnFinishComposingListener(new b(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.d.clearFocus();
            }
        });
        this.e.setOnFinishComposingListener(new b(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.e.clearFocus();
            }
        });
        this.f.setOnFinishComposingListener(new b(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.f.clearFocus();
            }
        });
        this.V = new SeekBar[]{this.l, this.m, this.n, this.o};
        for (SeekBar onTouchListener : this.V) {
            onTouchListener.setOnTouchListener(this);
        }
    }

    private void a(FlyActionBean flyActionBean, com.google.android.gms.maps.c cVar, boolean z) {
        LatLng a = z ? a(flyActionBean, (double) flyActionBean.getStart_point_agle()) : a(flyActionBean, (double) (-flyActionBean.getStart_point_agle()));
        if (a != null) {
            if (this.H == null) {
                this.H = cVar.a(new MarkerOptions().a(a).a(j.a(R.drawable.icn_rotate_point)));
                this.H.a(10000.0f);
                this.H.a(0.5f, 0.5f);
                this.H.a(false);
                this.H.b(p());
            } else {
                this.H.a(a);
                this.H.b(p());
            }
        }
        k();
    }

    private void a(MyEditView myEditView, int i, int i2, SeekBar seekBar, String str) {
        try {
            String str2;
            String a = a(b(myEditView.getText().toString()));
            int parseInt = Integer.parseInt(a);
            if (parseInt > i) {
                str2 = i + str;
                myEditView.setText(str2);
            } else if (parseInt < i2) {
                str2 = i2 + str;
                myEditView.setText(str2);
                i = i2;
            } else {
                i = parseInt;
                str2 = a;
            }
            seekBar.setProgress(Integer.valueOf(i).intValue());
            if (!str2.contains(str)) {
                myEditView.setText(str2 + str);
            }
            FlyActionBean j = this.G.j();
            if (seekBar == this.o) {
                j.setStart_point_agle((short) i);
                a(false);
            } else if (seekBar == this.m) {
                j.setSpeek(i);
                o();
            } else if (seekBar == this.l) {
                j.setHeight(i);
                for (g gVar : d.k().e()) {
                    if (gVar.o().equals(j)) {
                        gVar.a(j.a(this.q, j.getDrawableRes(), j.getHeight(), true));
                        return;
                    }
                }
            } else if (seekBar == this.n) {
                j.setRidus(i);
                b(j);
                a(false);
                o();
            }
        } catch (Exception e) {
            if (this.U != null) {
                myEditView.setText(this.U);
                this.U = " ";
            }
        }
    }

    public static String b(String str) {
        return Pattern.compile("[^0-9]").matcher(str).replaceAll("").trim();
    }

    private void b(FlyActionBean flyActionBean, com.google.android.gms.maps.c cVar, boolean z) {
        LatLng a = z ? a(flyActionBean, (double) (flyActionBean.getStart_point_agle() + 90)) : a(flyActionBean, (double) (270 - flyActionBean.getStart_point_agle()));
        if (a == null) {
            return;
        }
        if (this.I == null) {
            this.I = cVar.a(new MarkerOptions().a(a).a(j.a(R.drawable.icon_fly_direction)));
            this.I.a(10000.0f);
            if (z) {
                this.I.b(((float) (flyActionBean.getStart_point_agle() + Opcodes.GETFIELD)) + cVar.a().d);
            } else {
                this.I.b(((float) ((-flyActionBean.getStart_point_agle()) - 180)) + cVar.a().d);
            }
            this.I.a(0.5f, 0.5f);
            return;
        }
        this.I.a(a);
        if (z) {
            this.I.b(((float) (flyActionBean.getStart_point_agle() + Opcodes.GETFIELD)) + p());
        } else {
            this.I.b(((float) ((-flyActionBean.getStart_point_agle()) - 180)) + p());
        }
    }

    private void k() {
        FlyActionBean j = d.k().j();
        if (this.H != null && j != null) {
            if (this.K == null) {
                this.K = this.J.a(new PolylineOptions().a(new LatLng[]{this.H.c(), j.getLatLng()}).a(this.D.d.getResources().getColor(R.color.ridus_color)).a(4.0f));
                return;
            }
            List arrayList = new ArrayList();
            arrayList.add(j.getLatLng());
            arrayList.add(this.H.c());
            this.K.a(arrayList);
        }
    }

    private double l() {
        return y.c(new LatLng(this.D.v().b(), this.D.v().c()), new LatLng(this.D.u().e(), this.D.u().d())).a();
    }

    private void m() {
        if (this.x == null) {
            this.u.setBackgroundResource(R.drawable.bg_fly_combobox_more_up);
            View inflate = LayoutInflater.from(this.q).inflate(R.layout.myspinner_item, null);
            ListView listView = (ListView) inflate.findViewById(R.id.list_head_angle);
            listView.setAdapter(new a(this, this.q, this.y));
            listView.setSelection(1);
            listView.setOnItemClickListener(new OnItemClickListener(this) {
                final /* synthetic */ f a;

                {
                    this.a = r1;
                }

                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    FlyActionBean j2 = d.k().j();
                    this.a.u.setText((String) adapterView.getItemAtPosition(i));
                    if (i == 0) {
                        i++;
                    } else if (i == 1) {
                        i--;
                    }
                    if (j2 != null) {
                        j2.setYaw_mode(i);
                    }
                    this.a.x.dismiss();
                    this.a.u.setBackgroundResource(R.drawable.bg_fly_combobox_more_down);
                }
            });
            this.x = new PopupWindow(listView, this.u.getWidth(), this.u.getHeight() * 4);
            this.x.setContentView(inflate);
            this.x.showAsDropDown(this.u, 0, com.fimi.soul.utils.g.b(this.q, -8.0f));
            this.x.setOutsideTouchable(true);
            this.x.setTouchable(true);
            this.x.setFocusable(true);
            this.x.setBackgroundDrawable(new BitmapDrawable());
            this.x.setOnDismissListener(new OnDismissListener(this) {
                final /* synthetic */ f a;

                {
                    this.a = r1;
                }

                public void onDismiss() {
                    this.a.u.setBackgroundResource(R.drawable.bg_fly_combobox_more_down);
                }
            });
        } else if (this.x.isShowing()) {
            this.x.dismiss();
            this.u.setBackgroundResource(R.drawable.bg_fly_combobox_more_down);
        } else {
            this.u.setBackgroundResource(R.drawable.bg_fly_combobox_more_up);
            this.x.showAsDropDown(this.u, 0, com.fimi.soul.utils.g.b(this.q, -8.0f));
        }
    }

    private void n() {
        this.r.getWidth();
        FlyActionBean j = this.G.j();
        int i = this.q.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.q.getResources().getDisplayMetrics().heightPixels;
        com.google.android.gms.maps.c aa = this.D.aa();
        if (aa != null) {
            Point a = aa.n().a(j.getLatLng());
            if (a.x > i / 2) {
                aa.a(com.google.android.gms.maps.b.a(aa.n().a(new Point((i / 2) + (a.x - (i / 3)), i2 / 2))));
            }
        }
        b(j);
    }

    private void o() {
        FlyActionBean j = d.k().j();
        if (this.F != null && j != null) {
            int d = (int) (((this.F.d() * 2.0d) * 3.141592653589793d) / ((double) j.getSpeek()));
            this.g.setText(String.format(this.q.getString(R.string.spend_timereminder), new Object[]{Integer.valueOf(d)}));
        }
    }

    private synchronized float p() {
        float f = 0.0f;
        synchronized (this) {
            try {
                CameraPosition a = this.J.a();
                if (a != null) {
                    f = a.d;
                }
            } catch (Exception e) {
            }
        }
        return f;
    }

    public LatLng a(FlyActionBean flyActionBean, double d) {
        return (flyActionBean == null || this.F == null) ? null : y.a(flyActionBean.getLatLng(), d, this.F.d());
    }

    public String a(String str) {
        return BigDecimal.valueOf((long) Integer.parseInt(str)).stripTrailingZeros().toPlainString();
    }

    public void a() {
        if (!this.w.isShown()) {
            this.w.setVisibility(0);
            z.a(this.q, (int) R.string.set_poi_tip, 1500);
        }
    }

    public void a(FlyActionBean flyActionBean) {
        if (this.u.getText().toString().equals(this.y[0])) {
            flyActionBean.setYaw_mode(1);
        } else if (this.u.getText().toString().equals(this.y[1])) {
            flyActionBean.setYaw_mode(0);
        } else if (this.u.getText().toString().equals(this.y[2])) {
            flyActionBean.setYaw_mode(2);
        } else if (this.u.getText().toString().equals(this.y[3])) {
            flyActionBean.setYaw_mode(3);
        } else if (this.u.getText().toString().equals(this.y[4])) {
            flyActionBean.setYaw_mode(4);
        }
        switch (this.p.getCheckedRadioButtonId()) {
            case R.id.clockwise:
                flyActionBean.setPara1(3);
                break;
            case R.id.anticlockwise:
                flyActionBean.setPara1(1);
                break;
        }
        f();
        o();
    }

    public void a(boolean z) {
        FlyActionBean j = this.G.j();
        this.J = this.D.aa();
        if (j != null && this.J != null) {
            switch (this.p.getCheckedRadioButtonId()) {
                case R.id.clockwise:
                    if (!z) {
                        a(j, this.J, true);
                    }
                    b(j, this.J, true);
                    return;
                case R.id.anticlockwise:
                    if (!z) {
                        a(j, this.J, false);
                    }
                    b(j, this.J, false);
                    return;
                default:
                    return;
            }
        }
    }

    public void b() {
        if (this.r.isShown()) {
            this.r.setVisibility(8);
        }
    }

    public void b(FlyActionBean flyActionBean) {
        this.J = this.D.aa();
        if (this.J != null && flyActionBean != null) {
            if (this.F == null) {
                this.F = this.J.a(new CircleOptions().a((double) flyActionBean.getRidus()).a(4.0f).a(this.q.getResources().getColor(R.color.ridus_color)).a(this.G.j().getLatLng()));
                this.G.a(this.F);
                return;
            }
            this.F.a((double) flyActionBean.getRidus());
        }
    }

    public void c() {
        if (!this.r.isShown()) {
            this.r.setVisibility(0);
        }
    }

    public void d() {
        b();
        if (this.x != null && this.x.isShowing()) {
            this.x.dismiss();
            this.u.setBackgroundResource(R.drawable.bg_fly_combobox_more_down);
        }
        if (this.F != null) {
            this.F.a();
            this.F = null;
        }
        if (this.H != null) {
            this.H.a();
            this.H = null;
        }
        if (this.I != null) {
            this.I.a();
            this.I = null;
        }
        if (this.K != null) {
            this.K.a();
            this.K = null;
        }
    }

    public void e() {
        if (this.w.isShown()) {
            this.w.setVisibility(8);
        }
    }

    public void f() {
        if (this.s.isChecked()) {
            this.s.setTextColor(this.q.getResources().getColor(R.color.color_height));
            this.t.setTextColor(this.q.getResources().getColor(R.color.black));
            return;
        }
        this.t.setTextColor(this.q.getResources().getColor(R.color.color_height));
        this.s.setTextColor(this.q.getResources().getColor(R.color.black));
    }

    public void g() {
        c();
        n();
        h();
    }

    public void h() {
        FlyActionBean j = d.k().j();
        if (j != null) {
            double l = l();
            if (((double) this.Q) - l < ((double) this.R)) {
                z.a(this.q, (int) R.string.cant_setPoi, 3000);
                return;
            }
            this.l.setProgress(j.getHeight());
            this.m.setProgress(j.getSpeek());
            this.n.setProgress(j.getRidus());
            this.o.setProgress(j.getStart_point_agle());
            this.n.setMax((int) (((double) this.Q) - l));
            this.c.setText(j.getHeight() + "m");
            this.d.setText(j.getSpeek() + "m/s");
            this.e.setText(j.getRidus() + "m");
            this.f.setText(j.getStart_point_agle() + "°");
            if (j.getPara1() == 0 || j.getPara1() == 1) {
                this.p.check(this.t.getId());
            } else if (j.getPara1() == 2 || j.getPara1() == 3) {
                this.p.check(this.s.getId());
            }
            a(j);
            a(false);
            k();
        }
    }

    public synchronized void i() {
        double d = 0.0d;
        synchronized (this) {
            FlyActionBean j = d.k().j();
            if (!(this.F == null || this.H == null || j == null)) {
                j.setRidus((int) y.c(j.getLatLng(), this.H.c()).a());
                b(j);
                LatLng a = a(j, 0.0d);
                switch (this.p.getCheckedRadioButtonId()) {
                    case R.id.clockwise:
                        d = y.d(a, this.H.c());
                        break;
                    case R.id.anticlockwise:
                        d = ((double) this.S) - y.d(a, this.H.c());
                        break;
                }
                j.setStart_point_agle((short) ((int) d));
                this.f.setText(((int) d) + "deg");
                a(false);
            }
        }
    }

    public void j() {
        if (this.x != null && this.x.isShowing()) {
            this.x.dismiss();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.myspinner:
                m();
                return;
            case R.id.delete_poi:
                d();
                this.D.a(com.fimi.soul.drone.d.a.CLEARDATA);
                a();
                return;
            case R.id.setPoi:
                this.D.a(com.fimi.soul.drone.d.a.CREATEPOI);
                this.w.setVisibility(8);
                return;
            default:
                return;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.W = motionEvent.getX();
                this.X = motionEvent.getY();
                break;
            case 1:
                view.getParent().requestDisallowInterceptTouchEvent(false);
                break;
            case 2:
                if (Math.abs(view.getX() - this.W) >= Math.abs(view.getY() - this.X)) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
        }
        return false;
    }
}
