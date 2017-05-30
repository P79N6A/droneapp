package com.fimi.soul.module.setting;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.s;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.SuggestBean;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.titlebar.FmTitleBar;
import com.google.firebase.a.a.a;
import java.io.File;
import java.io.IOException;

public class UserFeedBackActivity extends BaseActivity implements OnClickListener {
    private final String A = "3";
    private final String B = "4";
    private String C = "1";
    private OnCheckedChangeListener D = new OnCheckedChangeListener(this) {
        final /* synthetic */ UserFeedBackActivity a;

        {
            this.a = r1;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                switch (compoundButton.getId()) {
                    case R.id.fimi_plane:
                        this.a.j.setChecked(false);
                        this.a.k.setChecked(false);
                        this.a.l.setChecked(false);
                        compoundButton.setTag("1");
                        break;
                    case R.id.fimi_control:
                        this.a.i.setChecked(false);
                        this.a.k.setChecked(false);
                        this.a.l.setChecked(false);
                        compoundButton.setTag("2");
                        break;
                    case R.id.fimi_camera:
                        this.a.i.setChecked(false);
                        this.a.j.setChecked(false);
                        this.a.l.setChecked(false);
                        compoundButton.setTag("3");
                        break;
                    case R.id.fimi_app:
                        this.a.i.setChecked(false);
                        this.a.j.setChecked(false);
                        this.a.k.setChecked(false);
                        compoundButton.setTag("4");
                        break;
                }
                this.a.C = compoundButton.getTag().toString();
            }
        }
    };
    private ImageView a = null;
    private ImageView b = null;
    private Bitmap c = null;
    private Bitmap d = null;
    private Button e;
    private Button f;
    private FmTitleBar g;
    private InputMethodManager h;
    private CheckBox i;
    private CheckBox j;
    private CheckBox k;
    private CheckBox l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private EditText q;
    private EditText r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private ProgressDialog w = null;
    private SuggestBean x = new SuggestBean();
    private final String y = "1";
    private final String z = "2";

    private void a(int i, int i2) {
        z.a((Context) this, i, i2);
    }

    private void b() {
        this.e = (Button) findViewById(R.id.back_btn);
        this.e.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ UserFeedBackActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
    }

    private void c() {
        this.s = (TextView) findViewById(R.id.textView1);
        this.t = (TextView) findViewById(R.id.textView2);
        this.u = (TextView) findViewById(R.id.textView3);
        this.v = (TextView) findViewById(R.id.textView4);
        this.i = (CheckBox) findViewById(R.id.fimi_plane);
        this.j = (CheckBox) findViewById(R.id.fimi_control);
        this.k = (CheckBox) findViewById(R.id.fimi_camera);
        this.l = (CheckBox) findViewById(R.id.fimi_app);
        this.i.setChecked(true);
        this.i.setOnCheckedChangeListener(this.D);
        this.j.setOnCheckedChangeListener(this.D);
        this.k.setOnCheckedChangeListener(this.D);
        this.l.setOnCheckedChangeListener(this.D);
        this.m = (TextView) findViewById(R.id.plane_des);
        this.n = (TextView) findViewById(R.id.control_des);
        this.p = (TextView) findViewById(R.id.app_des);
        this.o = (TextView) findViewById(R.id.camera_des);
        this.q = (EditText) findViewById(R.id.suggestEdit);
        this.r = (EditText) findViewById(R.id.contactEdit);
        this.a = (ImageView) findViewById(R.id.image_add0);
        this.b = (ImageView) findViewById(R.id.image_del);
        this.f = (Button) findViewById(R.id.sendSuggest);
        this.b.setVisibility(4);
        this.b.setOnClickListener(this);
        this.a.setOnClickListener(this);
        this.f.setOnClickListener(this);
    }

    private boolean d() {
        if (this.preferencesUtil.a().contains("isfirstloading")) {
            return true;
        }
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra(a.k, true);
        startActivity(intent);
        finish();
        return false;
    }

    public void a() {
        Log.v("Method:", "doTrans");
        try {
            if (TextUtils.isEmpty(this.q.getText())) {
                a((int) R.string.please_fill_feedcontent, 1000);
            } else if (this.q.getText().length() < 5) {
                a((int) R.string.feedsize, 1000);
            } else if (this.q.getText().length() >= 1000) {
                a((int) R.string.feed_max_size, 1000);
            } else {
                this.x.setModel(this.C);
                this.w = ProgressDialog.show(this, null, getString(R.string.commit_ing));
                s sVar = new s(this);
                if (!(this.c == null || this.c.isRecycled())) {
                    sVar.a(this.c);
                }
                this.x.setUserID(com.fimi.soul.base.a.b(this).getUserID());
                this.x.setContact(this.r.getText().toString());
                this.x.setContent(this.q.getText().toString());
                sVar.a(this.x, new k(this) {
                    final /* synthetic */ UserFeedBackActivity a;

                    {
                        this.a = r1;
                    }

                    public void a(PlaneMsg planeMsg, File file) {
                        if (planeMsg == null || !planeMsg.isSuccess()) {
                            this.a.a((int) R.string.feed_false, 1000);
                        } else {
                            this.a.a((int) R.string.feed_success, 1000);
                            this.a.finish();
                        }
                        this.a.w.dismiss();
                    }
                });
            }
        } catch (Exception e) {
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (!(this.d == null || this.d.isRecycled())) {
                this.d.recycle();
                this.d = null;
            }
            getContentResolver();
            try {
                this.d = com.fimi.kernel.utils.s.a((Context) this, intent.getData(), getResources().getInteger(R.integer.image_lagar));
            } catch (IOException e) {
                e.getStackTrace();
            }
            if (this.d != null) {
                if (i == 0) {
                    this.a.setImageBitmap(this.d);
                    this.c = this.d;
                    this.b.setVisibility(0);
                }
                this.d = null;
            }
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_add0:
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("image/*");
                startActivityForResult(intent, 0);
                return;
            case R.id.image_del:
                this.a.setImageBitmap(null);
                this.b.setVisibility(4);
                return;
            case R.id.sendSuggest:
                if (ao.b((Context) this)) {
                    a();
                    return;
                } else {
                    a((int) R.string.login_result_net, 2000);
                    return;
                }
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_userfeedback);
        b();
        c();
        ao.a(getAssets(), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.f, this.s, this.t, this.u, this.v);
    }
}
