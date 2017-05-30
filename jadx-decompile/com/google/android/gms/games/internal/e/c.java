package com.google.android.gms.games.internal.e;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.xiaomi.market.sdk.k;

public final class c extends j implements a {
    c(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public long a() {
        return b(k._ID);
    }

    public String d() {
        return e("notification_id");
    }

    public int e() {
        return c("type");
    }

    public String f() {
        return e("ticker");
    }

    public String g() {
        return e("title");
    }

    public String h() {
        return e("text");
    }

    public String i() {
        return e("coalesced_text");
    }

    public boolean j() {
        return c("acknowledged") > 0;
    }

    public boolean k() {
        return c("alert_level") == 0;
    }

    public boolean l() {
        return c("alert_level") == 2;
    }

    public String toString() {
        return com.google.android.gms.common.internal.c.a(this).a("Id", Long.valueOf(a())).a("NotificationId", d()).a("Type", Integer.valueOf(e())).a("Title", g()).a("Ticker", f()).a("Text", h()).a("CoalescedText", i()).a("isAcknowledged", Boolean.valueOf(j())).a("isSilent", Boolean.valueOf(k())).a("isQuiet", Boolean.valueOf(l())).toString();
    }
}
