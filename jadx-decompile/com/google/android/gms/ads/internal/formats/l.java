package com.google.android.gms.ads.internal.formats;

import android.graphics.Point;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.uw.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@aaa
public class l extends a implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {
    boolean a = false;
    int b;
    int c;
    private final Object d = new Object();
    private final FrameLayout e;
    @Nullable
    private FrameLayout f;
    private Map<String, WeakReference<View>> g = new HashMap();
    @Nullable
    private b h;
    @Nullable
    private i i;

    public l(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.e = frameLayout;
        this.f = frameLayout2;
        u.C().a(this.e, (OnGlobalLayoutListener) this);
        u.C().a(this.e, (OnScrollChangedListener) this);
        this.e.setOnTouchListener(this);
        this.e.setOnClickListener(this);
    }

    private void b(j jVar) {
        if (this.g.containsKey("2011")) {
            final View view = (View) ((WeakReference) this.g.get("2011")).get();
            if (view instanceof FrameLayout) {
                jVar.a(view, new g(this) {
                    final /* synthetic */ l b;

                    public void a() {
                        this.b.onClick(view);
                    }

                    public void a(MotionEvent motionEvent) {
                        this.b.onTouch(null, motionEvent);
                    }
                });
                return;
            } else {
                jVar.g();
                return;
            }
        }
        jVar.g();
    }

    int a(int i) {
        return ac.a().b(this.i.f(), i);
    }

    Point a(MotionEvent motionEvent) {
        int[] iArr = new int[2];
        this.e.getLocationOnScreen(iArr);
        return new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
    }

    @Nullable
    b a(j jVar) {
        return jVar.a((OnClickListener) this);
    }

    public e a(String str) {
        e a;
        synchronized (this.d) {
            Object obj;
            WeakReference weakReference = (WeakReference) this.g.get(str);
            if (weakReference == null) {
                obj = null;
            } else {
                View view = (View) weakReference.get();
            }
            a = f.a(obj);
        }
        return a;
    }

    public void a() {
        synchronized (this.d) {
            if (this.f != null) {
                this.f.removeAllViews();
            }
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
        }
    }

    void a(@Nullable View view) {
        if (this.i != null) {
            i c = this.i instanceof h ? ((h) this.i).c() : this.i;
            if (c != null) {
                c.b(view);
            }
        }
    }

    public void a(e eVar) {
        synchronized (this.d) {
            a(null);
            Object a = f.a(eVar);
            if (a instanceof j) {
                if (this.f != null) {
                    this.f.setLayoutParams(new LayoutParams(0, 0));
                    this.e.requestLayout();
                }
                this.a = true;
                final j jVar = (j) a;
                if (this.i != null && ((Boolean) uf.bM.c()).booleanValue()) {
                    this.i.a(this.e, this.g);
                }
                if ((this.i instanceof h) && ((h) this.i).b()) {
                    ((h) this.i).a((i) jVar);
                } else {
                    this.i = jVar;
                    if (jVar instanceof h) {
                        ((h) jVar).a(null);
                    }
                }
                if (((Boolean) uf.bM.c()).booleanValue()) {
                    this.f.setClickable(false);
                }
                this.f.removeAllViews();
                this.h = a(jVar);
                if (this.h != null) {
                    this.g.put("1007", new WeakReference(this.h.a()));
                    this.f.addView(this.h);
                }
                jVar.a(this.e, this.g, this, this);
                abv.a.post(new Runnable(this) {
                    final /* synthetic */ l b;

                    public void run() {
                        acy d = jVar.d();
                        if (!(d == null || this.b.f == null)) {
                            this.b.f.addView(d.b());
                        }
                        if (!(jVar instanceof h)) {
                            this.b.b(jVar);
                        }
                    }
                });
                a(this.e);
                return;
            }
            b.d("Not an instance of native engine. This is most likely a transient error");
        }
    }

    public void a(String str, e eVar) {
        View view = (View) f.a(eVar);
        synchronized (this.d) {
            if (view == null) {
                this.g.remove(str);
            } else {
                this.g.put(str, new WeakReference(view));
                view.setOnTouchListener(this);
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    int b() {
        return this.e.getMeasuredWidth();
    }

    Point b(View view) {
        if (this.h == null || !this.h.a().equals(view)) {
            Point point = new Point();
            view.getGlobalVisibleRect(new Rect(), point);
            return point;
        }
        Point point2 = new Point();
        this.e.getGlobalVisibleRect(new Rect(), point2);
        Point point3 = new Point();
        view.getGlobalVisibleRect(new Rect(), point3);
        return new Point(point3.x - point2.x, point3.y - point2.y);
    }

    int c() {
        return this.e.getMeasuredHeight();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r10) {
        /*
        r9 = this;
        r6 = r9.d;
        monitor-enter(r6);
        r0 = r9.i;	 Catch:{ all -> 0x0090 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r6);	 Catch:{ all -> 0x0090 }
    L_0x0008:
        return;
    L_0x0009:
        r3 = new org.json.JSONObject;	 Catch:{ all -> 0x0090 }
        r3.<init>();	 Catch:{ all -> 0x0090 }
        r0 = r9.g;	 Catch:{ all -> 0x0090 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0090 }
        r2 = r0.iterator();	 Catch:{ all -> 0x0090 }
    L_0x0018:
        r0 = r2.hasNext();	 Catch:{ all -> 0x0090 }
        if (r0 == 0) goto L_0x0099;
    L_0x001e:
        r0 = r2.next();	 Catch:{ all -> 0x0090 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0090 }
        r1 = r0.getValue();	 Catch:{ all -> 0x0090 }
        r1 = (java.lang.ref.WeakReference) r1;	 Catch:{ all -> 0x0090 }
        r1 = r1.get();	 Catch:{ all -> 0x0090 }
        r1 = (android.view.View) r1;	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x0018;
    L_0x0032:
        r4 = r9.b(r1);	 Catch:{ all -> 0x0090 }
        r5 = new org.json.JSONObject;	 Catch:{ all -> 0x0090 }
        r5.<init>();	 Catch:{ all -> 0x0090 }
        r7 = "width";
        r8 = r1.getWidth();	 Catch:{ JSONException -> 0x0075 }
        r8 = r9.a(r8);	 Catch:{ JSONException -> 0x0075 }
        r5.put(r7, r8);	 Catch:{ JSONException -> 0x0075 }
        r7 = "height";
        r1 = r1.getHeight();	 Catch:{ JSONException -> 0x0075 }
        r1 = r9.a(r1);	 Catch:{ JSONException -> 0x0075 }
        r5.put(r7, r1);	 Catch:{ JSONException -> 0x0075 }
        r1 = "x";
        r7 = r4.x;	 Catch:{ JSONException -> 0x0075 }
        r7 = r9.a(r7);	 Catch:{ JSONException -> 0x0075 }
        r5.put(r1, r7);	 Catch:{ JSONException -> 0x0075 }
        r1 = "y";
        r4 = r4.y;	 Catch:{ JSONException -> 0x0075 }
        r4 = r9.a(r4);	 Catch:{ JSONException -> 0x0075 }
        r5.put(r1, r4);	 Catch:{ JSONException -> 0x0075 }
        r1 = r0.getKey();	 Catch:{ JSONException -> 0x0075 }
        r1 = (java.lang.String) r1;	 Catch:{ JSONException -> 0x0075 }
        r3.put(r1, r5);	 Catch:{ JSONException -> 0x0075 }
        goto L_0x0018;
    L_0x0075:
        r1 = move-exception;
        r1 = "Unable to get view rectangle for view ";
        r0 = r0.getKey();	 Catch:{ all -> 0x0090 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0090 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0090 }
        r4 = r0.length();	 Catch:{ all -> 0x0090 }
        if (r4 == 0) goto L_0x0093;
    L_0x0088:
        r0 = r1.concat(r0);	 Catch:{ all -> 0x0090 }
    L_0x008c:
        com.google.android.gms.ads.internal.util.client.b.d(r0);	 Catch:{ all -> 0x0090 }
        goto L_0x0018;
    L_0x0090:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0090 }
        throw r0;
    L_0x0093:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0090 }
        r0.<init>(r1);	 Catch:{ all -> 0x0090 }
        goto L_0x008c;
    L_0x0099:
        r4 = new org.json.JSONObject;	 Catch:{ all -> 0x0090 }
        r4.<init>();	 Catch:{ all -> 0x0090 }
        r0 = "x";
        r1 = r9.b;	 Catch:{ JSONException -> 0x0104 }
        r1 = r9.a(r1);	 Catch:{ JSONException -> 0x0104 }
        r4.put(r0, r1);	 Catch:{ JSONException -> 0x0104 }
        r0 = "y";
        r1 = r9.c;	 Catch:{ JSONException -> 0x0104 }
        r1 = r9.a(r1);	 Catch:{ JSONException -> 0x0104 }
        r4.put(r0, r1);	 Catch:{ JSONException -> 0x0104 }
    L_0x00b4:
        r5 = new org.json.JSONObject;	 Catch:{ all -> 0x0090 }
        r5.<init>();	 Catch:{ all -> 0x0090 }
        r0 = "width";
        r1 = r9.b();	 Catch:{ JSONException -> 0x010b }
        r1 = r9.a(r1);	 Catch:{ JSONException -> 0x010b }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x010b }
        r0 = "height";
        r1 = r9.c();	 Catch:{ JSONException -> 0x010b }
        r1 = r9.a(r1);	 Catch:{ JSONException -> 0x010b }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x010b }
    L_0x00d3:
        r0 = r9.h;	 Catch:{ all -> 0x0090 }
        if (r0 == 0) goto L_0x011b;
    L_0x00d7:
        r0 = r9.h;	 Catch:{ all -> 0x0090 }
        r0 = r0.a();	 Catch:{ all -> 0x0090 }
        r0 = r0.equals(r10);	 Catch:{ all -> 0x0090 }
        if (r0 == 0) goto L_0x011b;
    L_0x00e3:
        r0 = r9.i;	 Catch:{ all -> 0x0090 }
        r0 = r0 instanceof com.google.android.gms.ads.internal.formats.h;	 Catch:{ all -> 0x0090 }
        if (r0 == 0) goto L_0x0112;
    L_0x00e9:
        r0 = r9.i;	 Catch:{ all -> 0x0090 }
        r0 = (com.google.android.gms.ads.internal.formats.h) r0;	 Catch:{ all -> 0x0090 }
        r0 = r0.c();	 Catch:{ all -> 0x0090 }
        if (r0 == 0) goto L_0x0112;
    L_0x00f3:
        r0 = r9.i;	 Catch:{ all -> 0x0090 }
        r0 = (com.google.android.gms.ads.internal.formats.h) r0;	 Catch:{ all -> 0x0090 }
        r0 = r0.c();	 Catch:{ all -> 0x0090 }
        r2 = "1007";
        r1 = r10;
        r0.a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0090 }
    L_0x0101:
        monitor-exit(r6);	 Catch:{ all -> 0x0090 }
        goto L_0x0008;
    L_0x0104:
        r0 = move-exception;
        r0 = "Unable to get click location";
        com.google.android.gms.ads.internal.util.client.b.d(r0);	 Catch:{ all -> 0x0090 }
        goto L_0x00b4;
    L_0x010b:
        r0 = move-exception;
        r0 = "Unable to get native ad view bounding box";
        com.google.android.gms.ads.internal.util.client.b.d(r0);	 Catch:{ all -> 0x0090 }
        goto L_0x00d3;
    L_0x0112:
        r0 = r9.i;	 Catch:{ all -> 0x0090 }
        r2 = "1007";
        r1 = r10;
        r0.a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0090 }
        goto L_0x0101;
    L_0x011b:
        r0 = r9.i;	 Catch:{ all -> 0x0090 }
        r2 = r9.g;	 Catch:{ all -> 0x0090 }
        r1 = r10;
        r0.a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0090 }
        goto L_0x0101;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.formats.l.onClick(android.view.View):void");
    }

    public void onGlobalLayout() {
        synchronized (this.d) {
            if (this.a) {
                int b = b();
                int c = c();
                if (!(b == 0 || c == 0 || this.f == null)) {
                    this.f.setLayoutParams(new LayoutParams(b, c));
                    this.a = false;
                }
            }
            if (this.i != null) {
                this.i.a(this.e);
            }
        }
    }

    public void onScrollChanged() {
        synchronized (this.d) {
            if (this.i != null) {
                this.i.a(this.e);
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.d) {
            if (this.i == null) {
            } else {
                Point a = a(motionEvent);
                this.b = a.x;
                this.c = a.y;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation((float) a.x, (float) a.y);
                this.i.a(obtain);
                obtain.recycle();
            }
        }
        return false;
    }
}
