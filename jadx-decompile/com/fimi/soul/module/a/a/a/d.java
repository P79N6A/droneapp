package com.fimi.soul.module.a.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.view.ViewCompat;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fimi.soul.module.a.a.a.c.b;
import com.mob.tools.gui.AsyncImageView;
import com.mob.tools.gui.BitmapProcessor;
import com.mob.tools.utils.R;
import com.tencent.open.yyb.TitleBar;

public class d extends LinearLayout {
    private static final int a = 64;
    private static final int b = 24;
    private static final int c = 96;
    private static final int d = 20;
    private ImageView e;
    private AsyncImageView f;
    private TextView g;
    private Bitmap h;
    private Bitmap i;

    public d(Context context, float f) {
        super(context);
        int i = (int) (TitleBar.BACKBTN_LEFT_MARGIN * f);
        setPadding(i, 0, i, 0);
        setMinimumHeight((int) (96.0f * f));
        setBackgroundColor(-1);
        this.e = new ImageView(context);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        addView(this.e, layoutParams);
        this.f = new AsyncImageView(context);
        i = (int) (64.0f * f);
        LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.gravity = 16;
        i = (int) (24.0f * f);
        layoutParams2.setMargins(i, 0, i, 0);
        addView(this.f, layoutParams2);
        this.g = new TextView(context);
        this.g.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.g.setTextSize(2, 18.0f);
        this.g.setSingleLine();
        layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        layoutParams.weight = 1.0f;
        addView(this.g, layoutParams);
        i = R.getBitmapRes(context, "ssdk_oks_classic_check_checked");
        if (i > 0) {
            this.h = BitmapFactory.decodeResource(context.getResources(), i);
        }
        i = R.getBitmapRes(getContext(), "ssdk_oks_classic_check_default");
        if (i > 0) {
            this.i = BitmapFactory.decodeResource(context.getResources(), i);
        }
    }

    public void a(b bVar, boolean z) {
        this.g.setText(bVar.b);
        this.e.setImageBitmap(bVar.a ? this.h : this.i);
        if (this.f == null) {
            return;
        }
        if (z) {
            Bitmap bitmapFromCache = BitmapProcessor.getBitmapFromCache(bVar.e);
            if (bitmapFromCache == null || bitmapFromCache.isRecycled()) {
                this.f.execute(null, 0);
                return;
            } else {
                this.f.setImageBitmap(bitmapFromCache);
                return;
            }
        }
        this.f.execute(bVar.e, 0);
    }
}
