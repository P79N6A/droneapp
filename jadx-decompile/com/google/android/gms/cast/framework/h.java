package com.google.android.gms.cast.framework;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.preference.PreferenceManager;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.StringRes;
import android.support.v7.app.MediaRouteButton;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.afj;
import com.google.android.gms.internal.afk;

public interface h {

    public static class a {
        private Activity a;
        private View b;
        private int c;
        private String d;
        private b e;
        private boolean f;
        private float g;
        private String h;

        public a(Activity activity, MediaRouteButton mediaRouteButton) {
            this.a = (Activity) d.a((Object) activity);
            this.b = (View) d.a((Object) mediaRouteButton);
        }

        @TargetApi(11)
        public a(Activity activity, MenuItem menuItem) {
            this.a = (Activity) d.a((Object) activity);
            if (s.a()) {
                this.b = ((MenuItem) d.a((Object) menuItem)).getActionView();
            }
        }

        public a a() {
            this.f = true;
            return this;
        }

        public a a(float f) {
            this.g = f;
            return this;
        }

        public a a(@ColorRes int i) {
            this.c = this.a.getResources().getColor(i);
            return this;
        }

        public a a(b bVar) {
            this.e = bVar;
            return this;
        }

        public a a(String str) {
            this.d = str;
            return this;
        }

        public Activity b() {
            return this.a;
        }

        public a b(@StringRes int i) {
            this.d = this.a.getResources().getString(i);
            return this;
        }

        public a b(String str) {
            this.h = str;
            return this;
        }

        public View c() {
            return this.b;
        }

        public a c(@DimenRes int i) {
            this.g = this.a.getResources().getDimension(i);
            return this;
        }

        public a d(@StringRes int i) {
            this.h = this.a.getResources().getString(i);
            return this;
        }

        public b d() {
            return this.e;
        }

        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.f;
        }

        public String g() {
            return this.d;
        }

        public String h() {
            return this.h;
        }

        public float i() {
            return this.g;
        }

        public h j() {
            return s.e() ? new afj(this) : new afk(this);
        }
    }

    public interface b {
        void a();
    }

    public static class c {
        public static void a(Context context) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("googlecast-introOverlayShown", true).apply();
        }

        public static boolean b(Context context) {
            return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("googlecast-introOverlayShown", false);
        }
    }

    void a();

    void b();
}
