package com.google.android.gms.vision.face;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.vision.d;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;
import com.google.android.gms.vision.h;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public final class b extends com.google.android.gms.vision.b<a> {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 0;
    public static final int f = 1;
    private final h g;
    private final com.google.android.gms.vision.face.internal.client.a h;
    private final Object i;
    private boolean j;

    public static class a {
        private final Context a;
        private int b = 0;
        private boolean c = false;
        private int d = 0;
        private boolean e = true;
        private int f = 0;
        private float g = -1.0f;

        public a(Context context) {
            this.a = context;
        }

        public a a(float f) {
            if (f < 0.0f || f > 1.0f) {
                throw new IllegalArgumentException("Invalid proportional face size: " + f);
            }
            this.g = f;
            return this;
        }

        public a a(int i) {
            if (i == 0 || i == 1) {
                this.b = i;
                return this;
            }
            throw new IllegalArgumentException("Invalid landmark type: " + i);
        }

        public a a(boolean z) {
            this.c = z;
            return this;
        }

        public b a() {
            FaceSettingsParcel faceSettingsParcel = new FaceSettingsParcel();
            faceSettingsParcel.b = this.f;
            faceSettingsParcel.c = this.b;
            faceSettingsParcel.d = this.d;
            faceSettingsParcel.e = this.c;
            faceSettingsParcel.f = this.e;
            faceSettingsParcel.g = this.g;
            return new b(new com.google.android.gms.vision.face.internal.client.a(this.a, faceSettingsParcel));
        }

        public a b(int i) {
            if (i == 0 || i == 1) {
                this.d = i;
                return this;
            }
            throw new IllegalArgumentException("Invalid classification type: " + i);
        }

        public a b(boolean z) {
            this.e = z;
            return this;
        }

        public a c(int i) {
            switch (i) {
                case 0:
                case 1:
                    this.f = i;
                    return this;
                default:
                    throw new IllegalArgumentException("Invalid mode: " + i);
            }
        }
    }

    private b() {
        this.g = new h();
        this.i = new Object();
        this.j = true;
        throw new IllegalStateException("Default constructor called");
    }

    private b(com.google.android.gms.vision.face.internal.client.a aVar) {
        this.g = new h();
        this.i = new Object();
        this.j = true;
        this.h = aVar;
    }

    public SparseArray<a> a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        a[] a;
        ByteBuffer b = dVar.b();
        synchronized (this.i) {
            if (this.j) {
                a = this.h.a(b, FrameMetadataParcel.a(dVar));
            } else {
                throw new RuntimeException("Cannot use detector after release()");
            }
        }
        Set hashSet = new HashSet();
        SparseArray<a> sparseArray = new SparseArray(a.length);
        int i = 0;
        for (a aVar : a) {
            int j = aVar.j();
            i = Math.max(i, j);
            if (hashSet.contains(Integer.valueOf(j))) {
                j = i + 1;
                i = j;
            }
            hashSet.add(Integer.valueOf(j));
            sparseArray.append(this.g.a(j), aVar);
        }
        return sparseArray;
    }

    public void a() {
        super.a();
        synchronized (this.i) {
            if (this.j) {
                this.h.c();
                this.j = false;
                return;
            }
        }
    }

    public boolean a(int i) {
        boolean a;
        int b = this.g.b(i);
        synchronized (this.i) {
            if (this.j) {
                a = this.h.a(b);
            } else {
                throw new RuntimeException("Cannot use detector after release()");
            }
        }
        return a;
    }

    public boolean b() {
        return this.h.b();
    }

    protected void finalize() {
        try {
            synchronized (this.i) {
                if (this.j) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    a();
                }
            }
        } finally {
            super.finalize();
        }
    }
}
