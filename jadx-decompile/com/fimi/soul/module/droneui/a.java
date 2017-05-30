package com.fimi.soul.module.droneui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class a extends Dialog implements OnClickListener {
    Runnable a = new Runnable(this) {
        final /* synthetic */ a a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.i = this.a.i - 1;
            if (this.a.i >= 0 || this.a.h == null) {
                this.a.b.postDelayed(this.a.a, 1000);
            } else {
                this.a.h.d();
            }
        }
    };
    final Handler b = new Handler(this) {
        final /* synthetic */ a a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
        }
    };
    private String c = null;
    private String d = null;
    private int e = 0;
    private boolean f = false;
    private Context g;
    private a h;
    private int i = 0;

    public interface a {
        void a();

        void b();

        void c();

        void d();
    }

    public a(Context context, String str, String str2, int i, int i2, boolean z, a aVar) {
        super(context, R.style.Dialog_Fullscreen);
        this.g = context;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = z;
        this.h = aVar;
        this.i = i2;
        this.b.postDelayed(this.a, 1000);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.command_one:
                if (this.h != null) {
                    this.h.b();
                    return;
                }
                return;
            case R.id.command_two:
                if (this.h != null) {
                    this.h.c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        setContentView(R.layout.activity_fault);
        TextView textView = (TextView) findViewById(R.id.fault_describe);
        ImageView imageView = (ImageView) findViewById(R.id.error_icon);
        ao.a(this.g.getAssets(), (TextView) findViewById(R.id.fault_title));
        ao.a(this.g.getAssets(), textView);
        r0.setText(this.c);
        textView.setText(this.d);
        if (this.e != 0) {
            imageView.setImageBitmap(BitmapFactory.decodeResource(this.g.getResources(), this.e));
        }
        findViewById(R.id.command_one).setVisibility(this.f ? 0 : 8);
        View findViewById = findViewById(R.id.command_two);
        if (!this.f) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.h != null) {
            this.h.a();
        }
        return super.onKeyDown(i, keyEvent);
    }
}
