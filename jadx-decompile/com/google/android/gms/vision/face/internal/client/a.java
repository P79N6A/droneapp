package com.google.android.gms.vision.face.internal.client;

import android.content.Context;
import android.graphics.PointF;
import android.util.Log;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.akb;
import com.google.android.gms.vision.face.c;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;

public class a extends com.google.android.gms.vision.internal.client.a<d> {
    private final FaceSettingsParcel a;

    public a(Context context, FaceSettingsParcel faceSettingsParcel) {
        super(context, "FaceNativeHandle");
        this.a = faceSettingsParcel;
        d();
    }

    private com.google.android.gms.vision.face.a a(FaceParcel faceParcel) {
        return new com.google.android.gms.vision.face.a(faceParcel.b, new PointF(faceParcel.c, faceParcel.d), faceParcel.e, faceParcel.f, faceParcel.g, faceParcel.h, b(faceParcel), faceParcel.j, faceParcel.k, faceParcel.l);
    }

    private c a(LandmarkParcel landmarkParcel) {
        return new c(new PointF(landmarkParcel.b, landmarkParcel.c), landmarkParcel.d);
    }

    private c[] b(FaceParcel faceParcel) {
        int i = 0;
        LandmarkParcel[] landmarkParcelArr = faceParcel.i;
        if (landmarkParcelArr == null) {
            return new c[0];
        }
        c[] cVarArr = new c[landmarkParcelArr.length];
        while (i < landmarkParcelArr.length) {
            cVarArr[i] = a(landmarkParcelArr[i]);
            i++;
        }
        return cVarArr;
    }

    protected d a(akb com_google_android_gms_internal_akb, Context context) {
        return com.google.android.gms.vision.face.internal.client.e.a.a(com_google_android_gms_internal_akb.a("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator")).a(f.a(context), this.a);
    }

    protected void a() {
        ((d) d()).a();
    }

    public boolean a(int i) {
        if (!b()) {
            return false;
        }
        try {
            return ((d) d()).a(i);
        } catch (Throwable e) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e);
            return false;
        }
    }

    public com.google.android.gms.vision.face.a[] a(ByteBuffer byteBuffer, FrameMetadataParcel frameMetadataParcel) {
        if (!b()) {
            return new com.google.android.gms.vision.face.a[0];
        }
        try {
            FaceParcel[] a = ((d) d()).a(f.a(byteBuffer), frameMetadataParcel);
            com.google.android.gms.vision.face.a[] aVarArr = new com.google.android.gms.vision.face.a[a.length];
            for (int i = 0; i < a.length; i++) {
                aVarArr[i] = a(a[i]);
            }
            return aVarArr;
        } catch (Throwable e) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e);
            return new com.google.android.gms.vision.face.a[0];
        }
    }

    protected /* synthetic */ Object b(akb com_google_android_gms_internal_akb, Context context) {
        return a(com_google_android_gms_internal_akb, context);
    }
}
