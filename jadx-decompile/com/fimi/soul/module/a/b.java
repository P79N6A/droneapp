package com.fimi.soul.module.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.R;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;

public class b {
    private HashMap<String, Object> a = new HashMap();

    public b() {
        this.a.put("customers", new ArrayList());
        this.a.put("hiddenPlatforms", new HashMap());
    }

    public String a() {
        return this.a.containsKey("text") ? String.valueOf(this.a.get("text")) : null;
    }

    public void a(float f) {
        this.a.put("latitude", Float.valueOf(f));
    }

    public void a(Context context) {
        int parseInt;
        boolean z = false;
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.a);
        ShareSDK.initSDK(context.getApplicationContext());
        ShareSDK.logDemoEvent(1, null);
        try {
            parseInt = R.parseInt(String.valueOf(hashMap.remove("theme")));
        } catch (Throwable th) {
            parseInt = 0;
        }
        e b = d.a(parseInt).b();
        b.a(hashMap);
        b.a(hashMap.containsKey("dialogMode") ? ((Boolean) hashMap.remove("dialogMode")).booleanValue() : false);
        if (hashMap.containsKey("silent")) {
            z = ((Boolean) hashMap.remove("silent")).booleanValue();
        }
        b.b(z);
        b.a((ArrayList) hashMap.remove("customers"));
        b.b((HashMap) hashMap.remove("hiddenPlatforms"));
        b.a((PlatformActionListener) hashMap.remove("callback"));
        b.a((f) hashMap.remove("customizeCallback"));
        if (hashMap.containsKey("disableSSO") && ((Boolean) hashMap.remove("disableSSO")).booleanValue()) {
            b.a();
        }
        b.a(context.getApplicationContext());
    }

    public void a(Bitmap bitmap, String str, OnClickListener onClickListener) {
        a aVar = new a();
        aVar.b = bitmap;
        aVar.a = str;
        aVar.c = onClickListener;
        ((ArrayList) R.forceCast(this.a.get("customers"))).add(aVar);
    }

    public void a(View view) {
        try {
            this.a.put("viewToShare", BitmapHelper.captureView(view, view.getWidth(), view.getHeight()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(PlatformActionListener platformActionListener) {
        this.a.put("callback", platformActionListener);
    }

    public void a(d dVar) {
        this.a.put("theme", Integer.valueOf(dVar.a()));
    }

    public void a(f fVar) {
        this.a.put("customizeCallback", fVar);
    }

    public void a(String str) {
        this.a.put("address", str);
    }

    public void a(boolean z) {
        this.a.put("silent", Boolean.valueOf(z));
    }

    public void a(String[] strArr) {
        this.a.put("imageArray", strArr);
    }

    public PlatformActionListener b() {
        return (PlatformActionListener) R.forceCast(this.a.get("callback"));
    }

    public void b(float f) {
        this.a.put("longitude", Float.valueOf(f));
    }

    public void b(String str) {
        this.a.put("title", str);
    }

    public f c() {
        return (f) R.forceCast(this.a.get("customizeCallback"));
    }

    public void c(String str) {
        this.a.put("titleUrl", str);
    }

    public void d() {
        this.a.put("disableSSO", Boolean.valueOf(true));
    }

    public void d(String str) {
        this.a.put("text", str);
    }

    @Deprecated
    public void e() {
        this.a.put("dialogMode", Boolean.valueOf(true));
    }

    public void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a.put("imagePath", str);
        }
    }

    public void f() {
        this.a.put("isShareTencentWeibo", Boolean.valueOf(true));
    }

    public void f(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a.put("imageUrl", str);
        }
    }

    public void g(String str) {
        this.a.put("url", str);
    }

    public void h(String str) {
        this.a.put("filePath", str);
    }

    public void i(String str) {
        this.a.put("comment", str);
    }

    public void j(String str) {
        this.a.put("site", str);
    }

    public void k(String str) {
        this.a.put("siteUrl", str);
    }

    public void l(String str) {
        this.a.put("venueName", str);
    }

    public void m(String str) {
        this.a.put("venueDescription", str);
    }

    public void n(String str) {
        this.a.put(Constants.PARAM_PLATFORM, str);
    }

    public void o(String str) {
        this.a.put("installurl", str);
    }

    public void p(String str) {
        this.a.put("executeurl", str);
    }

    public void q(String str) {
        this.a.put("musicUrl", str);
    }

    public void r(String str) {
        this.a.put("url", str);
        this.a.put("shareType", Integer.valueOf(6));
    }

    public void s(String str) {
        ((HashMap) R.forceCast(this.a.get("hiddenPlatforms"))).put(str, str);
    }
}
