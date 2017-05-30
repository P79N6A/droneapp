package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.d;

public final class b {
    public static final float a = 0.0f;
    public static final float b = 30.0f;
    public static final float c = 60.0f;
    public static final float d = 120.0f;
    public static final float e = 180.0f;
    public static final float f = 210.0f;
    public static final float g = 240.0f;
    public static final float h = 270.0f;
    public static final float i = 300.0f;
    public static final float j = 330.0f;
    private static com.google.android.gms.maps.model.a.b k;

    private b() {
    }

    public static a a() {
        try {
            return new a(b().a());
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static a a(float f) {
        try {
            return new a(b().a(f));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static a a(int i) {
        try {
            return new a(b().a(i));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static a a(Bitmap bitmap) {
        try {
            return new a(b().a(bitmap));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static a a(String str) {
        try {
            return new a(b().a(str));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static void a(com.google.android.gms.maps.model.a.b bVar) {
        if (k == null) {
            k = (com.google.android.gms.maps.model.a.b) d.a(bVar);
        }
    }

    private static com.google.android.gms.maps.model.a.b b() {
        return (com.google.android.gms.maps.model.a.b) d.a(k, "IBitmapDescriptorFactory is not initialized");
    }

    public static a b(String str) {
        try {
            return new a(b().b(str));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static a c(String str) {
        try {
            return new a(b().c(str));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
