package com.google.android.gms.ads.search;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.internal.client.f;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;

@aaa
public final class SearchAdView extends ViewGroup {
    private final f a;

    public SearchAdView(Context context) {
        super(context);
        this.a = new f(this);
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new f(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new f(this, attributeSet, false);
    }

    public void a() {
        this.a.a();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void a(a aVar) {
        if (d.k.equals(getAdSize())) {
            this.a.a(aVar.b());
            return;
        }
        throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
    }

    @RequiresPermission("android.permission.INTERNET")
    public void a(b bVar) {
        this.a.a(bVar.p());
    }

    public void b() {
        this.a.i();
    }

    public void c() {
        this.a.k();
    }

    public a getAdListener() {
        return this.a.b();
    }

    public d getAdSize() {
        return this.a.c();
    }

    public String getAdUnitId() {
        return this.a.e();
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

    public void setAdSize(d dVar) {
        this.a.a(dVar);
    }

    public void setAdUnitId(String str) {
        this.a.a(str);
    }
}
