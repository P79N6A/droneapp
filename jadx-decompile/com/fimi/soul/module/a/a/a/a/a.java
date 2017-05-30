package com.fimi.soul.module.a.a.a.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.fimi.soul.module.a.a.a.b;
import com.fimi.soul.module.a.a.a.l;
import com.fimi.soul.module.a.e;
import com.mob.tools.gui.AsyncImageView;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.R;
import java.io.File;

public class a extends b implements TextWatcher, OnClickListener, Runnable {
    private static final int q = 720;
    private static final int r = 75;
    private static final int s = 40;
    private static final int t = 70;
    private static final int u = 280;
    private static final int v = 60;

    public a(e eVar) {
        super(eVar);
    }

    private void a(LinearLayout linearLayout, float f) {
        View linearLayout2 = new LinearLayout(this.activity);
        linearLayout2.setPadding(0, 0, 0, 5);
        linearLayout2.setBackgroundColor(-1);
        linearLayout.addView(linearLayout2, new LayoutParams(-1, (int) (75.0f * f)));
        int i = (int) (40.0f * f);
        this.n = new TextView(this.activity);
        this.n.setTextColor(-12895429);
        this.n.setTextSize(2, 18.0f);
        this.n.setGravity(85);
        onTextChanged(this.f.getText(), 0, 0, 0);
        this.n.setPadding(i, 0, i, 0);
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        linearLayout2.addView(this.n, layoutParams);
        View view = new View(this.activity);
        view.setBackgroundColor(-3355444);
        linearLayout.addView(view, new LayoutParams(-1, f > 1.0f ? (int) f : 1));
    }

    private void a(RelativeLayout relativeLayout, float f) {
        this.g = new TextView(this.activity);
        this.g.setTextColor(-12895429);
        this.g.setTextSize(2, 18.0f);
        this.g.setGravity(17);
        int stringRes = R.getStringRes(this.activity, "ssdk_oks_cancel");
        if (stringRes > 0) {
            this.g.setText(stringRes);
        }
        stringRes = (int) (40.0f * f);
        this.g.setPadding(stringRes, 0, stringRes, 0);
        relativeLayout.addView(this.g, new RelativeLayout.LayoutParams(-2, -1));
        this.g.setOnClickListener(this);
        View textView = new TextView(this.activity);
        textView.setTextColor(-12895429);
        textView.setTextSize(2, 22.0f);
        textView.setGravity(17);
        int stringRes2 = R.getStringRes(this.activity, "ssdk_oks_multi_share");
        if (stringRes2 > 0) {
            textView.setText(stringRes2);
        }
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.addRule(13);
        relativeLayout.addView(textView, layoutParams);
        this.h = new TextView(this.activity);
        this.h.setTextColor(-37615);
        this.h.setTextSize(2, 18.0f);
        this.h.setGravity(17);
        int stringRes3 = R.getStringRes(this.activity, "ssdk_oks_share");
        if (stringRes3 > 0) {
            this.h.setText(stringRes3);
        }
        this.h.setPadding(stringRes, 0, stringRes, 0);
        ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams2.addRule(11);
        relativeLayout.addView(this.h, layoutParams2);
        this.h.setOnClickListener(this);
    }

    private void a(AsyncImageView asyncImageView) {
        Object imageUrl = this.b.getImageUrl();
        String imagePath = this.b.getImagePath();
        String[] imageArray = this.b.getImageArray();
        Bitmap bitmap = null;
        this.i.setVisibility(0);
        if (!TextUtils.isEmpty(imagePath) && new File(imagePath).exists()) {
            try {
                bitmap = BitmapHelper.getBitmap(imagePath);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (bitmap != null) {
            this.o = bitmap;
            asyncImageView.setBitmap(bitmap);
        } else if (imageArray != null && imageArray.length > 0 && !TextUtils.isEmpty(imageArray[0]) && new File(imageArray[0]).exists()) {
            try {
                bitmap = BitmapHelper.getBitmap(imagePath);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (bitmap != null) {
            this.o = bitmap;
            asyncImageView.setBitmap(bitmap);
        } else if (bitmap != null || TextUtils.isEmpty(imageUrl)) {
            this.i.setVisibility(8);
        } else {
            asyncImageView.execute(imageUrl, 0);
        }
    }

    private void b(LinearLayout linearLayout, float f) {
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, f > 1.0f ? (int) f : 1);
        View view = new View(this.activity);
        view.setBackgroundColor(687865856);
        linearLayout.addView(view, layoutParams);
        view = new View(this.activity);
        view.setBackgroundColor(335544320);
        linearLayout.addView(view, layoutParams);
        view = new View(this.activity);
        view.setBackgroundColor(117440512);
        linearLayout.addView(view, layoutParams);
    }

    private void b(RelativeLayout relativeLayout, float f) {
        this.e = new ScrollView(this.activity);
        relativeLayout.addView(this.e, new RelativeLayout.LayoutParams(-1, -2));
        View linearLayout = new LinearLayout(this.activity);
        linearLayout.setOrientation(0);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        this.f = new EditText(this.activity);
        int i = (int) (40.0f * f);
        this.f.setPadding(i, i, i, i);
        this.f.setBackgroundDrawable(null);
        this.f.setTextColor(-12895429);
        this.f.setTextSize(2, 21.0f);
        this.f.setText(this.b.getText());
        ViewGroup.LayoutParams layoutParams = new LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f, layoutParams);
        this.f.addTextChangedListener(this);
        this.i = new RelativeLayout(this.activity);
        this.i.setBackgroundColor(-13553359);
        int i2 = (int) (280.0f * f);
        int i3 = (int) (com.google.android.gms.maps.model.b.c * f);
        ViewGroup.LayoutParams layoutParams2 = new LayoutParams(i2, i2);
        layoutParams2.topMargin = i;
        layoutParams2.bottomMargin = i;
        layoutParams2.rightMargin = i;
        linearLayout.addView(this.i, layoutParams2);
        this.j = new AsyncImageView(this, this.activity) {
            final /* synthetic */ a a;

            public void onImageGot(String str, Bitmap bitmap) {
                this.a.o = bitmap;
                super.onImageGot(str, bitmap);
            }
        };
        this.j.setScaleToCropCenter(true);
        this.i.addView(this.j, new RelativeLayout.LayoutParams(i2, i2));
        this.j.setOnClickListener(this);
        a(this.j);
        this.k = new l(this.activity);
        this.k.setRatio(f);
        ViewGroup.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i3, i3);
        layoutParams3.addRule(10);
        layoutParams3.addRule(11);
        this.i.addView(this.k, layoutParams3);
        this.k.setOnClickListener(this);
    }

    public void onCreate() {
        super.onCreate();
        float screenHeight = ((float) R.getScreenHeight(this.activity)) / 720.0f;
        this.p = 0;
        this.c = new LinearLayout(this.activity);
        this.c.setOrientation(1);
        this.activity.setContentView(this.c);
        this.d = new RelativeLayout(this.activity);
        this.d.setBackgroundColor(-1644052);
        this.c.addView(this.d, new LayoutParams(-1, (int) (70.0f * screenHeight)));
        a(this.d, screenHeight);
        RelativeLayout relativeLayout = new RelativeLayout(this.activity);
        relativeLayout.setBackgroundColor(-1);
        this.c.addView(relativeLayout, new LayoutParams(-1, -2));
        b(relativeLayout, screenHeight);
        LinearLayout linearLayout = new LinearLayout(this.activity);
        linearLayout.setOrientation(1);
        relativeLayout.addView(linearLayout, new RelativeLayout.LayoutParams(-1, -2));
        b(linearLayout, screenHeight);
        this.l = new LinearLayout(this.activity);
        this.l.setOrientation(1);
        this.c.addView(this.l, new LayoutParams(-1, -2));
        a(this.l, screenHeight);
    }
}
