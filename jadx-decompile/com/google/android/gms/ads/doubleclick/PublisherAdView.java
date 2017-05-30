package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.internal.client.f;
import com.google.android.gms.ads.internal.util.client.b;

public final class PublisherAdView extends ViewGroup {
    private final f a;

    public PublisherAdView(Context context) {
        super(context);
        this.a = new f(this);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new f(this, attributeSet, true);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new f(this, attributeSet, true);
    }

    public void a() {
        this.a.a();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void a(d dVar) {
        this.a.a(dVar.j());
    }

    public void b() {
        this.a.i();
    }

    public void c() {
        this.a.j();
    }

    public void d() {
        this.a.k();
    }

    public boolean e() {
        return this.a.m();
    }

    public a getAdListener() {
        return this.a.b();
    }

    public d getAdSize() {
        return this.a.c();
    }

    public d[] getAdSizes() {
        return this.a.d();
    }

    public String getAdUnitId() {
        return this.a.e();
    }

    public a getAppEventListener() {
        return this.a.f();
    }

    public String getMediationAdapterClassName() {
        return this.a.l();
    }

    public c getOnCustomRenderedAdLoadedListener() {
        return this.a.h();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    protected void onMeasure(int i, int i2) {
        int b;
        int i3 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            d adSize;
            d dVar = null;
            try {
                adSize = getAdSize();
            } catch (Throwable e) {
                b.b("Unable to retrieve ad size.", e);
                adSize = dVar;
            }
            if (adSize != null) {
                Context context = getContext();
                b = adSize.b(context);
                i3 = adSize.a(context);
            } else {
                b = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            b = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(b, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(a aVar) {
        this.a.a(aVar);
    }

    public void setAdSizes(d... dVarArr) {
        if (dVarArr == null || dVarArr.length < 1) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.a.b(dVarArr);
    }

    public void setAdUnitId(String str) {
        this.a.a(str);
    }

    public void setAppEventListener(a aVar) {
        this.a.a(aVar);
    }

    public void setCorrelator(e eVar) {
        this.a.a(eVar);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.a.a(z);
    }

    public void setOnCustomRenderedAdLoadedListener(c cVar) {
        this.a.a(cVar);
    }
}
