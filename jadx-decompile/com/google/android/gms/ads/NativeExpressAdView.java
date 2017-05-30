package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import com.google.android.gms.ads.purchase.b;
import com.google.android.gms.ads.purchase.d;
import com.google.android.gms.internal.aaa;

@aaa
public final class NativeExpressAdView extends BaseAdView {
    public NativeExpressAdView(Context context) {
        super(context, 2);
    }

    public NativeExpressAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2);
    }

    public NativeExpressAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 2);
    }

    @RequiresPermission("android.permission.INTERNET")
    public /* bridge */ /* synthetic */ void a(c cVar) {
        super.a(cVar);
    }

    public /* bridge */ /* synthetic */ void a(d dVar, String str) {
        super.a(dVar, str);
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public /* bridge */ /* synthetic */ a getAdListener() {
        return super.getAdListener();
    }

    public /* bridge */ /* synthetic */ d getAdSize() {
        return super.getAdSize();
    }

    public /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    public /* bridge */ /* synthetic */ b getInAppPurchaseListener() {
        return super.getInAppPurchaseListener();
    }

    public /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    public h getVideoController() {
        return this.a.n();
    }

    public i getVideoOptions() {
        return this.a.p();
    }

    public /* bridge */ /* synthetic */ void setAdListener(a aVar) {
        super.setAdListener(aVar);
    }

    public /* bridge */ /* synthetic */ void setAdSize(d dVar) {
        super.setAdSize(dVar);
    }

    public /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }

    public /* bridge */ /* synthetic */ void setInAppPurchaseListener(b bVar) {
        super.setInAppPurchaseListener(bVar);
    }

    public void setVideoOptions(i iVar) {
        this.a.a(iVar);
    }
}
