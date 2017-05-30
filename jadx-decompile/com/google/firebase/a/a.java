package com.google.firebase.a;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import android.support.annotation.Size;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.measurement.internal.aj;

public final class a {
    private final aj a;

    public static class a {
        public static final String b = "add_payment_info";
        public static final String c = "add_to_cart";
        public static final String d = "add_to_wishlist";
        public static final String e = "app_open";
        public static final String f = "begin_checkout";
        public static final String g = "ecommerce_purchase";
        public static final String h = "generate_lead";
        public static final String i = "join_group";
        public static final String j = "level_up";
        public static final String k = "login";
        public static final String l = "post_score";
        public static final String m = "present_offer";
        public static final String n = "purchase_refund";
        public static final String o = "search";
        public static final String p = "select_content";
        public static final String q = "share";
        public static final String r = "sign_up";
        public static final String s = "spend_virtual_currency";
        public static final String t = "tutorial_begin";
        public static final String u = "tutorial_complete";
        public static final String v = "unlock_achievement";
        public static final String w = "view_item";
        public static final String x = "view_item_list";
        public static final String y = "view_search_results";
        public static final String z = "earn_virtual_currency";

        protected a() {
        }
    }

    public static class b {
        public static final String A = "shipping";
        public static final String B = "transaction_id";
        public static final String C = "search_term";
        public static final String D = "tax";
        public static final String E = "value";
        public static final String F = "virtual_currency_name";
        public static final String b = "achievement_id";
        public static final String c = "character";
        public static final String d = "travel_class";
        public static final String e = "content_type";
        public static final String f = "currency";
        public static final String g = "coupon";
        public static final String h = "start_date";
        public static final String i = "end_date";
        public static final String j = "flight_number";
        public static final String k = "group_id";
        public static final String l = "item_category";
        public static final String m = "item_id";
        public static final String n = "item_location_id";
        public static final String o = "item_name";
        public static final String p = "location";
        public static final String q = "level";
        public static final String r = "sign_up_method";
        public static final String s = "number_of_nights";
        public static final String t = "number_of_passengers";
        public static final String u = "number_of_rooms";
        public static final String v = "destination";
        public static final String w = "origin";
        public static final String x = "price";
        public static final String y = "quantity";
        public static final String z = "score";

        protected b() {
        }
    }

    public static class c {
        public static final String b = "sign_up_method";

        protected c() {
        }
    }

    public a(aj ajVar) {
        d.a(ajVar);
        this.a = ajVar;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static a a(Context context) {
        return aj.a(context).n();
    }

    public void a(long j) {
        this.a.m().a(j);
    }

    public void a(String str) {
        this.a.m().a(str);
    }

    public void a(@Size(max = 32, min = 1) @NonNull String str, Bundle bundle) {
        this.a.m().a(str, bundle);
    }

    public void a(@Size(max = 24, min = 1) @NonNull String str, @Nullable @Size(max = 36) String str2) {
        this.a.m().a(str, str2);
    }

    public void a(boolean z) {
        this.a.m().a(z);
    }

    public void b(long j) {
        this.a.m().b(j);
    }
}
