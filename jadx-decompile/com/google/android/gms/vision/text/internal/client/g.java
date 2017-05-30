package com.google.android.gms.vision.text.internal.client;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.akb;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.internal.client.a;

public class g extends a<b> {
    private final TextRecognizerOptions a;

    public g(Context context, TextRecognizerOptions textRecognizerOptions) {
        super(context, "TextNativeHandle");
        this.a = textRecognizerOptions;
        d();
    }

    protected b a(akb com_google_android_gms_internal_akb, Context context) {
        return c.a.a(com_google_android_gms_internal_akb.a("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).a(f.a(context), this.a);
    }

    protected void a() {
        ((b) d()).a();
    }

    public LineBoxParcel[] a(Bitmap bitmap, FrameMetadataParcel frameMetadataParcel, RecognitionOptions recognitionOptions) {
        if (!b()) {
            return new LineBoxParcel[0];
        }
        try {
            return ((b) d()).a(f.a(bitmap), frameMetadataParcel, recognitionOptions);
        } catch (Throwable e) {
            Log.e("TextNativeHandle", "Error calling native text recognizer", e);
            return new LineBoxParcel[0];
        }
    }

    protected /* synthetic */ Object b(akb com_google_android_gms_internal_akb, Context context) {
        return a(com_google_android_gms_internal_akb, context);
    }
}
