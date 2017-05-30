package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.ads.internal.u;
import com.google.firebase.a.a.b;
import java.util.Map;
import org.a.a.e;

@aaa
public class yh extends yn {
    private final Map<String, String> a;
    private final Context b;
    private String c;
    private long d;
    private long e;
    private String f;
    private String g;

    public yh(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        super(com_google_android_gms_internal_acy, "createCalendarEvent");
        this.a = map;
        this.b = com_google_android_gms_internal_acy.f();
        c();
    }

    private String a(String str) {
        return TextUtils.isEmpty((CharSequence) this.a.get(str)) ? "" : (String) this.a.get(str);
    }

    private void c() {
        this.c = a("description");
        this.f = a("summary");
        this.d = e("start_ticks");
        this.e = e("end_ticks");
        this.g = a(b.p);
    }

    private long e(String str) {
        String str2 = (String) this.a.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void a() {
        if (this.b == null) {
            b("Activity context is not available.");
        } else if (u.e().e(this.b).f()) {
            Builder d = u.e().d(this.b);
            Resources q = u.i().q();
            d.setTitle(q != null ? q.getString(R.string.create_calendar_title) : "Create calendar event");
            d.setMessage(q != null ? q.getString(R.string.create_calendar_message) : "Allow Ad to create a calendar event?");
            d.setPositiveButton(q != null ? q.getString(R.string.accept) : e.a, new 1(this));
            d.setNegativeButton(q != null ? q.getString(R.string.decline) : "Decline", new 2(this));
            d.create().show();
        } else {
            b("This feature is not available on the device.");
        }
    }

    @TargetApi(14)
    Intent b() {
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", this.c);
        data.putExtra("eventLocation", this.g);
        data.putExtra("description", this.f);
        if (this.d > -1) {
            data.putExtra("beginTime", this.d);
        }
        if (this.e > -1) {
            data.putExtra("endTime", this.e);
        }
        data.setFlags(com.google.android.gms.drive.e.a_);
        return data;
    }
}
