package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.uw;

public abstract class NativeAdView extends FrameLayout {
    private final FrameLayout a;
    private final uw b = b();

    public NativeAdView(Context context) {
        super(context);
        this.a = b(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = b(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = b(context);
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = b(context);
    }

    private FrameLayout b(Context context) {
        View a = a(context);
        a.setLayoutParams(new LayoutParams(-1, -1));
        addView(a);
        return a;
    }

    private uw b() {
        d.a(this.a, (Object) "createDelegate must be called after mOverlayFrame has been created");
        return ac.b().a(this.a.getContext(), (FrameLayout) this, this.a);
    }

    protected View a(String str) {
        try {
            e a = this.b.a(str);
            if (a != null) {
                return (View) f.a(a);
            }
        } catch (Throwable e) {
            b.b("Unable to call getAssetView on delegate", e);
        }
        return null;
    }

    FrameLayout a(Context context) {
        return new FrameLayout(context);
    }

    public void a() {
        try {
            this.b.a();
        } catch (Throwable e) {
            b.b("Unable to destroy native ad view", e);
        }
    }

    protected void a(String str, View view) {
        try {
            this.b.a(str, f.a((Object) view));
        } catch (Throwable e) {
            b.b("Unable to call setAssetView on delegate", e);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.a);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.a != view) {
            super.bringChildToFront(this.a);
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.a);
    }

    public void removeView(View view) {
        if (this.a != view) {
            super.removeView(view);
        }
    }

    public void setNativeAd(a aVar) {
        try {
            this.b.a((e) aVar.a());
        } catch (Throwable e) {
            b.b("Unable to call setNativeAd on delegate", e);
        }
    }
}
