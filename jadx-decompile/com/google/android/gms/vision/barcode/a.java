package com.google.android.gms.vision.barcode;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.vision.b;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;
import com.google.android.gms.vision.d;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;

public final class a extends b<Barcode> {
    private final com.google.android.gms.vision.barcode.internal.client.b a;

    public static class a {
        private Context a;
        private BarcodeDetectorOptions b = new BarcodeDetectorOptions();

        public a(Context context) {
            this.a = context;
        }

        public a a(int i) {
            this.b.b = i;
            return this;
        }

        public a a() {
            return new a(new com.google.android.gms.vision.barcode.internal.client.b(this.a, this.b));
        }
    }

    private a() {
        throw new IllegalStateException("Default constructor called");
    }

    private a(com.google.android.gms.vision.barcode.internal.client.b bVar) {
        this.a = bVar;
    }

    public SparseArray<Barcode> a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        Barcode[] a;
        FrameMetadataParcel a2 = FrameMetadataParcel.a(dVar);
        if (dVar.c() != null) {
            a = this.a.a(dVar.c(), a2);
            if (a == null) {
                throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
            }
        }
        a = this.a.a(dVar.b(), a2);
        SparseArray<Barcode> sparseArray = new SparseArray(a.length);
        for (Barcode barcode : a) {
            sparseArray.append(barcode.C.hashCode(), barcode);
        }
        return sparseArray;
    }

    public void a() {
        super.a();
        this.a.c();
    }

    public boolean b() {
        return this.a.b();
    }
}
