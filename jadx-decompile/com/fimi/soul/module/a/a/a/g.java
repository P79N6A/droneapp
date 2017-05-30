package com.fimi.soul.module.a.a.a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.maps.model.b;
import com.mob.tools.utils.R;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public class g extends LinearLayout {
    private static final int a = 720;
    private static final int b = 64;
    private static final int c = 24;
    private TextView d;
    private k e;
    private ProgressBar f;

    public g(Context context) {
        super(context);
        int[] screenSize = R.getScreenSize(context);
        float f = (screenSize[0] < screenSize[1] ? (float) screenSize[0] : (float) screenSize[1]) / 720.0f;
        setOrientation(1);
        View linearLayout = new LinearLayout(context);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        addView(linearLayout, layoutParams);
        this.e = new k(context);
        int bitmapRes = R.getBitmapRes(context, "ssdk_oks_ptr_ptr");
        if (bitmapRes > 0) {
            this.e.setImageResource(bitmapRes);
        }
        bitmapRes = (int) (64.0f * f);
        LayoutParams layoutParams2 = new LinearLayout.LayoutParams(bitmapRes, bitmapRes);
        layoutParams2.gravity = 16;
        int i = (int) (f * 24.0f);
        layoutParams2.bottomMargin = i;
        layoutParams2.topMargin = i;
        linearLayout.addView(this.e, layoutParams2);
        this.f = new ProgressBar(context);
        this.f.setIndeterminateDrawable(context.getResources().getDrawable(R.getBitmapRes(context, "ssdk_oks_classic_progressbar")));
        linearLayout.addView(this.f, layoutParams2);
        this.f.setVisibility(8);
        this.d = new TextView(getContext());
        this.d.setTextSize(2, 18.0f);
        this.d.setPadding(i, 0, i, 0);
        this.d.setTextColor(-16139513);
        LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        linearLayout.addView(this.d, layoutParams3);
    }

    @TargetApi(11)
    public void a() {
        this.e.setVisibility(8);
        this.f.setVisibility(0);
        int stringRes = R.getStringRes(getContext(), "ssdk_oks_refreshing");
        if (stringRes > 0) {
            this.d.setText(stringRes);
        }
    }

    @SuppressLint({"NewApi"})
    @TargetApi(11)
    public void a(int i) {
        int i2 = Opcodes.GETFIELD;
        if (i > 100) {
            int i3 = ((i - 100) * Opcodes.GETFIELD) / 20;
            if (i3 <= Opcodes.GETFIELD) {
                i2 = i3;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            this.e.setRotation((float) i2);
        } else {
            this.e.setRotation(0.0f);
        }
        if (i < 100) {
            i2 = R.getStringRes(getContext(), "ssdk_oks_pull_to_refresh");
            if (i2 > 0) {
                this.d.setText(i2);
                return;
            }
            return;
        }
        i2 = R.getStringRes(getContext(), "ssdk_oks_release_to_refresh");
        if (i2 > 0) {
            this.d.setText(i2);
        }
    }

    @SuppressLint({"NewApi"})
    public void b() {
        this.f.setVisibility(8);
        this.e.setRotation(b.e);
        this.e.setVisibility(0);
    }
}
