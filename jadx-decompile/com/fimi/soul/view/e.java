package com.fimi.soul.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import com.fimi.kernel.utils.p;
import com.fimi.kernel.utils.v;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.drone.g.c;
import com.fimi.soul.utils.JustifyTextView;
import com.fimi.soul.utils.ao;

public class e extends Dialog {

    public static class a {
        v a;
        private Context b;
        private String c;
        private String d;
        private OnClickListener e;
        private h f;
        private String g = c.bC;
        private String h = c.bD;
        private String i = c.bE;
        private String j = c.bF;
        private boolean k;
        private boolean l;

        public a(Context context) {
            this.b = context;
            this.f = h.a(context);
        }

        public a a(OnClickListener onClickListener) {
            this.e = onClickListener;
            return this;
        }

        public a a(String str) {
            this.c = str;
            return this;
        }

        public a a(String str, OnClickListener onClickListener) {
            this.e = onClickListener;
            this.d = str;
            return this;
        }

        public a a(boolean z) {
            this.k = z;
            return this;
        }

        public e a() {
            this.a = v.a(this.b);
            this.g = c.bC;
            this.i = c.bE;
            this.h = c.bD;
            this.j = c.bF;
            LayoutInflater layoutInflater = (LayoutInflater) this.b.getSystemService("layout_inflater");
            final e eVar = new e(this.b, R.style.DropDialog1);
            View inflate = layoutInflater.inflate(R.layout.flyactiontipdialog, null);
            JustifyTextView justifyTextView = (JustifyTextView) inflate.findViewById(R.id.action_tip);
            TextView textView = (TextView) inflate.findViewById(R.id.title);
            Button button = (Button) inflate.findViewById(R.id.single_btn);
            final RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.remeber_tip);
            if (this.k) {
                radioButton.setVisibility(0);
            } else {
                radioButton.setVisibility(8);
            }
            e.a(radioButton, 127);
            radioButton.setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ a b;

                public void onClick(View view) {
                    if (this.b.l) {
                        radioButton.setChecked(false);
                        this.b.l = false;
                        if (this.b.f.a().get() == 1) {
                            this.b.a.a().edit().putBoolean(this.b.g, false).commit();
                            return;
                        } else if (this.b.f.a().get() == 2) {
                            this.b.a.a().edit().putBoolean(this.b.h, false).commit();
                            return;
                        } else if (this.b.f.a().get() == 3) {
                            this.b.a.a().edit().putBoolean(this.b.i, false).commit();
                            return;
                        } else if (this.b.f.a().get() == 4) {
                            this.b.a.a().edit().putBoolean(this.b.j, false).commit();
                            return;
                        } else {
                            return;
                        }
                    }
                    radioButton.setChecked(true);
                    this.b.l = true;
                    if (this.b.f.a().get() == 1) {
                        this.b.a.a().edit().putBoolean(this.b.g, true).commit();
                    } else if (this.b.f.a().get() == 2) {
                        this.b.a.a().edit().putBoolean(this.b.h, true).commit();
                    } else if (this.b.f.a().get() == 3) {
                        this.b.a.a().edit().putBoolean(this.b.i, true).commit();
                    } else if (this.b.f.a().get() == 4) {
                        this.b.a.a().edit().putBoolean(this.b.j, true).commit();
                    }
                }
            });
            if (this.d != null) {
                button.setText(this.d);
            }
            if (this.c != null) {
                justifyTextView.setText(this.c);
            }
            if (this.e != null) {
                button.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ a b;

                    public void onClick(View view) {
                        eVar.dismiss();
                        this.b.e.onClick(eVar, -2);
                    }
                });
            }
            ao.a(this.b.getAssets(), justifyTextView, button, radioButton, textView);
            eVar.setContentView(inflate);
            Window window = eVar.getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((p.b(this.b) > ((float) p.a(this.b)) ? p.b(this.b) : (float) p.a(this.b)) * 1032.0f) / 1920.0f);
            window.setAttributes(attributes);
            eVar.getWindow().getDecorView().setBackgroundColor(0);
            return eVar;
        }

        public a b(String str) {
            this.d = str;
            return this;
        }
    }

    public e(Context context) {
        super(context);
    }

    public e(Context context, int i) {
        super(context, i);
    }

    public e(Context context, boolean z, OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }

    public static void a(RadioButton radioButton, int i) {
        radioButton.setTextColor(radioButton.getTextColors().withAlpha(i));
    }
}
