package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.formats.d;
import com.google.android.gms.ads.internal.formats.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz.a;
import com.google.android.gms.internal.uu;
import com.google.android.gms.internal.vt;
import com.google.android.gms.internal.xl;
import com.google.android.gms.internal.xu;
import com.google.android.gms.internal.xv;
import com.google.firebase.a.a.b;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

@aaa
public class n {

    class AnonymousClass1 implements a {
        final /* synthetic */ d a;
        final /* synthetic */ String b;
        final /* synthetic */ acy c;

        AnonymousClass1(d dVar, String str, acy com_google_android_gms_internal_acy) {
            this.a = dVar;
            this.b = str;
            this.c = com_google_android_gms_internal_acy;
        }

        public void a(acy com_google_android_gms_internal_acy, boolean z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("headline", this.a.a());
                jSONObject.put("body", this.a.c());
                jSONObject.put("call_to_action", this.a.e());
                jSONObject.put(b.x, this.a.h());
                jSONObject.put("star_rating", String.valueOf(this.a.f()));
                jSONObject.put("store", this.a.g());
                jSONObject.put("icon", n.a(this.a.d()));
                JSONArray jSONArray = new JSONArray();
                List<Object> b = this.a.b();
                if (b != null) {
                    for (Object a : b) {
                        jSONArray.put(n.a(n.b(a)));
                    }
                }
                jSONObject.put(com.fimi.kernel.a.b, jSONArray);
                jSONObject.put("extras", n.b(this.a.n(), this.b));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("assets", jSONObject);
                jSONObject2.put("template_id", "2");
                this.c.a("google.afma.nativeExpressAds.loadAssets", jSONObject2);
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Exception occurred when loading assets", e);
            }
        }
    }

    class AnonymousClass2 implements a {
        final /* synthetic */ e a;
        final /* synthetic */ String b;
        final /* synthetic */ acy c;

        AnonymousClass2(e eVar, String str, acy com_google_android_gms_internal_acy) {
            this.a = eVar;
            this.b = str;
            this.c = com_google_android_gms_internal_acy;
        }

        public void a(acy com_google_android_gms_internal_acy, boolean z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("headline", this.a.a());
                jSONObject.put("body", this.a.c());
                jSONObject.put("call_to_action", this.a.e());
                jSONObject.put("advertiser", this.a.f());
                jSONObject.put("logo", n.a(this.a.d()));
                JSONArray jSONArray = new JSONArray();
                List<Object> b = this.a.b();
                if (b != null) {
                    for (Object a : b) {
                        jSONArray.put(n.a(n.b(a)));
                    }
                }
                jSONObject.put(com.fimi.kernel.a.b, jSONArray);
                jSONObject.put("extras", n.b(this.a.h(), this.b));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("assets", jSONObject);
                jSONObject2.put("template_id", "1");
                this.c.a("google.afma.nativeExpressAds.loadAssets", jSONObject2);
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Exception occurred when loading assets", e);
            }
        }
    }

    class AnonymousClass3 implements vt {
        final /* synthetic */ CountDownLatch a;

        AnonymousClass3(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
            this.a.countDown();
            com_google_android_gms_internal_acy.b().setVisibility(0);
        }
    }

    class AnonymousClass4 implements vt {
        final /* synthetic */ CountDownLatch a;

        AnonymousClass4(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
            com.google.android.gms.ads.internal.util.client.b.d("Adapter returned an ad, but assets substitution failed");
            this.a.countDown();
            com_google_android_gms_internal_acy.destroy();
        }
    }

    class AnonymousClass5 implements vt {
        final /* synthetic */ xu a;
        final /* synthetic */ f.a b;
        final /* synthetic */ xv c;

        AnonymousClass5(xu xuVar, f.a aVar, xv xvVar) {
            this.a = xuVar;
            this.b = aVar;
            this.c = xvVar;
        }

        public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
            Object b = com_google_android_gms_internal_acy.b();
            if (b != null) {
                try {
                    if (this.a != null) {
                        if (this.a.k()) {
                            n.b(com_google_android_gms_internal_acy);
                            return;
                        }
                        this.a.a(f.a(b));
                        this.b.a();
                    } else if (this.c == null) {
                    } else {
                        if (this.c.i()) {
                            n.b(com_google_android_gms_internal_acy);
                            return;
                        }
                        this.c.a(f.a(b));
                        this.b.a();
                    }
                } catch (Throwable e) {
                    com.google.android.gms.ads.internal.util.client.b.d("Unable to call handleClick on mapper", e);
                }
            }
        }
    }

    @Nullable
    public static View a(@Nullable abi com_google_android_gms_internal_abi) {
        if (com_google_android_gms_internal_abi == null) {
            com.google.android.gms.ads.internal.util.client.b.b("AdState is null");
            return null;
        } else if (b(com_google_android_gms_internal_abi) && com_google_android_gms_internal_abi.b != null) {
            return com_google_android_gms_internal_abi.b.b();
        } else {
            try {
                com.google.android.gms.c.e a = com_google_android_gms_internal_abi.p != null ? com_google_android_gms_internal_abi.p.a() : null;
                if (a != null) {
                    return (View) f.a(a);
                }
                com.google.android.gms.ads.internal.util.client.b.d("View in mediation adapter is null.");
                return null;
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not get View from mediation adapter.", e);
                return null;
            }
        }
    }

    private static d a(xu xuVar) {
        return new d(xuVar.a(), xuVar.b(), xuVar.c(), xuVar.d(), xuVar.e(), xuVar.f(), xuVar.g(), xuVar.h(), null, xuVar.l(), null, null);
    }

    private static e a(xv xvVar) {
        return new e(xvVar.a(), xvVar.b(), xvVar.c(), xvVar.d(), xvVar.e(), xvVar.f(), null, xvVar.j());
    }

    static vt a(@Nullable xu xuVar, @Nullable xv xvVar, f.a aVar) {
        return new AnonymousClass5(xuVar, aVar, xvVar);
    }

    static vt a(CountDownLatch countDownLatch) {
        return new AnonymousClass3(countDownLatch);
    }

    private static String a(@Nullable Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            com.google.android.gms.ads.internal.util.client.b.d("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        encodeToString = String.valueOf(encodeToString);
        return encodeToString.length() != 0 ? valueOf.concat(encodeToString) : new String(valueOf);
    }

    static String a(@Nullable uu uuVar) {
        if (uuVar == null) {
            com.google.android.gms.ads.internal.util.client.b.d("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri b = uuVar.b();
            if (b != null) {
                return b.toString();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.d("Unable to get image uri. Trying data uri next");
        }
        return b(uuVar);
    }

    public static void a(@Nullable abi com_google_android_gms_internal_abi, f.a aVar) {
        xv xvVar = null;
        if (com_google_android_gms_internal_abi != null && b(com_google_android_gms_internal_abi)) {
            acy com_google_android_gms_internal_acy = com_google_android_gms_internal_abi.b;
            Object b = com_google_android_gms_internal_acy != null ? com_google_android_gms_internal_acy.b() : null;
            if (b == null) {
                com.google.android.gms.ads.internal.util.client.b.d("AdWebView is null");
                return;
            }
            try {
                List list = com_google_android_gms_internal_abi.o != null ? com_google_android_gms_internal_abi.o.o : null;
                if (list == null || list.isEmpty()) {
                    com.google.android.gms.ads.internal.util.client.b.d("No template ids present in mediation response");
                    return;
                }
                xu h = com_google_android_gms_internal_abi.p != null ? com_google_android_gms_internal_abi.p.h() : null;
                if (com_google_android_gms_internal_abi.p != null) {
                    xvVar = com_google_android_gms_internal_abi.p.i();
                }
                if (list.contains("2") && h != null) {
                    h.b(f.a(b));
                    if (!h.j()) {
                        h.i();
                    }
                    com_google_android_gms_internal_acy.l().a("/nativeExpressViewClicked", a(h, null, aVar));
                } else if (!list.contains("1") || xvVar == null) {
                    com.google.android.gms.ads.internal.util.client.b.d("No matching template id and mapper");
                } else {
                    xvVar.b(f.a(b));
                    if (!xvVar.h()) {
                        xvVar.g();
                    }
                    com_google_android_gms_internal_acy.l().a("/nativeExpressViewClicked", a(null, xvVar, aVar));
                }
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Error occurred while recording impression and registering for clicks", e);
            }
        }
    }

    private static void a(acy com_google_android_gms_internal_acy, d dVar, String str) {
        com_google_android_gms_internal_acy.l().a(new AnonymousClass1(dVar, str, com_google_android_gms_internal_acy));
    }

    private static void a(acy com_google_android_gms_internal_acy, e eVar, String str) {
        com_google_android_gms_internal_acy.l().a(new AnonymousClass2(eVar, str, com_google_android_gms_internal_acy));
    }

    private static void a(acy com_google_android_gms_internal_acy, CountDownLatch countDownLatch) {
        com_google_android_gms_internal_acy.l().a("/nativeExpressAssetsLoaded", a(countDownLatch));
        com_google_android_gms_internal_acy.l().a("/nativeExpressAssetsLoadingFailed", b(countDownLatch));
    }

    public static boolean a(acy com_google_android_gms_internal_acy, xl xlVar, CountDownLatch countDownLatch) {
        boolean z = false;
        try {
            z = b(com_google_android_gms_internal_acy, xlVar, countDownLatch);
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Unable to invoke load assets", e);
        } catch (RuntimeException e2) {
            countDownLatch.countDown();
            throw e2;
        }
        if (!z) {
            countDownLatch.countDown();
        }
        return z;
    }

    @Nullable
    private static uu b(Object obj) {
        return obj instanceof IBinder ? uu.a.a((IBinder) obj) : null;
    }

    static vt b(CountDownLatch countDownLatch) {
        return new AnonymousClass4(countDownLatch);
    }

    private static String b(uu uuVar) {
        try {
            com.google.android.gms.c.e a = uuVar.a();
            if (a == null) {
                com.google.android.gms.ads.internal.util.client.b.d("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) f.a(a);
            if (drawable instanceof BitmapDrawable) {
                return a(((BitmapDrawable) drawable).getBitmap());
            }
            com.google.android.gms.ads.internal.util.client.b.d("Drawable is not an instance of BitmapDrawable. Returning empty string");
            return "";
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.d("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    private static JSONObject b(@Nullable Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (bundle.containsKey(str2)) {
                if ("image".equals(jSONObject2.getString(str2))) {
                    Object obj = bundle.get(str2);
                    if (obj instanceof Bitmap) {
                        jSONObject.put(str2, a((Bitmap) obj));
                    } else {
                        com.google.android.gms.ads.internal.util.client.b.d("Invalid type. An image type extra should return a bitmap");
                    }
                } else if (bundle.get(str2) instanceof Bitmap) {
                    com.google.android.gms.ads.internal.util.client.b.d("Invalid asset type. Bitmap should be returned only for image type");
                } else {
                    jSONObject.put(str2, String.valueOf(bundle.get(str2)));
                }
            }
        }
        return jSONObject;
    }

    private static void b(acy com_google_android_gms_internal_acy) {
        OnClickListener F = com_google_android_gms_internal_acy.F();
        if (F != null) {
            F.onClick(com_google_android_gms_internal_acy.b());
        }
    }

    public static boolean b(@Nullable abi com_google_android_gms_internal_abi) {
        return (com_google_android_gms_internal_abi == null || !com_google_android_gms_internal_abi.n || com_google_android_gms_internal_abi.o == null || com_google_android_gms_internal_abi.o.l == null) ? false : true;
    }

    private static boolean b(acy com_google_android_gms_internal_acy, xl xlVar, CountDownLatch countDownLatch) {
        View b = com_google_android_gms_internal_acy.b();
        if (b == null) {
            com.google.android.gms.ads.internal.util.client.b.d("AdWebView is null");
            return false;
        }
        b.setVisibility(4);
        List list = xlVar.b.o;
        if (list == null || list.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.b.d("No template ids present in mediation response");
            return false;
        }
        a(com_google_android_gms_internal_acy, countDownLatch);
        xu h = xlVar.c.h();
        xv i = xlVar.c.i();
        if (list.contains("2") && h != null) {
            a(com_google_android_gms_internal_acy, a(h), xlVar.b.n);
        } else if (!list.contains("1") || i == null) {
            com.google.android.gms.ads.internal.util.client.b.d("No matching template id and mapper");
            return false;
        } else {
            a(com_google_android_gms_internal_acy, a(i), xlVar.b.n);
        }
        String str = xlVar.b.l;
        String str2 = xlVar.b.m;
        if (str2 != null) {
            com_google_android_gms_internal_acy.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        } else {
            com_google_android_gms_internal_acy.loadData(str, "text/html", "UTF-8");
        }
        return true;
    }
}
