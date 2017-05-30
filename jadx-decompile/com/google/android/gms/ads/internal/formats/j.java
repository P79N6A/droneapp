package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.i.a;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.internal.ro;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.uu;
import com.google.android.gms.internal.vt;
import com.google.android.gms.internal.wy;
import com.google.android.gms.internal.zt;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

@aaa
public class j implements i {
    private final Object a = new Object();
    private final q b;
    private final Context c;
    @Nullable
    private final JSONObject d;
    @Nullable
    private final zt e;
    @Nullable
    private final a f;
    private final ro g;
    @Nullable
    private final VersionInfoParcel h;
    private boolean i;
    private acy j;
    private String k;
    @Nullable
    private String l;
    private WeakReference<View> m = null;

    public j(Context context, q qVar, @Nullable zt ztVar, ro roVar, @Nullable JSONObject jSONObject, @Nullable a aVar, @Nullable VersionInfoParcel versionInfoParcel, @Nullable String str) {
        this.c = context;
        this.b = qVar;
        this.e = ztVar;
        this.g = roVar;
        this.d = jSONObject;
        this.f = aVar;
        this.h = versionInfoParcel;
        this.l = str;
    }

    public b a(OnClickListener onClickListener) {
        a m = this.f.m();
        if (m == null) {
            return null;
        }
        b bVar = new b(this.c, m);
        bVar.setLayoutParams(new LayoutParams(-1, -1));
        bVar.a().setOnClickListener(onClickListener);
        bVar.a().setContentDescription((CharSequence) uf.bQ.c());
        return bVar;
    }

    @Nullable
    uu a(Object obj) {
        return obj instanceof IBinder ? uu.a.a((IBinder) obj) : null;
    }

    public void a() {
        d.b("recordImpression must be called on the main UI thread.");
        a(true);
        try {
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.d);
            jSONObject.put("ads_id", this.l);
            this.e.a(new zt.a(this) {
                final /* synthetic */ j b;

                public void a(wy wyVar) {
                    wyVar.a("google.afma.nativeAds.handleImpressionPing", jSONObject);
                }
            });
        } catch (Throwable e) {
            b.b("Unable to create impression JSON.", e);
        }
        this.b.a((i) this);
    }

    public void a(MotionEvent motionEvent) {
        this.g.a(motionEvent);
    }

    public void a(View view) {
        synchronized (this.a) {
            if (this.i) {
            } else if (!view.isShown()) {
            } else if (view.getGlobalVisibleRect(new Rect(), null)) {
                a();
            }
        }
    }

    public void a(View view, g gVar) {
        if (this.f instanceof d) {
            d dVar = (d) this.f;
            ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -1);
            if (dVar.o() != null) {
                ((FrameLayout) view).addView(dVar.o(), layoutParams);
                this.b.a(gVar);
            } else if (dVar.b() != null && dVar.b().size() > 0) {
                uu a = a(dVar.b().get(0));
                if (a != null) {
                    try {
                        e a2 = a.a();
                        if (a2 != null) {
                            Drawable drawable = (Drawable) f.a(a2);
                            View i = i();
                            i.setImageDrawable(drawable);
                            i.setScaleType(ScaleType.CENTER_INSIDE);
                            ((FrameLayout) view).addView(i, layoutParams);
                        }
                    } catch (RemoteException e) {
                        b.d("Could not get drawable from image");
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r7, java.lang.String r8, @android.support.annotation.Nullable org.json.JSONObject r9, @android.support.annotation.Nullable org.json.JSONObject r10, @android.support.annotation.Nullable org.json.JSONObject r11) {
        /*
        r6 = this;
        r0 = "performClick must be called on the main UI thread.";
        com.google.android.gms.common.internal.d.b(r0);
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0095 }
        r1.<init>();	 Catch:{ JSONException -> 0x0095 }
        r0 = "asset";
        r1.put(r0, r8);	 Catch:{ JSONException -> 0x0095 }
        r0 = "template";
        r2 = r6.f;	 Catch:{ JSONException -> 0x0095 }
        r2 = r2.k();	 Catch:{ JSONException -> 0x0095 }
        r1.put(r0, r2);	 Catch:{ JSONException -> 0x0095 }
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0095 }
        r2.<init>();	 Catch:{ JSONException -> 0x0095 }
        r0 = "ad";
        r3 = r6.d;	 Catch:{ JSONException -> 0x0095 }
        r2.put(r0, r3);	 Catch:{ JSONException -> 0x0095 }
        r0 = "click";
        r2.put(r0, r1);	 Catch:{ JSONException -> 0x0095 }
        r3 = "has_custom_click_handler";
        r0 = r6.b;	 Catch:{ JSONException -> 0x0095 }
        r4 = r6.f;	 Catch:{ JSONException -> 0x0095 }
        r4 = r4.l();	 Catch:{ JSONException -> 0x0095 }
        r0 = r0.c(r4);	 Catch:{ JSONException -> 0x0095 }
        if (r0 == 0) goto L_0x008c;
    L_0x003b:
        r0 = 1;
    L_0x003c:
        r2.put(r3, r0);	 Catch:{ JSONException -> 0x0095 }
        if (r9 == 0) goto L_0x0046;
    L_0x0041:
        r0 = "view_rectangles";
        r2.put(r0, r9);	 Catch:{ JSONException -> 0x0095 }
    L_0x0046:
        if (r10 == 0) goto L_0x004d;
    L_0x0048:
        r0 = "click_point";
        r2.put(r0, r10);	 Catch:{ JSONException -> 0x0095 }
    L_0x004d:
        if (r11 == 0) goto L_0x0054;
    L_0x004f:
        r0 = "native_view_rectangle";
        r2.put(r0, r11);	 Catch:{ JSONException -> 0x0095 }
    L_0x0054:
        r0 = r6.d;	 Catch:{ Exception -> 0x008e }
        r3 = "tracking_urls_and_actions";
        r0 = r0.optJSONObject(r3);	 Catch:{ Exception -> 0x008e }
        if (r0 != 0) goto L_0x0063;
    L_0x005e:
        r0 = new org.json.JSONObject;	 Catch:{ Exception -> 0x008e }
        r0.<init>();	 Catch:{ Exception -> 0x008e }
    L_0x0063:
        r3 = "click_string";
        r0 = r0.optString(r3);	 Catch:{ Exception -> 0x008e }
        r3 = "click_signals";
        r4 = r6.g;	 Catch:{ Exception -> 0x008e }
        r4 = r4.a();	 Catch:{ Exception -> 0x008e }
        r5 = r6.c;	 Catch:{ Exception -> 0x008e }
        r0 = r4.a(r5, r0, r7);	 Catch:{ Exception -> 0x008e }
        r1.put(r3, r0);	 Catch:{ Exception -> 0x008e }
    L_0x007a:
        r0 = "ads_id";
        r1 = r6.l;	 Catch:{ JSONException -> 0x0095 }
        r2.put(r0, r1);	 Catch:{ JSONException -> 0x0095 }
        r0 = r6.e;	 Catch:{ JSONException -> 0x0095 }
        r1 = new com.google.android.gms.ads.internal.formats.j$1;	 Catch:{ JSONException -> 0x0095 }
        r1.<init>(r6, r2);	 Catch:{ JSONException -> 0x0095 }
        r0.a(r1);	 Catch:{ JSONException -> 0x0095 }
    L_0x008b:
        return;
    L_0x008c:
        r0 = 0;
        goto L_0x003c;
    L_0x008e:
        r0 = move-exception;
        r1 = "Exception obtaining click signals";
        com.google.android.gms.ads.internal.util.client.b.b(r1, r0);	 Catch:{ JSONException -> 0x0095 }
        goto L_0x007a;
    L_0x0095:
        r0 = move-exception;
        r1 = "Unable to create click JSON.";
        com.google.android.gms.ads.internal.util.client.b.b(r1, r0);
        goto L_0x008b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.formats.j.a(android.view.View, java.lang.String, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject):void");
    }

    public void a(View view, Map<String, WeakReference<View>> map) {
        view.setOnTouchListener(null);
        view.setClickable(false);
        view.setOnClickListener(null);
        for (Entry value : map.entrySet()) {
            View view2 = (View) ((WeakReference) value.getValue()).get();
            if (view2 != null) {
                view2.setOnTouchListener(null);
                view2.setClickable(false);
                view2.setOnClickListener(null);
            }
        }
    }

    public void a(View view, Map<String, WeakReference<View>> map, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        if (((Boolean) uf.bN.c()).booleanValue()) {
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            for (Entry value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    view2.setOnTouchListener(onTouchListener);
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
    }

    public void a(View view, Map<String, WeakReference<View>> map, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        d.b("performClick must be called on the main UI thread.");
        for (Entry entry : map.entrySet()) {
            if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                a(view, (String) entry.getKey(), jSONObject, jSONObject2, jSONObject3);
                return;
            }
        }
        if ("2".equals(this.f.k())) {
            a(view, "2099", jSONObject, jSONObject2, jSONObject3);
        } else if ("1".equals(this.f.k())) {
            a(view, "1099", jSONObject, jSONObject2, jSONObject3);
        }
    }

    protected void a(boolean z) {
        this.i = z;
    }

    public void b(View view) {
        this.m = new WeakReference(view);
    }

    public acy d() {
        this.j = h();
        this.j.b().setVisibility(8);
        this.e.a(new zt.a(this) {
            final /* synthetic */ j a;

            {
                this.a = r1;
            }

            public void a(final wy wyVar) {
                wyVar.a("/loadHtml", new vt(this) {
                    final /* synthetic */ AnonymousClass3 b;

                    public void a(acy com_google_android_gms_internal_acy, final Map<String, String> map) {
                        this.b.a.j.l().a(new acz.a(this) {
                            final /* synthetic */ AnonymousClass1 b;

                            public void a(acy com_google_android_gms_internal_acy, boolean z) {
                                this.b.b.a.k = (String) map.get("id");
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("messageType", "htmlLoaded");
                                    jSONObject.put("id", this.b.b.a.k);
                                    wyVar.b("sendMessageToNativeJs", jSONObject);
                                } catch (Throwable e) {
                                    b.b("Unable to dispatch sendMessageToNativeJs event", e);
                                }
                            }
                        });
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (TextUtils.isEmpty(str2)) {
                            this.b.a.j.loadData(str, "text/html", "UTF-8");
                        } else {
                            this.b.a.j.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        }
                    }
                });
                wyVar.a("/showOverlay", new vt(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
                        this.a.a.j.b().setVisibility(0);
                    }
                });
                wyVar.a("/hideOverlay", new vt(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
                        this.a.a.j.b().setVisibility(8);
                    }
                });
                this.a.j.l().a("/hideOverlay", new vt(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
                        this.a.a.j.b().setVisibility(8);
                    }
                });
                this.a.j.l().a("/sendMessageToSdk", new vt(this) {
                    final /* synthetic */ AnonymousClass3 b;

                    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            for (String str : map.keySet()) {
                                jSONObject.put(str, map.get(str));
                            }
                            jSONObject.put("id", this.b.a.k);
                            wyVar.b("sendMessageToNativeJs", jSONObject);
                        } catch (Throwable e) {
                            b.b("Unable to dispatch sendMessageToNativeJs event", e);
                        }
                    }
                });
            }
        });
        return this.j;
    }

    public View e() {
        return this.m != null ? (View) this.m.get() : null;
    }

    public Context f() {
        return this.c;
    }

    public void g() {
        if (this.f instanceof d) {
            this.b.G();
        }
    }

    acy h() {
        return u.f().a(this.c, AdSizeParcel.a(this.c), false, false, this.g, this.h);
    }

    ImageView i() {
        return new ImageView(this.c);
    }
}
