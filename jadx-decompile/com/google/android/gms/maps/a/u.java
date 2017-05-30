package com.google.android.gms.maps.a;

import android.os.Bundle;
import android.os.Parcelable;

public final class u {
    private u() {
    }

    public static void a(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(u.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(u.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
