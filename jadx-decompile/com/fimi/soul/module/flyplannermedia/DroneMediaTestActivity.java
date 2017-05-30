package com.fimi.soul.module.flyplannermedia;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.biz.camera.entity.X11RespCmd;

public class DroneMediaTestActivity extends BaseActivity implements e<X11RespCmd> {
    d a;
    long b = 0;

    public void a(boolean z, X11RespCmd x11RespCmd) {
        Log.d("Good", x11RespCmd.getErrorMsg());
        switch (x11RespCmd.getMsg_id()) {
            case 257:
                this.a.s().d();
                return;
            case com.fimi.soul.biz.camera.e.T /*1283*/:
                getViewManager().a("切换目录成功！");
                this.a.s().f();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View button = new Button(this);
        button.setText("获取IDR");
        button.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DroneMediaTestActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                Log.d("Good", "开始获取IDR");
                this.a.b = System.currentTimeMillis();
                if (this.a.a.k().getCurDirFileList() == null) {
                }
            }
        });
        setContentView(button);
        this.a = (d) b.a().d();
        this.a.a(new com.fimi.soul.biz.camera.b.d(this) {
            final /* synthetic */ DroneMediaTestActivity a;

            {
                this.a = r1;
            }

            public void a(String str, String str2) {
                String str3 = "花费:" + (System.currentTimeMillis() - this.a.b) + "毫秒";
                Log.d("Good", str3);
                this.a.getViewManager().a(str3);
            }
        });
        if (!this.a.d()) {
            this.a.t().b();
        }
        this.a.a((e) this);
        this.a.c(new com.fimi.kernel.b.c.d(this) {
            final /* synthetic */ DroneMediaTestActivity a;

            {
                this.a = r1;
            }

            public void a(String str) {
                Log.d("Good", str + "");
            }
        });
    }
}
