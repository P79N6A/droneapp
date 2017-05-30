package com.fimi.soul.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class c extends Dialog {

    public static class a {
        private Context a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private int g = -1;
        private int h = -1;
        private int i = -1;
        private OnClickListener j;
        private OnClickListener k;
        private boolean l = true;

        public a(Context context) {
            this.a = context;
        }

        public a a(int i) {
            this.g = i;
            return this;
        }

        public a a(String str) {
            this.b = str;
            return this;
        }

        public a a(String str, OnClickListener onClickListener) {
            this.d = str;
            this.j = onClickListener;
            return this;
        }

        public a a(boolean z) {
            this.l = z;
            return this;
        }

        public c a() {
            LayoutInflater layoutInflater = (LayoutInflater) this.a.getSystemService("layout_inflater");
            final c cVar = new c(this.a, R.style.DropDialog1);
            View inflate = layoutInflater.inflate(R.layout.dialog_double_button, null);
            Button button = (Button) inflate.findViewById(R.id.left_btn);
            Button button2 = (Button) inflate.findViewById(R.id.right_btn);
            TextView textView = (TextView) inflate.findViewById(R.id.msg_tv);
            TextView textView2 = (TextView) inflate.findViewById(R.id.content_tv);
            ao.a(this.a.getAssets(), button2, button, textView, textView2);
            textView.getPaint().setFakeBoldText(true);
            textView.setTextColor(-872415232);
            if (this.d != null) {
                button2.setText(this.d);
            }
            if (this.e != null) {
                button.setText(this.e);
            }
            if (this.c != null) {
                textView.setText(this.c);
            }
            if (this.g != -1) {
                button2.setTextColor(this.g);
            }
            if (this.h != -1) {
                button.setTextColor(this.h);
            }
            if (this.f != null) {
                textView2.setVisibility(0);
                textView2.setText(this.f);
            } else {
                textView2.setVisibility(8);
            }
            if (this.i != -1) {
                textView.setMaxEms(this.i);
            }
            if (this.j != null) {
                button2.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ a b;

                    public void onClick(View view) {
                        this.b.j.onClick(cVar, -1);
                        cVar.dismiss();
                    }
                });
            }
            if (this.k != null) {
                button.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ a b;

                    public void onClick(View view) {
                        this.b.k.onClick(cVar, -2);
                        cVar.dismiss();
                    }
                });
            }
            if (this.l) {
                cVar.setCanceledOnTouchOutside(true);
            } else {
                cVar.setCanceledOnTouchOutside(false);
            }
            cVar.setContentView(inflate);
            Window window = cVar.getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = (int) this.a.getResources().getDimension(R.dimen.double_dialog_width);
            window.setAttributes(attributes);
            cVar.getWindow().getDecorView().setBackgroundColor(0);
            return cVar;
        }

        public a b(int i) {
            this.h = i;
            return this;
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public a b(String str, OnClickListener onClickListener) {
            this.e = str;
            this.k = onClickListener;
            return this;
        }

        public a c(int i) {
            this.i = i;
            return this;
        }

        public a c(String str) {
            this.f = str;
            return this;
        }
    }

    public static class b {
        private Context a;
        private String b;
        private String c;
        private String d;
        private String e;
        private int f = -1;
        private int g = -1;
        private boolean h;
        private OnClickListener i;
        private OnClickListener j;
        private boolean k = false;

        public b(Context context) {
            this.a = context;
        }

        public b a(int i) {
            this.f = i;
            return this;
        }

        public b a(String str) {
            this.b = str;
            return this;
        }

        public b a(String str, OnClickListener onClickListener) {
            this.c = str;
            this.i = onClickListener;
            return this;
        }

        public b a(boolean z) {
            this.h = z;
            return this;
        }

        public c a() {
            LayoutInflater layoutInflater = (LayoutInflater) this.a.getSystemService("layout_inflater");
            final c cVar = new c(this.a, R.style.DropDialog1);
            View inflate = layoutInflater.inflate(R.layout.dialog_double_checkbox_button, null);
            Button button = (Button) inflate.findViewById(R.id.left_btn);
            Button button2 = (Button) inflate.findViewById(R.id.right_btn);
            TextView textView = (TextView) inflate.findViewById(R.id.check_tv);
            textView.setText(this.e);
            CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkbox);
            checkBox.setChecked(this.h);
            TextView textView2 = (TextView) inflate.findViewById(R.id.msg_tv);
            if (this.b != null) {
                textView2.setText(this.b);
            }
            if (this.d != null) {
                button.setText(this.d);
            }
            if (this.c != null) {
                button2.setText(this.c);
            }
            if (this.e != null) {
                textView.setText(this.e);
            }
            if (this.h) {
                checkBox.setChecked(this.h);
            } else {
                checkBox.setChecked(this.h);
            }
            ao.a(this.a.getAssets(), button2, button, textView, textView2);
            textView2.setTextColor(-872415232);
            textView2.getPaint().setFakeBoldText(true);
            if (this.i != null) {
                button2.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ b b;

                    public void onClick(View view) {
                        this.b.i.onClick(cVar, -1);
                    }
                });
                button.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ b b;

                    public void onClick(View view) {
                        this.b.j.onClick(cVar, -2);
                    }
                });
            }
            cVar.setContentView(inflate);
            Window window = cVar.getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = (int) this.a.getResources().getDimension(R.dimen.double_choose_dialog_width);
            window.setAttributes(attributes);
            cVar.getWindow().getDecorView().setBackgroundColor(0);
            return cVar;
        }

        public b b(int i) {
            this.g = i;
            return this;
        }

        public b b(String str) {
            this.e = str;
            return this;
        }

        public b b(String str, OnClickListener onClickListener) {
            this.d = str;
            this.j = onClickListener;
            return this;
        }
    }

    public static class c {
        private Context a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private int g = -1;
        private int h = -1;
        private int i = -1;
        private OnClickListener j;
        private OnClickListener k;
        private boolean l = true;

        public c(Context context) {
            this.a = context;
        }

        public c a(int i) {
            this.g = i;
            return this;
        }

        public c a(String str) {
            this.b = str;
            return this;
        }

        public c a(String str, OnClickListener onClickListener) {
            this.d = str;
            this.j = onClickListener;
            return this;
        }

        public c a(boolean z) {
            this.l = z;
            return this;
        }

        public c a() {
            LayoutInflater layoutInflater = (LayoutInflater) this.a.getSystemService("layout_inflater");
            final c cVar = new c(this.a, R.style.DropDialog1);
            View inflate = layoutInflater.inflate(R.layout.dialog_double_button_insurance, null);
            Button button = (Button) inflate.findViewById(R.id.left_btn);
            Button button2 = (Button) inflate.findViewById(R.id.right_btn);
            TextView textView = (TextView) inflate.findViewById(R.id.msg_tv);
            TextView textView2 = (TextView) inflate.findViewById(R.id.content_tv);
            ao.a(this.a.getAssets(), button2, button, textView, textView2);
            textView.getPaint().setFakeBoldText(true);
            textView.setTextColor(-872415232);
            if (this.d != null) {
                button2.setText(this.d);
            }
            if (this.e != null) {
                button.setText(this.e);
            }
            if (this.b != null) {
                textView.setText(this.b);
            }
            if (this.c != null) {
                textView2.setText(this.c);
            }
            if (this.g != -1) {
                button2.setTextColor(this.g);
            }
            if (this.h != -1) {
                button.setTextColor(this.h);
            }
            if (this.i != -1) {
                textView.setMaxEms(this.i);
            }
            if (this.j != null) {
                button2.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ c b;

                    public void onClick(View view) {
                        this.b.j.onClick(cVar, -1);
                        cVar.dismiss();
                    }
                });
            }
            if (this.k != null) {
                button.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ c b;

                    public void onClick(View view) {
                        this.b.k.onClick(cVar, -2);
                        cVar.dismiss();
                    }
                });
            }
            if (this.l) {
                cVar.setCanceledOnTouchOutside(true);
            } else {
                cVar.setCanceledOnTouchOutside(false);
            }
            cVar.setContentView(inflate);
            Window window = cVar.getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = (int) this.a.getResources().getDimension(R.dimen.double_dialog_width);
            window.setAttributes(attributes);
            cVar.getWindow().getDecorView().setBackgroundColor(0);
            return cVar;
        }

        public c b(int i) {
            this.h = i;
            return this;
        }

        public c b(String str) {
            this.c = str;
            return this;
        }

        public c b(String str, OnClickListener onClickListener) {
            this.e = str;
            this.k = onClickListener;
            return this;
        }

        public c c(int i) {
            this.i = i;
            return this;
        }

        public c c(String str) {
            this.f = str;
            return this;
        }
    }

    public static class d {
        private Context a;
        private String b;
        private String c;
        private String d;
        private int e = -1;
        private int f = -1;
        private OnClickListener g;
        private boolean h = false;

        public d(Context context) {
            this.a = context;
        }

        public d a(int i) {
            this.f = i;
            return this;
        }

        public d a(Context context) {
            this.a = context;
            return this;
        }

        public d a(String str) {
            this.b = str;
            return this;
        }

        public d a(String str, OnClickListener onClickListener) {
            this.d = str;
            this.g = onClickListener;
            return this;
        }

        public c a() {
            LayoutInflater layoutInflater = (LayoutInflater) this.a.getSystemService("layout_inflater");
            final c cVar = new c(this.a, R.style.DropDialog1);
            View inflate = layoutInflater.inflate(R.layout.dialog_pop, null);
            TextView textView = (TextView) inflate.findViewById(R.id.msg_child_tv);
            Button button = (Button) inflate.findViewById(R.id.dialog_btn);
            TextView textView2 = (TextView) inflate.findViewById(R.id.msg_tv);
            if (this.b != null) {
                textView2.setText(this.b);
            }
            if (this.d != null) {
                button.setText(this.d);
            }
            if (this.f != -1) {
                textView2.setMaxEms(this.f);
            }
            if (this.c != null) {
                textView.setVisibility(0);
                textView.setText(this.c);
            } else {
                textView.setVisibility(8);
            }
            if (this.g != null) {
                button.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ d b;

                    public void onClick(View view) {
                        this.b.g.onClick(cVar, -1);
                        cVar.dismiss();
                    }
                });
            }
            ao.a(this.a.getAssets(), textView2, button, textView);
            textView2.getPaint().setFakeBoldText(true);
            if (this.c != null) {
                textView.getPaint().setFakeBoldText(true);
            }
            cVar.setContentView(inflate);
            Window window = cVar.getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.height = (int) this.a.getResources().getDimension(R.dimen.single_dialog_height);
            attributes.width = (int) this.a.getResources().getDimension(R.dimen.single_dialog_width);
            window.setAttributes(attributes);
            cVar.getWindow().getDecorView().setBackgroundColor(0);
            return cVar;
        }

        public d b(String str) {
            this.c = str;
            return this;
        }
    }

    public c(Context context) {
        super(context);
        requestWindowFeature(1);
    }

    public c(Context context, int i) {
        super(context, i);
        requestWindowFeature(1);
    }
}
