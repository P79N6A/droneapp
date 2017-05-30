package com.fimi.soul.module.setting;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.FlightTimeInfo;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.FlyLogTools;
import com.fimi.soul.utils.ao;
import java.io.File;
import java.text.DecimalFormat;

public class FlyRecordActivity extends BaseActivity implements OnClickListener {
    TextView a;
    TextView b;
    TextView c;
    TextView d;
    TextView e;
    TextView f;
    TextView g;
    DroidPlannerApp h;
    com.fimi.soul.drone.a i;
    ImageView j;
    FlyLogTools k;
    private final int l = 16;
    private Handler m = new Handler(this) {
        final /* synthetic */ FlyRecordActivity a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            Bundle data = message.getData();
            long j = data.getLong("fly_distance");
            long j2 = data.getLong("flyTime");
            int i = data.getInt("fly_count");
            switch (message.what) {
                case 16:
                    this.a.a(i, j2, j);
                    return;
                default:
                    return;
            }
        }
    };

    private class a implements k {
        final /* synthetic */ FlyRecordActivity a;

        private a(FlyRecordActivity flyRecordActivity) {
            this.a = flyRecordActivity;
        }

        public void a(PlaneMsg planeMsg, File file) {
            if (planeMsg.isSuccess()) {
                c.c();
                FlightTimeInfo flightTimeInfo = (FlightTimeInfo) planeMsg.getData();
                Message message = new Message();
                Bundle bundle = new Bundle();
                long totalFlyTime = flightTimeInfo.getTotalFlyTime();
                int flyCount = flightTimeInfo.getFlyCount();
                long totalDistance = flightTimeInfo.getTotalDistance();
                bundle.putLong("flyTime", totalFlyTime);
                bundle.putInt("fly_count", flyCount);
                bundle.putLong("fly_distance", totalDistance);
                message.what = 16;
                message.setData(bundle);
                this.a.m.sendMessage(message);
                return;
            }
            z.a(this.a, this.a.getString(R.string.ask_exception));
        }
    }

    void a(int i, long j, long j2) {
        this.c.setText(String.format("%d", new Object[]{Integer.valueOf(i)}));
        if (j > 0) {
            j /= 60;
        }
        this.b.setText(String.format("%d", new Object[]{Long.valueOf(j)}));
        double d = ((double) j2) / 1000.0d;
        DecimalFormat decimalFormat = new DecimalFormat("######0.00");
        this.a.setText(String.format("%s", new Object[]{decimalFormat.format(d)}));
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_btn:
                finish();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fly_record_layout);
        this.d = (TextView) findViewById(R.id.fly_log_title);
        this.a = (TextView) findViewById(R.id.fly_Killometers);
        this.b = (TextView) findViewById(R.id.fly_long);
        this.c = (TextView) findViewById(R.id.fly_times);
        this.e = (TextView) findViewById(R.id.killo_v);
        this.f = (TextView) findViewById(R.id.fly_min_v);
        this.g = (TextView) findViewById(R.id.fly_count_v);
        this.j = (ImageView) findViewById(R.id.back_btn);
        this.j.setOnClickListener(this);
        ao.b(getAssets(), this.a, this.b, this.c);
        ao.a(getAssets(), this.e, this.f, this.g, this.d);
        getWindow().addFlags(128);
    }

    protected void onResume() {
        super.onResume();
        this.h = (DroidPlannerApp) getApplication();
        this.i = this.h.a;
        this.k.a(new a());
    }

    protected void onStart() {
        super.onStart();
        this.k = FlyLogTools.a((Context) this);
    }
}
