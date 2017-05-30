package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.R;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;

@aaa
public class aby {
    private final Context a;
    private String b;
    private String c;
    private final float d;
    private float e;
    private float f;
    private float g;
    private int h;

    public aby(Context context) {
        this.h = 0;
        this.a = context;
        this.d = context.getResources().getDisplayMetrics().density;
    }

    public aby(Context context, String str) {
        this(context);
        this.b = str;
    }

    private void b() {
        if (this.a instanceof Activity) {
            CharSequence string;
            CharSequence string2;
            CharSequence string3;
            Resources q = u.i().q();
            if (q != null) {
                string = q.getString(R.string.debug_menu_title);
            } else {
                Object obj = "Select a Debug Mode";
            }
            if (q != null) {
                string2 = q.getString(R.string.debug_menu_ad_information);
            } else {
                Object obj2 = "Ad Information";
            }
            if (q != null) {
                string3 = q.getString(R.string.debug_menu_creative_preview);
            } else {
                Object obj3 = "Creative Preview";
            }
            String string4 = q != null ? q.getString(R.string.debug_menu_troubleshooting) : "Troubleshooting";
            new Builder(this.a).setTitle(string).setItems(new String[]{string2, string3, string4}, new 1(this)).create().show();
            return;
        }
        b.c("Can not create dialog without Activity Context");
    }

    static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "No debug information";
        }
        Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
        StringBuilder stringBuilder = new StringBuilder();
        Map a = u.e().a(build);
        for (String str2 : a.keySet()) {
            stringBuilder.append(str2).append(" = ").append((String) a.get(str2)).append("\n\n");
        }
        Object trim = stringBuilder.toString().trim();
        return TextUtils.isEmpty(trim) ? "No debug information" : trim;
    }

    private void c() {
        if (this.a instanceof Activity) {
            Object c = c(this.b);
            Builder builder = new Builder(this.a);
            builder.setMessage(c);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new 2(this, c));
            builder.setNegativeButton("Close", new 3(this));
            builder.create().show();
            return;
        }
        b.c("Can not create dialog without Activity Context");
    }

    public void a() {
        if (((Boolean) uf.cD.c()).booleanValue()) {
            b();
        } else {
            c();
        }
    }

    void a(int i, float f, float f2) {
        if (i == 0) {
            this.h = 0;
            this.e = f;
            this.f = f2;
            this.g = f2;
        } else if (this.h == -1) {
        } else {
            if (i == 2) {
                if (f2 > this.f) {
                    this.f = f2;
                } else if (f2 < this.g) {
                    this.g = f2;
                }
                if (this.f - this.g > com.google.android.gms.maps.model.b.b * this.d) {
                    this.h = -1;
                    return;
                }
                if (this.h == 0 || this.h == 2) {
                    if (f - this.e >= 50.0f * this.d) {
                        this.e = f;
                        this.h++;
                    }
                } else if ((this.h == 1 || this.h == 3) && f - this.e <= -50.0f * this.d) {
                    this.e = f;
                    this.h++;
                }
                if (this.h == 1 || this.h == 3) {
                    if (f > this.e) {
                        this.e = f;
                    }
                } else if (this.h == 2 && f < this.e) {
                    this.e = f;
                }
            } else if (i == 1 && this.h == 4) {
                a();
            }
        }
    }

    public void a(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    public void a(String str) {
        this.c = str;
    }

    public void b(String str) {
        this.b = str;
    }
}
