package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.aaa;
import java.util.ArrayList;
import java.util.List;

@aaa
public final class w {
    private long a;
    private Bundle b;
    private int c;
    private List<String> d;
    private boolean e;
    private int f;
    private boolean g;
    private String h;
    private SearchAdRequestParcel i;
    private Location j;
    private String k;
    private Bundle l;
    private Bundle m;
    private List<String> n;
    private String o;
    private String p;
    private boolean q;

    public w() {
        this.a = -1;
        this.b = new Bundle();
        this.c = -1;
        this.d = new ArrayList();
        this.e = false;
        this.f = -1;
        this.g = false;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = new Bundle();
        this.m = new Bundle();
        this.n = new ArrayList();
        this.o = null;
        this.p = null;
        this.q = false;
    }

    public w(AdRequestParcel adRequestParcel) {
        this.a = adRequestParcel.b;
        this.b = adRequestParcel.c;
        this.c = adRequestParcel.d;
        this.d = adRequestParcel.e;
        this.e = adRequestParcel.f;
        this.f = adRequestParcel.g;
        this.g = adRequestParcel.h;
        this.h = adRequestParcel.i;
        this.i = adRequestParcel.j;
        this.j = adRequestParcel.k;
        this.k = adRequestParcel.l;
        this.l = adRequestParcel.m;
        this.m = adRequestParcel.n;
        this.n = adRequestParcel.o;
        this.o = adRequestParcel.p;
        this.p = adRequestParcel.q;
    }

    public AdRequestParcel a() {
        return new AdRequestParcel(7, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, false);
    }

    public w a(@Nullable Location location) {
        this.j = location;
        return this;
    }
}
