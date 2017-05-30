package com.fimi.soul.view;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.p;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class a extends Dialog {

    public static class a {
        private a a = new a(this.b, R.style.DropDialog1);
        private Context b;
        private String c;
        private String d;
        private OnClickListener e;

        public a(Context context) {
            this.b = context;
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

        public a a() {
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
                    final /* synthetic */ a a;

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
            this.a.setContentView(inflate);
            Window window = this.a.getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((p.b(this.b) > ((float) p.a(this.b)) ? p.b(this.b) : (float) p.a(this.b)) * 1032.0f) / 1920.0f);
            window.setAttributes(attributes);
            this.a.getWindow().getDecorView().setBackgroundColor(0);
            return this.a;
        }

        public a b(String str) {
            this.d = str;
            return this;
        }

        public a b() {
            return this.a;
        }
    }

    public static class b {
        private Context a;
        private String b;
        private String c;
        private int d = 0;
        private OnClickListener e;
        private Button f;
        private Button g;
        private TextView h;
        private ImageView i;
        private com.fimi.soul.biz.a.a j = com.fimi.soul.biz.a.a.a();

        public b(Context context) {
            this.a = context;
        }

        public b a(int i) {
            this.d = i;
            return this;
        }

        public b a(String str) {
            this.b = str;
            return this;
        }

        public b a(String str, OnClickListener onClickListener) {
            this.e = onClickListener;
            this.c = str;
            return this;
        }

        @TargetApi(16)
        public a a() {
            LayoutInflater layoutInflater = (LayoutInflater) this.a.getSystemService("layout_inflater");
            final a aVar = new a(this.a, R.style.DropDialog1);
            View inflate = layoutInflater.inflate(R.layout.connect_type_dialog, null);
            this.h = (TextView) inflate.findViewById(R.id.msg_tv);
            this.i = (ImageView) inflate.findViewById(R.id.imageview);
            Button button = (Button) inflate.findViewById(R.id.single_btn);
            this.f = (Button) inflate.findViewById(R.id.usb_type);
            this.f.setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    this.a.a(this.a.g, 102, R.color.black);
                    this.a.a(this.a.g, (int) R.drawable.connect_type_wifi_bg);
                    this.a.a(this.a.f, 255, R.color.dronehomeline);
                    this.a.a(this.a.f, (int) R.drawable.connect_type_usb_on_bg);
                    this.a.h.setText(R.string.usb_network_share);
                    this.a.i.setImageResource(R.drawable.bg_dialog_usb_android_en);
                    this.a.j.a(1);
                }
            });
            this.g = (Button) inflate.findViewById(R.id.wifi_type);
            this.g.setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    this.a.a(this.a.f, 102, R.color.black);
                    this.a.a(this.a.f, (int) R.drawable.connect_type_usb_bg);
                    this.a.a(this.a.g, 255, R.color.dronehomeline);
                    this.a.a(this.a.g, (int) R.drawable.connect_type_wifi_on_bg);
                    this.a.h.setText(R.string.usb_wifi_network_share);
                    this.a.i.setImageResource(R.drawable.bg_dialog_usb_android_wifi_en);
                    this.a.j.a(2);
                }
            });
            if (this.j.b() == 1) {
                a(this.f, 255, R.color.dronehomeline);
                a(this.f, (int) R.drawable.connect_type_usb_on_bg);
                a(this.g, 102, R.color.black);
                a(this.g, (int) R.drawable.connect_type_wifi_bg);
                this.h.setText(R.string.usb_network_share);
                this.i.setImageResource(R.drawable.bg_dialog_usb_android_en);
            } else {
                a(this.g, 255, R.color.dronehomeline);
                a(this.g, (int) R.drawable.connect_type_wifi_on_bg);
                a(this.f, 102, R.color.black);
                a(this.f, (int) R.drawable.connect_type_usb_bg);
                this.h.setText(R.string.usb_wifi_network_share);
                this.i.setImageResource(R.drawable.bg_dialog_usb_android_wifi_en);
            }
            if (this.d != 0) {
                this.i.setBackground(this.a.getResources().getDrawable(this.d));
            }
            if (this.b != null) {
                CharSequence spannableStringBuilder = new SpannableStringBuilder(this.b);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.a.getResources().getColor(R.color.setting_dialog_force_attitude)), 5, 8, 33);
                this.h.setText(spannableStringBuilder);
            }
            if (this.c != null) {
                button.setText(this.c);
            }
            if (this.e != null) {
                button.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ b b;

                    public void onClick(View view) {
                        aVar.dismiss();
                        this.b.e.onClick(aVar, -2);
                    }
                });
            }
            ao.a(this.a.getAssets(), this.h, button, this.f, this.g);
            aVar.setContentView(inflate);
            Window window = aVar.getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((p.b(this.a) > ((float) p.a(this.a)) ? p.b(this.a) : (float) p.a(this.a)) * 1032.0f) / 1920.0f);
            window.setAttributes(attributes);
            aVar.getWindow().getDecorView().setBackgroundColor(0);
            return aVar;
        }

        public void a(Button button, int i) {
            if (button != null) {
                button.setBackgroundResource(i);
            }
        }

        public void a(Button button, int i, int i2) {
            button.setTextColor(this.a.getResources().getColor(i2));
            button.setTextColor(button.getTextColors().withAlpha(i));
        }

        public b b(String str) {
            this.c = str;
            return this;
        }
    }

    public a(Context context) {
        super(context);
    }

    public a(Context context, int i) {
        super(context, i);
    }

    public a(Context context, boolean z, OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }
}
