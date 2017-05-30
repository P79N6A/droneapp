package com.fimi.soul.utils;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.overseas.soul.R;

public class ak extends Dialog {
    Dialog a;
    Runnable b = new Runnable(this) {
        final /* synthetic */ ak a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.e = this.a.e - 1;
            if (this.a.e >= 0) {
                this.a.i.postDelayed(this, 1000);
            } else if (this.a.c != null) {
                this.a.c.a();
            }
        }
    };
    private a c;
    private Context d;
    private int e;
    private TextView f;
    private TextView g;
    private ImageView h;
    private Handler i = new Handler();

    public interface a {
        void a();
    }

    public ak(Context context, a aVar, int i) {
        super(context, R.style.Dialog_Fullscreen);
        this.d = context;
        this.c = aVar;
        this.e = i;
        this.i.post(this.b);
    }

    public void a(int i) {
        if (this.h != null) {
            this.h.setImageResource(i);
        }
    }

    public void a(String str) {
        if (this.f != null) {
            this.f.setText(str);
        }
    }

    public void b(String str) {
        if (this.f != null) {
            this.g.setText(str);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setContentView(R.layout.lostcontroldialog);
        this.h = (ImageView) findViewById(R.id.erroric);
        this.f = (TextView) findViewById(R.id.title);
        this.g = (TextView) findViewById(R.id.desmessage);
        this.f.getPaint().setFakeBoldText(true);
        ao.a(this.d.getAssets(), this.f, this.g);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 == i && this.c != null) {
            this.c.a();
        }
        return super.onKeyDown(i, keyEvent);
    }
}
