package com.fimi.soul.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.utils.ao;
import com.tencent.open.yyb.TitleBar;

public class UpDownSliding extends RelativeLayout {
    private static final int B = 1;
    private static final int C = 2;
    private static final int r = 0;
    private static final int s = 1;
    private static final int t = 2;
    private static final int u = 3;
    private static int y = -1;
    private static int z = -2130706433;
    private b A;
    private Handler D;
    int a;
    int b;
    int c;
    int d;
    boolean e;
    private String[] f;
    private int[] g;
    private int[] h;
    private int[] i;
    private LinearLayout[] j;
    private ImageView k;
    private VelocityTracker l;
    private TextView[] m;
    private c n;
    private Boolean o;
    private b p;
    private final int q;
    private LayoutParams v;
    private LayoutParams w;
    private LayoutParams x;

    public interface c {
        void a(b bVar);
    }

    private enum a {
        UP,
        DOWN
    }

    public enum b {
        Record(0),
        TakePhoto(1),
        Live(2);
        
        private int d;

        private b(int i) {
            this.d = i;
        }

        public int a() {
            return this.d;
        }
    }

    public UpDownSliding(Context context) {
        super(context);
        this.f = new String[]{getResources().getString(R.string.record_title), getResources().getString(R.string.photograph), getResources().getString(R.string.stream_live)};
        this.e = false;
        this.o = Boolean.valueOf(false);
        this.p = b.TakePhoto;
        this.q = 10;
        this.A = b.TakePhoto;
        this.D = new Handler(this) {
            final /* synthetic */ UpDownSliding a;

            {
                this.a = r1;
            }

            public void handleMessage(Message message) {
                super.handleMessage(message);
                switch (message.what) {
                    case 0:
                        this.a.a(b.TakePhoto, b.Live);
                        return;
                    case 1:
                        this.a.a(b.TakePhoto, b.Record);
                        return;
                    case 2:
                        this.a.a(2, a.DOWN, Boolean.valueOf(true));
                        return;
                    case 3:
                        this.a.a(1, a.UP, Boolean.valueOf(true));
                        return;
                    default:
                        return;
                }
            }
        };
        a(context);
    }

    public UpDownSliding(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new String[]{getResources().getString(R.string.record_title), getResources().getString(R.string.photograph), getResources().getString(R.string.stream_live)};
        this.e = false;
        this.o = Boolean.valueOf(false);
        this.p = b.TakePhoto;
        this.q = 10;
        this.A = b.TakePhoto;
        this.D = /* anonymous class already generated */;
        a(context);
    }

    public UpDownSliding(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new String[]{getResources().getString(R.string.record_title), getResources().getString(R.string.photograph), getResources().getString(R.string.stream_live)};
        this.e = false;
        this.o = Boolean.valueOf(false);
        this.p = b.TakePhoto;
        this.q = 10;
        this.A = b.TakePhoto;
        this.D = /* anonymous class already generated */;
        a(context);
    }

    private void a(b bVar, b bVar2) {
        if (bVar == b.Record && bVar2 == b.TakePhoto) {
            a(2, a.UP, Boolean.valueOf(false));
        } else if (bVar == b.TakePhoto && bVar2 == b.Live) {
            a(1, a.UP, Boolean.valueOf(false));
        } else if (bVar == b.Live && bVar2 == b.TakePhoto) {
            a(1, a.DOWN, Boolean.valueOf(false));
        } else if (bVar == b.TakePhoto && bVar2 == b.Record) {
            a(2, a.DOWN, Boolean.valueOf(false));
        } else if (bVar == b.Record && bVar2 == b.Live) {
            a(b.Record, b.TakePhoto);
            this.D.sendEmptyMessageAtTime(0, 1000);
        } else if (bVar == b.Live && bVar2 == b.Record) {
            a(b.Live, b.TakePhoto);
            this.D.sendEmptyMessageDelayed(1, 1000);
        }
    }

    public void a(int i, a aVar, Boolean bool) {
        ValueAnimator ofInt;
        if (aVar == a.DOWN) {
            ofInt = ValueAnimator.ofInt(new int[]{this.v.topMargin, this.i[i]});
        } else {
            ofInt = ValueAnimator.ofInt(new int[]{this.v.topMargin, this.i[i - 1]});
        }
        ValueAnimator ofInt2;
        switch (i) {
            case 1:
                if (aVar == a.DOWN) {
                    ofInt2 = ValueAnimator.ofInt(new int[]{0, this.h[0]});
                    this.m[0].setTextColor(z);
                    this.m[1].setTextColor(y);
                    this.m[2].setTextColor(z);
                    this.p = b.TakePhoto;
                } else {
                    ofInt2 = ValueAnimator.ofInt(new int[]{this.h[0], 0});
                    this.m[0].setTextColor(z);
                    this.m[1].setTextColor(z);
                    this.m[2].setTextColor(y);
                    this.p = b.Live;
                }
                ofInt2.addUpdateListener(new AnimatorUpdateListener(this) {
                    final /* synthetic */ UpDownSliding a;

                    {
                        this.a = r1;
                    }

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.a.v.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        this.a.x.leftMargin = (((Integer) valueAnimator.getAnimatedValue()).intValue() / (this.a.c / this.a.d)) + this.a.c;
                        this.a.w.leftMargin = this.a.h[1] - (((Integer) valueAnimator.getAnimatedValue()).intValue() / (this.a.c / this.a.d));
                    }
                });
                ofInt.addUpdateListener(new AnimatorUpdateListener(this) {
                    final /* synthetic */ UpDownSliding a;

                    {
                        this.a = r1;
                    }

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.a.v.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        this.a.x.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue() + this.a.a;
                        this.a.w.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue() + (this.a.a * 2);
                        this.a.j[0].setLayoutParams(this.a.v);
                        this.a.j[1].setLayoutParams(this.a.x);
                        this.a.j[2].setLayoutParams(this.a.w);
                    }
                });
                if (this.n != null && bool.booleanValue()) {
                    this.n.a(this.p);
                    com.fimi.kernel.c.e().a(this.p.a());
                }
                ofInt2.setDuration(250);
                ofInt.setDuration(250);
                ofInt2.start();
                ofInt.start();
                return;
            case 2:
                if (aVar == a.DOWN) {
                    ofInt2 = ValueAnimator.ofInt(new int[]{this.h[0], this.h[1]});
                    this.m[0].setTextColor(y);
                    this.m[1].setTextColor(z);
                    this.m[2].setTextColor(z);
                    this.p = b.Record;
                } else {
                    ofInt2 = ValueAnimator.ofInt(new int[]{this.h[1], this.h[0]});
                    this.m[0].setTextColor(z);
                    this.m[1].setTextColor(y);
                    this.m[2].setTextColor(z);
                    this.p = b.TakePhoto;
                }
                ofInt2.setDuration(500);
                ofInt2.addUpdateListener(new AnimatorUpdateListener(this) {
                    final /* synthetic */ UpDownSliding a;

                    {
                        this.a = r1;
                    }

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.a.v.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        this.a.x.leftMargin = this.a.h[1] - (((Integer) valueAnimator.getAnimatedValue()).intValue() - this.a.h[0]);
                        this.a.w.leftMargin = (this.a.h[1] - ((Integer) valueAnimator.getAnimatedValue()).intValue()) * (this.a.c / this.a.d);
                    }
                });
                ofInt.addUpdateListener(new AnimatorUpdateListener(this) {
                    final /* synthetic */ UpDownSliding a;

                    {
                        this.a = r1;
                    }

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.a.v.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        this.a.x.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue() + this.a.a;
                        this.a.w.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue() + (this.a.a * 2);
                        this.a.j[0].setLayoutParams(this.a.v);
                        this.a.j[1].setLayoutParams(this.a.x);
                        this.a.j[2].setLayoutParams(this.a.w);
                    }
                });
                if (this.n != null && bool.booleanValue()) {
                    this.n.a(this.p);
                    com.fimi.kernel.c.e().a(this.p.a());
                }
                ofInt2.setDuration(250);
                ofInt.setDuration(250);
                ofInt2.start();
                ofInt.start();
                return;
            default:
                return;
        }
    }

    public void a(Context context) {
        int i;
        this.a = (int) getResources().getDimension(R.dimen.updownsliding_top_margin);
        this.c = (int) getResources().getDimension(R.dimen.updownsliding_left_margin);
        this.d = (int) getResources().getDimension(R.dimen.updownsliding_left_second_margin);
        this.b = (int) getResources().getDimension(R.dimen.updownaliding_textsize);
        this.g = new int[]{this.a, this.a * 2, this.a * 3};
        this.h = new int[]{this.c, this.c + this.d, this.c};
        this.i = new int[]{0, this.a, this.a * 2};
        View relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new LayoutParams(-2, -2));
        this.j = new LinearLayout[3];
        this.m = new TextView[3];
        for (i = 0; i < this.f.length; i++) {
            this.j[i] = new LinearLayout(context);
            this.m[i] = new TextView(context);
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.m[i].setTextColor(-1);
            this.m[i].setText(this.f[i]);
            this.m[i].setTextSize(0, (float) this.b);
            this.m[i].setTextColor(z);
            this.m[i].setLayoutParams(layoutParams);
            this.m[i].setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ UpDownSliding b;

                public void onClick(View view) {
                    if (!this.b.isEnabled() || i == this.b.p.a()) {
                        return;
                    }
                    if (i == b.Record.a() && this.b.p == b.TakePhoto) {
                        this.b.a(2, a.DOWN, Boolean.valueOf(true));
                    } else if (i == b.TakePhoto.a() && this.b.p == b.Record) {
                        this.b.a(2, a.UP, Boolean.valueOf(true));
                    } else if (i == b.Record.a() && this.b.p == b.Live) {
                        this.b.a(1, a.DOWN, Boolean.valueOf(false));
                        this.b.D.sendEmptyMessageAtTime(2, 1000);
                    } else if (i == b.TakePhoto.a() && this.b.p == b.Live) {
                        this.b.a(1, a.DOWN, Boolean.valueOf(true));
                    } else if (i == b.Live.a() && this.b.p == b.Record) {
                        this.b.a(2, a.UP, Boolean.valueOf(false));
                        this.b.D.sendEmptyMessageAtTime(3, 1000);
                    } else if (i == b.Live.a() && this.b.p == b.TakePhoto) {
                        this.b.a(1, a.UP, Boolean.valueOf(true));
                    }
                }
            });
            ao.a(context.getAssets(), this.m[i]);
            this.m[i].getPaint().setFakeBoldText(true);
            this.j[i].setId(i + 100);
            this.j[i].addView(this.m[i]);
            layoutParams = new LayoutParams(-1, -1);
            layoutParams.topMargin = this.g[i];
            layoutParams.leftMargin = this.h[i];
            this.j[i].setLayoutParams(layoutParams);
            relativeLayout.addView(this.j[i]);
        }
        relativeLayout.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.m[0].getMeasuredHeight();
        i = this.m[0].getMeasuredWidth();
        this.m[1].setTextColor(y);
        if (d.a().k()) {
            this.m[2].setVisibility(8);
            this.m[2].setEnabled(false);
        } else {
            this.m[2].setVisibility(0);
            this.m[2].setEnabled(true);
        }
        this.k = new ImageView(context);
        this.k.setBackgroundResource(R.drawable.mode_selected_dot);
        ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        int dimension = (int) getResources().getDimension(R.dimen.updownsliding_dot_diameter);
        layoutParams2.height = dimension;
        layoutParams2.width = dimension;
        layoutParams2.topMargin = ((this.a * 2) + (measuredHeight / 2)) - (dimension / 2);
        layoutParams2.leftMargin = (int) ((((float) (i + this.h[1])) + getResources().getDimension(R.dimen.updownsliding_dot_text)) + ((float) (dimension / 5)));
        this.k.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.k);
        addView(relativeLayout);
        this.v = (LayoutParams) this.j[0].getLayoutParams();
        this.x = (LayoutParams) this.j[1].getLayoutParams();
        this.w = (LayoutParams) this.j[2].getLayoutParams();
        LayoutParams layoutParams3 = (LayoutParams) relativeLayout.getLayoutParams();
        layoutParams3.height = ((this.a * 2) + (measuredHeight / 2)) * 2;
        relativeLayout.setLayoutParams(layoutParams3);
    }

    public void b(Context context) {
        this.m[2].setVisibility(8);
        this.m[2].setEnabled(false);
        setState(b.TakePhoto);
    }

    public b getCurrentState() {
        b bVar = b.Record;
        switch (com.fimi.kernel.c.e().c()) {
            case 0:
                return b.Record;
            case 1:
                return b.TakePhoto;
            case 2:
                return b.Live;
            default:
                return bVar;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        switch (motionEvent.getAction()) {
            case 0:
                if (this.l == null) {
                    this.l = VelocityTracker.obtain();
                } else {
                    this.l.clear();
                }
                this.l.addMovement(motionEvent);
                this.e = true;
                break;
            case 1:
                this.l.recycle();
                this.l = null;
                break;
            case 2:
                this.l.addMovement(motionEvent);
                this.l.computeCurrentVelocity(1000);
                if (Math.abs(this.l.getYVelocity()) < TitleBar.SHAREBTN_RIGHT_MARGIN) {
                    return super.onTouchEvent(motionEvent);
                }
                if (this.e) {
                    this.e = false;
                    int i;
                    if (this.l.getYVelocity() > 0.0f) {
                        i = 0;
                        while (i < this.i.length) {
                            if (this.i[i] == this.v.topMargin) {
                                if (i != 2) {
                                    if (i + 1 == 1) {
                                        this.A = b.TakePhoto;
                                    }
                                    if (i + 1 == 2) {
                                        this.A = b.Record;
                                    }
                                    a(i + 1, a.DOWN, Boolean.valueOf(true));
                                    break;
                                }
                                return super.onTouchEvent(motionEvent);
                            }
                            i++;
                        }
                        i = 0;
                        if (i != 2) {
                            return super.onTouchEvent(motionEvent);
                        }
                        if (i + 1 == 1) {
                            this.A = b.TakePhoto;
                        }
                        if (i + 1 == 2) {
                            this.A = b.Record;
                        }
                        a(i + 1, a.DOWN, Boolean.valueOf(true));
                    } else if (this.l.getYVelocity() < 0.0f) {
                        i = 0;
                        while (i < this.i.length) {
                            if (this.i[i] == this.v.topMargin) {
                                if (i != 0) {
                                    if (i == 1) {
                                        if (i == 2) {
                                            this.A = b.TakePhoto;
                                        }
                                        a(i, a.UP, Boolean.valueOf(true));
                                        break;
                                    }
                                    this.A = b.Live;
                                    return super.onTouchEvent(motionEvent);
                                }
                                return super.onTouchEvent(motionEvent);
                            }
                            i++;
                        }
                        i = 0;
                        if (i != 0) {
                            return super.onTouchEvent(motionEvent);
                        }
                        if (i == 1) {
                            if (i == 2) {
                                this.A = b.TakePhoto;
                            }
                            a(i, a.UP, Boolean.valueOf(true));
                        } else {
                            this.A = b.Live;
                            return super.onTouchEvent(motionEvent);
                        }
                    }
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnUpDownSliding(c cVar) {
        this.n = cVar;
    }

    public void setState(b bVar) {
        if (bVar != this.A) {
            this.A = bVar;
            if (this.o.booleanValue()) {
                a(this.p, bVar);
                return;
            }
            this.o = Boolean.valueOf(true);
            switch (bVar) {
                case Record:
                    this.v.topMargin = this.g[1];
                    this.x.topMargin = this.g[2];
                    this.w.topMargin = this.a * 4;
                    this.v.leftMargin = this.h[1];
                    this.x.leftMargin = this.h[2];
                    this.w.leftMargin = 0;
                    this.m[0].setTextColor(y);
                    this.m[1].setTextColor(z);
                    this.m[2].setTextColor(z);
                    this.p = b.Record;
                    break;
                case TakePhoto:
                    this.v.topMargin = this.g[0];
                    this.x.topMargin = this.g[1];
                    this.w.topMargin = this.g[2];
                    this.v.leftMargin = this.h[0];
                    this.x.leftMargin = this.h[1];
                    this.w.leftMargin = this.h[2];
                    this.m[0].setTextColor(z);
                    this.m[1].setTextColor(y);
                    this.m[2].setTextColor(z);
                    this.p = b.TakePhoto;
                    break;
                case Live:
                    this.v.topMargin = 0;
                    this.x.topMargin = this.g[0];
                    this.w.topMargin = this.g[1];
                    this.v.leftMargin = 0;
                    this.x.leftMargin = this.h[0];
                    this.w.leftMargin = this.h[1];
                    this.m[0].setTextColor(z);
                    this.m[1].setTextColor(z);
                    this.m[2].setTextColor(y);
                    this.p = b.Live;
                    break;
            }
            this.j[0].setLayoutParams(this.v);
            this.j[1].setLayoutParams(this.x);
            this.j[2].setLayoutParams(this.w);
        }
    }
}
