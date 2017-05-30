package com.fimi.soul.module.remote;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.f.a;

public class RemoteModelActivity extends BaseActivity implements OnClickListener, b {
    public static final String a = "remodel";
    private PercentRelativeLayout b;
    private Button c;
    private Button d;
    private Button e;
    private TextView f;
    private TextView g;
    private TextView h;
    private ImageView i;
    private ImageView j;
    private d k;
    private boolean l;
    private v m;

    private void a() {
        this.l = false;
        this.i.setImageResource(R.drawable.switchover_japan_right);
        this.j.setImageResource(R.drawable.switchover_japan__leftbg);
        a(this.e, 75);
        a(this.d, 255);
        this.e.setBackgroundResource(R.drawable.btn_switchover_left);
        this.d.setBackgroundResource(R.drawable.btn_switchover_right_on);
    }

    private void b() {
        this.l = true;
        this.i.setImageResource(R.drawable.switchover_usa_right_bg);
        this.j.setImageResource(R.drawable.switchover_usa_left_bg);
        a(this.e, 255);
        a(this.d, 75);
        this.e.setBackgroundResource(R.drawable.btn_switchover_left_on);
        this.d.setBackgroundResource(R.drawable.btn_switchover_right);
    }

    public void a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.usabutton:
                if (!this.l) {
                    if (!this.drone.T().a()) {
                        z.a((Context) this, getString(R.string.switch_mode_fail_please_connect_remote), z.b);
                        return;
                    } else if (this.drone.U()) {
                        z.a((Context) this, getString(R.string.close_plane_switch_rocket), z.b);
                        return;
                    } else {
                        new a(this).a(getString(R.string.choose_recoker_mode_msg)).c(17).a(getResources().getColor(R.color.dialog_ensure_hot)).b(getString(R.string.ensure), new DialogInterface.OnClickListener(this) {
                            final /* synthetic */ RemoteModelActivity a;

                            {
                                this.a = r1;
                            }

                            public void onClick(DialogInterface dialogInterface, int i) {
                                this.a.k.h();
                            }
                        }).a(getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                            final /* synthetic */ RemoteModelActivity a;

                            {
                                this.a = r1;
                            }

                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).a().show();
                        return;
                    }
                }
                return;
            case R.id.jpabutton:
                if (!this.l) {
                    return;
                }
                if (!this.drone.T().a()) {
                    z.a((Context) this, getString(R.string.switch_mode_fail_please_connect_remote), z.b);
                    return;
                } else if (this.drone.U()) {
                    z.a((Context) this, getString(R.string.close_plane_switch_rocket), z.b);
                    return;
                } else {
                    new a(this).a(getString(R.string.choose_recoker_mode_msg)).c(17).a(getResources().getColor(R.color.dialog_ensure_hot)).b(getString(R.string.ensure), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ RemoteModelActivity a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            this.a.k.i();
                        }
                    }).a(getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ RemoteModelActivity a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).a().show();
                    return;
                }
            case R.id.black_btn:
                finish();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.droneremotemodel);
        getWindow().setFlags(128, 128);
        this.b = (PercentRelativeLayout) findViewById(R.id.heardView);
        this.c = (Button) this.b.findViewById(R.id.black_btn);
        this.c.setOnClickListener(this);
        this.e = (Button) findViewById(R.id.usabutton);
        this.e.setOnClickListener(this);
        this.d = (Button) findViewById(R.id.jpabutton);
        this.d.setOnClickListener(this);
        this.i = (ImageView) findViewById(R.id.remoteviewright);
        this.j = (ImageView) findViewById(R.id.remoteviewleft);
        this.f = (TextView) findViewById(R.id.tv_settingTitle);
        this.g = (TextView) findViewById(R.id.leftremotetext);
        this.h = (TextView) findViewById(R.id.rightremotetext);
        this.f.setText(R.string.switch_remote_mode);
        ao.a(getAssets(), this.f, this.g, this.h, this.e, this.d);
        this.m = v.a((Context) this);
        if (this.m.a().getInt(a, 0) == 0) {
            b();
        } else {
            a();
        }
        this.k = d.a(this.drone);
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        super.onDroneEvent(aVar, aVar2);
        switch (aVar) {
            case backControl:
                com.fimi.soul.module.calibcompass.a.a().a("98");
                if (aVar2.L().c() != (byte) 2) {
                    return;
                }
                if (aVar2.L().d() == (byte) 2) {
                    this.m.a().edit().putInt(a, 1).commit();
                    a();
                    return;
                } else if (aVar2.L().d() == (byte) 1) {
                    this.m.a().edit().putInt(a, 0).commit();
                    b();
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    protected void onResume() {
        super.onResume();
        this.drone.a((b) this);
    }

    protected void onStop() {
        super.onStop();
        this.drone.b((b) this);
    }
}
