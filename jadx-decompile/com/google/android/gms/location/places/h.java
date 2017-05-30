package com.google.android.gms.location.places;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.n;
import java.util.Comparator;

public class h extends com.google.android.gms.common.data.a<g> implements m {
    private static final Comparator<PlaceLikelihoodEntity> b = new Comparator<PlaceLikelihoodEntity>() {
        public int a(PlaceLikelihoodEntity placeLikelihoodEntity, PlaceLikelihoodEntity placeLikelihoodEntity2) {
            return -Float.compare(placeLikelihoodEntity.c(), placeLikelihoodEntity2.c());
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((PlaceLikelihoodEntity) obj, (PlaceLikelihoodEntity) obj2);
        }
    };
    private final String c;
    private final int d;
    private final Status e;

    public static class a {
        static int a(int i) {
            switch (i) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                    return i;
                default:
                    throw new IllegalArgumentException("invalid source: " + i);
            }
        }
    }

    public h(DataHolder dataHolder, int i) {
        super(dataHolder);
        this.e = n.c(dataHolder.e());
        this.d = a.a(i);
        if (dataHolder == null || dataHolder.f() == null) {
            this.c = null;
        } else {
            this.c = dataHolder.f().getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
        }
    }

    public static int a(Bundle bundle) {
        return bundle.getInt("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY");
    }

    public Status a() {
        return this.e;
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public g b(int i) {
        return new n(this.a, i);
    }

    @Nullable
    public CharSequence h() {
        return this.c;
    }

    public String toString() {
        return c.a(this).a("status", a()).a("attributions", this.c).toString();
    }
}
