package com.google.android.gms.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.cast.framework.h;
import com.google.android.gms.cast.framework.h.b;
import com.google.android.gms.cast.framework.h.c;

public class afk extends RelativeLayout implements h {
    private final boolean a;
    private Activity b;
    private int c;
    private boolean d;
    private b e;
    private final a f;

    private static class a {
        public int a;
        public int b;
        public Paint c;
        public float d;

        private a() {
        }
    }

    public afk(com.google.android.gms.cast.framework.h.a aVar) {
        this(aVar, null, R.attr.castIntroOverlayStyle);
    }

    @TargetApi(14)
    public afk(com.google.android.gms.cast.framework.h.a aVar, AttributeSet attributeSet, int i) {
        super(aVar.b(), attributeSet, i);
        this.b = aVar.b();
        this.a = aVar.f();
        this.e = aVar.d();
        TypedArray obtainStyledAttributes = this.b.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CastIntroOverlay, i, R.style.CastIntroOverlay);
        if (aVar.c() != null) {
            Rect rect = new Rect();
            aVar.c().getGlobalVisibleRect(rect);
            this.f = new a();
            this.f.a = rect.centerX();
            this.f.b = rect.centerY();
            this.f.c = c();
            this.f.d = aVar.i();
            if (this.f.d == 0.0f) {
                this.f.d = obtainStyledAttributes.getDimension(R.styleable.CastIntroOverlay_castFocusRadius, 0.0f);
            }
        } else {
            this.f = null;
        }
        LayoutInflater.from(this.b).inflate(R.layout.cast_intro_overlay, this);
        this.c = aVar.e();
        if (this.c == 0) {
            this.c = obtainStyledAttributes.getColor(R.styleable.CastIntroOverlay_castBackgroundColor, Color.argb(0, 0, 0, 0));
        }
        TextView textView = (TextView) findViewById(R.id.textTitle);
        if (!TextUtils.isEmpty(aVar.g())) {
            textView.setText(aVar.g());
            int resourceId = obtainStyledAttributes.getResourceId(R.styleable.CastIntroOverlay_castTitleTextAppearance, 0);
            if (resourceId != 0) {
                textView.setTextAppearance(this.b, resourceId);
            }
        }
        a(aVar.h(), obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 14) {
            setFitsSystemWindows(true);
        }
    }

    @TargetApi(11)
    private void a(String str, TypedArray typedArray) {
        CharSequence string;
        if (TextUtils.isEmpty(str)) {
            string = typedArray.getString(R.styleable.CastIntroOverlay_castButtonText);
        }
        int color = typedArray.getColor(R.styleable.CastIntroOverlay_castButtonBackgroundColor, Color.argb(0, 0, 0, 0));
        Button button = (Button) findViewById(R.id.button);
        button.setText(string);
        button.getBackground().setColorFilter(color, Mode.MULTIPLY);
        color = typedArray.getResourceId(R.styleable.CastIntroOverlay_castButtonTextAppearance, 0);
        if (color != 0) {
            button.setTextAppearance(this.b, color);
        }
        button.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ afk a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (VERSION.SDK_INT >= 16) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f});
                    ofFloat.setDuration(400).addListener(new AnimatorListenerAdapter(this) {
                        final /* synthetic */ AnonymousClass1 a;

                        {
                            this.a = r1;
                        }

                        public void onAnimationEnd(Animator animator) {
                            this.a.a.d();
                        }
                    });
                    ofFloat.start();
                    return;
                }
                this.a.d();
            }
        });
    }

    private Paint c() {
        Xfermode porterDuffXfermode = new PorterDuffXfermode(Mode.MULTIPLY);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAlpha(0);
        paint.setXfermode(porterDuffXfermode);
        paint.setAntiAlias(true);
        return paint;
    }

    private void d() {
        c.a(this.b);
        if (this.e != null) {
            this.e.a();
            this.e = null;
        }
        b();
    }

    public void a() {
        if (this.b != null && !afj.a(this.b)) {
            if (this.a && c.b(this.b)) {
                this.b = null;
                this.e = null;
            } else if (!this.d) {
                this.d = true;
                ((ViewGroup) this.b.getWindow().getDecorView()).addView(this);
            }
        }
    }

    public void b() {
        if (this.b != null) {
            ((ViewGroup) this.b.getWindow().getDecorView()).removeView(this);
            this.b = null;
        }
        this.e = null;
    }

    protected void dispatchDraw(Canvas canvas) {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        canvas2.drawColor(this.c);
        if (this.f != null) {
            canvas2.drawCircle((float) this.f.a, (float) this.f.b, this.f.d, this.f.c);
        }
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, null);
        createBitmap.recycle();
        super.dispatchDraw(canvas);
    }

    protected void onDetachedFromWindow() {
        if (this.b != null) {
            this.b = null;
        }
        super.onDetachedFromWindow();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
