package com.fimi.soul.module.paircode;

import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.drone.c.a.a.t;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.ae;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.f.a;

public class PairCodeActivity extends BaseActivity implements OnClickListener, b {
    public static boolean a = false;
    private FragmentManager b;
    private PairResultFragment c;
    private PairErrorFragment d;
    private PairFragment e;
    private TextView f;
    private ImageView g;
    private a h;

    private void b() {
        a aVar = new a(this);
        aVar.a(getString(R.string.exit_dialog_msg));
        aVar.a(getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
            final /* synthetic */ PairCodeActivity a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        aVar.b(getString(R.string.ensure), new DialogInterface.OnClickListener(this) {
            final /* synthetic */ PairCodeActivity a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.a.c();
            }
        });
        aVar.a().show();
    }

    private void c() {
        t tVar = new t();
        tVar.a((byte) 9);
        tVar.a(d.a().k());
        this.drone.T().a(tVar.a());
    }

    public void a() {
        this.b.beginTransaction().replace(R.id.pair_context, this.e).commit();
    }

    public void a(a aVar) {
        this.h = aVar;
    }

    public void onBackPressed() {
        if (this.c != null && a && this.drone.T().a()) {
            b();
        } else {
            super.onBackPressed();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.pair_back_btn:
                if (this.c != null && a && this.drone.T().a()) {
                    b();
                    return;
                } else {
                    finish();
                    return;
                }
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.paircode_layout);
        this.f = (TextView) findViewById(R.id.pair_title);
        this.g = (ImageView) findViewById(R.id.pair_back_btn);
        this.g.setOnClickListener(this);
        ao.a(getAssets(), this.f, this.g);
        this.b = getFragmentManager();
        this.c = new PairResultFragment();
        this.e = new PairFragment();
        this.d = new PairErrorFragment();
        this.b.beginTransaction().replace(R.id.pair_context, this.e).commit();
        getWindow().addFlags(128);
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        super.onDroneEvent(aVar, aVar2);
        switch (aVar) {
            case PAIR_CODE:
                ae e = aVar2.e();
                byte c = e.c();
                if (e.d() != (byte) 9) {
                    this.b.beginTransaction().replace(R.id.pair_context, this.c).commit();
                } else if (c == (byte) 2) {
                    finish();
                } else if (c == (byte) 3) {
                    z.a((Context) this, getString(R.string.pair_fail));
                    a = false;
                    finish();
                    return;
                }
                if (this.h != null) {
                    this.h.a(c, e.e());
                    return;
                }
                return;
            case CLEANALLOBJ:
                if (a) {
                    this.b.beginTransaction().replace(R.id.pair_context, this.d).commit();
                    a = false;
                    return;
                } else if (this.h != null) {
                    this.h.a(2);
                    a = false;
                    return;
                } else {
                    return;
                }
            case CONNECTSUCESS:
                if (this.h != null) {
                    this.h.a(16);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
