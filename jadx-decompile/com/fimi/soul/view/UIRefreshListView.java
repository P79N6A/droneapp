package com.fimi.soul.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import it.a.a.e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import m.framework.ui.widget.asyncview.AsyncImageView;

public class UIRefreshListView extends ListView implements OnScrollListener {
    private static final String a = "MM-dd HH:mm";
    private static final int b = 3;
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 3;
    private static final int g = 4;
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 3;
    private RotateAnimation A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private int G;
    private int H;
    private int I;
    private boolean J;
    private c K;
    private b L;
    private a M;
    private int k;
    private int l;
    private boolean m = false;
    private boolean n = false;
    private boolean o = true;
    private boolean p = false;
    private LayoutInflater q;
    private LinearLayout r;
    private TextView s;
    private TextView t;
    private ImageView u;
    private ProgressBar v;
    private View w;
    private ProgressBar x;
    private TextView y;
    private RotateAnimation z;

    public interface a {
        void a(AbsListView absListView, int i);

        void a(AbsListView absListView, int i, int i2, int i3);
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public UIRefreshListView(Context context) {
        super(context);
        a(context);
    }

    public UIRefreshListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public UIRefreshListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(int i) {
        if (i <= 0) {
            i = e.G;
        }
        Interpolator linearInterpolator = new LinearInterpolator();
        this.z = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.z.setInterpolator(linearInterpolator);
        this.z.setDuration((long) i);
        this.z.setFillAfter(true);
        this.A = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.A.setInterpolator(linearInterpolator);
        this.A.setDuration((long) i);
        this.A.setFillAfter(true);
    }

    private void a(Context context) {
        setCacheColorHint(context.getResources().getColor(AsyncImageView.a));
        this.q = LayoutInflater.from(context);
        h();
        i();
        setOnScrollListener(this);
        a(0);
    }

    private void a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? MeasureSpec.makeMeasureSpec(i, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0));
    }

    private void h() {
        this.r = (LinearLayout) this.q.inflate(R.layout.rebound_listview_header, null);
        this.u = (ImageView) this.r.findViewById(R.id.head_arrowImageView);
        this.u.setMinimumWidth(70);
        this.u.setMinimumHeight(50);
        this.v = (ProgressBar) this.r.findViewById(R.id.head_progressBar);
        this.s = (TextView) this.r.findViewById(R.id.head_tipsTextView);
        this.t = (TextView) this.r.findViewById(R.id.head_lastUpdatedTextView);
        a(this.r);
        this.D = this.r.getMeasuredHeight();
        this.C = this.r.getMeasuredWidth();
        this.r.setPadding(0, this.D * -1, 0, 0);
        this.r.invalidate();
        Log.v("size", "width:" + this.C + " height:" + this.D);
        addHeaderView(this.r, null, false);
        this.k = 3;
    }

    private void i() {
        this.w = this.q.inflate(R.layout.rebound_listview_footer, null);
        this.w.setVisibility(0);
        this.x = (ProgressBar) this.w.findViewById(R.id.pull_to_refresh_progress);
        this.y = (TextView) this.w.findViewById(R.id.load_more);
        this.w.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ UIRefreshListView a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (!this.a.m) {
                    return;
                }
                if (this.a.n) {
                    if (this.a.l != 1 && this.a.k != 2) {
                        this.a.l = 1;
                        this.a.m();
                    }
                } else if (this.a.l != 1) {
                    this.a.l = 1;
                    this.a.m();
                }
            }
        });
        addFooterView(this.w);
        if (this.o) {
            this.l = 3;
        } else {
            this.l = 2;
        }
    }

    private void j() {
        if (this.m) {
            switch (this.l) {
                case 1:
                    if (!this.y.getText().equals(Integer.valueOf(R.string.refresh_doing_end_refresh))) {
                        this.y.setText(R.string.refresh_doing_end_refresh);
                        this.y.setVisibility(0);
                        this.x.setVisibility(0);
                        return;
                    }
                    return;
                case 2:
                    this.y.setText(R.string.refresh_end_click_load_more);
                    this.y.setVisibility(0);
                    this.x.setVisibility(8);
                    this.w.setVisibility(0);
                    return;
                case 3:
                    this.y.setText(R.string.refresh_end_load_more);
                    this.y.setVisibility(0);
                    this.x.setVisibility(8);
                    this.w.setVisibility(0);
                    return;
                default:
                    return;
            }
        }
    }

    private void k() {
        switch (this.k) {
            case 0:
                this.u.setVisibility(0);
                this.v.setVisibility(8);
                this.s.setVisibility(0);
                this.t.setVisibility(0);
                this.u.clearAnimation();
                this.u.startAnimation(this.z);
                this.s.setText(R.string.refresh_release_refresh);
                return;
            case 1:
                this.v.setVisibility(8);
                this.s.setVisibility(0);
                this.t.setVisibility(0);
                this.u.clearAnimation();
                this.u.setVisibility(0);
                if (this.F) {
                    this.F = false;
                    this.u.clearAnimation();
                    this.u.startAnimation(this.A);
                    this.s.setText(R.string.refresh_pull_to_refresh);
                    return;
                }
                this.s.setText(R.string.refresh_pull_to_refresh);
                return;
            case 2:
                this.r.setPadding(0, 0, 0, 0);
                this.v.setVisibility(0);
                this.u.clearAnimation();
                this.u.setVisibility(8);
                this.s.setText(R.string.refresh_doing_head_refresh);
                this.t.setVisibility(0);
                return;
            case 3:
                this.r.setPadding(0, this.D * -1, 0, 0);
                this.v.setVisibility(8);
                this.u.clearAnimation();
                this.u.setImageResource(R.drawable.uet_rebound_listview_arrow);
                this.s.setText(R.string.refresh_pull_to_refresh);
                this.t.setVisibility(0);
                return;
            default:
                return;
        }
    }

    private void l() {
        if (this.K != null) {
            this.K.a();
        }
    }

    private void m() {
        if (this.L != null) {
            this.y.setText(R.string.refresh_doing_end_refresh);
            this.y.setVisibility(0);
            this.x.setVisibility(0);
            this.L.a();
        }
    }

    public boolean a() {
        return this.m;
    }

    public boolean b() {
        return this.n;
    }

    public boolean c() {
        return this.o;
    }

    public boolean d() {
        return this.p;
    }

    public void e() {
        if (this.p) {
            setSelection(0);
        }
        this.k = 3;
        this.t.setText(getResources().getString(R.string.refresh_refresh_lasttime) + new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA).format(new Date()));
        k();
    }

    public void f() {
        if (this.o) {
            this.l = 3;
        } else {
            this.l = 2;
        }
        j();
    }

    public void g() {
        removeFooterView(this.w);
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.G = i;
        this.H = (i + i2) - 2;
        this.I = i3 - 2;
        if (i3 > i2) {
            this.J = true;
        } else {
            this.J = false;
        }
        if (this.M != null) {
            this.M.a(absListView, i, i2, i3);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.m) {
            if (this.H == this.I && i == 0 && this.l != 1) {
                if (!this.o) {
                    this.l = 2;
                    j();
                } else if (!this.n) {
                    this.l = 1;
                    m();
                    j();
                } else if (this.k != 2) {
                    this.l = 1;
                    m();
                    j();
                }
            }
        } else if (this.w != null && this.w.getVisibility() == 0) {
            System.out.println("this.removeFooterView(endRootView);...");
            this.w.setVisibility(8);
            removeFooterView(this.w);
        }
        if (this.M != null) {
            this.M.a(absListView, i);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.n) {
            if (!this.m || this.l != 1) {
                switch (motionEvent.getAction()) {
                    case 0:
                        if (this.G == 0 && !this.B) {
                            this.B = true;
                            this.E = (int) motionEvent.getY();
                            break;
                        }
                    case 1:
                        if (!(this.k == 2 || this.k == 4)) {
                            if (this.k == 3) {
                            }
                            if (this.k == 1) {
                                this.k = 3;
                                k();
                            }
                            if (this.k == 0) {
                                this.k = 2;
                                k();
                                l();
                            }
                        }
                        this.B = false;
                        this.F = false;
                        break;
                    case 2:
                        int y = (int) motionEvent.getY();
                        if (!this.B && this.G == 0) {
                            this.B = true;
                            this.E = y;
                        }
                        if (!(this.k == 2 || !this.B || this.k == 4)) {
                            if (this.k == 0) {
                                setSelection(0);
                                if ((y - this.E) / 3 < this.D && y - this.E > 0) {
                                    this.k = 1;
                                    k();
                                } else if (y - this.E <= 0) {
                                    this.k = 3;
                                    k();
                                }
                            }
                            if (this.k == 1) {
                                setSelection(0);
                                if ((y - this.E) / 3 >= this.D) {
                                    this.k = 0;
                                    this.F = true;
                                    k();
                                } else if (y - this.E <= 0) {
                                    this.k = 3;
                                    k();
                                }
                            }
                            if (this.k == 3 && y - this.E > 0) {
                                this.k = 1;
                                k();
                            }
                            if (this.k == 1) {
                                this.r.setPadding(0, (this.D * -1) + ((y - this.E) / 3), 0, 0);
                            }
                            if (this.k == 0) {
                                this.r.setPadding(0, ((y - this.E) / 3) - this.D, 0, 0);
                                break;
                            }
                        }
                        break;
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdapter(BaseAdapter baseAdapter) {
        this.t.setText(getResources().getString(R.string.refresh_refresh_lasttime) + new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA).format(new Date()));
        super.setAdapter(baseAdapter);
    }

    public void setAutoLoadMore(boolean z) {
        this.o = z;
    }

    public void setCanLoadMore(final boolean z) {
        this.m = z;
        if (this.w == null) {
            i();
        }
        this.w.post(new Runnable(this) {
            final /* synthetic */ UIRefreshListView b;

            public void run() {
                if (z && this.b.getFooterViewsCount() == 0) {
                    this.b.i();
                } else {
                    this.b.g();
                }
                this.b.w.setVisibility(z ? 0 : 8);
                this.b.w.setPadding(0, z ? 0 : -this.b.w.getHeight(), 0, 0);
            }
        });
    }

    public void setCanRefresh(boolean z) {
        this.n = z;
    }

    public void setListViewOnScrollListener(a aVar) {
        this.M = aVar;
    }

    public void setMoveToFirstItemAfterRefresh(boolean z) {
        this.p = z;
    }

    public void setOnLoadListener(b bVar) {
        if (bVar != null) {
            this.L = bVar;
            if (this.m && getFooterViewsCount() == 0) {
                i();
            }
        }
    }

    public void setOnRefreshListener(c cVar) {
        if (cVar != null) {
            this.K = cVar;
        }
    }
}
