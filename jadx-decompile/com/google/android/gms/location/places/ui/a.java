package com.google.android.gms.location.places.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.b;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.d;
import com.google.android.gms.maps.model.LatLngBounds;

public class a extends d {
    public static final int a = 2;
    public static final int b = 1;
    public static final int c = 2;

    public static class a extends a {
        public a(int i) {
            super("com.google.android.gms.location.places.ui.AUTOCOMPLETE");
            this.a.putExtra("gmscore_client_jar_version", b.a);
            this.a.putExtra("mode", i);
            this.a.putExtra(com.google.firebase.a.a.b.w, 2);
        }

        public Intent a(Activity activity) {
            return super.a(activity);
        }

        public a a(int i) {
            this.a.putExtra(com.google.firebase.a.a.b.w, i);
            return this;
        }

        public a a(@Nullable AutocompleteFilter autocompleteFilter) {
            if (autocompleteFilter != null) {
                this.a.putExtra("filter", autocompleteFilter);
            } else {
                this.a.removeExtra("filter");
            }
            return this;
        }

        public a a(@Nullable LatLngBounds latLngBounds) {
            if (latLngBounds != null) {
                this.a.putExtra("bounds", latLngBounds);
            } else {
                this.a.removeExtra("bounds");
            }
            return this;
        }

        public a a(@Nullable String str) {
            if (str != null) {
                this.a.putExtra("initial_query", str);
            } else {
                this.a.removeExtra("initial_query");
            }
            return this;
        }
    }

    private a() {
    }

    public static d a(Context context, Intent intent) {
        return d.c(context, intent);
    }

    public static Status b(Context context, Intent intent) {
        return d.d(context, intent);
    }
}
