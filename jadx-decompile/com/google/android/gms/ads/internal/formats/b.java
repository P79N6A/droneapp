package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;
import java.util.List;

@aaa
class b extends RelativeLayout {
    private static final float[] a = new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private final RelativeLayout b;
    @Nullable
    private AnimationDrawable c;

    public b(Context context, a aVar) {
        super(context);
        d.a((Object) aVar);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        switch (aVar.g()) {
            case 0:
                layoutParams.addRule(10);
                layoutParams.addRule(9);
                break;
            case 2:
                layoutParams.addRule(12);
                layoutParams.addRule(11);
                break;
            case 3:
                layoutParams.addRule(12);
                layoutParams.addRule(9);
                break;
            default:
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                break;
        }
        Drawable shapeDrawable = new ShapeDrawable(new RoundRectShape(a, null, null));
        shapeDrawable.getPaint().setColor(aVar.c());
        this.b = new RelativeLayout(context);
        this.b.setLayoutParams(layoutParams);
        u.g().a(this.b, shapeDrawable);
        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(aVar.a())) {
            LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            View textView = new TextView(context);
            textView.setLayoutParams(layoutParams2);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(aVar.a());
            textView.setTextColor(aVar.d());
            textView.setTextSize((float) aVar.e());
            textView.setPadding(ac.a().a(context, 4), 0, ac.a().a(context, 4), 0);
            this.b.addView(textView);
            layoutParams.addRule(1, textView.getId());
        }
        View imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setId(1195835394);
        List<Drawable> b = aVar.b();
        if (b.size() > 1) {
            this.c = new AnimationDrawable();
            for (Drawable addFrame : b) {
                this.c.addFrame(addFrame, aVar.f());
            }
            u.g().a(imageView, this.c);
        } else if (b.size() == 1) {
            imageView.setImageDrawable((Drawable) b.get(0));
        }
        this.b.addView(imageView);
        addView(this.b);
    }

    public ViewGroup a() {
        return this.b;
    }

    public void onAttachedToWindow() {
        if (this.c != null) {
            this.c.start();
        }
        super.onAttachedToWindow();
    }
}
