package com.fimi.soul.module.setting;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fimi.kernel.b.e;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.e.b;
import com.fimi.soul.entity.APConfig;
import com.fimi.soul.module.setting.a.a;

public class c extends a {
    private EditText a;
    private EditText b;
    private Button c;
    private TextView d;
    private TextView e;
    private TextView f;
    private b g = new b();
    private APConfig h;
    private String i;

    public c(Context context) {
        super(context);
    }

    private void g() {
        this.e = c(f().getString(R.string.version_info), "");
        this.d = c(f().getString(R.string.ip_addr), "");
        this.f = c(f().getString(R.string.country_code), "");
        this.a = b(f().getString(R.string.SSID), "");
        this.b = b(f().getString(R.string.relay_password), "");
        this.c = a("出厂设置", "恢复", new OnClickListener(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                com.fimi.kernel.c.b().a();
                this.a.g.e(new e<Boolean>(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public void a(Boolean bool) {
                        com.fimi.kernel.c.b().c();
                        if (bool.booleanValue()) {
                            com.fimi.kernel.c.b().a("操作成功，中继重启");
                        } else {
                            com.fimi.kernel.c.b().a("操作失败");
                        }
                    }

                    public void b(Boolean bool) {
                        com.fimi.kernel.c.b().c();
                        com.fimi.kernel.c.b().a("操作失败");
                    }
                });
            }
        });
        a a = a(f().getString(R.string.save), f().getString(R.string.reboot));
        a.a().setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.h();
            }
        });
        a.b().setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                com.fimi.kernel.c.b().a();
                this.a.g.d(new e<Boolean>(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void a(Boolean bool) {
                        com.fimi.kernel.c.b().c();
                        com.fimi.kernel.c.b().a("开始重启");
                    }

                    public void b(Boolean bool) {
                        com.fimi.kernel.c.b().c();
                        com.fimi.kernel.c.b().a("重置失败，请检查是否连接遥控器");
                    }
                });
            }
        });
        this.g.b(new e<APConfig>(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void a(APConfig aPConfig) {
                if (aPConfig != null) {
                    this.a.h = aPConfig;
                    this.a.a.setText(aPConfig.getSsid());
                    this.a.b.setText(aPConfig.getApPwd());
                    this.a.d.setText(aPConfig.getIpAddr());
                    this.a.e.setText(aPConfig.getVersion());
                    this.a.f.setText(aPConfig.getCountryCode());
                }
            }

            public void b(APConfig aPConfig) {
            }
        });
    }

    private void h() {
        if (this.h != null) {
            this.h.setIpAddr(this.d.getText().toString());
            this.h.setApPwd(this.b.getText().toString());
            this.h.setSsid(this.a.getText().toString());
            com.fimi.kernel.c.b().a();
            this.g.a(this.h, new e<Boolean>(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void a(Boolean bool) {
                    com.fimi.kernel.c.b().c();
                    com.fimi.kernel.c.b().a("设置成功");
                }

                public void b(Boolean bool) {
                    com.fimi.kernel.c.b().c();
                    com.fimi.kernel.c.b().a("设置失败，请检查中继网络");
                }
            });
        }
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
    }

    public View c() {
        g();
        return b();
    }
}
