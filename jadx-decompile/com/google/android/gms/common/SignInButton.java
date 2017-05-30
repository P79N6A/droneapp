package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.zzah;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SignInButton extends FrameLayout implements OnClickListener {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    private int g;
    private int h;
    private View i;
    private OnClickListener j;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public SignInButton(Context context) {
        this(context, null);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = null;
        a(context, attributeSet);
        a(this.g, this.h);
    }

    private static Button a(Context context, int i, int i2) {
        Button com_google_android_gms_common_internal_zzah = new zzah(context);
        com_google_android_gms_common_internal_zzah.a(context.getResources(), i, i2);
        return com_google_android_gms_common_internal_zzah;
    }

    private void a(Context context) {
        if (this.i != null) {
            removeView(this.i);
        }
        try {
            this.i = h.a(context, this.g, this.h);
        } catch (com.google.android.gms.c.h.a e) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            this.i = a(context, this.g, this.h);
        }
        addView(this.i);
        this.i.setEnabled(isEnabled());
        this.i.setOnClickListener(this);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SignInButton, 0, 0);
        try {
            this.g = obtainStyledAttributes.getInt(R.styleable.SignInButton_buttonSize, 0);
            this.h = obtainStyledAttributes.getInt(R.styleable.SignInButton_colorScheme, 2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void a(int i, int i2) {
        this.g = i;
        this.h = i2;
        a(getContext());
    }

    @Deprecated
    public void a(int i, int i2, Scope[] scopeArr) {
        a(i, i2);
    }

    public void onClick(View view) {
        if (this.j != null && view == this.i) {
            this.j.onClick(this);
        }
    }

    public void setColorScheme(int i) {
        a(this.g, i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.i.setEnabled(z);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.j = onClickListener;
        if (this.i != null) {
            this.i.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        a(this.g, this.h);
    }

    public void setSize(int i) {
        a(i, this.h);
    }
}
