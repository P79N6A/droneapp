package com.fimi.soul.module.setting;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.drone.a;

public class b extends a {
    a a;

    public b(Context context, a aVar) {
        super(context);
        this.a = aVar;
    }

    private void g() {
        a((int) R.string.follow_mode, "", new OnClickListener(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
            }
        });
        a((int) R.string.follow_sensitivity, "", null);
        a((int) R.string.follow_dead_zone, "", null);
        a((int) R.string.work_mode, "", null);
        a((int) R.string.angle_limit, "", null);
        a((int) R.string.platform_correct, "", null);
        a((int) R.string.cloud_platform_upgrade, "", null);
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
    }

    public View c() {
        g();
        return b();
    }
}
