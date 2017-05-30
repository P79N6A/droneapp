package com.fimi.soul.module.a.a.a;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView.ScaleType;
import com.fimi.soul.module.a.c;
import com.fimi.soul.module.a.e;
import com.mob.tools.gui.ScaledImageView;

public class h extends c implements OnGlobalLayoutListener {
    private Bitmap a;
    private ScaledImageView b;

    public h(e eVar) {
        super(eVar);
    }

    public void a(Bitmap bitmap) {
        this.a = bitmap;
    }

    public void onCreate() {
        this.activity.getWindow().setBackgroundDrawable(new ColorDrawable(1275068416));
        this.b = new ScaledImageView(this.activity);
        this.b.setScaleType(ScaleType.MATRIX);
        this.activity.setContentView(this.b);
        if (this.a != null) {
            this.b.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    public void onGlobalLayout() {
        this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.b.post(new Runnable(this) {
            final /* synthetic */ h a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.b.setBitmap(this.a.a);
            }
        });
    }
}
