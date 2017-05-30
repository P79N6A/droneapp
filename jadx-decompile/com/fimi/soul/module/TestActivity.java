package com.fimi.soul.module;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.fimi.overseas.soul.R;
import com.fimi.soul.view.EVview;
import java.util.Timer;
import java.util.TimerTask;

public class TestActivity extends Activity {
    private EVview a;
    private int b = 0;
    private Handler c = new Handler(this) {
        final /* synthetic */ TestActivity a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            this.a.a.a((float) this.a.b);
        }
    };

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ev_layout);
        this.a = (EVview) findViewById(R.id.ev_v);
        new Timer().schedule(new TimerTask(this) {
            final /* synthetic */ TestActivity a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.c.sendEmptyMessage(0);
                this.a.b = this.a.b + 1;
                if (this.a.b == 12) {
                    this.a.b = 0;
                }
            }
        }, 500, 1000);
    }
}
