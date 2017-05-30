package com.fimi.soul.view;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class b implements com.fimi.kernel.view.dialog.c {
    private b c;
    private c d;
    private a e;

    class a extends AlertDialog {
        Context a;
        String b;
        com.fimi.kernel.view.dialog.a c;
        int d;
        String e;
        String f;
        Boolean g;
        String h;
        final /* synthetic */ b i;

        protected a(b bVar, Context context, String str, String str2, String str3, Boolean bool, String str4, com.fimi.kernel.view.dialog.a aVar) {
            this.i = bVar;
            super(context);
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.e = str2;
            this.f = str3;
            this.g = bool;
            this.h = str4;
        }

        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(R.layout.dialog_double_checkbox_button);
            Button button = (Button) findViewById(R.id.left_btn);
            Button button2 = (Button) findViewById(R.id.right_btn);
            ((TextView) findViewById(R.id.check_tv)).setText(this.h);
            final CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox);
            checkBox.setChecked(this.g.booleanValue());
            TextView textView = (TextView) findViewById(R.id.msg_tv);
            textView.setText(this.b);
            button.setText(this.e);
            button2.setText(this.f);
            ao.a(this.a.getAssets(), button2, button, r2, textView);
            textView.setTextColor(-872415232);
            textView.getPaint().setFakeBoldText(true);
            button.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ a b;

                public void onClick(View view) {
                    if (this.b.c != null) {
                        this.b.c.a(-2, Boolean.valueOf(checkBox.isChecked()));
                        this.b.dismiss();
                    }
                }
            });
            button2.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ a b;

                public void onClick(View view) {
                    if (this.b.c != null) {
                        this.b.c.a(-1, Boolean.valueOf(checkBox.isChecked()));
                        this.b.dismiss();
                    }
                }
            });
        }
    }

    class b extends AlertDialog {
        Context a;
        String b;
        String c;
        com.fimi.kernel.view.dialog.a d;
        int e;
        String f;
        String g;
        final /* synthetic */ b h;

        protected b(b bVar, Context context, String str, String str2, int i, String str3, String str4, com.fimi.kernel.view.dialog.a aVar) {
            this.h = bVar;
            super(context);
            this.a = context;
            this.b = str;
            this.c = str2;
            this.d = aVar;
            this.f = str3;
            this.e = i;
            this.g = str4;
        }

        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(R.layout.dialog_double_button);
            Button button = (Button) findViewById(R.id.left_btn);
            Button button2 = (Button) findViewById(R.id.right_btn);
            TextView textView = (TextView) findViewById(R.id.msg_tv);
            TextView textView2 = (TextView) findViewById(R.id.content_tv);
            if (this.c == null) {
                textView2.setVisibility(8);
            }
            textView2.setText(this.c);
            textView.setText(this.b);
            button2.setTextColor(this.e);
            button.setText(this.f);
            button2.setText(this.g);
            ao.a(this.a.getAssets(), button2, button, textView, textView2);
            textView.setTextColor(-872415232);
            textView.getPaint().setFakeBoldText(true);
            button.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    if (this.a.d != null) {
                        this.a.dismiss();
                        this.a.d.a(-2);
                    }
                }
            });
            button2.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    if (this.a.d != null) {
                        this.a.dismiss();
                        this.a.d.a(-1);
                    }
                }
            });
        }
    }

    class c extends AlertDialog {
        Context a;
        String b;
        String c;
        com.fimi.kernel.view.dialog.a d;
        final /* synthetic */ b e;

        protected c(b bVar, Context context, String str, String str2, com.fimi.kernel.view.dialog.a aVar) {
            this.e = bVar;
            super(context);
            this.a = context;
            this.b = str;
            this.c = str2;
            this.d = aVar;
        }

        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(R.layout.dialog_pop);
            TextView textView = (TextView) findViewById(R.id.msg_child_tv);
            ((Button) findViewById(R.id.dialog_btn)).setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    this.a.dismiss();
                    this.a.d.a(-1);
                }
            });
            TextView textView2 = (TextView) findViewById(R.id.msg_tv);
            textView2.setText(this.b);
            textView.setText(this.c);
            ao.a(this.a.getAssets(), textView2, r1, textView);
            textView2.setTextColor(-872415232);
            textView2.getPaint().setFakeBoldText(true);
            textView.getPaint().setFakeBoldText(true);
        }
    }

    public Dialog a(Context context, int i, String str, String str2, com.fimi.kernel.view.dialog.a aVar) {
        return a(context, str, str2, aVar);
    }

    public Dialog a(Context context, String str, int i, String str2, String str3, com.fimi.kernel.view.dialog.a aVar) {
        return a(context, str, null, i, str2, str3, aVar);
    }

    public Dialog a(Context context, String str, String str2, int i, String str3, String str4, com.fimi.kernel.view.dialog.a aVar) {
        if (this.c == null) {
            this.c = new b(this, context, str, str2, i, str3, str4, aVar);
        }
        if (!this.c.isShowing()) {
            this.c.show();
        }
        return this.c;
    }

    public Dialog a(Context context, String str, String str2, final com.fimi.kernel.view.dialog.a aVar) {
        Builder negativeButton = new Builder(context).setTitle(str).setMessage(str2).setNegativeButton(context.getString(R.string.confirm), new DialogInterface.OnClickListener(this) {
            final /* synthetic */ b b;

            public void onClick(DialogInterface dialogInterface, int i) {
                if (aVar != null) {
                    aVar.a(-1);
                }
            }
        });
        if (aVar != null) {
            negativeButton.setPositiveButton(context.getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                final /* synthetic */ b b;

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (aVar != null) {
                        aVar.a(-2);
                    }
                }
            });
        }
        return negativeButton.show();
    }

    public Dialog a(Context context, String str, String str2, String str3, Boolean bool, String str4, com.fimi.kernel.view.dialog.a aVar) {
        if (this.e == null) {
            this.e = new a(this, context, str, str2, str3, bool, str4, aVar);
        }
        if (!this.e.isShowing()) {
            this.e.show();
        }
        return this.e;
    }

    public Dialog b(Context context, String str, String str2, com.fimi.kernel.view.dialog.a aVar) {
        if (this.d == null) {
            this.d = new c(this, context, str, str2, aVar);
        }
        if (!this.d.isShowing()) {
            this.d.show();
        }
        return this.d;
    }
}
