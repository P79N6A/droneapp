package com.fimi.soul.module.update;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.update.c;
import com.fimi.soul.biz.update.i;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.drone.a;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import java.io.File;
import java.util.List;

public class DowningActivity extends BaseActivity {
    private static final int g = 100;
    private static final int h = 0;
    private static final int m = 1;
    a a = null;
    List<UpdateVersonBean> b;
    private ImageView c;
    private ProgressView d;
    private TextView e;
    private int f = 0;
    private long i = 0;
    private int j = 1;
    private long k;
    private boolean l;
    private a n;
    private TextView o;
    private TextView p;
    private Toast q;

    private void a(UpdateVersonBean updateVersonBean) {
        this.a.b(updateVersonBean, this.a.e(updateVersonBean), new i(this) {
            final /* synthetic */ DowningActivity a;

            {
                this.a = r1;
            }

            public void a(boolean z, long j, long j2, int i) {
                if (!z) {
                    Message message = new Message();
                    message.what = 100;
                    message.arg1 = (int) j;
                    message.arg2 = (int) j2;
                    this.a.getHandler().sendMessageDelayed(message, 300);
                } else if (j == -2) {
                    this.a.c();
                } else if (this.a.j < this.a.f) {
                    this.a.getHandler().sendEmptyMessageDelayed(0, 300);
                } else if (this.a.n.U()) {
                    this.a.a(FindNewFirmwareAvtivity.class);
                } else {
                    z.a(this.a, (int) R.string.finish_down);
                    this.a.a(FlightActivity.class);
                }
            }
        });
    }

    private void a(List<UpdateVersonBean> list) {
        File file = new File(j.p());
        if (!file.exists()) {
            file.mkdir();
        }
        if (list != null && list.size() > 0) {
            this.f = list.size();
            this.a = new a();
            UpdateVersonBean updateVersonBean = (UpdateVersonBean) list.get(0);
            this.i = l.a((List) list);
            this.d.setMaxCount((float) this.i);
            a(updateVersonBean);
        }
    }

    private void d() {
        if (this.l) {
            c.b = true;
            this.q.cancel();
            a(FindOnlineFirmwareAvtivity.class);
            finish();
            return;
        }
        this.l = true;
        this.q = Toast.makeText(getApplicationContext(), R.string.cancel_downing, 0);
        this.q.show();
        getHandler().sendEmptyMessageDelayed(1, 2000);
    }

    public void a() {
        this.o = (TextView) findViewById(R.id.upgrade_result);
        this.p = (TextView) findViewById(R.id.upgrading_warning);
        ao.a(getAssets(), this.o);
        ao.a(getAssets(), this.p);
    }

    public void a(Class cls) {
        startActivity(new Intent(this, cls));
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    public void b() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getString(R.string.down_ing2));
        for (int i = 0; i < this.b.size(); i++) {
            stringBuilder.append(((UpdateVersonBean) this.b.get(i)).getSysname());
            if (i != this.b.size() - 1) {
                stringBuilder.append(getString(R.string.upgrade_symbol));
            }
        }
        this.p.setText(stringBuilder.toString());
    }

    public void c() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = this.j - 1; i < this.b.size(); i++) {
            stringBuffer.append(((UpdateVersonBean) this.b.get(i)).getSysname());
            if (i != this.b.size() - 1) {
                stringBuffer.append(getString(R.string.upgrade_symbol));
            } else {
                stringBuffer.append(getString(R.string.downfail1));
            }
        }
        Intent intent = new Intent(this, DownFailedActivity.class);
        intent.putExtra("DownLoadFailedInfo", stringBuffer.toString().substring(0, stringBuffer.length() - 1));
        startActivity(intent);
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dpa.b((Activity) this);
        setContentView(R.layout.activity_downing);
        getWindow().setFlags(128, 128);
        this.c = (ImageView) findViewById(R.id.down_img_anim);
        this.d = (ProgressView) findViewById(R.id.down_progress_view);
        this.e = (TextView) findViewById(R.id.tv_down_progress);
        c.b = false;
        c.c = false;
        this.b = com.fimi.kernel.c.c().b(UpdateVersonBean.SP_NEED_DOWN_FIRMWWARES, UpdateVersonBean.class);
        a(this.b);
        this.n = this.dpa.a;
        a();
        b();
    }

    protected void onDestroy() {
        super.onDestroy();
        c.c = true;
    }

    public void onHandleMessage(Message message) {
        super.onHandleMessage(message);
        if (message.what == 100) {
            long j = this.k + ((long) message.arg1);
            this.e.setText(((100 * j) / this.i) + "");
            this.d.setCurrentCount((float) j);
        }
        if (message.what == 0) {
            this.k = Long.valueOf(((UpdateVersonBean) this.b.get(this.j - 1)).getSize()).longValue() + this.k;
            UpdateVersonBean updateVersonBean = (UpdateVersonBean) this.b.get(this.j);
            this.j++;
            a(updateVersonBean);
        }
        if (message.what == 1) {
            this.l = false;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        d();
        return false;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.c.setBackgroundResource(R.drawable.update_anim);
        ((AnimationDrawable) this.c.getBackground()).start();
    }
}
