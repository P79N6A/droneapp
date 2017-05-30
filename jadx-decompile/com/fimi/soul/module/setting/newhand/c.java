package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.fimi.kernel.utils.t;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.manager.k;
import com.fimi.soul.biz.o.a;
import com.fimi.soul.entity.FlyModeLog;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.Setting;
import com.fimi.soul.module.setting.i.d;
import com.fimi.soul.module.update.a.b;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.f;
import java.io.File;
import java.util.List;

public class c extends d {
    private static final int F = 3000;
    private static final int G = 1;
    public static final int a = 9;
    public static final byte b = (byte) 0;
    public static final byte c = (byte) 1;
    public static final byte d = (byte) 2;
    public static final byte e = (byte) 3;
    public static final byte f = (byte) 85;
    public static final byte g = (byte) -86;
    public static final byte h = (byte) 0;
    public static final byte i = (byte) 1;
    public static final int j = 60;
    private static final int l = 2;
    private static final int m = 3;
    private static final int n = 4;
    private static final int o = 5;
    private static final int p = 6;
    private static final int q = 7;
    private static final int r = 8;
    private static final int s = 9;
    private static final int t = 10;
    private static final int u = 11;
    private static final String v = "0";
    private static final String w = "1";
    private static final String x = "2";
    private static final String y = "3";
    private int A = 0;
    private int B = 0;
    private boolean C = false;
    private Context D;
    private a E;
    private Handler H = new Handler(this) {
        final /* synthetic */ c a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (1 == message.what) {
                this.a.k();
            }
            switch (message.what) {
                case 2:
                    this.a.b((byte) 0);
                    return;
                case 3:
                    this.a.b((byte) 1);
                    return;
                case 4:
                    this.a.a(2, 1);
                    return;
                case 5:
                    this.a.a(2, 0);
                    return;
                case 6:
                    this.a.a(4, 1);
                    return;
                case 7:
                    this.a.a(4, 0);
                    return;
                default:
                    return;
            }
        }
    };
    com.fimi.soul.drone.a k;
    private int z = 0;

    public c(com.fimi.soul.drone.a aVar, Context context) {
        this.k = aVar;
        this.D = context;
        this.E = a.a(context);
        this.C = com.fimi.kernel.c.e().m();
    }

    private com.fimi.soul.drone.c.a.c a(byte b) {
        com.fimi.soul.drone.c.a.c cVar = new com.fimi.soul.drone.c.a.c();
        cVar.b = 9;
        cVar.c = 135;
        cVar.d.b((byte) f);
        cVar.d.b(b);
        cVar.d.b((byte) 1);
        cVar.d.b((byte) 0);
        cVar.d.b(0);
        cVar.d.b((byte) 0);
        return cVar;
    }

    private FlyModeLog a(String str) {
        int a = ((b) com.fimi.kernel.c.c().a(com.fimi.soul.module.update.b.w, b.class)).a();
        int f = ((b) com.fimi.kernel.c.c().a(com.fimi.soul.module.update.b.w, b.class)).f();
        FlyModeLog flyModeLog = new FlyModeLog();
        flyModeLog.setUserID(com.fimi.soul.base.a.b(this.D).getUserID());
        flyModeLog.setFcVersion(a + "");
        flyModeLog.setOpenType(str);
        flyModeLog.setApplyTime(ao.b(System.currentTimeMillis()));
        flyModeLog.setX2Version(f + "");
        flyModeLog.setAppType("0");
        return flyModeLog;
    }

    private com.fimi.soul.drone.c.a.c b(int i, int i2) {
        com.fimi.soul.drone.c.a.c cVar = new com.fimi.soul.drone.c.a.c();
        cVar.b = 9;
        cVar.c = 135;
        cVar.d.b((byte) f);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 3);
        cVar.d.b((byte) i);
        cVar.d.b((byte) i2);
        cVar.d.b((byte) 0);
        return cVar;
    }

    private void b(byte b) {
        this.k.T().a(a(b));
    }

    private com.fimi.soul.drone.c.a.c d(int i) {
        com.fimi.soul.drone.c.a.c cVar = new com.fimi.soul.drone.c.a.c();
        cVar.b = 9;
        cVar.c = 135;
        cVar.d.b((byte) f);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 4);
        cVar.d.b((byte) 7);
        cVar.d.a((float) i);
        cVar.d.b((byte) 0);
        return cVar;
    }

    private com.fimi.soul.drone.c.a.c e(int i) {
        com.fimi.soul.drone.c.a.c cVar = new com.fimi.soul.drone.c.a.c();
        cVar.b = 9;
        cVar.c = 135;
        cVar.d.b((byte) f);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 4);
        cVar.d.b((byte) 3);
        cVar.d.a((float) i);
        cVar.d.b((byte) 0);
        return cVar;
    }

    private com.fimi.soul.drone.c.a.c f() {
        com.fimi.soul.drone.c.a.c cVar = new com.fimi.soul.drone.c.a.c();
        cVar.b = 9;
        cVar.c = 135;
        cVar.d.b((byte) g);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 1);
        cVar.d.b((byte) 0);
        cVar.d.b(0);
        cVar.d.b((byte) 0);
        return cVar;
    }

    private com.fimi.soul.drone.c.a.c f(int i) {
        com.fimi.soul.drone.c.a.c cVar = new com.fimi.soul.drone.c.a.c();
        cVar.b = 9;
        cVar.c = 135;
        cVar.d.b((byte) f);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 4);
        cVar.d.b((byte) 5);
        cVar.d.a((float) i);
        cVar.d.b((byte) 0);
        return cVar;
    }

    private com.fimi.soul.drone.c.a.c g() {
        com.fimi.soul.drone.c.a.c cVar = new com.fimi.soul.drone.c.a.c();
        cVar.b = 9;
        cVar.c = 135;
        cVar.d.b((byte) g);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 3);
        cVar.d.b((byte) 0);
        cVar.d.b(0);
        cVar.d.b((byte) 0);
        return cVar;
    }

    private com.fimi.soul.drone.c.a.c h() {
        com.fimi.soul.drone.c.a.c cVar = new com.fimi.soul.drone.c.a.c();
        cVar.b = 9;
        cVar.c = 135;
        cVar.d.b((byte) g);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 4);
        cVar.d.b((byte) 7);
        cVar.d.a(0.0f);
        cVar.d.b((byte) 0);
        return cVar;
    }

    private com.fimi.soul.drone.c.a.c i() {
        com.fimi.soul.drone.c.a.c cVar = new com.fimi.soul.drone.c.a.c();
        cVar.b = 9;
        cVar.c = 135;
        cVar.d.b((byte) g);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 4);
        cVar.d.b((byte) 3);
        cVar.d.a(0.0f);
        cVar.d.b((byte) 0);
        return cVar;
    }

    private com.fimi.soul.drone.c.a.c j() {
        com.fimi.soul.drone.c.a.c cVar = new com.fimi.soul.drone.c.a.c();
        cVar.b = 9;
        cVar.c = 135;
        cVar.d.b((byte) g);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 4);
        cVar.d.b((byte) 5);
        cVar.d.a(0.0f);
        cVar.d.b((byte) 0);
        return cVar;
    }

    private void k() {
        if (com.fimi.kernel.c.b().b() != null && com.fimi.kernel.c.b().b().isShowing()) {
            com.fimi.kernel.c.b().c();
        }
    }

    public void a() {
        this.k.T().a(h());
    }

    public void a(int i) {
        if (this.C) {
            i = (int) t.d((double) i);
        }
        this.k.T().a(d(i));
    }

    public void a(int i, int i2) {
        this.k.T().a(b(i, i2));
    }

    public void a(int i, final e eVar) {
        this.z = i;
        if (!this.k.U()) {
            z.a(this.D, (int) R.string.set_new_hand_fail, z.b);
        } else if (this.k.ac()) {
            z.a(this.D, this.D.getString(R.string.not_set_flight_distance_in_sky), z.b);
        } else if (i == 5000) {
            a(500);
            eVar.a(500);
        } else {
            final FlyModeLog a = a("2");
            new f.a(this.D).a(this.D.getString(R.string.setting_dialog_warm_hint)).b(this.D.getString(R.string.more_distance_cue)).a(this.D.getResources().getColor(R.color.dialog_ensure_hot)).b(this.D.getString(R.string.setting_dialog_agree), new OnClickListener(this) {
                final /* synthetic */ c c;

                public void onClick(DialogInterface dialogInterface, int i) {
                    this.c.a(5000);
                    eVar.a(5000);
                    this.c.E.a(a);
                }
            }).a(this.D.getString(R.string.cancel), new OnClickListener(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).a().show();
        }
    }

    public void a(SwitchButton switchButton, Setting setting) {
        if (!this.k.U()) {
            z.a(this.D, (int) R.string.set_new_hand_fail, z.b);
        } else if (this.k.ac()) {
            z.a(this.D, this.D.getString(R.string.not_set_newhand_in_sky), z.b);
        } else if (setting.getIsOPen().booleanValue()) {
            switchButton.a(false, true);
            b((byte) 1);
        } else {
            switchButton.a(true, true);
            b((byte) 0);
        }
    }

    public void a(List<Setting> list) {
        if (!((Setting) list.get(d.NEW_HAND_MODE.ordinal())).getIsOPen().booleanValue()) {
            if (!this.k.U()) {
                z.a(this.D, (int) R.string.set_new_hand_fail, z.b);
            } else if (this.k.ac()) {
                z.a(this.D, this.D.getString(R.string.not_set_attitude_in_sky), z.b);
            } else if (((Setting) list.get(d.FORCED_ATTITUDE_MODE.ordinal())).getIsOPen().booleanValue()) {
                a(4, 0);
            } else {
                new f.a(this.D).a(this.D.getString(R.string.setting_dialog_warm_hint)).b(this.D.getString(R.string.force_attiyude_mode_delcare)).a(this.D.getResources().getColor(R.color.dialog_ensure_hot)).b(this.D.getString(R.string.setting_dialog_agree), new OnClickListener(this) {
                    final /* synthetic */ c a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        final FlyModeLog a = this.a.a("1");
                        int l = com.fimi.kernel.c.e().l();
                        if (l >= 2) {
                            this.a.a(4, 1);
                            this.a.E.a(a);
                            return;
                        }
                        com.fimi.kernel.c.e().b(l + 1);
                        new f.d(this.a.D).a((int) R.drawable.img_right_pulley).a(this.a.D.getString(R.string.setting_dialog_button_force_attitude)).a(this.a.D.getString(R.string.ensure), new OnClickListener(this) {
                            final /* synthetic */ AnonymousClass3 b;

                            public void onClick(DialogInterface dialogInterface, int i) {
                                this.b.a.a(4, 1);
                                this.b.a.E.a(a);
                            }
                        }).a().show();
                    }
                }).a(this.D.getString(R.string.cancel), new OnClickListener(this) {
                    final /* synthetic */ c a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).a().show();
            }
        }
    }

    public void a(List<Setting> list, final k kVar) {
        if (!((Setting) list.get(d.NEW_HAND_MODE.ordinal())).getIsOPen().booleanValue() && !((Setting) list.get(d.FORCED_ATTITUDE_MODE.ordinal())).getIsOPen().booleanValue()) {
            if (!this.k.U()) {
                z.a(this.D, (int) R.string.set_new_hand_fail, z.b);
            } else if (this.k.ac()) {
                z.a(this.D, this.D.getString(R.string.not_set_optical_flow_in_sky), z.b);
            } else if (((Setting) list.get(d.OPTICAL_FLOW_MODE.ordinal())).getIsOPen().booleanValue()) {
                a(2, 0);
            } else {
                final FlyModeLog a = a("0");
                new f.a(this.D).a(this.D.getString(R.string.setting_dialog_warm_hint)).b(this.D.getString(R.string.assist_the_location_mode_to_open_please_be_careful_to_fly)).a(this.D.getResources().getColor(R.color.dialog_ensure_hot)).b(this.D.getString(R.string.ensure), new OnClickListener(this) {
                    final /* synthetic */ c c;

                    public void onClick(DialogInterface dialogInterface, int i) {
                        this.c.a(2, 1);
                        this.c.E.a(a);
                        kVar.a(com.fimi.soul.base.a.b(this.c.D), k.b, new com.fimi.soul.biz.m.k(this) {
                            final /* synthetic */ AnonymousClass5 a;

                            {
                                this.a = r1;
                            }

                            public void a(PlaneMsg planeMsg, File file) {
                                if (!planeMsg.isSuccess()) {
                                }
                            }
                        });
                    }
                }).a(this.D.getString(R.string.refuse), new OnClickListener(this) {
                    final /* synthetic */ c a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).a().show();
            }
        }
    }

    public void b() {
        this.k.T().a(i());
    }

    public void b(int i) {
        if (this.C) {
            i = (int) t.c((double) i);
        }
        this.k.T().a(e(i));
    }

    public void b(int i, e eVar) {
        this.A = i;
        if (!this.k.U()) {
            z.a(this.D, (int) R.string.set_new_hand_fail, z.b);
        } else if (this.k.ac()) {
            z.a(this.D, this.D.getString(R.string.not_set_flight_speed_in_sky), z.b);
        } else {
            String string = this.C ? this.D.getString(R.string.speed_unit_mph) : this.D.getString(R.string.speed_unit_m);
            int b = this.C ? (int) t.b(18.0d) : 18;
            final int b2 = com.fimi.kernel.c.e().m() ? (int) t.b(3.0d) : 3;
            if (this.C) {
                int b3 = (int) t.b((double) Integer.parseInt(com.fimi.kernel.c.e().g()));
            } else {
                Integer.parseInt(com.fimi.kernel.c.e().g());
            }
            new f.b(this.D).c(this.D.getString(R.string.flight_speed_limit)).a(b2).b(b).d(this.D.getResources().getColor(R.color.dialog_ensure_hot)).a(string).b(this.D.getString(R.string.dialog_speed_unit)).a(true).c(this.A).a(this.D.getString(R.string.cancel), new OnClickListener(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).b(this.D.getString(R.string.ensure), new OnClickListener(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    this.a.b(this.a.A);
                }
            }).a(new OnSeekBarChangeListener(this) {
                final /* synthetic */ c b;

                public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    this.b.A = b2 + i;
                }

                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            }).a().show();
        }
    }

    public void c() {
        this.k.T().a(j());
    }

    public void c(int i) {
        if (this.C) {
            i = (int) t.d((double) i);
        }
        this.k.T().a(f(i));
    }

    public void c(int i, final e eVar) {
        this.B = i;
        if (!this.k.U()) {
            z.a(this.D, (int) R.string.set_new_hand_fail, z.b);
        } else if (this.k.ac()) {
            z.a(this.D, this.D.getString(R.string.not_set_flight_height_in_sky), z.b);
        } else {
            String string = this.C ? this.D.getString(R.string.distance_unit_ft) : this.D.getString(R.string.distance_unit_m);
            int a = this.C ? (int) t.a((double) Integer.parseInt(com.fimi.kernel.c.e().h())) : Integer.parseInt(com.fimi.kernel.c.e().h());
            final int a2 = this.C ? (int) t.a(30.0d) : 30;
            new f.b(this.D).c(this.D.getString(R.string.flight_height)).a(a2).b(this.C ? (int) t.a(500.0d) : 500).d(this.D.getResources().getColor(R.color.dialog_ensure_hot)).a(string).b(this.D.getString(R.string.dialog_height_unit)).c(a).a(this.D.getString(R.string.cancel), new OnClickListener(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).b(this.D.getString(R.string.ensure), new OnClickListener(this) {
                final /* synthetic */ c b;

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (this.b.B > 120) {
                        new f.a(this.b.D).a(this.b.D.getString(R.string.setting_dialog_warm_hint)).b(this.b.D.getString(R.string.more_height_cue)).a(this.b.D.getResources().getColor(R.color.dialog_ensure_hot)).b(this.b.D.getString(R.string.setting_dialog_agree), new OnClickListener(this) {
                            final /* synthetic */ AnonymousClass12 a;

                            {
                                this.a = r1;
                            }

                            public void onClick(DialogInterface dialogInterface, int i) {
                                this.a.b.c(this.a.b.B);
                                this.a.b.E.a(this.a.b.a("3"));
                                eVar.a(this.a.b.B);
                            }
                        }).a(this.b.D.getString(R.string.cancel), new OnClickListener(this) {
                            final /* synthetic */ AnonymousClass12 a;

                            {
                                this.a = r1;
                            }

                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).a().show();
                        return;
                    }
                    this.b.c(this.b.B);
                    eVar.a(this.b.B);
                }
            }).a(new OnSeekBarChangeListener(this) {
                final /* synthetic */ c b;

                public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    this.b.B = a2 + i;
                }

                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            }).a().show();
        }
    }

    public void d() {
        this.k.T().a(g());
    }

    public void e() {
        this.k.T().a(f());
    }
}
