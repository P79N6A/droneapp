package com.fimi.soul.view;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.fimi.kernel.utils.p;
import com.fimi.kernel.utils.t;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.JustifyTextView;
import com.fimi.soul.utils.ao;

public class f extends Dialog {

    public static class a {
        private Context a;
        private String b;
        private String c;
        private String d;
        private String e;
        private int f;
        private int g;
        private int h = -1;
        private int i = -1;
        private OnClickListener j;
        private OnClickListener k;
        private f l;
        private boolean m = false;

        public a(Context context) {
            this.a = context;
            this.l = new f(this.a, R.style.DropDialog1);
        }

        private void a(TextView textView) {
            textView.getPaint().setFakeBoldText(true);
        }

        public a a(int i) {
            this.f = i;
            return this;
        }

        public a a(String str) {
            this.b = str;
            return this;
        }

        public a a(String str, OnClickListener onClickListener) {
            this.k = onClickListener;
            this.d = str;
            return this;
        }

        public a a(boolean z) {
            this.m = z;
            return this;
        }

        public f a() {
            LayoutInflater layoutInflater = (LayoutInflater) this.a.getSystemService("layout_inflater");
            View inflate = this.e != null ? layoutInflater.inflate(R.layout.vertical_screen_dialog_content_double_button, null) : layoutInflater.inflate(R.layout.vertical_screen_dialog_double_button, null);
            JustifyTextView justifyTextView = (JustifyTextView) inflate.findViewById(R.id.msg_tv);
            Button button = (Button) inflate.findViewById(R.id.right_btn);
            Button button2 = (Button) inflate.findViewById(R.id.left_btn);
            if (this.e != null) {
                JustifyTextView justifyTextView2 = (JustifyTextView) inflate.findViewById(R.id.content_tv);
                justifyTextView2.setText(this.e);
                ao.a(this.a.getAssets(), justifyTextView2);
                if (this.i != -1) {
                    justifyTextView2.setGravity(this.i);
                }
            }
            if (this.f != 0) {
                button.setTextColor(this.f);
            }
            if (this.g > 0) {
                button2.setTextColor(this.g);
            }
            if (this.c != null) {
                button.setText(this.c);
            }
            if (this.j != null) {
                button.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ a a;

                    {
                        this.a = r1;
                    }

                    public void onClick(View view) {
                        this.a.l.dismiss();
                        this.a.j.onClick(this.a.l, -2);
                    }
                });
            }
            if (this.d != null) {
                button2.setText(this.d);
            }
            if (this.k != null) {
                button2.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ a a;

                    {
                        this.a = r1;
                    }

                    public void onClick(View view) {
                        this.a.l.dismiss();
                        this.a.k.onClick(this.a.l, -2);
                    }
                });
            }
            if (this.b != null) {
                justifyTextView.setText(this.b);
            }
            if (this.h != -1) {
                justifyTextView.setGravity(this.h);
            }
            ao.a(this.a.getAssets(), justifyTextView, button, button2);
            if (this.e != null) {
                justifyTextView.getPaint().setFakeBoldText(true);
            }
            this.l.setCanceledOnTouchOutside(this.m);
            this.l.setContentView(inflate);
            Window window = this.l.getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((p.b(this.a) > ((float) p.a(this.a)) ? p.b(this.a) : (float) p.a(this.a)) * 1048.0f) / 1920.0f);
            window.setAttributes(attributes);
            this.l.getWindow().getDecorView().setBackgroundColor(0);
            return this.l;
        }

        public a b(int i) {
            this.g = i;
            return this;
        }

        public a b(String str) {
            this.e = str;
            return this;
        }

        public a b(String str, OnClickListener onClickListener) {
            this.j = onClickListener;
            this.c = str;
            return this;
        }

        public f b() {
            return this.l;
        }

        public a c(int i) {
            this.h = i;
            return this;
        }

        public a c(String str) {
            this.c = str;
            return this;
        }

        public a d(int i) {
            this.i = i;
            return this;
        }

        public a d(String str) {
            this.d = str;
            return this;
        }
    }

    public static class b {
        private static final int p = 0;
        private static final int q = 115;
        boolean a = false;
        private Context b;
        private String c;
        private String d;
        private int e;
        private String f;
        private int g = 500;
        private int h = 0;
        private int i = 0;
        private String j;
        private String k;
        private boolean l = false;
        private OnClickListener m;
        private OnClickListener n;
        private OnSeekBarChangeListener o;
        private boolean r = false;

        public b(Context context) {
            this.b = context;
            this.a = com.fimi.kernel.c.e().m();
        }

        private void a(TextView textView) {
            textView.getPaint().setFakeBoldText(true);
        }

        public b a(int i) {
            this.i = i;
            return this;
        }

        public b a(OnSeekBarChangeListener onSeekBarChangeListener) {
            this.o = onSeekBarChangeListener;
            return this;
        }

        public b a(String str) {
            this.j = str;
            return this;
        }

        public b a(String str, OnClickListener onClickListener) {
            this.n = onClickListener;
            this.d = str;
            return this;
        }

        public b a(boolean z) {
            this.l = z;
            return this;
        }

        public f a() {
            LayoutInflater layoutInflater = (LayoutInflater) this.b.getSystemService("layout_inflater");
            final f fVar = new f(this.b, R.style.DropDialog1);
            View inflate = layoutInflater.inflate(R.layout.vertical_screen_dialog_double_button_progress, null);
            TextView textView = (TextView) inflate.findViewById(R.id.msg_tv);
            Button button = (Button) inflate.findViewById(R.id.right_btn);
            Button button2 = (Button) inflate.findViewById(R.id.left_btn);
            final SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.seekbar);
            TextView textView2 = (TextView) inflate.findViewById(R.id.min_progress_tv);
            TextView textView3 = (TextView) inflate.findViewById(R.id.max_progress_tv);
            final TextView textView4 = (TextView) inflate.findViewById(R.id.progress_tv);
            TextView textView5 = (TextView) inflate.findViewById(R.id.dialog_unit_tv);
            if (this.k != null) {
                textView5.setText(this.k);
            }
            ((RelativeLayout) inflate.findViewById(R.id.seekbar_ll)).setOnTouchListener(new OnTouchListener(this) {
                final /* synthetic */ b b;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    float f = 0.0f;
                    Rect rect = new Rect();
                    seekBar.getHitRect(rect);
                    if (motionEvent.getY() < ((float) (rect.top - 50)) || motionEvent.getY() > ((float) (rect.bottom + 50))) {
                        return false;
                    }
                    float height = (float) (rect.top + (rect.height() / 2));
                    float x = motionEvent.getX() - ((float) rect.left);
                    if (x >= 0.0f) {
                        f = x > ((float) rect.width()) ? (float) rect.width() : x;
                    }
                    return seekBar.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), f, height, motionEvent.getMetaState()));
                }
            });
            seekBar.setMax(this.h - this.i);
            textView2.setText(this.i + this.j);
            textView3.setText(this.h + this.j);
            seekBar.setProgress(this.g - this.i);
            if (!this.l) {
                textView4.setText(this.g + this.j);
            } else if (this.a) {
                if (((double) this.g) <= t.b(6.0d)) {
                    textView4.setText(this.g + this.b.getString(R.string.speed_unit_mph) + this.b.getString(R.string.setting_speed_low));
                } else if (((double) this.g) <= t.b(6.0d) || ((double) this.g) > t.b(10.0d)) {
                    textView4.setText(this.g + this.b.getString(R.string.speed_unit_mph) + this.b.getString(R.string.setting_speed_hight));
                } else {
                    textView4.setText(this.g + this.b.getString(R.string.speed_unit_mph) + this.b.getString(R.string.setting_speed_standard));
                }
            } else if (this.g <= 6) {
                textView4.setText(this.g + this.b.getString(R.string.speed_unit_m) + this.b.getString(R.string.setting_speed_low));
            } else if (this.g <= 6 || this.g > 10) {
                textView4.setText(this.g + this.b.getString(R.string.speed_unit_m) + this.b.getString(R.string.setting_speed_hight));
            } else {
                textView4.setText(this.g + this.b.getString(R.string.speed_unit_m) + this.b.getString(R.string.setting_speed_standard));
            }
            seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener(this) {
                final /* synthetic */ b b;

                public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    boolean m = com.fimi.kernel.c.e().m();
                    if (this.b.l) {
                        int b = this.b.i + i;
                        if (m) {
                            if (((double) b) <= t.b(6.0d)) {
                                textView4.setText(b + this.b.b.getString(R.string.speed_unit_mph) + this.b.b.getString(R.string.setting_speed_low));
                            } else if (((double) b) <= t.b(6.0d) || ((double) b) > t.b(10.0d)) {
                                textView4.setText(b + this.b.b.getString(R.string.speed_unit_mph) + this.b.b.getString(R.string.setting_speed_hight));
                            } else {
                                textView4.setText(b + this.b.b.getString(R.string.speed_unit_mph) + this.b.b.getString(R.string.setting_speed_standard));
                            }
                        } else if (b <= 6) {
                            textView4.setText(b + this.b.b.getString(R.string.speed_unit_m) + this.b.b.getString(R.string.setting_speed_low));
                        } else if (b <= 6 || b > 10) {
                            textView4.setText(b + this.b.b.getString(R.string.speed_unit_m) + this.b.b.getString(R.string.setting_speed_hight));
                        } else {
                            textView4.setText(b + this.b.b.getString(R.string.speed_unit_m) + this.b.b.getString(R.string.setting_speed_standard));
                        }
                    } else if (m) {
                        textView4.setText((this.b.i + i) + this.b.b.getString(R.string.distance_unit_ft));
                    } else {
                        textView4.setText((this.b.i + i) + this.b.j);
                    }
                    this.b.o.onProgressChanged(seekBar, i, z);
                }

                public void onStartTrackingTouch(SeekBar seekBar) {
                    this.b.o.onStartTrackingTouch(seekBar);
                }

                public void onStopTrackingTouch(SeekBar seekBar) {
                    this.b.o.onStopTrackingTouch(seekBar);
                }
            });
            if (this.d != null) {
                button.setText(this.d);
            }
            if (this.m != null) {
                button.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ b b;

                    public void onClick(View view) {
                        fVar.dismiss();
                        this.b.m.onClick(fVar, -2);
                    }
                });
            }
            if (this.e != -1) {
                button.setTextColor(this.e);
            }
            if (this.f != null) {
                button2.setText(this.d);
            }
            if (this.n != null) {
                button2.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ b b;

                    public void onClick(View view) {
                        fVar.dismiss();
                        this.b.n.onClick(fVar, -2);
                    }
                });
            }
            if (this.c != null) {
                textView.setText(this.c);
            }
            ao.a(this.b.getAssets(), textView, button, button2, textView5);
            ao.b(this.b.getAssets(), textView2, textView3, textView4);
            a(textView);
            a(textView5);
            a(textView4);
            a(textView2);
            a(textView3);
            fVar.setCanceledOnTouchOutside(this.r);
            fVar.setContentView(inflate);
            Window window = fVar.getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((p.b(this.b) > ((float) p.a(this.b)) ? p.b(this.b) : (float) p.a(this.b)) * 1048.0f) / 1920.0f);
            window.setAttributes(attributes);
            fVar.getWindow().getDecorView().setBackgroundColor(0);
            return fVar;
        }

        public b b(int i) {
            this.h = i;
            return this;
        }

        public b b(String str) {
            this.k = str;
            return this;
        }

        public b b(String str, OnClickListener onClickListener) {
            this.m = onClickListener;
            this.d = str;
            return this;
        }

        public b b(boolean z) {
            this.r = z;
            return this;
        }

        public b c(int i) {
            this.g = i;
            return this;
        }

        public b c(String str) {
            this.c = str;
            return this;
        }

        public b d(int i) {
            this.e = i;
            return this;
        }

        public b d(String str) {
            this.d = str;
            return this;
        }

        public b e(String str) {
            this.f = str;
            return this;
        }
    }

    public static class c {
        private f a;
        private Context b;
        private String c;
        private String d;
        private OnClickListener e;
        private boolean f = false;

        public c(Context context) {
            this.b = context;
            this.a = new f(this.b, R.style.DropDialog1);
        }

        public c a(OnClickListener onClickListener) {
            this.e = onClickListener;
            return this;
        }

        public c a(String str) {
            this.c = str;
            return this;
        }

        public c a(String str, OnClickListener onClickListener) {
            this.e = onClickListener;
            this.d = str;
            return this;
        }

        public c a(boolean z) {
            this.f = z;
            return this;
        }

        public f a() {
            View inflate = ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(R.layout.horizon_single_button_dialog, null);
            TextView textView = (TextView) inflate.findViewById(R.id.msg_tv);
            Button button = (Button) inflate.findViewById(R.id.single_btn);
            if (this.d != null) {
                button.setText(this.d);
            }
            if (this.c != null) {
                textView.setText(this.c);
            }
            if (this.e != null) {
                button.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ c a;

                    {
                        this.a = r1;
                    }

                    public void onClick(View view) {
                        this.a.a.dismiss();
                        this.a.e.onClick(this.a.a, -2);
                    }
                });
            }
            ao.a(this.b.getAssets(), textView, button);
            this.a.setCanceledOnTouchOutside(this.f);
            this.a.setContentView(inflate);
            Window window = this.a.getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((p.b(this.b) > ((float) p.a(this.b)) ? p.b(this.b) : (float) p.a(this.b)) * 1032.0f) / 1920.0f);
            window.setAttributes(attributes);
            this.a.getWindow().getDecorView().setBackgroundColor(0);
            return this.a;
        }

        public c b(String str) {
            this.d = str;
            return this;
        }

        public f b() {
            return this.a;
        }
    }

    public static class d {
        private Context a;
        private String b;
        private String c;
        private int d = 0;
        private String e;
        private int f;
        private CharSequence g;
        private CharSequence h;
        private OnClickListener i;
        private boolean j = false;
        private boolean k = false;
        private boolean l = true;

        public d(Context context) {
            this.a = context;
        }

        private void a(TextView textView) {
            textView.getPaint().setFakeBoldText(true);
        }

        public d a(int i) {
            this.d = i;
            return this;
        }

        public d a(CharSequence charSequence) {
            this.g = charSequence;
            return this;
        }

        public d a(String str) {
            this.b = str;
            return this;
        }

        public d a(String str, OnClickListener onClickListener) {
            this.i = onClickListener;
            this.c = str;
            return this;
        }

        public d a(boolean z) {
            this.l = z;
            return this;
        }

        @TargetApi(16)
        public f a() {
            LayoutInflater layoutInflater = (LayoutInflater) this.a.getSystemService("layout_inflater");
            final f fVar = new f(this.a, R.style.DropDialog1);
            View inflate = (this.e == null && this.h == null) ? layoutInflater.inflate(R.layout.usb_share_dialog, null) : layoutInflater.inflate(R.layout.dialog_content_image, null);
            TextView textView = (TextView) inflate.findViewById(R.id.msg_tv);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.imageview);
            Button button = (Button) inflate.findViewById(R.id.single_btn);
            if (this.d != 0) {
                imageView.setBackground(this.a.getResources().getDrawable(this.d));
            }
            if (this.b != null && this.l) {
                CharSequence spannableStringBuilder = new SpannableStringBuilder(this.b);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.a.getResources().getColor(R.color.setting_dialog_force_attitude)), 4, 18, 33);
                textView.setText(spannableStringBuilder);
            } else if (this.b != null) {
                textView.setText(this.b);
            }
            if (this.c != null) {
                button.setText(this.c);
            }
            if (this.i != null) {
                button.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ d b;

                    public void onClick(View view) {
                        fVar.dismiss();
                        this.b.i.onClick(fVar, -2);
                    }
                });
            }
            if (this.e != null) {
                ((TextView) inflate.findViewById(R.id.content_tv)).setText(this.e);
                ao.a(this.a.getAssets(), r1);
            }
            if (this.h != null) {
                ((TextView) inflate.findViewById(R.id.content_tv)).setText(this.h);
                ao.a(this.a.getAssets(), r1);
            }
            if (this.j) {
                a(textView);
            }
            if (this.f != 0) {
                textView.setTextColor(this.f);
            }
            ao.a(this.a.getAssets(), textView, button);
            fVar.setCanceledOnTouchOutside(this.k);
            fVar.setContentView(inflate);
            Window window = fVar.getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((p.b(this.a) > ((float) p.a(this.a)) ? p.b(this.a) : (float) p.a(this.a)) * 1032.0f) / 1920.0f);
            window.setAttributes(attributes);
            fVar.getWindow().getDecorView().setBackgroundColor(0);
            return fVar;
        }

        public d b(int i) {
            this.f = i;
            return this;
        }

        public d b(CharSequence charSequence) {
            this.h = charSequence;
            return this;
        }

        public d b(String str) {
            this.c = str;
            return this;
        }

        public d b(boolean z) {
            this.j = z;
            return this;
        }

        public d c(String str) {
            this.e = str;
            return this;
        }
    }

    public f(Context context) {
        super(context);
    }

    public f(Context context, int i) {
        super(context, i);
    }

    public f(Context context, boolean z, OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }
}
