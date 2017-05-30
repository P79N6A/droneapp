package com.google.android.gms.location.places.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.location.places.internal.PlaceEntity;

abstract class d {
    public static final int d = 2;

    protected static abstract class a {
        protected final Intent a;

        public a(String str) {
            this.a = new Intent(str);
            this.a.setPackage("com.google.android.gms");
        }

        protected Intent a(Activity activity) {
            Theme theme = activity.getTheme();
            TypedValue typedValue = new TypedValue();
            TypedValue typedValue2 = new TypedValue();
            if (theme.resolveAttribute(16843827, typedValue, true) && !this.a.hasExtra("primary_color")) {
                this.a.putExtra("primary_color", typedValue.data);
            }
            if (theme.resolveAttribute(16843828, typedValue2, true) && !this.a.hasExtra("primary_color_dark")) {
                this.a.putExtra("primary_color_dark", typedValue2.data);
            }
            b.a().d(activity);
            return this.a;
        }
    }

    d() {
    }

    public static com.google.android.gms.location.places.d c(Context context, Intent intent) {
        com.google.android.gms.common.internal.d.a(intent, "intent must not be null");
        com.google.android.gms.common.internal.d.a(context, "context must not be null");
        return (com.google.android.gms.location.places.d) c.a(intent, "selected_place", PlaceEntity.CREATOR);
    }

    public static Status d(Context context, Intent intent) {
        com.google.android.gms.common.internal.d.a(intent, "intent must not be null");
        com.google.android.gms.common.internal.d.a(context, "context must not be null");
        return (Status) c.a(intent, "status", Status.CREATOR);
    }
}
