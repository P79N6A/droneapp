package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.e;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.m;

public final class a {
    private final b a;

    public static final class a {
        private final com.google.android.gms.ads.search.b.a a = new com.google.android.gms.ads.search.b.a();
        private final Bundle b = new Bundle();

        public a a(int i) {
            this.b.putString("csa_adPage", Integer.toString(i));
            return this;
        }

        public a a(m mVar) {
            this.a.a(mVar);
            return this;
        }

        public a a(Class<? extends b> cls, Bundle bundle) {
            this.a.a((Class) cls, bundle);
            return this;
        }

        public a a(String str) {
            this.b.putString("csa_channel", str);
            return this;
        }

        public a a(String str, String str2) {
            this.b.putString(str, str2);
            return this;
        }

        public a a(boolean z) {
            this.b.putString("csa_adtest", z ? "on" : "off");
            return this;
        }

        public a a() {
            this.a.a(AdMobAdapter.class, this.b);
            return new a();
        }

        public a b(int i) {
            this.b.putString("csa_number", Integer.toString(i));
            return this;
        }

        public a b(Class<? extends com.google.android.gms.ads.mediation.customevent.a> cls, Bundle bundle) {
            this.a.b(cls, bundle);
            return this;
        }

        public a b(String str) {
            this.b.putString("csa_hl", str);
            return this;
        }

        public a b(boolean z) {
            this.b.putString("csa_clickToCall", Boolean.toString(z));
            return this;
        }

        public a c(int i) {
            this.b.putString("csa_fontSizeLocation", Integer.toString(i));
            return this;
        }

        public a c(String str) {
            this.b.putString("csa_colorLocation", str);
            return this;
        }

        public a c(boolean z) {
            this.b.putString("csa_location", Boolean.toString(z));
            return this;
        }

        public a d(int i) {
            this.b.putString("csa_width", Integer.toString(i));
            return this;
        }

        public a d(String str) {
            this.b.putString("csa_fontFamily", str);
            return this;
        }

        public a d(boolean z) {
            this.b.putString("csa_plusOnes", Boolean.toString(z));
            return this;
        }

        @Deprecated
        public a e(int i) {
            return d(Integer.toString(i));
        }

        public a e(String str) {
            this.b.putString("csa_fontFamilyAttribution", str);
            return this;
        }

        public a e(boolean z) {
            this.b.putString("csa_sellerRatings", Boolean.toString(z));
            return this;
        }

        public a f(int i) {
            this.b.putString("csa_fontSizeAnnotation", Integer.toString(i));
            return this;
        }

        public a f(String str) {
            this.b.putString("csa_colorAdBorder", str);
            return this;
        }

        public a f(boolean z) {
            this.b.putString("csa_siteLinks", Boolean.toString(z));
            return this;
        }

        public a g(int i) {
            this.b.putString("csa_fontSizeAttribution", Integer.toString(i));
            return this;
        }

        public a g(String str) {
            this.b.putString("csa_colorAdSeparator", str);
            return this;
        }

        public a g(boolean z) {
            this.b.putString("csa_noTitleUnderline", Boolean.toString(!z));
            return this;
        }

        public a h(int i) {
            this.b.putString("csa_fontSizeDescription", Integer.toString(i));
            return this;
        }

        public a h(String str) {
            this.b.putString("csa_colorAnnotation", str);
            return this;
        }

        public a h(boolean z) {
            this.b.putString("csa_titleBold", Boolean.toString(z));
            return this;
        }

        public a i(int i) {
            this.b.putString("csa_fontSizeDomainLink", Integer.toString(i));
            return this;
        }

        public a i(String str) {
            this.b.putString("csa_colorAttribution", str);
            return this;
        }

        public a i(boolean z) {
            this.b.putString("csa_detailedAttribution", Boolean.toString(z));
            return this;
        }

        public a j(int i) {
            this.b.putString("csa_fontSizeTitle", Integer.toString(i));
            return this;
        }

        public a j(String str) {
            this.b.putString("csa_colorBackground", str);
            return this;
        }

        public a j(boolean z) {
            this.b.putString("csa_longerHeadlines", Boolean.toString(z));
            return this;
        }

        public a k(int i) {
            this.b.putString("csa_adjustableLineHeight", Integer.toString(i));
            return this;
        }

        public a k(String str) {
            this.b.putString("csa_colorBorder", str);
            return this;
        }

        public a l(int i) {
            this.b.putString("csa_attributionSpacingBelow", Integer.toString(i));
            return this;
        }

        public a l(String str) {
            this.b.putString("csa_colorDomainLink", str);
            return this;
        }

        public a m(int i) {
            this.b.putString("csa_verticalSpacing", Integer.toString(i));
            return this;
        }

        public a m(String str) {
            this.b.putString("csa_colorText", str);
            return this;
        }

        public a n(String str) {
            this.b.putString("csa_colorTitleLink", str);
            return this;
        }

        public a o(String str) {
            this.b.putString("csa_adBorderSelectors", str);
            return this;
        }

        public a p(String str) {
            this.b.putString("csa_borderSelections", str);
            return this;
        }

        public a q(String str) {
            this.a.d(str);
            return this;
        }
    }

    private a(a aVar) {
        this.a = aVar.a.a();
    }

    @Deprecated
    public <T extends m> T a(Class<T> cls) {
        return this.a.a((Class) cls);
    }

    public String a() {
        return this.a.o();
    }

    public boolean a(Context context) {
        return this.a.a(context);
    }

    public <T extends b> Bundle b(Class<T> cls) {
        return this.a.b(cls);
    }

    e b() {
        return this.a.p();
    }

    public <T extends com.google.android.gms.ads.mediation.customevent.a> Bundle c(Class<T> cls) {
        return this.a.c(cls);
    }
}
