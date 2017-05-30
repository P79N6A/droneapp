package com.google.android.gms.vision.barcode.internal.client;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.akb;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.internal.client.a;
import java.nio.ByteBuffer;

public class b extends a<c> {
    private final BarcodeDetectorOptions a;

    public b(Context context, BarcodeDetectorOptions barcodeDetectorOptions) {
        super(context, "BarcodeNativeHandle");
        this.a = barcodeDetectorOptions;
        d();
    }

    protected c a(akb com_google_android_gms_internal_akb, Context context) {
        return d.a.a(com_google_android_gms_internal_akb.a("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).a(f.a(context), this.a);
    }

    protected void a() {
        ((c) d()).a();
    }

    public Barcode[] a(Bitmap bitmap, FrameMetadataParcel frameMetadataParcel) {
        if (!b()) {
            return new Barcode[0];
        }
        try {
            return ((c) d()).b(f.a(bitmap), frameMetadataParcel);
        } catch (Throwable e) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
            return new Barcode[0];
        }
    }

    public Barcode[] a(ByteBuffer byteBuffer, FrameMetadataParcel frameMetadataParcel) {
        if (!b()) {
            return new Barcode[0];
        }
        try {
            return ((c) d()).a(f.a(byteBuffer), frameMetadataParcel);
        } catch (Throwable e) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
            return new Barcode[0];
        }
    }

    protected /* synthetic */ Object b(akb com_google_android_gms_internal_akb, Context context) {
        return a(com_google_android_gms_internal_akb, context);
    }
}
