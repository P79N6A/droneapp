package com.fimi.soul.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fimi.kernel.b.c.d;
import com.fimi.kernel.utils.p;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.modifyRealyWiFiConfigure.ModifyRelayWiFi;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.utils.ao;
import org.json.JSONObject;

public class i extends Dialog {

    public static class a implements d, b {
        i a;
        private Context b;
        private String c;
        private String d;
        private OnClickListener e;
        private OnClickListener f;
        private EditText g;
        private EditText h;
        private TextView i;
        private String j;
        private String k;
        private com.fimi.soul.drone.a l;

        public a(Context context, com.fimi.soul.drone.a aVar) {
            this.b = context;
            this.l = aVar;
            aVar.a((b) this);
            com.fimi.soul.biz.e.d.a().o().b((d) this);
        }

        public a a(String str, OnClickListener onClickListener, String str2, OnClickListener onClickListener2) {
            this.c = str;
            this.d = str2;
            this.e = onClickListener;
            this.f = onClickListener2;
            return this;
        }

        public String a() {
            return this.g != null ? this.g.getText().toString() : null;
        }

        public void a(String str) {
            try {
                if (str.contains("command")) {
                    if ("0".equals(((JSONObject) new JSONObject(str).get("command")).getString("result"))) {
                        if (this.a != null && this.a.isShowing() && this.b != null) {
                            this.a.dismiss();
                            z.a(this.b, (int) R.string.relay_modify_sucess, 3000);
                            ModifyRelayWiFi instance = ModifyRelayWiFi.getInstance();
                            String ssid = instance.getSsid();
                            String password = instance.getPassword();
                            if (ssid != null) {
                                com.fimi.soul.biz.e.d.a().e(ssid);
                            }
                            if (password != null) {
                                com.fimi.soul.biz.e.d.a().d(password);
                            }
                        }
                    } else if (this.a != null && this.i != null) {
                        this.i.setText(R.string.relay_modify_error);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public String b() {
            return this.h != null ? this.h.getText().toString() : null;
        }

        public void b(String str) {
            if (this.i != null) {
                this.i.setText(str);
            }
        }

        public a c(String str) {
            this.j = str;
            return this;
        }

        public i c() {
            LayoutInflater layoutInflater = (LayoutInflater) this.b.getSystemService("layout_inflater");
            this.a = new i(this.b, R.style.DropDialog1);
            View inflate = layoutInflater.inflate(R.layout.relay_wifi_dialog, null);
            TextView textView = (TextView) inflate.findViewById(R.id.dialog_title);
            this.g = (EditText) inflate.findViewById(R.id.ssid_name);
            this.g.clearFocus();
            if (this.j != null) {
                this.g.setText(this.j);
            }
            this.h = (EditText) inflate.findViewById(R.id.key_pas);
            this.h.clearFocus();
            if (this.k != null) {
                this.h.setText(this.k);
            }
            this.i = (TextView) inflate.findViewById(R.id.pas_tip);
            Button button = (Button) inflate.findViewById(R.id.left_btn);
            Button button2 = (Button) inflate.findViewById(R.id.right_btn);
            if (this.c != null) {
                button.setText(this.c);
            }
            if (this.d != null) {
                button2.setText(this.d);
            }
            if (this.e != null) {
                button.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ a a;

                    {
                        this.a = r1;
                    }

                    public void onClick(View view) {
                        this.a.e.onClick(this.a.a, -2);
                    }
                });
            }
            if (this.f != null) {
                button2.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ a a;

                    {
                        this.a = r1;
                    }

                    public void onClick(View view) {
                        this.a.f.onClick(this.a.a, -1);
                    }
                });
            }
            ao.a(this.b.getAssets(), textView, this.g, this.h, button, button2, this.i);
            this.a.setContentView(inflate);
            Window window = this.a.getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((p.b(this.b) > ((float) p.a(this.b)) ? p.b(this.b) : (float) p.a(this.b)) * 1032.0f) / 1920.0f);
            window.setAttributes(attributes);
            this.a.getWindow().getDecorView().setBackgroundColor(0);
            this.a.setOnDismissListener(new OnDismissListener(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void onDismiss(DialogInterface dialogInterface) {
                    if (this.a.l != null) {
                        this.a.l.b(this.a);
                    }
                }
            });
            return this.a;
        }

        public a d(String str) {
            this.k = str;
            return this;
        }

        public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
            if (aVar == com.fimi.soul.drone.d.a.CLEANALLOBJ && this.a != null && this.a.isShowing() && aVar2 != null) {
                b(aVar2.d.getString(R.string.connectdefault));
            }
        }
    }

    public i(Context context) {
        super(context);
    }

    public i(Context context, int i) {
        super(context, i);
    }

    public i(Context context, boolean z, OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }
}
