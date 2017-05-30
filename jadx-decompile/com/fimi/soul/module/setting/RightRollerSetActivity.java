package com.fimi.soul.module.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.c.a.a.bf;
import com.fimi.soul.drone.c.a.a.m;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.c;
import java.util.ArrayList;
import java.util.List;

public class RightRollerSetActivity extends FragmentActivity implements OnClickListener, b {
    g a;
    com.fimi.soul.drone.a b;
    ListView c;
    Button d;
    Intent e;
    boolean f = true;
    String g = "";
    int h = -1;
    boolean i = false;

    public enum a {
        ev,
        light,
        ATTI_GPS
    }

    private void a(a aVar) {
        if (aVar != a.ATTI_GPS) {
            bf bfVar = new bf();
            bfVar.d = m.b;
            bfVar.e = (byte) 1;
            if (aVar == a.ev) {
                bfVar.f = (byte) 1;
                this.e.putExtra("content", getString(R.string.ev_control));
            } else if (aVar == a.light) {
                bfVar.f = (byte) 2;
                this.e.putExtra("content", getString(R.string.light_control));
            }
            this.b.T().a(bfVar.a());
            this.i = true;
        }
        setResult(-1, this.e);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.black_btn:
                finish();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.right_roller_layout);
        this.d = (Button) findViewById(R.id.black_btn);
        this.d.setOnClickListener(this);
        this.c = (ListView) findViewById(R.id.right_listview);
        getWindow().addFlags(128);
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        if (aVar2.T().a() && aVar2.U()) {
            switch (aVar) {
                case backControl:
                    c L = aVar2.L();
                    if (L != null && L.b() == m.b && this.i) {
                        if (L.c() == (byte) 2) {
                            switch (L.d) {
                                case (byte) 1:
                                    this.a.a(1);
                                    this.h = 1;
                                    break;
                                case (byte) 2:
                                    this.a.a(0);
                                    this.h = 0;
                                    break;
                            }
                            z.a((Context) this, getString(R.string.set_success));
                        } else if (L.c() == (byte) 4 || L.c() == (byte) 6) {
                            z.a((Context) this, getString(R.string.setting_false));
                            this.h = -1;
                        }
                        this.i = false;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    protected void onResume() {
        super.onResume();
        this.e = getIntent();
        if (this.b.T().a() && this.b.U()) {
            this.f = this.e.getBooleanExtra("GPS_ATTI", false);
            this.g = this.e.getStringExtra("curModel") != null ? this.e.getStringExtra("curModel") : "";
            if (this.a != null && this.f) {
                this.a.b(true);
                this.a.a(2);
                this.c.setClickable(false);
                return;
            } else if (!this.f && this.a != null) {
                this.c.setClickable(true);
                this.a.b(false);
                if (this.g.equals(getString(R.string.ev_control))) {
                    this.a.a(1);
                    return;
                } else if (this.g.equals(getString(R.string.light_control))) {
                    this.a.a(0);
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.c.setClickable(false);
        this.a.a(true);
    }

    public void onStart() {
        super.onStart();
        this.b = ((DroidPlannerApp) getApplication()).a;
        this.b.a((b) this);
        String[] stringArray = getResources().getStringArray(R.array.right_set);
        List arrayList = new ArrayList();
        if (stringArray != null && stringArray.length > 0) {
            for (String str : stringArray) {
                h hVar = new h();
                hVar.a(false);
                hVar.a(str);
                arrayList.add(hVar);
            }
        }
        this.a = new g(this, arrayList);
        this.c.setAdapter(this.a);
        this.c.setOnItemClickListener(new OnItemClickListener(this) {
            final /* synthetic */ RightRollerSetActivity a;

            {
                this.a = r1;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long j) {
                if (this.a.b.T().a() && this.a.b.U()) {
                    switch (i) {
                        case 0:
                            this.a.a(a.light);
                            break;
                        case 1:
                            this.a.a(a.ev);
                            break;
                    }
                    view.setOnTouchListener(new OnTouchListener(this) {
                        final /* synthetic */ AnonymousClass1 b;

                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            return i == this.b.a.h || i == 2;
                        }
                    });
                    return;
                }
                z.a(this.a, this.a.getString(R.string.right_scroll_mode_des));
            }
        });
        this.c.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ RightRollerSetActivity a;

            {
                this.a = r1;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                return (!this.a.f && this.a.b.U() && this.a.b.T().a()) ? false : true;
            }
        });
    }

    protected void onStop() {
        super.onStop();
        if (this.b != null) {
            this.b.b((b) this);
        }
    }
}
