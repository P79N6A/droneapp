package com.fimi.soul.module.droneFragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.c.d;
import com.fimi.soul.biz.c.j;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.MyEditView;
import com.fimi.soul.view.MyEditView.b;
import com.fimi.soul.view.myhorizontalseebar.SeekBar;
import com.google.android.gms.maps.model.g;
import java.math.BigDecimal;
import java.util.regex.Pattern;

public class a implements OnClickListener {
    private PercentRelativeLayout a;
    private SeekBar b;
    private SeekBar c;
    private com.fimi.soul.drone.a d;
    private TextView e;
    private TextView f;
    private MyEditView g;
    private MyEditView h;
    private int i = 1;
    private int j = 8;
    private int k = 120;
    private int l = 5;
    private String m = "m";
    private String n = "m/s";
    private String o;
    private Button p;

    public a(com.fimi.soul.drone.a aVar, View view) {
        this.d = aVar;
        a(view);
    }

    private void a(View view) {
        this.p = (Button) view.findViewById(R.id.delete_operaActon);
        this.p.setOnClickListener(this);
        this.a = (PercentRelativeLayout) view.findViewById(R.id.changgeHeight_view);
        this.b = (SeekBar) view.findViewById(R.id.height_seebar);
        this.b.setMax(this.k);
        this.b.setOnSeekBarChangeListener(new com.fimi.soul.view.myhorizontalseebar.SeekBar.a(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void a(SeekBar seekBar) {
            }

            public void a(SeekBar seekBar, int i, boolean z) {
                if (i < this.a.l) {
                    i = this.a.l;
                }
                this.a.g.setText(i + this.a.m);
                this.a.b(i);
            }

            public void b(SeekBar seekBar) {
            }
        });
        this.c = (SeekBar) view.findViewById(R.id.speek_seebar);
        this.c.setMax(this.j);
        this.c.setOnSeekBarChangeListener(new com.fimi.soul.view.myhorizontalseebar.SeekBar.a(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void a(SeekBar seekBar) {
            }

            public void a(SeekBar seekBar, int i, boolean z) {
                if (i < this.a.i) {
                    i = this.a.i;
                }
                FlyActionBean j = d.k().j();
                if (j != null) {
                    j.setSpeek(i);
                }
                d.k().b(i);
                this.a.h.setText(i + this.a.n);
            }

            public void b(SeekBar seekBar) {
            }
        });
        this.e = (TextView) view.findViewById(R.id.pointheight);
        this.f = (TextView) view.findViewById(R.id.pointsppek);
        this.g = (MyEditView) view.findViewById(R.id.poi_height);
        this.g.setInputType(2);
        this.g.setOnFinishComposingListener(new b(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.g.clearFocus();
            }
        });
        this.g.setOnFocusChangeListener(new OnFocusChangeListener(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    this.a.o = this.a.g.getText().toString();
                } else {
                    this.a.a(this.a.g, this.a.k, this.a.l, this.a.b, this.a.m);
                }
            }
        });
        this.h = (MyEditView) view.findViewById(R.id.poi_speek);
        this.h.setInputType(2);
        this.h.setOnFinishComposingListener(new b(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.h.clearFocus();
            }
        });
        this.h.setOnFocusChangeListener(new OnFocusChangeListener(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    this.a.o = this.a.h.getText().toString();
                } else {
                    this.a.a(this.a.h, this.a.j, this.a.i, this.a.c, this.a.n);
                }
            }
        });
        ao.a(this.d.d.getAssets(), this.e, this.f, this.p, this.g, this.h);
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
            seekBar.setProgress(i);
            if (!str2.contains(str)) {
                myEditView.setText(str2 + str);
            }
            FlyActionBean j = d.k().j();
            if (seekBar == this.b) {
                j.setHeight(i);
                b(i);
            } else if (seekBar == this.c) {
                j.setSpeek(i);
            }
        } catch (Exception e) {
            if (this.o != null) {
                myEditView.setText(this.o);
                this.o = " ";
            }
        }
    }

    public static String b(String str) {
        return Pattern.compile("[^0-9]").matcher(str).replaceAll("").trim();
    }

    public String a(String str) {
        return BigDecimal.valueOf((long) Integer.parseInt(str)).stripTrailingZeros().toPlainString();
    }

    public void a() {
        if (!this.a.isShown()) {
            this.a.setVisibility(0);
        }
    }

    public void a(int i) {
        this.b.setProgress(i);
    }

    public void b() {
        if (this.a.isShown()) {
            this.a.setVisibility(4);
        }
    }

    public void b(int i) {
        FlyActionBean j = d.k().j();
        if (j != null) {
            d.k().a(i);
            j.setHeight(i);
            for (g gVar : d.k().e()) {
                FlyActionBean flyActionBean = (FlyActionBean) gVar.o();
                if (flyActionBean != null && flyActionBean.equals(j)) {
                    gVar.a(j.a(this.d.d, j.getDrawableRes(), j.getHeight(), true));
                    return;
                }
            }
        }
    }

    public void c(int i) {
        this.p.setText(i);
    }

    public void d(int i) {
        this.c.setProgress(i);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.delete_operaActon:
                this.d.a(com.fimi.soul.drone.d.a.DELETE_WAYPOINT);
                return;
            default:
                return;
        }
    }
}
